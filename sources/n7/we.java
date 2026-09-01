package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class we {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ we(c5.j jVar) {
        this.a = (Boolean) jVar.a;
        this.b = (Boolean) jVar.b;
        this.c = (Boolean) jVar.c;
        this.d = (Boolean) jVar.d;
        this.e = (Boolean) jVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return b6.m.l(this.a, weVar.a) && b6.m.l(this.b, weVar.b) && b6.m.l(this.c, weVar.c) && b6.m.l(this.d, weVar.d) && b6.m.l(this.e, weVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
