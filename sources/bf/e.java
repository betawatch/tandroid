package bf;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final String b;
    public boolean c;

    public e(String str, int i9) {
        this.a = i9;
        this.b = str;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i9).uploadFile(str, false, true, ConnectionsManager.FileTypeAudio);
    }

    public final void a() {
        int i9 = this.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileUploaded) {
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
