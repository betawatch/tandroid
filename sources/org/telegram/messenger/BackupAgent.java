package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager a;

    public static void a() {
        if (a == null) {
            a = new BackupManager(w0.b);
        }
        a.dataChanged();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
