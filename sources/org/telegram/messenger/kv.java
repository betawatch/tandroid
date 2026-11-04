package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class kv extends jv {
    public int d;

    public static void c(kv kvVar, String str, SharedPreferences sharedPreferences) {
        kvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), kvVar.a).putBoolean(str.concat("_save_gallery_video"), kvVar.b).putLong(str.concat("_save_gallery_limitVideo"), kvVar.c).apply();
    }

    public static kv d(String str, SharedPreferences sharedPreferences) {
        kv kvVar = new kv();
        kvVar.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        kvVar.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        kvVar.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return kvVar;
    }

    @Override // org.telegram.messenger.jv
    public final void b() {
        super.b();
        b6.m(this.d);
    }

    public final CharSequence e(int i3) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb2.append(bd.M0(2131745930, null));
            }
            if (this.b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(bd.M0(2131745923, null));
                long j10 = this.c;
                if (j10 > 0 && j10 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(bd.M0(2131745931, null));
        }
        LongSparseArray m10 = h10.i(i3).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(bd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
