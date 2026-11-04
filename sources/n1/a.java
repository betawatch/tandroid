package n1;

import android.content.Context;
import android.content.SharedPreferences;
import b8.md;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends k implements od.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, Context context, Object obj) {
        super(0);
        this.b = i3;
        this.c = context;
        this.d = obj;
    }

    @Override // od.a
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
                return md.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
