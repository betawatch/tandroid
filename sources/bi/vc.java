package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vc extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new vc());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        String p10;
        boolean z10;
        org.telegram.ui.ActionBar.k5 k5Var;
        wc wcVar = (wc) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) x31Var.G;
        org.telegram.ui.ActionBar.k5 k5Var2 = wcVar.d;
        org.telegram.ui.Components.l9 l9Var = wcVar.c;
        org.telegram.ui.ActionBar.f6 f6Var = wcVar.b;
        TextView textView = wcVar.h;
        TextView textView2 = wcVar.f;
        TextView textView3 = wcVar.e;
        int i7 = wcVar.a;
        TextView textView4 = wcVar.n;
        long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
        wcVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
            p10 = M0 != null ? M0.title : null;
            z10 = false;
        } else {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var2.r(a22);
            l9Var.e(a22, w8Var2);
            p10 = t10.p(a22);
            z10 = !t10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean z11 = z10;
        k5Var2.l(org.telegram.messenger.i6.m(p10, k5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                q50 q50Var = new q50(14.0f, i7, textView3);
                q50Var.a(4.0f);
                q50Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                k5Var = k5Var2;
                spannableString.setSpan(q50Var, 0, 1, 33);
                q50Var.b.q0(org.telegram.messenger.hc.p(m20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                k5Var = k5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.i6.m(starsSubscription.title, k5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, wcVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(org.telegram.messenger.id.a0(null, null, j3 >= currentTime ? 2131744987 : 2131744993, org.telegram.messenger.id.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.kk, f6Var);
            textView4.setText(org.telegram.messenger.id.M0(starsSubscription.bot_canceled ? z11 ? 2131744978 : 2131744977 : 2131744976, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744993, org.telegram.messenger.id.u(j10, false)));
                textView.setVisibility(8);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.k6.kk, f6Var, null, 2131744975);
            } else {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744980, org.telegram.messenger.id.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(dd.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.z6, f6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(org.telegram.messenger.id.M0(2131745059, null));
                } else if (i10 == 60) {
                    textView4.setText("per minute");
                } else if (i10 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        wcVar.s = z9;
        wcVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new wc(i7, context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var2 == null) {
            return false;
        }
        Object obj = x31Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = x31Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
