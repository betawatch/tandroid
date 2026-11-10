package ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d0 {
    public static d0 b;
    public final SharedPreferences a;

    public d0(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                a();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public static d0 b() {
        if (b == null) {
            Point point = org.telegram.messenger.g0.q;
            b = new d0(point.x, point.y);
        }
        return b;
    }

    public synchronized void a() {
        this.a.edit().clear().commit();
    }

    public d0(int i7, int i10) {
        this.a = t0.b.getSharedPreferences(a8.p0.m(i7, i10, "pip_floating_", "_"), 0);
    }
}
