// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class je8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final wjb h;

    public je8(Context context, wjb wjbVar) {
        super(context);
        this.h = wjbVar;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(28, 28.0f, (k96.a0 ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 66.0f : 64.0f, 8.0f, z ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(gl.L(1.66f), 1.0f);
        boolean z2 = k96.a0;
        addView(textView2, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 66.0f : 64.0f, 31.0f, z2 ? 64.0f : 66.0f, 10.0f));
        Switch r3 = new Switch(context, wjbVar);
        this.d = r3;
        int i = bkb.L6;
        int i2 = bkb.M6;
        int i3 = bkb.c6;
        r3.d(i, i2, i3, i3);
        addView(r3, nme.d(37, 40.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r3.setFocusable(false);
    }

    public final void a(String str, String str2, mj5 mj5Var, int i, boolean z) {
        this.a.setText(str);
        wjb wjbVar = this.h;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        g37 g37Var = new g37((byte) 1);
        g37Var.b(mj5Var.a, mj5Var.b);
        g37Var.b = a;
        ImageView imageView = this.c;
        imageView.setBackground(g37Var);
        imageView.setImageResource(i);
        boolean z2 = this.e;
        Switch r0 = this.d;
        r0.b(0, z, z2);
        this.b.setText(str2);
        r0.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            wjb wjbVar = this.h;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : bkb.j0;
            if (d == null) {
                d = bkb.j0;
            }
            Paint paint = d;
            if (paint != null) {
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z) {
        this.e = z;
    }

    public void setChecked(boolean z) {
        this.d.b(0, z, true);
    }

    public void setDivider(boolean z) {
        this.f = z;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
