package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d61 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ j71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(j71 j71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = j71Var;
        this.c = z10;
        this.d = z11;
        this.e = f6Var;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j71 j71Var = this.h;
        if (!j71Var.Q0) {
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
            org.telegram.ui.ActionBar.j6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        float width = (this.f == null ? getWidth() / 2.0f : r1.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (j71Var.n()) {
            AndroidUtilities.rectTmp.set((width - (j71Var.a1 * width)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.b1, height, getPaddingTop()), ((width2 - width) * j71Var.a1) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (j71Var.a1 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * j71Var.a1) + getPaddingLeft() + width, (height * j71Var.b1) + getPaddingTop());
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
