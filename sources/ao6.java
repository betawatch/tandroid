// default package

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ao6 extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public ao6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        hl.c3(new hl3((Object) this, i, (byte) 22));
    }
}
