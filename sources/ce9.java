// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;
    public final /* synthetic */ lk0 c;

    public /* synthetic */ ce9(ye9 ye9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                ye9Var.Z2(lk0Var);
                break;
            case 2:
                ye9Var.Z2(lk0Var);
                break;
            case 3:
                ye9Var.a3(lk0Var);
                break;
            case 4:
                ye9Var.Z2(lk0Var);
                break;
            default:
                ye9Var.Z2(lk0Var);
                break;
        }
    }
}
