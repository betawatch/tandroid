// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jz implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jz(oc7 oc7Var, long j, nq0 nq0Var) {
        this.a = (byte) 4;
        this.c = oc7Var;
        this.b = j;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                tz tzVar = (tz) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = tzVar.f2;
                tzVar.V1.setLoading(false);
                tzVar.u2 = false;
                if (bool != null) {
                    boolean z = j > 0;
                    q31 q31Var = new q31(tzVar.getContext(), tzVar.J0);
                    q31Var.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String M0 = jb6.M0(z ? 2131750240 : 2131750239, null);
                    TextView textView = q31Var.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(gm.o());
                    String a0 = jb6.a0(null, null, 2131750275, Integer.valueOf(tzVar.g2.d.gifts_per_round));
                    TextView textView2 = q31Var.c;
                    textView2.setText(a0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    tzVar.c1();
                    u31.f(frameLayout, q31Var, 2750).j();
                    jva.v(tzVar.a, false).n(null, false, true);
                }
                if (str != null) {
                    tzVar.c1();
                    new c41(frameLayout, tzVar.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                    break;
                }
                break;
            case 1:
                d dVar = (d) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    yp2.d(1, -j, dVar);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    c41.b0(dVar).g0(tL_error, false);
                    break;
                } else {
                    yp2.d(2, -j, dVar);
                    break;
                }
            case 2:
                lv4 lv4Var = (lv4) obj3;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = lv4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    lv4Var.getMessagesController().d4(tL_StarGiftAuctionState.users, false);
                    lv4Var.getMessagesController().X3(tL_StarGiftAuctionState.chats, false);
                    Boolean bool2 = Boolean.FALSE;
                    long j2 = this.b;
                    if (!((Boolean) longSparseArray.get(j2, bool2)).booleanValue()) {
                        longSparseArray.put(j2, Boolean.TRUE);
                        lv4Var.j(j2, new p2c((Object) lv4Var, j2, (TLObject) tL_StarGiftAuctionState, (byte) 3));
                        break;
                    } else {
                        lv4Var.f(j2, tL_StarGiftAuctionState);
                        break;
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l.longValue() != 0) {
                    gm.c3(new of2((Object) launchActivity, (Object) l, this.b, (byte) 26));
                    break;
                }
                break;
            default:
                oc7 oc7Var = (oc7) obj3;
                if (((TLRPC.Bool) obj) != null) {
                    oc7Var.a3(0, j, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jz(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
