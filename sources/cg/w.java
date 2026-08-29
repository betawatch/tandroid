package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.v5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w extends View {
    public final Path a;
    public final CornerPathEffect b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f;
    public final ArrayList h;
    public StaticLayout n;
    public boolean r;
    public float s;
    public boolean v;
    public final Paint w;
    public final Paint x;
    public final /* synthetic */ LimitPreviewView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.y = limitPreviewView;
        this.a = new Path();
        this.b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.w = paint;
        Paint paint2 = new Paint();
        this.x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(w wVar) {
        ArrayList arrayList = wVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v) arrayList.get(i10)).f != null) {
                return;
            }
        }
        arrayList.clear();
        wVar.r = false;
        wVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.a;
        path.rewind();
        float f9 = measuredHeight;
        float f10 = f9 - (f9 / 2.0f);
        path.moveTo(clamp3, f10 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f9);
        path.lineTo(clamp4, f9);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.s < 0.7f) {
            path.lineTo(clamp, f9);
        }
        path.lineTo(clamp2, f9);
        path.lineTo(clamp2, f10 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.y;
        Paint paint = limitPreviewView.G;
        if (limitPreviewView.F) {
            measuredHeight = getMeasuredHeight();
            s1 d = s1.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f9 = measuredHeight / 2.0f;
            s1 d10 = s1.d();
            if (d10.c == null) {
                d10.c = new Paint(1);
            }
            d10.c.setColor(g6.w0(null, g6.Oh, false));
            canvas.drawRoundRect(rectF, f9, f9, d10.c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            s1 d11 = s1.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d11.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f10 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f10);
            float f11 = f10 / 2.0f;
            boolean z10 = limitPreviewView.N;
            TextPaint textPaint = this.c;
            canvas.drawRoundRect(rectF2, f11, f11, z10 ? paint : limitPreviewView.a0 != null ? textPaint : s1.d().e());
            Paint e10 = s1.d().e();
            CornerPathEffect cornerPathEffect = this.b;
            e10.setPathEffect(cornerPathEffect);
            if (limitPreviewView.a0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.N) {
                paint = limitPreviewView.a0 != null ? textPaint : s1.d().e();
            }
            canvas.drawPath(this.a, paint);
            s1.d().e().setPathEffect(null);
            if (limitPreviewView.a0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.W) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.a0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.w, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (this.r) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.n != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.n.draw(canvas);
                canvas.restore();
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i11 >= arrayList.size()) {
                    break;
                }
                v vVar = (v) arrayList.get(i11);
                canvas.save();
                boolean z11 = vVar.a;
                ArrayList arrayList2 = vVar.b;
                if (z11) {
                    canvas.translate(vVar.e + measuredWidth3, ((i10 * vVar.c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (vVar.d) {
                    canvas.translate(vVar.e + measuredWidth3, (height - ((i10 * 10) * vVar.c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(vVar.e + measuredWidth3, (((i10 * 10) * vVar.c) + height) - ((10 - arrayList2.size()) * i10));
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i14)).draw(canvas);
                    }
                }
                canvas.restore();
                i11++;
            }
            canvas.restore();
        } else if (this.d != null) {
            canvas.save();
            canvas.translate(measuredWidth3, height);
            this.d.draw(canvas);
            canvas.restore();
        }
        if (limitPreviewView.a0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((v5) ((org.telegram.ui.c1) limitPreviewView.a0).b).t0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f;
        TextPaint textPaint = this.c;
        this.e = t3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override // android.view.View
    public final void setTranslationX(float f9) {
        if (f9 != getTranslationX()) {
            super.setTranslationX(f9);
            invalidate();
        }
    }
}
