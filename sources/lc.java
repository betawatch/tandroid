// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lc extends View implements snb {
    public final ImageReceiver a;
    public final String b;
    public final String c;
    public final TextPaint d;
    public StaticLayout e;
    public float f;
    public float h;
    public final TextPaint n;
    public StaticLayout r;
    public float s;
    public float w;
    public final vnb x;

    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lc(Context context, no6 no6Var, String str, int i, vnb vnbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.n = textPaint2;
        this.x = vnbVar;
        setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        setBackground(aob.L0(false));
        setMinimumWidth(hl.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i2 = aob.E8;
        textPaint.setColor(aob.v0(i2, vnbVar));
        textPaint.setTextSize(hl.L(16.0f));
        textPaint2.setColor(aob.v0(i2, vnbVar));
        textPaint2.setAlpha(jn7.m1);
        textPaint2.setTextSize(hl.L(13.0f));
        String valueOf = String.valueOf(str);
        this.b = valueOf;
        this.c = String.valueOf(i);
        imageReceiver.q0(hl.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        zm2 zm2Var = new zm2(aob.b0(hl.L(6.0f), -13750737), mutate);
        zm2Var.x = false;
        int L = hl.L(18.0f);
        int L2 = hl.L(18.0f);
        zm2Var.e = L;
        zm2Var.f = L2;
        if (no6Var != null) {
            String str2 = no6Var.c;
            if (str2 != null) {
                imageReceiver.a0(jn5.g(str2), "30.0_30.0", null, null, zm2Var, null, 0);
            } else {
                String str3 = no6Var.I;
                if (str3 != null) {
                    boolean z = no6Var.b;
                    int i3 = no6Var.C;
                    if (z) {
                        imageReceiver.a0(jn5.g("vthumb://" + i3 + ":" + str3), "30.0_30.0", null, null, zm2Var, null, 0);
                    } else {
                        imageReceiver.a0(jn5.g("thumb://" + i3 + ":" + str3), "30.0_30.0", null, null, zm2Var, null, 0);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) valueOf);
            sb.append(i <= 0 ? " ".concat(ob6.H(',', "Media", i)) : "");
            setContentDescription(sb.toString());
        }
        imageReceiver.g0(zm2Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) valueOf);
        sb2.append(i <= 0 ? " ".concat(ob6.H(',', "Media", i)) : "");
        setContentDescription(sb2.toString());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        float L = hl.L(30.0f);
        float L2 = hl.L(30.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(paddingLeft, (getMeasuredHeight() - hl.L(30.0f)) / 2.0f, L, L2);
        imageReceiver.h(canvas, null);
        float L3 = paddingLeft + hl.L(30.0f) + hl.L(12.0f);
        if (this.e != null) {
            canvas.save();
            canvas.translate(L3 - this.h, (getMeasuredHeight() - this.e.getHeight()) / 2.0f);
            this.e.draw(canvas);
            L3 = L3 + this.f + hl.L(6.0f);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate(L3 - this.w, hl.N(1.6f) + ((getMeasuredHeight() - this.r.getHeight()) / 2.0f));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (((View.MeasureSpec.getSize(i) - hl.L(30.0f)) - hl.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.e = staticLayout2;
            this.h = staticLayout2.getLineCount() > 0 ? this.e.getLineLeft(0) : 0.0f;
            float lineWidth = this.e.getLineCount() > 0 ? this.e.getLineWidth(0) : 0.0f;
            this.f = lineWidth;
            int L = size - ((int) (lineWidth + hl.L(8.0f)));
            TextPaint textPaint2 = this.n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.w = staticLayout3.getLineCount() > 0 ? this.r.getLineLeft(0) : 0.0f;
            this.s = this.r.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(hl.L(12.0f) + hl.L(30.0f) + getPaddingLeft() + this.f + hl.L(8.0f) + this.s + getPaddingRight(), View.MeasureSpec.getSize(i)), hl.L(48.0f));
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(48.0f));
        }
    }

    @Override // snb
    public final void updateColors() {
        TextPaint textPaint = this.n;
        try {
            int v0 = aob.v0(aob.E8, this.x);
            this.d.setColor(v0);
            textPaint.setColor(v0);
            textPaint.setAlpha(jn7.m1);
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
