package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.car.app.utils.c, androidx.activity.result.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.car.app.utils.c
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
    public void j(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.b;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.c;
        int i10 = CarAppPermissionActivity.J;
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
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }
}
