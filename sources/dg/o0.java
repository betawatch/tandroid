package dg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o0 implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ e1 b;

    public o0(e1 e1Var, li liVar) {
        this.b = e1Var;
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = liVar.g0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            e1 e1Var = this.b;
            e1Var.f0(e1Var.h0(str, true));
            liVar.dismiss();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean V() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void C() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void G(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
