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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ ga(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0358  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        yb ybVar;
        jc jcVar;
        int i12 = this.a;
        int i13 = 6;
        int i14 = 2;
        int i15 = 1;
        kc kcVar = this.b;
        switch (i12) {
            case 0:
                kcVar.q();
                break;
            case 1:
                if (kcVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", kcVar.s.o).putFloat("frontflash_intensity", kcVar.s.p).apply();
                }
                kcVar.s.e(0.0f, 240L, null);
                kcVar.E0.setSelected(false);
                break;
            case 2:
                kcVar.l();
                kcVar.W1 = false;
                int i16 = kcVar.c;
                if (kcVar.K1 == null) {
                    kcVar.p(true);
                    break;
                } else {
                    kcVar.x();
                    ha haVar = new ha(kcVar, i14);
                    if (kcVar.H1 == null) {
                        k8 k8Var = kcVar.K1;
                        if (k8Var.K && !k8Var.v() && !k8Var.g) {
                            long j10 = k8Var.h0;
                            if (j10 > 0 && !k8Var.n) {
                                long j11 = (long) ((k8Var.a0 - k8Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i16;
                                    arrayList = null;
                                    i11 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    k8Var.a0 = (59000.0f / k8Var.h0) + k8Var.Z;
                                    arrayList.add(k8Var);
                                    long j12 = 59000;
                                    i11 = 0;
                                    long j13 = 59000;
                                    while (j13 < j11) {
                                        if (Math.min(j12, j11 - j13) < 1000) {
                                            i10 = i16;
                                        } else {
                                            long j14 = j12;
                                            k8 g10 = k8Var.g();
                                            float f7 = k8Var.Z;
                                            float f10 = k8Var.h0;
                                            g10.Z = (j13 / f10) + f7;
                                            g10.a0 = ((r14 + j13) / f10) + k8Var.Z;
                                            g10.C0 = "";
                                            j13 += j14;
                                            arrayList.add(g10);
                                            j12 = j14;
                                            i16 = i16;
                                        }
                                    }
                                    i10 = i16;
                                }
                                kcVar.H1 = arrayList;
                                if (arrayList != null) {
                                    kcVar.I1 = new ArrayList();
                                    kcVar.J1 = new ArrayList();
                                    for (int i17 = i11; i17 < kcVar.H1.size(); i17 = com.google.android.gms.internal.play_billing.k3.f(i17, i17, 1, kcVar.J1)) {
                                        kcVar.I1.add(Integer.valueOf(i17));
                                    }
                                }
                            }
                        }
                        i10 = i16;
                        i11 = 0;
                        arrayList = null;
                        kcVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i16;
                        i11 = 0;
                    }
                    if (kcVar.H1 != null) {
                        ArrayList arrayList2 = kcVar.J1;
                        int size = arrayList2.size();
                        int i18 = i11;
                        while (i18 < size) {
                            Object obj = arrayList2.get(i18);
                            i18++;
                            Integer num = (Integer) obj;
                            if (kcVar.I1.contains(num)) {
                                k8 k8Var2 = (k8) kcVar.H1.get(num.intValue());
                                k8 k8Var3 = kcVar.K1;
                                if (k8Var3 == k8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i11] = kcVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i11] = kcVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    k8 k8Var4 = kcVar.K1;
                                    k8Var4.k = (TextUtils.equals(k8Var4.C0, charSequenceArr[i11]) && MediaDataController.entitiesEqual(entities, entities2)) ? i11 : 1;
                                    kcVar.K1.C0 = new SpannableString(kcVar.c1.getText());
                                } else if (k8Var2.C0 == null) {
                                    k8Var3.k = i11;
                                    k8Var3.C0 = new SpannableString("");
                                }
                                haVar.run(k8Var2);
                                i11 = 0;
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
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = kcVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    kcVar.K1 = null;
                    kcVar.v = true;
                    kcVar.w = j15;
                    kcVar.B2 = true;
                    kcVar.n();
                    bi.g gVar = new bi.g(kcVar, j15, 6);
                    bc bcVar = kcVar.x;
                    if (bcVar != null) {
                        bcVar.b(j15, gVar);
                    } else {
                        gVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                kcVar.Y(false);
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
                            if (childAt instanceof rg.g1) {
                                ((rg.g1) childAt).setupTheme(kcVar.K1);
                            }
                            r10++;
                        }
                    }
                    kcVar.n0(true);
                    break;
                }
                break;
            case 5:
                kcVar.p(true);
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
                    kcVar.O();
                }
                k8 k8Var7 = kcVar.K1;
                if (k8Var7 != null && k8Var7.n) {
                    kcVar.t();
                    kcVar.G();
                    kcVar.r();
                    break;
                } else if (k8Var7 != null && k8Var7.u) {
                    if (k8Var7.K) {
                        kcVar.X0.t(k8Var7, null, 0L);
                    }
                    kcVar.r();
                    break;
                }
                break;
            case 7:
                kcVar.f(1.0f, true, new ga(kcVar, i13));
                break;
            case 8:
                kcVar.A0.setCameraThumb(kcVar.z());
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
                kcVar.A0.setCameraThumb(kcVar.z());
                break;
            case 10:
                if (kcVar.f0 == 1) {
                    kcVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                bb bbVar = kcVar.d1;
                if (bbVar != null) {
                    int i19 = -(AndroidUtilities.dp(24.0f) + kcVar.c1.getEditTextHeight());
                    bbVar.setTranslationY(i19 - (kcVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                xb xbVar2 = kcVar.A0;
                if (xbVar2 != null) {
                    xbVar2.c.a(kcVar.D0.y ? kcVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                kcVar.l0(true);
                break;
            case 14:
                kcVar.r();
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
                        uc ucVar = kcVar.Z0;
                        if (!ucVar.P) {
                            bb bbVar2 = kcVar.d1;
                            if (bbVar2.M) {
                                bbVar2.c(false, true);
                                break;
                            } else {
                                kcVar.k0(0, false, true);
                                mb mbVar2 = kcVar.v1;
                                if (mbVar2 != null) {
                                    mbVar2.Q0(2);
                                    mbVar2.l2 = true;
                                    mbVar2.n0(true);
                                    kcVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            ucVar.P = false;
                            if (ucVar.E && ucVar.h == null) {
                                ucVar.G = true;
                                oc ocVar = ucVar.a;
                                if (ocVar != null) {
                                    ocVar.N(true);
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
                t0 t0Var = kcVar.e1;
                t0Var.getClass();
                t0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                kcVar.A0.setCameraThumb(kcVar.z());
                break;
            case 19:
                jc jcVar2 = kcVar.n;
                bi.b bVar = kcVar.a;
                new org.telegram.ui.Components.zc(jcVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new ga(kcVar, 27), bVar)).k(true);
                break;
            case 20:
                ea eaVar = kcVar.q0;
                if (eaVar != null) {
                    eaVar.dismiss();
                }
                kcVar.J(2, true);
                break;
            case 21:
                kcVar.k0(-1, false, true);
                break;
            case 22:
                kcVar.k0(-1, false, true);
                break;
            case 23:
                kcVar.d = false;
                AndroidUtilities.unlockOrientation(kcVar.b);
                if (kcVar.B0 != null) {
                    if (kcVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(kcVar.B0.getCameraSession(), false);
                    }
                    kcVar.u(false);
                }
                yb ybVar3 = kcVar.X0;
                if (ybVar3 != null) {
                    ybVar3.set(null);
                }
                kcVar.y();
                kcVar.x();
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
                    kcVar2.p(false);
                }
                kc.F2 = null;
                jc jcVar3 = kcVar.n;
                if (jcVar3 != null) {
                    org.telegram.ui.Components.sc.h(jcVar3);
                }
                ah.x xVar = kcVar.l0;
                if (xVar != null) {
                    org.telegram.ui.Components.sc.h(xVar);
                }
                xb xbVar3 = kcVar.A0;
                if (xbVar3 != null) {
                    xbVar3.e();
                    break;
                }
                break;
            case 24:
                if (!kcVar.K1.b0 && kcVar.q0 != null && (ybVar = kcVar.X0) != null) {
                    ybVar.h(new ha(kcVar, i15), ybVar, kcVar.w1, kcVar.z1);
                }
                kcVar.J(1, true);
                break;
            case 25:
                kcVar.i0(false);
                kcVar.e2 = null;
                break;
            case 26:
                kcVar.i0(false);
                kcVar.e2 = null;
                break;
            case 27:
                kcVar.S();
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
