// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jn0 extends ja {
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

    public static jn0 b(int i, TLRPC.Chat chat, boolean z) {
        jn0 jn0Var = new jn0(9, false);
        jn0Var.e = chat;
        jn0Var.d = null;
        jn0Var.g = z;
        jn0Var.i = i;
        return jn0Var;
    }

    public static jn0 c(CharSequence charSequence, boolean z) {
        jn0 jn0Var = new jn0(7, false);
        jn0Var.c = charSequence;
        jn0Var.g = z;
        return jn0Var;
    }

    public static jn0 d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i, long j, boolean z, boolean z2) {
        jn0 jn0Var = new jn0(17, z);
        jn0Var.i = i;
        jn0Var.h = j;
        jn0Var.m = tL_starsGiveawayOption;
        jn0Var.g = z2;
        return jn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jn0 e(int i, int i2, ArrayList arrayList, boolean z) {
        jn0 jn0Var = new jn0(11, i2 == i);
        jn0Var.l = i;
        jn0Var.g = z;
        jn0Var.f = arrayList;
        return jn0Var;
    }

    public static jn0 f(String str) {
        jn0 jn0Var = new jn0(6, false);
        jn0Var.c = str;
        return jn0Var;
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

    @Override // ja
    public final boolean a(ja jaVar) {
        jn0 jn0Var;
        int i;
        int i2;
        if (this == jaVar) {
            return true;
        }
        if (jn0.class == jaVar.getClass() && (i = (jn0Var = (jn0) jaVar).a) == (i2 = this.a)) {
            return i2 == 0 ? this.g == jn0Var.g : i == 17 ? this.i == jn0Var.i && this.h == jn0Var.h && this.m == jn0Var.m && this.g == jn0Var.g && this.b == jn0Var.b : i2 == 5 ? this.i == jn0Var.i && g(this.k, jn0Var.k) : i2 == 13 && this.i == jn0Var.i && TextUtils.equals(this.c, jn0Var.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jn0.class != obj.getClass()) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        int i = this.a;
        if (i != jn0Var.a) {
            return false;
        }
        if (i != 0) {
            return i == 17 ? this.i == jn0Var.i && this.m == jn0Var.m : i == 5 ? g(this.k, jn0Var.k) : i == 13 ? TextUtils.equals(this.c, jn0Var.c) : this.e == jn0Var.e && this.f == jn0Var.f && this.d == jn0Var.d && this.m == jn0Var.m && this.g == jn0Var.g && this.i == jn0Var.i && this.j == jn0Var.j && this.h == jn0Var.h && this.l == jn0Var.l && TextUtils.equals(this.c, jn0Var.c);
        }
        return true;
    }
}
