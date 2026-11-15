package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j10 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final d10 f = new d10(this, 0);

    public j10(int i7) {
        this.a = i7;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        vr.a0(i7).a.c(new d10(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        ns.f(this.a).k(ns.d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 >= arrayList.size()) {
                break;
            }
            i10 i10Var = (i10) arrayList.get(i7);
            if (i10Var != null && !i10Var.a && i10Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new i10(this, tL_updateNewAuthorization));
        }
        ns.f(this.a).k(ns.d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                arrayList.add(new i10(this, tL_updateNewBotConnection));
                ns.f(this.a).k(ns.d3, new Object[0]);
                e();
                d();
                return;
            }
            i10 i10Var = (i10) arrayList.get(i7);
            if (i10Var != null && i10Var.a && i10Var.c == tL_updateNewBotConnection.bot_id) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final void d() {
        if (this.g) {
            return;
        }
        if (this.d) {
            this.e = true;
        } else {
            this.g = true;
            vr.a0(this.a).a.c(new d10(this, 2));
        }
    }

    public final void e() {
        d10 d10Var = this.f;
        g0.r(d10Var);
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            j10 j10Var = ((i10) obj).i;
            j3 = Math.min(j3, (ConnectionsManager.getInstance(j10Var.a).getCurrentTime() + np.s1(j10Var.a).o4) - r8.d);
        }
        if (j3 == Long.MAX_VALUE) {
            return;
        }
        g0.i3(d10Var, Math.max(0L, j3 * 1000));
    }

    public final void f(final boolean z10, ArrayList arrayList, z10 z10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        z10[] z10VarArr = new z10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final i10 i10Var = (i10) arrayList2.get(i7);
            z10VarArr[i7] = new z10() { // from class: org.telegram.messenger.e10
                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    final f10 f10Var = new f10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final i10 i10Var2 = i10Var;
                    if (z11) {
                        j10 j10Var = i10Var2.i;
                        if (i10Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = np.s1(j10Var.a).o1(i10Var2.c);
                            ConnectionsManager.getInstance(j10Var.a).sendRequestTyped(confirmbotconnection, new x3(7, i10Var2, f10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = i10Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i10 = 2;
                            ConnectionsManager.getInstance(j10Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.g10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i10) {
                                        case 0:
                                            i10 i10Var3 = i10Var2;
                                            i10Var3.getClass();
                                            g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                            break;
                                        case 1:
                                            i10 i10Var4 = i10Var2;
                                            i10Var4.getClass();
                                            g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            i10 i10Var5 = i10Var2;
                                            i10Var5.getClass();
                                            g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    j10 j10Var2 = i10Var2.i;
                    if (!i10Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = i10Var2.b;
                        final int i11 = 1;
                        ConnectionsManager.getInstance(j10Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.g10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i11) {
                                    case 0:
                                        i10 i10Var3 = i10Var2;
                                        i10Var3.getClass();
                                        g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                        break;
                                    case 1:
                                        i10 i10Var4 = i10Var2;
                                        i10Var4.getClass();
                                        g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        i10 i10Var5 = i10Var2;
                                        i10Var5.getClass();
                                        g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = np.s1(j10Var2.a).o1(i10Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i12 = 0;
                    ConnectionsManager.getInstance(j10Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.g10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    i10 i10Var3 = i10Var2;
                                    i10Var3.getClass();
                                    g0.h3(new h10(i10Var3, tLObject, f10Var, tL_error));
                                    break;
                                case 1:
                                    i10 i10Var4 = i10Var2;
                                    i10Var4.getClass();
                                    g0.h3(new h10(i10Var4, f10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    i10 i10Var5 = i10Var2;
                                    i10Var5.getClass();
                                    g0.h3(new h10(i10Var5, f10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new in(this, zArr, arrayList2, z10Var, z10, 6), z10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((i10) arrayList2.get(i10)).b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((i10) arrayList3.get(i11)).b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            ns.f(this.a).k(ns.d3, new Object[0]);
            e();
        }
    }
}
