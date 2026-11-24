// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3c b;

    public /* synthetic */ f3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() == 0) {
                        p3cVar.J0(true);
                        return;
                    }
                    p3cVar.g0[2].K(49);
                    p3cVar.g0[2].O(false, 0.0f);
                    p3cVar.a.d();
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                if (editTextBoldCursor2 == null || editTextBoldCursor2.getVisibility() != 0) {
                    return;
                }
                p3cVar.n.requestFocus();
                gl.F3(p3cVar.n);
                return;
            case 3:
                yc6 yc6Var = p3cVar.x;
                if (yc6Var == null || yc6Var.getVisibility() != 0) {
                    return;
                }
                p3cVar.x.f[0].requestFocus();
                return;
            case 4:
                if (p3cVar.h0 != null) {
                    p3cVar.J0(false);
                    return;
                }
                return;
            case 5:
                p3cVar.u0();
                return;
            case 6:
                gl.e3(new f3c(p3cVar, (byte) 7), 150L);
                return;
            default:
                sj2[] sj2VarArr = p3cVar.x.f;
                int length = sj2VarArr.length;
                while (i < length) {
                    sj2VarArr[i].A(0.0f);
                    i++;
                }
                return;
        }
        while (true) {
            sj2[] sj2VarArr2 = p3cVar.x.f;
            if (i >= sj2VarArr2.length) {
                return;
            }
            sj2VarArr2[i].A(0.0f);
            i++;
        }
    }
}
