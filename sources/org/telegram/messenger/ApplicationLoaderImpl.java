package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class ApplicationLoaderImpl extends t0 {
    @Override // org.telegram.messenger.t0
    public final boolean b(Context context) {
        if (Build.VERSION.SDK_INT < 26 || t0.b.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        org.telegram.ui.Components.v4.j(context, null).show();
        return false;
    }

    @Override // org.telegram.messenger.t0
    public final File g() {
        if (q()) {
            h1 e10 = h1.e();
            if (e10.d != null) {
                File file = new File(e10.d);
                if (file.exists()) {
                    return file;
                }
                e10.d = null;
                e10.f();
                return null;
            }
        }
        return null;
    }

    @Override // org.telegram.messenger.t0
    public final boolean q() {
        return !TextUtils.isEmpty("null");
    }

    @Override // org.telegram.messenger.t0
    public final boolean v(Activity activity, TLRPC.Document document) {
        boolean z9 = false;
        try {
            w7.r(null, document);
            w7.G(p10.s0);
            File K = w7.K(document, null, true, true);
            z9 = K.exists();
            if (z9) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    t0.d();
                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", K), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(K), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        return z9;
    }
}
