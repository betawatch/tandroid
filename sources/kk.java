// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements ps3 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kk(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.d;
        float f3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                View view = (View) obj;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f3);
                view.setTag(R.id.spring_tag, null);
                view.setTag(R.id.spring_was_translation_x_tag, null);
                break;
            default:
                au4 au4Var = (au4) obj2;
                xt4 xt4Var = (xt4) obj;
                zt4 zt4Var = au4Var.l1;
                if (!z) {
                    zt4Var.setTranslationY(f3);
                    zt4Var.L = false;
                    au4Var.n1 = null;
                    au4Var.o1 = null;
                    if (xt4Var != null) {
                        xt4Var.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ kk(au4 au4Var, float f, xt4 xt4Var) {
        this.c = au4Var;
        this.b = f;
        this.d = xt4Var;
    }
}
