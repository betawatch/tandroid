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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class n4 extends FrameLayout {
    public int a;
    public final int b;
    public final int c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public final org.telegram.ui.ActionBar.k5 f;
    public int h;
    public final boolean n;

    public n4(Context context) {
        this(context, org.telegram.ui.ActionBar.k6.L6, 20, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z9) {
        TextView textView = this.d;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z9 ? 1.0f : 0.5f));
        } else {
            textView.setAlpha(z9 ? 1.0f : 0.5f);
        }
    }

    public final void b(boolean z9) {
        super.setEnabled(z9);
        this.d.animate().alpha(z9 ? 1.0f : 0.5f).start();
    }

    public final void c(CharSequence charSequence, boolean z9) {
        if (this.n) {
            int i7 = (hd.a0 ? 5 : 3) | 16;
            org.telegram.ui.Components.j6 j6Var = this.e;
            j6Var.setGravity(i7);
            j6Var.c(charSequence, z9, true);
            return;
        }
        int i10 = hd.a0 ? 5 : 3;
        TextView textView = this.d;
        textView.setGravity(i10 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.k5 getTextView2() {
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i7) {
        float f10 = i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.ActionBar.k5 k5Var = this.f;
        if (k5Var != null) {
            ((FrameLayout.LayoutParams) k5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
        }
    }

    public void setHeight(int i7) {
        this.h = i7;
        int L = org.telegram.messenger.g0.L(i7);
        TextView textView = this.d;
        int i10 = L - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f;
        if (k5Var == null) {
            return;
        }
        k5Var.l(charSequence, false);
    }

    public void setTextColor(int i7) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        org.telegram.ui.Components.j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setTextColor(i7);
        }
    }

    public void setTextSize(float f10) {
        if (!this.n) {
            this.d.setTextSize(1, f10);
        } else {
            this.e.setTextSize(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setTopMargin(int i7) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i7);
        setHeight(this.h);
    }

    public n4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, org.telegram.ui.ActionBar.k6.L6, 20, 7, false, f6Var);
    }

    public n4(Context context, int i7) {
        this(context, org.telegram.ui.ActionBar.k6.L6, i7, 7, false, null);
    }

    public n4(Context context, int i7, int i10, int i11, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i7, i10, i11, 0, z9, false, f6Var);
    }

    public n4(Context context, int i7, int i10, int i11, int i12, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 40;
        this.b = i10;
        this.c = i12;
        this.n = z10;
        if (z10) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, false, false);
            this.e = j6Var;
            j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            j6Var.setTypeface(org.telegram.messenger.g0.o());
            j6Var.setGravity((hd.a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.r6.Z(j6Var, i7, f6Var);
            j6Var.setTag(Integer.valueOf(i7));
            j6Var.getDrawable().r(true, false);
            float f10 = i10;
            addView(j6Var, c8.ha.d(-1, this.h - i11, (hd.a0 ? 5 : 3) | 48, f10, i11, f10, z9 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((hd.a0 ? 5 : 3) | 16);
            textView.setMinHeight(org.telegram.messenger.g0.L(this.h - i11));
            org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
            textView.setTag(Integer.valueOf(i7));
            float f11 = i10;
            addView(textView, c8.ha.d(-1, -1.0f, (hd.a0 ? 5 : 3) | 48, f11, i11, f11, z9 ? 0.0f : i12));
        }
        if (z9) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.f = k5Var;
            k5Var.setTextSize(13);
            k5Var.setGravity((hd.a0 ? 3 : 5) | 48);
            float f12 = i10;
            addView(k5Var, c8.ha.d(-1, -1.0f, (hd.a0 ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
