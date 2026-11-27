// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ad7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ad7(jf7 jf7Var, int i, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 3;
        int i = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                jf7Var.k(i);
                return;
            case 1:
                try {
                    jf7Var.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    jf7Var.n(e, true);
                    return;
                }
            case 2:
                jf7 jf7Var2 = this.b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        zh6 zh6Var = new zh6();
                        SQLiteDatabase sQLiteDatabase = jf7Var2.b;
                        SQLiteCursor queryFinalized = i >= 0 ? sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]) : sQLiteDatabase.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!wf3.C(longValue)) {
                                    ff7 ff7Var = new ff7();
                                    ff7Var.a = queryFinalized.intValue(1);
                                    ff7Var.c = queryFinalized.intValue(2);
                                    ff7Var.b = queryFinalized.intValue(3);
                                    zh6Var.k(longValue, ff7Var);
                                    if (wf3.B(longValue)) {
                                        int i2 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i2))) {
                                            arrayList3.add(Integer.valueOf(i2));
                                        }
                                    } else if (wf3.y(longValue)) {
                                        long j = -longValue;
                                        if (!arrayList2.contains(Long.valueOf(j))) {
                                            arrayList2.add(Long.valueOf(j));
                                        }
                                    } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                        arrayList.add(Long.valueOf(longValue));
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteCursor = queryFinalized;
                                jf7Var2.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                            jf7Var2.T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            jf7Var2.k0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            jf7Var2.P(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        hl.c3(new tw4((Object) jf7Var2, (Object) arrayList4, (Object) arrayList5, (Object) arrayList6, (Object) zh6Var, (byte) 27));
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            case 3:
                uc7 messagesController = jf7Var.getMessagesController();
                yac userConfig = messagesController.getUserConfig();
                int i3 = this.c;
                if (userConfig.g(i3)[0] != 2147483647L) {
                    messagesController.d3(i3, 0, 10, false, new y77(messagesController, i3, b2));
                    return;
                } else if (i3 != 1) {
                    messagesController.t4(i3);
                    return;
                } else {
                    messagesController.h0 = false;
                    messagesController.B();
                    return;
                }
            case 4:
                jf7Var.getDownloadController().t(i);
                return;
            default:
                try {
                    SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                    sQLiteDatabase2.executeFast("DELETE FROM business_replies WHERE topic_id = " + i).stepThis().dispose();
                    sQLiteDatabase2.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
        }
    }
}
