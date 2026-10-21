package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cf0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        String str;
        com.google.android.gms.internal.cast.z5 z5Var;
        int i11 = 24;
        int i12 = 2;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                hf0 hf0Var = (hf0) this.c;
                Context context = (Context) this.b;
                Bundle bundle = hf0Var.o0;
                if (bundle != null && (tL_auth_sentCode = hf0Var.p0) != null) {
                    hf0Var.s0.g1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!hf0Var.d0) {
                    ff0 ff0Var = hf0Var.v;
                    if ((ff0Var == null || ff0Var.getVisibility() == 8) && !hf0Var.i0) {
                        if (hf0Var.g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = hf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = hf0Var.c;
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
                            hf0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, hf0Var.b));
                            alertDialog$Builder.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new xu(i11, hf0Var, context));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new ue0(hf0Var, 1));
                            alertDialog$Builder.o();
                            break;
                        } else if (hf0Var.s0.V.getTag() == null) {
                            hf0Var.x();
                            break;
                        }
                    }
                }
                break;
            case 1:
                cg0 cg0Var = (cg0) this.c;
                Context context2 = (Context) this.b;
                Toast toast = cg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    cg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (cg0Var.M <= 0 || currentTimeMillis - cg0Var.N <= 1500) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    cg0Var.M = 0;
                }
                int i14 = cg0Var.M + 1;
                cg0Var.M = i14;
                cg0Var.N = currentTimeMillis;
                if (i14 >= 5) {
                    cg0Var.M = i10;
                    cg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg0Var.getContext());
                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder2.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new p4(cg0Var, i12));
                    alertDialog$Builder2.o();
                    break;
                } else if (i14 > 1) {
                    Toast makeText = Toast.makeText(context2, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i14, new Object[0]), 0);
                    cg0Var.O = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 2:
                si0 si0Var = (si0) this.c;
                MessageObject messageObject = (MessageObject) this.b;
                ui0 ui0Var = si0Var.d;
                if (!ui0Var.a0(messageObject)) {
                    ui0Var.getOrCreateStoryViewer().F(ui0Var.getParentActivity(), messageObject.storyItem, ci.r7.a(ui0Var.f));
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
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.h6.l6 : org.telegram.ui.ActionBar.h6.H6, false));
                break;
            case 4:
                eo0.h0((eo0) this.c, (String) this.b, view);
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) this.b;
                if (photoViewer.T4 != null) {
                    i80Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer.m4;
                    if (n2Var instanceof qn) {
                        ((qn) n2Var).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.J1() && !photoViewer2.r) {
                    int i15 = photoViewer2.P4;
                    if (i15 >= 0 && i15 < photoViewer2.g7.size()) {
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
                                    append.setSpan(new org.telegram.ui.Components.yq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ei.x3 x3Var2 = photoViewer2.k1;
                                    x3Var2.l0 = new dh(i12, x3Var2);
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
                            bu0 bu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.v21 v21Var = new org.telegram.ui.Components.v21(activity);
                            v21Var.d = new org.telegram.ui.Components.hr0(v21Var, 17);
                            v21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), -871296751));
                            v21Var.setTextColor(-1);
                            v21Var.setTextSize(1, 14.0f);
                            v21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            v21Var.setGravity(16);
                            bu0Var.addView(v21Var, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            v21Var.setVisibility(8);
                            photoViewer2.m1 = v21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.v21 v21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.p71 p71Var = photoViewer2.j1;
                        org.telegram.ui.Components.hr0 hr0Var = v21Var2.d;
                        if (p71Var != null) {
                            v21Var2.a = p71Var;
                            v21Var2.a();
                            v21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(hr0Var);
                            AndroidUtilities.runOnUIThread(hr0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = v21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                v21Var2.b.cancel();
                                v21Var2.b = null;
                            }
                            if (v21Var2.getVisibility() != 0) {
                                v21Var2.setAlpha(0.0f);
                                v21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = v21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                v21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ((org.telegram.ui.Components.i80) this.c).K((org.telegram.ui.Components.i80) this.b);
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i16 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 182 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i16;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new tr0(privacySettingsActivity, b2Var, setaccountttl, i12));
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                long j10 = profileActivity2.f1;
                long j11 = profileActivity2.F1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                bq bqVar = new bq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                bqVar.X0 = new py0(profileActivity2, chat, bqVar);
                profileActivity2.presentFragment(bqVar);
                break;
            case 11:
                s11 s11Var = (s11) this.c;
                Context context3 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = s11Var.a[0].getText().toString();
                String obj3 = s11Var.a[3].getText().toString();
                String obj4 = s11Var.a[2].getText().toString();
                String obj5 = s11Var.a[1].getText().toString();
                String obj6 = s11Var.a[4].getText().toString();
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
                    if (s11Var.v == 2) {
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
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(context3, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        gj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        s11Var.showDialog(gj0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 12:
                m41 m41Var = (m41) this.c;
                Context context4 = (Context) this.b;
                if (m41Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    en0 en0Var = new en0(13, m41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.f5.a;
                    if (context4 != null) {
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context4, null);
                        a3Var2.a();
                        org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(context4, null);
                        od0Var.setTextColor(x02);
                        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        od0Var.setItemCount(5);
                        org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(context4, null);
                        h4Var.setItemCount(5);
                        h4Var.setTextColor(x02);
                        h4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.i4 i4Var = new org.telegram.ui.Components.i4(context4, null);
                        i4Var.setItemCount(5);
                        i4Var.setTextColor(x02);
                        i4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.x3 x3Var3 = new org.telegram.ui.Components.x3(context4, od0Var, h4Var, i4Var, 3);
                        x3Var3.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context4);
                        x3Var3.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context4);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new di.d(10));
                        LinearLayout linearLayout = new LinearLayout(context4);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        x3Var3.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.vd vdVar = new ai.vd(context4, 18);
                        linearLayout.addView(od0Var, w7.z5.l(0.5f, 0, 270));
                        od0Var.setMinValue(0);
                        od0Var.setMaxValue(365);
                        od0Var.setWrapSelectorWheel(false);
                        od0Var.setFormatter(new rr(11));
                        ai.u2 u2Var = new ai.u2(od0Var, h4Var, i4Var, 18);
                        od0Var.setOnValueChangedListener(u2Var);
                        h4Var.setMinValue(0);
                        h4Var.setMaxValue(23);
                        linearLayout.addView(h4Var, w7.z5.l(0.2f, 0, 270));
                        h4Var.setFormatter(new rr(12));
                        h4Var.setOnValueChangedListener(u2Var);
                        i4Var.setMinValue(0);
                        i4Var.setMaxValue(59);
                        i4Var.setValue(0);
                        i4Var.setFormatter(new rr(13));
                        linearLayout.addView(i4Var, w7.z5.l(0.3f, 0, 270));
                        i4Var.setOnValueChangedListener(u2Var);
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
                                i4Var.setValue(calendar.get(12));
                                h4Var.setValue(calendar.get(11));
                                od0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.f5.f(null, null, 0L, 0L, 0, od0Var, h4Var, i4Var);
                        vdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        vdVar.setGravity(17);
                        vdVar.setTextColor(x04);
                        vdVar.setTextSize(1, 14.0f);
                        vdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        vdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x05, x06, x06));
                        vdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        x3Var3.addView(vdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        vdVar.setOnClickListener(new org.telegram.ui.Components.m0(od0Var, h4Var, i4Var, calendar, en0Var, a3Var2, 1));
                        a3Var2.b(x3Var3);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(x03);
                        f3Var.fixNavigationBar(x03);
                        a3Var = a3Var2;
                    }
                    a3Var.a.setOnHideListener(new ai.z3(m41Var, zArr, 13));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    m41Var.w = f3Var2;
                    m41Var.c(false);
                    break;
                }
                break;
            case 13:
                k61 k61Var = (k61) this.c;
                ai.k4 k4Var = (ai.k4) this.b;
                if (k61Var.Z.g() != 0) {
                    k4Var.run(new ArrayList(k61Var.a0.values()));
                    k61Var.dismiss();
                    break;
                }
                break;
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i17 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 183 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i17;
                sessionsActivity.v = i17;
                h71 h71Var = sessionsActivity.a;
                if (h71Var != null) {
                    h71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ci.e6(r4));
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(ai.md.N0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 16:
                u81 u81Var = (u81) this.c;
                m91 m91Var = (m91) this.b;
                p91 p91Var = u81Var.d0;
                p91Var.getOrCreateStoryViewer().C(p91Var.getParentActivity(), m91Var.b(), p91Var.z0, ci.r7.a(p91Var.S));
                break;
            case 17:
                y81 y81Var = (y81) this.c;
                lg.f fVar = (lg.f) this.b;
                int i18 = y81Var.c;
                z81 z81Var = y81Var.d;
                org.telegram.ui.Components.a10 a10Var = y81Var.a;
                if (a10Var.c) {
                    ArrayList arrayList = z81Var.n;
                    jg.g gVar = z81Var.c;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            i13 = 1;
                        } else if (i19 == i18 || !((y81) arrayList.get(i19)).a.c || !((y81) arrayList.get(i19)).a.b) {
                            i19++;
                        }
                    }
                    z81Var.f();
                    if (i13 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        break;
                    } else {
                        a10Var.setChecked(true ^ a10Var.b);
                        fVar.n = a10Var.b;
                        z81Var.b.z();
                        if (z81Var.r.c > 0 && i18 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i18)).n = a10Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 18:
                x91 x91Var = (x91) this.c;
                cy cyVar = (cy) this.b;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(cyVar.getParentActivity());
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder3.k(LocaleController.getString(R.string.CacheClear), new en0(15, x91Var, cyVar));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.a;
                cyVar.showDialog(b2Var2);
                TextView textView2 = (TextView) b2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    break;
                }
                break;
            case 19:
                oc1 oc1Var = (oc1) this.c;
                Context context5 = (Context) this.b;
                if (oc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(oc1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context5);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context5);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new di.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i13 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i13);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i13++;
                    }
                    ra1 ra1Var = new ra1(context5, oc1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(ra1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ra1Var.y1(oc1Var.fragmentView.getMeasuredWidth());
                    oc1Var.showDialog(a3Var3.a);
                    break;
                }
                break;
            case 20:
                hh1 hh1Var = (hh1) this.c;
                Context context6 = (Context) this.b;
                ug.m1 m1Var = hh1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    hh1Var.M = null;
                }
                ug.m1 m1Var2 = new ug.m1(context6, hh1Var.a, null, 4, new ci.k0());
                TLRPC.User user = hh1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = hh1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i20 = 0; i20 < 2; i20++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i20]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new ih.b(i12);
                hh1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 21:
                ei.d dVar = (ei.d) this.c;
                org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.b;
                if (!dVar.N) {
                    k2Var.dismiss();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Wallet.b2 b2Var3 = (org.telegram.ui.Wallet.b2) this.c;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.b;
                if (!b2Var3.m) {
                    j2Var.dismiss();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.b;
                if (z2Var.e && !z2Var.R) {
                    org.telegram.ui.Wallet.o5.E0(z2Var.getContext(), n2Var2.getCurrentAccount(), n2Var2.getResourceProvider());
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Wallet.l4 l4Var = (org.telegram.ui.Wallet.l4) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    l4Var.dismiss();
                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9();
                    r9Var.i0(nftitem);
                    U.presentFragment(r9Var);
                    break;
                }
                break;
            case 25:
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Wallet.k2[] k2VarArr = (org.telegram.ui.Wallet.k2[]) this.b;
                runnable.run();
                k2VarArr[0].dismiss();
                break;
            case 26:
                org.telegram.ui.Wallet.o5.g0((org.telegram.ui.Wallet.o5) this.c, (Context) this.b, view);
                break;
            case 27:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                TextView textView4 = (TextView) this.b;
                a2Var.c(!a2Var.b(), true);
                textView4.setVisibility(a2Var.b() ? 0 : 8);
                break;
            case 28:
                ei.d dVar2 = (ei.d) this.c;
                int[] iArr = (int[]) this.b;
                if (!dVar2.N && (z5Var = yh1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = z5Var.h();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) z5Var.a;
                        com.google.android.gms.common.api.internal.s0 s0Var = v0Var.h;
                        b8.e eVar = new b8.e(s0Var, str2, "/tg-wear-auth/answer", h);
                        s0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new e7(z5Var, dVar2, iArr, i11)).addOnFailureListener(new xh1(dVar2, i13));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar2.setLoading(false);
                        return;
                    }
                }
                break;
            default:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.c;
                y yVar = (y) this.b;
                kVar.b = true;
                yVar.run();
                kVar.w.W2.N(true);
                break;
        }
    }
}
