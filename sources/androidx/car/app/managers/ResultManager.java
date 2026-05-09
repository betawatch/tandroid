package androidx.car.app.managers;

import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.CarContext;

/* loaded from: classes.dex */
public interface ResultManager extends Manager {

    public abstract /* synthetic */ class -CC {
        public static ResultManager create(CarContext carContext) {
            try {
                Bundle bundle = CarAppMetadataHolderService.getServiceInfo(carContext).metaData;
                String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
                if (string == null) {
                    throw new ClassNotFoundException("ResultManager metadata could not be found");
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(Class.forName(string).getConstructor(null).newInstance(null));
                return null;
            } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
            }
        }
    }
}
