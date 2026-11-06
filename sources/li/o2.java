package li;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ o2(t3 t3Var, a aVar, int i7, int i10) {
        this.a = i10;
        this.b = t3Var;
        this.c = aVar;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        View C12;
        switch (this.a) {
            case 0:
                t3 t3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    t3Var.getClass();
                    C1 = null;
                } else {
                    C1 = t3Var.C1(aVar);
                }
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(Math.min(this.d, a6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                t3 t3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    t3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = t3Var2.C1(aVar2);
                }
                if (C12 instanceof a6) {
                    a6 a6Var2 = (a6) C12;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(Math.min(this.d, a6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C13 = this.b.C1(this.c);
                if (C13 instanceof a6) {
                    a6 a6Var3 = (a6) C13;
                    a6Var3.B();
                    a6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof a6) {
                    a6 a6Var4 = (a6) C14;
                    a6Var4.B();
                    a6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C15 = this.b.C1(this.c);
                if (C15 instanceof a6) {
                    a6 a6Var5 = (a6) C15;
                    a6Var5.B();
                    a6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof a6) {
                    a6 a6Var6 = (a6) C16;
                    a6Var6.B();
                    a6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
