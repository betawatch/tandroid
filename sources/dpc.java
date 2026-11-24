// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ dpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                if (qpcVar.J && (editTextBoldCursor = qpcVar.I) != null && editTextBoldCursor.isAttachedToWindow() && qpcVar.I.hasWindowFocus()) {
                    qpcVar.I.requestFocus();
                    if (gl.F3(qpcVar.I)) {
                        qpcVar.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f = qpcVar.c0;
                if (f < 1.0f && qpcVar.b0 == null) {
                    yla ylaVar = new yla(new ti4(f));
                    qpcVar.b0 = ylaVar;
                    zla zlaVar = new zla(1.0f);
                    zlaVar.a(0.55f);
                    zlaVar.b(65.0f);
                    ylaVar.m = zlaVar;
                    qpcVar.b0.f(0.001f);
                    qpcVar.b0.b(new h10(qpcVar, (byte) 20));
                    qpcVar.b0.a(new zv0(qpcVar, (byte) 13));
                    qpcVar.b0.h();
                    break;
                }
                break;
            case 2:
                qpcVar.e0.setLoading(false);
                break;
            case 3:
                qpcVar.e0.setLoading(false);
                break;
            case 4:
                qpcVar.u0();
                break;
            case 5:
                qpcVar.presentFragment(mu1.U9(qpcVar.f.id));
                break;
            default:
                ir2.v(null, 2131742958, u21.b0(qpcVar), R.raw.copy, 36);
                break;
        }
    }
}
