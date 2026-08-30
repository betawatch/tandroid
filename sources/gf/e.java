package gf;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public static volatile long g;
    public static volatile long h;
    public static final HashSet i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long a;
    public final int c;
    public int d;
    public boolean f;
    public String b = null;
    public final ArrayList e = new ArrayList();

    public e(int i10) {
        this.c = i10;
        this.a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.id) != null) {
            return;
        }
        d dVar = new d();
        dVar.a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        dVar.c = i10;
        dVar.d = false;
        this.e.add(dVar);
        h();
    }

    public final void b() {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        Utilities.globalQueue.postRunnable(new c(0, this, new ArrayList(this.e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.e;
        if (!this.f) {
            f(true);
            this.f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((d) arrayList.get(i10)).a != null && ((d) arrayList.get(i10)).a.id == j10) {
                    return ((d) arrayList.get(i10)).a;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return "NoSound";
            }
            if (((d) arrayList.get(i10)).a != null && ((d) arrayList.get(i10)).a.id == j10) {
                return !TextUtils.isEmpty(((d) arrayList.get(i10)).b) ? ((d) arrayList.get(i10)).b : FileLoader.getInstance(this.c).getPathToAttach(((d) arrayList.get(i10)).a).toString();
            }
            i10++;
        }
    }

    public final void f(boolean z4) {
        boolean z10;
        SharedPreferences d = d();
        int i10 = d.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                d dVar = new d();
                dVar.a = TLdeserialize;
                dVar.b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                dVar.c = i12;
                arrayList.add(dVar);
            } finally {
                if (!z10) {
                }
            }
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z4) {
        boolean z10 = z4 || System.currentTimeMillis() - h > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = g;
        if (z10) {
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, i11);
                edit.apply();
                NotificationCenter.getInstance(this.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
            if (!((d) arrayList.get(i10)).d) {
                i11++;
                TLRPC.Document document = ((d) arrayList.get(i10)).a;
                String str = ((d) arrayList.get(i10)).b;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                if (str != null) {
                    edit.putString("tone_local_path" + i10, str);
                }
            }
            i10++;
        }
    }
}
