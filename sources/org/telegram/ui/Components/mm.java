package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.m0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                chatAttachAlertPhotoLayout.f1.unlock();
                chatAttachAlertPhotoLayout.d0 = false;
                um umVar = chatAttachAlertPhotoLayout.P;
                if (umVar != null) {
                    umVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.b0) {
                    chatAttachAlertPhotoLayout.b.c2.P0();
                }
                um umVar2 = chatAttachAlertPhotoLayout.P;
                if (umVar2 != null) {
                    umVar2.setSystemUiVisibility(1028);
                }
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (kmVar != null) {
                    kmVar.invalidate();
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b;
                ja1 ja1Var = chatAttachAlertPhotoLayout2.l0;
                chatAttachAlertPhotoLayout2.f1.unlock();
                chatAttachAlertPhotoLayout2.i1 = false;
                chatAttachAlertPhotoLayout2.b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.d0 = false;
                km kmVar2 = chatAttachAlertPhotoLayout2.E;
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
                um umVar3 = chatAttachAlertPhotoLayout2.P;
                if (umVar3 != null) {
                    umVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ja1Var != null) {
                    ja1Var.setVisibility(8);
                    ja1Var.setTag(null);
                }
                km kmVar3 = chatAttachAlertPhotoLayout2.r;
                if (kmVar3 != null) {
                    kmVar3.setVisibility(8);
                }
                um umVar4 = chatAttachAlertPhotoLayout2.P;
                if (umVar4 != null) {
                    umVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}
