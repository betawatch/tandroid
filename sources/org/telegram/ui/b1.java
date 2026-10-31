package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public b1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int i10;
        m60 m60Var = this.a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        z2 z2Var = this.c;
        if (z2Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (z2Var.k() + z2Var.s) - L);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.min(i10, (z2Var2.k() + z2Var2.s) - L);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        m60Var.getClass();
        return i10 - org.telegram.messenger.i0.L(f7);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        int i10;
        m60 m60Var = this.a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        z2 z2Var = this.c;
        if (z2Var != null) {
            i10 = Math.max(TLObject.FLAG_31, z2Var.l() + z2Var.s + L);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.max(i10, z2Var2.l() + z2Var2.s + L);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        m60Var.getClass();
        return org.telegram.messenger.i0.L(f7) + i10;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        m60 m60Var = this.a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.s;
            m60Var.getClass();
            L = org.telegram.messenger.i0.L(18);
        } else {
            z2 z2Var2 = this.c;
            if (z2Var2 == null) {
                return -1;
            }
            m10 = z2Var2.m() + z2Var2.s;
            m60Var.getClass();
            L = org.telegram.messenger.i0.L(18);
        }
        return L + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        z2 z2Var = this.c;
        m60 m60Var = this.a;
        int i10 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            h4.t(m60Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            h4.t(m60Var, canvas, this, i10);
            this.d.d(canvas, this);
            canvas.restore();
        }
        f4 f4Var = this.b;
        if (f4Var == null || !f4Var.G) {
            m60Var.getClass();
            float L = org.telegram.messenger.i0.L((this.n.level * 14) + 18);
            float L2 = org.telegram.messenger.i0.L(6.0f);
            m60Var.getClass();
            canvas.drawRect(L, L2, org.telegram.messenger.i0.L((this.n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), h4.r1);
        } else {
            canvas.drawRect(getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f) + r2, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), h4.r1);
        }
        h4.s(canvas, m60Var, this.n, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.c;
        f4 f4Var = this.b;
        m60 m60Var = this.a;
        if (z2Var != null && (h10 = h4.h(m60Var, f4Var, z2Var)) != null) {
            spannableStringBuilder.append(h10);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = h4.h(m60Var, f4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.cd.L0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.a;
        m60Var.getClass();
        float f7 = 8;
        this.h = org.telegram.messenger.i0.L(f7);
        if (this.n != null) {
            m60Var.getClass();
            int L = size - org.telegram.messenger.i0.L(50);
            if (this.n.level > 0) {
                L -= org.telegram.messenger.i0.L(r2 * 14);
            }
            int i14 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            z2 o10 = h4.o(this.a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.b);
            this.c = o10;
            if (o10 != null) {
                m60Var.getClass();
                i13 = this.c.d.getHeight() + org.telegram.messenger.i0.L(f7);
            } else {
                i13 = 0;
            }
            i12 = i13;
            int i15 = this.n.level;
            f4 f4Var = this.b;
            if (i15 > 0) {
                if (f4Var == null || !f4Var.G) {
                    int L2 = org.telegram.messenger.i0.L(i15 * 14);
                    m60Var.getClass();
                    this.f = org.telegram.messenger.i0.L(32) + L2;
                } else {
                    this.f = org.telegram.messenger.i0.L((i15 * 14) + 14);
                }
            } else if (f4Var == null || !f4Var.G) {
                m60Var.getClass();
                this.f = org.telegram.messenger.i0.L(32);
            } else {
                this.f = org.telegram.messenger.i0.L(14.0f);
            }
            m60Var.getClass();
            int L3 = org.telegram.messenger.i0.L(f7) + i12;
            this.e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            z2 o11 = h4.o(this.a, this, null, pageblockblockquote2.caption, i14, L3, pageblockblockquote2, this.b);
            this.d = o11;
            if (o11 != null) {
                m60Var.getClass();
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(f7);
            }
            if (i12 != 0) {
                m60Var.getClass();
                i12 += org.telegram.messenger.i0.L(f7);
            }
            z2 z2Var = this.c;
            if (z2Var != null) {
                z2Var.s = this.f;
                z2Var.w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.s = this.f;
                z2Var2.w = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return h4.j(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
