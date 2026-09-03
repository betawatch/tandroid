package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.l9, g3 {
    public final o70 a;
    public final j4 b;
    public d3 c;
    public org.telegram.ui.Components.el0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public d4 w;
    public CheckBoxBase x;

    public c2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.a = o70Var;
        this.b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d4 d4Var = this.w;
        if ((d4Var != null ? d4Var.i : null) == null) {
            return 0;
        }
        o70 o70Var = this.a;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.D) {
            o70Var.getClass();
            return org.telegram.messenger.y3.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        o70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        e4 e4Var = this.w.c;
        return b.z(20.0f, e4Var.e, dp - e4Var.b);
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if (callback instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.w;
        int min = (d4Var == null || d4Var.i == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        d3 d3Var = this.c;
        if (d3Var != null) {
            min = Math.min(min, (d3Var.a() + d3Var.s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if ((callback instanceof g3) && (boundLeft = ((g3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.w;
        int max = (d4Var == null || d4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        d3 d3Var = this.c;
        if (d3Var != null) {
            max = Math.max(max, d3Var.b() + d3Var.s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if ((callback instanceof g3) && (boundRight = ((g3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        d3 d3Var = this.c;
        if (d3Var == null) {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                KeyEvent.Callback callback = el0Var.a;
                if ((callback instanceof g3) && (lastLineBoundRight = ((g3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = d3Var.c() + d3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.u9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            el0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        d3 d3Var = this.w.i;
        o70 o70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                o70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                d4 d4Var = this.w;
                canvas.translate(org.telegram.messenger.y3.D(20.0f, this.w.c.e, (dp + d4Var.c.b) - ((int) Math.ceil(d4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                o70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                e4 e4Var = this.w.c;
                canvas.translate(b.z(20.0f, e4Var.e, dp2 - e4Var.b), this.f + this.h);
            }
            this.w.i.draw(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.x;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
            this.x.a(canvas);
        }
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            l4.v(o70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.a, this.b, d3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.a;
            int i14 = this.n;
            view.layout(i14, this.r, view.getMeasuredWidth() + i14, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0367  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        o70 o70Var;
        o70 o70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        d3 d3Var;
        d2 d2Var;
        d3 d3Var2;
        d3 d3Var3;
        org.telegram.ui.Components.el0 el0Var;
        org.telegram.ui.Cells.m9 m9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        d4 d4Var = this.w;
        int i15 = 1;
        if (d4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (d4Var.j == 0 && d4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            e4 e4Var = this.w.c;
            int i17 = e4Var.c;
            o70 o70Var3 = this.a;
            if (i17 == size2 && e4Var.d == SharedConfig.ivFontSize) {
                o70Var = o70Var3;
            } else {
                e4Var.c = size2;
                e4Var.d = SharedConfig.ivFontSize;
                e4Var.b = 0;
                int size3 = e4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    d4 d4Var2 = (d4) this.w.c.a.get(i18);
                    String str = d4Var2.f;
                    if (str == null) {
                        o70Var2 = o70Var3;
                    } else {
                        o70Var3.getClass();
                        o70 o70Var4 = o70Var3;
                        o70Var2 = o70Var4;
                        d4Var2.i = l4.q(o70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        e4 e4Var2 = this.w.c;
                        e4Var2.b = Math.max(e4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    o70Var3 = o70Var2;
                }
                o70Var = o70Var3;
                e4 e4Var3 = this.w.c;
                e4Var3.b = Math.max(e4Var3.b, (int) Math.ceil(l4.k1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    o70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                o70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                e4 e4Var4 = this.w.c;
                this.e = org.telegram.messenger.y3.D(20.0f, e4Var4.e, dp3 + e4Var4.b);
            } else {
                o70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            o70Var.getClass();
            float f10 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f10)) - this.e;
            if (j4Var != null && j4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                e4 e4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * e4Var5.e) + (dp5 + e4Var5.b);
            }
            d4 d4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = d4Var3.e;
            if (richText != null) {
                d3 p10 = l4.p(this.a, this, null, richText, i19, 0, d4Var3, (j4Var == null || !j4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    d3 d3Var4 = this.w.i;
                    if (d3Var4 != null && d3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (l.d.i(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    d4 d4Var4 = this.w;
                    i15 = (d4Var4.j == 0 || d4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    d3Var3 = this.c;
                    if (d3Var3 != null) {
                        d3Var3.s = this.e;
                        d3Var3.v = this.f;
                        d3 d3Var5 = this.w.i;
                        if (d3Var5 != null) {
                            d3Var3.x = d3Var5.d.getText();
                        }
                    }
                    el0Var = this.d;
                    if (el0Var != null && (el0Var.a instanceof org.telegram.ui.Cells.l9) && (m9Var = ((l4) o70Var).L0) != null) {
                        ArrayList arrayList = m9Var.F0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.l9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) obj;
                            if (x9Var instanceof d3) {
                                d3 d3Var6 = (d3) x9Var;
                                d3Var6.s += this.n;
                                d3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (l.d.i(1, this.w.c.a) == this.w) {
                }
                d4 d4Var42 = this.w;
                if (d4Var42.j == 0) {
                }
                d3Var3 = this.c;
                if (d3Var3 != null) {
                }
                el0Var = this.d;
                if (el0Var != null) {
                    ArrayList arrayList2 = m9Var.F0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.l9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = d4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.el0 el0Var2 = this.d;
                    if (el0Var2 != null) {
                        View view = el0Var2.a;
                        if (view instanceof d2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (j4Var == null || !j4Var.D) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof x1) || (view instanceof t2) || (view instanceof x2) || (view instanceof u2)) {
                                if (j4Var == null || !j4Var.D) {
                                    this.n = i20 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (l4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof w2) {
                                this.n -= AndroidUtilities.dp(f10);
                                dp2 = AndroidUtilities.dp(36.0f);
                            } else {
                                i13 = i19;
                                i14 = 0;
                            }
                            i13 = dp2 + i19;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof d2) && (d3Var = this.w.i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (d2Var = (d2) this.d.a).c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - d2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i14 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof c2) {
                                this.v = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.v = ((z1) view2).s;
                            }
                        }
                        if (this.v && this.w.i != null) {
                            this.f = (this.d.a.getMeasuredHeight() - this.w.i.d.getHeight()) / 2;
                        }
                        i12 = this.d.a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    dp = i12 + AndroidUtilities.dp(8.0f);
                    if (l.d.i(1, this.w.c.a) == this.w) {
                    }
                    d4 d4Var422 = this.w;
                    if (d4Var422.j == 0) {
                    }
                    d3Var3 = this.c;
                    if (d3Var3 != null) {
                    }
                    el0Var = this.d;
                    if (el0Var != null) {
                    }
                }
                dp = 0;
                if (l.d.i(1, this.w.c.a) == this.w) {
                }
                d4 d4Var4222 = this.w;
                if (d4Var4222.j == 0) {
                }
                d3Var3 = this.c;
                if (d3Var3 != null) {
                }
                el0Var = this.d;
                if (el0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.w;
        j4 j4Var = this.b;
        if (d4Var2 != d4Var) {
            this.w = d4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.s = I;
                f2.m1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
