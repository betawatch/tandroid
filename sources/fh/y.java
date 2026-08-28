package fh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y(int i9, long j10, TLRPC.Photo photo, Context context, ih.b bVar) {
        this.b = i9;
        this.c = j10;
        this.e = photo;
        this.d = context;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        long j10;
        c0 c0Var;
        TLObject chat;
        int i9 = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i9) {
            case 0:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i10 = this.b;
                    long j11 = UserConfig.getInstance(i10).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.d;
                    long j12 = this.c;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        c0 c0Var2 = new c0(context, i10, auction, j12, runnable);
                        if (peerDialogId >= 0) {
                            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                            c0Var = c0Var2;
                        } else {
                            j10 = peerDialogId;
                            c0Var = c0Var2;
                            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                        }
                        TLObject user = j12 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j12)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j12));
                        LinearLayout f10 = ll.f(context, 1);
                        f10.addView(new gh.j5(context, chat, user), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i11 = org.telegram.ui.ActionBar.f6.j5;
                        org.telegram.ui.Cells.j2.o(i11, b6Var, textView, 1, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        f10.addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        ll.n(i11, b6Var, textView2, 1, 16.0f);
                        ll.q(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j12)}, textView2);
                        f10.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                        alertDialog$Builder.n(f10);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new a1.c(c0Var, 26));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        x xVar = new x(context, b6Var, null, auction);
                        xVar.j0 = runnable;
                        xVar.show();
                        break;
                    } else {
                        new k0(context, b6Var, j12, auction.gift, runnable).show();
                        break;
                    }
                }
                break;
            default:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                ih.b bVar = (ih.b) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i12 = this.b;
                reportprofilephoto.peer = MessagesController.getInstance(i12).getInputPeer(this.c);
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
                new oc(cb.a(this.d), bVar).E(bVar).j();
                break;
        }
    }

    public /* synthetic */ y(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, long j10, Runnable runnable) {
        this.d = context;
        this.e = b6Var;
        this.b = i9;
        this.c = j10;
        this.f = runnable;
    }
}
