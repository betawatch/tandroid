package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cd0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    private final void a(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        sg.q qVar = (sg.q) this.c;
        Context context = (Context) this.b;
        androidx.activity.n nVar = qVar.s1;
        switch (nVar.a) {
            case 1:
                z10 = nVar.b;
                break;
            default:
                z10 = nVar.b;
                break;
        }
        if (z10) {
            return;
        }
        androidx.activity.n nVar2 = qVar.s1;
        switch (nVar2.a) {
            case 1:
                view2 = (hi.v9) nVar2.d;
                break;
            default:
                view2 = (vp0) nVar2.d;
                break;
        }
        Bitmap L3 = org.telegram.messenger.g0.L3(view2);
        Bitmap createBitmap = Bitmap.createBitmap(L3.getWidth(), L3.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        androidx.activity.n nVar3 = qVar.s1;
        switch (nVar3.a) {
            case 1:
                hi.f5 f5Var = ((hi.v9) nVar3.d).y0;
                Matrix matrix = f5Var.getMatrix();
                canvas.save();
                canvas.translate(f5Var.getX(), f5Var.getY());
                canvas.concat(matrix);
                f5Var.getWidth();
                throw null;
            default:
                tg.b0 b0Var = ((vp0) nVar3.d).G0;
                Matrix matrix2 = b0Var.getMatrix();
                canvas.save();
                canvas.translate(b0Var.getX(), b0Var.getY());
                canvas.concat(matrix2);
                float width = b0Var.getWidth();
                Bitmap bitmap = (Bitmap) nVar3.c;
                canvas.scale(width / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                canvas.drawBitmap(L3, 0.0f, 0.0f, (Paint) null);
                L3.recycle();
                sg.i iVar = new sg.i(qVar, context, createBitmap);
                androidx.activity.n nVar4 = qVar.s1;
                switch (nVar4.a) {
                    case 1:
                        frameLayout = ((hi.v9) nVar4.d).F0;
                        break;
                    default:
                        frameLayout = ((vp0) nVar4.d).O0;
                        break;
                }
                frameLayout.addView(iVar, c8.ma.c(-1.0f, -1));
                androidx.activity.n nVar5 = qVar.s1;
                Objects.requireNonNull(nVar5);
                iVar.setColorListener(new bi.o8(nVar5, 6));
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(org.telegram.ui.Components.lr.f);
                duration.addUpdateListener(new hi.k3(iVar, 29));
                duration.start();
                androidx.activity.n nVar6 = qVar.s1;
                switch (nVar6.a) {
                    case 1:
                        nVar6.b = true;
                        break;
                    default:
                        nVar6.b = true;
                        break;
                }
                qVar.dismiss();
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i7;
        String str;
        boolean[] zArr;
        int i10;
        hi.w4 w4Var;
        a8.r7 r7Var;
        tg.b2 j3;
        int i11 = 16;
        int i12 = 5;
        int i13 = 2;
        int i14 = 0;
        switch (this.a) {
            case 0:
                hd0 hd0Var = (hd0) this.c;
                Context context = (Context) this.b;
                Bundle bundle = hd0Var.r0;
                if (bundle != null && (tL_auth_sentCode = hd0Var.s0) != null) {
                    hd0Var.v0.y1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!hd0Var.g0) {
                    fd0 fd0Var = hd0Var.w;
                    if ((fd0Var == null || fd0Var.getVisibility() == 8) && !hd0Var.l0) {
                        if (hd0Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = hd0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = hd0Var.c;
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
                            hd0Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131745876, null);
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751434, hd0Var.b));
                            alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131751435, null), new at(25, hd0Var, context));
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751437, null), new vc0(hd0Var, 1));
                            alertDialog$Builder.p();
                            break;
                        } else if (hd0Var.v0.W.getTag() == null) {
                            hd0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 1:
                de0 de0Var = (de0) this.c;
                Context context2 = (Context) this.b;
                Toast toast = de0Var.R;
                if (toast != null) {
                    toast.cancel();
                    de0Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (de0Var.P <= 0 || currentTimeMillis - de0Var.Q <= 1500) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    de0Var.P = 0;
                }
                int i15 = de0Var.P + 1;
                de0Var.P = i15;
                de0Var.Q = currentTimeMillis;
                if (i15 >= 5) {
                    de0Var.P = i7;
                    de0Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var.getContext());
                    alertDialog$Builder2.a.S = org.telegram.messenger.gd.M0(2131745291, null);
                    alertDialog$Builder2.f(new String[]{org.telegram.messenger.gd.M0(org.telegram.messenger.s2.a ? 2131751628 : 2131751620, null), org.telegram.messenger.gd.M0(2131751602, null)}, new k4(de0Var, i13));
                    alertDialog$Builder2.p();
                    break;
                } else if (i15 > 1) {
                    Toast makeText = Toast.makeText(context2, org.telegram.messenger.gd.G(5 - i15, "DebugMenuLoginToast", new Object[0]), 0);
                    de0Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 2:
                mg0 mg0Var = (mg0) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.b;
                og0 og0Var = mg0Var.d;
                if (!og0Var.g0(fjVar)) {
                    og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), fjVar.l, fi.y6.a(og0Var.f));
                    break;
                }
                break;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? org.telegram.messenger.ks.a2 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.u6.s(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.n6.l6 : org.telegram.ui.ActionBar.n6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 4:
                ml0.m0((ml0) this.c, (String) this.b, view);
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.Components.y60 y60Var = (org.telegram.ui.Components.y60) this.b;
                if (photoViewer.T4 != null) {
                    y60Var.v();
                    org.telegram.ui.ActionBar.h2 h2Var = photoViewer.m4;
                    if (h2Var instanceof bn) {
                        ((bn) h2Var).ma(photoViewer.T4, false, true);
                    }
                    vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.mp.u1(photoViewer.U).g6, false, false);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer2.F1() && !photoViewer2.r) {
                    int i16 = photoViewer2.P4;
                    if (i16 >= 0 && i16 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (!efVar.b || efVar.d()) {
                                efVar.z = Boolean.valueOf(!efVar.c());
                                photoViewer2.k1.setPhotoState(efVar.c());
                                boolean c10 = efVar.c();
                                hi.m3 m3Var = photoViewer2.l1;
                                if (m3Var != null) {
                                    m3Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hi.m3(photoViewer2.F, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.gd.M0(c10 ? 2131747068 : 2131747067, null));
                                    append.setSpan(new org.telegram.ui.Components.lq(c10 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.l1.v(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.p(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    hi.m3 m3Var2 = photoViewer2.l1;
                                    m3Var2.r0 = new sg(i13, m3Var2);
                                    m3Var2.d = 3500L;
                                    m3Var2.x();
                                }
                                org.telegram.messenger.bz.h1 = efVar.c();
                                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.bz.h1).apply();
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
                            qq0 qq0Var = photoViewer2.f0;
                            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01(activity);
                            n01Var.d = new org.telegram.ui.Components.ap0(n01Var, 18);
                            n01Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                            n01Var.setTextColor(-1);
                            n01Var.setTextSize(1, 14.0f);
                            n01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                            n01Var.setGravity(16);
                            qq0Var.addView(n01Var, c8.ma.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            n01Var.setVisibility(8);
                            photoViewer2.n1 = n01Var;
                        }
                        photoViewer2.n1.setText(org.telegram.messenger.gd.M0(2131743349, "VideoQualityIsTooLow"));
                        org.telegram.ui.Components.n01 n01Var2 = photoViewer2.n1;
                        org.telegram.ui.Components.s51 s51Var = photoViewer2.k1;
                        org.telegram.ui.Components.ap0 ap0Var = n01Var2.d;
                        if (s51Var != null) {
                            n01Var2.a = s51Var;
                            n01Var2.a();
                            n01Var2.c = true;
                            org.telegram.messenger.g0.r(ap0Var);
                            org.telegram.messenger.g0.h3(ap0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = n01Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                n01Var2.b.cancel();
                                n01Var2.b = null;
                            }
                            if (n01Var2.getVisibility() != 0) {
                                n01Var2.setAlpha(0.0f);
                                n01Var2.setVisibility(0);
                                ViewPropertyAnimator listener = n01Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                n01Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ((org.telegram.ui.Components.y60) this.c).L((org.telegram.ui.Components.y60) this.b);
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.M0.run();
                Integer num = (Integer) view.getTag();
                int i17 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? org.telegram.messenger.ks.M2 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, privacySettingsActivity.getParentActivity(), null);
                u1Var.j0 = false;
                u1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new mo0(privacySettingsActivity, u1Var, setaccountttl, i13));
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                long j10 = profileActivity2.e1;
                long j11 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                np npVar = new np(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                npVar.Y0 = new yu0(profileActivity2, chat, npVar);
                profileActivity2.presentFragment(npVar);
                break;
            case 11:
                yx0 yx0Var = (yx0) this.c;
                Context context3 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = yx0Var.a[0].getText().toString();
                String obj3 = yx0Var.a[3].getText().toString();
                String obj4 = yx0Var.a[2].getText().toString();
                String obj5 = yx0Var.a[1].getText().toString();
                String obj6 = yx0Var.a[4].getText().toString();
                try {
                    if (yx0Var.w == 3) {
                        n2.o0 a10 = xi.a.a();
                        a10.p(yx0Var.w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.f = obj6 != null ? obj6 : "";
                        yx0Var.b0(context3, a10.d().e());
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
                        if (yx0Var.w == 2) {
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
                            yx0Var.b0(context3, m10.toString());
                            break;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 12:
                h01 h01Var = (h01) this.c;
                Context context4 = (Context) this.b;
                if (h01Var.x == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    aj0 aj0Var = new aj0(i11, h01Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.b5.a;
                    if (context4 == null) {
                        w4Var = null;
                        zArr = zArr2;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Aj, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ej, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
                        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false);
                        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
                        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
                        hi.w4 w4Var2 = new hi.w4(context4, (org.telegram.ui.ActionBar.i6) null);
                        ((org.telegram.ui.ActionBar.x2) w4Var2.b).w0 = false;
                        org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(context4, null);
                        sb0Var.setTextColor(x02);
                        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        sb0Var.setItemCount(5);
                        org.telegram.ui.Components.i4 i4Var = new org.telegram.ui.Components.i4(context4, null);
                        i4Var.setItemCount(5);
                        i4Var.setTextColor(x02);
                        i4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(context4, null);
                        j4Var.setItemCount(5);
                        j4Var.setTextColor(x02);
                        j4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context4, sb0Var, i4Var, j4Var, 4);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context4);
                        v3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context4);
                        textView.setText(org.telegram.messenger.gd.M0(2131745331, null));
                        textView.setTextColor(x02);
                        i5.c.x(textView, 1, 20.0f);
                        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new gi.a(10));
                        LinearLayout linearLayout = new LinearLayout(context4);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.xb xbVar = new di.xb(context4, 17);
                        linearLayout.addView(sb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        sb0Var.setMinValue(0);
                        sb0Var.setMaxValue(365);
                        sb0Var.setWrapSelectorWheel(false);
                        sb0Var.setFormatter(new cr(13));
                        a3.h hVar = new a3.h(sb0Var, i4Var, j4Var, 20);
                        sb0Var.setOnValueChangedListener(hVar);
                        i4Var.setMinValue(0);
                        i4Var.setMaxValue(23);
                        linearLayout.addView(i4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
                        i4Var.setFormatter(new cr(14));
                        i4Var.setOnValueChangedListener(hVar);
                        j4Var.setMinValue(0);
                        j4Var.setMaxValue(59);
                        j4Var.setValue(0);
                        j4Var.setFormatter(new cr(16));
                        linearLayout.addView(j4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ks.t4));
                        j4Var.setOnValueChangedListener(hVar);
                        if (currentTimeMillis2 <= 0 || currentTimeMillis2 == 2147483646) {
                            zArr = zArr2;
                            i10 = x03;
                        } else {
                            long j12 = currentTimeMillis2 * 1000;
                            zArr = zArr2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i10 = x03;
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                j4Var.setValue(calendar.get(12));
                                i4Var.setValue(calendar.get(11));
                                sb0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.b5.g(null, null, 0L, 0L, 0, sb0Var, i4Var, j4Var);
                        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        xbVar.setGravity(17);
                        xbVar.setTextColor(x04);
                        xbVar.setTextSize(1, 14.0f);
                        xbVar.setTypeface(org.telegram.messenger.g0.o());
                        int L = org.telegram.messenger.g0.L(8.0f);
                        xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x05, x06, x06));
                        xbVar.setText(org.telegram.messenger.gd.M0(2131745333, null));
                        v3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                        w4Var = w4Var2;
                        xbVar.setOnClickListener(new org.telegram.ui.Components.v1(sb0Var, i4Var, j4Var, calendar, aj0Var, w4Var2, 0));
                        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
                        x2Var.O = v3Var;
                        x2Var.show();
                        x2Var.v0(i10);
                        x2Var.P(i10);
                    }
                    di.u1 u1Var2 = new di.u1(h01Var, zArr, 11);
                    org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) w4Var.b;
                    x2Var2.I0 = u1Var2;
                    x2Var2.show();
                    h01Var.x = x2Var2;
                    h01Var.c(false);
                    break;
                }
                break;
            case 13:
                d21 d21Var = (d21) this.c;
                bi.x4 x4Var = (bi.x4) this.b;
                if (d21Var.V1.g() != 0) {
                    x4Var.a(new ArrayList(d21Var.W1.values()));
                    d21Var.dismiss();
                    break;
                }
                break;
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.M0.run();
                Integer num2 = (Integer) view.getTag();
                int i18 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.ks.N2 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.s = i18;
                z21 z21Var = sessionsActivity.a;
                if (z21Var != null) {
                    z21Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.k5(9));
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(di.pb.P0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 16:
                h41 h41Var = (h41) this.c;
                z41 z41Var = (z41) this.b;
                c51 c51Var = h41Var.e0;
                c51Var.getOrCreateStoryViewer().I(c51Var.getParentActivity(), z41Var.b(), c51Var.D0, fi.y6.a(c51Var.T));
                break;
            case 17:
                l41 l41Var = (l41) this.c;
                ng.f fVar = (ng.f) this.b;
                int i19 = l41Var.c;
                m41 m41Var = l41Var.d;
                org.telegram.ui.Components.vz vzVar = l41Var.a;
                if (vzVar.c) {
                    ArrayList arrayList = m41Var.n;
                    lg.g gVar = m41Var.c;
                    int size = arrayList.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i14 = 1;
                        } else if (i20 == i19 || !((l41) arrayList.get(i20)).a.c || !((l41) arrayList.get(i20)).a.b) {
                            i20++;
                        }
                    }
                    m41Var.f();
                    if (i14 != 0) {
                        org.telegram.messenger.g0.D3(vzVar);
                        break;
                    } else {
                        vzVar.setChecked(!vzVar.b);
                        fVar.n = vzVar.b;
                        m41Var.b.z();
                        if (m41Var.r.c > 0 && i19 < gVar.d.size()) {
                            ((ng.f) gVar.d.get(i19)).n = vzVar.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 18:
                a81 a81Var = (a81) this.c;
                Context context5 = (Context) this.b;
                if (a81Var.getParentActivity() != null) {
                    hi.w4 w4Var3 = new hi.w4(a81Var.getParentActivity(), (org.telegram.ui.ActionBar.i6) null);
                    ((org.telegram.ui.ActionBar.x2) w4Var3.b).w0 = false;
                    LinearLayout g10 = org.telegram.messenger.f3.g(context5, 1);
                    TextView textView2 = new TextView(context5);
                    textView2.setText(org.telegram.messenger.gd.M0(2131752101, null));
                    org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.j5, null, 1, 20.0f);
                    g10.addView(textView2, c8.ma.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new gi.a(2));
                    ((org.telegram.ui.ActionBar.x2) w4Var3.b).O = g10;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.n6.F.size();
                    while (i14 < size2) {
                        org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) org.telegram.ui.ActionBar.n6.F.get(i14);
                        TLRPC.TL_theme tL_theme = m6Var.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(m6Var);
                        }
                        i14++;
                    }
                    e61 e61Var = new e61(context5, a81Var, arrayList2, new ArrayList(), w4Var3);
                    g10.addView(e61Var, c8.ma.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.ks.e2));
                    e61Var.A1(a81Var.fragmentView.getMeasuredWidth());
                    a81Var.showDialog((org.telegram.ui.ActionBar.x2) w4Var3.b);
                    break;
                }
                break;
            case 19:
                hc1 hc1Var = (hc1) this.c;
                Context context6 = (Context) this.b;
                wg.d1 d1Var = hc1Var.N;
                if (d1Var != null) {
                    d1Var.dismiss();
                    hc1Var.N = null;
                }
                wg.d1 d1Var2 = new wg.d1(context6, hc1Var.a, new fi.h0());
                TLRPC.User user = hc1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = hc1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i21 = 0; i21 < 2; i21++) {
                    d1Var2.t2.add(Long.valueOf(jArr[i21]));
                }
                d1Var2.l1(false, true);
                d1Var2.u2 = new jh.b(i12);
                hc1Var.N = d1Var2;
                d1Var2.show();
                break;
            case 20:
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) this.c;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.b;
                if (!h2Var2.m) {
                    d3Var.dismiss();
                    break;
                }
                break;
            case 21:
                hi.d dVar = (hi.d) this.c;
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.b;
                if (!dVar.R) {
                    e3Var.dismiss();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.b;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    l5Var.dismiss();
                    org.telegram.ui.Wallet.na naVar = new org.telegram.ui.Wallet.na();
                    naVar.n0(nftitem);
                    T.presentFragment(naVar);
                    break;
                }
                break;
            case 23:
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Wallet.e3[] e3VarArr = (org.telegram.ui.Wallet.e3[]) this.b;
                runnable.run();
                e3VarArr[0].dismiss();
                break;
            case 24:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                TextView textView3 = (TextView) this.b;
                d2Var.c(!d2Var.b(), true);
                textView3.setVisibility(d2Var.b() ? 0 : 8);
                break;
            case 25:
                hi.d dVar2 = (hi.d) this.c;
                int[] iArr = (int[]) this.b;
                if (!dVar2.R && (r7Var = yc1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j14 = r7Var.j();
                        b9.k0 k0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) r7Var.d;
                        com.google.android.gms.common.api.internal.p0 p0Var = k0Var.i;
                        b9.h0 h0Var = new b9.h0(p0Var, str2, "/tg-wear-auth/answer", j14);
                        p0Var.b.d(0, h0Var);
                        q6.m.n(h0Var, b9.j0.a).addOnSuccessListener(new z6(r7Var, dVar2, iArr, 24)).addOnFailureListener(new vc1(dVar2, 0));
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        dVar2.setLoading(false);
                        return;
                    }
                }
                break;
            case 26:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                w wVar = (w) this.b;
                kVar.b = true;
                wVar.run();
                kVar.x.g3.O(true);
                break;
            case 27:
                a(view);
                break;
            case 28:
                org.telegram.ui.Components.rn.i0((bn) this.b, 41026, new hi.t6((sh.c) this.c, 27), null);
                break;
            default:
                tg.e2 e2Var = (tg.e2) this.c;
                hi.lb lbVar = (hi.lb) this.b;
                tg.b2[] b2VarArr = e2Var.I;
                if (b2VarArr != null && b2VarArr.length != 0 && e2Var.J != null && (j3 = e2Var.j(e2Var.o0, e2Var.p0)) != null) {
                    lbVar.a(j3);
                    break;
                }
                break;
        }
    }
}
