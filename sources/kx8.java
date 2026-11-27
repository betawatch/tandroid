// default package

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ kx8(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                ((ox8) eVar).b0();
                break;
            default:
                ((muc) eVar).j0(true);
                break;
        }
    }
}
