package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class e6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextView b;
    public final mp c;
    public final t2 d;
    public boolean e;
    public final org.telegram.ui.Components.u5 f;
    public final w70 h;
    public boolean n;

    public e6(org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getContext());
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.u5(320L, xqVar);
        this.n = false;
        Context context = d2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, mf.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(bd.M0(2131746693, null));
        f10.addView(textView, mf.r(-2, -2, 51));
        mp mpVar = new mp(context);
        this.c = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.3f, 165L, xqVar);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        mpVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        mpVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        mpVar.setGravity(3);
        f10.addView(mpVar, mf.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, h10.t0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new a6((sv0) this, d2Var, context));
        t2Var.I = 15;
        t2Var.J = 83;
        addView(t2Var, mf.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        w70 w70Var = new w70();
        this.h = w70Var;
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        w70Var.f(org.telegram.ui.ActionBar.k6.r1(1.25f, org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider)), org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider)));
        w70Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        mp mpVar = this.c;
        mpVar.a();
        mpVar.setPivotX(0.0f);
        if (z10) {
            mpVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xq.h).start();
        } else {
            mpVar.setAlpha(z11 ? 1.0f : 0.0f);
            mpVar.setScaleX(z11 ? 1.0f : 0.0f);
            mpVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i3 = chat.participants_count;
                iArr[0] = i3;
                S = String.valueOf(i3);
            } else {
                S = bd.S(iArr, chat.participants_count);
            }
            mpVar.c(bd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            t2 t2Var = this.d;
            if (z12) {
                t2Var.d0(-chat.id, null, 0, false, z10);
            } else {
                zi ziVar = (zi) k2.p1.h(1, arrayList);
                long j10 = -chat.id;
                int i10 = ziVar.k.date;
                if (t2Var.I0 != j10) {
                    t2Var.y4 = -1;
                }
                t2Var.I0 = j10;
                t2Var.C4 = System.currentTimeMillis();
                t2Var.g1 = ziVar;
                t2Var.v2 = false;
                t2Var.O0 = false;
                t2Var.S0 = i10;
                int i11 = ziVar.k.edit_date;
                t2Var.T0 = 0;
                t2Var.U0 = false;
                t2Var.m1 = ziVar.f1();
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = 0;
                t2Var.Y0 = ziVar.G4();
                t2Var.h1 = arrayList;
                zi ziVar2 = t2Var.g1;
                if (ziVar2 != null) {
                    t2Var.Z0 = ziVar2.k.send_state;
                }
                t2Var.i0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            w70 w70Var = this.h;
            w70Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.a);
        RectF rectF = ProfileActivity.T6;
        mp mpVar = this.c;
        mpVar.setTextColor(w02);
        mpVar.setBackground(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
