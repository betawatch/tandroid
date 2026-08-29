package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import bd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Executor executor = (Executor) this.b;
                i iVar = (i) this.c;
                w0.i e10 = (w0.i) obj;
                j.e(e10, "e");
                executor.execute(new h(iVar, e10, 1));
                return qc.i.a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.e eVar = (c1.e) this.c;
                Context context = eVar.e;
                j5.f fVar = (j5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(eVar.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new a4.g(eVar, 21));
                        }
                    }
                }
                return qc.i.a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.e eVar2 = (d1.e) this.c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    d.a(eVar2.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor2 = eVar2.g;
                            if (executor2 == null) {
                                j.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(eVar2, 0));
                        }
                    }
                }
                return qc.i.a;
        }
    }
}
