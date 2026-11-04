package j2;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public k(FilesMigrationService filesMigrationService) {
        this.b = filesMigrationService;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.b).j());
                return;
            default:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(az.h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            File file = (File) d12.get(i3);
                            if (file.getAbsolutePath().startsWith(az.h0)) {
                                externalStorageDirectory = file;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                File file2 = new File(t0.b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                a8.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                g0.h3(new org.telegram.messenger.a(this, 10));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = lVar;
    }
}
