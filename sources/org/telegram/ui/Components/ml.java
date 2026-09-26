package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i10) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.getContainer().removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                break;
            case 1:
                chatAttachAlertPhotoLayout.w.setVisibility(8);
                break;
            case 2:
                chatAttachAlertPhotoLayout.G.l();
                break;
            case 3:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.t0(false);
                chatAttachAlertPhotoLayout.n0 = null;
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
