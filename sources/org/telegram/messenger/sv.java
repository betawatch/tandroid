package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class sv extends rv {
    public int d;

    public static void c(sv svVar, String str, SharedPreferences sharedPreferences) {
        svVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), svVar.a).putBoolean(str.concat("_save_gallery_video"), svVar.b).putLong(str.concat("_save_gallery_limitVideo"), svVar.c).apply();
    }

    public static sv d(String str, SharedPreferences sharedPreferences) {
        sv svVar = new sv();
        svVar.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        svVar.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        svVar.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return svVar;
    }

    @Override // org.telegram.messenger.rv
    public final void b() {
        super.b();
        b6.m(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb2.append(hd.M0(2131745921, null));
            }
            if (this.b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.M0(2131745914, null));
                long j3 = this.c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.M0(2131745922, null));
        }
        LongSparseArray m10 = p10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
