// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class h0a extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vnb e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ n1a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0a(n1a n1aVar, Context context, boolean z, boolean z2, vnb vnbVar, Integer num) {
        super(context);
        this.h = n1aVar;
        this.c = z;
        this.d = z2;
        this.e = vnbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        n1a n1aVar = this.h;
        if (!n1aVar.R0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z = this.d;
        Paint paint = this.b;
        if (z) {
            aob.m(paint);
        }
        paint.setColor(aob.v0(aob.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + hl.L(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (n1aVar.m()) {
            rectF = hl.P;
            rectF.set((width - (n1aVar.b1 * width)) + getPaddingLeft(), qd4.A(1.0f, n1aVar.c1, height, getPaddingTop()), ((width2 - width) * n1aVar.b1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            rectF = hl.P;
            rectF.set((width - (n1aVar.b1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * n1aVar.b1) + getPaddingLeft() + width, (height * n1aVar.c1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
