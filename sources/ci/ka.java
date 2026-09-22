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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ ka(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
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
        cc ccVar;
        nc ncVar;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        oc ocVar = this.b;
        switch (i11) {
            case 0:
                ocVar.r();
                break;
            case 1:
                if (ocVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", ocVar.s.o).putFloat("frontflash_intensity", ocVar.s.p).apply();
                }
                ocVar.s.e(0.0f, 240L, null);
                ocVar.E0.setSelected(false);
                break;
            case 2:
                ocVar.m();
                ocVar.W1 = false;
                int i15 = ocVar.c;
                if (ocVar.K1 == null) {
                    ocVar.q(true);
                    break;
                } else {
                    ocVar.y();
                    la laVar = new la(ocVar, i13);
                    if (ocVar.H1 == null) {
                        o8 o8Var = ocVar.K1;
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
                                ocVar.H1 = arrayList;
                                if (arrayList != null) {
                                    ocVar.I1 = new ArrayList();
                                    ocVar.J1 = new ArrayList();
                                    for (int i16 = 0; i16 < ocVar.H1.size(); i16 = com.google.android.gms.internal.vision.e2.e(i16, i16, 1, ocVar.J1)) {
                                        ocVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        c10 = 0;
                        arrayList = null;
                        ocVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        c10 = 0;
                    }
                    if (ocVar.H1 != null) {
                        ArrayList arrayList2 = ocVar.J1;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (ocVar.I1.contains(num)) {
                                o8 o8Var2 = (o8) ocVar.H1.get(num.intValue());
                                o8 o8Var3 = ocVar.K1;
                                if (o8Var3 == o8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = ocVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = ocVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    o8 o8Var4 = ocVar.K1;
                                    o8Var4.k = (TextUtils.equals(o8Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    ocVar.K1.C0 = new SpannableString(ocVar.c1.getText());
                                } else if (o8Var2.C0 == null) {
                                    o8Var3.k = false;
                                    o8Var3.C0 = new SpannableString("");
                                }
                                laVar.run(o8Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {ocVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{ocVar.K1.C0}, true) : new ArrayList<>();
                        o8 o8Var5 = ocVar.K1;
                        o8Var5.k = (TextUtils.equals(o8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        ocVar.K1.C0 = new SpannableString(ocVar.c1.getText());
                        laVar.run(ocVar.K1);
                    }
                    long j14 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = ocVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    ocVar.K1 = null;
                    ocVar.v = true;
                    ocVar.w = j14;
                    ocVar.B2 = true;
                    ocVar.o();
                    ai.j jVar = new ai.j(ocVar, j14, 6);
                    fc fcVar = ocVar.x;
                    if (fcVar != null) {
                        fcVar.d(j14, jVar);
                    } else {
                        jVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                ocVar.Z(false);
                break;
            case 4:
                o8 o8Var6 = ocVar.K1;
                if (o8Var6 != null) {
                    o8Var6.y0 = !o8Var6.y0;
                    cc ccVar2 = ocVar.X0;
                    if (ccVar2 != null) {
                        ccVar2.u(o8Var6);
                    }
                    qb qbVar = ocVar.v1;
                    if (qbVar != null && qbVar.R0 != null) {
                        while (r10 < ocVar.v1.R0.getChildCount()) {
                            View childAt = ocVar.v1.R0.getChildAt(r10);
                            if (childAt instanceof qg.f1) {
                                ((qg.f1) childAt).setupTheme(ocVar.K1);
                            }
                            r10++;
                        }
                    }
                    ocVar.o0(true);
                    break;
                }
                break;
            case 5:
                ocVar.q(true);
                break;
            case 6:
                ocVar.d = true;
                ocVar.v = false;
                if (ocVar.J == 1) {
                    ocVar.h0.setAlpha(1.0f);
                    ocVar.h0.setTranslationX(0.0f);
                    ocVar.h0.setTranslationY(0.0f);
                    ocVar.i0.setAlpha(1.0f);
                    ocVar.k0.setAlpha(1.0f);
                    ocVar.n.setBackgroundColor(-16777216);
                    if (ocVar.f0 == 2) {
                        ocVar.u1.setAlpha(1.0f);
                    }
                }
                ka kaVar = ocVar.x2;
                if (kaVar != null) {
                    kaVar.run();
                    ocVar.x2 = null;
                } else {
                    ocVar.P();
                }
                o8 o8Var7 = ocVar.K1;
                if (o8Var7 != null && o8Var7.n) {
                    ocVar.u();
                    ocVar.H();
                    ocVar.s();
                    break;
                } else if (o8Var7 != null && o8Var7.u) {
                    if (o8Var7.K) {
                        ocVar.X0.t(o8Var7, null, 0L);
                    }
                    ocVar.s();
                    break;
                }
                break;
            case 7:
                ocVar.g(1.0f, true, new ka(ocVar, i12));
                break;
            case 8:
                ocVar.A0.setCameraThumb(ocVar.A());
                rb rbVar = ocVar.B0;
                if (rbVar != null) {
                    rbVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(ocVar.B0);
                    bc bcVar = ocVar.A0;
                    if (bcVar != null) {
                        bcVar.setCameraView(null);
                    }
                    ocVar.B0 = null;
                    break;
                }
                break;
            case 9:
                ocVar.A0.setCameraThumb(ocVar.A());
                break;
            case 10:
                if (ocVar.f0 == 1) {
                    ocVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                fb fbVar = ocVar.d1;
                if (fbVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + ocVar.c1.getEditTextHeight());
                    fbVar.setTranslationY(i18 - (ocVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                bc bcVar2 = ocVar.A0;
                if (bcVar2 != null) {
                    bcVar2.c.b(ocVar.D0.y ? ocVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                ocVar.m0(true);
                break;
            case 14:
                ocVar.s();
                break;
            case 15:
                ec ecVar = ocVar.c1;
                if (ecVar != null) {
                    ecVar.m();
                    break;
                }
                break;
            case 16:
                if (ocVar.g0 == -1 && ocVar.f0 == 1) {
                    ec ecVar2 = ocVar.c1;
                    if (!ecVar2.p0 && !ecVar2.O1) {
                        zc zcVar = ocVar.Z0;
                        if (!zcVar.P) {
                            fb fbVar2 = ocVar.d1;
                            if (fbVar2.M) {
                                fbVar2.c(false, true);
                                break;
                            } else {
                                ocVar.l0(0, false, true);
                                qb qbVar2 = ocVar.v1;
                                if (qbVar2 != null) {
                                    qbVar2.R0(2);
                                    qbVar2.l2 = true;
                                    qbVar2.o0(true);
                                    ocVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            zcVar.P = false;
                            if (zcVar.E && zcVar.h == null) {
                                zcVar.G = true;
                                sc scVar = zcVar.a;
                                if (scVar != null) {
                                    scVar.L(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                ocVar.N1 = true;
                ocVar.b1.setShareEnabled(false);
                u0 u0Var = ocVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                ocVar.A0.setCameraThumb(ocVar.A());
                break;
            case 19:
                nc ncVar2 = ocVar.n;
                ai.d dVar = ocVar.a;
                new org.telegram.ui.Components.xc(ncVar2, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new ka(ocVar, 27), dVar)).k(true);
                break;
            case 20:
                ia iaVar = ocVar.q0;
                if (iaVar != null) {
                    iaVar.dismiss();
                }
                ocVar.K(2, true);
                break;
            case 21:
                ocVar.l0(-1, false, true);
                break;
            case 22:
                ocVar.l0(-1, false, true);
                break;
            case 23:
                ocVar.d = false;
                AndroidUtilities.unlockOrientation(ocVar.b);
                if (ocVar.B0 != null) {
                    if (ocVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(ocVar.B0.getCameraSession(), false);
                    }
                    ocVar.v(false);
                }
                cc ccVar3 = ocVar.X0;
                if (ccVar3 != null) {
                    ccVar3.set(null);
                }
                ocVar.z();
                ocVar.y();
                File file = ocVar.G1;
                if (file != null && !ocVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                ocVar.G1 = null;
                AndroidUtilities.runOnUIThread(new ka(ocVar, 28), 16L);
                jc jcVar = ocVar.F;
                if (jcVar != null) {
                    jcVar.f(false);
                }
                if (ocVar.x2 != null) {
                    ocVar.x2 = null;
                }
                ocVar.l2 = null;
                oc ocVar2 = oc.F2;
                if (ocVar2 != null) {
                    ocVar2.q(false);
                }
                oc.F2 = null;
                nc ncVar3 = ocVar.n;
                if (ncVar3 != null) {
                    org.telegram.ui.Components.pc.h(ncVar3);
                }
                ai.f0 f0Var = ocVar.l0;
                if (f0Var != null) {
                    org.telegram.ui.Components.pc.h(f0Var);
                }
                bc bcVar3 = ocVar.A0;
                if (bcVar3 != null) {
                    bcVar3.e();
                    break;
                }
                break;
            case 24:
                if (!ocVar.K1.b0 && ocVar.q0 != null && (ccVar = ocVar.X0) != null) {
                    ccVar.h(new la(ocVar, i14), ccVar, ocVar.w1, ocVar.z1);
                }
                ocVar.K(1, true);
                break;
            case 25:
                ocVar.j0(false);
                ocVar.e2 = null;
                break;
            case 26:
                ocVar.j0(false);
                ocVar.e2 = null;
                break;
            case 27:
                ocVar.T();
                break;
            default:
                WindowManager windowManager = ocVar.f;
                if (windowManager != null && (ncVar = ocVar.n) != null && ncVar.getParent() != null) {
                    windowManager.removeView(ocVar.n);
                    break;
                }
                break;
        }
    }
}
