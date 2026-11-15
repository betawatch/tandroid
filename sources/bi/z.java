package bi;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ta;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements s10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(int i7, long j3, TLRPC.Photo photo, Context context, fi.b bVar) {
        this.b = i7;
        this.c = j3;
        this.e = photo;
        this.d = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7;
        TLObject M0;
        int i10;
        TLObject M02;
        int i11 = this.a;
        long j3 = this.c;
        int i12 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                Runnable runnable = (Runnable) obj3;
                r9 r9Var = (r9) obj;
                if (r9Var != null) {
                    int i13 = this.b;
                    m10.i(i13);
                    long o4 = org.telegram.messenger.m5.o(r9Var.e.peer);
                    long j10 = this.c;
                    if (j10 != o4 && j10 != 0 && o4 != 0) {
                        e0 e0Var = new e0(context, i13, r9Var, j10, runnable);
                        if (o4 >= 0) {
                            M0 = np.s1(i13).a2(Long.valueOf(o4));
                            i7 = 0;
                        } else {
                            i7 = 0;
                            M0 = np.s1(i13).M0(Long.valueOf(-o4));
                        }
                        if (j10 >= 0) {
                            M02 = np.s1(i13).a2(Long.valueOf(j10));
                            i10 = i7;
                        } else {
                            i10 = i7;
                            M02 = np.s1(i13).M0(Long.valueOf(-j10));
                        }
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        f10.addView(new di.z5(context, M0, M02), ja.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        ns.i(textView);
                        textView.setText(hd.M0(2131750305, null));
                        int i14 = org.telegram.ui.ActionBar.j6.j5;
                        org.telegram.messenger.k5.m(textView, i14, e6Var, 1, 20.0f);
                        textView.setGravity(hd.a0 ? 5 : 3);
                        f10.addView(textView, ja.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.q6.U(textView2, i14, e6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = org.telegram.messenger.m5.t(o4);
                        String t10 = org.telegram.messenger.m5.t(j10);
                        Object[] objArr = new Object[2];
                        objArr[i10] = t6;
                        objArr[1] = t10;
                        org.telegram.messenger.k5.q(null, null, 2131750304, objArr, textView2);
                        f10.addView(textView2, ja.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i10, context, e6Var);
                        alertDialog$Builder.o(f10);
                        alertDialog$Builder.k(hd.M0(2131751771, null), new a1.c(e0Var, 12));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (r9Var.e.bid_date > 0 && !r9Var.f()) {
                        y yVar = new y(context, e6Var, null, r9Var);
                        yVar.j2 = runnable;
                        yVar.show();
                        break;
                    } else {
                        new m0(context, e6Var, j10, r9Var.d, runnable).show();
                        break;
                    }
                }
                break;
            case 1:
                ci.n0 n0Var = (ci.n0) obj5;
                ci.m0 m0Var = (ci.m0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (n0Var.x == ((int[]) obj4)[0]) {
                    n0Var.x = 0;
                }
                if (m0Var != null && ci.n0.h(i12).get(j3) == m0Var) {
                    if (tL_error == null) {
                        m0Var.b = SystemClock.elapsedRealtime();
                    } else {
                        ci.n0.h(i12).remove(j3);
                    }
                }
                if (tL_error != null) {
                    a8.d("QrShare: setShareTheme " + tL_error.text);
                    if (!n0Var.F) {
                        ci.z0 z0Var = n0Var.b;
                        z0Var.getClass();
                        z0Var.d1(R.drawable.msg_warning, hd.M0(2131751105, null), null);
                        break;
                    }
                }
                break;
            case 2:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context2 = (Context) obj5;
                fi.b bVar = (fi.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = np.s1(i12).j1(j3);
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
                ConnectionsManager.getInstance(i12).sendRequest(reportprofilephoto, null);
                new cc(ta.a(context2), bVar).E(bVar).j();
                break;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                z10 z10Var = (z10) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    z10Var.a(org.telegram.ui.Wallet.d2.z(tL_error2, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.c;
                    int i15 = this.b;
                    if (!optBoolean) {
                        d2Var.e(i15, j11, z10Var);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        d2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.n1(d2Var, z10Var, j11, i15, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.e = e6Var;
        this.b = i7;
        this.c = j3;
        this.f = runnable;
    }

    public /* synthetic */ z(ci.n0 n0Var, int[] iArr, ci.m0 m0Var, int i7, long j3) {
        this.d = n0Var;
        this.e = iArr;
        this.f = m0Var;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ z(org.telegram.ui.Wallet.d2 d2Var, z10 z10Var, JSONObject jSONObject, long j3, int i7) {
        this.d = d2Var;
        this.e = z10Var;
        this.f = jSONObject;
        this.c = j3;
        this.b = i7;
    }
}
