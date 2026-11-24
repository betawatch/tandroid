// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a00 implements qbb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a00(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // qbb
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return i00.e(context);
            case 1:
                return new qb3(context, new ka3());
            case 2:
                return new vb3(context);
            case 3:
                return new qb3(context, new ka3());
            case 4:
                return new sc3(context, new o5f((byte) 13));
            default:
                return s93.d(context);
        }
    }
}
