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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ ha(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
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
        zb zbVar;
        kc kcVar;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        lc lcVar = this.b;
        switch (i11) {
            case 0:
                lcVar.r();
                break;
            case 1:
                if (lcVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", lcVar.s.o).putFloat("frontflash_intensity", lcVar.s.p).apply();
                }
                lcVar.s.e(0.0f, 240L, null);
                lcVar.E0.setSelected(false);
                break;
            case 2:
                lcVar.m();
                lcVar.W1 = false;
                int i15 = lcVar.c;
                if (lcVar.K1 == null) {
                    lcVar.q(true);
                    break;
                } else {
                    lcVar.y();
                    ia iaVar = new ia(lcVar, i13);
                    if (lcVar.H1 == null) {
                        l8 l8Var = lcVar.K1;
                        if (l8Var.K && !l8Var.v() && !l8Var.g) {
                            long j3 = l8Var.h0;
                            if (j3 > 0 && !l8Var.n) {
                                long j10 = (long) ((l8Var.a0 - l8Var.Z) * j3);
                                if (j10 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    l8Var.a0 = (59000.0f / l8Var.h0) + l8Var.Z;
                                    arrayList.add(l8Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    c10 = 0;
                                    while (j12 < j10) {
                                        if (Math.min(j11, j10 - j12) < 1000) {
                                            i10 = i15;
                                        } else {
                                            long j13 = j11;
                                            l8 g10 = l8Var.g();
                                            float f7 = l8Var.Z;
                                            float f10 = l8Var.h0;
                                            g10.Z = (j12 / f10) + f7;
                                            g10.a0 = ((r14 + j12) / f10) + l8Var.Z;
                                            g10.C0 = "";
                                            j12 += j13;
                                            arrayList.add(g10);
                                            j11 = j13;
                                            i15 = i15;
                                        }
                                    }
                                    i10 = i15;
                                }
                                lcVar.H1 = arrayList;
                                if (arrayList != null) {
                                    lcVar.I1 = new ArrayList();
                                    lcVar.J1 = new ArrayList();
                                    for (int i16 = 0; i16 < lcVar.H1.size(); i16 = com.google.android.gms.internal.vision.e2.e(i16, i16, 1, lcVar.J1)) {
                                        lcVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        c10 = 0;
                        arrayList = null;
                        lcVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        c10 = 0;
                    }
                    if (lcVar.H1 != null) {
                        ArrayList arrayList2 = lcVar.J1;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (lcVar.I1.contains(num)) {
                                l8 l8Var2 = (l8) lcVar.H1.get(num.intValue());
                                l8 l8Var3 = lcVar.K1;
                                if (l8Var3 == l8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = lcVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = lcVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    l8 l8Var4 = lcVar.K1;
                                    l8Var4.k = (TextUtils.equals(l8Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    lcVar.K1.C0 = new SpannableString(lcVar.c1.getText());
                                } else if (l8Var2.C0 == null) {
                                    l8Var3.k = false;
                                    l8Var3.C0 = new SpannableString("");
                                }
                                iaVar.run(l8Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {lcVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{lcVar.K1.C0}, true) : new ArrayList<>();
                        l8 l8Var5 = lcVar.K1;
                        l8Var5.k = (TextUtils.equals(l8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        lcVar.K1.C0 = new SpannableString(lcVar.c1.getText());
                        iaVar.run(lcVar.K1);
                    }
                    long j14 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = lcVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    lcVar.K1 = null;
                    lcVar.v = true;
                    lcVar.w = j14;
                    lcVar.B2 = true;
                    lcVar.o();
                    ai.j jVar = new ai.j(lcVar, j14, 6);
                    cc ccVar = lcVar.x;
                    if (ccVar != null) {
                        ccVar.d(j14, jVar);
                    } else {
                        jVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                lcVar.Z(false);
                break;
            case 4:
                l8 l8Var6 = lcVar.K1;
                if (l8Var6 != null) {
                    l8Var6.y0 = !l8Var6.y0;
                    zb zbVar2 = lcVar.X0;
                    if (zbVar2 != null) {
                        zbVar2.u(l8Var6);
                    }
                    nb nbVar = lcVar.v1;
                    if (nbVar != null && nbVar.R0 != null) {
                        while (r10 < lcVar.v1.R0.getChildCount()) {
                            View childAt = lcVar.v1.R0.getChildAt(r10);
                            if (childAt instanceof qg.h1) {
                                ((qg.h1) childAt).setupTheme(lcVar.K1);
                            }
                            r10++;
                        }
                    }
                    lcVar.o0(true);
                    break;
                }
                break;
            case 5:
                lcVar.q(true);
                break;
            case 6:
                lcVar.d = true;
                lcVar.v = false;
                if (lcVar.J == 1) {
                    lcVar.h0.setAlpha(1.0f);
                    lcVar.h0.setTranslationX(0.0f);
                    lcVar.h0.setTranslationY(0.0f);
                    lcVar.i0.setAlpha(1.0f);
                    lcVar.k0.setAlpha(1.0f);
                    lcVar.n.setBackgroundColor(-16777216);
                    if (lcVar.f0 == 2) {
                        lcVar.u1.setAlpha(1.0f);
                    }
                }
                ha haVar = lcVar.x2;
                if (haVar != null) {
                    haVar.run();
                    lcVar.x2 = null;
                } else {
                    lcVar.P();
                }
                l8 l8Var7 = lcVar.K1;
                if (l8Var7 != null && l8Var7.n) {
                    lcVar.u();
                    lcVar.H();
                    lcVar.s();
                    break;
                } else if (l8Var7 != null && l8Var7.u) {
                    if (l8Var7.K) {
                        lcVar.X0.t(l8Var7, null, 0L);
                    }
                    lcVar.s();
                    break;
                }
                break;
            case 7:
                lcVar.g(1.0f, true, new ha(lcVar, i12));
                break;
            case 8:
                lcVar.A0.setCameraThumb(lcVar.A());
                ob obVar = lcVar.B0;
                if (obVar != null) {
                    obVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(lcVar.B0);
                    yb ybVar = lcVar.A0;
                    if (ybVar != null) {
                        ybVar.setCameraView(null);
                    }
                    lcVar.B0 = null;
                    break;
                }
                break;
            case 9:
                lcVar.A0.setCameraThumb(lcVar.A());
                break;
            case 10:
                if (lcVar.f0 == 1) {
                    lcVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                cb cbVar = lcVar.d1;
                if (cbVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + lcVar.c1.getEditTextHeight());
                    cbVar.setTranslationY(i18 - (lcVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                yb ybVar2 = lcVar.A0;
                if (ybVar2 != null) {
                    ybVar2.c.b(lcVar.D0.y ? lcVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                lcVar.m0(true);
                break;
            case 14:
                lcVar.s();
                break;
            case 15:
                bc bcVar = lcVar.c1;
                if (bcVar != null) {
                    bcVar.m();
                    break;
                }
                break;
            case 16:
                if (lcVar.g0 == -1 && lcVar.f0 == 1) {
                    bc bcVar2 = lcVar.c1;
                    if (!bcVar2.p0 && !bcVar2.O1) {
                        wc wcVar = lcVar.Z0;
                        if (!wcVar.P) {
                            cb cbVar2 = lcVar.d1;
                            if (cbVar2.M) {
                                cbVar2.c(false, true);
                                break;
                            } else {
                                lcVar.l0(0, false, true);
                                nb nbVar2 = lcVar.v1;
                                if (nbVar2 != null) {
                                    nbVar2.R0(2);
                                    nbVar2.l2 = true;
                                    nbVar2.o0(true);
                                    lcVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            wcVar.P = false;
                            if (wcVar.E && wcVar.h == null) {
                                wcVar.G = true;
                                pc pcVar = wcVar.a;
                                if (pcVar != null) {
                                    pcVar.Q(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                lcVar.N1 = true;
                lcVar.b1.setShareEnabled(false);
                u0 u0Var = lcVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                lcVar.A0.setCameraThumb(lcVar.A());
                break;
            case 19:
                kc kcVar2 = lcVar.n;
                ai.d dVar = lcVar.a;
                new org.telegram.ui.Components.xc(kcVar2, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.h6.gc, 0, new ha(lcVar, 27), dVar)).k(true);
                break;
            case 20:
                fa faVar = lcVar.q0;
                if (faVar != null) {
                    faVar.dismiss();
                }
                lcVar.K(2, true);
                break;
            case 21:
                lcVar.l0(-1, false, true);
                break;
            case 22:
                lcVar.l0(-1, false, true);
                break;
            case 23:
                lcVar.d = false;
                AndroidUtilities.unlockOrientation(lcVar.b);
                if (lcVar.B0 != null) {
                    if (lcVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(lcVar.B0.getCameraSession(), false);
                    }
                    lcVar.v(false);
                }
                zb zbVar3 = lcVar.X0;
                if (zbVar3 != null) {
                    zbVar3.set(null);
                }
                lcVar.z();
                lcVar.y();
                File file = lcVar.G1;
                if (file != null && !lcVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                lcVar.G1 = null;
                AndroidUtilities.runOnUIThread(new ha(lcVar, 28), 16L);
                gc gcVar = lcVar.F;
                if (gcVar != null) {
                    gcVar.f(false);
                }
                if (lcVar.x2 != null) {
                    lcVar.x2 = null;
                }
                lcVar.l2 = null;
                lc lcVar2 = lc.F2;
                if (lcVar2 != null) {
                    lcVar2.q(false);
                }
                lc.F2 = null;
                kc kcVar3 = lcVar.n;
                if (kcVar3 != null) {
                    org.telegram.ui.Components.qc.h(kcVar3);
                }
                ai.f0 f0Var = lcVar.l0;
                if (f0Var != null) {
                    org.telegram.ui.Components.qc.h(f0Var);
                }
                yb ybVar3 = lcVar.A0;
                if (ybVar3 != null) {
                    ybVar3.e();
                    break;
                }
                break;
            case 24:
                if (!lcVar.K1.b0 && lcVar.q0 != null && (zbVar = lcVar.X0) != null) {
                    zbVar.h(new ia(lcVar, i14), zbVar, lcVar.w1, lcVar.z1);
                }
                lcVar.K(1, true);
                break;
            case 25:
                lcVar.j0(false);
                lcVar.e2 = null;
                break;
            case 26:
                lcVar.j0(false);
                lcVar.e2 = null;
                break;
            case 27:
                lcVar.T();
                break;
            default:
                WindowManager windowManager = lcVar.f;
                if (windowManager != null && (kcVar = lcVar.n) != null && kcVar.getParent() != null) {
                    windowManager.removeView(lcVar.n);
                    break;
                }
                break;
        }
    }
}
