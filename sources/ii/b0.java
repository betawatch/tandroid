package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import v4.d1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final lh.f b;
    public final FrameLayout c;
    public q41 d;
    public boolean e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, ha.e(-1, -1, qs.E1));
        lh.f fVar = new lh.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(k6.a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.m);
        fVar.a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ha.g());
    }

    public final void a() {
        this.d.j(new ai.b(this, 18));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(xq.h);
        a0Var.C = false;
        a0Var.m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            d1 T = this.d.T(childAt);
            if (T != null) {
                x31 G = this.d.f3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.m, b10));
        }
    }
}
