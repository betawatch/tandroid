package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hb extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new hb());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        String q10;
        boolean z11;
        org.telegram.ui.ActionBar.m5 m5Var;
        ib ibVar = (ib) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) o41Var.H;
        org.telegram.ui.ActionBar.m5 m5Var2 = ibVar.d;
        org.telegram.ui.Components.q9 q9Var = ibVar.c;
        org.telegram.ui.ActionBar.h6 h6Var = ibVar.b;
        TextView textView = ibVar.h;
        TextView textView2 = ibVar.f;
        TextView textView3 = ibVar.e;
        int i7 = ibVar.a;
        TextView textView4 = ibVar.n;
        long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
        ibVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-o4));
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
            q10 = O0 != null ? O0.title : null;
            z11 = false;
        } else {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(o4));
            org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var2.r(c22);
            q9Var.f(c22, b9Var2);
            q10 = p10.q(c22);
            z11 = !p10.u(c22);
        }
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean z12 = z11;
        m5Var2.l(org.telegram.messenger.j6.m(q10, m5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                r50 r50Var = new r50(14.0f, i7, textView3);
                r50Var.a(4.0f);
                r50Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                m5Var = m5Var2;
                spannableString.setSpan(r50Var, 0, 1, 33);
                r50Var.b.q0(org.telegram.messenger.gc.p(i20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                m5Var = m5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.j6.m(starsSubscription.title, m5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, ibVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(hd.a0(null, null, j3 >= currentTime ? 2131744741 : 2131744747, hd.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.nk, h6Var);
            textView4.setText(hd.N0(starsSubscription.bot_canceled ? z12 ? 2131744732 : 2131744731 : 2131744730, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(hd.a0(null, null, 2131744747, hd.u(j10, false)));
                textView.setVisibility(8);
                o10.r(textView4, org.telegram.ui.ActionBar.m6.nk, h6Var, null, 2131744729);
            } else {
                textView2.setText(hd.a0(null, null, 2131744734, hd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(pb.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.z6, h6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(hd.N0(2131744813, null));
                } else if (i10 == 60) {
                    textView4.setText("per minute");
                } else if (i10 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        ibVar.s = z10;
        ibVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ib(i7, context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var2 == null) {
            return false;
        }
        Object obj = o41Var.H;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = o41Var2.H;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
