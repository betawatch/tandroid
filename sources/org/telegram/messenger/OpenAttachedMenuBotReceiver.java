package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class OpenAttachedMenuBotReceiver extends Activity {
    public static String ACTION = "com.tmessages.openshortcutbot";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith(ACTION)) {
            finish();
            return;
        }
        try {
            if (intent.getLongExtra("botId", 0L) == 0) {
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) LaunchActivity.class);
            intent2.setAction(intent.getAction());
            intent2.putExtras(intent);
            startActivity(intent2);
            finish();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}
