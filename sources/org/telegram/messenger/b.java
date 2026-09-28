package org.telegram.messenger;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnSuccessListener, GenericProvider, org.telegram.ui.ActionBar.z1, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    public static /* bridge */ /* synthetic */ RenderNode c(Object obj) {
        return (RenderNode) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.a) {
            case 26:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i10, z10);
            case 27:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
            case 28:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        String lambda$formatSpannableSimple$15;
        String lambda$formatSpannable$16;
        TLRPC.MessageEntity lambda$getEntities$182;
        TLRPC.MessageEntity lambda$getEntities$183;
        TLRPC.MessageEntity lambda$getEntities$184;
        TLRPC.MessageEntity lambda$getEntities$185;
        switch (this.a) {
            case 3:
                lambda$formatSpannableSimple$15 = AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
                return lambda$formatSpannableSimple$15;
            case 4:
                lambda$formatSpannable$16 = AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
                return lambda$formatSpannable$16;
            case 22:
                lambda$getEntities$182 = MediaDataController.lambda$getEntities$182((Void) obj);
                return lambda$getEntities$182;
            case 23:
                lambda$getEntities$183 = MediaDataController.lambda$getEntities$183((Void) obj);
                return lambda$getEntities$183;
            case 24:
                lambda$getEntities$184 = MediaDataController.lambda$getEntities$184((Void) obj);
                return lambda$getEntities$184;
            default:
                lambda$getEntities$185 = MediaDataController.lambda$getEntities$185((Void) obj);
                return lambda$getEntities$185;
        }
    }
}
