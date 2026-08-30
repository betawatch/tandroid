package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // dd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Executor executor = (Executor) this.b;
                i iVar = (i) this.c;
                w0.i e = (w0.i) obj;
                j.e(e, "e");
                executor.execute(new h(iVar, e, 1));
                return sc.i.a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.f fVar = (c1.f) this.c;
                Context context = fVar.e;
                l5.f fVar2 = (l5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(fVar.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar2.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            fVar.f().execute(new ag.d(fVar, 8));
                        }
                    }
                }
                return sc.i.a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.e eVar = (d1.e) this.c;
                Context context2 = eVar.e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    d.a(eVar.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor2 = eVar.g;
                            if (executor2 == null) {
                                j.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(eVar, 0));
                        }
                    }
                }
                return sc.i.a;
        }
    }
}
