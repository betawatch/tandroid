// default package

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
