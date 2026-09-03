package gg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh.b8;
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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bj;
import org.telegram.ui.cw;
import org.telegram.ui.ga;
import org.telegram.ui.ii1;
import org.telegram.ui.oa;
import org.telegram.ui.qu0;
import org.telegram.ui.qy;
import org.telegram.ui.ra;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements BillingController.ProductDetailsResponseListenerLegacy, w40, org.telegram.ui.ActionBar.c2, h6, jl0, MessagesStorage.BooleanCallback, p2.o, i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i10, bj bjVar, e5 e5Var, x40 x40Var) {
        this.a = 1;
        this.b = i10;
        this.c = bjVar;
        this.d = e5Var;
        this.e = x40Var;
    }

    @Override // org.telegram.ui.Components.w40
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z4, final TLRPC.VideoSize videoSize) {
        final bj bjVar = (bj) this.c;
        final e5 e5Var = (e5) this.d;
        final x40 x40Var = (x40) this.e;
        final int i10 = this.b;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: kf.h0
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new i0(i12, photoSize2, photoSize, bjVar, e5Var, 0));
                x40Var.j();
            }
        });
    }

    @Override // org.telegram.ui.Components.h6
    public void a(CharSequence charSequence) {
        j6 j6Var = (j6) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout h = j6Var.h(this.b - ((int) Math.ceil(Math.min(j6Var.d, j6Var.h))), charSequence);
        g6 g6Var = new g6(j6Var, h, j6Var.d, arrayList.size());
        g6 g6Var2 = new g6(j6Var, h, j6Var.h, arrayList.size());
        arrayList2.add(g6Var);
        arrayList.add(g6Var2);
        float f10 = j6Var.d;
        float f11 = g6Var.f;
        j6Var.d = f10 + f11;
        j6Var.h += f11;
        j6Var.e = Math.max(j6Var.e, h.getHeight());
        j6Var.i = Math.max(j6Var.i, h.getHeight());
    }

    @Override // p2.o
    public void b(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new kf.j0(hVar, (org.telegram.ui.ActionBar.p2) this.c, list, this.b, (p2.e) this.d, (xw0) this.e, 13));
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        nn0 nn0Var = (nn0) this.c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        f6 f6Var = (f6) this.e;
        ArrayList arrayList = nn0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new eg.o1(p2Var, 24, true).show();
                    return true;
                }
                ln0 ln0Var = ((mn0) view).a;
                if (ln0Var != null) {
                    ln0Var.q();
                }
                kn0 kn0Var = (kn0) arrayList.get(i10);
                p70 H = p70.H(p2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(kn0Var.c) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new cg.v1(nn0Var, i11, kn0Var, f6Var, 20), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void f(j3 j3Var) {
        ii1 ii1Var = (ii1) this.c;
        k3 k3Var = (k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
            ii1Var.O0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ii1Var.b, false, Integer.valueOf(this.b));
            ii1Var.u(k3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
                final ga gaVar = (ga) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z4 = tL_username.active;
                final String str = tL_username.username;
                final boolean z10 = !z4;
                ra raVar = gaVar.a;
                long j10 = raVar.x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z10;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
                    toggleusername3.bot = MessagesController.getInstance(i11).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z10;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = raVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.fa
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.fj(ga.this, str, tLObject, i15, z10, tL_error, tL_username, z4));
                    }
                });
                raVar.w.add(tL_username.username);
                ((oa) view).setLoading(true);
                break;
            case 3:
            case 5:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 4:
                ir irVar = (ir) obj3;
                ph.d dVar = (ph.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new er(irVar, dVar, i14));
                    break;
                }
                break;
            case 6:
                yu0 yu0Var = (yu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(yu0Var.getContext(), 3, (f6) obj2)};
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
                tL_messages_editMessage.peer = MessagesController.getInstance(i16).getInputPeer(yu0Var.g1);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new dr0(d2VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new b8(yu0Var, d2VarArr, i16, tL_messages_editMessage, 4)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2.n nVar = (p2.n) it.next();
            p2.j a2 = nVar.a();
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
        AndroidUtilities.runOnUIThread(new z(chat, this.b, arrayList, callback, 1));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        qy qyVar = (qy) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = qyVar.Y3();
        int i10 = this.b;
        if (Y3 != null) {
            Y3.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new cw(qyVar, i10, arrayList2, z4, hashSet), null);
        }
        qyVar.b4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ boolean u() {
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

    public /* synthetic */ a0(j6 j6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        this.d = j6Var;
        this.b = i10;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ a0(qy qyVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.a = 7;
        this.d = qyVar;
        this.c = arrayList;
        this.b = i10;
        this.e = hashSet;
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.w40
    public /* synthetic */ void K(boolean z4, boolean z10) {
    }
}
