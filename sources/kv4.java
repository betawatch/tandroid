// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kv4 {
    public final int a;
    public final long b;
    public final long c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState e;
    public TL_stars.TL_starGiftAuctionState f;
    public TL_stars.TL_starGiftAuctionStateFinished g;
    public ArrayList h;
    public int i;

    public kv4(int i, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        this.a = i;
        this.d = starGift;
        this.e = tL_StarGiftAuctionUserState;
        this.b = starGift.id;
        TLRPC.Document document = starGift.sticker;
        this.c = document != null ? document.id : 0L;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f;
                i = tL_starGiftAuctionState2 != null ? tL_starGiftAuctionState2.version : 0;
            }
            if (tL_starGiftAuctionState.version > i) {
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

    public final long b(int i) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
            return e();
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i2);
            i2++;
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
            if (i <= tL_AuctionBidLevel2.pos) {
                return tL_AuctionBidLevel2.amount;
            }
        }
        return e();
    }

    public final int c(int i, long j) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
            return -1;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i3);
            i3++;
            TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
            long j2 = tL_AuctionBidLevel2.amount;
            if (j > j2 || (j == j2 && i <= tL_AuctionBidLevel2.date)) {
                return tL_AuctionBidLevel2.pos;
            }
            i2 = tL_AuctionBidLevel2.pos;
        }
        return i2 + 1;
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
            long j = this.e.min_bid_amount;
            if (j > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j);
            }
        }
        long j2 = this.e.min_bid_amount;
        if (j2 > 0) {
            return j2;
        }
        if (tL_starGiftAuctionState != null) {
            return tL_starGiftAuctionState.min_bid_amount;
        }
        return 0L;
    }

    public final boolean f() {
        return this.g != null;
    }

    public final boolean g(int i) {
        return this.d.auction_start_date > i;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        int i = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e = yac.h(this.a).e();
                for (int i2 = 0; i2 < this.f.top_bidders.size(); i2++) {
                    if (e == this.f.top_bidders.get(i2).longValue()) {
                        i = i2 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
            long j = tL_StarGiftAuctionUserState.bid_amount;
            if (j > 0 && !tL_StarGiftAuctionUserState.returned) {
                i = c(tL_StarGiftAuctionUserState.bid_date, j);
            }
        }
        this.i = i;
    }
}
