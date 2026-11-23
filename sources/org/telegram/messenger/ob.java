package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ob(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = i7;
        this.b = j3;
        this.d = activity;
        this.e = arrayList;
        this.f = h6Var;
        this.h = y10Var;
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
                ls.f(i10).k(ls.U1, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                break;
            case 1:
                np npVar = (np) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                bp bpVar = (bp) obj;
                npVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        npVar.getMessagesController().X3(chat, true);
                        runnableArr[0] = npVar.t0(j3, i10, bpVar);
                        break;
                    } else if (bpVar != null) {
                        bpVar.a();
                        break;
                    }
                }
                break;
            case 2:
                np npVar2 = (np) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        npVar2.f4(webpagepreview.users, false);
                        npVar2.Z3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((gj) arrayList.get(i13)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((gj) arrayList.get(i13)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                ((gj) arrayList.get(i14)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i14 == 0) {
                                    fc.W(((gj) arrayList.get(i14)).k);
                                }
                                tL_messages_messages.messages.add(((gj) arrayList.get(i14)).k);
                            }
                        } else {
                            hVar.k(arrayList, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        ur messagesStorage = npVar2.getMessagesStorage();
                        int i15 = this.c;
                        long j10 = this.b;
                        messagesStorage.h1(-2, 0, i15, j10, 0L, tL_messages_messages, false);
                        npVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        break;
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                y10 y10Var = (y10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.y8.y(i10, false).p().amount;
                long j12 = this.b;
                if (j11 >= j12) {
                    y10Var.a(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList2.get(0)).longValue();
                    new di.fb(activity, h6Var, j12, 13, n5.s(i10, longValue), new org.telegram.ui.Components.g2(y10Var, hashMap, 0), longValue).show();
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
                            if (np.u1(l2Var.a).h7.contains(org.telegram.ui.Wallet.l2.l(j3, i10) + ".transfer")) {
                                h2Var.m = true;
                                l2Var.B(h2Var, r0Var, new y10() { // from class: org.telegram.ui.Wallet.d2
                                    @Override // org.telegram.messenger.y10
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
                            l2Var.f(h2Var, false, new y10() { // from class: org.telegram.ui.Wallet.d2
                                @Override // org.telegram.messenger.y10
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

    public /* synthetic */ ob(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.c = i7;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j3;
    }

    public /* synthetic */ ob(np npVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.e = npVar;
        this.f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.n = hVar;
        this.b = j3;
        this.c = i7;
    }

    public /* synthetic */ ob(np npVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, bp bpVar) {
        this.d = npVar;
        this.e = zArr;
        this.f = chat;
        this.h = runnableArr;
        this.b = j3;
        this.c = i7;
        this.n = bpVar;
    }

    public /* synthetic */ ob(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.e0 e0Var, String str, long j3, int i7, org.telegram.ui.Wallet.r0 r0Var) {
        this.e = l2Var;
        this.f = h2Var;
        this.h = e0Var;
        this.d = str;
        this.b = j3;
        this.c = i7;
        this.n = r0Var;
    }
}
