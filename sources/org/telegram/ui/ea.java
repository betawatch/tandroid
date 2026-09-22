package org.telegram.ui;

import ai.ya;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.l6, org.telegram.ui.Components.ol0, MessagesStorage.BooleanCallback, c5.o, org.telegram.ui.Components.voip.i3, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.t40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ea(int i10, dj djVar, org.telegram.ui.ActionBar.d5 d5Var, org.telegram.ui.Components.u40 u40Var) {
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: yf.c0
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new ya(i12, photoSize2, photoSize, djVar, d5Var, 12));
                u40Var.j();
            }
        });
    }

    @Override // c5.o
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.cb(hVar, (org.telegram.ui.ActionBar.n2) this.c, list, this.b, (c5.f) this.d, (lx0) this.e, 11));
    }

    @Override // org.telegram.ui.Components.l6
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout h = n6Var.h(this.b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.h))), charSequence);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(n6Var, h, n6Var.d, arrayList.size());
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(n6Var, h, n6Var.h, arrayList.size());
        arrayList2.add(k6Var);
        arrayList.add(k6Var2);
        float f7 = n6Var.d;
        float f10 = k6Var.f;
        n6Var.d = f7 + f10;
        n6Var.h += f10;
        n6Var.e = Math.max(n6Var.e, h.getHeight());
        n6Var.i = Math.max(n6Var.i, h.getHeight());
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        org.telegram.ui.Components.wn0 wn0Var = (org.telegram.ui.Components.wn0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
        ArrayList arrayList = wn0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new rg.x0(n2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.un0 un0Var = ((org.telegram.ui.Components.vn0) view).a;
                if (un0Var != null) {
                    un0Var.q();
                }
                org.telegram.ui.Components.tn0 tn0Var = (org.telegram.ui.Components.tn0) arrayList.get(i10);
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(n2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(tn0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new ai.c9(wn0Var, i11, tn0Var, f6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        ti1 ti1Var = (ti1) this.c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
            ti1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ti1Var.b, false, Integer.valueOf(this.b));
            ti1Var.u(k3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ dv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                final ga gaVar = (ga) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ra raVar = gaVar.a;
                long j3 = raVar.x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((org.telegram.ui.ActionBar.n2) raVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = raVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.fa
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.cj(ga.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                raVar.w.add(tL_username.username);
                ((oa) view).setLoading(true);
                break;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 2:
                org.telegram.ui.Components.mr mrVar = (org.telegram.ui.Components.mr) obj3;
                ci.d dVar = (ci.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.hr(mrVar, dVar, i14));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(lv0Var.getContext(), 3, (org.telegram.ui.ActionBar.f6) obj2)};
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
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(lv0Var.j1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pr0(b2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new ai.za(lv0Var, b2VarArr, i16, tL_messages_editMessage, 5)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.n nVar = (c5.n) it.next();
            c5.k a2 = nVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(nVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tg.n(chat, this.b, arrayList, callback, 1));
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

    public /* synthetic */ ea(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ea(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ ea(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void B(float f7) {
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.t40
    public /* synthetic */ void L(boolean z10, boolean z11) {
    }
}
