package kg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z1 {
    public static volatile z1[] e = new z1[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f[i7] = new Object();
        }
    }

    public z1(int i7) {
        this.a = i7;
    }

    public static z1 b(int i7) {
        z1 z1Var;
        z1 z1Var2 = e[i7];
        if (z1Var2 != null) {
            return z1Var2;
        }
        synchronized (f[i7]) {
            try {
                z1Var = e[i7];
                if (z1Var == null) {
                    z1[] z1VarArr = e;
                    z1 z1Var3 = new z1(i7);
                    z1VarArr[i7] = z1Var3;
                    z1Var = z1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z1Var;
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
        int i7 = tL_timezone.utc_offset;
        if (i7 == 0) {
            return "GMT";
        }
        String concat = "GMT".concat(i7 < 0 ? "-" : "+");
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder m10 = e2.m(concat);
        m10.append(i10 < 10 ? "0" : "");
        m10.append(i10);
        StringBuilder m11 = e2.m(p5.c.v(m10.toString(), ":"));
        m11.append(i11 < 10 ? "0" : "");
        m11.append(i11);
        return m11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i7);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i7++;
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
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
                if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i7)).id, id2)) {
                    break;
                }
                i7++;
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
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, gd.E0().y);
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
        int i7 = this.a;
        SharedPreferences sharedPreferences = mp.u1(i7).h7;
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
        ks.f(i7).k(ks.t3, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslist != null ? help_timezoneslist.hash : 0;
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_getTimezonesList, new bi.o1(22, this, sharedPreferences));
    }
}
