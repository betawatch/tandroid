package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ q00(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 2;
        c40 c40Var = this.b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    org.telegram.ui.Components.voip.k1.k(c40Var.d2);
                    break;
                } else {
                    org.telegram.ui.Components.s10.g0 = false;
                    c40Var.dismiss();
                    break;
                }
            case 1:
                c40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = c40Var.d2;
                        if (launchActivity != null) {
                            c40Var.d2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 2:
                c40Var.f3.p();
                c40Var.d2.t0(new ai.v2());
                c40Var.dismiss();
                break;
            case 3:
                org.telegram.messenger.r3 r3Var = c40Var.V2;
                if (r3Var != null && r3Var.w) {
                    c40Var.M1(c40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 4:
                h20 h20Var = c40Var.C1;
                if (h20Var.m()) {
                    h20Var.j();
                    break;
                } else {
                    h20Var.d();
                    break;
                }
            case 5:
                Editable text = c40Var.C1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.si.b0(c40Var.a).W(new CharSequence[]{text}, true, true);
                c40Var.F1(tL_textWithEntities);
                break;
            case 6:
                int R0 = c40Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    c40Var.L1.w0(0, R0, null);
                }
                org.telegram.ui.Components.mt mtVar = c40Var.C1.a;
                mtVar.requestFocus();
                org.telegram.messenger.g0.J3(mtVar);
                break;
            case 7:
                org.telegram.messenger.r3 r3Var2 = c40Var.V2;
                if (r3Var2 == null || r3Var2.j() || c40Var.u1()) {
                    c40Var.m1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(c40Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.r3 r3Var3 = c40Var.V2;
                if (r3Var3 != null && r3Var3.w) {
                    c40Var.M1(c40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.r3 r3Var4 = c40Var.V2;
                if (r3Var4 != null && r3Var4.w) {
                    c40Var.M1(c40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = c40Var.X3;
                org.telegram.ui.Components.ch0 ch0Var = c40Var.F4;
                c40Var.Z3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (c40Var.G4 == 18) {
                        c40Var.G4 = 39;
                        ch0Var.P(39);
                        ch0Var.start();
                    } else {
                        ch0Var.N(0, false, false);
                        c40Var.G4 = 18;
                        ch0Var.P(18);
                        ch0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList.get(i11);
                        org.telegram.messenger.s3 s3Var = zVar.x;
                        if (s3Var.a.self && !s3Var.b) {
                            org.telegram.ui.Components.voip.v vVar = zVar.a;
                            if (zVar.K0 == null) {
                                zVar.L0 = false;
                                ImageView imageView = zVar.y0;
                                if (imageView == null) {
                                    zVar.y0 = new ImageView(zVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (vVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = vVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        zVar.y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    zVar.y0.setAlpha(0.0f);
                                } else {
                                    zVar.y0.setAlpha(1.0f);
                                }
                                if (zVar.y0.getParent() == null) {
                                    vVar.addView(zVar.y0);
                                }
                                ((FrameLayout.LayoutParams) zVar.y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                zVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(zVar, 1));
                                zVar.K0.addListener(new org.telegram.ui.Components.voip.x(zVar, 2));
                                zVar.K0.setDuration(400L);
                                zVar.K0.setInterpolator(org.telegram.ui.Components.er.f);
                                zVar.K0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                if (c40Var.k1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                c40Var.x5 = Integer.valueOf(i10);
                c40Var.V1(true, true);
                c40Var.x5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(c40Var, i10, 16));
                break;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = c40Var.f3;
                org.telegram.ui.ActionBar.z0 z0Var = c40Var.u3;
                org.telegram.ui.ActionBar.z0 z0Var2 = c40Var.t3;
                org.telegram.ui.ActionBar.z0 z0Var3 = c40Var.k3;
                org.telegram.messenger.r3 r3Var5 = c40Var.V2;
                if (r3Var5 != null && !c40Var.Z3.b) {
                    if (r3Var5.b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.j6.Yg;
                        z0Var2.d(org.telegram.ui.ActionBar.j6.x0(null, i12, false), org.telegram.ui.ActionBar.j6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.j6.nh;
                        z0Var.d(org.telegram.ui.ActionBar.j6.x0(null, i13, false), org.telegram.ui.ActionBar.j6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.j6.nh;
                        z0Var2.d(org.telegram.ui.ActionBar.j6.x0(null, i14, false), org.telegram.ui.ActionBar.j6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.j6.Yg;
                        z0Var.d(org.telegram.ui.ActionBar.j6.x0(null, i15, false), org.telegram.ui.ActionBar.j6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    c40Var.g2 = false;
                    q0Var.u(1);
                    q0Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            z0Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            z0Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : org.telegram.messenger.hd.M0(2131743503, null));
                        } else {
                            int i16 = R.drawable.msg_voice_phone;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = R.drawable.msg_voice_headphones;
                                }
                                z0Var3.setIcon(i16);
                                z0Var3.setSubtext(org.telegram.messenger.hd.M0(VoIPService.getSharedInstance().isHeadsetPlugged() ? 2131743501 : 2131743500, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    z0Var3.setIcon(R.drawable.msg_voice_speaker);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743499, null));
                                } else {
                                    z0Var3.setIcon(R.drawable.msg_voice_phone);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743500, null));
                                }
                            }
                        }
                    }
                    c40Var.O1();
                    q0Var.V(null, null);
                    break;
                }
                break;
        }
    }
}
