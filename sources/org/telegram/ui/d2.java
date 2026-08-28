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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d2 extends ViewGroup implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public org.telegram.ui.Components.ik0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public d4 w;
    public CheckBoxBase x;

    public d2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d4 d4Var = this.w;
        if ((d4Var != null ? d4Var.i : null) == null) {
            return 0;
        }
        a70 a70Var = this.a;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.C) {
            a70Var.getClass();
            return org.telegram.messenger.l0.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        a70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        e4 e4Var = this.w.c;
        return org.telegram.messenger.ll.A(20.0f, e4Var.e, dp - e4Var.b);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            KeyEvent.Callback callback = ik0Var.a;
            if (callback instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.w;
        int min = (d4Var == null || d4Var.i == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        e3 e3Var = this.c;
        if (e3Var != null) {
            min = Math.min(min, (e3Var.a() + e3Var.s) - dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            KeyEvent.Callback callback = ik0Var.a;
            if ((callback instanceof h3) && (boundLeft = ((h3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.w;
        int max = (d4Var == null || d4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        e3 e3Var = this.c;
        if (e3Var != null) {
            max = Math.max(max, e3Var.b() + e3Var.s + dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            KeyEvent.Callback callback = ik0Var.a;
            if ((callback instanceof h3) && (boundRight = ((h3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i9;
        e3 e3Var = this.c;
        if (e3Var == null) {
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                KeyEvent.Callback callback = ik0Var.a;
                if ((callback instanceof h3) && (lastLineBoundRight = ((h3) callback).getLastLineBoundRight()) != -1) {
                    i9 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = e3Var.c() + e3Var.s;
        this.a.getClass();
        i9 = AndroidUtilities.dp(18);
        return i9 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.v9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            ik0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        e3 e3Var = this.w.i;
        a70 a70Var = this.a;
        if (e3Var != null) {
            canvas.save();
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.C) {
                a70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                d4 d4Var = this.w;
                canvas.translate(org.telegram.messenger.l0.D(20.0f, this.w.c.e, (dp + d4Var.c.b) - ((int) Math.ceil(d4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                a70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                e4 e4Var = this.w.c;
                canvas.translate(org.telegram.messenger.ll.A(20.0f, e4Var.e, dp2 - e4Var.b), this.f + this.h);
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
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.a, this.b, e3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.a;
            int i13 = this.n;
            view.layout(i13, this.r, view.getMeasuredWidth() + i13, this.d.a.getMeasuredHeight() + this.r);
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
    public final void onMeasure(int i9, int i10) {
        a70 a70Var;
        a70 a70Var2;
        int i11;
        int dp;
        int dp2;
        int i12;
        int i13;
        e3 e3Var;
        e2 e2Var;
        e3 e3Var2;
        e3 e3Var3;
        org.telegram.ui.Components.ik0 ik0Var;
        org.telegram.ui.Cells.n9 n9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i9);
        d4 d4Var = this.w;
        int i14 = 1;
        if (d4Var != null) {
            this.c = null;
            int i15 = 0;
            this.f = (d4Var.j == 0 && d4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            e4 e4Var = this.w.c;
            int i16 = e4Var.c;
            a70 a70Var3 = this.a;
            if (i16 == size2 && e4Var.d == SharedConfig.ivFontSize) {
                a70Var = a70Var3;
            } else {
                e4Var.c = size2;
                e4Var.d = SharedConfig.ivFontSize;
                e4Var.b = 0;
                int size3 = e4Var.a.size();
                int i17 = 0;
                while (i17 < size3) {
                    d4 d4Var2 = (d4) this.w.c.a.get(i17);
                    String str = d4Var2.f;
                    if (str == null) {
                        a70Var2 = a70Var3;
                    } else {
                        a70Var3.getClass();
                        a70 a70Var4 = a70Var3;
                        a70Var2 = a70Var4;
                        d4Var2.i = l4.q(a70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        e4 e4Var2 = this.w.c;
                        e4Var2.b = Math.max(e4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i17++;
                    a70Var3 = a70Var2;
                }
                a70Var = a70Var3;
                e4 e4Var3 = this.w.c;
                e4Var3.b = Math.max(e4Var3.b, (int) Math.ceil(l4.j1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    a70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.z5, org.telegram.ui.ActionBar.f6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.C) {
                a70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                e4 e4Var4 = this.w.c;
                this.e = org.telegram.messenger.l0.D(20.0f, e4Var4.e, dp3 + e4Var4.b);
            } else {
                a70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            a70Var.getClass();
            float f10 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f10)) - this.e;
            if (j4Var != null && j4Var.C) {
                int dp5 = AndroidUtilities.dp(6.0f);
                e4 e4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * e4Var5.e) + (dp5 + e4Var5.b);
            }
            d4 d4Var3 = this.w;
            int i18 = dp4;
            TL_iv.RichText richText = d4Var3.e;
            if (richText != null) {
                e3 p6 = l4.p(this.a, this, null, richText, i18, 0, d4Var3, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
                this.c = p6;
                if (p6 != null && p6.d.getLineCount() > 0) {
                    e3 e3Var4 = this.w.i;
                    if (e3Var4 != null && e3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (j3.r0.j(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    d4 d4Var4 = this.w;
                    i14 = (d4Var4.j == 0 || d4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    e3Var3 = this.c;
                    if (e3Var3 != null) {
                        e3Var3.s = this.e;
                        e3Var3.v = this.f;
                        e3 e3Var5 = this.w.i;
                        if (e3Var5 != null) {
                            e3Var3.x = e3Var5.d.getText();
                        }
                    }
                    ik0Var = this.d;
                    if (ik0Var != null && (ik0Var.a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) a70Var).K0) != null) {
                        ArrayList arrayList = n9Var.F0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.m9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                            if (y9Var instanceof e3) {
                                e3 e3Var6 = (e3) y9Var;
                                e3Var6.s += this.n;
                                e3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (j3.r0.j(1, this.w.c.a) == this.w) {
                }
                d4 d4Var42 = this.w;
                if (d4Var42.j == 0) {
                }
                e3Var3 = this.c;
                if (e3Var3 != null) {
                }
                ik0Var = this.d;
                if (ik0Var != null) {
                    ArrayList arrayList2 = n9Var.F0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.m9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i15 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = d4Var3.d;
                if (pageBlock != null) {
                    int i19 = this.e;
                    this.n = i19;
                    int i20 = this.f;
                    this.r = i20;
                    org.telegram.ui.Components.ik0 ik0Var2 = this.d;
                    if (ik0Var2 != null) {
                        View view = ik0Var2.a;
                        if (view instanceof e2) {
                            this.r = i20 - AndroidUtilities.dp(8.0f);
                            if (j4Var == null || !j4Var.C) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            i12 = AndroidUtilities.dp(18.0f) + i18;
                            i13 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof y1) || (view instanceof u2) || (view instanceof y2) || (view instanceof v2)) {
                                if (j4Var == null || !j4Var.C) {
                                    this.n = i19 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (l4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i13 = 0 - AndroidUtilities.dp(8.0f);
                                i12 = size2;
                            } else if (this.d.a instanceof x2) {
                                this.n -= AndroidUtilities.dp(f10);
                                dp2 = AndroidUtilities.dp(36.0f);
                            } else {
                                i12 = i18;
                                i13 = 0;
                            }
                            i12 = dp2 + i18;
                            i13 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof e2) && (e3Var = this.w.i) != null && e3Var.d.getLineCount() > 0 && (e3Var2 = (e2Var = (e2) this.d.a).c) != null && e3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - e2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i13 -= AndroidUtilities.dp(8.0f);
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
                        i11 = this.d.a.getMeasuredHeight() + i13;
                    } else {
                        i11 = 0;
                    }
                    dp = i11 + AndroidUtilities.dp(8.0f);
                    if (j3.r0.j(1, this.w.c.a) == this.w) {
                    }
                    d4 d4Var422 = this.w;
                    if (d4Var422.j == 0) {
                    }
                    e3Var3 = this.c;
                    if (e3Var3 != null) {
                    }
                    ik0Var = this.d;
                    if (ik0Var != null) {
                    }
                }
                dp = 0;
                if (j3.r0.j(1, this.w.c.a) == this.w) {
                }
                d4 d4Var4222 = this.w;
                if (d4Var4222.j == 0) {
                }
                e3Var3 = this.c;
                if (e3Var3 != null) {
                }
                ik0Var = this.d;
                if (ik0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i14);
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
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                removeView(ik0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.s = I;
                f2.q1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.ik0) x10;
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
