// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hlc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jlc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hlc(jlc jlcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = jlcVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        jlc jlcVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                jlcVar.j(canvas, rectF, jlcVar.g0 ? -1 : jlcVar.h0, 1.0f);
                break;
            default:
                RectF rectF2 = gm.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                jlcVar.e(canvas, rectF2, jlcVar.g0 ? -1 : jlcVar.h0, 1.0f);
                break;
        }
    }
}
