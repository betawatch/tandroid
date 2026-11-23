package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.voip.r1;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                bn bnVar = (bn) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.X0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        i10 = Math.max(i10, iArr[i11]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
                    break;
                } else {
                    outline.setOval(0, 0, g0.f3(bnVar.ba(), bnVar.S9()), g0.f3(bnVar.ba(), bnVar.S9()));
                    break;
                }
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                float f10 = tiVar.E2[1];
                hi.j jVar = tiVar.C4;
                int min = (int) Math.min((tiVar.b.getTranslationY() + ((f10 - (jVar != null ? jVar.d() + g0.L(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f11 = chatAttachAlertPhotoLayout.o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.r1;
                    float f12 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    break;
                } else if (!z10 && !chatAttachAlertPhotoLayout.c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    break;
                }
            case 3:
                r5 r5Var = (r5) view;
                if (r5Var.getTag() != null) {
                    int intValue = ((Integer) r5Var.getTag()).intValue();
                    hm hmVar = (hm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hmVar.w;
                    if (hmVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = g0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        break;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
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
                int i12 = ((z40) obj).X0;
                outline.setOval(0, 0, i12, i12);
                break;
            case 5:
                outline.setRoundRect(0, ((na0) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                break;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((org.telegram.ui.Components.voip.k) obj).d);
                break;
            case 7:
                r1 r1Var = (r1) obj;
                float f13 = r1Var.R;
                if (f13 >= 0.0f) {
                    if (f13 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        break;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), r1Var.R);
                        break;
                    }
                } else if (r1Var.N) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), r1Var.N ? g0.L(4.0f) : 0.0f);
                    break;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
            case 8:
                o2 o2Var = (o2) obj;
                if (o2Var.b < 1.0f) {
                    outline.setRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O));
                    break;
                } else {
                    outline.setRoundRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O), o2Var.b);
                    break;
                }
            default:
                int L4 = g0.L(12.0f);
                kVar = ((g2) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, g0.L(12.0f) + kVar.getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                break;
        }
    }
}
