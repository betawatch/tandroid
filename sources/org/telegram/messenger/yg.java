package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class yg implements org.telegram.ui.ActionBar.z1, Vector.TLDeserializer {
    public static /* bridge */ /* synthetic */ NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(a2Var, i10);
    }
}
