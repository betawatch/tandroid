package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class yh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ String c;

    public /* synthetic */ yh(ui uiVar, String str, int i7) {
        this.a = i7;
        this.b = uiVar;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ui uiVar = this.b;
                final String str = this.c;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i7) {
                            case 0:
                                ui uiVar2 = uiVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = uiVar2.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        if (tLObject2 != null) {
                                            ((v10) arrayList3.get(i10)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((v10) arrayList3.get(i10)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                break;
                            default:
                                ui uiVar3 = uiVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) uiVar3.a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        uiVar3.I.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            uiVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = ij.G0(message);
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
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
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
                                qs notificationCenter = uiVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(qs.q1, objArr);
                                yr messagesStorage = uiVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new sp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ui uiVar2 = this.b;
                final String str2 = this.c;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (i10) {
                            case 0:
                                ui uiVar22 = uiVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = uiVar22.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i102 = 0; i102 < arrayList3.size(); i102++) {
                                        if (tLObject2 != null) {
                                            ((v10) arrayList3.get(i102)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((v10) arrayList3.get(i102)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                break;
                            default:
                                ui uiVar3 = uiVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) uiVar3.a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        uiVar3.I.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            uiVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = ij.G0(message);
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
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
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
                                qs notificationCenter = uiVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(qs.q1, objArr);
                                yr messagesStorage = uiVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new sp(messagesStorage, arrayList, 15));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
