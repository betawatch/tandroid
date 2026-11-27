// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.a;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[LOOP:1: B:34:0x00ae->B:36:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String d;
        TelephonyManager telephonyManager;
        int i;
        znb O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i2;
        ynb i3;
        a48 a48Var;
        boolean z;
        Drawable drawable;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((te2) obj).a(null);
                return;
            case 1:
                ((bl2) obj).invalidateSelf();
                return;
            case 2:
                nab nabVar = (nab) obj;
                if (nabVar.J) {
                    nabVar.J = false;
                    nabVar.invalidate();
                    return;
                }
                return;
            case 3:
                ((MusicPlayerService) obj).stopSelf();
                return;
            case 4:
                ((pb2) obj).invalidateSelf();
                return;
            case 5:
                il7 il7Var = (il7) obj;
                ka3 ka3Var = (ka3) il7Var.a.get();
                if (ka3Var != null) {
                    int h = il7Var.c.h();
                    la3 la3Var = ka3Var.a;
                    synchronized (la3Var) {
                        int i4 = la3Var.n;
                        if (i4 == 0 || la3Var.e) {
                            if (i4 != h || la3Var.o == null) {
                                la3Var.n = h;
                                if (h == 1 || h == 0 || h == 8) {
                                    return;
                                }
                                if (la3Var.o == null) {
                                    Context context = la3Var.a;
                                    String str = gcc.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            d = jrd.d(networkCountryIso);
                                            la3Var.o = d;
                                        }
                                    }
                                    d = jrd.d(Locale.getDefault().getCountry());
                                    la3Var.o = d;
                                }
                                la3Var.l = la3Var.c(h);
                                la3Var.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                la3Var.e(la3Var.i, la3Var.g > 0 ? (int) (elapsedRealtime - la3Var.h) : 0, la3Var.l);
                                la3Var.h = elapsedRealtime;
                                la3Var.i = 0L;
                                la3Var.k = 0L;
                                la3Var.j = 0L;
                                hna hnaVar = la3Var.f;
                                hnaVar.a.clear();
                                hnaVar.c = -1;
                                hnaVar.d = 0;
                                hnaVar.e = 0;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                hl.E3(((rl7) ((v34) obj).b).J1);
                return;
            case 7:
                ((ViewGroup) obj).setVisibility(8);
                return;
            case 8:
                ((hj3) obj).jumpDrawablesToCurrentState();
                return;
            case 9:
                try {
                    a.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) obj);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 10:
                ((NotificationsSettingsActivity) obj).A0();
                return;
            case 11:
                jn7.f(((wp7) obj).a).k(43, new Object[0]);
                return;
            case 12:
                ((OldVideoPlayerRewinder) obj).lambda$incrementRewindCount$0();
                return;
            case 13:
                ((lt7) obj).run();
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor = ((pt7) obj).n1;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            case 15:
                vt7 vt7Var = (vt7) obj;
                vt7Var.a.g3.O(true);
                vt7Var.Z(true);
                return;
            case 16:
                ((yu7) obj).c();
                return;
            case 17:
                xh4 xh4Var = ((mx7) obj).b.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    return;
                }
                return;
            case 18:
                nx7 nx7Var = ((mx7) obj).b;
                if (nx7Var.d == null) {
                    nx7Var.L = null;
                    return;
                }
                int currentColor = nx7Var.f.getCurrentColor();
                nx7Var.l(nx7Var.b, false, false);
                rx d2 = nx7Var.d(nx7Var.b, currentColor, new RectF(nx7Var.h));
                nx7Var.b();
                tca tcaVar = nx7Var.d;
                RectF rectF = new RectF();
                nx7Var.h = rectF;
                tcaVar.a(rectF);
                nx7Var.p(nx7Var.e(tcaVar, currentColor, new RectF(nx7Var.h)), false);
                nx7Var.p(d2, false);
                nx7Var.e(tcaVar, currentColor, null);
                nx7Var.d = null;
                nx7Var.J = 0.0f;
                nx7Var.L = null;
                return;
            case 19:
                ((PasscodeActivity) ((bf6) obj).n).u0();
                return;
            case 20:
                try {
                    ((yy7) obj).d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 21:
                ((PasskeysActivity) obj).Z();
                return;
            case 22:
                ((m08) obj).a.finishFragment();
                return;
            case 23:
                jj.u0(((r08) obj).e.getParentActivity(), ob6.M0(2131743475, null), true);
                return;
            case 24:
                double currentTimeMillis = System.currentTimeMillis();
                x08 x08Var = (x08) ((vw3) obj).b;
                double d3 = currentTimeMillis - x08Var.H;
                x08Var.H = currentTimeMillis;
                int i5 = (int) (x08Var.F - d3);
                x08Var.F = i5;
                if (i5 <= 1000) {
                    x08Var.r.setVisibility(0);
                    x08Var.n.setVisibility(8);
                    x08Var.q();
                    return;
                }
                return;
            case 25:
                w08 w08Var = (w08) obj;
                x08 x08Var2 = w08Var.a;
                int i6 = x08Var2.E;
                y08 y08Var = x08Var2.s;
                xb xbVar = x08Var2.n;
                if (i6 >= 1000) {
                    int i7 = i6 / 1000;
                    int i8 = i7 / 60;
                    int i9 = i7 - (i8 * 60);
                    int i10 = x08Var2.N;
                    if (i10 == 4 || i10 == 3) {
                        xbVar.setText(ob6.a0("CallText", null, 2131752582, Integer.valueOf(i8), Integer.valueOf(i9)));
                    } else if (i10 == 2) {
                        xbVar.setText(ob6.a0("SmsText", null, 2131745023, Integer.valueOf(i8), Integer.valueOf(i9)));
                    }
                    if (y08Var != null) {
                        y08Var.c = 1.0f - (x08Var2.E / x08Var2.Q);
                        y08Var.invalidate();
                        return;
                    }
                    return;
                }
                if (y08Var != null) {
                    y08Var.c = 1.0f;
                    y08Var.invalidate();
                }
                x08Var2.r();
                int i11 = x08Var2.M;
                if (i11 == 3) {
                    hl.x3(false);
                    jn7.e().n(x08Var2, jn7.k4);
                    x08Var2.J = false;
                    x08Var2.q();
                    x08Var2.s();
                    return;
                }
                if (i11 == 2 || i11 == 4) {
                    int i12 = x08Var2.N;
                    if (i12 == 4) {
                        xbVar.setText(ob6.M0(2131752578, null));
                    } else {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                hl.y3(false);
                                jn7.e().n(x08Var2, jn7.j4);
                                x08Var2.J = false;
                                x08Var2.q();
                                x08Var2.s();
                                return;
                            }
                            return;
                        }
                        xbVar.setText(ob6.M0(2131745305, null));
                    }
                    x08Var2.o();
                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                    tL_auth_resendCode.phone_number = x08Var2.a;
                    tL_auth_resendCode.phone_code_hash = x08Var2.b;
                    i = ((e) x08Var2.R).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new w15(w08Var, (byte) 17), 2);
                    return;
                }
                return;
            case 26:
                m01.u(((m28) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 27:
                p pVar = (p) ((aj3) obj).b;
                pVar.h0();
                pVar.N0(true, false);
                pVar.J0(false);
                return;
            case 28:
                m01.u(((m28) obj).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            default:
                h48 h48Var = (h48) obj;
                h48Var.T = !h48Var.T;
                String str2 = "Dark Blue";
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str3 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (aob.O0(string) == null || aob.O0(string).o()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                znb znbVar = aob.I;
                if (!string.equals(string2)) {
                    str2 = string2;
                } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str2 = string2;
                    O0 = !h48Var.T ? aob.O0(str2) : aob.O0(str3);
                    h48Var.w.clear();
                    strArr = new String[1];
                    String str4 = O0.d;
                    R0 = str4 == null ? aob.R0(null, str4, strArr) : aob.R0(new File(O0.b), null, strArr);
                    iArr = aob.hm;
                    if (iArr != null) {
                        for (int i13 = 0; i13 < iArr.length; i13++) {
                            h48Var.w.put(i13, iArr[i13]);
                        }
                    }
                    for (i2 = 0; i2 < R0.size(); i2++) {
                        h48Var.w.put(R0.keyAt(i2), R0.valueAt(i2));
                    }
                    i3 = O0.i(false);
                    if (i3 != null) {
                        i3.d(R0, h48Var.w);
                    }
                    a48Var = h48Var.h;
                    if (a48Var != null && a48Var.w != null) {
                        am2 I = aob.I(O0, h48Var.w, strArr[0], 0, true);
                        u38 u38Var = h48Var.h.w;
                        drawable = (BitmapDrawable) I.c;
                        if (drawable == null) {
                            drawable = (Drawable) I.b;
                        }
                        u38Var.setOverrideBackground(drawable);
                    }
                    z = h48Var.T;
                    if (h48Var.b0 != z) {
                        h48Var.b0 = z;
                        b29 b29Var = h48Var.U;
                        b29Var.K(z ? b29Var.e[0] : 0);
                        b29 b29Var2 = h48Var.U;
                        if (b29Var2 != null) {
                            b29Var2.start();
                        }
                    }
                    h48Var.J0();
                    return;
                }
                str3 = string;
                if (!h48Var.T) {
                }
                h48Var.w.clear();
                strArr = new String[1];
                String str42 = O0.d;
                if (str42 == null) {
                }
                iArr = aob.hm;
                if (iArr != null) {
                }
                while (i2 < R0.size()) {
                }
                i3 = O0.i(false);
                if (i3 != null) {
                }
                a48Var = h48Var.h;
                if (a48Var != null) {
                    am2 I2 = aob.I(O0, h48Var.w, strArr[0], 0, true);
                    u38 u38Var2 = h48Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    u38Var2.setOverrideBackground(drawable);
                }
                z = h48Var.T;
                if (h48Var.b0 != z) {
                }
                h48Var.J0();
                return;
        }
    }
}
