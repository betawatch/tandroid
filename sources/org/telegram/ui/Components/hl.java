package org.telegram.ui.Components;

import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                chatAttachAlertPhotoLayout.b.c.removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                break;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 3:
                chatAttachAlertPhotoLayout.x.setVisibility(8);
                break;
            case 4:
                chatAttachAlertPhotoLayout.G.f();
                break;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (f0.c.b(biVar.W1.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.j0();
                    break;
                } else {
                    try {
                        biVar.W1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.q1;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        biVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        biVar2.W1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
