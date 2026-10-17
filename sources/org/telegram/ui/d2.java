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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class d2 extends ViewGroup implements org.telegram.ui.Cells.m9, g3 {
    public final d70 a;
    public final j4 b;
    public d3 c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public c4 w;
    public CheckBoxBase x;

    public d2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.a = d70Var;
        this.b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c4 c4Var = this.w;
        if ((c4Var != null ? c4Var.i : null) == null) {
            return 0;
        }
        d70 d70Var = this.a;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.G) {
            d70Var.getClass();
            return org.telegram.messenger.q.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        d70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        d4 d4Var = this.w.c;
        return org.telegram.messenger.wh.C(20.0f, d4Var.e, dp - d4Var.b);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            KeyEvent.Callback callback = sl0Var.a;
            if (callback instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) callback).fillTextLayoutBlocks(arrayList);
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
        c4 c4Var = this.w;
        int min = (c4Var == null || c4Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        d3 d3Var = this.c;
        if (d3Var != null) {
            min = Math.min(min, (d3Var.a() + d3Var.s) - dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            KeyEvent.Callback callback = sl0Var.a;
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
        c4 c4Var = this.w;
        int max = (c4Var == null || c4Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        d3 d3Var = this.c;
        if (d3Var != null) {
            max = Math.max(max, d3Var.b() + d3Var.s + dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            KeyEvent.Callback callback = sl0Var.a;
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
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                KeyEvent.Callback callback = sl0Var.a;
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
        return org.telegram.messenger.wh.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.v9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            sl0Var.a.invalidate();
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
        d70 d70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.G) {
                d70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                c4 c4Var = this.w;
                canvas.translate(org.telegram.messenger.q.D(20.0f, this.w.c.e, (dp + c4Var.c.b) - ((int) Math.ceil(c4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                d70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                d4 d4Var = this.w.c;
                canvas.translate(org.telegram.messenger.wh.C(20.0f, d4Var.e, dp2 - d4Var.b), this.f + this.h);
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
            l4.v(d70Var, canvas, this, 0);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.a;
            int i14 = this.n;
            view.layout(i14, this.r, view.getMeasuredWidth() + i14, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0366  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        d70 d70Var;
        d70 d70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        d3 d3Var;
        e2 e2Var;
        d3 d3Var2;
        d3 d3Var3;
        org.telegram.ui.Components.sl0 sl0Var;
        org.telegram.ui.Cells.n9 n9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        c4 c4Var = this.w;
        int i15 = 1;
        if (c4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (c4Var.j == 0 && c4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            d4 d4Var = this.w.c;
            int i17 = d4Var.c;
            d70 d70Var3 = this.a;
            if (i17 == size2 && d4Var.d == SharedConfig.ivFontSize) {
                d70Var = d70Var3;
            } else {
                d4Var.c = size2;
                d4Var.d = SharedConfig.ivFontSize;
                d4Var.b = 0;
                int size3 = d4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    c4 c4Var2 = (c4) this.w.c.a.get(i18);
                    String str = c4Var2.f;
                    if (str == null) {
                        d70Var2 = d70Var3;
                    } else {
                        d70Var3.getClass();
                        d70 d70Var4 = d70Var3;
                        d70Var2 = d70Var4;
                        c4Var2.i = l4.q(d70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        d4 d4Var2 = this.w.c;
                        d4Var2.b = Math.max(d4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    d70Var3 = d70Var2;
                }
                d70Var = d70Var3;
                d4 d4Var3 = this.w.c;
                d4Var3.b = Math.max(d4Var3.b, (int) Math.ceil(l4.n1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    d70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.z5, org.telegram.ui.ActionBar.h6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.G) {
                d70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                d4 d4Var4 = this.w.c;
                this.e = org.telegram.messenger.q.D(20.0f, d4Var4.e, dp3 + d4Var4.b);
            } else {
                d70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            d70Var.getClass();
            float f7 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f7)) - this.e;
            if (j4Var != null && j4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                d4 d4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * d4Var5.e) + (dp5 + d4Var5.b);
            }
            c4 c4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = c4Var3.e;
            if (richText != null) {
                d3 p5 = l4.p(this.a, this, null, richText, i19, 0, c4Var3, (j4Var == null || !j4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.dx0.a(), 0, this.b);
                this.c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    d3 d3Var4 = this.w.i;
                    if (d3Var4 != null && d3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (i0.a.h(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    c4 c4Var4 = this.w;
                    i15 = (c4Var4.j == 0 || c4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    d3Var3 = this.c;
                    if (d3Var3 != null) {
                        d3Var3.s = this.e;
                        d3Var3.v = this.f;
                        d3 d3Var5 = this.w.i;
                        if (d3Var5 != null) {
                            d3Var3.x = d3Var5.d.getText();
                        }
                    }
                    sl0Var = this.d;
                    if (sl0Var != null && (sl0Var.a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) d70Var).O0) != null) {
                        ArrayList arrayList = n9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.m9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                            if (y9Var instanceof d3) {
                                d3 d3Var6 = (d3) y9Var;
                                d3Var6.s += this.n;
                                d3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (i0.a.h(1, this.w.c.a) == this.w) {
                }
                c4 c4Var42 = this.w;
                if (c4Var42.j == 0) {
                }
                d3Var3 = this.c;
                if (d3Var3 != null) {
                }
                sl0Var = this.d;
                if (sl0Var != null) {
                    ArrayList arrayList2 = n9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.m9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = c4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.sl0 sl0Var2 = this.d;
                    if (sl0Var2 != null) {
                        View view = sl0Var2.a;
                        if (view instanceof e2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (j4Var == null || !j4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof y1) || (view instanceof t2) || (view instanceof x2) || (view instanceof u2)) {
                                if (j4Var == null || !j4Var.G) {
                                    this.n = i20 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (l4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof w2) {
                                this.n -= AndroidUtilities.dp(f7);
                                dp2 = AndroidUtilities.dp(36.0f);
                            } else {
                                i13 = i19;
                                i14 = 0;
                            }
                            i13 = dp2 + i19;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof e2) && (d3Var = this.w.i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (e2Var = (e2) this.d.a).c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - e2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i14 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof d2) {
                                this.v = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.v = ((a2) view2).s;
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
                    if (i0.a.h(1, this.w.c.a) == this.w) {
                    }
                    c4 c4Var422 = this.w;
                    if (c4Var422.j == 0) {
                    }
                    d3Var3 = this.c;
                    if (d3Var3 != null) {
                    }
                    sl0Var = this.d;
                    if (sl0Var != null) {
                    }
                }
                dp = 0;
                if (i0.a.h(1, this.w.c.a) == this.w) {
                }
                c4 c4Var4222 = this.w;
                if (c4Var4222.j == 0) {
                }
                d3Var3 = this.c;
                if (d3Var3 != null) {
                }
                sl0Var = this.d;
                if (sl0Var != null) {
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

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.w;
        j4 j4Var = this.b;
        if (c4Var2 != c4Var) {
            this.w = c4Var;
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                removeView(sl0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.s = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.sl0) x10;
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
