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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m01 extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.u1;
        int L = org.telegram.messenger.i0.L(6.0f) + (editorAlert.v1 - editorAlert.s0);
        int L2 = (editorAlert.v1 - editorAlert.s0) - org.telegram.messenger.i0.L(13.0f);
        int L3 = org.telegram.messenger.i0.L(30.0f) + getMeasuredHeight();
        int i11 = editorAlert.s0;
        int i12 = L3 + i11;
        if (editorAlert.V) {
            i10 = 0;
            f7 = 1.0f;
        } else {
            int i13 = org.telegram.messenger.i0.m;
            L2 += i13;
            L += i13;
            i12 -= i13;
            int i14 = i13 * 2;
            if (L2 + i11 < i14) {
                int min = Math.min(i13, (i14 - L2) - i11);
                L2 -= min;
                i12 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.m);
            } else {
                f7 = 1.0f;
            }
            int i15 = editorAlert.s0;
            int i16 = L2 + i15;
            int i17 = org.telegram.messenger.i0.m;
            i10 = i16 < i17 ? Math.min(i17, (i17 - L2) - i15) : 0;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i12);
        drawable.draw(canvas);
        RectF rectF = this.b;
        if (f7 != 1.0f) {
            org.telegram.ui.ActionBar.t6.t0.setColor(-1);
            rectF.set(editorAlert.t0, editorAlert.s0 + L2, getMeasuredWidth() - editorAlert.t0, org.telegram.messenger.i0.L(24.0f) + editorAlert.s0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
        }
        int L4 = org.telegram.messenger.i0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + L);
        org.telegram.ui.ActionBar.t6.t0.setColor(-1973016);
        org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (editorAlert.j1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
            canvas.drawRect(editorAlert.t0, org.telegram.messenger.i0.m - i10, getMeasuredWidth() - editorAlert.t0, org.telegram.messenger.i0.m, org.telegram.ui.ActionBar.t6.t0);
        }
        boolean z10 = i10 > org.telegram.messenger.i0.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            int i18 = org.telegram.ui.ActionBar.t6.h5;
            int i19 = ThemeEditorView.EditorAlert.D1;
            boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i18, editorAlert.I0)) > 0.721f;
            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, editorAlert.I0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(editorAlert.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.v1 != 0 && motionEvent.getY() < editorAlert.v1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        n01 n01Var = editorAlert.j1;
        int i12 = ThemeEditorView.EditorAlert.D1;
        if (!editorAlert.V) {
            this.a = true;
            int i13 = editorAlert.t0;
            setPadding(i13, org.telegram.messenger.i0.m, i13, 0);
            this.a = false;
        }
        int L = (org.telegram.messenger.i0.L(8.0f) + (size2 - org.telegram.messenger.i0.m)) - Math.min(size, size2 - org.telegram.messenger.i0.m);
        if (n01Var.getPaddingTop() != L) {
            this.a = true;
            n01Var.getPaddingTop();
            n01Var.setPadding(0, L, 0, org.telegram.messenger.i0.L(48.0f));
            if (editorAlert.i1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(n01Var.getPaddingTop());
                editorAlert.x1 = 0;
            }
            this.a = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
