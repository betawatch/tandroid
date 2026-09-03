package kh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(int i10, long j10, TLRPC.Photo photo, Context context, nh.b bVar) {
        this.b = i10;
        this.c = j10;
        this.e = photo;
        this.d = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        long j10;
        x xVar;
        TLObject chat;
        int i10 = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i11 = this.b;
                    long j11 = UserConfig.getInstance(i11).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.c;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        x xVar2 = new x(context, i11, auction, j12, runnable);
                        if (peerDialogId >= 0) {
                            chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                            xVar = xVar2;
                        } else {
                            j10 = peerDialogId;
                            xVar = xVar2;
                            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                        }
                        TLObject user = j12 >= 0 ? MessagesController.getInstance(i11).getUser(Long.valueOf(j12)) : MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                        f10.addView(new lh.f5(context, chat, user), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i12 = j6.j5;
                        org.telegram.ui.b.w(i12, f6Var, textView, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        f10.addView(textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.b.l(i12, f6Var, textView2, 1, 16.0f);
                        org.telegram.ui.b.o(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        f10.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        alertDialog$Builder.n(f10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gg.f(xVar, 21));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        s sVar = new s(context, f6Var, null, auction);
                        sVar.k0 = runnable;
                        sVar.show();
                        break;
                    } else {
                        new f0(context, f6Var, j12, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                nh.b bVar = (nh.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i13 = this.b;
                reportprofilephoto.peer = MessagesController.getInstance(i13).getInputPeer(this.c);
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
                new qc(cb.a(this.d), bVar).E(bVar).j();
                break;
        }
    }

    public /* synthetic */ t(Context context, f6 f6Var, int i10, long j10, Runnable runnable) {
        this.d = context;
        this.e = f6Var;
        this.b = i10;
        this.c = j10;
        this.f = runnable;
    }
}
