package fi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements r1.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ h3(float f10, View view, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        int i7 = this.a;
        float f12 = this.c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.b;
        switch (i7) {
            case 0:
                j3 j3Var = (j3) callback;
                i3 i3Var = j3Var.l1;
                if (!z9) {
                    i3Var.setTranslationY(f12);
                    i3Var.K = false;
                    j3Var.n1 = null;
                    j3Var.o1 = null;
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

    public /* synthetic */ h3(j3 j3Var, float f10, Runnable runnable) {
        this.d = j3Var;
        this.c = f10;
        this.b = runnable;
    }
}
