package ai;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.h7;
import c8.ha;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Wallet.f2;
import org.telegram.ui.Wallet.p1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v0(int i7, long j3, TLRPC.Photo photo, Context context, di.b bVar) {
        this.b = i7;
        this.c = j3;
        this.d = photo;
        this.e = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7;
        TLObject M0;
        int i10 = this.a;
        long j3 = this.c;
        int i11 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                y0 y0Var = (y0) obj5;
                x0 x0Var = (x0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (y0Var.x == ((int[]) obj4)[0]) {
                    y0Var.x = 0;
                }
                if (x0Var != null && y0.h(i11).get(j3) == x0Var) {
                    if (tL_error == null) {
                        x0Var.b = SystemClock.elapsedRealtime();
                    } else {
                        y0.h(i11).remove(j3);
                    }
                }
                if (tL_error != null) {
                    a8.d("QrShare: setShareTheme " + tL_error.text);
                    if (!y0Var.E) {
                        l1 l1Var = y0Var.b;
                        l1Var.getClass();
                        l1Var.d1(R.drawable.msg_warning, hd.M0(2131751106, null), null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                di.b bVar = (di.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = qp.s1(i11).j1(j3);
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
                new hc(xa.a(context), bVar).E(bVar).j();
                break;
            case 2:
                f2 f2Var = (f2) obj5;
                c20 c20Var = (c20) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    c20Var.a(f2.z(tL_error2, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j10 = this.c;
                    int i12 = this.b;
                    if (!optBoolean) {
                        f2Var.e(i12, j10, c20Var);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j10;
                        f2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new p1(f2Var, c20Var, j10, i12, 1));
                        break;
                    }
                }
                break;
            default:
                Context context2 = (Context) obj5;
                f6 f6Var = (f6) obj4;
                Runnable runnable = (Runnable) obj3;
                s9 s9Var = (s9) obj;
                if (s9Var != null) {
                    int i13 = this.b;
                    p10.i(i13);
                    long o4 = m5.o(s9Var.e.peer);
                    long j11 = this.c;
                    if (j11 != o4 && j11 != 0 && o4 != 0) {
                        bi.d0 d0Var = new bi.d0(context2, i13, s9Var, j11, runnable);
                        TLObject a22 = o4 >= 0 ? qp.s1(i13).a2(Long.valueOf(o4)) : qp.s1(i13).M0(Long.valueOf(-o4));
                        if (j11 >= 0) {
                            M0 = qp.s1(i13).a2(Long.valueOf(j11));
                            i7 = 0;
                        } else {
                            i7 = 0;
                            M0 = qp.s1(i13).M0(Long.valueOf(-j11));
                        }
                        LinearLayout f10 = k5.f(context2, 1);
                        f10.addView(new h7(context2, a22, M0), ha.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        qs.i(textView);
                        textView.setText(hd.M0(2131750304, null));
                        int i14 = k6.j5;
                        k5.n(textView, i14, f6Var, 1, 20.0f);
                        textView.setGravity(hd.a0 ? 5 : 3);
                        f10.addView(textView, ha.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        r6.V(textView2, i14, f6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = m5.t(o4);
                        String t10 = m5.t(j11);
                        Object[] objArr = new Object[2];
                        objArr[i7] = t6;
                        objArr[1] = t10;
                        k5.r(null, null, 2131750303, objArr, textView2);
                        f10.addView(textView2, ha.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, context2, f6Var);
                        alertDialog$Builder.o(f10);
                        alertDialog$Builder.k(hd.M0(2131751771, null), new u5.e(d0Var, 13));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (s9Var.e.bid_date > 0 && !s9Var.f()) {
                        zh.m mVar = new zh.m(context2, f6Var, null, s9Var);
                        mVar.f2 = runnable;
                        mVar.show();
                        break;
                    } else {
                        new zh.v(context2, f6Var, j11, s9Var.d, runnable).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v0(y0 y0Var, int[] iArr, x0 x0Var, int i7, long j3) {
        this.d = y0Var;
        this.e = iArr;
        this.f = x0Var;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ v0(Context context, f6 f6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.e = f6Var;
        this.b = i7;
        this.c = j3;
        this.f = runnable;
    }

    public /* synthetic */ v0(f2 f2Var, c20 c20Var, JSONObject jSONObject, long j3, int i7) {
        this.d = f2Var;
        this.e = c20Var;
        this.f = jSONObject;
        this.c = j3;
        this.b = i7;
    }
}
