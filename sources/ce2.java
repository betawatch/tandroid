// default package

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ce2 implements RequestDelegate {
    public final /* synthetic */ byte a;

    public /* synthetic */ ce2(byte b) {
        this.a = b;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 1;
        switch (this.a) {
            case 0:
                break;
            case 1:
                gl.c3(new jc((byte) 10));
                break;
            case 2:
                gl.c3(new ki1(tL_error, b));
                break;
            case 3:
                gl.c3(new x57(tLObject, b));
                break;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                break;
            case 5:
                gl.c3(new jc((byte) 10));
                break;
            case 6:
                gl.c3(new jc((byte) 10));
                break;
            case 7:
                gl.c3(new jc((byte) 10));
                break;
            case 8:
                gl.c3(new jc((byte) 10));
                break;
            case 9:
                gl.c3(new jc((byte) 10));
                break;
            case 10:
                gl.c3(new jc((byte) 10));
                break;
            case 11:
                gl.c3(new jc((byte) 10));
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
