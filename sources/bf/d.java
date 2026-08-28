package bf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static volatile long g;
    public static volatile long h;
    public static final HashSet i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long a;
    public final int c;
    public int d;
    public boolean f;
    public String b = null;
    public final ArrayList e = new ArrayList();

    public d(int i9) {
        this.c = i9;
        this.a = UserConfig.getInstance(i9).clientUserId;
        SharedPreferences d = d();
        try {
            g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.id) != null) {
            return;
        }
        c cVar = new c();
        cVar.a = document;
        int i9 = this.d;
        this.d = i9 + 1;
        cVar.c = i9;
        cVar.d = false;
        this.e.add(cVar);
        h();
    }

    public final void b() {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        Utilities.globalQueue.postRunnable(new a1.e(7, this, new ArrayList(this.e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.e;
        if (!this.f) {
            f(true);
            this.f = true;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (arrayList.get(i9) != null && ((c) arrayList.get(i9)).a != null && ((c) arrayList.get(i9)).a.id == j10) {
                    return ((c) arrayList.get(i9)).a;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.b == null) {
            this.b = "ringtones_pref_" + this.a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.b, 0);
    }

    public final String e(long j10) {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i9 >= arrayList.size()) {
                return "NoSound";
            }
            if (((c) arrayList.get(i9)).a != null && ((c) arrayList.get(i9)).a.id == j10) {
                return !TextUtils.isEmpty(((c) arrayList.get(i9)).b) ? ((c) arrayList.get(i9)).b : FileLoader.getInstance(this.c).getPathToAttach(((c) arrayList.get(i9)).a).toString();
            }
            i9++;
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        SharedPreferences d = d();
        int i9 = d.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i10 = 0; i10 < i9; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                c cVar = new c();
                cVar.a = TLdeserialize;
                cVar.b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                cVar.c = i11;
                arrayList.add(cVar);
            } finally {
                if (!z11) {
                }
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z10) {
        boolean z11 = z10 || System.currentTimeMillis() - h > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = g;
        if (z11) {
            ConnectionsManager.getInstance(this.c).sendRequest(getsavedringtones, new a(this, 0));
            return;
        }
        if (!this.f) {
            f(true);
            this.f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i9 >= arrayList.size()) {
                edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, i10);
                edit.apply();
                NotificationCenter.getInstance(this.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
            if (!((c) arrayList.get(i9)).d) {
                i10++;
                TLRPC.Document document = ((c) arrayList.get(i9)).a;
                String str = ((c) arrayList.get(i9)).b;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                edit.putString("tone_document" + i9, Utilities.bytesToHex(serializedData.toByteArray()));
                if (str != null) {
                    edit.putString("tone_local_path" + i9, str);
                }
            }
            i9++;
        }
    }
}
