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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ vj(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
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
                vj vjVar = qpVar3.J7;
                g0.r(vjVar);
                long currentTime = qpVar3.u4 - qpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(vjVar, currentTime);
                    break;
                }
                break;
            case 4:
                this.b.j2 = false;
                break;
            case 5:
                qp qpVar4 = this.b;
                qpVar4.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                qpVar4.i5();
                break;
            case 6:
                this.b.R2(true);
                break;
            case 7:
                this.b.M(false);
                break;
            case 8:
                p10 userConfig = this.b.getUserConfig();
                if ((userConfig.k0 != null || userConfig.j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.l0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 9:
                qp qpVar5 = this.b;
                SharedPreferences sharedPreferences = qpVar5.d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                qpVar5.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
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
                this.b.getNotificationCenter().k(qs.E1, new Object[0]);
                break;
            case 14:
                qp qpVar6 = this.b;
                HashSet hashSet = qpVar6.e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(qpVar6.q1(qpVar6.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        qpVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new r4(6, qpVar6, arrayList));
                        break;
                    }
                }
                break;
            case 15:
                qp qpVar7 = this.b;
                qpVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = qpVar7.p8;
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
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    Pair pair3 = (Pair) hVar.n(i10);
                    long j10 = hVar.j(i10);
                    HashSet hashSet3 = (HashSet) pair3.first;
                    boolean z9 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = qpVar7.j1(j10);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z9;
                    qpVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 16:
                this.b.getNotificationCenter().k(qs.P3, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(qs.Z2, new Object[0]);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 19:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 20:
                qp qpVar8 = this.b;
                qpVar8.z2 = 0L;
                qpVar8.D2 = null;
                qpVar8.t2 = qpVar8.getConnectionsManager().getCurrentTime() + 3600;
                qp.e1().edit().putLong("proxy_dialog", qpVar8.z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", qpVar8.t2).commit();
                break;
            case 21:
                qp qpVar9 = this.b;
                qpVar9.getMessagesStorage().t1(false);
                g0.h3(new sn(qpVar9, i7));
                break;
            case 22:
                this.b.h3();
                break;
            case 23:
                this.b.h3();
                break;
            case 24:
                qp qpVar10 = this.b;
                TLRPC.Dialog dialog = qpVar10.x2;
                if (dialog != null) {
                    long j11 = dialog.id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = qpVar10.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            qpVar10.f4(qpVar10.x2);
                        }
                    } else {
                        qpVar10.f4(dialog);
                    }
                    qpVar10.x2 = null;
                    qpVar10.T4(null);
                    qpVar10.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 25:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 26:
                this.b.e2 = false;
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
