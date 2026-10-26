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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.r9, e3 {
    public final h70 a;
    public final h4 b;
    public a3 c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public a4 w;
    public CheckBoxBase x;

    public a2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.a = h70Var;
        this.b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a4 a4Var = this.w;
        if ((a4Var != null ? a4Var.i : null) == null) {
            return 0;
        }
        h70 h70Var = this.a;
        h4 h4Var = this.b;
        if (h4Var == null || !h4Var.G) {
            h70Var.getClass();
            return org.telegram.messenger.vh.b(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        h70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        b4 b4Var = this.w.c;
        return org.telegram.messenger.vh.C(20.0f, b4Var.e, dp - b4Var.b);
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            KeyEvent.Callback callback = vl0Var.a;
            if (callback instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.w;
        int min = (a4Var == null || a4Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        a3 a3Var = this.c;
        if (a3Var != null) {
            min = Math.min(min, (a3Var.a() + a3Var.s) - dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            KeyEvent.Callback callback = vl0Var.a;
            if ((callback instanceof e3) && (boundLeft = ((e3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.w;
        int max = (a4Var == null || a4Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        a3 a3Var = this.c;
        if (a3Var != null) {
            max = Math.max(max, a3Var.b() + a3Var.s + dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            KeyEvent.Callback callback = vl0Var.a;
            if ((callback instanceof e3) && (boundRight = ((e3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        a3 a3Var = this.c;
        if (a3Var == null) {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                KeyEvent.Callback callback = vl0Var.a;
                if ((callback instanceof e3) && (lastLineBoundRight = ((e3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = a3Var.c() + a3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return d3.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.aa
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            vl0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        a3 a3Var = this.w.i;
        h70 h70Var = this.a;
        if (a3Var != null) {
            canvas.save();
            h4 h4Var = this.b;
            if (h4Var == null || !h4Var.G) {
                h70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                a4 a4Var = this.w;
                canvas.translate(org.telegram.messenger.vh.b(20.0f, this.w.c.e, (dp + a4Var.c.b) - ((int) Math.ceil(a4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                h70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                b4 b4Var = this.w.c;
                canvas.translate(org.telegram.messenger.vh.C(20.0f, b4Var.e, dp2 - b4Var.b), this.f + this.h);
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
            j4.v(h70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.a, this.b, a3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.a;
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
        h70 h70Var;
        h70 h70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        a3 a3Var;
        b2 b2Var;
        a3 a3Var2;
        a3 a3Var3;
        org.telegram.ui.Components.vl0 vl0Var;
        org.telegram.ui.Cells.s9 s9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        a4 a4Var = this.w;
        int i15 = 1;
        if (a4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (a4Var.j == 0 && a4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            b4 b4Var = this.w.c;
            int i17 = b4Var.c;
            h70 h70Var3 = this.a;
            if (i17 == size2 && b4Var.d == SharedConfig.ivFontSize) {
                h70Var = h70Var3;
            } else {
                b4Var.c = size2;
                b4Var.d = SharedConfig.ivFontSize;
                b4Var.b = 0;
                int size3 = b4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    a4 a4Var2 = (a4) this.w.c.a.get(i18);
                    String str = a4Var2.f;
                    if (str == null) {
                        h70Var2 = h70Var3;
                    } else {
                        h70Var3.getClass();
                        h70 h70Var4 = h70Var3;
                        h70Var2 = h70Var4;
                        a4Var2.i = j4.q(h70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        b4 b4Var2 = this.w.c;
                        b4Var2.b = Math.max(b4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    h70Var3 = h70Var2;
                }
                h70Var = h70Var3;
                b4 b4Var3 = this.w.c;
                b4Var3.b = Math.max(b4Var3.b, (int) Math.ceil(j4.o1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    h70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.y6.hl, org.telegram.ui.ActionBar.y6.z5, org.telegram.ui.ActionBar.y6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            h4 h4Var = this.b;
            if (h4Var == null || !h4Var.G) {
                h70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                b4 b4Var4 = this.w.c;
                this.e = org.telegram.messenger.vh.b(20.0f, b4Var4.e, dp3 + b4Var4.b);
            } else {
                h70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            h70Var.getClass();
            float f7 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f7)) - this.e;
            if (h4Var != null && h4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * b4Var5.e) + (dp5 + b4Var5.b);
            }
            a4 a4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = a4Var3.e;
            if (richText != null) {
                a3 p10 = j4.p(this.a, this, null, richText, i19, 0, a4Var3, (h4Var == null || !h4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.px0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    a3 a3Var4 = this.w.i;
                    if (a3Var4 != null && a3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (ic.a.g(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    a4 a4Var4 = this.w;
                    i15 = (a4Var4.j == 0 || a4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    a3Var3 = this.c;
                    if (a3Var3 != null) {
                        a3Var3.s = this.e;
                        a3Var3.v = this.f;
                        a3 a3Var5 = this.w.i;
                        if (a3Var5 != null) {
                            a3Var3.x = a3Var5.d.getText();
                        }
                    }
                    vl0Var = this.d;
                    if (vl0Var != null && (vl0Var.a instanceof org.telegram.ui.Cells.r9) && (s9Var = ((j4) h70Var).P0) != null) {
                        ArrayList arrayList = s9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.r9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) obj;
                            if (daVar instanceof a3) {
                                a3 a3Var6 = (a3) daVar;
                                a3Var6.s += this.n;
                                a3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (ic.a.g(1, this.w.c.a) == this.w) {
                }
                a4 a4Var42 = this.w;
                if (a4Var42.j == 0) {
                }
                a3Var3 = this.c;
                if (a3Var3 != null) {
                }
                vl0Var = this.d;
                if (vl0Var != null) {
                    ArrayList arrayList2 = s9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.r9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = a4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.vl0 vl0Var2 = this.d;
                    if (vl0Var2 != null) {
                        View view = vl0Var2.a;
                        if (view instanceof b2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (h4Var == null || !h4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof v1) || (view instanceof q2) || (view instanceof u2) || (view instanceof r2)) {
                                if (h4Var == null || !h4Var.G) {
                                    this.n = i20 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (j4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof t2) {
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
                        if ((this.d.a instanceof b2) && (a3Var = this.w.i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.a).c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - b2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i14 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof a2) {
                                this.v = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.v = ((x1) view2).s;
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
                    if (ic.a.g(1, this.w.c.a) == this.w) {
                    }
                    a4 a4Var422 = this.w;
                    if (a4Var422.j == 0) {
                    }
                    a3Var3 = this.c;
                    if (a3Var3 != null) {
                    }
                    vl0Var = this.d;
                    if (vl0Var != null) {
                    }
                }
                dp = 0;
                if (ic.a.g(1, this.w.c.a) == this.w) {
                }
                a4 a4Var4222 = this.w;
                if (a4Var4222.j == 0) {
                }
                a3Var3 = this.c;
                if (a3Var3 != null) {
                }
                vl0Var = this.d;
                if (vl0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.w;
        h4 h4Var = this.b;
        if (a4Var2 != a4Var) {
            this.w = a4Var;
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                removeView(vl0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.s = I;
                s4.e1 x9 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vl0) x9;
                addView(x9.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
