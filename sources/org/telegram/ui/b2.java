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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.k9, i3 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public org.telegram.ui.Components.dl0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int v;
    public d4 w;
    public boolean x;
    public CheckBoxBase y;

    public b2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.a = p70Var;
        this.b = l4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d4 d4Var = this.w;
        if ((d4Var != null ? d4Var.i : null) == null) {
            return 0;
        }
        p70 p70Var = this.a;
        l4 l4Var = this.b;
        if (l4Var == null || !l4Var.D) {
            p70Var.getClass();
            return org.telegram.messenger.y3.D(12.0f, this.w.c.f, (AndroidUtilities.dp(15) + this.w.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        p70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(15);
        e4 e4Var = this.w.c;
        return b.z(12.0f, e4Var.f, dp - e4Var.c);
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
        int min = this.y != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        d4 d4Var = this.w;
        if (d4Var != null && d4Var.i != null) {
            min = Math.min(min, (this.w.i.a() + a()) - dp);
        }
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
        d4 d4Var = this.w;
        int max = (d4Var == null || d4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
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
                int dp = AndroidUtilities.dp(15);
                d4 d4Var = this.w;
                canvas.translate(org.telegram.messenger.y3.D(12.0f, this.w.c.f, (dp + d4Var.c.c) - ((int) Math.ceil(d4Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                p70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(15);
                e4 e4Var = this.w.c;
                canvas.translate(b.z(12.0f, e4Var.f, dp2 - e4Var.c), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
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

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        p70 p70Var;
        p70 p70Var2;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        int i16;
        org.telegram.ui.Cells.l9 l9Var;
        int size = View.MeasureSpec.getSize(i10);
        d4 d4Var = this.w;
        int i17 = 1;
        if (d4Var != null) {
            this.c = null;
            int i18 = d4Var.j;
            p70 p70Var3 = this.a;
            int i19 = 0;
            if (i18 == 0 && d4Var.c.f == 0) {
                p70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f = i12;
            this.h = 0;
            e4 e4Var = this.w.c;
            if (e4Var.d == size && e4Var.e == SharedConfig.ivFontSize) {
                p70Var = p70Var3;
            } else {
                e4Var.d = size;
                e4Var.e = SharedConfig.ivFontSize;
                e4Var.c = 0;
                int size2 = e4Var.b.size();
                boolean z4 = true;
                int i20 = 0;
                while (i20 < size2) {
                    d4 d4Var2 = (d4) this.w.c.b.get(i20);
                    String str = d4Var2.f;
                    if (str != null) {
                        if (d4Var2.a && "•".equalsIgnoreCase(str)) {
                            d4Var2.i = null;
                        } else {
                            String str2 = d4Var2.f;
                            p70Var3.getClass();
                            p70 p70Var4 = p70Var3;
                            p70Var2 = p70Var4;
                            d4Var2.i = n4.q(p70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f, this.w, this.b);
                            e4 e4Var2 = this.w.c;
                            e4Var2.c = Math.max(e4Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z4 = false;
                            i20++;
                            p70Var3 = p70Var2;
                        }
                    }
                    p70Var2 = p70Var3;
                    i20++;
                    p70Var3 = p70Var2;
                }
                p70Var = p70Var3;
                if (n4.k1 != null && !z4) {
                    e4 e4Var3 = this.w.c;
                    e4Var3.c = Math.max(e4Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            d4 d4Var3 = this.w;
            this.x = !d4Var3.c.a.ordered;
            if (d4Var3.a) {
                if (this.y == null) {
                    p70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(AndroidUtilities.dp(5.0f));
                }
                this.y.f(-1, this.w.b, false);
            } else {
                this.y = null;
            }
            l4 l4Var = this.b;
            if (l4Var == null || !l4Var.D) {
                p70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.y == null ? 0 : 26) + 24);
                e4 e4Var4 = this.w.c;
                this.e = org.telegram.messenger.y3.D(12.0f, e4Var4.f, dp3 + e4Var4.c);
            } else {
                p70Var.getClass();
                this.e = AndroidUtilities.dp((this.y == null ? 0 : 26) + 18);
            }
            p70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.e;
            if (l4Var != null && l4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                e4 e4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(12.0f) * e4Var5.f) + (dp5 + e4Var5.c);
            }
            d4 d4Var4 = this.w;
            int i21 = dp4;
            TL_iv.RichText richText = d4Var4.e;
            if (richText != null) {
                f3 p10 = n4.p(this.a, this, null, richText, i21, 0, d4Var4, (l4Var == null || !l4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    f3 f3Var3 = this.w.i;
                    if (f3Var3 != null && f3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i13 = this.c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = d4Var4.d;
                if (pageBlock != null) {
                    int i22 = this.e;
                    this.n = i22;
                    int i23 = this.f;
                    this.r = i23;
                    org.telegram.ui.Components.dl0 dl0Var = this.d;
                    if (dl0Var != null) {
                        View view = dl0Var.a;
                        if (view instanceof f2) {
                            float f11 = 8;
                            this.r = i23 - AndroidUtilities.dp(f11);
                            if (l4Var == null || !l4Var.D) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i21 + AndroidUtilities.dp(f10);
                            i15 = 0 - AndroidUtilities.dp(f11);
                            i14 = dp6;
                        } else {
                            if ((view instanceof z1) || (view instanceof v2) || (view instanceof z2) || (view instanceof w2)) {
                                if (l4Var == null || !l4Var.D) {
                                    this.n = i22 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (n4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                d4 d4Var5 = this.w;
                                i15 = ((d4Var5.j == 0 && d4Var5.c.f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i14 = size;
                            } else if (this.d.a instanceof y2) {
                                this.n -= AndroidUtilities.dp(f10);
                                dp2 = AndroidUtilities.dp(36);
                            } else {
                                i14 = i21;
                                i15 = 0;
                            }
                            i14 = dp2 + i21;
                            i15 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof f2) && (f3Var = this.w.i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.a).c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - f2Var.c.d.getLineAscent(0);
                        }
                        d4 d4Var6 = this.w;
                        if (d4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (d4Var6.j == 0 && d4Var6.c.f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof e2) {
                                this.s = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.s = ((b2) view2).s;
                            }
                        }
                        if (this.s && this.w.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.w.i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.x = false;
                        }
                        i13 = this.d.a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            }
            if (kf.k0.i(1, this.w.c.b) == this.w) {
                i16 += AndroidUtilities.dp(8);
            }
            d4 d4Var7 = this.w;
            i17 = (d4Var7.j == 0 && d4Var7.c.f == 0) ? AndroidUtilities.dp(10) + i16 : i16;
            f3 f3Var4 = this.c;
            if (f3Var4 != null) {
                f3Var4.s = this.e;
                f3Var4.v = this.f;
            }
            org.telegram.ui.Components.dl0 dl0Var2 = this.d;
            if (dl0Var2 != null && (dl0Var2.a instanceof org.telegram.ui.Cells.k9) && (l9Var = ((n4) p70Var).L0) != null) {
                ArrayList arrayList = l9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.k9) this.d.a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) obj;
                    if (w9Var instanceof f3) {
                        f3 f3Var5 = (f3) w9Var;
                        f3Var5.s += this.n;
                        f3Var5.v += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (n4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.w;
        l4 l4Var = this.b;
        if (d4Var2 != d4Var) {
            this.w = d4Var;
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                removeView(dl0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && l4Var != null) {
                int I = l4.I(pageBlock);
                this.v = I;
                f2.l1 x10 = l4Var.x(this, I);
                this.d = (org.telegram.ui.Components.dl0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && l4Var != null) {
            l4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
