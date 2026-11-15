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
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a90(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        ec1 ec1Var = (ec1) this.b;
        Context context = (Context) this.c;
        wg.c1 c1Var = ec1Var.N;
        if (c1Var != null) {
            c1Var.dismiss();
            ec1Var.N = null;
        }
        wg.c1 c1Var2 = new wg.c1(context, ec1Var.a, null, 4, new fi.i0());
        TLRPC.User user = ec1Var.c;
        long j3 = user != null ? user.id : 0L;
        TLRPC.User user2 = ec1Var.d;
        long[] jArr = {j3, user2 != null ? user2.id : 0L};
        for (int i7 = 0; i7 < 2; i7++) {
            c1Var2.y2.add(Long.valueOf(jArr[i7]));
        }
        c1Var2.o1(false, true);
        c1Var2.z2 = new jh.b(5);
        ec1Var.N = c1Var2;
        c1Var2.show();
    }

    private final void b(View view) {
        org.telegram.ui.Wallet.w4 w4Var = (org.telegram.ui.Wallet.w4) this.b;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        w4Var.dismiss();
        org.telegram.ui.Wallet.z9 z9Var = new org.telegram.ui.Wallet.z9();
        z9Var.n0(nftitem);
        T.presentFragment(z9Var);
    }

    private final void c(View view) {
        org.telegram.ui.Wallet.y5.l0((org.telegram.ui.Wallet.y5) this.b, (Context) this.c, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c10;
        char c11;
        ?? r14;
        String a02;
        int i7;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        String str;
        d01 d01Var;
        int i11 = 2;
        org.telegram.messenger.ou ouVar = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                i90 i90Var = (i90) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (i90Var.e == null) {
                    f90 f90Var = i90Var.f;
                    if (!f90Var.e.h) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        Switch r42 = q8Var.e;
                        q8Var.setChecked(!r42.h);
                        i90Var.r.setVisibility(r42.h ? 0 : 8);
                        org.telegram.messenger.g0.r(runnableArr[0]);
                        if (!r42.h) {
                            i90Var.f.setCheckBoxIcon(0);
                            i90Var.h.setText(org.telegram.messenger.hd.M0(2131754202, null));
                            b90 b90Var = new b90(i90Var, i11);
                            runnableArr[0] = b90Var;
                            org.telegram.messenger.g0.h3(b90Var);
                            break;
                        } else {
                            i90Var.f.setChecked(false);
                            i90Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            i90Var.h.setText(org.telegram.messenger.hd.M0(2131754201, null));
                            b90 b90Var2 = new b90(i90Var, 1);
                            runnableArr[0] = b90Var2;
                            org.telegram.messenger.g0.i3(b90Var2, 60L);
                            break;
                        }
                    } else {
                        int i13 = -i90Var.N;
                        i90Var.N = i13;
                        org.telegram.messenger.g0.F3(i13, f90Var, null);
                        break;
                    }
                }
                break;
            case 1:
                pa0 pa0Var = (pa0) this.b;
                pa0Var.B0((la0) this.c);
                ka0 ka0Var = pa0Var.K0;
                if (ka0Var != null) {
                    ka0Var.dismiss();
                    break;
                }
                break;
            case 2:
                ob0 ob0Var = (ob0) this.b;
                Context context = (Context) this.c;
                String string = ob0Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0();
                    wy0Var.a |= 256;
                    wy0Var.b = indexOf;
                    int i14 = lastIndexOf + 1;
                    wy0Var.c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy0(wy0Var, 0), indexOf, i14, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131748728, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748732, null));
                int i15 = ob0Var.H;
                int i16 = i15 / 86400;
                int i17 = i15 % 86400;
                int i18 = i17 / 3600;
                int i19 = (i17 % 3600) / 60;
                if (i16 == 0 && i18 == 0) {
                    i19 = Math.max(1, i19);
                }
                if (i16 == 0 || i18 == 0) {
                    c10 = 0;
                    if (i18 == 0 || i19 == 0) {
                        c11 = 1;
                        r14 = 0;
                        r14 = 0;
                        r14 = 0;
                        a02 = i16 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i16, "Days", new Object[0])) : i18 != 0 ? org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i16, "Hours", new Object[0])) : org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i19, "Minutes", new Object[0]));
                    } else {
                        c11 = 1;
                        r14 = 0;
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131748735, org.telegram.messenger.hd.G(i18, "Hours", new Object[0]), org.telegram.messenger.hd.G(i19, "Minutes", new Object[0]));
                    }
                } else {
                    c10 = 0;
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131748735, org.telegram.messenger.hd.G(i16, "Days", new Object[0]), org.telegram.messenger.hd.G(i18, "Hours", new Object[0]));
                    r14 = 0;
                    c11 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = a02;
                alertDialog$Builder.a.U = org.telegram.messenger.g0.m0(X2, charSequenceArr);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748736, r14), new zr(ob0Var, 19));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                alertDialog$Builder.p();
                break;
            case 3:
                wb0 wb0Var = (wb0) this.b;
                Context context2 = (Context) this.c;
                ce0 ce0Var = wb0Var.E;
                if (ce0Var.W.getTag() == null) {
                    if (!wb0Var.n.has_recovery) {
                        org.telegram.messenger.g0.v1(wb0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.S = org.telegram.messenger.hd.M0(2131746071, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.hd.M0(2131746073, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131746117, null), new zr(wb0Var, 20));
                        alertDialog$Builder2.p();
                        break;
                    } else {
                        ce0Var.F1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_requestPasswordRecovery, new ub0(wb0Var, 1), 10);
                        break;
                    }
                }
                break;
            case 4:
                ed0 ed0Var = (ed0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle = ed0Var.r0;
                if (bundle != null && (tL_auth_sentCode = ed0Var.s0) != null) {
                    ed0Var.v0.y1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!ed0Var.g0) {
                    cd0 cd0Var = ed0Var.w;
                    if ((cd0Var == null || cd0Var.getVisibility() == 8) && !ed0Var.l0) {
                        if (ed0Var.j0 != 0) {
                            if (ed0Var.v0.W.getTag() == null) {
                                ed0Var.v();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = ed0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = ed0Var.c;
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
                            ed0Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131746071, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751445, ed0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.hd.M0(2131751446, null), new tr(26, ed0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131751448, null), new uc0(ed0Var, 1));
                            alertDialog$Builder3.p();
                            break;
                        }
                    }
                }
                break;
            case 5:
                be0 be0Var = (be0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = be0Var.R;
                if (toast != null) {
                    toast.cancel();
                    be0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (be0Var.P <= 0 || currentTimeMillis - be0Var.Q <= 1500) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    be0Var.P = 0;
                }
                int i20 = be0Var.P + 1;
                be0Var.P = i20;
                be0Var.Q = currentTimeMillis;
                if (i20 < 5) {
                    if (i20 > 1) {
                        Toast makeText = Toast.makeText(context4, org.telegram.messenger.hd.G(5 - i20, "DebugMenuLoginToast", new Object[0]), 0);
                        be0Var.R = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    be0Var.P = i10;
                    be0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(be0Var.getContext());
                    alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131745486, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.hd.M0(org.telegram.messenger.r2.a ? 2131751639 : 2131751631, null), org.telegram.messenger.hd.M0(2131751613, null)}, new k4(be0Var, i11));
                    alertDialog$Builder4.p();
                    break;
                }
                break;
            case 6:
                hg0 hg0Var = (hg0) this.b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.c;
                jg0 jg0Var = hg0Var.d;
                if (!jg0Var.g0(gjVar)) {
                    jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), gjVar.l, fi.b7.a(jg0Var.f));
                    break;
                }
                break;
            case 7:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? org.telegram.messenger.ns.a2 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.q6.s(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 8:
                kl0.m0((kl0) this.b, (String) this.c, view);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) this.c;
                if (photoViewer.T4 != null) {
                    m60Var.u();
                    org.telegram.ui.ActionBar.e2 e2Var = photoViewer.m4;
                    if (e2Var instanceof an) {
                        ((an) e2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.np.s1(photoViewer.U).e6, false, false);
                    break;
                }
                break;
            case 10:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer2.F1() && !photoViewer2.r) {
                    int i21 = photoViewer2.P4;
                    if (i21 >= 0 && i21 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (!ffVar.b || ffVar.d()) {
                                ffVar.z = Boolean.valueOf(!ffVar.c());
                                photoViewer2.k1.setPhotoState(ffVar.c());
                                boolean c12 = ffVar.c();
                                hi.l3 l3Var = photoViewer2.l1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.l3(photoViewer2.F, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.hd.M0(c12 ? 2131747261 : 2131747260, null));
                                    append.setSpan(new org.telegram.ui.Components.eq(c12 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.l1.u(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    hi.l3 l3Var2 = photoViewer2.l1;
                                    l3Var2.r0 = new sg(i11, l3Var2);
                                    l3Var2.d = 3500L;
                                    l3Var2.w();
                                }
                                org.telegram.messenger.gz.h1 = ffVar.c();
                                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.gz.h1).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() != null) {
                        photoViewer2.W2(true);
                        photoViewer2.n2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.n1 == null) {
                            oq0 oq0Var = photoViewer2.f0;
                            org.telegram.ui.Components.f01 f01Var = new org.telegram.ui.Components.f01(activity);
                            f01Var.d = new org.telegram.ui.Components.ro0(f01Var, 18);
                            f01Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                            f01Var.setTextColor(-1);
                            f01Var.setTextSize(1, 14.0f);
                            f01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                            f01Var.setGravity(16);
                            oq0Var.addView(f01Var, c8.ja.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            f01Var.setVisibility(8);
                            photoViewer2.n1 = f01Var;
                        }
                        photoViewer2.n1.setText(org.telegram.messenger.hd.M0(2131743586, "VideoQualityIsTooLow"));
                        org.telegram.ui.Components.f01 f01Var2 = photoViewer2.n1;
                        org.telegram.ui.Components.i51 i51Var = photoViewer2.k1;
                        org.telegram.ui.Components.ro0 ro0Var = f01Var2.d;
                        if (i51Var != null) {
                            f01Var2.a = i51Var;
                            f01Var2.a();
                            f01Var2.c = true;
                            org.telegram.messenger.g0.r(ro0Var);
                            org.telegram.messenger.g0.i3(ro0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = f01Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                f01Var2.b.cancel();
                                f01Var2.b = null;
                            }
                            if (f01Var2.getVisibility() != 0) {
                                f01Var2.setAlpha(0.0f);
                                f01Var2.setVisibility(0);
                                ViewPropertyAnimator listener = f01Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                f01Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                ((org.telegram.ui.Components.m60) this.b).K((org.telegram.ui.Components.m60) this.c);
                break;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.M0.run();
                Integer num = (Integer) view.getTag();
                int i22 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? org.telegram.messenger.ns.M2 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, privacySettingsActivity.getParentActivity(), null);
                t1Var.j0 = false;
                t1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i22;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new jo0(privacySettingsActivity, t1Var, setaccountttl, i11));
                break;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                org.telegram.ui.Components.xb.e();
                vf.c.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j3 = profileActivity2.e1;
                long j10 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                mp mpVar = new mp(j3, j10, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                mpVar.Y0 = new wu0(profileActivity2, chat, mpVar);
                profileActivity2.presentFragment(mpVar);
                break;
            case 15:
                tx0 tx0Var = (tx0) this.b;
                Context context5 = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = tx0Var.a[0].getText().toString();
                String obj3 = tx0Var.a[3].getText().toString();
                String obj4 = tx0Var.a[2].getText().toString();
                String obj5 = tx0Var.a[1].getText().toString();
                String obj6 = tx0Var.a[4].getText().toString();
                try {
                    if (tx0Var.w != 3) {
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
                        if (tx0Var.w == 2) {
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
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                            m10.append(sb2.toString());
                            tx0Var.b0(context5, m10.toString());
                            break;
                        }
                    } else {
                        n2.o0 a10 = xi.a.a();
                        a10.q(tx0Var.w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.f = obj6 != null ? obj6 : "";
                        tx0Var.b0(context5, a10.d().e());
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 16:
                d01 d01Var2 = (d01) this.b;
                Context context6 = (Context) this.c;
                if (d01Var2.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    xi0 xi0Var = new xi0(17, d01Var2, zArr);
                    Pattern pattern = org.telegram.ui.Components.t4.a;
                    if (context6 == null) {
                        d01Var = d01Var2;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Aj, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ej, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
                        org.telegram.messenger.ou ouVar2 = new org.telegram.messenger.ou(context6, (org.telegram.ui.ActionBar.e6) null);
                        ((org.telegram.ui.ActionBar.u2) ouVar2.b).w0 = false;
                        org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(context6, null);
                        ib0Var.setTextColor(x02);
                        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        ib0Var.setItemCount(5);
                        org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context6, null);
                        a4Var.setItemCount(5);
                        a4Var.setTextColor(x02);
                        a4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context6, null);
                        b4Var.setItemCount(5);
                        b4Var.setTextColor(x02);
                        b4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context6, ib0Var, a4Var, b4Var, 4);
                        n3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(org.telegram.messenger.hd.M0(2131745526, null));
                        textView.setTextColor(x02);
                        i5.c.v(textView, 1, 20.0f);
                        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.tb tbVar = new di.tb(context6, 17);
                        linearLayout.addView(ib0Var, c8.ja.l(0.5f, 0, org.telegram.messenger.ns.t4));
                        ib0Var.setMinValue(0);
                        ib0Var.setMaxValue(365);
                        ib0Var.setWrapSelectorWheel(false);
                        ib0Var.setFormatter(new br(12));
                        a3.h hVar = new a3.h(ib0Var, a4Var, b4Var, 20);
                        ib0Var.setOnValueChangedListener(hVar);
                        a4Var.setMinValue(0);
                        a4Var.setMaxValue(23);
                        linearLayout.addView(a4Var, c8.ja.l(0.2f, 0, org.telegram.messenger.ns.t4));
                        a4Var.setFormatter(new br(13));
                        a4Var.setOnValueChangedListener(hVar);
                        b4Var.setMinValue(0);
                        b4Var.setMaxValue(59);
                        b4Var.setValue(0);
                        b4Var.setFormatter(new br(15));
                        linearLayout.addView(b4Var, c8.ja.l(0.3f, 0, org.telegram.messenger.ns.t4));
                        b4Var.setOnValueChangedListener(hVar);
                        if (currentTimeMillis2 <= 0 || currentTimeMillis2 == 2147483646) {
                            d01Var = d01Var2;
                        } else {
                            long j11 = currentTimeMillis2 * 1000;
                            d01Var = d01Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j11);
                            if (timeInMillis >= 0) {
                                b4Var.setValue(calendar.get(12));
                                a4Var.setValue(calendar.get(11));
                                ib0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.t4.g(null, null, 0L, 0L, 0, ib0Var, a4Var, b4Var);
                        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        tbVar.setGravity(17);
                        tbVar.setTextColor(x04);
                        tbVar.setTextSize(1, 14.0f);
                        tbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x05, x06, x06));
                        tbVar.setText(org.telegram.messenger.hd.M0(2131745528, null));
                        n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                        ouVar = ouVar2;
                        tbVar.setOnClickListener(new org.telegram.ui.Components.l1(ib0Var, a4Var, b4Var, calendar, xi0Var, ouVar2, 0));
                        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
                        u2Var.O = n3Var;
                        u2Var.show();
                        u2Var.v0(x03);
                        u2Var.P(x03);
                    }
                    di.a3 a3Var = new di.a3(d01Var, zArr, 13);
                    org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) ouVar.b;
                    u2Var2.I0 = a3Var;
                    u2Var2.show();
                    d01Var.x = u2Var2;
                    d01Var.c(false);
                    break;
                }
                break;
            case 17:
                z11 z11Var = (z11) this.b;
                di.h3 h3Var = (di.h3) this.c;
                if (z11Var.V1.g() != 0) {
                    h3Var.a(new ArrayList(z11Var.W1.values()));
                    z11Var.dismiss();
                    break;
                }
                break;
            case 18:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.M0.run();
                Integer num2 = (Integer) view.getTag();
                int i23 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.ns.N2 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i23;
                sessionsActivity.s = i23;
                v21 v21Var = sessionsActivity.a;
                if (v21Var != null) {
                    v21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.m5(9));
                break;
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(di.lb.P0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 20:
                e41 e41Var = (e41) this.b;
                w41 w41Var = (w41) this.c;
                z41 z41Var = e41Var.e0;
                z41Var.getOrCreateStoryViewer().I(z41Var.getParentActivity(), w41Var.b(), z41Var.D0, fi.b7.a(z41Var.T));
                break;
            case 21:
                i41 i41Var = (i41) this.b;
                ng.f fVar = (ng.f) this.c;
                int i24 = i41Var.c;
                j41 j41Var = i41Var.d;
                org.telegram.ui.Components.oz ozVar = i41Var.a;
                if (ozVar.c) {
                    ArrayList arrayList = j41Var.n;
                    lg.g gVar = j41Var.c;
                    int size = arrayList.size();
                    int i25 = 0;
                    while (true) {
                        if (i25 >= size) {
                            i12 = 1;
                        } else if (i25 == i24 || !((i41) arrayList.get(i25)).a.c || !((i41) arrayList.get(i25)).a.b) {
                            i25++;
                        }
                    }
                    j41Var.f();
                    if (i12 == 0) {
                        ozVar.setChecked(!ozVar.b);
                        fVar.n = ozVar.b;
                        j41Var.b.z();
                        if (j41Var.r.c > 0 && i24 < gVar.d.size()) {
                            ((ng.f) gVar.d.get(i24)).n = ozVar.b;
                            gVar.z();
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.E3(ozVar);
                        break;
                    }
                }
                break;
            case 22:
                w71 w71Var = (w71) this.b;
                Context context7 = (Context) this.c;
                if (w71Var.getParentActivity() != null) {
                    org.telegram.messenger.ou ouVar3 = new org.telegram.messenger.ou(w71Var.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
                    ((org.telegram.ui.ActionBar.u2) ouVar3.b).w0 = false;
                    LinearLayout f10 = org.telegram.messenger.k5.f(context7, 1);
                    TextView textView2 = new TextView(context7);
                    textView2.setText(org.telegram.messenger.hd.M0(2131752112, null));
                    org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.j5, null, 1, 20.0f);
                    f10.addView(textView2, c8.ja.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.u2) ouVar3.b).O = f10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i12 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i12);
                        TLRPC.TL_theme tL_theme = i6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i12++;
                    }
                    a61 a61Var = new a61(context7, w71Var, arrayList2, new ArrayList(), ouVar3);
                    f10.addView(a61Var, c8.ja.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.ns.e2));
                    a61Var.A1(w71Var.fragmentView.getMeasuredWidth());
                    w71Var.showDialog((org.telegram.ui.ActionBar.u2) ouVar3.b);
                    break;
                }
                break;
            case 23:
                a(view);
                break;
            case 24:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.b;
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) this.c;
                if (!z1Var.m) {
                    w2Var.dismiss();
                    break;
                }
                break;
            case 25:
                hi.d dVar = (hi.d) this.b;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) this.c;
                if (!dVar.R) {
                    x2Var.dismiss();
                    break;
                }
                break;
            case 26:
                b(view);
                break;
            case 27:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Wallet.x2[] x2VarArr = (org.telegram.ui.Wallet.x2[]) this.c;
                runnable.run();
                x2VarArr[0].dismiss();
                break;
            case 28:
                c(view);
                break;
            default:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                TextView textView3 = (TextView) this.c;
                c2Var.c(!c2Var.b(), true);
                textView3.setVisibility(c2Var.b() ? 0 : 8);
                break;
        }
    }
}
