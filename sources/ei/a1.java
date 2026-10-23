package ei;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        x0 x0Var = new x0(this, 0);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new ai.y7((Object) messagesStorage, true, (Object) x0Var, 3));
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

    public final void b(a8 a8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a8Var);
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
            a8 a8Var = (a8) arrayList.get(i10);
            if (a8Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(a8Var.b);
                sb3.append(" (edit=");
                sb3.append(a8Var.g);
                if (a8Var.g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(a8Var.f);
                    sb4.append(", ");
                    if (a8Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j10 = a8Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j10 = a8Var.I;
                    }
                    sb2.append(j10);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(a8Var.J);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                sb3.append(str);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                FileLog.d(sb3.toString());
                arrayList2.add(Long.valueOf(a8Var.b));
                a8Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(arrayList);
        int i11 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
        messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void d(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        e(a8Var);
        ArrayList arrayList = this.b;
        arrayList.remove(a8Var);
        if (!a8Var.w) {
            arrayList.add(0, a8Var);
        }
        z0 z0Var = new z0(a8Var);
        int i10 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        if (a8Var.b == 0) {
            a8Var.b = Utilities.random.nextLong();
        }
        a8Var.d = System.currentTimeMillis();
        a8Var.c = true;
        if (a8Var.M) {
            a8Var.L = f(a8Var.L);
        } else if (a8Var.L != null) {
            File x10 = a8.x(this.a, a8Var.K);
            try {
                AndroidUtilities.copyFile(a8Var.L, x10);
                a8Var.L = f(x10);
                a8Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        a8Var.Z0 = f(a8Var.Z0);
        a8Var.P0 = f(a8Var.P0);
        a8Var.O0 = f(a8Var.O0);
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
