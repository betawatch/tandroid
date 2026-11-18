package hi;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ s8(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
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
        ha haVar;
        sa saVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        ta taVar = this.b;
        switch (i11) {
            case 0:
                taVar.q();
                break;
            case 1:
                if (taVar.u2 >= 0) {
                    mp.g1().edit().putFloat("frontflash_warmth", taVar.s.o).putFloat("frontflash_intensity", taVar.s.p).apply();
                }
                taVar.s.e(0.0f, 240L, null);
                taVar.F0.setSelected(false);
                break;
            case 2:
                taVar.l();
                taVar.X1 = false;
                int i14 = taVar.c;
                if (taVar.L1 == null) {
                    taVar.p(true);
                    break;
                } else {
                    taVar.x();
                    t8 t8Var = new t8(taVar, i12);
                    if (taVar.I1 == null) {
                        d7 d7Var = taVar.L1;
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
                                taVar.I1 = arrayList;
                                if (arrayList != null) {
                                    taVar.J1 = new ArrayList();
                                    taVar.K1 = new ArrayList();
                                    for (int i15 = i10; i15 < taVar.I1.size(); i15 = com.google.android.gms.internal.vision.e2.f(i15, i15, 1, taVar.K1)) {
                                        taVar.J1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i7 = i14;
                        i10 = 0;
                        arrayList = null;
                        taVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i7 = i14;
                        i10 = 0;
                    }
                    if (taVar.I1 != null) {
                        ArrayList arrayList2 = taVar.K1;
                        int size = arrayList2.size();
                        int i16 = i10;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (taVar.J1.contains(num)) {
                                d7 d7Var2 = (d7) taVar.I1.get(num.intValue());
                                d7 d7Var3 = taVar.L1;
                                if (d7Var3 == d7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = taVar.d1.getText();
                                    ArrayList Y = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = taVar.L1.C0;
                                    ArrayList Y2 = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr2, true, true) : new ArrayList();
                                    d7 d7Var4 = taVar.L1;
                                    d7Var4.k = (TextUtils.equals(d7Var4.C0, charSequenceArr[i10]) && ri.M(Y, Y2)) ? i10 : 1;
                                    taVar.L1.C0 = new SpannableString(taVar.d1.getText());
                                } else if (d7Var2.C0 == null) {
                                    d7Var3.k = i10;
                                    d7Var3.C0 = new SpannableString("");
                                }
                                t8Var.a(d7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {taVar.d1.getText()};
                        ArrayList Y3 = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = mp.u1(i7).j5() ? ri.d0(i7).Y(new CharSequence[]{taVar.L1.C0}, true, true) : new ArrayList();
                        d7 d7Var5 = taVar.L1;
                        d7Var5.k = (TextUtils.equals(d7Var5.C0, charSequenceArr3[0]) && ri.M(Y3, Y4)) ? false : true;
                        taVar.L1.C0 = new SpannableString(taVar.d1.getText());
                        t8Var.a(taVar.L1);
                    }
                    long j14 = j10.i(i7).n;
                    TLRPC.InputPeer inputPeer = taVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = org.telegram.messenger.n5.n(inputPeer);
                    }
                    taVar.L1 = null;
                    taVar.w = true;
                    taVar.x = j14;
                    taVar.C2 = true;
                    taVar.n();
                    bi.y3 y3Var = new bi.y3(taVar, j14, 9);
                    ka kaVar = taVar.y;
                    if (kaVar != null) {
                        kaVar.b(j14, y3Var);
                    } else {
                        y3Var.run();
                    }
                    mp.g1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                taVar.Y(false);
                break;
            case 4:
                d7 d7Var6 = taVar.L1;
                if (d7Var6 != null) {
                    d7Var6.y0 = !d7Var6.y0;
                    ha haVar2 = taVar.Y0;
                    if (haVar2 != null) {
                        haVar2.u(d7Var6);
                    }
                    v9 v9Var = taVar.w1;
                    if (v9Var != null && v9Var.B0 != null) {
                        while (r9 < taVar.w1.B0.getChildCount()) {
                            View childAt = taVar.w1.B0.getChildAt(r9);
                            if (childAt instanceof tg.u0) {
                                ((tg.u0) childAt).setupTheme(taVar.L1);
                            }
                            r9++;
                        }
                    }
                    taVar.n0(true);
                    break;
                }
                break;
            case 5:
                taVar.p(true);
                break;
            case 6:
                taVar.d = true;
                taVar.w = false;
                if (taVar.K == 1) {
                    taVar.i0.setAlpha(1.0f);
                    taVar.i0.setTranslationX(0.0f);
                    taVar.i0.setTranslationY(0.0f);
                    taVar.j0.setAlpha(1.0f);
                    taVar.l0.setAlpha(1.0f);
                    taVar.n.setBackgroundColor(-16777216);
                    if (taVar.g0 == 2) {
                        taVar.v1.setAlpha(1.0f);
                    }
                }
                s8 s8Var = taVar.y2;
                if (s8Var != null) {
                    s8Var.run();
                    taVar.y2 = null;
                } else {
                    taVar.O();
                }
                d7 d7Var7 = taVar.L1;
                if (d7Var7 != null && d7Var7.n) {
                    taVar.t();
                    taVar.G();
                    taVar.r();
                    break;
                } else if (d7Var7 != null && d7Var7.u) {
                    if (d7Var7.K) {
                        taVar.Y0.t(d7Var7, null, 0L);
                    }
                    taVar.r();
                    break;
                }
                break;
            case 7:
                taVar.f(1.0f, true, new s8(taVar, 6));
                break;
            case 8:
                taVar.B0.setCameraThumb(taVar.z());
                w9 w9Var = taVar.C0;
                if (w9Var != null) {
                    w9Var.destroy(true, null);
                    org.telegram.messenger.g0.E2(taVar.C0);
                    ga gaVar = taVar.B0;
                    if (gaVar != null) {
                        gaVar.setCameraView(null);
                    }
                    taVar.C0 = null;
                    break;
                }
                break;
            case 9:
                taVar.B0.setCameraThumb(taVar.z());
                break;
            case 10:
                if (taVar.g0 == 1) {
                    taVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                m9 m9Var = taVar.e1;
                if (m9Var != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + taVar.d1.getEditTextHeight());
                    m9Var.setTranslationY(i17 - (taVar.a1 != null ? r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ga gaVar2 = taVar.B0;
                if (gaVar2 != null) {
                    gaVar2.c.a(taVar.E0.E ? taVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                taVar.l0(true);
                break;
            case 14:
                taVar.r();
                break;
            case 15:
                ja jaVar = taVar.d1;
                if (jaVar != null) {
                    jaVar.m();
                    break;
                }
                break;
            case 16:
                if (taVar.h0 == -1 && taVar.g0 == 1) {
                    ja jaVar2 = taVar.d1;
                    if (!jaVar2.p0 && !jaVar2.O1) {
                        db dbVar = taVar.a1;
                        if (!dbVar.Q) {
                            m9 m9Var2 = taVar.e1;
                            if (m9Var2.N) {
                                m9Var2.c(false, true);
                                break;
                            } else {
                                taVar.k0(0, false, true);
                                v9 v9Var2 = taVar.w1;
                                if (v9Var2 != null) {
                                    v9Var2.O0(2);
                                    v9Var2.V1 = true;
                                    v9Var2.l0(true);
                                    taVar.w1.w0 = true;
                                    break;
                                }
                            }
                        } else {
                            dbVar.Q = false;
                            if (dbVar.F && dbVar.h == null) {
                                dbVar.H = true;
                                xa xaVar = dbVar.a;
                                if (xaVar != null) {
                                    xaVar.h1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                taVar.O1 = true;
                taVar.c1.setShareEnabled(false);
                v0 v0Var = taVar.f1;
                v0Var.getClass();
                v0Var.c(gd.N0("VideoConvertFail"));
                break;
            case 18:
                taVar.B0.setCameraThumb(taVar.z());
                break;
            case 19:
                sa saVar2 = taVar.n;
                fi.b bVar = taVar.a;
                new lc(saVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.R2(gd.M0(2131744346, null), org.telegram.ui.ActionBar.n6.Xc, 0, new s8(taVar, 27), bVar)).k(true);
                break;
            case 20:
                q8 q8Var = taVar.r0;
                if (q8Var != null) {
                    q8Var.dismiss();
                }
                taVar.J(2, true);
                break;
            case 21:
                taVar.k0(-1, false, true);
                break;
            case 22:
                taVar.k0(-1, false, true);
                break;
            case 23:
                taVar.d = false;
                org.telegram.messenger.g0.O3(taVar.b);
                if (taVar.C0 != null) {
                    if (taVar.R1) {
                        CameraController.getInstance().stopVideoRecording(taVar.C0.getCameraSession(), false);
                    }
                    taVar.u(false);
                }
                ha haVar3 = taVar.Y0;
                if (haVar3 != null) {
                    haVar3.set(null);
                }
                taVar.y();
                taVar.x();
                File file = taVar.H1;
                if (file != null && !taVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                taVar.H1 = null;
                org.telegram.messenger.g0.h3(new s8(taVar, 28), 16L);
                oa oaVar = taVar.G;
                if (oaVar != null) {
                    oaVar.f(false);
                }
                if (taVar.y2 != null) {
                    taVar.y2 = null;
                }
                taVar.m2 = null;
                ta taVar2 = ta.G2;
                if (taVar2 != null) {
                    taVar2.p(false);
                }
                ta.G2 = null;
                sa saVar3 = taVar.n;
                if (saVar3 != null) {
                    saVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                bi.a3 a3Var = taVar.m0;
                if (a3Var != null) {
                    a3Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                ga gaVar3 = taVar.B0;
                if (gaVar3 != null) {
                    gaVar3.c();
                    break;
                }
                break;
            case 24:
                if (!taVar.L1.b0 && taVar.r0 != null && (haVar = taVar.Y0) != null) {
                    haVar.h(new t8(taVar, i13), haVar, taVar.x1, taVar.A1);
                }
                taVar.J(1, true);
                break;
            case 25:
                taVar.i0(false);
                taVar.f2 = null;
                break;
            case 26:
                taVar.i0(false);
                taVar.f2 = null;
                break;
            case 27:
                taVar.S();
                break;
            default:
                WindowManager windowManager = taVar.f;
                if (windowManager != null && (saVar = taVar.n) != null && saVar.getParent() != null) {
                    windowManager.removeView(taVar.n);
                    break;
                }
                break;
        }
    }
}
