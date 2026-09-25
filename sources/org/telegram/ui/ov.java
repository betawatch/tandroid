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
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ov(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j3 = 0;
        int i11 = 18;
        int i12 = 6;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                qy qyVar = (qy) this.b;
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.c;
                qyVar.getClass();
                y70Var.u();
                qyVar.presentFragment(new ProxyListActivity());
                break;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.a2[]) this.c, r0, r0.currentAccount, ((qy) this.b).Y2);
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                qy qyVar2 = (qy) this.b;
                qyVar2.r4((ArrayList) this.c, 102, false, false, null);
                qyVar2.finishPreviewFragment();
                break;
            case 4:
                qy.H0((qy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new tt(i13, (qy) this.b, (String) this.c), 250L);
                break;
            case 6:
                z10 z10Var = (z10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((a20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (z10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = z10Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i16 = 0;
                while (i16 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList = i16 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList2 = i16 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i17);
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i17 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i17, 1);
                        j3 = j10;
                    }
                    i16++;
                }
                TLRPC.DialogFilter dialogFilter3 = suggestedFilter.filter;
                if (dialogFilter3.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter3.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter3.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter3.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter3.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter3.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter3.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter3.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, z10Var.e, new tt(19, z10Var, suggestedFilter));
                break;
            case 7:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.f21 f21Var = (org.telegram.ui.Components.f21) this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                f21Var.run();
                e3Var.dismiss();
                break;
            case 9:
                n30 n30Var = (n30) this.b;
                TextView textView = (TextView) this.c;
                d60 d60Var = n30Var.E;
                ChatObject.Call call = d60Var.a1;
                if (call != null && call.recording) {
                    d60Var.G1(textView);
                    break;
                }
                break;
            case 10:
                new m50((Context) this.c, (n50) this.b).show();
                break;
            case 11:
                y70 y70Var2 = (y70) this.b;
                org.telegram.ui.Components.lj0 lj0Var = (org.telegram.ui.Components.lj0) this.c;
                y70Var2.getClass();
                if (!qy.w4) {
                    qy.w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.g6 N0 = !q6 ? org.telegram.ui.ActionBar.h6.N0("Night") : org.telegram.ui.ActionBar.h6.N0("Blue");
                    org.telegram.ui.ActionBar.h6.o = 0;
                    org.telegram.ui.ActionBar.h6.q1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.ij0 ij0Var = y70Var2.v;
                    ij0Var.P(!q6 ? ij0Var.e[0] - 1 : 0);
                    lj0Var.d();
                    int[] iArr = {(lj0Var.getMeasuredWidth() / 2) + r7, (lj0Var.getMeasuredHeight() / 2) + r7};
                    lj0Var.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), lj0Var);
                    lj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                k80 k80Var = (k80) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                k80Var.Q.dismiss();
                if (!k80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, k80Var.c0);
                    a6 a6Var = new a6(bundle);
                    a6Var.d = k80Var.f0;
                    a6Var.U();
                    m2Var.presentFragment(a6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i20 = k80Var.c0;
                    if (i20 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i20 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    qy qyVar3 = new qy(bundle2);
                    qyVar3.C2 = new ow(i12, k80Var, qyVar3);
                    m2Var.presentFragment(qyVar3);
                    break;
                }
            case 13:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i21 = 0;
                while (i21 < 2) {
                    q4VarArr[i21].a.a(i21 == num.intValue(), true);
                    i21++;
                }
                break;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new hb0((rb0) this.b, i14));
                break;
            case 15:
                rb0 rb0Var = (rb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (rb0Var.e == null) {
                    ob0 ob0Var = rb0Var.f;
                    if (!ob0Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        Switch r42 = w8Var.e;
                        w8Var.setChecked(!r42.h);
                        rb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            rb0Var.f.setCheckBoxIcon(0);
                            rb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            gb0 gb0Var = new gb0(rb0Var, i15);
                            runnableArr[0] = gb0Var;
                            AndroidUtilities.runOnUIThread(gb0Var);
                            break;
                        } else {
                            rb0Var.f.setChecked(false);
                            rb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            rb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            gb0 gb0Var2 = new gb0(rb0Var, i14);
                            runnableArr[0] = gb0Var2;
                            AndroidUtilities.runOnUIThread(gb0Var2, 60L);
                            break;
                        }
                    } else {
                        int i22 = -rb0Var.N;
                        rb0Var.N = i22;
                        AndroidUtilities.shakeViewSpring(ob0Var, i22);
                        break;
                    }
                }
                break;
            case 16:
                cd0 cd0Var = (cd0) this.b;
                cd0Var.r0((wc0) this.c);
                uc0 uc0Var = cd0Var.I0;
                if (uc0Var != null) {
                    uc0Var.dismiss();
                    break;
                }
                break;
            case 17:
                zc0 zc0Var = (zc0) this.b;
                bd0 bd0Var = (bd0) this.c;
                cd0 cd0Var2 = zc0Var.b;
                cd0Var2.getClass();
                cd0Var2.F0.b(bd0Var.c, cd0Var2.G0, true, 0, 0L);
                cd0Var2.finishFragment();
                break;
            case 18:
                ae0 ae0Var = (ae0) this.b;
                Context context = (Context) this.c;
                String string = ae0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.b11 b11Var = new org.telegram.ui.Components.b11();
                    b11Var.a |= 256;
                    b11Var.b = indexOf;
                    int i23 = lastIndexOf + 1;
                    b11Var.c = i23;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c11(b11Var, 0), indexOf, i23, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i24 = ae0Var.G;
                int i25 = i24 / 86400;
                int i26 = i24 % 86400;
                int i27 = i26 / 3600;
                int i28 = (i26 % 3600) / 60;
                if (i25 == 0 && i27 == 0) {
                    i28 = Math.max(1, i28);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i25 == 0 || i27 == 0) ? (i27 == 0 || i28 == 0) ? i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i25, new Object[0])) : i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i25, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]), LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i25, new Object[0]), LocaleController.formatPluralString("Hours", i27, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new du(ae0Var, 17));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 19:
                je0 je0Var = (je0) this.b;
                Context context2 = (Context) this.c;
                qg0 qg0Var = je0Var.y;
                if (qg0Var.V.getTag() == null) {
                    if (!je0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(je0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new du(je0Var, i11));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        qg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new he0(je0Var, i15), 10);
                        break;
                    }
                }
                break;
            case 20:
                tf0 tf0Var = (tf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = tf0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = tf0Var.p0) != null) {
                    tf0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!tf0Var.d0) {
                    rf0 rf0Var = tf0Var.v;
                    if ((rf0Var == null || rf0Var.getVisibility() == 8) && !tf0Var.i0) {
                        if (tf0Var.g0 != 0) {
                            if (tf0Var.s0.V.getTag() == null) {
                                tf0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = tf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = tf0Var.c;
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
                            tf0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, tf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ow(20, tf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new if0(tf0Var, i15));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 21:
                pg0 pg0Var = (pg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = pg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    pg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (pg0Var.M > 0 && currentTimeMillis - pg0Var.N > 1500) {
                    pg0Var.M = 0;
                }
                int i29 = pg0Var.M + 1;
                pg0Var.M = i29;
                pg0Var.N = currentTimeMillis;
                if (i29 < 5) {
                    if (i29 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i29, new Object[0]), 0);
                        pg0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    pg0Var.M = 0;
                    pg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(pg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new qv(pg0Var, i15));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                bj0 bj0Var = (bj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                dj0 dj0Var = bj0Var.d;
                if (!dj0Var.a0(messageObject)) {
                    dj0Var.getOrCreateStoryViewer().F(dj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(dj0Var.f));
                    break;
                }
                break;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.h6.l6 : org.telegram.ui.ActionBar.h6.H6, false));
                break;
            case 24:
                oo0.h0((oo0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.y70 y70Var3 = (org.telegram.ui.Components.y70) this.c;
                if (photoViewer.T4 != null) {
                    y70Var3.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.m4;
                    if (m2Var2 instanceof wn) {
                        ((wn) m2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i30 = photoViewer2.P4;
                    if (i30 >= 0 && i30 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new ci.e4(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.pq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.k1;
                                    e4Var2.l0 = new kh(i13, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.X2(true);
                        photoViewer2.o2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            nu0 nu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(activity);
                            l21Var.d = new org.telegram.ui.Components.wq0(l21Var, i11);
                            l21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            l21Var.setTextColor(-1);
                            l21Var.setTextSize(1, 14.0f);
                            l21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            l21Var.setGravity(16);
                            nu0Var.addView(l21Var, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            l21Var.setVisibility(8);
                            photoViewer2.m1 = l21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.l21 l21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.f71 f71Var = photoViewer2.j1;
                        org.telegram.ui.Components.wq0 wq0Var = l21Var2.d;
                        if (f71Var != null) {
                            l21Var2.a = f71Var;
                            l21Var2.a();
                            l21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(wq0Var);
                            AndroidUtilities.runOnUIThread(wq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = l21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                l21Var2.b.cancel();
                                l21Var2.b = null;
                            }
                            if (l21Var2.getVisibility() != 0) {
                                l21Var2.setAlpha(0.0f);
                                l21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = l21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                l21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.y70) this.c).K((org.telegram.ui.Components.y70) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i31 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(privacySettingsActivity.getParentActivity(), 3, null);
                a2Var.g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i31;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new fs0(privacySettingsActivity, a2Var, setaccountttl, i13));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }

    public /* synthetic */ ov(org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.a = 27;
        this.c = y70Var;
        this.b = y70Var2;
    }
}
