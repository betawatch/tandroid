package org.telegram.ui.Components;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sl extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sl(Object obj, int i10) {
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
                li liVar = chatAttachAlertPhotoLayout.b;
                float f10 = liVar.D0[1];
                zh zhVar = liVar.y2;
                int min = (int) Math.min((liVar.getContainerView().getTranslationY() + ((f10 - (zhVar != null ? zhVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY(), view.getMeasuredHeight());
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
                int i11 = ((x50) obj).K0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 2:
                outline.setRoundRect(0, ((qb0) obj).Q + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 3:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                float f13 = s1Var.N;
                if (f13 < 0.0f) {
                    if (!s1Var.J) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.J ? AndroidUtilities.dp(4.0f) : 0.0f);
                        break;
                    }
                } else if (f13 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.N);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) obj;
                if (s2Var.b >= 1.0f) {
                    outline.setRoundRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K), s2Var.b);
                    break;
                } else {
                    outline.setRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K));
                    break;
                }
            case 5:
                int dp2 = AndroidUtilities.dp(12.0f);
                kVar = ((org.telegram.ui.ActionBar.p2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(dp2, AndroidUtilities.dp(12.0f) + kVar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
            default:
                pg.a aVar = ((pg.b) obj).h;
                pg.b.h(outline, aVar.m, aVar.b);
                break;
        }
    }
}
