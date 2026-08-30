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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnSuccessListener, GenericProvider, org.telegram.ui.ActionBar.c2, Vector.TLDeserializer {
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
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        switch (this.a) {
            case 26:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i10, z4);
            case 27:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z4);
            case 28:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i10, z4);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        d2Var.dismiss();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        String lambda$formatSpannableSimple$15;
        String lambda$formatSpannable$16;
        TLRPC.MessageEntity lambda$getEntities$181;
        TLRPC.MessageEntity lambda$getEntities$182;
        TLRPC.MessageEntity lambda$getEntities$183;
        TLRPC.MessageEntity lambda$getEntities$184;
        switch (this.a) {
            case 3:
                lambda$formatSpannableSimple$15 = AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
                return lambda$formatSpannableSimple$15;
            case 4:
                lambda$formatSpannable$16 = AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
                return lambda$formatSpannable$16;
            case 22:
                lambda$getEntities$181 = MediaDataController.lambda$getEntities$181((Void) obj);
                return lambda$getEntities$181;
            case 23:
                lambda$getEntities$182 = MediaDataController.lambda$getEntities$182((Void) obj);
                return lambda$getEntities$182;
            case 24:
                lambda$getEntities$183 = MediaDataController.lambda$getEntities$183((Void) obj);
                return lambda$getEntities$183;
            default:
                lambda$getEntities$184 = MediaDataController.lambda$getEntities$184((Void) obj);
                return lambda$getEntities$184;
        }
    }
}
