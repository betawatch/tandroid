package of;

import java.io.File;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements us {
    public final int a;
    public final String b;
    public boolean c;

    public d(String str, int i10) {
        this.a = i10;
        this.b = str;
        zs.f(i10).b(this, zs.U1);
        zs.f(i10).b(this, zs.V1);
        b8.G(i10).i0(false, ConnectionsManager.FileTypeAudio, str, true);
    }

    public final void a() {
        int i10 = this.a;
        zs.f(i10).n(this, zs.U1);
        zs.f(i10).n(this, zs.V1);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.U1) {
            String str = (String) objArr[0];
            if (!this.c && str.equals(this.b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String D = b8.D(new File(inputFile.name));
                uploadringtone.mime_type = D;
                if ("ogg".equals(D)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.a).sendRequest(uploadringtone, new ag.c(this, 12));
            }
        }
    }
}
