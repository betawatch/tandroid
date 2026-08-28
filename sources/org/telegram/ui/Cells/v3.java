package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.Components.s5 a;
    public final u3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.b6 d;
    public int e;
    public boolean f;

    public v3(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 16, b6Var);
    }

    public static void a(ArrayList arrayList, wk0 wk0Var) {
        int i9 = org.telegram.ui.ActionBar.f6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{v3.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{v3.class}, new String[]{"rightTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 16, new Class[]{v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        u3 u3Var = this.b;
        u3Var.c(charSequence, true, true);
        u3Var.setOnClickListener(onClickListener);
        u3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        u3 u3Var = this.b;
        u3Var.c(charSequence2, false, true);
        u3Var.setOnClickListener(onClickListener);
        u3Var.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.e7, b6Var));
        int i9 = org.telegram.ui.ActionBar.f6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i9) {
        this.e = i9;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f = z10;
        d();
    }

    public void setRightText(CharSequence charSequence) {
        u3 u3Var = this.b;
        u3Var.c(charSequence, true, true);
        u3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i9) {
        float f10 = i9;
        int dp = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        u3 u3Var = this.b;
        u3Var.setVisibility(8);
        u3Var.setOnClickListener(null);
    }

    public void setTextColor(int i9) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.d);
        this.a.setTextColor(v02);
        this.b.setTextColor(v02);
    }

    public v3(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.e = 32;
        this.d = b6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.e7, b6Var));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(getContext());
        this.a = s5Var;
        boolean z10 = true;
        s5Var.setTextSize(1, 14.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.f7;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        s5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f10 = i9;
        addView(s5Var, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        u3 u3Var = new u3(getContext(), z10, z10, z10, 0);
        this.b = u3Var;
        u3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        u3Var.b(0.9f, 420L, gr.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.c = d;
        addView(u3Var, d);
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
