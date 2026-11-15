package bi;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements gj0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        switch (this.a) {
            case 0:
                int i10 = e.W1;
                break;
            case 1:
                int i11 = y.w2;
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
                    q5Var.y.d(q5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i7, View view) {
    }
}
