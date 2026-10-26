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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ f20(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        v50 v50Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = v50Var.k1;
                org.telegram.ui.ActionBar.g1 g1Var = v50Var.v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = v50Var.u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = v50Var.p1;
                ChatObject.Call call = v50Var.a1;
                if (call != null && !v50Var.a2.b) {
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
                    v50Var.l0 = false;
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
                    v50Var.J1();
                    w0Var.U(null, null);
                    break;
                }
                break;
            case 1:
                if (v50Var.r1()) {
                    if (vf.b.a(v50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(v50Var.i0);
                        v50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.g5.A(v50Var.i0, null, true).p();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(v50Var.i0)) {
                    org.telegram.ui.Components.k30.e0 = false;
                    v50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.g5.z(v50Var.getContext()).p();
                    break;
                }
            case 2:
                v50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = v50Var.i0;
                        if (launchActivity != null) {
                            v50Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = v50Var.a1;
                if (call2 != null && call2.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                u30 u30Var = v50Var.H;
                if (u30Var.m()) {
                    u30Var.j();
                    break;
                } else {
                    u30Var.d();
                    break;
                }
            case 5:
                v50.D(v50Var);
                break;
            case 6:
                int P0 = v50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    v50Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.mu muVar = v50Var.H.a;
                muVar.requestFocus();
                AndroidUtilities.showKeyboard(muVar);
                break;
            case 7:
                ChatObject.Call call3 = v50Var.a1;
                if (call3 == null || call3.isScheduled() || v50Var.r1()) {
                    v50Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(v50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = v50Var.a1;
                if (call4 != null && call4.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = v50Var.a1;
                if (call5 != null && call5.recording) {
                    v50Var.H1(v50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = v50Var.Y1;
                org.telegram.ui.Components.xj0 xj0Var = v50Var.G2;
                v50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (v50Var.H2 == 18) {
                        v50Var.H2 = 39;
                        xj0Var.P(39);
                        xj0Var.start();
                    } else {
                        xj0Var.N(0, false, false);
                        v50Var.H2 = 18;
                        xj0Var.P(18);
                        xj0Var.start();
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
                if (v50Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                v50Var.y3 = Integer.valueOf(i11);
                v50Var.O1(true, true);
                v50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(v50Var, i11, 15));
                break;
        }
    }
}
