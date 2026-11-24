package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class BackupAgent extends BackupAgentHelper {
    public static BackupManager a;

    public static void a() {
        BackupManager backupManager = a;
        if (backupManager == null) {
            backupManager = new BackupManager(a.b);
            a = backupManager;
        }
        backupManager.dataChanged();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
