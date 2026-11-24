// default package

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kg8 extends vw5 implements op4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg8(byte b, Context context, Object obj) {
        super(0);
        this.b = b;
        this.c = context;
        this.d = obj;
    }

    @Override // op4
    public final Object invoke() {
        byte b = this.b;
        Object obj = this.d;
        Context context = this.c;
        switch (b) {
            case 0:
                return wbe.a(context, ((String) ((f06) obj).a).concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
