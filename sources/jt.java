// default package

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt(Object obj, float f, byte b) {
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
                l11 l11Var = (l11) obj;
                if (l11Var.a.getTranslationX() == f) {
                    l11Var.E.b();
                    break;
                }
                break;
            case 2:
                ((HttpGetFileTask) obj).lambda$doInBackground$0(f);
                break;
            case 3:
                co8 co8Var = (co8) obj;
                gkc gkcVar = co8Var.c;
                int i = gkcVar.x;
                if (f > 0.0f) {
                    if (i < 2) {
                        gkcVar.c(i + 1, true);
                    }
                } else if (i > 0) {
                    gkcVar.c(i - 1, true);
                }
                co8Var.b = false;
                break;
            case 4:
                er9 er9Var = ((tq9) obj).a;
                if (er9Var.t0 != f) {
                    er9Var.t0 = f;
                    er9Var.r();
                    er9Var.f.requestLayout();
                    break;
                }
                break;
            default:
                rr9 rr9Var = (rr9) obj;
                rr9Var.i = f;
                s64 s64Var = rr9Var.f;
                if (s64Var != null) {
                    s64Var.R(f);
                    break;
                }
                break;
        }
    }
}
