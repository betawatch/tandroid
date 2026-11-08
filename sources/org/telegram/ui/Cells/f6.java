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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class f6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final TextView b;
    public final mp c;
    public final t2 d;
    public boolean e;
    public final org.telegram.ui.Components.w5 f;
    public final a80 h;
    public boolean n;

    public f6(org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getContext());
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.w5(320L, xqVar);
        this.n = false;
        Context context = f2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(id.M0(2131746686, null));
        f10.addView(textView, c8.ha.r(-2, -2, 51));
        mp mpVar = new mp(context);
        this.c = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.3f, 165L, xqVar);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        mpVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        mpVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        mpVar.setGravity(3);
        f10.addView(mpVar, c8.ha.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, p10.s0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new b6((aw0) this, f2Var, context));
        t2Var.H = 15;
        t2Var.I = 83;
        addView(t2Var, c8.ha.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        a80 a80Var = new a80();
        this.h = a80Var;
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        a80Var.f(org.telegram.ui.ActionBar.k6.r1(1.25f, org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider)));
        a80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z9 = this.n;
        boolean z10 = chat == null || chat.participants_count > 0;
        mp mpVar = this.c;
        mpVar.a();
        mpVar.setPivotX(0.0f);
        if (z9) {
            mpVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xq.h).start();
        } else {
            mpVar.setAlpha(z10 ? 1.0f : 0.0f);
            mpVar.setScaleX(z10 ? 1.0f : 0.0f);
            mpVar.setScaleY(z10 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i7 = chat.participants_count;
                iArr[0] = i7;
                S = String.valueOf(i7);
            } else {
                S = id.S(iArr, chat.participants_count);
            }
            mpVar.c(id.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z11 = arrayList == null || arrayList.isEmpty();
            this.e = z11;
            t2 t2Var = this.d;
            if (z11) {
                t2Var.d0(-chat.id, null, 0, false, z9);
            } else {
                ij ijVar = (ij) jg.g.i(1, arrayList);
                long j3 = -chat.id;
                int i10 = ijVar.k.date;
                if (t2Var.H0 != j3) {
                    t2Var.x4 = -1;
                }
                t2Var.H0 = j3;
                t2Var.B4 = System.currentTimeMillis();
                t2Var.f1 = ijVar;
                t2Var.u2 = false;
                t2Var.N0 = false;
                t2Var.R0 = i10;
                int i11 = ijVar.k.edit_date;
                t2Var.S0 = 0;
                t2Var.T0 = false;
                t2Var.l1 = ijVar.f1();
                t2Var.U0 = 0;
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = ijVar.G4();
                t2Var.g1 = arrayList;
                ij ijVar2 = t2Var.f1;
                if (ijVar2 != null) {
                    t2Var.Y0 = ijVar2.k.send_state;
                }
                t2Var.j0(0, z9);
            }
        }
        if (!z9) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            a80 a80Var = this.h;
            a80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.a);
        RectF rectF = ProfileActivity.S6;
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
