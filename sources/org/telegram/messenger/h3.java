package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h3 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public TL_stories.TL_premium_myBoosts h;
    public int i = 0;
    public long j;
    public TLRPC.Chat k;
    public boolean l;
    public boolean m;

    public final void a(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        this.h = tL_premium_myBoosts;
        this.i = 0;
        this.g = 0;
        this.d = false;
        this.a = false;
        this.e = false;
        this.c = 0L;
        if (tL_premium_myBoosts.my_boosts.isEmpty()) {
            this.b = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
            i10++;
            if (this.j == o5.o(tL_myBoost.peer)) {
                this.i++;
            }
        }
        if (this.i > 0) {
            this.d = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList2 = tL_premium_myBoosts.my_boosts;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            TL_stories.TL_myBoost tL_myBoost2 = arrayList2.get(i11);
            i11++;
            TL_stories.TL_myBoost tL_myBoost3 = tL_myBoost2;
            if (tL_myBoost3.peer == null) {
                this.g = tL_myBoost3.slot;
                break;
            }
        }
        if (this.g == 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
            int size3 = arrayList4.size();
            int i12 = 0;
            while (i12 < size3) {
                TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i12);
                i12++;
                TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                TLRPC.Peer peer = tL_myBoost5.peer;
                if (peer != null && o5.o(peer) != (-this.k.id)) {
                    arrayList3.add(tL_myBoost5);
                }
            }
            if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                this.c = o5.o(tL_myBoost6.peer);
                this.g = tL_myBoost6.slot;
                this.a = true;
            } else if (arrayList3.size() >= 1) {
                this.e = true;
                if (!mg.k0.i()) {
                    TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.c = o5.o(tL_myBoost7.peer);
                    this.g = tL_myBoost7.slot;
                }
                this.a = true;
            } else {
                this.a = false;
            }
        } else {
            this.a = true;
        }
        if (this.m) {
            this.a = false;
        }
    }
}
