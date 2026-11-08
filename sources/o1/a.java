package o1;

import android.content.Context;
import android.content.SharedPreferences;
import c8.c1;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends k implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Context context, Object obj) {
        super(0);
        this.b = i7;
        this.c = context;
        this.d = obj;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                SharedPreferences sharedPreferences = this.c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).a;
                j.e(name, "name");
                return c1.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
