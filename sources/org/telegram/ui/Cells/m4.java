package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class m4 extends FrameLayout {
    public int a;
    public final int b;
    public final int c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public final org.telegram.ui.ActionBar.h5 f;
    public int h;
    public final boolean n;

    public m4(Context context) {
        this(context, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        TextView textView = this.d;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b(boolean z10) {
        super.setEnabled(z10);
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public final void c(CharSequence charSequence, boolean z10) {
        if (this.n) {
            int i9 = (LocaleController.isRTL ? 5 : 3) | 16;
            org.telegram.ui.Components.j6 j6Var = this.e;
            j6Var.setGravity(i9);
            j6Var.c(charSequence, z10, true);
            return;
        }
        int i10 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.d;
        textView.setGravity(i10 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().d();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
            }
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i9) {
        float f10 = i9;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        org.telegram.ui.ActionBar.h5 h5Var = this.f;
        if (h5Var != null) {
            ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        }
    }

    public void setHeight(int i9) {
        this.h = i9;
        int dp = AndroidUtilities.dp(i9);
        TextView textView = this.d;
        int i10 = dp - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i10) {
            textView.setMinHeight(i10);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f;
        if (h5Var == null) {
            return;
        }
        h5Var.l(charSequence, false);
    }

    public void setTextColor(int i9) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i9);
        }
        org.telegram.ui.Components.j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setTextColor(i9);
        }
    }

    public void setTextSize(float f10) {
        if (!this.n) {
            this.d.setTextSize(1, f10);
        } else {
            this.e.setTextSize(AndroidUtilities.dp(f10));
        }
    }

    public void setTopMargin(int i9) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i9);
        setHeight(this.h);
    }

    public m4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, b6Var);
    }

    public m4(Context context, int i9) {
        this(context, org.telegram.ui.ActionBar.f6.L6, i9, 7, false, null);
    }

    public m4(Context context, int i9, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, i9, i10, i11, 0, z10, false, b6Var);
    }

    public m4(Context context, int i9, int i10, int i11, int i12, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = 40;
        this.b = i10;
        this.c = i12;
        this.n = z11;
        if (z11) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, false, false);
            this.e = j6Var;
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            j6Var.setTag(Integer.valueOf(i9));
            j6Var.getDrawable().o(true, false, false);
            float f10 = i10;
            addView(j6Var, g7.e6.d(-1, this.h - i11, (LocaleController.isRTL ? 5 : 3) | 48, f10, i11, f10, z10 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            j3.r0.u(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i11));
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            textView.setTag(Integer.valueOf(i9));
            float f11 = i10;
            addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f11, i11, f11, z10 ? 0.0f : i12));
        }
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f = h5Var;
            h5Var.setTextSize(13);
            h5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f12 = i10;
            addView(h5Var, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
