package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f11 extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z4;
        float f10;
        int i13;
        boolean z10;
        Boolean bool;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.y;
        int i24 = editorAlert.B;
        i10 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = editorAlert.B;
        i11 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
        int i26 = i12 + dp3;
        z4 = ((org.telegram.ui.ActionBar.g3) editorAlert).isFullscreen;
        if (z4) {
            f10 = 1.0f;
        } else {
            int i27 = AndroidUtilities.statusBarHeight;
            dp2 += i27;
            dp += i27;
            i26 -= i27;
            i20 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
            int i28 = i20 + dp2;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i23 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
                int min = Math.min(i29, (i30 - dp2) - i23);
                dp2 -= min;
                i26 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f10 = 1.0f;
            }
            i21 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
            int i31 = i21 + dp2;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i22 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
                i13 = Math.min(i32, (i32 - dp2) - i22);
                drawable.setBounds(0, dp2, getMeasuredWidth(), i26);
                drawable.draw(canvas);
                RectF rectF = this.b;
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(-1);
                    i16 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
                    i17 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i18 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
                    float f11 = measuredWidth - i18;
                    i19 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingTop;
                    rectF.set(i16, i17 + dp2, f11, AndroidUtilities.dp(24.0f) + i19 + dp2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
                }
                int dp4 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp4) / 2, dp, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp);
                org.telegram.ui.ActionBar.j6.t0.setColor(-1973016);
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (editorAlert.c.getAlpha() * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                if (i13 > 0) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    i14 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
                    float f12 = AndroidUtilities.statusBarHeight - i13;
                    int measuredWidth2 = getMeasuredWidth();
                    i15 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
                    canvas.drawRect(i14, f12, measuredWidth2 - i15, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
                }
                z10 = i13 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.c;
                if (bool == null && bool.booleanValue() == z10) {
                    return;
                }
                boolean z11 = AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
                this.c = Boolean.valueOf(z10);
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z11);
            }
        }
        i13 = 0;
        drawable.setBounds(0, dp2, getMeasuredWidth(), i26);
        drawable.draw(canvas);
        RectF rectF2 = this.b;
        if (f10 != 1.0f) {
        }
        int dp42 = AndroidUtilities.dp(36.0f);
        rectF2.set((getMeasuredWidth() - dp42) / 2, dp, (getMeasuredWidth() + dp42) / 2, AndroidUtilities.dp(4.0f) + dp);
        org.telegram.ui.ActionBar.j6.t0.setColor(-1973016);
        org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (editorAlert.c.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        if (i13 > 0) {
        }
        if (i13 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f) {
        }
        this.c = Boolean.valueOf(z10);
        if (!z10) {
        }
        AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z11);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.B != 0 && motionEvent.getY() < editorAlert.B) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.s(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        g11 g11Var = editorAlert.c;
        z4 = ((org.telegram.ui.ActionBar.g3) editorAlert).isFullscreen;
        if (!z4) {
            this.a = true;
            i12 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
            int i14 = AndroidUtilities.statusBarHeight;
            i13 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
            setPadding(i12, i14, i13, 0);
            this.a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (g11Var.getPaddingTop() != dp) {
            this.a = true;
            g11Var.getPaddingTop();
            g11Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(g11Var.getPaddingTop());
                editorAlert.D = 0;
            }
            this.a = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
