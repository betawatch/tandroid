package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.b.getContainer().removeView(chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.L = null;
                break;
            case 1:
                chatAttachAlertPhotoLayout.w.setVisibility(8);
                break;
            case 2:
                chatAttachAlertPhotoLayout.C.l();
                break;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.j0 = null;
                break;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.j0 = null;
                break;
            case 5:
                ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout);
                break;
            default:
                ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout);
                break;
        }
    }
}
