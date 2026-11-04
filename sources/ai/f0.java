package ai;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m9;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wa;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements n10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f0(int i3, long j10, TLRPC.Photo photo, Context context, ei.b bVar) {
        this.b = i3;
        this.c = j10;
        this.e = photo;
        this.d = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3;
        TLObject M0;
        int i10 = this.a;
        long j10 = this.c;
        int i11 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                Runnable runnable = (Runnable) obj3;
                m9 m9Var = (m9) obj;
                if (m9Var != null) {
                    int i12 = this.b;
                    h10.i(i12);
                    long o10 = org.telegram.messenger.m5.o(m9Var.e.peer);
                    long j11 = this.c;
                    if (j11 != o10 && j11 != 0 && o10 != 0) {
                        k0 k0Var = new k0(context, i12, m9Var, j11, runnable);
                        if (o10 >= 0) {
                            M0 = hp.s1(i12).a2(Long.valueOf(o10));
                            i3 = 0;
                        } else {
                            i3 = 0;
                            M0 = hp.s1(i12).M0(Long.valueOf(-o10));
                        }
                        TLObject a22 = j11 >= 0 ? hp.s1(i12).a2(Long.valueOf(j11)) : hp.s1(i12).M0(Long.valueOf(-j11));
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        f10.addView(new ci.i6(context, M0, a22), mf.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        hs.i(textView);
                        textView.setText(bd.M0(2131750313, null));
                        int i13 = org.telegram.ui.ActionBar.k6.j5;
                        org.telegram.messenger.k5.n(textView, i13, e6Var, 1, 20.0f);
                        textView.setGravity(bd.a0 ? 5 : 3);
                        f10.addView(textView, mf.d(-2, -2.0f, (bd.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.r6.V(textView2, i13, e6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t10 = org.telegram.messenger.m5.t(o10);
                        String t11 = org.telegram.messenger.m5.t(j11);
                        Object[] objArr = new Object[2];
                        objArr[i3] = t10;
                        objArr[1] = t11;
                        org.telegram.messenger.k5.r(null, null, 2131750312, objArr, textView2);
                        f10.addView(textView2, mf.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i3, context, e6Var);
                        alertDialog$Builder.o(f10);
                        alertDialog$Builder.k(bd.M0(2131751771, null), new a1.c(k0Var, 3));
                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (m9Var.e.bid_date > 0 && !m9Var.f()) {
                        e0 e0Var = new e0(context, e6Var, null, m9Var);
                        e0Var.g2 = runnable;
                        e0Var.show();
                        break;
                    } else {
                        new s0(context, e6Var, j11, m9Var.d, runnable).show();
                        break;
                    }
                }
                break;
            case 1:
                bi.o0 o0Var = (bi.o0) obj5;
                bi.n0 n0Var = (bi.n0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (o0Var.x == ((int[]) obj4)[0]) {
                    o0Var.x = 0;
                }
                if (n0Var != null && bi.o0.h(i11).get(j10) == n0Var) {
                    if (tL_error == null) {
                        n0Var.b = SystemClock.elapsedRealtime();
                    } else {
                        bi.o0.h(i11).remove(j10);
                    }
                }
                if (tL_error != null) {
                    a8.d("QrShare: setShareTheme " + tL_error.text);
                    if (!o0Var.F) {
                        bi.a1 a1Var = o0Var.b;
                        a1Var.getClass();
                        a1Var.d1(R.drawable.msg_warning, bd.M0(2131751106, null), null);
                        break;
                    }
                }
                break;
            case 2:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context2 = (Context) obj5;
                ei.b bVar = (ei.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = hp.s1(i11).j1(j10);
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
                ConnectionsManager.getInstance(i11).sendRequest(reportprofilephoto, null);
                new fc(wa.a(context2), bVar).E(bVar).j();
                break;
            default:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj5;
                u10 u10Var = (u10) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    u10Var.a(org.telegram.ui.Wallet.c2.z(tL_error2, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j12 = this.c;
                    int i14 = this.b;
                    if (!optBoolean) {
                        c2Var.e(i14, j12, u10Var);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j12;
                        c2Var.f.sendRequestTyped(tonconnectclosesession, new c3.b(1), new org.telegram.ui.Wallet.m1(c2Var, u10Var, j12, i14, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, long j10, Runnable runnable) {
        this.d = context;
        this.e = e6Var;
        this.b = i3;
        this.c = j10;
        this.f = runnable;
    }

    public /* synthetic */ f0(bi.o0 o0Var, int[] iArr, bi.n0 n0Var, int i3, long j10) {
        this.d = o0Var;
        this.e = iArr;
        this.f = n0Var;
        this.b = i3;
        this.c = j10;
    }

    public /* synthetic */ f0(org.telegram.ui.Wallet.c2 c2Var, u10 u10Var, JSONObject jSONObject, long j10, int i3) {
        this.d = c2Var;
        this.e = u10Var;
        this.f = jSONObject;
        this.c = j10;
        this.b = i3;
    }
}
