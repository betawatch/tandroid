package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ rb(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.c = i10;
        this.b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f = p6Var;
        this.h = r20Var;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j10 = this.b;
        int i11 = this.c;
        Object obj = this.n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                at.f(i11).k(at.U1, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j10));
                break;
            case 1:
                wp wpVar = (wp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                kp kpVar = (kp) obj;
                wpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        wpVar.getMessagesController().N3(chat, true);
                        runnableArr[0] = wpVar.s0(j10, i11, kpVar);
                        break;
                    } else if (kpVar != null) {
                        kpVar.a();
                        break;
                    }
                }
                break;
            case 2:
                wp wpVar2 = (wp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        wpVar2.V3(webpagepreview.users, false);
                        wpVar2.P3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            ((kj) arrayList.get(i14)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((kj) arrayList.get(i14)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                ((kj) arrayList.get(i15)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i15 == 0) {
                                    ic.W(((kj) arrayList.get(i15)).k);
                                }
                                tL_messages_messages.messages.add(((kj) arrayList.get(i15)).k);
                            }
                        } else {
                            hVar.k(arrayList, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        is messagesStorage = wpVar2.getMessagesStorage();
                        int i16 = this.c;
                        long j11 = this.b;
                        messagesStorage.h1(-2, 0, i16, j11, 0L, tL_messages_messages, false);
                        wpVar2.getNotificationCenter().k(49, Long.valueOf(j11), arrayList);
                        break;
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                r20 r20Var = (r20) obj3;
                HashMap hashMap = (HashMap) obj;
                long j12 = rh.e6.y(i11, false).p().amount;
                long j13 = this.b;
                if (j12 >= j13) {
                    r20Var.a(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList2.get(0)).longValue();
                    new rh.x7(activity, p6Var, j13, 13, o5.s(i11, longValue), new mg.j0(r20Var, hashMap, 1), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj4;
                final ih.s sVar = (ih.s) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
                e2Var.h = false;
                if (a2Var == null) {
                    sVar.a(null, str);
                    break;
                } else {
                    String str2 = a2Var.e;
                    if (!e2Var.A(a2Var) || e2Var.j(a2Var)) {
                        sVar.a(null, "Request expired or wallet changed");
                        break;
                    } else {
                        e2Var.g = a2Var;
                        if ("sendTransaction".equals(str2) && a2Var.f != null) {
                            if (wp.r1(e2Var.a).f7.contains(org.telegram.ui.Wallet.e2.l(j10, i11) + ".transfer")) {
                                a2Var.m = true;
                                e2Var.B(a2Var, h0Var, new r20() { // from class: org.telegram.ui.Wallet.w1
                                    @Override // org.telegram.messenger.r20
                                    public final void a(Object obj6) {
                                        String str3 = (String) obj6;
                                        switch (i13) {
                                            case 0:
                                                e2 e2Var2 = e2Var;
                                                e2Var2.getClass();
                                                a2 a2Var2 = a2Var;
                                                a2Var2.m = false;
                                                e2Var2.u(a2Var2);
                                                sVar.a(null, str3);
                                                break;
                                            default:
                                                e2Var.u(a2Var);
                                                sVar.a(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (a2Var.l >= 0 || "disconnect".equals(str2)) {
                            h0Var.close();
                            e2Var.f(a2Var, false, new r20() { // from class: org.telegram.ui.Wallet.w1
                                @Override // org.telegram.messenger.r20
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (i12) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.m = false;
                                            e2Var2.u(a2Var2);
                                            sVar.a(null, str3);
                                            break;
                                        default:
                                            e2Var.u(a2Var);
                                            sVar.a(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            sVar.a(a2Var, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ rb(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.c = i10;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j10;
    }

    public /* synthetic */ rb(wp wpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = wpVar;
        this.f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.n = hVar;
        this.b = j10;
        this.c = i10;
    }

    public /* synthetic */ rb(wp wpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, kp kpVar) {
        this.d = wpVar;
        this.e = zArr;
        this.f = chat;
        this.h = runnableArr;
        this.b = j10;
        this.c = i10;
        this.n = kpVar;
    }

    public /* synthetic */ rb(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, ih.s sVar, String str, long j10, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.e = e2Var;
        this.f = a2Var;
        this.h = sVar;
        this.d = str;
        this.b = j10;
        this.c = i10;
        this.n = h0Var;
    }
}
