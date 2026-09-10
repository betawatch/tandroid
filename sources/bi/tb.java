package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class tb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ tb(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
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
        nd ndVar;
        be beVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        ce ceVar = this.b;
        switch (i11) {
            case 0:
                ceVar.r();
                break;
            case 1:
                if (ceVar.t2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", ceVar.s.o).putFloat("frontflash_intensity", ceVar.s.p).apply();
                }
                ceVar.s.e(0.0f, 240L, null);
                ceVar.E0.setSelected(false);
                break;
            case 2:
                ceVar.m();
                ceVar.W1 = false;
                int i14 = ceVar.c;
                if (ceVar.K1 == null) {
                    ceVar.q(true);
                    break;
                } else {
                    ceVar.y();
                    ub ubVar = new ub(ceVar, i12);
                    if (ceVar.H1 == null) {
                        r9 r9Var = ceVar.K1;
                        if (r9Var.K && !r9Var.v() && !r9Var.g) {
                            long j3 = r9Var.h0;
                            if (j3 > 0 && !r9Var.n) {
                                long j10 = (long) ((r9Var.a0 - r9Var.Z) * j3);
                                if (j10 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    r9Var.a0 = (59000.0f / r9Var.h0) + r9Var.Z;
                                    arrayList.add(r9Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    while (true) {
                                        c10 = 0;
                                        if (j12 < j10) {
                                            if (Math.min(j11, j10 - j12) >= 1000) {
                                                long j13 = j11;
                                                r9 g10 = r9Var.g();
                                                float f7 = r9Var.Z;
                                                float f10 = r9Var.h0;
                                                g10.Z = (j12 / f10) + f7;
                                                g10.a0 = ((r9 + j12) / f10) + r9Var.Z;
                                                g10.C0 = "";
                                                j12 += j13;
                                                arrayList.add(g10);
                                                j11 = j13;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i10 = i14;
                                }
                                ceVar.H1 = arrayList;
                                if (arrayList != null) {
                                    ceVar.I1 = new ArrayList();
                                    ceVar.J1 = new ArrayList();
                                    for (int i15 = 0; i15 < ceVar.H1.size(); i15 = com.google.android.gms.internal.vision.e2.d(i15, i15, 1, ceVar.J1)) {
                                        ceVar.I1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i10 = i14;
                        c10 = 0;
                        arrayList = null;
                        ceVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i14;
                        c10 = 0;
                    }
                    if (ceVar.H1 != null) {
                        ArrayList arrayList2 = ceVar.J1;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (ceVar.I1.contains(num)) {
                                r9 r9Var2 = (r9) ceVar.H1.get(num.intValue());
                                r9 r9Var3 = ceVar.K1;
                                if (r9Var3 == r9Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = ceVar.c1.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = ceVar.K1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    r9 r9Var4 = ceVar.K1;
                                    r9Var4.k = (TextUtils.equals(r9Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    ceVar.K1.C0 = new SpannableString(ceVar.c1.getText());
                                } else if (r9Var2.C0 == null) {
                                    r9Var3.k = false;
                                    r9Var3.C0 = new SpannableString("");
                                }
                                ubVar.run(r9Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {ceVar.c1.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{ceVar.K1.C0}, true) : new ArrayList<>();
                        r9 r9Var5 = ceVar.K1;
                        r9Var5.k = (TextUtils.equals(r9Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        ceVar.K1.C0 = new SpannableString(ceVar.c1.getText());
                        ubVar.run(ceVar.K1);
                    }
                    long j14 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = ceVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    ceVar.K1 = null;
                    ceVar.v = true;
                    ceVar.w = j14;
                    ceVar.B2 = true;
                    ceVar.o();
                    va vaVar = new va(ceVar, j14, 1);
                    sd sdVar = ceVar.x;
                    if (sdVar != null) {
                        sdVar.b(j14, vaVar);
                    } else {
                        vaVar.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                ceVar.Z(false);
                break;
            case 4:
                r9 r9Var6 = ceVar.K1;
                if (r9Var6 != null) {
                    r9Var6.y0 = !r9Var6.y0;
                    nd ndVar2 = ceVar.X0;
                    if (ndVar2 != null) {
                        ndVar2.u(r9Var6);
                    }
                    ad adVar = ceVar.v1;
                    if (adVar != null && adVar.R0 != null) {
                        while (r9 < ceVar.v1.R0.getChildCount()) {
                            View childAt = ceVar.v1.R0.getChildAt(r9);
                            if (childAt instanceof pg.e1) {
                                ((pg.e1) childAt).setupTheme(ceVar.K1);
                            }
                            r9++;
                        }
                    }
                    ceVar.o0(true);
                    break;
                }
                break;
            case 5:
                ceVar.q(true);
                break;
            case 6:
                ceVar.d = true;
                ceVar.v = false;
                if (ceVar.J == 1) {
                    ceVar.h0.setAlpha(1.0f);
                    ceVar.h0.setTranslationX(0.0f);
                    ceVar.h0.setTranslationY(0.0f);
                    ceVar.i0.setAlpha(1.0f);
                    ceVar.k0.setAlpha(1.0f);
                    ceVar.n.setBackgroundColor(-16777216);
                    if (ceVar.f0 == 2) {
                        ceVar.u1.setAlpha(1.0f);
                    }
                }
                tb tbVar = ceVar.x2;
                if (tbVar != null) {
                    tbVar.run();
                    ceVar.x2 = null;
                } else {
                    ceVar.P();
                }
                r9 r9Var7 = ceVar.K1;
                if (r9Var7 != null && r9Var7.n) {
                    ceVar.u();
                    ceVar.H();
                    ceVar.s();
                    break;
                } else if (r9Var7 != null && r9Var7.u) {
                    if (r9Var7.K) {
                        ceVar.X0.t(r9Var7, null, 0L);
                    }
                    ceVar.s();
                    break;
                }
                break;
            case 7:
                ceVar.g(1.0f, true, new tb(ceVar, 6));
                break;
            case 8:
                ceVar.A0.setCameraThumb(ceVar.A());
                bd bdVar = ceVar.B0;
                if (bdVar != null) {
                    bdVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(ceVar.B0);
                    md mdVar = ceVar.A0;
                    if (mdVar != null) {
                        mdVar.setCameraView(null);
                    }
                    ceVar.B0 = null;
                    break;
                }
                break;
            case 9:
                ceVar.A0.setCameraThumb(ceVar.A());
                break;
            case 10:
                if (ceVar.f0 == 1) {
                    ceVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                oc ocVar = ceVar.d1;
                if (ocVar != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + ceVar.c1.getEditTextHeight());
                    ocVar.setTranslationY(i17 - (ceVar.Z0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                md mdVar2 = ceVar.A0;
                if (mdVar2 != null) {
                    mdVar2.c.b(ceVar.D0.y ? ceVar.C0.d : null);
                    break;
                }
                break;
            case 13:
                ceVar.m0(true);
                break;
            case 14:
                ceVar.s();
                break;
            case 15:
                qd qdVar = ceVar.c1;
                if (qdVar != null) {
                    qdVar.m();
                    break;
                }
                break;
            case 16:
                if (ceVar.g0 == -1 && ceVar.f0 == 1) {
                    qd qdVar2 = ceVar.c1;
                    if (!qdVar2.p0 && !qdVar2.O1) {
                        me meVar = ceVar.Z0;
                        if (!meVar.P) {
                            oc ocVar2 = ceVar.d1;
                            if (ocVar2.M) {
                                ocVar2.c(false, true);
                                break;
                            } else {
                                ceVar.l0(0, false, true);
                                ad adVar2 = ceVar.v1;
                                if (adVar2 != null) {
                                    adVar2.R0(2);
                                    adVar2.l2 = true;
                                    adVar2.o0(true);
                                    ceVar.v1.M0 = true;
                                    break;
                                }
                            }
                        } else {
                            meVar.P = false;
                            if (meVar.E && meVar.h == null) {
                                meVar.G = true;
                                ge geVar = meVar.a;
                                if (geVar != null) {
                                    geVar.S(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                ceVar.N1 = true;
                ceVar.b1.setShareEnabled(false);
                y0 y0Var = ceVar.e1;
                y0Var.getClass();
                y0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                ceVar.A0.setCameraThumb(ceVar.A());
                break;
            case 19:
                be beVar2 = ceVar.n;
                zh.b bVar = ceVar.a;
                new org.telegram.ui.Components.wc(beVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new tb(ceVar, 27), bVar)).k(true);
                break;
            case 20:
                rb rbVar = ceVar.q0;
                if (rbVar != null) {
                    rbVar.dismiss();
                }
                ceVar.K(2, true);
                break;
            case 21:
                ceVar.l0(-1, false, true);
                break;
            case 22:
                ceVar.l0(-1, false, true);
                break;
            case 23:
                ceVar.d = false;
                AndroidUtilities.unlockOrientation(ceVar.b);
                if (ceVar.B0 != null) {
                    if (ceVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(ceVar.B0.getCameraSession(), false);
                    }
                    ceVar.v(false);
                }
                nd ndVar3 = ceVar.X0;
                if (ndVar3 != null) {
                    ndVar3.set(null);
                }
                ceVar.z();
                ceVar.y();
                File file = ceVar.G1;
                if (file != null && !ceVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                ceVar.G1 = null;
                AndroidUtilities.runOnUIThread(new tb(ceVar, 28), 16L);
                xd xdVar = ceVar.F;
                if (xdVar != null) {
                    xdVar.f(false);
                }
                if (ceVar.x2 != null) {
                    ceVar.x2 = null;
                }
                ceVar.l2 = null;
                ce ceVar2 = ce.F2;
                if (ceVar2 != null) {
                    ceVar2.q(false);
                }
                ce.F2 = null;
                be beVar3 = ceVar.n;
                if (beVar3 != null) {
                    org.telegram.ui.Components.pc.h(beVar3);
                }
                ld ldVar = ceVar.l0;
                if (ldVar != null) {
                    org.telegram.ui.Components.pc.h(ldVar);
                }
                md mdVar3 = ceVar.A0;
                if (mdVar3 != null) {
                    mdVar3.e();
                    break;
                }
                break;
            case 24:
                if (!ceVar.K1.b0 && ceVar.q0 != null && (ndVar = ceVar.X0) != null) {
                    ndVar.h(new ub(ceVar, i13), ndVar, ceVar.w1, ceVar.z1);
                }
                ceVar.K(1, true);
                break;
            case 25:
                ceVar.j0(false);
                ceVar.e2 = null;
                break;
            case 26:
                ceVar.j0(false);
                ceVar.e2 = null;
                break;
            case 27:
                ceVar.T();
                break;
            default:
                WindowManager windowManager = ceVar.f;
                if (windowManager != null && (beVar = ceVar.n) != null && beVar.getParent() != null) {
                    windowManager.removeView(ceVar.n);
                    break;
                }
                break;
        }
    }
}
