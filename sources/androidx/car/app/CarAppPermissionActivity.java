package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.fragment.app.e0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class CarAppPermissionActivity extends androidx.activity.l {
    public static final /* synthetic */ int K = 0;

    @Override // androidx.activity.l, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i7 = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i7 != 0) {
                createConfigurationContext.setTheme(i7);
            }
            int identifier = createConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = createConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder sb2 = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb2.append(intent == null ? "null Intent" : intent.getAction());
            Log.e("CarApp", sb2.toString());
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        IOnRequestPermissionsListener asInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (asInterface != null && stringArray != null) {
            r(new b(2, this, asInterface), new e0(1)).a(stringArray);
        } else {
            Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
        }
    }
}
