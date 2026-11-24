// default package

import org.telegram.ui.o;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ku(Object obj, float f, byte b) {
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
                k21 k21Var = (k21) obj;
                if (k21Var.a.getTranslationX() == f) {
                    k21Var.E.b();
                    break;
                }
                break;
            case 2:
                ((HttpGetFileTask) obj).lambda$doInBackground$0(f);
                break;
            case 3:
                rm8 rm8Var = (rm8) obj;
                cic cicVar = rm8Var.c;
                int i = cicVar.x;
                if (f > 0.0f) {
                    if (i < 2) {
                        cicVar.c(i + 1, true);
                    }
                } else if (i > 0) {
                    cicVar.c(i - 1, true);
                }
                rm8Var.b = false;
                break;
            case 4:
                pp9 pp9Var = ((ep9) obj).a;
                if (pp9Var.t0 != f) {
                    pp9Var.t0 = f;
                    pp9Var.r();
                    pp9Var.f.requestLayout();
                    break;
                }
                break;
            default:
                bq9 bq9Var = (bq9) obj;
                bq9Var.i = f;
                h74 h74Var = bq9Var.f;
                if (h74Var != null) {
                    h74Var.R(f);
                    break;
                }
                break;
        }
    }
}
