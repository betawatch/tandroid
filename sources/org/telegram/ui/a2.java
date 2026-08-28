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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public org.telegram.ui.Components.ik0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int v;
    public b4 w;
    public boolean x;
    public CheckBoxBase y;

    public a2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b4 b4Var = this.w;
        if ((b4Var != null ? b4Var.i : null) == null) {
            return 0;
        }
        a70 a70Var = this.a;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.C) {
            a70Var.getClass();
            return org.telegram.messenger.l0.D(12.0f, this.w.c.f, (AndroidUtilities.dp(15) + this.w.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        a70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(15);
        c4 c4Var = this.w.c;
        return org.telegram.messenger.ll.A(12.0f, c4Var.f, dp - c4Var.c);
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
        int min = this.y != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        b4 b4Var = this.w;
        if (b4Var != null && b4Var.i != null) {
            min = Math.min(min, (this.w.i.a() + a()) - dp);
        }
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
        b4 b4Var = this.w;
        int max = (b4Var == null || b4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
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
                int dp = AndroidUtilities.dp(15);
                b4 b4Var = this.w;
                canvas.translate(org.telegram.messenger.l0.D(12.0f, this.w.c.f, (dp + b4Var.c.c) - ((int) Math.ceil(b4Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                a70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(15);
                c4 c4Var = this.w.c;
                canvas.translate(org.telegram.messenger.ll.A(12.0f, c4Var.f, dp2 - c4Var.c), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            }
            this.w.i.draw(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.y;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
            this.y.a(canvas);
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

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        a70 a70Var;
        a70 a70Var2;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        e3 e3Var;
        e2 e2Var;
        e3 e3Var2;
        int i15;
        org.telegram.ui.Cells.n9 n9Var;
        int size = View.MeasureSpec.getSize(i9);
        b4 b4Var = this.w;
        int i16 = 1;
        if (b4Var != null) {
            this.c = null;
            int i17 = b4Var.j;
            a70 a70Var3 = this.a;
            int i18 = 0;
            if (i17 == 0 && b4Var.c.f == 0) {
                a70Var3.getClass();
                i11 = AndroidUtilities.dp(10);
            } else {
                i11 = 0;
            }
            this.f = i11;
            this.h = 0;
            c4 c4Var = this.w.c;
            if (c4Var.d == size && c4Var.e == SharedConfig.ivFontSize) {
                a70Var = a70Var3;
            } else {
                c4Var.d = size;
                c4Var.e = SharedConfig.ivFontSize;
                c4Var.c = 0;
                int size2 = c4Var.b.size();
                boolean z10 = true;
                int i19 = 0;
                while (i19 < size2) {
                    b4 b4Var2 = (b4) this.w.c.b.get(i19);
                    String str = b4Var2.f;
                    if (str != null) {
                        if (b4Var2.a && "•".equalsIgnoreCase(str)) {
                            b4Var2.i = null;
                        } else {
                            String str2 = b4Var2.f;
                            a70Var3.getClass();
                            a70 a70Var4 = a70Var3;
                            a70Var2 = a70Var4;
                            b4Var2.i = l4.q(a70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f, this.w, this.b);
                            c4 c4Var2 = this.w.c;
                            c4Var2.c = Math.max(c4Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z10 = false;
                            i19++;
                            a70Var3 = a70Var2;
                        }
                    }
                    a70Var2 = a70Var3;
                    i19++;
                    a70Var3 = a70Var2;
                }
                a70Var = a70Var3;
                if (l4.j1 != null && !z10) {
                    c4 c4Var3 = this.w.c;
                    c4Var3.c = Math.max(c4Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            b4 b4Var3 = this.w;
            this.x = !b4Var3.c.a.ordered;
            if (b4Var3.a) {
                if (this.y == null) {
                    a70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.z5, org.telegram.ui.ActionBar.f6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(AndroidUtilities.dp(5.0f));
                }
                this.y.f(-1, this.w.b, false);
            } else {
                this.y = null;
            }
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.C) {
                a70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.y == null ? 0 : 26) + 24);
                c4 c4Var4 = this.w.c;
                this.e = org.telegram.messenger.l0.D(12.0f, c4Var4.f, dp3 + c4Var4.c);
            } else {
                a70Var.getClass();
                this.e = AndroidUtilities.dp((this.y == null ? 0 : 26) + 18);
            }
            a70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.e;
            if (j4Var != null && j4Var.C) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(12.0f) * c4Var5.f) + (dp5 + c4Var5.c);
            }
            b4 b4Var4 = this.w;
            int i20 = dp4;
            TL_iv.RichText richText = b4Var4.e;
            if (richText != null) {
                e3 p6 = l4.p(this.a, this, null, richText, i20, 0, b4Var4, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
                this.c = p6;
                if (p6 != null && p6.d.getLineCount() > 0) {
                    e3 e3Var3 = this.w.i;
                    if (e3Var3 != null && e3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i12 = this.c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i15 = dp + i12;
                }
                i15 = 0;
            } else {
                TL_iv.PageBlock pageBlock = b4Var4.d;
                if (pageBlock != null) {
                    int i21 = this.e;
                    this.n = i21;
                    int i22 = this.f;
                    this.r = i22;
                    org.telegram.ui.Components.ik0 ik0Var = this.d;
                    if (ik0Var != null) {
                        View view = ik0Var.a;
                        if (view instanceof e2) {
                            float f11 = 8;
                            this.r = i22 - AndroidUtilities.dp(f11);
                            if (j4Var == null || !j4Var.C) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i20 + AndroidUtilities.dp(f10);
                            i14 = 0 - AndroidUtilities.dp(f11);
                            i13 = dp6;
                        } else {
                            if ((view instanceof y1) || (view instanceof u2) || (view instanceof y2) || (view instanceof v2)) {
                                if (j4Var == null || !j4Var.C) {
                                    this.n = i21 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (l4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                b4 b4Var5 = this.w;
                                i14 = ((b4Var5.j == 0 && b4Var5.c.f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i13 = size;
                            } else if (this.d.a instanceof x2) {
                                this.n -= AndroidUtilities.dp(f10);
                                dp2 = AndroidUtilities.dp(36);
                            } else {
                                i13 = i20;
                                i14 = 0;
                            }
                            i13 = dp2 + i20;
                            i14 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof e2) && (e3Var = this.w.i) != null && e3Var.d.getLineCount() > 0 && (e3Var2 = (e2Var = (e2) this.d.a).c) != null && e3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - e2Var.c.d.getLineAscent(0);
                        }
                        b4 b4Var6 = this.w;
                        if (b4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (b4Var6.j == 0 && b4Var6.c.f == 0) {
                                i14 -= AndroidUtilities.dp(10);
                            }
                            i14 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof d2) {
                                this.s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.s = ((a2) view2).s;
                            }
                        }
                        if (this.s && this.w.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.w.i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.x = false;
                        }
                        i12 = this.d.a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i15 = dp + i12;
                }
                i15 = 0;
            }
            if (j3.r0.j(1, this.w.c.b) == this.w) {
                i15 += AndroidUtilities.dp(8);
            }
            b4 b4Var7 = this.w;
            i16 = (b4Var7.j == 0 && b4Var7.c.f == 0) ? AndroidUtilities.dp(10) + i15 : i15;
            e3 e3Var4 = this.c;
            if (e3Var4 != null) {
                e3Var4.s = this.e;
                e3Var4.v = this.f;
            }
            org.telegram.ui.Components.ik0 ik0Var2 = this.d;
            if (ik0Var2 != null && (ik0Var2.a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) a70Var).K0) != null) {
                ArrayList arrayList = n9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.m9) this.d.a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i18 < size3) {
                    Object obj = arrayList.get(i18);
                    i18++;
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                    if (y9Var instanceof e3) {
                        e3 e3Var5 = (e3) y9Var;
                        e3Var5.s += this.n;
                        e3Var5.v += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.w;
        j4 j4Var = this.b;
        if (b4Var2 != b4Var) {
            this.w = b4Var;
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                removeView(ik0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                f2.q1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.ik0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
