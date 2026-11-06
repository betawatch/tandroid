package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m10 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final g10 f = new g10(this, 0);

    public m10(int i7) {
        this.a = i7;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        yr.a0(i7).a.c(new g10(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        qs.f(this.a).k(qs.d3, new Object[0]);
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
            l10 l10Var = (l10) arrayList.get(i7);
            if (l10Var != null && !l10Var.a && l10Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new l10(this, tL_updateNewAuthorization));
        }
        qs.f(this.a).k(qs.d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                arrayList.add(new l10(this, tL_updateNewBotConnection));
                qs.f(this.a).k(qs.d3, new Object[0]);
                e();
                d();
                return;
            }
            l10 l10Var = (l10) arrayList.get(i7);
            if (l10Var != null && l10Var.a && l10Var.c == tL_updateNewBotConnection.bot_id) {
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
            yr.a0(this.a).a.c(new g10(this, 2));
        }
    }

    public final void e() {
        g10 g10Var = this.f;
        g0.r(g10Var);
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
            m10 m10Var = ((l10) obj).i;
            j3 = Math.min(j3, (ConnectionsManager.getInstance(m10Var.a).getCurrentTime() + qp.s1(m10Var.a).n4) - r8.d);
        }
        if (j3 == Long.MAX_VALUE) {
            return;
        }
        g0.i3(g10Var, Math.max(0L, j3 * 1000));
    }

    public final void f(final boolean z9, ArrayList arrayList, c20 c20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        c20[] c20VarArr = new c20[arrayList2.size()];
        for (final int i7 = 0; i7 < arrayList2.size(); i7++) {
            final l10 l10Var = (l10) arrayList2.get(i7);
            c20VarArr[i7] = new c20() { // from class: org.telegram.messenger.h10
                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    final i10 i10Var = new i10(i7, (Runnable) obj, zArr);
                    boolean z10 = z9;
                    final l10 l10Var2 = l10Var;
                    if (z10) {
                        m10 m10Var = l10Var2.i;
                        if (l10Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = qp.s1(m10Var.a).o1(l10Var2.c);
                            ConnectionsManager.getInstance(m10Var.a).sendRequestTyped(confirmbotconnection, new x3(7, l10Var2, i10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = l10Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i10 = 2;
                            ConnectionsManager.getInstance(m10Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.j10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i10) {
                                        case 0:
                                            l10 l10Var3 = l10Var2;
                                            l10Var3.getClass();
                                            g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                            break;
                                        case 1:
                                            l10 l10Var4 = l10Var2;
                                            l10Var4.getClass();
                                            g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            l10 l10Var5 = l10Var2;
                                            l10Var5.getClass();
                                            g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    m10 m10Var2 = l10Var2.i;
                    if (!l10Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = l10Var2.b;
                        final int i11 = 1;
                        ConnectionsManager.getInstance(m10Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.j10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i11) {
                                    case 0:
                                        l10 l10Var3 = l10Var2;
                                        l10Var3.getClass();
                                        g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                        break;
                                    case 1:
                                        l10 l10Var4 = l10Var2;
                                        l10Var4.getClass();
                                        g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        l10 l10Var5 = l10Var2;
                                        l10Var5.getClass();
                                        g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = qp.s1(m10Var2.a).o1(l10Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i12 = 0;
                    ConnectionsManager.getInstance(m10Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.j10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    l10 l10Var3 = l10Var2;
                                    l10Var3.getClass();
                                    g0.h3(new k10(l10Var3, tLObject, i10Var, tL_error));
                                    break;
                                case 1:
                                    l10 l10Var4 = l10Var2;
                                    l10Var4.getClass();
                                    g0.h3(new k10(l10Var4, i10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    l10 l10Var5 = l10Var2;
                                    l10Var5.getClass();
                                    g0.h3(new k10(l10Var5, i10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new ln(this, zArr, arrayList2, c20Var, z9, 6), c20VarArr);
        if (z9) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                hashSet.add(Long.valueOf(((l10) arrayList2.get(i10)).b));
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((l10) arrayList3.get(i11)).b))) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            qs.f(this.a).k(qs.d3, new Object[0]);
            e();
        }
    }
}
