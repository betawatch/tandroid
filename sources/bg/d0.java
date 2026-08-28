package bg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import ih.f8;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.voip.h3;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ba;
import org.telegram.ui.bu0;
import org.telegram.ui.dy;
import org.telegram.ui.hw0;
import org.telegram.ui.ja;
import org.telegram.ui.ma;
import org.telegram.ui.mh1;
import org.telegram.ui.ri;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements BillingController.ProductDetailsResponseListenerLegacy, d40, org.telegram.ui.ActionBar.b2, g6, ok0, MessagesStorage.BooleanCallback, n2.m, h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(int i9, ri riVar, b5 b5Var, e40 e40Var) {
        this.a = 1;
        this.b = i9;
        this.c = riVar;
        this.d = b5Var;
        this.e = e40Var;
    }

    @Override // org.telegram.ui.Components.d40
    public void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ri riVar = (ri) this.c;
        final b5 b5Var = (b5) this.d;
        final e40 e40Var = (e40) this.e;
        final int i9 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ff.i0
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
                    int i10 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i10 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i11 = i9;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new j0(i11, photoSize2, photoSize, riVar, b5Var, 0));
                e40Var.j();
            }
        });
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        sm0 sm0Var = (sm0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        b6 b6Var = (b6) this.e;
        ArrayList arrayList = sm0Var.r;
        if (i9 >= 0 && i9 < arrayList.size()) {
            int i10 = this.b;
            if (UserConfig.getInstance(i10).isPremium()) {
                if (!UserConfig.getInstance(i10).isPremium()) {
                    new zf.x0(o2Var, 24, true).show();
                    return true;
                }
                qm0 qm0Var = ((rm0) view).a;
                if (qm0Var != null) {
                    qm0Var.q();
                }
                pm0 pm0Var = (pm0) arrayList.get(i9);
                x60 H = x60.H(o2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(pm0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new c3.d(sm0Var, i10, pm0Var, b6Var, 21), false);
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
        AndroidUtilities.runOnUIThread(new ff.k0(gVar, (org.telegram.ui.ActionBar.o2) this.c, list, this.b, (n2.e) this.d, (hw0) this.e, 13));
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void d(i3 i3Var) {
        mh1 mh1Var = (mh1) this.c;
        j3 j3Var = (j3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
            mh1Var.N0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(mh1Var.b, false, Integer.valueOf(this.b));
            mh1Var.u(j3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        TL_bots.toggleUsername toggleusername;
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i13 = 1;
        switch (i11) {
            case 2:
                final ba baVar = (ba) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ma maVar = baVar.a;
                long j10 = maVar.x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i10 = ((org.telegram.ui.ActionBar.o2) maVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i10).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = maVar.getConnectionsManager();
                final int i14 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.aa
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ti(ba.this, str, tLObject, i14, z11, tL_error, tL_username, z10));
                    }
                });
                maVar.w.add(tL_username.username);
                ((ja) view).setLoading(true);
                break;
            case 3:
            case 5:
            default:
                PasskeysActivity.U((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                break;
            case 4:
                cr crVar = (cr) obj3;
                kh.d dVar = (kh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new xq(crVar, dVar, i13));
                    break;
                }
                break;
            case 6:
                eu0 eu0Var = (eu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(eu0Var.getContext(), 3, (b6) obj2)};
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
                int i15 = this.b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i15).getInputPeer(eu0Var.f1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new kq0(c2VarArr, i15, ConnectionsManager.getInstance(i15).sendRequest(tL_messages_editMessage, new f8(eu0Var, c2VarArr, i15, tL_messages_editMessage, 5)), i13), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
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
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
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
        AndroidUtilities.runOnUIThread(new c0(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        dy dyVar = (dy) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = dyVar.Y3();
        int i9 = this.b;
        if (Y3 != null) {
            Y3.n(arrayList2, i9 == 102 ? 27 : 26, null, null, new rv(dyVar, i9, arrayList2, z10, hashSet), null);
        }
        dyVar.b4(i9 == 103);
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ d0(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i9;
    }

    public /* synthetic */ d0(Object obj, TLObject tLObject, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = tLObject;
        this.b = i9;
        this.e = obj2;
    }

    public /* synthetic */ d0(i6 i6Var, int i9, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        this.d = i6Var;
        this.b = i9;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ d0(dy dyVar, ArrayList arrayList, int i9, HashSet hashSet) {
        this.a = 7;
        this.d = dyVar;
        this.c = arrayList;
        this.b = i9;
        this.e = hashSet;
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
