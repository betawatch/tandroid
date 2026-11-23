package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oh(ti tiVar, boolean z10, int i7) {
        this.a = i7;
        this.b = tiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ti tiVar = this.b;
                if (!z10) {
                    tiVar.a3.setVisibility(8);
                    break;
                } else {
                    tiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ti tiVar2 = this.b;
                if (!z11) {
                    tiVar2.w1.setVisibility(8);
                    break;
                } else {
                    tiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ti tiVar3 = this.b;
                if (!z12) {
                    tiVar3.y1.setVisibility(8);
                    break;
                } else {
                    tiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                ti tiVar4 = this.b;
                if (!z13) {
                    tiVar4.getClass();
                    break;
                } else {
                    tiVar4.v3.setVisibility(4);
                    break;
                }
        }
    }
}
