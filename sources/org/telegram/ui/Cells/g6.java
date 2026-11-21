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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final TextView b;
    public final dq c;
    public final u2 d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f;
    public final q80 h;
    public boolean n;

    public g6(org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getContext());
        nr nrVar = nr.h;
        this.f = new org.telegram.ui.Components.d6(320L, nrVar);
        this.n = false;
        Context context = g2Var.getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(gd.N0(2131746489, null));
        g10.addView(textView, c8.ma.r(-2, -2, 51));
        dq dqVar = new dq(context);
        this.c = dqVar;
        dqVar.getDrawable().r(true, true);
        dqVar.b(0.3f, 165L, nrVar);
        dqVar.setTypeface(org.telegram.messenger.g0.o());
        dqVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        dqVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        dqVar.setGravity(3);
        g10.addView(dqVar, c8.ma.t(-1, 17, 51, 4, 1, 4, 0));
        u2 u2Var = new u2(null, context, true, j10.t0, resourceProvider);
        this.d = u2Var;
        u2Var.setBackgroundColor(0);
        u2Var.setDialogCellDelegate(new c6((bw0) this, g2Var, context));
        u2Var.I = 15;
        u2Var.J = 83;
        addView(u2Var, c8.ma.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        q80 q80Var = new q80();
        this.h = q80Var;
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        q80Var.f(org.telegram.ui.ActionBar.m6.r1(1.25f, org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider)));
        q80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        dq dqVar = this.c;
        dqVar.a();
        dqVar.setPivotX(0.0f);
        if (z10) {
            dqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(nr.h).start();
        } else {
            dqVar.setAlpha(z11 ? 1.0f : 0.0f);
            dqVar.setScaleX(z11 ? 1.0f : 0.0f);
            dqVar.setScaleY(z11 ? 1.0f : 0.0f);
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
            dqVar.c(gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            u2 u2Var = this.d;
            if (z12) {
                u2Var.d0(-chat.id, null, 0, false, z10);
            } else {
                fj fjVar = (fj) i5.c.h(1, arrayList);
                long j3 = -chat.id;
                int i10 = fjVar.k.date;
                if (u2Var.I0 != j3) {
                    u2Var.y4 = -1;
                }
                u2Var.I0 = j3;
                u2Var.C4 = System.currentTimeMillis();
                u2Var.g1 = fjVar;
                u2Var.v2 = false;
                u2Var.O0 = false;
                u2Var.S0 = i10;
                int i11 = fjVar.k.edit_date;
                u2Var.T0 = 0;
                u2Var.U0 = false;
                u2Var.m1 = fjVar.e1();
                u2Var.V0 = 0;
                u2Var.W0 = 0;
                u2Var.X0 = 0;
                u2Var.Y0 = fjVar.F4();
                u2Var.h1 = arrayList;
                fj fjVar2 = u2Var.g1;
                if (fjVar2 != null) {
                    u2Var.Z0 = fjVar2.k.send_state;
                }
                u2Var.i0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            q80 q80Var = this.h;
            q80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            u2 u2Var = this.d;
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            rectF.set(((u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), u2Var.getY() + org.telegram.messenger.g0.L(12.0f), (u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), u2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.a);
        RectF rectF = ProfileActivity.Z6;
        dq dqVar = this.c;
        dqVar.setTextColor(w02);
        dqVar.setBackground(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
