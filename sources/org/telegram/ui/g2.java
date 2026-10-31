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
public final class g2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public g2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int i10;
        z2 z2Var = this.c;
        if (z2Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, z2Var.k() + z2Var.s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.min(i10, z2Var2.k() + z2Var2.s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.a.getClass();
        return i10 - org.telegram.messenger.i0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        int i10;
        z2 z2Var = this.c;
        if (z2Var != null) {
            i10 = Math.max(TLObject.FLAG_31, z2Var.l() + z2Var.s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i10 = Math.max(i10, z2Var2.l() + z2Var2.s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.a.getClass();
        return org.telegram.messenger.i0.L(18) + i10;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.cd.L0(2131754859, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.a;
        m60Var.getClass();
        this.f = org.telegram.messenger.i0.L(18);
        m60Var.getClass();
        float f7 = 8;
        this.h = org.telegram.messenger.i0.L(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            m60 m60Var2 = this.a;
            m60Var2.getClass();
            float f10 = 36;
            z2 o10 = h4.o(m60Var2, this, null, richText, size - org.telegram.messenger.i0.L(f10), this.h, this.n, this.b);
            this.c = o10;
            if (o10 != null) {
                m60Var.getClass();
                i13 = this.c.d.getHeight() + org.telegram.messenger.i0.L(f7);
                z2 z2Var = this.c;
                z2Var.s = this.f;
                z2Var.w = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = org.telegram.messenger.i0.L(2.0f) + i12;
            TL_iv.RichText richText2 = this.n.caption;
            m60 m60Var3 = this.a;
            m60Var3.getClass();
            z2 o11 = h4.o(m60Var3, this, null, richText2, size - org.telegram.messenger.i0.L(f10), this.e, this.n, this.b);
            this.d = o11;
            if (o11 != null) {
                m60Var.getClass();
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(f7);
                z2 z2Var2 = this.d;
                z2Var2.s = this.f;
                z2Var2.w = this.e;
            }
            if (i12 != 0) {
                m60Var.getClass();
                i12 += org.telegram.messenger.i0.L(f7);
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

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.n = pageblockpullquote;
        requestLayout();
    }
}
