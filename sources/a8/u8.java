package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u8 {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u8) {
            return q6.m.k(null, null) && q6.m.k(this.a, ((u8) obj).a) && q6.m.k(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
