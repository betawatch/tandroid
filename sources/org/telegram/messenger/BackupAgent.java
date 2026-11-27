package org.telegram.messenger;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
