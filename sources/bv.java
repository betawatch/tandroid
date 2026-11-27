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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bv extends ViewGroup implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public n69 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public yw x;
    public CheckBoxBase y;

    public bv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        setWillNotDraw(false);
    }

    public final int a() {
        yw ywVar = this.x;
        if ((ywVar != null ? ywVar.i : null) == null) {
            return 0;
        }
        xi5 xi5Var = this.a;
        ex exVar = this.b;
        if (exVar == null || !exVar.H) {
            xi5Var.getClass();
            return uh9.y(20.0f, this.x.c.e, (hl.L(18.0f) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int h = ik8.h(xi5Var, 18.0f, getMeasuredWidth());
        zw zwVar = this.x.c;
        return (h - zwVar.b) - (hl.L(20.0f) * zwVar.e);
    }

    @Override // ew
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = hl.L(18.0f);
        yw ywVar = this.x;
        int min = (ywVar == null || ywVar.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
        cw cwVar = this.c;
        if (cwVar != null) {
            min = Math.min(min, (cwVar.k() + cwVar.s) - L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (boundLeft = ((ew) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // ew
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = hl.L(18.0f);
        yw ywVar = this.x;
        int max = (ywVar == null || ywVar.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        cw cwVar = this.c;
        if (cwVar != null) {
            max = Math.max(max, cwVar.l() + cwVar.s + L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (boundRight = ((ew) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // ew
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        cw cwVar = this.c;
        if (cwVar != null) {
            return ik8.C(this.a, 18.0f, cwVar.m() + cwVar.s);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if ((callback instanceof ew) && (lastLineBoundRight = ((ew) callback).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ik8.a(this);
    }

    @Override // android.view.View, hmb
    public final void invalidate() {
        super.invalidate();
        n69 n69Var = this.d;
        if (n69Var != null) {
            n69Var.a.invalidate();
        }
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            KeyEvent.Callback callback = n69Var.a;
            if (callback instanceof zlb) {
                ((zlb) callback).k(arrayList);
            }
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            cw cwVar = this.x.i;
            xi5 xi5Var = this.a;
            if (cwVar != null) {
                canvas.save();
                ex exVar = this.b;
                if (exVar == null || !exVar.H) {
                    xi5Var.getClass();
                    int L = hl.L(18.0f);
                    yw ywVar = this.x;
                    canvas.translate(uh9.y(20.0f, this.x.c.e, (L + ywVar.c.b) - ((int) Math.ceil(ywVar.i.d.getLineWidth(0)))), this.f + this.h);
                } else {
                    int h = ik8.h(xi5Var, 18.0f, measuredWidth);
                    zw zwVar = this.x.c;
                    canvas.translate((h - zwVar.b) - (hl.L(20.0f) * zwVar.e), this.f + this.h);
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - hl.L(26.0f), this.f, hl.L(20.0f), hl.L(20.0f));
                this.y.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(xi5Var, canvas, this, 0);
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
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, cwVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
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
        yw ywVar;
        xi5 xi5Var;
        int i3;
        int L;
        int L2;
        int i4;
        cw cwVar;
        cv cvVar;
        cw cwVar2;
        cw cwVar3;
        n69 n69Var;
        amb ambVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        yw ywVar2 = this.x;
        int i5 = 1;
        if (ywVar2 != null) {
            this.c = null;
            int i6 = 0;
            this.f = (ywVar2.j == 0 && ywVar2.c.e == 0) ? hl.L(10.0f) : 0;
            this.h = 0;
            zw zwVar = this.x.c;
            int i7 = zwVar.c;
            xi5 xi5Var2 = this.a;
            if (i7 != size2 || zwVar.d != xea.V0) {
                zwVar.c = size2;
                zwVar.d = xea.V0;
                zwVar.b = 0;
                int size3 = zwVar.a.size();
                int i8 = 0;
                while (true) {
                    ywVar = this.x;
                    if (i8 >= size3) {
                        break;
                    }
                    yw ywVar3 = (yw) ywVar.c.a.get(i8);
                    String str = ywVar3.f;
                    if (str != null) {
                        xi5 xi5Var3 = xi5Var2;
                        cw m = o.m(xi5Var3, this, str, null, ik8.h(xi5Var2, 54.0f, size2), this.f, this.x, this.b);
                        xi5Var2 = xi5Var3;
                        ywVar3.i = m;
                        zw zwVar2 = this.x.c;
                        zwVar2.b = Math.max(zwVar2.b, (int) Math.ceil(m.d.getLineWidth(0)));
                    }
                    i8++;
                }
                zw zwVar3 = ywVar.c;
                zwVar3.b = Math.max(zwVar3.b, (int) Math.ceil(o.p1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    xi5Var2.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this);
                    this.y = checkBoxBase;
                    checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(hl.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            ex exVar = this.b;
            if (exVar == null || !exVar.H) {
                xi5Var2.getClass();
                int L3 = hl.L((this.y == null ? 0 : 26) + 24);
                zw zwVar4 = this.x.c;
                this.e = uh9.y(20.0f, zwVar4.e, L3 + zwVar4.b);
            } else {
                xi5Var2.getClass();
                this.e = hl.L(18 + (this.y == null ? 0 : 26));
            }
            this.w = false;
            int h = ik8.h(xi5Var2, 18.0f, size2) - this.e;
            if (exVar != null && exVar.H) {
                int L4 = hl.L(6.0f);
                zw zwVar5 = this.x.c;
                h -= (hl.L(20.0f) * zwVar5.e) + (L4 + zwVar5.b);
            }
            yw ywVar4 = this.x;
            xi5 xi5Var4 = xi5Var2;
            TL_iv.RichText richText = ywVar4.e;
            if (richText != null) {
                xi5Var = xi5Var4;
                cw n = o.n(this.a, this, null, richText, h, 0, ywVar4, (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
                this.c = n;
                if (n != null && n.d.getLineCount() > 0) {
                    cw cwVar4 = this.x.i;
                    if (cwVar4 != null && cwVar4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = hl.L(8.0f) + this.c.d.getHeight();
                    if (c00.g(1, this.x.c.a) == this.x) {
                        L += hl.L(8.0f);
                    }
                    yw ywVar5 = this.x;
                    i5 = (ywVar5.j == 0 || ywVar5.c.e != 0) ? L : hl.L(10.0f) + L;
                    cwVar3 = this.c;
                    if (cwVar3 != null) {
                        cwVar3.s = this.e;
                        cwVar3.w = this.f;
                        cw cwVar5 = this.x.i;
                        if (cwVar5 != null) {
                            cwVar3.y = cwVar5.d.getText();
                        }
                    }
                    n69Var = this.d;
                    if (n69Var != null && (n69Var.a instanceof zlb) && (ambVar = ((o) xi5Var).Q0) != null) {
                        ArrayList arrayList = ambVar.A0;
                        arrayList.clear();
                        ((zlb) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            kmb kmbVar = (kmb) obj;
                            if (kmbVar instanceof cw) {
                                cw cwVar6 = (cw) kmbVar;
                                cwVar6.s += this.n;
                                cwVar6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (c00.g(1, this.x.c.a) == this.x) {
                }
                yw ywVar52 = this.x;
                if (ywVar52.j == 0) {
                }
                cwVar3 = this.c;
                if (cwVar3 != null) {
                }
                n69Var = this.d;
                if (n69Var != null) {
                    ArrayList arrayList2 = ambVar.A0;
                    arrayList2.clear();
                    ((zlb) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i6 < size) {
                    }
                }
            } else {
                xi5Var = xi5Var4;
                TL_iv.PageBlock pageBlock = ywVar4.d;
                if (pageBlock != null) {
                    int i9 = this.e;
                    this.n = i9;
                    int i10 = this.f;
                    this.r = i10;
                    n69 n69Var2 = this.d;
                    if (n69Var2 != null) {
                        View view = n69Var2.a;
                        if (view instanceof cv) {
                            this.r = i10 - hl.L(8.0f);
                            if (exVar == null || !exVar.H) {
                                this.n -= hl.L(18.0f);
                            }
                            h += hl.L(18.0f);
                            i4 = 0 - hl.L(8.0f);
                        } else {
                            if ((view instanceof wu) || (view instanceof rv) || (view instanceof wv) || (view instanceof sv)) {
                                if (exVar == null || !exVar.H) {
                                    this.n = i9 - hl.L(18.0f);
                                }
                                L2 = hl.L(18.0f);
                            } else if (o.I(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i4 = 0 - hl.L(8.0f);
                                h = size2;
                            } else {
                                if (this.d.a instanceof vv) {
                                    this.n -= hl.L(18.0f);
                                    L2 = hl.L(36.0f);
                                }
                                i4 = 0;
                            }
                            h += L2;
                            i4 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(h, TLObject.FLAG_30), 0);
                        if ((this.d.a instanceof cv) && (cwVar = this.x.i) != null && cwVar.d.getLineCount() > 0 && (cwVar2 = (cvVar = (cv) this.d.a).c) != null && cwVar2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - cvVar.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i4 -= hl.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof bv) {
                                this.w = ((bv) view2).w;
                            } else if (view2 instanceof yu) {
                                this.w = ((yu) view2).s;
                            }
                        }
                        if (this.w && this.x.i != null) {
                            this.f = (this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2;
                        }
                        i3 = this.d.a.getMeasuredHeight() + i4;
                    } else {
                        i3 = 0;
                    }
                    L = i3 + hl.L(8.0f);
                    if (c00.g(1, this.x.c.a) == this.x) {
                    }
                    yw ywVar522 = this.x;
                    if (ywVar522.j == 0) {
                    }
                    cwVar3 = this.c;
                    if (cwVar3 != null) {
                    }
                    n69Var = this.d;
                    if (n69Var != null) {
                    }
                }
                L = 0;
                if (c00.g(1, this.x.c.a) == this.x) {
                }
                yw ywVar5222 = this.x;
                if (ywVar5222.j == 0) {
                }
                cwVar3 = this.c;
                if (cwVar3 != null) {
                }
                n69Var = this.d;
                if (n69Var != null) {
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

    public void setBlock(yw ywVar) {
        yw ywVar2 = this.x;
        ex exVar = this.b;
        if (ywVar2 != ywVar) {
            this.x = ywVar;
            n69 n69Var = this.d;
            if (n69Var != null) {
                removeView(n69Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && exVar != null) {
                int I = ex.I(pageBlock);
                this.s = I;
                f89 x = exVar.x(this, I);
                this.d = (n69) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && exVar != null) {
            exVar.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
