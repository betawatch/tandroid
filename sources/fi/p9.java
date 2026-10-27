package fi;

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
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ p9(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        gb gbVar;
        rb rbVar;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        sb sbVar = this.b;
        switch (i12) {
            case 0:
                sbVar.q();
                break;
            case 1:
                if (sbVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", sbVar.s.o).putFloat("frontflash_intensity", sbVar.s.p).apply();
                }
                sbVar.s.e(0.0f, 240L, null);
                sbVar.E0.setSelected(false);
                break;
            case 2:
                sbVar.l();
                sbVar.W1 = false;
                int i15 = sbVar.c;
                if (sbVar.K1 == null) {
                    sbVar.p(true);
                    break;
                } else {
                    sbVar.x();
                    q9 q9Var = new q9(sbVar, i13);
                    if (sbVar.H1 == null) {
                        w7 w7Var = sbVar.K1;
                        if (w7Var.K && !w7Var.v() && !w7Var.g) {
                            long j10 = w7Var.h0;
                            if (j10 > 0 && !w7Var.n) {
                                long j11 = (long) ((w7Var.a0 - w7Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    i11 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    w7Var.a0 = (59000.0f / w7Var.h0) + w7Var.Z;
                                    arrayList.add(w7Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        i11 = r9;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                w7 g7 = w7Var.g();
                                                float f7 = w7Var.Z;
                                                float f10 = w7Var.h0;
                                                g7.Z = (j13 / f10) + f7;
                                                g7.a0 = ((r9 + j13) / f10) + w7Var.Z;
                                                g7.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g7);
                                                r9 = i11;
                                                j12 = j14;
                                                i15 = i15;
                                            }
                                        }
                                    }
                                    i10 = i15;
                                }
                                sbVar.H1 = arrayList;
                                if (arrayList != null) {
                                    sbVar.I1 = new ArrayList();
                                    sbVar.J1 = new ArrayList();
                                    for (int i16 = i11; i16 < sbVar.H1.size(); i16 = c3.h0.i(i16, i16, 1, sbVar.J1)) {
                                        sbVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        i11 = 0;
                        arrayList = null;
                        sbVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        i11 = 0;
                    }
                    if (sbVar.H1 != null) {
                        ArrayList arrayList2 = sbVar.J1;
                        int size = arrayList2.size();
                        int i17 = i11;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (sbVar.I1.contains(num)) {
                                w7 w7Var2 = (w7) sbVar.H1.get(num.intValue());
                                w7 w7Var3 = sbVar.K1;
                                if (w7Var3 == w7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i11] = sbVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i11] = sbVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    w7 w7Var4 = sbVar.K1;
                                    w7Var4.k = (TextUtils.equals(w7Var4.C0, charSequenceArr[i11]) && MediaDataController.entitiesEqual(entities, entities2)) ? i11 : 1;
                                    sbVar.K1.C0 = new SpannableString(sbVar.c1.getText());
                                } else if (w7Var2.C0 == null) {
                                    w7Var3.k = i11;
                                    w7Var3.C0 = new SpannableString("");
                                }
                                q9Var.run(w7Var2);
                                i11 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {sbVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{sbVar.K1.C0}, true) : new ArrayList<>();
                        w7 w7Var5 = sbVar.K1;
                        w7Var5.k = (TextUtils.equals(w7Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        sbVar.K1.C0 = new SpannableString(sbVar.c1.getText());
                        q9Var.run(sbVar.K1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = sbVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    sbVar.K1 = null;
                    sbVar.v = true;
                    sbVar.w = j15;
                    sbVar.B2 = true;
                    sbVar.n();
                    bi.r3 r3Var = new bi.r3(sbVar, j15, 8);
                    jb jbVar = sbVar.x;
                    if (jbVar != null) {
                        jbVar.c(j15, r3Var);
                    } else {
                        r3Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                sbVar.Y(false);
                break;
            case 4:
                w7 w7Var6 = sbVar.K1;
                if (w7Var6 != null) {
                    w7Var6.y0 = !w7Var6.y0;
                    gb gbVar2 = sbVar.X0;
                    if (gbVar2 != null) {
                        gbVar2.u(w7Var6);
                    }
                    ta taVar = sbVar.v1;
                    if (taVar != null && taVar.G0 != null) {
                        while (r9 < sbVar.v1.G0.getChildCount()) {
                            View childAt = sbVar.v1.G0.getChildAt(r9);
                            if (childAt instanceof sg.f1) {
                                ((sg.f1) childAt).setupTheme(sbVar.K1);
                            }
                            r9++;
                        }
                    }
                    sbVar.n0(true);
                    break;
                }
                break;
            case 5:
                sbVar.p(true);
                break;
            case 6:
                sbVar.d = true;
                sbVar.v = false;
                if (sbVar.J == 1) {
                    sbVar.h0.setAlpha(1.0f);
                    sbVar.h0.setTranslationX(0.0f);
                    sbVar.h0.setTranslationY(0.0f);
                    sbVar.i0.setAlpha(1.0f);
                    sbVar.k0.setAlpha(1.0f);
                    sbVar.n.setBackgroundColor(-16777216);
                    if (sbVar.f0 == 2) {
                        sbVar.u1.setAlpha(1.0f);
                    }
                }
                p9 p9Var = sbVar.x2;
                if (p9Var != null) {
                    p9Var.run();
                    sbVar.x2 = null;
                } else {
                    sbVar.O();
                }
                w7 w7Var7 = sbVar.K1;
                if (w7Var7 != null && w7Var7.n) {
                    sbVar.t();
                    sbVar.G();
                    sbVar.r();
                    break;
                } else if (w7Var7 != null && w7Var7.u) {
                    if (w7Var7.K) {
                        sbVar.X0.t(w7Var7, null, 0L);
                    }
                    sbVar.r();
                    break;
                }
                break;
            case 7:
                sbVar.f(1.0f, true, new p9(sbVar, 6));
                break;
            case 8:
                sbVar.A0.setCameraThumb(sbVar.z());
                va vaVar = sbVar.B0;
                if (vaVar != null) {
                    vaVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(sbVar.B0);
                    fb fbVar = sbVar.A0;
                    if (fbVar != null) {
                        fbVar.setCameraView(null);
                    }
                    sbVar.B0 = null;
                    break;
                }
                break;
            case 9:
                sbVar.A0.setCameraThumb(sbVar.z());
                break;
            case 10:
                if (sbVar.f0 == 1) {
                    sbVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                ia iaVar = sbVar.d1;
                if (iaVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + sbVar.c1.getEditTextHeight());
                    iaVar.setTranslationY(i18 - (sbVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                fb fbVar2 = sbVar.A0;
                if (fbVar2 != null) {
                    fbVar2.c.a(sbVar.D0.y ? sbVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                sbVar.l0(true);
                break;
            case 14:
                sbVar.r();
                break;
            case 15:
                ib ibVar = sbVar.c1;
                if (ibVar != null) {
                    ibVar.m();
                    break;
                }
                break;
            case 16:
                if (sbVar.g0 == -1 && sbVar.f0 == 1) {
                    ib ibVar2 = sbVar.c1;
                    if (!ibVar2.p0 && !ibVar2.O1) {
                        cc ccVar = sbVar.Z0;
                        if (!ccVar.P) {
                            ia iaVar2 = sbVar.d1;
                            if (iaVar2.M) {
                                iaVar2.c(false, true);
                                break;
                            } else {
                                sbVar.k0(0, false, true);
                                ta taVar2 = sbVar.v1;
                                if (taVar2 != null) {
                                    taVar2.O0(2);
                                    taVar2.a2 = true;
                                    taVar2.l0(true);
                                    sbVar.v1.B0 = true;
                                    break;
                                }
                            }
                        } else {
                            ccVar.P = false;
                            if (ccVar.E && ccVar.h == null) {
                                ccVar.G = true;
                                wb wbVar = ccVar.a;
                                if (wbVar != null) {
                                    wbVar.A(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                sbVar.N1 = true;
                sbVar.b1.setShareEnabled(false);
                u0 u0Var = sbVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                sbVar.A0.setCameraThumb(sbVar.z());
                break;
            case 19:
                rb rbVar2 = sbVar.n;
                di.b bVar = sbVar.a;
                new wc(rbVar2, bVar).R(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.y6.gc, 0, new p9(sbVar, 27), bVar)).k(true);
                break;
            case 20:
                n9 n9Var = sbVar.q0;
                if (n9Var != null) {
                    n9Var.dismiss();
                }
                sbVar.J(2, true);
                break;
            case 21:
                sbVar.k0(-1, false, true);
                break;
            case 22:
                sbVar.k0(-1, false, true);
                break;
            case 23:
                sbVar.d = false;
                AndroidUtilities.unlockOrientation(sbVar.b);
                if (sbVar.B0 != null) {
                    if (sbVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(sbVar.B0.getCameraSession(), false);
                    }
                    sbVar.u(false);
                }
                gb gbVar3 = sbVar.X0;
                if (gbVar3 != null) {
                    gbVar3.set(null);
                }
                sbVar.y();
                sbVar.x();
                File file = sbVar.G1;
                if (file != null && !sbVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                sbVar.G1 = null;
                AndroidUtilities.runOnUIThread(new p9(sbVar, 28), 16L);
                nb nbVar = sbVar.F;
                if (nbVar != null) {
                    nbVar.f(false);
                }
                if (sbVar.x2 != null) {
                    sbVar.x2 = null;
                }
                sbVar.l2 = null;
                sb sbVar2 = sb.F2;
                if (sbVar2 != null) {
                    sbVar2.p(false);
                }
                sb.F2 = null;
                rb rbVar3 = sbVar.n;
                if (rbVar3 != null) {
                    org.telegram.ui.Components.qc.h(rbVar3);
                }
                bh.r rVar = sbVar.l0;
                if (rVar != null) {
                    org.telegram.ui.Components.qc.h(rVar);
                }
                fb fbVar3 = sbVar.A0;
                if (fbVar3 != null) {
                    fbVar3.e();
                    break;
                }
                break;
            case 24:
                if (!sbVar.K1.b0 && sbVar.q0 != null && (gbVar = sbVar.X0) != null) {
                    gbVar.h(new q9(sbVar, i14), gbVar, sbVar.w1, sbVar.z1);
                }
                sbVar.J(1, true);
                break;
            case 25:
                sbVar.i0(false);
                sbVar.e2 = null;
                break;
            case 26:
                sbVar.i0(false);
                sbVar.e2 = null;
                break;
            case 27:
                sbVar.S();
                break;
            default:
                WindowManager windowManager = sbVar.f;
                if (windowManager != null && (rbVar = sbVar.n) != null && rbVar.getParent() != null) {
                    windowManager.removeView(sbVar.n);
                    break;
                }
                break;
        }
    }
}
