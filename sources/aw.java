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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aw extends ViewGroup implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public b59 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public xx x;
    public CheckBoxBase y;

    public aw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
    }

    public final int a() {
        xx xxVar = this.x;
        if ((xxVar != null ? xxVar.i : null) == null) {
            return 0;
        }
        ui5 ui5Var = this.a;
        ey eyVar = this.b;
        if (eyVar == null || !eyVar.H) {
            ui5Var.getClass();
            return hg9.y(20.0f, this.x.c.e, (gm.L(18.0f) + this.x.c.b) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int h = wi8.h(ui5Var, 18.0f, getMeasuredWidth());
        yx yxVar = this.x.c;
        return (h - yxVar.b) - (gm.L(20.0f) * yxVar.e);
    }

    @Override // dx
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int L = gm.L(18.0f);
        xx xxVar = this.x;
        int min = (xxVar == null || xxVar.i == null) ? Integer.MAX_VALUE : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.x.i.k() + a()) - L);
        bx bxVar = this.c;
        if (bxVar != null) {
            min = Math.min(min, (bxVar.k() + bxVar.s) - L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (boundLeft = ((dx) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // dx
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int L = gm.L(18.0f);
        xx xxVar = this.x;
        int max = (xxVar == null || xxVar.i == null) ? Integer.MIN_VALUE : Math.max(TLObject.FLAG_31, this.x.i.l() + a() + L);
        bx bxVar = this.c;
        if (bxVar != null) {
            max = Math.max(max, bxVar.l() + bxVar.s + L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (boundRight = ((dx) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // dx
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        bx bxVar = this.c;
        if (bxVar != null) {
            return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if ((callback instanceof dx) && (lastLineBoundRight = ((dx) callback).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // android.view.View, nkb
    public final void invalidate() {
        super.invalidate();
        b59 b59Var = this.d;
        if (b59Var != null) {
            b59Var.a.invalidate();
        }
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            KeyEvent.Callback callback = b59Var.a;
            if (callback instanceof fkb) {
                ((fkb) callback).k(arrayList);
            }
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bx bxVar = this.x.i;
            ui5 ui5Var = this.a;
            if (bxVar != null) {
                canvas.save();
                ey eyVar = this.b;
                if (eyVar == null || !eyVar.H) {
                    ui5Var.getClass();
                    int L = gm.L(18.0f);
                    xx xxVar = this.x;
                    canvas.translate(hg9.y(20.0f, this.x.c.e, (L + xxVar.c.b) - ((int) Math.ceil(xxVar.i.d.getLineWidth(0)))), this.f + this.h);
                } else {
                    int h = wi8.h(ui5Var, 18.0f, measuredWidth);
                    yx yxVar = this.x.c;
                    canvas.translate((h - yxVar.b) - (gm.L(20.0f) * yxVar.e), this.f + this.h);
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - gm.L(26.0f), this.f, gm.L(20.0f), gm.L(20.0f));
                this.y.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(ui5Var, canvas, this, 0);
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
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bxVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
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
        xx xxVar;
        ui5 ui5Var;
        int i3;
        int L;
        int L2;
        int i4;
        bx bxVar;
        bw bwVar;
        bx bxVar2;
        bx bxVar3;
        b59 b59Var;
        gkb gkbVar;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        xx xxVar2 = this.x;
        int i5 = 1;
        if (xxVar2 != null) {
            this.c = null;
            int i6 = 0;
            this.f = (xxVar2.j == 0 && xxVar2.c.e == 0) ? gm.L(10.0f) : 0;
            this.h = 0;
            yx yxVar = this.x.c;
            int i7 = yxVar.c;
            ui5 ui5Var2 = this.a;
            if (i7 != size2 || yxVar.d != gda.V0) {
                yxVar.c = size2;
                yxVar.d = gda.V0;
                yxVar.b = 0;
                int size3 = yxVar.a.size();
                int i8 = 0;
                while (true) {
                    xxVar = this.x;
                    if (i8 >= size3) {
                        break;
                    }
                    xx xxVar3 = (xx) xxVar.c.a.get(i8);
                    String str = xxVar3.f;
                    if (str != null) {
                        ui5 ui5Var3 = ui5Var2;
                        bx m = o.m(ui5Var3, this, str, null, wi8.h(ui5Var2, 54.0f, size2), this.f, this.x, this.b);
                        ui5Var2 = ui5Var3;
                        xxVar3.i = m;
                        yx yxVar2 = this.x.c;
                        yxVar2.b = Math.max(yxVar2.b, (int) Math.ceil(m.d.getLineWidth(0)));
                    }
                    i8++;
                }
                yx yxVar3 = xxVar.c;
                yxVar3.b = Math.max(yxVar3.b, (int) Math.ceil(o.p1.measureText("00.")));
            }
            if (this.x.a) {
                if (this.y == null) {
                    ui5Var2.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this);
                    this.y = checkBoxBase;
                    checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(gm.L(5.0f));
                }
                this.y.f(-1, this.x.b, false);
            } else {
                this.y = null;
            }
            ey eyVar = this.b;
            if (eyVar == null || !eyVar.H) {
                ui5Var2.getClass();
                int L3 = gm.L((this.y == null ? 0 : 26) + 24);
                yx yxVar4 = this.x.c;
                this.e = hg9.y(20.0f, yxVar4.e, L3 + yxVar4.b);
            } else {
                ui5Var2.getClass();
                this.e = gm.L(18 + (this.y == null ? 0 : 26));
            }
            this.w = false;
            int h = wi8.h(ui5Var2, 18.0f, size2) - this.e;
            if (eyVar != null && eyVar.H) {
                int L4 = gm.L(6.0f);
                yx yxVar5 = this.x.c;
                h -= (gm.L(20.0f) * yxVar5.e) + (L4 + yxVar5.b);
            }
            xx xxVar4 = this.x;
            ui5 ui5Var4 = ui5Var2;
            TL_iv.RichText richText = xxVar4.e;
            if (richText != null) {
                ui5Var = ui5Var4;
                bx n = o.n(this.a, this, null, richText, h, 0, xxVar4, (eyVar == null || !eyVar.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), 0, this.b);
                this.c = n;
                if (n != null && n.d.getLineCount() > 0) {
                    bx bxVar4 = this.x.i;
                    if (bxVar4 != null && bxVar4.d.getLineCount() > 0) {
                        this.h = this.x.i.d.getLineAscent(0) - this.c.d.getLineAscent(0);
                    }
                    L = gm.L(8.0f) + this.c.d.getHeight();
                    if (b10.f(1, this.x.c.a) == this.x) {
                        L += gm.L(8.0f);
                    }
                    xx xxVar5 = this.x;
                    i5 = (xxVar5.j == 0 || xxVar5.c.e != 0) ? L : gm.L(10.0f) + L;
                    bxVar3 = this.c;
                    if (bxVar3 != null) {
                        bxVar3.s = this.e;
                        bxVar3.w = this.f;
                        bx bxVar5 = this.x.i;
                        if (bxVar5 != null) {
                            bxVar3.y = bxVar5.d.getText();
                        }
                    }
                    b59Var = this.d;
                    if (b59Var != null && (b59Var.a instanceof fkb) && (gkbVar = ((o) ui5Var).Q0) != null) {
                        ArrayList arrayList = gkbVar.A0;
                        arrayList.clear();
                        ((fkb) this.d.a).k(arrayList);
                        size = arrayList.size();
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            qkb qkbVar = (qkb) obj;
                            if (qkbVar instanceof bx) {
                                bx bxVar6 = (bx) qkbVar;
                                bxVar6.s += this.n;
                                bxVar6.w += this.r;
                            }
                        }
                    }
                }
                L = 0;
                if (b10.f(1, this.x.c.a) == this.x) {
                }
                xx xxVar52 = this.x;
                if (xxVar52.j == 0) {
                }
                bxVar3 = this.c;
                if (bxVar3 != null) {
                }
                b59Var = this.d;
                if (b59Var != null) {
                    ArrayList arrayList2 = gkbVar.A0;
                    arrayList2.clear();
                    ((fkb) this.d.a).k(arrayList2);
                    size = arrayList2.size();
                    while (i6 < size) {
                    }
                }
            } else {
                ui5Var = ui5Var4;
                TL_iv.PageBlock pageBlock = xxVar4.d;
                if (pageBlock != null) {
                    int i9 = this.e;
                    this.n = i9;
                    int i10 = this.f;
                    this.r = i10;
                    b59 b59Var2 = this.d;
                    if (b59Var2 != null) {
                        View view = b59Var2.a;
                        if (view instanceof bw) {
                            this.r = i10 - gm.L(8.0f);
                            if (eyVar == null || !eyVar.H) {
                                this.n -= gm.L(18.0f);
                            }
                            h += gm.L(18.0f);
                            i4 = 0 - gm.L(8.0f);
                        } else {
                            if ((view instanceof vv) || (view instanceof qw) || (view instanceof vw) || (view instanceof rw)) {
                                if (eyVar == null || !eyVar.H) {
                                    this.n = i9 - gm.L(18.0f);
                                }
                                L2 = gm.L(18.0f);
                            } else if (o.I(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                i4 = 0 - gm.L(8.0f);
                                h = size2;
                            } else {
                                if (this.d.a instanceof uw) {
                                    this.n -= gm.L(18.0f);
                                    L2 = gm.L(36.0f);
                                }
                                i4 = 0;
                            }
                            h += L2;
                            i4 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(h, TLObject.FLAG_30), 0);
                        if ((this.d.a instanceof bw) && (bxVar = this.x.i) != null && bxVar.d.getLineCount() > 0 && (bxVar2 = (bwVar = (bw) this.d.a).c) != null && bxVar2.d.getLineCount() > 0) {
                            this.h = this.x.i.d.getLineAscent(0) - bwVar.c.d.getLineAscent(0);
                        }
                        if (this.x.d instanceof TL_iv.pageBlockDetails) {
                            this.w = true;
                            this.r = 0;
                            i4 -= gm.L(8.0f);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof aw) {
                                this.w = ((aw) view2).w;
                            } else if (view2 instanceof xv) {
                                this.w = ((xv) view2).s;
                            }
                        }
                        if (this.w && this.x.i != null) {
                            this.f = (this.d.a.getMeasuredHeight() - this.x.i.d.getHeight()) / 2;
                        }
                        i3 = this.d.a.getMeasuredHeight() + i4;
                    } else {
                        i3 = 0;
                    }
                    L = i3 + gm.L(8.0f);
                    if (b10.f(1, this.x.c.a) == this.x) {
                    }
                    xx xxVar522 = this.x;
                    if (xxVar522.j == 0) {
                    }
                    bxVar3 = this.c;
                    if (bxVar3 != null) {
                    }
                    b59Var = this.d;
                    if (b59Var != null) {
                    }
                }
                L = 0;
                if (b10.f(1, this.x.c.a) == this.x) {
                }
                xx xxVar5222 = this.x;
                if (xxVar5222.j == 0) {
                }
                bxVar3 = this.c;
                if (bxVar3 != null) {
                }
                b59Var = this.d;
                if (b59Var != null) {
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

    public void setBlock(xx xxVar) {
        xx xxVar2 = this.x;
        ey eyVar = this.b;
        if (xxVar2 != xxVar) {
            this.x = xxVar;
            b59 b59Var = this.d;
            if (b59Var != null) {
                removeView(b59Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && eyVar != null) {
                int I = ey.I(pageBlock);
                this.s = I;
                u69 x = eyVar.x(this, I);
                this.d = (b59) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && eyVar != null) {
            eyVar.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
