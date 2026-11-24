// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hla extends fla {
    public final long a;
    public final long b;
    public final List c;

    public hla(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        this.c = DesugarCollections.unmodifiableList(list);
    }

    @Override // fla
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return ls6.p(sb, this.b, " }");
    }
}
