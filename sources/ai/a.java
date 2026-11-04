package ai;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements fj0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        switch (this.a) {
            case 0:
                int i10 = g.T1;
                break;
            case 1:
                int i11 = e0.t2;
                break;
            case 2:
                if (view instanceof org.telegram.ui.Cells.w) {
                    ((org.telegram.ui.Cells.w) view).a();
                    break;
                }
                break;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.y.c(q5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i3, View view) {
    }
}
