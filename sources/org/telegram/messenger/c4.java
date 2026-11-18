package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.y21;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c4(f4 f4Var, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = f4Var;
        this.e = tLObject;
        this.b = j3;
        this.c = z10;
        this.f = str;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.UserFull userFull;
        boolean z10;
        String str;
        TLRPC.WallPaper wallPaper = null;
        int i7 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.d;
                TLObject tLObject = (TLObject) this.e;
                long j3 = this.b;
                boolean z12 = this.c;
                String str2 = (String) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j3 >= 0) {
                        userFull = mp.u1(f4Var.currentAccount).d2(j3);
                        P0 = null;
                    } else {
                        P0 = mp.u1(f4Var.currentAccount).P0(-j3);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (P0 != null) {
                        wallPaper = P0.wallpaper;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < updates.updates.size()) {
                            if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
                                z10 = z11;
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    if (z12) {
                                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str2;
                                        if (wallPaper != null && (str = wallPaper.uploadingImage) != null && str.equals(str2)) {
                                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                                        }
                                        if (userFull != null) {
                                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                            userFull.wallpaper = wallPaper2;
                                            userFull.flags |= 16777216;
                                            f4Var.r(j3, wallPaper2);
                                            f4Var.getMessagesStorage().j2(userFull, false);
                                            ks f10 = ks.f(f4Var.currentAccount);
                                            Object[] objArr = new Object[2];
                                            objArr[0] = Long.valueOf(j3);
                                            objArr[z10 ? 1 : 0] = userFull;
                                            f10.k(67, objArr);
                                        } else if (P0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            P0.wallpaper = wallPaper3;
                                            P0.flags2 |= 128;
                                            f4Var.r(j3, wallPaper3);
                                            f4Var.getMessagesStorage().N1(P0, false);
                                            ks f11 = ks.f(f4Var.currentAccount);
                                            Object[] objArr2 = new Object[4];
                                            objArr2[0] = P0;
                                            objArr2[z10 ? 1 : 0] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr2[2] = bool;
                                            objArr2[3] = bool;
                                            f11.k(30, objArr2);
                                        }
                                    }
                                }
                            } else {
                                z10 = z11;
                            }
                            i10++;
                            z11 = z10;
                        }
                    }
                    mp.u1(f4Var.currentAccount).U3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    ks.f(f4Var.currentAccount).k(ks.w5, new Object[0]);
                    return;
                }
                return;
            case 1:
                mp mpVar = (mp) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.e;
                a0.h hVar = (a0.h) this.f;
                long j10 = this.b;
                hp hpVar = (hp) this.h;
                boolean z13 = this.c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j10);
                    return;
                }
                SystemClock.elapsedRealtime();
                hpVar.a = tL_channels_sendAsPeers;
                mpVar.getNotificationCenter().k(16, Long.valueOf(j10), tL_channels_sendAsPeers, Boolean.valueOf(z13));
                return;
            case 2:
                e00 e00Var = (e00) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z14 = this.c;
                long j11 = this.b;
                HashSet hashSet = (HashSet) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z14) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
                    while (i7 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i7), tL_messages_savedDialogs.messages.get(i7).id);
                        i7++;
                    }
                    g0.g3(new ei(e00Var, tL_messages_savedDialogs, j11, m10, hVar2, hashSet, runnable2));
                    return;
                }
                if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i7 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i7), tL_messages_forumTopics.messages.get(i7).id);
                        i7++;
                    }
                    g0.g3(new di.a3(e00Var, tLObject2, j11, tL_messages_forumTopics, hVar3, runnable2, 3));
                    return;
                }
                return;
            default:
                z00 z00Var = (z00) this.d;
                HashMap hashMap = (HashMap) this.e;
                long j12 = this.b;
                v00 v00Var = (v00) this.f;
                boolean z15 = this.c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (z00Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j12));
                        if (arrayList != null) {
                            arrayList.remove(v00Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j12));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = z00Var.getMessagesController().Y6;
                if ("alternative".equals(str3) || "system".equals(str3)) {
                    String str4 = v00Var.e;
                    while (i7 < v00Var.b.size()) {
                        String str5 = str4;
                        y21.K0(((TLRPC.TL_textWithEntities) v00Var.c.get(i7)).text, null, str5, new l00(z00Var, (u10) v00Var.d.get(i7), z15, ((Integer) v00Var.b.get(i7)).intValue(), str4, j12, 0));
                        i7++;
                        str4 = str5;
                    }
                    return;
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                if (z15) {
                    tL_messages_translateText.flags |= 2;
                    tL_messages_translateText.text.addAll(v00Var.c);
                } else {
                    tL_messages_translateText.flags |= 1;
                    tL_messages_translateText.peer = z00Var.getMessagesController().l1(j12);
                    tL_messages_translateText.id = v00Var.b;
                }
                tL_messages_translateText.to_lang = z00.D(v00Var.e);
                int sendRequest = z00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new b4(z00Var, v00Var, z15, j12, hashSet2, 4));
                synchronized (z00Var) {
                    v00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ c4(mp mpVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j3, hp hpVar, boolean z10) {
        this.d = mpVar;
        this.e = tL_channels_sendAsPeers;
        this.f = hVar;
        this.b = j3;
        this.h = hpVar;
        this.c = z10;
    }

    public /* synthetic */ c4(e00 e00Var, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = e00Var;
        this.e = tLObject;
        this.c = z10;
        this.b = j3;
        this.f = hashSet;
        this.h = runnable;
    }

    public /* synthetic */ c4(z00 z00Var, HashMap hashMap, long j3, v00 v00Var, boolean z10, HashSet hashSet) {
        this.d = z00Var;
        this.e = hashMap;
        this.b = j3;
        this.f = v00Var;
        this.c = z10;
        this.h = hashSet;
    }
}
