// default package

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oc7 {
    public final int a;
    public final HashSet b = new HashSet();
    public boolean c;
    public boolean d;

    public oc7(int i) {
        this.a = i;
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
        getsavedmusicids.hash = 0L;
        ConnectionsManager.getInstance(i).sendRequest(getsavedmusicids, new w15(this, (byte) 13));
    }
}
