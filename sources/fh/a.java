package fh;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.mk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        switch (this.a) {
            case 0:
                int i10 = d.W;
                break;
            case 1:
                int i11 = x.w0;
                break;
            case 2:
                if (view instanceof org.telegram.ui.Cells.x) {
                    ((org.telegram.ui.Cells.x) view).a();
                    break;
                }
                break;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.w.d(t5Var);
                    break;
                }
                break;
        }
    }

    private final void b(int i9, View view) {
    }
}
