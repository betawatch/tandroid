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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.p9, e3 {
    public final v70 a;
    public final g4 b;
    public b3 c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public a4 w;
    public CheckBoxBase x;

    public b2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a4 a4Var = this.w;
        if ((a4Var != null ? a4Var.i : null) == null) {
            return 0;
        }
        v70 v70Var = this.a;
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.G) {
            v70Var.getClass();
            return org.telegram.messenger.w1.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        v70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        b4 b4Var = this.w.c;
        return org.telegram.messenger.vl.A(20.0f, b4Var.e, dp - b4Var.b);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if (callback instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.w;
        int min = (a4Var == null || a4Var.i == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        b3 b3Var = this.c;
        if (b3Var != null) {
            min = Math.min(min, (b3Var.a() + b3Var.s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
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
        int max = (a4Var == null || a4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        b3 b3Var = this.c;
        if (b3Var != null) {
            max = Math.max(max, b3Var.b() + b3Var.s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
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
        b3 b3Var = this.c;
        if (b3Var == null) {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                KeyEvent.Callback callback = vk0Var.a;
                if ((callback instanceof e3) && (lastLineBoundRight = ((e3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = b3Var.c() + b3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.y9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        b3 b3Var = this.w.i;
        v70 v70Var = this.a;
        if (b3Var != null) {
            canvas.save();
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.G) {
                v70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                a4 a4Var = this.w;
                canvas.translate(org.telegram.messenger.w1.D(20.0f, this.w.c.e, (dp + a4Var.c.b) - ((int) Math.ceil(a4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                v70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                b4 b4Var = this.w.c;
                canvas.translate(org.telegram.messenger.vl.A(20.0f, b4Var.e, dp2 - b4Var.b), this.f + this.h);
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
            i4.v(v70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.a, this.b, b3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.a;
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
        v70 v70Var;
        v70 v70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        b3 b3Var;
        c2 c2Var;
        b3 b3Var2;
        b3 b3Var3;
        org.telegram.ui.Components.vk0 vk0Var;
        org.telegram.ui.Cells.q9 q9Var;
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
            v70 v70Var3 = this.a;
            if (i17 == size2 && b4Var.d == SharedConfig.ivFontSize) {
                v70Var = v70Var3;
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
                        v70Var2 = v70Var3;
                    } else {
                        v70Var3.getClass();
                        v70 v70Var4 = v70Var3;
                        v70Var2 = v70Var4;
                        a4Var2.i = i4.q(v70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        b4 b4Var2 = this.w.c;
                        b4Var2.b = Math.max(b4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    v70Var3 = v70Var2;
                }
                v70Var = v70Var3;
                b4 b4Var3 = this.w.c;
                b4Var3.b = Math.max(b4Var3.b, (int) Math.ceil(i4.n1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    v70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.G) {
                v70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                b4 b4Var4 = this.w.c;
                this.e = org.telegram.messenger.w1.D(20.0f, b4Var4.e, dp3 + b4Var4.b);
            } else {
                v70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            v70Var.getClass();
            float f7 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f7)) - this.e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * b4Var5.e) + (dp5 + b4Var5.b);
            }
            a4 a4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = a4Var3.e;
            if (richText != null) {
                b3 p5 = i4.p(this.a, this, null, richText, i19, 0, a4Var3, (g4Var == null || !g4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a(), 0, this.b);
                this.c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var4 = this.w.i;
                    if (b3Var4 != null && b3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (i2.g.h(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    a4 a4Var4 = this.w;
                    i15 = (a4Var4.j == 0 || a4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    b3Var3 = this.c;
                    if (b3Var3 != null) {
                        b3Var3.s = this.e;
                        b3Var3.v = this.f;
                        b3 b3Var5 = this.w.i;
                        if (b3Var5 != null) {
                            b3Var3.x = b3Var5.d.getText();
                        }
                    }
                    vk0Var = this.d;
                    if (vk0Var != null && (vk0Var.a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) v70Var).O0) != null) {
                        ArrayList arrayList = q9Var.F0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.p9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                            if (baVar instanceof b3) {
                                b3 b3Var6 = (b3) baVar;
                                b3Var6.s += this.n;
                                b3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (i2.g.h(1, this.w.c.a) == this.w) {
                }
                a4 a4Var42 = this.w;
                if (a4Var42.j == 0) {
                }
                b3Var3 = this.c;
                if (b3Var3 != null) {
                }
                vk0Var = this.d;
                if (vk0Var != null) {
                    ArrayList arrayList2 = q9Var.F0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.p9) this.d.a).fillTextLayoutBlocks(arrayList2);
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
                    org.telegram.ui.Components.vk0 vk0Var2 = this.d;
                    if (vk0Var2 != null) {
                        View view = vk0Var2.a;
                        if (view instanceof c2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (g4Var == null || !g4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof w1) || (view instanceof r2) || (view instanceof v2) || (view instanceof s2)) {
                                if (g4Var == null || !g4Var.G) {
                                    this.n = i20 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (i4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof u2) {
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
                        if ((this.d.a instanceof c2) && (b3Var = this.w.i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.a).c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - c2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i14 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof b2) {
                                this.v = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.v = ((y1) view2).s;
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
                    if (i2.g.h(1, this.w.c.a) == this.w) {
                    }
                    a4 a4Var422 = this.w;
                    if (a4Var422.j == 0) {
                    }
                    b3Var3 = this.c;
                    if (b3Var3 != null) {
                    }
                    vk0Var = this.d;
                    if (vk0Var != null) {
                    }
                }
                dp = 0;
                if (i2.g.h(1, this.w.c.a) == this.w) {
                }
                a4 a4Var4222 = this.w;
                if (a4Var4222.j == 0) {
                }
                b3Var3 = this.c;
                if (b3Var3 != null) {
                }
                vk0Var = this.d;
                if (vk0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.w;
        g4 g4Var = this.b;
        if (a4Var2 != a4Var) {
            this.w = a4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
