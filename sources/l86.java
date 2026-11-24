// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l86 extends FrameLayout {
    public final /* synthetic */ m86 E;
    public final ImageView a;
    public final LinearLayout b;
    public final wb c;
    public final io d;
    public final ImageView e;
    public final Switch f;
    public final jh2 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l86(m86 m86Var, Context context) {
        super(context);
        this.E = m86Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i, null, mode);
        imageView.setVisibility(8);
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 23);
        this.c = wbVar;
        wbVar.setLines(1);
        wbVar.setSingleLine(true);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.setTextSize(1, 16.0f);
        int i2 = cmb.F6;
        anb.X(wbVar, i2, null);
        wbVar.setGravity(jb6.a0 ? 5 : 3);
        wbVar.setImportantForAccessibility(2);
        io ioVar = new io(context, false, true, true);
        this.d = ioVar;
        ioVar.b(0.35f, 200L, d53.h);
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(14.0f));
        anb.U(ioVar, i2, null);
        ioVar.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        anb.s(imageView2, i2, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(jb6.a0 ? 5 : 3);
        if (jb6.a0) {
            linearLayout.addView(imageView2, qoe.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(ioVar, qoe.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(wbVar, qoe.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(wbVar, qoe.p(-2, -2, 1.0f, 16));
            linearLayout.addView(ioVar, qoe.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, qoe.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r3 = new Switch(context, null);
        this.f = r3;
        r3.setVisibility(8);
        int i3 = cmb.L6;
        int i4 = cmb.M6;
        int i5 = cmb.c6;
        r3.d(i3, i4, i5, i5);
        r3.setImportantForAccessibility(2);
        addView(r3, qoe.d(37, 50.0f, (jb6.a0 ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        jh2 jh2Var = new jh2(21, null, context);
        this.h = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(true, false);
        jh2Var.setDrawBackgroundAsArc(10);
        jh2Var.setVisibility(8);
        jh2Var.setImportantForAccessibility(2);
        boolean z = jb6.a0;
        addView(jh2Var, qoe.d(21, 21.0f, (z ? 5 : 3) | 16, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r4 & org.telegram.tgnet.TLObject.FLAG_14) > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        if ((r4 & 4) > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i) {
        boolean p = this.E.getUserConfig().p();
        int bitCount = Integer.bitCount(i);
        if (p) {
            if ((i & TLObject.FLAG_12) > 0) {
                bitCount--;
            }
            if ((i & TLObject.FLAG_13) > 0) {
                bitCount--;
            }
        } else {
            if ((i & 16) > 0) {
                bitCount--;
            }
            if ((i & 8) > 0) {
                bitCount--;
            }
        }
        if (gda.o() < 1 && (i & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (gda.o() < 1) {
                boolean z = e21.a;
            }
            return (jlb.c() || (i & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i) > 0) {
            bitCount--;
        }
        if (jlb.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z, boolean z2) {
        if (this.s != z) {
            this.s = z;
            jh2 jh2Var = this.h;
            Switch r1 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z2) {
                imageView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                r1.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                wi8.s(jh2Var.animate(), z ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z ? 0.5f : 1.0f);
                linearLayout.setAlpha(z ? 0.5f : 1.0f);
                r1.setAlpha(z ? 0.5f : 1.0f);
                jh2Var.setAlpha(z ? 0.5f : 1.0f);
            }
            setEnabled(!z);
        }
    }

    public final void c(g86 g86Var, boolean z) {
        int d = e86.d(true);
        int i = g86Var.e;
        this.x = a(d & i);
        this.y = a(i);
        boolean z2 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z && !jb6.a0) {
            z2 = true;
        }
        this.d.c(format, z2, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = jb6.a0;
        boolean z2 = this.r;
        wb wbVar = this.c;
        if (z) {
            if (z2) {
                float L = gm.L(75.0f);
                canvas.drawRect(L - gm.L(0.66f), (getMeasuredHeight() - gm.L(20.0f)) / 2.0f, L, (gm.L(20.0f) + getMeasuredHeight()) / 2.0f, cmb.j0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - gm.L(64.0f)) + (wbVar.getTranslationX() < 0.0f ? gm.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, cmb.j0);
                return;
            }
            return;
        }
        if (z2) {
            float measuredWidth = getMeasuredWidth() - gm.L(75.0f);
            canvas.drawRect(measuredWidth - gm.L(0.66f), (getMeasuredHeight() - gm.L(20.0f)) / 2.0f, measuredWidth, (gm.L(20.0f) + getMeasuredHeight()) / 2.0f, cmb.j0);
        }
        if (this.n) {
            canvas.drawLine(wbVar.getTranslationX() + gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.h;
        accessibilityNodeInfo.setClassName(jh2Var.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (jh2Var.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.w) {
            sb.append('\n');
            sb.append(jb6.a0("Of", null, 2131747562, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }
}
