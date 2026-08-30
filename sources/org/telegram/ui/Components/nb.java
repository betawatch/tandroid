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
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class nb extends FrameLayout {
    public static final o1.i IN_OUT_OFFSET_Y = new hb(0);
    public static final Property<nb, Float> IN_OUT_OFFSET_Y2 = new hh.g("offsetY", 10);
    Drawable background;
    private hh.b blurVisibilityDrawable;
    protected ic bulletin;
    private final List<ib> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    fb delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.f6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public nb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = f6Var;
        setMinimumHeight(AndroidUtilities.dp(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        b();
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        setWillNotDraw(false);
        k7.d6.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (AndroidUtilities.isTablet()) {
            return true;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x >= point.y;
    }

    public static void access$000(nb nbVar, int i10, int i11) {
        boolean z4;
        boolean z10 = true;
        if (nbVar.wideScreenWidth != i10) {
            nbVar.wideScreenWidth = i10;
            z4 = true;
        } else {
            z4 = false;
        }
        if (nbVar.wideScreenGravity != i11) {
            nbVar.wideScreenGravity = i11;
        } else {
            z10 = z4;
        }
        if (a() && z10) {
            nbVar.b();
        }
    }

    public static boolean access$1400(nb nbVar, boolean z4) {
        nbVar.getClass();
        if (!a() || nbVar.wideScreenWidth == -1) {
            return false;
        }
        int i10 = nbVar.wideScreenGravity;
        if (i10 != 1) {
            if (z4) {
                if (i10 != 5) {
                    return false;
                }
            } else if (i10 == 5) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInOutOffset(float f10) {
        this.inOutOffset = f10;
        updatePosition();
        ic icVar = this.bulletin;
        if (icVar == null || !icVar.k) {
            return;
        }
        invalidate();
    }

    public void addCallback(ib ibVar) {
        this.callbacks.add(ibVar);
    }

    public final void b() {
        boolean a2 = a();
        int i10 = a2 ? this.wideScreenWidth : -1;
        if (a2) {
            r2 = (this.top ? 48 : 80) | this.wideScreenGravity;
        } else if (this.top) {
            r2 = 48;
        }
        setLayoutParams(k7.b6.e(i10, -2, r2));
    }

    public mb createTransition() {
        return new z9.d(15);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ic icVar = this.bulletin;
        if (icVar == null || !icVar.k) {
            dispatchDrawImpl(canvas, false, 255);
            return;
        }
        if (this.blurVisibilityDrawable == null) {
            this.blurVisibilityDrawable = new hh.b(new t(this, 16));
        }
        hh.b bVar = this.blurVisibilityDrawable;
        if (bVar.c == null) {
            bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
        }
        this.blurVisibilityDrawable.i = k7.n.b((int) org.telegram.ui.b.c(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
        this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.blurVisibilityDrawable.draw(canvas);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z4, int i10) {
        fb fbVar;
        Canvas canvas2 = canvas;
        if (this.bulletin == null || i10 == 0) {
            return;
        }
        this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
        if (!isTransitionRunning() || (fbVar = this.delegate) == null) {
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
            return;
        }
        float h = fbVar.h(this.bulletin.a) - getY();
        float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
        boolean z10 = !z4 && this.delegate.g(this.bulletin.a);
        canvas2.save();
        if (!z4) {
            canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
        }
        boolean z11 = z10 || i10 != 255;
        if (z11) {
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
        }
        this.background.draw(canvas2);
        super.dispatchDraw(canvas);
        if (z10) {
            if (this.clipPaint == null) {
                Paint paint = new Paint(1);
                this.clipPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                this.clipMatrix = matrix;
                this.clipGradient.setLocalMatrix(matrix);
                this.clipPaint.setShader(this.clipGradient);
            }
            canvas2.save();
            this.clipMatrix.reset();
            this.clipMatrix.postTranslate(0.0f, this.top ? h : measuredHeight - AndroidUtilities.dp(8.0f));
            this.clipGradient.setLocalMatrix(this.clipMatrix);
            if (this.top) {
                canvas2.drawRect(0.0f, h, getWidth(), h + AndroidUtilities.dp(8.0f), this.clipPaint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - AndroidUtilities.dp(8.0f), getWidth(), measuredHeight, this.clipPaint);
            }
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        canvas2.restore();
        invalidate();
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i10) {
        dispatchDrawImpl(canvas, true, i10);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int f10;
        fb fbVar;
        ic icVar;
        o1.j jVar;
        if (this.bulletin == null || !(((fbVar = this.delegate) == null || fbVar.e()) && (jVar = (icVar = this.bulletin).d) != null && jVar.f)) {
            fb fbVar2 = this.delegate;
            if (fbVar2 == null) {
                return 0.0f;
            }
            ic icVar2 = this.bulletin;
            f10 = fbVar2.f(icVar2 != null ? icVar2.a : 0);
        } else {
            f10 = icVar.o;
        }
        return f10;
    }

    public ic getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider);
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

    public void onAttach(ic icVar) {
        this.bulletin = icVar;
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).a(icVar);
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
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).b();
        }
        hh.b bVar = this.blurVisibilityDrawable;
        if (bVar == null || (bitmap = bVar.c) == null) {
            return;
        }
        bitmap.recycle();
        bVar.c = null;
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).c();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).d();
        }
    }

    public void removeCallback(ib ibVar) {
        this.callbacks.remove(ibVar);
    }

    public void setBackground(int i10) {
        setBackground(i10, 16);
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setTop(boolean z4) {
        if (this.top != z4) {
            this.top = z4;
            b();
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

    public void setBackground(int i10, int i11) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(i11), i10);
    }
}
