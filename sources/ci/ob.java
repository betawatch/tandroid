package ci;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.k50;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ob extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new ob());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        String p10;
        boolean z11;
        org.telegram.ui.ActionBar.k5 k5Var;
        pb pbVar = (pb) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) r31Var.G;
        org.telegram.ui.ActionBar.k5 k5Var2 = pbVar.d;
        org.telegram.ui.Components.k9 k9Var = pbVar.c;
        org.telegram.ui.ActionBar.e6 e6Var = pbVar.b;
        TextView textView = pbVar.h;
        TextView textView2 = pbVar.f;
        TextView textView3 = pbVar.e;
        int i3 = pbVar.a;
        TextView textView4 = pbVar.n;
        long o10 = org.telegram.messenger.m5.o(starsSubscription.peer);
        pbVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (o10 < 0) {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-o10));
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
            p10 = M0 != null ? M0.title : null;
            z11 = false;
        } else {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
            org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var2.r(a22);
            k9Var.e(a22, u8Var2);
            p10 = l10.p(a22);
            z11 = !l10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        boolean z12 = z11;
        k5Var2.l(org.telegram.messenger.i6.m(p10, k5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                k50 k50Var = new k50(14.0f, i3, textView3);
                k50Var.a(4.0f);
                k50Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                k5Var = k5Var2;
                spannableString.setSpan(k50Var, 0, 1, 33);
                k50Var.b.q0(org.telegram.messenger.ac.p(e20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                k5Var = k5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.i6.m(starsSubscription.title, k5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, pbVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            textView2.setText(bd.a0(null, null, j10 >= currentTime ? 2131744994 : 2131745000, bd.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.kk, e6Var);
            textView4.setText(bd.M0(starsSubscription.bot_canceled ? z12 ? 2131744985 : 2131744984 : 2131744983, null));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(bd.a0(null, null, 2131745000, bd.u(j11, false)));
                textView.setVisibility(8);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.k6.kk, e6Var, null, 2131744982);
            } else {
                textView2.setText(bd.a0(null, null, 2131744987, bd.u(j11, false)));
                textView.setVisibility(0);
                textView.setText(wb.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.z6, e6Var);
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(bd.M0(2131745066, null));
                } else if (i10 == 60) {
                    textView4.setText("per minute");
                } else if (i10 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        pbVar.s = z10;
        pbVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new pb(i3, context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var2 == null) {
            return false;
        }
        Object obj = r31Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = r31Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
