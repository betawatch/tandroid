// default package

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        int i;
        int i2;
        TLRPC.Chat L0;
        String a0;
        u31 I;
        w18 w18Var;
        w18 w18Var2;
        int i3 = 6;
        long j3 = 0;
        String str = "";
        byte b = 1;
        switch (this.a) {
            case 0:
                ow2 ow2Var = (ow2) this.c;
                Context context = (Context) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zk(ow2Var, (byte) 10), intentFilter);
                break;
            case 1:
                zk zkVar = (zk) this.c;
                Context context2 = (Context) this.b;
                ow2 ow2Var2 = (ow2) zkVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
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
                        ow2Var2.i(i3);
                        break;
                    } else {
                        y00.g(context2, ow2Var2);
                        break;
                    }
                }
                i3 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                ow2Var2.i(i3);
                break;
            case 2:
                ml7 ml7Var = (ml7) this.c;
                String str2 = (String) this.b;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", jb6.a0(null, null, 2131748873, "https://telegram.org/dl"));
                ml7Var.getContext().startActivity(intent);
                break;
            case 3:
                ml7 ml7Var2 = (ml7) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                ml7Var2.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.S2(user.id));
                    break;
                }
                break;
            case 4:
                ((u35) this.c).a((TLRPC.User) this.b);
                break;
            case 5:
                Intent intent2 = (Intent) this.c;
                Intent intent3 = (Intent) this.b;
                a.b.sendBroadcast(intent2);
                a.b.sendBroadcast(intent3);
                break;
            case 6:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.c).a, "setAppBadgeCount", (String) null, (Bundle) this.b);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 7:
                lo7 lo7Var = (lo7) this.c;
                if (lo7Var.s.remove((String) this.b)) {
                    lo7Var.Z(true);
                    break;
                }
                break;
            case 8:
                Uri uri = (Uri) this.c;
                File file = (File) this.b;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        break;
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                        return;
                    }
                }
                break;
            case 9:
                ((jo8) this.c).x((HashSet) this.b);
                break;
            case 10:
                lo7 lo7Var2 = (lo7) this.c;
                vh6 vh6Var = (vh6) this.b;
                ArrayList arrayList = lo7Var2.b;
                ArrayList arrayList2 = lo7Var2.a;
                int m = vh6Var.m();
                int i4 = 0;
                boolean z = false;
                while (i4 < m) {
                    vh6Var.j(i4);
                    ArrayList arrayList3 = (ArrayList) vh6Var.n(i4);
                    int size = arrayList3.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            k47 k47Var = (k47) arrayList3.get(i5);
                            j = j3;
                            boolean z2 = k47Var.J;
                            TLRPC.Message message = k47Var.k;
                            if (z2) {
                                j2 = k47.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                j2 = j4 != j ? -j4 : j;
                            }
                            SparseArray sparseArray = (SparseArray) lo7Var2.c.f(j2);
                            if (sparseArray != null) {
                                k47 k47Var2 = (k47) sparseArray.get(k47Var.e1());
                                if (k47Var2 != null && (k47Var2.I || k47Var2.J)) {
                                    k47Var2 = null;
                                }
                                if (k47Var2 != null) {
                                    sparseArray.put(k47Var.e1(), k47Var);
                                    int indexOf = arrayList2.indexOf(k47Var2);
                                    if (indexOf >= 0) {
                                        arrayList2.set(indexOf, k47Var);
                                    }
                                    int indexOf2 = arrayList.indexOf(k47Var2);
                                    if (indexOf2 >= 0) {
                                        arrayList.set(indexOf2, k47Var);
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
                    lo7Var2.Z(false);
                    break;
                }
                break;
            case 11:
                ((NotificationsCustomSettingsActivity) this.c).n0((ArrayList) this.b);
                break;
            case 12:
                my0[] my0VarArr = (my0[]) this.c;
                boolean[] zArr = (boolean[]) this.b;
                my0VarArr[0] = null;
                xp7.a = null;
                zArr[0] = true;
                break;
            case 13:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                String str3 = (String) this.b;
                d S2 = LaunchActivity.S();
                c41 b0 = S2 != null ? c41.b0(S2) : c41.Y();
                TLRPC.Document document = starGift.getDocument();
                u31 q = document != null ? b0.q(document, str3) : b0.Q(R.raw.contact_check, 36, str3);
                q.u = true;
                q.j();
                break;
            case 14:
                ((ss7) this.c).Z(((c6c) this.b).d);
                break;
            case 15:
                xv7 xv7Var = (xv7) this.c;
                View view = (View) this.b;
                if (view instanceof w44) {
                    w44 w44Var = (w44) view;
                    w44Var.m();
                    xv7Var.D0(w44Var, true);
                    break;
                }
                break;
            case 16:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.c;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.b;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, jb6.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 17:
                hw7 hw7Var = (hw7) this.c;
                z89 z89Var = (z89) this.b;
                hw7Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) hw7Var.h(hw7Var.f(), true, false, false).c;
                RectF f = hw7Var.f();
                Object obj = hw7Var.a.b;
                hw7Var.w = new ry(byteBuffer, 0, f);
                hw7Var.a(false);
                z89Var.run();
                break;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                Runnable runnable = (Runnable) this.b;
                for (gl2 gl2Var : passcodeActivity.n.f) {
                    gl2Var.D(0.0f);
                }
                runnable.run();
                break;
            case 19:
                kx7 kx7Var = (kx7) this.c;
                a8 a8Var = (a8) this.b;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) kx7Var.c;
                a8Var.setText(jb6.M0(!passcodeActivity2.E ? 2131747386 : 2131747387, null));
                a8Var.setIcon(!passcodeActivity2.E ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.x0();
                if (passcodeActivity2.q0()) {
                    passcodeActivity2.h.setInputType(524417);
                    gm.T3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 20:
                ((PasskeysActivity) this.c).Z((TL_account.Passkey) this.b);
                break;
            case 21:
                ((jac) this.c).a(null, ((Throwable) this.b).getMessage());
                break;
            case 22:
                xz7 xz7Var = (xz7) this.c;
                yh7 yh7Var = (yh7) this.b;
                int[] iArr = xz7Var.y;
                byte b2 = yh7Var.a;
                if (b2 == 2) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = xz7Var.H.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i6);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    xz7Var.G = tL_secureRequiredType;
                                    xz7Var.T1();
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                } else if (b2 == 1) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = xz7Var.H.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i7);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    xz7Var.G = tL_secureRequiredType2;
                                    xz7Var.T1();
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                } else if (b2 == 3) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = xz7Var.H.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i8);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    xz7Var.G = tL_secureRequiredType3;
                                    xz7Var.T1();
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                } else if (b2 == 4 && !(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = xz7Var.H.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i9);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                xz7Var.G = tL_secureRequiredType4;
                                xz7Var.T1();
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.b)) {
                    xz7Var.Z[0].setText(yh7Var.b);
                }
                if (!TextUtils.isEmpty(yh7Var.d)) {
                    xz7Var.Z[1].setText(yh7Var.d);
                }
                if (!TextUtils.isEmpty(yh7Var.c)) {
                    xz7Var.Z[2].setText(yh7Var.c);
                }
                if (!TextUtils.isEmpty(yh7Var.e)) {
                    xz7Var.Z[7].setText(yh7Var.e);
                }
                int i10 = yh7Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        xz7Var.x = "male";
                        xz7Var.Z[4].setText(jb6.M0(2131747241, null));
                    } else if (i10 == 2) {
                        xz7Var.x = "female";
                        xz7Var.Z[4].setText(jb6.M0(2131747302, null));
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.m)) {
                    String str4 = yh7Var.m;
                    xz7Var.s = str4;
                    String str5 = (String) xz7Var.Z0.get(str4);
                    if (str5 != null) {
                        xz7Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.l)) {
                    String str6 = yh7Var.l;
                    xz7Var.w = str6;
                    String str7 = (String) xz7Var.Z0.get(str6);
                    if (str7 != null) {
                        xz7Var.Z[6].setText(str7);
                    }
                }
                int i11 = yh7Var.k;
                if (i11 > 0 && yh7Var.j > 0 && yh7Var.i > 0) {
                    xz7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(yh7Var.j), Integer.valueOf(yh7Var.i)));
                }
                int i12 = yh7Var.h;
                if (i12 <= 0 || (i = yh7Var.g) <= 0 || (i2 = yh7Var.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    xz7Var.Z[8].setText(jb6.M0(2131747227, null));
                    break;
                } else {
                    iArr[0] = i2;
                    iArr[1] = i;
                    iArr[2] = i12;
                    xz7Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i12), Integer.valueOf(yh7Var.g), Integer.valueOf(yh7Var.f)));
                    break;
                }
                break;
            case 23:
                xz7 xz7Var2 = (xz7) this.c;
                TLObject tLObject = (TLObject) this.b;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    xz7Var2.K = password;
                    if (TwoStepVerificationActivity.b0(password, false)) {
                        TwoStepVerificationActivity.f0(xz7Var2.K);
                        xz7Var2.V1();
                        if (xz7Var2.a0[0].getVisibility() == 0) {
                            xz7Var2.Z[0].requestFocus();
                            gm.E3(xz7Var2.Z[0]);
                        }
                        if (xz7Var2.O0 == 1) {
                            xz7Var2.E1(true);
                            break;
                        }
                    } else {
                        ik.u0(xz7Var2.getParentActivity(), jb6.M0(2131743507, null), true);
                        break;
                    }
                }
                break;
            case 24:
                xz7 xz7Var3 = (xz7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error == null) {
                    xz7Var3.g1 = true;
                    xz7Var3.N0(true);
                    xz7Var3.finishFragment();
                    break;
                } else {
                    xz7Var3.Q1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        ik.u0(xz7Var3.getParentActivity(), jb6.M0(2131743507, null), true);
                        break;
                    } else {
                        xz7Var3.P1(jb6.M0(R.string.AppName, null), tL_error.text);
                        break;
                    }
                }
            case 25:
                ((sz7) this.c).a.L = ((TLRPC.TL_error) this.b).text;
                break;
            case 26:
                p pVar = (p) this.c;
                View view2 = (View) this.b;
                pVar.J0(false);
                view2.callOnClick();
                break;
            case 27:
                p pVar2 = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                pVar2.N0(true, false);
                if (tL_error2 == null) {
                    if (pVar2.getParentActivity() != null) {
                        x08 x08Var = pVar2.e0;
                        if (x08Var != null) {
                            gm.r(x08Var);
                            pVar2.e0 = null;
                        }
                        pVar2.i0();
                        break;
                    }
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    ev3 ev3Var = pVar2.T;
                    try {
                        ev3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gm.A3(2.5f, ev3Var, null);
                    ev3 ev3Var2 = pVar2.T;
                    ev3Var2.a.setText("");
                    ev3Var2.setWillNotDraw(true);
                    break;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    pVar2.L0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                    break;
                } else {
                    pVar2.L0(jb6.M0(R.string.AppName, null), tL_error2.text);
                    break;
                }
                break;
            case 28:
                ((p) this.c).v0((TLRPC.TL_payments_validatedRequestedInfo) this.b);
                break;
            default:
                p pVar3 = (p) this.c;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.b;
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
                    if (!z3 && (w18Var2 = pVar3.a1) != null) {
                        w18Var2.c(1);
                    }
                    pVar3.i0();
                    if (z3 && (w18Var = pVar3.a1) != null) {
                        w18Var.c(pVar3.g1);
                    }
                    long f0 = pVar3.f0();
                    if (f0 > 0) {
                        str = m9c.l(pVar3.getMessagesController().W1(Long.valueOf(f0)));
                    } else if (f0 < 0 && (L0 = pVar3.getMessagesController().L0(Long.valueOf(-f0))) != null) {
                        str = L0.title;
                    }
                    long e0 = pVar3.e0();
                    int i13 = z3 ? (z4 || z5) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String M0 = z3 ? jb6.M0(z5 ? 2131744781 : z4 ? 2131744789 : 2131744848, null) : null;
                    if (!z3) {
                        a0 = jb6.a0(null, null, 2131747134, pVar3.S0[0], pVar3.r0);
                    } else if (z5) {
                        a0 = jb6.H(',', "StarsGiveawaySentPopupInfo", (int) e0);
                    } else {
                        a0 = jb6.K(z4 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) e0, ',', str);
                    }
                    SpannableStringBuilder S22 = gm.S2(a0);
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        c41 b02 = c41.b0(S3);
                        if (f0 == 0 || M0 == null || z5) {
                            String str8 = M0;
                            I = str8 != null ? b02.I(i13, str8, S22) : b02.Q(i13, 36, S22);
                        } else {
                            I = b02.L(i13, M0, S22, jb6.M0(2131743236, null), new pz6(b, f0));
                        }
                        I.s = false;
                        I.j = 5000;
                        if (messageArr[0] != null) {
                            x73 x73Var = new x73(pVar3, I, z4, messageArr, (byte) 2);
                            y21 y21Var = I.e;
                            if (y21Var != null) {
                                y21Var.setOnClickListener(x73Var);
                            }
                        }
                        I.k(z5);
                        break;
                    }
                }
                break;
        }
    }
}
