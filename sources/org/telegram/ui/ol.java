package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ol extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                un unVar = (un) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.W0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < 4; i12++) {
                        i11 = Math.max(i11, iArr[i12]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i11);
                    break;
                } else {
                    outline.setOval(0, 0, org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()), org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()));
                    break;
                }
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                org.telegram.ui.Components.bi biVar = chatAttachAlertPhotoLayout.b;
                float f7 = biVar.A2[1];
                org.telegram.ui.Components.oh ohVar = biVar.y4;
                int min = (int) Math.min((biVar.b.getTranslationY() + ((f7 - (ohVar != null ? ohVar.d() + org.telegram.messenger.i0.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.d0) {
                    min = org.telegram.messenger.i0.W1(chatAttachAlertPhotoLayout.e0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.d0;
                if (z10) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f10 = chatAttachAlertPhotoLayout.n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.q1;
                    float f11 = 1.0f - chatAttachAlertPhotoLayout.e0;
                    rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                } else if (!z10 && !chatAttachAlertPhotoLayout.b0) {
                    int L = org.telegram.messenger.i0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                if (v5Var.getTag() != null) {
                    int intValue = ((Integer) v5Var.getTag()).intValue();
                    org.telegram.ui.Components.bm bmVar = (org.telegram.ui.Components.bm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = bmVar.w;
                    if (bmVar.d && chatAttachAlertPhotoLayout2.T0 == chatAttachAlertPhotoLayout2.U0 && !chatAttachAlertPhotoLayout2.O0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.g1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = org.telegram.messenger.i0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.M0 - 1) {
                        int L3 = org.telegram.messenger.i0.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 3:
                int i13 = ((org.telegram.ui.Components.e50) obj).W0;
                outline.setOval(0, 0, i13, i13);
                break;
            case 4:
                outline.setRoundRect(0, ((org.telegram.ui.Components.ua0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(8.0f));
                break;
            case 5:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) obj;
                float f12 = b1Var.Q;
                if (f12 >= 0.0f) {
                    if (f12 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), b1Var.Q);
                        break;
                    }
                } else if (b1Var.M) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), b1Var.M ? org.telegram.messenger.i0.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 6:
                org.telegram.ui.Components.voip.y1 y1Var = (org.telegram.ui.Components.voip.y1) obj;
                if (y1Var.b < 1.0f) {
                    outline.setRect((int) y1Var.O, (int) y1Var.N, (int) (view.getMeasuredWidth() - y1Var.O), (int) (view.getMeasuredHeight() - y1Var.N));
                    break;
                } else {
                    outline.setRoundRect((int) y1Var.O, (int) y1Var.N, (int) (view.getMeasuredWidth() - y1Var.O), (int) (view.getMeasuredHeight() - y1Var.N), y1Var.b);
                    break;
                }
            case 7:
                int L4 = org.telegram.messenger.i0.L(12.0f);
                lVar = ((org.telegram.ui.ActionBar.k2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, org.telegram.messenger.i0.L(12.0f) + lVar.getBottom(), view.getWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.L(16.0f));
                break;
            default:
                vg.e eVar = ((vg.f) obj).M;
                vg.f.l(outline, eVar.m, eVar.b);
                break;
        }
    }
}
