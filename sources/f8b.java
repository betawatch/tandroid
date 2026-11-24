// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ f8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ef  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        ArrayList arrayList;
        k9b k9bVar;
        u9b u9bVar;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 3;
        byte b4 = 2;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.p();
                break;
            case 1:
                if (v9bVar.u2 >= 0) {
                    oc7.d1().edit().putFloat("frontflash_warmth", v9bVar.s.o).putFloat("frontflash_intensity", v9bVar.s.p).apply();
                }
                v9bVar.s.e(0.0f, 240L, null);
                v9bVar.F0.setSelected(false);
                break;
            case 2:
                v9bVar.j();
                v9bVar.X1 = false;
                int i2 = v9bVar.c;
                if (v9bVar.L1 == null) {
                    v9bVar.o(true);
                    break;
                } else {
                    v9bVar.w();
                    g8b g8bVar = new g8b(v9bVar, b3);
                    if (v9bVar.I1 == null) {
                        g6b g6bVar = v9bVar.L1;
                        if (g6bVar.K && !g6bVar.v() && !g6bVar.g) {
                            long j = g6bVar.h0;
                            if (j > 0 && !g6bVar.n) {
                                long j2 = (long) ((g6bVar.a0 - g6bVar.Z) * j);
                                if (j2 < 68999) {
                                    arrayList = null;
                                    i = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    g6bVar.a0 = (59000.0f / g6bVar.h0) + g6bVar.Z;
                                    arrayList.add(g6bVar);
                                    long j3 = 59000;
                                    long j4 = 59000;
                                    while (true) {
                                        i = r8;
                                        if (j4 < j2) {
                                            if (Math.min(j3, j2 - j4) >= 1000) {
                                                long j5 = j3;
                                                g6b g = g6bVar.g();
                                                float f = g6bVar.Z;
                                                float f2 = j4;
                                                long j6 = j4;
                                                float f3 = g6bVar.h0;
                                                g.Z = (f2 / f3) + f;
                                                g.a0 = ((j6 + r7) / f3) + g6bVar.Z;
                                                g.C0 = "";
                                                j4 = j6 + j5;
                                                arrayList.add(g);
                                                r8 = i;
                                                j3 = j5;
                                            }
                                        }
                                    }
                                }
                                v9bVar.I1 = arrayList;
                                if (arrayList != null) {
                                    v9bVar.J1 = new ArrayList();
                                    v9bVar.K1 = new ArrayList();
                                    for (int i3 = i; i3 < v9bVar.I1.size(); i3 = td4.g(i3, i3, 1, v9bVar.K1)) {
                                        v9bVar.J1.add(Integer.valueOf(i3));
                                    }
                                }
                            }
                        }
                        i = 0;
                        arrayList = null;
                        v9bVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i = 0;
                    }
                    if (v9bVar.I1 != null) {
                        ArrayList arrayList2 = v9bVar.K1;
                        int size = arrayList2.size();
                        int i4 = i;
                        while (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            Integer num = (Integer) obj;
                            if (v9bVar.J1.contains(num)) {
                                g6b g6bVar2 = (g6b) v9bVar.I1.get(num.intValue());
                                g6b g6bVar3 = v9bVar.L1;
                                if (g6bVar3 == g6bVar2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i] = v9bVar.d1.getText();
                                    ArrayList Y = oc7.r1(i2).f5() ? hs6.d0(i2).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i] = v9bVar.L1.C0;
                                    ArrayList Y2 = oc7.r1(i2).f5() ? hs6.d0(i2).Y(charSequenceArr2, true, true) : new ArrayList();
                                    g6b g6bVar4 = v9bVar.L1;
                                    g6bVar4.k = (TextUtils.equals(g6bVar4.C0, charSequenceArr[i]) && hs6.M(Y, Y2)) ? i : 1;
                                    v9bVar.L1.C0 = new SpannableString(v9bVar.d1.getText());
                                } else if (g6bVar2.C0 == null) {
                                    g6bVar3.k = i;
                                    g6bVar3.C0 = new SpannableString("");
                                }
                                g8bVar.a(g6bVar2);
                                i = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {v9bVar.d1.getText()};
                        ArrayList Y3 = oc7.r1(i2).f5() ? hs6.d0(i2).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = oc7.r1(i2).f5() ? hs6.d0(i2).Y(new CharSequence[]{v9bVar.L1.C0}, true, true) : new ArrayList();
                        g6b g6bVar5 = v9bVar.L1;
                        g6bVar5.k = (TextUtils.equals(g6bVar5.C0, charSequenceArr3[0]) && hs6.M(Y3, Y4)) ? false : true;
                        v9bVar.L1.C0 = new SpannableString(v9bVar.d1.getText());
                        g8bVar.a(v9bVar.L1);
                    }
                    long j7 = z8c.h(i2).n;
                    TLRPC.InputPeer inputPeer = v9bVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j7 = pg3.m(inputPeer);
                    }
                    v9bVar.L1 = null;
                    v9bVar.w = true;
                    v9bVar.x = j7;
                    v9bVar.C2 = true;
                    v9bVar.l();
                    toa toaVar = new toa(v9bVar, j7, b2);
                    m9b m9bVar = v9bVar.y;
                    if (m9bVar != null) {
                        m9bVar.c(j7, toaVar);
                    } else {
                        toaVar.run();
                    }
                    oc7.d1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                v9bVar.Z(false);
                break;
            case 4:
                g6b g6bVar6 = v9bVar.L1;
                if (g6bVar6 != null) {
                    g6bVar6.y0 = !g6bVar6.y0;
                    k9b k9bVar2 = v9bVar.Y0;
                    if (k9bVar2 != null) {
                        k9bVar2.u(g6bVar6);
                    }
                    z8b z8bVar = v9bVar.w1;
                    if (z8bVar != null && z8bVar.H0 != null) {
                        while (r8 < v9bVar.w1.H0.getChildCount()) {
                            View childAt = v9bVar.w1.H0.getChildAt(r8);
                            if (childAt instanceof u37) {
                                ((u37) childAt).setupTheme(v9bVar.L1);
                            }
                            r8++;
                        }
                    }
                    v9bVar.n0(true);
                    break;
                }
                break;
            case 5:
                v9bVar.o(true);
                break;
            case 6:
            case 27:
                v9bVar.N();
                break;
            case 7:
                v9bVar.d(1.0f, true, new f8b(v9bVar, b2));
                break;
            case 8:
                v9bVar.B0.setCameraThumb(v9bVar.y());
                a9b a9bVar = v9bVar.C0;
                if (a9bVar != null) {
                    a9bVar.destroy(true, null);
                    gm.B2(v9bVar.C0);
                    j9b j9bVar = v9bVar.B0;
                    if (j9bVar != null) {
                        j9bVar.setCameraView(null);
                    }
                    v9bVar.C0 = null;
                    break;
                }
                break;
            case 9:
                v9bVar.B0.setCameraThumb(v9bVar.y());
                break;
            case 10:
                if (v9bVar.g0 == 1) {
                    v9bVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                r8b r8bVar = v9bVar.e1;
                if (r8bVar != null) {
                    int i5 = -(gm.L(24.0f) + v9bVar.d1.getEditTextHeight());
                    r8bVar.setTranslationY(i5 - (v9bVar.a1 != null ? r0.getContentHeight() - gm.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                j9b j9bVar2 = v9bVar.B0;
                if (j9bVar2 != null) {
                    j9bVar2.c.c(v9bVar.E0.E ? (cx8) v9bVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                v9bVar.l0(true);
                break;
            case 14:
                v9bVar.q();
                break;
            case 15:
                l9b l9bVar = v9bVar.d1;
                if (l9bVar != null) {
                    l9bVar.m();
                    break;
                }
                break;
            case 16:
                if (v9bVar.h0 == -1 && v9bVar.g0 == 1) {
                    l9b l9bVar2 = v9bVar.d1;
                    if (!l9bVar2.p0 && !l9bVar2.O1) {
                        lqb lqbVar = v9bVar.a1;
                        if (!lqbVar.Q) {
                            r8b r8bVar2 = v9bVar.e1;
                            if (r8bVar2.N) {
                                r8bVar2.c(false, true);
                                break;
                            } else {
                                v9bVar.k0(0, false, true);
                                z8b z8bVar2 = v9bVar.w1;
                                if (z8bVar2 != null) {
                                    z8bVar2.R0(2);
                                    z8bVar2.f2 = true;
                                    z8bVar2.l0(true);
                                    v9bVar.w1.C0 = true;
                                    break;
                                }
                            }
                        } else {
                            lqbVar.Q = false;
                            if (lqbVar.F && lqbVar.h == null) {
                                lqbVar.H = true;
                                fqb fqbVar = lqbVar.a;
                                if (fqbVar != null) {
                                    fqbVar.h1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                v9bVar.O1 = true;
                v9bVar.c1.setShareEnabled(false);
                yq3 yq3Var = v9bVar.f1;
                yq3Var.getClass();
                yq3Var.c(jb6.N0("VideoConvertFail"));
                break;
            case 18:
                v9bVar.B0.setCameraThumb(v9bVar.y());
                break;
            case 19:
                u9b u9bVar2 = v9bVar.n;
                r63 r63Var = v9bVar.a;
                new c41(u9bVar2, r63Var).Q(R.raw.voip_invite, 36, gm.N2(jb6.M0(2131744267, null), cmb.Wc, 0, new f8b(v9bVar, (byte) 28), r63Var)).k(true);
                break;
            case 20:
                a8b a8bVar = v9bVar.r0;
                if (a8bVar != null) {
                    a8bVar.dismiss();
                }
                v9bVar.I(2, true);
                break;
            case 21:
                v9bVar.k0(-1, false, true);
                break;
            case 22:
                v9bVar.k0(-1, false, true);
                break;
            case 23:
                v9bVar.d = false;
                gm.K3(v9bVar.b);
                if (v9bVar.C0 != null) {
                    if (v9bVar.R1) {
                        CameraController.getInstance().stopVideoRecording(v9bVar.C0.getCameraSession(), false);
                    }
                    v9bVar.t(false);
                }
                k9b k9bVar3 = v9bVar.Y0;
                if (k9bVar3 != null) {
                    k9bVar3.set(null);
                }
                v9bVar.x();
                v9bVar.w();
                File file = v9bVar.H1;
                if (file != null && !v9bVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                v9bVar.H1 = null;
                gm.d3(new f8b(v9bVar, (byte) 29), 16L);
                q9b q9bVar = v9bVar.G;
                if (q9bVar != null) {
                    q9bVar.f(false);
                }
                if (v9bVar.y2 != null) {
                    v9bVar.y2 = null;
                }
                v9bVar.m2 = null;
                v9b v9bVar2 = v9b.G2;
                if (v9bVar2 != null) {
                    v9bVar2.o(false);
                }
                v9b.G2 = null;
                u9b u9bVar3 = v9bVar.n;
                if (u9bVar3 != null) {
                    u9bVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                ne6 ne6Var = v9bVar.m0;
                if (ne6Var != null) {
                    ne6Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                j9b j9bVar3 = v9bVar.B0;
                if (j9bVar3 != null) {
                    j9bVar3.b();
                    break;
                }
                break;
            case 24:
                if (!v9bVar.L1.b0 && v9bVar.r0 != null && (k9bVar = v9bVar.Y0) != null) {
                    k9bVar.g(new g8b(v9bVar, b4), k9bVar, v9bVar.x1, v9bVar.A1);
                }
                v9bVar.I(1, true);
                break;
            case 25:
                v9bVar.i0(false);
                v9bVar.f2 = null;
                break;
            case 26:
                v9bVar.i0(false);
                v9bVar.f2 = null;
                break;
            case 28:
                v9bVar.S();
                break;
            default:
                WindowManager windowManager = v9bVar.f;
                if (windowManager != null && (u9bVar = v9bVar.n) != null && u9bVar.getParent() != null) {
                    windowManager.removeView(v9bVar.n);
                    break;
                }
                break;
        }
    }
}
