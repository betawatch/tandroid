package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import c8.na;
import di.pb;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w extends LinearLayout implements fs {
    public final p9 a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.n6 c;
    public final org.telegram.ui.Components.n6 d;
    public final kq[] e;
    public boolean f;

    public w(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = new kq[1];
        setOrientation(0);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.c = n6Var;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        n6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.d = n6Var2;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.y6, i6Var);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        p9 p9Var = new p9(context);
        this.a = p9Var;
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.b = n6Var3;
        n6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i7, i6Var);
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        n6Var3.setGravity(17);
        addView(n6Var3, na.p(66, -2, 0.0f, 16));
        addView(p9Var, na.p(32, 32, 0.0f, 16));
        addView(n6Var, na.p(0, -2, 1.0f, 16));
        addView(n6Var2, na.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(pb.b1(false, i5.c.l((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.n6 n6Var = this.b;
        if (!z10 || i7 > 3) {
            if (i7 >= 10000) {
                n6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
            } else if (i7 >= 1000) {
                n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            }
            n6Var.c(Integer.toString(i7), z11, true);
            return;
        }
        if (i7 == 1) {
            n6Var.c(org.telegram.messenger.j6.o("🥇", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        } else if (i7 == 2) {
            n6Var.c(org.telegram.messenger.j6.o("🥈", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        } else if (i7 == 3) {
            n6Var.c(org.telegram.messenger.j6.o("🥉", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
        }
    }

    public final void c(TLRPC.User user) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        p9 p9Var = this.a;
        p9Var.f(user, a9Var);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.c.setText(n10.q(user));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.l4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }
}
