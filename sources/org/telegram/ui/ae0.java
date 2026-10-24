package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ae0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        String str;
        com.google.android.gms.internal.cast.z5 z5Var;
        int i12 = 17;
        int i13 = 2;
        org.telegram.ui.ActionBar.b3 b3Var = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                be0 be0Var = (be0) this.c;
                Context context = (Context) this.b;
                ig0 ig0Var = be0Var.y;
                if (ig0Var.V.getTag() == null) {
                    if (be0Var.n.has_recovery) {
                        ig0Var.r1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new yd0(be0Var, 1), 10);
                        break;
                    } else {
                        AndroidUtilities.hideKeyboard(be0Var.a);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new xt(be0Var, 18));
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
            case 1:
                mf0 mf0Var = (mf0) this.c;
                Context context2 = (Context) this.b;
                Bundle bundle = mf0Var.q0;
                if (bundle != null && (tL_auth_sentCode = mf0Var.r0) != null) {
                    mf0Var.u0.k1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!mf0Var.f0) {
                    kf0 kf0Var = mf0Var.v;
                    if ((kf0Var == null || kf0Var.getVisibility() == 8) && !mf0Var.k0) {
                        if (mf0Var.i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = mf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = mf0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            mf0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, mf0Var.b));
                            alertDialog$Builder2.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ks(26, mf0Var, context2));
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder2.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new bf0(mf0Var, 1));
                            alertDialog$Builder2.p();
                            break;
                        } else if (mf0Var.u0.V.getTag() == null) {
                            mf0Var.w();
                            break;
                        }
                    }
                }
                break;
            case 2:
                hg0 hg0Var = (hg0) this.c;
                Context context3 = (Context) this.b;
                Toast toast = hg0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    hg0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (hg0Var.O <= 0 || currentTimeMillis - hg0Var.P <= 1500) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    hg0Var.O = 0;
                }
                int i15 = hg0Var.O + 1;
                hg0Var.O = i15;
                hg0Var.P = currentTimeMillis;
                if (i15 >= 5) {
                    hg0Var.O = i11;
                    hg0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hg0Var.getContext());
                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder3.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new o4(hg0Var, i13));
                    alertDialog$Builder3.p();
                    break;
                } else if (i15 > 1) {
                    Toast makeText = Toast.makeText(context3, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i15, new Object[0]), 0);
                    hg0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 3:
                wi0 wi0Var = (wi0) this.c;
                MessageObject messageObject = (MessageObject) this.b;
                yi0 yi0Var = wi0Var.d;
                if (!yi0Var.b0(messageObject)) {
                    yi0Var.getOrCreateStoryViewer().F(yi0Var.getParentActivity(), messageObject.storyItem, ci.q7.a(yi0Var.f));
                    break;
                }
                break;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.r6.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 5:
                io0.h0((io0) this.c, (String) this.b, view);
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) this.b;
                if (photoViewer.T4 != null) {
                    j80Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.m4;
                    if (o2Var instanceof sn) {
                        ((sn) o2Var).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.J1() && !photoViewer2.r) {
                    int i16 = photoViewer2.P4;
                    if (i16 >= 0 && i16 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ei.x3 x3Var = photoViewer2.k1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new ei.x3(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.xq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ei.x3 x3Var2 = photoViewer2.k1;
                                    x3Var2.l0 = new dh(i13, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.a3(true);
                        photoViewer2.r2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            eu0 eu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.z21 z21Var = new org.telegram.ui.Components.z21(activity);
                            z21Var.d = new org.telegram.ui.Components.kr0(z21Var, 18);
                            z21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(3.0f), -871296751));
                            z21Var.setTextColor(-1);
                            z21Var.setTextSize(1, 14.0f);
                            z21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            z21Var.setGravity(16);
                            eu0Var.addView(z21Var, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            z21Var.setVisibility(8);
                            photoViewer2.m1 = z21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.z21 z21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.w71 w71Var = photoViewer2.j1;
                        org.telegram.ui.Components.kr0 kr0Var = z21Var2.d;
                        if (w71Var != null) {
                            z21Var2.a = w71Var;
                            z21Var2.a();
                            z21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(kr0Var);
                            AndroidUtilities.runOnUIThread(kr0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = z21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                z21Var2.b.cancel();
                                z21Var2.b = null;
                            }
                            if (z21Var2.getVisibility() != 0) {
                                z21Var2.setAlpha(0.0f);
                                z21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = z21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                z21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Components.j80) this.c).K((org.telegram.ui.Components.j80) this.b);
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.N0.run();
                Integer num = (Integer) view.getTag();
                int i17 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 182 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.i0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new wr0(privacySettingsActivity, c2Var, setaccountttl, i13));
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                long j10 = profileActivity2.f1;
                long j11 = profileActivity2.F1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                dq dqVar = new dq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                dqVar.Y0 = new uy0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                break;
            case 12:
                w11 w11Var = (w11) this.c;
                Context context4 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = w11Var.a[0].getText().toString();
                String obj3 = w11Var.a[3].getText().toString();
                String obj4 = w11Var.a[2].getText().toString();
                String obj5 = w11Var.a[1].getText().toString();
                String obj6 = w11Var.a[4].getText().toString();
                try {
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
                    if (w11Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
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
                        str = "https://t.me/socks?";
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context4, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        jj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        w11Var.showDialog(jj0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 13:
                q41 q41Var = (q41) this.c;
                Context context5 = (Context) this.b;
                if (q41Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    ql0 ql0Var = new ql0(15, q41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.f5.a;
                    if (context5 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context5, null);
                        b3Var2.a();
                        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(context5, null);
                        qd0Var.setTextColor(x02);
                        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        qd0Var.setItemCount(5);
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context5, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(x02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(context5, null);
                        h4Var.setItemCount(5);
                        h4Var.setTextColor(x02);
                        h4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context5, qd0Var, g4Var, h4Var, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context5);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new di.d(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.wd wdVar = new ai.wd(context5, 17);
                        linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                        qd0Var.setMinValue(0);
                        qd0Var.setMaxValue(365);
                        qd0Var.setWrapSelectorWheel(false);
                        qd0Var.setFormatter(new tr(15));
                        ai.u2 u2Var = new ai.u2(qd0Var, g4Var, h4Var, 18);
                        qd0Var.setOnValueChangedListener(u2Var);
                        g4Var.setMinValue(0);
                        g4Var.setMaxValue(23);
                        linearLayout.addView(g4Var, w7.z5.l(0.2f, 0, 270));
                        g4Var.setFormatter(new tr(16));
                        g4Var.setOnValueChangedListener(u2Var);
                        h4Var.setMinValue(0);
                        h4Var.setMaxValue(59);
                        h4Var.setValue(0);
                        h4Var.setFormatter(new tr(17));
                        linearLayout.addView(h4Var, w7.z5.l(0.3f, 0, 270));
                        h4Var.setOnValueChangedListener(u2Var);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                h4Var.setValue(calendar.get(12));
                                g4Var.setValue(calendar.get(11));
                                qd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.f5.g(null, null, 0L, 0L, 0, qd0Var, g4Var, h4Var);
                        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        wdVar.setGravity(17);
                        wdVar.setTextColor(x04);
                        wdVar.setTextSize(1, 14.0f);
                        wdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x05, x06, x06));
                        wdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(qd0Var, g4Var, h4Var, calendar, ql0Var, b3Var2, 1);
                        org.telegram.ui.ActionBar.b3 b3Var3 = b3Var2;
                        wdVar.setOnClickListener(m0Var);
                        b3Var3.b(w3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = b3Var3.a;
                        h3Var.show();
                        h3Var.setBackgroundColor(x03);
                        h3Var.fixNavigationBar(x03);
                        b3Var = b3Var3;
                    }
                    b3Var.a.setOnHideListener(new ai.z3(q41Var, zArr, 13));
                    org.telegram.ui.ActionBar.h3 h3Var2 = b3Var.a;
                    h3Var2.show();
                    q41Var.w = h3Var2;
                    q41Var.c(false);
                    break;
                }
                break;
            case 14:
                o61 o61Var = (o61) this.c;
                ai.k4 k4Var = (ai.k4) this.b;
                if (o61Var.Z.g() != 0) {
                    k4Var.run(new ArrayList(o61Var.a0.values()));
                    o61Var.dismiss();
                    break;
                }
                break;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.N0.run();
                Integer num2 = (Integer) view.getTag();
                int i18 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 183 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.s = i18;
                l71 l71Var = sessionsActivity.a;
                if (l71Var != null) {
                    l71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ci.d6(r9));
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(ai.nd.N0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 17:
                z81 z81Var = (z81) this.c;
                r91 r91Var = (r91) this.b;
                u91 u91Var = z81Var.d0;
                u91Var.getOrCreateStoryViewer().C(u91Var.getParentActivity(), r91Var.b(), u91Var.z0, ci.q7.a(u91Var.S));
                break;
            case 18:
                d91 d91Var = (d91) this.c;
                lg.f fVar = (lg.f) this.b;
                int i19 = d91Var.c;
                e91 e91Var = d91Var.d;
                org.telegram.ui.Components.a10 a10Var = d91Var.a;
                if (a10Var.c) {
                    ArrayList arrayList = e91Var.n;
                    jg.g gVar = e91Var.c;
                    int size = arrayList.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i14 = 1;
                        } else if (i20 == i19 || !((d91) arrayList.get(i20)).a.c || !((d91) arrayList.get(i20)).a.b) {
                            i20++;
                        }
                    }
                    e91Var.f();
                    if (i14 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        break;
                    } else {
                        a10Var.setChecked(!a10Var.b);
                        fVar.n = a10Var.b;
                        e91Var.b.z();
                        if (e91Var.r.c > 0 && i19 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i19)).n = a10Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 19:
                ca1 ca1Var = (ca1) this.c;
                ey eyVar = (ey) this.b;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eyVar.getParentActivity());
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.k(LocaleController.getString(R.string.CacheClear), new ql0(i12, ca1Var, eyVar));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.a;
                eyVar.showDialog(c2Var2);
                TextView textView2 = (TextView) c2Var2.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                    break;
                }
                break;
            case 20:
                uc1 uc1Var = (uc1) this.c;
                Context context6 = (Context) this.b;
                if (uc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b3 b3Var4 = new org.telegram.ui.ActionBar.b3(uc1Var.getParentActivity(), null);
                    b3Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context6);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context6);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.v0.q(textView3, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                    linearLayout2.addView(textView3, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new di.d(2));
                    b3Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i14 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i14);
                        TLRPC.TL_theme tL_theme = j6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i14++;
                    }
                    wa1 wa1Var = new wa1(context6, uc1Var, arrayList2, new ArrayList(), b3Var4);
                    linearLayout2.addView(wa1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    wa1Var.D1(uc1Var.fragmentView.getMeasuredWidth());
                    uc1Var.showDialog(b3Var4.a);
                    break;
                }
                break;
            case 21:
                oh1 oh1Var = (oh1) this.c;
                Context context7 = (Context) this.b;
                ug.l1 l1Var = oh1Var.M;
                if (l1Var != null) {
                    l1Var.dismiss();
                    oh1Var.M = null;
                }
                ug.l1 l1Var2 = new ug.l1(context7, oh1Var.a, null, 4, new ci.k0());
                TLRPC.User user = oh1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = oh1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i21 = 0; i21 < 2; i21++) {
                    l1Var2.C0.add(Long.valueOf(jArr[i21]));
                }
                l1Var2.h0(false, true);
                l1Var2.D0 = new ih.b(i13);
                oh1Var.M = l1Var2;
                l1Var2.show();
                break;
            case 22:
                ei.d dVar = (ei.d) this.c;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.b;
                if (!dVar.Q) {
                    j2Var.dismiss();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.c;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.b;
                if (!a2Var.m) {
                    i2Var.dismiss();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.b;
                if (y2Var.e && !y2Var.R) {
                    org.telegram.ui.Wallet.o5.E0(y2Var.getContext(), o2Var2.getCurrentAccount(), o2Var2.getResourceProvider());
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Wallet.j4 j4Var = (org.telegram.ui.Wallet.j4) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.b;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    j4Var.dismiss();
                    org.telegram.ui.Wallet.s9 s9Var = new org.telegram.ui.Wallet.s9();
                    s9Var.i0(nftitem);
                    U.presentFragment(s9Var);
                    break;
                }
                break;
            case 26:
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.b;
                runnable.run();
                j2VarArr[0].dismiss();
                break;
            case 27:
                org.telegram.ui.Wallet.o5.g0((org.telegram.ui.Wallet.o5) this.c, (Context) this.b, view);
                break;
            case 28:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                TextView textView4 = (TextView) this.b;
                z1Var.c(!z1Var.b(), true);
                textView4.setVisibility(z1Var.b() ? 0 : 8);
                break;
            default:
                ei.d dVar2 = (ei.d) this.c;
                int[] iArr = (int[]) this.b;
                if (!dVar2.Q && (z5Var = gi1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = z5Var.h();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) z5Var.a;
                        com.google.android.gms.common.api.internal.s0 s0Var = v0Var.h;
                        b8.e eVar = new b8.e(s0Var, str2, "/tg-wear-auth/answer", h);
                        s0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new e7(z5Var, dVar2, iArr, 24)).addOnFailureListener(new ei1(dVar2, i14));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar2.setLoading(false);
                    }
                }
                break;
        }
    }
}
