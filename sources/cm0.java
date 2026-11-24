// default package

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cm0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cm0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        a aVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((im0) obj).getOutline(outline);
                break;
            case 1:
                su suVar = (su) obj;
                rs0 rs0Var = (rs0) suVar.c;
                RectF rectF = (RectF) suVar.b;
                d53 d53Var = rs0.F;
                rs0Var.i0(rectF);
                eq eqVar = rs0Var.s;
                if (eqVar != null) {
                    float height = ((RectF) eqVar.a).height() / 2.0f;
                    float m0 = rs0Var.m0();
                    r5 = Math.min(gm.R1(height, m0, rs0Var.x), Math.max(height, m0));
                }
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, r5);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((oa1) obj).d);
                break;
            case 3:
                yv1 yv1Var = (yv1) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.X0;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        i = Math.max(i, iArr[i2]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i);
                    break;
                } else {
                    outline.setOval(0, 0, gm.b3(yv1Var.f8(), yv1Var.U7()), gm.b3(yv1Var.f8(), yv1Var.U7()));
                    break;
                }
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                float f = i22Var.D2[1];
                lc1 lc1Var = i22Var.B4;
                int min = (int) Math.min((i22Var.b.getTranslationY() + ((f - (lc1Var != null ? lc1Var.d() + gm.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = gm.U1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z = chatAttachAlertPhotoLayout.e0;
                if (z) {
                    RectF rectF2 = gm.P;
                    float f2 = chatAttachAlertPhotoLayout.o1;
                    float f3 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF2.set((0.0f * f3) + f2, (f3 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, Math.min(min, (int) rectF2.bottom));
                    break;
                } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                    int L = gm.L(16.0f);
                    outline.setRoundRect(0, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
                break;
            case 5:
                q68 q68Var = (q68) view;
                if (q68Var.getTag() != null) {
                    int intValue = ((Integer) q68Var.getTag()).intValue();
                    p62 p62Var = (p62) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = p62Var.w;
                    if (p62Var.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = gm.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
                        int L3 = gm.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 6:
                outline.setRoundRect(0, ((f57) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), gm.L(8.0f));
                break;
            case 7:
                int L4 = gm.L(12.0f);
                aVar = ((d) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, gm.L(12.0f) + aVar.getBottom(), view.getWidth() - gm.L(12.0f), gm.L(16.0f) + view.getMeasuredHeight(), gm.L(16.0f));
                break;
            case 8:
                phc phcVar = (phc) obj;
                float f4 = phcVar.R;
                if (f4 >= 0.0f) {
                    if (f4 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), phcVar.R);
                        break;
                    }
                } else if (phcVar.N) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), phcVar.N ? gm.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            default:
                akc akcVar = (akc) obj;
                float f5 = akcVar.b;
                float f6 = akcVar.P;
                if (f5 < 1.0f) {
                    outline.setRect((int) f6, (int) akcVar.O, (int) (view.getMeasuredWidth() - akcVar.P), (int) (view.getMeasuredHeight() - akcVar.O));
                    break;
                } else {
                    outline.setRoundRect((int) f6, (int) akcVar.O, (int) (view.getMeasuredWidth() - akcVar.P), (int) (view.getMeasuredHeight() - akcVar.O), akcVar.b);
                    break;
                }
        }
    }
}
