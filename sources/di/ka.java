package di;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ ka(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x035b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c10;
        ArrayList arrayList;
        dc dcVar;
        oc ocVar;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        pc pcVar = this.b;
        switch (i11) {
            case 0:
                pcVar.r();
                break;
            case 1:
                if (pcVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", pcVar.s.o).putFloat("frontflash_intensity", pcVar.s.p).apply();
                }
                pcVar.s.e(0.0f, 240L, null);
                pcVar.E0.setSelected(false);
                break;
            case 2:
                pcVar.m();
                pcVar.W1 = false;
                int i15 = pcVar.c;
                if (pcVar.K1 == null) {
                    pcVar.q(true);
                    break;
                } else {
                    pcVar.y();
                    la laVar = new la(pcVar, i13);
                    if (pcVar.H1 == null) {
                        o8 o8Var = pcVar.K1;
                        if (o8Var.K && !o8Var.v() && !o8Var.g) {
                            long j3 = o8Var.h0;
                            if (j3 > 0 && !o8Var.n) {
                                long j10 = (long) ((o8Var.a0 - o8Var.Z) * j3);
                                if (j10 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    o8Var.a0 = (59000.0f / o8Var.h0) + o8Var.Z;
                                    arrayList.add(o8Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    c10 = 0;
                                    while (j12 < j10) {
                                        if (Math.min(j11, j10 - j12) < 1000) {
                                            i10 = i15;
                                        } else {
                                            long j13 = j11;
                                            o8 g10 = o8Var.g();
                                            float f7 = o8Var.Z;
                                            float f10 = o8Var.h0;
                                            g10.Z = (j12 / f10) + f7;
                                            g10.a0 = ((r14 + j12) / f10) + o8Var.Z;
                                            g10.C0 = "";
                                            j12 += j13;
                                            arrayList.add(g10);
                                            j11 = j13;
                                            i15 = i15;
                                        }
                                    }
                                    i10 = i15;
                                }
                                pcVar.H1 = arrayList;
                                if (arrayList != null) {
                                    pcVar.I1 = new ArrayList();
                                    pcVar.J1 = new ArrayList();
                                    for (int i16 = 0; i16 < pcVar.H1.size(); i16 = com.google.android.gms.internal.vision.e2.e(i16, i16, 1, pcVar.J1)) {
                                        pcVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        c10 = 0;
                        arrayList = null;
                        pcVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        c10 = 0;
                    }
                    if (pcVar.H1 != null) {
                        ArrayList arrayList2 = pcVar.J1;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (pcVar.I1.contains(num)) {
                                o8 o8Var2 = (o8) pcVar.H1.get(num.intValue());
                                o8 o8Var3 = pcVar.K1;
                                if (o8Var3 == o8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = pcVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = pcVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    o8 o8Var4 = pcVar.K1;
                                    o8Var4.k = (TextUtils.equals(o8Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    pcVar.K1.C0 = new SpannableString(pcVar.c1.getText());
                                } else if (o8Var2.C0 == null) {
                                    o8Var3.k = false;
                                    o8Var3.C0 = new SpannableString("");
                                }
                                laVar.run(o8Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {pcVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{pcVar.K1.C0}, true) : new ArrayList<>();
                        o8 o8Var5 = pcVar.K1;
                        o8Var5.k = (TextUtils.equals(o8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        pcVar.K1.C0 = new SpannableString(pcVar.c1.getText());
                        laVar.run(pcVar.K1);
                    }
                    long j14 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = pcVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    pcVar.K1 = null;
                    pcVar.v = true;
                    pcVar.w = j14;
                    pcVar.B2 = true;
                    pcVar.o();
                    bi.g gVar = new bi.g(pcVar, j14, 6);
                    gc gcVar = pcVar.x;
                    if (gcVar != null) {
                        gcVar.b(j14, gVar);
                    } else {
                        gVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                pcVar.Z(false);
                break;
            case 4:
                o8 o8Var6 = pcVar.K1;
                if (o8Var6 != null) {
                    o8Var6.y0 = !o8Var6.y0;
                    dc dcVar2 = pcVar.X0;
                    if (dcVar2 != null) {
                        dcVar2.u(o8Var6);
                    }
                    rb rbVar = pcVar.v1;
                    if (rbVar != null && rbVar.R0 != null) {
                        while (r10 < pcVar.v1.R0.getChildCount()) {
                            View childAt = pcVar.v1.R0.getChildAt(r10);
                            if (childAt instanceof rg.g1) {
                                ((rg.g1) childAt).setupTheme(pcVar.K1);
                            }
                            r10++;
                        }
                    }
                    pcVar.o0(true);
                    break;
                }
                break;
            case 5:
                pcVar.q(true);
                break;
            case 6:
                pcVar.d = true;
                pcVar.v = false;
                if (pcVar.J == 1) {
                    pcVar.h0.setAlpha(1.0f);
                    pcVar.h0.setTranslationX(0.0f);
                    pcVar.h0.setTranslationY(0.0f);
                    pcVar.i0.setAlpha(1.0f);
                    pcVar.k0.setAlpha(1.0f);
                    pcVar.n.setBackgroundColor(-16777216);
                    if (pcVar.f0 == 2) {
                        pcVar.u1.setAlpha(1.0f);
                    }
                }
                ka kaVar = pcVar.x2;
                if (kaVar != null) {
                    kaVar.run();
                    pcVar.x2 = null;
                } else {
                    pcVar.P();
                }
                o8 o8Var7 = pcVar.K1;
                if (o8Var7 != null && o8Var7.n) {
                    pcVar.u();
                    pcVar.H();
                    pcVar.s();
                    break;
                } else if (o8Var7 != null && o8Var7.u) {
                    if (o8Var7.K) {
                        pcVar.X0.t(o8Var7, null, 0L);
                    }
                    pcVar.s();
                    break;
                }
                break;
            case 7:
                pcVar.g(1.0f, true, new ka(pcVar, i12));
                break;
            case 8:
                pcVar.A0.setCameraThumb(pcVar.A());
                sb sbVar = pcVar.B0;
                if (sbVar != null) {
                    sbVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(pcVar.B0);
                    cc ccVar = pcVar.A0;
                    if (ccVar != null) {
                        ccVar.setCameraView(null);
                    }
                    pcVar.B0 = null;
                    break;
                }
                break;
            case 9:
                pcVar.A0.setCameraThumb(pcVar.A());
                break;
            case 10:
                if (pcVar.f0 == 1) {
                    pcVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                fb fbVar = pcVar.d1;
                if (fbVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + pcVar.c1.getEditTextHeight());
                    fbVar.setTranslationY(i18 - (pcVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                cc ccVar2 = pcVar.A0;
                if (ccVar2 != null) {
                    ccVar2.c.b(pcVar.D0.y ? pcVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                pcVar.m0(true);
                break;
            case 14:
                pcVar.s();
                break;
            case 15:
                fc fcVar = pcVar.c1;
                if (fcVar != null) {
                    fcVar.m();
                    break;
                }
                break;
            case 16:
                if (pcVar.g0 == -1 && pcVar.f0 == 1) {
                    fc fcVar2 = pcVar.c1;
                    if (!fcVar2.p0 && !fcVar2.O1) {
                        zc zcVar = pcVar.Z0;
                        if (!zcVar.P) {
                            fb fbVar2 = pcVar.d1;
                            if (fbVar2.M) {
                                fbVar2.c(false, true);
                                break;
                            } else {
                                pcVar.l0(0, false, true);
                                rb rbVar2 = pcVar.v1;
                                if (rbVar2 != null) {
                                    rbVar2.R0(2);
                                    rbVar2.l2 = true;
                                    rbVar2.o0(true);
                                    pcVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            zcVar.P = false;
                            if (zcVar.E && zcVar.h == null) {
                                zcVar.G = true;
                                tc tcVar = zcVar.a;
                                if (tcVar != null) {
                                    tcVar.J(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                pcVar.N1 = true;
                pcVar.b1.setShareEnabled(false);
                u0 u0Var = pcVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                pcVar.A0.setCameraThumb(pcVar.A());
                break;
            case 19:
                oc ocVar2 = pcVar.n;
                bi.b bVar = pcVar.a;
                new org.telegram.ui.Components.yc(ocVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new ka(pcVar, 27), bVar)).k(true);
                break;
            case 20:
                ia iaVar = pcVar.q0;
                if (iaVar != null) {
                    iaVar.dismiss();
                }
                pcVar.K(2, true);
                break;
            case 21:
                pcVar.l0(-1, false, true);
                break;
            case 22:
                pcVar.l0(-1, false, true);
                break;
            case 23:
                pcVar.d = false;
                AndroidUtilities.unlockOrientation(pcVar.b);
                if (pcVar.B0 != null) {
                    if (pcVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(pcVar.B0.getCameraSession(), false);
                    }
                    pcVar.v(false);
                }
                dc dcVar3 = pcVar.X0;
                if (dcVar3 != null) {
                    dcVar3.set(null);
                }
                pcVar.z();
                pcVar.y();
                File file = pcVar.G1;
                if (file != null && !pcVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                pcVar.G1 = null;
                AndroidUtilities.runOnUIThread(new ka(pcVar, 28), 16L);
                kc kcVar = pcVar.F;
                if (kcVar != null) {
                    kcVar.f(false);
                }
                if (pcVar.x2 != null) {
                    pcVar.x2 = null;
                }
                pcVar.l2 = null;
                pc pcVar2 = pc.F2;
                if (pcVar2 != null) {
                    pcVar2.q(false);
                }
                pc.F2 = null;
                oc ocVar3 = pcVar.n;
                if (ocVar3 != null) {
                    org.telegram.ui.Components.qc.h(ocVar3);
                }
                ah.y yVar = pcVar.l0;
                if (yVar != null) {
                    org.telegram.ui.Components.qc.h(yVar);
                }
                cc ccVar3 = pcVar.A0;
                if (ccVar3 != null) {
                    ccVar3.e();
                    break;
                }
                break;
            case 24:
                if (!pcVar.K1.b0 && pcVar.q0 != null && (dcVar = pcVar.X0) != null) {
                    dcVar.h(new la(pcVar, i14), dcVar, pcVar.w1, pcVar.z1);
                }
                pcVar.K(1, true);
                break;
            case 25:
                pcVar.j0(false);
                pcVar.e2 = null;
                break;
            case 26:
                pcVar.j0(false);
                pcVar.e2 = null;
                break;
            case 27:
                pcVar.T();
                break;
            default:
                WindowManager windowManager = pcVar.f;
                if (windowManager != null && (ocVar = pcVar.n) != null && ocVar.getParent() != null) {
                    windowManager.removeView(pcVar.n);
                    break;
                }
                break;
        }
    }
}
