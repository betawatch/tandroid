package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.tz;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class fb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ fb(View view, int i9, float f10, int i10) {
        this.a = i10;
        this.d = view;
        this.b = i9;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.d;
                gbVar.V = this.c;
                if (gbVar.getValue() != this.b) {
                    gbVar.e(gbVar.getValue());
                }
                gbVar.invalidate();
                break;
            case 1:
                tz tzVar = (tz) this.d;
                int i9 = this.b;
                tzVar.b(i9 == 5 ? 0.0f : -this.c, i9 + 1);
                tzVar.y = 0.0f;
                tzVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.q1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public fb(gb gbVar, float f10, int i9) {
        this.a = 0;
        this.d = gbVar;
        this.c = f10;
        this.b = i9;
    }
}
