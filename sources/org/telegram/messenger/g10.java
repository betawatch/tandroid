package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g10 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final a10 f = new a10(this, 0);

    public g10(int i7) {
        this.a = i7;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        tr.a0(i7).a.c(new a10(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        ks.f(this.a).k(ks.f3, new Object[0]);
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
            f10 f10Var = (f10) arrayList.get(i7);
            if (f10Var != null && !f10Var.a && f10Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new f10(this, tL_updateNewAuthorization));
        }
        ks.f(this.a).k(ks.f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                arrayList.add(new f10(this, tL_updateNewBotConnection));
                ks.f(this.a).k(ks.f3, new Object[0]);
                e();
                d();
                return;
            }
            f10 f10Var = (f10) arrayList.get(i7);
            if (f10Var != null && f10Var.a && f10Var.c == tL_updateNewBotConnection.bot_id) {
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
            tr.a0(this.a).a.c(new a10(this, 2));
        }
    }

    public final void e() {
        a10 a10Var = this.f;
        g0.r(a10Var);
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
            g10 g10Var = ((f10) obj).i;
            j3 = Math.min(j3, (ConnectionsManager.getInstance(g10Var.a).getCurrentTime() + mp.u1(g10Var.a).q4) - r8.d);
        }
        if (j3 == Long.MAX_VALUE) {
            return;
        }
        g0.h3(a10Var, Math.max(0L, j3 * 1000));
    }

    public final void f(final boolean z10, ArrayList arrayList, x10 x10Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        x10[] x10VarArr = new x10[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final f10 f10Var = (f10) arrayList2.get(i7);
            x10VarArr[i7] = new x10() { // from class: org.telegram.messenger.b10
                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    final c10 c10Var = new c10(i7, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final f10 f10Var2 = f10Var;
                    if (z11) {
                        g10 g10Var = f10Var2.i;
                        if (f10Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = mp.u1(g10Var.a).q1(f10Var2.c);
                            ConnectionsManager.getInstance(g10Var.a).sendRequestTyped(confirmbotconnection, new z3(7, f10Var2, c10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = f10Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i10 = 2;
                            ConnectionsManager.getInstance(g10Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.d10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i10) {
                                        case 0:
                                            f10 f10Var3 = f10Var2;
                                            f10Var3.getClass();
                                            g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                            break;
                                        case 1:
                                            f10 f10Var4 = f10Var2;
                                            f10Var4.getClass();
                                            g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            f10 f10Var5 = f10Var2;
                                            f10Var5.getClass();
                                            g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    g10 g10Var2 = f10Var2.i;
                    if (!f10Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = f10Var2.b;
                        final int i11 = 1;
                        ConnectionsManager.getInstance(g10Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.d10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i11) {
                                    case 0:
                                        f10 f10Var3 = f10Var2;
                                        f10Var3.getClass();
                                        g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                        break;
                                    case 1:
                                        f10 f10Var4 = f10Var2;
                                        f10Var4.getClass();
                                        g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        f10 f10Var5 = f10Var2;
                                        f10Var5.getClass();
                                        g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = mp.u1(g10Var2.a).q1(f10Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i12 = 0;
                    ConnectionsManager.getInstance(g10Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.d10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    f10 f10Var3 = f10Var2;
                                    f10Var3.getClass();
                                    g0.g3(new e10(f10Var3, tLObject, c10Var, tL_error));
                                    break;
                                case 1:
                                    f10 f10Var4 = f10Var2;
                                    f10Var4.getClass();
                                    g0.g3(new e10(f10Var4, c10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    f10 f10Var5 = f10Var2;
                                    f10Var5.getClass();
                                    g0.g3(new e10(f10Var5, c10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new in(this, zArr, arrayList2, x10Var, z10, 6), x10VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((f10) arrayList2.get(i10)).b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((f10) arrayList3.get(i11)).b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            ks.f(this.a).k(ks.f3, new Object[0]);
            e();
        }
    }
}
