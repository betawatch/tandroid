package ag;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 {
    public static volatile n3[] e = new n3[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f[i10] = new Object();
        }
    }

    public n3(int i10) {
        this.a = i10;
    }

    public static n3 b(int i10) {
        n3 n3Var;
        n3 n3Var2 = e[i10];
        if (n3Var2 != null) {
            return n3Var2;
        }
        synchronized (f[i10]) {
            try {
                n3Var = e[i10];
                if (n3Var == null) {
                    n3[] n3VarArr = e;
                    n3 n3Var3 = new n3(i10);
                    n3VarArr[i10] = n3Var3;
                    n3Var = n3Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n3Var;
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
        int i10 = tL_timezone.utc_offset;
        if (i10 == 0) {
            return "GMT";
        }
        String concat = "GMT".concat(i10 < 0 ? "-" : "+");
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i11 = abs / 60;
        int i12 = abs % 60;
        StringBuilder t10 = a1.g.t(concat);
        t10.append(i11 < 10 ? "0" : "");
        t10.append(i11);
        StringBuilder t11 = a1.g.t(sc.e.A(t10.toString(), ":"));
        t11.append(i12 < 10 ? "0" : "");
        t11.append(i12);
        return t11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i10);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i10++;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                int totalSeconds = systemDefault != null ? systemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i11);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.id;
                    }
                }
                if (!arrayList.isEmpty()) {
                    return ((TLRPC.TL_timezone) arrayList.get(0)).id;
                }
            } else {
                if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i10)).id, id2)) {
                    break;
                }
                i10++;
            }
        }
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a2 = a(str);
        if (a2 != null) {
            return e(a2, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, cd.D0().y);
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
        int i10 = this.a;
        SharedPreferences sharedPreferences = vp.r1(i10).f7;
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
        zs.f(i10).k(zs.r3, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslist != null ? help_timezoneslist.hash : 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_getTimezonesList, new k0(2, this, sharedPreferences));
    }
}
