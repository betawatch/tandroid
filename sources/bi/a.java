package bi;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.oj0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements oj0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.y.e(s5Var);
                    break;
                }
                break;
        }
    }

    private final void a(int i7, View view) {
    }
}
