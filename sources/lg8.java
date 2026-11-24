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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lg8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final ylb h;

    public lg8(Context context, ylb ylbVar) {
        super(context);
        this.h = ylbVar;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(28, 28.0f, (jb6.a0 ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, ylbVar);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 66.0f : 64.0f, 8.0f, z ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(gm.L(1.66f), 1.0f);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 66.0f : 64.0f, 31.0f, z2 ? 64.0f : 66.0f, 10.0f));
        Switch r3 = new Switch(context, ylbVar);
        this.d = r3;
        int i = cmb.L6;
        int i2 = cmb.M6;
        int i3 = cmb.c6;
        r3.d(i, i2, i3, i3);
        addView(r3, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r3.setFocusable(false);
    }

    public final void a(String str, String str2, ll5 ll5Var, int i, boolean z) {
        this.a.setText(str);
        ylb ylbVar = this.h;
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        g57 g57Var = new g57((byte) 1);
        g57Var.b(ll5Var.a, ll5Var.b);
        g57Var.b = a;
        ImageView imageView = this.c;
        imageView.setBackground(g57Var);
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
            ylb ylbVar = this.h;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : cmb.j0;
            if (d == null) {
                d = cmb.j0;
            }
            Paint paint = d;
            if (paint != null) {
                canvas.drawLine(jb6.a0 ? 0.0f : gm.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
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
