// default package

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nf2 implements RequestDelegate {
    public final /* synthetic */ byte a;

    public /* synthetic */ nf2(byte b) {
        this.a = b;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 1;
        switch (this.a) {
            case 0:
                break;
            case 1:
                gm.c3(new jd((byte) 10));
                break;
            case 2:
                gm.c3(new sj1(tL_error, b));
                break;
            case 3:
                gm.c3(new m87(tLObject, b));
                break;
            case 4:
                RectF rectF = ProfileActivity.e7;
                break;
            case 5:
                gm.c3(new jd((byte) 10));
                break;
            case 6:
                gm.c3(new jd((byte) 10));
                break;
            case 7:
                gm.c3(new jd((byte) 10));
                break;
            case 8:
                gm.c3(new jd((byte) 10));
                break;
            case 9:
                gm.c3(new jd((byte) 10));
                break;
            case 10:
                gm.c3(new jd((byte) 10));
                break;
            case 11:
                gm.c3(new jd((byte) 10));
                break;
            case 12:
                VoIPService.lambda$callFailed$110(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$createGroupInstance$70(tLObject, tL_error);
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
