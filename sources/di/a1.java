package di;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a1 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public a1(int i10) {
        this.a = i10;
        if (this.e || this.f) {
            return;
        }
        this.f = true;
        w0 w0Var = new w0(this, 0);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new x0((Object) messagesStorage, true, (Object) w0Var, 0));
    }

    public final void a(z0 z0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i10 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.a);
        sb3.append(" (edit=");
        sb3.append(z0Var.G);
        if (z0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(z0Var.H);
            sb4.append(", ");
            if (z0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = z0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = z0Var.K;
            }
            sb2.append(j10);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(z0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        FileLog.d(sb3.toString());
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 1));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(k8 k8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(k8Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k8 k8Var = (k8) arrayList.get(i10);
            if (k8Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(k8Var.b);
                sb3.append(" (edit=");
                sb3.append(k8Var.g);
                if (k8Var.g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(k8Var.f);
                    sb4.append(", ");
                    if (k8Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j10 = k8Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j10 = k8Var.I;
                    }
                    sb2.append(j10);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(k8Var.J);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                sb3.append(str);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                FileLog.d(sb3.toString());
                arrayList2.add(Long.valueOf(k8Var.b));
                k8Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(arrayList);
        int i11 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
        messagesStorage.getStorageQueue().postRunnable(new v0(0, arrayList2, messagesStorage));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void d(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        e(k8Var);
        ArrayList arrayList = this.b;
        arrayList.remove(k8Var);
        if (!k8Var.w) {
            arrayList.add(0, k8Var);
        }
        z0 z0Var = new z0(k8Var);
        int i10 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        if (k8Var.b == 0) {
            k8Var.b = Utilities.random.nextLong();
        }
        k8Var.d = System.currentTimeMillis();
        k8Var.c = true;
        if (k8Var.M) {
            k8Var.L = f(k8Var.L);
        } else if (k8Var.L != null) {
            File x10 = k8.x(this.a, k8Var.K);
            try {
                AndroidUtilities.copyFile(k8Var.L, x10);
                k8Var.L = f(x10);
                k8Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        k8Var.Z0 = f(k8Var.Z0);
        k8Var.P0 = f(k8Var.P0);
        k8Var.O0 = f(k8Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.g = file2;
            if (!file2.exists()) {
                this.g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.g.getAbsolutePath())) {
            File file3 = new File(this.g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
