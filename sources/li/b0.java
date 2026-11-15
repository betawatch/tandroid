package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.z4;
import c8.ja;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import v4.e1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final lh.f b;
    public final FrameLayout c;
    public u41 d;
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
        addView(frameLayout, ja.e(-1, -1, ns.E1));
        lh.f fVar = new lh.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(j6.a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.m);
        fVar.a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ja.g());
    }

    public final void a() {
        this.d.j(new z4(this, 24));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(er.h);
        a0Var.C = false;
        a0Var.m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            e1 T = this.d.T(childAt);
            if (T != null) {
                b41 G = this.d.g3.G(T.b());
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
