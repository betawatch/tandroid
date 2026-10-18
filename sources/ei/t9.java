package ei;

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
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ t9(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
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
        jb jbVar;
        ub ubVar;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        vb vbVar = this.b;
        switch (i12) {
            case 0:
                vbVar.q();
                break;
            case 1:
                if (vbVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", vbVar.s.o).putFloat("frontflash_intensity", vbVar.s.p).apply();
                }
                vbVar.s.e(0.0f, 240L, null);
                vbVar.E0.setSelected(false);
                break;
            case 2:
                vbVar.l();
                vbVar.W1 = false;
                int i15 = vbVar.c;
                if (vbVar.K1 == null) {
                    vbVar.p(true);
                    break;
                } else {
                    vbVar.x();
                    u9 u9Var = new u9(vbVar, i13);
                    if (vbVar.H1 == null) {
                        a8 a8Var = vbVar.K1;
                        if (a8Var.K && !a8Var.v() && !a8Var.g) {
                            long j10 = a8Var.h0;
                            if (j10 > 0 && !a8Var.n) {
                                long j11 = (long) ((a8Var.a0 - a8Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    i11 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    a8Var.a0 = (59000.0f / a8Var.h0) + a8Var.Z;
                                    arrayList.add(a8Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        i11 = r9;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                a8 g10 = a8Var.g();
                                                float f7 = a8Var.Z;
                                                float f10 = a8Var.h0;
                                                g10.Z = (j13 / f10) + f7;
                                                g10.a0 = ((r9 + j13) / f10) + a8Var.Z;
                                                g10.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g10);
                                                r9 = i11;
                                                j12 = j14;
                                                i15 = i15;
                                            }
                                        }
                                    }
                                    i10 = i15;
                                }
                                vbVar.H1 = arrayList;
                                if (arrayList != null) {
                                    vbVar.I1 = new ArrayList();
                                    vbVar.J1 = new ArrayList();
                                    for (int i16 = i11; i16 < vbVar.H1.size(); i16 = com.google.android.gms.internal.play_billing.k3.f(i16, i16, 1, vbVar.J1)) {
                                        vbVar.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        i11 = 0;
                        arrayList = null;
                        vbVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        i11 = 0;
                    }
                    if (vbVar.H1 != null) {
                        ArrayList arrayList2 = vbVar.J1;
                        int size = arrayList2.size();
                        int i17 = i11;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (vbVar.I1.contains(num)) {
                                a8 a8Var2 = (a8) vbVar.H1.get(num.intValue());
                                a8 a8Var3 = vbVar.K1;
                                if (a8Var3 == a8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i11] = vbVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i11] = vbVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    a8 a8Var4 = vbVar.K1;
                                    a8Var4.k = (TextUtils.equals(a8Var4.C0, charSequenceArr[i11]) && MediaDataController.entitiesEqual(entities, entities2)) ? i11 : 1;
                                    vbVar.K1.C0 = new SpannableString(vbVar.c1.getText());
                                } else if (a8Var2.C0 == null) {
                                    a8Var3.k = i11;
                                    a8Var3.C0 = new SpannableString("");
                                }
                                u9Var.run(a8Var2);
                                i11 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {vbVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{vbVar.K1.C0}, true) : new ArrayList<>();
                        a8 a8Var5 = vbVar.K1;
                        a8Var5.k = (TextUtils.equals(a8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        vbVar.K1.C0 = new SpannableString(vbVar.c1.getText());
                        u9Var.run(vbVar.K1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = vbVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    vbVar.K1 = null;
                    vbVar.v = true;
                    vbVar.w = j15;
                    vbVar.B2 = true;
                    vbVar.n();
                    ai.r3 r3Var = new ai.r3(vbVar, j15, 8);
                    mb mbVar = vbVar.x;
                    if (mbVar != null) {
                        mbVar.b(j15, r3Var);
                    } else {
                        r3Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                vbVar.Y(false);
                break;
            case 4:
                a8 a8Var6 = vbVar.K1;
                if (a8Var6 != null) {
                    a8Var6.y0 = !a8Var6.y0;
                    jb jbVar2 = vbVar.X0;
                    if (jbVar2 != null) {
                        jbVar2.u(a8Var6);
                    }
                    xa xaVar = vbVar.v1;
                    if (xaVar != null && xaVar.R0 != null) {
                        while (r9 < vbVar.v1.R0.getChildCount()) {
                            View childAt = vbVar.v1.R0.getChildAt(r9);
                            if (childAt instanceof rg.e1) {
                                ((rg.e1) childAt).setupTheme(vbVar.K1);
                            }
                            r9++;
                        }
                    }
                    vbVar.n0(true);
                    break;
                }
                break;
            case 5:
                vbVar.p(true);
                break;
            case 6:
                vbVar.d = true;
                vbVar.v = false;
                if (vbVar.J == 1) {
                    vbVar.h0.setAlpha(1.0f);
                    vbVar.h0.setTranslationX(0.0f);
                    vbVar.h0.setTranslationY(0.0f);
                    vbVar.i0.setAlpha(1.0f);
                    vbVar.k0.setAlpha(1.0f);
                    vbVar.n.setBackgroundColor(-16777216);
                    if (vbVar.f0 == 2) {
                        vbVar.u1.setAlpha(1.0f);
                    }
                }
                t9 t9Var = vbVar.x2;
                if (t9Var != null) {
                    t9Var.run();
                    vbVar.x2 = null;
                } else {
                    vbVar.O();
                }
                a8 a8Var7 = vbVar.K1;
                if (a8Var7 != null && a8Var7.n) {
                    vbVar.t();
                    vbVar.G();
                    vbVar.r();
                    break;
                } else if (a8Var7 != null && a8Var7.u) {
                    if (a8Var7.K) {
                        vbVar.X0.t(a8Var7, null, 0L);
                    }
                    vbVar.r();
                    break;
                }
                break;
            case 7:
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                break;
            case 8:
                vbVar.A0.setCameraThumb(vbVar.z());
                ya yaVar = vbVar.B0;
                if (yaVar != null) {
                    yaVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(vbVar.B0);
                    ib ibVar = vbVar.A0;
                    if (ibVar != null) {
                        ibVar.setCameraView(null);
                    }
                    vbVar.B0 = null;
                    break;
                }
                break;
            case 9:
                vbVar.A0.setCameraThumb(vbVar.z());
                break;
            case 10:
                if (vbVar.f0 == 1) {
                    vbVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                ma maVar = vbVar.d1;
                if (maVar != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + vbVar.c1.getEditTextHeight());
                    maVar.setTranslationY(i18 - (vbVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ib ibVar2 = vbVar.A0;
                if (ibVar2 != null) {
                    ibVar2.c.a(vbVar.D0.y ? vbVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                vbVar.l0(true);
                break;
            case 14:
                vbVar.r();
                break;
            case 15:
                lb lbVar = vbVar.c1;
                if (lbVar != null) {
                    lbVar.m();
                    break;
                }
                break;
            case 16:
                if (vbVar.g0 == -1 && vbVar.f0 == 1) {
                    lb lbVar2 = vbVar.c1;
                    if (!lbVar2.p0 && !lbVar2.O1) {
                        gc gcVar = vbVar.Z0;
                        if (!gcVar.P) {
                            ma maVar2 = vbVar.d1;
                            if (maVar2.M) {
                                maVar2.c(false, true);
                                break;
                            } else {
                                vbVar.k0(0, false, true);
                                xa xaVar2 = vbVar.v1;
                                if (xaVar2 != null) {
                                    xaVar2.Q0(2);
                                    xaVar2.l2 = true;
                                    xaVar2.n0(true);
                                    vbVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            gcVar.P = false;
                            if (gcVar.E && gcVar.h == null) {
                                gcVar.G = true;
                                zb zbVar = gcVar.a;
                                if (zbVar != null) {
                                    zbVar.E(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                vbVar.N1 = true;
                vbVar.b1.setShareEnabled(false);
                u0 u0Var = vbVar.e1;
                u0Var.getClass();
                u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                vbVar.A0.setCameraThumb(vbVar.z());
                break;
            case 19:
                ub ubVar2 = vbVar.n;
                ci.b bVar = vbVar.a;
                new xc(ubVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.h6.gc, 0, new t9(vbVar, 27), bVar)).k(true);
                break;
            case 20:
                r9 r9Var = vbVar.q0;
                if (r9Var != null) {
                    r9Var.dismiss();
                }
                vbVar.J(2, true);
                break;
            case 21:
                vbVar.k0(-1, false, true);
                break;
            case 22:
                vbVar.k0(-1, false, true);
                break;
            case 23:
                vbVar.d = false;
                AndroidUtilities.unlockOrientation(vbVar.b);
                if (vbVar.B0 != null) {
                    if (vbVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(vbVar.B0.getCameraSession(), false);
                    }
                    vbVar.u(false);
                }
                jb jbVar3 = vbVar.X0;
                if (jbVar3 != null) {
                    jbVar3.set(null);
                }
                vbVar.y();
                vbVar.x();
                File file = vbVar.G1;
                if (file != null && !vbVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                vbVar.G1 = null;
                AndroidUtilities.runOnUIThread(new t9(vbVar, 28), 16L);
                qb qbVar = vbVar.F;
                if (qbVar != null) {
                    qbVar.f(false);
                }
                if (vbVar.x2 != null) {
                    vbVar.x2 = null;
                }
                vbVar.l2 = null;
                vb vbVar2 = vb.F2;
                if (vbVar2 != null) {
                    vbVar2.p(false);
                }
                vb.F2 = null;
                ub ubVar3 = vbVar.n;
                if (ubVar3 != null) {
                    org.telegram.ui.Components.qc.h(ubVar3);
                }
                ah.x xVar = vbVar.l0;
                if (xVar != null) {
                    org.telegram.ui.Components.qc.h(xVar);
                }
                ib ibVar3 = vbVar.A0;
                if (ibVar3 != null) {
                    ibVar3.e();
                    break;
                }
                break;
            case 24:
                if (!vbVar.K1.b0 && vbVar.q0 != null && (jbVar = vbVar.X0) != null) {
                    jbVar.h(new u9(vbVar, i14), jbVar, vbVar.w1, vbVar.z1);
                }
                vbVar.J(1, true);
                break;
            case 25:
                vbVar.i0(false);
                vbVar.e2 = null;
                break;
            case 26:
                vbVar.i0(false);
                vbVar.e2 = null;
                break;
            case 27:
                vbVar.S();
                break;
            default:
                WindowManager windowManager = vbVar.f;
                if (windowManager != null && (ubVar = vbVar.n) != null && ubVar.getParent() != null) {
                    windowManager.removeView(vbVar.n);
                    break;
                }
                break;
        }
    }
}
