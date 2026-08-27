package bd;

import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends a {
    public final b b = new b(0);

    @Override // bd.a
    public final Random a() {
        Object obj = this.b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
