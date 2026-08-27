package cg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh.b8;
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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.voip.h3;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.vq;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ca;
import org.telegram.ui.cu0;
import org.telegram.ui.gy;
import org.telegram.ui.hw0;
import org.telegram.ui.ka;
import org.telegram.ui.lh1;
import org.telegram.ui.na;
import org.telegram.ui.ti;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements BillingController.ProductDetailsResponseListenerLegacy, i40, org.telegram.ui.ActionBar.a2, g6, rk0, MessagesStorage.BooleanCallback, n2.m, h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i10, ti tiVar, b5 b5Var, j40 j40Var) {
        this.a = 1;
        this.b = i10;
        this.c = tiVar;
        this.d = b5Var;
        this.e = j40Var;
    }

    @Override // org.telegram.ui.Components.i40
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ti tiVar = (ti) this.c;
        final b5 b5Var = (b5) this.d;
        final j40 j40Var = (j40) this.e;
        final int i10 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: gf.i0
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new j0(i12, photoSize2, photoSize, tiVar, b5Var, 0));
                j40Var.j();
            }
        });
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        um0 um0Var = (um0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        c6 c6Var = (c6) this.e;
        ArrayList arrayList = um0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new ag.g2(n2Var, 24, true).show();
                    return true;
                }
                sm0 sm0Var = ((tm0) view).a;
                if (sm0Var != null) {
                    sm0Var.q();
                }
                rm0 rm0Var = (rm0) arrayList.get(i10);
                b70 H = b70.H(n2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(rm0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new ag.k0(um0Var, i11, rm0Var, c6Var, 20), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g6
    public void b(CharSequence charSequence) {
        i6 i6Var = (i6) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout h = i6Var.h(this.b - ((int) Math.ceil(Math.min(i6Var.d, i6Var.h))), charSequence);
        f6 f6Var = new f6(i6Var, h, i6Var.d, arrayList.size());
        f6 f6Var2 = new f6(i6Var, h, i6Var.h, arrayList.size());
        arrayList2.add(f6Var);
        arrayList.add(f6Var2);
        float f10 = i6Var.d;
        float f11 = f6Var.f;
        i6Var.d = f10 + f11;
        i6Var.h += f11;
        i6Var.e = Math.max(i6Var.e, h.getHeight());
        i6Var.i = Math.max(i6Var.i, h.getHeight());
    }

    @Override // n2.m
    public void c(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new gf.k0(gVar, (org.telegram.ui.ActionBar.n2) this.c, list, this.b, (n2.e) this.d, (hw0) this.e, 13));
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void d(i3 i3Var) {
        lh1 lh1Var = (lh1) this.c;
        j3 j3Var = (j3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
            lh1Var.N0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(lh1Var.b, false, Integer.valueOf(this.b));
            lh1Var.u(j3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                final ca caVar = (ca) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                na naVar = caVar.a;
                long j10 = naVar.x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((org.telegram.ui.ActionBar.n2) naVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = naVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ba
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.xi(ca.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                naVar.w.add(tL_username.username);
                ((ka) view).setLoading(true);
                break;
            case 3:
            case 5:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 4:
                ar arVar = (ar) obj3;
                lh.d dVar = (lh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new vq(arVar, dVar, i14));
                    break;
                }
                break;
            case 6:
                hu0 hu0Var = (hu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(hu0Var.getContext(), 3, (c6) obj2)};
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
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(hu0Var.f1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new lq0(b2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new b8(hu0Var, b2VarArr, i16, tL_messages_editMessage, 5)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ cu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n2.l lVar = (n2.l) it.next();
            n2.i a2 = lVar.a();
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
        AndroidUtilities.runOnUIThread(new z(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        gy gyVar = (gy) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = gyVar.Y3();
        int i10 = this.b;
        if (Y3 != null) {
            Y3.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new uv(gyVar, i10, arrayList2, z10, hashSet), null);
        }
        gyVar.b4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ boolean v() {
        return false;
    }

    public /* synthetic */ a0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ a0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = tLObject;
        this.b = i10;
        this.e = obj2;
    }

    public /* synthetic */ a0(i6 i6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        this.d = i6Var;
        this.b = i10;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ a0(gy gyVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.a = 7;
        this.d = gyVar;
        this.c = arrayList;
        this.b = i10;
        this.e = hashSet;
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void E(float f10) {
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
