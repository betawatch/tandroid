// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019d A[LOOP:1: B:93:0x0197->B:95:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        bmb O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i2;
        amb i3;
        w28 w28Var;
        boolean z;
        Drawable drawable;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gm.E3(((ml7) ((k44) obj).b).J1);
                break;
            case 1:
                try {
                    a.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) obj);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                ((NotificationsSettingsActivity) obj).A0();
                break;
            case 3:
                nm7.f(((ap7) obj).a).k(43, new Object[0]);
                break;
            case 4:
                ((OldVideoPlayerRewinder) obj).lambda$incrementRewindCount$0();
                break;
            case 5:
                ((is7) obj).run();
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((ms7) obj).n1;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            case 7:
                ss7 ss7Var = (ss7) obj;
                ss7Var.a.g3.O(true);
                ss7Var.a0(true);
                break;
            case 8:
                ((tt7) obj).c();
                break;
            case 9:
                x59 x59Var = ((gw7) obj).b.a;
                if (x59Var != null) {
                    x59Var.f0();
                    break;
                }
                break;
            case 10:
                hw7 hw7Var = ((gw7) obj).b;
                if (hw7Var.d == null) {
                    hw7Var.L = null;
                    break;
                } else {
                    int currentColor = hw7Var.f.getCurrentColor();
                    hw7Var.l(hw7Var.b, false, false);
                    ry d = hw7Var.d(hw7Var.b, currentColor, new RectF(hw7Var.h));
                    hw7Var.b();
                    dba dbaVar = hw7Var.d;
                    RectF rectF = new RectF();
                    hw7Var.h = rectF;
                    dbaVar.a(rectF);
                    hw7Var.p(hw7Var.e(dbaVar, currentColor, new RectF(hw7Var.h)), false);
                    hw7Var.p(d, false);
                    hw7Var.e(dbaVar, currentColor, null);
                    hw7Var.d = null;
                    hw7Var.J = 0.0f;
                    hw7Var.L = null;
                    break;
                }
            case 11:
                ((PasscodeActivity) ((xe6) obj).n).v0();
                break;
            case 12:
                try {
                    ((ux7) obj).d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                ((PasskeysActivity) obj).a0();
                break;
            case 14:
                ((iz7) obj).a.finishFragment();
                break;
            case 15:
                ik.u0(((nz7) obj).e.getParentActivity(), jb6.M0(2131743507, null), true);
                break;
            case 16:
                double currentTimeMillis = System.currentTimeMillis();
                tz7 tz7Var = (tz7) ((lx3) obj).b;
                double d2 = currentTimeMillis - tz7Var.H;
                tz7Var.H = currentTimeMillis;
                int i5 = (int) (tz7Var.F - d2);
                tz7Var.F = i5;
                if (i5 <= 1000) {
                    tz7Var.r.setVisibility(0);
                    tz7Var.n.setVisibility(8);
                    tz7Var.q();
                    break;
                }
                break;
            case 17:
                sz7 sz7Var = (sz7) obj;
                tz7 tz7Var2 = sz7Var.a;
                int i6 = tz7Var2.E;
                uz7 uz7Var = tz7Var2.s;
                wb wbVar = tz7Var2.n;
                if (i6 >= 1000) {
                    int i7 = i6 / 1000;
                    int i8 = i7 / 60;
                    int i9 = i7 - (i8 * 60);
                    int i10 = tz7Var2.N;
                    if (i10 == 4 || i10 == 3) {
                        wbVar.setText(jb6.a0("CallText", null, 2131752554, Integer.valueOf(i8), Integer.valueOf(i9)));
                    } else if (i10 == 2) {
                        wbVar.setText(jb6.a0("SmsText", null, 2131745029, Integer.valueOf(i8), Integer.valueOf(i9)));
                    }
                    if (uz7Var != null) {
                        uz7Var.c = 1.0f - (tz7Var2.E / tz7Var2.Q);
                        uz7Var.invalidate();
                        break;
                    }
                } else {
                    if (uz7Var != null) {
                        uz7Var.c = 1.0f;
                        uz7Var.invalidate();
                    }
                    tz7Var2.r();
                    int i11 = tz7Var2.M;
                    if (i11 == 3) {
                        gm.x3(false);
                        nm7.e().n(tz7Var2, nm7.l4);
                        tz7Var2.J = false;
                        tz7Var2.q();
                        tz7Var2.s();
                        break;
                    } else if (i11 == 2 || i11 == 4) {
                        int i12 = tz7Var2.N;
                        if (i12 == 4) {
                            wbVar.setText(jb6.M0(2131752550, null));
                        } else if (i12 == 2) {
                            wbVar.setText(jb6.M0(2131745311, null));
                        } else if (i12 == 3) {
                            gm.y3(false);
                            nm7.e().n(tz7Var2, nm7.k4);
                            tz7Var2.J = false;
                            tz7Var2.q();
                            tz7Var2.s();
                            break;
                        }
                        tz7Var2.o();
                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                        tL_auth_resendCode.phone_number = tz7Var2.a;
                        tL_auth_resendCode.phone_code_hash = tz7Var2.b;
                        i = ((d) tz7Var2.R).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new r15(sz7Var, (byte) 17), 2);
                        break;
                    }
                }
                break;
            case 18:
                l11.u(((j18) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 19:
                p pVar = (p) ((ai4) obj).b;
                pVar.i0();
                pVar.N0(true, false);
                pVar.J0(false);
                break;
            case 20:
                l11.u(((j18) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 21:
                d38 d38Var = (d38) obj;
                d38Var.T = !d38Var.T;
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (cmb.O0(string) == null || cmb.O0(string).o()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                bmb bmbVar = cmb.I;
                if (string.equals(string2)) {
                    if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        O0 = !d38Var.T ? cmb.O0(str2) : cmb.O0(str);
                        d38Var.w.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? cmb.R0(null, str3, strArr) : cmb.R0(new File(O0.b), null, strArr);
                        iArr = cmb.gm;
                        if (iArr != null) {
                            for (int i13 = 0; i13 < iArr.length; i13++) {
                                d38Var.w.put(i13, iArr[i13]);
                            }
                        }
                        for (i2 = 0; i2 < R0.size(); i2++) {
                            d38Var.w.put(R0.keyAt(i2), R0.valueAt(i2));
                        }
                        i3 = O0.i(false);
                        if (i3 != null) {
                            i3.d(R0, d38Var.w);
                        }
                        w28Var = d38Var.h;
                        if (w28Var != null && w28Var.w != null) {
                            sm2 I = cmb.I(O0, d38Var.w, strArr[0], 0, true);
                            r28 r28Var = d38Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            r28Var.setOverrideBackground(drawable);
                        }
                        z = d38Var.T;
                        if (d38Var.b0 != z) {
                            d38Var.b0 = z;
                            p09 p09Var = d38Var.U;
                            p09Var.K(z ? p09Var.e[0] : 0);
                            p09 p09Var2 = d38Var.U;
                            if (p09Var2 != null) {
                                p09Var2.start();
                            }
                        }
                        d38Var.J0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!d38Var.T) {
                }
                d38Var.w.clear();
                strArr = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = cmb.gm;
                if (iArr != null) {
                }
                while (i2 < R0.size()) {
                }
                i3 = O0.i(false);
                if (i3 != null) {
                }
                w28Var = d38Var.h;
                if (w28Var != null) {
                    sm2 I2 = cmb.I(O0, d38Var.w, strArr[0], 0, true);
                    r28 r28Var2 = d38Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    r28Var2.setOverrideBackground(drawable);
                }
                z = d38Var.T;
                if (d38Var.b0 != z) {
                }
                d38Var.J0();
                break;
            case 22:
                u28 u28Var = (u28) obj;
                w28 w28Var2 = u28Var.c;
                c38 c38Var = w28Var2.F;
                d38 d38Var2 = w28Var2.q0;
                if (c38Var != null && w28Var2.M.size() > 1) {
                    c38Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) w28Var2.N.get(1);
                    w28Var2.L = starGift;
                    qb9 qb9Var = w28Var2.K;
                    if (starGift == null) {
                        if (qb9Var != null) {
                            qb9Var.i();
                            w28Var2.K = null;
                        }
                    } else if (qb9Var == null || qb9Var.b != starGift.id) {
                        i4 = ((d) d38Var2).currentAccount;
                        qb9 qb9Var2 = new qb9(i4, w28Var2.L.id, new ci7(u28Var, (byte) 11));
                        qb9Var2.w = true;
                        w28Var2.K = qb9Var2;
                        qb9Var2.l(false);
                    }
                    w28Var2.e();
                    (d38Var2.J.getCurrentPosition() == 1 ? d38Var2.n : d38Var2.h).d();
                    break;
                }
                break;
            case 23:
                ((d48) obj).a.K0();
                break;
            case 24:
                a58 a58Var = ((g48) obj).y;
                w48 w48Var = a58Var.G1;
                if (w48Var != null) {
                    if (!a58Var.J1 && !a58Var.K1 && !a58Var.L1) {
                        oab oabVar = ((fab) w48Var).d;
                        if (!oabVar.o0.getCurrentPeerView().Z0(true) && !oabVar.o0.E(true)) {
                            oabVar.o(true);
                            break;
                        }
                    } else if (a58Var.E1.e) {
                        ((nab) a58Var.C2.c).loopBack();
                        break;
                    } else {
                        a58Var.M0 = 0L;
                        break;
                    }
                }
                break;
            case 25:
                ((i58) obj).n1.start();
                break;
            case 26:
                ((q68) obj).a.invalidate();
                break;
            case 27:
                uf4 uf4Var = ((k78) obj).c.m0;
                if (uf4Var != null) {
                    uf4Var.b(false, true, false);
                    break;
                }
                break;
            case 28:
                m78 m78Var = (m78) obj;
                m78Var.r = false;
                m78Var.invalidate();
                break;
            default:
                w78 w78Var = (w78) ((cn0) obj).c;
                w78Var.g0(w78Var.Q.getSearchField());
                break;
        }
    }
}
