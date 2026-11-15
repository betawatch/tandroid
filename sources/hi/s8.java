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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ s8(sa saVar, int i7) {
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
                    np.e1().edit().putFloat("frontflash_warmth", saVar.s.o).putFloat("frontflash_intensity", saVar.s.p).apply();
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
                    t8 t8Var = new t8(saVar, i12);
                    if (saVar.I1 == null) {
                        d7 d7Var = saVar.L1;
                        if (d7Var.K && !d7Var.v() && !d7Var.g) {
                            long j3 = d7Var.h0;
                            if (j3 > 0 && !d7Var.n) {
                                long j10 = (long) ((d7Var.a0 - d7Var.Z) * j3);
                                if (j10 < 68999) {
                                    i7 = i14;
                                    arrayList = null;
                                    i10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    d7Var.a0 = (59000.0f / d7Var.h0) + d7Var.Z;
                                    arrayList.add(d7Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    while (true) {
                                        i10 = r9;
                                        if (j12 < j10) {
                                            if (Math.min(j11, j10 - j12) >= 1000) {
                                                long j13 = j11;
                                                d7 g10 = d7Var.g();
                                                float f10 = d7Var.Z;
                                                float f11 = d7Var.h0;
                                                g10.Z = (j12 / f11) + f10;
                                                g10.a0 = ((r9 + j12) / f11) + d7Var.Z;
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
                                d7 d7Var2 = (d7) saVar.I1.get(num.intValue());
                                d7 d7Var3 = saVar.L1;
                                if (d7Var3 == d7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = saVar.d1.getText();
                                    ArrayList W = np.s1(i7).Y4() ? si.b0(i7).W(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = saVar.L1.C0;
                                    ArrayList W2 = np.s1(i7).Y4() ? si.b0(i7).W(charSequenceArr2, true, true) : new ArrayList();
                                    d7 d7Var4 = saVar.L1;
                                    d7Var4.k = (TextUtils.equals(d7Var4.C0, charSequenceArr[i10]) && si.K(W, W2)) ? i10 : 1;
                                    saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                                } else if (d7Var2.C0 == null) {
                                    d7Var3.k = i10;
                                    d7Var3.C0 = new SpannableString("");
                                }
                                t8Var.a(d7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {saVar.d1.getText()};
                        ArrayList W3 = np.s1(i7).Y4() ? si.b0(i7).W(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList W4 = np.s1(i7).Y4() ? si.b0(i7).W(new CharSequence[]{saVar.L1.C0}, true, true) : new ArrayList();
                        d7 d7Var5 = saVar.L1;
                        d7Var5.k = (TextUtils.equals(d7Var5.C0, charSequenceArr3[0]) && si.K(W3, W4)) ? false : true;
                        saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                        t8Var.a(saVar.L1);
                    }
                    long j14 = m10.i(i7).n;
                    TLRPC.InputPeer inputPeer = saVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = org.telegram.messenger.m5.n(inputPeer);
                    }
                    saVar.L1 = null;
                    saVar.w = true;
                    saVar.x = j14;
                    saVar.C2 = true;
                    saVar.n();
                    di.x2 x2Var = new di.x2(saVar, j14, 8);
                    ja jaVar = saVar.y;
                    if (jaVar != null) {
                        jaVar.e(j14, x2Var);
                    } else {
                        x2Var.run();
                    }
                    np.e1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                saVar.Y(false);
                break;
            case 4:
                d7 d7Var6 = saVar.L1;
                if (d7Var6 != null) {
                    d7Var6.y0 = !d7Var6.y0;
                    ga gaVar2 = saVar.Y0;
                    if (gaVar2 != null) {
                        gaVar2.u(d7Var6);
                    }
                    u9 u9Var = saVar.w1;
                    if (u9Var != null && u9Var.B0 != null) {
                        while (r9 < saVar.w1.B0.getChildCount()) {
                            View childAt = saVar.w1.B0.getChildAt(r9);
                            if (childAt instanceof tg.u0) {
                                ((tg.u0) childAt).setupTheme(saVar.L1);
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
                s8 s8Var = saVar.y2;
                if (s8Var != null) {
                    s8Var.run();
                    saVar.y2 = null;
                } else {
                    saVar.O();
                }
                d7 d7Var7 = saVar.L1;
                if (d7Var7 != null && d7Var7.n) {
                    saVar.t();
                    saVar.G();
                    saVar.r();
                    break;
                } else if (d7Var7 != null && d7Var7.u) {
                    if (d7Var7.K) {
                        saVar.Y0.t(d7Var7, null, 0L);
                    }
                    saVar.r();
                    break;
                }
                break;
            case 7:
                saVar.f(1.0f, true, new s8(saVar, 6));
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
                                    waVar.S(true);
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
                u0 u0Var = saVar.f1;
                u0Var.getClass();
                u0Var.c(hd.N0("VideoConvertFail"));
                break;
            case 18:
                saVar.B0.setCameraThumb(saVar.z());
                break;
            case 19:
                ra raVar2 = saVar.n;
                fi.b bVar = saVar.a;
                new cc(raVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(hd.M0(2131744581, null), org.telegram.ui.ActionBar.j6.Xc, 0, new s8(saVar, 27), bVar)).k(true);
                break;
            case 20:
                q8 q8Var = saVar.r0;
                if (q8Var != null) {
                    q8Var.dismiss();
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
                org.telegram.messenger.g0.P3(saVar.b);
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
                org.telegram.messenger.g0.i3(new s8(saVar, 28), 16L);
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
                bi.g2 g2Var = saVar.m0;
                if (g2Var != null) {
                    g2Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                fa faVar3 = saVar.B0;
                if (faVar3 != null) {
                    faVar3.c();
                    break;
                }
                break;
            case 24:
                if (!saVar.L1.b0 && saVar.r0 != null && (gaVar = saVar.Y0) != null) {
                    gaVar.h(new t8(saVar, i13), gaVar, saVar.x1, saVar.A1);
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
