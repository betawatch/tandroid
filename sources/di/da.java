package di;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ly;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ms;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ da(mp mpVar, TLRPC.Chat chat, boolean z10, int i7, q0.a aVar) {
        this.a = 1;
        this.d = mpVar;
        this.e = chat;
        this.b = z10;
        this.c = i7;
        this.f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f;
                boolean z10 = this.b;
                int i7 = this.c;
                if (z10) {
                    str = j10.i(i7).d0;
                    if (str == null) {
                        ri.d0(i7).E();
                        break;
                    }
                } else {
                    str = j10.i(i7).c0;
                    if (str == null) {
                        ri.d0(i7).B();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet r02 = ri.d0(i7).r0(str);
                if (r02 == null) {
                    r02 = ri.d0(i7).p0(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
                if (tL_messages_stickerSet != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i10++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                    document = tL_messages_stickerSet.documents.get(i11);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.v0 = true;
                    imageReceiver.h1 = new d6.i(zArr, 14);
                    lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.a7, 0.3f, null);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, ks.q2, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(org.telegram.messenger.fc.b(document), "160_160_nr", org.telegram.messenger.fc.c(w10, document), "160_160", f10, document.size, "tgs", tL_messages_stickerSet, 1);
                    break;
                } else {
                    ri.d0(i7).f1(str, false, tL_messages_stickerSet == null);
                    break;
                }
            case 1:
                mp mpVar = (mp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                final q0.a aVar = (q0.a) this.f;
                LongSparseIntArray longSparseIntArray = mpVar.C0;
                a0.h hVar = mpVar.B0;
                ArrayList arrayList = (ArrayList) hVar.f(chat.id);
                a0.h hVar2 = mpVar.D0;
                ArrayList arrayList2 = (ArrayList) hVar2.f(chat.id);
                boolean z11 = this.b;
                int i12 = this.c;
                if (z11) {
                    if (arrayList != null) {
                        arrayList.remove(Integer.valueOf(i12));
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        hVar.e(chat.id);
                    }
                    if (chat.megagroup) {
                        if (arrayList2 != null) {
                            arrayList2.remove(Integer.valueOf(i12));
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
                    if (!arrayList.contains(Integer.valueOf(i12))) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                    if (mpVar.A0.indexOfKey(chat.id) < 0) {
                        if (aVar != null) {
                            final int i13 = 0;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.messenger.sk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
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
                        mpVar.L0(chat.id, 3, 0L, null);
                    } else if (aVar != null) {
                        final int i14 = 1;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.messenger.sk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
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
                        if (!arrayList2.contains(Integer.valueOf(i12))) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                        if (longSparseIntArray.indexOfKey(chat.id) < 0) {
                            longSparseIntArray.put(chat.id, 0);
                            break;
                        }
                    }
                }
                break;
            case 2:
                zy zyVar = (zy) this.d;
                TLObject tLObject = (TLObject) this.e;
                ly lyVar = (ly) this.f;
                zyVar.getClass();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = lyVar.j;
                    tL_inputMediaUploadedPhoto.spoiler = this.b;
                    int i15 = this.c;
                    if (i15 != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i15;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject2 = lyVar.c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
                    }
                    zyVar.N(tLObject2, lyVar.m, lyVar.f, lyVar, lyVar.K, null, lyVar.H);
                    break;
                } else {
                    lyVar.c();
                    break;
                }
            case 3:
                org.telegram.ui.Components.ks ksVar = (org.telegram.ui.Components.ks) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject3 = (TLObject) this.f;
                ArrayList arrayList3 = ksVar.W;
                int i16 = ksVar.Q;
                if (this.c == ksVar.g0 && TextUtils.equals(tL_messages_searchGlobal.q, ksVar.h0)) {
                    ksVar.c0 = false;
                    if (!this.b) {
                        arrayList3.clear();
                    }
                    if (tLObject3 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                        tr.a0(i16).m1(messages_messages.users, messages_messages.chats, true, true);
                        mp.u1(i16).f4(messages_messages.users, false);
                        mp.u1(i16).Z3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TLRPC.Message message = arrayList4.get(i17);
                            i17++;
                            fj fjVar = new fj(i16, message, false, true);
                            fjVar.K5(ksVar.h0, true);
                            arrayList3.add(fjVar);
                        }
                        ksVar.e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages.count);
                        ksVar.f0 = messages_messages.next_rate;
                    }
                    ksVar.O(true);
                    break;
                }
                break;
            case 4:
                ms msVar = (ms) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                ArrayList arrayList5 = msVar.S;
                int i18 = msVar.Q;
                if (this.c == msVar.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, msVar.e0)) {
                    msVar.Z = false;
                    if (!this.b) {
                        arrayList5.clear();
                    }
                    if (tLObject4 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject4;
                        tr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        mp.u1(i18).f4(messages_messages2.users, false);
                        mp.u1(i18).Z3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i19);
                            i19++;
                            fj fjVar2 = new fj(i18, message2, false, true);
                            fjVar2.K5(msVar.e0, true);
                            arrayList5.add(fjVar2);
                        }
                        msVar.b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages2.count);
                        msVar.c0 = messages_messages2.next_rate;
                    }
                    msVar.O(true);
                    break;
                }
                break;
            case 5:
                p4.n0 n0Var = (p4.n0) this.d;
                q4.r rVar = (q4.r) this.e;
                p4.m0 m0Var = (p4.m0) this.f;
                p4.e0 e0Var = n0Var.h;
                if (!e0Var.j()) {
                    boolean isActive = ((q4.l) n0Var.n.b).a.isActive();
                    int i20 = this.c;
                    if (isActive) {
                        p4.v m0 = n0Var.m0(rVar);
                        if (n0Var.g.C(m0, i20)) {
                            w7.s sVar = e0Var.e;
                            e0Var.s(m0);
                            sVar.getClass();
                            try {
                                m0Var.f(m0);
                            } catch (RemoteException e10) {
                                h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                            }
                            if (this.b) {
                                new SparseBooleanArray().append(i20, true);
                                e0Var.p(m0);
                                break;
                            }
                        } else if (i20 == 1 && !e0Var.t.u()) {
                            h2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder m10 = i5.c.m(i20, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(rVar.a.b);
                        h2.a.l("MediaSessionLegacyStub", m10.toString());
                        break;
                    }
                }
                break;
            default:
                sg.i0 i0Var = (sg.i0) this.d;
                sg.j0 j0Var = (sg.j0) this.e;
                Runnable runnable = (Runnable) this.f;
                boolean z12 = this.b;
                i0Var.d(j0Var, this.c, z12 ? i0Var.h : null);
                if (z12) {
                    i0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ da(zy zyVar, TLObject tLObject, ly lyVar, boolean z10, int i7) {
        this.a = 2;
        this.d = zyVar;
        this.e = tLObject;
        this.f = lyVar;
        this.b = z10;
        this.c = i7;
    }

    public /* synthetic */ da(c51 c51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i10) {
        this.a = i10;
        this.d = c51Var;
        this.c = i7;
        this.e = tL_messages_searchGlobal;
        this.b = z10;
        this.f = tLObject;
    }

    public /* synthetic */ da(p4.n0 n0Var, int i7, q4.r rVar, p4.m0 m0Var, boolean z10) {
        this.a = 5;
        this.d = n0Var;
        this.c = i7;
        this.e = rVar;
        this.f = m0Var;
        this.b = z10;
    }

    public /* synthetic */ da(sg.i0 i0Var, sg.j0 j0Var, int i7, boolean z10, Runnable runnable) {
        this.a = 6;
        this.d = i0Var;
        this.e = j0Var;
        this.c = i7;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ da(boolean z10, int i7, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 0;
        this.b = z10;
        this.c = i7;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
