// default package

import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l b;
    public final /* synthetic */ je5 c;

    public /* synthetic */ iy1(l lVar, je5 je5Var, byte b) {
        this.a = b;
        this.b = lVar;
        this.c = je5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        je5 je5Var = this.c;
        l lVar = this.b;
        switch (b) {
            case 0:
                lVar.removeView(je5Var);
                if (lVar.b == je5Var) {
                    lVar.b = null;
                    break;
                }
                break;
            case 1:
                lVar.removeView(je5Var);
                break;
            case 2:
                lVar.removeView(je5Var);
                break;
            default:
                lVar.removeView(je5Var);
                if (lVar.a == je5Var) {
                    lVar.a = null;
                    break;
                }
                break;
        }
    }
}
