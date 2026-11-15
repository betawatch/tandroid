package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class qv extends pv {
    public int d;

    public static void c(qv qvVar, String str, SharedPreferences sharedPreferences) {
        qvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), qvVar.a).putBoolean(str.concat("_save_gallery_video"), qvVar.b).putLong(str.concat("_save_gallery_limitVideo"), qvVar.c).apply();
    }

    public static qv d(String str, SharedPreferences sharedPreferences) {
        qv qvVar = new qv();
        qvVar.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        qvVar.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        qvVar.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return qvVar;
    }

    @Override // org.telegram.messenger.pv
    public final void b() {
        super.b();
        b6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb2.append(hd.M0(2131745920, null));
            }
            if (this.b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.M0(2131745913, null));
                long j3 = this.c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.M0(2131745921, null));
        }
        LongSparseArray m10 = m10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
