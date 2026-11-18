package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hb extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new hb());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        String q10;
        boolean z11;
        org.telegram.ui.ActionBar.n5 n5Var;
        ib ibVar = (ib) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) l41Var.H;
        org.telegram.ui.ActionBar.n5 n5Var2 = ibVar.d;
        org.telegram.ui.Components.q9 q9Var = ibVar.c;
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
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
            q10 = O0 != null ? O0.title : null;
            z11 = false;
        } else {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o4));
            org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var2.r(c22);
            q9Var.f(c22, b9Var2);
            q10 = o10.q(c22);
            z11 = !o10.u(c22);
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
                r50Var.b.q0(org.telegram.messenger.fc.p(h20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
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
            textView2.setText(gd.a0(null, null, j3 >= currentTime ? 2131744749 : 2131744755, gd.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.nk, i6Var);
            textView4.setText(gd.M0(starsSubscription.bot_canceled ? z12 ? 2131744740 : 2131744739 : 2131744738, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(gd.a0(null, null, 2131744755, gd.u(j10, false)));
                textView.setVisibility(8);
                n10.r(textView4, org.telegram.ui.ActionBar.n6.nk, i6Var, null, 2131744737);
            } else {
                textView2.setText(gd.a0(null, null, 2131744742, gd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(pb.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.z6, i6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(gd.M0(2131744821, null));
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

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new ib(i7, context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var2 == null) {
            return false;
        }
        Object obj = l41Var.H;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = l41Var2.H;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
