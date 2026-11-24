// default package

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import org.telegram.messenger.GoogleVoiceClientService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nr9 extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) GoogleVoiceClientService.class);
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
