package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.fragment.app.e0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class CarAppPermissionActivity extends androidx.activity.m {
    public static final /* synthetic */ int J = 0;

    @Override // androidx.activity.m, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i10 = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i10 != 0) {
                createConfigurationContext.setTheme(i10);
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
            r(new b(2, this, asInterface), new e0(1)).b(stringArray);
        } else {
            Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
        }
    }
}
