package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import s4.c1;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k a;
    public final jh.f b;
    public final FrameLayout c;
    public u61 d;
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
        addView(frameLayout, y5.e(-1, -1, 119));
        jh.f fVar = new jh.f(getContext());
        this.b = fVar;
        fVar.setupColorKey(j6.a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, y5.g());
    }

    public final void a() {
        this.d.j(new ai.r(this, 7));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(qr.h);
        g0Var.C = false;
        g0Var.m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 U = this.d.U(childAt);
            if (U != null) {
                y51 G = this.d.Y2.G(U.b());
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
