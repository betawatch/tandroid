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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.t5 a;
    public final s3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public boolean f;

    public t3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 16, f6Var);
    }

    public static void a(ArrayList arrayList, rl0 rl0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{t3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{t3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 16, new Class[]{t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        s3 s3Var = this.b;
        s3Var.c(charSequence, true, true);
        s3Var.setOnClickListener(onClickListener);
        s3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        s3 s3Var = this.b;
        s3Var.c(charSequence2, false, true);
        s3Var.setOnClickListener(onClickListener);
        s3Var.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        boolean z4 = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        setBackgroundColor(z4 ? 0 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
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

    public void setNoBackground(boolean z4) {
        this.f = z4;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        s3 s3Var = this.b;
        s3Var.c(charSequence, true, true);
        s3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f10 = i10;
        int dp = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        s3 s3Var = this.b;
        s3Var.setVisibility(8);
        s3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.a.setTextColor(v02);
        this.b.setTextColor(v02);
    }

    public t3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 32;
        this.d = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(getContext());
        this.a = t5Var;
        boolean z4 = true;
        t5Var.setTextSize(1, 14.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f7;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f10 = i10;
        addView(t5Var, k7.b6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        s3 s3Var = new s3(getContext(), z4, z4, z4, 0);
        this.b = s3Var;
        s3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        s3Var.b(0.9f, 420L, mr.h);
        s3Var.setTextSize(AndroidUtilities.dp(14.0f));
        s3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        s3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.c = d;
        addView(s3Var, d);
        WeakHashMap weakHashMap = r0.j0.a;
        new r0.x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
