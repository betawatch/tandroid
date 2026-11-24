// default package

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ade {
    public static KeyEvent a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e) {
                lad.g("DefaultActionFactory", "Failed to get parcelable key event", e);
            }
        }
        return null;
    }
}
