package oi;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ m2(q3 q3Var, a aVar, int i7, int i10) {
        this.a = i10;
        this.b = q3Var;
        this.c = aVar;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        View C12;
        switch (this.a) {
            case 0:
                q3 q3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    q3Var.getClass();
                    C1 = null;
                } else {
                    C1 = q3Var.C1(aVar);
                }
                if (C1 instanceof y5) {
                    y5 y5Var = (y5) C1;
                    y5Var.B();
                    y5Var.getEditText().setSelection(Math.min(this.d, y5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                q3 q3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    q3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = q3Var2.C1(aVar2);
                }
                if (C12 instanceof y5) {
                    y5 y5Var2 = (y5) C12;
                    y5Var2.B();
                    y5Var2.getEditText().setSelection(Math.min(this.d, y5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C13 = this.b.C1(this.c);
                if (C13 instanceof y5) {
                    y5 y5Var3 = (y5) C13;
                    y5Var3.B();
                    y5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof y5) {
                    y5 y5Var4 = (y5) C14;
                    y5Var4.B();
                    y5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C15 = this.b.C1(this.c);
                if (C15 instanceof y5) {
                    y5 y5Var5 = (y5) C15;
                    y5Var5.B();
                    y5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof y5) {
                    y5 y5Var6 = (y5) C16;
                    y5Var6.B();
                    y5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
