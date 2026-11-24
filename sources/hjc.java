// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class hjc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jjc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hjc(jjc jjcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = jjcVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        jjc jjcVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                jjcVar.j(canvas, rectF, jjcVar.g0 ? -1 : jjcVar.h0, 1.0f);
                break;
            default:
                RectF rectF2 = gl.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                jjcVar.e(canvas, rectF2, jjcVar.g0 ? -1 : jjcVar.h0, 1.0f);
                break;
        }
    }
}
