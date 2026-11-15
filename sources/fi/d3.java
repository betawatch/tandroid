package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.li0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d3 implements li0 {
    public final /* synthetic */ b4 a;

    public d3(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.li0
    public final boolean B() {
        ((z8) this.a.A1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        aa.r rVar = new aa.r(this, p0Var, view, 27);
        if (z10) {
            rVar.run();
        } else {
            this.a.l0(rVar);
        }
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
