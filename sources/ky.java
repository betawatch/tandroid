// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ky implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ky(uc7 uc7Var, long j, pp0 pp0Var) {
        this.a = (byte) 4;
        this.c = uc7Var;
        this.b = j;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                uy uyVar = (uy) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = uyVar.f2;
                uyVar.V1.setLoading(false);
                uyVar.u2 = false;
                if (bool != null) {
                    boolean z = j > 0;
                    r21 r21Var = new r21(uyVar.getContext(), uyVar.J0);
                    r21Var.a.setImageResource(R.drawable.filled_gift_sell_24);
                    String M0 = ob6.M0(z ? 2131750268 : 2131750267, null);
                    TextView textView = r21Var.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(hl.o());
                    String a0 = ob6.a0(null, null, 2131750303, Integer.valueOf(uyVar.g2.d.gifts_per_round));
                    TextView textView2 = r21Var.c;
                    textView2.setText(a0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    uyVar.d1();
                    v21.f(frameLayout, r21Var, 2750).j();
                    jxa.v(uyVar.a, false).n(null, false, true);
                }
                if (str != null) {
                    uyVar.d1();
                    new d31(frameLayout, uyVar.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                    break;
                }
                break;
            case 1:
                e eVar = (e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    gp2.d(1, -j, eVar);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    d31.b0(eVar).g0(tL_error, false);
                    break;
                } else {
                    gp2.d(2, -j, eVar);
                    break;
                }
            case 2:
                ov4 ov4Var = (ov4) obj3;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = ov4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    ov4Var.getMessagesController().j4(tL_StarGiftAuctionState.users, false);
                    ov4Var.getMessagesController().c4(tL_StarGiftAuctionState.chats, false);
                    Boolean bool2 = Boolean.FALSE;
                    long j2 = this.b;
                    if (!((Boolean) longSparseArray.get(j2, bool2)).booleanValue()) {
                        longSparseArray.put(j2, Boolean.TRUE);
                        ov4Var.j(j2, new p4c((Object) ov4Var, j2, (TLObject) tL_StarGiftAuctionState, (byte) 3));
                        break;
                    } else {
                        ov4Var.f(j2, tL_StarGiftAuctionState);
                        break;
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l.longValue() != 0) {
                    hl.c3(new ue2((Object) launchActivity, (Object) l, this.b, (byte) 26));
                    break;
                }
                break;
            default:
                uc7 uc7Var = (uc7) obj3;
                if (((TLRPC.Bool) obj) != null) {
                    uc7Var.e3(0, j, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ky(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
