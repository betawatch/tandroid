package bi;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ x2(d4 d4Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = d4Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        View C12;
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    d4Var.getClass();
                    C1 = null;
                } else {
                    C1 = d4Var.C1(aVar);
                }
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(Math.min(this.d, q6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                d4 d4Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    d4Var2.getClass();
                    C12 = null;
                } else {
                    C12 = d4Var2.C1(aVar2);
                }
                if (C12 instanceof q6) {
                    q6 q6Var2 = (q6) C12;
                    q6Var2.B();
                    q6Var2.getEditText().setSelection(Math.min(this.d, q6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C13 = this.b.C1(this.c);
                if (C13 instanceof q6) {
                    q6 q6Var3 = (q6) C13;
                    q6Var3.B();
                    q6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof q6) {
                    q6 q6Var4 = (q6) C14;
                    q6Var4.B();
                    q6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C15 = this.b.C1(this.c);
                if (C15 instanceof q6) {
                    q6 q6Var5 = (q6) C15;
                    q6Var5.B();
                    q6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof q6) {
                    q6 q6Var6 = (q6) C16;
                    q6Var6.B();
                    q6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
