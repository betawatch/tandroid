package c9;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class a extends Activity {
    public abstract Class getServiceClass();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) getServiceClass());
        intent.putExtra(c.EXTRA_INTENT, getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
