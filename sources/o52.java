// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o52 implements gu2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ o52(byte b) {
        this.a = b;
    }

    @Override // gu2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    q68Var.c(q68Var.getPhotoEntry() != null && q68Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    q68Var.setHighQuality(q68Var.getPhotoEntry() != null && q68Var.getPhotoEntry().c());
                    q68Var.f(q68Var.getPhotoEntry() != null ? q68Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof wu9) {
                    ((wu9) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof wu9) {
                    ((wu9) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
