// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class oq7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0239 A[LOOP:1: B:136:0x0233->B:138:0x0239, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        akb O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i2;
        zjb i3;
        t08 t08Var;
        boolean z;
        Drawable drawable;
        int i4;
        ar1 ar1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qq7 qq7Var = (qq7) obj;
                qq7Var.a.g3.O(true);
                qq7Var.Z(true);
                break;
            case 1:
                ((sr7) obj).c();
                break;
            case 2:
                u39 u39Var = ((fu7) obj).b.a;
                if (u39Var != null) {
                    u39Var.i0();
                    break;
                }
                break;
            case 3:
                gu7 gu7Var = ((fu7) obj).b;
                if (gu7Var.d == null) {
                    gu7Var.L = null;
                    break;
                } else {
                    int currentColor = gu7Var.f.getCurrentColor();
                    gu7Var.l(gu7Var.b, false, false);
                    qx d = gu7Var.d(gu7Var.b, currentColor, new RectF(gu7Var.h));
                    gu7Var.b();
                    d9a d9aVar = gu7Var.d;
                    RectF rectF = new RectF();
                    gu7Var.h = rectF;
                    d9aVar.a(rectF);
                    gu7Var.p(gu7Var.e(d9aVar, currentColor, new RectF(gu7Var.h)), false);
                    gu7Var.p(d, false);
                    gu7Var.e(d9aVar, currentColor, null);
                    gu7Var.d = null;
                    gu7Var.J = 0.0f;
                    gu7Var.L = null;
                    break;
                }
            case 4:
                ((PasscodeActivity) ((yc6) obj).n).u0();
                break;
            case 5:
                try {
                    ((rv7) obj).d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((PasskeysActivity) obj).Z();
                break;
            case 7:
                ((gx7) obj).a.finishFragment();
                break;
            case 8:
                ij.u0(((lx7) obj).e.getParentActivity(), k96.M0(2131743581, null), true);
                break;
            case 9:
                double currentTimeMillis = System.currentTimeMillis();
                rx7 rx7Var = (rx7) ((aw3) obj).b;
                double d2 = currentTimeMillis - rx7Var.H;
                rx7Var.H = currentTimeMillis;
                int i5 = (int) (rx7Var.F - d2);
                rx7Var.F = i5;
                if (i5 <= 1000) {
                    rx7Var.r.setVisibility(0);
                    rx7Var.n.setVisibility(8);
                    rx7Var.q();
                    break;
                }
                break;
            case 10:
                qx7 qx7Var = (qx7) obj;
                rx7 rx7Var2 = qx7Var.a;
                int i6 = rx7Var2.E;
                sx7 sx7Var = rx7Var2.s;
                wb wbVar = rx7Var2.n;
                if (i6 >= 1000) {
                    int i7 = i6 / 1000;
                    int i8 = i7 / 60;
                    int i9 = i7 - (i8 * 60);
                    int i10 = rx7Var2.N;
                    if (i10 == 4 || i10 == 3) {
                        wbVar.setText(k96.a0("CallText", null, 2131752589, Integer.valueOf(i8), Integer.valueOf(i9)));
                    } else if (i10 == 2) {
                        wbVar.setText(k96.a0("SmsText", null, 2131745103, Integer.valueOf(i8), Integer.valueOf(i9)));
                    }
                    if (sx7Var != null) {
                        sx7Var.c = 1.0f - (rx7Var2.E / rx7Var2.Q);
                        sx7Var.invalidate();
                        break;
                    }
                } else {
                    if (sx7Var != null) {
                        sx7Var.c = 1.0f;
                        sx7Var.invalidate();
                    }
                    rx7Var2.r();
                    int i11 = rx7Var2.M;
                    if (i11 == 3) {
                        gl.x3(false);
                        kk7.e().n(rx7Var2, kk7.j4);
                        rx7Var2.J = false;
                        rx7Var2.q();
                        rx7Var2.s();
                        break;
                    } else if (i11 == 2 || i11 == 4) {
                        int i12 = rx7Var2.N;
                        if (i12 == 4) {
                            wbVar.setText(k96.M0(2131752585, null));
                        } else if (i12 == 2) {
                            wbVar.setText(k96.M0(2131745385, null));
                        } else if (i12 == 3) {
                            gl.y3(false);
                            kk7.e().n(rx7Var2, kk7.i4);
                            rx7Var2.J = false;
                            rx7Var2.q();
                            rx7Var2.s();
                            break;
                        }
                        rx7Var2.o();
                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                        tL_auth_resendCode.phone_number = rx7Var2.a;
                        tL_auth_resendCode.phone_code_hash = rx7Var2.b;
                        i = ((d) rx7Var2.R).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new n35(qx7Var, (byte) 16), 2);
                        break;
                    }
                }
                break;
            case 11:
                d01.t(((gz7) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                p pVar = (p) ((z24) obj).b;
                pVar.h0();
                pVar.M0(true, false);
                pVar.I0(false);
                break;
            case 13:
                d01.t(((gz7) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 14:
                a18 a18Var = (a18) obj;
                a18Var.T = !a18Var.T;
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (bkb.O0(string) == null || bkb.O0(string).o()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                akb akbVar = bkb.I;
                if (string.equals(string2)) {
                    if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        O0 = !a18Var.T ? bkb.O0(str2) : bkb.O0(str);
                        a18Var.w.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? bkb.R0(null, str3, strArr) : bkb.R0(new File(O0.b), null, strArr);
                        iArr = bkb.gm;
                        if (iArr != null) {
                            for (int i13 = 0; i13 < iArr.length; i13++) {
                                a18Var.w.put(i13, iArr[i13]);
                            }
                        }
                        for (i2 = 0; i2 < R0.size(); i2++) {
                            a18Var.w.put(R0.keyAt(i2), R0.valueAt(i2));
                        }
                        i3 = O0.i(false);
                        if (i3 != null) {
                            i3.d(R0, a18Var.w);
                        }
                        t08Var = a18Var.h;
                        if (t08Var != null && t08Var.w != null) {
                            gl2 I = bkb.I(O0, a18Var.w, strArr[0], 0, true);
                            o08 o08Var = a18Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            o08Var.setOverrideBackground(drawable);
                        }
                        z = a18Var.T;
                        if (a18Var.b0 != z) {
                            a18Var.b0 = z;
                            oy8 oy8Var = a18Var.U;
                            oy8Var.K(z ? oy8Var.e[0] : 0);
                            oy8 oy8Var2 = a18Var.U;
                            if (oy8Var2 != null) {
                                oy8Var2.start();
                            }
                        }
                        a18Var.I0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!a18Var.T) {
                }
                a18Var.w.clear();
                strArr = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = bkb.gm;
                if (iArr != null) {
                }
                while (i2 < R0.size()) {
                }
                i3 = O0.i(false);
                if (i3 != null) {
                }
                t08Var = a18Var.h;
                if (t08Var != null) {
                    gl2 I2 = bkb.I(O0, a18Var.w, strArr[0], 0, true);
                    o08 o08Var2 = a18Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    o08Var2.setOverrideBackground(drawable);
                }
                z = a18Var.T;
                if (a18Var.b0 != z) {
                }
                a18Var.I0();
                break;
            case 15:
                r08 r08Var = (r08) obj;
                t08 t08Var2 = r08Var.c;
                z08 z08Var = t08Var2.F;
                a18 a18Var2 = t08Var2.q0;
                if (z08Var != null && t08Var2.M.size() > 1) {
                    z08Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) t08Var2.N.get(1);
                    t08Var2.L = starGift;
                    q99 q99Var = t08Var2.K;
                    if (starGift == null) {
                        if (q99Var != null) {
                            q99Var.i();
                            t08Var2.K = null;
                        }
                    } else if (q99Var == null || q99Var.b != starGift.id) {
                        i4 = ((d) a18Var2).currentAccount;
                        q99 q99Var2 = new q99(i4, t08Var2.L.id, new zf7(r08Var, (byte) 11));
                        q99Var2.w = true;
                        t08Var2.K = q99Var2;
                        q99Var2.l(false);
                    }
                    t08Var2.e();
                    (a18Var2.J.getCurrentPosition() == 1 ? a18Var2.n : a18Var2.h).d();
                    break;
                }
                break;
            case 16:
                ((a28) obj).a.K0();
                break;
            case 17:
                y28 y28Var = ((d28) obj).y;
                t28 t28Var = y28Var.G1;
                if (t28Var != null) {
                    if (!y28Var.J1 && !y28Var.K1 && !y28Var.L1) {
                        m8b m8bVar = ((d8b) t28Var).d;
                        if (!m8bVar.o0.getCurrentPeerView().Z0(true) && !m8bVar.o0.E(true)) {
                            m8bVar.o(true);
                            break;
                        }
                    } else if (y28Var.E1.e) {
                        ((l8b) y28Var.C2.c).loopBack();
                        break;
                    } else {
                        y28Var.M0 = 0L;
                        break;
                    }
                }
                break;
            case 18:
                ((g38) obj).n1.start();
                break;
            case 19:
                ((o48) obj).a.invalidate();
                break;
            case 20:
                td4 td4Var = ((i58) obj).c.m0;
                if (td4Var != null) {
                    td4Var.b(false, true, false);
                    break;
                }
                break;
            case 21:
                k58 k58Var = (k58) obj;
                k58Var.r = false;
                k58Var.invalidate();
                break;
            case 22:
                u58 u58Var = (u58) ((cm0) obj).c;
                u58Var.f0(u58Var.Q.getSearchField());
                break;
            case 23:
                ((p58) obj).p0.M.f();
                break;
            case 24:
                ((k98) obj).invalidate();
                break;
            case 25:
                ny0 ny0Var = (ny0) obj;
                PhotoViewer photoViewer = (PhotoViewer) ny0Var.d;
                long j = ny0Var.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.C1(j);
                if (photoViewer.d2 == 1) {
                    long j2 = ny0Var.a;
                    photoViewer.c8 = j2;
                    if (photoViewer.b8 != j2) {
                        photoViewer.b8 = -1L;
                    }
                }
                ny0Var.c = null;
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) ((xe3) obj).b;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        gl.w2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 27:
                mu1 mu1Var = ((b88) obj).W2.k4;
                if (mu1Var != null && (ar1Var = mu1Var.a0) != null) {
                    ar1Var.h1();
                    break;
                }
                break;
            case 28:
                PhotoViewer photoViewer3 = (PhotoViewer) ((u5) ((l48) obj).b).c;
                photoViewer3.H2 = false;
                lbc lbcVar = photoViewer3.G2;
                if (lbcVar != null) {
                    lbcVar.g0();
                }
                photoViewer3.I2 = null;
                break;
            default:
                PhotoViewer photoViewer4 = ((c78) obj).a;
                photoViewer4.H2 = false;
                lbc lbcVar2 = photoViewer4.G2;
                if (lbcVar2 != null) {
                    lbcVar2.g0();
                }
                photoViewer4.I2 = null;
                break;
        }
    }
}
