package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.b7;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import rd.l;
import v0.f;
import v0.i;
import w7.u7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ i d;
    public final /* synthetic */ b1.d e;

    public /* synthetic */ b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.a = i10;
        this.b = cancellationSignal;
        this.e = dVar;
        this.c = executor;
        this.d = iVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                d dVar = (d) this.e;
                Context context = dVar.e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.a;
                g gVar = eVar.b;
                CancellationSignal cancellationSignal = this.b;
                Executor executor = this.c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                        b1.d.a(dVar.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.g;
                                if (executor2 == null) {
                                    kotlin.jvm.internal.i.h("executor");
                                    throw null;
                                }
                                executor2.execute(new a(dVar, 0));
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = u7.a(gVar.a, gVar.b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new b7(15, iVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            executor.execute(new a1.b(iVar, 8));
                        }
                    }
                }
                return gd.i.a;
            default:
                f1.a aVar = (f1.a) this.e;
                Context context2 = aVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    b1.d.a(aVar.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return gd.i.a;
        }
    }
}
