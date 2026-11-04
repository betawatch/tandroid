package org.telegram.ui.Components;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ al(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.a = i3;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i3) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                break;
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                break;
            case 2:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                break;
            case 3:
                chatAttachAlertPhotoLayout.x.setVisibility(8);
                break;
            case 4:
                chatAttachAlertPhotoLayout.H.f();
                break;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (f0.d.b(biVar.X1.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.l0();
                    break;
                } else {
                    try {
                        biVar.X1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.r1;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        biVar2.X1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        biVar2.X1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
