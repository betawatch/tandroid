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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.y5 a;
    public final u3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int e;
    public boolean f;

    public v3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, 16, e6Var);
    }

    public static void a(ArrayList arrayList, wl0 wl0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(wl0Var, 0, new Class[]{v3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(wl0Var, 0, new Class[]{v3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(wl0Var, 16, new Class[]{v3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, e6Var));
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i10) {
        this.e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f = z10;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        u3 u3Var = this.b;
        u3Var.c(charSequence, true, true);
        u3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        u3 u3Var = this.b;
        u3Var.setVisibility(8);
        u3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.a.setTextColor(v02);
        this.b.setTextColor(v02);
    }

    public v3(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 32;
        this.d = e6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, e6Var));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(getContext());
        this.a = y5Var;
        boolean z10 = true;
        y5Var.setTextSize(1, 14.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f7;
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        y5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(y5Var, w7.y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        u3 u3Var = new u3(getContext(), z10, z10, z10, 0);
        this.b = u3Var;
        u3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        u3Var.b(0.9f, 420L, qr.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.c = d;
        addView(u3Var, d);
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
