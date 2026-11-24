// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class frd {
    public final bve a;
    public final Boolean b;
    public final mze c;

    public /* synthetic */ frd(uqd uqdVar) {
        this.a = (bve) uqdVar.b;
        this.b = (Boolean) uqdVar.c;
        this.c = (mze) uqdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof frd)) {
            return false;
        }
        frd frdVar = (frd) obj;
        return fse.a(this.a, frdVar.a) && fse.a(this.b, frdVar.b) && fse.a(null, null) && fse.a(this.c, frdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
