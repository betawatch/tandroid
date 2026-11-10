package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class OpenChatReceiver extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            finish();
            return;
        }
        try {
            long longExtra = intent.getLongExtra("chatId", intent.getIntExtra("chatId", 0));
            long longExtra2 = intent.getLongExtra("userId", intent.getIntExtra("userId", 0));
            int intExtra = intent.getIntExtra("encId", 0);
            if (longExtra == 0 && longExtra2 == 0 && intExtra == 0) {
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) LaunchActivity.class);
            intent2.setAction(intent.getAction());
            intent2.putExtras(intent);
            startActivity(intent2);
            finish();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}
