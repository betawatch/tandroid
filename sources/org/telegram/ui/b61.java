package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b61 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ h71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(h71 h71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = h71Var;
        this.c = z10;
        this.d = z11;
        this.e = e6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h71 h71Var = this.h;
        if (!h71Var.Q0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z10 = this.d;
        Paint paint = this.b;
        if (z10) {
            org.telegram.ui.ActionBar.i6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (h71Var.n()) {
            AndroidUtilities.rectTmp.set((width - (h71Var.a1 * width)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.b1, height, getPaddingTop()), ((width2 - width) * h71Var.a1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (h71Var.a1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * h71Var.a1) + getPaddingLeft() + width, (height * h71Var.b1) + getPaddingTop());
        }
        Path path = this.a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
