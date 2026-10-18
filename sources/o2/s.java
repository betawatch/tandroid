package o2;

import android.text.TextUtils;
import b2.q0;
import b2.s0;
import b2.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class s implements s0 {
    public final String a;
    public final String b;
    public final List c;

    public s(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // b2.s0
    public final /* synthetic */ w a() {
        return null;
    }

    @Override // b2.s0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.a, sVar.a) && TextUtils.equals(this.b, sVar.b) && this.c.equals(sVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb2.append(str != null ? a1.g.s(a1.g.v(" [", str, ", "), this.b, "]") : "");
        return sb2.toString();
    }

    @Override // b2.s0
    public final /* synthetic */ void b(q0 q0Var) {
    }
}
