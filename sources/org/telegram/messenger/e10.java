package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e10 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final y00 f = new y00(this, 0);

    public e10(int i3) {
        this.a = i3;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        qr.a0(i3).a.c(new y00(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        hs.f(this.a).k(hs.d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            d10 d10Var = (d10) arrayList.get(i3);
            if (d10Var != null && !d10Var.a && d10Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new d10(this, tL_updateNewAuthorization));
        }
        hs.f(this.a).k(hs.d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                arrayList.add(new d10(this, tL_updateNewBotConnection));
                hs.f(this.a).k(hs.d3, new Object[0]);
                e();
                d();
                return;
            }
            d10 d10Var = (d10) arrayList.get(i3);
            if (d10Var != null && d10Var.a && d10Var.c == tL_updateNewBotConnection.bot_id) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
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
            qr.a0(this.a).a.c(new y00(this, 2));
        }
    }

    public final void e() {
        y00 y00Var = this.f;
        g0.r(y00Var);
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e10 e10Var = ((d10) obj).i;
            j10 = Math.min(j10, (ConnectionsManager.getInstance(e10Var.a).getCurrentTime() + hp.s1(e10Var.a).n4) - r8.d);
        }
        if (j10 == Long.MAX_VALUE) {
            return;
        }
        g0.i3(y00Var, Math.max(0L, j10 * 1000));
    }

    public final void f(final boolean z10, ArrayList arrayList, u10 u10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        u10[] u10VarArr = new u10[arrayList2.size()];
        for (final int i3 = 0; i3 < arrayList2.size(); i3++) {
            final d10 d10Var = (d10) arrayList2.get(i3);
            u10VarArr[i3] = new u10() { // from class: org.telegram.messenger.z00
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    final a10 a10Var = new a10(i3, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final d10 d10Var2 = d10Var;
                    if (z11) {
                        e10 e10Var = d10Var2.i;
                        if (d10Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = hp.s1(e10Var.a).o1(d10Var2.c);
                            ConnectionsManager.getInstance(e10Var.a).sendRequestTyped(confirmbotconnection, new x3(6, d10Var2, a10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = d10Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i10 = 2;
                            ConnectionsManager.getInstance(e10Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.b10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i10) {
                                        case 0:
                                            d10 d10Var3 = d10Var2;
                                            d10Var3.getClass();
                                            g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                            break;
                                        case 1:
                                            d10 d10Var4 = d10Var2;
                                            d10Var4.getClass();
                                            g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            d10 d10Var5 = d10Var2;
                                            d10Var5.getClass();
                                            g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    e10 e10Var2 = d10Var2.i;
                    if (!d10Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = d10Var2.b;
                        final int i11 = 1;
                        ConnectionsManager.getInstance(e10Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.b10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i11) {
                                    case 0:
                                        d10 d10Var3 = d10Var2;
                                        d10Var3.getClass();
                                        g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                        break;
                                    case 1:
                                        d10 d10Var4 = d10Var2;
                                        d10Var4.getClass();
                                        g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        d10 d10Var5 = d10Var2;
                                        d10Var5.getClass();
                                        g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = hp.s1(e10Var2.a).o1(d10Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i12 = 0;
                    ConnectionsManager.getInstance(e10Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.b10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    d10 d10Var3 = d10Var2;
                                    d10Var3.getClass();
                                    g0.h3(new c10(d10Var3, tLObject, a10Var, tL_error));
                                    break;
                                case 1:
                                    d10 d10Var4 = d10Var2;
                                    d10Var4.getClass();
                                    g0.h3(new c10(d10Var4, a10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    d10 d10Var5 = d10Var2;
                                    d10Var5.getClass();
                                    g0.h3(new c10(d10Var5, a10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new bn(this, zArr, arrayList2, u10Var, z10, 6), u10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((d10) arrayList2.get(i10)).b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((d10) arrayList3.get(i11)).b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            hs.f(this.a).k(hs.d3, new Object[0]);
            e();
        }
    }
}
