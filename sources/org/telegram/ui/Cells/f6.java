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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class f6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final TextView b;
    public final bq c;
    public final t2 d;
    public boolean e;
    public final org.telegram.ui.Components.c6 f;
    public final o80 h;
    public boolean n;

    public f6(org.telegram.ui.ActionBar.h2 h2Var) {
        super(h2Var.getContext());
        lr lrVar = lr.h;
        this.f = new org.telegram.ui.Components.c6(320L, lrVar);
        this.n = false;
        Context context = h2Var.getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(gd.M0(2131746490, null));
        g10.addView(textView, c8.ma.r(-2, -2, 51));
        bq bqVar = new bq(context);
        this.c = bqVar;
        bqVar.getDrawable().r(true, true);
        bqVar.b(0.3f, 165L, lrVar);
        bqVar.setTypeface(org.telegram.messenger.g0.o());
        bqVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        bqVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        bqVar.setGravity(3);
        g10.addView(bqVar, c8.ma.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, j10.t0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new b6((bw0) this, h2Var, context));
        t2Var.I = 15;
        t2Var.J = 83;
        addView(t2Var, c8.ma.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        o80 o80Var = new o80();
        this.h = o80Var;
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        o80Var.f(org.telegram.ui.ActionBar.n6.r1(1.25f, org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider)));
        o80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        bq bqVar = this.c;
        bqVar.a();
        bqVar.setPivotX(0.0f);
        if (z10) {
            bqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(lr.h).start();
        } else {
            bqVar.setAlpha(z11 ? 1.0f : 0.0f);
            bqVar.setScaleX(z11 ? 1.0f : 0.0f);
            bqVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i7 = chat.participants_count;
                iArr[0] = i7;
                S = String.valueOf(i7);
            } else {
                S = gd.S(iArr, chat.participants_count);
            }
            bqVar.c(gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            t2 t2Var = this.d;
            if (z12) {
                t2Var.d0(-chat.id, null, 0, false, z10);
            } else {
                fj fjVar = (fj) i5.c.h(1, arrayList);
                long j3 = -chat.id;
                int i10 = fjVar.k.date;
                if (t2Var.I0 != j3) {
                    t2Var.y4 = -1;
                }
                t2Var.I0 = j3;
                t2Var.C4 = System.currentTimeMillis();
                t2Var.g1 = fjVar;
                t2Var.v2 = false;
                t2Var.O0 = false;
                t2Var.S0 = i10;
                int i11 = fjVar.k.edit_date;
                t2Var.T0 = 0;
                t2Var.U0 = false;
                t2Var.m1 = fjVar.e1();
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = 0;
                t2Var.Y0 = fjVar.F4();
                t2Var.h1 = arrayList;
                fj fjVar2 = t2Var.g1;
                if (fjVar2 != null) {
                    t2Var.Z0 = fjVar2.k.send_state;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            o80 o80Var = this.h;
            o80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, this.a);
        RectF rectF = ProfileActivity.Z6;
        bq bqVar = this.c;
        bqVar.setTextColor(w02);
        bqVar.setBackground(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
