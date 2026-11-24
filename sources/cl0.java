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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cl0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cl0(Object obj, byte b) {
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
                ((il0) obj).getOutline(outline);
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((f91) obj).d);
                break;
            case 2:
                mu1 mu1Var = (mu1) obj;
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
                    outline.setOval(0, 0, gl.b3(mu1Var.W7(), mu1Var.M7()), gl.b3(mu1Var.W7(), mu1Var.M7()));
                    break;
                }
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                float f = x02Var.D2[1];
                eb1 eb1Var = x02Var.B4;
                int min = (int) Math.min((x02Var.b.getTranslationY() + ((f - (eb1Var != null ? eb1Var.d() + gl.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = gl.U1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z = chatAttachAlertPhotoLayout.e0;
                if (z) {
                    RectF rectF = gl.P;
                    float f2 = chatAttachAlertPhotoLayout.o1;
                    float f3 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF.set((f3 * 0.0f) + f2, (f3 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                    int L = gl.L(16.0f);
                    outline.setRoundRect(0, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
                break;
            case 4:
                o48 o48Var = (o48) view;
                if (o48Var.getTag() != null) {
                    int intValue = ((Integer) o48Var.getTag()).intValue();
                    e52 e52Var = (e52) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = e52Var.w;
                    if (e52Var.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = gl.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
                        int L3 = gl.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        break;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 5:
                outline.setRoundRect(0, ((f37) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), gl.L(8.0f));
                break;
            case 6:
                int L4 = gl.L(12.0f);
                aVar = ((d) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, gl.L(12.0f) + aVar.getBottom(), view.getWidth() - gl.L(12.0f), gl.L(16.0f) + view.getMeasuredHeight(), gl.L(16.0f));
                break;
            case 7:
                pfc pfcVar = (pfc) obj;
                float f4 = pfcVar.R;
                if (f4 >= 0.0f) {
                    if (f4 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), pfcVar.R);
                        break;
                    }
                } else if (pfcVar.N) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), pfcVar.N ? gl.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            default:
                aic aicVar = (aic) obj;
                float f5 = aicVar.b;
                float f6 = aicVar.P;
                if (f5 < 1.0f) {
                    outline.setRect((int) f6, (int) aicVar.O, (int) (view.getMeasuredWidth() - aicVar.P), (int) (view.getMeasuredHeight() - aicVar.O));
                    break;
                } else {
                    outline.setRoundRect((int) f6, (int) aicVar.O, (int) (view.getMeasuredWidth() - aicVar.P), (int) (view.getMeasuredHeight() - aicVar.O), aicVar.b);
                    break;
                }
        }
    }
}
