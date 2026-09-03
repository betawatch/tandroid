package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements org.telegram.ui.ActionBar.c2, Vector.TLDeserializer {
    public static /* bridge */ /* synthetic */ NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z4);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(d2Var, i10);
    }
}
