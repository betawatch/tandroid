// default package

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu2 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ fu2(qu2 qu2Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = qu2Var;
        this.c = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        if (r12 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ab, code lost:
    
        fa4.b("performWriteContactsToPhoneBookInternal " + (java.lang.System.currentTimeMillis() - r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a6, code lost:
    
        if (r12 != null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Cursor cursor;
        boolean z;
        int i = 0;
        switch (this.a) {
            case 0:
                qu2 qu2Var = this.b;
                ArrayList arrayList = this.c;
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = 1;
                try {
                    try {
                        Account account = qu2Var.a;
                        if (!qu2.w() || account == null) {
                            return;
                        }
                        if (!(a.b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0)) {
                            return;
                        }
                        SharedPreferences sharedPreferences = na7.q1(qu2Var.currentAccount).X3;
                        boolean z2 = sharedPreferences.getBoolean("contacts_updated_v7", false);
                        boolean z3 = !z2;
                        if (!z2) {
                            try {
                                sharedPreferences.edit().putBoolean("contacts_updated_v7", true).commit();
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                cursor = null;
                                try {
                                    fa4.g(e, z);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        ContentResolver contentResolver = a.b.getContentResolver();
                        Cursor query = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2", "account_name"}, "account_type=?", new String[]{account.type}, "deleted ASC");
                        try {
                            vf6 vf6Var = new vf6();
                            if (query != null) {
                                vf6 vf6Var2 = new vf6();
                                ArrayList arrayList2 = new ArrayList();
                                while (query.moveToNext()) {
                                    long j = query.getLong(i);
                                    boolean z4 = z2;
                                    long j2 = query.getLong(i2);
                                    if (j2 == 0) {
                                        z2 = z4;
                                    } else {
                                        if (account.name.equals(query.getString(2))) {
                                            if (!z4 || vf6Var2.h(j2) >= 0) {
                                                arrayList2.add(Long.valueOf(j));
                                                z2 = z4;
                                                i = 0;
                                                i2 = 1;
                                            } else {
                                                vf6Var2.k(Long.valueOf(j), j2);
                                            }
                                        }
                                        vf6Var.k(Long.valueOf(j), j2);
                                        z2 = z4;
                                        i = 0;
                                        i2 = 1;
                                    }
                                }
                                boolean z5 = z2;
                                query.close();
                                fa4.b("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z3 + " bookContactsSize=" + vf6Var.m() + " toDelete=" + arrayList2.size() + " currentAccount=" + qu2Var.currentAccount);
                                if (!arrayList2.isEmpty()) {
                                    qu2Var.k(contentResolver, account, arrayList2, vf6Var2, vf6Var);
                                }
                                ArrayList arrayList3 = null;
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i3);
                                    if (!z5 || vf6Var.h(tL_contact.user_id) < 0) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        qu2Var.b(arrayList3, qu2Var.getMessagesController().V1(Long.valueOf(tL_contact.user_id)));
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
                        } catch (Exception e2) {
                            e = e2;
                            cursor = query;
                            z = true;
                            fa4.g(e, z);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
                break;
            case 1:
                this.b.i(this.c, false);
                return;
            default:
                qu2 qu2Var2 = this.b;
                ArrayList arrayList4 = this.c;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    qu2Var2.j(((TLRPC.User) obj).id);
                }
                return;
        }
    }
}
