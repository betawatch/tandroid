package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hb extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new hb());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        String q10;
        boolean z11;
        org.telegram.ui.ActionBar.n5 n5Var;
        ib ibVar = (ib) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) n41Var.H;
        org.telegram.ui.ActionBar.n5 n5Var2 = ibVar.d;
        org.telegram.ui.Components.p9 p9Var = ibVar.c;
        org.telegram.ui.ActionBar.i6 i6Var = ibVar.b;
        TextView textView = ibVar.h;
        TextView textView2 = ibVar.f;
        TextView textView3 = ibVar.e;
        int i7 = ibVar.a;
        TextView textView4 = ibVar.n;
        long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
        ibVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-o4));
            org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            a9Var.q(O0);
            p9Var.f(O0, a9Var);
            q10 = O0 != null ? O0.title : null;
            z11 = false;
        } else {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o4));
            org.telegram.ui.Components.a9 a9Var2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            a9Var2.r(c22);
            p9Var.f(c22, a9Var2);
            q10 = n10.q(c22);
            z11 = !n10.u(c22);
        }
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean z12 = z11;
        n5Var2.l(org.telegram.messenger.j6.m(q10, n5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
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
                n5Var = n5Var2;
                spannableString.setSpan(r50Var, 0, 1, 33);
                r50Var.b.r0(org.telegram.messenger.fc.p(g20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                n5Var = n5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.j6.m(starsSubscription.title, n5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, ibVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(gd.a0(null, null, j3 >= currentTime ? 2131744743 : 2131744749, gd.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.nk, i6Var);
            textView4.setText(gd.N0(starsSubscription.bot_canceled ? z12 ? 2131744734 : 2131744733 : 2131744732, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(gd.a0(null, null, 2131744749, gd.u(j10, false)));
                textView.setVisibility(8);
                m10.r(textView4, org.telegram.ui.ActionBar.n6.nk, i6Var, null, 2131744731);
            } else {
                textView2.setText(gd.a0(null, null, 2131744736, gd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(pb.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.z6, i6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(gd.N0(2131744815, null));
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

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new ib(i7, context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var2 == null) {
            return false;
        }
        Object obj = n41Var.H;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = n41Var2.H;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
