package ib;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class a1 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        if (aVar.x() != 9) {
            return Boolean.valueOf(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.r(bool == null ? BuildConfig.BETA_URL : bool.toString());
    }
}
