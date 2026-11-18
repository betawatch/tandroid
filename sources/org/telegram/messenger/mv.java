package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class mv extends lv {
    public int d;

    public static void c(mv mvVar, String str, SharedPreferences sharedPreferences) {
        mvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), mvVar.a).putBoolean(str.concat("_save_gallery_video"), mvVar.b).putLong(str.concat("_save_gallery_limitVideo"), mvVar.c).apply();
    }

    public static mv d(String str, SharedPreferences sharedPreferences) {
        mv mvVar = new mv();
        mvVar.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        mvVar.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        mvVar.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return mvVar;
    }

    @Override // org.telegram.messenger.lv
    public final void b() {
        super.b();
        c6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb2.append(gd.M0(2131745725, null));
            }
            if (this.b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.M0(2131745718, null));
                long j3 = this.c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(gd.M0(2131745726, null));
        }
        LongSparseArray m10 = j10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(gd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
