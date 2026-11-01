package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class yh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ String c;

    public /* synthetic */ yh(vi viVar, String str, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final vi viVar = this.b;
                final String str = this.c;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.tf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i10) {
                            case 0:
                                vi viVar2 = viVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = viVar2.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                        if (tLObject2 != null) {
                                            ((k20) arrayList3.get(i11)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((k20) arrayList3.get(i11)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                break;
                            default:
                                vi viVar3 = viVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) viVar3.a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        viVar3.I.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            viVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i12);
                                        TLRPC.Document G0 = kj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                                                arrayList2 = arrayList4;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i13++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i12++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i14 < size3) {
                                            ((TLRPC.Message) arrayList.get(i14)).stickerVerified = 2;
                                            i14++;
                                        }
                                    }
                                }
                                at notificationCenter = viVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(at.q1, objArr);
                                is messagesStorage = viVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new yp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final vi viVar2 = this.b;
                final String str2 = this.c;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.tf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i11) {
                            case 0:
                                vi viVar22 = viVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = viVar22.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i112 = 0; i112 < arrayList3.size(); i112++) {
                                        if (tLObject2 != null) {
                                            ((k20) arrayList3.get(i112)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((k20) arrayList3.get(i112)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                break;
                            default:
                                vi viVar3 = viVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) viVar3.a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        viVar3.I.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            viVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i12);
                                        TLRPC.Document G0 = kj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                                                arrayList2 = arrayList4;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i13++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i12++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i14 < size3) {
                                            ((TLRPC.Message) arrayList.get(i14)).stickerVerified = 2;
                                            i14++;
                                        }
                                    }
                                }
                                at notificationCenter = viVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(at.q1, objArr);
                                is messagesStorage = viVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new yp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
