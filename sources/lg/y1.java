package lg;

import ai.f3;
import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y1 {
    public static volatile y1[] e = new y1[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            f[i3] = new Object();
        }
    }

    public y1(int i3) {
        this.a = i3;
    }

    public static y1 b(int i3) {
        y1 y1Var;
        y1 y1Var2 = e[i3];
        if (y1Var2 != null) {
            return y1Var2;
        }
        synchronized (f[i3]) {
            try {
                y1Var = e[i3];
                if (y1Var == null) {
                    y1[] y1VarArr = e;
                    y1 y1Var3 = new y1(i3);
                    y1VarArr[i3] = y1Var3;
                    y1Var = y1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y1Var;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z10) {
        if (tL_timezone == null) {
            return null;
        }
        if (!z10) {
            return tL_timezone.name;
        }
        return tL_timezone.name + ", " + f(tL_timezone);
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        int i3 = tL_timezone.utc_offset;
        if (i3 == 0) {
            return "GMT";
        }
        String concat = "GMT".concat(i3 < 0 ? "-" : "+");
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(concat);
        l10.append(i10 < 10 ? "0" : "");
        l10.append(i10);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(t4.c.q(l10.toString(), ":"));
        l11.append(i11 < 10 ? "0" : "");
        l11.append(i11);
        return l11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i3);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        ZoneId systemDefault = ZoneId.systemDefault();
        String id2 = systemDefault != null ? systemDefault.getId() : null;
        if (this.b || !this.c) {
            g();
            return id2;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                int totalSeconds = systemDefault != null ? systemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i10);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.id;
                    }
                }
                if (!arrayList.isEmpty()) {
                    return ((TLRPC.TL_timezone) arrayList.get(0)).id;
                }
            } else {
                if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i3)).id, id2)) {
                    break;
                }
                i3++;
            }
        }
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a10 = a(str);
        if (a10 != null) {
            return e(a10, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, bd.E0().y);
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(of2.getId().replace("/", ", ").replace("_", " "));
        sb2.append(str2 != null ? ", ".concat(str2) : "");
        return sb2.toString();
    }

    public final void g() {
        if (this.b || this.c) {
            return;
        }
        this.b = true;
        int i3 = this.a;
        SharedPreferences sharedPreferences = hp.s1(i3).e7;
        TLRPC.help_timezonesList help_timezoneslist = null;
        String string = sharedPreferences.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (help_timezoneslist != null) {
            arrayList.addAll(help_timezoneslist.timezones);
        }
        hs.f(i3).k(hs.r3, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslist != null ? help_timezoneslist.hash : 0;
        ConnectionsManager.getInstance(i3).sendRequest(tL_help_getTimezonesList, new f3(24, this, sharedPreferences));
    }
}
