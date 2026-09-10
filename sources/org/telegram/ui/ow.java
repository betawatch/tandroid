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
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        String str;
        u21 u21Var = (u21) this.b;
        Context context = (Context) this.c;
        StringBuilder sb2 = new StringBuilder();
        String obj = u21Var.a[0].getText().toString();
        String obj2 = u21Var.a[3].getText().toString();
        String obj3 = u21Var.a[2].getText().toString();
        String obj4 = u21Var.a[1].getText().toString();
        String obj5 = u21Var.a[4].getText().toString();
        try {
            if (!TextUtils.isEmpty(obj)) {
                sb2.append("server=");
                sb2.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append("port=");
                sb2.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (u21Var.v == 2) {
                str = "https://t.me/proxy?";
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append("secret=");
                sb2.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb2.length() != 0) {
                        sb2.append("&");
                    }
                    sb2.append("user=");
                    sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb2.length() != 0) {
                        sb2.append("&");
                    }
                    sb2.append("pass=");
                    sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb2.length() == 0) {
                return;
            }
            StringBuilder u10 = a4.a.u(str);
            u10.append(sb2.toString());
            org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
            ti0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
            u21Var.showDialog(ti0Var);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j3;
        char c10;
        char c11;
        String formatString;
        int i10;
        int i11;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i12;
        a61 a61Var;
        int i13 = 3;
        org.telegram.ui.ActionBar.c3 c3Var = null;
        switch (this.a) {
            case 0:
                wy wyVar = (wy) this.b;
                wyVar.r4((ArrayList) this.c, 102, false, false, null);
                wyVar.finishPreviewFragment();
                break;
            case 1:
                wy.H0((wy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new uv(0, (wy) this.b, (String) this.c), 250L);
                break;
            case 3:
                f20 f20Var = (f20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((g20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (f20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = f20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i14 = 0;
                while (i14 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList = i14 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList2 = i14 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList.size();
                    for (int i15 = 0; i15 < size; i15 = com.google.android.gms.internal.vision.e2.f(j3, arrayList2, i15, 1)) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i15);
                        j3 = inputPeer.user_id;
                        if (j3 == 0) {
                            long j10 = inputPeer.chat_id;
                            if (j10 == 0) {
                                j10 = inputPeer.channel_id;
                            }
                            j3 = -j10;
                        }
                    }
                    i14++;
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
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, f20Var.e, new uv(17, f20Var, suggestedFilter));
                break;
            case 4:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 5:
                org.telegram.ui.Components.g21 g21Var = (org.telegram.ui.Components.g21) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                g21Var.run();
                h3Var.dismiss();
                break;
            case 6:
                t30 t30Var = (t30) this.b;
                TextView textView = (TextView) this.c;
                j60 j60Var = t30Var.E;
                ChatObject.Call call = j60Var.a1;
                if (call != null && call.recording) {
                    j60Var.G1(textView);
                    break;
                }
                break;
            case 7:
                new s50((Context) this.c, (t50) this.b).show();
                break;
            case 8:
                c80 c80Var = (c80) this.b;
                org.telegram.ui.Components.kj0 kj0Var = (org.telegram.ui.Components.kj0) this.c;
                c80Var.getClass();
                if (!wy.x4) {
                    wy.x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.i6 N0 = !q6 ? org.telegram.ui.ActionBar.j6.N0("Night") : org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.j6.o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    c80Var.v.P(!q6 ? r0.e[0] - 1 : 0);
                    kj0Var.d();
                    int[] iArr = {(kj0Var.getMeasuredWidth() / 2) + r7, (kj0Var.getMeasuredHeight() / 2) + r7};
                    kj0Var.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), kj0Var);
                    kj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 9:
                p80 p80Var = (p80) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                p80Var.Q.dismiss();
                if (p80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i18 = p80Var.c0;
                    if (i18 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i18 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    wy wyVar2 = new wy(bundle);
                    wyVar2.C2 = new l80(0, p80Var, wyVar2);
                    p2Var.presentFragment(wyVar2);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, p80Var.c0);
                    b6 b6Var = new b6(bundle2);
                    b6Var.d = p80Var.f0;
                    b6Var.U();
                    p2Var.presentFragment(b6Var);
                    break;
                }
            case 10:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i19 = 0;
                while (i19 < 2) {
                    q4VarArr[i19].a.a(i19 == num.intValue(), true);
                    i19++;
                }
                break;
            case 11:
                org.telegram.ui.Components.d5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new nb0((xb0) this.b, 0));
                break;
            case 12:
                xb0 xb0Var = (xb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (xb0Var.e == null) {
                    ub0 ub0Var = xb0Var.f;
                    if (ub0Var.e.h) {
                        int i20 = -xb0Var.N;
                        xb0Var.N = i20;
                        AndroidUtilities.shakeViewSpring(ub0Var, i20);
                        break;
                    } else {
                        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                        Switch r42 = x8Var.e;
                        x8Var.setChecked(!r42.h);
                        xb0Var.r.setVisibility(r42.h ? 0 : 8);
                        int i21 = 0;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            xb0Var.f.setChecked(false);
                            xb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            mb0 mb0Var = new mb0(xb0Var, i21);
                            runnableArr[0] = mb0Var;
                            AndroidUtilities.runOnUIThread(mb0Var, 60L);
                            break;
                        } else {
                            xb0Var.f.setCheckBoxIcon(0);
                            xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            mb0 mb0Var2 = new mb0(xb0Var, 1);
                            runnableArr[0] = mb0Var2;
                            AndroidUtilities.runOnUIThread(mb0Var2);
                            break;
                        }
                    }
                }
                break;
            case 13:
                id0 id0Var = (id0) this.b;
                id0Var.r0((cd0) this.c);
                ad0 ad0Var = id0Var.I0;
                if (ad0Var != null) {
                    ad0Var.dismiss();
                    break;
                }
                break;
            case 14:
                fd0 fd0Var = (fd0) this.b;
                hd0 hd0Var = (hd0) this.c;
                id0 id0Var2 = fd0Var.b;
                id0Var2.getClass();
                id0Var2.F0.b(hd0Var.c, id0Var2.G0, true, 0, 0L);
                id0Var2.finishFragment();
                break;
            case 15:
                ge0 ge0Var = (ge0) this.b;
                Context context = (Context) this.c;
                String string = ge0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.b11 b11Var = new org.telegram.ui.Components.b11();
                    b11Var.a |= 256;
                    b11Var.b = indexOf;
                    int i22 = lastIndexOf + 1;
                    b11Var.c = i22;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c11(b11Var, 0), indexOf, i22, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i23 = ge0Var.G;
                int i24 = i23 / 86400;
                int i25 = i23 % 86400;
                int i26 = i25 / 3600;
                int i27 = (i25 % 3600) / 60;
                if (i24 == 0 && i26 == 0) {
                    i27 = Math.max(1, i27);
                }
                if (i24 == 0 || i26 == 0) {
                    c10 = 0;
                    if (i26 == 0 || i27 == 0) {
                        c11 = 1;
                        formatString = i24 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i24, new Object[0])) : i26 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i24, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i27, new Object[0]));
                    } else {
                        c11 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i26, new Object[0]), LocaleController.formatPluralString("Minutes", i27, new Object[0]));
                    }
                    i10 = 2;
                } else {
                    c10 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i24, new Object[0]), LocaleController.formatPluralString("Hours", i26, new Object[0]));
                    i10 = 2;
                    c11 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[i10];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = formatString;
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new iu(ge0Var, 17));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 16:
                pe0 pe0Var = (pe0) this.b;
                Context context2 = (Context) this.c;
                xg0 xg0Var = pe0Var.y;
                if (xg0Var.V.getTag() == null) {
                    if (pe0Var.n.has_recovery) {
                        xg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_auth_requestPasswordRecovery, new ne0(pe0Var, 1), 10);
                        break;
                    } else {
                        AndroidUtilities.hideKeyboard(pe0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new iu(pe0Var, 18));
                        alertDialog$Builder2.o();
                        break;
                    }
                }
                break;
            case 17:
                zf0 zf0Var = (zf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = zf0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = zf0Var.p0) != null) {
                    zf0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!zf0Var.d0) {
                    xf0 xf0Var = zf0Var.v;
                    if ((xf0Var == null || xf0Var.getVisibility() == 8) && !zf0Var.i0) {
                        if (zf0Var.g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = zf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = zf0Var.c;
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
                            zf0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, zf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new l80(14, zf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new of0(zf0Var, 1));
                            alertDialog$Builder3.o();
                            break;
                        } else if (zf0Var.s0.V.getTag() == null) {
                            zf0Var.x();
                            break;
                        }
                    }
                }
                break;
            case 18:
                wg0 wg0Var = (wg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = wg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    wg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (wg0Var.M <= 0 || currentTimeMillis - wg0Var.N <= 1500) {
                    i12 = 0;
                } else {
                    i12 = 0;
                    wg0Var.M = 0;
                }
                int i28 = wg0Var.M + 1;
                wg0Var.M = i28;
                wg0Var.N = currentTimeMillis;
                if (i28 >= 5) {
                    wg0Var.M = i12;
                    wg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new wv(wg0Var, 1));
                    alertDialog$Builder4.o();
                    break;
                } else if (i28 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i28, new Object[0]), 0);
                    wg0Var.O = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 19:
                ij0 ij0Var = (ij0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                kj0 kj0Var2 = ij0Var.d;
                if (!kj0Var2.a0(messageObject)) {
                    kj0Var2.getOrCreateStoryViewer().G(kj0Var2.getParentActivity(), messageObject.storyItem, zh.s5.a(kj0Var2.f));
                    break;
                }
                break;
            case 20:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
                break;
            case 21:
                wo0.h0((wo0) this.b, (String) this.c, view);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) this.c;
                if (photoViewer.T4 != null) {
                    w70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer.m4;
                    if (p2Var2 instanceof eo) {
                        ((eo) p2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i29 = photoViewer2.P4;
                    if (i29 >= 0 && i29 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                bi.x4 x4Var = photoViewer2.k1;
                                if (x4Var != null) {
                                    x4Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new bi.x4(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.uq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    bi.x4 x4Var2 = photoViewer2.k1;
                                    x4Var2.l0 = new jh(2, x4Var2);
                                    x4Var2.d = 3500L;
                                    x4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.Y2(true);
                        photoViewer2.p2(1);
                        break;
                    } else if (photoViewer2.j8) {
                        if (photoViewer2.m1 == null) {
                            wu0 wu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.m21 m21Var = new org.telegram.ui.Components.m21(activity);
                            m21Var.d = new org.telegram.ui.Components.uq0(m21Var, 17);
                            m21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            m21Var.setTextColor(-1);
                            m21Var.setTextSize(1, 14.0f);
                            m21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            m21Var.setGravity(16);
                            wu0Var.addView(m21Var, w7.a6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            m21Var.setVisibility(8);
                            photoViewer2.m1 = m21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.m21 m21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.f71 f71Var = photoViewer2.j1;
                        org.telegram.ui.Components.uq0 uq0Var = m21Var2.d;
                        if (f71Var != null) {
                            m21Var2.a = f71Var;
                            m21Var2.a();
                            m21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(uq0Var);
                            AndroidUtilities.runOnUIThread(uq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = m21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                m21Var2.b.cancel();
                                m21Var2.b = null;
                            }
                            if (m21Var2.getVisibility() != 0) {
                                m21Var2.setAlpha(0.0f);
                                m21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = m21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                m21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                ((org.telegram.ui.Components.w70) this.b).K((org.telegram.ui.Components.w70) this.c);
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i30 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(privacySettingsActivity.getParentActivity(), 3, null);
                d2Var.g0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i30;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ms0(privacySettingsActivity, d2Var, setaccountttl, 2));
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j11 = profileActivity2.e1;
                long j12 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                rq rqVar = new rq(j11, j12, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                rqVar.X0 = new rz0(profileActivity2, chat, rqVar);
                profileActivity2.presentFragment(rqVar);
                break;
            case 28:
                a(view);
                break;
            default:
                a61 a61Var2 = (a61) this.b;
                Context context5 = (Context) this.c;
                if (a61Var2.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    fz0 fz0Var = new fz0(i13, a61Var2, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.d5.a;
                    if (context5 == null) {
                        a61Var = a61Var2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.c3 c3Var2 = new org.telegram.ui.ActionBar.c3(context5, null);
                        c3Var2.a();
                        org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context5, null);
                        dd0Var.setTextColor(w02);
                        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        dd0Var.setItemCount(5);
                        org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context5, null);
                        f4Var.setItemCount(5);
                        f4Var.setTextColor(w02);
                        f4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context5, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(w02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context5, dd0Var, f4Var, g4Var, 3);
                        org.telegram.ui.Components.g4 g4Var2 = g4Var;
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context5);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new ai.h(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.h hVar = new di.h(context5, 16);
                        linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                        dd0Var.setMinValue(0);
                        dd0Var.setMaxValue(365);
                        dd0Var.setWrapSelectorWheel(false);
                        dd0Var.setFormatter(new org.telegram.ui.Components.b(7));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(dd0Var, f4Var, g4Var2, 15);
                        dd0Var.setOnValueChangedListener(aVar);
                        f4Var.setMinValue(0);
                        f4Var.setMaxValue(23);
                        linearLayout.addView(f4Var, w7.a6.l(0.2f, 0, 270));
                        f4Var.setFormatter(new org.telegram.ui.Components.b(8));
                        f4Var.setOnValueChangedListener(aVar);
                        g4Var2.setMinValue(0);
                        g4Var2.setMaxValue(59);
                        g4Var2.setValue(0);
                        g4Var2.setFormatter(new org.telegram.ui.Components.b(9));
                        linearLayout.addView(g4Var2, w7.a6.l(0.3f, 0, 270));
                        g4Var2.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 <= 0 || currentTimeMillis2 == 2147483646) {
                            a61Var = a61Var2;
                        } else {
                            long j13 = currentTimeMillis2 * 1000;
                            a61Var = a61Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j13);
                            if (timeInMillis >= 0) {
                                g4Var2 = g4Var2;
                                g4Var2.setValue(calendar.get(12));
                                f4Var.setValue(calendar.get(11));
                                dd0Var.setValue(timeInMillis);
                            } else {
                                g4Var2 = g4Var2;
                            }
                        }
                        org.telegram.ui.Components.g4 g4Var3 = g4Var2;
                        org.telegram.ui.Components.d5.g(null, null, 0L, 0L, 0, dd0Var, f4Var, g4Var3);
                        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        hVar.setGravity(17);
                        hVar.setTextColor(w04);
                        hVar.setTextSize(1, 14.0f);
                        hVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        hVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.c3 c3Var3 = c3Var2;
                        hVar.setOnClickListener(new org.telegram.ui.Components.o0(dd0Var, f4Var, g4Var3, calendar, fz0Var, c3Var2, 1));
                        c3Var3.b(v3Var);
                        org.telegram.ui.ActionBar.h3 h3Var2 = c3Var3.a;
                        h3Var2.show();
                        h3Var2.setBackgroundColor(w03);
                        h3Var2.fixNavigationBar(w03);
                        c3Var = c3Var3;
                    }
                    c3Var.a.setOnHideListener(new di.h0(a61Var, zArr, 11));
                    org.telegram.ui.ActionBar.h3 h3Var3 = c3Var.a;
                    h3Var3.show();
                    a61Var.w = h3Var3;
                    a61Var.c(false);
                    break;
                }
                break;
        }
    }
}
