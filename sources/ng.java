// default package

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ng implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ng(int i, long j, x53 x53Var, Context context, TLRPC.Photo photo) {
        this.c = i;
        this.d = j;
        this.e = photo;
        this.b = context;
        this.f = x53Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.d;
        int i = this.c;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                x53 x53Var = (x53) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = uc7.s1(i).j1(j);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i).sendRequest(reportprofilephoto, null);
                new d31(o11.a(context), x53Var).E(x53Var).j();
                break;
            case 1:
                Context context2 = (Context) obj4;
                vnb vnbVar = (vnb) obj5;
                ex4 ex4Var = (ex4) obj3;
                kv4 kv4Var = (kv4) obj;
                if (kv4Var != null) {
                    int i2 = this.c;
                    yac.h(i2);
                    long n = wf3.n(kv4Var.e.peer);
                    long j2 = this.d;
                    if (j2 != n && j2 != 0 && n != 0) {
                        wy wyVar = new wy(context2, i2, kv4Var, j2, ex4Var);
                        TLObject X1 = n >= 0 ? uc7.s1(i2).X1(Long.valueOf(n)) : uc7.s1(i2).M0(Long.valueOf(-n));
                        TLObject X12 = j2 >= 0 ? uc7.s1(i2).X1(Long.valueOf(j2)) : uc7.s1(i2).M0(Long.valueOf(-j2));
                        LinearLayout j3 = uh9.j(context2, 1);
                        j3.addView(new vua(context2, X1, X12), tre.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        jn7.i(textView);
                        textView.setText(ob6.M0(2131750266, null));
                        int i3 = aob.j5;
                        qd4.w(textView, i3, vnbVar, 1, 20.0f);
                        textView.setGravity(ob6.a0 ? 5 : 3);
                        j3.addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        yob.X(textView2, i3, vnbVar);
                        textView2.setTextSize(1, 16.0f);
                        uh9.r(null, null, 2131750265, new Object[]{wf3.s(n), wf3.s(j2)}, textView2);
                        j3.addView(textView2, tre.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context2);
                        alertDialog$Builder.n(j3);
                        alertDialog$Builder.j(ob6.M0(2131751736, null), new m0(wyVar, (byte) 22));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (kv4Var.e.bid_date > 0 && !kv4Var.f()) {
                        uy uyVar = new uy(context2, vnbVar, null, kv4Var);
                        uyVar.i2 = ex4Var;
                        uyVar.show();
                        break;
                    } else {
                        new fz(context2, vnbVar, j2, kv4Var.d, ex4Var).show();
                        break;
                    }
                }
                break;
            case 2:
                a55 a55Var = (a55) obj5;
                pcc pccVar = (pcc) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    pccVar.a(a55.z(tL_error, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j4 = this.d;
                    int i4 = this.c;
                    if (!optBoolean) {
                        a55Var.d(i4, j4, pccVar);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j4;
                        a55Var.f.sendRequestTyped(tonconnectclosesession, new ic((byte) 0), new p45(a55Var, pccVar, j4, i4, (byte) 1));
                        break;
                    }
                }
                break;
            default:
                vz8 vz8Var = (vz8) obj5;
                uz8 uz8Var = (uz8) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (vz8Var.x == ((int[]) obj4)[0]) {
                    vz8Var.x = 0;
                }
                if (uz8Var != null && vz8.h(i).get(j) == uz8Var) {
                    if (tL_error2 == null) {
                        uz8Var.b = SystemClock.elapsedRealtime();
                    } else {
                        vz8.h(i).remove(j);
                    }
                }
                if (tL_error2 != null) {
                    cc4.d("QrShare: setShareTheme " + tL_error2.text);
                    if (!vz8Var.F) {
                        f09 f09Var = vz8Var.b;
                        f09Var.getClass();
                        f09Var.d1(R.drawable.msg_warning, ob6.M0(2131751070, null), null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ng(a55 a55Var, pcc pccVar, JSONObject jSONObject, long j, int i) {
        this.e = a55Var;
        this.b = pccVar;
        this.f = jSONObject;
        this.d = j;
        this.c = i;
    }

    public /* synthetic */ ng(vz8 vz8Var, int[] iArr, uz8 uz8Var, int i, long j) {
        this.e = vz8Var;
        this.b = iArr;
        this.f = uz8Var;
        this.c = i;
        this.d = j;
    }

    public /* synthetic */ ng(Context context, vnb vnbVar, int i, long j, ex4 ex4Var) {
        this.b = context;
        this.e = vnbVar;
        this.c = i;
        this.d = j;
        this.f = ex4Var;
    }
}
