package lh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m7 implements jg.g {
    public final /* synthetic */ r7 a;

    public m7(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // jg.g
    public final void A(g.y yVar) {
        yVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        yVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // jg.g
    public final void n(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        r7 r7Var = this.a;
        canvas.drawColor(r7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            r7Var.h0.b(canvas, -2);
        }
    }
}
