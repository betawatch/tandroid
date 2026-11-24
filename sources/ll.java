// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements ht3 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override // ht3
    public final void a(zna znaVar, boolean z, float f, float f2) {
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
                xt4 xt4Var = (xt4) obj2;
                ut4 ut4Var = (ut4) obj;
                wt4 wt4Var = xt4Var.l1;
                if (!z) {
                    wt4Var.setTranslationY(f3);
                    wt4Var.L = false;
                    xt4Var.n1 = null;
                    xt4Var.o1 = null;
                    if (ut4Var != null) {
                        ut4Var.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ll(xt4 xt4Var, float f, ut4 ut4Var) {
        this.c = xt4Var;
        this.b = f;
        this.d = ut4Var;
    }
}
