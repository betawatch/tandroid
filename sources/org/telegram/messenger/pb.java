package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pb(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = i7;
        this.b = j3;
        this.d = activity;
        this.e = arrayList;
        this.f = h6Var;
        this.h = c20Var;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.b;
        int i10 = this.c;
        Object obj = this.n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        final int i11 = 1;
        final int i12 = 0;
        switch (i7) {
            case 0:
                qs.f(i10).k(qs.U1, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                break;
            case 1:
                qp qpVar = (qp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                ep epVar = (ep) obj;
                qpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        qpVar.getMessagesController().Q3(chat, true);
                        runnableArr[0] = qpVar.s0(j3, i10, epVar);
                        break;
                    } else if (epVar != null) {
                        epVar.a();
                        break;
                    }
                }
                break;
            case 2:
                qp qpVar2 = (qp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        qpVar2.Y3(webpagepreview.users, false);
                        qpVar2.S3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((ij) arrayList.get(i13)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((ij) arrayList.get(i13)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                ((ij) arrayList.get(i14)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i14 == 0) {
                                    gc.W(((ij) arrayList.get(i14)).k);
                                }
                                tL_messages_messages.messages.add(((ij) arrayList.get(i14)).k);
                            }
                        } else {
                            hVar.k(arrayList, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        yr messagesStorage = qpVar2.getMessagesStorage();
                        int i15 = this.c;
                        long j10 = this.b;
                        messagesStorage.h1(-2, 0, i15, j10, 0L, tL_messages_messages, false);
                        qpVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        break;
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                c20 c20Var = (c20) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = bi.ea.y(i10, false).p().amount;
                long j12 = this.b;
                if (j11 >= j12) {
                    c20Var.a(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList2.get(0)).longValue();
                    new bi.tc(activity, h6Var, j12, 13, m5.s(i10, longValue), new org.telegram.ui.Components.x1(c20Var, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj4;
                final org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
                d2Var.h = false;
                if (z1Var == null) {
                    t1Var.a(null, str);
                    break;
                } else {
                    String str2 = z1Var.e;
                    if (!d2Var.A(z1Var) || d2Var.j(z1Var)) {
                        t1Var.a(null, "Request expired or wallet changed");
                        break;
                    } else {
                        d2Var.g = z1Var;
                        if ("sendTransaction".equals(str2) && z1Var.f != null) {
                            if (qp.s1(d2Var.a).e7.contains(org.telegram.ui.Wallet.d2.l(j3, i10) + ".transfer")) {
                                z1Var.m = true;
                                d2Var.B(z1Var, i0Var, new c20() { // from class: org.telegram.ui.Wallet.v1
                                    @Override // org.telegram.messenger.c20
                                    public final void a(Object obj6) {
                                        String str3 = (String) obj6;
                                        switch (i12) {
                                            case 0:
                                                d2 d2Var2 = d2Var;
                                                d2Var2.getClass();
                                                z1 z1Var2 = z1Var;
                                                z1Var2.m = false;
                                                d2Var2.u(z1Var2);
                                                t1Var.a(null, str3);
                                                break;
                                            default:
                                                d2Var.u(z1Var);
                                                t1Var.a(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (z1Var.l >= 0 || "disconnect".equals(str2)) {
                            i0Var.close();
                            d2Var.f(z1Var, false, new c20() { // from class: org.telegram.ui.Wallet.v1
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (i11) {
                                        case 0:
                                            d2 d2Var2 = d2Var;
                                            d2Var2.getClass();
                                            z1 z1Var2 = z1Var;
                                            z1Var2.m = false;
                                            d2Var2.u(z1Var2);
                                            t1Var.a(null, str3);
                                            break;
                                        default:
                                            d2Var.u(z1Var);
                                            t1Var.a(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            t1Var.a(z1Var, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ pb(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.c = i7;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j3;
    }

    public /* synthetic */ pb(qp qpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.e = qpVar;
        this.f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.n = hVar;
        this.b = j3;
        this.c = i7;
    }

    public /* synthetic */ pb(qp qpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, ep epVar) {
        this.d = qpVar;
        this.e = zArr;
        this.f = chat;
        this.h = runnableArr;
        this.b = j3;
        this.c = i7;
        this.n = epVar;
    }

    public /* synthetic */ pb(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.t1 t1Var, String str, long j3, int i7, org.telegram.ui.Wallet.i0 i0Var) {
        this.e = d2Var;
        this.f = z1Var;
        this.h = t1Var;
        this.d = str;
        this.b = j3;
        this.c = i7;
        this.n = i0Var;
    }
}
