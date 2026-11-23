package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class nv extends mv {
    public int d;

    public static void c(nv nvVar, String str, SharedPreferences sharedPreferences) {
        nvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), nvVar.a).putBoolean(str.concat("_save_gallery_video"), nvVar.b).putLong(str.concat("_save_gallery_limitVideo"), nvVar.c).apply();
    }

    public static nv d(String str, SharedPreferences sharedPreferences) {
        nv nvVar = new nv();
        nvVar.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        nvVar.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        nvVar.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return nvVar;
    }

    @Override // org.telegram.messenger.mv
    public final void b() {
        super.b();
        c6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb2.append(hd.N0(2131745724, null));
            }
            if (this.b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.N0(2131745717, null));
                long j3 = this.c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.N0(2131745725, null));
        }
        LongSparseArray m10 = k10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
