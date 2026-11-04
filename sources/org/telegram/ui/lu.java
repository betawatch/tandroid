package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ uw b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ lu(uw uwVar, int i3, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = uwVar;
        this.c = i3;
        this.d = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                uw.r0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ lu(uw uwVar, ArrayList arrayList, int i3, boolean z10, HashSet hashSet) {
        this.b = uwVar;
        this.d = arrayList;
        this.c = i3;
        this.e = z10;
        this.f = hashSet;
    }
}
