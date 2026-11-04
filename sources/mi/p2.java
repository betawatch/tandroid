package mi;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ p2(t3 t3Var, a aVar, int i3, int i10) {
        this.a = i10;
        this.b = t3Var;
        this.c = aVar;
        this.d = i3;
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
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    b6Var.getEditText().setSelection(Math.min(this.d, b6Var.getEditText().length()));
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
                if (C12 instanceof b6) {
                    b6 b6Var2 = (b6) C12;
                    b6Var2.B();
                    b6Var2.getEditText().setSelection(Math.min(this.d, b6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C13 = this.b.C1(this.c);
                if (C13 instanceof b6) {
                    b6 b6Var3 = (b6) C13;
                    b6Var3.B();
                    b6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof b6) {
                    b6 b6Var4 = (b6) C14;
                    b6Var4.B();
                    b6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C15 = this.b.C1(this.c);
                if (C15 instanceof b6) {
                    b6 b6Var5 = (b6) C15;
                    b6Var5.B();
                    b6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof b6) {
                    b6 b6Var6 = (b6) C16;
                    b6Var6.B();
                    b6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
