package bg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p0 implements li {
    public final /* synthetic */ ni a;
    public final /* synthetic */ g1 b;

    public p0(g1 g1Var, ni niVar) {
        this.b = g1Var;
        this.a = niVar;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = niVar.f0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            g1 g1Var = this.b;
            g1Var.f0(g1Var.h0(str, true));
            niVar.dismiss();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean T1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
