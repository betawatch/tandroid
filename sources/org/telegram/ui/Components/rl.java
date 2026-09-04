package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class rl implements cv0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = f6Var;
        this.d = d3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.ql] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bm bmVar = chatAttachAlertPhotoLayout.R;
        vi viVar = chatAttachAlertPhotoLayout.b;
        int i10 = viVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.co)) && !chatAttachAlertPhotoLayout.s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.w0) {
                    org.telegram.messenger.w1.p(R.string.GlobalAttachVideoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(pr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                pr prVar = pr.f;
                duration.setInterpolator(prVar).start();
                chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
                this.a = AndroidUtilities.generateVideoPath((n2Var2 instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var2).v());
                AndroidUtilities.updateViewVisibilityAnimated(bmVar, true);
                bmVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.g0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.h0 = new Runnable(this) { // from class: org.telegram.ui.Components.ql
                    public final /* synthetic */ rl b;

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
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), this.a, viVar.Q0 != 0, new t(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.ql
                    public final /* synthetic */ rl b;

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
                chatAttachAlertPhotoLayout.k0.a(dv0.b);
                chatAttachAlertPhotoLayout.P.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        dm dmVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        vi viVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (dmVar = chatAttachAlertPhotoLayout.P) == null || dmVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == dv0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(dv0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.w1.p(R.string.GlobalAttachPhotoRestricted, new yc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).v(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((viVar.f0 instanceof org.telegram.ui.co) || viVar.Q0 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new di.hd(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}
