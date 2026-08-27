package oh;

import ag.z2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.o1;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class g0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final sg.f b;
    public final FrameLayout c;
    public k51 d;
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
        addView(frameLayout, z5.e(-1, -1, 119));
        sg.f fVar = new sg.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(g6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, z5.g());
    }

    public final void a() {
        this.d.j(new z2(this, 18));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(er.h);
        f0Var.C = false;
        f0Var.m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            o1 T = this.d.T(childAt);
            if (T != null) {
                n41 G = this.d.U2.G(T.b());
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
