package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class fb extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final r1.e IN_OUT_OFFSET_Y = new bb(0);
    public static final Property<fb, Float> IN_OUT_OFFSET_Y2 = new org.telegram.ui.Cells.o8("offsetY", 8);
    Drawable background;
    private wh.b blurVisibilityDrawable;
    protected bc bulletin;
    private final List<cb> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    za delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.h6 resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public fb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = h6Var;
        setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        this.themeBackground = this.background;
        b();
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        setWillNotDraw(false);
        c8.ka.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (org.telegram.messenger.g0.Q1()) {
            return true;
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x >= point.y;
    }

    public static void access$000(fb fbVar, int i7, int i10) {
        boolean z9;
        boolean z10 = true;
        if (fbVar.wideScreenWidth != i7) {
            fbVar.wideScreenWidth = i7;
            z9 = true;
        } else {
            z9 = false;
        }
        if (fbVar.wideScreenGravity != i10) {
            fbVar.wideScreenGravity = i10;
        } else {
            z10 = z9;
        }
        if (a() && z10) {
            fbVar.b();
        }
    }

    public static boolean access$1400(fb fbVar, boolean z9) {
        fbVar.getClass();
        if (!a() || fbVar.wideScreenWidth == -1) {
            return false;
        }
        int i7 = fbVar.wideScreenGravity;
        if (i7 != 1) {
            if (z9) {
                if (i7 != 5) {
                    return false;
                }
            } else if (i7 == 5) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInOutOffset(float f10) {
        this.inOutOffset = f10;
        updatePosition();
        bc bcVar = this.bulletin;
        if (bcVar == null || !bcVar.k) {
            return;
        }
        invalidate();
    }

    public void addCallback(cb cbVar) {
        this.callbacks.add(cbVar);
    }

    public final void b() {
        boolean a10 = a();
        int i7 = a10 ? this.wideScreenWidth : -1;
        if (a10) {
            r2 = (this.top ? 48 : 80) | this.wideScreenGravity;
        } else if (this.top) {
            r2 = 48;
        }
        setLayoutParams(c8.ha.e(i7, -2, r2));
    }

    public eb createTransition() {
        return new sa.d(17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        bc bcVar = this.bulletin;
        if (bcVar == null || !bcVar.k) {
            dispatchDrawImpl(canvas, false, org.telegram.messenger.qs.e4);
            return;
        }
        if (this.blurVisibilityDrawable == null) {
            this.blurVisibilityDrawable = new wh.b(new t(this, 16));
        }
        wh.b bVar = this.blurVisibilityDrawable;
        if (bVar.c == null) {
            bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, org.telegram.messenger.g0.L(10.0f));
        }
        this.blurVisibilityDrawable.i = c8.j9.b((int) org.telegram.messenger.camera.q.x(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, org.telegram.messenger.qs.e4);
        this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.blurVisibilityDrawable.draw(canvas);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z9, int i7) {
        za zaVar;
        Canvas canvas2 = canvas;
        if (this.bulletin == null || i7 == 0) {
            return;
        }
        this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
        if (!isTransitionRunning() || (zaVar = this.delegate) == null) {
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
            return;
        }
        float h = zaVar.h(this.bulletin.a) - getY();
        float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
        boolean z10 = !z9 && this.delegate.g(this.bulletin.a);
        canvas2.save();
        if (!z9) {
            canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
        }
        boolean z11 = z10 || i7 != 255;
        if (z11) {
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i7, 31);
        }
        this.background.draw(canvas2);
        super.dispatchDraw(canvas);
        if (z10) {
            if (this.clipPaint == null) {
                Paint paint = new Paint(1);
                this.clipPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                this.clipMatrix = matrix;
                this.clipGradient.setLocalMatrix(matrix);
                this.clipPaint.setShader(this.clipGradient);
            }
            canvas2.save();
            this.clipMatrix.reset();
            this.clipMatrix.postTranslate(0.0f, this.top ? h : measuredHeight - org.telegram.messenger.g0.L(8.0f));
            this.clipGradient.setLocalMatrix(this.clipMatrix);
            if (this.top) {
                canvas2.drawRect(0.0f, h, getWidth(), h + org.telegram.messenger.g0.L(8.0f), this.clipPaint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - org.telegram.messenger.g0.L(8.0f), getWidth(), measuredHeight, this.clipPaint);
            }
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        canvas2.restore();
        invalidate();
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i7) {
        dispatchDrawImpl(canvas, true, i7);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int f10;
        za zaVar;
        bc bcVar;
        r1.g gVar;
        if (this.bulletin == null || !(((zaVar = this.delegate) == null || zaVar.e()) && (gVar = (bcVar = this.bulletin).d) != null && gVar.f)) {
            za zaVar2 = this.delegate;
            if (zaVar2 == null) {
                return 0.0f;
            }
            bc bcVar2 = this.bulletin;
            f10 = zaVar2.f(bcVar2 != null ? bcVar2.a : 0);
        } else {
            f10 = bcVar.o;
        }
        return f10;
    }

    public bc getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.resourcesProvider);
    }

    public float getTopOffset() {
        if (this.delegate == null) {
            return 0.0f;
        }
        return r0.h(this.bulletin != null ? r1.a : 0);
    }

    public boolean isAttachedToBulletin() {
        return this.bulletin != null;
    }

    public boolean isTransitionRunning() {
        return this.transitionRunningEnter || this.transitionRunningExit;
    }

    public void onAttach(bc bcVar) {
        this.bulletin = bcVar;
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).c(bcVar);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onDetach() {
        Bitmap bitmap;
        this.bulletin = null;
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).d();
        }
        wh.b bVar = this.blurVisibilityDrawable;
        if (bVar == null || (bitmap = bVar.c) == null) {
            return;
        }
        bitmap.recycle();
        bVar.c = null;
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).b();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).a();
        }
    }

    public void removeCallback(cb cbVar) {
        this.callbacks.remove(cbVar);
    }

    public void setBackground(int i7) {
        setBackground(i7, 16);
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setTop(boolean z9) {
        if (this.top != z9) {
            this.top = z9;
            b();
        }
    }

    public void updateColors() {
        try {
            Drawable drawable = this.background;
            if (drawable != null && drawable == this.themeBackground && (drawable instanceof ShapeDrawable)) {
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void updatePosition() {
        float f10 = 0.0f;
        if (this.delegate != null) {
            if (this.top) {
                f10 = 0.0f - r0.h(this.bulletin != null ? r2.a : 0);
            } else {
                f10 = 0.0f + getBottomOffset();
            }
        }
        setTranslationY((this.inOutOffset * (this.top ? -1 : 1)) + (-f10));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.background == drawable || super.verifyDrawable(drawable);
    }

    public void setBackground(int i7, int i10) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(i10), i7);
    }

    public /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
