package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ v9(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        char c10;
        ArrayList arrayList;
        kb kbVar;
        vb vbVar;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        wb wbVar = this.b;
        switch (i10) {
            case 0:
                wbVar.r();
                break;
            case 1:
                if (wbVar.p2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", wbVar.s.o).putFloat("frontflash_intensity", wbVar.s.p).apply();
                }
                wbVar.s.e(0.0f, 240L, null);
                wbVar.A0.setSelected(false);
                break;
            case 2:
                wbVar.m();
                wbVar.S1 = false;
                int i13 = wbVar.c;
                if (wbVar.G1 == null) {
                    wbVar.q(true);
                    break;
                } else {
                    wbVar.y();
                    w9 w9Var = new w9(wbVar, i11);
                    if (wbVar.D1 == null) {
                        a8 a8Var = wbVar.G1;
                        if (a8Var.K && !a8Var.v() && !a8Var.g) {
                            long j10 = a8Var.h0;
                            if (j10 > 0 && !a8Var.n) {
                                long j11 = (long) ((a8Var.a0 - a8Var.Z) * j10);
                                if (j11 < 68999) {
                                    i9 = i13;
                                    arrayList = null;
                                    c10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    a8Var.a0 = (59000.0f / a8Var.h0) + a8Var.Z;
                                    arrayList.add(a8Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c10 = 0;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                a8 g10 = a8Var.g();
                                                float f10 = a8Var.Z;
                                                float f11 = a8Var.h0;
                                                g10.Z = (j13 / f11) + f10;
                                                g10.a0 = ((r9 + j13) / f11) + a8Var.Z;
                                                g10.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g10);
                                                j12 = j14;
                                                i13 = i13;
                                            }
                                        }
                                    }
                                    i9 = i13;
                                }
                                wbVar.D1 = arrayList;
                                if (arrayList != null) {
                                    wbVar.E1 = new ArrayList();
                                    wbVar.F1 = new ArrayList();
                                    for (int i14 = 0; i14 < wbVar.D1.size(); i14 = j3.r0.e(i14, i14, 1, wbVar.F1)) {
                                        wbVar.E1.add(Integer.valueOf(i14));
                                    }
                                }
                            }
                        }
                        i9 = i13;
                        c10 = 0;
                        arrayList = null;
                        wbVar.D1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i9 = i13;
                        c10 = 0;
                    }
                    if (wbVar.D1 != null) {
                        ArrayList arrayList2 = wbVar.F1;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList2.get(i15);
                            i15++;
                            Integer num = (Integer) obj;
                            if (wbVar.E1.contains(num)) {
                                a8 a8Var2 = (a8) wbVar.D1.get(num.intValue());
                                a8 a8Var3 = wbVar.G1;
                                if (a8Var3 == a8Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c10] = wbVar.Y0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i9).storyEntitiesAllowed() ? MediaDataController.getInstance(i9).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c10] = wbVar.G1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i9).storyEntitiesAllowed() ? MediaDataController.getInstance(i9).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    a8 a8Var4 = wbVar.G1;
                                    a8Var4.k = (TextUtils.equals(a8Var4.C0, charSequenceArr[c10]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    wbVar.G1.C0 = new SpannableString(wbVar.Y0.getText());
                                } else if (a8Var2.C0 == null) {
                                    a8Var3.k = false;
                                    a8Var3.C0 = new SpannableString("");
                                }
                                w9Var.run(a8Var2);
                                c10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {wbVar.Y0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i9).storyEntitiesAllowed() ? MediaDataController.getInstance(i9).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i9).storyEntitiesAllowed() ? MediaDataController.getInstance(i9).getEntities(new CharSequence[]{wbVar.G1.C0}, true) : new ArrayList<>();
                        a8 a8Var5 = wbVar.G1;
                        a8Var5.k = (TextUtils.equals(a8Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        wbVar.G1.C0 = new SpannableString(wbVar.Y0.getText());
                        w9Var.run(wbVar.G1);
                    }
                    long j15 = UserConfig.getInstance(i9).clientUserId;
                    TLRPC.InputPeer inputPeer = wbVar.G1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    wbVar.G1 = null;
                    wbVar.v = true;
                    wbVar.w = j15;
                    wbVar.x2 = true;
                    wbVar.o();
                    bg.i2 i2Var = new bg.i2(wbVar, j15, 10);
                    nb nbVar = wbVar.x;
                    if (nbVar != null) {
                        nbVar.b(j15, i2Var);
                    } else {
                        i2Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                wbVar.Z(false);
                break;
            case 4:
                a8 a8Var6 = wbVar.G1;
                if (a8Var6 != null) {
                    a8Var6.y0 = !a8Var6.y0;
                    kb kbVar2 = wbVar.T0;
                    if (kbVar2 != null) {
                        kbVar2.u(a8Var6);
                    }
                    ya yaVar = wbVar.r1;
                    if (yaVar != null && yaVar.N0 != null) {
                        while (r9 < wbVar.r1.N0.getChildCount()) {
                            View childAt = wbVar.r1.N0.getChildAt(r9);
                            if (childAt instanceof yf.e1) {
                                ((yf.e1) childAt).setupTheme(wbVar.G1);
                            }
                            r9++;
                        }
                    }
                    wbVar.o0(true);
                    break;
                }
                break;
            case 5:
                wbVar.q(true);
                break;
            case 6:
                wbVar.d = true;
                wbVar.v = false;
                if (wbVar.F == 1) {
                    wbVar.d0.setAlpha(1.0f);
                    wbVar.d0.setTranslationX(0.0f);
                    wbVar.d0.setTranslationY(0.0f);
                    wbVar.e0.setAlpha(1.0f);
                    wbVar.g0.setAlpha(1.0f);
                    wbVar.n.setBackgroundColor(-16777216);
                    if (wbVar.b0 == 2) {
                        wbVar.q1.setAlpha(1.0f);
                    }
                }
                v9 v9Var = wbVar.t2;
                if (v9Var != null) {
                    v9Var.run();
                    wbVar.t2 = null;
                } else {
                    wbVar.P();
                }
                a8 a8Var7 = wbVar.G1;
                if (a8Var7 != null && a8Var7.n) {
                    wbVar.u();
                    wbVar.H();
                    wbVar.s();
                    break;
                } else if (a8Var7 != null && a8Var7.u) {
                    if (a8Var7.K) {
                        wbVar.T0.t(a8Var7, null, 0L);
                    }
                    wbVar.s();
                    break;
                }
                break;
            case 7:
                wbVar.g(1.0f, true, new v9(wbVar, 6));
                break;
            case 8:
                wbVar.w0.setCameraThumb(wbVar.A());
                za zaVar = wbVar.x0;
                if (zaVar != null) {
                    zaVar.destroy(true, null);
                    AndroidUtilities.removeFromParent(wbVar.x0);
                    jb jbVar = wbVar.w0;
                    if (jbVar != null) {
                        jbVar.setCameraView(null);
                    }
                    wbVar.x0 = null;
                    break;
                }
                break;
            case 9:
                wbVar.w0.setCameraThumb(wbVar.A());
                break;
            case 10:
                if (wbVar.b0 == 1) {
                    wbVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                na naVar = wbVar.Z0;
                if (naVar != null) {
                    int i16 = -(AndroidUtilities.dp(24.0f) + wbVar.Y0.getEditTextHeight());
                    naVar.setTranslationY(i16 - (wbVar.V0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                jb jbVar2 = wbVar.w0;
                if (jbVar2 != null) {
                    jbVar2.c.a(wbVar.z0.y ? wbVar.y0.d : null);
                    break;
                }
                break;
            case 13:
                wbVar.m0(true);
                break;
            case 14:
                wbVar.s();
                break;
            case 15:
                mb mbVar = wbVar.Y0;
                if (mbVar != null) {
                    mbVar.m();
                    break;
                }
                break;
            case 16:
                if (wbVar.c0 == -1 && wbVar.b0 == 1) {
                    mb mbVar2 = wbVar.Y0;
                    if (!mbVar2.l0 && !mbVar2.K1) {
                        gc gcVar = wbVar.V0;
                        if (!gcVar.L) {
                            na naVar2 = wbVar.Z0;
                            if (naVar2.I) {
                                naVar2.c(false, true);
                                break;
                            } else {
                                wbVar.l0(0, false, true);
                                ya yaVar2 = wbVar.r1;
                                if (yaVar2 != null) {
                                    yaVar2.R0(2);
                                    yaVar2.h2 = true;
                                    yaVar2.o0(true);
                                    wbVar.r1.I0 = true;
                                    break;
                                }
                            }
                        } else {
                            gcVar.L = false;
                            if (gcVar.A && gcVar.h == null) {
                                gcVar.C = true;
                                ac acVar = gcVar.a;
                                if (acVar != null) {
                                    acVar.j1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                wbVar.J1 = true;
                wbVar.X0.setShareEnabled(false);
                v0 v0Var = wbVar.a1;
                v0Var.getClass();
                v0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                wbVar.w0.setCameraThumb(wbVar.A());
                break;
            case 19:
                vb vbVar2 = wbVar.n;
                ih.b bVar = wbVar.a;
                new org.telegram.ui.Components.oc(vbVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.f6.gc, 0, new v9(wbVar, 27), bVar)).k(true);
                break;
            case 20:
                t9 t9Var = wbVar.m0;
                if (t9Var != null) {
                    t9Var.dismiss();
                }
                wbVar.K(2, true);
                break;
            case 21:
                wbVar.l0(-1, false, true);
                break;
            case 22:
                wbVar.l0(-1, false, true);
                break;
            case 23:
                wbVar.d = false;
                AndroidUtilities.unlockOrientation(wbVar.b);
                if (wbVar.x0 != null) {
                    if (wbVar.M1) {
                        CameraController.getInstance().stopVideoRecording(wbVar.x0.getCameraSession(), false);
                    }
                    wbVar.v(false);
                }
                kb kbVar3 = wbVar.T0;
                if (kbVar3 != null) {
                    kbVar3.set(null);
                }
                wbVar.z();
                wbVar.y();
                File file = wbVar.C1;
                if (file != null && !wbVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                wbVar.C1 = null;
                AndroidUtilities.runOnUIThread(new v9(wbVar, 28), 16L);
                rb rbVar = wbVar.B;
                if (rbVar != null) {
                    rbVar.f(false);
                }
                if (wbVar.t2 != null) {
                    wbVar.t2 = null;
                }
                wbVar.h2 = null;
                wb wbVar2 = wb.B2;
                if (wbVar2 != null) {
                    wbVar2.q(false);
                }
                wb.B2 = null;
                vb vbVar3 = wbVar.n;
                if (vbVar3 != null) {
                    org.telegram.ui.Components.gc.h(vbVar3);
                }
                fh.d2 d2Var = wbVar.h0;
                if (d2Var != null) {
                    org.telegram.ui.Components.gc.h(d2Var);
                }
                jb jbVar3 = wbVar.w0;
                if (jbVar3 != null) {
                    jbVar3.e();
                    break;
                }
                break;
            case 24:
                if (!wbVar.G1.b0 && wbVar.m0 != null && (kbVar = wbVar.T0) != null) {
                    kbVar.h(new w9(wbVar, i12), kbVar, wbVar.s1, wbVar.v1);
                }
                wbVar.K(1, true);
                break;
            case 25:
                wbVar.j0(false);
                wbVar.a2 = null;
                break;
            case 26:
                wbVar.j0(false);
                wbVar.a2 = null;
                break;
            case 27:
                wbVar.T();
                break;
            default:
                WindowManager windowManager = wbVar.f;
                if (windowManager != null && (vbVar = wbVar.n) != null && vbVar.getParent() != null) {
                    windowManager.removeView(wbVar.n);
                    break;
                }
                break;
        }
    }
}
