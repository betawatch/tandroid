package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import androidx.biometric.u;
import k7.h8;
import kotlin.jvm.internal.j;
import ld.m;
import org.telegram.ui.sb0;
import org.telegram.ui.web.e0;
import v0.e;
import v0.g;
import v0.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements h {
    public final Context a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    public Object a(Context context, e eVar, uc.c cVar) {
        m mVar = new m(1, h8.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        e0 e0Var = new e0(mVar, 15);
        sb0 sb0Var = new sb0(1);
        j.e(context, "context");
        v0.j b10 = u.b(new u(this.a, 2), eVar);
        if (b10 == null) {
            e0Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            e0Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, sb0Var, e0Var);
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.a;
        return r10;
    }

    public PackageInfo b(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }
}
