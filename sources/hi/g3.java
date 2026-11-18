package hi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements r1.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ g3(float f10, View view, Runnable runnable) {
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
                i3 i3Var = (i3) callback;
                h3 h3Var = i3Var.m1;
                if (!z10) {
                    h3Var.setTranslationY(f12);
                    h3Var.L = false;
                    i3Var.o1 = null;
                    i3Var.p1 = null;
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

    public /* synthetic */ g3(i3 i3Var, float f10, Runnable runnable) {
        this.d = i3Var;
        this.c = f10;
        this.b = runnable;
    }
}
