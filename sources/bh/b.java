package bh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import bi.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                yi yiVar = chatAttachAlertPhotoLayout.b;
                float f7 = yiVar.G0[1];
                k kVar = yiVar.B2;
                int min = (int) Math.min((yiVar.getContainerView().getTranslationY() + ((f7 - (kVar != null ? kVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.d0;
                if (!z10) {
                    if (!z10 && !chatAttachAlertPhotoLayout.b0) {
                        int dp = AndroidUtilities.dp(16.0f);
                        boolean z11 = ChatAttachAlertPhotoLayout.q1;
                        outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                        break;
                    }
                } else {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = chatAttachAlertPhotoLayout.n1;
                    boolean z12 = ChatAttachAlertPhotoLayout.q1;
                    float f11 = 1.0f - chatAttachAlertPhotoLayout.e0;
                    rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                }
            case 2:
                int i11 = ((f60) obj).N0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 3:
                outline.setRoundRect(0, ((yb0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 4:
                t1 t1Var = (t1) obj;
                float f12 = t1Var.Q;
                if (f12 < 0.0f) {
                    if (!t1Var.M) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.M ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f12 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.Q);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 5:
                r2 r2Var = (r2) obj;
                if (r2Var.b >= 1.0f) {
                    outline.setRoundRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N), r2Var.b);
                    break;
                } else {
                    outline.setRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N));
                    break;
                }
            default:
                int dp2 = AndroidUtilities.dp(12.0f);
                lVar = ((p2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + lVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
        }
    }
}
