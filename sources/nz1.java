// default package

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nz1 implements yr3 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ nz1(x02 x02Var, float f, float f2, boolean z) {
        this.e = x02Var;
        this.c = f;
        this.d = f2;
        this.b = z;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        float f3 = this.d;
        float f4 = this.c;
        boolean z = this.b;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                LinearLayout linearLayout = x02Var.i3;
                LinearLayout linearLayout2 = x02Var.k3;
                float f5 = f / 500.0f;
                i02 i02Var = x02Var.Y1;
                p02 p02Var = x02Var.v2;
                Float valueOf = Float.valueOf(f5);
                i02Var.getClass();
                i02Var.a(p02Var, valueOf);
                x02Var.U2.setAlpha(gl.R1(f4, f3, f5));
                x02Var.H1(x02Var.v2, 0);
                x02Var.H1(x02Var.w2, 0);
                if (!(x02Var.w2 instanceof m52) || z) {
                    f5 = 1.0f - f5;
                }
                float i = Utilities.i(f5, 1.0f, 0.0f);
                linearLayout2.setAlpha(i);
                float f6 = 1.0f - i;
                linearLayout.setAlpha(f6);
                linearLayout.setTranslationX(i * (-gl.L(16.0f)));
                linearLayout2.setTranslationX(f6 * gl.L(16.0f));
                break;
            default:
                k4a k4aVar = (k4a) callback;
                if (z) {
                    if (f > f4 / 2.0f || !k4aVar.s) {
                    }
                } else if (f < f3 / 2.0f || !k4aVar.r) {
                }
                k4aVar.s = !z;
                k4aVar.r = z;
                break;
        }
    }

    public /* synthetic */ nz1(k4a k4aVar, boolean z, float f, float f2) {
        this.e = k4aVar;
        this.b = z;
        this.c = f;
        this.d = f2;
    }
}
