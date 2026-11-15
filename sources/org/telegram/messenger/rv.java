package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv b;

    public /* synthetic */ rv(tv tvVar, int i7) {
        this.a = i7;
        this.b = tvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            case 1:
                this.b.o = false;
                break;
            case 2:
                tv tvVar = this.b;
                tvVar.o = false;
                tvVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                tv tvVar2 = this.b;
                if (!tvVar2.o) {
                    tvVar2.o = true;
                    ArrayList arrayList = new ArrayList(tvVar2.j);
                    vr a02 = vr.a0(tvVar2.a);
                    a02.a.c(new kg(tvVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
