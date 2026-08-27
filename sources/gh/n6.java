package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import hh.oa;
import hh.u7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n6 extends View {
    public final hh.k5 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public float c;
    public float d;
    public Drawable e;

    public n6(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = c6Var;
        hh.k5 k5Var = new hh.k5(i10, this, c6Var);
        this.a = k5Var;
        k5Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        hh.k5 k5Var = this.a;
        org.telegram.ui.Components.i5 i5Var = k5Var.e;
        e2 e2Var = k5Var.j;
        ImageReceiver imageReceiver = k5Var.d;
        k5Var.K = false;
        k5Var.N = null;
        k5Var.O = null;
        k5Var.p = false;
        k5Var.k = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        k5Var.l = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = k5Var.m;
        k5Var.m = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = k5Var.f;
        k5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = k5Var.l;
        if (stargiftattributepattern != null) {
            i5Var.i(stargiftattributepattern.document, false);
        } else {
            i5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = k5Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            oa.Z0(imageReceiver, k5Var.m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        k5Var.J = z11;
        if (z11) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, k5Var.c);
            Paint paint2 = e2Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            e2Var.d(k5Var.k, true, false);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (k5Var.P) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            k5Var.y.d.onAttachedToWindow();
        }
        k5Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            k5Var.L = (int) (k5Var.L * 1.2f);
        }
        k5Var.L -= AndroidUtilities.dp(8.0f);
        k5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ud.c cVar = k5Var.Q;
        if (z10) {
            int round = Math.round(cVar.g ? cVar.f : cVar.e);
            int i10 = k5Var.L;
            if (round != i10) {
                cVar.a(i10);
            }
        } else {
            cVar.c(k5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public hh.k5 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hh.k5 k5Var = this.a;
        k5Var.P = true;
        if (k5Var.N != null) {
            k5Var.d.onAttachedToWindow();
            k5Var.e.a();
            k5Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hh.k5 k5Var = this.a;
        k5Var.P = false;
        k5Var.d.onDetachedFromWindow();
        k5Var.e.b();
        y0 y0Var = k5Var.y;
        y0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, y0Var.q);
        y0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        if (c6Var != null) {
            c6Var.m(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        hh.k5 k5Var = this.a;
        this.c = (getWidth() - ((int) k5Var.Q.e)) / 2.0f;
        float dp = k5Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, k5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        k5Var.a(canvas);
        k5Var.b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = (int) this.a.Q.e;
        this.c = (size - i12) / 2.0f;
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
