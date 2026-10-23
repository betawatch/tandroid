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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.n9, f3 {
    public final f70 a;
    public final i4 b;
    public c3 c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public b4 w;
    public CheckBoxBase x;

    public c2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.a = f70Var;
        this.b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b4 b4Var = this.w;
        if ((b4Var != null ? b4Var.i : null) == null) {
            return 0;
        }
        f70 f70Var = this.a;
        i4 i4Var = this.b;
        if (i4Var == null || !i4Var.G) {
            f70Var.getClass();
            return org.telegram.messenger.v0.D(20.0f, this.w.c.e, (AndroidUtilities.dp(18) + this.w.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        f70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(18);
        c4 c4Var = this.w.c;
        return org.telegram.messenger.sl.B(20.0f, c4Var.e, dp - c4Var.b);
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            KeyEvent.Callback callback = wl0Var.a;
            if (callback instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override // org.telegram.ui.f3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.w;
        int min = (b4Var == null || b4Var.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.w.i.a() + a()) - dp);
        c3 c3Var = this.c;
        if (c3Var != null) {
            min = Math.min(min, (c3Var.a() + c3Var.s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            KeyEvent.Callback callback = wl0Var.a;
            if ((callback instanceof f3) && (boundLeft = ((f3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.f3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.w;
        int max = (b4Var == null || b4Var.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        c3 c3Var = this.c;
        if (c3Var != null) {
            max = Math.max(max, c3Var.b() + c3Var.s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            KeyEvent.Callback callback = wl0Var.a;
            if ((callback instanceof f3) && (boundRight = ((f3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.f3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        c3 c3Var = this.c;
        if (c3Var == null) {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                KeyEvent.Callback callback = wl0Var.a;
                if ((callback instanceof f3) && (lastLineBoundRight = ((f3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = c3Var.c() + c3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.w9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        c3 c3Var = this.w.i;
        f70 f70Var = this.a;
        if (c3Var != null) {
            canvas.save();
            i4 i4Var = this.b;
            if (i4Var == null || !i4Var.G) {
                f70Var.getClass();
                int dp = AndroidUtilities.dp(18);
                b4 b4Var = this.w;
                canvas.translate(org.telegram.messenger.v0.D(20.0f, this.w.c.e, (dp + b4Var.c.b) - ((int) Math.ceil(b4Var.i.d.getLineWidth(0)))), this.f + this.h);
            } else {
                f70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(18);
                c4 c4Var = this.w.c;
                canvas.translate(org.telegram.messenger.sl.B(20.0f, c4Var.e, dp2 - c4Var.b), this.f + this.h);
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
            k4.v(f70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.a, this.b, c3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.a;
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
        f70 f70Var;
        f70 f70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        c3 c3Var;
        d2 d2Var;
        c3 c3Var2;
        c3 c3Var3;
        org.telegram.ui.Components.wl0 wl0Var;
        org.telegram.ui.Cells.o9 o9Var;
        int size;
        int size2 = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.w;
        int i15 = 1;
        if (b4Var != null) {
            this.c = null;
            int i16 = 0;
            this.f = (b4Var.j == 0 && b4Var.c.e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            c4 c4Var = this.w.c;
            int i17 = c4Var.c;
            f70 f70Var3 = this.a;
            if (i17 == size2 && c4Var.d == SharedConfig.ivFontSize) {
                f70Var = f70Var3;
            } else {
                c4Var.c = size2;
                c4Var.d = SharedConfig.ivFontSize;
                c4Var.b = 0;
                int size3 = c4Var.a.size();
                int i18 = 0;
                while (i18 < size3) {
                    b4 b4Var2 = (b4) this.w.c.a.get(i18);
                    String str = b4Var2.f;
                    if (str == null) {
                        f70Var2 = f70Var3;
                    } else {
                        f70Var3.getClass();
                        f70 f70Var4 = f70Var3;
                        f70Var2 = f70Var4;
                        b4Var2.i = k4.q(f70Var4, this, str, null, size2 - AndroidUtilities.dp(54), this.f, this.w, this.b);
                        c4 c4Var2 = this.w.c;
                        c4Var2.b = Math.max(c4Var2.b, (int) Math.ceil(r2.d.getLineWidth(0)));
                    }
                    i18++;
                    f70Var3 = f70Var2;
                }
                f70Var = f70Var3;
                c4 c4Var3 = this.w.c;
                c4Var3.b = Math.max(c4Var3.b, (int) Math.ceil(k4.o1.measureText("00.")));
            }
            if (this.w.a) {
                if (this.x == null) {
                    f70Var.getClass();
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
            i4 i4Var = this.b;
            if (i4Var == null || !i4Var.G) {
                f70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.x == null ? 0 : 26) + 24);
                c4 c4Var4 = this.w.c;
                this.e = org.telegram.messenger.v0.D(20.0f, c4Var4.e, dp3 + c4Var4.b);
            } else {
                f70Var.getClass();
                this.e = AndroidUtilities.dp((this.x == null ? 0 : 26) + 18);
            }
            this.v = false;
            f70Var.getClass();
            float f7 = 18;
            int dp4 = (size2 - AndroidUtilities.dp(f7)) - this.e;
            if (i4Var != null && i4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(20.0f) * c4Var5.e) + (dp5 + c4Var5.b);
            }
            b4 b4Var3 = this.w;
            int i19 = dp4;
            TL_iv.RichText richText = b4Var3.e;
            if (richText != null) {
                c3 p5 = k4.p(this.a, this, null, richText, i19, 0, b4Var3, (i4Var == null || !i4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ix0.a(), 0, this.b);
                this.c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    c3 c3Var4 = this.w.i;
                    if (c3Var4 != null && c3Var4.d.getLineCount() > 0) {
                        this.h = this.w.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    dp = AndroidUtilities.dp(8.0f) + this.c.d.getHeight();
                    if (i2.o1.i(1, this.w.c.a) == this.w) {
                        dp += AndroidUtilities.dp(8.0f);
                    }
                    b4 b4Var4 = this.w;
                    i15 = (b4Var4.j == 0 || b4Var4.c.e != 0) ? dp : AndroidUtilities.dp(10.0f) + dp;
                    c3Var3 = this.c;
                    if (c3Var3 != null) {
                        c3Var3.s = this.e;
                        c3Var3.v = this.f;
                        c3 c3Var5 = this.w.i;
                        if (c3Var5 != null) {
                            c3Var3.x = c3Var5.d.getText();
                        }
                    }
                    wl0Var = this.d;
                    if (wl0Var != null && (wl0Var.a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((k4) f70Var).P0) != null) {
                        ArrayList arrayList = o9Var.A0;
                        arrayList.clear();
                        ((org.telegram.ui.Cells.n9) this.d.a).fillTextLayoutBlocks(arrayList);
                        size = arrayList.size();
                        while (i16 < size) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                            if (z9Var instanceof c3) {
                                c3 c3Var6 = (c3) z9Var;
                                c3Var6.s += this.n;
                                c3Var6.v += this.r;
                            }
                        }
                    }
                }
                dp = 0;
                if (i2.o1.i(1, this.w.c.a) == this.w) {
                }
                b4 b4Var42 = this.w;
                if (b4Var42.j == 0) {
                }
                c3Var3 = this.c;
                if (c3Var3 != null) {
                }
                wl0Var = this.d;
                if (wl0Var != null) {
                    ArrayList arrayList2 = o9Var.A0;
                    arrayList2.clear();
                    ((org.telegram.ui.Cells.n9) this.d.a).fillTextLayoutBlocks(arrayList2);
                    size = arrayList2.size();
                    while (i16 < size) {
                    }
                }
            } else {
                TL_iv.PageBlock pageBlock = b4Var3.d;
                if (pageBlock != null) {
                    int i20 = this.e;
                    this.n = i20;
                    int i21 = this.f;
                    this.r = i21;
                    org.telegram.ui.Components.wl0 wl0Var2 = this.d;
                    if (wl0Var2 != null) {
                        View view = wl0Var2.a;
                        if (view instanceof d2) {
                            this.r = i21 - AndroidUtilities.dp(8.0f);
                            if (i4Var == null || !i4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            i13 = AndroidUtilities.dp(18.0f) + i19;
                            i14 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof x1) || (view instanceof s2) || (view instanceof w2) || (view instanceof t2)) {
                                if (i4Var == null || !i4Var.G) {
                                    this.n = i20 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (k4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i14 = 0 - AndroidUtilities.dp(8.0f);
                                i13 = size2;
                            } else if (this.d.a instanceof v2) {
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
                        if ((this.d.a instanceof d2) && (c3Var = this.w.i) != null && c3Var.d.getLineCount() > 0 && (c3Var2 = (d2Var = (d2) this.d.a).c) != null && c3Var2.d.getLineCount() > 0) {
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
                    if (i2.o1.i(1, this.w.c.a) == this.w) {
                    }
                    b4 b4Var422 = this.w;
                    if (b4Var422.j == 0) {
                    }
                    c3Var3 = this.c;
                    if (c3Var3 != null) {
                    }
                    wl0Var = this.d;
                    if (wl0Var != null) {
                    }
                }
                dp = 0;
                if (i2.o1.i(1, this.w.c.a) == this.w) {
                }
                b4 b4Var4222 = this.w;
                if (b4Var4222.j == 0) {
                }
                c3Var3 = this.c;
                if (c3Var3 != null) {
                }
                wl0Var = this.d;
                if (wl0Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.w;
        i4 i4Var = this.b;
        if (b4Var2 != b4Var) {
            this.w = b4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.s = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
