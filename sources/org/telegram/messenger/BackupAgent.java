package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class BackupAgent extends BackupAgentHelper {
    private static BackupManager backupManager;

    public static void requestBackup() {
        if (backupManager == null) {
            backupManager = new BackupManager(ApplicationLoader.applicationContext);
        }
        backupManager.dataChanged();
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, "saved_tokens", "saved_tokens_login"));
    }
}
