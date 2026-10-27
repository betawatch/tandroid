package ai;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.bq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class k0 implements bq0 {
    public final /* synthetic */ Utilities.CallbackReturn a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ Utilities.Callback c;

    public k0(Utilities.CallbackReturn callbackReturn, r2 r2Var, Utilities.Callback callback) {
        this.a = callbackReturn;
        this.b = r2Var;
        this.c = callback;
    }

    @Override // org.telegram.ui.bq0
    public final void a(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path : null;
        if (str == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e0(str, this.a, this.b, this.c));
    }

    @Override // org.telegram.ui.bq0
    public final void b() {
    }
}
