// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lud {
    public final o7f a;
    public final Boolean b;
    public final pef c;

    public /* synthetic */ lud(uqd uqdVar) {
        this.a = (o7f) uqdVar.b;
        this.b = (Boolean) uqdVar.c;
        this.c = (pef) uqdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lud)) {
            return false;
        }
        lud ludVar = (lud) obj;
        return fse.a(this.a, ludVar.a) && fse.a(this.b, ludVar.b) && fse.a(null, null) && fse.a(this.c, ludVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
