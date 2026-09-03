package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class j6 extends FrameLayout {
    public final TextView a;
    public final RadioButton b;
    public boolean c;

    public j6(Context context) {
        this(context, null);
    }

    public final void a(boolean z4, boolean z10) {
        this.b.a(z4, z10);
    }

    public final void b(ArrayList arrayList, boolean z4) {
        super.setEnabled(z4);
        RadioButton radioButton = this.b;
        TextView textView = this.a;
        if (arrayList == null) {
            textView.setAlpha(z4 ? 1.0f : 0.5f);
            radioButton.setAlpha(z4 ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z4 ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(radioButton, (Property<RadioButton, Float>) property, z4 ? 1.0f : 0.5f));
        }
    }

    public final void c(String str, boolean z4, boolean z10) {
        this.a.setText(str);
        this.b.a(z4, false);
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setRadioIcon(Drawable drawable) {
        this.b.setIcon(drawable);
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public j6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f10 = 21;
        addView(textView, k7.c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.g7, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h7, g6Var));
        boolean z4 = LocaleController.isRTL;
        addView(radioButton, k7.c6.d(22, 22.0f, (z4 ? 3 : 5) | 48, z4 ? 22 : 0, 14.0f, z4 ? 0 : 22, 0.0f));
    }
}
