package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zx b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ pv(zx zxVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = zxVar;
        this.c = i10;
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
                zx.r0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ pv(zx zxVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = zxVar;
        this.d = arrayList;
        this.c = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
