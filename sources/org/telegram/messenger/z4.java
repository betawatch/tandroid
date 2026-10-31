package org.telegram.messenger;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ z4(i5 i5Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = i5Var;
        this.c = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
    
        if (r12 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a5, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
    
        org.telegram.messenger.f8.b("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        if (r12 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        Cursor cursor;
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                ArrayList arrayList = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                int i10 = 1;
                try {
                    try {
                        Account account = i5Var.a;
                        if (!i5.w() || account == null) {
                            return;
                        }
                        int i11 = 0;
                        if (!(w0.b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0)) {
                            return;
                        }
                        SharedPreferences sharedPreferences = vp.r1(i5Var.currentAccount).f7;
                        boolean z11 = sharedPreferences.getBoolean("contacts_updated_v7", false);
                        boolean z12 = !z11;
                        if (!z11) {
                            try {
                                sharedPreferences.edit().putBoolean("contacts_updated_v7", true).commit();
                            } catch (Exception e) {
                                e = e;
                                z10 = true;
                                cursor = null;
                                try {
                                    f8.g(e, z10);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        ContentResolver contentResolver = w0.b.getContentResolver();
                        Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2", "account_name"}, "account_type=?", new String[]{account.type}, "deleted ASC");
                        try {
                            a0.h hVar = new a0.h();
                            if (query != null) {
                                a0.h hVar2 = new a0.h();
                                ArrayList arrayList2 = new ArrayList();
                                while (query.moveToNext()) {
                                    long j10 = query.getLong(i11);
                                    long j11 = query.getLong(i10);
                                    if (j11 != 0) {
                                        if (account.name.equals(query.getString(2))) {
                                            if (z11 && hVar2.h(j11) < 0) {
                                                hVar2.k(Long.valueOf(j10), j11);
                                            }
                                            arrayList2.add(Long.valueOf(j10));
                                            i10 = 1;
                                        }
                                        hVar.k(Long.valueOf(j10), j11);
                                        i10 = 1;
                                    }
                                    i11 = 0;
                                }
                                query.close();
                                f8.b("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z12 + " bookContactsSize=" + hVar.m() + " toDelete=" + arrayList2.size() + " currentAccount=" + i5Var.currentAccount);
                                if (!arrayList2.isEmpty()) {
                                    i5Var.k(contentResolver, account, arrayList2, hVar2, hVar);
                                }
                                ArrayList arrayList3 = null;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i12);
                                    if (!z11 || hVar.h(tL_contact.user_id) < 0) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        i5Var.b(arrayList3, i5Var.getMessagesController().Z1(Long.valueOf(tL_contact.user_id)));
                                        if (arrayList3.size() > 450) {
                                            contentResolver.applyBatch("com.android.contacts", arrayList3);
                                            arrayList3.clear();
                                        }
                                    }
                                }
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    contentResolver.applyBatch("com.android.contacts", arrayList3);
                                    arrayList3.clear();
                                }
                                cursor = null;
                                break;
                            } else {
                                cursor = query;
                                break;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            cursor = query;
                            z10 = true;
                            f8.g(e, z10);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = null;
                    }
                } catch (Exception e10) {
                    e = e10;
                    z10 = true;
                }
                break;
            case 1:
                this.b.i(this.c, false);
                return;
            default:
                i5 i5Var2 = this.b;
                ArrayList arrayList4 = this.c;
                i5Var2.getClass();
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    i5Var2.j(((TLRPC.User) obj).id);
                }
                return;
        }
    }
}
