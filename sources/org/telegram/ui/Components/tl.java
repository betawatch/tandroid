package org.telegram.ui.Components;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tl extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.ActionBar.k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                mi miVar = chatAttachAlertPhotoLayout.b;
                float f10 = miVar.D0[1];
                zh zhVar = miVar.y2;
                int min = (int) Math.min((miVar.getContainerView().getTranslationY() + ((f10 - (zhVar != null ? zhVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.V) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.a0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.b0);
                }
                boolean z4 = chatAttachAlertPhotoLayout.a0;
                if (!z4) {
                    if (!z4 && !chatAttachAlertPhotoLayout.V) {
                        int dp = AndroidUtilities.dp(16.0f);
                        boolean z10 = ChatAttachAlertPhotoLayout.n1;
                        outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.T, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                        break;
                    }
                } else {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = chatAttachAlertPhotoLayout.k1;
                    boolean z11 = ChatAttachAlertPhotoLayout.n1;
                    float f12 = 1.0f - chatAttachAlertPhotoLayout.b0;
                    rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.h1, chatAttachAlertPhotoLayout.j1, chatAttachAlertPhotoLayout.i1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                }
                break;
            case 1:
                int i11 = ((z50) obj).K0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 2:
                outline.setRoundRect(0, ((sb0) obj).Q + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 3:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) obj;
                float f13 = t1Var.N;
                if (f13 < 0.0f) {
                    if (!t1Var.J) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.J ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f13 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.N);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) obj;
                if (t2Var.b >= 1.0f) {
                    outline.setRoundRect((int) t2Var.L, (int) t2Var.K, (int) (view.getMeasuredWidth() - t2Var.L), (int) (view.getMeasuredHeight() - t2Var.K), t2Var.b);
                    break;
                } else {
                    outline.setRect((int) t2Var.L, (int) t2Var.K, (int) (view.getMeasuredWidth() - t2Var.L), (int) (view.getMeasuredHeight() - t2Var.K));
                    break;
                }
            case 5:
                int dp2 = AndroidUtilities.dp(12.0f);
                kVar = ((org.telegram.ui.ActionBar.p2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + kVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
            default:
                qg.a aVar = ((qg.b) obj).h;
                qg.b.h(outline, aVar.m, aVar.b);
                break;
        }
    }
}
