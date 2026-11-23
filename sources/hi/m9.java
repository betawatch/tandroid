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
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ m9(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
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
        bb bbVar;
        mb mbVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        nb nbVar = this.b;
        switch (i11) {
            case 0:
                nbVar.q();
                break;
            case 1:
                if (nbVar.u2 >= 0) {
                    mp.g1().edit().putFloat("frontflash_warmth", nbVar.s.o).putFloat("frontflash_intensity", nbVar.s.p).apply();
                }
                nbVar.s.e(0.0f, 240L, null);
                nbVar.F0.setSelected(false);
                break;
            case 2:
                nbVar.l();
                nbVar.X1 = false;
                int i14 = nbVar.c;
                if (nbVar.L1 == null) {
                    nbVar.p(true);
                    break;
                } else {
                    nbVar.x();
                    n9 n9Var = new n9(nbVar, i12);
                    if (nbVar.I1 == null) {
                        x7 x7Var = nbVar.L1;
                        if (x7Var.K && !x7Var.v() && !x7Var.g) {
                            long j3 = x7Var.h0;
                            if (j3 > 0 && !x7Var.n) {
                                long j10 = (long) ((x7Var.a0 - x7Var.Z) * j3);
                                if (j10 < 68999) {
                                    i7 = i14;
                                    arrayList = null;
                                    i10 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    x7Var.a0 = (59000.0f / x7Var.h0) + x7Var.Z;
                                    arrayList.add(x7Var);
                                    long j11 = 59000;
                                    long j12 = 59000;
                                    while (true) {
                                        i10 = r9;
                                        if (j12 < j10) {
                                            if (Math.min(j11, j10 - j12) >= 1000) {
                                                long j13 = j11;
                                                x7 g10 = x7Var.g();
                                                float f10 = x7Var.Z;
                                                float f11 = x7Var.h0;
                                                g10.Z = (j12 / f11) + f10;
                                                g10.a0 = ((r9 + j12) / f11) + x7Var.Z;
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
                                nbVar.I1 = arrayList;
                                if (arrayList != null) {
                                    nbVar.J1 = new ArrayList();
                                    nbVar.K1 = new ArrayList();
                                    for (int i15 = i10; i15 < nbVar.I1.size(); i15 = com.google.android.gms.internal.vision.e2.f(i15, i15, 1, nbVar.K1)) {
                                        nbVar.J1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i7 = i14;
                        i10 = 0;
                        arrayList = null;
                        nbVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i7 = i14;
                        i10 = 0;
                    }
                    if (nbVar.I1 != null) {
                        ArrayList arrayList2 = nbVar.K1;
                        int size = arrayList2.size();
                        int i16 = i10;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (nbVar.J1.contains(num)) {
                                x7 x7Var2 = (x7) nbVar.I1.get(num.intValue());
                                x7 x7Var3 = nbVar.L1;
                                if (x7Var3 == x7Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i10] = nbVar.d1.getText();
                                    ArrayList Y = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i10] = nbVar.L1.C0;
                                    ArrayList Y2 = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr2, true, true) : new ArrayList();
                                    x7 x7Var4 = nbVar.L1;
                                    x7Var4.k = (TextUtils.equals(x7Var4.C0, charSequenceArr[i10]) && ri.M(Y, Y2)) ? i10 : 1;
                                    nbVar.L1.C0 = new SpannableString(nbVar.d1.getText());
                                } else if (x7Var2.C0 == null) {
                                    x7Var3.k = i10;
                                    x7Var3.C0 = new SpannableString("");
                                }
                                n9Var.a(x7Var2);
                                i10 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {nbVar.d1.getText()};
                        ArrayList Y3 = mp.u1(i7).j5() ? ri.d0(i7).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = mp.u1(i7).j5() ? ri.d0(i7).Y(new CharSequence[]{nbVar.L1.C0}, true, true) : new ArrayList();
                        x7 x7Var5 = nbVar.L1;
                        x7Var5.k = (TextUtils.equals(x7Var5.C0, charSequenceArr3[0]) && ri.M(Y3, Y4)) ? false : true;
                        nbVar.L1.C0 = new SpannableString(nbVar.d1.getText());
                        n9Var.a(nbVar.L1);
                    }
                    long j14 = i10.i(i7).n;
                    TLRPC.InputPeer inputPeer = nbVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j14 = org.telegram.messenger.n5.n(inputPeer);
                    }
                    nbVar.L1 = null;
                    nbVar.w = true;
                    nbVar.x = j14;
                    nbVar.C2 = true;
                    nbVar.n();
                    bi.e4 e4Var = new bi.e4(nbVar, j14, 9);
                    eb ebVar = nbVar.y;
                    if (ebVar != null) {
                        ebVar.c(j14, e4Var);
                    } else {
                        e4Var.run();
                    }
                    mp.g1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                nbVar.Y(false);
                break;
            case 4:
                x7 x7Var6 = nbVar.L1;
                if (x7Var6 != null) {
                    x7Var6.y0 = !x7Var6.y0;
                    bb bbVar2 = nbVar.Y0;
                    if (bbVar2 != null) {
                        bbVar2.u(x7Var6);
                    }
                    pa paVar = nbVar.w1;
                    if (paVar != null && paVar.B0 != null) {
                        while (r9 < nbVar.w1.B0.getChildCount()) {
                            View childAt = nbVar.w1.B0.getChildAt(r9);
                            if (childAt instanceof tg.z0) {
                                ((tg.z0) childAt).setupTheme(nbVar.L1);
                            }
                            r9++;
                        }
                    }
                    nbVar.n0(true);
                    break;
                }
                break;
            case 5:
                nbVar.p(true);
                break;
            case 6:
                nbVar.d = true;
                nbVar.w = false;
                if (nbVar.K == 1) {
                    nbVar.i0.setAlpha(1.0f);
                    nbVar.i0.setTranslationX(0.0f);
                    nbVar.i0.setTranslationY(0.0f);
                    nbVar.j0.setAlpha(1.0f);
                    nbVar.l0.setAlpha(1.0f);
                    nbVar.n.setBackgroundColor(-16777216);
                    if (nbVar.g0 == 2) {
                        nbVar.v1.setAlpha(1.0f);
                    }
                }
                m9 m9Var = nbVar.y2;
                if (m9Var != null) {
                    m9Var.run();
                    nbVar.y2 = null;
                } else {
                    nbVar.O();
                }
                x7 x7Var7 = nbVar.L1;
                if (x7Var7 != null && x7Var7.n) {
                    nbVar.t();
                    nbVar.G();
                    nbVar.r();
                    break;
                } else if (x7Var7 != null && x7Var7.u) {
                    if (x7Var7.K) {
                        nbVar.Y0.t(x7Var7, null, 0L);
                    }
                    nbVar.r();
                    break;
                }
                break;
            case 7:
                nbVar.f(1.0f, true, new m9(nbVar, 6));
                break;
            case 8:
                nbVar.B0.setCameraThumb(nbVar.z());
                qa qaVar = nbVar.C0;
                if (qaVar != null) {
                    qaVar.destroy(true, null);
                    org.telegram.messenger.g0.E2(nbVar.C0);
                    ab abVar = nbVar.B0;
                    if (abVar != null) {
                        abVar.setCameraView(null);
                    }
                    nbVar.C0 = null;
                    break;
                }
                break;
            case 9:
                nbVar.B0.setCameraThumb(nbVar.z());
                break;
            case 10:
                if (nbVar.g0 == 1) {
                    nbVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                ga gaVar = nbVar.e1;
                if (gaVar != null) {
                    int i17 = -(org.telegram.messenger.g0.L(24.0f) + nbVar.d1.getEditTextHeight());
                    gaVar.setTranslationY(i17 - (nbVar.a1 != null ? r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                ab abVar2 = nbVar.B0;
                if (abVar2 != null) {
                    abVar2.c.a(nbVar.E0.E ? nbVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                nbVar.l0(true);
                break;
            case 14:
                nbVar.r();
                break;
            case 15:
                db dbVar = nbVar.d1;
                if (dbVar != null) {
                    dbVar.m();
                    break;
                }
                break;
            case 16:
                if (nbVar.h0 == -1 && nbVar.g0 == 1) {
                    db dbVar2 = nbVar.d1;
                    if (!dbVar2.p0 && !dbVar2.O1) {
                        xb xbVar = nbVar.a1;
                        if (!xbVar.Q) {
                            ga gaVar2 = nbVar.e1;
                            if (gaVar2.N) {
                                gaVar2.c(false, true);
                                break;
                            } else {
                                nbVar.k0(0, false, true);
                                pa paVar2 = nbVar.w1;
                                if (paVar2 != null) {
                                    paVar2.R0(2);
                                    paVar2.Z1 = true;
                                    paVar2.n0(true);
                                    nbVar.w1.w0 = true;
                                    break;
                                }
                            }
                        } else {
                            xbVar.Q = false;
                            if (xbVar.F && xbVar.h == null) {
                                xbVar.H = true;
                                rb rbVar = xbVar.a;
                                if (rbVar != null) {
                                    rbVar.X(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                nbVar.O1 = true;
                nbVar.c1.setShareEnabled(false);
                d1 d1Var = nbVar.f1;
                d1Var.getClass();
                d1Var.c(gd.O0("VideoConvertFail"));
                break;
            case 18:
                nbVar.B0.setCameraThumb(nbVar.z());
                break;
            case 19:
                mb mbVar2 = nbVar.n;
                fi.b bVar = nbVar.a;
                new org.telegram.ui.Components.kc(mbVar2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.R2(gd.N0(2131744337, null), org.telegram.ui.ActionBar.n6.Xc, 0, new m9(nbVar, 27), bVar)).k(true);
                break;
            case 20:
                k9 k9Var = nbVar.r0;
                if (k9Var != null) {
                    k9Var.dismiss();
                }
                nbVar.J(2, true);
                break;
            case 21:
                nbVar.k0(-1, false, true);
                break;
            case 22:
                nbVar.k0(-1, false, true);
                break;
            case 23:
                nbVar.d = false;
                org.telegram.messenger.g0.O3(nbVar.b);
                if (nbVar.C0 != null) {
                    if (nbVar.R1) {
                        CameraController.getInstance().stopVideoRecording(nbVar.C0.getCameraSession(), false);
                    }
                    nbVar.u(false);
                }
                bb bbVar3 = nbVar.Y0;
                if (bbVar3 != null) {
                    bbVar3.set(null);
                }
                nbVar.y();
                nbVar.x();
                File file = nbVar.H1;
                if (file != null && !nbVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                nbVar.H1 = null;
                org.telegram.messenger.g0.h3(new m9(nbVar, 28), 16L);
                ib ibVar = nbVar.G;
                if (ibVar != null) {
                    ibVar.f(false);
                }
                if (nbVar.y2 != null) {
                    nbVar.y2 = null;
                }
                nbVar.m2 = null;
                nb nbVar2 = nb.G2;
                if (nbVar2 != null) {
                    nbVar2.p(false);
                }
                nb.G2 = null;
                mb mbVar3 = nbVar.n;
                if (mbVar3 != null) {
                    mbVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                bi.g3 g3Var = nbVar.m0;
                if (g3Var != null) {
                    g3Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                ab abVar3 = nbVar.B0;
                if (abVar3 != null) {
                    abVar3.c();
                    break;
                }
                break;
            case 24:
                if (!nbVar.L1.b0 && nbVar.r0 != null && (bbVar = nbVar.Y0) != null) {
                    bbVar.h(new n9(nbVar, i13), bbVar, nbVar.x1, nbVar.A1);
                }
                nbVar.J(1, true);
                break;
            case 25:
                nbVar.i0(false);
                nbVar.f2 = null;
                break;
            case 26:
                nbVar.i0(false);
                nbVar.f2 = null;
                break;
            case 27:
                nbVar.S();
                break;
            default:
                WindowManager windowManager = nbVar.f;
                if (windowManager != null && (mbVar = nbVar.n) != null && mbVar.getParent() != null) {
                    windowManager.removeView(nbVar.n);
                    break;
                }
                break;
        }
    }
}
