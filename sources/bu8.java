// default package

import android.content.ClipboardManager;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bu8 implements ClipboardManager.OnPrimaryClipChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ bu8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                ((fu8) dVar).b0();
                break;
            default:
                ((ypc) dVar).j0(true);
                break;
        }
    }
}
