package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i10) {
            case 0:
                boolean z4 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.b.getContainer().removeView(chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.M = null;
                break;
            case 1:
                chatAttachAlertPhotoLayout.w.setVisibility(8);
                break;
            case 2:
                chatAttachAlertPhotoLayout.D.l();
                break;
            case 3:
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.k0 = null;
                break;
            case 4:
                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.k0 = null;
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
