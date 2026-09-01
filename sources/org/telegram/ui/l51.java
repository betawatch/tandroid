package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l51 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ r61 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(r61 r61Var, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = r61Var;
        this.c = z4;
        this.d = z10;
        this.e = g6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r61 r61Var = this.h;
        if (!r61Var.N0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z4 = this.d;
        Paint paint = this.b;
        if (z4) {
            org.telegram.ui.ActionBar.k6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (r61Var.n()) {
            AndroidUtilities.rectTmp.set((width - (r61Var.X0 * width)) + getPaddingLeft(), e2.c.w(1.0f, r61Var.Y0, height, getPaddingTop()), ((width2 - width) * r61Var.X0) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (r61Var.X0 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * r61Var.X0) + getPaddingLeft() + width, (height * r61Var.Y0) + getPaddingTop());
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
