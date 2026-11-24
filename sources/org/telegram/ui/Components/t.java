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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.x1;
        int L = gm.L(6.0f) + (editorAlert.y1 - editorAlert.t0);
        int L2 = (editorAlert.y1 - editorAlert.t0) - gm.L(13.0f);
        int L3 = gm.L(30.0f) + getMeasuredHeight();
        int i2 = editorAlert.t0;
        int i3 = L3 + i2;
        if (editorAlert.W) {
            i = 0;
            f = 1.0f;
        } else {
            int i4 = gm.m;
            L2 += i4;
            L += i4;
            i3 -= i4;
            int i5 = i4 << 1;
            if (L2 + i2 < i5) {
                int min = Math.min(i4, (i5 - L2) - i2);
                L2 -= min;
                i3 += min;
                f = 1.0f - Math.min(1.0f, (min << 1) / gm.m);
            } else {
                f = 1.0f;
            }
            int i6 = editorAlert.t0;
            int i7 = L2 + i6;
            int i8 = gm.m;
            i = i7 < i8 ? Math.min(i8, (i8 - L2) - i6) : 0;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i3);
        drawable.draw(canvas);
        RectF rectF = this.b;
        if (f != 1.0f) {
            cmb.s0.setColor(-1);
            rectF.set(editorAlert.u0, editorAlert.t0 + L2, getMeasuredWidth() - editorAlert.u0, gm.L(24.0f) + editorAlert.t0 + L2);
            canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
        }
        int L4 = gm.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, gm.L(4.0f) + L);
        cmb.s0.setColor(-1973016);
        cmb.s0.setAlpha((int) (editorAlert.m1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        if (i > 0) {
            cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
            canvas.drawRect(editorAlert.u0, gm.m - i, getMeasuredWidth() - editorAlert.u0, gm.m, cmb.s0);
        }
        boolean z = i > gm.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            int i9 = cmb.g5;
            int i10 = ThemeEditorView.EditorAlert.G1;
            boolean z2 = gm.B(cmb.v0(i9, editorAlert.J0)) > 0.721f;
            boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, editorAlert.J0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(editorAlert.getWindow(), z2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.y1 != 0 && motionEvent.getY() < editorAlert.y1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = ThemeEditorView.EditorAlert.G1;
        this.d.G0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        u uVar = editorAlert.m1;
        int i3 = ThemeEditorView.EditorAlert.G1;
        if (!editorAlert.W) {
            this.a = true;
            int i4 = editorAlert.u0;
            setPadding(i4, gm.m, i4, 0);
            this.a = false;
        }
        int L = (gm.L(8.0f) + (size2 - gm.m)) - Math.min(size, size2 - gm.m);
        if (uVar.getPaddingTop() != L) {
            this.a = true;
            uVar.getPaddingTop();
            uVar.setPadding(0, L, 0, gm.L(48.0f));
            if (editorAlert.l1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(uVar.getPaddingTop());
                editorAlert.A1 = 0;
            }
            this.a = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
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
