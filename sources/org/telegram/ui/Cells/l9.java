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
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.vv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class l9 extends w9 {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // org.telegram.ui.Cells.w9
    public final boolean C() {
        r9 r9Var;
        vv vvVar;
        CharSequence r10;
        String str;
        if (!this.u0 || (r9Var = this.W) == null || ((q1) r9Var).getMessageObject() == null || (vvVar = ((q1) this.W).getMessageObject().w2) == null || vvVar.n.isEmpty() || (r10 = r()) == null || r10.length() == 0) {
            return false;
        }
        try {
            str = vvVar.w(this.u, this.v);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        org.telegram.messenger.i0.f(r10, str);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void E(boolean z10) {
        r9 r9Var = this.W;
        if (r9Var == null || !((q1) r9Var).w2() || z10) {
            return;
        }
        q1 q1Var = (q1) this.W;
        int f12 = q1Var.getMessageObject().f1();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(f12);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        q1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        ofFloat.addUpdateListener(new nh.b(q1Var, f12, 2));
        ofFloat.addListener(new k1(q1Var, 1));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(f12, ofFloat);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void L(r9 r9Var, r9 r9Var2) {
        q1 q1Var = (q1) r9Var;
        q1 q1Var2 = (q1) r9Var2;
        boolean z10 = q1Var2 == null || !(q1Var2.getMessageObject() == null || q1Var2.getMessageObject().f1() == q1Var.getMessageObject().f1());
        this.w = q1Var.getMessageObject().f1();
        try {
            int i10 = q1Var.getMessageObject().k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i11 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jg.o0(2, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i12 = tz.a;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(jj jjVar) {
        try {
            int i10 = jjVar.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == jjVar.f1()) {
            f(true);
        }
    }

    public final void X(jj jjVar, gj gjVar, Canvas canvas) {
        jj messageObject;
        r9 r9Var = this.W;
        if (r9Var == null || ((q1) r9Var).getMessageObject() == null || this.q0 || this.s0 || this.u0 || (messageObject = ((q1) this.W).getMessageObject()) == null || messageObject.z2 == null || jjVar.f1() != this.w) {
            return;
        }
        int i10 = this.u;
        int i11 = gjVar.n;
        int i12 = this.v - i11;
        int i13 = 0;
        int j10 = Utilities.j(i10 - i11, gjVar.e.getText().length(), 0);
        int j11 = Utilities.j(i12, gjVar.e.getText().length(), 0);
        if (j10 != j11) {
            boolean P3 = messageObject.P3();
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (P3) {
                int i14 = org.telegram.ui.ActionBar.t6.Jc;
                paint2.setColor(t(i14));
                paint.setColor(t(i14));
            } else {
                int i15 = org.telegram.ui.ActionBar.t6.ig;
                paint2.setColor(t(i15));
                paint.setColor(t(i15));
            }
            if (gjVar.I) {
                i13 = org.telegram.messenger.i0.L(10.0f);
            } else if (gjVar.H) {
                i13 = org.telegram.messenger.i0.L(0.0f);
            }
            h(canvas, gjVar.e, j10, j11, true, true, i13);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z10) {
                int i10 = org.telegram.ui.ActionBar.t6.Jc;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.t6.ig;
                paint2.setColor(t(i11));
                paint.setColor(t(i11));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(jj jjVar, vv vvVar, Canvas canvas) {
        Canvas canvas2;
        if (!this.u0 || vvVar == null) {
            return;
        }
        ArrayList arrayList = vvVar.n;
        r9 r9Var = this.W;
        if (r9Var == null || ((q1) r9Var).getMessageObject() == null || ((q1) this.W).getMessageObject().f1() != jjVar.f1()) {
            return;
        }
        boolean P3 = jjVar.P3();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (P3) {
            int i10 = org.telegram.ui.ActionBar.t6.Jc;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.t6.ig;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            Layout a2 = ((u9) arrayList.get(i12)).a();
            if (a2 != null && a2.getText() != null) {
                int intValue = ((Integer) vvVar.o.get(i12)).intValue();
                int length = a2.getText().length();
                int j10 = Utilities.j(this.u - intValue, length, 0);
                int j11 = Utilities.j(this.v - intValue, length, 0);
                if (j10 != j11) {
                    boolean z10 = this.u >= intValue;
                    boolean z11 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r2.getX(), r2.getY());
                    canvas2 = canvas;
                    h(canvas2, a2, j10, j11, z10, z11, 0.0f);
                    canvas2.restore();
                    i12++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i12++;
            canvas = canvas2;
        }
    }

    public final void a0(q1 q1Var, int i10, int i11) {
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.w = q1Var.getMessageObject().f1();
        boolean z10 = ((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().w2 != null;
        this.u0 = z10;
        if (z10) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i10;
        this.v = i11;
        w();
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        vv vvVar;
        this.X = q1Var;
        jj messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.gb;
        boolean z10 = this.r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, q1Var.getDescriptionlayout().getWidth() + i10, q1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && q1Var.getFactCheckLayout() != null) {
            int i11 = this.c;
            rect.set(i11, this.d, q1Var.getFactCheckLayout().getWidth() + i11, q1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (vvVar = messageObject.w2) != null && !vvVar.n.isEmpty()) {
            vv vvVar2 = messageObject.w2;
            int i12 = this.c;
            int i13 = this.d;
            rect.set(i12, i13, vvVar2.C + i12, vvVar2.t() + i13);
            return;
        }
        if (q1Var.a2() && q1Var.getCaptionLayout().e.size() > 0) {
            gj gjVar = (gj) i0.a.g(1, q1Var.getCaptionLayout().e);
            int i14 = this.c;
            rect.set(i14, this.d, gjVar.e.getWidth() + i14, (int) (gjVar.p(q1Var.getCaptionLayout().e, x1Var) + this.d + gjVar.f + gjVar.e.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.z2) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            gj gjVar2 = (gj) i0.a.g(1, messageObject.z2);
            int i15 = this.c;
            rect.set(i15, this.d, gjVar2.e.getWidth() + i15, (int) (gjVar2.p(messageObject.z2, x1Var) + this.d + gjVar2.f + gjVar2.e.getHeight()));
        }
    }

    public final void c0(int i10, int i11) {
        if (this.a == i10 && this.b == i11) {
            return;
        }
        this.a = i10;
        this.b = i11;
        w();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void f(boolean z10) {
        super.f(z10);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void i(int i10, ge.b bVar, boolean z10) {
        q1 q1Var = (q1) (z10 ? this.X : this.W);
        if (q1Var == null) {
            bVar.d = null;
            return;
        }
        jj messageObject = q1Var.getMessageObject();
        if (this.q0) {
            bVar.d = q1Var.getDescriptionlayout();
            bVar.b = 0.0f;
            bVar.c = 0.0f;
            bVar.a = 0;
            return;
        }
        if (this.s0) {
            bVar.d = q1Var.getFactCheckLayout();
            bVar.b = 0.0f;
            bVar.c = 0.0f;
            bVar.a = 0;
            return;
        }
        if (this.u0) {
            vv vvVar = messageObject != null ? messageObject.w2 : null;
            if (vvVar != null) {
                ArrayList arrayList = vvVar.o;
                ArrayList arrayList2 = vvVar.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (r4 >= arrayList2.size()) {
                            r4 = -1;
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(r4)).intValue();
                        int length = ((u9) arrayList2.get(r4)).a().getText().length();
                        if (i10 >= intValue && i10 <= intValue + length) {
                            break;
                        } else {
                            r4++;
                        }
                    }
                    if (r4 < 0) {
                        r4 = arrayList2.size() - 1;
                    }
                    bVar.d = ((u9) arrayList2.get(r4)).a();
                    bVar.b = r11.getY();
                    bVar.c = r11.getX();
                    bVar.a = ((Integer) arrayList.get(r4)).intValue();
                    return;
                }
            }
            bVar.d = null;
            return;
        }
        if (q1Var.a2()) {
            hj captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f7 = captionLayout.d;
            if (arrayList3.size() == 1) {
                bVar.d = ((gj) arrayList3.get(0)).e;
                bVar.b = r11.f;
                gj gjVar = (gj) arrayList3.get(0);
                float f10 = -(gjVar.l() ? ((int) Math.ceil(f7)) - (gjVar.I ? org.telegram.messenger.i0.L(10.0f) : 0) : 0);
                bVar.c = f10;
                if (gjVar.H && !gjVar.I) {
                    bVar.c = f10 + (gjVar.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
                }
                bVar.a = 0;
                return;
            }
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                gj gjVar2 = (gj) arrayList3.get(i11);
                int i12 = i10 - gjVar2.n;
                if (i12 >= 0 && i12 <= gjVar2.e.getText().length()) {
                    bVar.d = gjVar2.e;
                    bVar.b = gjVar2.o(arrayList3) + gjVar2.f;
                    float f11 = -(gjVar2.l() ? ((int) Math.ceil(f7)) - (gjVar2.I ? org.telegram.messenger.i0.L(10.0f) : 0) : 0);
                    bVar.c = f11;
                    if (gjVar2.H && !gjVar2.I) {
                        bVar.c = f11 + (gjVar2.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
                    }
                    bVar.a = gjVar2.n;
                    return;
                }
            }
            bVar.d = null;
            return;
        }
        ArrayList arrayList4 = messageObject.z2;
        if (arrayList4 == null) {
            bVar.d = null;
            return;
        }
        if (arrayList4.size() == 1) {
            bVar.d = ((gj) messageObject.z2.get(0)).e;
            bVar.b = r11.f;
            gj gjVar3 = (gj) messageObject.z2.get(0);
            float f12 = -(gjVar3.l() ? ((int) Math.ceil(messageObject.v2)) - (gjVar3.I ? org.telegram.messenger.i0.L(10.0f) : 0) : 0);
            bVar.c = f12;
            if (gjVar3.H && !gjVar3.I) {
                bVar.c = f12 + (gjVar3.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
            }
            bVar.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.z2.size(); i13++) {
            gj gjVar4 = (gj) messageObject.z2.get(i13);
            int i14 = i10 - gjVar4.n;
            if (i14 >= 0 && i14 <= gjVar4.e.getText().length()) {
                bVar.d = gjVar4.e;
                bVar.b = gjVar4.o(messageObject.z2) + gjVar4.f;
                float f13 = -(gjVar4.l() ? ((int) Math.ceil(messageObject.v2)) - (gjVar4.I ? org.telegram.messenger.i0.L(10.0f) : 0) : 0);
                bVar.c = f13;
                if (gjVar4.H && !gjVar4.I) {
                    bVar.c = f13 + (gjVar4.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
                }
                bVar.a = gjVar4.n;
                return;
            }
        }
        bVar.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        Layout layout;
        float o10;
        int i14;
        float f7;
        float f10;
        Layout layout2;
        int i15;
        Layout layout3;
        q1 q1Var = (q1) r9Var;
        if (q1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z11 = z10 ? this.r0 : this.q0;
        boolean z12 = z10 ? this.t0 : this.s0;
        boolean z13 = z10 ? this.v0 : this.u0;
        if (z11) {
            layout2 = q1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    vv vvVar = q1Var.getMessageObject() != null ? q1Var.getMessageObject().w2 : null;
                    if (vvVar != null) {
                        ArrayList arrayList = vvVar.n;
                        if (!arrayList.isEmpty()) {
                            u9 u9Var = (u9) i0.a.g(1, arrayList);
                            layout = u9Var.a();
                            f7 = u9Var.getY();
                        }
                    }
                    return -1;
                }
                if (q1Var.a2()) {
                    gj gjVar = (gj) q1Var.getCaptionLayout().e.get(q1Var.getCaptionLayout().e.size() - 1);
                    layout = gjVar.e;
                    o10 = gjVar.o(q1Var.getCaptionLayout().e);
                    i14 = gjVar.f;
                } else {
                    gj gjVar2 = (gj) q1Var.getMessageObject().z2.get(q1Var.getMessageObject().z2.size() - 1);
                    layout = gjVar2.e;
                    o10 = gjVar2.o(q1Var.getMessageObject().z2);
                    i14 = gjVar2.f;
                }
                f7 = i14 + o10;
                Layout layout4 = layout;
                f10 = f7;
                layout2 = layout4;
                if (layout2 != null) {
                    if (i17 < 0) {
                        i17 = 1;
                    }
                    int lineBottom = (int) (f10 + layout2.getLineBottom(layout2.getLineCount() - 1));
                    if (i17 > lineBottom) {
                        i17 = lineBottom - 1;
                    }
                    x1 x1Var = q1Var.gb;
                    jj messageObject = q1Var.getMessageObject();
                    ge.b bVar = this.a0;
                    if (!z10 ? this.q0 : this.r0) {
                        bVar.d = q1Var.getDescriptionlayout();
                        bVar.c = 0.0f;
                        bVar.b = 0.0f;
                        bVar.a = 0;
                    } else {
                        if (!z10 ? this.s0 : this.t0) {
                            if (!z10 ? !this.u0 : !this.v0) {
                                i15 = -1;
                                if (!q1Var.a2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.z2.size()) {
                                            break;
                                        }
                                        gj gjVar3 = (gj) messageObject.z2.get(i18);
                                        float f11 = i17;
                                        if (f11 < gjVar3.o(messageObject.z2) || f11 > gjVar3.o(messageObject.z2) + gjVar3.f + gjVar3.j(x1Var)) {
                                            i18++;
                                        } else {
                                            bVar.d = gjVar3.e;
                                            bVar.b = gjVar3.o(messageObject.z2) + gjVar3.f;
                                            float f12 = -(gjVar3.l() ? ((int) Math.ceil(messageObject.v2)) - (gjVar3.I ? org.telegram.messenger.i0.L(10.0f) : gjVar3.H ? org.telegram.messenger.i0.L(0.0f) : 0) : 0);
                                            bVar.c = f12;
                                            if (gjVar3.H && !gjVar3.I) {
                                                bVar.c = f12 + (gjVar3.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
                                            }
                                            bVar.a = gjVar3.n;
                                        }
                                    }
                                } else {
                                    hj captionLayout = q1Var.getCaptionLayout();
                                    int i19 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = captionLayout.e;
                                        if (i19 >= arrayList2.size()) {
                                            break;
                                        }
                                        gj gjVar4 = (gj) arrayList2.get(i19);
                                        float f13 = i17;
                                        if (f13 < gjVar4.o(arrayList2) || f13 > gjVar4.o(arrayList2) + gjVar4.f + gjVar4.j(x1Var)) {
                                            i19++;
                                        } else {
                                            bVar.d = gjVar4.e;
                                            bVar.b = gjVar4.o(arrayList2) + gjVar4.f;
                                            float f14 = -(gjVar4.l() ? ((int) Math.ceil(captionLayout.d)) - (gjVar4.I ? org.telegram.messenger.i0.L(10.0f) : 0) : 0);
                                            bVar.c = f14;
                                            if (gjVar4.H && !gjVar4.I) {
                                                bVar.c = f14 + (gjVar4.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(8.0f));
                                            }
                                            bVar.a = gjVar4.n;
                                        }
                                    }
                                }
                            } else {
                                vv vvVar2 = messageObject != null ? messageObject.w2 : null;
                                if (vvVar2 != null) {
                                    ArrayList arrayList3 = vvVar2.n;
                                    if (!arrayList3.isEmpty()) {
                                        int i20 = TLObject.FLAG_31;
                                        int i21 = -1;
                                        int i22 = -1;
                                        int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                                            u9 u9Var2 = (u9) arrayList3.get(i24);
                                            int y3 = u9Var2.getY();
                                            int height = u9Var2.a().getHeight() + y3;
                                            int x10 = u9Var2.getX();
                                            int width = u9Var2.a().getWidth() + x10;
                                            boolean z14 = i17 >= y3 && i17 < height;
                                            boolean z15 = i16 >= x10 && i16 < width;
                                            u9Var2.a().getText();
                                            if (z14) {
                                                if (x10 <= i16 && x10 > i20) {
                                                    i21 = i24;
                                                    i20 = x10;
                                                }
                                                int min = z15 ? 0 : Math.min(Math.abs(i16 - x10), Math.abs(i16 - width));
                                                if (min < i23) {
                                                    i23 = min;
                                                    i22 = i24;
                                                }
                                            }
                                        }
                                        i15 = -1;
                                        if (i21 < 0) {
                                            i21 = i22;
                                        }
                                        if (i21 < 0) {
                                            int i25 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                            i21 = 0;
                                            for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                                                u9 u9Var3 = (u9) arrayList3.get(i26);
                                                int y10 = u9Var3.getY();
                                                int min2 = Math.min(Math.abs(i17 - y10), Math.abs(i17 - (u9Var3.a().getHeight() + y10)));
                                                if (min2 < i25) {
                                                    i21 = i26;
                                                    i25 = min2;
                                                }
                                            }
                                        }
                                        bVar.d = ((u9) arrayList3.get(i21)).a();
                                        bVar.b = r2.getY();
                                        bVar.c = r2.getX();
                                        bVar.a = ((Integer) vvVar2.o.get(i21)).intValue();
                                    }
                                }
                                i15 = -1;
                                bVar.d = null;
                            }
                            layout3 = (Layout) bVar.d;
                            if (layout3 != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - bVar.c);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout3.getLineCount()) {
                                    i28 = i15;
                                    break;
                                }
                                float f15 = i17;
                                if (f15 > bVar.b + layout3.getLineTop(i28) && f15 < bVar.b + layout3.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout3.getOffsetForHorizontal(i28, i27) + bVar.a;
                            }
                            return i15;
                        }
                        bVar.d = q1Var.getFactCheckLayout();
                        bVar.c = 0.0f;
                        bVar.b = 0.0f;
                        bVar.a = 0;
                    }
                    i15 = -1;
                    layout3 = (Layout) bVar.d;
                    if (layout3 != null) {
                    }
                }
                return -1;
            }
            layout2 = q1Var.getFactCheckLayout();
        }
        f10 = 0.0f;
        if (layout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int m() {
        Layout layout;
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getMessageObject() != null) {
            jj messageObject = ((q1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                vv vvVar = messageObject != null ? messageObject.w2 : null;
                if (vvVar != null) {
                    ArrayList arrayList = vvVar.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((u9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).a2()) {
                layout = ((gj) ((q1) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.z2;
                if (arrayList2 != null) {
                    layout = ((gj) arrayList2.get(0)).e;
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
    @Override // org.telegram.ui.Cells.w9
    public final CharSequence s(r9 r9Var, boolean z10) {
        q1 q1Var = (q1) r9Var;
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
            return q1Var.a2() ? q1Var.getCaptionLayout().a : q1Var.getMessageObject().v;
        }
        vv vvVar = q1Var.getMessageObject().w2;
        return vvVar != null ? vvVar.q : "";
    }

    @Override // org.telegram.ui.Cells.w9
    public void w() {
        super.w();
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.s0 || this.t0) {
                ((q1) r9Var2).n2();
            }
        }
    }
}
