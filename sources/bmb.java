// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class bmb extends mmb {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // mmb
    public final boolean B() {
        hmb hmbVar;
        hl9 hl9Var;
        CharSequence q;
        String str;
        if (!this.u0 || (hmbVar = this.W) == null || ((wb2) hmbVar).getMessageObject() == null || (hl9Var = ((wb2) this.W).getMessageObject().y2) == null || hl9Var.n.isEmpty() || (q = q()) == null || q.length() == 0) {
            return false;
        }
        try {
            str = hl9Var.v(this.u, this.v);
        } catch (Exception e) {
            cc4.g(e, true);
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        hl.f(q, str);
        return true;
    }

    @Override // mmb
    public final void D(boolean z) {
        hmb hmbVar = this.W;
        if (hmbVar == null || !((wb2) hmbVar).B2() || z) {
            return;
        }
        wb2 wb2Var = (wb2) this.W;
        int e1 = wb2Var.getMessageObject().e1();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(e1);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        wb2Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        ofFloat.addUpdateListener(new dx0(wb2Var, e1, (byte) 5));
        ofFloat.addListener(new qb2(wb2Var, (byte) 1));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(e1, ofFloat);
    }

    @Override // mmb
    public final void K(hmb hmbVar, hmb hmbVar2) {
        wb2 wb2Var = (wb2) hmbVar;
        wb2 wb2Var2 = (wb2) hmbVar2;
        boolean z = wb2Var2 == null || !(wb2Var2.getMessageObject() == null || wb2Var2.getMessageObject().e1() == wb2Var.getMessageObject().e1());
        this.w = wb2Var.getMessageObject().e1();
        try {
            int i = wb2Var.getMessageObject().k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i2 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new e20((byte) 10, this, z));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z) {
            wb2Var.setSelectedBackgroundProgress(0.0f);
        }
        boolean z2 = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void V(r47 r47Var) {
        try {
            int i = r47Var.k.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == r47Var.e1()) {
            e(true);
        }
    }

    public final void W(r47 r47Var, o47 o47Var, Canvas canvas) {
        r47 messageObject;
        hmb hmbVar = this.W;
        if (hmbVar == null || ((wb2) hmbVar).getMessageObject() == null || this.q0 || this.s0 || this.u0 || (messageObject = ((wb2) this.W).getMessageObject()) == null || messageObject.B2 == null || r47Var.e1() != this.w) {
            return;
        }
        int i = this.u;
        int i2 = o47Var.n;
        int i3 = this.v - i2;
        int i4 = 0;
        int j = Utilities.j(i - i2, o47Var.e.getText().length(), 0);
        int j2 = Utilities.j(i3, o47Var.e.getText().length(), 0);
        if (j != j2) {
            boolean O3 = messageObject.O3();
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (O3) {
                int i5 = aob.Mc;
                paint2.setColor(s(i5));
                paint.setColor(s(i5));
            } else {
                int i6 = aob.lg;
                paint2.setColor(s(i6));
                paint.setColor(s(i6));
            }
            if (o47Var.J) {
                i4 = hl.L(10.0f);
            } else if (o47Var.I) {
                i4 = hl.L(0.0f);
            }
            g(canvas, o47Var.e, j, j2, true, true, i4);
        }
    }

    public final void X(boolean z, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z) {
                int i = aob.Mc;
                paint2.setColor(s(i));
                paint.setColor(s(i));
            } else {
                int i2 = aob.lg;
                paint2.setColor(s(i2));
                paint.setColor(s(i2));
            }
            g(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Y(r47 r47Var, hl9 hl9Var, Canvas canvas) {
        bmb bmbVar;
        Canvas canvas2;
        if (!this.u0 || hl9Var == null) {
            return;
        }
        ArrayList arrayList = hl9Var.n;
        hmb hmbVar = this.W;
        if (hmbVar == null || ((wb2) hmbVar).getMessageObject() == null || ((wb2) this.W).getMessageObject().e1() != r47Var.e1()) {
            return;
        }
        boolean O3 = r47Var.O3();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (O3) {
            int i = aob.Mc;
            paint2.setColor(s(i));
            paint.setColor(s(i));
        } else {
            int i2 = aob.lg;
            paint2.setColor(s(i2));
            paint.setColor(s(i2));
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Layout a = ((kmb) arrayList.get(i3)).a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) hl9Var.o.get(i3)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(this.u - intValue, length, 0);
                int j2 = Utilities.j(this.v - intValue, length, 0);
                if (j != j2) {
                    boolean z = this.u >= intValue;
                    boolean z2 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r2.getX(), r2.getY());
                    bmbVar = this;
                    canvas2 = canvas;
                    bmbVar.g(canvas2, a, j, j2, z, z2, 0.0f);
                    canvas2.restore();
                    i3++;
                    this = bmbVar;
                    canvas = canvas2;
                }
            }
            bmbVar = this;
            canvas2 = canvas;
            i3++;
            this = bmbVar;
            canvas = canvas2;
        }
    }

    public final void Z(wb2 wb2Var, int i, int i2) {
        if (wb2Var == null) {
            return;
        }
        this.W = wb2Var;
        this.w = wb2Var.getMessageObject().e1();
        boolean z = ((wb2) this.W).getMessageObject().D == 36 && ((wb2) this.W).getMessageObject().y2 != null;
        this.u0 = z;
        if (z) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i;
        this.v = i2;
        v();
        b0f b0fVar = this.D;
        if (b0fVar != null) {
            b0fVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.setVisibility(0);
        }
        S();
    }

    public final void a0(wb2 wb2Var) {
        ArrayList arrayList;
        hl9 hl9Var;
        this.X = wb2Var;
        r47 messageObject = wb2Var.getMessageObject();
        dc2 dc2Var = wb2Var.ub;
        boolean z = this.r0;
        Rect rect = this.B;
        if (z && wb2Var.getDescriptionlayout() != null) {
            int i = this.c;
            rect.set(i, this.d, wb2Var.getDescriptionlayout().getWidth() + i, wb2Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && wb2Var.getFactCheckLayout() != null) {
            int i2 = this.c;
            rect.set(i2, this.d, wb2Var.getFactCheckLayout().getWidth() + i2, wb2Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (hl9Var = messageObject.y2) != null && !hl9Var.n.isEmpty()) {
            hl9 hl9Var2 = messageObject.y2;
            int i3 = this.c;
            int i4 = this.d;
            rect.set(i3, i4, hl9Var2.C + i3, hl9Var2.t() + i4);
            return;
        }
        if (wb2Var.f2() && wb2Var.getCaptionLayout().e.size() > 0) {
            o47 o47Var = (o47) c00.g(1, wb2Var.getCaptionLayout().e);
            int i5 = this.c;
            rect.set(i5, this.d, o47Var.e.getWidth() + i5, (int) (o47Var.p(wb2Var.getCaptionLayout().e, dc2Var) + this.d + o47Var.f + o47Var.e.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.B2) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            o47 o47Var2 = (o47) c00.g(1, messageObject.B2);
            int i6 = this.c;
            rect.set(i6, this.d, o47Var2.e.getWidth() + i6, (int) (o47Var2.p(messageObject.B2, dc2Var) + this.d + o47Var2.f + o47Var2.e.getHeight()));
        }
    }

    public final void b0(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        v();
    }

    @Override // mmb
    public final void e(boolean z) {
        super.e(z);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // mmb
    public final void h(int i, dj2 dj2Var, boolean z) {
        wb2 wb2Var = (wb2) (z ? this.X : this.W);
        if (wb2Var == null) {
            dj2Var.d = null;
            return;
        }
        r47 messageObject = wb2Var.getMessageObject();
        if (this.q0) {
            dj2Var.d = wb2Var.getDescriptionlayout();
            dj2Var.b = 0.0f;
            dj2Var.c = 0.0f;
            dj2Var.a = 0;
            return;
        }
        if (this.s0) {
            dj2Var.d = wb2Var.getFactCheckLayout();
            dj2Var.b = 0.0f;
            dj2Var.c = 0.0f;
            dj2Var.a = 0;
            return;
        }
        if (this.u0) {
            hl9 hl9Var = messageObject != null ? messageObject.y2 : null;
            if (hl9Var != null) {
                ArrayList arrayList = hl9Var.o;
                ArrayList arrayList2 = hl9Var.n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (r4 >= arrayList2.size()) {
                            r4 = -1;
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(r4)).intValue();
                        int length = ((kmb) arrayList2.get(r4)).a().getText().length();
                        if (i >= intValue && i <= intValue + length) {
                            break;
                        } else {
                            r4++;
                        }
                    }
                    if (r4 < 0) {
                        r4 = arrayList2.size() - 1;
                    }
                    dj2Var.d = ((kmb) arrayList2.get(r4)).a();
                    dj2Var.b = r9.getY();
                    dj2Var.c = r9.getX();
                    dj2Var.a = ((Integer) arrayList.get(r4)).intValue();
                    return;
                }
            }
            dj2Var.d = null;
            return;
        }
        if (wb2Var.f2()) {
            p47 captionLayout = wb2Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f = captionLayout.d;
            if (arrayList3.size() == 1) {
                dj2Var.d = ((o47) arrayList3.get(0)).e;
                dj2Var.b = r10.f;
                o47 o47Var = (o47) arrayList3.get(0);
                float f2 = -(o47Var.l() ? ((int) Math.ceil(f)) - (o47Var.J ? hl.L(10.0f) : 0) : 0);
                dj2Var.c = f2;
                if (o47Var.I && !o47Var.J) {
                    dj2Var.c = f2 + (o47Var.V ? hl.L(14.0f) : hl.L(8.0f));
                }
                dj2Var.a = 0;
                return;
            }
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                o47 o47Var2 = (o47) arrayList3.get(i2);
                int i3 = i - o47Var2.n;
                if (i3 >= 0 && i3 <= o47Var2.e.getText().length()) {
                    dj2Var.d = o47Var2.e;
                    dj2Var.b = o47Var2.o(arrayList3) + o47Var2.f;
                    float f3 = -(o47Var2.l() ? ((int) Math.ceil(f)) - (o47Var2.J ? hl.L(10.0f) : 0) : 0);
                    dj2Var.c = f3;
                    if (o47Var2.I && !o47Var2.J) {
                        dj2Var.c = f3 + (o47Var2.V ? hl.L(14.0f) : hl.L(8.0f));
                    }
                    dj2Var.a = o47Var2.n;
                    return;
                }
            }
            dj2Var.d = null;
            return;
        }
        ArrayList arrayList4 = messageObject.B2;
        if (arrayList4 == null) {
            dj2Var.d = null;
            return;
        }
        if (arrayList4.size() == 1) {
            dj2Var.d = ((o47) messageObject.B2.get(0)).e;
            dj2Var.b = r9.f;
            o47 o47Var3 = (o47) messageObject.B2.get(0);
            float f4 = -(o47Var3.l() ? ((int) Math.ceil(messageObject.x2)) - (o47Var3.J ? hl.L(10.0f) : 0) : 0);
            dj2Var.c = f4;
            if (o47Var3.I && !o47Var3.J) {
                dj2Var.c = f4 + (o47Var3.V ? hl.L(14.0f) : hl.L(8.0f));
            }
            dj2Var.a = 0;
            return;
        }
        for (int i4 = 0; i4 < messageObject.B2.size(); i4++) {
            o47 o47Var4 = (o47) messageObject.B2.get(i4);
            int i5 = i - o47Var4.n;
            if (i5 >= 0 && i5 <= o47Var4.e.getText().length()) {
                dj2Var.d = o47Var4.e;
                dj2Var.b = o47Var4.o(messageObject.B2) + o47Var4.f;
                float f5 = -(o47Var4.l() ? ((int) Math.ceil(messageObject.x2)) - (o47Var4.J ? hl.L(10.0f) : 0) : 0);
                dj2Var.c = f5;
                if (o47Var4.I && !o47Var4.J) {
                    dj2Var.c = f5 + (o47Var4.V ? hl.L(14.0f) : hl.L(8.0f));
                }
                dj2Var.a = o47Var4.n;
                return;
            }
        }
        dj2Var.d = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f0, code lost:
    
        r2 = hl.L(14.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fb, code lost:
    
        r7.c = r0 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f6, code lost:
    
        r2 = hl.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fe, code lost:
    
        r7.a = r1.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02df, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c7, code lost:
    
        if (r1.I == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c9, code lost:
    
        r0 = hl.L(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ce, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0303, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x010c, code lost:
    
        if (r6 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010e, code lost:
    
        r0 = r6.y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0114, code lost:
    
        r1 = r0.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x011a, code lost:
    
        if (r1.isEmpty() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x011c, code lost:
    
        r6 = org.telegram.tgnet.TLObject.FLAG_31;
        r8 = 0;
        r9 = -1;
        r12 = -1;
        r13 = org.telegram.tgnet.ConnectionsManager.DEFAULT_DATACENTER_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0128, code lost:
    
        if (r8 >= r1.size()) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x012a, code lost:
    
        r14 = (kmb) r1.get(r8);
        r15 = r14.getY();
        r2 = r14.a().getHeight() + r15;
        r5 = r14.getX();
        r10 = r14.a().getWidth() + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014c, code lost:
    
        if (r4 < r15) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014e, code lost:
    
        if (r4 >= r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0150, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0153, code lost:
    
        if (r3 < r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0155, code lost:
    
        if (r3 >= r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0157, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x015a, code lost:
    
        r14.a().getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0161, code lost:
    
        if (r2 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0163, code lost:
    
        if (r5 > r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0165, code lost:
    
        if (r5 <= r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0167, code lost:
    
        r6 = r5;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0169, code lost:
    
        if (r15 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x016b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x017d, code lost:
    
        if (r2 >= r13) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x017f, code lost:
    
        r13 = r2;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0181, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x016d, code lost:
    
        r2 = java.lang.Math.min(java.lang.Math.abs(r3 - r5), java.lang.Math.abs(r3 - r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0159, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0152, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0184, code lost:
    
        r19 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0186, code lost:
    
        if (r9 >= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0188, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0189, code lost:
    
        if (r9 >= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x018b, code lost:
    
        r2 = 0;
        r5 = org.telegram.tgnet.ConnectionsManager.DEFAULT_DATACENTER_ID;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0194, code lost:
    
        if (r2 >= r1.size()) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0196, code lost:
    
        r6 = (kmb) r1.get(r2);
        r8 = r6.getY();
        r6 = java.lang.Math.min(java.lang.Math.abs(r4 - r8), java.lang.Math.abs(r4 - (r6.a().getHeight() + r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01b9, code lost:
    
        if (r6 >= r5) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01bb, code lost:
    
        r9 = r2;
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01bd, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01c0, code lost:
    
        r7.d = ((kmb) r1.get(r9)).a();
        r7.b = r1.getY();
        r7.c = r1.getX();
        r7.a = ((java.lang.Integer) r0.o.get(r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ea, code lost:
    
        r19 = -1;
        r7.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0111, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x010a, code lost:
    
        if (r18.u0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r18.v0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f0, code lost:
    
        r19 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01fc, code lost:
    
        if (r1.f2() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fe, code lost:
    
        r0 = r1.getCaptionLayout();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0203, code lost:
    
        r6 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0209, code lost:
    
        if (r1 >= r6.size()) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x020b, code lost:
    
        r9 = (o47) r6.get(r1);
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0218, code lost:
    
        if (r11 < r9.o(r6)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x022a, code lost:
    
        if (r11 > ((r9.o(r6) + r9.f) + r9.j(r5))) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x022c, code lost:
    
        r7.d = r9.e;
        r7.b = r9.o(r6) + r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x023c, code lost:
    
        if (r9.J == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x023e, code lost:
    
        r1 = hl.L(10.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0248, code lost:
    
        if (r9.l() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x024a, code lost:
    
        r0 = ((int) java.lang.Math.ceil(r0.d)) - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0255, code lost:
    
        r0 = -r0;
        r7.c = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x025b, code lost:
    
        if (r9.I == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x025f, code lost:
    
        if (r9.J != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0263, code lost:
    
        if (r9.V == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0265, code lost:
    
        r1 = hl.L(14.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0270, code lost:
    
        r7.c = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026b, code lost:
    
        r1 = hl.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0273, code lost:
    
        r7.a = r9.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0243, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0279, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x027c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0283, code lost:
    
        if (r0 >= r6.B2.size()) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0285, code lost:
    
        r1 = (o47) r6.B2.get(r0);
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0296, code lost:
    
        if (r11 < r1.o(r6.B2)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02aa, code lost:
    
        if (r11 > ((r1.o(r6.B2) + r1.f) + r1.j(r5))) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02ac, code lost:
    
        r7.d = r1.e;
        r7.b = r1.o(r6.B2) + r1.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02be, code lost:
    
        if (r1.J == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c0, code lost:
    
        r0 = hl.L(10.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d3, code lost:
    
        if (r1.l() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d5, code lost:
    
        r5 = ((int) java.lang.Math.ceil(r6.x2)) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e0, code lost:
    
        r0 = -r5;
        r7.c = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02e6, code lost:
    
        if (r1.I == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ea, code lost:
    
        if (r1.J != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ee, code lost:
    
        if (r1.V == false) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    @Override // mmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i, int i2, int i3, int i4, hmb hmbVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Layout layout;
        float o;
        int i5;
        float f;
        float f2;
        Layout layout2;
        int i6;
        wb2 wb2Var = (wb2) hmbVar;
        if (wb2Var == null) {
            return 0;
        }
        int i7 = i - i3;
        int i8 = i2 - i4;
        if (z) {
            z2 = this.r0;
            z3 = this.t0;
            z4 = this.v0;
        } else {
            z2 = this.q0;
            z3 = this.s0;
            z4 = this.u0;
        }
        if (z2) {
            layout2 = wb2Var.getDescriptionlayout();
        } else {
            if (!z3) {
                if (z4) {
                    hl9 hl9Var = wb2Var.getMessageObject() != null ? wb2Var.getMessageObject().y2 : null;
                    if (hl9Var != null) {
                        ArrayList arrayList = hl9Var.n;
                        if (!arrayList.isEmpty()) {
                            kmb kmbVar = (kmb) c00.g(1, arrayList);
                            layout = kmbVar.a();
                            f = kmbVar.getY();
                        }
                    }
                    return -1;
                }
                if (wb2Var.f2()) {
                    o47 o47Var = (o47) wb2Var.getCaptionLayout().e.get(wb2Var.getCaptionLayout().e.size() - 1);
                    layout = o47Var.e;
                    o = o47Var.o(wb2Var.getCaptionLayout().e);
                    i5 = o47Var.f;
                } else {
                    o47 o47Var2 = (o47) wb2Var.getMessageObject().B2.get(wb2Var.getMessageObject().B2.size() - 1);
                    layout = o47Var2.e;
                    o = o47Var2.o(wb2Var.getMessageObject().B2);
                    i5 = o47Var2.f;
                }
                f = i5 + o;
                Layout layout3 = layout;
                f2 = f;
                layout2 = layout3;
                if (layout2 != null) {
                    if (i8 < 0) {
                        i8 = 1;
                    }
                    int lineBottom = (int) (f2 + layout2.getLineBottom(layout2.getLineCount() - 1));
                    if (i8 > lineBottom) {
                        i8 = lineBottom - 1;
                    }
                    dc2 dc2Var = wb2Var.ub;
                    r47 messageObject = wb2Var.getMessageObject();
                    dj2 dj2Var = this.a0;
                    if (z) {
                        if (!this.r0) {
                            if (!this.t0) {
                            }
                            dj2Var.d = wb2Var.getFactCheckLayout();
                            dj2Var.c = 0.0f;
                            dj2Var.b = 0.0f;
                            dj2Var.a = 0;
                            i6 = -1;
                        }
                        dj2Var.d = wb2Var.getDescriptionlayout();
                        dj2Var.c = 0.0f;
                        dj2Var.b = 0.0f;
                        dj2Var.a = 0;
                        i6 = -1;
                    } else {
                        if (!this.q0) {
                            if (!this.s0) {
                            }
                            dj2Var.d = wb2Var.getFactCheckLayout();
                            dj2Var.c = 0.0f;
                            dj2Var.b = 0.0f;
                            dj2Var.a = 0;
                            i6 = -1;
                        }
                        dj2Var.d = wb2Var.getDescriptionlayout();
                        dj2Var.c = 0.0f;
                        dj2Var.b = 0.0f;
                        dj2Var.a = 0;
                        i6 = -1;
                    }
                    Layout layout4 = (Layout) dj2Var.d;
                    if (layout4 == null) {
                        return i6;
                    }
                    int i9 = (int) (i7 - dj2Var.c);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= layout4.getLineCount()) {
                            i10 = i6;
                            break;
                        }
                        float f3 = i8;
                        if (f3 > dj2Var.b + layout4.getLineTop(i10) && f3 < dj2Var.b + layout4.getLineBottom(i10)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                        return layout4.getOffsetForHorizontal(i10, i9) + dj2Var.a;
                    }
                    return i6;
                }
                return -1;
            }
            layout2 = wb2Var.getFactCheckLayout();
        }
        f2 = 0.0f;
        if (layout2 != null) {
        }
        return -1;
    }

    @Override // mmb
    public final int l() {
        Layout layout;
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).getMessageObject() != null) {
            r47 messageObject = ((wb2) this.W).getMessageObject();
            if (this.q0) {
                layout = ((wb2) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((wb2) this.W).getFactCheckLayout();
            } else if (this.u0) {
                hl9 hl9Var = messageObject != null ? messageObject.y2 : null;
                if (hl9Var != null) {
                    ArrayList arrayList = hl9Var.n;
                    if (!arrayList.isEmpty()) {
                        layout = ((kmb) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((wb2) this.W).f2()) {
                layout = ((o47) ((wb2) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((o47) arrayList2.get(0)).e;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r1.v0 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r2.f2() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r2.getCaptionLayout().a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return r2.getMessageObject().v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r1 = r2.getMessageObject().y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        return r1.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (r1.u0 != false) goto L24;
     */
    @Override // mmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence r(hmb hmbVar, boolean z) {
        wb2 wb2Var = (wb2) hmbVar;
        if (wb2Var == null || wb2Var.getMessageObject() == null) {
            return null;
        }
        if (z) {
            if (!this.r0) {
                if (!this.t0) {
                }
                return wb2Var.getFactCheckLayout().getText();
            }
            return wb2Var.getDescriptionlayout().getText();
        }
        if (!this.q0) {
            if (!this.s0) {
            }
            return wb2Var.getFactCheckLayout().getText();
        }
        return wb2Var.getDescriptionlayout().getText();
    }

    @Override // mmb
    public void v() {
        super.v();
        hmb hmbVar = this.W;
        if (hmbVar != null && ((wb2) hmbVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        hmb hmbVar2 = this.W;
        if (hmbVar2 != null) {
            if (this.s0 || this.t0) {
                ((wb2) hmbVar2).r2();
            }
        }
    }
}
