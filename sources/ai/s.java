package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class s extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(lx lxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = lxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, le.k
    public final void c(le.l lVar) {
        switch (this.d) {
            case 0:
                super.c(lVar);
                ((lx) this.e).invalidate();
                break;
            default:
                super.c(lVar);
                float totalVisibility = getTotalVisibility();
                x5 x5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (x5Var != null) {
                    x5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context, f6Var, mVar);
        this.e = kVar;
    }
}
