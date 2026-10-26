package ai;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k0 implements zp0 {
    public final /* synthetic */ Utilities.CallbackReturn a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ Utilities.Callback c;

    public k0(Utilities.CallbackReturn callbackReturn, r2 r2Var, Utilities.Callback callback) {
        this.a = callbackReturn;
        this.b = r2Var;
        this.c = callback;
    }

    @Override // org.telegram.ui.zp0
    public final void a(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path : null;
        if (str == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e0(str, this.a, this.b, this.c));
    }

    @Override // org.telegram.ui.zp0
    public final void b() {
    }
}
