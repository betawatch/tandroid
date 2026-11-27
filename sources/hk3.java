// default package

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hk3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hk3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, m62 m62Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = m62Var;
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
                nk3 nk3Var = (nk3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = nk3Var.W;
                int i2 = nk3Var.Q;
                if (i == nk3Var.g0 && TextUtils.equals(tL_messages_searchGlobal.q, nk3Var.h0)) {
                    nk3Var.c0 = false;
                    if (!z) {
                        arrayList3.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        jf7.Y(i2).j1(messages_messages.users, messages_messages.chats, true, true);
                        uc7.s1(i2).j4(messages_messages.users, false);
                        uc7.s1(i2).c4(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.Message message = arrayList4.get(i3);
                            i3++;
                            r47 r47Var = new r47(i2, message, false, true);
                            r47Var.J5(nk3Var.h0, true);
                            arrayList3.add(r47Var);
                        }
                        nk3Var.e0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList3.size();
                        nk3Var.f0 = messages_messages.next_rate;
                    }
                    nk3Var.O(true);
                    break;
                }
                break;
            case 1:
                pk3 pk3Var = (pk3) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = pk3Var.S;
                int i4 = pk3Var.Q;
                if (i == pk3Var.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, pk3Var.e0)) {
                    pk3Var.Z = false;
                    if (!z) {
                        arrayList5.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        jf7.Y(i4).j1(messages_messages2.users, messages_messages2.chats, true, true);
                        uc7.s1(i4).j4(messages_messages2.users, false);
                        uc7.s1(i4).c4(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages2.messages;
                        int size2 = arrayList6.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            TLRPC.Message message2 = arrayList6.get(i5);
                            i5++;
                            r47 r47Var2 = new r47(i4, message2, false, true);
                            r47Var2.J5(pk3Var.e0, true);
                            arrayList5.add(r47Var2);
                        }
                        pk3Var.b0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        arrayList5.size();
                        pk3Var.c0 = messages_messages2.next_rate;
                    }
                    pk3Var.O(true);
                    break;
                }
                break;
            case 2:
                final qy6 qy6Var = (qy6) obj3;
                final py6 py6Var = (py6) obj;
                qy6Var.j0((ry6) obj2, new py6() { // from class: iy6
                    @Override // py6
                    public final void a(xw6 xw6Var) {
                        py6 py6Var2 = py6Var;
                        qy6 qy6Var2 = qy6.this;
                        yx6 yx6Var = qy6Var2.j;
                        rx6 rx6Var = qy6Var2.g;
                        int i6 = i;
                        if (!rx6Var.a0(xw6Var, i6)) {
                            if (i6 == 1) {
                                yx6Var.t();
                                if (yx6Var.t.s()) {
                                    return;
                                }
                                efd.f("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                                return;
                            }
                            return;
                        }
                        sjf sjfVar = yx6Var.e;
                        yx6Var.q(xw6Var);
                        sjfVar.getClass();
                        try {
                            py6Var2.a(xw6Var);
                        } catch (RemoteException e) {
                            efd.g("MediaSessionLegacyStub", "Exception in " + xw6Var, e);
                        }
                        if (z) {
                            yf8 yf8Var = new yf8();
                            yf8Var.a.b(i6);
                            yf8Var.b();
                            yx6Var.n(xw6Var);
                        }
                    }
                });
                break;
            case 3:
                uc7 uc7Var = (uc7) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final tm1 tm1Var = (tm1) obj;
                LongSparseIntArray longSparseIntArray = uc7Var.s0;
                zh6 zh6Var = uc7Var.r0;
                ArrayList arrayList7 = (ArrayList) zh6Var.f(chat.id);
                zh6 zh6Var2 = uc7Var.t0;
                ArrayList arrayList8 = (ArrayList) zh6Var2.f(chat.id);
                if (z) {
                    if (arrayList7 != null) {
                        arrayList7.remove(Integer.valueOf(i));
                        break;
                    }
                    zh6Var.e(chat.id);
                    if (chat.megagroup) {
                        if (arrayList8 != null) {
                            arrayList8.remove(Integer.valueOf(i));
                            if (!arrayList8.isEmpty()) {
                            }
                        }
                        zh6Var2.e(chat.id);
                        break;
                    }
                } else {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        zh6Var.k(chat.id, arrayList7);
                    }
                    if (!arrayList7.contains(Integer.valueOf(i))) {
                        arrayList7.add(Integer.valueOf(i));
                    }
                    if (uc7Var.q0.indexOfKey(chat.id) < 0) {
                        if (tm1Var != null) {
                            hl.c3(new Runnable() { // from class: pb7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    tm1 tm1Var2 = tm1Var;
                                    switch (b3) {
                                        case 0:
                                            tm1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            tm1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        arrayList = arrayList8;
                        uc7Var.J0(chat.id, 3, 0L, null);
                    } else {
                        arrayList = arrayList8;
                        if (tm1Var != null) {
                            final char c2 = c == true ? 1 : 0;
                            hl.c3(new Runnable() { // from class: pb7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = c2;
                                    tm1 tm1Var2 = tm1Var;
                                    switch (b3) {
                                        case 0:
                                            tm1Var2.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            tm1Var2.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    if (chat.megagroup && !chat.monoforum) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                            zh6Var2.k(chat.id, arrayList2);
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
                nx7 nx7Var = (nx7) obj3;
                yp5 yp5Var = (yp5) obj;
                nx7Var.d((j18) obj2, i, z ? nx7Var.h : null);
                if (z) {
                    nx7Var.h = null;
                }
                if (yp5Var != null) {
                    yp5Var.run();
                    break;
                }
                break;
            case 5:
                r7a r7aVar = (r7a) obj3;
                TLObject tLObject3 = (TLObject) obj;
                d7a d7aVar = (d7a) obj2;
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject3;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = d7aVar.j;
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
                    TLObject tLObject4 = d7aVar.c;
                    if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                        ((TLRPC.TL_messages_sendMedia) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                        ((TL_ephemeral.TL_sendMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                        ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media = tL_inputMediaUploadedPhoto;
                    } else {
                        ((TLRPC.TL_messages_editMessage) tLObject4).media = tL_inputMediaUploadedPhoto;
                    }
                    r7aVar.M(tLObject4, d7aVar.m, d7aVar.f, d7aVar, d7aVar.K, null, d7aVar.H);
                    break;
                } else {
                    d7aVar.c();
                    break;
                }
            case 6:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z) {
                    str = yac.h(i).d0;
                    if (str == null) {
                        ls6.d0(i).E();
                        break;
                    }
                } else {
                    str = yac.h(i).c0;
                    if (str == null) {
                        ls6.d0(i).B();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0(str);
                if (q0 == null) {
                    q0 = ls6.d0(i).o0(str);
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
                    imageReceiver.h1 = new i09((Object) zArr, (byte) 16);
                    ggb f = lp3.f(document, aob.a7, 0.3f, null);
                    TLRPC.PhotoSize w = xb4.w(document.thumbs, jn7.p2, true, null, true);
                    imageReceiver.M(0);
                    imageReceiver.Z(jn5.b(document), "160_160_nr", jn5.c(w, document), "160_160", f, document.size, "tgs", q0, 1);
                    break;
                } else {
                    ls6.d0(i).d1(str, false, q0 == null);
                    break;
                }
                break;
            default:
                String str3 = (String) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                m62 m62Var = (m62) obj;
                lvc[] lvcVarArr = lvc.f;
                lvc lvcVar = lvcVarArr[i];
                if (lvcVar == null) {
                    lvcVar = new lvc(i);
                    lvcVarArr[i] = lvcVar;
                }
                lvcVar.d(str3, this.d, wallPaper.document, wallPaper, m62Var);
                break;
        }
    }

    public /* synthetic */ hk3(qy6 qy6Var, ry6 ry6Var, int i, py6 py6Var, boolean z) {
        this.a = (byte) 2;
        this.f = qy6Var;
        this.c = ry6Var;
        this.b = i;
        this.e = py6Var;
        this.d = z;
    }

    public /* synthetic */ hk3(uc7 uc7Var, TLRPC.Chat chat, boolean z, int i, tm1 tm1Var) {
        this.a = (byte) 3;
        this.f = uc7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = tm1Var;
    }

    public /* synthetic */ hk3(nx7 nx7Var, j18 j18Var, int i, boolean z, yp5 yp5Var) {
        this.a = (byte) 4;
        this.f = nx7Var;
        this.c = j18Var;
        this.b = i;
        this.d = z;
        this.e = yp5Var;
    }

    public /* synthetic */ hk3(r7a r7aVar, TLObject tLObject, d7a d7aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = r7aVar;
        this.e = tLObject;
        this.c = d7aVar;
        this.d = z;
        this.b = i;
    }

    public /* synthetic */ hk3(l9c l9cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l9cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public /* synthetic */ hk3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
