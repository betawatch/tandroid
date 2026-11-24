// default package

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kt(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((o) obj).i0.N.c(true, f);
                break;
            case 1:
                c11 c11Var = (c11) obj;
                if (c11Var.a.getTranslationX() == f) {
                    c11Var.E.b();
                    break;
                }
                break;
            case 2:
                ((HttpGetFileTask) obj).lambda$doInBackground$0(f);
                break;
            case 3:
                pk8 pk8Var = (pk8) obj;
                bgc bgcVar = pk8Var.c;
                int i = bgcVar.x;
                if (f > 0.0f) {
                    if (i < 2) {
                        bgcVar.c(i + 1, true);
                    }
                } else if (i > 0) {
                    bgcVar.c(i - 1, true);
                }
                pk8Var.b = false;
                break;
            case 4:
                on9 on9Var = ((dn9) obj).a;
                if (on9Var.t0 != f) {
                    on9Var.t0 = f;
                    on9Var.r();
                    on9Var.f.requestLayout();
                    break;
                }
                break;
            default:
                ao9 ao9Var = (ao9) obj;
                ao9Var.i = f;
                y54 y54Var = ao9Var.f;
                if (y54Var != null) {
                    y54Var.R(f);
                    break;
                }
                break;
        }
    }
}
