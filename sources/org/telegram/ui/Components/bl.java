package org.telegram.ui.Components;

import android.os.Build;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ bl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i7) {
            case 0:
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.c.removeView(chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.P = null;
                break;
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 3:
                chatAttachAlertPhotoLayout.x.setVisibility(8);
                break;
            case 4:
                chatAttachAlertPhotoLayout.G.f();
                break;
            case 5:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                ci ciVar = chatAttachAlertPhotoLayout.b;
                if (f0.d.b(ciVar.Z1.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.l0();
                    break;
                } else {
                    try {
                        ciVar.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                ci ciVar2 = chatAttachAlertPhotoLayout.b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ciVar2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        ciVar2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
