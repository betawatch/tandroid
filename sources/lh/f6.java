package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import mh.ja;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f6 extends View {
    public final mh.i5 a;
    public final g6 b;
    public float c;
    public float d;
    public Drawable e;

    public f6(Context context, int i10, g6 g6Var) {
        super(context);
        this.b = g6Var;
        mh.i5 i5Var = new mh.i5(i10, this, g6Var);
        this.a = i5Var;
        i5Var.y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z4) {
        mh.i5 i5Var = this.a;
        org.telegram.ui.Components.j5 j5Var = i5Var.e;
        a2 a2Var = i5Var.j;
        ImageReceiver imageReceiver = i5Var.d;
        i5Var.K = false;
        i5Var.N = null;
        i5Var.O = null;
        i5Var.p = false;
        i5Var.k = (TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        i5Var.l = (TL_stars.starGiftAttributePattern) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = i5Var.m;
        i5Var.m = (TL_stars.starGiftAttributeModel) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = i5Var.f;
        i5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = i5Var.l;
        if (stargiftattributepattern != null) {
            j5Var.i(stargiftattributepattern.document, false);
        } else {
            j5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = i5Var.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            ja.Z0(imageReceiver, i5Var.m.document, 110);
        }
        boolean z10 = tL_starGiftUnique.burned;
        i5Var.J = z10;
        if (z10) {
            int v02 = k6.v0(k6.q7, i5Var.c);
            Paint paint2 = a2Var.a;
            paint2.setShader(null);
            paint2.setColor(v02);
            a2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            a2Var.d(i5Var.k, true, false);
            a2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (i5Var.P) {
            imageReceiver.onAttachedToWindow();
            j5Var.a();
            i5Var.y.d.onAttachedToWindow();
        }
        i5Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            i5Var.L = (int) (i5Var.L * 1.2f);
        }
        i5Var.L -= AndroidUtilities.dp(8.0f);
        i5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        xd.c cVar = i5Var.Q;
        if (z4) {
            int round = Math.round(cVar.g ? cVar.f : cVar.e);
            int i10 = i5Var.L;
            if (round != i10) {
                cVar.a(i10);
            }
        } else {
            cVar.c(i5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public mh.i5 getLayout() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh.i5 i5Var = this.a;
        i5Var.P = true;
        if (i5Var.N != null) {
            i5Var.d.onAttachedToWindow();
            i5Var.e.a();
            i5Var.y.d.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mh.i5 i5Var = this.a;
        i5Var.P = false;
        i5Var.d.onDetachedFromWindow();
        i5Var.e.b();
        v0 v0Var = i5Var.y;
        v0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release((View) null, v0Var.q);
        v0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        g6 g6Var = this.b;
        if (g6Var != null) {
            g6Var.l(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            k6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        mh.i5 i5Var = this.a;
        this.c = (getWidth() - ((int) i5Var.Q.e)) / 2.0f;
        float dp = i5Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, i5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        i5Var.a(canvas);
        i5Var.b(canvas);
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
