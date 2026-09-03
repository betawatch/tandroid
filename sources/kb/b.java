package kb;

import b6.m;
import jb.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends c {
    public static final b b;

    static {
        a aVar = new a();
        aVar.a = -1.0f;
        boolean z4 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z4 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z4);
        aVar.a = 0.5f;
        b = new b(aVar);
    }
}
