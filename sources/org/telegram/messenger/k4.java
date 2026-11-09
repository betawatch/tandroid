package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ k4(g5 g5Var, int i7) {
        this.a = i7;
        this.b = g5Var;
    }

    private final void a() {
        g5 g5Var = this.b;
        if (g5Var.e0.isEmpty() && !g5Var.h) {
            g5Var.A(0L, true);
            return;
        }
        synchronized (g5Var.c) {
            g5Var.b = false;
        }
    }

    private final void b() {
        g5 g5Var = this.b;
        synchronized (g5Var.c) {
            g5Var.b = false;
        }
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                AccountManager accountManager = AccountManager.get(t0.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                TLRPC.User f10 = p10.i(i10).f();
                                if (f10 != null) {
                                    if (account.name.equals("" + f10.id)) {
                                        if (i10 == g5Var.currentAccount) {
                                            g5Var.a = account;
                                        }
                                    }
                                }
                                i10++;
                            } else {
                                try {
                                    accountManager.removeAccount(accountsByType[i7], null, null);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (g5Var.getUserConfig().p()) {
                    synchronized (g5Var.c) {
                        try {
                            if (!g5Var.b) {
                                g5Var.b = true;
                                Utilities.d.c(new k4(g5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (g5Var.a == null) {
                        try {
                            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
                            g5Var.a = account2;
                            accountManager.addAccountExplicitly(account2, "", null);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                g5 g5Var2 = this.b;
                if (r2.a) {
                    a8.b("force import contacts");
                }
                g5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.b.A(0L, false);
                return;
            case 3:
                g5 g5Var3 = this.b;
                if (g5Var3.e()) {
                    if (r2.a) {
                        a8.b("detected contacts change");
                    }
                    g5Var3.F(g5.q(g5Var3.Y), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                g5 g5Var4 = this.b;
                g5Var4.s = false;
                g5Var4.m0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                yr messagesStorage = this.b.getMessagesStorage();
                messagesStorage.a.c(new dr(messagesStorage, true, 0));
                return;
            case 8:
                g5 g5Var5 = this.b;
                try {
                    if (g5.w()) {
                        t0.b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new e5(g5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                g5 g5Var6 = this.b;
                g5Var6.n = true;
                g5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
