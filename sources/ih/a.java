package ih;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements zk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                int i11 = d.W;
                break;
            case 1:
                int i12 = t.w0;
                break;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    break;
                }
                break;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    r5Var.w.d(r5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
