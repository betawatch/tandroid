package hi;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ r8(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
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
        ga gaVar;
        ra raVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        sa saVar = this.b;
        switch (i11) {
            case 0:
                saVar.q();
                break;
            case 1:
                if (saVar.u2 >= 0) {
                    np.g1().edit().putFloat("frontflash_warmth", saVar.s.o).putFloat("frontflash_intensity", saVar.s.p).apply();
                }
                saVar.s.e(0.0f, 240L, null);
                saVar.F0.setSelected(false);
                break;
            case 2:
                saVar.l();
                saVar.X1 = false;
                int i14 = saVar.c;
                if (saVar.L1 == null) {
                    saVar.p(true);
                    break;
                } else {
                    saVar.x();
                    s8 s8Var = new s8(saVar, i12);
                    if (saVar.I1 == null) {
                        c7 c7Var = saVar.L1;
                        if (c7Var.K && !c7Var.v() && !c7Var.g) {
                            long j3 = c7Var.h0;
                            if (j3 > 0 && !c7Var.n) {
                                long j10 = (long) ((c7Var.a0 - c7Var.Z) * j3);
                                if (j10 < 68999) {
                                    i7 = i14;
                                    arrayList = null;
                                    i10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    c7Var.a0 = (59000.0f / c7Var.h0) + c7Var.Z;
                                    arrayList.add(c7Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    while (true) {
                                        i10 = r9;
                                        if (j12 < j10) {
                                            if (Math.min(j11, j10 - j12) >= 1000) {
                                                long j13 = j11;
                                                c7 g10 = c7Var.g();
                                                float f10 = c7Var.Z;
                                                float f11 = c7Var.h0;
                                                g10.Z = (j12 / f11) + f10;
                                                g10.a0 = ((r9 + j12) / f11) + c7Var.Z;
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
                                saVar.I1 = arrayList;
                                if (arrayList != null) {
                                    saVar.J1 = new ArrayList();
                                    saVar.K1 = new ArrayList();
                                    for (int i15 = i10; i15 < saVar.I1.size(); i15 = com.google.android.gms.internal.vision.e2.f(i15, i15, 1, saVar.K1)) {
                                        saVar.J1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i7 = i14;
                        i10 = 0;
                        arrayList = null;
                        saVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i7 = i14;
                        i10 = 0;
                    }
                    if (saVar.I1 != null) {
                        ArrayList arrayList2 = saVar.K1;
                        int size = arrayList2.size();
                        int i16 = i10;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (saVar.J1.contains(num)) {
                                c7 c7Var2 = (c7) saVar.I1.get(num.intValue());
                                c7 c7Var3 = saVar.L1;
                                if (c7Var3 == c7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = saVar.d1.getText();
                                    ArrayList Y = np.u1(i7).j5() ? si.d0(i7).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = saVar.L1.C0;
                                    ArrayList Y2 = np.u1(i7).j5() ? si.d0(i7).Y(charSequenceArr2, true, true) : new ArrayList();
                                    c7 c7Var4 = saVar.L1;
                                    c7Var4.k = (TextUtils.equals(c7Var4.C0, charSequenceArr[i10]) && si.M(Y, Y2)) ? i10 : 1;
                                    saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                                } else if (c7Var2.C0 == null) {
                                    c7Var3.k = i10;
                                    c7Var3.C0 = new SpannableString("");
                                }
                                s8Var.a(c7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {saVar.d1.getText()};
                        ArrayList Y3 = np.u1(i7).j5() ? si.d0(i7).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = np.u1(i7).j5() ? si.d0(i7).Y(new CharSequence[]{saVar.L1.C0}, true, true) : new ArrayList();
                        c7 c7Var5 = saVar.L1;
                        c7Var5.k = (TextUtils.equals(c7Var5.C0, charSequenceArr3[0]) && si.M(Y3, Y4)) ? false : true;
                        saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                        s8Var.a(saVar.L1);
                    }
                    long j14 = k10.i(i7).n;
                    TLRPC.InputPeer inputPeer = saVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = org.telegram.messenger.n5.n(inputPeer);
                    }
                    saVar.L1 = null;
                    saVar.w = true;
                    saVar.x = j14;
                    saVar.C2 = true;
                    saVar.n();
                    bi.c4 c4Var = new bi.c4(saVar, j14, 9);
                    ja jaVar = saVar.y;
                    if (jaVar != null) {
                        jaVar.b(j14, c4Var);
                    } else {
                        c4Var.run();
                    }
                    np.g1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                saVar.Y(false);
                break;
            case 4:
                c7 c7Var6 = saVar.L1;
                if (c7Var6 != null) {
                    c7Var6.y0 = !c7Var6.y0;
                    ga gaVar2 = saVar.Y0;
                    if (gaVar2 != null) {
                        gaVar2.u(c7Var6);
                    }
                    u9 u9Var = saVar.w1;
                    if (u9Var != null && u9Var.B0 != null) {
                        while (r9 < saVar.w1.B0.getChildCount()) {
                            View childAt = saVar.w1.B0.getChildAt(r9);
                            if (childAt instanceof tg.v0) {
                                ((tg.v0) childAt).setupTheme(saVar.L1);
                            }
                            r9++;
                        }
                    }
                    saVar.n0(true);
                    break;
                }
                break;
            case 5:
                saVar.p(true);
                break;
            case 6:
                saVar.d = true;
                saVar.w = false;
                if (saVar.K == 1) {
                    saVar.i0.setAlpha(1.0f);
                    saVar.i0.setTranslationX(0.0f);
                    saVar.i0.setTranslationY(0.0f);
                    saVar.j0.setAlpha(1.0f);
                    saVar.l0.setAlpha(1.0f);
                    saVar.n.setBackgroundColor(-16777216);
                    if (saVar.g0 == 2) {
                        saVar.v1.setAlpha(1.0f);
                    }
                }
                r8 r8Var = saVar.y2;
                if (r8Var != null) {
                    r8Var.run();
                    saVar.y2 = null;
                } else {
                    saVar.O();
                }
                c7 c7Var7 = saVar.L1;
                if (c7Var7 != null && c7Var7.n) {
                    saVar.t();
                    saVar.G();
                    saVar.r();
                    break;
                } else if (c7Var7 != null && c7Var7.u) {
                    if (c7Var7.K) {
                        saVar.Y0.t(c7Var7, null, 0L);
                    }
                    saVar.r();
                    break;
                }
                break;
            case 7:
                saVar.f(1.0f, true, new r8(saVar, 6));
                break;
            case 8:
                saVar.B0.setCameraThumb(saVar.z());
                v9 v9Var = saVar.C0;
                if (v9Var != null) {
                    v9Var.destroy(true, null);
                    org.telegram.messenger.g0.E2(saVar.C0);
                    fa faVar = saVar.B0;
                    if (faVar != null) {
                        faVar.setCameraView(null);
                    }
                    saVar.C0 = null;
                    break;
                }
                break;
            case 9:
                saVar.B0.setCameraThumb(saVar.z());
                break;
            case 10:
                if (saVar.g0 == 1) {
                    saVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                l9 l9Var = saVar.e1;
                if (l9Var != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + saVar.d1.getEditTextHeight());
                    l9Var.setTranslationY(i17 - (saVar.a1 != null ? r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                fa faVar2 = saVar.B0;
                if (faVar2 != null) {
                    faVar2.c.a(saVar.E0.E ? saVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                saVar.l0(true);
                break;
            case 14:
                saVar.r();
                break;
            case 15:
                ia iaVar = saVar.d1;
                if (iaVar != null) {
                    iaVar.m();
                    break;
                }
                break;
            case 16:
                if (saVar.h0 == -1 && saVar.g0 == 1) {
                    ia iaVar2 = saVar.d1;
                    if (!iaVar2.p0 && !iaVar2.O1) {
                        cb cbVar = saVar.a1;
                        if (!cbVar.Q) {
                            l9 l9Var2 = saVar.e1;
                            if (l9Var2.N) {
                                l9Var2.c(false, true);
                                break;
                            } else {
                                saVar.k0(0, false, true);
                                u9 u9Var2 = saVar.w1;
                                if (u9Var2 != null) {
                                    u9Var2.O0(2);
                                    u9Var2.V1 = true;
                                    u9Var2.l0(true);
                                    saVar.w1.w0 = true;
                                    break;
                                }
                            }
                        } else {
                            cbVar.Q = false;
                            if (cbVar.F && cbVar.h == null) {
                                cbVar.H = true;
                                wa waVar = cbVar.a;
                                if (waVar != null) {
                                    waVar.h1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                saVar.O1 = true;
                saVar.c1.setShareEnabled(false);
                v0 v0Var = saVar.f1;
                v0Var.getClass();
                v0Var.c(hd.O0("VideoConvertFail"));
                break;
            case 18:
                saVar.B0.setCameraThumb(saVar.z());
                break;
            case 19:
                ra raVar2 = saVar.n;
                fi.b bVar = saVar.a;
                new lc(raVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.R2(hd.N0(2131744338, null), org.telegram.ui.ActionBar.m6.Xc, 0, new r8(saVar, 27), bVar)).k(true);
                break;
            case 20:
                p8 p8Var = saVar.r0;
                if (p8Var != null) {
                    p8Var.dismiss();
                }
                saVar.J(2, true);
                break;
            case 21:
                saVar.k0(-1, false, true);
                break;
            case 22:
                saVar.k0(-1, false, true);
                break;
            case 23:
                saVar.d = false;
                org.telegram.messenger.g0.O3(saVar.b);
                if (saVar.C0 != null) {
                    if (saVar.R1) {
                        CameraController.getInstance().stopVideoRecording(saVar.C0.getCameraSession(), false);
                    }
                    saVar.u(false);
                }
                ga gaVar3 = saVar.Y0;
                if (gaVar3 != null) {
                    gaVar3.set(null);
                }
                saVar.y();
                saVar.x();
                File file = saVar.H1;
                if (file != null && !saVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                saVar.H1 = null;
                org.telegram.messenger.g0.h3(new r8(saVar, 28), 16L);
                na naVar = saVar.G;
                if (naVar != null) {
                    naVar.f(false);
                }
                if (saVar.y2 != null) {
                    saVar.y2 = null;
                }
                saVar.m2 = null;
                sa saVar2 = sa.G2;
                if (saVar2 != null) {
                    saVar2.p(false);
                }
                sa.G2 = null;
                ra raVar3 = saVar.n;
                if (raVar3 != null) {
                    raVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                bi.e3 e3Var = saVar.m0;
                if (e3Var != null) {
                    e3Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                fa faVar3 = saVar.B0;
                if (faVar3 != null) {
                    faVar3.c();
                    break;
                }
                break;
            case 24:
                if (!saVar.L1.b0 && saVar.r0 != null && (gaVar = saVar.Y0) != null) {
                    gaVar.h(new s8(saVar, i13), gaVar, saVar.x1, saVar.A1);
                }
                saVar.J(1, true);
                break;
            case 25:
                saVar.i0(false);
                saVar.f2 = null;
                break;
            case 26:
                saVar.i0(false);
                saVar.f2 = null;
                break;
            case 27:
                saVar.S();
                break;
            default:
                WindowManager windowManager = saVar.f;
                if (windowManager != null && (raVar = saVar.n) != null && raVar.getParent() != null) {
                    windowManager.removeView(saVar.n);
                    break;
                }
                break;
        }
    }
}
