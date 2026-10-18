package dh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import ei.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.o5;
import w7.i6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).j;
                d.h(outline, cVar.m, cVar.b);
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                float f7 = tiVar.J0[1];
                i iVar = tiVar.E2;
                int min = (int) Math.min((tiVar.getContainerView().getTranslationY() + ((f7 - (iVar != null ? iVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
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
                break;
            case 2:
                int i11 = ((m60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 3:
                outline.setRoundRect(0, ((ic0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 4:
                s1 s1Var = (s1) obj;
                float f12 = s1Var.Q;
                if (f12 < 0.0f) {
                    if (!s1Var.M) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.M ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f12 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.Q);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 5:
                q2 q2Var = (q2) obj;
                if (q2Var.b >= 1.0f) {
                    outline.setRoundRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N), q2Var.b);
                    break;
                } else {
                    outline.setRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N));
                    break;
                }
            case 6:
                int dp2 = AndroidUtilities.dp(12.0f);
                kVar = ((n2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + kVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
            default:
                o5 o5Var = (o5) obj;
                i6.a(o5Var.c, view.getWidth(), view.getHeight());
                outline.setConvexPath(o5Var.c);
                break;
        }
    }
}
