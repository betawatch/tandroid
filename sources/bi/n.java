package bi;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.p10
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
                    bc bcVar = new bc(yVar.getContext(), yVar.J0);
                    bcVar.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String N0 = gd.N0(z10 ? 2131750290 : 2131750289, null);
                    TextView textView = bcVar.b;
                    textView.setText(N0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = gd.a0(null, null, 2131750325, Integer.valueOf(yVar.h2.d.gifts_per_round));
                    TextView textView2 = bcVar.c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    yVar.i1();
                    fc.f(frameLayout, bcVar, 2750).j();
                    di.y8.y(yVar.a, false).q(null, false, true);
                }
                if (str != null) {
                    yVar.i1();
                    new kc(frameLayout, yVar.J0).Q(R.raw.error, 36, gd.a0(null, null, 2131743631, str)).j();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    li.k0.d(1, -j3, g2Var);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    kc.b0(g2Var).g0(tL_error, false);
                    break;
                } else {
                    li.k0.d(2, -j3, g2Var);
                    break;
                }
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.g3(new s2(launchActivity, l10, this.b, 29));
                    break;
                }
                break;
        }
    }
}
