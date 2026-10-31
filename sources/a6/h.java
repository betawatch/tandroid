package a6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.m;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.g1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h {
    public static final g1 a = new g1("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        i.n0(context).o0();
        Set set = m.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).c();
        }
        com.google.android.gms.common.api.internal.h.a();
    }
}
