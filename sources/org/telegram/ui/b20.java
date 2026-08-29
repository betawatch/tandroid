package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ b20(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        r50 r50Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = r50Var.g1;
                org.telegram.ui.ActionBar.g1 g1Var = r50Var.r1;
                org.telegram.ui.ActionBar.g1 g1Var2 = r50Var.q1;
                org.telegram.ui.ActionBar.g1 g1Var3 = r50Var.l1;
                ChatObject.Call call = r50Var.W0;
                if (call != null && !r50Var.W1.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.g6.hg;
                        g1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                        g1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.g6.wg;
                        g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i13, false), org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                        g1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.g6.wg;
                        g1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                        g1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.g6.hg;
                        g1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                        g1Var.setChecked(false);
                    }
                    r50Var.h0 = false;
                    w0Var.r(1);
                    w0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            g1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            g1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            g1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            g1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                g1Var3.setIcon(R.drawable.msg_voice_speaker);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                g1Var3.setIcon(R.drawable.msg_voice_phone);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    r50Var.I1();
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (r50Var.r1()) {
                    if (df.d.a(r50Var.e0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(r50Var.e0);
                        r50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.c5.B(r50Var.e0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(r50Var.e0)) {
                    org.telegram.ui.Components.w20.a0 = false;
                    r50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.c5.A(r50Var.getContext()).o();
                    break;
                }
            case 2:
                r50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = r50Var.e0;
                        if (launchActivity != null) {
                            r50Var.e0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = r50Var.W0;
                if (call2 != null && call2.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 4:
                r30 r30Var = r50Var.D;
                if (r30Var.m()) {
                    r30Var.j();
                    break;
                } else {
                    r30Var.d();
                    break;
                }
            case 5:
                r50.D(r50Var);
                break;
            case 6:
                int P0 = r50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    r50Var.M.v0(0, P0, null);
                }
                org.telegram.ui.Components.vt vtVar = r50Var.D.a;
                vtVar.requestFocus();
                AndroidUtilities.showKeyboard(vtVar);
                break;
            case 7:
                ChatObject.Call call3 = r50Var.W0;
                if (call3 == null || call3.isScheduled() || r50Var.r1()) {
                    r50Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = r50Var.W0;
                if (call4 != null && call4.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = r50Var.W0;
                if (call5 != null && call5.recording) {
                    r50Var.G1(r50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = r50Var.U1;
                org.telegram.ui.Components.xi0 xi0Var = r50Var.C2;
                r50Var.W1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (r50Var.D2 == 18) {
                        r50Var.D2 = 39;
                        xi0Var.N(39);
                        xi0Var.start();
                    } else {
                        xi0Var.L(0, false, false);
                        r50Var.D2 = 18;
                        xi0Var.N(18);
                        xi0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = uVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.a;
                            if (uVar.F0 == null) {
                                uVar.G0 = false;
                                ImageView imageView = uVar.t0;
                                if (imageView == null) {
                                    uVar.t0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.t0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.t0.setAlpha(0.0f);
                                } else {
                                    uVar.t0.setAlpha(1.0f);
                                }
                                if (uVar.t0.getParent() == null) {
                                    pVar.addView(uVar.t0);
                                }
                                ((FrameLayout.LayoutParams) uVar.t0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.F0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.F0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.F0.setDuration(400L);
                                uVar.F0.setInterpolator(org.telegram.ui.Components.jr.f);
                                uVar.F0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (r50Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                r50Var.u3 = Integer.valueOf(i11);
                r50Var.N1(true, true);
                r50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(r50Var, i11, 15));
                break;
        }
    }
}
