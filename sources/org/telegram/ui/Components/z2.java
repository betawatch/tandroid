package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(int i10, long j10, TLRPC.Photo photo, Context context, ci.b bVar) {
        this.c = i10;
        this.b = j10;
        this.d = photo;
        this.e = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        TLObject chat;
        int i11 = this.a;
        long j10 = this.b;
        int i12 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                ci.b bVar = (ci.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = MessagesController.getInstance(i12).getInputPeer(j10);
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
                new xc(lb.a(context), bVar).E(bVar).j();
                break;
            case 1:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    callback.run(org.telegram.ui.Wallet.e2.x(tL_error, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.b;
                    int i13 = this.c;
                    if (!optBoolean) {
                        e2Var.d(j11, i13, callback);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        e2Var.f.sendRequestTyped(tonconnectclosesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.s1(e2Var, callback, j11, i13, 1));
                        break;
                    }
                }
                break;
            case 2:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj5;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i14 = this.c;
                    long j12 = UserConfig.getInstance(i14).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j13 = this.b;
                    if (j13 != peerDialogId && j13 != 0 && peerDialogId != 0) {
                        ai.g0 g0Var = new ai.g0(context2, i14, auction, j13, runnable);
                        if (peerDialogId >= 0) {
                            chat = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                            i10 = 0;
                        } else {
                            i10 = 0;
                            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
                        }
                        TLObject user = j13 >= 0 ? MessagesController.getInstance(i14).getUser(Long.valueOf(j13)) : MessagesController.getInstance(i14).getChat(Long.valueOf(-j13));
                        LinearLayout e = org.telegram.messenger.sl.e(context2, 1);
                        e.addView(new ai.i7(context2, chat, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i15 = org.telegram.ui.ActionBar.k6.j5;
                        org.telegram.messenger.v0.q(textView, i15, g6Var, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        e.addView(textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.r6.W(textView2, i15, g6Var);
                        textView2.setTextSize(1, 16.0f);
                        int i16 = R.string.Gift2AuctionsChangeRecipient2;
                        String shortName = DialogObject.getShortName(peerDialogId);
                        String shortName2 = DialogObject.getShortName(j13);
                        Object[] objArr = new Object[2];
                        objArr[i10] = shortName;
                        objArr[1] = shortName2;
                        org.telegram.messenger.sl.r(i16, objArr, textView2);
                        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, i10, g6Var);
                        alertDialog$Builder.o(e);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qg.g0(g0Var, 28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        yh.m mVar = new yh.m(context2, g6Var, null, auction);
                        mVar.n0 = runnable;
                        mVar.show();
                        break;
                    } else {
                        new yh.v(context2, g6Var, j13, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
            default:
                zh.r0 r0Var = (zh.r0) obj5;
                zh.q0 q0Var = (zh.q0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (r0Var.w == ((int[]) obj4)[0]) {
                    r0Var.w = 0;
                }
                if (q0Var != null && zh.r0.g(i12).get(j10) == q0Var) {
                    if (tL_error2 == null) {
                        q0Var.b = SystemClock.elapsedRealtime();
                    } else {
                        zh.r0.g(i12).remove(j10);
                    }
                }
                if (tL_error2 != null) {
                    FileLog.e("QrShare: setShareTheme " + tL_error2.text);
                    if (!r0Var.E) {
                        zh.c1 c1Var = r0Var.b;
                        c1Var.getClass();
                        c1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z2(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, long j10, Runnable runnable) {
        this.e = context;
        this.d = g6Var;
        this.c = i10;
        this.b = j10;
        this.f = runnable;
    }

    public /* synthetic */ z2(org.telegram.ui.Wallet.e2 e2Var, Utilities.Callback callback, JSONObject jSONObject, long j10, int i10) {
        this.d = e2Var;
        this.e = callback;
        this.f = jSONObject;
        this.b = j10;
        this.c = i10;
    }

    public /* synthetic */ z2(zh.r0 r0Var, int[] iArr, zh.q0 q0Var, int i10, long j10) {
        this.d = r0Var;
        this.e = iArr;
        this.f = q0Var;
        this.c = i10;
        this.b = j10;
    }
}
