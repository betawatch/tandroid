// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class h29 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public h29(Context context, boolean z) {
        super(context);
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(hl.L(20.0f));
        if (z) {
            yob.O(radioButton, aob.D5, aob.E5, null);
        } else {
            yob.O(radioButton, aob.g7, aob.h7, null);
        }
        boolean z2 = ob6.a0;
        addView(radioButton, tre.d(22, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 0 : 20, 10.0f, z2 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z) {
            yob.X(textView, aob.j5, null);
        } else {
            yob.X(textView, aob.G6, null);
        }
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        boolean z3 = ob6.a0;
        addView(textView, tre.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 23 : 61, 10.0f, z3 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z) {
            yob.X(textView2, aob.q5, null);
        } else {
            yob.X(textView2, aob.z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, hl.L(12.0f));
        boolean z4 = ob6.a0;
        addView(textView2, tre.d(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 17 : 61, 35.0f, z4 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z) {
        this.c.a(z, true);
    }

    public final void b(String str, String str2, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.setText(str2);
        this.c.a(z2, false);
        this.d = z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(hl.L(ob6.a0 ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - hl.L(ob6.a0 ? 60.0f : 0.0f), getHeight() - 1, aob.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
    }
}
