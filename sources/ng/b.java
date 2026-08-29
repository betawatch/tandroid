package ng;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import nh.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        l lVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.m, cVar.b);
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ni niVar = chatAttachAlertPhotoLayout.b;
                float f9 = niVar.C0[1];
                i iVar = niVar.x2;
                int min = (int) Math.min((niVar.getContainerView().getTranslationY() + ((f9 - (iVar != null ? iVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.U) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.W) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.a0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.W;
                if (!z10) {
                    if (!z10 && !chatAttachAlertPhotoLayout.U) {
                        int dp = AndroidUtilities.dp(16.0f);
                        boolean z11 = ChatAttachAlertPhotoLayout.m1;
                        outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.S, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                        break;
                    }
                } else {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = chatAttachAlertPhotoLayout.j1;
                    boolean z12 = ChatAttachAlertPhotoLayout.m1;
                    float f11 = 1.0f - chatAttachAlertPhotoLayout.a0;
                    rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.g1, chatAttachAlertPhotoLayout.i1, chatAttachAlertPhotoLayout.h1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                }
            case 2:
                int i11 = ((s50) obj).J0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 3:
                outline.setRoundRect(0, ((lb0) obj).P + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 4:
                t1 t1Var = (t1) obj;
                float f12 = t1Var.M;
                if (f12 < 0.0f) {
                    if (!t1Var.I) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.I ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f12 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.M);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 5:
                u2 u2Var = (u2) obj;
                if (u2Var.b >= 1.0f) {
                    outline.setRoundRect((int) u2Var.K, (int) u2Var.J, (int) (view.getMeasuredWidth() - u2Var.K), (int) (view.getMeasuredHeight() - u2Var.J), u2Var.b);
                    break;
                } else {
                    outline.setRect((int) u2Var.K, (int) u2Var.J, (int) (view.getMeasuredWidth() - u2Var.K), (int) (view.getMeasuredHeight() - u2Var.J));
                    break;
                }
            default:
                int dp2 = AndroidUtilities.dp(12.0f);
                lVar = ((o2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + lVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
        }
    }
}
