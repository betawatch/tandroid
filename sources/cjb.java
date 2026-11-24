// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cjb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final jh2 c;
    public boolean d;
    public boolean e;
    public int f;
    public float h;

    static {
        new pn("animationProgress", (byte) 17);
    }

    public cjb(Context context) {
        super(context);
        this.f = 50;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 64.0f, 0.0f, z ? 64.0f : 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21.0f : 64.0f, 36.0f, z2 ? 64.0f : 21.0f, 0.0f));
        jh2 jh2Var = new jh2(21, null, context);
        this.c = jh2Var;
        jh2Var.setDrawUnchecked(true);
        jh2Var.setDrawBackgroundAsArc(10);
        jh2Var.setDuration(100L);
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        addView(jh2Var, qoe.d(20, 20.0f, (jb6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        this.h = f;
        getMeasuredWidth();
        gm.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z, boolean z2) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.d = z2;
        textView2.setVisibility(0);
        this.e = z;
        if (z) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, gm.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = gm.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(64.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.a.q);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.b.getVisibility() == 0 ? 64.0f : this.f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        clearAnimation();
        super.setBackgroundColor(i);
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setHeight(int i) {
        this.f = i;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
