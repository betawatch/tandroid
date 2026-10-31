package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t9 {
    public final int a;
    public final long b;
    public final long c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState e;
    public TL_stars.TL_starGiftAuctionState f;
    public TL_stars.TL_starGiftAuctionStateFinished g;
    public ArrayList h;
    public int i;

    public t9(int i10, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        this.a = i10;
        this.d = starGift;
        this.e = tL_StarGiftAuctionUserState;
        this.b = starGift.id;
        TLRPC.Document document = starGift.sticker;
        this.c = document != null ? document.id : 0L;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i10;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f;
                i10 = tL_starGiftAuctionState2 != null ? tL_starGiftAuctionState2.version : 0;
            }
            if (tL_starGiftAuctionState.version > i10) {
                this.f = tL_starGiftAuctionState;
                h();
                return true;
            }
        } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !f()) {
            this.g = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }
        return false;
    }

    public final long b(int i10) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
            return e();
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i11);
            i11++;
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
            if (i10 <= tL_AuctionBidLevel2.pos) {
                return tL_AuctionBidLevel2.amount;
            }
        }
        return e();
    }

    public final int c(int i10, long j10) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
            return -1;
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i12);
            i12++;
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
            long j11 = tL_AuctionBidLevel2.amount;
            if (j10 > j11 || (j10 == j11 && i10 <= tL_AuctionBidLevel2.date)) {
                return tL_AuctionBidLevel2.pos;
            }
            i11 = tL_AuctionBidLevel2.pos;
        }
        return i11 + 1;
    }

    public final int d() {
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
        if (tL_StarGiftAuctionUserState.returned) {
            return 3;
        }
        if (tL_StarGiftAuctionUserState.bid_amount == 0) {
            return 4;
        }
        return this.i <= this.d.gifts_per_round ? 1 : 2;
    }

    public final long e() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState != null) {
            long j10 = this.e.min_bid_amount;
            if (j10 > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j10);
            }
        }
        long j11 = this.e.min_bid_amount;
        if (j11 > 0) {
            return j11;
        }
        if (tL_starGiftAuctionState != null) {
            return tL_starGiftAuctionState.min_bid_amount;
        }
        return 0L;
    }

    public final boolean f() {
        return this.g != null;
    }

    public final boolean g(int i10) {
        return this.d.auction_start_date > i10;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        int i10 = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e = d20.i(this.a).e();
                for (int i11 = 0; i11 < this.f.top_bidders.size(); i11++) {
                    if (e == this.f.top_bidders.get(i11).longValue()) {
                        i10 = i11 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
            long j10 = tL_StarGiftAuctionUserState.bid_amount;
            if (j10 > 0 && !tL_StarGiftAuctionUserState.returned) {
                i10 = c(tL_StarGiftAuctionUserState.bid_date, j10);
            }
        }
        this.i = i10;
    }
}
