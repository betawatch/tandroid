package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
