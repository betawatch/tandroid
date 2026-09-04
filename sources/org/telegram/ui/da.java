package org.telegram.ui;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import bi.fa;
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
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.n6, org.telegram.ui.Components.bl0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.g3, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.t40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ da(int i10, dj djVar, org.telegram.ui.ActionBar.d5 d5Var, org.telegram.ui.Components.u40 u40Var) {
        this.a = 10;
        this.b = i10;
        this.c = djVar;
        this.d = d5Var;
        this.e = u40Var;
    }

    @Override // org.telegram.ui.Components.t40
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final dj djVar = (dj) this.c;
        final org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.d;
        final org.telegram.ui.Components.u40 u40Var = (org.telegram.ui.Components.u40) this.e;
        final int i10 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: yf.d0
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new fa(i12, photoSize2, photoSize, djVar, d5Var, 12));
                u40Var.j();
            }
        });
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
        ArrayList arrayList = hn0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new sg.a1(n2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.fn0 fn0Var = ((org.telegram.ui.Components.gn0) view).a;
                if (fn0Var != null) {
                    fn0Var.q();
                }
                org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) arrayList.get(i10);
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(n2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(en0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new bi.k8(hn0Var, i11, en0Var, f6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // c5.p
    public void b(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bi.ia(hVar, (org.telegram.ui.ActionBar.n2) this.c, list, this.b, (c5.f) this.d, (lx0) this.e, 11));
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        ui1 ui1Var = (ui1) this.c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
            ui1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ui1Var.b, false, Integer.valueOf(this.b));
            ui1Var.u(i3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.n6
    public void d(CharSequence charSequence) {
        org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout h = p6Var.h(this.b - ((int) Math.ceil(Math.min(p6Var.d, p6Var.h))), charSequence);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(p6Var, h, p6Var.d, arrayList.size());
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(p6Var, h, p6Var.h, arrayList.size());
        arrayList2.add(m6Var);
        arrayList.add(m6Var2);
        float f7 = p6Var.d;
        float f10 = m6Var.f;
        p6Var.d = f7 + f10;
        p6Var.h += f10;
        p6Var.e = Math.max(p6Var.e, h.getHeight());
        p6Var.i = Math.max(p6Var.i, h.getHeight());
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        TL_bots.toggleUsername toggleusername;
        int i12 = this.a;
        int i13 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i14 = 1;
        switch (i12) {
            case 0:
                final fa faVar = (fa) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                qa qaVar = faVar.a;
                long j3 = qaVar.x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((org.telegram.ui.ActionBar.n2) qaVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = qaVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ea
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.cj(fa.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                qaVar.w.add(tL_username.username);
                ((na) view).setLoading(true);
                break;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 2:
                org.telegram.ui.Components.lr lrVar = (org.telegram.ui.Components.lr) obj3;
                di.d dVar = (di.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.gr(lrVar, dVar, i14));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(xu0Var.getContext(), 3, (org.telegram.ui.ActionBar.f6) obj2)};
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
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(xu0Var.j1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ar0(b2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new bi.ga(xu0Var, b2VarArr, i16, tL_messages_editMessage, 5)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.o oVar = (c5.o) it.next();
            c5.k a2 = oVar.a();
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
        AndroidUtilities.runOnUIThread(new ug.o(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        uy uyVar = (uy) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = uyVar.Y3();
        int i10 = this.b;
        if (Y3 != null) {
            Y3.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new gw(uyVar, i10, arrayList2, z10, hashSet), null);
        }
        uyVar.b4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ boolean t() {
        return false;
    }

    public /* synthetic */ da(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ da(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ da(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void C(float f7) {
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void L(boolean z10, boolean z11) {
    }
}
