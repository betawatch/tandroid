package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ml implements dv0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = f6Var;
        this.d = e3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.ll] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        xl xlVar = chatAttachAlertPhotoLayout.O;
        li liVar = chatAttachAlertPhotoLayout.b;
        int i10 = liVar.N0;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.zn)) && !chatAttachAlertPhotoLayout.p0 && !liVar.S && chatAttachAlertPhotoLayout.M != null && !liVar.D) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.t0) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.N0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.P[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(mr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.o0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                mr mrVar = mr.f;
                duration.setInterpolator(mrVar).start();
                chatAttachAlertPhotoLayout.n0.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                org.telegram.ui.ActionBar.p2 p2Var2 = liVar.c0;
                this.a = AndroidUtilities.generateVideoPath((p2Var2 instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var2).v());
                AndroidUtilities.updateViewVisibilityAnimated(xlVar, true);
                xlVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.d0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.e0 = new Runnable(this) { // from class: org.telegram.ui.Components.ll
                    public final /* synthetic */ ml b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.e0 != null) {
                                    int i13 = chatAttachAlertPhotoLayout2.d0 + 1;
                                    chatAttachAlertPhotoLayout2.d0 = i13;
                                    chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i13));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.e0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.e0, 1000L);
                                break;
                        }
                    }
                };
                AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.M.getCameraSessionObject(), this.a, liVar.N0 != 0, new t(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.ll
                    public final /* synthetic */ ml b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.e0 != null) {
                                    int i132 = chatAttachAlertPhotoLayout2.d0 + 1;
                                    chatAttachAlertPhotoLayout2.d0 = i132;
                                    chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i132));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.e0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.e0, 1000L);
                                break;
                        }
                    }
                }, chatAttachAlertPhotoLayout.M);
                chatAttachAlertPhotoLayout.h0.a(ev0.b);
                chatAttachAlertPhotoLayout.M.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        zl zlVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        li liVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.h0;
        if (chatAttachAlertPhotoLayout.p0 || (zlVar = chatAttachAlertPhotoLayout.M) == null || zlVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == ev0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.M.getCameraSession(), false);
            shutterButton.a(ev0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.u0) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).v(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.M.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.M.getCameraSession().setFlipFront((liVar.c0 instanceof org.telegram.ui.zn) || liVar.N0 == 2);
            chatAttachAlertPhotoLayout.p0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.M.getCameraSessionObject(), new kl(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.M.startTakePictureAnimation(true);
        }
    }
}
