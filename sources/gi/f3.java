package gi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements q1.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ f3(float f10, View view, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f10;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        int i3 = this.a;
        float f12 = this.c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.b;
        switch (i3) {
            case 0:
                h3 h3Var = (h3) callback;
                g3 g3Var = h3Var.j1;
                if (!z10) {
                    g3Var.setTranslationY(f12);
                    g3Var.L = false;
                    h3Var.l1 = null;
                    h3Var.m1 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                View view = (View) callback;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f12);
                view.setTag(R.id.spring_tag, null);
                view.setTag(R.id.spring_was_translation_x_tag, null);
                break;
        }
    }

    public /* synthetic */ f3(h3 h3Var, float f10, Runnable runnable) {
        this.d = h3Var;
        this.c = f10;
        this.b = runnable;
    }
}
