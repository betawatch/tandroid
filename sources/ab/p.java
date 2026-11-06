package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ p(FirebaseMessaging firebaseMessaging, int i7) {
        this.a = i7;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z9;
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) obj;
                if (!this.b.f.s() || j0Var.g.a() == null) {
                    return;
                }
                synchronized (j0Var) {
                    z9 = j0Var.f;
                }
                if (z9) {
                    return;
                }
                j0Var.e(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                m6.a aVar = (m6.a) obj;
                d0 d0Var = FirebaseMessaging.m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    b1.b(aVar.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
