package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b20 {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final v10 f = new v10(this, 0);

    public b20(int i10) {
        this.a = i10;
        if (this.c || this.d) {
            return;
        }
        this.d = true;
        is.a0(i10).a.c(new v10(this, 1));
    }

    public final void a() {
        this.b.clear();
        d();
        at.f(this.a).k(at.d3, new Object[0]);
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
            a20 a20Var = (a20) arrayList.get(i10);
            if (a20Var != null && !a20Var.a && a20Var.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new a20(this, tL_updateNewAuthorization));
        }
        at.f(this.a).k(at.d3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                arrayList.add(new a20(this, tL_updateNewBotConnection));
                at.f(this.a).k(at.d3, new Object[0]);
                e();
                d();
                return;
            }
            a20 a20Var = (a20) arrayList.get(i10);
            if (a20Var != null && a20Var.a && a20Var.c == tL_updateNewBotConnection.bot_id) {
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
            is.a0(this.a).a.c(new v10(this, 2));
        }
    }

    public final void e() {
        v10 v10Var = this.f;
        i0.r(v10Var);
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
            b20 b20Var = ((a20) obj).i;
            j10 = Math.min(j10, (ConnectionsManager.getInstance(b20Var.a).getCurrentTime() + wp.r1(b20Var.a).o4) - r8.d);
        }
        if (j10 == Long.MAX_VALUE) {
            return;
        }
        i0.h3(v10Var, Math.max(0L, j10 * 1000));
    }

    public final void f(final boolean z10, ArrayList arrayList, r20 r20Var) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        r20[] r20VarArr = new r20[arrayList2.size()];
        for (final int i10 = 0; i10 < arrayList2.size(); i10++) {
            final a20 a20Var = (a20) arrayList2.get(i10);
            r20VarArr[i10] = new r20() { // from class: org.telegram.messenger.w10
                @Override // org.telegram.messenger.r20
                public final void a(Object obj) {
                    final x10 x10Var = new x10(i10, (Runnable) obj, zArr);
                    boolean z11 = z10;
                    final a20 a20Var2 = a20Var;
                    if (z11) {
                        b20 b20Var = a20Var2.i;
                        if (a20Var2.a) {
                            TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                            confirmbotconnection.bot_id = wp.r1(b20Var.a).n1(a20Var2.c);
                            ConnectionsManager.getInstance(b20Var.a).sendRequestTyped(confirmbotconnection, new a4(6, a20Var2, x10Var));
                            return;
                        } else {
                            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                            changeauthorizationsettings.hash = a20Var2.b;
                            changeauthorizationsettings.confirmed = true;
                            final int i11 = 2;
                            ConnectionsManager.getInstance(b20Var.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: org.telegram.messenger.y10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i11) {
                                        case 0:
                                            a20 a20Var3 = a20Var2;
                                            a20Var3.getClass();
                                            i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                            break;
                                        case 1:
                                            a20 a20Var4 = a20Var2;
                                            a20Var4.getClass();
                                            i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                            break;
                                        default:
                                            a20 a20Var5 = a20Var2;
                                            a20Var5.getClass();
                                            i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    b20 b20Var2 = a20Var2.i;
                    if (!a20Var2.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = a20Var2.b;
                        final int i12 = 1;
                        ConnectionsManager.getInstance(b20Var2.a).sendRequest(resetauthorization, new RequestDelegate() { // from class: org.telegram.messenger.y10
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i12) {
                                    case 0:
                                        a20 a20Var3 = a20Var2;
                                        a20Var3.getClass();
                                        i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                        break;
                                    case 1:
                                        a20 a20Var4 = a20Var2;
                                        a20Var4.getClass();
                                        i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                        break;
                                    default:
                                        a20 a20Var5 = a20Var2;
                                        a20Var5.getClass();
                                        i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = wp.r1(b20Var2.a).n1(a20Var2.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    final int i13 = 0;
                    ConnectionsManager.getInstance(b20Var2.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: org.telegram.messenger.y10
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    a20 a20Var3 = a20Var2;
                                    a20Var3.getClass();
                                    i0.g3(new z10(a20Var3, tLObject, x10Var, tL_error));
                                    break;
                                case 1:
                                    a20 a20Var4 = a20Var2;
                                    a20Var4.getClass();
                                    i0.g3(new z10(a20Var4, x10Var, tLObject, tL_error, 2));
                                    break;
                                default:
                                    a20 a20Var5 = a20Var2;
                                    a20Var5.getClass();
                                    i0.g3(new z10(a20Var5, x10Var, tLObject, tL_error, 0));
                                    break;
                            }
                        }
                    });
                }
            };
        }
        Utilities.B(new sn(this, zArr, arrayList2, z10, r20Var, 6), r20VarArr);
        if (z10) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                hashSet.add(Long.valueOf(((a20) arrayList2.get(i11)).b));
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((a20) arrayList3.get(i12)).b))) {
                    arrayList3.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            d();
            at.f(this.a).k(at.d3, new Object[0]);
            e();
        }
    }
}
