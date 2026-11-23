package bi;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.r9;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements r10 {
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

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7;
        TLObject O0;
        int i10;
        TLObject O02;
        int i11 = this.a;
        long j3 = this.c;
        int i12 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                Runnable runnable = (Runnable) obj3;
                r9 r9Var = (r9) obj;
                if (r9Var != null) {
                    int i13 = this.b;
                    k10.i(i13);
                    long o4 = org.telegram.messenger.n5.o(r9Var.e.peer);
                    long j10 = this.c;
                    if (j10 != o4 && j10 != 0 && o4 != 0) {
                        e0 e0Var = new e0(context, i13, r9Var, j10, runnable);
                        if (o4 >= 0) {
                            O0 = np.u1(i13).c2(Long.valueOf(o4));
                            i7 = 0;
                        } else {
                            i7 = 0;
                            O0 = np.u1(i13).O0(Long.valueOf(-o4));
                        }
                        if (j10 >= 0) {
                            O02 = np.u1(i13).c2(Long.valueOf(j10));
                            i10 = i7;
                        } else {
                            i10 = i7;
                            O02 = np.u1(i13).O0(Long.valueOf(-j10));
                        }
                        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                        g10.addView(new di.c6(context, O0, O02), ma.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        ls.i(textView);
                        textView.setText(hd.N0(2131750288, null));
                        int i14 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.messenger.f3.l(textView, i14, h6Var, 1, 20.0f);
                        textView.setGravity(hd.a0 ? 5 : 3);
                        g10.addView(textView, ma.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.t6.U(textView2, i14, h6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = org.telegram.messenger.n5.t(o4);
                        String t10 = org.telegram.messenger.n5.t(j10);
                        Object[] objArr = new Object[2];
                        objArr[i10] = t6;
                        objArr[1] = t10;
                        org.telegram.messenger.f3.q(null, null, 2131750287, objArr, textView2);
                        g10.addView(textView2, ma.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i10, context, h6Var);
                        alertDialog$Builder.o(g10);
                        alertDialog$Builder.k(hd.N0(2131751759, null), new a1.c(e0Var, 13));
                        alertDialog$Builder.h(hd.N0(2131752577, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (r9Var.e.bid_date > 0 && !r9Var.f()) {
                        y yVar = new y(context, h6Var, null, r9Var);
                        yVar.j2 = runnable;
                        yVar.show();
                        break;
                    } else {
                        new m0(context, h6Var, j10, r9Var.d, runnable).show();
                        break;
                    }
                }
                break;
            case 1:
                ci.o0 o0Var = (ci.o0) obj5;
                ci.n0 n0Var = (ci.n0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (o0Var.x == ((int[]) obj4)[0]) {
                    o0Var.x = 0;
                }
                if (n0Var != null && ci.o0.h(i12).get(j3) == n0Var) {
                    if (tL_error == null) {
                        n0Var.b = SystemClock.elapsedRealtime();
                    } else {
                        ci.o0.h(i12).remove(j3);
                    }
                }
                if (tL_error != null) {
                    org.telegram.messenger.a8.d("QrShare: setShareTheme " + tL_error.text);
                    if (!o0Var.F) {
                        ci.z0 z0Var = o0Var.b;
                        z0Var.getClass();
                        z0Var.d1(R.drawable.msg_warning, hd.N0(2131751093, null), null);
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
                reportprofilephoto.peer = np.u1(i12).l1(j3);
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
                new lc(cb.a(context2), bVar).E(bVar).j();
                break;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj5;
                y10 y10Var = (y10) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    y10Var.a(org.telegram.ui.Wallet.l2.z(tL_error2, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.c;
                    int i15 = this.b;
                    if (!optBoolean) {
                        l2Var.e(i15, j11, y10Var);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        l2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.w1(l2Var, y10Var, j11, i15, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.e = h6Var;
        this.b = i7;
        this.c = j3;
        this.f = runnable;
    }

    public /* synthetic */ z(ci.o0 o0Var, int[] iArr, ci.n0 n0Var, int i7, long j3) {
        this.d = o0Var;
        this.e = iArr;
        this.f = n0Var;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ z(org.telegram.ui.Wallet.l2 l2Var, y10 y10Var, JSONObject jSONObject, long j3, int i7) {
        this.d = l2Var;
        this.e = y10Var;
        this.f = jSONObject;
        this.c = j3;
        this.b = i7;
    }
}
