package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ sj(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.getNotificationCenter().k(46, new Object[0]);
                npVar.getNotificationCenter().k(2, 2);
                npVar.getUserConfig().v(true);
                break;
            case 1:
                this.b.o3();
                break;
            case 2:
                np npVar2 = this.b;
                np messagesController = npVar2.getMessagesController();
                npVar2.getNotificationCenter().b(messagesController, ls.U1);
                npVar2.getNotificationCenter().b(messagesController, ls.V1);
                npVar2.getNotificationCenter().b(messagesController, ls.W1);
                npVar2.getNotificationCenter().b(messagesController, ls.Y1);
                npVar2.getNotificationCenter().b(messagesController, ls.Z1);
                npVar2.getNotificationCenter().b(messagesController, 21);
                npVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                np npVar3 = this.b;
                sj sjVar = npVar3.P7;
                g0.r(sjVar);
                long currentTime = npVar3.x4 - npVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.h3(sjVar, currentTime);
                    break;
                }
                break;
            case 4:
                np npVar4 = this.b;
                npVar4.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                npVar4.u5();
                break;
            case 5:
                this.b.X2(true);
                break;
            case 6:
                this.b.M(false);
                break;
            case 7:
                k10 userConfig = this.b.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 8:
                np npVar5 = this.b;
                SharedPreferences sharedPreferences = npVar5.g7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                npVar5.I2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                break;
            case 9:
                this.b.getNotificationsController().m(0);
                break;
            case 10:
                this.b.getNotificationsController().m(1);
                break;
            case 11:
                this.b.getNotificationsController().m(2);
                break;
            case 12:
                this.b.getNotificationCenter().k(ls.E1, new Object[0]);
                break;
            case 13:
                np npVar6 = this.b;
                HashSet hashSet = npVar6.k8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(npVar6.s1(npVar6.c2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        npVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new t4(6, npVar6, arrayList));
                        break;
                    }
                }
                break;
            case 14:
                np npVar7 = this.b;
                npVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = npVar7.v8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.r8) pair.first).a);
                    if (pair2 == null) {
                        long j3 = ((di.r8) pair.first).a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j3);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.r8) pair.first).b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair4 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    HashSet hashSet3 = (HashSet) pair4.first;
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = npVar7.l1(j10);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z10;
                    npVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 15:
                this.b.getNotificationCenter().k(ls.S3, new Object[0]);
                break;
            case 16:
                this.b.getNotificationCenter().k(ls.b3, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 19:
                np npVar8 = this.b;
                npVar8.C2 = 0L;
                npVar8.G2 = null;
                npVar8.w2 = npVar8.getConnectionsManager().getCurrentTime() + 3600;
                np.g1().edit().putLong("proxy_dialog", npVar8.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", npVar8.w2).commit();
                break;
            case 20:
                np npVar9 = this.b;
                npVar9.getMessagesStorage().t1(false);
                g0.g3(new sj(npVar9, 29));
                break;
            case 21:
                this.b.o3();
                break;
            case 22:
                np npVar10 = this.b;
                TLRPC.Dialog dialog = npVar10.A2;
                if (dialog != null) {
                    long j11 = dialog.id;
                    if (j11 < 0) {
                        TLRPC.Chat O0 = npVar10.O0(Long.valueOf(-j11));
                        if (v3.r0(O0) || O0.restricted) {
                            npVar10.n4(npVar10.A2);
                        }
                    } else {
                        npVar10.n4(dialog);
                    }
                    npVar10.A2 = null;
                    npVar10.f5(null);
                    npVar10.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 23:
                this.b.o3();
                break;
            case 24:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 25:
                this.b.h2 = false;
                break;
            case 26:
                this.b.I(true);
                break;
            case 27:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 28:
                this.b.N(true);
                break;
            default:
                np npVar11 = this.b;
                npVar11.getMessagesController().f5(null);
                npVar11.getNotificationCenter().k(3, Boolean.TRUE);
                break;
        }
    }
}
