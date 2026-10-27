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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ h20(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        x50 x50Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = x50Var.k1;
                org.telegram.ui.ActionBar.g1 g1Var = x50Var.v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = x50Var.u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = x50Var.p1;
                ChatObject.Call call = x50Var.a1;
                if (call != null && !x50Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.y6.hg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i12, false));
                        g1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.y6.wg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i13, false), org.telegram.ui.ActionBar.y6.x0(null, i13, false));
                        g1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.y6.wg;
                        g1Var2.d(org.telegram.ui.ActionBar.y6.x0(null, i14, false), org.telegram.ui.ActionBar.y6.x0(null, i14, false));
                        g1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.y6.hg;
                        g1Var.d(org.telegram.ui.ActionBar.y6.x0(null, i15, false), org.telegram.ui.ActionBar.y6.x0(null, i15, false));
                        g1Var.setChecked(false);
                    }
                    x50Var.l0 = false;
                    w0Var.t(1);
                    w0Var.t(2);
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
                    x50Var.J1();
                    w0Var.U(null, null);
                    break;
                }
                break;
            case 1:
                if (x50Var.r1()) {
                    if (vf.b.a(x50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(x50Var.i0);
                        x50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.g5.A(x50Var.i0, null, true).p();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(x50Var.i0)) {
                    org.telegram.ui.Components.k30.e0 = false;
                    x50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.g5.z(x50Var.getContext()).p();
                    break;
                }
            case 2:
                x50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = x50Var.i0;
                        if (launchActivity != null) {
                            x50Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = x50Var.a1;
                if (call2 != null && call2.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                w30 w30Var = x50Var.H;
                if (w30Var.m()) {
                    w30Var.j();
                    break;
                } else {
                    w30Var.d();
                    break;
                }
            case 5:
                x50.D(x50Var);
                break;
            case 6:
                int P0 = x50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    x50Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.mu muVar = x50Var.H.a;
                muVar.requestFocus();
                AndroidUtilities.showKeyboard(muVar);
                break;
            case 7:
                ChatObject.Call call3 = x50Var.a1;
                if (call3 == null || call3.isScheduled() || x50Var.r1()) {
                    x50Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(x50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = x50Var.a1;
                if (call4 != null && call4.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = x50Var.a1;
                if (call5 != null && call5.recording) {
                    x50Var.H1(x50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = x50Var.Y1;
                org.telegram.ui.Components.yj0 yj0Var = x50Var.G2;
                x50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (x50Var.H2 == 18) {
                        x50Var.H2 = 39;
                        yj0Var.P(39);
                        yj0Var.start();
                    } else {
                        yj0Var.N(0, false, false);
                        x50Var.H2 = 18;
                        yj0Var.P(18);
                        yj0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.x0;
                                if (imageView == null) {
                                    tVar.x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.x0.setAlpha(0.0f);
                                } else {
                                    tVar.x0.setAlpha(1.0f);
                                }
                                if (tVar.x0.getParent() == null) {
                                    oVar.addView(tVar.x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.ds.f);
                                tVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (x50Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                x50Var.y3 = Integer.valueOf(i11);
                x50Var.O1(true, true);
                x50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(x50Var, i11, 15));
                break;
        }
    }
}
