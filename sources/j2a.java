// default package

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class j2a extends p1a {
    public final /* synthetic */ oab O;
    public final /* synthetic */ p2a P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2a(p2a p2aVar, oab oabVar, Context context) {
        super(context);
        this.P = p2aVar;
        this.O = oabVar;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new n1a(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, on2.p(-16777216, nm7.p2)});
    }

    @Override // p1a
    public final void b(int i) {
        kab kabVar;
        p2a p2aVar = this.P;
        k2a k2aVar = p2aVar.F;
        if (p2aVar.x) {
            return;
        }
        if (k2aVar.getCurrentItem() != i) {
            try {
                k2aVar.x(i, false);
            } catch (Throwable th) {
                fc4.g(th, true);
                k2aVar.getAdapter().g();
                k2aVar.x(i, false);
            }
        }
        oab oabVar = this.O;
        if (oabVar.O0 == null || (kabVar = oabVar.u0) == null) {
            return;
        }
        if (i < 10) {
            kabVar.e(false);
        } else if (i >= this.F.size() - 10) {
            oabVar.u0.e(true);
        }
    }
}
