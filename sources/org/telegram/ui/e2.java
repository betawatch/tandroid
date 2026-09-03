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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e2 extends ViewGroup implements org.telegram.ui.Cells.k9, i3 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public org.telegram.ui.Components.dl0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public f4 w;
    public CheckBoxBase x;

    public e2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.a = p70Var;
        this.b = l4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        f4 f4Var = this.w;
        if ((f4Var != null ? f4Var.i : null) == null) {
            return 0;
        }
        p70 p70Var = this.a;
        l4 l4Var = this.b;
        if (l4Var == null || !l4Var.D) {
            p70Var.getClass();
            return org.telegram.messenger.y3.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        p70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        g4 g4Var = this.w.c;
        return b.z(20.0f, g4Var.e, dp - g4Var.b);
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            KeyEvent.Callback callback = dl0Var.a;
            if (callback instanceof org.telegram.ui.Cells.k9) {
                ((org.telegram.ui.Cells.k9) callback).fillTextLayoutBlocks(arrayList);
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
        f4 f4Var = this.w;
        int min = (f4Var == null || f4Var.i == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        f3 f3Var = this.c;
        if (f3Var != null) {
            min = Math.min(min, (f3Var.a() + f3Var.s) - dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            KeyEvent.Callback callback = dl0Var.a;
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
        f4 f4Var = this.w;
        int max = (f4Var == null || f4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        f3 f3Var = this.c;
        if (f3Var != null) {
            max = Math.max(max, f3Var.b() + f3Var.s + dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            KeyEvent.Callback callback = dl0Var.a;
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
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                KeyEvent.Callback callback = dl0Var.a;
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

    @Override // android.view.View, org.telegram.ui.Cells.t9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            dl0Var.a.invalidate();
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
        p70 p70Var = this.a;
        if (f3Var != null) {
            canvas.save();
            l4 l4Var = this.b;
            if (l4Var == null || !l4Var.D) {
                p70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                f4 f4Var = this.w;
                canvas.translate(org.telegram.messenger.y3.D(20.0f, this.w.c.e, (dp + f4Var.c.b) - ((int) Math.ceil(f4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                p70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                g4 g4Var = this.w.c;
                canvas.translate(b.z(20.0f, g4Var.e, dp2 - g4Var.b), this.f + this.h);
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
            n4.v(p70Var, canvas, this, 0);
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
        accessibilityNodeInfo.setText(n4.j(this.a, this.b, f3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.a;
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
        p70 p70Var;
        p70 p70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        f3 f3Var3;
        org.telegram.ui.Components.dl0 dl0Var;
        org.telegram.ui.Cells.l9 l9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        f4 f4Var = this.w;
        int i15 = 1;
        if (f4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (f4Var.j == 0 && f4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            g4 g4Var = this.w.c;
            int i17 = g4Var.c;
            p70 p70Var3 = this.a;
            if (i17 == size2 && g4Var.d == SharedConfig.ivFontSize) {
                p70Var = p70Var3;
            } else {
                g4Var.c = size2;
                g4Var.d = SharedConfig.ivFontSize;
                g4Var.b = 0;
                int size3 = g4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    f4 f4Var2 = (f4) this.w.c.a.get(i18);
                    String str = f4Var2.f;
                    if (str == null) {
                        p70Var2 = p70Var3;
                    } else {
                        p70Var3.getClass();
                        p70 p70Var4 = p70Var3;
                        p70Var2 = p70Var4;
                        f4Var2.i = n4.q(p70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        g4 g4Var2 = this.w.c;
                        g4Var2.b = Math.max(g4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    p70Var3 = p70Var2;
                }
                p70Var = p70Var3;
                g4 g4Var3 = this.w.c;
                g4Var3.b = Math.max(g4Var3.b, (int) Math.ceil(n4.k1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    p70Var.getClass();
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
            l4 l4Var = this.b;
            if (l4Var == null || !l4Var.D) {
                p70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                g4 g4Var4 = this.w.c;
                this.e = org.telegram.messenger.y3.D(20.0f, g4Var4.e, dp3 + g4Var4.b);
            } else {
                p70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            p70Var.getClass();
            float f10 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f10)) - this.e;
            if (l4Var != null && l4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                g4 g4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * g4Var5.e) + (dp5 + g4Var5.b);
            }
            f4 f4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = f4Var3.e;
            if (richText != null) {
                f3 p10 = n4.p(this.a, this, null, richText, i19, 0, f4Var3, (l4Var == null || !l4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    f3 f3Var4 = this.w.i;
                    if (f3Var4 != null && f3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (kf.k0.i(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    f4 f4Var4 = this.w;
                    i15 = (f4Var4.j == 0 || f4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    f3Var3 = this.c;
                    if (f3Var3 != null) {
                        f3Var3.s = this.e;
                        f3Var3.v = this.f;
                        f3 f3Var5 = this.w.i;
                        if (f3Var5 != null) {
                            f3Var3.x = f3Var5.d.getText();
                        }
                    }
                    dl0Var = this.d;
                    if (dl0Var != null && (dl0Var.a instanceof org.telegram.ui.Cells.k9) && (l9Var = ((n4) p70Var).L0) != null) {
                        ArrayList arrayList = l9Var.F0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.k9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) obj;
                            if (w9Var instanceof f3) {
                                f3 f3Var6 = (f3) w9Var;
                                f3Var6.s += this.n;
                                f3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (kf.k0.i(1, this.w.c.a) == this.w) {
                }
                f4 f4Var42 = this.w;
                if (f4Var42.j == 0) {
                }
                f3Var3 = this.c;
                if (f3Var3 != null) {
                }
                dl0Var = this.d;
                if (dl0Var != null) {
                    ArrayList arrayList2 = l9Var.F0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.k9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = f4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.dl0 dl0Var2 = this.d;
                    if (dl0Var2 != null) {
                        View view = dl0Var2.a;
                        if (view instanceof f2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (l4Var == null || !l4Var.D) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof z1) || (view instanceof v2) || (view instanceof z2) || (view instanceof w2)) {
                                if (l4Var == null || !l4Var.D) {
                                    this.n = i20 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (n4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof y2) {
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
                    if (kf.k0.i(1, this.w.c.a) == this.w) {
                    }
                    f4 f4Var422 = this.w;
                    if (f4Var422.j == 0) {
                    }
                    f3Var3 = this.c;
                    if (f3Var3 != null) {
                    }
                    dl0Var = this.d;
                    if (dl0Var != null) {
                    }
                }
                dp = 0;
                if (kf.k0.i(1, this.w.c.a) == this.w) {
                }
                f4 f4Var4222 = this.w;
                if (f4Var4222.j == 0) {
                }
                f3Var3 = this.c;
                if (f3Var3 != null) {
                }
                dl0Var = this.d;
                if (dl0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (n4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(f4 f4Var) {
        f4 f4Var2 = this.w;
        l4 l4Var = this.b;
        if (f4Var2 != f4Var) {
            this.w = f4Var;
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                removeView(dl0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && l4Var != null) {
                int I = l4.I(pageBlock);
                this.s = I;
                f2.l1 x10 = l4Var.x(this, I);
                this.d = (org.telegram.ui.Components.dl0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && l4Var != null) {
            l4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
