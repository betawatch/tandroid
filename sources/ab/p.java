package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
