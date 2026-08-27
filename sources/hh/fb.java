package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class fb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ fb(View view, int i10, float f10, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
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
                wz wzVar = (wz) this.d;
                int i10 = this.b;
                wzVar.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                wzVar.y = 0.0f;
                wzVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.r1) this.d).c(this.b, this.c, false);
                break;
        }
    }

    public fb(gb gbVar, float f10, int i10) {
        this.a = 0;
        this.d = gbVar;
        this.c = f10;
        this.b = i10;
    }
}
