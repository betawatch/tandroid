package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf b;
    public final /* synthetic */ fi.m3 c;

    public /* synthetic */ xf(zf zfVar, fi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = zfVar;
        this.c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zf zfVar = this.b;
                fi.m3 m3Var = this.c;
                zfVar.removeView(m3Var);
                if (zfVar.b == m3Var) {
                    zfVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                zf zfVar2 = this.b;
                fi.m3 m3Var2 = this.c;
                zfVar2.removeView(m3Var2);
                if (zfVar2.a == m3Var2) {
                    zfVar2.a = null;
                    break;
                }
                break;
        }
    }
}
