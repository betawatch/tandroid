// default package

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ji1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ji1(lv3 lv3Var, boolean z, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = (byte) 4;
        this.c = lv3Var;
        this.b = z;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gl.c3(new z2a((KeyEvent.Callback) obj3, tL_error, obj, obj2, this.b, tLObject, (byte) 2));
                break;
            case 1:
                gl.c3(new z77(obj3, obj, (Object) tLObject, obj2, this.b, (byte) 7));
                break;
            case 2:
                gl.c3(new z2a((c92) obj3, (TLRPC.TL_channels_toggleUsername) obj, tLObject, (TLRPC.TL_username) obj2, this.b, tL_error));
                break;
            case 3:
                gl.c3(new z2a((q03) obj3, tLObject, (u41) obj, this.b, (HashSet) obj2, tL_error));
                break;
            case 4:
                gl.c3(new z77(obj3, (Object) tLObject, this.b, obj, obj2, (byte) 11));
                break;
            case 5:
                gl.c3(new z77(obj3, obj, this.b, obj2, (Object) tLObject, (byte) 12));
                break;
            case 6:
                gl.c3(new z77(obj3, (Object) tLObject, obj, this.b, obj2, (byte) 13));
                break;
            default:
                gl.c3(new z2a((KeyEvent.Callback) obj3, tL_error, obj2, obj, this.b, tLObject, (byte) 12));
                break;
        }
    }

    public /* synthetic */ ji1(vqa vqaVar, m25 m25Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.a = (byte) 7;
        this.c = vqaVar;
        this.e = m25Var;
        this.d = twoStepVerificationActivity;
        this.b = z;
    }

    public /* synthetic */ ji1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ ji1(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
