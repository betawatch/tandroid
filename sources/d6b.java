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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ d6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
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
        i7b i7bVar;
        s7b s7bVar;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 3;
        byte b4 = 2;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.p();
                break;
            case 1:
                if (t7bVar.u2 >= 0) {
                    na7.c1().edit().putFloat("frontflash_warmth", t7bVar.s.o).putFloat("frontflash_intensity", t7bVar.s.p).apply();
                }
                t7bVar.s.e(0.0f, 240L, null);
                t7bVar.F0.setSelected(false);
                break;
            case 2:
                t7bVar.j();
                t7bVar.X1 = false;
                int i2 = t7bVar.c;
                if (t7bVar.L1 == null) {
                    t7bVar.o(true);
                    break;
                } else {
                    t7bVar.w();
                    e6b e6bVar = new e6b(t7bVar, b3);
                    if (t7bVar.I1 == null) {
                        f4b f4bVar = t7bVar.L1;
                        if (f4bVar.K && !f4bVar.v() && !f4bVar.g) {
                            long j = f4bVar.h0;
                            if (j > 0 && !f4bVar.n) {
                                long j2 = (long) ((f4bVar.a0 - f4bVar.Z) * j);
                                if (j2 < 68999) {
                                    arrayList = null;
                                    i = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    f4bVar.a0 = (59000.0f / f4bVar.h0) + f4bVar.Z;
                                    arrayList.add(f4bVar);
                                    long j3 = 59000;
                                    long j4 = 59000;
                                    while (true) {
                                        i = r8;
                                        if (j4 < j2) {
                                            if (Math.min(j3, j2 - j4) >= 1000) {
                                                long j5 = j3;
                                                f4b g = f4bVar.g();
                                                float f = f4bVar.Z;
                                                float f2 = j4;
                                                long j6 = j4;
                                                float f3 = f4bVar.h0;
                                                g.Z = (f2 / f3) + f;
                                                g.a0 = ((j6 + r7) / f3) + f4bVar.Z;
                                                g.C0 = "";
                                                j4 = j6 + j5;
                                                arrayList.add(g);
                                                r8 = i;
                                                j3 = j5;
                                            }
                                        }
                                    }
                                }
                                t7bVar.I1 = arrayList;
                                if (arrayList != null) {
                                    t7bVar.J1 = new ArrayList();
                                    t7bVar.K1 = new ArrayList();
                                    for (int i3 = i; i3 < t7bVar.I1.size(); i3 = tb4.g(i3, i3, 1, t7bVar.K1)) {
                                        t7bVar.J1.add(Integer.valueOf(i3));
                                    }
                                }
                            }
                        }
                        i = 0;
                        arrayList = null;
                        t7bVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i = 0;
                    }
                    if (t7bVar.I1 != null) {
                        ArrayList arrayList2 = t7bVar.K1;
                        int size = arrayList2.size();
                        int i4 = i;
                        while (i4 < size) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            Integer num = (Integer) obj;
                            if (t7bVar.J1.contains(num)) {
                                f4b f4bVar2 = (f4b) t7bVar.I1.get(num.intValue());
                                f4b f4bVar3 = t7bVar.L1;
                                if (f4bVar3 == f4bVar2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i] = t7bVar.d1.getText();
                                    ArrayList Y = na7.q1(i2).d5() ? hq6.d0(i2).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i] = t7bVar.L1.C0;
                                    ArrayList Y2 = na7.q1(i2).d5() ? hq6.d0(i2).Y(charSequenceArr2, true, true) : new ArrayList();
                                    f4b f4bVar4 = t7bVar.L1;
                                    f4bVar4.k = (TextUtils.equals(f4bVar4.C0, charSequenceArr[i]) && hq6.M(Y, Y2)) ? i : 1;
                                    t7bVar.L1.C0 = new SpannableString(t7bVar.d1.getText());
                                } else if (f4bVar2.C0 == null) {
                                    f4bVar3.k = i;
                                    f4bVar3.C0 = new SpannableString("");
                                }
                                e6bVar.a(f4bVar2);
                                i = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {t7bVar.d1.getText()};
                        ArrayList Y3 = na7.q1(i2).d5() ? hq6.d0(i2).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = na7.q1(i2).d5() ? hq6.d0(i2).Y(new CharSequence[]{t7bVar.L1.C0}, true, true) : new ArrayList();
                        f4b f4bVar5 = t7bVar.L1;
                        f4bVar5.k = (TextUtils.equals(f4bVar5.C0, charSequenceArr3[0]) && hq6.M(Y3, Y4)) ? false : true;
                        t7bVar.L1.C0 = new SpannableString(t7bVar.d1.getText());
                        e6bVar.a(t7bVar.L1);
                    }
                    long j7 = y6c.h(i2).n;
                    TLRPC.InputPeer inputPeer = t7bVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j7 = cf3.m(inputPeer);
                    }
                    t7bVar.L1 = null;
                    t7bVar.w = true;
                    t7bVar.x = j7;
                    t7bVar.C2 = true;
                    t7bVar.l();
                    sma smaVar = new sma(t7bVar, j7, b2);
                    k7b k7bVar = t7bVar.y;
                    if (k7bVar != null) {
                        k7bVar.c(j7, smaVar);
                    } else {
                        smaVar.run();
                    }
                    na7.c1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                t7bVar.Z(false);
                break;
            case 4:
                f4b f4bVar6 = t7bVar.L1;
                if (f4bVar6 != null) {
                    f4bVar6.y0 = !f4bVar6.y0;
                    i7b i7bVar2 = t7bVar.Y0;
                    if (i7bVar2 != null) {
                        i7bVar2.u(f4bVar6);
                    }
                    x6b x6bVar = t7bVar.w1;
                    if (x6bVar != null && x6bVar.H0 != null) {
                        while (r8 < t7bVar.w1.H0.getChildCount()) {
                            View childAt = t7bVar.w1.H0.getChildAt(r8);
                            if (childAt instanceof u17) {
                                ((u17) childAt).setupTheme(t7bVar.L1);
                            }
                            r8++;
                        }
                    }
                    t7bVar.n0(true);
                    break;
                }
                break;
            case 5:
                t7bVar.o(true);
                break;
            case 6:
            case 27:
                t7bVar.N();
                break;
            case 7:
                t7bVar.d(1.0f, true, new d6b(t7bVar, b2));
                break;
            case 8:
                t7bVar.B0.setCameraThumb(t7bVar.y());
                y6b y6bVar = t7bVar.C0;
                if (y6bVar != null) {
                    y6bVar.destroy(true, null);
                    gl.B2(t7bVar.C0);
                    h7b h7bVar = t7bVar.B0;
                    if (h7bVar != null) {
                        h7bVar.setCameraView(null);
                    }
                    t7bVar.C0 = null;
                    break;
                }
                break;
            case 9:
                t7bVar.B0.setCameraThumb(t7bVar.y());
                break;
            case 10:
                if (t7bVar.g0 == 1) {
                    t7bVar.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                p6b p6bVar = t7bVar.e1;
                if (p6bVar != null) {
                    int i5 = -(gl.L(24.0f) + t7bVar.d1.getEditTextHeight());
                    p6bVar.setTranslationY(i5 - (t7bVar.a1 != null ? r0.getContentHeight() - gl.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                h7b h7bVar2 = t7bVar.B0;
                if (h7bVar2 != null) {
                    h7bVar2.c.c(t7bVar.E0.E ? (bv8) t7bVar.D0.d : null);
                    break;
                }
                break;
            case 13:
                t7bVar.l0(true);
                break;
            case 14:
                t7bVar.q();
                break;
            case 15:
                j7b j7bVar = t7bVar.d1;
                if (j7bVar != null) {
                    j7bVar.m();
                    break;
                }
                break;
            case 16:
                if (t7bVar.h0 == -1 && t7bVar.g0 == 1) {
                    j7b j7bVar2 = t7bVar.d1;
                    if (!j7bVar2.p0 && !j7bVar2.O1) {
                        kob kobVar = t7bVar.a1;
                        if (!kobVar.Q) {
                            p6b p6bVar2 = t7bVar.e1;
                            if (p6bVar2.N) {
                                p6bVar2.c(false, true);
                                break;
                            } else {
                                t7bVar.k0(0, false, true);
                                x6b x6bVar2 = t7bVar.w1;
                                if (x6bVar2 != null) {
                                    x6bVar2.R0(2);
                                    x6bVar2.f2 = true;
                                    x6bVar2.l0(true);
                                    t7bVar.w1.C0 = true;
                                    break;
                                }
                            }
                        } else {
                            kobVar.Q = false;
                            if (kobVar.F && kobVar.h == null) {
                                kobVar.H = true;
                                eob eobVar = kobVar.a;
                                if (eobVar != null) {
                                    eobVar.Q0(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                t7bVar.O1 = true;
                t7bVar.c1.setShareEnabled(false);
                op3 op3Var = t7bVar.f1;
                op3Var.getClass();
                op3Var.c(k96.N0("VideoConvertFail"));
                break;
            case 18:
                t7bVar.B0.setCameraThumb(t7bVar.y());
                break;
            case 19:
                s7b s7bVar2 = t7bVar.n;
                f53 f53Var = t7bVar.a;
                new u21(s7bVar2, f53Var).Q(R.raw.voip_invite, 36, gl.N2(k96.M0(2131744341, null), bkb.Wc, 0, new d6b(t7bVar, (byte) 28), f53Var)).k(true);
                break;
            case 20:
                y5b y5bVar = t7bVar.r0;
                if (y5bVar != null) {
                    y5bVar.dismiss();
                }
                t7bVar.I(2, true);
                break;
            case 21:
                t7bVar.k0(-1, false, true);
                break;
            case 22:
                t7bVar.k0(-1, false, true);
                break;
            case 23:
                t7bVar.d = false;
                gl.K3(t7bVar.b);
                if (t7bVar.C0 != null) {
                    if (t7bVar.R1) {
                        CameraController.getInstance().stopVideoRecording(t7bVar.C0.getCameraSession(), false);
                    }
                    t7bVar.t(false);
                }
                i7b i7bVar3 = t7bVar.Y0;
                if (i7bVar3 != null) {
                    i7bVar3.set(null);
                }
                t7bVar.x();
                t7bVar.w();
                File file = t7bVar.H1;
                if (file != null && !t7bVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                t7bVar.H1 = null;
                gl.d3(new d6b(t7bVar, (byte) 29), 16L);
                o7b o7bVar = t7bVar.G;
                if (o7bVar != null) {
                    o7bVar.f(false);
                }
                if (t7bVar.y2 != null) {
                    t7bVar.y2 = null;
                }
                t7bVar.m2 = null;
                t7b t7bVar2 = t7b.G2;
                if (t7bVar2 != null) {
                    t7bVar2.o(false);
                }
                t7b.G2 = null;
                s7b s7bVar3 = t7bVar.n;
                if (s7bVar3 != null) {
                    s7bVar3.setTag(R.id.bulletin_delegate_tag, null);
                }
                oc6 oc6Var = t7bVar.m0;
                if (oc6Var != null) {
                    oc6Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                h7b h7bVar3 = t7bVar.B0;
                if (h7bVar3 != null) {
                    h7bVar3.b();
                    break;
                }
                break;
            case 24:
                if (!t7bVar.L1.b0 && t7bVar.r0 != null && (i7bVar = t7bVar.Y0) != null) {
                    i7bVar.g(new e6b(t7bVar, b4), i7bVar, t7bVar.x1, t7bVar.A1);
                }
                t7bVar.I(1, true);
                break;
            case 25:
                t7bVar.i0(false);
                t7bVar.f2 = null;
                break;
            case 26:
                t7bVar.i0(false);
                t7bVar.f2 = null;
                break;
            case 28:
                t7bVar.S();
                break;
            default:
                WindowManager windowManager = t7bVar.f;
                if (windowManager != null && (s7bVar = t7bVar.n) != null && s7bVar.getParent() != null) {
                    windowManager.removeView(t7bVar.n);
                    break;
                }
                break;
        }
    }
}
