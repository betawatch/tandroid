package ai;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.e9;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        long j10 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                e0 e0Var = (e0) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = e0Var.d2;
                e0Var.T1.setLoading(false);
                e0Var.s2 = false;
                if (bool != null) {
                    boolean z10 = j10 > 0;
                    wb wbVar = new wb(e0Var.getContext(), e0Var.J0);
                    wbVar.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String M0 = bd.M0(z10 ? 2131750315 : 2131750314, null);
                    TextView textView = wbVar.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = bd.a0(null, null, 2131750350, Integer.valueOf(e0Var.e2.d.gifts_per_round));
                    TextView textView2 = wbVar.c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    e0Var.h1();
                    ac.f(frameLayout, wbVar, 2750).j();
                    e9.y(e0Var.a, false).q(null, false, true);
                }
                if (str != null) {
                    e0Var.h1();
                    new fc(frameLayout, e0Var.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    ji.j0.d(d2Var, -j10, 1);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    fc.a0(d2Var).f0(tL_error, false);
                    break;
                } else {
                    ji.j0.d(d2Var, -j10, 2);
                    break;
                }
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.E1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new r1(launchActivity, l10, this.b, 29));
                    break;
                }
                break;
        }
    }
}
