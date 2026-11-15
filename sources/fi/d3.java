package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.li0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
