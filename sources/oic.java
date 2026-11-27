// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class oic implements s69, t69 {
    public final /* synthetic */ uic a;

    public /* synthetic */ oic(uic uicVar) {
        this.a = uicVar;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        uic uicVar = this.a;
        tic ticVar = uicVar.E;
        if (ticVar == null || ticVar.b()) {
            sic sicVar = (sic) view;
            if (i != uicVar.G || uicVar.E == null) {
                jcc jccVar = uicVar.m0;
                if (jccVar == null || !((Boolean) jccVar.g(Integer.valueOf(sicVar.a.a), Integer.valueOf(i))).booleanValue()) {
                    uicVar.e(sicVar.a.a, i);
                }
            }
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        jcc jccVar = this.a.b;
        if (jccVar == null) {
            return false;
        }
        return ((Boolean) jccVar.g(Integer.valueOf(((sic) view).a.a), view)).booleanValue();
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
