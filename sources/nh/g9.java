package nh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ g9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c3;
        ArrayList arrayList;
        va vaVar;
        fb fbVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        gb gbVar = this.b;
        switch (i11) {
            case 0:
                gbVar.r();
                break;
            case 1:
                if (gbVar.p2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", gbVar.s.o).putFloat("frontflash_intensity", gbVar.s.p).apply();
                }
                gbVar.s.e(0.0f, 240L, null);
                gbVar.A0.setSelected(false);
                break;
            case 2:
                gbVar.m();
                gbVar.S1 = false;
                int i14 = gbVar.c;
                if (gbVar.G1 == null) {
                    gbVar.q(true);
                    break;
                } else {
                    gbVar.y();
                    h9 h9Var = new h9(gbVar, i12);
                    if (gbVar.D1 == null) {
                        o7 o7Var = gbVar.G1;
                        if (o7Var.K && !o7Var.v() && !o7Var.g) {
                            long j10 = o7Var.h0;
                            if (j10 > 0 && !o7Var.n) {
                                long j11 = (long) ((o7Var.a0 - o7Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c3 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    o7Var.a0 = (59000.0f / o7Var.h0) + o7Var.Z;
                                    arrayList.add(o7Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c3 = 0;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                o7 g10 = o7Var.g();
                                                float f9 = o7Var.Z;
                                                float f10 = o7Var.h0;
                                                g10.Z = (j13 / f10) + f9;
                                                g10.a0 = ((r9 + j13) / f10) + o7Var.Z;
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
                                gbVar.D1 = arrayList;
                                if (arrayList != null) {
                                    gbVar.E1 = new ArrayList();
                                    gbVar.F1 = new ArrayList();
                                    for (int i15 = 0; i15 < gbVar.D1.size(); i15 = th.d(i15, i15, 1, gbVar.F1)) {
                                        gbVar.E1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i10 = i14;
                        c3 = 0;
                        arrayList = null;
                        gbVar.D1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i14;
                        c3 = 0;
                    }
                    if (gbVar.D1 != null) {
                        ArrayList arrayList2 = gbVar.F1;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (gbVar.E1.contains(num)) {
                                o7 o7Var2 = (o7) gbVar.D1.get(num.intValue());
                                o7 o7Var3 = gbVar.G1;
                                if (o7Var3 == o7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c3] = gbVar.Y0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c3] = gbVar.G1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    o7 o7Var4 = gbVar.G1;
                                    o7Var4.k = (TextUtils.equals(o7Var4.C0, charSequenceArr[c3]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    gbVar.G1.C0 = new SpannableString(gbVar.Y0.getText());
                                } else if (o7Var2.C0 == null) {
                                    o7Var3.k = false;
                                    o7Var3.C0 = new SpannableString("");
                                }
                                h9Var.run(o7Var2);
                                c3 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {gbVar.Y0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{gbVar.G1.C0}, true) : new ArrayList<>();
                        o7 o7Var5 = gbVar.G1;
                        o7Var5.k = (TextUtils.equals(o7Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        gbVar.G1.C0 = new SpannableString(gbVar.Y0.getText());
                        h9Var.run(gbVar.G1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = gbVar.G1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    gbVar.G1 = null;
                    gbVar.v = true;
                    gbVar.w = j15;
                    gbVar.x2 = true;
                    gbVar.o();
                    eg.z1 z1Var = new eg.z1(gbVar, j15, 10);
                    xa xaVar = gbVar.x;
                    if (xaVar != null) {
                        xaVar.c(j15, z1Var);
                    } else {
                        z1Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                gbVar.Z(false);
                break;
            case 4:
                o7 o7Var6 = gbVar.G1;
                if (o7Var6 != null) {
                    o7Var6.y0 = !o7Var6.y0;
                    va vaVar2 = gbVar.T0;
                    if (vaVar2 != null) {
                        vaVar2.u(o7Var6);
                    }
                    ja jaVar = gbVar.r1;
                    if (jaVar != null && jaVar.N0 != null) {
                        while (r9 < gbVar.r1.N0.getChildCount()) {
                            View childAt = gbVar.r1.N0.getChildAt(r9);
                            if (childAt instanceof bg.d2) {
                                ((bg.d2) childAt).setupTheme(gbVar.G1);
                            }
                            r9++;
                        }
                    }
                    gbVar.o0(true);
                    break;
                }
                break;
            case 5:
                gbVar.q(true);
                break;
            case 6:
                gbVar.d = true;
                gbVar.v = false;
                if (gbVar.F == 1) {
                    gbVar.d0.setAlpha(1.0f);
                    gbVar.d0.setTranslationX(0.0f);
                    gbVar.d0.setTranslationY(0.0f);
                    gbVar.e0.setAlpha(1.0f);
                    gbVar.g0.setAlpha(1.0f);
                    gbVar.n.setBackgroundColor(-16777216);
                    if (gbVar.b0 == 2) {
                        gbVar.q1.setAlpha(1.0f);
                    }
                }
                g9 g9Var = gbVar.t2;
                if (g9Var != null) {
                    g9Var.run();
                    gbVar.t2 = null;
                } else {
                    gbVar.P();
                }
                o7 o7Var7 = gbVar.G1;
                if (o7Var7 != null && o7Var7.n) {
                    gbVar.u();
                    gbVar.H();
                    gbVar.s();
                    break;
                } else if (o7Var7 != null && o7Var7.u) {
                    if (o7Var7.K) {
                        gbVar.T0.t(o7Var7, null, 0L);
                    }
                    gbVar.s();
                    break;
                }
                break;
            case 7:
                gbVar.g(1.0f, true, new g9(gbVar, 6));
                break;
            case 8:
                gbVar.w0.setCameraThumb(gbVar.A());
                ka kaVar = gbVar.x0;
                if (kaVar != null) {
                    kaVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(gbVar.x0);
                    ua uaVar = gbVar.w0;
                    if (uaVar != null) {
                        uaVar.setCameraView(null);
                    }
                    gbVar.x0 = null;
                    break;
                }
                break;
            case 9:
                gbVar.w0.setCameraThumb(gbVar.A());
                break;
            case 10:
                if (gbVar.b0 == 1) {
                    gbVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                y9 y9Var = gbVar.Z0;
                if (y9Var != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + gbVar.Y0.getEditTextHeight());
                    y9Var.setTranslationY(i17 - (gbVar.V0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ua uaVar2 = gbVar.w0;
                if (uaVar2 != null) {
                    uaVar2.c.a(gbVar.z0.y ? gbVar.y0.d : null);
                    break;
                }
                break;
            case 13:
                gbVar.m0(true);
                break;
            case 14:
                gbVar.s();
                break;
            case 15:
                wa waVar = gbVar.Y0;
                if (waVar != null) {
                    waVar.m();
                    break;
                }
                break;
            case 16:
                if (gbVar.c0 == -1 && gbVar.b0 == 1) {
                    wa waVar2 = gbVar.Y0;
                    if (!waVar2.l0 && !waVar2.K1) {
                        qb qbVar = gbVar.V0;
                        if (!qbVar.L) {
                            y9 y9Var2 = gbVar.Z0;
                            if (y9Var2.I) {
                                y9Var2.c(false, true);
                                break;
                            } else {
                                gbVar.l0(0, false, true);
                                ja jaVar2 = gbVar.r1;
                                if (jaVar2 != null) {
                                    jaVar2.R0(2);
                                    jaVar2.h2 = true;
                                    jaVar2.o0(true);
                                    gbVar.r1.I0 = true;
                                    break;
                                }
                            }
                        } else {
                            qbVar.L = false;
                            if (qbVar.A && qbVar.h == null) {
                                qbVar.C = true;
                                kb kbVar = qbVar.a;
                                if (kbVar != null) {
                                    kbVar.d1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                gbVar.J1 = true;
                gbVar.X0.setShareEnabled(false);
                u0 u0Var = gbVar.a1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                gbVar.w0.setCameraThumb(gbVar.A());
                break;
            case 19:
                fb fbVar2 = gbVar.n;
                lh.b bVar = gbVar.a;
                new tc(fbVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new g9(gbVar, 27), bVar)).k(true);
                break;
            case 20:
                e9 e9Var = gbVar.m0;
                if (e9Var != null) {
                    e9Var.dismiss();
                }
                gbVar.K(2, true);
                break;
            case 21:
                gbVar.l0(-1, false, true);
                break;
            case 22:
                gbVar.l0(-1, false, true);
                break;
            case 23:
                gbVar.d = false;
                AndroidUtilities.unlockOrientation(gbVar.b);
                if (gbVar.x0 != null) {
                    if (gbVar.M1) {
                        CameraController.getInstance().stopVideoRecording(gbVar.x0.getCameraSession(), false);
                    }
                    gbVar.v(false);
                }
                va vaVar3 = gbVar.T0;
                if (vaVar3 != null) {
                    vaVar3.set(null);
                }
                gbVar.z();
                gbVar.y();
                File file = gbVar.C1;
                if (file != null && !gbVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                gbVar.C1 = null;
                AndroidUtilities.runOnUIThread(new g9(gbVar, 28), 16L);
                bb bbVar = gbVar.B;
                if (bbVar != null) {
                    bbVar.f(false);
                }
                if (gbVar.t2 != null) {
                    gbVar.t2 = null;
                }
                gbVar.h2 = null;
                gb gbVar2 = gb.B2;
                if (gbVar2 != null) {
                    gbVar2.q(false);
                }
                gb.B2 = null;
                fb fbVar3 = gbVar.n;
                if (fbVar3 != null) {
                    mc.h(fbVar3);
                }
                bg.x2 x2Var = gbVar.h0;
                if (x2Var != null) {
                    mc.h(x2Var);
                }
                ua uaVar3 = gbVar.w0;
                if (uaVar3 != null) {
                    uaVar3.e();
                    break;
                }
                break;
            case 24:
                if (!gbVar.G1.b0 && gbVar.m0 != null && (vaVar = gbVar.T0) != null) {
                    vaVar.h(new h9(gbVar, i13), vaVar, gbVar.s1, gbVar.v1);
                }
                gbVar.K(1, true);
                break;
            case 25:
                gbVar.j0(false);
                gbVar.a2 = null;
                break;
            case 26:
                gbVar.j0(false);
                gbVar.a2 = null;
                break;
            case 27:
                gbVar.T();
                break;
            default:
                WindowManager windowManager = gbVar.f;
                if (windowManager != null && (fbVar = gbVar.n) != null && fbVar.getParent() != null) {
                    windowManager.removeView(gbVar.n);
                    break;
                }
                break;
        }
    }
}
