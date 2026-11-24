// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class jr8 extends FrameLayout implements vlb {
    public final ylb a;
    public final TextView b;
    public final wj2 c;
    public final hg3 d;
    public boolean e;
    public final ln f;
    public final qa6 h;
    public boolean n;

    public jr8(d dVar) {
        super(dVar.getContext());
        d53 d53Var = d53.h;
        this.f = new ln(320L, d53Var);
        this.n = false;
        Context context = dVar.getContext();
        ylb resourceProvider = dVar.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout i = hg9.i(context, 0);
        addView(i, qoe.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(jb6.M0(2131746418, null));
        i.addView(textView, qoe.r(-2, -2, 51));
        wj2 wj2Var = new wj2(context);
        this.c = wj2Var;
        wj2Var.getDrawable().r(true, true);
        wj2Var.b(0.3f, 165L, d53Var);
        wj2Var.setTypeface(gm.o());
        wj2Var.setTextSize(gm.L(11.0f));
        wj2Var.setPadding(gm.L(4.33f), 0, gm.L(4.33f), 0);
        wj2Var.setGravity(3);
        i.addView(wj2Var, qoe.t(-1, 17, 51, 4, 1, 4, 0));
        hg3 hg3Var = new hg3(null, context, true, z8c.t0, resourceProvider);
        this.d = hg3Var;
        hg3Var.setBackgroundColor(0);
        hg3Var.setDialogCellDelegate(new gr8((bq8) this, dVar, context));
        hg3Var.I = (byte) 15;
        hg3Var.J = (byte) 83;
        addView(hg3Var, qoe.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        qa6 qa6Var = new qa6();
        this.h = qa6Var;
        int i2 = cmb.h6;
        qa6Var.f(cmb.p1(1.25f, cmb.v0(i2, resourceProvider)), cmb.p1(0.8f, cmb.v0(i2, resourceProvider)));
        qa6Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String S;
        boolean z = this.n;
        boolean z2 = chat == null || chat.participants_count > 0;
        wj2 wj2Var = this.c;
        wj2Var.a();
        wj2Var.setPivotX(0.0f);
        if (z) {
            wj2Var.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.8f).scaleY(z2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(d53.h).start();
        } else {
            wj2Var.setAlpha(z2 ? 1.0f : 0.0f);
            wj2Var.setScaleX(z2 ? 1.0f : 0.0f);
            wj2Var.setScaleY(z2 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            boolean A1 = gm.A1();
            int i = chat.participants_count;
            if (A1) {
                iArr[0] = i;
                S = String.valueOf(i);
            } else {
                S = jb6.S(iArr, i);
            }
            wj2Var.c(jb6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            boolean z3 = arrayList == null || arrayList.isEmpty();
            this.e = z3;
            hg3 hg3Var = this.d;
            if (z3) {
                hg3Var.e0(-chat.id, null, 0, false, z);
            } else {
                k47 k47Var = (k47) b10.f(1, arrayList);
                long j = -chat.id;
                int i2 = k47Var.k.date;
                if (hg3Var.I0 != j) {
                    hg3Var.y4 = -1;
                }
                hg3Var.I0 = j;
                hg3Var.C4 = System.currentTimeMillis();
                hg3Var.g1 = k47Var;
                hg3Var.v2 = false;
                hg3Var.O0 = false;
                hg3Var.S0 = i2;
                int i3 = k47Var.k.edit_date;
                hg3Var.T0 = 0;
                hg3Var.U0 = false;
                hg3Var.m1 = k47Var.e1();
                hg3Var.V0 = 0;
                hg3Var.W0 = 0;
                hg3Var.X0 = 0;
                hg3Var.Y0 = k47Var.E4();
                hg3Var.h1 = arrayList;
                k47 k47Var2 = hg3Var.g1;
                if (k47Var2 != null) {
                    hg3Var.Z0 = k47Var2.k.send_state;
                }
                hg3Var.j0(0, z);
            }
        }
        if (!z) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.K6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            qa6 qa6Var = this.h;
            qa6Var.setAlpha((int) (d * 255.0f));
            RectF rectF = gm.P;
            hg3 hg3Var = this.d;
            rectF.set(hg3Var.getX() + gm.L(hg3Var.J + 6), hg3Var.getY() + gm.L(38.0f), (getWidth() * 0.5f) + hg3Var.getX() + gm.L(hg3Var.J + 6), hg3Var.getY() + gm.L(46.33f));
            qa6Var.e(rectF);
            qa6Var.draw(canvas);
            rectF.set(hg3Var.getX() + gm.L(hg3Var.J + 6), hg3Var.getY() + gm.L(56.0f), (getWidth() * 0.36f) + hg3Var.getX() + gm.L(hg3Var.J + 6), hg3Var.getY() + gm.L(64.33f));
            qa6Var.e(rectF);
            qa6Var.draw(canvas);
            rectF.set(((hg3Var.getX() + hg3Var.getWidth()) - gm.L(16.0f)) - gm.L(43.0f), hg3Var.getY() + gm.L(12.0f), (hg3Var.getX() + hg3Var.getWidth()) - gm.L(16.0f), hg3Var.getY() + gm.L(20.33f));
            qa6Var.e(rectF);
            qa6Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(102.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        int v0 = cmb.v0(cmb.K6, this.a);
        RectF rectF = ProfileActivity.e7;
        wj2 wj2Var = this.c;
        wj2Var.setTextColor(v0);
        wj2Var.setBackground(cmb.c0(gm.L(9.0f), gm.L(9.0f), cmb.p1(0.1f, v0)));
        this.b.setTextColor(v0);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
