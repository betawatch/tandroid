// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class if5 implements ie4 {
    public final String a;
    public final List b;
    public final boolean c;

    public if5(String str, List list, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }
}
