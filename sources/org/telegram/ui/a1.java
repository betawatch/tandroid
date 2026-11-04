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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public a3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public a1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        int i3;
        i50 i50Var = this.a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        a3 a3Var = this.c;
        if (a3Var != null) {
            i3 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (a3Var.k() + a3Var.s) - L);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.min(i3, (a3Var2.k() + a3Var2.s) - L);
        }
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        i50Var.getClass();
        return i3 - org.telegram.messenger.g0.L(f10);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        int i3;
        i50 i50Var = this.a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        a3 a3Var = this.c;
        if (a3Var != null) {
            i3 = Math.max(TLObject.FLAG_31, a3Var.l() + a3Var.s + L);
        } else {
            i3 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i3 = Math.max(i3, a3Var2.l() + a3Var2.s + L);
        }
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        i50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i3;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        int m10;
        int L;
        a3 a3Var = this.d;
        i50 i50Var = this.a;
        if (a3Var != null) {
            m10 = a3Var.m() + a3Var.s;
            i50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            a3 a3Var2 = this.c;
            if (a3Var2 == null) {
                return -1;
            }
            m10 = a3Var2.m() + a3Var2.s;
            i50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        }
        return L + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        a3 a3Var = this.c;
        i50 i50Var = this.a;
        int i3 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            i4.t(i50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            i4.t(i50Var, canvas, this, i3);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.H) {
            i50Var.getClass();
            float L = org.telegram.messenger.g0.L((this.n.level * 14) + 18);
            float L2 = org.telegram.messenger.g0.L(6.0f);
            i50Var.getClass();
            canvas.drawRect(L, L2, org.telegram.messenger.g0.L((this.n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), i4.s1);
        } else {
            canvas.drawRect(getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + r2, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), i4.s1);
        }
        i4.s(canvas, i50Var, this.n, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.c;
        g4 g4Var = this.b;
        i50 i50Var = this.a;
        if (a3Var != null && (h7 = i4.h(i50Var, g4Var, a3Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (h = i4.h(i50Var, g4Var, a3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.bd.M0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.a;
        i50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.n != null) {
            i50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.n.level > 0) {
                L -= org.telegram.messenger.g0.L(r2 * 14);
            }
            int i13 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            a3 o10 = i4.o(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = o10;
            if (o10 != null) {
                i50Var.getClass();
                i12 = this.c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i12 = 0;
            }
            i11 = i12;
            int i14 = this.n.level;
            g4 g4Var = this.b;
            if (i14 > 0) {
                if (g4Var == null || !g4Var.H) {
                    int L2 = org.telegram.messenger.g0.L(i14 * 14);
                    i50Var.getClass();
                    this.f = org.telegram.messenger.g0.L(32) + L2;
                } else {
                    this.f = org.telegram.messenger.g0.L((i14 * 14) + 14);
                }
            } else if (g4Var == null || !g4Var.H) {
                i50Var.getClass();
                this.f = org.telegram.messenger.g0.L(32);
            } else {
                this.f = org.telegram.messenger.g0.L(14.0f);
            }
            i50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            a3 o11 = i4.o(this.a, this, null, pageblockblockquote2.caption, i13, L3, pageblockblockquote2, this.b);
            this.d = o11;
            if (o11 != null) {
                i50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                i50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            a3 a3Var = this.c;
            if (a3Var != null) {
                a3Var.s = this.f;
                a3Var.w = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.s = this.f;
                a3Var2.w = this.e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return i4.j(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
