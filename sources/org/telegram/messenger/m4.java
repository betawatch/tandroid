package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.provider.ContactsContract;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ m4(i5 i5Var, int i7) {
        this.a = i7;
        this.b = i5Var;
    }

    private final void a() {
        i5 i5Var = this.b;
        if (i5Var.f0.isEmpty() && !i5Var.h) {
            i5Var.A(0L, true);
            return;
        }
        synchronized (i5Var.c) {
            i5Var.b = false;
        }
    }

    private final void b() {
        i5 i5Var = this.b;
        synchronized (i5Var.c) {
            i5Var.b = false;
        }
        i5Var.getNotificationCenter().k(ks.O, new Object[0]);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                AccountManager accountManager = AccountManager.get(t0.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    for (int i7 = 0; i7 < accountsByType.length; i7++) {
                        Account account = accountsByType[i7];
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                TLRPC.User f10 = j10.i(i10).f();
                                if (f10 != null) {
                                    if (account.name.equals("" + f10.id)) {
                                        if (i10 == i5Var.currentAccount) {
                                            i5Var.a = account;
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
                if (i5Var.getUserConfig().p()) {
                    synchronized (i5Var.c) {
                        try {
                            if (!i5Var.b) {
                                i5Var.b = true;
                                Utilities.d.c(new m4(i5Var, 5));
                            }
                        } finally {
                        }
                    }
                    if (i5Var.a == null) {
                        try {
                            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
                            i5Var.a = account2;
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
                i5 i5Var2 = this.b;
                if (s2.a) {
                    a8.b("force import contacts");
                }
                i5Var2.F(new HashMap(), true, true, true, true, false, false);
                return;
            case 2:
                this.b.A(0L, false);
                return;
            case 3:
                i5 i5Var3 = this.b;
                if (i5Var3.e()) {
                    if (s2.a) {
                        a8.b("detected contacts change");
                    }
                    i5Var3.F(i5.q(i5Var3.Z), true, false, true, false, true, false);
                    return;
                }
                return;
            case 4:
                i5 i5Var4 = this.b;
                i5Var4.s = false;
                i5Var4.n0 = 0;
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                tr messagesStorage = this.b.getMessagesStorage();
                messagesStorage.a.c(new yq(messagesStorage, true, 0));
                return;
            case 8:
                i5 i5Var5 = this.b;
                try {
                    if (i5.w()) {
                        t0.b.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new g5(i5Var5));
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                i5 i5Var6 = this.b;
                i5Var6.n = true;
                i5Var6.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
