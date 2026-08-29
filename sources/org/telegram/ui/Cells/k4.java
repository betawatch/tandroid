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
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class k4 extends FrameLayout {
    public int a;
    public final int b;
    public final int c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 e;
    public final org.telegram.ui.ActionBar.h5 f;
    public int h;
    public final boolean n;

    public k4(Context context) {
        this(context, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, null);
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
            int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
            org.telegram.ui.Components.o6 o6Var = this.e;
            o6Var.setGravity(i10);
            o6Var.c(charSequence, z10, true);
            return;
        }
        int i11 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.d;
        textView.setGravity(i11 | 16);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i10) {
        float f9 = i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f9);
        org.telegram.ui.ActionBar.h5 h5Var = this.f;
        if (h5Var != null) {
            ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f9);
        }
    }

    public void setHeight(int i10) {
        this.h = i10;
        int dp = AndroidUtilities.dp(i10);
        TextView textView = this.d;
        int i11 = dp - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i11) {
            textView.setMinHeight(i11);
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

    public void setTextColor(int i10) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        org.telegram.ui.Components.o6 o6Var = this.e;
        if (o6Var != null) {
            o6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f9) {
        if (!this.n) {
            this.d.setTextSize(1, f9);
        } else {
            this.e.setTextSize(AndroidUtilities.dp(f9));
        }
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i10);
        setHeight(this.h);
    }

    public k4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, c6Var);
    }

    public k4(Context context, int i10) {
        this(context, org.telegram.ui.ActionBar.g6.L6, i10, 7, false, null);
    }

    public k4(Context context, int i10, int i11, int i12, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, i12, 0, z10, false, c6Var);
    }

    public k4(Context context, int i10, int i11, int i12, int i13, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 40;
        this.b = i11;
        this.c = i13;
        this.n = z11;
        if (z11) {
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, false, false);
            this.e = o6Var;
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            o6Var.setTag(Integer.valueOf(i10));
            o6Var.getDrawable().o(true, false, false);
            float f9 = i11;
            addView(o6Var, i7.f6.d(-1, this.h - i12, (LocaleController.isRTL ? 5 : 3) | 48, f9, i12, f9, z10 ? 0.0f : i13));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            th.n(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i12));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setTag(Integer.valueOf(i10));
            float f10 = i11;
            addView(textView, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, i12, f10, z10 ? 0.0f : i13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f = h5Var;
            h5Var.setTextSize(13);
            h5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f11 = i11;
            addView(h5Var, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 21.0f, f11, i13));
        }
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
