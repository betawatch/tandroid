package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a20 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final u10 f = new u10(this, 0);

    public a20(int i10) {
        this.a = i10;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        hs.a0(i10).a.c(new u10(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        zs.f(this.a).k(zs.d3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            z10 z10Var = (z10) arrayList.get(i10);
            if (z10Var != null && !z10Var.a && z10Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new z10(this, tL_updateNewAuthorization));
        }
        zs.f(this.a).k(zs.d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                arrayList.add(new z10(this, tL_updateNewBotConnection));
                zs.f(this.a).k(zs.d3, new Object[0]);
                e();
                d();
                return;
            }
            z10 z10Var = (z10) arrayList.get(i10);
            if (z10Var != null && z10Var.a && z10Var.c == tL_updateNewBotConnection.bot_id) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
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
            hs.a0(this.a).a.c(new u10(this, 2));
        }
    }

    public final void e() {
        u10 u10Var = this.f;
        i0.r(u10Var);
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a20 a20Var = ((z10) obj).i;
            j10 = Math.min(j10, (ConnectionsManager.getInstance(a20Var.a).getCurrentTime() + vp.r1(a20Var.a).o4) - r8.d);
        }
        if (j10 == Long.MAX_VALUE) {
            return;
        }
        i0.h3(u10Var, Math.max(0L, j10 * 1000));
    }

    public final void f(final boolean z10, ArrayList arrayList, q20 q20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        q20[] q20VarArr = new q20[arrayList2.size()];
        for (final int i10 = 0; i10 < arrayList2.size(); i10++) {
            final z10 z10Var = (z10) arrayList2.get(i10);
            q20VarArr[i10] = new q20() { // from class: org.telegram.messenger.v10
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    final w10 w10Var = new w10(i10, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final z10 z10Var2 = z10Var;
                    if (z11) {
                        a20 a20Var = z10Var2.i;
                        if (z10Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = vp.r1(a20Var.a).n1(z10Var2.c);
                            ConnectionsManager.getInstance(a20Var.a).sendRequestTyped(confirmbotconnection, new a4(6, z10Var2, w10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = z10Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i11 = 2;
                            ConnectionsManager.getInstance(a20Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.x10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i11) {
                                        case 0:
                                            z10 z10Var3 = z10Var2;
                                            z10Var3.getClass();
                                            i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                            break;
                                        case 1:
                                            z10 z10Var4 = z10Var2;
                                            z10Var4.getClass();
                                            i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            z10 z10Var5 = z10Var2;
                                            z10Var5.getClass();
                                            i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    a20 a20Var2 = z10Var2.i;
                    if (!z10Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = z10Var2.b;
                        final int i12 = 1;
                        ConnectionsManager.getInstance(a20Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.x10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i12) {
                                    case 0:
                                        z10 z10Var3 = z10Var2;
                                        z10Var3.getClass();
                                        i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                        break;
                                    case 1:
                                        z10 z10Var4 = z10Var2;
                                        z10Var4.getClass();
                                        i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        z10 z10Var5 = z10Var2;
                                        z10Var5.getClass();
                                        i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = vp.r1(a20Var2.a).n1(z10Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i13 = 0;
                    ConnectionsManager.getInstance(a20Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.x10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    z10 z10Var3 = z10Var2;
                                    z10Var3.getClass();
                                    i0.g3(new y10(z10Var3, tLObject, w10Var, tL_error));
                                    break;
                                case 1:
                                    z10 z10Var4 = z10Var2;
                                    z10Var4.getClass();
                                    i0.g3(new y10(z10Var4, w10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    z10 z10Var5 = z10Var2;
                                    z10Var5.getClass();
                                    i0.g3(new y10(z10Var5, w10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new rn(this, zArr, arrayList2, z10, q20Var, 6), q20VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                hashSet.add(Long.valueOf(((z10) arrayList2.get(i11)).b));
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((z10) arrayList3.get(i12)).b))) {
                    arrayList3.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            zs.f(this.a).k(zs.d3, new Object[0]);
            e();
        }
    }
}
