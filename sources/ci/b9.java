package ci;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 2;
        int i11 = 1;
        switch (this.a) {
            case 0:
                ia iaVar = (ia) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b9(i11, iaVar, smallGroupsParticipantsCount));
                return;
            case 1:
                ia iaVar2 = (ia) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (iaVar2.P == null) {
                    iaVar2.P = new HashMap();
                }
                iaVar2.P.putAll(hashMap);
                return;
            case 2:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                xc xcVar = (xc) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (!xcVar.k || xcVar.i) {
                    return;
                }
                xcVar.d.add(new wc(xcVar, bitmap));
                xcVar.k = false;
                xcVar.n.invalidate();
                return;
            case 4:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                a4.m mVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 7:
                d1.e eVar = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                v0.i iVar = eVar.f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 8:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 9:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 10:
                e1.d dVar2 = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.i iVar2 = dVar2.f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                e2.c cVar2 = (e2.c) this.b;
                Object apply = ((i2.v) this.c).apply(cVar2.f);
                cVar2.f = apply;
                e2.b bVar = new e2.b(cVar2, apply, i11);
                e2.z zVar = (e2.z) cVar2.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 12:
                e2.u uVar = (e2.u) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.g(uVar, i10), intentFilter);
                return;
            case 13:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                Context context2 = (Context) this.c;
                e2.u uVar2 = (e2.u) gVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i10 != 5) {
                        uVar2.c(i10);
                        return;
                    } else {
                        e2.s.a(context2, uVar2);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                uVar2.c(i10);
                return;
            case 14:
                i9.c0 c0Var = (i9.c0) this.b;
                i9.w wVar = (i9.w) this.c;
                if (c0Var.a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 15:
                ei.l lVar = (ei.l) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.F0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.H0(true);
                return;
            case 16:
                ei.k3 k3Var = (ei.k3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                k3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                k3Var.g(botappsettings, true);
                return;
            case 17:
                ei.k3 k3Var2 = (ei.k3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (k3Var2.c0) {
                    return;
                }
                if (tL_error != null) {
                    k3Var2.k(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(k3Var2.t0, 60000L);
                    return;
                }
            case 18:
                ei.k3 k3Var3 = (ei.k3) this.b;
                org.telegram.ui.Components.pc Q = new org.telegram.ui.Components.xc(k3Var3.p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 19:
                ei.e4 e4Var = (ei.e4) this.b;
                e4Var.getMessagesController().openApp((TLRPC.User) this.c, e4Var.getClassGuid());
                return;
            case 20:
                ei.e4 e4Var2 = (ei.e4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                e4Var2.getClass();
                e4Var2.presentFragment(zn.R9(connectedbotstarref.bot_id));
                return;
            case 21:
                ei.q4 q4Var = (ei.q4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (q4Var.T) {
                    return;
                }
                if (tL_error2 != null) {
                    q4Var.b.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(q4Var.U, 60000L);
                    return;
                }
            case 22:
                ei.q4 q4Var2 = (ei.q4) this.b;
                org.telegram.ui.Components.pc Q2 = new org.telegram.ui.Components.xc(q4Var2.b.getContainer(), q4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 23:
                fi.s sVar = (fi.s) this.b;
                gi.f fVar2 = (gi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(zn.R9(fVar2.b.id));
                return;
            case 24:
                ((fi.k0) this.b).s.presentFragment(zn.R9(((gi.f) this.c).b.id));
                return;
            case 25:
                gg.c cVar3 = (gg.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i13 = cVar3.G;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar3.v;
                cVar3.v = null;
                cVar3.H(cVar3.w, location, false);
                return;
            case 26:
                gg.i0 i0Var = (gg.i0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i14 = i0Var.s0;
                ArrayList arrayList = i0Var.K;
                i0Var.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    i0Var.l();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i14).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    i0Var.l();
                    return;
                }
                return;
            case 27:
                gg.i0 i0Var2 = (gg.i0) this.b;
                View view = (View) this.c;
                i0Var2.m0 = false;
                i0Var2.o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                gg.i0 i0Var3 = (gg.i0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                i0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(i0Var3.s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                gg.u1 u1Var = (gg.u1) this.b;
                String str = (String) this.c;
                u1Var.I = str;
                if (u1Var.r) {
                    u1Var.f.g(str, true, false, u1Var.s, u1Var.v, u1Var.x, u1Var.w, -1, 1);
                }
                int i15 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i15).contacts);
                u1Var.y = true;
                int i16 = u1Var.F;
                u1Var.F = i16 + 1;
                u1Var.E = i16;
                u1Var.l();
                Utilities.searchQueue.postRunnable(new ei.x4(u1Var, str, i16, arrayList2, i15, 1));
                return;
        }
    }
}
