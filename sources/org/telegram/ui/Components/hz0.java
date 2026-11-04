package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hz0 extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.v1;
        int L = org.telegram.messenger.g0.L(6.0f) + (editorAlert.w1 - editorAlert.t0);
        int L2 = (editorAlert.w1 - editorAlert.t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight();
        int i10 = editorAlert.t0;
        int i11 = L3 + i10;
        if (editorAlert.W) {
            i3 = 0;
            f10 = 1.0f;
        } else {
            int i12 = org.telegram.messenger.g0.m;
            L2 += i12;
            L += i12;
            i11 -= i12;
            int i13 = i12 * 2;
            if (L2 + i10 < i13) {
                int min = Math.min(i12, (i13 - L2) - i10);
                L2 -= min;
                i11 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.m);
            } else {
                f10 = 1.0f;
            }
            int i14 = editorAlert.t0;
            int i15 = L2 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i3 = i15 < i16 ? Math.min(i16, (i16 - L2) - i14) : 0;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.k6.t0.setColor(-1);
            rectF.set(editorAlert.u0, editorAlert.t0 + L2, getMeasuredWidth() - editorAlert.u0, org.telegram.messenger.g0.L(24.0f) + editorAlert.t0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
        }
        int L4 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L);
        org.telegram.ui.ActionBar.k6.t0.setColor(-1973016);
        org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (editorAlert.k1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
        if (i3 > 0) {
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
            canvas.drawRect(editorAlert.u0, org.telegram.messenger.g0.m - i3, getMeasuredWidth() - editorAlert.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.k6.t0);
        }
        boolean z10 = i3 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            int i17 = org.telegram.ui.ActionBar.k6.h5;
            int i18 = ThemeEditorView.EditorAlert.E1;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i17, editorAlert.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, editorAlert.J0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(editorAlert.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.w1 != 0 && motionEvent.getY() < editorAlert.w1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        iz0 iz0Var = editorAlert.k1;
        int i11 = ThemeEditorView.EditorAlert.E1;
        if (!editorAlert.W) {
            this.a = true;
            int i12 = editorAlert.u0;
            setPadding(i12, org.telegram.messenger.g0.m, i12, 0);
            this.a = false;
        }
        int L = (org.telegram.messenger.g0.L(8.0f) + (size2 - org.telegram.messenger.g0.m)) - Math.min(size, size2 - org.telegram.messenger.g0.m);
        if (iz0Var.getPaddingTop() != L) {
            this.a = true;
            iz0Var.getPaddingTop();
            iz0Var.setPadding(0, L, 0, org.telegram.messenger.g0.L(48.0f));
            if (editorAlert.j1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(iz0Var.getPaddingTop());
                editorAlert.y1 = 0;
            }
            this.a = false;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
