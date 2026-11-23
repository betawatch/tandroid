package hi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements r1.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ f3(float f10, View view, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7 = this.a;
        float f12 = this.c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.b;
        switch (i7) {
            case 0:
                h3 h3Var = (h3) callback;
                g3 g3Var = h3Var.m1;
                if (!z10) {
                    g3Var.setTranslationY(f12);
                    g3Var.L = false;
                    h3Var.o1 = null;
                    h3Var.p1 = null;
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
