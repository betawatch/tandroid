package lh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.il0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements il0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                int i11 = d.X;
                break;
            case 1:
                int i12 = s.x0;
                break;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    break;
                }
                break;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.w.b(t5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
