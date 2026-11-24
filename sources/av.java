// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class av extends ViewGroup implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public y29 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public xw x;
    public CheckBoxBase y;

    public av(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
    }

    public final int a() {
        xw xwVar = this.x;
        if ((xwVar != null ? xwVar.i : null) == null) {
            return 0;
        }
        vg5 vg5Var = this.a;
        dx dxVar = this.b;
        if (dxVar == null || !dxVar.H) {
            vg5Var.getClass();
            return de9.y(20.0f, this.x.c.e, (gl.L(18.0f) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int h = ug8.h(vg5Var, 18.0f, getMeasuredWidth());
        yw ywVar = this.x.c;
        return (h - ywVar.b) - (gl.L(20.0f) * ywVar.e);
    }

    @Override // dw
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = gl.L(18.0f);
        xw xwVar = this.x;
        int min = (xwVar == null || xwVar.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
        bw bwVar = this.c;
        if (bwVar != null) {
            min = Math.min(min, (bwVar.k() + bwVar.s) - L);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            KeyEvent.Callback callback = y29Var.a;
            if ((callback instanceof dw) && (boundLeft = ((dw) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // dw
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = gl.L(18.0f);
        xw xwVar = this.x;
        int max = (xwVar == null || xwVar.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        bw bwVar = this.c;
        if (bwVar != null) {
            max = Math.max(max, bwVar.l() + bwVar.s + L);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            KeyEvent.Callback callback = y29Var.a;
            if ((callback instanceof dw) && (boundRight = ((dw) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // dw
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        bw bwVar = this.c;
        if (bwVar != null) {
            return ug8.C(this.a, 18.0f, bwVar.m() + bwVar.s);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            KeyEvent.Callback callback = y29Var.a;
            if ((callback instanceof dw) && (lastLineBoundRight = ((dw) callback).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ug8.a(this);
    }

    @Override // android.view.View, mib
    public final void invalidate() {
        super.invalidate();
        y29 y29Var = this.d;
        if (y29Var != null) {
            y29Var.a.invalidate();
        }
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        y29 y29Var = this.d;
        if (y29Var != null) {
            KeyEvent.Callback callback = y29Var.a;
            if (callback instanceof eib) {
                ((eib) callback).k(arrayList);
            }
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bw bwVar = this.x.i;
            vg5 vg5Var = this.a;
            if (bwVar != null) {
                canvas.save();
                dx dxVar = this.b;
                if (dxVar == null || !dxVar.H) {
                    vg5Var.getClass();
                    int L = gl.L(18.0f);
                    xw xwVar = this.x;
                    canvas.translate(de9.y(20.0f, this.x.c.e, (L + xwVar.c.b) - ((int) Math.ceil(xwVar.i.d.getLineWidth(0)))), this.f + this.h);
                } else {
                    int h = ug8.h(vg5Var, 18.0f, measuredWidth);
                    yw ywVar = this.x.c;
                    canvas.translate((h - ywVar.b) - (gl.L(20.0f) * ywVar.e), this.f + this.h);
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - gl.L(26.0f), this.f, gl.L(20.0f), gl.L(20.0f));
                this.y.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(vg5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bwVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            int i5 = this.n;
            view.layout(i5, this.r, view.getMeasuredWidth() + i5, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0343  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        xw xwVar;
        vg5 vg5Var;
        int i3;
        int L;
        int L2;
        int i4;
        bw bwVar;
        bv bvVar;
        bw bwVar2;
        bw bwVar3;
        y29 y29Var;
        fib fibVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        xw xwVar2 = this.x;
        int i5 = 1;
        if (xwVar2 != null) {
            this.c = null;
            int i6 = 0;
            this.f = (xwVar2.j == 0 && xwVar2.c.e == 0) ? gl.L(10.0f) : 0;
            this.h = 0;
            yw ywVar = this.x.c;
            int i7 = ywVar.c;
            vg5 vg5Var2 = this.a;
            if (i7 != size2 || ywVar.d != gba.W0) {
                ywVar.c = size2;
                ywVar.d = gba.W0;
                ywVar.b = 0;
                int size3 = ywVar.a.size();
                int i8 = 0;
                while (true) {
                    xwVar = this.x;
                    if (i8 >= size3) {
                        break;
                    }
                    xw xwVar3 = (xw) xwVar.c.a.get(i8);
                    String str = xwVar3.f;
                    if (str != null) {
                        vg5 vg5Var3 = vg5Var2;
                        bw m = o.m(vg5Var3, this, str, null, ug8.h(vg5Var2, 54.0f, size2), this.f, this.x, this.b);
                        vg5Var2 = vg5Var3;
                        xwVar3.i = m;
                        yw ywVar2 = this.x.c;
                        ywVar2.b = Math.max(ywVar2.b, (int) Math.ceil(m.d.getLineWidth(0)));
                    }
                    i8++;
                }
                yw ywVar3 = xwVar.c;
                ywVar3.b = Math.max(ywVar3.b, (int) Math.ceil(o.p1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    vg5Var2.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this);
                    this.y = checkBoxBase;
                    checkBoxBase.h(bkb.Xl, bkb.y5, bkb.j7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(gl.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            dx dxVar = this.b;
            if (dxVar == null || !dxVar.H) {
                vg5Var2.getClass();
                int L3 = gl.L((this.y == null ? 0 : 26) + 24);
                yw ywVar4 = this.x.c;
                this.e = de9.y(20.0f, ywVar4.e, L3 + ywVar4.b);
            } else {
                vg5Var2.getClass();
                this.e = gl.L(18 + (this.y == null ? 0 : 26));
            }
            this.w = false;
            int h = ug8.h(vg5Var2, 18.0f, size2) - this.e;
            if (dxVar != null && dxVar.H) {
                int L4 = gl.L(6.0f);
                yw ywVar5 = this.x.c;
                h -= (gl.L(20.0f) * ywVar5.e) + (L4 + ywVar5.b);
            }
            xw xwVar4 = this.x;
            vg5 vg5Var4 = vg5Var2;
            TL_iv.RichText richText = xwVar4.e;
            if (richText != null) {
                vg5Var = vg5Var4;
                bw n = o.n(this.a, this, null, richText, h, 0, xwVar4, (dxVar == null || !dxVar.H) ? Layout.Alignment.ALIGN_NORMAL : lwa.a(), 0, this.b);
                this.c = n;
                if (n != null && n.d.getLineCount() > 0) {
                    bw bwVar4 = this.x.i;
                    if (bwVar4 != null && bwVar4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = gl.L(8.0f) + this.c.d.getHeight();
                    if (b00.f(1, this.x.c.a) == this.x) {
                        L += gl.L(8.0f);
                    }
                    xw xwVar5 = this.x;
                    i5 = (xwVar5.j == 0 || xwVar5.c.e != 0) ? L : gl.L(10.0f) + L;
                    bwVar3 = this.c;
                    if (bwVar3 != null) {
                        bwVar3.s = this.e;
                        bwVar3.w = this.f;
                        bw bwVar5 = this.x.i;
                        if (bwVar5 != null) {
                            bwVar3.y = bwVar5.d.getText();
                        }
                    }
                    y29Var = this.d;
                    if (y29Var != null && (y29Var.a instanceof eib) && (fibVar = ((o) vg5Var).Q0) != null) {
                        ArrayList arrayList = fibVar.A0;
                        arrayList.clear();
                        ((eib) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            pib pibVar = (pib) obj;
                            if (pibVar instanceof bw) {
                                bw bwVar6 = (bw) pibVar;
                                bwVar6.s += this.n;
                                bwVar6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (b00.f(1, this.x.c.a) == this.x) {
                }
                xw xwVar52 = this.x;
                if (xwVar52.j == 0) {
                }
                bwVar3 = this.c;
                if (bwVar3 != null) {
                }
                y29Var = this.d;
                if (y29Var != null) {
                    ArrayList arrayList2 = fibVar.A0;
                    arrayList2.clear();
                    ((eib) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i6 < size) {
                    }
                }
            } else {
                vg5Var = vg5Var4;
                TL_iv.PageBlock pageBlock = xwVar4.d;
                if (pageBlock != null) {
                    int i9 = this.e;
                    this.n = i9;
                    int i10 = this.f;
                    this.r = i10;
                    y29 y29Var2 = this.d;
                    if (y29Var2 != null) {
                        View view = y29Var2.a;
                        if (view instanceof bv) {
                            this.r = i10 - gl.L(8.0f);
                            if (dxVar == null || !dxVar.H) {
                                this.n -= gl.L(18.0f);
                            }
                            h += gl.L(18.0f);
                            i4 = 0 - gl.L(8.0f);
                        } else {
                            if ((view instanceof vu) || (view instanceof qv) || (view instanceof vv) || (view instanceof rv)) {
                                if (dxVar == null || !dxVar.H) {
                                    this.n = i9 - gl.L(18.0f);
                                }
                                L2 = gl.L(18.0f);
                            } else if (o.I(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i4 = 0 - gl.L(8.0f);
                                h = size2;
                            } else {
                                if (this.d.a instanceof uv) {
                                    this.n -= gl.L(18.0f);
                                    L2 = gl.L(36.0f);
                                }
                                i4 = 0;
                            }
                            h += L2;
                            i4 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(h, TLObject.FLAG_30), 0);
                        if ((this.d.a instanceof bv) && (bwVar = this.x.i) != null && bwVar.d.getLineCount() > 0 && (bwVar2 = (bvVar = (bv) this.d.a).c) != null && bwVar2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - bvVar.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i4 -= gl.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof av) {
                                this.w = ((av) view2).w;
                            } else if (view2 instanceof xu) {
                                this.w = ((xu) view2).s;
                            }
                        }
                        if (this.w && this.x.i != null) {
                            this.f = (this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2;
                        }
                        i3 = this.d.a.getMeasuredHeight() + i4;
                    } else {
                        i3 = 0;
                    }
                    L = i3 + gl.L(8.0f);
                    if (b00.f(1, this.x.c.a) == this.x) {
                    }
                    xw xwVar522 = this.x;
                    if (xwVar522.j == 0) {
                    }
                    bwVar3 = this.c;
                    if (bwVar3 != null) {
                    }
                    y29Var = this.d;
                    if (y29Var != null) {
                    }
                }
                L = 0;
                if (b00.f(1, this.x.c.a) == this.x) {
                }
                xw xwVar5222 = this.x;
                if (xwVar5222.j == 0) {
                }
                bwVar3 = this.c;
                if (bwVar3 != null) {
                }
                y29Var = this.d;
                if (y29Var != null) {
                }
            }
        }
        setMeasuredDimension(size2, i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(xw xwVar) {
        xw xwVar2 = this.x;
        dx dxVar = this.b;
        if (xwVar2 != xwVar) {
            this.x = xwVar;
            y29 y29Var = this.d;
            if (y29Var != null) {
                removeView(y29Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && dxVar != null) {
                int I = dx.I(pageBlock);
                this.s = I;
                s49 x = dxVar.x(this, I);
                this.d = (y29) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && dxVar != null) {
            dxVar.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
