package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class ApplicationLoaderImpl extends a {
    @Override // org.telegram.messenger.a
    public final boolean u(Activity activity, TLRPC.Document document) {
        boolean z = false;
        try {
            xb4.r(null, document);
            xb4.G(yac.t0);
            File J = xb4.J(document, null, true, true);
            z = J.exists();
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    a.d();
                    intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", J), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(J), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        return z;
    }
}
