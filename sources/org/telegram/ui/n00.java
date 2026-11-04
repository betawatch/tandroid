package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.provider.Settings;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ n00(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        int i10 = 2;
        x30 x30Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.q0 q0Var = x30Var.c3;
                org.telegram.ui.ActionBar.y0 y0Var = x30Var.n3;
                org.telegram.ui.ActionBar.y0 y0Var2 = x30Var.m3;
                org.telegram.ui.ActionBar.y0 y0Var3 = x30Var.h3;
                org.telegram.messenger.r3 r3Var = x30Var.S2;
                if (r3Var != null && !x30Var.S3.b) {
                    if (r3Var.b.join_muted) {
                        int i11 = org.telegram.ui.ActionBar.k6.Vg;
                        y0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                        y0Var2.setChecked(false);
                        int i12 = org.telegram.ui.ActionBar.k6.kh;
                        y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                        y0Var.setChecked(true);
                    } else {
                        int i13 = org.telegram.ui.ActionBar.k6.kh;
                        y0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                        y0Var2.setChecked(true);
                        int i14 = org.telegram.ui.ActionBar.k6.Vg;
                        y0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i14, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                        y0Var.setChecked(false);
                    }
                    x30Var.d2 = false;
                    q0Var.t(1);
                    q0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            y0Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            y0Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : org.telegram.messenger.bd.M0(2131743513, null));
                        } else {
                            int i15 = R.drawable.msg_voice_phone;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i15 = R.drawable.msg_voice_headphones;
                                }
                                y0Var3.setIcon(i15);
                                y0Var3.setSubtext(org.telegram.messenger.bd.M0(VoIPService.getSharedInstance().isHeadsetPlugged() ? 2131743511 : 2131743510, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    y0Var3.setIcon(R.drawable.msg_voice_speaker);
                                    y0Var3.setSubtext(org.telegram.messenger.bd.M0(2131743509, null));
                                } else {
                                    y0Var3.setIcon(R.drawable.msg_voice_phone);
                                    y0Var3.setSubtext(org.telegram.messenger.bd.M0(2131743510, null));
                                }
                            }
                        }
                    }
                    x30Var.L1();
                    q0Var.U(null, null);
                    break;
                }
                break;
            case 1:
                if (x30Var.t1()) {
                    if (xf.b.a(x30Var.a2) > 0) {
                        org.telegram.ui.Components.voip.s0.h(x30Var.a2);
                        x30Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.t4.A(x30Var.a2, null, true).p();
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = x30Var.a2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        org.telegram.ui.Components.l10.f0 = false;
                        x30Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.t4.z(x30Var.getContext()).p();
                        break;
                    }
                }
            case 2:
                x30Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity2 = x30Var.a2;
                        if (launchActivity2 != null) {
                            x30Var.a2.startActivityForResult(((MediaProjectionManager) launchActivity2.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                if (r3Var2 != null && r3Var2.w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    break;
                }
                break;
            case 4:
                c20 c20Var = x30Var.z1;
                if (c20Var.m()) {
                    c20Var.j();
                    break;
                } else {
                    c20Var.d();
                    break;
                }
            case 5:
                Editable text = x30Var.z1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.li.b0(x30Var.a).W(new CharSequence[]{text}, true, true);
                x30Var.C1(tL_textWithEntities);
                break;
            case 6:
                int R0 = x30Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    x30Var.I1.w0(0, R0, null);
                }
                org.telegram.ui.Components.dt dtVar = x30Var.z1.a;
                dtVar.requestFocus();
                org.telegram.messenger.g0.K3(dtVar);
                break;
            case 7:
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                if (r3Var3 == null || r3Var3.j() || x30Var.t1()) {
                    x30Var.l1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(x30Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.r3 r3Var4 = x30Var.S2;
                if (r3Var4 != null && r3Var4.w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.r3 r3Var5 = x30Var.S2;
                if (r3Var5 != null && r3Var5.w) {
                    x30Var.J1(x30Var.G1.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = x30Var.Q3;
                org.telegram.ui.Components.ch0 ch0Var = x30Var.y4;
                x30Var.S3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (x30Var.z4 == 18) {
                        x30Var.z4 = 39;
                        ch0Var.P(39);
                        ch0Var.start();
                    } else {
                        ch0Var.N(0, false, false);
                        x30Var.z4 = 18;
                        ch0Var.P(18);
                        ch0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList.get(i16);
                        org.telegram.messenger.s3 s3Var = rVar.x;
                        if (s3Var.a.self && !s3Var.b) {
                            org.telegram.ui.Components.voip.n nVar = rVar.a;
                            if (rVar.K0 == null) {
                                rVar.L0 = false;
                                ImageView imageView = rVar.y0;
                                if (imageView == null) {
                                    rVar.y0 = new ImageView(rVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (nVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = nVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        rVar.y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    rVar.y0.setAlpha(0.0f);
                                } else {
                                    rVar.y0.setAlpha(1.0f);
                                }
                                if (rVar.y0.getParent() == null) {
                                    nVar.addView(rVar.y0);
                                }
                                ((FrameLayout.LayoutParams) rVar.y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                rVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.m(rVar, 1));
                                rVar.K0.addListener(new org.telegram.ui.Components.voip.p(rVar, 2));
                                rVar.K0.setDuration(400L);
                                rVar.K0.setInterpolator(org.telegram.ui.Components.xq.f);
                                rVar.K0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (x30Var.j1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                x30Var.q5 = Integer.valueOf(i10);
                x30Var.Q1(true, true);
                x30Var.q5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(x30Var, i10, 13));
                break;
        }
    }
}
