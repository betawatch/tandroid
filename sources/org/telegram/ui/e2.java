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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e2 extends ViewGroup implements org.telegram.ui.Cells.j9, i3 {
    public final d70 a;
    public final k4 b;
    public f3 c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public e4 w;
    public CheckBoxBase x;

    public e2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.a = d70Var;
        this.b = k4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        e4 e4Var = this.w;
        if ((e4Var != null ? e4Var.i : null) == null) {
            return 0;
        }
        d70 d70Var = this.a;
        k4 k4Var = this.b;
        if (k4Var == null || !k4Var.C) {
            d70Var.getClass();
            return org.telegram.messenger.x3.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        d70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        f4 f4Var = this.w.c;
        return b.z(20.0f, f4Var.e, dp - f4Var.b);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if (callback instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        e4 e4Var = this.w;
        int min = (e4Var == null || e4Var.i == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        f3 f3Var = this.c;
        if (f3Var != null) {
            min = Math.min(min, (f3Var.a() + f3Var.s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof i3) && (boundLeft = ((i3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        e4 e4Var = this.w;
        int max = (e4Var == null || e4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        f3 f3Var = this.c;
        if (f3Var != null) {
            max = Math.max(max, f3Var.b() + f3Var.s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof i3) && (boundRight = ((i3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        f3 f3Var = this.c;
        if (f3Var == null) {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                KeyEvent.Callback callback = vk0Var.a;
                if ((callback instanceof i3) && (lastLineBoundRight = ((i3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = f3Var.c() + f3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.s9
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
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        f3 f3Var = this.w.i;
        d70 d70Var = this.a;
        if (f3Var != null) {
            canvas.save();
            k4 k4Var = this.b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                e4 e4Var = this.w;
                canvas.translate(org.telegram.messenger.x3.D(20.0f, this.w.c.e, (dp + e4Var.c.b) - ((int) Math.ceil(e4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                d70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                f4 f4Var = this.w.c;
                canvas.translate(b.z(20.0f, f4Var.e, dp2 - f4Var.b), this.f + this.h);
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
            m4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.a, this.b, f3Var));
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
        d70 d70Var;
        d70 d70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        f3 f3Var3;
        org.telegram.ui.Components.vk0 vk0Var;
        org.telegram.ui.Cells.k9 k9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        e4 e4Var = this.w;
        int i15 = 1;
        if (e4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (e4Var.j == 0 && e4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            f4 f4Var = this.w.c;
            int i17 = f4Var.c;
            d70 d70Var3 = this.a;
            if (i17 == size2 && f4Var.d == SharedConfig.ivFontSize) {
                d70Var = d70Var3;
            } else {
                f4Var.c = size2;
                f4Var.d = SharedConfig.ivFontSize;
                f4Var.b = 0;
                int size3 = f4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    e4 e4Var2 = (e4) this.w.c.a.get(i18);
                    String str = e4Var2.f;
                    if (str == null) {
                        d70Var2 = d70Var3;
                    } else {
                        d70Var3.getClass();
                        d70 d70Var4 = d70Var3;
                        d70Var2 = d70Var4;
                        e4Var2.i = m4.q(d70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        f4 f4Var2 = this.w.c;
                        f4Var2.b = Math.max(f4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    d70Var3 = d70Var2;
                }
                d70Var = d70Var3;
                f4 f4Var3 = this.w.c;
                f4Var3.b = Math.max(f4Var3.b, (int) Math.ceil(m4.j1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    d70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.z5, org.telegram.ui.ActionBar.g6.k7);
                    this.x.d(10);
                    this.x.k(true);
                    this.x.i(AndroidUtilities.dp(5.0f));
                }
                this.x.f(-1, this.w.b, false);
            } else {
                this.x = null;
            }
            k4 k4Var = this.b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                f4 f4Var4 = this.w.c;
                this.e = org.telegram.messenger.x3.D(20.0f, f4Var4.e, dp3 + f4Var4.b);
            } else {
                d70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            d70Var.getClass();
            float f9 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f9)) - this.e;
            if (k4Var != null && k4Var.C) {
                int dp5 = AndroidUtilities.dp(6.0f);
                f4 f4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * f4Var5.e) + (dp5 + f4Var5.b);
            }
            e4 e4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = e4Var3.e;
            if (richText != null) {
                f3 p10 = m4.p(this.a, this, null, richText, i19, 0, e4Var3, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.bw0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    f3 f3Var4 = this.w.i;
                    if (f3Var4 != null && f3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (j7.l1.i(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    e4 e4Var4 = this.w;
                    i15 = (e4Var4.j == 0 || e4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    f3Var3 = this.c;
                    if (f3Var3 != null) {
                        f3Var3.s = this.e;
                        f3Var3.v = this.f;
                        f3 f3Var5 = this.w.i;
                        if (f3Var5 != null) {
                            f3Var3.x = f3Var5.d.getText();
                        }
                    }
                    vk0Var = this.d;
                    if (vk0Var != null && (vk0Var.a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((m4) d70Var).K0) != null) {
                        ArrayList arrayList = k9Var.F0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.j9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) obj;
                            if (v9Var instanceof f3) {
                                f3 f3Var6 = (f3) v9Var;
                                f3Var6.s += this.n;
                                f3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (j7.l1.i(1, this.w.c.a) == this.w) {
                }
                e4 e4Var42 = this.w;
                if (e4Var42.j == 0) {
                }
                f3Var3 = this.c;
                if (f3Var3 != null) {
                }
                vk0Var = this.d;
                if (vk0Var != null) {
                    ArrayList arrayList2 = k9Var.F0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.j9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = e4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.vk0 vk0Var2 = this.d;
                    if (vk0Var2 != null) {
                        View view = vk0Var2.a;
                        if (view instanceof f2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (k4Var == null || !k4Var.C) {
                                this.n -= AndroidUtilities.dp(f9);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof z1) || (view instanceof v2) || (view instanceof z2) || (view instanceof w2)) {
                                if (k4Var == null || !k4Var.C) {
                                    this.n = i20 - AndroidUtilities.dp(f9);
                                }
                                dp2 = AndroidUtilities.dp(f9);
                            } else if (m4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof y2) {
                                this.n -= AndroidUtilities.dp(f9);
                                dp2 = AndroidUtilities.dp(36.0f);
                            } else {
                                i13 = i19;
                                i14 = 0;
                            }
                            i13 = dp2 + i19;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof f2) && (f3Var = this.w.i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.a).c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = this.w.i.d.getLineAscent(0) - f2Var.c.d.getLineAscent(0);
                        }
                        if (this.w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.r = 0;
                            i14 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof e2) {
                                this.v = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.v = ((b2) view2).s;
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
                    if (j7.l1.i(1, this.w.c.a) == this.w) {
                    }
                    e4 e4Var422 = this.w;
                    if (e4Var422.j == 0) {
                    }
                    f3Var3 = this.c;
                    if (f3Var3 != null) {
                    }
                    vk0Var = this.d;
                    if (vk0Var != null) {
                    }
                }
                dp = 0;
                if (j7.l1.i(1, this.w.c.a) == this.w) {
                }
                e4 e4Var4222 = this.w;
                if (e4Var4222.j == 0) {
                }
                f3Var3 = this.c;
                if (f3Var3 != null) {
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
        if (m4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(e4 e4Var) {
        e4 e4Var2 = this.w;
        k4 k4Var = this.b;
        if (e4Var2 != e4Var) {
            this.w = e4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && k4Var != null) {
                int I = k4.I(pageBlock);
                this.s = I;
                f2.n1 x4 = k4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x4;
                addView(x4.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && k4Var != null) {
            k4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
