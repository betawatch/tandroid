package cg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import b8.kg;
import ei.i8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ba;
import org.telegram.ui.ha;
import org.telegram.ui.ka;
import org.telegram.ui.lu;
import org.telegram.ui.mq0;
import org.telegram.ui.ms0;
import org.telegram.ui.uw;
import org.telegram.ui.xg;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements e30, p1, e6, hj0, ir, e5.m, o2, g2.k, q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(int i3, xg xgVar, q4 q4Var, f30 f30Var) {
        this.a = 0;
        this.b = i3;
        this.c = xgVar;
        this.d = q4Var;
        this.e = f30Var;
    }

    @Override // org.telegram.ui.Components.e30
    public void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final xg xgVar = (xg) this.c;
        final q4 q4Var = (q4) this.d;
        final f30 f30Var = (f30) this.e;
        final int i3 = this.b;
        org.telegram.messenger.g0.h3(new Runnable() { // from class: cg.h0
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
                int i11 = i3;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new j0(i11, photoSize2, photoSize, xgVar, q4Var, 0));
                f30Var.i();
            }
        });
    }

    @Override // e5.m
    public void a(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new k0(fVar, (d2) this.c, list, this.b, (ad.b) this.d, (ms0) this.e, 13));
    }

    @Override // g2.k
    public void accept(Object obj) {
        kg kgVar = (kg) this.c;
        ((w2.k0) obj).K(kgVar.b, (w2.g0) kgVar.c, (w2.u) this.d, (w2.c0) this.e, this.b);
    }

    @Override // org.telegram.ui.Components.e6
    public void b(CharSequence charSequence) {
        g6 g6Var = (g6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = g6Var.j(this.b - ((int) Math.ceil(Math.min(g6Var.d, g6Var.j))), charSequence);
        d6 d6Var = new d6(g6Var, j10, g6Var.d, arrayList.size());
        d6 d6Var2 = new d6(g6Var, j10, g6Var.j, arrayList2.size());
        arrayList2.add(d6Var);
        arrayList.add(d6Var2);
        float f10 = g6Var.d;
        float f11 = d6Var.f;
        g6Var.d = f10 + f11;
        g6Var.j += f11;
        g6Var.f(d6Var);
        g6Var.g(d6Var2);
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        tl0 tl0Var = (tl0) this.c;
        d2 d2Var = (d2) this.d;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
        ArrayList arrayList = tl0Var.r;
        if (i3 >= 0 && i3 < arrayList.size()) {
            int i10 = this.b;
            if (h10.i(i10).q()) {
                if (!h10.i(i10).q()) {
                    new vg.v0(d2Var, 24, true).show();
                    return true;
                }
                rl0 rl0Var = ((sl0) view).a;
                if (rl0Var != null) {
                    rl0Var.p();
                }
                ql0 ql0Var = (ql0) arrayList.get(i3);
                f60 H = f60.H(d2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, bd.M0(TextUtils.isEmpty(ql0Var.c) ? 2131745891 : 2131745879, null), new bi.q0(tl0Var, i10, ql0Var, e6Var, 27), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        int i10;
        TL_bots.toggleUsername toggleusername;
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i13 = 1;
        switch (i11) {
            case 1:
                final ba baVar = (ba) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ka kaVar = baVar.a;
                long j10 = kaVar.y;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i10 = ((d2) kaVar).currentAccount;
                    toggleusername3.bot = hp.s1(i10).o1(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = kaVar.getConnectionsManager();
                final int i14 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.aa
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.dw(ba.this, str, tLObject, i14, z11, tL_error, tL_username, z10));
                    }
                });
                kaVar.x.add(tL_username.username);
                ((ha) view).setLoading(true);
                break;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                break;
            case 3:
                tq tqVar = (tq) obj3;
                gi.d dVar = (gi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, i13));
                    break;
                }
                break;
            case 5:
                ws0 ws0Var = (ws0) obj3;
                zi ziVar = (zi) obj;
                s1[] s1VarArr = {new s1(3, ws0Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ziVar.k.media;
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
                tL_messages_editMessage.peer = hp.s1(i15).j1(ws0Var.m1);
                tL_messages_editMessage.id = ziVar.f1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                org.telegram.messenger.g0.i3(new mp0(s1VarArr, i15, ConnectionsManager.getInstance(i15).sendRequest(tL_messages_editMessage, new i8(ws0Var, s1VarArr, i15, tL_messages_editMessage, 5)), i13), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.voip.o2
    public void i(p2 p2Var) {
        zb1 zb1Var = (zb1) this.c;
        q2 q2Var = (q2) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(zb1Var.T0);
            zb1Var.S0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(zb1Var.b, false, Integer.valueOf(this.b));
            zb1Var.t(q2Var, voIPService);
        }
    }

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        u10 u10Var = (u10) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5.l lVar = (e5.l) it.next();
            e5.h a10 = lVar.a();
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new xg.o(chat, this.b, arrayList, u10Var, 0));
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        uw uwVar = (uw) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = uwVar.k4();
        int i3 = this.b;
        if (k42 != null) {
            k42.n(arrayList2, i3 == 102 ? 27 : 26, null, null, new lu(uwVar, i3, arrayList2, z10, hashSet), null);
        }
        uwVar.n4(i3 == 103);
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ e0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
        this.e = obj3;
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i3;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void O(boolean z10, boolean z11) {
    }
}
