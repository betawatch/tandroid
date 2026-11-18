package org.telegram.ui.Components;

import android.os.Build;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i7) {
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
                si siVar = chatAttachAlertPhotoLayout.b;
                if (f0.d.b(siVar.a2.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.l0();
                    break;
                } else {
                    try {
                        siVar.a2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z14 = ChatAttachAlertPhotoLayout.r1;
                si siVar2 = chatAttachAlertPhotoLayout.b;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        siVar2.a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        siVar2.a2.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
