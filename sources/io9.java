// default package

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class io9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final /* synthetic */ oo9 a;

    public /* synthetic */ io9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public final void run(long j, int[] iArr) {
        oo9 oo9Var = this.a;
        if (oo9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = oo9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = td4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(oo9Var.e).sendRequest(getgroupparticipants, new jb7((Object) oo9Var, (Object) iArr, j, (byte) 14));
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
