// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jm0 extends ka {
    public CharSequence c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public List k;
    public byte l;
    public TLObject m;

    public static jm0 b(int i, TLRPC.Chat chat, boolean z) {
        jm0 jm0Var = new jm0(9, false);
        jm0Var.e = chat;
        jm0Var.d = null;
        jm0Var.g = z;
        jm0Var.i = i;
        return jm0Var;
    }

    public static jm0 c(CharSequence charSequence, boolean z) {
        jm0 jm0Var = new jm0(7, false);
        jm0Var.c = charSequence;
        jm0Var.g = z;
        return jm0Var;
    }

    public static jm0 d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i, long j, boolean z, boolean z2) {
        jm0 jm0Var = new jm0(17, z);
        jm0Var.i = i;
        jm0Var.h = j;
        jm0Var.m = tL_starsGiveawayOption;
        jm0Var.g = z2;
        return jm0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jm0 e(int i, int i2, ArrayList arrayList, boolean z) {
        jm0 jm0Var = new jm0(11, i2 == i);
        jm0Var.l = i;
        jm0Var.g = z;
        jm0Var.f = arrayList;
        return jm0Var;
    }

    public static jm0 f(String str) {
        jm0 jm0Var = new jm0(6, false);
        jm0Var.c = str;
        return jm0Var;
    }

    public static boolean g(List list, List list2) {
        if (list != null) {
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                if (((Integer) list.get(i)).intValue() != ((Integer) list2.get(i)).intValue()) {
                    return false;
                }
            }
            return true;
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    @Override // ka
    public final boolean a(ka kaVar) {
        jm0 jm0Var;
        int i;
        int i2;
        if (this == kaVar) {
            return true;
        }
        if (jm0.class == kaVar.getClass() && (i = (jm0Var = (jm0) kaVar).a) == (i2 = this.a)) {
            return i2 == 0 ? this.g == jm0Var.g : i == 17 ? this.i == jm0Var.i && this.h == jm0Var.h && this.m == jm0Var.m && this.g == jm0Var.g && this.b == jm0Var.b : i2 == 5 ? this.i == jm0Var.i && g(this.k, jm0Var.k) : i2 == 13 && this.i == jm0Var.i && TextUtils.equals(this.c, jm0Var.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jm0.class != obj.getClass()) {
            return false;
        }
        jm0 jm0Var = (jm0) obj;
        int i = this.a;
        if (i != jm0Var.a) {
            return false;
        }
        if (i != 0) {
            return i == 17 ? this.i == jm0Var.i && this.m == jm0Var.m : i == 5 ? g(this.k, jm0Var.k) : i == 13 ? TextUtils.equals(this.c, jm0Var.c) : this.e == jm0Var.e && this.f == jm0Var.f && this.d == jm0Var.d && this.m == jm0Var.m && this.g == jm0Var.g && this.i == jm0Var.i && this.j == jm0Var.j && this.h == jm0Var.h && this.l == jm0Var.l && TextUtils.equals(this.c, jm0Var.c);
        }
        return true;
    }
}
