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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class lb extends FrameLayout {
    public static final o1.i IN_OUT_OFFSET_Y = new hb(0);
    public static final Property<lb, Float> IN_OUT_OFFSET_Y2 = new ch.g("offsetY", 10);
    Drawable background;
    private ch.b blurVisibilityDrawable;
    protected gc bulletin;
    private final List<ib> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    fb delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.b6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public lb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = b6Var;
        setMinimumHeight(AndroidUtilities.dp(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        b();
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        setWillNotDraw(false);
        g7.g6.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (AndroidUtilities.isTablet()) {
            return true;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x >= point.y;
    }

    public static void access$000(lb lbVar, int i9, int i10) {
        boolean z10;
        boolean z11 = true;
        if (lbVar.wideScreenWidth != i9) {
            lbVar.wideScreenWidth = i9;
            z10 = true;
        } else {
            z10 = false;
        }
        if (lbVar.wideScreenGravity != i10) {
            lbVar.wideScreenGravity = i10;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            lbVar.b();
        }
    }

    public static boolean access$1400(lb lbVar, boolean z10) {
        lbVar.getClass();
        if (!a() || lbVar.wideScreenWidth == -1) {
            return false;
        }
        int i9 = lbVar.wideScreenGravity;
        if (i9 != 1) {
            if (z10) {
                if (i9 != 5) {
                    return false;
                }
            } else if (i9 == 5) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInOutOffset(float f10) {
        this.inOutOffset = f10;
        updatePosition();
        gc gcVar = this.bulletin;
        if (gcVar == null || !gcVar.k) {
            return;
        }
        invalidate();
    }

    public void addCallback(ib ibVar) {
        this.callbacks.add(ibVar);
    }

    public final void b() {
        boolean a2 = a();
        int i9 = a2 ? this.wideScreenWidth : -1;
        if (a2) {
            r2 = (this.top ? 48 : 80) | this.wideScreenGravity;
        } else if (this.top) {
            r2 = 48;
        }
        setLayoutParams(g7.e6.e(i9, -2, r2));
    }

    public kb createTransition() {
        return new v9.d(18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        gc gcVar = this.bulletin;
        if (gcVar == null || !gcVar.k) {
            dispatchDrawImpl(canvas, false, 255);
            return;
        }
        if (this.blurVisibilityDrawable == null) {
            this.blurVisibilityDrawable = new ch.b(new s(this, 16));
        }
        ch.b bVar = this.blurVisibilityDrawable;
        if (bVar.c == null) {
            bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
        }
        this.blurVisibilityDrawable.i = g7.n.b((int) org.telegram.messenger.ll.v(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
        this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.blurVisibilityDrawable.draw(canvas);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i9) {
        fb fbVar;
        Canvas canvas2 = canvas;
        if (this.bulletin == null || i9 == 0) {
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
        boolean z11 = !z10 && this.delegate.g(this.bulletin.a);
        canvas2.save();
        if (!z10) {
            canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
        }
        boolean z12 = z11 || i9 != 255;
        if (z12) {
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i9, 31);
        }
        this.background.draw(canvas2);
        super.dispatchDraw(canvas);
        if (z11) {
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
        if (z12) {
            canvas2.restore();
        }
        canvas2.restore();
        invalidate();
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i9) {
        dispatchDrawImpl(canvas, true, i9);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int f10;
        fb fbVar;
        gc gcVar;
        o1.j jVar;
        if (this.bulletin == null || !(((fbVar = this.delegate) == null || fbVar.e()) && (jVar = (gcVar = this.bulletin).d) != null && jVar.f)) {
            fb fbVar2 = this.delegate;
            if (fbVar2 == null) {
                return 0.0f;
            }
            gc gcVar2 = this.bulletin;
            f10 = fbVar2.f(gcVar2 != null ? gcVar2.a : 0);
        } else {
            f10 = gcVar.o;
        }
        return f10;
    }

    public gc getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider);
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

    public void onAttach(gc gcVar) {
        this.bulletin = gcVar;
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).a(gcVar);
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
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).b();
        }
        ch.b bVar = this.blurVisibilityDrawable;
        if (bVar == null || (bitmap = bVar.c) == null) {
            return;
        }
        bitmap.recycle();
        bVar.c = null;
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).c();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).d();
        }
    }

    public void removeCallback(ib ibVar) {
        this.callbacks.remove(ibVar);
    }

    public void setBackground(int i9) {
        setBackground(i9, 16);
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setTop(boolean z10) {
        if (this.top != z10) {
            this.top = z10;
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

    public void setBackground(int i9, int i10) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(i10), i9);
    }
}
