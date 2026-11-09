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
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vc extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new vc());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        String p10;
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var;
        wc wcVar = (wc) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) y31Var.G;
        org.telegram.ui.ActionBar.l5 l5Var2 = wcVar.d;
        org.telegram.ui.Components.l9 l9Var = wcVar.c;
        org.telegram.ui.ActionBar.g6 g6Var = wcVar.b;
        TextView textView = wcVar.h;
        TextView textView2 = wcVar.f;
        TextView textView3 = wcVar.e;
        int i7 = wcVar.a;
        TextView textView4 = wcVar.n;
        long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
        wcVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
            p10 = M0 != null ? M0.title : null;
            z10 = false;
        } else {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
            w8Var2.r(a22);
            l9Var.e(a22, w8Var2);
            p10 = t10.p(a22);
            z10 = !t10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean z11 = z10;
        l5Var2.l(org.telegram.messenger.i6.m(p10, l5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                s50 s50Var = new s50(14.0f, i7, textView3);
                s50Var.a(4.0f);
                s50Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                l5Var = l5Var2;
                spannableString.setSpan(s50Var, 0, 1, 33);
                s50Var.b.q0(org.telegram.messenger.hc.p(m20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                l5Var = l5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.i6.m(starsSubscription.title, l5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, wcVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(org.telegram.messenger.id.a0(null, null, j3 >= currentTime ? 2131744984 : 2131744990, org.telegram.messenger.id.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.s6.U(textView4, org.telegram.ui.ActionBar.l6.kk, g6Var);
            textView4.setText(org.telegram.messenger.id.M0(starsSubscription.bot_canceled ? z11 ? 2131744975 : 2131744974 : 2131744973, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744990, org.telegram.messenger.id.u(j10, false)));
                textView.setVisibility(8);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.l6.kk, g6Var, null, 2131744972);
            } else {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744977, org.telegram.messenger.id.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(dd.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.s6.U(textView4, org.telegram.ui.ActionBar.l6.z6, g6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(org.telegram.messenger.id.M0(2131745056, null));
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

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wc(i7, context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var2 == null) {
            return false;
        }
        Object obj = y31Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = y31Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
