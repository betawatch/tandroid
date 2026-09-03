package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ cw(qy qyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.b = qyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z4;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qy.o0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ cw(qy qyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.b = qyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z4;
        this.f = hashSet;
    }
}
