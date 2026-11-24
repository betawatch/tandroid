// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a10 implements sdb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a10(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // sdb
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return i10.e(context);
            case 1:
                return new cd3(context, new wb3());
            case 2:
                return new hd3(context);
            case 3:
                return new cd3(context, new wb3());
            case 4:
                return new fe3(context, new q7f((byte) 13));
            default:
                return eb3.d(context);
        }
    }
}
