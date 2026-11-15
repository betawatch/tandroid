package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.iv;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class i9 extends u9 {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // org.telegram.ui.Cells.u9
    public final boolean C() {
        p9 p9Var;
        iv ivVar;
        CharSequence r10;
        String str;
        if (!this.u0 || (p9Var = this.W) == null || ((q1) p9Var).getMessageObject() == null || (ivVar = ((q1) this.W).getMessageObject().y2) == null || ivVar.n.isEmpty() || (r10 = r()) == null || r10.length() == 0) {
            return false;
        }
        try {
            str = ivVar.w(this.u, this.v);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        org.telegram.messenger.g0.f(r10, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void E(boolean z10) {
        p9 p9Var = this.W;
        if (p9Var == null || !((q1) p9Var).z2() || z10) {
            return;
        }
        q1 q1Var = (q1) this.W;
        int e12 = q1Var.getMessageObject().e1();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(e12);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        q1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        int i7 = 1;
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(q1Var, e12, i7));
        ofFloat.addListener(new k1(q1Var, i7));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(e12, ofFloat);
    }

    @Override // org.telegram.ui.Cells.u9
    public final void L(p9 p9Var, p9 p9Var2) {
        q1 q1Var = (q1) p9Var;
        q1 q1Var2 = (q1) p9Var2;
        boolean z10 = q1Var2 == null || !(q1Var2.getMessageObject() == null || q1Var2.getMessageObject().e1() == q1Var.getMessageObject().e1());
        this.w = q1Var.getMessageObject().e1();
        try {
            int i7 = q1Var.getMessageObject().k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i10 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.u(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = gz.a;
        SharedPreferences.Editor edit = np.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(gj gjVar) {
        try {
            int i7 = gjVar.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == gjVar.e1()) {
            f(true);
        }
    }

    public final void X(gj gjVar, dj djVar, Canvas canvas) {
        gj messageObject;
        p9 p9Var = this.W;
        if (p9Var == null || ((q1) p9Var).getMessageObject() == null || this.q0 || this.s0 || this.u0 || (messageObject = ((q1) this.W).getMessageObject()) == null || messageObject.B2 == null || gjVar.e1() != this.w) {
            return;
        }
        int i7 = this.u;
        int i10 = djVar.n;
        int i11 = this.v - i10;
        int i12 = 0;
        int j3 = Utilities.j(i7 - i10, djVar.e.getText().length(), 0);
        int j10 = Utilities.j(i11, djVar.e.getText().length(), 0);
        if (j3 != j10) {
            boolean P3 = messageObject.P3();
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (P3) {
                int i13 = org.telegram.ui.ActionBar.j6.Mc;
                paint2.setColor(t(i13));
                paint.setColor(t(i13));
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.lg;
                paint2.setColor(t(i14));
                paint.setColor(t(i14));
            }
            if (djVar.J) {
                i12 = org.telegram.messenger.g0.L(10.0f);
            } else if (djVar.I) {
                i12 = org.telegram.messenger.g0.L(0.0f);
            }
            h(canvas, djVar.e, j3, j10, true, true, i12);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z10) {
                int i7 = org.telegram.ui.ActionBar.j6.Mc;
                paint2.setColor(t(i7));
                paint.setColor(t(i7));
            } else {
                int i10 = org.telegram.ui.ActionBar.j6.lg;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(gj gjVar, iv ivVar, Canvas canvas) {
        Canvas canvas2;
        if (!this.u0 || ivVar == null) {
            return;
        }
        ArrayList arrayList = ivVar.n;
        p9 p9Var = this.W;
        if (p9Var == null || ((q1) p9Var).getMessageObject() == null || ((q1) this.W).getMessageObject().e1() != gjVar.e1()) {
            return;
        }
        boolean P3 = gjVar.P3();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (P3) {
            int i7 = org.telegram.ui.ActionBar.j6.Mc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.lg;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Layout a10 = ((s9) arrayList.get(i11)).a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) ivVar.o.get(i11)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(this.u - intValue, length, 0);
                int j10 = Utilities.j(this.v - intValue, length, 0);
                if (j3 != j10) {
                    boolean z10 = this.u >= intValue;
                    boolean z11 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r2.getX(), r2.getY());
                    canvas2 = canvas;
                    h(canvas2, a10, j3, j10, z10, z11, 0.0f);
                    canvas2.restore();
                    i11++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i11++;
            canvas = canvas2;
        }
    }

    public final void a0(q1 q1Var, int i7, int i10) {
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.w = q1Var.getMessageObject().e1();
        boolean z10 = ((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().y2 != null;
        this.u0 = z10;
        if (z10) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i7;
        this.v = i10;
        w();
        c8.fa faVar = this.D;
        if (faVar != null) {
            faVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        iv ivVar;
        this.X = q1Var;
        gj messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.ib;
        boolean z10 = this.r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i7 = this.c;
            rect.set(i7, this.d, q1Var.getDescriptionlayout().getWidth() + i7, q1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && q1Var.getFactCheckLayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, q1Var.getFactCheckLayout().getWidth() + i10, q1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (ivVar = messageObject.y2) != null && !ivVar.n.isEmpty()) {
            iv ivVar2 = messageObject.y2;
            int i11 = this.c;
            int i12 = this.d;
            rect.set(i11, i12, ivVar2.C + i11, ivVar2.t() + i12);
            return;
        }
        if (q1Var.d2() && q1Var.getCaptionLayout().e.size() > 0) {
            dj djVar = (dj) i5.c.h(1, q1Var.getCaptionLayout().e);
            int i13 = this.c;
            rect.set(i13, this.d, djVar.e.getWidth() + i13, (int) (djVar.p(q1Var.getCaptionLayout().e, x1Var) + this.d + djVar.f + djVar.e.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.B2) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            dj djVar2 = (dj) i5.c.h(1, messageObject.B2);
            int i14 = this.c;
            rect.set(i14, this.d, djVar2.e.getWidth() + i14, (int) (djVar2.p(messageObject.B2, x1Var) + this.d + djVar2.f + djVar2.e.getHeight()));
        }
    }

    public final void c0(int i7, int i10) {
        if (this.a == i7 && this.b == i10) {
            return;
        }
        this.a = i7;
        this.b = i10;
        w();
    }

    @Override // org.telegram.ui.Cells.u9
    public final void f(boolean z10) {
        super.f(z10);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void i(int i7, k9 k9Var, boolean z10) {
        q1 q1Var = (q1) (z10 ? this.X : this.W);
        if (q1Var == null) {
            k9Var.d = null;
            return;
        }
        gj messageObject = q1Var.getMessageObject();
        if (this.q0) {
            k9Var.d = q1Var.getDescriptionlayout();
            k9Var.b = 0.0f;
            k9Var.c = 0.0f;
            k9Var.a = 0;
            return;
        }
        if (this.s0) {
            k9Var.d = q1Var.getFactCheckLayout();
            k9Var.b = 0.0f;
            k9Var.c = 0.0f;
            k9Var.a = 0;
            return;
        }
        if (this.u0) {
            iv ivVar = messageObject != null ? messageObject.y2 : null;
            if (ivVar != null) {
                ArrayList arrayList = ivVar.o;
                ArrayList arrayList2 = ivVar.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (r4 >= arrayList2.size()) {
                            r4 = -1;
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(r4)).intValue();
                        int length = ((s9) arrayList2.get(r4)).a().getText().length();
                        if (i7 >= intValue && i7 <= intValue + length) {
                            break;
                        } else {
                            r4++;
                        }
                    }
                    if (r4 < 0) {
                        r4 = arrayList2.size() - 1;
                    }
                    k9Var.d = ((s9) arrayList2.get(r4)).a();
                    k9Var.b = r11.getY();
                    k9Var.c = r11.getX();
                    k9Var.a = ((Integer) arrayList.get(r4)).intValue();
                    return;
                }
            }
            k9Var.d = null;
            return;
        }
        if (q1Var.d2()) {
            ej captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                k9Var.d = ((dj) arrayList3.get(0)).e;
                k9Var.b = r11.f;
                dj djVar = (dj) arrayList3.get(0);
                float f11 = -(djVar.l() ? ((int) Math.ceil(f10)) - (djVar.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                k9Var.c = f11;
                if (djVar.I && !djVar.J) {
                    k9Var.c = f11 + (djVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                k9Var.a = 0;
                return;
            }
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                dj djVar2 = (dj) arrayList3.get(i10);
                int i11 = i7 - djVar2.n;
                if (i11 >= 0 && i11 <= djVar2.e.getText().length()) {
                    k9Var.d = djVar2.e;
                    k9Var.b = djVar2.o(arrayList3) + djVar2.f;
                    float f12 = -(djVar2.l() ? ((int) Math.ceil(f10)) - (djVar2.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                    k9Var.c = f12;
                    if (djVar2.I && !djVar2.J) {
                        k9Var.c = f12 + (djVar2.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    k9Var.a = djVar2.n;
                    return;
                }
            }
            k9Var.d = null;
            return;
        }
        ArrayList arrayList4 = messageObject.B2;
        if (arrayList4 == null) {
            k9Var.d = null;
            return;
        }
        if (arrayList4.size() == 1) {
            k9Var.d = ((dj) messageObject.B2.get(0)).e;
            k9Var.b = r11.f;
            dj djVar3 = (dj) messageObject.B2.get(0);
            float f13 = -(djVar3.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar3.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
            k9Var.c = f13;
            if (djVar3.I && !djVar3.J) {
                k9Var.c = f13 + (djVar3.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
            }
            k9Var.a = 0;
            return;
        }
        for (int i12 = 0; i12 < messageObject.B2.size(); i12++) {
            dj djVar4 = (dj) messageObject.B2.get(i12);
            int i13 = i7 - djVar4.n;
            if (i13 >= 0 && i13 <= djVar4.e.getText().length()) {
                k9Var.d = djVar4.e;
                k9Var.b = djVar4.o(messageObject.B2) + djVar4.f;
                float f14 = -(djVar4.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar4.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                k9Var.c = f14;
                if (djVar4.I && !djVar4.J) {
                    k9Var.c = f14 + (djVar4.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                k9Var.a = djVar4.n;
                return;
            }
        }
        k9Var.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.u9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i7, int i10, int i11, int i12, p9 p9Var, boolean z10) {
        Layout layout;
        float o4;
        int i13;
        float f10;
        float f11;
        Layout layout2;
        int i14;
        Layout layout3;
        q1 q1Var = (q1) p9Var;
        if (q1Var == null) {
            return 0;
        }
        int i15 = i7 - i11;
        int i16 = i10 - i12;
        boolean z11 = z10 ? this.r0 : this.q0;
        boolean z12 = z10 ? this.t0 : this.s0;
        boolean z13 = z10 ? this.v0 : this.u0;
        if (z11) {
            layout2 = q1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    iv ivVar = q1Var.getMessageObject() != null ? q1Var.getMessageObject().y2 : null;
                    if (ivVar != null) {
                        ArrayList arrayList = ivVar.n;
                        if (!arrayList.isEmpty()) {
                            s9 s9Var = (s9) i5.c.h(1, arrayList);
                            layout = s9Var.a();
                            f10 = s9Var.getY();
                        }
                    }
                    return -1;
                }
                if (q1Var.d2()) {
                    dj djVar = (dj) q1Var.getCaptionLayout().e.get(q1Var.getCaptionLayout().e.size() - 1);
                    layout = djVar.e;
                    o4 = djVar.o(q1Var.getCaptionLayout().e);
                    i13 = djVar.f;
                } else {
                    dj djVar2 = (dj) q1Var.getMessageObject().B2.get(q1Var.getMessageObject().B2.size() - 1);
                    layout = djVar2.e;
                    o4 = djVar2.o(q1Var.getMessageObject().B2);
                    i13 = djVar2.f;
                }
                f10 = i13 + o4;
                Layout layout4 = layout;
                f11 = f10;
                layout2 = layout4;
                if (layout2 != null) {
                    if (i16 < 0) {
                        i16 = 1;
                    }
                    int lineBottom = (int) (f11 + layout2.getLineBottom(layout2.getLineCount() - 1));
                    if (i16 > lineBottom) {
                        i16 = lineBottom - 1;
                    }
                    x1 x1Var = q1Var.ib;
                    gj messageObject = q1Var.getMessageObject();
                    k9 k9Var = this.a0;
                    if (!z10 ? this.q0 : this.r0) {
                        k9Var.d = q1Var.getDescriptionlayout();
                        k9Var.c = 0.0f;
                        k9Var.b = 0.0f;
                        k9Var.a = 0;
                    } else {
                        if (!z10 ? this.s0 : this.t0) {
                            if (!z10 ? !this.u0 : !this.v0) {
                                i14 = -1;
                                if (!q1Var.d2()) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= messageObject.B2.size()) {
                                            break;
                                        }
                                        dj djVar3 = (dj) messageObject.B2.get(i17);
                                        float f12 = i16;
                                        if (f12 < djVar3.o(messageObject.B2) || f12 > djVar3.o(messageObject.B2) + djVar3.f + djVar3.j(x1Var)) {
                                            i17++;
                                        } else {
                                            k9Var.d = djVar3.e;
                                            k9Var.b = djVar3.o(messageObject.B2) + djVar3.f;
                                            float f13 = -(djVar3.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar3.J ? org.telegram.messenger.g0.L(10.0f) : djVar3.I ? org.telegram.messenger.g0.L(0.0f) : 0) : 0);
                                            k9Var.c = f13;
                                            if (djVar3.I && !djVar3.J) {
                                                k9Var.c = f13 + (djVar3.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            k9Var.a = djVar3.n;
                                        }
                                    }
                                } else {
                                    ej captionLayout = q1Var.getCaptionLayout();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = captionLayout.e;
                                        if (i18 >= arrayList2.size()) {
                                            break;
                                        }
                                        dj djVar4 = (dj) arrayList2.get(i18);
                                        float f14 = i16;
                                        if (f14 < djVar4.o(arrayList2) || f14 > djVar4.o(arrayList2) + djVar4.f + djVar4.j(x1Var)) {
                                            i18++;
                                        } else {
                                            k9Var.d = djVar4.e;
                                            k9Var.b = djVar4.o(arrayList2) + djVar4.f;
                                            float f15 = -(djVar4.l() ? ((int) Math.ceil(captionLayout.d)) - (djVar4.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                                            k9Var.c = f15;
                                            if (djVar4.I && !djVar4.J) {
                                                k9Var.c = f15 + (djVar4.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            k9Var.a = djVar4.n;
                                        }
                                    }
                                }
                            } else {
                                iv ivVar2 = messageObject != null ? messageObject.y2 : null;
                                if (ivVar2 != null) {
                                    ArrayList arrayList3 = ivVar2.n;
                                    if (!arrayList3.isEmpty()) {
                                        int i19 = TLObject.FLAG_31;
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                            s9 s9Var2 = (s9) arrayList3.get(i23);
                                            int y10 = s9Var2.getY();
                                            int height = s9Var2.a().getHeight() + y10;
                                            int x10 = s9Var2.getX();
                                            int width = s9Var2.a().getWidth() + x10;
                                            boolean z14 = i16 >= y10 && i16 < height;
                                            boolean z15 = i15 >= x10 && i15 < width;
                                            s9Var2.a().getText();
                                            if (z14) {
                                                if (x10 <= i15 && x10 > i19) {
                                                    i20 = i23;
                                                    i19 = x10;
                                                }
                                                int min = z15 ? 0 : Math.min(Math.abs(i15 - x10), Math.abs(i15 - width));
                                                if (min < i22) {
                                                    i22 = min;
                                                    i21 = i23;
                                                }
                                            }
                                        }
                                        i14 = -1;
                                        if (i20 < 0) {
                                            i20 = i21;
                                        }
                                        if (i20 < 0) {
                                            int i24 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                            i20 = 0;
                                            for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                                                s9 s9Var3 = (s9) arrayList3.get(i25);
                                                int y11 = s9Var3.getY();
                                                int min2 = Math.min(Math.abs(i16 - y11), Math.abs(i16 - (s9Var3.a().getHeight() + y11)));
                                                if (min2 < i24) {
                                                    i20 = i25;
                                                    i24 = min2;
                                                }
                                            }
                                        }
                                        k9Var.d = ((s9) arrayList3.get(i20)).a();
                                        k9Var.b = r2.getY();
                                        k9Var.c = r2.getX();
                                        k9Var.a = ((Integer) ivVar2.o.get(i20)).intValue();
                                    }
                                }
                                i14 = -1;
                                k9Var.d = null;
                            }
                            layout3 = (Layout) k9Var.d;
                            if (layout3 != null) {
                                return i14;
                            }
                            int i26 = (int) (i15 - k9Var.c);
                            int i27 = 0;
                            while (true) {
                                if (i27 >= layout3.getLineCount()) {
                                    i27 = i14;
                                    break;
                                }
                                float f16 = i16;
                                if (f16 > k9Var.b + layout3.getLineTop(i27) && f16 < k9Var.b + layout3.getLineBottom(i27)) {
                                    break;
                                }
                                i27++;
                            }
                            if (i27 >= 0) {
                                return layout3.getOffsetForHorizontal(i27, i26) + k9Var.a;
                            }
                            return i14;
                        }
                        k9Var.d = q1Var.getFactCheckLayout();
                        k9Var.c = 0.0f;
                        k9Var.b = 0.0f;
                        k9Var.a = 0;
                    }
                    i14 = -1;
                    layout3 = (Layout) k9Var.d;
                    if (layout3 != null) {
                    }
                }
                return -1;
            }
            layout2 = q1Var.getFactCheckLayout();
        }
        f11 = 0.0f;
        if (layout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int m() {
        Layout layout;
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getMessageObject() != null) {
            gj messageObject = ((q1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                iv ivVar = messageObject != null ? messageObject.y2 : null;
                if (ivVar != null) {
                    ArrayList arrayList = ivVar.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((s9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).d2()) {
                layout = ((dj) ((q1) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((dj) arrayList2.get(0)).e;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // org.telegram.ui.Cells.u9
    public final CharSequence s(p9 p9Var, boolean z10) {
        q1 q1Var = (q1) p9Var;
        if (q1Var == null || q1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.q0 : !this.r0) {
            return q1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.s0 : !this.t0) {
            return q1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.u0 : this.v0) {
            return q1Var.d2() ? q1Var.getCaptionLayout().a : q1Var.getMessageObject().v;
        }
        iv ivVar = q1Var.getMessageObject().y2;
        return ivVar != null ? ivVar.q : "";
    }

    @Override // org.telegram.ui.Cells.u9
    public void w() {
        super.w();
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        p9 p9Var2 = this.W;
        if (p9Var2 != null) {
            if (this.s0 || this.t0) {
                ((q1) p9Var2).q2();
            }
        }
    }
}
