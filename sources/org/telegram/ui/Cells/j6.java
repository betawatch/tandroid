package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final TextView b;
    public final tp c;
    public final v2 d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f;
    public final t80 h;
    public boolean n;

    public j6(org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getContext());
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.t5(320L, grVar);
        this.n = false;
        Context context = k2Var.getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        addView(f7, w7.b6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(cd.L0(2131746700, null));
        f7.addView(textView, w7.b6.r(-2, -2, 51));
        tp tpVar = new tp(context);
        this.c = tpVar;
        tpVar.getDrawable().r(true, true);
        tpVar.b(0.3f, 165L, grVar);
        tpVar.setTypeface(org.telegram.messenger.i0.o());
        tpVar.setTextSize(org.telegram.messenger.i0.L(11.0f));
        tpVar.setPadding(org.telegram.messenger.i0.L(4.33f), 0, org.telegram.messenger.i0.L(4.33f), 0);
        tpVar.setGravity(3);
        f7.addView(tpVar, w7.b6.t(-1, 17, 51, 4, 1, 4, 0));
        v2 v2Var = new v2(null, context, true, d20.s0, resourceProvider);
        this.d = v2Var;
        v2Var.setBackgroundColor(0);
        v2Var.setDialogCellDelegate(new f6((nx0) this, k2Var, context));
        v2Var.H = 15;
        v2Var.I = 83;
        addView(v2Var, w7.b6.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        t80 t80Var = new t80();
        this.h = t80Var;
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        t80Var.f(org.telegram.ui.ActionBar.t6.r1(1.25f, org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider)));
        t80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        tp tpVar = this.c;
        tpVar.a();
        tpVar.setPivotX(0.0f);
        if (z10) {
            tpVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(gr.h).start();
        } else {
            tpVar.setAlpha(z11 ? 1.0f : 0.0f);
            tpVar.setScaleX(z11 ? 1.0f : 0.0f);
            tpVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.i0.C1()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                S = String.valueOf(i10);
            } else {
                S = cd.S(iArr, chat.participants_count);
            }
            tpVar.c(cd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            v2 v2Var = this.d;
            if (z12) {
                v2Var.d0(-chat.id, null, 0, false, z10);
            } else {
                jj jjVar = (jj) i0.a.g(1, arrayList);
                long j10 = -chat.id;
                int i11 = jjVar.k.date;
                if (v2Var.H0 != j10) {
                    v2Var.x4 = -1;
                }
                v2Var.H0 = j10;
                v2Var.B4 = System.currentTimeMillis();
                v2Var.f1 = jjVar;
                v2Var.u2 = false;
                v2Var.N0 = false;
                v2Var.R0 = i11;
                int i12 = jjVar.k.edit_date;
                v2Var.S0 = 0;
                v2Var.T0 = false;
                v2Var.l1 = jjVar.f1();
                v2Var.U0 = 0;
                v2Var.V0 = 0;
                v2Var.W0 = 0;
                v2Var.X0 = jjVar.F4();
                v2Var.g1 = arrayList;
                jj jjVar2 = v2Var.f1;
                if (jjVar2 != null) {
                    v2Var.Y0 = jjVar2.k.send_state;
                }
                v2Var.i0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            v2 v2Var = this.d;
            rectF.set(v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(38.0f), (getWidth() * 0.5f) + v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(46.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            rectF.set(v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(56.0f), (getWidth() * 0.36f) + v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(64.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            rectF.set(((v2Var.getX() + v2Var.getWidth()) - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(43.0f), v2Var.getY() + org.telegram.messenger.i0.L(12.0f), (v2Var.getX() + v2Var.getWidth()) - org.telegram.messenger.i0.L(16.0f), v2Var.getY() + org.telegram.messenger.i0.L(20.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.a);
        RectF rectF = ProfileActivity.R6;
        tp tpVar = this.c;
        tpVar.setTextColor(w02);
        tpVar.setBackground(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
