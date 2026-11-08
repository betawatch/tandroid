package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager a;

    public static void a() {
        if (a == null) {
            a = new BackupManager(t0.b);
        }
        a.dataChanged();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
