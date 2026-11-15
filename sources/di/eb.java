package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.p50;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class eb extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new eb());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        String p10;
        boolean z11;
        org.telegram.ui.ActionBar.j5 j5Var;
        fb fbVar = (fb) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) b41Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = fbVar.d;
        org.telegram.ui.Components.i9 i9Var = fbVar.c;
        org.telegram.ui.ActionBar.e6 e6Var = fbVar.b;
        TextView textView = fbVar.h;
        TextView textView2 = fbVar.f;
        TextView textView3 = fbVar.e;
        int i7 = fbVar.a;
        TextView textView4 = fbVar.n;
        long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
        fbVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-o4));
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
            p10 = M0 != null ? M0.title : null;
            z11 = false;
        } else {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(o4));
            org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var2.r(a22);
            i9Var.f(a22, t8Var2);
            p10 = q10.p(a22);
            z11 = !q10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean z12 = z11;
        j5Var2.l(org.telegram.messenger.j6.m(p10, j5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                p50 p50Var = new p50(14.0f, i7, textView3);
                p50Var.a(4.0f);
                p50Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                j5Var = j5Var2;
                spannableString.setSpan(p50Var, 0, 1, 33);
                p50Var.b.q0(org.telegram.messenger.gc.p(k20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                j5Var = j5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.j6.m(starsSubscription.title, j5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, fbVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(hd.a0(null, null, j3 >= currentTime ? 2131744984 : 2131744990, hd.u(j3, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.nk, e6Var);
            textView4.setText(hd.M0(starsSubscription.bot_canceled ? z12 ? 2131744975 : 2131744974 : 2131744973, null));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(hd.a0(null, null, 2131744990, hd.u(j10, false)));
                textView.setVisibility(8);
                i20.q(textView4, org.telegram.ui.ActionBar.j6.nk, e6Var, null, 2131744972);
            } else {
                textView2.setText(hd.a0(null, null, 2131744977, hd.u(j10, false)));
                textView.setVisibility(0);
                textView.setText(mb.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.z6, e6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(hd.M0(2131745056, null));
                } else if (i10 == 60) {
                    textView4.setText("per minute");
                } else if (i10 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        fbVar.s = z10;
        fbVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fb(i7, context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var2 == null) {
            return false;
        }
        Object obj = b41Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = b41Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
