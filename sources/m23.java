// default package

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class m23 implements ur4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m23(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                o23 o23Var = (o23) obj2;
                Context context = o23Var.e;
                jh0 jh0Var = (jh0) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    q23.a(o23Var.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", jh0Var.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal)) {
                            o23Var.f().execute(new vd2(o23Var, (byte) 20));
                        }
                    }
                }
                return f9cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj3;
                v23 v23Var = (v23) obj2;
                Context context2 = v23Var.e;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    q23.a(v23Var.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal2)) {
                            Executor executor = v23Var.g;
                            if (executor == null) {
                                ur5.e("executor");
                                throw null;
                            }
                            executor.execute(new t23(v23Var, (byte) 0));
                        }
                    }
                }
                return f9cVar;
            case 2:
                a33 a33Var = (a33) obj2;
                Context context3 = a33Var.e;
                p68 p68Var = (p68) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a((CancellationSignal) obj3)) {
                    Intent intent3 = new Intent(context3, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", q23.c(a33Var.i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", p68Var.a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return f9cVar;
            default:
                ((le5) obj3).c.removeCallbacks((iqd) obj2);
                return f9cVar;
        }
    }
}
