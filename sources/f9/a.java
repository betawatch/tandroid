package f9;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import org.telegram.messenger.GoogleVoiceClientService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a extends Activity {
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
