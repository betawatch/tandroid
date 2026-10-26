package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cq0 extends View implements org.telegram.ui.ActionBar.p6 {
    public static final pw0 w;
    public ImageReceiver a;
    public j9 b;
    public org.telegram.ui.Cells.y c;
    public Paint d;
    public Paint e;
    public o1.j f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int v;

    static {
        pw0 pw0Var = new pw0(new qd0(16), new qd0(17));
        pw0Var.c = 100.0f;
        w = pw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (!z10) {
            this.n = f7;
            invalidate();
            return;
        }
        o1.j jVar = this.f;
        if (jVar != null) {
            jVar.c();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = false;
        this.r = false;
        if (!z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(ds.f);
            this.h.addUpdateListener(new e80(this, 17));
            this.h.addListener(new i10(this, 19));
            this.h.start();
            return;
        }
        float f10 = this.n * 100.0f;
        o1.j jVar2 = new o1.j(this, w);
        jVar2.b = f10;
        jVar2.c = true;
        this.f = jVar2;
        boolean z12 = f7 < this.n;
        float f11 = f7 * 100.0f;
        this.s = z12;
        this.r = !z12;
        o1.k kVar = new o1.k(f11);
        kVar.i = f11;
        kVar.b(450.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.f.b(new oh(this, z12, f10, f11));
        this.f.a(new hb(this, 4));
        this.f.h();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.n;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.r) {
            f7 = 1.0f - this.n;
        } else if (this.s) {
            f7 = this.n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.a.draw(canvas);
        int i10 = (int) (this.n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, TLObject.FLAG_30));
        this.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        j9 j9Var = this.b;
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, tLObject instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        j9Var.p(tLObject);
        this.a.setForUserOrChat(tLObject, j9Var);
    }

    public void setProgress(float f7) {
        a(true, f7 != 0.0f, f7);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.cf, false));
        this.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.bf, false));
        if (this.c != null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            if (o12 != this.v) {
                this.v = o12;
                org.telegram.ui.ActionBar.y6.E1(this.c, o12, true);
            }
            invalidate();
            return;
        }
        this.v = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = this.v;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, i10, i10);
        this.c = j02;
        j02.setCallback(this);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
