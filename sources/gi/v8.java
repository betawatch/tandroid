package gi;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ v8(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        int i10;
        ArrayList arrayList;
        ja jaVar;
        ua uaVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        va vaVar = this.b;
        switch (i11) {
            case 0:
                vaVar.q();
                break;
            case 1:
                if (vaVar.u2 >= 0) {
                    hp.e1().edit().putFloat("frontflash_warmth", vaVar.s.o).putFloat("frontflash_intensity", vaVar.s.p).apply();
                }
                vaVar.s.e(0.0f, 240L, null);
                vaVar.F0.setSelected(false);
                break;
            case 2:
                vaVar.l();
                vaVar.X1 = false;
                int i14 = vaVar.c;
                if (vaVar.L1 == null) {
                    vaVar.p(true);
                    break;
                } else {
                    vaVar.x();
                    w8 w8Var = new w8(vaVar, i12);
                    if (vaVar.I1 == null) {
                        f7 f7Var = vaVar.L1;
                        if (f7Var.K && !f7Var.v() && !f7Var.g) {
                            long j10 = f7Var.h0;
                            if (j10 > 0 && !f7Var.n) {
                                long j11 = (long) ((f7Var.a0 - f7Var.Z) * j10);
                                if (j11 < 68999) {
                                    i3 = i14;
                                    arrayList = null;
                                    i10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    f7Var.a0 = (59000.0f / f7Var.h0) + f7Var.Z;
                                    arrayList.add(f7Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        i10 = r9;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                f7 g7 = f7Var.g();
                                                float f10 = f7Var.Z;
                                                float f11 = f7Var.h0;
                                                g7.Z = (j13 / f11) + f10;
                                                g7.a0 = ((r9 + j13) / f11) + f7Var.Z;
                                                g7.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g7);
                                                r9 = i10;
                                                j12 = j14;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i3 = i14;
                                }
                                vaVar.I1 = arrayList;
                                if (arrayList != null) {
                                    vaVar.J1 = new ArrayList();
                                    vaVar.K1 = new ArrayList();
                                    for (int i15 = i10; i15 < vaVar.I1.size(); i15 = com.google.android.recaptcha.internal.a.f(i15, i15, 1, vaVar.K1)) {
                                        vaVar.J1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i3 = i14;
                        i10 = 0;
                        arrayList = null;
                        vaVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i3 = i14;
                        i10 = 0;
                    }
                    if (vaVar.I1 != null) {
                        ArrayList arrayList2 = vaVar.K1;
                        int size = arrayList2.size();
                        int i16 = i10;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (vaVar.J1.contains(num)) {
                                f7 f7Var2 = (f7) vaVar.I1.get(num.intValue());
                                f7 f7Var3 = vaVar.L1;
                                if (f7Var3 == f7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = vaVar.d1.getText();
                                    ArrayList W = hp.s1(i3).X4() ? li.b0(i3).W(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = vaVar.L1.C0;
                                    ArrayList W2 = hp.s1(i3).X4() ? li.b0(i3).W(charSequenceArr2, true, true) : new ArrayList();
                                    f7 f7Var4 = vaVar.L1;
                                    f7Var4.k = (TextUtils.equals(f7Var4.C0, charSequenceArr[i10]) && li.K(W, W2)) ? i10 : 1;
                                    vaVar.L1.C0 = new SpannableString(vaVar.d1.getText());
                                } else if (f7Var2.C0 == null) {
                                    f7Var3.k = i10;
                                    f7Var3.C0 = new SpannableString("");
                                }
                                w8Var.a(f7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {vaVar.d1.getText()};
                        ArrayList W3 = hp.s1(i3).X4() ? li.b0(i3).W(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList W4 = hp.s1(i3).X4() ? li.b0(i3).W(new CharSequence[]{vaVar.L1.C0}, true, true) : new ArrayList();
                        f7 f7Var5 = vaVar.L1;
                        f7Var5.k = (TextUtils.equals(f7Var5.C0, charSequenceArr3[0]) && li.K(W3, W4)) ? false : true;
                        vaVar.L1.C0 = new SpannableString(vaVar.d1.getText());
                        w8Var.a(vaVar.L1);
                    }
                    long j15 = h10.i(i3).n;
                    TLRPC.InputPeer inputPeer = vaVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = org.telegram.messenger.m5.n(inputPeer);
                    }
                    vaVar.L1 = null;
                    vaVar.w = true;
                    vaVar.x = j15;
                    vaVar.C2 = true;
                    vaVar.n();
                    ci.e3 e3Var = new ci.e3(vaVar, j15, 8);
                    ma maVar = vaVar.y;
                    if (maVar != null) {
                        maVar.a(j15, e3Var);
                    } else {
                        e3Var.run();
                    }
                    hp.e1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                vaVar.Y(false);
                break;
            case 4:
                f7 f7Var6 = vaVar.L1;
                if (f7Var6 != null) {
                    f7Var6.y0 = !f7Var6.y0;
                    ja jaVar2 = vaVar.Y0;
                    if (jaVar2 != null) {
                        jaVar2.u(f7Var6);
                    }
                    x9 x9Var = vaVar.w1;
                    if (x9Var != null && x9Var.B0 != null) {
                        while (r9 < vaVar.w1.B0.getChildCount()) {
                            View childAt = vaVar.w1.B0.getChildAt(r9);
                            if (childAt instanceof ug.t0) {
                                ((ug.t0) childAt).setupTheme(vaVar.L1);
                            }
                            r9++;
                        }
                    }
                    vaVar.n0(true);
                    break;
                }
                break;
            case 5:
                vaVar.p(true);
                break;
            case 6:
                vaVar.d = true;
                vaVar.w = false;
                if (vaVar.K == 1) {
                    vaVar.i0.setAlpha(1.0f);
                    vaVar.i0.setTranslationX(0.0f);
                    vaVar.i0.setTranslationY(0.0f);
                    vaVar.j0.setAlpha(1.0f);
                    vaVar.l0.setAlpha(1.0f);
                    vaVar.n.setBackgroundColor(-16777216);
                    if (vaVar.g0 == 2) {
                        vaVar.v1.setAlpha(1.0f);
                    }
                }
                v8 v8Var = vaVar.y2;
                if (v8Var != null) {
                    v8Var.run();
                    vaVar.y2 = null;
                } else {
                    vaVar.O();
                }
                f7 f7Var7 = vaVar.L1;
                if (f7Var7 != null && f7Var7.n) {
                    vaVar.t();
                    vaVar.G();
                    vaVar.r();
                    break;
                } else if (f7Var7 != null && f7Var7.u) {
                    if (f7Var7.K) {
                        vaVar.Y0.t(f7Var7, null, 0L);
                    }
                    vaVar.r();
                    break;
                }
                break;
            case 7:
                vaVar.f(1.0f, true, new v8(vaVar, 6));
                break;
            case 8:
                vaVar.B0.setCameraThumb(vaVar.z());
                y9 y9Var = vaVar.C0;
                if (y9Var != null) {
                    y9Var.destroy(true, null);
                    org.telegram.messenger.g0.E2(vaVar.C0);
                    ia iaVar = vaVar.B0;
                    if (iaVar != null) {
                        iaVar.setCameraView(null);
                    }
                    vaVar.C0 = null;
                    break;
                }
                break;
            case 9:
                vaVar.B0.setCameraThumb(vaVar.z());
                break;
            case 10:
                if (vaVar.g0 == 1) {
                    vaVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                o9 o9Var = vaVar.e1;
                if (o9Var != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.d1.getEditTextHeight());
                    o9Var.setTranslationY(i17 - (vaVar.a1 != null ? r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ia iaVar2 = vaVar.B0;
                if (iaVar2 != null) {
                    iaVar2.c.a(vaVar.E0.E ? vaVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                vaVar.l0(true);
                break;
            case 14:
                vaVar.r();
                break;
            case 15:
                la laVar = vaVar.d1;
                if (laVar != null) {
                    laVar.m();
                    break;
                }
                break;
            case 16:
                if (vaVar.h0 == -1 && vaVar.g0 == 1) {
                    la laVar2 = vaVar.d1;
                    if (!laVar2.p0 && !laVar2.O1) {
                        fb fbVar = vaVar.a1;
                        if (!fbVar.Q) {
                            o9 o9Var2 = vaVar.e1;
                            if (o9Var2.N) {
                                o9Var2.c(false, true);
                                break;
                            } else {
                                vaVar.k0(0, false, true);
                                x9 x9Var2 = vaVar.w1;
                                if (x9Var2 != null) {
                                    x9Var2.O0(2);
                                    x9Var2.V1 = true;
                                    x9Var2.l0(true);
                                    vaVar.w1.w0 = true;
                                    break;
                                }
                            }
                        } else {
                            fbVar.Q = false;
                            if (fbVar.F && fbVar.h == null) {
                                fbVar.H = true;
                                za zaVar = fbVar.a;
                                if (zaVar != null) {
                                    zaVar.M(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                vaVar.O1 = true;
                vaVar.c1.setShareEnabled(false);
                t0 t0Var = vaVar.f1;
                t0Var.getClass();
                t0Var.c(bd.N0("VideoConvertFail"));
                break;
            case 18:
                vaVar.B0.setCameraThumb(vaVar.z());
                break;
            case 19:
                ua uaVar2 = vaVar.n;
                ei.b bVar = vaVar.a;
                new fc(uaVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(bd.M0(2131744591, null), org.telegram.ui.ActionBar.k6.Uc, 0, new v8(vaVar, 27), bVar)).k(true);
                break;
            case 20:
                t8 t8Var = vaVar.r0;
                if (t8Var != null) {
                    t8Var.dismiss();
                }
                vaVar.J(2, true);
                break;
            case 21:
                vaVar.k0(-1, false, true);
                break;
            case 22:
                vaVar.k0(-1, false, true);
                break;
            case 23:
                vaVar.d = false;
                org.telegram.messenger.g0.Q3(vaVar.b);
                if (vaVar.C0 != null) {
                    if (vaVar.R1) {
                        CameraController.getInstance().stopVideoRecording(vaVar.C0.getCameraSession(), false);
                    }
                    vaVar.u(false);
                }
                ja jaVar3 = vaVar.Y0;
                if (jaVar3 != null) {
                    jaVar3.set(null);
                }
                vaVar.y();
                vaVar.x();
                File file = vaVar.H1;
                if (file != null && !vaVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                vaVar.H1 = null;
                org.telegram.messenger.g0.i3(new v8(vaVar, 28), 16L);
                qa qaVar = vaVar.G;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                if (vaVar.y2 != null) {
                    vaVar.y2 = null;
                }
                vaVar.m2 = null;
                va vaVar2 = va.G2;
                if (vaVar2 != null) {
                    vaVar2.p(false);
                }
                va.G2 = null;
                ua uaVar3 = vaVar.n;
                if (uaVar3 != null) {
                    uaVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                ai.o2 o2Var = vaVar.m0;
                if (o2Var != null) {
                    o2Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                ia iaVar3 = vaVar.B0;
                if (iaVar3 != null) {
                    iaVar3.c();
                    break;
                }
                break;
            case 24:
                if (!vaVar.L1.b0 && vaVar.r0 != null && (jaVar = vaVar.Y0) != null) {
                    jaVar.h(new w8(vaVar, i13), jaVar, vaVar.x1, vaVar.A1);
                }
                vaVar.J(1, true);
                break;
            case 25:
                vaVar.i0(false);
                vaVar.f2 = null;
                break;
            case 26:
                vaVar.i0(false);
                vaVar.f2 = null;
                break;
            case 27:
                vaVar.S();
                break;
            default:
                WindowManager windowManager = vaVar.f;
                if (windowManager != null && (uaVar = vaVar.n) != null && uaVar.getParent() != null) {
                    windowManager.removeView(vaVar.n);
                    break;
                }
                break;
        }
    }
}
