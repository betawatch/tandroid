package bi;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ d2(j3 j3Var, x10 x10Var, int i7) {
        this.a = i7;
        this.b = j3Var;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                x10 x10Var = this.c;
                if (x10Var != null) {
                    j3Var.getClass();
                    x10Var.a(Boolean.FALSE);
                }
                j3Var.dismiss();
                break;
            case 1:
                j3 j3Var2 = this.b;
                x10 x10Var2 = this.c;
                if (x10Var2 != null) {
                    j3Var2.getClass();
                    x10Var2.a(Boolean.FALSE);
                }
                j3Var2.dismiss();
                break;
            default:
                j3 j3Var3 = this.b;
                x10 x10Var3 = this.c;
                if (x10Var3 != null) {
                    j3Var3.getClass();
                    x10Var3.a(Boolean.FALSE);
                }
                j3Var3.dismiss();
                break;
        }
    }
}
