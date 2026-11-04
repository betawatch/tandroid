package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    private final void a(View view) {
        org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.c;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
        if (!n3Var.e || n3Var.S) {
            return;
        }
        org.telegram.ui.Wallet.w5.J0(d2Var.getCurrentAccount(), n3Var.getContext(), d2Var.getResourceProvider());
    }

    private final void b(View view) {
        org.telegram.ui.Wallet.u4 u4Var = (org.telegram.ui.Wallet.u4) this.c;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.b;
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        u4Var.dismiss();
        org.telegram.ui.Wallet.w9 w9Var = new org.telegram.ui.Wallet.w9();
        w9Var.n0(nftitem);
        T.presentFragment(w9Var);
    }

    private final void c(View view) {
        Runnable runnable = (Runnable) this.c;
        org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) this.b;
        runnable.run();
        y2VarArr[0].dismiss();
    }

    private final void d(View view) {
        org.telegram.ui.Wallet.w5.l0((org.telegram.ui.Wallet.w5) this.c, (Context) this.b, view);
    }

    private final void e(View view) {
        org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
        TextView textView = (TextView) this.b;
        c2Var.c(!c2Var.b(), true);
        textView.setVisibility(c2Var.b() ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c2;
        char c10;
        ?? r15;
        String a02;
        int i3;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        String str;
        int i11;
        b8.ke keVar;
        int i12 = 5;
        hi.d dVar = null;
        int i13 = 2;
        int i14 = 0;
        switch (this.a) {
            case 0:
                lb0 lb0Var = (lb0) this.c;
                Context context = (Context) this.b;
                String string = lb0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                    ty0Var.a |= 256;
                    ty0Var.b = indexOf;
                    int i15 = lastIndexOf + 1;
                    ty0Var.c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i15, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131748736, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748740, null));
                int i16 = lb0Var.H;
                int i17 = i16 / 86400;
                int i18 = i16 % 86400;
                int i19 = i18 / 3600;
                int i20 = (i18 % 3600) / 60;
                if (i17 == 0 && i19 == 0) {
                    i20 = Math.max(1, i20);
                }
                if (i17 == 0 || i19 == 0) {
                    c2 = 0;
                    if (i19 == 0 || i20 == 0) {
                        c10 = 1;
                        r15 = 0;
                        r15 = 0;
                        r15 = 0;
                        a02 = i17 != 0 ? org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i17, "Days", new Object[0])) : i19 != 0 ? org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i17, "Hours", new Object[0])) : org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i20, "Minutes", new Object[0]));
                    } else {
                        c10 = 1;
                        r15 = 0;
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131748743, org.telegram.messenger.bd.G(i19, "Hours", new Object[0]), org.telegram.messenger.bd.G(i20, "Minutes", new Object[0]));
                    }
                } else {
                    c2 = 0;
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131748743, org.telegram.messenger.bd.G(i17, "Days", new Object[0]), org.telegram.messenger.bd.G(i19, "Hours", new Object[0]));
                    r15 = 0;
                    c10 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c2] = spannableStringBuilder;
                charSequenceArr[c10] = a02;
                alertDialog$Builder.a.U = org.telegram.messenger.g0.m0(X2, charSequenceArr);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748744, r15), new ur(lb0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, r15), r15);
                alertDialog$Builder.p();
                break;
            case 1:
                vb0 vb0Var = (vb0) this.c;
                Context context2 = (Context) this.b;
                xd0 xd0Var = vb0Var.E;
                if (xd0Var.W.getTag() == null) {
                    if (vb0Var.n.has_recovery) {
                        xd0Var.w1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_requestPasswordRecovery, new sb0(vb0Var, 1), 10);
                        break;
                    } else {
                        org.telegram.messenger.g0.v1(vb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.S = org.telegram.messenger.bd.M0(2131746081, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.bd.M0(2131746083, null);
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131746127, null), new ur(vb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 2:
                dd0 dd0Var = (dd0) this.c;
                Context context3 = (Context) this.b;
                Bundle bundle = dd0Var.r0;
                if (bundle != null && (tL_auth_sentCode = dd0Var.s0) != null) {
                    dd0Var.v0.p1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!dd0Var.g0) {
                    bd0 bd0Var = dd0Var.w;
                    if ((bd0Var == null || bd0Var.getVisibility() == 8) && !dd0Var.l0) {
                        if (dd0Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = dd0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = dd0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            dd0Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.S = org.telegram.messenger.bd.M0(2131746081, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751446, dd0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.bd.M0(2131751447, null), new rb0(i13, dd0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131751449, null), new tc0(dd0Var, 1));
                            alertDialog$Builder3.p();
                            break;
                        } else if (dd0Var.v0.W.getTag() == null) {
                            dd0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 3:
                wd0 wd0Var = (wd0) this.c;
                Context context4 = (Context) this.b;
                Toast toast = wd0Var.R;
                if (toast != null) {
                    toast.cancel();
                    wd0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (wd0Var.P <= 0 || currentTimeMillis - wd0Var.Q <= 1500) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    wd0Var.P = 0;
                }
                int i21 = wd0Var.P + 1;
                wd0Var.P = i21;
                wd0Var.Q = currentTimeMillis;
                if (i21 >= 5) {
                    wd0Var.P = i10;
                    wd0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wd0Var.getContext());
                    alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131745496, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.bd.M0(org.telegram.messenger.r2.a ? 2131751640 : 2131751632, null), org.telegram.messenger.bd.M0(2131751614, null)}, new m4(wd0Var, i13));
                    alertDialog$Builder4.p();
                    break;
                } else if (i21 > 1) {
                    Toast makeText = Toast.makeText(context4, org.telegram.messenger.bd.G(5 - i21, "DebugMenuLoginToast", new Object[0]), 0);
                    wd0Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 4:
                bg0 bg0Var = (bg0) this.c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.b;
                dg0 dg0Var = bg0Var.d;
                if (!dg0Var.g0(ziVar)) {
                    dg0Var.getOrCreateStoryViewer().T(dg0Var.getParentActivity(), ziVar.l, ei.i7.a(dg0Var.f));
                    break;
                }
                break;
            case 5:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? org.telegram.messenger.hs.a2 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.r6.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 6:
                dl0.m0((dl0) this.c, (String) this.b, view);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.b;
                if (photoViewer.U4 != null) {
                    f60Var.u();
                    org.telegram.ui.ActionBar.d2 d2Var = photoViewer.n4;
                    if (d2Var instanceof wm) {
                        ((wm) d2Var).ja(photoViewer.U4, false, true);
                    }
                    sf.c.s(photoViewer.F, Uri.parse(photoViewer.U4.R0), true, false, false, null, null, false, org.telegram.messenger.hp.s1(photoViewer.U).d6, false, false);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (!photoViewer2.K1() && !photoViewer2.r) {
                    int i22 = photoViewer2.Q4;
                    if (i22 >= 0 && i22 < photoViewer2.h7.size()) {
                        Object obj = photoViewer2.h7.get(photoViewer2.Q4);
                        if (obj instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                            if (!yeVar.b || yeVar.d()) {
                                yeVar.z = Boolean.valueOf(!yeVar.c());
                                photoViewer2.k1.setPhotoState(yeVar.c());
                                boolean c11 = yeVar.c();
                                gi.l3 l3Var = photoViewer2.l1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new gi.l3(photoViewer2.F, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.bd.M0(c11 ? 2131747269 : 2131747268, null));
                                    append.setSpan(new org.telegram.ui.Components.wp(c11 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.l1.u(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    gi.l3 l3Var2 = photoViewer2.l1;
                                    l3Var2.r0 = new pg(i13, l3Var2);
                                    l3Var2.d = 3500L;
                                    l3Var2.w();
                                }
                                org.telegram.messenger.az.h1 = yeVar.c();
                                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.az.h1).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() != null) {
                        photoViewer2.b3(true);
                        photoViewer2.s2(1);
                        break;
                    } else if (photoViewer2.l8) {
                        if (photoViewer2.n1 == null) {
                            gq0 gq0Var = photoViewer2.f0;
                            org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01(activity);
                            c01Var.d = new org.telegram.ui.Components.sp0(c01Var, 17);
                            c01Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                            c01Var.setTextColor(-1);
                            c01Var.setTextSize(1, 14.0f);
                            c01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                            c01Var.setGravity(16);
                            gq0Var.addView(c01Var, b8.mf.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            c01Var.setVisibility(8);
                            photoViewer2.n1 = c01Var;
                        }
                        photoViewer2.n1.setText(org.telegram.messenger.bd.M0(2131743596, "VideoQualityIsTooLow"));
                        org.telegram.ui.Components.c01 c01Var2 = photoViewer2.n1;
                        org.telegram.ui.Components.z41 z41Var = photoViewer2.k1;
                        org.telegram.ui.Components.sp0 sp0Var = c01Var2.d;
                        if (z41Var != null) {
                            c01Var2.a = z41Var;
                            c01Var2.a();
                            c01Var2.c = true;
                            org.telegram.messenger.g0.r(sp0Var);
                            org.telegram.messenger.g0.i3(sp0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = c01Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                c01Var2.b.cancel();
                                c01Var2.b = null;
                            }
                            if (c01Var2.getVisibility() != 0) {
                                c01Var2.setAlpha(0.0f);
                                c01Var2.setVisibility(0);
                                ViewPropertyAnimator listener = c01Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                c01Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Components.f60) this.c).K((org.telegram.ui.Components.f60) this.b);
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.O0.run();
                Integer num = (Integer) view.getTag();
                int i23 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? org.telegram.messenger.hs.M2 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, privacySettingsActivity.getParentActivity(), null);
                s1Var.j0 = false;
                s1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i23;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new co0(privacySettingsActivity, s1Var, setaccountttl, i13));
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                org.telegram.ui.Components.ac.e();
                sf.c.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                long j10 = profileActivity2.e1;
                long j11 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                ip ipVar = new ip(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                ipVar.Y0 = new ou0(profileActivity2, chat, ipVar);
                profileActivity2.presentFragment(ipVar);
                break;
            case 13:
                mx0 mx0Var = (mx0) this.c;
                Context context5 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = mx0Var.a[0].getText().toString();
                String obj3 = mx0Var.a[3].getText().toString();
                String obj4 = mx0Var.a[2].getText().toString();
                String obj5 = mx0Var.a[1].getText().toString();
                String obj6 = mx0Var.a[4].getText().toString();
                try {
                    if (mx0Var.w == 3) {
                        m2.p0 a10 = ui.a.a();
                        a10.p(mx0Var.w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.f = obj6 != null ? obj6 : "";
                        mx0Var.b0(context5, a10.d().e());
                        break;
                    } else {
                        if (!TextUtils.isEmpty(obj2)) {
                            sb2.append("server=");
                            sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj5)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("port=");
                            sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                        }
                        if (mx0Var.w == 2) {
                            str = "https://t.me/proxy?";
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("secret=");
                            sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                        } else {
                            str = "https://t.me/socks?";
                            if (!TextUtils.isEmpty(obj4)) {
                                if (sb2.length() != 0) {
                                    sb2.append("&");
                                }
                                sb2.append("user=");
                                sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(obj3)) {
                                if (sb2.length() != 0) {
                                    sb2.append("&");
                                }
                                sb2.append("pass=");
                                sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                            }
                        }
                        if (sb2.length() != 0) {
                            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
                            l10.append(sb2.toString());
                            mx0Var.b0(context5, l10.toString());
                            break;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 14:
                wz0 wz0Var = (wz0) this.c;
                Context context6 = (Context) this.b;
                if (wz0Var.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    rb0 rb0Var = new rb0(21, wz0Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.t4.a;
                    if (context6 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                        hi.d dVar2 = new hi.d(context6, (org.telegram.ui.ActionBar.e6) null);
                        ((org.telegram.ui.ActionBar.t2) dVar2.b).w0 = false;
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(context6, null);
                        cb0Var.setTextColor(x02);
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        cb0Var.setItemCount(5);
                        org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context6, null);
                        a4Var.setItemCount(5);
                        a4Var.setTextColor(x02);
                        a4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context6, null);
                        b4Var.setItemCount(5);
                        b4Var.setTextColor(x02);
                        b4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context6, cb0Var, a4Var, b4Var, 4);
                        n3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(org.telegram.messenger.bd.M0(2131745536, null));
                        textView.setTextColor(x02);
                        k2.p1.t(textView, 1, 20.0f);
                        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new fi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ci.ec ecVar = new ci.ec(context6, 17);
                        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var.setMinValue(0);
                        cb0Var.setMaxValue(365);
                        cb0Var.setWrapSelectorWheel(false);
                        cb0Var.setFormatter(new org.telegram.ui.Components.c(5));
                        aa.a aVar = new aa.a(cb0Var, a4Var, b4Var, 19);
                        cb0Var.setOnValueChangedListener(aVar);
                        a4Var.setMinValue(0);
                        a4Var.setMaxValue(23);
                        linearLayout.addView(a4Var, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
                        a4Var.setFormatter(new org.telegram.ui.Components.c(7));
                        a4Var.setOnValueChangedListener(aVar);
                        b4Var.setMinValue(0);
                        b4Var.setMaxValue(59);
                        b4Var.setValue(0);
                        b4Var.setFormatter(new org.telegram.ui.Components.c(8));
                        linearLayout.addView(b4Var, b8.mf.l(0.3f, 0, org.telegram.messenger.hs.t4));
                        b4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 <= 0 || currentTimeMillis2 == 2147483646) {
                            i11 = x04;
                        } else {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i11 = x04;
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                b4Var.setValue(calendar.get(12));
                                a4Var.setValue(calendar.get(11));
                                cb0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.t4.g(null, null, 0L, 0L, 0, cb0Var, a4Var, b4Var);
                        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ecVar.setGravity(17);
                        ecVar.setTextColor(i11);
                        ecVar.setTextSize(1, 14.0f);
                        ecVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x05, x06, x06));
                        ecVar.setText(org.telegram.messenger.bd.M0(2131745538, null));
                        n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                        dVar = dVar2;
                        ecVar.setOnClickListener(new org.telegram.ui.Components.m1(cb0Var, a4Var, b4Var, calendar, rb0Var, dVar2, 0));
                        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
                        t2Var.O = n3Var;
                        t2Var.show();
                        t2Var.v0(x03);
                        t2Var.O(x03);
                    }
                    ci.h3 h3Var = new ci.h3(wz0Var, zArr, 13);
                    org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) dVar.b;
                    t2Var2.I0 = h3Var;
                    t2Var2.show();
                    wz0Var.x = t2Var2;
                    wz0Var.c(false);
                    break;
                }
                break;
            case 15:
                s11 s11Var = (s11) this.c;
                ci.q3 q3Var = (ci.q3) this.b;
                if (s11Var.S1.g() != 0) {
                    q3Var.a(new ArrayList(s11Var.T1.values()));
                    s11Var.dismiss();
                    break;
                }
                break;
            case 16:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.O0.run();
                Integer num2 = (Integer) view.getTag();
                int i24 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.hs.N2 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i24;
                sessionsActivity.s = i24;
                o21 o21Var = sessionsActivity.a;
                if (o21Var != null) {
                    o21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ei.u5(9));
                break;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(ci.wb.P0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 18:
                w31 w31Var = (w31) this.c;
                o41 o41Var = (o41) this.b;
                r41 r41Var = w31Var.e0;
                r41Var.getOrCreateStoryViewer().Q(r41Var.getParentActivity(), o41Var.b(), r41Var.D0, ei.i7.a(r41Var.T));
                break;
            case 19:
                a41 a41Var = (a41) this.c;
                og.f fVar = (og.f) this.b;
                int i25 = a41Var.c;
                b41 b41Var = a41Var.d;
                org.telegram.ui.Components.hz hzVar = a41Var.a;
                if (hzVar.c) {
                    ArrayList arrayList = b41Var.n;
                    mg.g gVar = b41Var.c;
                    int size = arrayList.size();
                    int i26 = 0;
                    while (true) {
                        if (i26 >= size) {
                            i14 = 1;
                        } else if (i26 == i25 || !((a41) arrayList.get(i26)).a.c || !((a41) arrayList.get(i26)).a.b) {
                            i26++;
                        }
                    }
                    b41Var.f();
                    if (i14 != 0) {
                        org.telegram.messenger.g0.F3(hzVar);
                        break;
                    } else {
                        hzVar.setChecked(!hzVar.b);
                        fVar.n = hzVar.b;
                        b41Var.b.z();
                        if (b41Var.r.c > 0 && i25 < gVar.d.size()) {
                            ((og.f) gVar.d.get(i25)).n = hzVar.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 20:
                o71 o71Var = (o71) this.c;
                Context context7 = (Context) this.b;
                if (o71Var.getParentActivity() != null) {
                    hi.d dVar3 = new hi.d(o71Var.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
                    ((org.telegram.ui.ActionBar.t2) dVar3.b).w0 = false;
                    LinearLayout f10 = org.telegram.messenger.k5.f(context7, 1);
                    TextView textView2 = new TextView(context7);
                    textView2.setText(org.telegram.messenger.bd.M0(2131752112, null));
                    org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                    f10.addView(textView2, b8.mf.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new fi.a(2));
                    ((org.telegram.ui.ActionBar.t2) dVar3.b).O = f10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i14 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i14);
                        TLRPC.TL_theme tL_theme = j6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i14++;
                    }
                    t51 t51Var = new t51(context7, o71Var, arrayList2, new ArrayList(), dVar3);
                    f10.addView(t51Var, b8.mf.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.hs.e2));
                    t51Var.A1(o71Var.fragmentView.getMeasuredWidth());
                    o71Var.showDialog((org.telegram.ui.ActionBar.t2) dVar3.b);
                    break;
                }
                break;
            case 21:
                zb1 zb1Var = (zb1) this.c;
                Context context8 = (Context) this.b;
                xg.e1 e1Var = zb1Var.N;
                if (e1Var != null) {
                    e1Var.dismiss();
                    zb1Var.N = null;
                }
                xg.e1 e1Var2 = new xg.e1(context8, zb1Var.a, null, 4, new ei.k0());
                TLRPC.User user = zb1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = zb1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i27 = 0; i27 < 2; i27++) {
                    e1Var2.v2.add(Long.valueOf(jArr[i27]));
                }
                e1Var2.o1(false, true);
                e1Var2.w2 = new kh.b(i12);
                zb1Var.N = e1Var2;
                e1Var2.show();
                break;
            case 22:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.c;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) this.b;
                if (!y1Var.m) {
                    x2Var.dismiss();
                    break;
                }
                break;
            case 23:
                gi.d dVar4 = (gi.d) this.c;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.b;
                if (!dVar4.R) {
                    y2Var.dismiss();
                    break;
                }
                break;
            case 24:
                a(view);
                break;
            case 25:
                b(view);
                break;
            case 26:
                c(view);
                break;
            case 27:
                d(view);
                break;
            case 28:
                e(view);
                break;
            default:
                gi.d dVar5 = (gi.d) this.c;
                int[] iArr = (int[]) this.b;
                if (!dVar5.R && (keVar = qc1.d) != null) {
                    dVar5.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i28 = keVar.i();
                        a9.j0 j0Var = new a9.j0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) keVar.d;
                        com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
                        a9.g0 g0Var = new a9.g0(n0Var, str2, "/tg-wear-auth/answer", i28);
                        n0Var.b.d(0, g0Var);
                        p6.m.m(g0Var, a9.i0.a).addOnSuccessListener(new b7(keVar, dVar5, iArr, 24)).addOnFailureListener(new oc1(dVar5, 0));
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        dVar5.setLoading(false);
                    }
                }
                break;
        }
    }
}
