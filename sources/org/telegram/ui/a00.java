package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.a00;
import org.telegram.ui.c00;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a00 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ c00 d;

    public a00(c00 c00Var, Context context) {
        this.d = c00Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        c00 c00Var = this.d;
        if (c00Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / c00Var.s)) + (!c00Var.O ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        c00 c00Var = this.d;
        return i7 < ((int) Math.ceil((double) (((float) c00Var.f.size()) / ((float) c00Var.s)))) ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        c00 c00Var = this.d;
        vz vzVar = c00Var.T;
        ArrayList arrayList = c00Var.f;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / c00Var.s);
                    int i11 = c00Var.s;
                    ((org.telegram.ui.Components.yz) view).w = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            u2Var.t2 = i7 != b() - 1;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            boolean z10 = u2Var.getMessage() != null && u2Var.getMessage().e1() == fjVar.e1();
            u2Var.P = c00Var.q0;
            u2Var.d0(org.telegram.messenger.fj.B0(fjVar.k), fjVar, fjVar.k.date, false, false);
            if (!c00Var.p0.V1()) {
                u2Var.c0(false, z10);
                return;
            }
            int e12 = fjVar.e1();
            vzVar.a = org.telegram.messenger.fj.B0(fjVar.k);
            vzVar.b = e12;
            u2Var.c0(c00Var.p0.r0(vzVar), z10);
            return;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
        q7Var.setItemsCount(c00Var.s);
        q7Var.setIsFirst(i7 == 0);
        int i12 = 0;
        while (true) {
            int i13 = c00Var.s;
            if (i12 >= i13) {
                q7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i7) + i12;
            if (i14 < arrayList.size()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i14);
                q7Var.c(i12, arrayList.indexOf(fjVar2), fjVar2);
                if (c00Var.p0.V1()) {
                    int e13 = fjVar2.e1();
                    vzVar.a = org.telegram.messenger.fj.B0(fjVar2.k);
                    vzVar.b = e13;
                    q7Var.b(i12, c00Var.p0.r0(vzVar), true);
                } else {
                    q7Var.b(i12, false, true);
                }
            } else {
                q7Var.c(i12, i14, null);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.yz, org.telegram.ui.qz] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i7 == 0) {
            final org.telegram.ui.Cells.q7 q7Var = new org.telegram.ui.Cells.q7(context);
            Paint paint = new Paint();
            q7Var.n = paint;
            q7Var.s = org.telegram.messenger.j10.t0;
            q7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            q7Var.b = new org.telegram.messenger.fj[6];
            q7Var.a = new org.telegram.ui.Cells.n7[6];
            q7Var.c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                q7Var.a[i10] = new org.telegram.ui.Cells.n7(q7Var, context);
                q7Var.addView(q7Var.a[i10]);
                q7Var.a[i10].setVisibility(4);
                q7Var.a[i10].setTag(Integer.valueOf(i10));
                q7Var.a[i10].setOnClickListener(new org.telegram.ui.Cells.a(q7Var, 10));
                q7Var.a[i10].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.m7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        q7 q7Var2 = q7.this;
                        if (q7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        o7 o7Var = q7Var2.d;
                        int i11 = q7Var2.c[intValue];
                        fj fjVar = q7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) o7Var;
                        c00 c00Var = ((a00) fVar.b).d;
                        if (!c00Var.p0.V1()) {
                            c00.a(c00Var, fjVar, q7Var2, intValue);
                            return true;
                        }
                        c00 c00Var2 = ((a00) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
                        c00Var2.f(i11, q7Var2, fjVar, intValue);
                        return true;
                    }
                });
            }
            q7Var.setDelegate(new f(this, 16));
            frameLayout = q7Var;
        } else {
            if (i7 != 2) {
                r62 = new qz(1, context, this);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return i5.c.q(r62, r62, -1, -2);
            }
            FrameLayout y3Var = new org.telegram.ui.Cells.y3(context, null);
            y3Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.e7, false) & (-218103809));
            frameLayout = y3Var;
        }
        r62 = frameLayout;
        return i5.c.q(r62, r62, -1, -2);
    }
}
