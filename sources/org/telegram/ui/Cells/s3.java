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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s3 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.Components.x5 a;
    public final r3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.c6 d;
    public int e;
    public boolean f;

    public s3(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 16, c6Var);
    }

    public static void a(ArrayList arrayList, jl0 jl0Var) {
        int i10 = org.telegram.ui.ActionBar.g6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{s3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{s3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 16, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        r3 r3Var = this.b;
        r3Var.c(charSequence, true, true);
        r3Var.setOnClickListener(onClickListener);
        r3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        r3 r3Var = this.b;
        r3Var.c(charSequence2, false, true);
        r3Var.setOnClickListener(onClickListener);
        r3Var.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.e7, c6Var));
        int i10 = org.telegram.ui.ActionBar.g6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
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
        r3 r3Var = this.b;
        r3Var.c(charSequence, true, true);
        r3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f9 = i10;
        int dp = AndroidUtilities.dp(f9);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f9);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        r3 r3Var = this.b;
        r3Var.setVisibility(8);
        r3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.d);
        this.a.setTextColor(v02);
        this.b.setTextColor(v02);
    }

    public s3(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 32;
        this.d = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.e7, c6Var));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(getContext());
        this.a = x5Var;
        boolean z10 = true;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.f7;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        x5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f9 = i10;
        addView(x5Var, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, 0.0f, f9, 0.0f));
        r3 r3Var = new r3(getContext(), z10, z10, z10, 0);
        this.b = r3Var;
        r3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        r3Var.b(0.9f, 420L, jr.h);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        r3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f9, 0.0f, f9, 0.0f);
        this.c = d;
        addView(r3Var, d);
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
