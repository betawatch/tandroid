package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
import s4.c1;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l a;
    public final ih.f b;
    public final FrameLayout c;
    public r61 d;
    public boolean e;
    public final /* synthetic */ k0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Context context) {
        super(context);
        this.f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, a6.e(-1, -1, 119));
        ih.f fVar = new ih.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(j6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, a6.g());
    }

    public final void a() {
        this.d.j(new a2(this, 5));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(wr.h);
        g0Var.C = false;
        g0Var.m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                v51 G = this.d.Y2.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
