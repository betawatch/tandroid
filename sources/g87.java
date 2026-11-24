// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;

    public /* synthetic */ g87(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                nm7.f(oc7Var.currentAccount).k(nm7.a3, new Object[0]);
                break;
            case 1:
                jb6.D0().j(oc7Var.currentAccount);
                break;
            case 2:
                oc7Var.c2 = false;
                break;
            case 3:
                h71 h71Var = oc7Var.w4;
                if (h71Var != null) {
                    h71Var.a(Boolean.TRUE);
                    oc7Var.w4 = null;
                    break;
                }
                break;
            case 4:
                oc7Var.getNotificationCenter().k(nm7.O2, new Object[0]);
                break;
            case 5:
                h71 h71Var2 = oc7Var.w4;
                if (h71Var2 != null) {
                    h71Var2.a(Boolean.TRUE);
                    oc7Var.w4 = null;
                    break;
                }
                break;
            case 6:
                h71 h71Var3 = oc7Var.w4;
                if (h71Var3 != null) {
                    h71Var3.a(Boolean.FALSE);
                    oc7Var.w4 = null;
                    break;
                }
                break;
            case 7:
                oc7Var.l3();
                break;
            case 8:
                oc7 messagesController = oc7Var.getMessagesController();
                oc7Var.getNotificationCenter().a(messagesController, nm7.U1);
                oc7Var.getNotificationCenter().a(messagesController, nm7.V1);
                oc7Var.getNotificationCenter().a(messagesController, nm7.W1);
                oc7Var.getNotificationCenter().a(messagesController, nm7.Y1);
                oc7Var.getNotificationCenter().a(messagesController, nm7.Z1);
                oc7Var.getNotificationCenter().a(messagesController, 21);
                oc7Var.getNotificationCenter().a(messagesController, 49);
                break;
            case 9:
                g87 g87Var = oc7Var.y4;
                gm.r(g87Var);
                long currentTime = oc7Var.H3 - oc7Var.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    gm.d3(g87Var, currentTime);
                    break;
                }
                break;
            case 10:
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
                oc7Var.q5();
                break;
            case 11:
                a.w();
                ConnectionsManager connectionsManager = oc7Var.getConnectionsManager();
                connectionsManager.setPushConnectionEnabled(connectionsManager.isPushConnectionEnabled());
                break;
            case 12:
                oc7Var.getNotificationsController().g(0);
                break;
            case 13:
                oc7Var.getNotificationsController().g(1);
                break;
            case 14:
                oc7Var.getNotificationsController().g(2);
                break;
            case 15:
                z8c userConfig = oc7Var.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.t();
                    break;
                }
                break;
            case 16:
                if (oc7Var.l4.s0.f) {
                    ConcurrentHashMap concurrentHashMap = wxc.a;
                    gm.c3(new e1b((byte) 20));
                    break;
                }
                break;
            case 17:
                oc7Var.W2(true);
                break;
            case 18:
                oc7Var.I(false);
                break;
            case 19:
                SharedPreferences sharedPreferences = oc7Var.W3;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                oc7Var.y2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                break;
            case 20:
                oc7Var.p(null, null, null);
                break;
            case 21:
                oc7Var.getNotificationCenter().k(nm7.E1, new Object[0]);
                break;
            case 22:
                HashSet hashSet = oc7Var.U4;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l = (Long) it.next();
                        l.getClass();
                        getrequirementstocontact.id.add(oc7Var.p1(oc7Var.W1(l)));
                        arrayList.add(l);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        oc7Var.getConnectionsManager().sendRequest(getrequirementstocontact, new cx3(oc7Var, arrayList, (byte) 28));
                        break;
                    }
                }
                break;
            case 23:
                vh6 vh6Var = new vh6();
                HashSet hashSet2 = oc7Var.f5;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) vh6Var.f(((cva) pair.first).a);
                    if (pair2 == null) {
                        long j = ((cva) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        vh6Var.k(pair2, j);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((cva) pair.first).b));
                }
                hashSet2.clear();
                for (int i = 0; i < vh6Var.m(); i++) {
                    Pair pair3 = (Pair) vh6Var.n(i);
                    long j2 = vh6Var.j(i);
                    HashSet hashSet3 = (HashSet) pair3.first;
                    boolean z = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = oc7Var.i1(j2);
                    tL_reportMessagesDelivery.id.addAll(hashSet3);
                    tL_reportMessagesDelivery.push = z;
                    oc7Var.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                break;
            case 24:
                oc7Var.getNotificationCenter().k(nm7.S3, new Object[0]);
                break;
            case 25:
                oc7Var.getNotificationCenter().k(nm7.b3, new Object[0]);
                break;
            case 26:
                oc7Var.s2 = 0L;
                oc7Var.w2 = null;
                oc7Var.m2 = oc7Var.getConnectionsManager().getCurrentTime() + 3600;
                oc7.d1().edit().putLong("proxy_dialog", oc7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", oc7Var.m2).commit();
                break;
            case 27:
                oc7Var.getNotificationCenter().k(2, 4);
                break;
            case 28:
                oc7Var.getMessagesStorage().q1(false);
                gm.c3(new ba7(oc7Var, (byte) 7));
                break;
            default:
                oc7Var.l3();
                break;
        }
    }
}
