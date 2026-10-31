package b1;

import ad.j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;
import ld.l;
import w0.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ld.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Executor executor = (Executor) this.b;
                v0.h hVar = (v0.h) this.c;
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                executor.execute(new h(hVar, e, 1));
                return j.a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.d dVar = (c1.d) this.c;
                Context context = dVar.e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(dVar.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            dVar.f().execute(new a3.d(dVar, 24));
                        }
                    }
                }
                return j.a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.f fVar2 = (d1.f) this.c;
                Context context2 = fVar2.e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    d.a(fVar2.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor2 = fVar2.g;
                            if (executor2 == null) {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(fVar2, 0));
                        }
                    }
                }
                return j.a;
        }
    }
}
