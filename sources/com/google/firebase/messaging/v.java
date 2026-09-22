package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class v {
    public final SharedPreferences a;

    public v(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                a();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public synchronized void a() {
        this.a.edit().clear().commit();
    }

    public v(int i10, int i11) {
        this.a = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.m(i10, i11, "pip_layout_", "_"), 0);
    }
}
