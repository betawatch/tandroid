// default package

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class hm9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final /* synthetic */ nm9 a;

    public /* synthetic */ hm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public final void run(long j, int[] iArr) {
        nm9 nm9Var = this.a;
        if (nm9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = nm9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = tb4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(nm9Var.e).sendRequest(getgroupparticipants, new w47((Object) nm9Var, (Object) iArr, j, (byte) 14));
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
