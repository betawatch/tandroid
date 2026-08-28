package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import gh.oa;
import gh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v6 extends View {
    public final gh.m5 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public float c;
    public float d;
    public Drawable e;

    public v6(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = b6Var;
        gh.m5 m5Var = new gh.m5(i9, this, b6Var);
        this.a = m5Var;
        m5Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        gh.m5 m5Var = this.a;
        org.telegram.ui.Components.i5 i5Var = m5Var.e;
        i2 i2Var = m5Var.j;
        ImageReceiver imageReceiver = m5Var.d;
        m5Var.K = false;
        m5Var.N = null;
        m5Var.O = null;
        m5Var.p = false;
        m5Var.k = (TL_stars.starGiftAttributeBackdrop) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m5Var.l = (TL_stars.starGiftAttributePattern) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = m5Var.m;
        m5Var.m = (TL_stars.starGiftAttributeModel) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = m5Var.f;
        m5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = m5Var.l;
        if (stargiftattributepattern != null) {
            i5Var.i(stargiftattributepattern.document, false);
        } else {
            i5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = m5Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            oa.Z0(imageReceiver, m5Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        m5Var.J = z11;
        if (z11) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, m5Var.c);
            Paint paint2 = i2Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            i2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            i2Var.d(m5Var.k, true, false);
            i2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (m5Var.P) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            m5Var.y.d.onAttachedToWindow();
        }
        m5Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            m5Var.L = (int) (m5Var.L * 1.2f);
        }
        m5Var.L -= AndroidUtilities.dp(8.0f);
        m5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        td.c cVar = m5Var.Q;
        if (z10) {
            int round = Math.round(cVar.g ? cVar.f : cVar.e);
            int i9 = m5Var.L;
            if (round != i9) {
                cVar.a(i9);
            }
        } else {
            cVar.c(m5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public gh.m5 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gh.m5 m5Var = this.a;
        m5Var.P = true;
        if (m5Var.N != null) {
            m5Var.d.onAttachedToWindow();
            m5Var.e.a();
            m5Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gh.m5 m5Var = this.a;
        m5Var.P = false;
        m5Var.d.onDetachedFromWindow();
        m5Var.e.b();
        a1 a1Var = m5Var.y;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.q);
        a1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        if (b6Var != null) {
            b6Var.o(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        gh.m5 m5Var = this.a;
        this.c = (getWidth() - ((int) m5Var.Q.e)) / 2.0f;
        float dp = m5Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, m5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        m5Var.a(canvas);
        m5Var.b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int i11 = (int) this.a.Q.e;
        this.c = (size - i11) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + r4.M);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.e(this.c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a.y;
    }
}
