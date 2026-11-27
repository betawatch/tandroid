// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class kh5 implements gg4 {
    public final String a;
    public final List b;
    public final boolean c;

    public kh5(String str, List list, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }
}
