package lh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ s9(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c10;
        ArrayList arrayList;
        hb hbVar;
        rb rbVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        sb sbVar = this.b;
        switch (i11) {
            case 0:
                sbVar.r();
                break;
            case 1:
                if (sbVar.p2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", sbVar.s.o).putFloat("frontflash_intensity", sbVar.s.p).apply();
                }
                sbVar.s.e(0.0f, 240L, null);
                sbVar.A0.setSelected(false);
                break;
            case 2:
                sbVar.m();
                sbVar.S1 = false;
                int i14 = sbVar.c;
                if (sbVar.G1 == null) {
                    sbVar.q(true);
                    break;
                } else {
                    sbVar.y();
                    t9 t9Var = new t9(sbVar, i12);
                    if (sbVar.D1 == null) {
                        z7 z7Var = sbVar.G1;
                        if (z7Var.K && !z7Var.v() && !z7Var.g) {
                            long j10 = z7Var.h0;
                            if (j10 > 0 && !z7Var.n) {
                                long j11 = (long) ((z7Var.a0 - z7Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    z7Var.a0 = (59000.0f / z7Var.h0) + z7Var.Z;
                                    arrayList.add(z7Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c10 = 0;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                z7 g10 = z7Var.g();
                                                float f10 = z7Var.Z;
                                                float f11 = z7Var.h0;
                                                g10.Z = (j13 / f11) + f10;
                                                g10.a0 = ((r9 + j13) / f11) + z7Var.Z;
                                                g10.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g10);
                                                j12 = j14;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i10 = i14;
                                }
                                sbVar.D1 = arrayList;
                                if (arrayList != null) {
                                    sbVar.E1 = new ArrayList();
                                    sbVar.F1 = new ArrayList();
                                    for (int i15 = 0; i15 < sbVar.D1.size(); i15 = i0.a.f(i15, i15, 1, sbVar.F1)) {
                                        sbVar.E1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i10 = i14;
                        c10 = 0;
                        arrayList = null;
                        sbVar.D1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i14;
                        c10 = 0;
                    }
                    if (sbVar.D1 != null) {
                        ArrayList arrayList2 = sbVar.F1;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (sbVar.E1.contains(num)) {
                                z7 z7Var2 = (z7) sbVar.D1.get(num.intValue());
                                z7 z7Var3 = sbVar.G1;
                                if (z7Var3 == z7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = sbVar.Y0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = sbVar.G1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    z7 z7Var4 = sbVar.G1;
                                    z7Var4.k = (TextUtils.equals(z7Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                                } else if (z7Var2.C0 == null) {
                                    z7Var3.k = false;
                                    z7Var3.C0 = new SpannableString("");
                                }
                                t9Var.run(z7Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {sbVar.Y0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{sbVar.G1.C0}, true) : new ArrayList<>();
                        z7 z7Var5 = sbVar.G1;
                        z7Var5.k = (TextUtils.equals(z7Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                        t9Var.run(sbVar.G1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = sbVar.G1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    sbVar.G1 = null;
                    sbVar.v = true;
                    sbVar.w = j15;
                    sbVar.x2 = true;
                    sbVar.o();
                    cg.b2 b2Var = new cg.b2(sbVar, j15, 10);
                    jb jbVar = sbVar.x;
                    if (jbVar != null) {
                        jbVar.b(j15, b2Var);
                    } else {
                        b2Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                sbVar.Z(false);
                break;
            case 4:
                z7 z7Var6 = sbVar.G1;
                if (z7Var6 != null) {
                    z7Var6.y0 = !z7Var6.y0;
                    hb hbVar2 = sbVar.T0;
                    if (hbVar2 != null) {
                        hbVar2.u(z7Var6);
                    }
                    va vaVar = sbVar.r1;
                    if (vaVar != null && vaVar.N0 != null) {
                        while (r9 < sbVar.r1.N0.getChildCount()) {
                            View childAt = sbVar.r1.N0.getChildAt(r9);
                            if (childAt instanceof zf.e1) {
                                ((zf.e1) childAt).setupTheme(sbVar.G1);
                            }
                            r9++;
                        }
                    }
                    sbVar.o0(true);
                    break;
                }
                break;
            case 5:
                sbVar.q(true);
                break;
            case 6:
                sbVar.d = true;
                sbVar.v = false;
                if (sbVar.F == 1) {
                    sbVar.d0.setAlpha(1.0f);
                    sbVar.d0.setTranslationX(0.0f);
                    sbVar.d0.setTranslationY(0.0f);
                    sbVar.e0.setAlpha(1.0f);
                    sbVar.g0.setAlpha(1.0f);
                    sbVar.n.setBackgroundColor(-16777216);
                    if (sbVar.b0 == 2) {
                        sbVar.q1.setAlpha(1.0f);
                    }
                }
                s9 s9Var = sbVar.t2;
                if (s9Var != null) {
                    s9Var.run();
                    sbVar.t2 = null;
                } else {
                    sbVar.P();
                }
                z7 z7Var7 = sbVar.G1;
                if (z7Var7 != null && z7Var7.n) {
                    sbVar.u();
                    sbVar.H();
                    sbVar.s();
                    break;
                } else if (z7Var7 != null && z7Var7.u) {
                    if (z7Var7.K) {
                        sbVar.T0.t(z7Var7, null, 0L);
                    }
                    sbVar.s();
                    break;
                }
                break;
            case 7:
                sbVar.g(1.0f, true, new s9(sbVar, 6));
                break;
            case 8:
                sbVar.w0.setCameraThumb(sbVar.A());
                wa waVar = sbVar.x0;
                if (waVar != null) {
                    waVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(sbVar.x0);
                    gb gbVar = sbVar.w0;
                    if (gbVar != null) {
                        gbVar.setCameraView(null);
                    }
                    sbVar.x0 = null;
                    break;
                }
                break;
            case 9:
                sbVar.w0.setCameraThumb(sbVar.A());
                break;
            case 10:
                if (sbVar.b0 == 1) {
                    sbVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                ka kaVar = sbVar.Z0;
                if (kaVar != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + sbVar.Y0.getEditTextHeight());
                    kaVar.setTranslationY(i17 - (sbVar.V0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                gb gbVar2 = sbVar.w0;
                if (gbVar2 != null) {
                    gbVar2.c.a(sbVar.z0.y ? sbVar.y0.d : null);
                    break;
                }
                break;
            case 13:
                sbVar.m0(true);
                break;
            case 14:
                sbVar.s();
                break;
            case 15:
                ib ibVar = sbVar.Y0;
                if (ibVar != null) {
                    ibVar.m();
                    break;
                }
                break;
            case 16:
                if (sbVar.c0 == -1 && sbVar.b0 == 1) {
                    ib ibVar2 = sbVar.Y0;
                    if (!ibVar2.l0 && !ibVar2.K1) {
                        cc ccVar = sbVar.V0;
                        if (!ccVar.L) {
                            ka kaVar2 = sbVar.Z0;
                            if (kaVar2.I) {
                                kaVar2.c(false, true);
                                break;
                            } else {
                                sbVar.l0(0, false, true);
                                va vaVar2 = sbVar.r1;
                                if (vaVar2 != null) {
                                    vaVar2.R0(2);
                                    vaVar2.h2 = true;
                                    vaVar2.o0(true);
                                    sbVar.r1.I0 = true;
                                    break;
                                }
                            }
                        } else {
                            ccVar.L = false;
                            if (ccVar.A && ccVar.h == null) {
                                ccVar.C = true;
                                wb wbVar = ccVar.a;
                                if (wbVar != null) {
                                    wbVar.j1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                sbVar.J1 = true;
                sbVar.X0.setShareEnabled(false);
                u0 u0Var = sbVar.a1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                sbVar.w0.setCameraThumb(sbVar.A());
                break;
            case 19:
                rb rbVar2 = sbVar.n;
                jh.b bVar = sbVar.a;
                new org.telegram.ui.Components.mc(rbVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new s9(sbVar, 27), bVar)).k(true);
                break;
            case 20:
                q9 q9Var = sbVar.m0;
                if (q9Var != null) {
                    q9Var.dismiss();
                }
                sbVar.K(2, true);
                break;
            case 21:
                sbVar.l0(-1, false, true);
                break;
            case 22:
                sbVar.l0(-1, false, true);
                break;
            case 23:
                sbVar.d = false;
                AndroidUtilities.unlockOrientation(sbVar.b);
                if (sbVar.x0 != null) {
                    if (sbVar.M1) {
                        CameraController.getInstance().stopVideoRecording(sbVar.x0.getCameraSession(), false);
                    }
                    sbVar.v(false);
                }
                hb hbVar3 = sbVar.T0;
                if (hbVar3 != null) {
                    hbVar3.set(null);
                }
                sbVar.z();
                sbVar.y();
                File file = sbVar.C1;
                if (file != null && !sbVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                sbVar.C1 = null;
                AndroidUtilities.runOnUIThread(new s9(sbVar, 28), 16L);
                nb nbVar = sbVar.B;
                if (nbVar != null) {
                    nbVar.f(false);
                }
                if (sbVar.t2 != null) {
                    sbVar.t2 = null;
                }
                sbVar.h2 = null;
                sb sbVar2 = sb.B2;
                if (sbVar2 != null) {
                    sbVar2.q(false);
                }
                sb.B2 = null;
                rb rbVar3 = sbVar.n;
                if (rbVar3 != null) {
                    org.telegram.ui.Components.ec.h(rbVar3);
                }
                ag.p1 p1Var = sbVar.h0;
                if (p1Var != null) {
                    org.telegram.ui.Components.ec.h(p1Var);
                }
                gb gbVar3 = sbVar.w0;
                if (gbVar3 != null) {
                    gbVar3.e();
                    break;
                }
                break;
            case 24:
                if (!sbVar.G1.b0 && sbVar.m0 != null && (hbVar = sbVar.T0) != null) {
                    hbVar.h(new t9(sbVar, i13), hbVar, sbVar.s1, sbVar.v1);
                }
                sbVar.K(1, true);
                break;
            case 25:
                sbVar.j0(false);
                sbVar.a2 = null;
                break;
            case 26:
                sbVar.j0(false);
                sbVar.a2 = null;
                break;
            case 27:
                sbVar.T();
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
