// default package

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cw8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ cw8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                ((gw8) dVar).c0();
                break;
            default:
                ((asc) dVar).k0(true);
                break;
        }
    }
}
