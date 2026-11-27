// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class l13 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r13 b;

    public /* synthetic */ l13(r13 r13Var, byte b) {
        this.a = b;
        this.b = r13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r13 r13Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = r13Var.f;
                if (h23Var != null) {
                    h23Var.B(new v03("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = r13Var.f;
                if (h23Var2 != null) {
                    h23Var2.B(new v03("No provider data returned.", (byte) 2));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
        }
    }
}
