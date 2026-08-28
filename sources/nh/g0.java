package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bg.o2;
import f2.q1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class g0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final rg.f b;
    public final FrameLayout c;
    public i51 d;
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
        addView(frameLayout, e6.e(-1, -1, 119));
        rg.f fVar = new rg.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(f6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, e6.g());
    }

    public final void a() {
        this.d.j(new o2(this, 17));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(gr.h);
        f0Var.C = false;
        f0Var.m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i9 = 0; i9 < this.d.getChildCount(); i9++) {
            View childAt = this.d.getChildAt(i9);
            q1 T = this.d.T(childAt);
            if (T != null) {
                l41 G = this.d.U2.G(T.b());
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
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
