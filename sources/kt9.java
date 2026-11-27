// default package

import android.content.SharedPreferences;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kt9 extends jt9 {
    public byte d;

    public static kt9 d(String str, SharedPreferences sharedPreferences) {
        kt9 kt9Var = new kt9();
        kt9Var.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        kt9Var.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        kt9Var.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return kt9Var;
    }

    @Override // jt9
    public final void b() {
        super.b();
        eye.f(this.d);
    }

    public final CharSequence c(int i) {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb.append(ob6.M0(2131745648, null));
            }
            if (this.b) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745641, null));
                long j = this.c;
                if (j > 0 && j < 4194304000L) {
                    sb.append(" (");
                    sb.append(hl.i0(this.c, true, false));
                    sb.append(")");
                }
            }
        } else {
            sb.append(ob6.M0(2131745649, null));
        }
        LongSparseArray l = yac.h(i).l(this.d);
        if (l.size() != 0) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(ob6.G(l.size(), "Exception", Integer.valueOf(l.size())));
        }
        return sb;
    }

    public final void e(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), this.a).putBoolean(str.concat("_save_gallery_video"), this.b).putLong(str.concat("_save_gallery_limitVideo"), this.c).apply();
    }
}
