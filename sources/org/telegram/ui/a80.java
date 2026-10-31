package org.telegram.ui;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a80(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        long j10 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.D1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    org.telegram.messenger.i0.g3(new a3.i0(launchActivity, l4, this.b, 19));
                    break;
                }
                break;
            case 1:
                ph.m mVar = (ph.m) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = mVar.c2;
                mVar.S1.setLoading(false);
                mVar.r2 = false;
                if (bool != null) {
                    boolean z10 = j10 > 0;
                    org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(mVar.getContext(), mVar.I0);
                    sbVar.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String L0 = org.telegram.messenger.cd.L0(z10 ? 2131750316 : 2131750315, null);
                    TextView textView = sbVar.b;
                    textView.setText(L0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    String a02 = org.telegram.messenger.cd.a0(null, null, 2131750351, Integer.valueOf(mVar.d2.d.gifts_per_round));
                    TextView textView2 = sbVar.c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    mVar.h1();
                    org.telegram.ui.Components.wb.f(frameLayout, sbVar, 2750).j();
                    rh.e6.y(mVar.a, false).q(null, false, true);
                }
                if (str != null) {
                    mVar.h1();
                    new org.telegram.ui.Components.cc(frameLayout, mVar.I0).Q(R.raw.error, 36, org.telegram.messenger.cd.a0(null, null, 2131743903, str)).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    yh.f0.d(k2Var, -j10, 1);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    org.telegram.ui.Components.cc.a0(k2Var).f0(tL_error, false);
                    break;
                } else {
                    yh.f0.d(k2Var, -j10, 2);
                    break;
                }
        }
    }
}
