// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class f7c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7c b;

    public /* synthetic */ f7c(o7c o7cVar, byte b) {
        this.a = b;
        this.b = o7cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = o7cVar.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() == 0) {
                        o7cVar.K0(true);
                        return;
                    }
                    o7cVar.g0[2].K(49);
                    o7cVar.g0[2].O(false, 0.0f);
                    o7cVar.a.d();
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = o7cVar.n;
                if (editTextBoldCursor2 == null || editTextBoldCursor2.getVisibility() != 0) {
                    return;
                }
                o7cVar.n.requestFocus();
                hl.E3(o7cVar.n);
                return;
            case 3:
                bf6 bf6Var = o7cVar.x;
                if (bf6Var == null || bf6Var.getVisibility() != 0) {
                    return;
                }
                o7cVar.x.f[0].requestFocus();
                return;
            case 4:
                if (o7cVar.h0 != null) {
                    o7cVar.K0(false);
                    return;
                }
                return;
            case 5:
                o7cVar.u0();
                return;
            case 6:
                hl.d3(new f7c(o7cVar, (byte) 7), 150L);
                return;
            default:
                ok2[] ok2VarArr = o7cVar.x.f;
                int length = ok2VarArr.length;
                while (i < length) {
                    ok2VarArr[i].A(0.0f);
                    i++;
                }
                return;
        }
        while (true) {
            ok2[] ok2VarArr2 = o7cVar.x.f;
            if (i >= ok2VarArr2.length) {
                return;
            }
            ok2VarArr2[i].A(0.0f);
            i++;
        }
    }
}
