package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import bi.oa;
import java.util.concurrent.Executor;
import rd.l;
import v0.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Executor executor = (Executor) this.b;
                i iVar = (i) this.c;
                w0.i e7 = (w0.i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                executor.execute(new h(iVar, e7, 1));
                return gd.i.a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.e eVar = (c1.e) this.c;
                Context context = eVar.e;
                x5.f fVar = (x5.f) obj;
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
                            eVar.f().execute(new oa(eVar, 5));
                        }
                    }
                }
                return gd.i.a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.e eVar2 = (d1.e) this.c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
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
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(eVar2, 0));
                        }
                    }
                }
                return gd.i.a;
        }
    }
}
