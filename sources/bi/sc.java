package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class sc extends LinearLayout implements ls {
    public long a;
    public final int b;
    public final rc c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final wp[] h;
    public final wp[] n;
    public ValueAnimator r;

    public sc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = -1L;
        this.h = new wp[1];
        this.n = new wp[1];
        this.b = i7;
        this.a = p10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        jg.g.v(textView, 1, 13.0f, null, 2131745158);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.r(-2, -2, 5));
        rc rcVar = new rc(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = rcVar;
        rcVar.n = true;
        rcVar.getDrawable().r(false, true);
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(rcVar, i10, f6Var);
        rcVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(rcVar, c8.ha.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z9) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.b;
        ea y10 = ea.y(i7, false);
        int i10 = 1;
        ea y11 = this.d ? ea.y(i7, true) : null;
        long j3 = 0;
        cg.a i11 = cg.a.i(0L, cg.b.b);
        rc rcVar = this.c;
        rcVar.a();
        if (this.a == p10.i(i7).e()) {
            z10 = !y10.e;
            j3 = y10.p().amount;
            if (y11 != null) {
                z10 |= !y11.e;
                i11 = y11.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = n0.g(i7).h(this.a, false);
            boolean z11 = h == null || h.status == null;
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j3 = tL_starsRevenueStatus.current_balance.amount;
            }
            z10 = z11;
        }
        long j10 = this.f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 8));
            this.r.addListener(new t5(this, i10));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z10) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), rcVar), 0, this.e.length(), 33);
            }
            rcVar.c(this.e, z9, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                wp[] wpVarArr = this.n;
                spannableStringBuilder.append((CharSequence) dd.a1(true, str, 0.62f, wpVarArr));
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(org.telegram.ui.ActionBar.k6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            rcVar.setText(spannableStringBuilder);
        } else {
            rcVar.setText(org.telegram.messenger.id.E(j3, ' '));
        }
        this.f = j3;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y3) {
            a(true);
        } else if (i7 == qs.C3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.b;
        qs.f(i7).c(this, qs.y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.b;
        qs.f(i7).n(this, qs.y3);
        qs.f(i7).n(this, qs.C3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        if (this.a != j3) {
            this.a = j3;
            a(true);
        }
    }
}
