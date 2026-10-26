package ai;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.e7;
import org.json.JSONObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Wallet.e2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c1(int i10, long j10, TLRPC.Photo photo, Context context, di.b bVar) {
        this.b = i10;
        this.c = j10;
        this.d = photo;
        this.e = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        TLObject chat;
        TLObject tLObject;
        TLObject chat2;
        int i12 = this.a;
        long j10 = this.c;
        int i13 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i12) {
            case 0:
                f1 f1Var = (f1) obj5;
                e1 e1Var = (e1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (f1Var.w == ((int[]) obj4)[0]) {
                    f1Var.w = 0;
                }
                if (e1Var != null && f1.g(i13).get(j10) == e1Var) {
                    if (tL_error == null) {
                        e1Var.b = SystemClock.elapsedRealtime();
                    } else {
                        f1.g(i13).remove(j10);
                    }
                }
                if (tL_error != null) {
                    FileLog.e("QrShare: setShareTheme " + tL_error.text);
                    if (!f1Var.E) {
                        t1 t1Var = f1Var.b;
                        t1Var.getClass();
                        t1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
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
                reportprofilephoto.peer = MessagesController.getInstance(i13).getInputPeer(j10);
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
                ConnectionsManager.getInstance(i13).sendRequest(reportprofilephoto, null);
                new wc(lb.a(context), bVar).E(bVar).j();
                break;
            case 2:
                e2 e2Var = (e2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    callback.run(e2.x(tL_error2, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.c;
                    int i14 = this.b;
                    if (!optBoolean) {
                        e2Var.d(j11, i14, callback);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        e2Var.f.sendRequestTyped(tonconnectclosesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.s1(e2Var, callback, j11, i14, 1));
                        break;
                    }
                }
            default:
                Context context2 = (Context) obj5;
                u6 u6Var = (u6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i15 = this.b;
                    long j12 = UserConfig.getInstance(i15).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j13 = this.c;
                    if (j13 != peerDialogId && j13 != 0 && peerDialogId != 0) {
                        bi.h0 h0Var = new bi.h0(context2, i15, auction, j13, runnable);
                        if (peerDialogId >= 0) {
                            chat = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                            i11 = i10;
                        } else {
                            i11 = i10;
                            chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                        }
                        if (i11 >= 0) {
                            chat2 = MessagesController.getInstance(i15).getUser(Long.valueOf(j13));
                            tLObject = chat;
                        } else {
                            tLObject = chat;
                            chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j13));
                        }
                        LinearLayout d = vh.d(context2, 1);
                        d.addView(new e7(context2, tLObject, chat2), gb1.x(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i16 = y6.j5;
                        org.telegram.messenger.t.r(textView, i16, u6Var, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        d.addView(textView, gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        f7.V(textView2, i16, u6Var);
                        textView2.setTextSize(1, 16.0f);
                        vh.o(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(peerDialogId), DialogObject.getShortName(j13)}, textView2);
                        d.addView(textView2, gb1.x(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, u6Var);
                        alertDialog$Builder.o(d);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new x2.e(h0Var, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        zh.m mVar = new zh.m(context2, u6Var, null, auction);
                        mVar.n0 = runnable;
                        mVar.show();
                        break;
                    } else {
                        new zh.v(context2, u6Var, j13, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c1(f1 f1Var, int[] iArr, e1 e1Var, int i10, long j10) {
        this.d = f1Var;
        this.e = iArr;
        this.f = e1Var;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ c1(Context context, u6 u6Var, int i10, long j10, Runnable runnable) {
        this.d = context;
        this.e = u6Var;
        this.b = i10;
        this.c = j10;
        this.f = runnable;
    }

    public /* synthetic */ c1(e2 e2Var, Utilities.Callback callback, JSONObject jSONObject, long j10, int i10) {
        this.d = e2Var;
        this.e = callback;
        this.f = jSONObject;
        this.c = j10;
        this.b = i10;
    }
}
