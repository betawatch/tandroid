// default package

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
