// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i13 implements lt8 {
    public final /* synthetic */ byte a;
    public final pj4 b;

    public /* synthetic */ i13(pj4 pj4Var, byte b) {
        this.a = b;
        this.b = pj4Var;
    }

    @Override // lt8
    public final Object get() {
        byte b = this.a;
        pj4 pj4Var = this.b;
        switch (b) {
            case 0:
                return new mv6((Context) pj4Var.b, new ie7((byte) 29), new i2f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) pj4Var.b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                fvc.f("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
