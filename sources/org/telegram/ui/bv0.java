package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bv0 extends FrameLayout {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.a = photoViewer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        co coVar = this.a.l4;
        if (coVar != null) {
            coVar.Q7();
            UndoView undoView = coVar.y3;
            if (undoView == null || undoView.getVisibility() != 0) {
                return;
            }
            canvas.save();
            View view = (View) undoView.getParent();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            canvas.translate(undoView.getX(), undoView.getY());
            undoView.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.r && photoViewer.c2 != 1 && photoViewer.r1 && photoViewer.F2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.F2.W(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        PhotoViewer photoViewer = this.a;
        if (photoViewer.Q.y()) {
            photoViewer.Q.f(false);
        }
        if (photoViewer.H1()) {
            photoViewer.E0(true);
            return false;
        }
        if (st.q().E) {
            st.q().o();
            return false;
        }
        PhotoViewer.t1().G0(true, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r1 != 6) goto L23;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1 && actionMasked != 3) {
                    if (actionMasked != 5) {
                    }
                }
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    photoViewer.s2();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(photoViewer.x2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a.R8) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.C4.onAttachedToWindow();
        photoViewer.B4.onAttachedToWindow();
        photoViewer.D4.onAttachedToWindow();
        photoViewer.S5 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.C4.onDetachedFromWindow();
        photoViewer.B4.onDetachedFromWindow();
        photoViewer.D4.onDetachedFromWindow();
        photoViewer.S5 = false;
        photoViewer.T5 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        PhotoViewer photoViewer = this.a;
        Paint paint = photoViewer.M0;
        bi.a4 a4Var = photoViewer.s5;
        if (a4Var != null && a4Var.getVisibility() == 0) {
            View view = (View) photoViewer.s5.getParent();
            float min = Math.min(photoViewer.s5.getAlpha(), view != null ? view.getAlpha() : 1.0f);
            if (min > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (min * 255.0f), 31);
                canvas2 = canvas;
                photoViewer.s5.draw(canvas2);
                canvas2.restore();
                if (photoViewer.e) {
                    return;
                }
                paint.setAlpha(photoViewer.L0.getAlpha());
                canvas2.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + photoViewer.s2.bottom, paint);
                return;
            }
        }
        canvas2 = canvas;
        if (photoViewer.e) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.e && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.a;
        photoViewer.h0.layout(getPaddingLeft(), 0, photoViewer.h0.getMeasuredWidth() + getPaddingLeft(), photoViewer.h0.getMeasuredHeight());
        photoViewer.e0.layout(getPaddingLeft(), 0, photoViewer.e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.e0.getMeasuredHeight());
        photoViewer.j0.layout(getPaddingLeft(), photoViewer.e0.getMeasuredHeight(), photoViewer.j0.getMeasuredWidth(), photoViewer.j0.getMeasuredHeight() + photoViewer.e0.getMeasuredHeight());
        photoViewer.T5 = true;
        if (z10) {
            if (!photoViewer.U5) {
                float r22 = photoViewer.r2(true);
                photoViewer.a6 = r22;
                photoViewer.X5 = 0.0f;
                photoViewer.Y5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.N0;
            if (checkBox != null) {
                checkBox.post(new lu0(this, 1));
            }
        }
        if (photoViewer.U5) {
            photoViewer.N2();
            photoViewer.U5 = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.s2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.h0.getLayoutParams();
        photoViewer.h0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_31));
        photoViewer.e0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        photoViewer.j0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(photoViewer.k0, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        return photoViewer.e && PhotoViewer.k(photoViewer, motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        AndroidUtilities.printStackTrace("requestLayout");
    }
}
