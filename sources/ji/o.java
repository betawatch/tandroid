package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = qVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar = this.b;
                qVar.j(canvas, rectF, qVar.g0 ? -1 : qVar.h0, 1.0f);
                break;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar2 = this.b;
                qVar2.e(canvas, rectF2, qVar2.g0 ? -1 : qVar2.h0, 1.0f);
                break;
        }
    }
}
