package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class p extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = rVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                r rVar = this.b;
                rVar.j(canvas, rectF, rVar.g0 ? -1 : rVar.h0, 1.0f);
                break;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                r rVar2 = this.b;
                rVar2.e(canvas, rectF2, rVar2.g0 ? -1 : rVar2.h0, 1.0f);
                break;
        }
    }
}
