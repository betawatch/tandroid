// default package

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class al3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ al3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, h72 h72Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = h72Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        if (r2.isEmpty() != false) goto L83;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        TLRPC.Document document;
        byte b = this.a;
        final byte b2 = 0;
        char c = 1;
        final boolean z = this.d;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.f;
        final int i = this.b;
        switch (b) {
            case 0:
                gl3 gl3Var = (gl3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = gl3Var.W;
                int i2 = gl3Var.Q;
                if (i == gl3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, gl3Var.h0)) {
                    gl3Var.c0 = false;
                    if (!z) {
                        arrayList3.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        cf7.Y(i2).j1(messages_messages.users, messages_messages.chats, true, true);
                        oc7.r1(i2).d4(messages_messages.users, false);
                        oc7.r1(i2).X3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.Message message = arrayList4.get(i3);
                            i3++;
                            k47 k47Var = new k47(i2, message, false, true);
                            k47Var.J5(gl3Var.h0, true);
                            arrayList3.add(k47Var);
                        }
                        gl3Var.e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList3.size();
                        gl3Var.f0 = messages_messages.next_rate;
                    }
                    gl3Var.O(true);
                    break;
                }
                break;
            case 1:
                il3 il3Var = (il3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = il3Var.S;
                int i4 = il3Var.Q;
                if (i == il3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, il3Var.e0)) {
                    il3Var.Z = false;
                    if (!z) {
                        arrayList5.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        cf7.Y(i4).j1(messages_messages2.users, messages_messages2.chats, true, true);
                        oc7.r1(i4).d4(messages_messages2.users, false);
                        oc7.r1(i4).X3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i5);
                            i5++;
                            k47 k47Var2 = new k47(i4, message2, false, true);
                            k47Var2.J5(il3Var.e0, true);
                            arrayList5.add(k47Var2);
                        }
                        il3Var.b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList5.size();
                        il3Var.c0 = messages_messages2.next_rate;
                    }
                    il3Var.O(true);
                    break;
                }
                break;
            case 2:
                final ly6 ly6Var = (ly6) obj3;
                final ky6 ky6Var = (ky6) obj;
                ly6Var.j0((my6) obj2, new ky6() { // from class: dy6
                    @Override // ky6
                    public final void a(sw6 sw6Var) {
                        ky6 ky6Var2 = ky6Var;
                        ly6 ly6Var2 = ly6.this;
                        tx6 tx6Var = ly6Var2.j;
                        mx6 mx6Var = ly6Var2.g;
                        int i6 = i;
                        if (!mx6Var.Z(sw6Var, i6)) {
                            if (i6 == 1) {
                                tx6Var.t();
                                if (tx6Var.t.s()) {
                                    return;
                                }
                                ncd.f("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                                return;
                            }
                            return;
                        }
                        dhf dhfVar = tx6Var.e;
                        tx6Var.q(sw6Var);
                        dhfVar.getClass();
                        try {
                            ky6Var2.a(sw6Var);
                        } catch (RemoteException e) {
                            ncd.g("MediaSessionLegacyStub", "Exception in " + sw6Var, e);
                        }
                        if (z) {
                            me8 me8Var = new me8();
                            me8Var.a.b(i6);
                            me8Var.b();
                            tx6Var.n(sw6Var);
                        }
                    }
                });
                break;
            case 3:
                oc7 oc7Var = (oc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final io1 io1Var = (io1) obj;
                LongSparseIntArray longSparseIntArray = oc7Var.s0;
                vh6 vh6Var = oc7Var.r0;
                ArrayList arrayList7 = (ArrayList) vh6Var.f(chat.id);
                vh6 vh6Var2 = oc7Var.t0;
                ArrayList arrayList8 = (ArrayList) vh6Var2.f(chat.id);
                if (z) {
                    if (arrayList7 != null) {
                        arrayList7.remove(Integer.valueOf(i));
                        break;
                    }
                    vh6Var.e(chat.id);
                    if (chat.megagroup) {
                        if (arrayList8 != null) {
                            arrayList8.remove(Integer.valueOf(i));
                            if (!arrayList8.isEmpty()) {
                            }
                        }
                        vh6Var2.e(chat.id);
                        break;
                    }
                } else {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        vh6Var.k(arrayList7, chat.id);
                    }
                    if (!arrayList7.contains(Integer.valueOf(i))) {
                        arrayList7.add(Integer.valueOf(i));
                    }
                    if (oc7Var.q0.indexOfKey(chat.id) < 0) {
                        if (io1Var != null) {
                            gm.c3(new Runnable() { // from class: a87
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    io1 io1Var2 = io1Var;
                                    switch (b3) {
                                        case 0:
                                            io1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            io1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        arrayList = arrayList8;
                        oc7Var.I0(chat.id, 3, 0L, null);
                    } else {
                        arrayList = arrayList8;
                        if (io1Var != null) {
                            final char c2 = c == true ? 1 : 0;
                            gm.c3(new Runnable() { // from class: a87
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = c2;
                                    io1 io1Var2 = io1Var;
                                    switch (b3) {
                                        case 0:
                                            io1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            io1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    if (chat.megagroup && !chat.monoforum) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                            vh6Var2.k(arrayList2, chat.id);
                        } else {
                            arrayList2 = arrayList;
                        }
                        if (!arrayList2.contains(Integer.valueOf(i))) {
                            arrayList2.add(Integer.valueOf(i));
                        }
                        if (longSparseIntArray.indexOfKey(chat.id) < 0) {
                            longSparseIntArray.put(chat.id, 0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                hw7 hw7Var = (hw7) obj3;
                vp5 vp5Var = (vp5) obj;
                hw7Var.d((f08) obj2, i, z ? hw7Var.h : null);
                if (z) {
                    hw7Var.h = null;
                }
                if (vp5Var != null) {
                    vp5Var.run();
                    break;
                }
                break;
            case 5:
                a6a a6aVar = (a6a) obj3;
                TLObject tLObject3 = (TLObject) obj;
                m5a m5aVar = (m5a) obj2;
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject3;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = m5aVar.j;
                    tL_inputMediaUploadedPhoto.spoiler = z;
                    if (i != 0) {
                        tL_inputMediaUploadedPhoto.ttl_seconds = i;
                        tL_inputMediaUploadedPhoto.flags |= 2;
                    }
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.file_reference = document2.file_reference;
                    TLObject tLObject4 = m5aVar.c;
                    if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    }
                    a6aVar.M(tLObject4, m5aVar.m, m5aVar.f, m5aVar, m5aVar.K, null, m5aVar.H);
                    break;
                } else {
                    m5aVar.c();
                    break;
                }
            case 6:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z) {
                    str = z8c.h(i).d0;
                    if (str == null) {
                        hs6.d0(i).E();
                        break;
                    }
                } else {
                    str = z8c.h(i).c0;
                    if (str == null) {
                        hs6.d0(i).B();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0(str);
                if (q0 == null) {
                    q0 = hs6.d0(i).o0(str);
                }
                if (q0 != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < q0.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = q0.packs.get(i6);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i6++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i7 = 0; i7 < q0.documents.size(); i7++) {
                                    document = q0.documents.get(i7);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !q0.documents.isEmpty()) {
                        document = q0.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.v0 = true;
                    imageReceiver.h1 = new cf9((Object) zArr, (byte) 11);
                    meb f = eq3.f(document, cmb.Z6, 0.3f, null);
                    TLRPC.PhotoSize w = bc4.w(document.thumbs, nm7.p2, true, null, true);
                    imageReceiver.M(0);
                    imageReceiver.Z(gn5.b(document), "160_160_nr", gn5.c(w, document), "160_160", f, document.size, "tgs", q0, 1);
                    break;
                } else {
                    hs6.d0(i).d1(str, false, q0 == null);
                    break;
                }
                break;
            default:
                String str3 = (String) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                h72 h72Var = (h72) obj;
                zsc[] zscVarArr = zsc.f;
                zsc zscVar = zscVarArr[i];
                if (zscVar == null) {
                    zscVar = new zsc(i);
                    zscVarArr[i] = zscVar;
                }
                zscVar.d(str3, this.d, wallPaper.document, wallPaper, h72Var);
                break;
        }
    }

    public /* synthetic */ al3(ly6 ly6Var, my6 my6Var, int i, ky6 ky6Var, boolean z) {
        this.a = (byte) 2;
        this.f = ly6Var;
        this.c = my6Var;
        this.b = i;
        this.e = ky6Var;
        this.d = z;
    }

    public /* synthetic */ al3(oc7 oc7Var, TLRPC.Chat chat, boolean z, int i, io1 io1Var) {
        this.a = (byte) 3;
        this.f = oc7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = io1Var;
    }

    public /* synthetic */ al3(hw7 hw7Var, f08 f08Var, int i, boolean z, vp5 vp5Var) {
        this.a = (byte) 4;
        this.f = hw7Var;
        this.c = f08Var;
        this.b = i;
        this.d = z;
        this.e = vp5Var;
    }

    public /* synthetic */ al3(a6a a6aVar, TLObject tLObject, m5a m5aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = a6aVar;
        this.e = tLObject;
        this.c = m5aVar;
        this.d = z;
        this.b = i;
    }

    public /* synthetic */ al3(l7c l7cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l7cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public /* synthetic */ al3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
