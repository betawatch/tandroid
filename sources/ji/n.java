package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class n extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = pVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                p pVar = this.b;
                pVar.j(canvas, rectF, pVar.g0 ? -1 : pVar.h0, 1.0f);
                break;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                p pVar2 = this.b;
                pVar2.e(canvas, rectF2, pVar2.g0 ? -1 : pVar2.h0, 1.0f);
                break;
        }
    }
}
