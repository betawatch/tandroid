package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class yg implements Vector.TLDeserializer, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;

    public /* synthetic */ yg(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.a) {
            case 2:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(e2Var, i10);
    }
}
