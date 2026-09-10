package bi;

import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.eo;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ af(int i10, Object obj, Object obj2) {
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
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 1:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 2:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 3:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 4:
                Context context = (Context) this.b;
                e2.g gVar = (e2.g) this.c;
                c2.d.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                gVar.e();
                return;
            case 5:
                ca.c cVar = (ca.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    l5.s.a().d.e(cVar.h.a.b(i5.d.c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 6:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                com.google.firebase.messaging.u uVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 7:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 8:
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
            case 9:
                di.m mVar = (di.m) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    mVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    mVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        mVar.W = true;
                        mVar.Y = mVar.F0();
                        mVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        mVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = mVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                mVar.H0(true);
                return;
            case 10:
                di.n3 n3Var = (di.n3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                n3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                n3Var.g(botappsettings, true);
                return;
            case 11:
                di.n3 n3Var2 = (di.n3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (n3Var2.c0) {
                    return;
                }
                if (tL_error != null) {
                    n3Var2.k(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(n3Var2.t0, 60000L);
                    return;
                }
            case 12:
                di.n3 n3Var3 = (di.n3) this.b;
                org.telegram.ui.Components.pc Q = new org.telegram.ui.Components.wc(n3Var3.p0, n3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 13:
                di.h4 h4Var = (di.h4) this.b;
                h4Var.getMessagesController().openApp((TLRPC.User) this.c, h4Var.getClassGuid());
                return;
            case 14:
                di.h4 h4Var2 = (di.h4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                h4Var2.getClass();
                h4Var2.presentFragment(eo.R9(connectedbotstarref.bot_id));
                return;
            case 15:
                di.u4 u4Var = (di.u4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (u4Var.T) {
                    return;
                }
                if (tL_error2 != null) {
                    u4Var.b.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(u4Var.U, 60000L);
                    return;
                }
            case 16:
                di.u4 u4Var2 = (di.u4) this.b;
                org.telegram.ui.Components.pc Q2 = new org.telegram.ui.Components.wc(u4Var2.b.getContainer(), u4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 17:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 18:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 19:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar2 = (v0.c) this.c;
                v0.i iVar2 = dVar.f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 20:
                e2.c cVar3 = (e2.c) this.b;
                Object apply = ((i2.v) this.c).apply(cVar3.f);
                cVar3.f = apply;
                e2.b bVar = new e2.b(cVar3, apply, i11);
                e2.z zVar = (e2.z) cVar3.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 21:
                e2.u uVar2 = (e2.u) this.b;
                Context context2 = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.mediarouter.app.g(uVar2, i10), intentFilter);
                return;
            case 22:
                androidx.mediarouter.app.g gVar2 = (androidx.mediarouter.app.g) this.b;
                Context context3 = (Context) this.c;
                e2.u uVar3 = (e2.u) gVar2.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
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
                    } catch (SecurityException unused2) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i10 != 5) {
                        uVar3.c(i10);
                        return;
                    } else {
                        e2.s.a(context3, uVar3);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                uVar3.c(i10);
                return;
            case 23:
                i9.c0 c0Var = (i9.c0) this.b;
                i9.w wVar = (i9.w) this.c;
                if (c0Var.a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 24:
                ei.s sVar = (ei.s) this.b;
                fi.f fVar2 = (fi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(eo.R9(fVar2.b.id));
                return;
            case 25:
                ((ei.k0) this.b).s.presentFragment(eo.R9(((fi.f) this.c).b.id));
                return;
            case 26:
                fg.c cVar4 = (fg.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i13 = cVar4.G;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar4.v;
                cVar4.v = null;
                cVar4.H(cVar4.w, location, false);
                return;
            case 27:
                fg.h0 h0Var = (fg.h0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i14 = h0Var.s0;
                ArrayList arrayList = h0Var.K;
                h0Var.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    h0Var.l();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i14).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var.l();
                    return;
                }
                return;
            case 28:
                fg.h0 h0Var2 = (fg.h0) this.b;
                View view = (View) this.c;
                h0Var2.m0 = false;
                h0Var2.o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                fg.h0 h0Var3 = (fg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
