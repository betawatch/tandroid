package gi;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends View implements org.telegram.ui.ActionBar.z5 {
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
    public final org.telegram.ui.ActionBar.e6 x;

    public a(Context context, ye yeVar, String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.n = textPaint2;
        this.x = e6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        textPaint2.setAlpha(hs.n1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.b = str4;
        this.c = k2.p1.i(i3, "");
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        xpVar.x = false;
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        xpVar.e = L;
        xpVar.f = L2;
        if (yeVar == null || (str2 = yeVar.c) == null) {
            if (yeVar != null) {
                int i11 = yeVar.C;
                String str5 = yeVar.I;
                if (str5 != null) {
                    if (yeVar.b) {
                        imageReceiver.s0(ac.g("vthumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    } else {
                        imageReceiver.s0(ac.g("thumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    }
                }
            }
            imageReceiver.w0(xpVar);
        } else {
            imageReceiver.s0(ac.g(str2), "30.0_30.0", null, null, xpVar, null, 0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i3 > 0) {
            str3 = " " + bd.H(',', "Media", i3);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        float L = org.telegram.messenger.g0.L(30.0f);
        float L2 = org.telegram.messenger.g0.L(30.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(paddingLeft, (getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f)) / 2.0f, L, L2);
        imageReceiver.h(canvas, null);
        float L3 = paddingLeft + org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f);
        if (this.e != null) {
            canvas.save();
            canvas.translate(L3 - this.h, (getMeasuredHeight() - this.e.getHeight()) / 2.0f);
            this.e.draw(canvas);
            L3 = L3 + this.f + org.telegram.messenger.g0.L(6.0f);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate(L3 - this.w, org.telegram.messenger.g0.N(1.6f) + ((getMeasuredHeight() - this.r.getHeight()) / 2.0f));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = (((View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(30.0f)) - org.telegram.messenger.g0.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
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
            int L = size - ((int) (lineWidth + org.telegram.messenger.g0.L(8.0f)));
            TextPaint textPaint2 = this.n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.w = staticLayout3.getLineCount() > 0 ? this.r.getLineLeft(0) : 0.0f;
            this.s = this.r.getLineCount() > 0 ? this.r.getLineWidth(0) : 0.0f;
        }
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(30.0f) + getPaddingLeft() + this.f + org.telegram.messenger.g0.L(8.0f) + this.s + getPaddingRight(), View.MeasureSpec.getSize(i3)), org.telegram.messenger.g0.L(48.0f));
        } else if (View.MeasureSpec.getMode(i3) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(48.0f));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextPaint textPaint = this.n;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.x);
            this.d.setColor(w02);
            textPaint.setColor(w02);
            textPaint.setAlpha(hs.n1);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
