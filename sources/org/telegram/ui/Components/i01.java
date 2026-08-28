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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i01 extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final /* synthetic */ ThemeEditorView.EditorAlert d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
        int i9;
        int i10;
        int i11;
        boolean z10;
        float f10;
        int i12;
        boolean z11;
        Boolean bool;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.y;
        int i23 = editorAlert.A;
        i9 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i23 - i9);
        int i24 = editorAlert.A;
        i10 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
        int dp2 = (i24 - i10) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
        int i25 = i11 + dp3;
        z10 = ((org.telegram.ui.ActionBar.f3) editorAlert).isFullscreen;
        if (z10) {
            f10 = 1.0f;
        } else {
            int i26 = AndroidUtilities.statusBarHeight;
            dp2 += i26;
            dp += i26;
            i25 -= i26;
            i19 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
            int i27 = i19 + dp2;
            int i28 = AndroidUtilities.statusBarHeight;
            int i29 = i28 * 2;
            if (i27 < i29) {
                i22 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
                int min = Math.min(i28, (i29 - dp2) - i22);
                dp2 -= min;
                i25 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f10 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
            int i30 = i20 + dp2;
            int i31 = AndroidUtilities.statusBarHeight;
            if (i30 < i31) {
                i21 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
                i12 = Math.min(i31, (i31 - dp2) - i21);
                drawable.setBounds(0, dp2, getMeasuredWidth(), i25);
                drawable.draw(canvas);
                RectF rectF = this.b;
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(-1);
                    i15 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
                    float f11 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingTop;
                    rectF.set(i15, i16 + dp2, f11, AndroidUtilities.dp(24.0f) + i18 + dp2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                }
                int dp4 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp4) / 2, dp, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp);
                org.telegram.ui.ActionBar.f6.t0.setColor(-1973016);
                org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (editorAlert.c.getAlpha() * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
                if (i12 > 0) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                    i13 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
                    float f12 = AndroidUtilities.statusBarHeight - i12;
                    int measuredWidth2 = getMeasuredWidth();
                    i14 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
                    canvas.drawRect(i13, f12, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
                }
                z11 = i12 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.c;
                if (bool == null && bool.booleanValue() == z11) {
                    return;
                }
                boolean z12 = AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f;
                boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
                this.c = Boolean.valueOf(z11);
                if (!z11) {
                    z12 = z13;
                }
                AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z12);
            }
        }
        i12 = 0;
        drawable.setBounds(0, dp2, getMeasuredWidth(), i25);
        drawable.draw(canvas);
        RectF rectF2 = this.b;
        if (f10 != 1.0f) {
        }
        int dp42 = AndroidUtilities.dp(36.0f);
        rectF2.set((getMeasuredWidth() - dp42) / 2, dp, (getMeasuredWidth() + dp42) / 2, AndroidUtilities.dp(4.0f) + dp);
        org.telegram.ui.ActionBar.f6.t0.setColor(-1973016);
        org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (editorAlert.c.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
        if (i12 > 0) {
        }
        if (i12 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f) {
        }
        this.c = Boolean.valueOf(z11);
        if (!z11) {
        }
        AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z12);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.A != 0 && motionEvent.getY() < editorAlert.A) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ThemeEditorView.EditorAlert.s(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        j01 j01Var = editorAlert.c;
        z10 = ((org.telegram.ui.ActionBar.f3) editorAlert).isFullscreen;
        if (!z10) {
            this.a = true;
            i11 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            int i13 = AndroidUtilities.statusBarHeight;
            i12 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            setPadding(i11, i13, i12, 0);
            this.a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (j01Var.getPaddingTop() != dp) {
            this.a = true;
            j01Var.getPaddingTop();
            j01Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(j01Var.getPaddingTop());
                editorAlert.C = 0;
            }
            this.a = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
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
