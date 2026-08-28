package ih;

import android.content.Context;
import gh.gb;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t extends gb {
    public final /* synthetic */ Utilities.Callback[] i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.i0 = callbackArr;
    }

    @Override // gh.gb
    public final void e(int i9) {
        this.i0[0].run(Integer.valueOf(i9));
    }
}
