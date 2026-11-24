// default package

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ma3 implements aq2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw8 b;

    public /* synthetic */ ma3(xw8 xw8Var, byte b) {
        this.a = b;
        this.b = xw8Var;
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        FirebaseMessaging lambda$getComponents$0;
        byte b = this.a;
        xw8 xw8Var = this.b;
        switch (b) {
            case 0:
                return new oa3((Context) gl2Var.a(Context.class), ((jg4) gl2Var.a(jg4.class)).d(), gl2Var.O(pd5.class), gl2Var.d(tc3.class), (Executor) gl2Var.i(xw8Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(xw8Var, gl2Var);
                return lambda$getComponents$0;
        }
    }
}
