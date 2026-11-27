// default package

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
