// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class du extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public du(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override // dw
    public int getBoundLeft() {
        int i;
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        int L = gl.L(18.0f);
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (bwVar.k() + bwVar.s) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            i = Math.min(i, (bwVar2.k() + bwVar2.s) - L);
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return ug8.h(vg5Var, 18.0f, i);
    }

    @Override // dw
    public int getBoundRight() {
        int i;
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        int L = gl.L(18.0f);
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.max(TLObject.FLAG_31, bwVar.l() + bwVar.s + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            i = Math.max(i, bwVar2.l() + bwVar2.s + L);
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return ug8.C(vg5Var, 18.0f, i);
    }

    @Override // dw
    public int getLastLineBoundRight() {
        bw bwVar = this.d;
        vg5 vg5Var = this.a;
        if (bwVar != null) {
            int m = bwVar.m() + bwVar.s;
            vg5Var.getClass();
            return gl.L(18.0f) + m;
        }
        bw bwVar2 = this.c;
        if (bwVar2 == null) {
            return -1;
        }
        int m2 = bwVar2.m() + bwVar2.s;
        vg5Var.getClass();
        return gl.L(18.0f) + m2;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ug8.a(this);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        bw bwVar = this.c;
        vg5 vg5Var = this.a;
        int i = 0;
        if (bwVar != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            o.s(vg5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            o.s(vg5Var, canvas, this, i);
            this.d.d(canvas, this);
            canvas.restore();
        }
        dx dxVar = this.b;
        if (dxVar == null || !dxVar.H) {
            vg5Var.getClass();
            float L = gl.L((this.n.level * 14) + 18);
            float L2 = gl.L(6.0f);
            vg5Var.getClass();
            canvas.drawRect(L, L2, gl.L((this.n.level * 14) + 20), getMeasuredHeight() - gl.L(6.0f), o.s1);
        } else {
            canvas.drawRect(getMeasuredWidth() - gl.L(20.0f), gl.L(6.0f), gl.L(2.0f) + r3, getMeasuredHeight() - gl.L(6.0f), o.s1);
        }
        o.r(canvas, vg5Var, this.n, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence g;
        CharSequence g2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        bw bwVar = this.c;
        dx dxVar = this.b;
        vg5 vg5Var = this.a;
        if (bwVar != null && (g2 = o.g(vg5Var, dxVar, bwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null && (g = o.g(vg5Var, dxVar, bwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) k96.M0(2131754872, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        du duVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        this.h = gl.L(8.0f);
        if (this.n != null) {
            int h = ug8.h(vg5Var, 50.0f, size);
            if (this.n.level > 0) {
                h -= gl.L(r2 * 14);
            }
            int i4 = h;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            duVar = this;
            bw m = o.m(this.a, duVar, null, pageblockblockquote.text, i4, this.h, pageblockblockquote, this.b);
            duVar.c = m;
            if (m != null) {
                vg5Var.getClass();
                i3 = duVar.c.d.getHeight() + gl.L(8.0f);
            } else {
                i3 = 0;
            }
            int i5 = duVar.n.level;
            dx dxVar = duVar.b;
            if (i5 > 0) {
                if (dxVar == null || !dxVar.H) {
                    duVar.f = ug8.C(vg5Var, 32.0f, gl.L(i5 * 14));
                } else {
                    duVar.f = gl.L((i5 * 14) + 14);
                }
            } else if (dxVar == null || !dxVar.H) {
                vg5Var.getClass();
                duVar.f = gl.L(32.0f);
            } else {
                duVar.f = gl.L(14.0f);
            }
            int C = ug8.C(vg5Var, 8.0f, i3);
            duVar.e = C;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = duVar.n;
            bw m2 = o.m(duVar.a, duVar, null, pageblockblockquote2.caption, i4, C, pageblockblockquote2, duVar.b);
            duVar.d = m2;
            if (m2 != null) {
                vg5Var.getClass();
                i3 += duVar.d.d.getHeight() + gl.L(8.0f);
            }
            if (i3 != 0) {
                i3 = ug8.C(vg5Var, 8.0f, i3);
            }
            bw bwVar = duVar.c;
            if (bwVar != null) {
                bwVar.s = duVar.f;
                bwVar.w = duVar.h;
            }
            bw bwVar2 = duVar.d;
            if (bwVar2 != null) {
                bwVar2.s = duVar.f;
                bwVar2.w = duVar.e;
            }
        } else {
            duVar = this;
            i3 = 1;
        }
        duVar.setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return o.i(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
