package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u5 extends FrameLayout {
    public final TextView a;
    public final LinearLayout b;
    public View.OnClickListener c;
    public int d;
    public final int[] e;

    public u5(Context context) {
        super(context);
        this.e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i9 = 0; i9 < this.e.length; i9++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setTag(Integer.valueOf(i9));
            this.b.addView(radioButton, g7.e6.l(1.0f / this.e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.b, g7.e6.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i9, String str) {
        this.d = i9;
        this.a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z10) {
        LinearLayout linearLayout = this.b;
        int childCount = linearLayout.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = linearLayout.getChildAt(i9);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.e;
                radioButton.a(this.d == iArr[intValue], z10);
                radioButton.b(intValue == 0 ? -1 : iArr[intValue], intValue != 0 ? iArr[intValue] : -1);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }
}
