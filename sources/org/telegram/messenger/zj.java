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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ zj(vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f3();
                break;
            case 1:
                vp vpVar = this.b;
                vpVar.getNotificationCenter().k(46, new Object[0]);
                vpVar.getNotificationCenter().k(2, 2);
                vpVar.getUserConfig().v(true);
                break;
            case 2:
                vp vpVar2 = this.b;
                vp messagesController = vpVar2.getMessagesController();
                vpVar2.getNotificationCenter().b(messagesController, zs.U1);
                vpVar2.getNotificationCenter().b(messagesController, zs.V1);
                vpVar2.getNotificationCenter().b(messagesController, zs.W1);
                vpVar2.getNotificationCenter().b(messagesController, zs.Y1);
                vpVar2.getNotificationCenter().b(messagesController, zs.Z1);
                vpVar2.getNotificationCenter().b(messagesController, 21);
                vpVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                vp vpVar3 = this.b;
                zj zjVar = vpVar3.K7;
                i0.r(zjVar);
                long currentTime = vpVar3.v4 - vpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    i0.h3(zjVar, currentTime);
                    break;
                }
                break;
            case 4:
                this.b.P2(true);
                break;
            case 5:
                this.b.M(false);
                break;
            case 6:
                d20 userConfig = this.b.getUserConfig();
                if ((userConfig.k0 != null || userConfig.j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.l0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 7:
                vp vpVar4 = this.b;
                SharedPreferences sharedPreferences = vpVar4.e7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                vpVar4.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                break;
            case 8:
                this.b.getNotificationCenter().k(zs.E1, new Object[0]);
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
                vp vpVar5 = this.b;
                HashSet hashSet = vpVar5.f8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l4 = (Long) it.next();
                        l4.getClass();
                        getrequirementstocontact.id.add(vpVar5.p1(vpVar5.Z1(l4)));
                        arrayList.add(l4);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        vpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new v4(6, vpVar5, arrayList));
                        break;
                    }
                }
                break;
            case 13:
                vp vpVar6 = this.b;
                vpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = vpVar6.q8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((rh.x5) pair.first).a);
                    if (pair2 == null) {
                        long j10 = ((rh.x5) pair.first).a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j10);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((rh.x5) pair.first).b));
                }
                hashSet2.clear();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    Pair pair4 = (Pair) hVar.n(i10);
                    long j11 = hVar.j(i10);
                    HashSet hashSet3 = (HashSet) pair4.first;
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = vpVar6.i1(j11);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z10;
                    vpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 14:
                this.b.getNotificationCenter().k(zs.P3, new Object[0]);
                break;
            case 15:
                this.b.getNotificationCenter().k(zs.Z2, new Object[0]);
                break;
            case 16:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 17:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 18:
                vp vpVar7 = this.b;
                vpVar7.z2 = 0L;
                vpVar7.D2 = null;
                vpVar7.t2 = vpVar7.getConnectionsManager().getCurrentTime() + 3600;
                vp.d1().edit().putLong("proxy_dialog", vpVar7.z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", vpVar7.t2).commit();
                break;
            case 19:
                vp vpVar8 = this.b;
                vpVar8.getMessagesStorage().t1(false);
                i0.g3(new zj(vpVar8, 29));
                break;
            case 20:
                this.b.f3();
                break;
            case 21:
                vp vpVar9 = this.b;
                TLRPC.Dialog dialog = vpVar9.x2;
                if (dialog != null) {
                    long j12 = dialog.id;
                    if (j12 < 0) {
                        TLRPC.Chat L0 = vpVar9.L0(Long.valueOf(-j12));
                        if (w3.r0(L0) || L0.restricted) {
                            vpVar9.c4(vpVar9.x2);
                        }
                    } else {
                        vpVar9.c4(dialog);
                    }
                    vpVar9.x2 = null;
                    vpVar9.Q4(null);
                    vpVar9.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 22:
                this.b.f3();
                break;
            case 23:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 24:
                this.b.e2 = false;
                break;
            case 25:
                this.b.N(true);
                break;
            case 26:
                this.b.I(true);
                break;
            case 27:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 28:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            default:
                vp vpVar10 = this.b;
                vpVar10.getMessagesController().Q4(null);
                vpVar10.getNotificationCenter().k(3, Boolean.TRUE);
                break;
        }
    }
}
