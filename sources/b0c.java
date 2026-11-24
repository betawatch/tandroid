// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b0c extends FrameLayout implements tjb {
    public final wjb a;
    public boolean b;
    public final yzb c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final zzb f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final lm s;

    public b0c(Context context, wjb wjbVar) {
        super(context);
        this.r = -1;
        this.s = new lm(this, 0L, 320L, s33.h);
        this.a = wjbVar;
        setClipToPadding(false);
        setPadding(gl.L(20.0f), 0, gl.L(20.0f), gl.L(16.0f));
        yzb yzbVar = new yzb(this, context);
        this.c = yzbVar;
        kk7.i(yzbVar);
        yzbVar.setTextSize(1, 16.0f);
        yzbVar.setMaxLines(1);
        yzbVar.setSingleLine();
        yzbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(yzbVar, nme.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        tb4.u(14.0f, 2131751449, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f) * 2.0f);
        textView.setPadding(gl.L(8.0f), f < 0.0f ? round : 0, gl.L(8.0f), f <= 0.0f ? 0 : round);
        ote.a(textView);
        Paint.FontMetrics fontMetrics2 = yzbVar.getPaint().getFontMetrics();
        yzbVar.getPaint().getTextBounds("x", 0, 1, rect);
        addView(textView, nme.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-(yzbVar.getIncludeFontPadding() ? fontMetrics2.top : fontMetrics2.ascent))) - gl.L(9.0f)) / gl.p), 0.0f, 0.0f));
        zzb zzbVar = new zzb(context);
        this.f = zzbVar;
        kk7.i(zzbVar);
        zzbVar.setTextSize(1, 16.0f);
        zzbVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c = nme.c(-2.0f, -1);
        this.e = c;
        addView(zzbVar, c);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(k96.M0(2131751755, null));
        ote.a(imageView);
        addView(imageView, nme.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.kg));
        hashSet.add(Integer.valueOf(bkb.lg));
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.s.e(false, this.r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint U0 = bkb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            Paint paint = U0;
            if (k96.a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i2);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - gl.L(42.0f)) {
                layoutParams.bottomMargin = gl.L(26.0f);
                super.onMeasure(makeMeasureSpec, i2);
            }
        }
        if (getMeasuredHeight() > this.r && !this.h) {
            this.r = getMeasuredHeight();
            invalidate();
        } else {
            int measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            this.s.e(true, measuredHeight);
        }
    }

    public void setHandlesColor(int i) {
        zzb zzbVar = this.f;
        if (Build.VERSION.SDK_INT < 29 || nye.b()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = zzbVar.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i, mode);
            zzbVar.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = zzbVar.getTextSelectHandle();
            textSelectHandle.setColorFilter(i, mode);
            zzbVar.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = zzbVar.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i, mode);
            zzbVar.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.c.setTextColor(bkb.v0(i, wjbVar));
        int i2 = bkb.K6;
        int v0 = bkb.v0(i2, wjbVar);
        TextView textView = this.d;
        textView.setTextColor(v0);
        textView.setBackground(bkb.b0(gl.L(9.0f), bkb.p1(0.1f, bkb.v0(i2, wjbVar))));
        int v02 = bkb.v0(i, wjbVar);
        zzb zzbVar = this.f;
        zzbVar.setTextColor(v02);
        zzbVar.setLinkTextColor(bkb.v0(i2, wjbVar));
        zzbVar.setHighlightColor(bkb.v0(bkb.kg, wjbVar));
        setHandlesColor(bkb.v0(bkb.lg, wjbVar));
        int i3 = bkb.Ei;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(bkb.v0(i3, wjbVar), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(bkb.f0(bkb.p1(0.1f, bkb.v0(i3, wjbVar)), 1, -1));
    }
}
