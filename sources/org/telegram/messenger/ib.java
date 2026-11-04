package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ib(int i3, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = i3;
        this.b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f = e6Var;
        this.h = u10Var;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j10 = this.b;
        int i10 = this.c;
        Object obj = this.n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        final int i11 = 1;
        final int i12 = 0;
        switch (i3) {
            case 0:
                hs.f(i10).k(hs.U1, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j10));
                break;
            case 1:
                hp hpVar = (hp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                vo voVar = (vo) obj;
                hpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        hpVar.getMessagesController().Q3(chat, true);
                        runnableArr[0] = hpVar.s0(j10, i10, voVar);
                        break;
                    } else if (voVar != null) {
                        voVar.a();
                        break;
                    }
                }
                break;
            case 2:
                hp hpVar2 = (hp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        hpVar2.Y3(webpagepreview.users, false);
                        hpVar2.S3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((zi) arrayList.get(i13)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((zi) arrayList.get(i13)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                ((zi) arrayList.get(i14)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i14 == 0) {
                                    zb.W(((zi) arrayList.get(i14)).k);
                                }
                                tL_messages_messages.messages.add(((zi) arrayList.get(i14)).k);
                            }
                        } else {
                            hVar.k(arrayList, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        qr messagesStorage = hpVar2.getMessagesStorage();
                        int i15 = this.c;
                        long j11 = this.b;
                        messagesStorage.h1(-2, 0, i15, j11, 0L, tL_messages_messages, false);
                        hpVar2.getNotificationCenter().k(49, Long.valueOf(j11), arrayList);
                        break;
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                u10 u10Var = (u10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j12 = ci.e9.y(i10, false).p().amount;
                long j13 = this.b;
                if (j12 >= j13) {
                    u10Var.a(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList2.get(0)).longValue();
                    new ci.mb(activity, e6Var, j13, 13, m5.s(i10, longValue), new org.telegram.ui.Components.x1(u10Var, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj5;
                final org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj4;
                final org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
                c2Var.h = false;
                if (y1Var == null) {
                    s1Var.a(null, str);
                    break;
                } else {
                    String str2 = y1Var.e;
                    if (!c2Var.A(y1Var) || c2Var.j(y1Var)) {
                        s1Var.a(null, "Request expired or wallet changed");
                        break;
                    } else {
                        c2Var.g = y1Var;
                        if ("sendTransaction".equals(str2) && y1Var.f != null) {
                            if (hp.s1(c2Var.a).e7.contains(org.telegram.ui.Wallet.c2.l(j10, i10) + ".transfer")) {
                                y1Var.m = true;
                                c2Var.B(y1Var, h0Var, new u10() { // from class: org.telegram.ui.Wallet.u1
                                    @Override // org.telegram.messenger.u10
                                    public final void a(Object obj6) {
                                        String str3 = (String) obj6;
                                        switch (i12) {
                                            case 0:
                                                c2 c2Var2 = c2Var;
                                                c2Var2.getClass();
                                                y1 y1Var2 = y1Var;
                                                y1Var2.m = false;
                                                c2Var2.u(y1Var2);
                                                s1Var.a(null, str3);
                                                break;
                                            default:
                                                c2Var.u(y1Var);
                                                s1Var.a(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (y1Var.l >= 0 || "disconnect".equals(str2)) {
                            h0Var.close();
                            c2Var.f(y1Var, false, new u10() { // from class: org.telegram.ui.Wallet.u1
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (i11) {
                                        case 0:
                                            c2 c2Var2 = c2Var;
                                            c2Var2.getClass();
                                            y1 y1Var2 = y1Var;
                                            y1Var2.m = false;
                                            c2Var2.u(y1Var2);
                                            s1Var.a(null, str3);
                                            break;
                                        default:
                                            c2Var.u(y1Var);
                                            s1Var.a(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            s1Var.a(y1Var, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ ib(int i3, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.c = i3;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j10;
    }

    public /* synthetic */ ib(hp hpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i3) {
        this.e = hpVar;
        this.f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.n = hVar;
        this.b = j10;
        this.c = i3;
    }

    public /* synthetic */ ib(hp hpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i3, vo voVar) {
        this.d = hpVar;
        this.e = zArr;
        this.f = chat;
        this.h = runnableArr;
        this.b = j10;
        this.c = i3;
        this.n = voVar;
    }

    public /* synthetic */ ib(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, org.telegram.ui.Wallet.s1 s1Var, String str, long j10, int i3, org.telegram.ui.Wallet.h0 h0Var) {
        this.e = c2Var;
        this.f = y1Var;
        this.h = s1Var;
        this.d = str;
        this.b = j10;
        this.c = i3;
        this.n = h0Var;
    }
}
