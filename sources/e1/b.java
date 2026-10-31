package e1;

import ad.j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import ld.l;
import v0.f;
import v0.h;
import w7.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ h d;
    public final /* synthetic */ b1.d e;

    public /* synthetic */ b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, h hVar, int i10) {
        this.a = i10;
        this.b = cancellationSignal;
        this.e = dVar;
        this.c = executor;
        this.d = hVar;
    }

    @Override // ld.l
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
                h hVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.h.a(cancellationSignal)) {
                        executor.execute(new a1.e(hVar, 9));
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
                            if (!a1.h.a(cancellationSignal)) {
                                Executor executor2 = dVar.g;
                                if (executor2 == null) {
                                    i.h("executor");
                                    throw null;
                                }
                                executor2.execute(new a(dVar, 0));
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = f8.a(gVar.a, gVar.b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                executor.execute(new d1.e(5, hVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            executor.execute(new a1.e(hVar, 8));
                        }
                    }
                }
                return j.a;
            default:
                f1.b bVar = (f1.b) this.e;
                Context context2 = bVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.b;
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    b1.d.a(bVar.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            this.c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return j.a;
        }
    }
}
