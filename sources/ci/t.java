package ci;

import ai.je;
import android.content.Context;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t extends je {
    public final /* synthetic */ Utilities.Callback[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.m0 = callbackArr;
    }

    @Override // ai.je
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
