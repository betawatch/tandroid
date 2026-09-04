package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(int i10, long j3, TLRPC.Photo photo, Context context, bi.b bVar) {
        this.c = i10;
        this.d = j3;
        this.e = photo;
        this.b = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                bi.b bVar = (bi.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i11 = this.c;
                reportprofilephoto.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
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
                new yc(lb.a(this.b), bVar).E(bVar).j();
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i12 = this.c;
                    long j3 = UserConfig.getInstance(i12).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.b;
                    long j10 = this.d;
                    if (j10 != peerDialogId && j10 != 0 && peerDialogId != 0) {
                        bi.u7 u7Var = new bi.u7(context, i12, auction, j10, runnable);
                        TLObject user = peerDialogId >= 0 ? MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId)) : MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                        TLObject user2 = j10 >= 0 ? MessagesController.getInstance(i12).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
                        f7.addView(new hi.a(context, user, user2), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i13 = org.telegram.ui.ActionBar.j6.j5;
                        org.telegram.messenger.wl.x(i13, f6Var, textView, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        f7.addView(textView, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.messenger.wl.n(i13, f6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.wl.p(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(peerDialogId), DialogObject.getShortName(j10)}, textView2);
                        f7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        alertDialog$Builder.n(f7);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rg.p2(u7Var, 15));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        yh.m mVar = new yh.m(context, f6Var, null, auction);
                        mVar.n0 = runnable;
                        mVar.show();
                        break;
                    } else {
                        new yh.v(context, f6Var, j10, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z2(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, long j3, Runnable runnable) {
        this.b = context;
        this.e = f6Var;
        this.c = i10;
        this.d = j3;
        this.f = runnable;
    }
}
