package bg;

import a8.wa;
import ai.a1;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.clearcut.z0;
import di.i8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bh;
import org.telegram.ui.ca;
import org.telegram.ui.ec1;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.nu;
import org.telegram.ui.vq0;
import org.telegram.ui.vs0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements i30, r1, g6, dj0, qr, f5.m, z2, q1, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(int i7, bh bhVar, q4 q4Var, j30 j30Var) {
        this.a = 0;
        this.b = i7;
        this.c = bhVar;
        this.d = q4Var;
        this.e = j30Var;
    }

    @Override // org.telegram.ui.Components.i30
    public void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z9, final TLRPC.VideoSize videoSize) {
        final bh bhVar = (bh) this.c;
        final q4 q4Var = (q4) this.d;
        final j30 j30Var = (j30) this.e;
        final int i7 = this.b;
        org.telegram.messenger.g0.h3(new Runnable() { // from class: bg.i0
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
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new k0(i11, photoSize2, photoSize, bhVar, q4Var, 0));
                j30Var.i();
            }
        });
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        c20 c20Var = (c20) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.l lVar = (f5.l) it.next();
            f5.h a10 = lVar.a();
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new wg.m(chat, this.b, arrayList, c20Var, 0));
    }

    @Override // h2.j
    public void accept(Object obj) {
        wa waVar = (wa) this.c;
        ((x2.k0) obj).I(waVar.b, (x2.g0) waVar.c, (x2.u) this.d, (x2.c0) this.e, this.b);
    }

    @Override // f5.m
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new l0(fVar, (f2) this.c, list, this.b, (z0) this.d, (vs0) this.e, 12));
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        ql0 ql0Var = (ql0) this.c;
        f2 f2Var = (f2) this.d;
        f6 f6Var = (f6) this.e;
        ArrayList arrayList = ql0Var.r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i10 = this.b;
            if (p10.i(i10).q()) {
                if (!p10.i(i10).q()) {
                    new ug.w0(f2Var, 24, true).show();
                    return true;
                }
                ol0 ol0Var = ((pl0) view).a;
                if (ol0Var != null) {
                    ol0Var.p();
                }
                nl0 nl0Var = (nl0) arrayList.get(i7);
                k60 H = k60.H(f2Var, view);
                H.i = 3;
                H.c(R.drawable.menu_tag_rename, hd.M0(TextUtils.isEmpty(nl0Var.c) ? 2131745882 : 2131745870, null), new a1(ql0Var, i10, nl0Var, f6Var, 26), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(a3 a3Var) {
        ec1 ec1Var = (ec1) this.c;
        b3 b3Var = (b3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(ec1Var.R0);
            ec1Var.Q0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ec1Var.b, false, Integer.valueOf(this.b));
            ec1Var.l(b3Var, voIPService);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.g6
    public void f(CharSequence charSequence) {
        i6 i6Var = (i6) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j3 = i6Var.j(this.b - ((int) Math.ceil(Math.min(i6Var.d, i6Var.j))), charSequence);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(i6Var, j3, i6Var.d, arrayList.size());
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(i6Var, j3, i6Var.j, arrayList2.size());
        arrayList2.add(f6Var);
        arrayList.add(f6Var2);
        float f10 = i6Var.d;
        float f11 = f6Var.f;
        i6Var.d = f10 + f11;
        i6Var.j += f11;
        i6Var.f(f6Var);
        i6Var.g(f6Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
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
                final boolean z9 = tL_username.active;
                final String str = tL_username.username;
                final boolean z10 = !z9;
                la laVar = caVar.a;
                long j3 = laVar.y;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z10;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i10 = ((f2) laVar).currentAccount;
                    toggleusername3.bot = qp.s1(i10).o1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z10;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i14 = this.b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: org.telegram.ui.ba
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.lw(ca.this, str, tLObject, i14, z10, tL_error, tL_username, z9));
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
                tq tqVar = (tq) obj3;
                fi.d dVar = (fi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, i13));
                    break;
                }
                break;
            case 5:
                xs0 xs0Var = (xs0) obj3;
                ij ijVar = (ij) obj;
                u1[] u1VarArr = {new u1(3, xs0Var.getContext(), (f6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar.k.media;
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
                tL_messages_editMessage.peer = qp.s1(i15).j1(xs0Var.l1);
                tL_messages_editMessage.id = ijVar.f1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                org.telegram.messenger.g0.i3(new lp0(u1VarArr, i15, ConnectionsManager.getInstance(i15).sendRequest(tL_messages_editMessage, new i8(xs0Var, u1VarArr, i15, tL_messages_editMessage, 5)), i13), 500L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ vq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        ww wwVar = (ww) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = wwVar.k4();
        int i7 = this.b;
        if (k42 != null) {
            k42.n(arrayList2, i7 == 102 ? 27 : 26, null, null, new nu(wwVar, i7, arrayList2, z9, hashSet), null);
        }
        wwVar.n4(i7 == 103);
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ f0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ f0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void O(boolean z9, boolean z10) {
    }
}
