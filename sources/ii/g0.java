package ii;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d3;
import bi.ea;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                f2 f2Var = (f2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    m0.d(f2Var, -j3, 1);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    hc.a0(f2Var).f0(tL_error, false);
                    break;
                } else {
                    m0.d(f2Var, -j3, 2);
                    break;
                }
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str = LaunchActivity.B1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new d3(launchActivity, l10, this.b, 28));
                    break;
                }
                break;
            default:
                zh.l lVar = (zh.l) obj3;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                FrameLayout frameLayout = lVar.c2;
                lVar.S1.setLoading(false);
                lVar.r2 = false;
                if (bool != null) {
                    boolean z9 = j3 > 0;
                    yb ybVar = new yb(lVar.getContext(), lVar.I0);
                    ybVar.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String M0 = id.M0(z9 ? 2131750308 : 2131750307, null);
                    TextView textView = ybVar.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = id.a0(null, null, 2131750343, Integer.valueOf(lVar.d2.d.gifts_per_round));
                    TextView textView2 = ybVar.c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    lVar.h1();
                    cc.f(frameLayout, ybVar, 2750).j();
                    ea.y(lVar.a, false).q(null, false, true);
                }
                if (str2 != null) {
                    lVar.h1();
                    new hc(frameLayout, lVar.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743881, str2)).j();
                    break;
                }
                break;
        }
    }
}
