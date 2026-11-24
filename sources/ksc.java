// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ksc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt b;

    public /* synthetic */ ksc(wt wtVar, byte b) {
        this.a = b;
        this.b = wtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wt wtVar = this.b;
        switch (b) {
            case 0:
                wtVar.B0 = true;
                if (wtVar.getParent() != null) {
                    wtVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    wtVar.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                boolean z = wtVar.a0;
                ps0 ps0Var = wtVar.c0;
                if (!z) {
                    ps0Var.clearFocus();
                    gl.t1(ps0Var);
                    break;
                } else {
                    ps0Var.requestFocus();
                    gl.E3(ps0Var);
                    break;
                }
        }
    }
}
