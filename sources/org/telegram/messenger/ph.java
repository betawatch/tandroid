package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ String c;

    public /* synthetic */ ph(li liVar, String str, int i3) {
        this.a = i3;
        this.b = liVar;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final li liVar = this.b;
                final String str = this.c;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c2;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i3) {
                            case 0:
                                li liVar2 = liVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = liVar2.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        if (tLObject2 != null) {
                                            ((n10) arrayList3.get(i10)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((n10) arrayList3.get(i10)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                break;
                            default:
                                li liVar3 = liVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) liVar3.b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        liVar3.J.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            liVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = zi.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                                                arrayList2 = arrayList4;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i12++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i11++;
                                        arrayList4 = arrayList2;
                                    }
                                    c2 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c2 = 0;
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i13 < size3) {
                                            ((TLRPC.Message) arrayList.get(i13)).stickerVerified = 2;
                                            i13++;
                                        }
                                    }
                                }
                                hs notificationCenter = liVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c2] = arrayList;
                                notificationCenter.k(hs.q1, objArr);
                                qr messagesStorage = liVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new jp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final li liVar2 = this.b;
                final String str2 = this.c;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c2;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i10) {
                            case 0:
                                li liVar22 = liVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = liVar22.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i102 = 0; i102 < arrayList3.size(); i102++) {
                                        if (tLObject2 != null) {
                                            ((n10) arrayList3.get(i102)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((n10) arrayList3.get(i102)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                break;
                            default:
                                li liVar3 = liVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) liVar3.b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        liVar3.J.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            liVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = zi.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                                                arrayList2 = arrayList4;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i12++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i11++;
                                        arrayList4 = arrayList2;
                                    }
                                    c2 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c2 = 0;
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i13 < size3) {
                                            ((TLRPC.Message) arrayList.get(i13)).stickerVerified = 2;
                                            i13++;
                                        }
                                    }
                                }
                                hs notificationCenter = liVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c2] = arrayList;
                                notificationCenter.k(hs.q1, objArr);
                                qr messagesStorage = liVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new jp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
