package gh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w(int i10, long j10, TLRPC.Photo photo, Context context, jh.b bVar) {
        this.b = i10;
        this.c = j10;
        this.e = photo;
        this.d = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        long j10;
        a0 a0Var;
        TLObject chat;
        int i10 = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i11 = this.b;
                    long j11 = UserConfig.getInstance(i11).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.c;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        a0 a0Var2 = new a0(context, i11, auction, j12, runnable);
                        if (peerDialogId >= 0) {
                            chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                            a0Var = a0Var2;
                        } else {
                            j10 = peerDialogId;
                            a0Var = a0Var2;
                            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                        }
                        TLObject user = j12 >= 0 ? MessagesController.getInstance(i11).getUser(Long.valueOf(j12)) : MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
                        g10.addView(new hh.h5(context, chat, user), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i12 = org.telegram.ui.ActionBar.g6.j5;
                        rl.w(i12, c6Var, textView, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        g10.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        rl.l(i12, c6Var, textView2, 1, 16.0f);
                        rl.n(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        g10.addView(textView2, h7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                        alertDialog$Builder.n(g10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new a1.c(a0Var, 26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        v vVar = new v(context, c6Var, null, auction);
                        vVar.j0 = runnable;
                        vVar.show();
                        break;
                    } else {
                        new i0(context, c6Var, j12, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                jh.b bVar = (jh.b) obj3;
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
                new mc(ab.a(this.d), bVar).E(bVar).j();
                break;
        }
    }

    public /* synthetic */ w(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, long j10, Runnable runnable) {
        this.d = context;
        this.e = c6Var;
        this.b = i10;
        this.c = j10;
        this.f = runnable;
    }
}
