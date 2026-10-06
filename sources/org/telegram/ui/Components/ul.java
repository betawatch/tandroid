package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ul implements vv0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = d6Var;
        this.d = d3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.tl] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        em emVar = chatAttachAlertPhotoLayout.R;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        int i10 = xiVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.yn)) && !chatAttachAlertPhotoLayout.s0 && !xiVar.V && chatAttachAlertPhotoLayout.P != null && !xiVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.w0) {
                    org.telegram.messenger.bi.o(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(tr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                tr trVar = tr.f;
                duration.setInterpolator(trVar).start();
                chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(trVar).start();
                org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f0;
                this.a = AndroidUtilities.generateVideoPath((n2Var2 instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var2).v());
                AndroidUtilities.updateViewVisibilityAnimated(emVar, true);
                emVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.g0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.h0 = new Runnable(this) { // from class: org.telegram.ui.Components.tl
                    public final /* synthetic */ ul b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.h0 != null) {
                                    int i13 = chatAttachAlertPhotoLayout2.g0 + 1;
                                    chatAttachAlertPhotoLayout2.g0 = i13;
                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i13));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.h0, 1000L);
                                break;
                        }
                    }
                };
                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), this.a, xiVar.Q0 != 0, new s(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.tl
                    public final /* synthetic */ ul b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.h0 != null) {
                                    int i132 = chatAttachAlertPhotoLayout2.g0 + 1;
                                    chatAttachAlertPhotoLayout2.g0 = i132;
                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i132));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.h0, 1000L);
                                break;
                        }
                    }
                }, chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.k0.a(wv0.b);
                chatAttachAlertPhotoLayout.P.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        gm gmVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (gmVar = chatAttachAlertPhotoLayout.P) == null || gmVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == wv0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(wv0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.bi.o(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).v(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((xiVar.f0 instanceof org.telegram.ui.yn) || xiVar.Q0 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.dd(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}
