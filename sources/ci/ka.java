package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.ky;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.pt;
import org.telegram.ui.rt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ka(Object obj, Object obj2, int i3, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.c = z10;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        ch0 ch0Var;
        int i3 = this.a;
        final int i10 = 0;
        char c2 = 1;
        char c10 = 1;
        Object obj = this.f;
        boolean z10 = this.c;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z10) {
                    str = h10.i(i11).d0;
                    if (str == null) {
                        li.b0(i11).C();
                        break;
                    }
                } else {
                    str = h10.i(i11).c0;
                    if (str == null) {
                        li.b0(i11).z();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = li.b0(i11).p0(str);
                if (p02 == null) {
                    p02 = li.b0(i11).n0(str);
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
                    imageReceiver.v0 = true;
                    imageReceiver.h1 = new bb.c(zArr, 10);
                    jz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, hs.q2, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.ac.b(document), "160_160_nr", org.telegram.messenger.ac.c(w10, document), "160_160", f10, document.size, "tgs", p02, 1);
                    break;
                } else {
                    li.b0(i11).c1(str, false, p02 == null);
                    break;
                }
            case 1:
                o4.o0 o0Var = (o4.o0) obj3;
                p4.r rVar = (p4.r) obj2;
                o4.n0 n0Var = (o4.n0) obj;
                o4.e0 e0Var = o0Var.h;
                if (!e0Var.j()) {
                    if (((p4.l) o0Var.n.a).a.isActive()) {
                        o4.v m0 = o0Var.m0(rVar);
                        if (o0Var.g.w(m0, i11)) {
                            kb.a aVar = e0Var.e;
                            e0Var.s(m0);
                            aVar.getClass();
                            try {
                                n0Var.c(m0);
                            } catch (RemoteException e10) {
                                g2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                            }
                            if (z10) {
                                new SparseBooleanArray().append(i11, true);
                                e0Var.p(m0);
                                break;
                            }
                        } else if (i11 == 1 && !e0Var.t.u()) {
                            g2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder m10 = k2.p1.m(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.a.b);
                        g2.a.l("MediaSessionLegacyStub", m10.toString());
                        break;
                    }
                }
                break;
            case 2:
                hp hpVar = (hp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar2 = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = hpVar.C0;
                a0.h hVar = hpVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.id);
                a0.h hVar2 = hpVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.id);
                if (z10) {
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
                    if (hpVar.A0.indexOfKey(chat.id) < 0) {
                        if (aVar2 != null) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            aVar2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            aVar2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        hpVar.J0(chat.id, 3, 0L, null);
                    } else if (aVar2 != null) {
                        final char c11 = c2 == true ? 1 : 0;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (c11) {
                                    case 0:
                                        aVar2.accept(Boolean.TRUE);
                                        break;
                                    default:
                                        aVar2.accept(Boolean.FALSE);
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
            case 3:
                yy yyVar = (yy) obj3;
                TLObject tLObject = (TLObject) obj2;
                ky kyVar = (ky) obj;
                yyVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = kyVar.j;
                    tL_inputMediaUploadedPhoto.spoiler = z10;
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
                    TLObject tLObject2 = kyVar.c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    yyVar.N(tLObject2, kyVar.m, kyVar.f, kyVar, kyVar.K, null, kyVar.H);
                    break;
                } else {
                    kyVar.c();
                    break;
                }
            case 4:
                vr vrVar = (vr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = vrVar.W;
                int i14 = vrVar.Q;
                if (i11 == vrVar.g0 && TextUtils.equals(tL_messages_searchGlobal.q, vrVar.h0)) {
                    vrVar.c0 = false;
                    if (!z10) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        qr.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                        hp.s1(i14).Y3(messages_messages.users, false);
                        hp.s1(i14).S3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList4.get(i15);
                            i15++;
                            zi ziVar = new zi(i14, message, false, true);
                            ziVar.L5(vrVar.h0, true);
                            arrayList3.add(ziVar);
                        }
                        vrVar.e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        vrVar.f0 = messages_messages.next_rate;
                    }
                    vrVar.O(true);
                    break;
                }
                break;
            case 5:
                xr xrVar = (xr) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = xrVar.S;
                int i16 = xrVar.Q;
                if (i11 == xrVar.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, xrVar.e0)) {
                    xrVar.Z = false;
                    if (!z10) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        qr.a0(i16).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        hp.s1(i16).Y3(messages_messages2.users, false);
                        hp.s1(i16).S3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i17);
                            i17++;
                            zi ziVar2 = new zi(i16, message2, false, true);
                            ziVar2.L5(xrVar.e0, true);
                            arrayList5.add(ziVar2);
                        }
                        xrVar.b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        xrVar.c0 = messages_messages2.next_rate;
                    }
                    xrVar.O(true);
                    break;
                }
                break;
            case 6:
                vd vdVar = (vd) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                rt rtVar = (rt) vdVar.d;
                rtVar.a();
                org.telegram.ui.Cells.l8 l8Var = rtVar.e;
                rtVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false);
                ch0 ch0Var2 = rtVar.d;
                ch0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = rtVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        rtVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = rtVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = rtVar.n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rtVar.h = ofFloat;
                    float f11 = z10 ? 50.0f : 200.0f;
                    ch0Var = ch0Var2;
                    ofFloat.addUpdateListener(new pt(vdVar, f11, i18, x03, activity));
                    rtVar.h.addListener(new org.telegram.ui.s0(activity, x03, c10 == true ? 1 : 0));
                    rtVar.h.setDuration(350L);
                    rtVar.h.start();
                } else {
                    ch0Var = ch0Var2;
                }
                if (org.telegram.ui.ActionBar.k6.k1()) {
                    l8Var.p(bd.M0(2131745476, null), ch0Var, true);
                    l8Var.x += 2;
                } else {
                    l8Var.p(bd.M0(2131745477, null), ch0Var, true);
                    l8Var.x += 2;
                }
                org.telegram.ui.ActionBar.k6.M1(d2Var);
                break;
            default:
                tg.i0 i0Var = (tg.i0) obj3;
                Runnable runnable = (Runnable) obj;
                i0Var.d((tg.j0) obj2, i11, z10 ? i0Var.h : null);
                if (z10) {
                    i0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka(o4.o0 o0Var, int i3, p4.r rVar, o4.n0 n0Var, boolean z10) {
        this.a = 1;
        this.d = o0Var;
        this.b = i3;
        this.e = rVar;
        this.f = n0Var;
        this.c = z10;
    }

    public /* synthetic */ ka(hp hpVar, TLRPC.Chat chat, boolean z10, int i3, q0.a aVar) {
        this.a = 2;
        this.d = hpVar;
        this.e = chat;
        this.c = z10;
        this.b = i3;
        this.f = aVar;
    }

    public /* synthetic */ ka(yy yyVar, TLObject tLObject, ky kyVar, boolean z10, int i3) {
        this.a = 3;
        this.d = yyVar;
        this.e = tLObject;
        this.f = kyVar;
        this.c = z10;
        this.b = i3;
    }

    public /* synthetic */ ka(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.a = i10;
        this.d = f41Var;
        this.b = i3;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
        this.f = tLObject;
    }

    public /* synthetic */ ka(boolean z10, int i3, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 0;
        this.c = z10;
        this.b = i3;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
