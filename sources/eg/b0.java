package eg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lh.b8;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.voip.l3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.aa;
import org.telegram.ui.fy;
import org.telegram.ui.gw0;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.oh1;
import org.telegram.ui.sv;
import org.telegram.ui.ui;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements BillingController.ProductDetailsResponseListenerLegacy, r40, org.telegram.ui.ActionBar.b2, l6, bl0, MessagesStorage.BooleanCallback, p2.m, k3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(int i10, ui uiVar, b5 b5Var, s40 s40Var) {
        this.a = 1;
        this.b = i10;
        this.c = uiVar;
        this.d = b5Var;
        this.e = s40Var;
    }

    @Override // org.telegram.ui.Components.r40
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ui uiVar = (ui) this.c;
        final b5 b5Var = (b5) this.d;
        final s40 s40Var = (s40) this.e;
        final int i10 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: jf.h0
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new i0(i12, photoSize2, photoSize, uiVar, b5Var, 0));
                s40Var.j();
            }
        });
    }

    @Override // org.telegram.ui.Components.l6
    public void a(CharSequence charSequence) {
        n6 n6Var = (n6) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout h = n6Var.h(this.b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.h))), charSequence);
        k6 k6Var = new k6(n6Var, h, n6Var.d, arrayList.size());
        k6 k6Var2 = new k6(n6Var, h, n6Var.h, arrayList.size());
        arrayList2.add(k6Var);
        arrayList.add(k6Var2);
        float f9 = n6Var.d;
        float f10 = k6Var.f;
        n6Var.d = f9 + f10;
        n6Var.h += f10;
        n6Var.e = Math.max(n6Var.e, h.getHeight());
        n6Var.i = Math.max(n6Var.i, h.getHeight());
    }

    @Override // p2.m
    public void b(p2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new jf.j0(gVar, (org.telegram.ui.ActionBar.o2) this.c, list, this.b, (p2.e) this.d, (gw0) this.e, 13));
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        en0 en0Var = (en0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        c6 c6Var = (c6) this.e;
        ArrayList arrayList = en0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new cg.p1(o2Var, 24, true).show();
                    return true;
                }
                cn0 cn0Var = ((dn0) view).a;
                if (cn0Var != null) {
                    cn0Var.q();
                }
                bn0 bn0Var = (bn0) arrayList.get(i10);
                j70 H = j70.H(o2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(bn0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new ag.z1(en0Var, i11, bn0Var, c6Var, 20), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.voip.k3
    public void d(l3 l3Var) {
        oh1 oh1Var = (oh1) this.c;
        m3 m3Var = (m3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
            oh1Var.N0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(oh1Var.b, false, Integer.valueOf(this.b));
            oh1Var.u(m3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        TL_bots.toggleUsername toggleusername;
        int i12 = this.a;
        int i13 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i14 = 1;
        switch (i12) {
            case 2:
                final aa aaVar = (aa) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                la laVar = aaVar.a;
                long j10 = laVar.x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((org.telegram.ui.ActionBar.o2) laVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.z9
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.aj(aa.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                laVar.w.add(tL_username.username);
                ((ia) view).setLoading(true);
                break;
            case 3:
            case 5:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 4:
                fr frVar = (fr) obj3;
                nh.d dVar = (nh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new br(frVar, dVar, i14));
                    break;
                }
                break;
            case 6:
                qu0 qu0Var = (qu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(qu0Var.getContext(), 3, (c6) obj2)};
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
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(qu0Var.f1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new vq0(c2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new b8(qu0Var, c2VarArr, i16, tL_messages_editMessage, 4)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.g gVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2.l lVar = (p2.l) it.next();
            p2.i a2 = lVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new a0(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fy fyVar = (fy) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = fyVar.Y3();
        int i10 = this.b;
        if (Y3 != null) {
            Y3.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new sv(fyVar, i10, arrayList2, z10, hashSet), null);
        }
        fyVar.b4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ b0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ b0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = tLObject;
        this.b = i10;
        this.e = obj2;
    }

    public /* synthetic */ b0(n6 n6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        this.d = n6Var;
        this.b = i10;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ b0(fy fyVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.a = 7;
        this.d = fyVar;
        this.c = arrayList;
        this.b = i10;
        this.e = hashSet;
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void D(float f9) {
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void K(boolean z10, boolean z11) {
    }
}
