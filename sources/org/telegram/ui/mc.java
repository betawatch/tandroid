package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mc extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.pc r;
    public boolean s;
    public final org.telegram.ui.Components.y5 v;
    public final /* synthetic */ nc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(nc ncVar, Context context) {
        super(context);
        this.w = ncVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new org.telegram.ui.Components.pc(this);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 320L, org.telegram.ui.Components.gr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.b6 b6Var = this.w.a;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, b6Var));
            paint.setColor(peerColor.getColor(0, b6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, b6Var));
            paint.setColor(peerColor.getColor(1, b6Var));
        }
        this.d.setColor(peerColor.getColor(2, b6Var));
        this.h = peerColor.hasColor2();
        this.n = peerColor.hasColor3();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.b);
        if (this.h) {
            canvas.drawPath(this.f, this.c);
        }
        canvas.restore();
        if (this.n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e10 = this.v.e(this.s);
        if (e10 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e10), paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i9) {
        this.a.setColor(i9);
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.r.c(z10);
    }
}
