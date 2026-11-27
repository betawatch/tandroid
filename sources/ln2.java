// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ln2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final /* synthetic */ vnb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln2(Context context, vnb vnbVar) {
        super(context);
        this.e = vnbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.d = new RectF();
        paint2.setColor(-1);
        paint.setColor(aob.v0(aob.d6, vnbVar));
        paint3.setColor(aob.v0(aob.nk, vnbVar));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = aob.d6;
        vnb vnbVar = this.e;
        int v0 = aob.v0(i, vnbVar);
        Paint paint = this.a;
        paint.setColor(v0);
        int v02 = aob.v0(aob.nk, vnbVar);
        Paint paint2 = this.c;
        paint2.setColor(v02);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        rectF.inset(hl.L(1.33f), hl.L(1.33f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint2);
        rectF.inset(hl.N(4.67f), hl.N(9.066f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.b);
    }
}
