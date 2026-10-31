package mg;

import ag.g3;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ay;
import org.telegram.ui.be1;
import org.telegram.ui.ea;
import org.telegram.ui.fu0;
import org.telegram.ui.gs0;
import org.telegram.ui.la;
import org.telegram.ui.oa;
import org.telegram.ui.q8;
import org.telegram.ui.qv;
import org.telegram.ui.rh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1, c6, ik0, zr, c5.n, p2, a40, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(int i10, rh rhVar, z4 z4Var, b40 b40Var) {
        this.a = 10;
        this.b = i10;
        this.c = rhVar;
        this.d = z4Var;
        this.e = b40Var;
    }

    @Override // org.telegram.ui.Components.a40
    public void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final rh rhVar = (rh) this.c;
        final z4 z4Var = (z4) this.d;
        final b40 b40Var = (b40) this.e;
        final int i10 = this.b;
        org.telegram.messenger.i0.g3(new Runnable() { // from class: rf.y
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new q8(i12, photoSize2, photoSize, rhVar, z4Var, 10));
                b40Var.i();
            }
        });
    }

    @Override // org.telegram.messenger.t1
    public void a(c5.g gVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        q20 q20Var = (q20) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.m mVar = (c5.m) it.next();
            c5.i a2 = mVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(mVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_premiumGiftCodeOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.i0.g3(new a0(chat, this.b, arrayList, q20Var, 0));
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.c;
        ((u2.k0) obj).G(aVar.b, (u2.g0) aVar.c, (u2.u) this.d, (u2.c0) this.e, this.b);
    }

    @Override // c5.n
    public void b(c5.g gVar, List list) {
        org.telegram.messenger.i0.g3(new m4.a1(gVar, (k2) this.c, list, this.b, (ba.a) this.d, (fu0) this.e, 11));
    }

    @Override // org.telegram.ui.Components.c6
    public void c(CharSequence charSequence) {
        e6 e6Var = (e6) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = e6Var.j(this.b - ((int) Math.ceil(Math.min(e6Var.d, e6Var.j))), charSequence);
        b6 b6Var = new b6(e6Var, j10, e6Var.d, arrayList.size());
        b6 b6Var2 = new b6(e6Var, j10, e6Var.j, arrayList2.size());
        arrayList2.add(b6Var);
        arrayList.add(b6Var2);
        float f7 = e6Var.d;
        float f10 = b6Var.f;
        e6Var.d = f7 + f10;
        e6Var.j += f10;
        e6Var.f(b6Var);
        e6Var.g(b6Var2);
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        rm0 rm0Var = (rm0) this.c;
        k2 k2Var = (k2) this.d;
        p6 p6Var = (p6) this.e;
        ArrayList arrayList = rm0Var.r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i11 = this.b;
            if (d20.i(i11).q()) {
                if (!d20.i(i11).q()) {
                    new kg.i1(k2Var, 24, true).show();
                    return true;
                }
                pm0 pm0Var = ((qm0) view).a;
                if (pm0Var != null) {
                    pm0Var.p();
                }
                om0 om0Var = (om0) arrayList.get(i10);
                z60 H = z60.H(k2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, cd.L0(TextUtils.isEmpty(om0Var.c) ? 2131745898 : 2131745886, null), new g3(rm0Var, i11, om0Var, p6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
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
                final ea eaVar = (ea) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                oa oaVar = eaVar.a;
                long j10 = oaVar.y;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i11 = ((k2) oaVar).currentAccount;
                    toggleusername3.bot = vp.r1(i11).n1(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = oaVar.getConnectionsManager();
                final int i15 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.da
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.ww(ea.this, str, tLObject, i15, z11, tL_error, tL_username, z10));
                    }
                });
                oaVar.x.add(tL_username.username);
                ((la) view).setLoading(true);
                break;
            case 2:
            case 4:
            default:
                PasskeysActivity.Z((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i13);
                break;
            case 3:
                cr crVar = (cr) obj3;
                vh.d dVar = (vh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i13).sendRequest(getgroupcallstreamrtmpurl, new zq(crVar, dVar, i14));
                    break;
                }
                break;
            case 5:
                zt0 zt0Var = (zt0) obj3;
                jj jjVar = (jj) obj;
                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, zt0Var.getContext(), (p6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) jjVar.k.media;
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
                tL_messages_editMessage.peer = vp.r1(i16).i1(zt0Var.l1);
                tL_messages_editMessage.id = jjVar.f1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                org.telegram.messenger.i0.h3(new nq0(x1VarArr, i16, ConnectionsManager.getInstance(i16).sendRequest(tL_messages_editMessage, new org.telegram.ui.b0(zt0Var, x1VarArr, i16, tL_messages_editMessage, 3)), i14), 500L);
                break;
        }
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        ay ayVar = (ay) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView j42 = ayVar.j4();
        int i10 = this.b;
        if (j42 != null) {
            j42.n(arrayList2, i10 == 102 ? 27 : 26, null, null, new qv(ayVar, i10, arrayList2, z10, hashSet), null);
        }
        ayVar.m4(i10 == 103);
    }

    @Override // org.telegram.ui.Components.voip.p2
    public void j(q2 q2Var) {
        be1 be1Var = (be1) this.c;
        r2 r2Var = (r2) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.i0.r(be1Var.S0);
            be1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(be1Var.b, false, Integer.valueOf(this.b));
            be1Var.t(r2Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ i0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = tLObject;
        this.b = i10;
        this.e = obj2;
    }

    public /* synthetic */ i0(e6 e6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 2;
        this.d = e6Var;
        this.b = i10;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ i0(ay ayVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.a = 6;
        this.d = ayVar;
        this.c = arrayList;
        this.b = i10;
        this.e = hashSet;
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ void H(float f7) {
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.a40
    public /* synthetic */ void O(boolean z10, boolean z11) {
    }
}
