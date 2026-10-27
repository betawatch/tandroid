package li;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ o2(v3 v3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = v3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View F1;
        View F12;
        switch (this.a) {
            case 0:
                v3 v3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    v3Var.getClass();
                    F1 = null;
                } else {
                    F1 = v3Var.F1(aVar);
                }
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(Math.min(this.d, d6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                v3 v3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    v3Var2.getClass();
                    F12 = null;
                } else {
                    F12 = v3Var2.F1(aVar2);
                }
                if (F12 instanceof d6) {
                    d6 d6Var2 = (d6) F12;
                    d6Var2.A();
                    d6Var2.getEditText().setSelection(Math.min(this.d, d6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View F13 = this.b.F1(this.c);
                if (F13 instanceof d6) {
                    d6 d6Var3 = (d6) F13;
                    d6Var3.A();
                    d6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View F14 = this.b.F1(this.c);
                if (F14 instanceof d6) {
                    d6 d6Var4 = (d6) F14;
                    d6Var4.A();
                    d6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View F15 = this.b.F1(this.c);
                if (F15 instanceof d6) {
                    d6 d6Var5 = (d6) F15;
                    d6Var5.A();
                    d6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View F16 = this.b.F1(this.c);
                if (F16 instanceof d6) {
                    d6 d6Var6 = (d6) F16;
                    d6Var6.A();
                    d6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
