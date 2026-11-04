package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lb extends LinearLayout implements cs {
    public long a;
    public final int b;
    public final kb c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final wp[] h;
    public final wp[] n;
    public ValueAnimator r;

    public lb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = -1L;
        this.h = new wp[1];
        this.n = new wp[1];
        this.b = i3;
        this.a = h10.i(i3).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        k2.p1.u(textView, 1, 13.0f, null, 2131745165);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, mf.r(-2, -2, 5));
        kb kbVar = new kb(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = kbVar;
        kbVar.n = true;
        kbVar.getDrawable().r(false, true);
        kbVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(kbVar, i10, e6Var);
        kbVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        kbVar.setGravity(5);
        kbVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(kbVar, mf.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i3 = this.b;
        e9 y9 = e9.y(i3, false);
        e9 y10 = this.d ? e9.y(i3, true) : null;
        long j10 = 0;
        dg.a i10 = dg.a.i(0L, dg.b.b);
        kb kbVar = this.c;
        kbVar.a();
        if (this.a == h10.i(i3).e()) {
            z11 = !y9.e;
            j10 = y9.p().amount;
            if (y10 != null) {
                z11 |= !y10.e;
                i10 = y10.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = i0.g(i3).h(this.a, false);
            boolean z12 = h == null || h.status == null;
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z12;
        }
        long j11 = this.f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 8));
            this.r.addListener(new ai.e1(this, 2));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new x70(org.telegram.messenger.g0.L(48.0f), kbVar), 0, this.e.length(), 33);
            }
            kbVar.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i10.k()) {
                String str = "⭐️" + i10.d();
                wp[] wpVarArr = this.n;
                spannableStringBuilder.append((CharSequence) wb.a1(true, str, 0.62f, wpVarArr));
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(org.telegram.ui.ActionBar.k6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) wb.a1(false, k2.p1.l(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            kbVar.setText(spannableStringBuilder);
        } else {
            kbVar.setText(bd.E(j10, ' '));
        }
        this.f = j10;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.y3) {
            a(true);
        } else if (i3 == hs.C3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i3 = this.b;
        hs.f(i3).c(this, hs.y3);
        hs.f(i3).c(this, hs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.b;
        hs.f(i3).n(this, hs.y3);
        hs.f(i3).n(this, hs.C3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        if (this.a != j10) {
            this.a = j10;
            a(true);
        }
    }
}
