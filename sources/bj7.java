// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        int i;
        int i2;
        TLRPC.Chat K0;
        String a0;
        m21 I;
        tz7 tz7Var;
        tz7 tz7Var2;
        int i3 = 6;
        long j3 = 0;
        String str = "";
        byte b = 1;
        switch (this.a) {
            case 0:
                zj zjVar = (zj) this.b;
                Context context = (Context) this.c;
                ev2 ev2Var = (ev2) zjVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i3 = type != 9 ? 8 : 7;
                                        }
                                        i3 = 5;
                                    }
                                }
                                i3 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i3 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i3 = 4;
                                    break;
                                case 13:
                                    i3 = 5;
                                    break;
                                case 18:
                                    i3 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i3 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i3 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i3 != 5) {
                        ev2Var.i(i3);
                        break;
                    } else {
                        yz.g(context, ev2Var);
                        break;
                    }
                }
                i3 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                ev2Var.i(i3);
                break;
            case 1:
                jj7 jj7Var = (jj7) this.b;
                String str2 = (String) this.c;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", k96.a0(null, null, 2131748924, "https://telegram.org/dl"));
                jj7Var.getContext().startActivity(intent);
                break;
            case 2:
                jj7 jj7Var2 = (jj7) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                jj7Var2.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.P2(user.id));
                    break;
                }
                break;
            case 3:
                ((x15) this.b).a((TLRPC.User) this.c);
                break;
            case 4:
                Intent intent2 = (Intent) this.b;
                Intent intent3 = (Intent) this.c;
                a.b.sendBroadcast(intent2);
                a.b.sendBroadcast(intent3);
                break;
            case 5:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                im7 im7Var = (im7) this.b;
                if (im7Var.s.remove((String) this.c)) {
                    im7Var.Z(true);
                    break;
                }
                break;
            case 7:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        break;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                        return;
                    }
                }
                break;
            case 8:
                ((km8) this.b).x((HashSet) this.c);
                break;
            case 9:
                im7 im7Var2 = (im7) this.b;
                vf6 vf6Var = (vf6) this.c;
                ArrayList arrayList = im7Var2.b;
                ArrayList arrayList2 = im7Var2.a;
                int m = vf6Var.m();
                int i4 = 0;
                boolean z = false;
                while (i4 < m) {
                    vf6Var.j(i4);
                    ArrayList arrayList3 = (ArrayList) vf6Var.n(i4);
                    int size = arrayList3.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            k27 k27Var = (k27) arrayList3.get(i5);
                            j = j3;
                            boolean z2 = k27Var.J;
                            TLRPC.Message message = k27Var.k;
                            if (z2) {
                                j2 = k27.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                j2 = j4 != j ? -j4 : j;
                            }
                            SparseArray sparseArray = (SparseArray) im7Var2.c.f(j2);
                            if (sparseArray != null) {
                                k27 k27Var2 = (k27) sparseArray.get(k27Var.e1());
                                if (k27Var2 != null && (k27Var2.I || k27Var2.J)) {
                                    k27Var2 = null;
                                }
                                if (k27Var2 != null) {
                                    sparseArray.put(k27Var.e1(), k27Var);
                                    int indexOf = arrayList2.indexOf(k27Var2);
                                    if (indexOf >= 0) {
                                        arrayList2.set(indexOf, k27Var);
                                    }
                                    int indexOf2 = arrayList.indexOf(k27Var2);
                                    if (indexOf2 >= 0) {
                                        arrayList.set(indexOf2, k27Var);
                                    }
                                    z = true;
                                }
                                i5++;
                                j3 = j;
                            }
                        } else {
                            j = j3;
                        }
                    }
                    i4++;
                    j3 = j;
                }
                if (z) {
                    im7Var2.Z(false);
                    break;
                }
                break;
            case 10:
                ((NotificationsCustomSettingsActivity) this.b).m0((ArrayList) this.c);
                break;
            case 11:
                fx0[] fx0VarArr = (fx0[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                fx0VarArr[0] = null;
                un7.a = null;
                zArr[0] = true;
                break;
            case 12:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                String str3 = (String) this.c;
                d S2 = LaunchActivity.S();
                u21 b0 = S2 != null ? u21.b0(S2) : u21.Y();
                TLRPC.Document document = starGift.getDocument();
                m21 q = document != null ? b0.q(document, str3) : b0.Q(R.raw.contact_check, 36, str3);
                q.t = true;
                q.j();
                break;
            case 13:
                ((qq7) this.b).Y(((c4c) this.c).d);
                break;
            case 14:
                wt7 wt7Var = (wt7) this.b;
                View view = (View) this.c;
                if (view instanceof l34) {
                    l34 l34Var = (l34) view;
                    l34Var.m();
                    wt7Var.D0(l34Var, true);
                    break;
                }
                break;
            case 15:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, k96.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 16:
                gu7 gu7Var = (gu7) this.b;
                x69 x69Var = (x69) this.c;
                gu7Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) gu7Var.h(gu7Var.f(), true, false, false).c;
                RectF f = gu7Var.f();
                Object obj = gu7Var.a.b;
                gu7Var.w = new qx(byteBuffer, 0, f);
                gu7Var.a(false);
                x69Var.run();
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (sj2 sj2Var : passcodeActivity.n.f) {
                    sj2Var.D(0.0f);
                }
                runnable.run();
                break;
            case 18:
                iv7 iv7Var = (iv7) this.b;
                a8 a8Var = (a8) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) iv7Var.c;
                a8Var.setText(k96.M0(!passcodeActivity2.E ? 2131747460 : 2131747461, null));
                a8Var.setIcon(!passcodeActivity2.E ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.w0();
                if (passcodeActivity2.p0()) {
                    passcodeActivity2.h.setInputType(524417);
                    gl.T3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 19:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 20:
                ((i8c) this.b).a(null, ((Throwable) this.c).getMessage());
                break;
            case 21:
                vx7 vx7Var = (vx7) this.b;
                vf7 vf7Var = (vf7) this.c;
                int[] iArr = vx7Var.y;
                byte b2 = vf7Var.a;
                if (b2 == 2) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = vx7Var.H.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i6);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    vx7Var.G = tL_secureRequiredType;
                                    vx7Var.S1();
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                } else if (b2 == 1) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = vx7Var.H.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i7);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    vx7Var.G = tL_secureRequiredType2;
                                    vx7Var.S1();
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                } else if (b2 == 3) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = vx7Var.H.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i8);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    vx7Var.G = tL_secureRequiredType3;
                                    vx7Var.S1();
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                } else if (b2 == 4 && !(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = vx7Var.H.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i9);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                vx7Var.G = tL_secureRequiredType4;
                                vx7Var.S1();
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.b)) {
                    vx7Var.Z[0].setText(vf7Var.b);
                }
                if (!TextUtils.isEmpty(vf7Var.d)) {
                    vx7Var.Z[1].setText(vf7Var.d);
                }
                if (!TextUtils.isEmpty(vf7Var.c)) {
                    vx7Var.Z[2].setText(vf7Var.c);
                }
                if (!TextUtils.isEmpty(vf7Var.e)) {
                    vx7Var.Z[7].setText(vf7Var.e);
                }
                int i10 = vf7Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        vx7Var.x = "male";
                        vx7Var.Z[4].setText(k96.M0(2131747315, null));
                    } else if (i10 == 2) {
                        vx7Var.x = "female";
                        vx7Var.Z[4].setText(k96.M0(2131747376, null));
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.m)) {
                    String str4 = vf7Var.m;
                    vx7Var.s = str4;
                    String str5 = (String) vx7Var.Z0.get(str4);
                    if (str5 != null) {
                        vx7Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.l)) {
                    String str6 = vf7Var.l;
                    vx7Var.w = str6;
                    String str7 = (String) vx7Var.Z0.get(str6);
                    if (str7 != null) {
                        vx7Var.Z[6].setText(str7);
                    }
                }
                int i11 = vf7Var.k;
                if (i11 > 0 && vf7Var.j > 0 && vf7Var.i > 0) {
                    vx7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(vf7Var.j), Integer.valueOf(vf7Var.i)));
                }
                int i12 = vf7Var.h;
                if (i12 <= 0 || (i = vf7Var.g) <= 0 || (i2 = vf7Var.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    vx7Var.Z[8].setText(k96.M0(2131747301, null));
                    break;
                } else {
                    iArr[0] = i2;
                    iArr[1] = i;
                    iArr[2] = i12;
                    vx7Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i12), Integer.valueOf(vf7Var.g), Integer.valueOf(vf7Var.f)));
                    break;
                }
                break;
            case 22:
                vx7 vx7Var2 = (vx7) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    vx7Var2.K = password;
                    if (TwoStepVerificationActivity.a0(password, false)) {
                        TwoStepVerificationActivity.e0(vx7Var2.K);
                        vx7Var2.U1();
                        if (vx7Var2.a0[0].getVisibility() == 0) {
                            vx7Var2.Z[0].requestFocus();
                            gl.E3(vx7Var2.Z[0]);
                        }
                        if (vx7Var2.O0 == 1) {
                            vx7Var2.D1(true);
                            break;
                        }
                    } else {
                        ij.u0(vx7Var2.getParentActivity(), k96.M0(2131743581, null), true);
                        break;
                    }
                }
                break;
            case 23:
                vx7 vx7Var3 = (vx7) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    vx7Var3.g1 = true;
                    vx7Var3.M0(true);
                    vx7Var3.finishFragment();
                    break;
                } else {
                    vx7Var3.P1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        ij.u0(vx7Var3.getParentActivity(), k96.M0(2131743581, null), true);
                        break;
                    } else {
                        vx7Var3.O1(k96.M0(R.string.AppName, null), tL_error.text);
                        break;
                    }
                }
            case 24:
                ((qx7) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 25:
                p pVar = (p) this.b;
                View view2 = (View) this.c;
                pVar.I0(false);
                view2.callOnClick();
                break;
            case 26:
                p pVar2 = (p) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                pVar2.M0(true, false);
                if (tL_error2 == null) {
                    if (pVar2.getParentActivity() != null) {
                        vy7 vy7Var = pVar2.e0;
                        if (vy7Var != null) {
                            gl.r(vy7Var);
                            pVar2.e0 = null;
                        }
                        pVar2.h0();
                        break;
                    }
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    tt3 tt3Var = pVar2.T;
                    try {
                        tt3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gl.A3(2.5f, tt3Var, null);
                    tt3 tt3Var2 = pVar2.T;
                    tt3Var2.a.setText("");
                    tt3Var2.setWillNotDraw(true);
                    break;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    pVar2.K0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                    break;
                } else {
                    pVar2.K0(k96.M0(R.string.AppName, null), tL_error2.text);
                    break;
                }
                break;
            case 27:
                ((p) this.b).u0((TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 28:
                p pVar3 = (p) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = pVar3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    pVar3.b1 = true;
                    pVar3.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = pVar3.c1;
                    boolean z3 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z4 = z3 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z5 = z3 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z3 && (tz7Var2 = pVar3.a1) != null) {
                        tz7Var2.c(1);
                    }
                    pVar3.h0();
                    if (z3 && (tz7Var = pVar3.a1) != null) {
                        tz7Var.c(pVar3.g1);
                    }
                    long e0 = pVar3.e0();
                    if (e0 > 0) {
                        str = l7c.l(pVar3.getMessagesController().V1(Long.valueOf(e0)));
                    } else if (e0 < 0 && (K0 = pVar3.getMessagesController().K0(Long.valueOf(-e0))) != null) {
                        str = K0.title;
                    }
                    long d0 = pVar3.d0();
                    int i13 = z3 ? (z4 || z5) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String M0 = z3 ? k96.M0(z5 ? 2131744855 : z4 ? 2131744863 : 2131744922, null) : null;
                    if (!z3) {
                        a0 = k96.a0(null, null, 2131747208, pVar3.S0[0], pVar3.r0);
                    } else if (z5) {
                        a0 = k96.H(',', "StarsGiveawaySentPopupInfo", (int) d0);
                    } else {
                        a0 = k96.K(z4 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) d0, ',', str);
                    }
                    SpannableStringBuilder S22 = gl.S2(a0);
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        u21 b02 = u21.b0(S3);
                        if (e0 == 0 || M0 == null || z5) {
                            String str8 = M0;
                            I = str8 != null ? b02.I(i13, str8, S22) : b02.Q(i13, 36, S22);
                        } else {
                            I = b02.L(i13, M0, S22, k96.M0(2131743310, null), new px6(b, e0));
                        }
                        I.r = false;
                        I.j = 5000;
                        if (messageArr[0] != null) {
                            l63 l63Var = new l63(pVar3, I, z4, messageArr, (byte) 2);
                            q11 q11Var = I.e;
                            if (q11Var != null) {
                                q11Var.setOnClickListener(l63Var);
                            }
                        }
                        I.k(z5);
                        break;
                    }
                }
                break;
            default:
                p pVar4 = (p) this.b;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.c;
                p8c p8cVar = pVar4.e1;
                if (p8cVar != null) {
                    p8cVar.a(tL_payments_paymentVerificationNeeded);
                }
                pVar4.I0(false);
                pVar4.A0 = true;
                pVar4.M0(true, true);
                cw2 cw2Var = pVar4.r;
                if (cw2Var != null) {
                    cw2Var.setVisibility(0);
                }
                r7 r7Var = pVar4.n;
                if (r7Var != null) {
                    r7Var.setEnabled(false);
                    pVar4.n.getContentView().setVisibility(4);
                }
                pVar4.getMessagesController().b4 = new lt2((Object) pVar4, (Object) pVar4.getParentLayout(), (Object) pVar4.getParentActivity(), (byte) 21);
                WebView webView = pVar4.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = pVar4.x;
                    String str9 = tL_payments_paymentVerificationNeeded.url;
                    pVar4.y = str9;
                    webView2.loadUrl(str9);
                }
                pVar4.b1 = true;
                pVar4.g1 = 3;
                tz7 tz7Var3 = pVar4.a1;
                if (tz7Var3 != null) {
                    tz7Var3.c(3);
                    break;
                }
                break;
        }
    }
}
