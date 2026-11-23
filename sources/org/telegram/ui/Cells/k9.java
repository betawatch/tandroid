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
import org.telegram.messenger.cz;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.fv;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class k9 extends w9 {
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
        fv fvVar;
        CharSequence r10;
        String str;
        if (!this.u0 || (r9Var = this.W) == null || ((r1) r9Var).getMessageObject() == null || (fvVar = ((r1) this.W).getMessageObject().y2) == null || fvVar.n.isEmpty() || (r10 = r()) == null || r10.length() == 0) {
            return false;
        }
        try {
            str = fvVar.w(this.u, this.v);
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

    @Override // org.telegram.ui.Cells.w9
    public final void E(boolean z10) {
        r9 r9Var = this.W;
        if (r9Var == null || !((r1) r9Var).B2() || z10) {
            return;
        }
        r1 r1Var = (r1) this.W;
        int e12 = r1Var.getMessageObject().e1();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(e12);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        r1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        int i7 = 1;
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(r1Var, e12, i7));
        ofFloat.addListener(new l1(r1Var, i7));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(e12, ofFloat);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void L(r9 r9Var, r9 r9Var2) {
        r1 r1Var = (r1) r9Var;
        r1 r1Var2 = (r1) r9Var2;
        boolean z10 = r1Var2 == null || !(r1Var2.getMessageObject() == null || r1Var2.getMessageObject().e1() == r1Var.getMessageObject().e1());
        this.w = r1Var.getMessageObject().e1();
        try {
            int i7 = r1Var.getMessageObject().k.edit_date;
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
        ofFloat.addUpdateListener(new ch.v(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            r1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = cz.a;
        SharedPreferences.Editor edit = np.g1().edit();
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
        r9 r9Var = this.W;
        if (r9Var == null || ((r1) r9Var).getMessageObject() == null || this.q0 || this.s0 || this.u0 || (messageObject = ((r1) this.W).getMessageObject()) == null || messageObject.B2 == null || gjVar.e1() != this.w) {
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
                int i13 = org.telegram.ui.ActionBar.m6.Mc;
                paint2.setColor(t(i13));
                paint.setColor(t(i13));
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.lg;
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
                int i7 = org.telegram.ui.ActionBar.m6.Mc;
                paint2.setColor(t(i7));
                paint.setColor(t(i7));
            } else {
                int i10 = org.telegram.ui.ActionBar.m6.lg;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(gj gjVar, fv fvVar, Canvas canvas) {
        Canvas canvas2;
        if (!this.u0 || fvVar == null) {
            return;
        }
        ArrayList arrayList = fvVar.n;
        r9 r9Var = this.W;
        if (r9Var == null || ((r1) r9Var).getMessageObject() == null || ((r1) this.W).getMessageObject().e1() != gjVar.e1()) {
            return;
        }
        boolean P3 = gjVar.P3();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (P3) {
            int i7 = org.telegram.ui.ActionBar.m6.Mc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.m6.lg;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Layout a10 = ((u9) arrayList.get(i11)).a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) fvVar.o.get(i11)).intValue();
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

    public final void a0(r1 r1Var, int i7, int i10) {
        if (r1Var == null) {
            return;
        }
        this.W = r1Var;
        this.w = r1Var.getMessageObject().e1();
        boolean z10 = ((r1) this.W).getMessageObject().D == 36 && ((r1) this.W).getMessageObject().y2 != null;
        this.u0 = z10;
        if (z10) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i7;
        this.v = i10;
        w();
        c8.ha haVar = this.D;
        if (haVar != null) {
            haVar.a(true);
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

    public final void b0(r1 r1Var) {
        ArrayList arrayList;
        fv fvVar;
        this.X = r1Var;
        gj messageObject = r1Var.getMessageObject();
        y1 y1Var = r1Var.ib;
        boolean z10 = this.r0;
        Rect rect = this.B;
        if (z10 && r1Var.getDescriptionlayout() != null) {
            int i7 = this.c;
            rect.set(i7, this.d, r1Var.getDescriptionlayout().getWidth() + i7, r1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && r1Var.getFactCheckLayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, r1Var.getFactCheckLayout().getWidth() + i10, r1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (fvVar = messageObject.y2) != null && !fvVar.n.isEmpty()) {
            fv fvVar2 = messageObject.y2;
            int i11 = this.c;
            int i12 = this.d;
            rect.set(i11, i12, fvVar2.C + i11, fvVar2.t() + i12);
            return;
        }
        if (r1Var.d2() && r1Var.getCaptionLayout().e.size() > 0) {
            dj djVar = (dj) i5.c.h(1, r1Var.getCaptionLayout().e);
            int i13 = this.c;
            rect.set(i13, this.d, djVar.e.getWidth() + i13, (int) (djVar.p(r1Var.getCaptionLayout().e, y1Var) + this.d + djVar.f + djVar.e.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.B2) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            dj djVar2 = (dj) i5.c.h(1, messageObject.B2);
            int i14 = this.c;
            rect.set(i14, this.d, djVar2.e.getWidth() + i14, (int) (djVar2.p(messageObject.B2, y1Var) + this.d + djVar2.f + djVar2.e.getHeight()));
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

    @Override // org.telegram.ui.Cells.w9
    public final void f(boolean z10) {
        super.f(z10);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void i(int i7, m9 m9Var, boolean z10) {
        r1 r1Var = (r1) (z10 ? this.X : this.W);
        if (r1Var == null) {
            m9Var.d = null;
            return;
        }
        gj messageObject = r1Var.getMessageObject();
        if (this.q0) {
            m9Var.d = r1Var.getDescriptionlayout();
            m9Var.b = 0.0f;
            m9Var.c = 0.0f;
            m9Var.a = 0;
            return;
        }
        if (this.s0) {
            m9Var.d = r1Var.getFactCheckLayout();
            m9Var.b = 0.0f;
            m9Var.c = 0.0f;
            m9Var.a = 0;
            return;
        }
        if (this.u0) {
            fv fvVar = messageObject != null ? messageObject.y2 : null;
            if (fvVar != null) {
                ArrayList arrayList = fvVar.o;
                ArrayList arrayList2 = fvVar.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (r4 >= arrayList2.size()) {
                            r4 = -1;
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(r4)).intValue();
                        int length = ((u9) arrayList2.get(r4)).a().getText().length();
                        if (i7 >= intValue && i7 <= intValue + length) {
                            break;
                        } else {
                            r4++;
                        }
                    }
                    if (r4 < 0) {
                        r4 = arrayList2.size() - 1;
                    }
                    m9Var.d = ((u9) arrayList2.get(r4)).a();
                    m9Var.b = r11.getY();
                    m9Var.c = r11.getX();
                    m9Var.a = ((Integer) arrayList.get(r4)).intValue();
                    return;
                }
            }
            m9Var.d = null;
            return;
        }
        if (r1Var.d2()) {
            ej captionLayout = r1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                m9Var.d = ((dj) arrayList3.get(0)).e;
                m9Var.b = r11.f;
                dj djVar = (dj) arrayList3.get(0);
                float f11 = -(djVar.l() ? ((int) Math.ceil(f10)) - (djVar.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                m9Var.c = f11;
                if (djVar.I && !djVar.J) {
                    m9Var.c = f11 + (djVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                m9Var.a = 0;
                return;
            }
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                dj djVar2 = (dj) arrayList3.get(i10);
                int i11 = i7 - djVar2.n;
                if (i11 >= 0 && i11 <= djVar2.e.getText().length()) {
                    m9Var.d = djVar2.e;
                    m9Var.b = djVar2.o(arrayList3) + djVar2.f;
                    float f12 = -(djVar2.l() ? ((int) Math.ceil(f10)) - (djVar2.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                    m9Var.c = f12;
                    if (djVar2.I && !djVar2.J) {
                        m9Var.c = f12 + (djVar2.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    m9Var.a = djVar2.n;
                    return;
                }
            }
            m9Var.d = null;
            return;
        }
        ArrayList arrayList4 = messageObject.B2;
        if (arrayList4 == null) {
            m9Var.d = null;
            return;
        }
        if (arrayList4.size() == 1) {
            m9Var.d = ((dj) messageObject.B2.get(0)).e;
            m9Var.b = r11.f;
            dj djVar3 = (dj) messageObject.B2.get(0);
            float f13 = -(djVar3.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar3.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
            m9Var.c = f13;
            if (djVar3.I && !djVar3.J) {
                m9Var.c = f13 + (djVar3.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
            }
            m9Var.a = 0;
            return;
        }
        for (int i12 = 0; i12 < messageObject.B2.size(); i12++) {
            dj djVar4 = (dj) messageObject.B2.get(i12);
            int i13 = i7 - djVar4.n;
            if (i13 >= 0 && i13 <= djVar4.e.getText().length()) {
                m9Var.d = djVar4.e;
                m9Var.b = djVar4.o(messageObject.B2) + djVar4.f;
                float f14 = -(djVar4.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar4.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                m9Var.c = f14;
                if (djVar4.I && !djVar4.J) {
                    m9Var.c = f14 + (djVar4.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                }
                m9Var.a = djVar4.n;
                return;
            }
        }
        m9Var.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10) {
        Layout layout;
        float o4;
        int i13;
        float f10;
        float f11;
        Layout layout2;
        int i14;
        Layout layout3;
        r1 r1Var = (r1) r9Var;
        if (r1Var == null) {
            return 0;
        }
        int i15 = i7 - i11;
        int i16 = i10 - i12;
        boolean z11 = z10 ? this.r0 : this.q0;
        boolean z12 = z10 ? this.t0 : this.s0;
        boolean z13 = z10 ? this.v0 : this.u0;
        if (z11) {
            layout2 = r1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    fv fvVar = r1Var.getMessageObject() != null ? r1Var.getMessageObject().y2 : null;
                    if (fvVar != null) {
                        ArrayList arrayList = fvVar.n;
                        if (!arrayList.isEmpty()) {
                            u9 u9Var = (u9) i5.c.h(1, arrayList);
                            layout = u9Var.a();
                            f10 = u9Var.getY();
                        }
                    }
                    return -1;
                }
                if (r1Var.d2()) {
                    dj djVar = (dj) r1Var.getCaptionLayout().e.get(r1Var.getCaptionLayout().e.size() - 1);
                    layout = djVar.e;
                    o4 = djVar.o(r1Var.getCaptionLayout().e);
                    i13 = djVar.f;
                } else {
                    dj djVar2 = (dj) r1Var.getMessageObject().B2.get(r1Var.getMessageObject().B2.size() - 1);
                    layout = djVar2.e;
                    o4 = djVar2.o(r1Var.getMessageObject().B2);
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
                    y1 y1Var = r1Var.ib;
                    gj messageObject = r1Var.getMessageObject();
                    m9 m9Var = this.a0;
                    if (!z10 ? this.q0 : this.r0) {
                        m9Var.d = r1Var.getDescriptionlayout();
                        m9Var.c = 0.0f;
                        m9Var.b = 0.0f;
                        m9Var.a = 0;
                    } else {
                        if (!z10 ? this.s0 : this.t0) {
                            if (!z10 ? !this.u0 : !this.v0) {
                                i14 = -1;
                                if (!r1Var.d2()) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= messageObject.B2.size()) {
                                            break;
                                        }
                                        dj djVar3 = (dj) messageObject.B2.get(i17);
                                        float f12 = i16;
                                        if (f12 < djVar3.o(messageObject.B2) || f12 > djVar3.o(messageObject.B2) + djVar3.f + djVar3.j(y1Var)) {
                                            i17++;
                                        } else {
                                            m9Var.d = djVar3.e;
                                            m9Var.b = djVar3.o(messageObject.B2) + djVar3.f;
                                            float f13 = -(djVar3.l() ? ((int) Math.ceil(messageObject.x2)) - (djVar3.J ? org.telegram.messenger.g0.L(10.0f) : djVar3.I ? org.telegram.messenger.g0.L(0.0f) : 0) : 0);
                                            m9Var.c = f13;
                                            if (djVar3.I && !djVar3.J) {
                                                m9Var.c = f13 + (djVar3.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            m9Var.a = djVar3.n;
                                        }
                                    }
                                } else {
                                    ej captionLayout = r1Var.getCaptionLayout();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = captionLayout.e;
                                        if (i18 >= arrayList2.size()) {
                                            break;
                                        }
                                        dj djVar4 = (dj) arrayList2.get(i18);
                                        float f14 = i16;
                                        if (f14 < djVar4.o(arrayList2) || f14 > djVar4.o(arrayList2) + djVar4.f + djVar4.j(y1Var)) {
                                            i18++;
                                        } else {
                                            m9Var.d = djVar4.e;
                                            m9Var.b = djVar4.o(arrayList2) + djVar4.f;
                                            float f15 = -(djVar4.l() ? ((int) Math.ceil(captionLayout.d)) - (djVar4.J ? org.telegram.messenger.g0.L(10.0f) : 0) : 0);
                                            m9Var.c = f15;
                                            if (djVar4.I && !djVar4.J) {
                                                m9Var.c = f15 + (djVar4.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(8.0f));
                                            }
                                            m9Var.a = djVar4.n;
                                        }
                                    }
                                }
                            } else {
                                fv fvVar2 = messageObject != null ? messageObject.y2 : null;
                                if (fvVar2 != null) {
                                    ArrayList arrayList3 = fvVar2.n;
                                    if (!arrayList3.isEmpty()) {
                                        int i19 = TLObject.FLAG_31;
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                            u9 u9Var2 = (u9) arrayList3.get(i23);
                                            int y10 = u9Var2.getY();
                                            int height = u9Var2.a().getHeight() + y10;
                                            int x10 = u9Var2.getX();
                                            int width = u9Var2.a().getWidth() + x10;
                                            boolean z14 = i16 >= y10 && i16 < height;
                                            boolean z15 = i15 >= x10 && i15 < width;
                                            u9Var2.a().getText();
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
                                                u9 u9Var3 = (u9) arrayList3.get(i25);
                                                int y11 = u9Var3.getY();
                                                int min2 = Math.min(Math.abs(i16 - y11), Math.abs(i16 - (u9Var3.a().getHeight() + y11)));
                                                if (min2 < i24) {
                                                    i20 = i25;
                                                    i24 = min2;
                                                }
                                            }
                                        }
                                        m9Var.d = ((u9) arrayList3.get(i20)).a();
                                        m9Var.b = r2.getY();
                                        m9Var.c = r2.getX();
                                        m9Var.a = ((Integer) fvVar2.o.get(i20)).intValue();
                                    }
                                }
                                i14 = -1;
                                m9Var.d = null;
                            }
                            layout3 = (Layout) m9Var.d;
                            if (layout3 != null) {
                                return i14;
                            }
                            int i26 = (int) (i15 - m9Var.c);
                            int i27 = 0;
                            while (true) {
                                if (i27 >= layout3.getLineCount()) {
                                    i27 = i14;
                                    break;
                                }
                                float f16 = i16;
                                if (f16 > m9Var.b + layout3.getLineTop(i27) && f16 < m9Var.b + layout3.getLineBottom(i27)) {
                                    break;
                                }
                                i27++;
                            }
                            if (i27 >= 0) {
                                return layout3.getOffsetForHorizontal(i27, i26) + m9Var.a;
                            }
                            return i14;
                        }
                        m9Var.d = r1Var.getFactCheckLayout();
                        m9Var.c = 0.0f;
                        m9Var.b = 0.0f;
                        m9Var.a = 0;
                    }
                    i14 = -1;
                    layout3 = (Layout) m9Var.d;
                    if (layout3 != null) {
                    }
                }
                return -1;
            }
            layout2 = r1Var.getFactCheckLayout();
        }
        f11 = 0.0f;
        if (layout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int m() {
        Layout layout;
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).getMessageObject() != null) {
            gj messageObject = ((r1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((r1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((r1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                fv fvVar = messageObject != null ? messageObject.y2 : null;
                if (fvVar != null) {
                    ArrayList arrayList = fvVar.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((u9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((r1) this.W).d2()) {
                layout = ((dj) ((r1) this.W).getCaptionLayout().e.get(0)).e;
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
    @Override // org.telegram.ui.Cells.w9
    public final CharSequence s(r9 r9Var, boolean z10) {
        r1 r1Var = (r1) r9Var;
        if (r1Var == null || r1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.q0 : !this.r0) {
            return r1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.s0 : !this.t0) {
            return r1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.u0 : this.v0) {
            return r1Var.d2() ? r1Var.getCaptionLayout().a : r1Var.getMessageObject().v;
        }
        fv fvVar = r1Var.getMessageObject().y2;
        return fvVar != null ? fvVar.q : "";
    }

    @Override // org.telegram.ui.Cells.w9
    public void w() {
        super.w();
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.s0 || this.t0) {
                ((r1) r9Var2).q2();
            }
        }
    }
}
