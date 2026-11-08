package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.sy;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.rt;
import org.telegram.ui.tt;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nb(Object obj, Object obj2, int i7, boolean z9, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = i7;
        this.b = z9;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        int i7 = this.a;
        final int i10 = 0;
        char c10 = 1;
        char c11 = 1;
        Object obj = this.f;
        boolean z9 = this.b;
        int i11 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z9) {
                    str = p10.i(i11).c0;
                    if (str == null) {
                        ui.b0(i11).C();
                        break;
                    }
                } else {
                    str = p10.i(i11).b0;
                    if (str == null) {
                        ui.b0(i11).z();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = ui.b0(i11).p0(str);
                if (p02 == null) {
                    p02 = ui.b0(i11).n0(str);
                }
                if (p02 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < p02.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = p02.packs.get(i12);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i12++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i13 = 0; i13 < p02.documents.size(); i13++) {
                                    document = p02.documents.get(i13);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !p02.documents.isEmpty()) {
                        document = p02.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.u0 = true;
                    imageReceiver.g1 = new aa.n(zArr, 7);
                    rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, qs.q2, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.hc.b(document), "160_160_nr", org.telegram.messenger.hc.c(w10, document), "160_160", f10, document.size, "tgs", p02, 1);
                    break;
                } else {
                    ui.b0(i11).c1(str, false, p02 == null);
                    break;
                }
                break;
            case 1:
                qp qpVar = (qp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = qpVar.B0;
                a0.h hVar = qpVar.A0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.id);
                a0.h hVar2 = qpVar.C0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.id);
                if (z9) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i11));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i11));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            hVar2.e(chat.id);
                            break;
                        }
                    }
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hVar.k(arrayList, chat.id);
                    }
                    if (!arrayList.contains(Integer.valueOf(i11))) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                    if (qpVar.z0.indexOfKey(chat.id) < 0) {
                        if (aVar != null) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.messenger.uk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            aVar.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            aVar.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        qpVar.J0(chat.id, 3, 0L, null);
                    } else if (aVar != null) {
                        final char c12 = c10 == true ? 1 : 0;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.messenger.uk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (c12) {
                                    case 0:
                                        aVar.accept(Boolean.TRUE);
                                        break;
                                    default:
                                        aVar.accept(Boolean.FALSE);
                                        break;
                                }
                            }
                        });
                    }
                    if (chat.megagroup && !chat.monoforum) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar2.k(arrayList2, chat.id);
                        }
                        if (!arrayList2.contains(Integer.valueOf(i11))) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                        if (longSparseIntArray.indexOfKey(chat.id) < 0) {
                            longSparseIntArray.put(chat.id, 0);
                            break;
                        }
                    }
                }
                break;
            case 2:
                gz gzVar = (gz) obj3;
                TLObject tLObject = (TLObject) obj2;
                sy syVar = (sy) obj;
                gzVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = syVar.j;
                    tL_inputMediaUploadedPhoto.spoiler = z9;
                    if (i11 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i11;
                        tL_inputMediaUploadedPhoto.flags = 2 | tL_inputMediaUploadedPhoto.flags;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = syVar.c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    gzVar.N(tLObject2, syVar.m, syVar.f, syVar, syVar.K, null, syVar.H);
                    break;
                } else {
                    syVar.c();
                    break;
                }
            case 3:
                vr vrVar = (vr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = vrVar.V;
                int i14 = vrVar.P;
                if (i11 == vrVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, vrVar.g0)) {
                    vrVar.b0 = false;
                    if (!z9) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        yr.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                        qp.s1(i14).Y3(messages_messages.users, false);
                        qp.s1(i14).S3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList4.get(i15);
                            i15++;
                            ij ijVar = new ij(i14, message, false, true);
                            ijVar.L5(vrVar.g0, true);
                            arrayList3.add(ijVar);
                        }
                        vrVar.d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        vrVar.e0 = messages_messages.next_rate;
                    }
                    vrVar.O(true);
                    break;
                }
                break;
            case 4:
                xr xrVar = (xr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = xrVar.R;
                int i16 = xrVar.P;
                if (i11 == xrVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, xrVar.d0)) {
                    xrVar.Y = false;
                    if (!z9) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        yr.a0(i16).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        qp.s1(i16).Y3(messages_messages2.users, false);
                        qp.s1(i16).S3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i17);
                            i17++;
                            ij ijVar2 = new ij(i16, message2, false, true);
                            ijVar2.L5(xrVar.d0, true);
                            arrayList5.add(ijVar2);
                        }
                        xrVar.a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        xrVar.b0 = messages_messages2.next_rate;
                    }
                    xrVar.O(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.xd xdVar = (org.telegram.ui.Components.xd) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                tt ttVar = (tt) xdVar.d;
                ttVar.a();
                org.telegram.ui.Cells.m8 m8Var = ttVar.e;
                ttVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false);
                zg0 zg0Var = ttVar.d;
                zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = ttVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        ttVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = ttVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = ttVar.n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ttVar.h = ofFloat;
                    ofFloat.addUpdateListener(new rt(xdVar, z9 ? 50.0f : 200.0f, i18, x03, activity));
                    ttVar.h.addListener(new org.telegram.ui.r0(activity, x03, c11 == true ? 1 : 0));
                    ttVar.h.setDuration(350L);
                    ttVar.h.start();
                }
                if (org.telegram.ui.ActionBar.k6.k1()) {
                    m8Var.p(org.telegram.messenger.id.M0(2131745469, null), zg0Var, true);
                    m8Var.x += 2;
                } else {
                    m8Var.p(org.telegram.messenger.id.M0(2131745470, null), zg0Var, true);
                    m8Var.x += 2;
                }
                org.telegram.ui.ActionBar.k6.M1(f2Var);
                break;
            case 6:
                p4.m0 m0Var = (p4.m0) obj3;
                q4.r rVar = (q4.r) obj2;
                p4.l0 l0Var = (p4.l0) obj;
                p4.d0 d0Var = m0Var.h;
                if (!d0Var.j()) {
                    if (((q4.l) m0Var.n.b).a.isActive()) {
                        p4.v m0 = m0Var.m0(rVar);
                        if (m0Var.g.G(m0, i11)) {
                            pb.b bVar = d0Var.e;
                            d0Var.s(m0);
                            bVar.getClass();
                            try {
                                l0Var.f(m0);
                            } catch (RemoteException e10) {
                                h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                            }
                            if (z9) {
                                new SparseBooleanArray().append(i11, true);
                                d0Var.p(m0);
                                break;
                            }
                        } else if (i11 == 1 && !d0Var.t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder n10 = jg.g.n(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        n10.append(rVar.a.b);
                        h2.a.l("MediaSessionLegacyStub", n10.toString());
                        break;
                    }
                }
                break;
            default:
                sg.j0 j0Var = (sg.j0) obj3;
                Runnable runnable = (Runnable) obj;
                j0Var.d((sg.k0) obj2, i11, z9 ? j0Var.h : null);
                if (z9) {
                    j0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nb(qp qpVar, TLRPC.Chat chat, boolean z9, int i7, q0.a aVar) {
        this.a = 1;
        this.d = qpVar;
        this.e = chat;
        this.b = z9;
        this.c = i7;
        this.f = aVar;
    }

    public /* synthetic */ nb(gz gzVar, TLObject tLObject, sy syVar, boolean z9, int i7) {
        this.a = 2;
        this.d = gzVar;
        this.e = tLObject;
        this.f = syVar;
        this.b = z9;
        this.c = i7;
    }

    public /* synthetic */ nb(l41 l41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, TLObject tLObject, int i10) {
        this.a = i10;
        this.d = l41Var;
        this.c = i7;
        this.e = tL_messages_searchGlobal;
        this.b = z9;
        this.f = tLObject;
    }

    public /* synthetic */ nb(p4.m0 m0Var, int i7, q4.r rVar, p4.l0 l0Var, boolean z9) {
        this.a = 6;
        this.d = m0Var;
        this.c = i7;
        this.e = rVar;
        this.f = l0Var;
        this.b = z9;
    }

    public /* synthetic */ nb(boolean z9, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 0;
        this.b = z9;
        this.c = i7;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
