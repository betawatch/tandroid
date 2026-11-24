// default package

import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d84 extends wo9 {
    public final HashMap e = new HashMap();

    @Override // wo9
    public final to9 h(Object obj) {
        return (to9) this.e.get(obj);
    }

    @Override // wo9
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
