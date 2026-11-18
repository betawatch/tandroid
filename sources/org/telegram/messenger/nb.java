package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ nb(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = i7;
        this.b = j3;
        this.d = activity;
        this.e = arrayList;
        this.f = i6Var;
        this.h = x10Var;
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
                ks.f(i10).k(ks.U1, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                break;
            case 1:
                mp mpVar = (mp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                ap apVar = (ap) obj;
                mpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        mpVar.getMessagesController().X3(chat, true);
                        runnableArr[0] = mpVar.t0(j3, i10, apVar);
                        break;
                    } else if (apVar != null) {
                        apVar.a();
                        break;
                    }
                }
                break;
            case 2:
                mp mpVar2 = (mp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        mpVar2.f4(webpagepreview.users, false);
                        mpVar2.Z3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((fj) arrayList.get(i13)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((fj) arrayList.get(i13)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                ((fj) arrayList.get(i14)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i14 == 0) {
                                    ec.W(((fj) arrayList.get(i14)).k);
                                }
                                tL_messages_messages.messages.add(((fj) arrayList.get(i14)).k);
                            }
                        } else {
                            hVar.k(arrayList, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        tr messagesStorage = mpVar2.getMessagesStorage();
                        int i15 = this.c;
                        long j10 = this.b;
                        messagesStorage.h1(-2, 0, i15, j10, 0L, tL_messages_messages, false);
                        mpVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        break;
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                x10 x10Var = (x10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.x8.y(i10, false).p().amount;
                long j12 = this.b;
                if (j11 >= j12) {
                    x10Var.a(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList2.get(0)).longValue();
                    new di.fb(activity, i6Var, j12, 13, n5.s(i10, longValue), new org.telegram.ui.Components.f2(x10Var, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj5;
                final org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj4;
                final org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
                l2Var.h = false;
                if (h2Var == null) {
                    e0Var.a(null, str);
                    break;
                } else {
                    String str2 = h2Var.e;
                    if (!l2Var.A(h2Var) || l2Var.j(h2Var)) {
                        e0Var.a(null, "Request expired or wallet changed");
                        break;
                    } else {
                        l2Var.g = h2Var;
                        if ("sendTransaction".equals(str2) && h2Var.f != null) {
                            if (mp.u1(l2Var.a).h7.contains(org.telegram.ui.Wallet.l2.l(j3, i10) + ".transfer")) {
                                h2Var.m = true;
                                l2Var.B(h2Var, r0Var, new x10() { // from class: org.telegram.ui.Wallet.d2
                                    @Override // org.telegram.messenger.x10
                                    public final void a(Object obj6) {
                                        String str3 = (String) obj6;
                                        switch (i12) {
                                            case 0:
                                                l2 l2Var2 = l2Var;
                                                l2Var2.getClass();
                                                h2 h2Var2 = h2Var;
                                                h2Var2.m = false;
                                                l2Var2.u(h2Var2);
                                                e0Var.a(null, str3);
                                                break;
                                            default:
                                                l2Var.u(h2Var);
                                                e0Var.a(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (h2Var.l >= 0 || "disconnect".equals(str2)) {
                            r0Var.close();
                            l2Var.f(h2Var, false, new x10() { // from class: org.telegram.ui.Wallet.d2
                                @Override // org.telegram.messenger.x10
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (i11) {
                                        case 0:
                                            l2 l2Var2 = l2Var;
                                            l2Var2.getClass();
                                            h2 h2Var2 = h2Var;
                                            h2Var2.m = false;
                                            l2Var2.u(h2Var2);
                                            e0Var.a(null, str3);
                                            break;
                                        default:
                                            l2Var.u(h2Var);
                                            e0Var.a(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            e0Var.a(h2Var, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ nb(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.c = i7;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j3;
    }

    public /* synthetic */ nb(mp mpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.e = mpVar;
        this.f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.n = hVar;
        this.b = j3;
        this.c = i7;
    }

    public /* synthetic */ nb(mp mpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, ap apVar) {
        this.d = mpVar;
        this.e = zArr;
        this.f = chat;
        this.h = runnableArr;
        this.b = j3;
        this.c = i7;
        this.n = apVar;
    }

    public /* synthetic */ nb(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.e0 e0Var, String str, long j3, int i7, org.telegram.ui.Wallet.r0 r0Var) {
        this.e = l2Var;
        this.f = h2Var;
        this.h = e0Var;
        this.d = str;
        this.b = j3;
        this.c = i7;
        this.n = r0Var;
    }
}
