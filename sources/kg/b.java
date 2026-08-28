package kg;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import kh.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        k kVar;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.m, cVar.b);
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                float f10 = kiVar.C0[1];
                i iVar = kiVar.x2;
                int min = (int) Math.min((kiVar.getContainerView().getTranslationY() + ((f10 - (iVar != null ? iVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY(), view.getMeasuredHeight());
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
                    float f11 = chatAttachAlertPhotoLayout.j1;
                    boolean z12 = ChatAttachAlertPhotoLayout.m1;
                    float f12 = 1.0f - chatAttachAlertPhotoLayout.a0;
                    rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.g1, chatAttachAlertPhotoLayout.i1, chatAttachAlertPhotoLayout.h1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                }
            case 2:
                int i10 = ((f50) obj).J0;
                outline.setOval(0, 0, i10, i10);
                break;
            case 3:
                outline.setRoundRect(0, ((wa0) obj).P + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 4:
                s1 s1Var = (s1) obj;
                float f13 = s1Var.M;
                if (f13 < 0.0f) {
                    if (!s1Var.I) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.I ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f13 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.M);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 5:
                r2 r2Var = (r2) obj;
                if (r2Var.b >= 1.0f) {
                    outline.setRoundRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J), r2Var.b);
                    break;
                } else {
                    outline.setRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J));
                    break;
                }
            default:
                int dp2 = AndroidUtilities.dp(12.0f);
                kVar = ((o2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + kVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
        }
    }
}
