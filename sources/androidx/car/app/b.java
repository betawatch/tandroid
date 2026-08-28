package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.car.app.utils.d, androidx.activity.result.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.car.app.utils.d
    public Object a() {
        Object lambda$onConfigurationChanged$6;
        Object lambda$onNewIntent$5;
        switch (this.a) {
            case 0:
                lambda$onConfigurationChanged$6 = ((CarAppBinder) this.b).lambda$onConfigurationChanged$6((Configuration) this.c);
                return lambda$onConfigurationChanged$6;
            default:
                lambda$onNewIntent$5 = ((CarAppBinder) this.b).lambda$onNewIntent$5((Intent) this.c);
                return lambda$onNewIntent$5;
        }
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.b;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.c;
        int i9 = CarAppPermissionActivity.F;
        carAppPermissionActivity.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool == null || !bool.booleanValue()) {
                arrayList2.add((String) entry.getKey());
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e10) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e10);
        }
        carAppPermissionActivity.finish();
    }
}
