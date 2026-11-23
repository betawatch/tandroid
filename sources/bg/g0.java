package bg;

import a8.xa;
import ai.x0;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import fi.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.r1;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.e3;
import org.telegram.ui.Components.voip.f3;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bx;
import org.telegram.ui.ca;
import org.telegram.ui.ch;
import org.telegram.ui.fc1;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.ou;
import org.telegram.ui.wq0;
import org.telegram.ui.ws0;
import ug.y0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements t30, q1, k6, sj0, lr, f5.n, d3, org.telegram.messenger.q1, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(int i7, ch chVar, r4 r4Var, u30 u30Var) {
        this.a = 0;
        this.b = i7;
        this.c = chVar;
        this.d = r4Var;
        this.e = u30Var;
    }

    @Override // org.telegram.ui.Components.t30
    public void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ch chVar = (ch) this.c;
        final r4 r4Var = (r4) this.d;
        final u30 u30Var = (u30) this.e;
        final int i7 = this.b;
        org.telegram.messenger.g0.g3(new Runnable() { // from class: bg.j0
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
                int i11 = i7;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new l0(i11, photoSize2, photoSize, chVar, r4Var, 0));
                u30Var.i();
            }
        });
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        w10 w10Var = (w10) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.m mVar = (f5.m) it.next();
            f5.i a10 = mVar.a();
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(mVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.g3(new wg.m(chat, this.b, arrayList, w10Var, 0));
    }

    @Override // h2.j
    public void accept(Object obj) {
        xa xaVar = (xa) this.c;
        ((x2.k0) obj).I(xaVar.b, (x2.g0) xaVar.c, (x2.u) this.d, (x2.c0) this.e, this.b);
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        em0 em0Var = (em0) this.c;
        g2 g2Var = (g2) this.d;
        i6 i6Var = (i6) this.e;
        ArrayList arrayList = em0Var.r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i10 = this.b;
            if (i10.i(i10).q()) {
                if (!i10.i(i10).q()) {
                    new y0(g2Var, 24, true).show();
                    return true;
                }
                cm0 cm0Var = ((dm0) view).a;
                if (cm0Var != null) {
                    cm0Var.p();
                }
                bm0 bm0Var = (bm0) arrayList.get(i7);
                x60 I = x60.I(g2Var, view);
                I.i = 3;
                I.c(R.drawable.menu_tag_rename, gd.N0(TextUtils.isEmpty(bm0Var.c) ? 2131745685 : 2131745673, null), new x0(em0Var, i10, bm0Var, i6Var, 28), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k6
    public void c(CharSequence charSequence) {
        m6 m6Var = (m6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j3 = m6Var.j(this.b - ((int) Math.ceil(Math.min(m6Var.d, m6Var.j))), charSequence);
        j6 j6Var = new j6(m6Var, j3, m6Var.d, arrayList.size());
        j6 j6Var2 = new j6(m6Var, j3, m6Var.j, arrayList2.size());
        arrayList2.add(j6Var);
        arrayList.add(j6Var2);
        float f10 = m6Var.d;
        float f11 = j6Var.f;
        m6Var.d = f10 + f11;
        m6Var.j += f11;
        m6Var.f(j6Var);
        m6Var.g(j6Var2);
    }

    @Override // org.telegram.ui.Components.voip.d3
    public void d(e3 e3Var) {
        fc1 fc1Var = (fc1) this.c;
        f3 f3Var = (f3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(fc1Var.S0);
            fc1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(fc1Var.b, false, Integer.valueOf(this.b));
            fc1Var.l(f3Var, voIPService);
        }
    }

    @Override // f5.n
    public void e(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m0(fVar, (g2) this.c, list, this.b, (com.google.android.gms.internal.clearcut.y0) this.d, (ws0) this.e, 12));
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
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
                final ca caVar = (ca) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                la laVar = caVar.a;
                long j3 = laVar.y;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i10 = ((g2) laVar).currentAccount;
                    toggleusername3.bot = mp.u1(i10).q1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i14 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ba
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new org.telegram.messenger.ew(ca.this, str, tLObject, i14, z11, tL_error, tL_username, z10));
                    }
                });
                laVar.x.add(tL_username.username);
                ((ia) view).setLoading(true);
                break;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                break;
            case 3:
                gr grVar = (gr) obj3;
                hi.e eVar = (hi.e) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new cr(grVar, eVar, i13));
                    break;
                }
                break;
            case 5:
                it0 it0Var = (it0) obj3;
                fj fjVar = (fj) obj;
                t1[] t1VarArr = {new t1(3, it0Var.getContext(), (i6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar.k.media;
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
                tL_messages_editMessage.peer = mp.u1(i15).l1(it0Var.m1);
                tL_messages_editMessage.id = fjVar.e1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                org.telegram.messenger.g0.h3(new zp0(t1VarArr, i15, ConnectionsManager.getInstance(i15).sendRequest(tL_messages_editMessage, new y7(it0Var, t1VarArr, i15, tL_messages_editMessage, 5)), i13), 500L);
                break;
        }
    }

    @Override // org.telegram.messenger.lr
    public void q(boolean z10) {
        bx bxVar = (bx) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView l42 = bxVar.l4();
        int i7 = this.b;
        if (l42 != null) {
            l42.n(arrayList2, i7 == 102 ? 27 : 26, null, null, new ou(bxVar, i7, arrayList2, z10, hashSet), null);
        }
        bxVar.p4(i7 == 103);
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ g0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void P(boolean z10, boolean z11) {
    }
}
