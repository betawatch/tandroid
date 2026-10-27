package ag;

import a8.ng;
import ai.h1;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import di.q8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.voip.l3;
import org.telegram.ui.Components.zr;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ey;
import org.telegram.ui.ia;
import org.telegram.ui.qa;
import org.telegram.ui.rh1;
import org.telegram.ui.rv;
import org.telegram.ui.su0;
import org.telegram.ui.ta;
import org.telegram.ui.xi;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements f50, b2, p6, cm0, MessagesStorage.BooleanCallback, d5.p, j3, e2.j, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i10, xi xiVar, j5 j5Var, g50 g50Var) {
        this.a = 0;
        this.b = i10;
        this.c = xiVar;
        this.d = j5Var;
        this.e = g50Var;
    }

    @Override // org.telegram.ui.Components.f50
    public void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final xi xiVar = (xi) this.c;
        final j5 j5Var = (j5) this.d;
        final g50 g50Var = (g50) this.e;
        final int i10 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ag.n0
            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = TLRPC.InputFile.this;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i11 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i11 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i12 = i10;
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new p0(i12, photoSize2, photoSize, xiVar, j5Var, 0));
                g50Var.i();
            }
        });
    }

    @Override // d5.p
    public void a(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new q0(iVar, (r2) this.c, list, this.b, (d5.g) this.d, (zw0) this.e, 14));
    }

    @Override // e2.j
    public void accept(Object obj) {
        ng ngVar = (ng) this.c;
        ((u2.k0) obj).h(ngVar.b, (u2.g0) ngVar.c, (u2.u) this.d, (u2.c0) this.e, this.b);
    }

    @Override // org.telegram.ui.Components.p6
    public void b(CharSequence charSequence) {
        r6 r6Var = (r6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = r6Var.j(this.b - ((int) Math.ceil(Math.min(r6Var.d, r6Var.j))), charSequence);
        o6 o6Var = new o6(r6Var, j10, r6Var.d, arrayList.size());
        o6 o6Var2 = new o6(r6Var, j10, r6Var.j, arrayList2.size());
        arrayList2.add(o6Var);
        arrayList.add(o6Var2);
        float f7 = r6Var.d;
        float f10 = o6Var.f;
        r6Var.d = f7 + f10;
        r6Var.j += f10;
        r6Var.f(o6Var);
        r6Var.g(o6Var2);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        po0 po0Var = (po0) this.c;
        r2 r2Var = (r2) this.d;
        u6 u6Var = (u6) this.e;
        ArrayList arrayList = po0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new tg.y0(r2Var, 24, true).show();
                    return true;
                }
                no0 no0Var = ((oo0) view).a;
                if (no0Var != null) {
                    no0Var.q();
                }
                mo0 mo0Var = (mo0) arrayList.get(i10);
                l80 H = l80.H(r2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(mo0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new h1(po0Var, i11, mo0Var, u6Var, 26), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void d(k3 k3Var) {
        rh1 rh1Var = (rh1) this.c;
        l3 l3Var = (l3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
            rh1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(rh1Var.b, false, Integer.valueOf(this.b));
            rh1Var.t(l3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ su0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        int i11;
        TL_bots.toggleUsername toggleusername;
        int i12 = this.a;
        int i13 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i14 = 1;
        switch (i12) {
            case 1:
                final ia iaVar = (ia) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ta taVar = iaVar.a;
                long j10 = taVar.x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((r2) taVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = taVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ha
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.aj(ia.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                taVar.w.add(tL_username.username);
                ((qa) view).setLoading(true);
                break;
            case 2:
            case 4:
            default:
                PasskeysActivity.W((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 3:
                zr zrVar = (zr) obj3;
                fi.d dVar = (fi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new ur(zrVar, dVar, i14));
                    break;
                }
                break;
            case 5:
                bw0 bw0Var = (bw0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                e2[] e2VarArr = {new e2(bw0Var.getContext(), 3, (u6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                tL_poll.id = poll.id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i16 = this.b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(bw0Var.l1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new os0(e2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new q8(bw0Var, e2VarArr, i16, tL_messages_editMessage, 5)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d5.o oVar = (d5.o) it.next();
            d5.l a2 = oVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(oVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new vg.o(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ey eyVar = (ey) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView g42 = eyVar.g4();
        int i10 = this.b;
        if (g42 != null) {
            g42.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new rv(eyVar, i10, arrayList2, z10, hashSet), null);
        }
        eyVar.j4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ k0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void F(float f7) {
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void L(boolean z10, boolean z11) {
    }
}
