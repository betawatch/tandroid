package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        boolean z10;
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) obj;
                if (!this.b.f.s() || j0Var.g.a() == null) {
                    return;
                }
                synchronized (j0Var) {
                    z10 = j0Var.f;
                }
                if (z10) {
                    return;
                }
                j0Var.e(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                m6.a aVar = (m6.a) obj;
                ob.c cVar = FirebaseMessaging.m;
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
