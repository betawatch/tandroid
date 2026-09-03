package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.fragment.app.e0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class CarAppPermissionActivity extends androidx.activity.m {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.m, e0.h, android.app.Activity
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
            StringBuilder sb = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb.append(intent == null ? "null Intent" : intent.getAction());
            Log.e("CarApp", sb.toString());
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
