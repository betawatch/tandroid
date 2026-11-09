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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jz0 extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.u1;
        int L = org.telegram.messenger.g0.L(6.0f) + (editorAlert.v1 - editorAlert.s0);
        int L2 = (editorAlert.v1 - editorAlert.s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight();
        int i10 = editorAlert.s0;
        int i11 = L3 + i10;
        if (editorAlert.V) {
            i7 = 0;
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
            int i14 = editorAlert.s0;
            int i15 = L2 + i14;
            int i16 = org.telegram.messenger.g0.m;
            i7 = i15 < i16 ? Math.min(i16, (i16 - L2) - i14) : 0;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        RectF rectF = this.b;
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.l6.t0.setColor(-1);
            rectF.set(editorAlert.t0, editorAlert.s0 + L2, getMeasuredWidth() - editorAlert.t0, org.telegram.messenger.g0.L(24.0f) + editorAlert.s0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.t0);
        }
        int L4 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L);
        org.telegram.ui.ActionBar.l6.t0.setColor(-1973016);
        org.telegram.ui.ActionBar.l6.t0.setAlpha((int) (editorAlert.j1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.t0);
        if (i7 > 0) {
            org.telegram.ui.ActionBar.l6.t0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false));
            canvas.drawRect(editorAlert.t0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - editorAlert.t0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.l6.t0);
        }
        boolean z9 = i7 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z9) {
            int i17 = org.telegram.ui.ActionBar.l6.h5;
            int i18 = ThemeEditorView.EditorAlert.D1;
            boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i17, editorAlert.I0)) > 0.721f;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.s8, editorAlert.I0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(editorAlert.getWindow(), z10);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        kz0 kz0Var = editorAlert.j1;
        int i11 = ThemeEditorView.EditorAlert.D1;
        if (!editorAlert.V) {
            this.a = true;
            int i12 = editorAlert.t0;
            setPadding(i12, org.telegram.messenger.g0.m, i12, 0);
            this.a = false;
        }
        int L = (org.telegram.messenger.g0.L(8.0f) + (size2 - org.telegram.messenger.g0.m)) - Math.min(size, size2 - org.telegram.messenger.g0.m);
        if (kz0Var.getPaddingTop() != L) {
            this.a = true;
            kz0Var.getPaddingTop();
            kz0Var.setPadding(0, L, 0, org.telegram.messenger.g0.L(48.0f));
            if (editorAlert.i1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(kz0Var.getPaddingTop());
                editorAlert.x1 = 0;
            }
            this.a = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
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
