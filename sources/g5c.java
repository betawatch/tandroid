// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g5c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5c b;

    public /* synthetic */ g5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() == 0) {
                        p5cVar.K0(true);
                        return;
                    }
                    p5cVar.g0[2].K(49);
                    p5cVar.g0[2].O(false, 0.0f);
                    p5cVar.a.d();
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                if (editTextBoldCursor2 == null || editTextBoldCursor2.getVisibility() != 0) {
                    return;
                }
                p5cVar.n.requestFocus();
                gm.E3(p5cVar.n);
                return;
            case 3:
                xe6 xe6Var = p5cVar.x;
                if (xe6Var == null || xe6Var.getVisibility() != 0) {
                    return;
                }
                p5cVar.x.f[0].requestFocus();
                return;
            case 4:
                if (p5cVar.h0 != null) {
                    p5cVar.K0(false);
                    return;
                }
                return;
            case 5:
                p5cVar.v0();
                return;
            case 6:
                gm.d3(new g5c(p5cVar, (byte) 7), 150L);
                return;
            default:
                gl2[] gl2VarArr = p5cVar.x.f;
                int length = gl2VarArr.length;
                while (i < length) {
                    gl2VarArr[i].A(0.0f);
                    i++;
                }
                return;
        }
        while (true) {
            gl2[] gl2VarArr2 = p5cVar.x.f;
            if (i >= gl2VarArr2.length) {
                return;
            }
            gl2VarArr2[i].A(0.0f);
            i++;
        }
    }
}
