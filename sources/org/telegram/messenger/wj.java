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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ wj(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                qpVar.getNotificationCenter().k(46, new Object[0]);
                qpVar.getNotificationCenter().k(2, 2);
                qpVar.getUserConfig().v(true);
                break;
            case 1:
                this.b.h3();
                break;
            case 2:
                qp qpVar2 = this.b;
                qp messagesController = qpVar2.getMessagesController();
                qpVar2.getNotificationCenter().b(messagesController, qs.U1);
                qpVar2.getNotificationCenter().b(messagesController, qs.V1);
                qpVar2.getNotificationCenter().b(messagesController, qs.W1);
                qpVar2.getNotificationCenter().b(messagesController, qs.Y1);
                qpVar2.getNotificationCenter().b(messagesController, qs.Z1);
                qpVar2.getNotificationCenter().b(messagesController, 21);
                qpVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                qp qpVar3 = this.b;
                wj wjVar = qpVar3.J7;
                g0.r(wjVar);
                long currentTime = qpVar3.u4 - qpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(wjVar, currentTime);
                    break;
                }
                break;
            case 4:
                this.b.j2 = false;
                break;
            case 5:
                this.b.R2(true);
                break;
            case 6:
                this.b.M(false);
                break;
            case 7:
                p10 userConfig = this.b.getUserConfig();
                if ((userConfig.k0 != null || userConfig.j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.l0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 8:
                qp qpVar4 = this.b;
                SharedPreferences sharedPreferences = qpVar4.d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                qpVar4.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
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
                this.b.getNotificationCenter().k(qs.E1, new Object[0]);
                break;
            case 13:
                qp qpVar5 = this.b;
                HashSet hashSet = qpVar5.e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(qpVar5.q1(qpVar5.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        qpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new s4(6, qpVar5, arrayList));
                        break;
                    }
                }
                break;
            case 14:
                qp qpVar6 = this.b;
                qpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = qpVar6.p8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((bi.x9) pair.first).a);
                    if (pair2 == null) {
                        long j3 = ((bi.x9) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j3);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((bi.x9) pair.first).b));
                }
                hashSet2.clear();
                while (i7 < hVar.m()) {
                    Pair pair3 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    HashSet hashSet3 = (HashSet) pair3.first;
                    boolean z9 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = qpVar6.j1(j10);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z9;
                    qpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                    i7++;
                }
                break;
            case 15:
                this.b.getNotificationCenter().k(qs.P3, new Object[0]);
                break;
            case 16:
                this.b.getNotificationCenter().k(qs.Z2, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 19:
                qp qpVar7 = this.b;
                qpVar7.z2 = 0L;
                qpVar7.D2 = null;
                qpVar7.t2 = qpVar7.getConnectionsManager().getCurrentTime() + 3600;
                qp.e1().edit().putLong("proxy_dialog", qpVar7.z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", qpVar7.t2).commit();
                break;
            case 20:
                qp qpVar8 = this.b;
                qpVar8.getMessagesStorage().t1(false);
                g0.h3(new sn(qpVar8, i7));
                break;
            case 21:
                this.b.h3();
                break;
            case 22:
                this.b.h3();
                break;
            case 23:
                qp qpVar9 = this.b;
                TLRPC.Dialog dialog = qpVar9.x2;
                if (dialog != null) {
                    long j11 = dialog.id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = qpVar9.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            qpVar9.f4(qpVar9.x2);
                        }
                    } else {
                        qpVar9.f4(dialog);
                    }
                    qpVar9.x2 = null;
                    qpVar9.T4(null);
                    qpVar9.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 24:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 25:
                this.b.e2 = false;
                break;
            case 26:
                this.b.N(true);
                break;
            case 27:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 28:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            default:
                this.b.I(true);
                break;
        }
    }
}
