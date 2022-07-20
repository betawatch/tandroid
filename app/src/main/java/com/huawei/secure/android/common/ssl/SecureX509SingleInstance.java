package com.huawei.secure.android.common.ssl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.huawei.secure.android.common.ssl.util.BksUtil;
import com.huawei.secure.android.common.ssl.util.c;
import com.huawei.secure.android.common.ssl.util.d;
import com.huawei.secure.android.common.ssl.util.g;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* loaded from: classes.dex */
public class SecureX509SingleInstance {
    private static final String a = "SecureX509SingleInstance";
    private static volatile SecureX509TrustManager b;

    private SecureX509SingleInstance() {
    }

    @SuppressLint({"NewApi"})
    public static SecureX509TrustManager getInstance(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            c.a(context);
            if (b == null) {
                synchronized (SecureX509SingleInstance.class) {
                    if (b == null) {
                        InputStream filesBksIS = BksUtil.getFilesBksIS(context);
                        if (filesBksIS == null) {
                            g.c(a, "get assets bks");
                            filesBksIS = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            g.c(a, "get files bks");
                        }
                        b = new SecureX509TrustManager(filesBksIS, "");
                        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            String str = a;
            g.a(str, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return b;
        }
        throw new NullPointerException("context is null");
    }
}
