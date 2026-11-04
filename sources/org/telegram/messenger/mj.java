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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ mj(hp hpVar, int i3) {
        this.a = i3;
        this.b = hpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 0;
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                hpVar.getNotificationCenter().k(46, new Object[0]);
                hpVar.getNotificationCenter().k(2, 2);
                hpVar.getUserConfig().v(true);
                break;
            case 1:
                this.b.h3();
                break;
            case 2:
                hp hpVar2 = this.b;
                hp messagesController = hpVar2.getMessagesController();
                hpVar2.getNotificationCenter().b(messagesController, hs.U1);
                hpVar2.getNotificationCenter().b(messagesController, hs.V1);
                hpVar2.getNotificationCenter().b(messagesController, hs.W1);
                hpVar2.getNotificationCenter().b(messagesController, hs.Y1);
                hpVar2.getNotificationCenter().b(messagesController, hs.Z1);
                hpVar2.getNotificationCenter().b(messagesController, 21);
                hpVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                hp hpVar3 = this.b;
                mj mjVar = hpVar3.J7;
                g0.r(mjVar);
                long currentTime = hpVar3.u4 - hpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(mjVar, currentTime);
                    break;
                }
                break;
            case 4:
                this.b.k2 = false;
                break;
            case 5:
                this.b.R2(true);
                break;
            case 6:
                this.b.M(false);
                break;
            case 7:
                h10 userConfig = this.b.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 8:
                hp hpVar4 = this.b;
                SharedPreferences sharedPreferences = hpVar4.d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                hpVar4.G2 = sharedPreferences.getInt("nextTosCheckTime", 0);
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
                this.b.getNotificationCenter().k(hs.E1, new Object[0]);
                break;
            case 13:
                hp hpVar5 = this.b;
                HashSet hashSet = hpVar5.e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(hpVar5.q1(hpVar5.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        hpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new s4(6, hpVar5, arrayList));
                        break;
                    }
                }
                break;
            case 14:
                hp hpVar6 = this.b;
                hpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = hpVar6.p8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((ci.x8) pair.first).a);
                    if (pair2 == null) {
                        long j10 = ((ci.x8) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j10);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((ci.x8) pair.first).b));
                }
                hashSet2.clear();
                while (i3 < hVar.m()) {
                    Pair pair3 = (Pair) hVar.n(i3);
                    long j11 = hVar.j(i3);
                    HashSet hashSet3 = (HashSet) pair3.first;
                    boolean z10 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = hpVar6.j1(j11);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z10;
                    hpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                    i3++;
                }
                break;
            case 15:
                this.b.getNotificationCenter().k(hs.P3, new Object[0]);
                break;
            case 16:
                this.b.getNotificationCenter().k(hs.Z2, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 19:
                hp hpVar7 = this.b;
                hpVar7.A2 = 0L;
                hpVar7.E2 = null;
                hpVar7.u2 = hpVar7.getConnectionsManager().getCurrentTime() + 3600;
                hp.e1().edit().putLong("proxy_dialog", hpVar7.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", hpVar7.u2).commit();
                break;
            case 20:
                hp hpVar8 = this.b;
                hpVar8.getMessagesStorage().t1(false);
                g0.h3(new in(hpVar8, i3));
                break;
            case 21:
                this.b.h3();
                break;
            case 22:
                this.b.h3();
                break;
            case 23:
                hp hpVar9 = this.b;
                TLRPC.Dialog dialog = hpVar9.y2;
                if (dialog != null) {
                    long j12 = dialog.id;
                    if (j12 < 0) {
                        TLRPC.Chat M0 = hpVar9.M0(Long.valueOf(-j12));
                        if (t3.r0(M0) || M0.restricted) {
                            hpVar9.f4(hpVar9.y2);
                        }
                    } else {
                        hpVar9.f4(dialog);
                    }
                    hpVar9.y2 = null;
                    hpVar9.T4(null);
                    hpVar9.getNotificationCenter().k(3, new Object[0]);
                    break;
                }
                break;
            case 24:
                this.b.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 25:
                this.b.f2 = false;
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
