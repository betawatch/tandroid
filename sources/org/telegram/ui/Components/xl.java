package org.telegram.ui.Components;

import android.os.Build;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 4:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.u0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 5:
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                if (f0.c.b(tiVar.f0.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.j0();
                    break;
                } else {
                    try {
                        tiVar.f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        tiVar2.f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        tiVar2.f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
