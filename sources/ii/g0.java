package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class g0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final lh.f b;
    public final FrameLayout c;
    public s71 d;
    public boolean e;
    public final /* synthetic */ j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Context context) {
        super(context);
        this.f = j0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, kb1.i(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(y6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, kb1.k());
    }

    public final void a() {
        this.d.j(new ai.b(this, 15));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(ds.h);
        f0Var.C = false;
        f0Var.m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            e1 T = this.d.T(childAt);
            if (T != null) {
                u61 G = this.d.g3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
