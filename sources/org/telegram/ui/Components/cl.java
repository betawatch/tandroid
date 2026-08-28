package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.a = i9;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i9) {
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
                chatAttachAlertPhotoLayout.s0(false);
                chatAttachAlertPhotoLayout.j0 = null;
                break;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.s0(false);
                chatAttachAlertPhotoLayout.j0 = null;
                break;
            case 5:
                ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout);
                break;
            default:
                ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout);
                break;
        }
    }
}
