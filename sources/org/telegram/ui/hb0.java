package org.telegram.ui;

import android.app.Activity;
import android.content.ClipboardManager;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        od1 od1Var = (od1) this.b;
        Context context = (Context) this.c;
        if (od1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(od1Var.getParentActivity(), null);
        c3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false), 1, 20.0f);
        linearLayout.addView(textView, k7.c6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        c3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i10);
            TLRPC.TL_theme tL_theme = j6Var.C;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(j6Var);
            }
        }
        pb1 pb1Var = new pb1(context, od1Var, arrayList, new ArrayList(), c3Var);
        linearLayout.addView(pb1Var, k7.c6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        pb1Var.w1(od1Var.fragmentView.getMeasuredWidth());
        od1Var.showDialog(c3Var.a);
    }

    private final void b(View view) {
        ii1 ii1Var = (ii1) this.b;
        Context context = (Context) this.c;
        hg.v2 v2Var = ii1Var.J;
        if (v2Var != null) {
            v2Var.dismiss();
            ii1Var.J = null;
        }
        hg.v2 v2Var2 = new hg.v2(context, ii1Var.a, null, 4, new oh.h0());
        TLRPC.User user = ii1Var.c;
        long j10 = user != null ? user.id : 0L;
        TLRPC.User user2 = ii1Var.d;
        int i10 = 1;
        long[] jArr = {j10, user2 != null ? user2.id : 0L};
        for (int i11 = 0; i11 < 2; i11++) {
            v2Var2.z0.add(Long.valueOf(jArr[i11]));
        }
        v2Var2.h0(false, true);
        v2Var2.A0 = new org.telegram.ui.Components.as(i10);
        ii1Var.J = v2Var2;
        v2Var2.show();
    }

    private final void c(View view) {
        org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
        z zVar = (z) this.c;
        kVar.b = true;
        zVar.run();
        kVar.w.V2.N(true);
    }

    private final void d(View view) {
        qh.z2 z2Var = (qh.z2) this.b;
        z2Var.e((MediaController.AlbumEntry) this.c, false);
        z2Var.C.n();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c3;
        char c10;
        String formatString;
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        String str;
        boolean[] zArr;
        c5.j jVar;
        int i12 = 18;
        int i13 = 16;
        int i14 = 4;
        int i15 = 2;
        CharSequence charSequence = null;
        org.telegram.ui.ActionBar.c3 c3Var = null;
        int i16 = 0;
        switch (this.a) {
            case 0:
                ob0 ob0Var = (ob0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (ob0Var.e == null) {
                    lb0 lb0Var = ob0Var.f;
                    if (!lb0Var.e.h) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        Switch r42 = s8Var.e;
                        s8Var.setChecked(!r42.h);
                        ob0Var.r.setVisibility(r42.h ? 0 : 8);
                        int i17 = 0;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            ob0Var.f.setCheckBoxIcon(0);
                            ob0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            cb0 cb0Var = new cb0(ob0Var, 1);
                            runnableArr[0] = cb0Var;
                            AndroidUtilities.runOnUIThread(cb0Var);
                            break;
                        } else {
                            ob0Var.f.setChecked(false);
                            ob0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            ob0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            cb0 cb0Var2 = new cb0(ob0Var, i17);
                            runnableArr[0] = cb0Var2;
                            AndroidUtilities.runOnUIThread(cb0Var2, 60L);
                            break;
                        }
                    } else {
                        int i18 = -ob0Var.K;
                        ob0Var.K = i18;
                        AndroidUtilities.shakeViewSpring(lb0Var, i18);
                        break;
                    }
                }
                break;
            case 1:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.r0((vc0) this.c);
                tc0 tc0Var = bd0Var.F0;
                if (tc0Var != null) {
                    tc0Var.dismiss();
                    break;
                }
                break;
            case 2:
                yc0 yc0Var = (yc0) this.b;
                ad0 ad0Var = (ad0) this.c;
                bd0 bd0Var2 = yc0Var.b;
                bd0Var2.getClass();
                bd0Var2.C0.d(ad0Var.c, bd0Var2.D0, true, 0, 0L);
                bd0Var2.finishFragment();
                break;
            case 3:
                zd0 zd0Var = (zd0) this.b;
                Context context = (Context) this.c;
                String string = zd0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01();
                    s01Var.a |= 256;
                    s01Var.b = indexOf;
                    int i19 = lastIndexOf + 1;
                    s01Var.c = i19;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), indexOf, i19, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i20 = zd0Var.D;
                int i21 = i20 / 86400;
                int i22 = i20 % 86400;
                int i23 = i22 / 3600;
                int i24 = (i22 % 3600) / 60;
                if (i21 == 0 && i23 == 0) {
                    i24 = Math.max(1, i24);
                }
                if (i21 == 0 || i23 == 0) {
                    c3 = 0;
                    if (i23 == 0 || i24 == 0) {
                        c10 = 1;
                        formatString = i21 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i21, new Object[0])) : i23 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i21, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i24, new Object[0]));
                    } else {
                        c10 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i23, new Object[0]), LocaleController.formatPluralString("Minutes", i24, new Object[0]));
                    }
                } else {
                    c3 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i21, new Object[0]), LocaleController.formatPluralString("Hours", i23, new Object[0]));
                    c10 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c3] = spannableStringBuilder;
                charSequenceArr[c10] = formatString;
                alertDialog$Builder.a.Q = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new gu(zd0Var, 17));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 4:
                he0 he0Var = (he0) this.b;
                Context context2 = (Context) this.c;
                og0 og0Var = he0Var.y;
                if (og0Var.S.getTag() == null) {
                    if (!he0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(he0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.Q = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new gu(he0Var, i12));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        og0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new fe0(he0Var, 1), 10);
                        break;
                    }
                }
                break;
            case 5:
                sf0 sf0Var = (sf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle = sf0Var.l0;
                if (bundle != null && (tL_auth_sentCode = sf0Var.m0) != null) {
                    sf0Var.p0.g1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!sf0Var.a0) {
                    qf0 qf0Var = sf0Var.v;
                    if ((qf0Var == null || qf0Var.getVisibility() == 8) && !sf0Var.f0) {
                        if (sf0Var.d0 != 0) {
                            if (sf0Var.p0.S.getTag() == null) {
                                sf0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = sf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = sf0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            sf0Var.p0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, sf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new rs(27, sf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new hf0(sf0Var, 1));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 6:
                ng0 ng0Var = (ng0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = ng0Var.L;
                if (toast != null) {
                    toast.cancel();
                    ng0Var.L = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ng0Var.J <= 0 || currentTimeMillis - ng0Var.K <= 1500) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    ng0Var.J = 0;
                }
                int i25 = ng0Var.J + 1;
                ng0Var.J = i25;
                ng0Var.K = currentTimeMillis;
                if (i25 < 5) {
                    if (i25 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i25, new Object[0]), 0);
                        ng0Var.L = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    ng0Var.J = i11;
                    ng0Var.K = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ng0Var.getContext());
                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new rv(ng0Var, 1));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 7:
                zi0 zi0Var = (zi0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                bj0 bj0Var = zi0Var.d;
                if (!bj0Var.a0(messageObject)) {
                    bj0Var.getOrCreateStoryViewer().G(bj0Var.getParentActivity(), messageObject.storyItem, oh.c7.a(bj0Var.f));
                    break;
                }
                break;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.k6.l6 : org.telegram.ui.ActionBar.k6.H6, false));
                break;
            case 9:
                lo0.h0((lo0) this.b, (String) this.c, view);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) this.c;
                if (photoViewer.Q4 != null) {
                    q70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.j4;
                    if (p2Var instanceof xn) {
                        ((xn) p2Var).J9(photoViewer.Q4, false, true);
                    }
                    af.g.r(photoViewer.B, Uri.parse(photoViewer.Q4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.Q).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i26 = photoViewer2.M4;
                    if (i26 >= 0 && i26 < photoViewer2.d7.size()) {
                        Object obj = photoViewer2.d7.get(photoViewer2.M4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.g1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                qh.e3 e3Var = photoViewer2.h1;
                                if (e3Var != null) {
                                    e3Var.e(true);
                                    photoViewer2.h1 = null;
                                }
                                if (photoViewer2.B != null) {
                                    photoViewer2.h1 = new qh.e3(photoViewer2.B, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.oq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.h1.s(append);
                                    photoViewer2.b0.addView(photoViewer2.h1, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.h1.setTranslationY(photoViewer2.M0.getTranslationY());
                                    photoViewer2.h1.m(0.0f, (photoViewer2.g1.getWidth() / 2.0f) + photoViewer2.g1.getX() + photoViewer2.E0.getX());
                                    qh.e3 e3Var2 = photoViewer2.h1;
                                    e3Var2.i0 = new bh(i15, e3Var2);
                                    e3Var2.d = 3500L;
                                    e3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.g1.getTag() != null) {
                        photoViewer2.Y2(true);
                        photoViewer2.p2(1);
                        break;
                    } else if (photoViewer2.g8) {
                        if (photoViewer2.j1 == null) {
                            iu0 iu0Var = photoViewer2.b0;
                            org.telegram.ui.Components.a21 a21Var = new org.telegram.ui.Components.a21(activity);
                            a21Var.d = new org.telegram.ui.Components.nq0(a21Var, 17);
                            a21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            a21Var.setTextColor(-1);
                            a21Var.setTextSize(1, 14.0f);
                            a21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            a21Var.setGravity(16);
                            iu0Var.addView(a21Var, k7.c6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            a21Var.setVisibility(8);
                            photoViewer2.j1 = a21Var;
                        }
                        photoViewer2.j1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.a21 a21Var2 = photoViewer2.j1;
                        org.telegram.ui.Components.v61 v61Var = photoViewer2.g1;
                        org.telegram.ui.Components.nq0 nq0Var = a21Var2.d;
                        if (v61Var != null) {
                            a21Var2.a = v61Var;
                            a21Var2.a();
                            a21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            AndroidUtilities.runOnUIThread(nq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = a21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                a21Var2.b.cancel();
                                a21Var2.b = null;
                            }
                            if (a21Var2.getVisibility() != 0) {
                                a21Var2.setAlpha(0.0f);
                                a21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = a21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                a21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((org.telegram.ui.Components.q70) this.b).K((org.telegram.ui.Components.q70) this.c);
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.I0.run();
                Integer num = (Integer) view.getTag();
                int i27 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 182 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(privacySettingsActivity.getParentActivity(), 3, null);
                d2Var.d0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i27;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new yr0(privacySettingsActivity, d2Var, setaccountttl, i15));
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity2.b1;
                long j11 = profileActivity2.B1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.D2;
                kq kqVar = new kq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                kqVar.U0 = new bz0(profileActivity2, chat, kqVar);
                profileActivity2.presentFragment(kqVar);
                break;
            case 16:
                d21 d21Var = (d21) this.b;
                Context context5 = (Context) this.c;
                StringBuilder sb = new StringBuilder();
                String obj2 = d21Var.a[0].getText().toString();
                String obj3 = d21Var.a[3].getText().toString();
                String obj4 = d21Var.a[2].getText().toString();
                String obj5 = d21Var.a[1].getText().toString();
                String obj6 = d21Var.a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj2)) {
                        sb.append("server=");
                        sb.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("port=");
                        sb.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (d21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("secret=");
                        sb.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("user=");
                            sb.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("pass=");
                            sb.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                    }
                    if (sb.length() != 0) {
                        StringBuilder l10 = e2.c.l(str);
                        l10.append(sb.toString());
                        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(context5, LocaleController.getString(R.string.ShareQrCode), l10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        si0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        d21Var.showDialog(si0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 17:
                l51 l51Var = (l51) this.b;
                Context context6 = (Context) this.c;
                if (l51Var.w == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    vl0 vl0Var = new vl0(i13, l51Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.z4.a;
                    if (context6 == null) {
                        zArr = zArr2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        org.telegram.ui.ActionBar.c3 c3Var2 = new org.telegram.ui.ActionBar.c3(context6, null);
                        c3Var2.a();
                        org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(context6, null);
                        yc0Var2.setTextColor(w02);
                        yc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
                        yc0Var2.setItemCount(5);
                        org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context6, null);
                        b4Var.setItemCount(5);
                        b4Var.setTextColor(w02);
                        b4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.c4 c4Var = new org.telegram.ui.Components.c4(context6, null);
                        c4Var.setItemCount(5);
                        c4Var.setTextColor(w02);
                        c4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context6, yc0Var2, b4Var, c4Var, 3);
                        s3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        s3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        hg.q qVar = new hg.q(context6, 16);
                        linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                        yc0Var2.setMinValue(0);
                        yc0Var2.setMaxValue(365);
                        yc0Var2.setWrapSelectorWheel(false);
                        yc0Var2.setFormatter(new as(10));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(yc0Var2, b4Var, c4Var, 12);
                        yc0Var2.setOnValueChangedListener(aVar);
                        b4Var.setMinValue(0);
                        b4Var.setMaxValue(23);
                        linearLayout.addView(b4Var, k7.c6.l(0.2f, 0, 270));
                        b4Var.setFormatter(new as(11));
                        b4Var.setOnValueChangedListener(aVar);
                        c4Var.setMinValue(0);
                        c4Var.setMaxValue(59);
                        c4Var.setValue(0);
                        c4Var.setFormatter(new as(12));
                        linearLayout.addView(c4Var, k7.c6.l(0.3f, 0, 270));
                        c4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 <= 0 || currentTimeMillis2 == 2147483646) {
                            zArr = zArr2;
                        } else {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            zArr = zArr2;
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                c4Var.setValue(calendar.get(12));
                                b4Var.setValue(calendar.get(11));
                                yc0Var2.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.z4.g(null, null, 0L, 0L, 0, yc0Var2, b4Var, c4Var);
                        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        qVar.setGravity(17);
                        qVar.setTextColor(w04);
                        qVar.setTextSize(1, 14.0f);
                        qVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w05, w06, w06));
                        qVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.c3 c3Var3 = c3Var2;
                        qVar.setOnClickListener(new hg.e(yc0Var2, (org.telegram.ui.Components.yc0) b4Var, (org.telegram.ui.Components.yc0) c4Var, calendar, (Object) vl0Var, c3Var2, 2));
                        c3Var3.b(s3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = c3Var3.a;
                        h3Var.show();
                        h3Var.setBackgroundColor(w03);
                        h3Var.fixNavigationBar(w03);
                        c3Var = c3Var3;
                    }
                    c3Var.a.setOnHideListener(new hg.g(10, l51Var, zArr));
                    org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.a;
                    h3Var2.show();
                    l51Var.w = h3Var2;
                    l51Var.c(false);
                    break;
                }
                break;
            case 18:
                k71 k71Var = (k71) this.b;
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) this.c;
                if (k71Var.W.g() != 0) {
                    mcVar.run(new ArrayList(k71Var.X.values()));
                    k71Var.dismiss();
                    break;
                }
                break;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.I0.run();
                Integer num2 = (Integer) view.getTag();
                int i28 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 183 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i28;
                sessionsActivity.v = i28;
                h81 h81Var = sessionsActivity.a;
                if (h81Var != null) {
                    h81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new oh.p5(i14));
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(mh.ja.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 21:
                s91 s91Var = (s91) this.b;
                ka1 ka1Var = (ka1) this.c;
                na1 na1Var = s91Var.a0;
                na1Var.getOrCreateStoryViewer().C(na1Var.getParentActivity(), ka1Var.b(), na1Var.w0, oh.c7.a(na1Var.P));
                break;
            case 22:
                w91 w91Var = (w91) this.b;
                yf.f fVar = (yf.f) this.c;
                int i29 = w91Var.c;
                x91 x91Var = w91Var.d;
                org.telegram.ui.Components.t00 t00Var = w91Var.a;
                if (t00Var.c) {
                    ArrayList arrayList = x91Var.n;
                    wf.g gVar = x91Var.c;
                    int size = arrayList.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 >= size) {
                            i16 = 1;
                        } else if (i30 == i29 || !((w91) arrayList.get(i30)).a.c || !((w91) arrayList.get(i30)).a.b) {
                            i30++;
                        }
                    }
                    x91Var.f();
                    if (i16 == 0) {
                        t00Var.setChecked(!t00Var.b);
                        fVar.n = t00Var.b;
                        x91Var.b.z();
                        if (x91Var.r.c > 0 && i29 < gVar.d.size()) {
                            ((yf.f) gVar.d.get(i29)).n = t00Var.b;
                            gVar.z();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(t00Var);
                        break;
                    }
                }
                break;
            case 23:
                va1 va1Var = (va1) this.b;
                py pyVar = (py) this.c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(pyVar.getParentActivity());
                alertDialog$Builder5.a.O = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.a.Q = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new vl0(i12, va1Var, pyVar));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder5.a;
                pyVar.showDialog(d2Var2);
                TextView textView2 = (TextView) d2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
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
                qh.d dVar = (qh.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.K && (jVar = aj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] k10 = jVar.k();
                        a8.e eVar = new a8.e(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) jVar.c;
                        com.google.android.gms.common.api.internal.t0 t0Var = eVar.h;
                        m8.i0 i0Var = new m8.i0(t0Var, str2, "/tg-wear-auth/answer", k10);
                        t0Var.b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.a).addOnSuccessListener(new d7(jVar, dVar, iArr, 24)).addOnFailureListener(new zi1(dVar, i16));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        dVar.setLoading(false);
                        return;
                    }
                }
                break;
            case 27:
                c(view);
                break;
            case 28:
                d(view);
                break;
            default:
                qh.a7 a7Var = (qh.a7) this.b;
                qh.l6 l6Var = (qh.l6) this.c;
                org.telegram.ui.Cells.i3 i3Var = a7Var.V;
                try {
                    charSequence = ((ClipboardManager) a7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(a7Var.getContext());
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (charSequence != null) {
                    i3Var.b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                l6Var.run();
                break;
        }
    }
}
