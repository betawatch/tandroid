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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ tj(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.getNotificationCenter().k(46, new Object[0]);
                npVar.getNotificationCenter().k(2, 2);
                npVar.getUserConfig().v(true);
                break;
            case 1:
                this.b.h3();
                break;
            case 2:
                np npVar2 = this.b;
                np messagesController = npVar2.getMessagesController();
                npVar2.getNotificationCenter().b(messagesController, ns.U1);
                npVar2.getNotificationCenter().b(messagesController, ns.V1);
                npVar2.getNotificationCenter().b(messagesController, ns.W1);
                npVar2.getNotificationCenter().b(messagesController, ns.Y1);
                npVar2.getNotificationCenter().b(messagesController, ns.Z1);
                npVar2.getNotificationCenter().b(messagesController, 21);
                npVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                np npVar3 = this.b;
                tj tjVar = npVar3.K7;
                g0.r(tjVar);
                long currentTime = npVar3.v4 - npVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(tjVar, currentTime);
                    break;
                }
                break;
            case 4:
                this.b.k2 = false;
                break;
            case 5:
                np npVar4 = this.b;
                npVar4.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                npVar4.j5();
                break;
            case 6:
                this.b.R2(true);
                break;
            case 7:
                this.b.M(false);
                break;
            case 8:
                m10 userConfig = this.b.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 9:
                np npVar5 = this.b;
                SharedPreferences sharedPreferences = npVar5.e7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                npVar5.G2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                break;
            case 10:
                this.b.getNotificationsController().m(0);
                break;
            case 11:
                this.b.getNotificationsController().m(1);
                break;
            case 12:
                this.b.getNotificationsController().m(2);
                break;
            case 13:
                this.b.getNotificationCenter().k(ns.E1, new Object[0]);
                break;
            case 14:
                np npVar6 = this.b;
                HashSet hashSet = npVar6.f8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(npVar6.q1(npVar6.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        npVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new r4(6, npVar6, arrayList));
                        break;
                    }
                }
                break;
            case 15:
                np npVar7 = this.b;
                npVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = npVar7.q8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.n8) pair.first).a);
                    if (pair2 == null) {
                        long j3 = ((di.n8) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j3);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.n8) pair.first).b));
                }
                hashSet2.clear();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    Pair pair3 = (Pair) hVar.n(i10);
                    long j10 = hVar.j(i10);
                    HashSet hashSet3 = (HashSet) pair3.first;
                    boolean z10 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = npVar7.j1(j10);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z10;
                    npVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 16:
                this.b.getNotificationCenter().k(ns.P3, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(ns.Z2, new Object[0]);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 19:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 20:
                np npVar8 = this.b;
                npVar8.A2 = 0L;
                npVar8.E2 = null;
                npVar8.u2 = npVar8.getConnectionsManager().getCurrentTime() + 3600;
                np.e1().edit().putLong("proxy_dialog", npVar8.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", npVar8.u2).commit();
                break;
            case 21:
                np npVar9 = this.b;
                npVar9.getMessagesStorage().t1(false);
                g0.h3(new pn(npVar9, i7));
                break;
            case 22:
                this.b.h3();
                break;
            case 23:
                this.b.h3();
                break;
            case 24:
                np npVar10 = this.b;
                TLRPC.Dialog dialog = npVar10.y2;
                if (dialog != null) {
                    long j11 = dialog.id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = npVar10.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            npVar10.f4(npVar10.y2);
                        }
                    } else {
                        npVar10.f4(dialog);
                    }
                    npVar10.y2 = null;
                    npVar10.U4(null);
                    npVar10.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 25:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 26:
                this.b.f2 = false;
                break;
            case 27:
                this.b.N(true);
                break;
            case 28:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            default:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
