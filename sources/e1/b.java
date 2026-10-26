package e1;

import a1.h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.b4;
import h7.g;
import java.util.concurrent.Executor;
import ud.l;
import v0.f;
import v0.i;
import w7.t;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // ud.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                Context context = eVar.e;
                h7.e eVar2 = (h7.e) obj;
                PendingIntent pendingIntent = eVar2.a;
                g gVar = eVar2.b;
                CancellationSignal cancellationSignal = this.b;
                Executor executor = this.c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!h.a(cancellationSignal)) {
                        executor.execute(new a1.e(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                        b1.d.a(eVar.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                Executor executor2 = eVar.g;
                                if (executor2 == null) {
                                    kotlin.jvm.internal.i.h("executor");
                                    throw null;
                                }
                                executor2.execute(new a(eVar, 0));
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = t.a(gVar.a, gVar.b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                executor.execute(new b4(23, iVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal)) {
                            executor.execute(new a1.e(iVar, 8));
                        }
                    }
                }
                return jd.i.a;
            default:
                f1.a aVar = (f1.a) this.e;
                Context context2 = aVar.e;
                h7.l lVar = (h7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.b;
                if (!h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    b1.d.a(aVar.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal2)) {
                            this.c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return jd.i.a;
        }
    }
}
