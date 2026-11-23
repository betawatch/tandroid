package bg;

import a8.xa;
import ai.b1;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.clearcut.y0;
import fi.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.r1;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.e3;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.x30;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bh;
import org.telegram.ui.ca;
import org.telegram.ui.cx;
import org.telegram.ui.hc1;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.pu;
import org.telegram.ui.wq0;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements w30, q1, l6, sj0, mr, f5.n, c3, org.telegram.messenger.q1, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(int i7, bh bhVar, r4 r4Var, x30 x30Var) {
        this.a = 0;
        this.b = i7;
        this.c = bhVar;
        this.d = r4Var;
        this.e = x30Var;
    }

    @Override // org.telegram.ui.Components.w30
    public void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final bh bhVar = (bh) this.c;
        final r4 r4Var = (r4) this.d;
        final x30 x30Var = (x30) this.e;
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
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new l0(i11, photoSize2, photoSize, bhVar, r4Var, 0));
                x30Var.i();
            }
        });
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        y10 y10Var = (y10) this.e;
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
        org.telegram.messenger.g0.g3(new wg.m(chat, this.b, arrayList, y10Var, 0));
    }

    @Override // h2.j
    public void accept(Object obj) {
        xa xaVar = (xa) this.c;
        ((x2.k0) obj).I(xaVar.b, (x2.g0) xaVar.c, (x2.u) this.d, (x2.c0) this.e, this.b);
    }

    @Override // f5.n
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m0(fVar, (g2) this.c, list, this.b, (y0) this.d, (xs0) this.e, 12));
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        em0 em0Var = (em0) this.c;
        g2 g2Var = (g2) this.d;
        h6 h6Var = (h6) this.e;
        ArrayList arrayList = em0Var.r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i10 = this.b;
            if (k10.i(i10).q()) {
                if (!k10.i(i10).q()) {
                    new ug.y0(g2Var, 24, true).show();
                    return true;
                }
                cm0 cm0Var = ((dm0) view).a;
                if (cm0Var != null) {
                    cm0Var.p();
                }
                bm0 bm0Var = (bm0) arrayList.get(i7);
                a70 I = a70.I(g2Var, view);
                I.i = 3;
                I.c(R.drawable.menu_tag_rename, hd.N0(TextUtils.isEmpty(bm0Var.c) ? 2131745685 : 2131745673, null), new b1(em0Var, i10, bm0Var, h6Var, 28), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        cx cxVar = (cx) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView l42 = cxVar.l4();
        int i7 = this.b;
        if (l42 != null) {
            l42.n(arrayList2, i7 == 102 ? 27 : 26, null, null, new pu(cxVar, i7, arrayList2, z10, hashSet), null);
        }
        cxVar.p4(i7 == 103);
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l6
    public void f(CharSequence charSequence) {
        n6 n6Var = (n6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j3 = n6Var.j(this.b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.j))), charSequence);
        k6 k6Var = new k6(n6Var, j3, n6Var.d, arrayList.size());
        k6 k6Var2 = new k6(n6Var, j3, n6Var.j, arrayList2.size());
        arrayList2.add(k6Var);
        arrayList.add(k6Var2);
        float f10 = n6Var.d;
        float f11 = k6Var.f;
        n6Var.d = f10 + f11;
        n6Var.j += f11;
        n6Var.f(k6Var);
        n6Var.g(k6Var2);
    }

    @Override // org.telegram.ui.Components.voip.c3
    public void g(d3 d3Var) {
        hc1 hc1Var = (hc1) this.c;
        e3 e3Var = (e3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(hc1Var.S0);
            hc1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(hc1Var.b, false, Integer.valueOf(this.b));
            hc1Var.l(e3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
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
                    toggleusername3.bot = np.u1(i10).q1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i14 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ba
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new org.telegram.messenger.fw(ca.this, str, tLObject, i14, z11, tL_error, tL_username, z10));
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
                jr jrVar = (jr) obj3;
                hi.e eVar = (hi.e) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new fr(jrVar, eVar, i13));
                    break;
                }
                break;
            case 5:
                jt0 jt0Var = (jt0) obj3;
                gj gjVar = (gj) obj;
                t1[] t1VarArr = {new t1(3, jt0Var.getContext(), (h6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) gjVar.k.media;
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
                tL_messages_editMessage.peer = np.u1(i15).l1(jt0Var.m1);
                tL_messages_editMessage.id = gjVar.e1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                org.telegram.messenger.g0.h3(new aq0(t1VarArr, i15, ConnectionsManager.getInstance(i15).sendRequest(tL_messages_editMessage, new y7(jt0Var, t1VarArr, i15, tL_messages_editMessage, 5)), i13), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w30
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

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void I(float f10) {
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void Q(boolean z10, boolean z11) {
    }
}
