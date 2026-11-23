package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.v1;
import c8.na;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import v4.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class a0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final lh.f b;
    public final FrameLayout c;
    public g51 d;
    public boolean e;
    public final /* synthetic */ c0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Context context) {
        super(context);
        this.f = c0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, na.e(-1, -1, ks.E1));
        lh.f fVar = new lh.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(n6.a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.m);
        fVar.a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, na.g());
    }

    public final void a() {
        this.d.j(new v1(this, 25));
        z zVar = new z(this);
        zVar.n(350L);
        zVar.o(kr.h);
        zVar.C = false;
        zVar.m = false;
        this.d.setItemAnimator(zVar);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            f1 T = this.d.T(childAt);
            if (T != null) {
                n41 G = this.d.g3.G(T.b());
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
