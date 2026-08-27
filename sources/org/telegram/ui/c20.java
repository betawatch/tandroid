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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ c20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        s50 s50Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = s50Var.g1;
                org.telegram.ui.ActionBar.f1 f1Var = s50Var.r1;
                org.telegram.ui.ActionBar.f1 f1Var2 = s50Var.q1;
                org.telegram.ui.ActionBar.f1 f1Var3 = s50Var.l1;
                ChatObject.Call call = s50Var.W0;
                if (call != null && !s50Var.W1.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.g6.hg;
                        f1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                        f1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.g6.wg;
                        f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i13, false), org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                        f1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.g6.wg;
                        f1Var2.c(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                        f1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.g6.hg;
                        f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                        f1Var.setChecked(false);
                    }
                    s50Var.h0 = false;
                    v0Var.r(1);
                    v0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            f1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            f1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            f1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            f1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                f1Var3.setIcon(R.drawable.msg_voice_speaker);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                f1Var3.setIcon(R.drawable.msg_voice_phone);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    s50Var.I1();
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (s50Var.r1()) {
                    if (bf.d.a(s50Var.e0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(s50Var.e0);
                        s50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.y4.B(s50Var.e0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(s50Var.e0)) {
                    org.telegram.ui.Components.n20.a0 = false;
                    s50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.y4.A(s50Var.getContext()).o();
                    break;
                }
            case 2:
                s50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = s50Var.e0;
                        if (launchActivity != null) {
                            s50Var.e0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = s50Var.W0;
                if (call2 != null && call2.recording) {
                    s50Var.G1(s50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 4:
                r30 r30Var = s50Var.D;
                if (r30Var.m()) {
                    r30Var.j();
                    break;
                } else {
                    r30Var.d();
                    break;
                }
            case 5:
                s50.E(s50Var);
                break;
            case 6:
                int P0 = s50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    s50Var.M.v0(0, P0, null);
                }
                org.telegram.ui.Components.ot otVar = s50Var.D.a;
                otVar.requestFocus();
                AndroidUtilities.showKeyboard(otVar);
                break;
            case 7:
                ChatObject.Call call3 = s50Var.W0;
                if (call3 == null || call3.isScheduled() || s50Var.r1()) {
                    s50Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(s50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = s50Var.W0;
                if (call4 != null && call4.recording) {
                    s50Var.G1(s50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = s50Var.W0;
                if (call5 != null && call5.recording) {
                    s50Var.G1(s50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = s50Var.U1;
                org.telegram.ui.Components.oi0 oi0Var = s50Var.C2;
                s50Var.W1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (s50Var.D2 == 18) {
                        s50Var.D2 = 39;
                        oi0Var.N(39);
                        oi0Var.start();
                    } else {
                        oi0Var.L(0, false, false);
                        s50Var.D2 = 18;
                        oi0Var.N(18);
                        oi0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.F0 == null) {
                                tVar.G0 = false;
                                ImageView imageView = tVar.t0;
                                if (imageView == null) {
                                    tVar.t0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.t0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.t0.setAlpha(0.0f);
                                } else {
                                    tVar.t0.setAlpha(1.0f);
                                }
                                if (tVar.t0.getParent() == null) {
                                    oVar.addView(tVar.t0);
                                }
                                ((FrameLayout.LayoutParams) tVar.t0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.F0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.F0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.F0.setDuration(400L);
                                tVar.F0.setInterpolator(org.telegram.ui.Components.er.f);
                                tVar.F0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (s50Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                s50Var.u3 = Integer.valueOf(i11);
                s50Var.N1(true, true);
                s50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(s50Var, i11, 12));
                break;
        }
    }
}
