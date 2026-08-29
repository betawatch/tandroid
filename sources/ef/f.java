package ef;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final String b;
    public boolean c;

    public f(String str, int i10) {
        this.a = i10;
        this.b = str;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i10).uploadFile(str, false, true, ConnectionsManager.FileTypeAudio);
    }

    public final void a() {
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.c && str.equals(this.b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String fileExtension = FileLoader.getFileExtension(new File(inputFile.name));
                uploadringtone.mime_type = fileExtension;
                if ("ogg".equals(fileExtension)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new a(this, 1));
            }
        }
    }
}
