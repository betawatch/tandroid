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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l66 extends FrameLayout {
    public final /* synthetic */ m66 E;
    public final ImageView a;
    public final LinearLayout b;
    public final wb c;
    public final hn d;
    public final ImageView e;
    public final Switch f;
    public final wf2 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l66(m66 m66Var, Context context) {
        super(context);
        this.E = m66Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i, null, mode);
        imageView.setVisibility(8);
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 23);
        this.c = wbVar;
        wbVar.setLines(1);
        wbVar.setSingleLine(true);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.setTextSize(1, 16.0f);
        int i2 = bkb.F6;
        zkb.X(wbVar, i2, null);
        wbVar.setGravity(k96.a0 ? 5 : 3);
        wbVar.setImportantForAccessibility(2);
        hn hnVar = new hn(context, false, true, true);
        this.d = hnVar;
        hnVar.b(0.35f, 200L, s33.h);
        hnVar.setTypeface(gl.o());
        hnVar.setTextSize(gl.L(14.0f));
        zkb.U(hnVar, i2, null);
        hnVar.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        zkb.s(imageView2, i2, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(k96.a0 ? 5 : 3);
        if (k96.a0) {
            linearLayout.addView(imageView2, nme.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(hnVar, nme.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(wbVar, nme.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(wbVar, nme.p(-2, -2, 1.0f, 16));
            linearLayout.addView(hnVar, nme.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, nme.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r3 = new Switch(context, null);
        this.f = r3;
        r3.setVisibility(8);
        int i3 = bkb.L6;
        int i4 = bkb.M6;
        int i5 = bkb.c6;
        r3.d(i3, i4, i5, i5);
        r3.setImportantForAccessibility(2);
        addView(r3, nme.d(37, 50.0f, (k96.a0 ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        wf2 wf2Var = new wf2(21, null, context);
        this.h = wf2Var;
        wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(true, false);
        wf2Var.setDrawBackgroundAsArc(10);
        wf2Var.setVisibility(8);
        wf2Var.setImportantForAccessibility(2);
        boolean z = k96.a0;
        addView(wf2Var, nme.d(21, 21.0f, (z ? 5 : 3) | 16, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
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
        if (gba.o() < 1 && (i & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (gba.o() < 1) {
                boolean z = w01.a;
            }
            return (ijb.c() || (i & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i) > 0) {
            bitCount--;
        }
        if (ijb.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z, boolean z2) {
        if (this.s != z) {
            this.s = z;
            wf2 wf2Var = this.h;
            Switch r1 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z2) {
                imageView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                r1.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                ug8.s(wf2Var.animate(), z ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z ? 0.5f : 1.0f);
                linearLayout.setAlpha(z ? 0.5f : 1.0f);
                r1.setAlpha(z ? 0.5f : 1.0f);
                wf2Var.setAlpha(z ? 0.5f : 1.0f);
            }
            setEnabled(!z);
        }
    }

    public final void c(g66 g66Var, boolean z) {
        int d = e66.d(true);
        int i = g66Var.e;
        this.x = a(d & i);
        this.y = a(i);
        boolean z2 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z && !k96.a0) {
            z2 = true;
        }
        this.d.c(format, z2, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = k96.a0;
        boolean z2 = this.r;
        wb wbVar = this.c;
        if (z) {
            if (z2) {
                float L = gl.L(75.0f);
                canvas.drawRect(L - gl.L(0.66f), (getMeasuredHeight() - gl.L(20.0f)) / 2.0f, L, (gl.L(20.0f) + getMeasuredHeight()) / 2.0f, bkb.j0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - gl.L(64.0f)) + (wbVar.getTranslationX() < 0.0f ? gl.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, bkb.j0);
                return;
            }
            return;
        }
        if (z2) {
            float measuredWidth = getMeasuredWidth() - gl.L(75.0f);
            canvas.drawRect(measuredWidth - gl.L(0.66f), (getMeasuredHeight() - gl.L(20.0f)) / 2.0f, measuredWidth, (gl.L(20.0f) + getMeasuredHeight()) / 2.0f, bkb.j0);
        }
        if (this.n) {
            canvas.drawLine(wbVar.getTranslationX() + gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.h;
        accessibilityNodeInfo.setClassName(wf2Var.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (wf2Var.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(wf2Var.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.w) {
            sb.append('\n');
            sb.append(k96.a0("Of", null, 2131747636, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }
}
