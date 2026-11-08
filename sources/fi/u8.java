package fi;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ u8(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
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
                if (vaVar.t2 >= 0) {
                    qp.e1().edit().putFloat("frontflash_warmth", vaVar.s.o).putFloat("frontflash_intensity", vaVar.s.p).apply();
                }
                vaVar.s.e(0.0f, 240L, null);
                vaVar.E0.setSelected(false);
                break;
            case 2:
                vaVar.l();
                vaVar.W1 = false;
                int i14 = vaVar.c;
                if (vaVar.K1 == null) {
                    vaVar.p(true);
                    break;
                } else {
                    vaVar.x();
                    v8 v8Var = new v8(vaVar, i12);
                    if (vaVar.H1 == null) {
                        e7 e7Var = vaVar.K1;
                        if (e7Var.K && !e7Var.v() && !e7Var.g) {
                            long j3 = e7Var.h0;
                            if (j3 > 0 && !e7Var.n) {
                                long j10 = (long) ((e7Var.a0 - e7Var.Z) * j3);
                                if (j10 < 68999) {
                                    i7 = i14;
                                    arrayList = null;
                                    i10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    e7Var.a0 = (59000.0f / e7Var.h0) + e7Var.Z;
                                    arrayList.add(e7Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    while (true) {
                                        i10 = r9;
                                        if (j12 < j10) {
                                            if (Math.min(j11, j10 - j12) >= 1000) {
                                                long j13 = j11;
                                                e7 g10 = e7Var.g();
                                                float f10 = e7Var.Z;
                                                float f11 = e7Var.h0;
                                                g10.Z = (j12 / f11) + f10;
                                                g10.a0 = ((r9 + j12) / f11) + e7Var.Z;
                                                g10.C0 = "";
                                                j12 += j13;
                                                arrayList.add(g10);
                                                r9 = i10;
                                                j11 = j13;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i7 = i14;
                                }
                                vaVar.H1 = arrayList;
                                if (arrayList != null) {
                                    vaVar.I1 = new ArrayList();
                                    vaVar.J1 = new ArrayList();
                                    for (int i15 = i10; i15 < vaVar.H1.size(); i15 = com.google.android.recaptcha.internal.a.f(i15, i15, 1, vaVar.J1)) {
                                        vaVar.I1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i7 = i14;
                        i10 = 0;
                        arrayList = null;
                        vaVar.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i7 = i14;
                        i10 = 0;
                    }
                    if (vaVar.H1 != null) {
                        ArrayList arrayList2 = vaVar.J1;
                        int size = arrayList2.size();
                        int i16 = i10;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (vaVar.I1.contains(num)) {
                                e7 e7Var2 = (e7) vaVar.H1.get(num.intValue());
                                e7 e7Var3 = vaVar.K1;
                                if (e7Var3 == e7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = vaVar.c1.getText();
                                    ArrayList W = qp.s1(i7).X4() ? ui.b0(i7).W(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = vaVar.K1.C0;
                                    ArrayList W2 = qp.s1(i7).X4() ? ui.b0(i7).W(charSequenceArr2, true, true) : new ArrayList();
                                    e7 e7Var4 = vaVar.K1;
                                    e7Var4.k = (TextUtils.equals(e7Var4.C0, charSequenceArr[i10]) && ui.K(W, W2)) ? i10 : 1;
                                    vaVar.K1.C0 = new SpannableString(vaVar.c1.getText());
                                } else if (e7Var2.C0 == null) {
                                    e7Var3.k = i10;
                                    e7Var3.C0 = new SpannableString("");
                                }
                                v8Var.a(e7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {vaVar.c1.getText()};
                        ArrayList W3 = qp.s1(i7).X4() ? ui.b0(i7).W(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList W4 = qp.s1(i7).X4() ? ui.b0(i7).W(new CharSequence[]{vaVar.K1.C0}, true, true) : new ArrayList();
                        e7 e7Var5 = vaVar.K1;
                        e7Var5.k = (TextUtils.equals(e7Var5.C0, charSequenceArr3[0]) && ui.K(W3, W4)) ? false : true;
                        vaVar.K1.C0 = new SpannableString(vaVar.c1.getText());
                        v8Var.a(vaVar.K1);
                    }
                    long j14 = p10.i(i7).n;
                    TLRPC.InputPeer inputPeer = vaVar.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = org.telegram.messenger.m5.n(inputPeer);
                    }
                    vaVar.K1 = null;
                    vaVar.w = true;
                    vaVar.x = j14;
                    vaVar.B2 = true;
                    vaVar.n();
                    bi.r3 r3Var = new bi.r3(vaVar, j14, 8);
                    ma maVar = vaVar.y;
                    if (maVar != null) {
                        maVar.g(j14, r3Var);
                    } else {
                        r3Var.run();
                    }
                    qp.e1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                vaVar.Y(false);
                break;
            case 4:
                e7 e7Var6 = vaVar.K1;
                if (e7Var6 != null) {
                    e7Var6.y0 = !e7Var6.y0;
                    ja jaVar2 = vaVar.X0;
                    if (jaVar2 != null) {
                        jaVar2.u(e7Var6);
                    }
                    x9 x9Var = vaVar.v1;
                    if (x9Var != null && x9Var.A0 != null) {
                        while (r9 < vaVar.v1.A0.getChildCount()) {
                            View childAt = vaVar.v1.A0.getChildAt(r9);
                            if (childAt instanceof tg.u0) {
                                ((tg.u0) childAt).setupTheme(vaVar.K1);
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
                if (vaVar.J == 1) {
                    vaVar.h0.setAlpha(1.0f);
                    vaVar.h0.setTranslationX(0.0f);
                    vaVar.h0.setTranslationY(0.0f);
                    vaVar.i0.setAlpha(1.0f);
                    vaVar.k0.setAlpha(1.0f);
                    vaVar.n.setBackgroundColor(-16777216);
                    if (vaVar.f0 == 2) {
                        vaVar.u1.setAlpha(1.0f);
                    }
                }
                u8 u8Var = vaVar.x2;
                if (u8Var != null) {
                    u8Var.run();
                    vaVar.x2 = null;
                } else {
                    vaVar.O();
                }
                e7 e7Var7 = vaVar.K1;
                if (e7Var7 != null && e7Var7.n) {
                    vaVar.t();
                    vaVar.G();
                    vaVar.r();
                    break;
                } else if (e7Var7 != null && e7Var7.u) {
                    if (e7Var7.K) {
                        vaVar.X0.t(e7Var7, null, 0L);
                    }
                    vaVar.r();
                    break;
                }
                break;
            case 7:
                vaVar.f(1.0f, true, new u8(vaVar, 6));
                break;
            case 8:
                vaVar.A0.setCameraThumb(vaVar.z());
                y9 y9Var = vaVar.B0;
                if (y9Var != null) {
                    y9Var.destroy(true, null);
                    org.telegram.messenger.g0.E2(vaVar.B0);
                    ia iaVar = vaVar.A0;
                    if (iaVar != null) {
                        iaVar.setCameraView(null);
                    }
                    vaVar.B0 = null;
                    break;
                }
                break;
            case 9:
                vaVar.A0.setCameraThumb(vaVar.z());
                break;
            case 10:
                if (vaVar.f0 == 1) {
                    vaVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                o9 o9Var = vaVar.d1;
                if (o9Var != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.c1.getEditTextHeight());
                    o9Var.setTranslationY(i17 - (vaVar.Z0 != null ? r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ia iaVar2 = vaVar.A0;
                if (iaVar2 != null) {
                    iaVar2.c.a(vaVar.D0.D ? vaVar.C0.d : null);
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
                la laVar = vaVar.c1;
                if (laVar != null) {
                    laVar.m();
                    break;
                }
                break;
            case 16:
                if (vaVar.g0 == -1 && vaVar.f0 == 1) {
                    la laVar2 = vaVar.c1;
                    if (!laVar2.o0 && !laVar2.N1) {
                        fb fbVar = vaVar.Z0;
                        if (!fbVar.P) {
                            o9 o9Var2 = vaVar.d1;
                            if (o9Var2.M) {
                                o9Var2.c(false, true);
                                break;
                            } else {
                                vaVar.k0(0, false, true);
                                x9 x9Var2 = vaVar.v1;
                                if (x9Var2 != null) {
                                    x9Var2.O0(2);
                                    x9Var2.U1 = true;
                                    x9Var2.l0(true);
                                    vaVar.v1.v0 = true;
                                    break;
                                }
                            }
                        } else {
                            fbVar.P = false;
                            if (fbVar.E && fbVar.h == null) {
                                fbVar.G = true;
                                za zaVar = fbVar.a;
                                if (zaVar != null) {
                                    zaVar.K(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                vaVar.N1 = true;
                vaVar.b1.setShareEnabled(false);
                t0 t0Var = vaVar.e1;
                t0Var.getClass();
                t0Var.c(id.N0("VideoConvertFail"));
                break;
            case 18:
                vaVar.A0.setCameraThumb(vaVar.z());
                break;
            case 19:
                ua uaVar2 = vaVar.n;
                di.b bVar = vaVar.a;
                new hc(uaVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(id.M0(2131744584, null), org.telegram.ui.ActionBar.k6.Uc, 0, new u8(vaVar, 27), bVar)).k(true);
                break;
            case 20:
                s8 s8Var = vaVar.q0;
                if (s8Var != null) {
                    s8Var.dismiss();
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
                if (vaVar.B0 != null) {
                    if (vaVar.Q1) {
                        CameraController.getInstance().stopVideoRecording(vaVar.B0.getCameraSession(), false);
                    }
                    vaVar.u(false);
                }
                ja jaVar3 = vaVar.X0;
                if (jaVar3 != null) {
                    jaVar3.set(null);
                }
                vaVar.y();
                vaVar.x();
                File file = vaVar.G1;
                if (file != null && !vaVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                vaVar.G1 = null;
                org.telegram.messenger.g0.i3(new u8(vaVar, 28), 16L);
                qa qaVar = vaVar.F;
                if (qaVar != null) {
                    qaVar.f(false);
                }
                if (vaVar.x2 != null) {
                    vaVar.x2 = null;
                }
                vaVar.l2 = null;
                va vaVar2 = va.F2;
                if (vaVar2 != null) {
                    vaVar2.p(false);
                }
                va.F2 = null;
                ua uaVar3 = vaVar.n;
                if (uaVar3 != null) {
                    uaVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                bi.e5 e5Var = vaVar.l0;
                if (e5Var != null) {
                    e5Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                ia iaVar3 = vaVar.A0;
                if (iaVar3 != null) {
                    iaVar3.c();
                    break;
                }
                break;
            case 24:
                if (!vaVar.K1.b0 && vaVar.q0 != null && (jaVar = vaVar.X0) != null) {
                    jaVar.h(new v8(vaVar, i13), jaVar, vaVar.w1, vaVar.z1);
                }
                vaVar.J(1, true);
                break;
            case 25:
                vaVar.i0(false);
                vaVar.e2 = null;
                break;
            case 26:
                vaVar.i0(false);
                vaVar.e2 = null;
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
