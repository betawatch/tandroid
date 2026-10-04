package ci;

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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ ga(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
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
        yb ybVar;
        jc jcVar;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        kc kcVar = this.b;
        switch (i11) {
            case 0:
                kcVar.r();
                break;
            case 1:
                if (kcVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", kcVar.s.o).putFloat("frontflash_intensity", kcVar.s.p).apply();
                }
                kcVar.s.e(0.0f, 240L, null);
                kcVar.E0.setSelected(false);
                break;
            case 2:
                kcVar.m();
                kcVar.W1 = false;
                int i15 = kcVar.c;
                if (kcVar.K1 == null) {
                    kcVar.q(true);
                    break;
                } else {
                    kcVar.y();
                    ha haVar = new ha(kcVar, i13);
                    if (kcVar.H1 == null) {
                        k8 k8Var = kcVar.K1;
                        if (k8Var.K && !k8Var.v() && !k8Var.g) {
                            long j3 = k8Var.h0;
                            if (j3 > 0 && !k8Var.n) {
                                long j10 = (long) ((k8Var.a0 - k8Var.Z) * j3);
                                if (j10 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    k8Var.a0 = (59000.0f / k8Var.h0) + k8Var.Z;
                                    arrayList.add(k8Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    c10 = 0;
                                    while (j12 < j10) {
                                        if (Math.min(j11, j10 - j12) < 1000) {
                                            i10 = i15;
                                        } else {
                                            long j13 = j11;
                                            k8 g10 = k8Var.g();
                                            float f7 = k8Var.Z;
                                            float f10 = k8Var.h0;
                                            g10.Z = (j12 / f10) + f7;
                                            g10.a0 = ((r14 + j12) / f10) + k8Var.Z;
                                            g10.C0 = "";
                                            j12 += j13;
                                            arrayList.add(g10);
                                            j11 = j13;
                                            i15 = i15;
                                        }
                                    }
                                    i10 = i15;
                                }
                                kcVar.H1 = arrayList;
                                if (arrayList != null) {
                                    kcVar.I1 = new ArrayList();
                                    kcVar.J1 = new ArrayList();
                                    for (int i16 = 0; i16 < kcVar.H1.size(); i16 = com.google.android.gms.internal.vision.e2.e(i16, i16, 1, kcVar.J1)) {
                                        kcVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        c10 = 0;
                        arrayList = null;
                        kcVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        c10 = 0;
                    }
                    if (kcVar.H1 != null) {
                        ArrayList arrayList2 = kcVar.J1;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (kcVar.I1.contains(num)) {
                                k8 k8Var2 = (k8) kcVar.H1.get(num.intValue());
                                k8 k8Var3 = kcVar.K1;
                                if (k8Var3 == k8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = kcVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = kcVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    k8 k8Var4 = kcVar.K1;
                                    k8Var4.k = (TextUtils.equals(k8Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    kcVar.K1.C0 = new SpannableString(kcVar.c1.getText());
                                } else if (k8Var2.C0 == null) {
                                    k8Var3.k = false;
                                    k8Var3.C0 = new SpannableString("");
                                }
                                haVar.run(k8Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {kcVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{kcVar.K1.C0}, true) : new ArrayList<>();
                        k8 k8Var5 = kcVar.K1;
                        k8Var5.k = (TextUtils.equals(k8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        kcVar.K1.C0 = new SpannableString(kcVar.c1.getText());
                        haVar.run(kcVar.K1);
                    }
                    long j14 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = kcVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    kcVar.K1 = null;
                    kcVar.v = true;
                    kcVar.w = j14;
                    kcVar.B2 = true;
                    kcVar.o();
                    ai.j jVar = new ai.j(kcVar, j14, 6);
                    bc bcVar = kcVar.x;
                    if (bcVar != null) {
                        bcVar.b(j14, jVar);
                    } else {
                        jVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                kcVar.Z(false);
                break;
            case 4:
                k8 k8Var6 = kcVar.K1;
                if (k8Var6 != null) {
                    k8Var6.y0 = !k8Var6.y0;
                    yb ybVar2 = kcVar.X0;
                    if (ybVar2 != null) {
                        ybVar2.u(k8Var6);
                    }
                    mb mbVar = kcVar.v1;
                    if (mbVar != null && mbVar.R0 != null) {
                        while (r10 < kcVar.v1.R0.getChildCount()) {
                            View childAt = kcVar.v1.R0.getChildAt(r10);
                            if (childAt instanceof qg.e1) {
                                ((qg.e1) childAt).setupTheme(kcVar.K1);
                            }
                            r10++;
                        }
                    }
                    kcVar.o0(true);
                    break;
                }
                break;
            case 5:
                kcVar.q(true);
                break;
            case 6:
                kcVar.d = true;
                kcVar.v = false;
                if (kcVar.J == 1) {
                    kcVar.h0.setAlpha(1.0f);
                    kcVar.h0.setTranslationX(0.0f);
                    kcVar.h0.setTranslationY(0.0f);
                    kcVar.i0.setAlpha(1.0f);
                    kcVar.k0.setAlpha(1.0f);
                    kcVar.n.setBackgroundColor(-16777216);
                    if (kcVar.f0 == 2) {
                        kcVar.u1.setAlpha(1.0f);
                    }
                }
                ga gaVar = kcVar.x2;
                if (gaVar != null) {
                    gaVar.run();
                    kcVar.x2 = null;
                } else {
                    kcVar.P();
                }
                k8 k8Var7 = kcVar.K1;
                if (k8Var7 != null && k8Var7.n) {
                    kcVar.u();
                    kcVar.H();
                    kcVar.s();
                    break;
                } else if (k8Var7 != null && k8Var7.u) {
                    if (k8Var7.K) {
                        kcVar.X0.t(k8Var7, null, 0L);
                    }
                    kcVar.s();
                    break;
                }
                break;
            case 7:
                kcVar.g(1.0f, true, new ga(kcVar, i12));
                break;
            case 8:
                kcVar.A0.setCameraThumb(kcVar.A());
                nb nbVar = kcVar.B0;
                if (nbVar != null) {
                    nbVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(kcVar.B0);
                    xb xbVar = kcVar.A0;
                    if (xbVar != null) {
                        xbVar.setCameraView(null);
                    }
                    kcVar.B0 = null;
                    break;
                }
                break;
            case 9:
                kcVar.A0.setCameraThumb(kcVar.A());
                break;
            case 10:
                if (kcVar.f0 == 1) {
                    kcVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                bb bbVar = kcVar.d1;
                if (bbVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + kcVar.c1.getEditTextHeight());
                    bbVar.setTranslationY(i18 - (kcVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                xb xbVar2 = kcVar.A0;
                if (xbVar2 != null) {
                    xbVar2.c.b(kcVar.D0.y ? kcVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                kcVar.m0(true);
                break;
            case 14:
                kcVar.s();
                break;
            case 15:
                ac acVar = kcVar.c1;
                if (acVar != null) {
                    acVar.m();
                    break;
                }
                break;
            case 16:
                if (kcVar.g0 == -1 && kcVar.f0 == 1) {
                    ac acVar2 = kcVar.c1;
                    if (!acVar2.p0 && !acVar2.O1) {
                        vc vcVar = kcVar.Z0;
                        if (!vcVar.P) {
                            bb bbVar2 = kcVar.d1;
                            if (bbVar2.M) {
                                bbVar2.c(false, true);
                                break;
                            } else {
                                kcVar.l0(0, false, true);
                                mb mbVar2 = kcVar.v1;
                                if (mbVar2 != null) {
                                    mbVar2.R0(2);
                                    mbVar2.l2 = true;
                                    mbVar2.o0(true);
                                    kcVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            vcVar.P = false;
                            if (vcVar.E && vcVar.h == null) {
                                vcVar.G = true;
                                oc ocVar = vcVar.a;
                                if (ocVar != null) {
                                    ocVar.X(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                kcVar.N1 = true;
                kcVar.b1.setShareEnabled(false);
                u0 u0Var = kcVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                kcVar.A0.setCameraThumb(kcVar.A());
                break;
            case 19:
                jc jcVar2 = kcVar.n;
                ai.d dVar = kcVar.a;
                new org.telegram.ui.Components.yc(jcVar2, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.i6.gc, 0, new ga(kcVar, 27), dVar)).k(true);
                break;
            case 20:
                ea eaVar = kcVar.q0;
                if (eaVar != null) {
                    eaVar.dismiss();
                }
                kcVar.K(2, true);
                break;
            case 21:
                kcVar.l0(-1, false, true);
                break;
            case 22:
                kcVar.l0(-1, false, true);
                break;
            case 23:
                kcVar.d = false;
                AndroidUtilities.unlockOrientation(kcVar.b);
                if (kcVar.B0 != null) {
                    if (kcVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(kcVar.B0.getCameraSession(), false);
                    }
                    kcVar.v(false);
                }
                yb ybVar3 = kcVar.X0;
                if (ybVar3 != null) {
                    ybVar3.set(null);
                }
                kcVar.z();
                kcVar.y();
                File file = kcVar.G1;
                if (file != null && !kcVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                kcVar.G1 = null;
                AndroidUtilities.runOnUIThread(new ga(kcVar, 28), 16L);
                fc fcVar = kcVar.F;
                if (fcVar != null) {
                    fcVar.f(false);
                }
                if (kcVar.x2 != null) {
                    kcVar.x2 = null;
                }
                kcVar.l2 = null;
                kc kcVar2 = kc.F2;
                if (kcVar2 != null) {
                    kcVar2.q(false);
                }
                kc.F2 = null;
                jc jcVar3 = kcVar.n;
                if (jcVar3 != null) {
                    org.telegram.ui.Components.rc.h(jcVar3);
                }
                ai.f0 f0Var = kcVar.l0;
                if (f0Var != null) {
                    org.telegram.ui.Components.rc.h(f0Var);
                }
                xb xbVar3 = kcVar.A0;
                if (xbVar3 != null) {
                    xbVar3.e();
                    break;
                }
                break;
            case 24:
                if (!kcVar.K1.b0 && kcVar.q0 != null && (ybVar = kcVar.X0) != null) {
                    ybVar.h(new ha(kcVar, i14), ybVar, kcVar.w1, kcVar.z1);
                }
                kcVar.K(1, true);
                break;
            case 25:
                kcVar.j0(false);
                kcVar.e2 = null;
                break;
            case 26:
                kcVar.j0(false);
                kcVar.e2 = null;
                break;
            case 27:
                kcVar.T();
                break;
            default:
                WindowManager windowManager = kcVar.f;
                if (windowManager != null && (jcVar = kcVar.n) != null && jcVar.getParent() != null) {
                    windowManager.removeView(kcVar.n);
                    break;
                }
                break;
        }
    }
}
