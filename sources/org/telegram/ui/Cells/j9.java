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
import org.telegram.messenger.fj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kv;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class j9 extends v9 {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // org.telegram.ui.Cells.v9
    public final boolean C() {
        q9 q9Var;
        kv kvVar;
        CharSequence r10;
        String str;
        if (!this.u0 || (q9Var = this.W) == null || ((q1) q9Var).getMessageObject() == null || (kvVar = ((q1) this.W).getMessageObject().w2) == null || kvVar.n.isEmpty() || (r10 = r()) == null || r10.length() == 0) {
            return false;
        }
        try {
            str = kvVar.w(this.u, this.v);
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

    @Override // org.telegram.ui.Cells.v9
    public final void E(boolean z9) {
        q9 q9Var = this.W;
        if (q9Var == null || !((q1) q9Var).y2() || z9) {
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
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(q1Var, e12, i7));
        ofFloat.addListener(new k1(q1Var, i7));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(e12, ofFloat);
    }

    @Override // org.telegram.ui.Cells.v9
    public final void L(q9 q9Var, q9 q9Var2) {
        q1 q1Var = (q1) q9Var;
        q1 q1Var2 = (q1) q9Var2;
        boolean z9 = q1Var2 == null || !(q1Var2.getMessageObject() == null || q1Var2.getMessageObject().e1() == q1Var.getMessageObject().e1());
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
        ofFloat.addUpdateListener(new ch.u(4, this, z9));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z9) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = iz.a;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(ij ijVar) {
        try {
            int i7 = ijVar.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == ijVar.e1()) {
            f(true);
        }
    }

    public final void X(ij ijVar, fj fjVar, Canvas canvas) {
        ij messageObject;
        q9 q9Var = this.W;
        if (q9Var == null || ((q1) q9Var).getMessageObject() == null || this.q0 || this.s0 || this.u0 || (messageObject = ((q1) this.W).getMessageObject()) == null || messageObject.z2 == null || ijVar.e1() != this.w) {
            return;
        }
        int i7 = this.u;
        int i10 = fjVar.n;
        int i11 = this.v - i10;
        int i12 = 0;
        int j3 = Utilities.j(i7 - i10, fjVar.e.getText().length(), 0);
        int j10 = Utilities.j(i11, fjVar.e.getText().length(), 0);
        if (j3 != j10) {
            boolean P3 = messageObject.P3();
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (P3) {
                int i13 = org.telegram.ui.ActionBar.m6.Jc;
                paint2.setColor(t(i13));
                paint.setColor(t(i13));
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.ig;
                paint2.setColor(t(i14));
                paint.setColor(t(i14));
            }
            if (fjVar.I) {
                i12 = org.telegram.messenger.g0.L(10.0f);
            } else if (fjVar.H) {
                i12 = org.telegram.messenger.g0.L(0.0f);
            }
            h(canvas, fjVar.e, j3, j10, true, true, i12);
        }
    }

    public final void Y(boolean z9, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z9) {
                int i7 = org.telegram.ui.ActionBar.m6.Jc;
                paint2.setColor(t(i7));
                paint.setColor(t(i7));
            } else {
                int i10 = org.telegram.ui.ActionBar.m6.ig;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(ij ijVar, kv kvVar, Canvas canvas) {
        Canvas canvas2;
        if (!this.u0 || kvVar == null) {
            return;
        }
        ArrayList arrayList = kvVar.n;
        q9 q9Var = this.W;
        if (q9Var == null || ((q1) q9Var).getMessageObject() == null || ((q1) this.W).getMessageObject().e1() != ijVar.e1()) {
            return;
        }
        boolean P3 = ijVar.P3();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (P3) {
            int i7 = org.telegram.ui.ActionBar.m6.Jc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.m6.ig;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Layout a10 = ((t9) arrayList.get(i11)).a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) kvVar.o.get(i11)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(this.u - intValue, length, 0);
                int j10 = Utilities.j(this.v - intValue, length, 0);
                if (j3 != j10) {
                    boolean z9 = this.u >= intValue;
                    boolean z10 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r2.getX(), r2.getY());
                    canvas2 = canvas;
                    h(canvas2, a10, j3, j10, z9, z10, 0.0f);
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
        boolean z9 = ((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().w2 != null;
        this.u0 = z9;
        if (z9) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i7;
        this.v = i10;
        w();
        c8.da daVar = this.D;
        if (daVar != null) {
            daVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        kv kvVar;
        this.X = q1Var;
        ij messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.hb;
        boolean z9 = this.r0;
        Rect rect = this.B;
        if (z9 && q1Var.getDescriptionlayout() != null) {
            int i7 = this.c;
            rect.set(i7, this.d, q1Var.getDescriptionlayout().getWidth() + i7, q1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && q1Var.getFactCheckLayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, q1Var.getFactCheckLayout().getWidth() + i10, q1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (kvVar = messageObject.w2) != null && !kvVar.n.isEmpty()) {
            kv kvVar2 = messageObject.w2;
            int i11 = this.c;
            int i12 = this.d;
            rect.set(i11, i12, kvVar2.C + i11, kvVar2.t() + i12);
            return;
        }
        if (q1Var.c2() && q1Var.getCaptionLayout().e.size() > 0) {
            fj fjVar = (fj) jg.g.i(1, q1Var.getCaptionLayout().e);
            int i13 = this.c;
            rect.set(i13, this.d, fjVar.e.getWidth() + i13, (int) (fjVar.p(q1Var.getCaptionLayout().e, x1Var) + this.d + fjVar.f + fjVar.e.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.z2) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            fj fjVar2 = (fj) jg.g.i(1, messageObject.z2);
            int i14 = this.c;
            rect.set(i14, this.d, fjVar2.e.getWidth() + i14, (int) (fjVar2.p(messageObject.z2, x1Var) + this.d + fjVar2.f + fjVar2.e.getHeight()));
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

    @Override // org.telegram.ui.Cells.v9
    public final void f(boolean z9) {
        super.f(z9);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void i(int i7, l9 l9Var, boolean z9) {
        q1 q1Var = (q1) (z9 ? this.X : this.W);
        if (q1Var == null) {
            l9Var.d = null;
            return;
        }
        ij messageObject = q1Var.getMessageObject();
        if (this.q0) {
            l9Var.d = q1Var.getDescriptionlayout();
            l9Var.b = 0.0f;
            l9Var.c = 0.0f;
            l9Var.a = 0;
            return;
        }
        if (this.s0) {
            l9Var.d = q1Var.getFactCheckLayout();
            l9Var.b = 0.0f;
            l9Var.c = 0.0f;
            l9Var.a = 0;
            return;
        }
        if (this.u0) {
            kv kvVar = messageObject != null ? messageObject.w2 : null;
            if (kvVar != null) {
                ArrayList arrayList = kvVar.o;
                ArrayList arrayList2 = kvVar.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (r4 >= arrayList2.size()) {
                            r4 = -1;
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(r4)).intValue();
                        int length = ((t9) arrayList2.get(r4)).a().getText().length();
                        if (i7 >= intValue && i7 <= intValue + length) {
                            break;
                        } else {
                            r4++;
                        }
                    }
                    if (r4 < 0) {
                        r4 = arrayList2.size() - 1;
                    }
                    l9Var.d = ((t9) arrayList2.get(r4)).a();
                    l9Var.b = r11.getY();
                    l9Var.c = r11.getX();
                    l9Var.a = ((Integer) arrayList.get(r4)).intValue();
                    return;
                }
            }
            l9Var.d = null;
            return;
        }
        if (q1Var.c2()) {
            gj captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                l9Var.d = ((fj) arrayList3.get(0)).e;
                l9Var.b = r11.f;
                fj fjVar = (fj) arrayList3.get(0);
                float f11 = -(fjVar.l() ? ((int) Math.ceil(f10)) - (fjVar.I ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                l9Var.c = f11;
                if (fjVar.H && !fjVar.I) {
                    l9Var.c = f11 + (fjVar.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                l9Var.a = 0;
                return;
            }
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                fj fjVar2 = (fj) arrayList3.get(i10);
                int i11 = i7 - fjVar2.n;
                if (i11 >= 0 && i11 <= fjVar2.e.getText().length()) {
                    l9Var.d = fjVar2.e;
                    l9Var.b = fjVar2.o(arrayList3) + fjVar2.f;
                    float f12 = -(fjVar2.l() ? ((int) Math.ceil(f10)) - (fjVar2.I ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                    l9Var.c = f12;
                    if (fjVar2.H && !fjVar2.I) {
                        l9Var.c = f12 + (fjVar2.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    l9Var.a = fjVar2.n;
                    return;
                }
            }
            l9Var.d = null;
            return;
        }
        ArrayList arrayList4 = messageObject.z2;
        if (arrayList4 == null) {
            l9Var.d = null;
            return;
        }
        if (arrayList4.size() == 1) {
            l9Var.d = ((fj) messageObject.z2.get(0)).e;
            l9Var.b = r11.f;
            fj fjVar3 = (fj) messageObject.z2.get(0);
            float f13 = -(fjVar3.l() ? ((int) Math.ceil(messageObject.v2)) - (fjVar3.I ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
            l9Var.c = f13;
            if (fjVar3.H && !fjVar3.I) {
                l9Var.c = f13 + (fjVar3.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
            }
            l9Var.a = 0;
            return;
        }
        for (int i12 = 0; i12 < messageObject.z2.size(); i12++) {
            fj fjVar4 = (fj) messageObject.z2.get(i12);
            int i13 = i7 - fjVar4.n;
            if (i13 >= 0 && i13 <= fjVar4.e.getText().length()) {
                l9Var.d = fjVar4.e;
                l9Var.b = fjVar4.o(messageObject.z2) + fjVar4.f;
                float f14 = -(fjVar4.l() ? ((int) Math.ceil(messageObject.v2)) - (fjVar4.I ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                l9Var.c = f14;
                if (fjVar4.H && !fjVar4.I) {
                    l9Var.c = f14 + (fjVar4.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                l9Var.a = fjVar4.n;
                return;
            }
        }
        l9Var.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.v9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z9) {
        Layout layout;
        float o4;
        int i13;
        float f10;
        float f11;
        Layout layout2;
        int i14;
        Layout layout3;
        q1 q1Var = (q1) q9Var;
        if (q1Var == null) {
            return 0;
        }
        int i15 = i7 - i11;
        int i16 = i10 - i12;
        boolean z10 = z9 ? this.r0 : this.q0;
        boolean z11 = z9 ? this.t0 : this.s0;
        boolean z12 = z9 ? this.v0 : this.u0;
        if (z10) {
            layout2 = q1Var.getDescriptionlayout();
        } else {
            if (!z11) {
                if (z12) {
                    kv kvVar = q1Var.getMessageObject() != null ? q1Var.getMessageObject().w2 : null;
                    if (kvVar != null) {
                        ArrayList arrayList = kvVar.n;
                        if (!arrayList.isEmpty()) {
                            t9 t9Var = (t9) jg.g.i(1, arrayList);
                            layout = t9Var.a();
                            f10 = t9Var.getY();
                        }
                    }
                    return -1;
                }
                if (q1Var.c2()) {
                    fj fjVar = (fj) q1Var.getCaptionLayout().e.get(q1Var.getCaptionLayout().e.size() - 1);
                    layout = fjVar.e;
                    o4 = fjVar.o(q1Var.getCaptionLayout().e);
                    i13 = fjVar.f;
                } else {
                    fj fjVar2 = (fj) q1Var.getMessageObject().z2.get(q1Var.getMessageObject().z2.size() - 1);
                    layout = fjVar2.e;
                    o4 = fjVar2.o(q1Var.getMessageObject().z2);
                    i13 = fjVar2.f;
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
                    x1 x1Var = q1Var.hb;
                    ij messageObject = q1Var.getMessageObject();
                    l9 l9Var = this.a0;
                    if (!z9 ? this.q0 : this.r0) {
                        l9Var.d = q1Var.getDescriptionlayout();
                        l9Var.c = 0.0f;
                        l9Var.b = 0.0f;
                        l9Var.a = 0;
                    } else {
                        if (!z9 ? this.s0 : this.t0) {
                            if (!z9 ? !this.u0 : !this.v0) {
                                i14 = -1;
                                if (!q1Var.c2()) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= messageObject.z2.size()) {
                                            break;
                                        }
                                        fj fjVar3 = (fj) messageObject.z2.get(i17);
                                        float f12 = i16;
                                        if (f12 < fjVar3.o(messageObject.z2) || f12 > fjVar3.o(messageObject.z2) + fjVar3.f + fjVar3.j(x1Var)) {
                                            i17++;
                                        } else {
                                            l9Var.d = fjVar3.e;
                                            l9Var.b = fjVar3.o(messageObject.z2) + fjVar3.f;
                                            float f13 = -(fjVar3.l() ? ((int) Math.ceil(messageObject.v2)) - (fjVar3.I ? org.telegram.messenger.g0.L(10.0f) : fjVar3.H ? org.telegram.messenger.g0.L(0.0f) : 0) : 0);
                                            l9Var.c = f13;
                                            if (fjVar3.H && !fjVar3.I) {
                                                l9Var.c = f13 + (fjVar3.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            l9Var.a = fjVar3.n;
                                        }
                                    }
                                } else {
                                    gj captionLayout = q1Var.getCaptionLayout();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = captionLayout.e;
                                        if (i18 >= arrayList2.size()) {
                                            break;
                                        }
                                        fj fjVar4 = (fj) arrayList2.get(i18);
                                        float f14 = i16;
                                        if (f14 < fjVar4.o(arrayList2) || f14 > fjVar4.o(arrayList2) + fjVar4.f + fjVar4.j(x1Var)) {
                                            i18++;
                                        } else {
                                            l9Var.d = fjVar4.e;
                                            l9Var.b = fjVar4.o(arrayList2) + fjVar4.f;
                                            float f15 = -(fjVar4.l() ? ((int) Math.ceil(captionLayout.d)) - (fjVar4.I ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                                            l9Var.c = f15;
                                            if (fjVar4.H && !fjVar4.I) {
                                                l9Var.c = f15 + (fjVar4.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            l9Var.a = fjVar4.n;
                                        }
                                    }
                                }
                            } else {
                                kv kvVar2 = messageObject != null ? messageObject.w2 : null;
                                if (kvVar2 != null) {
                                    ArrayList arrayList3 = kvVar2.n;
                                    if (!arrayList3.isEmpty()) {
                                        int i19 = TLObject.FLAG_31;
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                            t9 t9Var2 = (t9) arrayList3.get(i23);
                                            int y10 = t9Var2.getY();
                                            int height = t9Var2.a().getHeight() + y10;
                                            int x10 = t9Var2.getX();
                                            int width = t9Var2.a().getWidth() + x10;
                                            boolean z13 = i16 >= y10 && i16 < height;
                                            boolean z14 = i15 >= x10 && i15 < width;
                                            t9Var2.a().getText();
                                            if (z13) {
                                                if (x10 <= i15 && x10 > i19) {
                                                    i20 = i23;
                                                    i19 = x10;
                                                }
                                                int min = z14 ? 0 : Math.min(Math.abs(i15 - x10), Math.abs(i15 - width));
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
                                                t9 t9Var3 = (t9) arrayList3.get(i25);
                                                int y11 = t9Var3.getY();
                                                int min2 = Math.min(Math.abs(i16 - y11), Math.abs(i16 - (t9Var3.a().getHeight() + y11)));
                                                if (min2 < i24) {
                                                    i20 = i25;
                                                    i24 = min2;
                                                }
                                            }
                                        }
                                        l9Var.d = ((t9) arrayList3.get(i20)).a();
                                        l9Var.b = r2.getY();
                                        l9Var.c = r2.getX();
                                        l9Var.a = ((Integer) kvVar2.o.get(i20)).intValue();
                                    }
                                }
                                i14 = -1;
                                l9Var.d = null;
                            }
                            layout3 = (Layout) l9Var.d;
                            if (layout3 != null) {
                                return i14;
                            }
                            int i26 = (int) (i15 - l9Var.c);
                            int i27 = 0;
                            while (true) {
                                if (i27 >= layout3.getLineCount()) {
                                    i27 = i14;
                                    break;
                                }
                                float f16 = i16;
                                if (f16 > l9Var.b + layout3.getLineTop(i27) && f16 < l9Var.b + layout3.getLineBottom(i27)) {
                                    break;
                                }
                                i27++;
                            }
                            if (i27 >= 0) {
                                return layout3.getOffsetForHorizontal(i27, i26) + l9Var.a;
                            }
                            return i14;
                        }
                        l9Var.d = q1Var.getFactCheckLayout();
                        l9Var.c = 0.0f;
                        l9Var.b = 0.0f;
                        l9Var.a = 0;
                    }
                    i14 = -1;
                    layout3 = (Layout) l9Var.d;
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

    @Override // org.telegram.ui.Cells.v9
    public final int m() {
        Layout layout;
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).getMessageObject() != null) {
            ij messageObject = ((q1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                kv kvVar = messageObject != null ? messageObject.w2 : null;
                if (kvVar != null) {
                    ArrayList arrayList = kvVar.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((t9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).c2()) {
                layout = ((fj) ((q1) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.z2;
                if (arrayList2 != null) {
                    layout = ((fj) arrayList2.get(0)).e;
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
    @Override // org.telegram.ui.Cells.v9
    public final CharSequence s(q9 q9Var, boolean z9) {
        q1 q1Var = (q1) q9Var;
        if (q1Var == null || q1Var.getMessageObject() == null) {
            return null;
        }
        if (!z9 ? !this.q0 : !this.r0) {
            return q1Var.getDescriptionlayout().getText();
        }
        if (!z9 ? !this.s0 : !this.t0) {
            return q1Var.getFactCheckLayout().getText();
        }
        if (!z9 ? this.u0 : this.v0) {
            return q1Var.c2() ? q1Var.getCaptionLayout().a : q1Var.getMessageObject().v;
        }
        kv kvVar = q1Var.getMessageObject().w2;
        return kvVar != null ? kvVar.q : "";
    }

    @Override // org.telegram.ui.Cells.v9
    public void w() {
        super.w();
        q9 q9Var = this.W;
        if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        q9 q9Var2 = this.W;
        if (q9Var2 != null) {
            if (this.s0 || this.t0) {
                ((q1) q9Var2).p2();
            }
        }
    }
}
