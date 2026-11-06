package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((g) obj).getOutline(outline);
                break;
            case 1:
                an anVar = (an) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.W0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        i10 = Math.max(i10, iArr[i11]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
                    break;
                } else {
                    outline.setOval(0, 0, g0.g3(anVar.Z9(), anVar.Q9()), g0.g3(anVar.Z9(), anVar.Q9()));
                    break;
                }
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                di diVar = chatAttachAlertPhotoLayout.b;
                float f10 = diVar.A2[1];
                fi.i iVar = diVar.y4;
                int min = (int) Math.min((diVar.b.getTranslationY() + ((f10 - (iVar != null ? iVar.d() + g0.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.d0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.e0, min, view.getMeasuredHeight());
                }
                boolean z9 = chatAttachAlertPhotoLayout.d0;
                if (z9) {
                    RectF rectF = g0.P;
                    float f11 = chatAttachAlertPhotoLayout.n1;
                    boolean z10 = ChatAttachAlertPhotoLayout.q1;
                    float f12 = 1.0f - chatAttachAlertPhotoLayout.e0;
                    rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                } else if (!z9 && !chatAttachAlertPhotoLayout.b0) {
                    int L = g0.L(16.0f);
                    boolean z11 = ChatAttachAlertPhotoLayout.q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
            case 3:
                q5 q5Var = (q5) view;
                if (q5Var.getTag() != null) {
                    int intValue = ((Integer) q5Var.getTag()).intValue();
                    tl tlVar = (tl) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = tlVar.w;
                    if (tlVar.d && chatAttachAlertPhotoLayout2.T0 == chatAttachAlertPhotoLayout2.U0 && !chatAttachAlertPhotoLayout2.O0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.g1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = g0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.M0 - 1) {
                        int L3 = g0.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 4:
                int i12 = ((o40) obj).W0;
                outline.setOval(0, 0, i12, i12);
                break;
            case 5:
                outline.setRoundRect(0, ((ca0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                break;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((org.telegram.ui.Components.voip.k) obj).d);
                break;
            case 7:
                n1 n1Var = (n1) obj;
                float f13 = n1Var.Q;
                if (f13 >= 0.0f) {
                    if (f13 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), n1Var.Q);
                        break;
                    }
                } else if (n1Var.M) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), n1Var.M ? g0.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 8:
                k2 k2Var = (k2) obj;
                if (k2Var.b < 1.0f) {
                    outline.setRect((int) k2Var.O, (int) k2Var.N, (int) (view.getMeasuredWidth() - k2Var.O), (int) (view.getMeasuredHeight() - k2Var.N));
                    break;
                } else {
                    outline.setRoundRect((int) k2Var.O, (int) k2Var.N, (int) (view.getMeasuredWidth() - k2Var.O), (int) (view.getMeasuredHeight() - k2Var.N), k2Var.b);
                    break;
                }
            default:
                int L4 = g0.L(12.0f);
                kVar = ((f2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, g0.L(12.0f) + kVar.getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                break;
        }
    }
}
