package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public interface LocationListenerCompat extends LocationListener {

    public abstract /* synthetic */ class -CC {
        public static void $default$onStatusChanged(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
        }

        public static void $default$onProviderEnabled(LocationListenerCompat locationListenerCompat, String str) {
        }

        public static void $default$onProviderDisabled(LocationListenerCompat locationListenerCompat, String str) {
        }

        public static void $default$onLocationChanged(LocationListenerCompat locationListenerCompat, List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                locationListenerCompat.onLocationChanged((Location) list.get(i));
            }
        }

        public static void $default$onFlushComplete(LocationListenerCompat locationListenerCompat, int i) {
        }
    }
}
