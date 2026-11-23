package oi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u2(f1 f1Var, int i7, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                f1Var.O();
                f1Var.setSelection(Math.max(0, Math.min(this.c, f1Var.length())));
                break;
            case 1:
                f1 f1Var2 = this.b;
                f1Var2.O();
                f1Var2.setSelection(Math.max(0, Math.min(this.c, f1Var2.length())));
                break;
            case 2:
                f1 f1Var3 = this.b;
                f1Var3.O();
                f1Var3.setSelection(Math.max(0, Math.min(this.c, f1Var3.length())));
                break;
            case 3:
                f1 f1Var4 = this.b;
                f1Var4.O();
                f1Var4.setSelection(Math.min(this.c, f1Var4.length()));
                break;
            default:
                f1 f1Var5 = this.b;
                f1Var5.O();
                f1Var5.setSelection(Math.max(0, Math.min(this.c, f1Var5.length())));
                break;
        }
    }
}
