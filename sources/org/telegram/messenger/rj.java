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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ rj(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.getNotificationCenter().k(46, new Object[0]);
                mpVar.getNotificationCenter().k(2, 2);
                mpVar.getUserConfig().v(true);
                break;
            case 1:
                this.b.o3();
                break;
            case 2:
                mp mpVar2 = this.b;
                mp messagesController = mpVar2.getMessagesController();
                mpVar2.getNotificationCenter().b(messagesController, ks.U1);
                mpVar2.getNotificationCenter().b(messagesController, ks.V1);
                mpVar2.getNotificationCenter().b(messagesController, ks.W1);
                mpVar2.getNotificationCenter().b(messagesController, ks.Y1);
                mpVar2.getNotificationCenter().b(messagesController, ks.Z1);
                mpVar2.getNotificationCenter().b(messagesController, 21);
                mpVar2.getNotificationCenter().b(messagesController, 48);
                break;
            case 3:
                mp mpVar3 = this.b;
                rj rjVar = mpVar3.P7;
                g0.r(rjVar);
                long currentTime = mpVar3.x4 - mpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.h3(rjVar, currentTime);
                    break;
                }
                break;
            case 4:
                mp mpVar4 = this.b;
                mpVar4.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                mpVar4.u5();
                break;
            case 5:
                this.b.X2(true);
                break;
            case 6:
                this.b.M(false);
                break;
            case 7:
                j10 userConfig = this.b.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    break;
                }
                break;
            case 8:
                mp mpVar5 = this.b;
                SharedPreferences sharedPreferences = mpVar5.g7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                mpVar5.I2 = sharedPreferences.getInt("nextTosCheckTime", 0);
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
                this.b.getNotificationCenter().k(ks.E1, new Object[0]);
                break;
            case 13:
                mp mpVar6 = this.b;
                HashSet hashSet = mpVar6.k8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.id.add(mpVar6.s1(mpVar6.c2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        mpVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new t4(6, mpVar6, arrayList));
                        break;
                    }
                }
                break;
            case 14:
                mp mpVar7 = this.b;
                mpVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = mpVar7.v8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.q8) pair.first).a);
                    if (pair2 == null) {
                        long j3 = ((di.q8) pair.first).a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j3);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.q8) pair.first).b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair4 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    HashSet hashSet3 = (HashSet) pair4.first;
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = mpVar7.l1(j10);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z10;
                    mpVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 15:
                this.b.getNotificationCenter().k(ks.R3, new Object[0]);
                break;
            case 16:
                this.b.getNotificationCenter().k(ks.b3, new Object[0]);
                break;
            case 17:
                this.b.getNotificationCenter().k(2, 4);
                break;
            case 18:
                this.b.getNotificationCenter().k(2, 64);
                break;
            case 19:
                mp mpVar8 = this.b;
                mpVar8.C2 = 0L;
                mpVar8.G2 = null;
                mpVar8.w2 = mpVar8.getConnectionsManager().getCurrentTime() + 3600;
                mp.g1().edit().putLong("proxy_dialog", mpVar8.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", mpVar8.w2).commit();
                break;
            case 20:
                mp mpVar9 = this.b;
                mpVar9.getMessagesStorage().t1(false);
                g0.g3(new rj(mpVar9, 29));
                break;
            case 21:
                this.b.o3();
                break;
            case 22:
                mp mpVar10 = this.b;
                TLRPC.Dialog dialog = mpVar10.A2;
                if (dialog != null) {
                    long j11 = dialog.id;
                    if (j11 < 0) {
                        TLRPC.Chat O0 = mpVar10.O0(Long.valueOf(-j11));
                        if (v3.r0(O0) || O0.restricted) {
                            mpVar10.n4(mpVar10.A2);
                        }
                    } else {
                        mpVar10.n4(dialog);
                    }
                    mpVar10.A2 = null;
                    mpVar10.f5(null);
                    mpVar10.getNotificationCenter().k(3, new Object[0]);
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
                mp mpVar11 = this.b;
                mpVar11.getMessagesController().f5(null);
                mpVar11.getNotificationCenter().k(3, Boolean.TRUE);
                break;
        }
    }
}
