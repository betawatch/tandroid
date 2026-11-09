package org.telegram.messenger;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ w4(g5 g5Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = g5Var;
        this.c = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
    
        if (r12 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a5, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
    
        org.telegram.messenger.a8.b("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r10));
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
        boolean z9;
        Cursor cursor;
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                ArrayList arrayList = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                int i7 = 1;
                try {
                    try {
                        Account account = g5Var.a;
                        if (!g5.w() || account == null) {
                            return;
                        }
                        int i10 = 0;
                        if (!(t0.b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0)) {
                            return;
                        }
                        SharedPreferences sharedPreferences = qp.s1(g5Var.currentAccount).e7;
                        boolean z10 = sharedPreferences.getBoolean("contacts_updated_v7", false);
                        boolean z11 = !z10;
                        if (!z10) {
                            try {
                                sharedPreferences.edit().putBoolean("contacts_updated_v7", true).commit();
                            } catch (Exception e10) {
                                e = e10;
                                z9 = true;
                                cursor = null;
                                try {
                                    a8.g(e, z9);
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
                        ContentResolver contentResolver = t0.b.getContentResolver();
                        Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2", "account_name"}, "account_type=?", new String[]{account.type}, "deleted ASC");
                        try {
                            a0.h hVar = new a0.h();
                            if (query != null) {
                                a0.h hVar2 = new a0.h();
                                ArrayList arrayList2 = new ArrayList();
                                while (query.moveToNext()) {
                                    long j3 = query.getLong(i10);
                                    long j10 = query.getLong(i7);
                                    if (j10 != 0) {
                                        if (account.name.equals(query.getString(2))) {
                                            if (z10 && hVar2.h(j10) < 0) {
                                                hVar2.k(Long.valueOf(j3), j10);
                                            }
                                            arrayList2.add(Long.valueOf(j3));
                                            i7 = 1;
                                        }
                                        hVar.k(Long.valueOf(j3), j10);
                                        i7 = 1;
                                    }
                                    i10 = 0;
                                }
                                query.close();
                                a8.b("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z11 + " bookContactsSize=" + hVar.m() + " toDelete=" + arrayList2.size() + " currentAccount=" + g5Var.currentAccount);
                                if (!arrayList2.isEmpty()) {
                                    g5Var.k(contentResolver, account, arrayList2, hVar2, hVar);
                                }
                                ArrayList arrayList3 = null;
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i11);
                                    if (!z10 || hVar.h(tL_contact.user_id) < 0) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        g5Var.b(arrayList3, g5Var.getMessagesController().a2(Long.valueOf(tL_contact.user_id)));
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
                        } catch (Exception e11) {
                            e = e11;
                            cursor = query;
                            z9 = true;
                            a8.g(e, z9);
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
                } catch (Exception e12) {
                    e = e12;
                    z9 = true;
                }
                break;
            case 1:
                this.b.i(this.c, false);
                return;
            default:
                g5 g5Var2 = this.b;
                ArrayList arrayList4 = this.c;
                g5Var2.getClass();
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    g5Var2.j(((TLRPC.User) obj).id);
                }
                return;
        }
    }
}
