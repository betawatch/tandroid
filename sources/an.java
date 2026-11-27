// default package

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class an implements fn, ci0, fd, cf7, ot2, yn5, fy8, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ an(int i, bt1 bt1Var, wk5 wk5Var, zn5 zn5Var) {
        this.a = (byte) 7;
        this.c = i;
        this.d = bt1Var;
        this.b = wk5Var;
        this.e = zn5Var;
    }

    @Override // cf7
    public final void A(boolean z) {
        uj3 uj3Var = (uj3) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView w3 = uj3Var.w3();
        int i = this.c;
        if (w3 != null) {
            w3.n(arrayList2, i == 102 ? 27 : 26, null, null, new ah3(uj3Var, i, arrayList2, z, hashSet), null);
        }
        uj3Var.A3(i == 103);
    }

    @Override // yn5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final bt1 bt1Var = (bt1) this.d;
        final wk5 wk5Var = (wk5) this.b;
        final zn5 zn5Var = (zn5) this.e;
        final int i = this.c;
        hl.c3(new Runnable() { // from class: t98
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
                    int i2 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i2 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i3 = i;
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new eu0(i3, (Object) photoSize2, (Object) photoSize, (Object) bt1Var, (Object) wk5Var, (byte) 9));
                zn5Var.i();
            }
        });
    }

    @Override // fy8
    public final void a(gi0 gi0Var, List list) {
        hl.c3(new te((Object) gi0Var, this.d, (Object) list, this.c, this.b, this.e, (byte) 10));
    }

    @Override // ot2
    public final void accept(Object obj) {
        lp lpVar = (lp) this.d;
        ((zz6) obj).O(lpVar.b, (vz6) lpVar.c, (ja6) this.b, (jt6) this.e, this.c);
    }

    @Override // fn
    public final void b(CharSequence charSequence) {
        hn hnVar = (hn) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j = hnVar.j(this.c - ((int) Math.ceil(Math.min(hnVar.d, hnVar.j))), charSequence);
        en enVar = new en(hnVar, j, hnVar.d, arrayList.size());
        en enVar2 = new en(hnVar, j, hnVar.j, arrayList2.size());
        arrayList2.add(enVar);
        arrayList.add(enVar2);
        float f = hnVar.d;
        float f2 = enVar.f;
        hnVar.d = f + f2;
        hnVar.j += f2;
        hnVar.f(enVar);
        hnVar.g(enVar2);
    }

    @Override // ci0
    public final void c(gi0 gi0Var, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        pcc pccVar = (pcc) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wo8 wo8Var = (wo8) it.next();
            to8 a = wo8Var.a();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(wo8Var.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_premiumGiftCodeOption.currency)) * (a.b / 1000000.0d));
                        tL_premiumGiftCodeOption.currency = a.c;
                        break;
                    }
                }
            }
        }
        hl.c3(new gn0(chat, this.c, arrayList, pccVar, (byte) 0));
    }

    @Override // t69
    public final boolean e(int i, View view) {
        ow9 ow9Var = (ow9) this.d;
        e eVar = (e) this.b;
        vnb vnbVar = (vnb) this.e;
        ArrayList arrayList = ow9Var.r;
        if (i >= 0 && i < arrayList.size()) {
            int i2 = this.c;
            if (yac.h(i2).p()) {
                if (!yac.h(i2).p()) {
                    new xk8(eVar, 24, true).show();
                    return true;
                }
                mw9 mw9Var = ((nw9) view).a;
                if (mw9Var != null) {
                    mw9Var.p();
                }
                lw9 lw9Var = (lw9) arrayList.get(i);
                fu5 I = fu5.I(eVar, view);
                I.i = (byte) 3;
                I.b(R.drawable.menu_tag_rename, ob6.M0(TextUtils.isEmpty(lw9Var.c) ? 2131745609 : 2131745597, null), new y36((Object) ow9Var, i2, (Object) lw9Var, (Object) vnbVar, (byte) 25), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        TL_bots.toggleUsername toggleusername;
        byte b = this.a;
        int i3 = this.c;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        byte b2 = 1;
        switch (b) {
            case 2:
                final me1 me1Var = (me1) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z = tL_username.active;
                final String str = tL_username.username;
                final boolean z2 = !z;
                ve1 ve1Var = me1Var.a;
                long j = ve1Var.y;
                if (j == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z2;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i2 = ((e) ve1Var).currentAccount;
                    toggleusername3.bot = uc7.s1(i2).o1(j);
                    toggleusername3.username = str;
                    toggleusername3.active = z2;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = ve1Var.getConnectionsManager();
                final int i4 = this.c;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: ke1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hl.c3(new le1(me1.this, str, tLObject, i4, z2, tL_error, tL_username, z));
                    }
                });
                ve1Var.x.add(tL_username.username);
                ((re1) view).setLoading(true);
                break;
            case 3:
                y13 y13Var = (y13) obj3;
                c51 c51Var = (c51) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i3).sendRequest(getgroupcallstreamrtmpurl, new w13(y13Var, c51Var, b2));
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                eja ejaVar = (eja) obj3;
                r47 r47Var = (r47) obj;
                id[] idVarArr = {new id(3, (vnb) obj2, ejaVar.getContext())};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) r47Var.k.media;
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                tL_poll.id = poll.id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i5 = this.c;
                tL_messages_editMessage.peer = uc7.s1(i5).j1(ejaVar.m1);
                tL_messages_editMessage.id = r47Var.e1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                hl.d3(new xfa(idVarArr, i5, ConnectionsManager.getInstance(i5).sendRequest(tL_messages_editMessage, new lh((Object) ejaVar, (Object) idVarArr, i5, (Object) tL_messages_editMessage, (byte) 9)), b2), 500L);
                break;
            case 6:
                ((PasskeysActivity) obj3).b0((TL_account.Passkey) obj2, (String) obj, i3);
                break;
        }
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    public /* synthetic */ an(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ an(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
        this.e = obj3;
    }

    public /* synthetic */ an(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    public /* synthetic */ an(ArrayList arrayList, TLRPC.Chat chat, int i, pcc pccVar) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = chat;
        this.c = i;
        this.e = pccVar;
    }

    @Override // yn5
    public final void T() {
    }

    @Override // yn5
    public final void H(float f) {
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
    }
}
