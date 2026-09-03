package kh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements hl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.w.b(s5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i10, View view) {
    }
}
