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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j3 = 0;
        int i11 = 17;
        int i12 = 5;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                ry ryVar = (ry) this.b;
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.c;
                ryVar.getClass();
                o70Var.u();
                ryVar.presentFragment(new ProxyListActivity());
                break;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.c, r0, r0.currentAccount, ((ry) this.b).Y2);
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                ry ryVar2 = (ry) this.b;
                ryVar2.r4((ArrayList) this.c, 102, false, false, null);
                ryVar2.finishPreviewFragment();
                break;
            case 4:
                ry.H0((ry) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ar0(27, (ry) this.b, (String) this.c), 250L);
                break;
            case 6:
                b20 b20Var = (b20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((c20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (b20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = b20Var.e.getMessagesController().getDialogFilters().size();
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
                c10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, b20Var.e, new hw(14, b20Var, suggestedFilter));
                break;
            case 7:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.r11 r11Var = (org.telegram.ui.Components.r11) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                r11Var.run();
                f3Var.dismiss();
                break;
            case 9:
                p30 p30Var = (p30) this.b;
                TextView textView = (TextView) this.c;
                f60 f60Var = p30Var.E;
                ChatObject.Call call = f60Var.a1;
                if (call != null && call.recording) {
                    f60Var.G1(textView);
                    break;
                }
                break;
            case 10:
                new o50((Context) this.c, (p50) this.b).show();
                break;
            case 11:
                a80 a80Var = (a80) this.b;
                org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.c;
                a80Var.getClass();
                if (!ry.w4) {
                    ry.w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.g6 N0 = !q6 ? org.telegram.ui.ActionBar.h6.N0("Night") : org.telegram.ui.ActionBar.h6.N0("Blue");
                    org.telegram.ui.ActionBar.h6.o = 0;
                    org.telegram.ui.ActionBar.h6.q1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.yi0 yi0Var = a80Var.v;
                    yi0Var.P(!q6 ? yi0Var.e[0] - 1 : 0);
                    bj0Var.d();
                    int[] iArr = {(bj0Var.getMeasuredWidth() / 2) + r7, (bj0Var.getMeasuredHeight() / 2) + r7};
                    bj0Var.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), bj0Var);
                    bj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                m80 m80Var = (m80) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                m80Var.Q.dismiss();
                if (!m80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, m80Var.c0);
                    b6 b6Var = new b6(bundle);
                    b6Var.d = m80Var.f0;
                    b6Var.U();
                    n2Var.presentFragment(b6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i20 = m80Var.c0;
                    if (i20 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i20 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    ry ryVar3 = new ry(bundle2);
                    ryVar3.C2 = new w10(i12, m80Var, ryVar3);
                    n2Var.presentFragment(ryVar3);
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
                org.telegram.ui.Components.e5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ib0((sb0) this.b, i14));
                break;
            case 15:
                sb0 sb0Var = (sb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (sb0Var.e == null) {
                    pb0 pb0Var = sb0Var.f;
                    if (!pb0Var.e.h) {
                        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                        Switch r42 = x8Var.e;
                        x8Var.setChecked(!r42.h);
                        sb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            sb0Var.f.setCheckBoxIcon(0);
                            sb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            hb0 hb0Var = new hb0(sb0Var, i15);
                            runnableArr[0] = hb0Var;
                            AndroidUtilities.runOnUIThread(hb0Var);
                            break;
                        } else {
                            sb0Var.f.setChecked(false);
                            sb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            sb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            hb0 hb0Var2 = new hb0(sb0Var, i14);
                            runnableArr[0] = hb0Var2;
                            AndroidUtilities.runOnUIThread(hb0Var2, 60L);
                            break;
                        }
                    } else {
                        int i22 = -sb0Var.N;
                        sb0Var.N = i22;
                        AndroidUtilities.shakeViewSpring(pb0Var, i22);
                        break;
                    }
                }
                break;
            case 16:
                dd0 dd0Var = (dd0) this.b;
                dd0Var.r0((xc0) this.c);
                vc0 vc0Var = dd0Var.I0;
                if (vc0Var != null) {
                    vc0Var.dismiss();
                    break;
                }
                break;
            case 17:
                ad0 ad0Var = (ad0) this.b;
                cd0 cd0Var = (cd0) this.c;
                dd0 dd0Var2 = ad0Var.b;
                dd0Var2.getClass();
                dd0Var2.F0.b(cd0Var.c, dd0Var2.G0, true, 0, 0L);
                dd0Var2.finishFragment();
                break;
            case 18:
                be0 be0Var = (be0) this.b;
                Context context = (Context) this.c;
                String string = be0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                    n01Var.a |= 256;
                    n01Var.b = indexOf;
                    int i23 = lastIndexOf + 1;
                    n01Var.c = i23;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i23, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i24 = be0Var.G;
                int i25 = i24 / 86400;
                int i26 = i24 % 86400;
                int i27 = i26 / 3600;
                int i28 = (i26 % 3600) / 60;
                if (i25 == 0 && i27 == 0) {
                    i28 = Math.max(1, i28);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i25 == 0 || i27 == 0) ? (i27 == 0 || i28 == 0) ? i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i25, new Object[0])) : i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i25, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]), LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i25, new Object[0]), LocaleController.formatPluralString("Hours", i27, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new eu(be0Var, i11));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 19:
                ke0 ke0Var = (ke0) this.b;
                Context context2 = (Context) this.c;
                rg0 rg0Var = ke0Var.y;
                if (rg0Var.V.getTag() == null) {
                    if (!ke0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(ke0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new eu(ke0Var, 18));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        rg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new ie0(ke0Var, i15), 10);
                        break;
                    }
                }
                break;
            case 20:
                uf0 uf0Var = (uf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = uf0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = uf0Var.p0) != null) {
                    uf0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!uf0Var.d0) {
                    sf0 sf0Var = uf0Var.v;
                    if ((sf0Var == null || sf0Var.getVisibility() == 8) && !uf0Var.i0) {
                        if (uf0Var.g0 != 0) {
                            if (uf0Var.s0.V.getTag() == null) {
                                uf0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = uf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = uf0Var.c;
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
                            uf0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, uf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new w10(19, uf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new jf0(uf0Var, i15));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 21:
                qg0 qg0Var = (qg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = qg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    qg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (qg0Var.M > 0 && currentTimeMillis - qg0Var.N > 1500) {
                    qg0Var.M = 0;
                }
                int i29 = qg0Var.M + 1;
                qg0Var.M = i29;
                qg0Var.N = currentTimeMillis;
                if (i29 < 5) {
                    if (i29 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i29, new Object[0]), 0);
                        qg0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    qg0Var.M = 0;
                    qg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new rv(qg0Var, i15));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                cj0 cj0Var = (cj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                ej0 ej0Var = cj0Var.d;
                if (!ej0Var.a0(messageObject)) {
                    ej0Var.getOrCreateStoryViewer().F(ej0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(ej0Var.f));
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
                qo0.h0((qo0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.o70 o70Var2 = (org.telegram.ui.Components.o70) this.c;
                if (photoViewer.T4 != null) {
                    o70Var2.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.m4;
                    if (n2Var2 instanceof xn) {
                        ((xn) n2Var2).J9(photoViewer.T4, false, true);
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
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.k1;
                                    e4Var2.l0 = new gh(i13, e4Var2);
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
                            ou0 ou0Var = photoViewer2.e0;
                            org.telegram.ui.Components.x11 x11Var = new org.telegram.ui.Components.x11(activity);
                            x11Var.d = new org.telegram.ui.Components.jq0(x11Var, i11);
                            x11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            x11Var.setTextColor(-1);
                            x11Var.setTextSize(1, 14.0f);
                            x11Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            x11Var.setGravity(16);
                            ou0Var.addView(x11Var, w7.x5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            x11Var.setVisibility(8);
                            photoViewer2.m1 = x11Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.x11 x11Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.r61 r61Var = photoViewer2.j1;
                        org.telegram.ui.Components.jq0 jq0Var = x11Var2.d;
                        if (r61Var != null) {
                            x11Var2.a = r61Var;
                            x11Var2.a();
                            x11Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            AndroidUtilities.runOnUIThread(jq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = x11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                x11Var2.b.cancel();
                                x11Var2.b = null;
                            }
                            if (x11Var2.getVisibility() != 0) {
                                x11Var2.setAlpha(0.0f);
                                x11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = x11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                x11Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.o70) this.c).K((org.telegram.ui.Components.o70) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i31 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i31;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new gs0(privacySettingsActivity, b2Var, setaccountttl, i13));
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

    public /* synthetic */ pv(org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.a = 27;
        this.c = o70Var;
        this.b = o70Var2;
    }
}
