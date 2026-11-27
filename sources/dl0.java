// default package

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dl0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl0(Object obj, byte b) {
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
                ((jl0) obj).getOutline(outline);
                break;
            case 1:
                tt ttVar = (tt) obj;
                rr0 rr0Var = (rr0) ttVar.c;
                RectF rectF = (RectF) ttVar.b;
                k43 k43Var = rr0.F;
                rr0Var.h0(rectF);
                fp fpVar = rr0Var.s;
                if (fpVar != null) {
                    float height = ((RectF) fpVar.a).height() / 2.0f;
                    float l0 = rr0Var.l0();
                    r5 = Math.min(hl.R1(height, l0, rr0Var.x), Math.max(height, l0));
                }
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, r5);
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((o91) obj).d);
                break;
            case 3:
                zu1 zu1Var = (zu1) obj;
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
                    outline.setOval(0, 0, hl.b3(zu1Var.f8(), zu1Var.U7()), hl.b3(zu1Var.f8(), zu1Var.U7()));
                    break;
                }
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                float f = n12Var.D2[1];
                mb1 mb1Var = n12Var.B4;
                int min = (int) Math.min((n12Var.b.getTranslationY() + ((f - (mb1Var != null ? mb1Var.d() + hl.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = hl.U1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z = chatAttachAlertPhotoLayout.e0;
                if (z) {
                    RectF rectF2 = hl.P;
                    float f2 = chatAttachAlertPhotoLayout.o1;
                    float f3 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF2.set((0.0f * f3) + f2, (f3 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, Math.min(min, (int) rectF2.bottom));
                    break;
                } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                    int L = hl.L(16.0f);
                    outline.setRoundRect(0, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
                break;
            case 5:
                d88 d88Var = (d88) view;
                if (d88Var.getTag() != null) {
                    int intValue = ((Integer) d88Var.getTag()).intValue();
                    u52 u52Var = (u52) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = u52Var.w;
                    if (u52Var.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = hl.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
                        int L3 = hl.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 6:
                outline.setRoundRect(0, ((m57) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), hl.L(8.0f));
                break;
            case 7:
                int L4 = hl.L(12.0f);
                aVar = ((e) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, hl.L(12.0f) + aVar.getBottom(), view.getWidth() - hl.L(12.0f), hl.L(16.0f) + view.getMeasuredHeight(), hl.L(16.0f));
                break;
            case 8:
                ujc ujcVar = (ujc) obj;
                float f4 = ujcVar.R;
                if (f4 >= 0.0f) {
                    if (f4 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), ujcVar.R);
                        break;
                    }
                } else if (ujcVar.N) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), ujcVar.N ? hl.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            default:
                hmc hmcVar = (hmc) obj;
                float f5 = hmcVar.b;
                float f6 = hmcVar.P;
                if (f5 < 1.0f) {
                    outline.setRect((int) f6, (int) hmcVar.O, (int) (view.getMeasuredWidth() - hmcVar.P), (int) (view.getMeasuredHeight() - hmcVar.O));
                    break;
                } else {
                    outline.setRoundRect((int) f6, (int) hmcVar.O, (int) (view.getMeasuredWidth() - hmcVar.P), (int) (view.getMeasuredHeight() - hmcVar.O), hmcVar.b);
                    break;
                }
        }
    }
}
