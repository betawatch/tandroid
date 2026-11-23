package ab;

import a8.r7;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements u9.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9.q b;

    public /* synthetic */ r(u9.q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // u9.d
    public final Object e(r7 r7Var) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, r7Var);
                return lambda$getComponents$0;
            default:
                return new sa.c((Context) r7Var.a(Context.class), ((o9.g) r7Var.a(o9.g.class)).d(), r7Var.L(sa.d.class), r7Var.c(cb.b.class), (Executor) r7Var.e(this.b));
        }
    }
}
