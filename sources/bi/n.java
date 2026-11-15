package bi;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.u8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                y yVar = (y) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = yVar.g2;
                yVar.W1.setLoading(false);
                yVar.v2 = false;
                if (bool != null) {
                    boolean z10 = j3 > 0;
                    tb tbVar = new tb(yVar.getContext(), yVar.J0);
                    tbVar.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String M0 = hd.M0(z10 ? 2131750307 : 2131750306, null);
                    TextView textView = tbVar.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = hd.a0(null, null, 2131750342, Integer.valueOf(yVar.h2.d.gifts_per_round));
                    TextView textView2 = tbVar.c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    yVar.h1();
                    xb.f(frameLayout, tbVar, 2750).j();
                    u8.y(yVar.a, false).q(null, false, true);
                }
                if (str != null) {
                    yVar.h1();
                    new cc(frameLayout, yVar.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    li.l0.d(e2Var, -j3, 1);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    cc.a0(e2Var).f0(tL_error, false);
                    break;
                } else {
                    li.l0.d(e2Var, -j3, 2);
                    break;
                }
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new m1(launchActivity, l10, this.b, 29));
                    break;
                }
                break;
        }
    }
}
