package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x05ac  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11 = 18;
        int i12 = 10;
        int i13 = 5;
        ArrayList arrayList = null;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                k51.a(rkVar.getContext(), rkVar.d);
                break;
            case 1:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i17 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.n2 n2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = n2Var.getMessagesController().getInputPeer(message.peer_id);
                n2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, i11), 2);
                break;
            case 2:
                h71 h71Var = (h71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    h71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(h71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        h71Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.h30 h30Var = (org.telegram.ui.h30) this.b;
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) this.c;
                if (h30Var.h()) {
                    if (uf.b.a(q50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(q50Var.i0);
                        q50Var.dismiss();
                        break;
                    } else {
                        f5.A(q50Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(q50Var.i0)) {
                    i30.e0 = false;
                    q50Var.dismiss();
                    break;
                } else {
                    f5.z(h30Var.getContext()).o();
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                vj0 vj0Var = (vj0) this.c;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    vj0Var.M(69);
                    vj0Var.P(99);
                } else {
                    vj0Var.M(36);
                    vj0Var.P(69);
                }
                vj0Var.start();
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                a2Var.c(z11, true);
                break;
            case 6:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.b;
                Context context = (Context) this.c;
                k2Var.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    hh1.v((Activity) context, k2Var.M);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.fs fsVar = (org.telegram.ui.fs) this.b;
                fsVar.showDialog(f5.l(fsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.v3(fsVar, i13), null, false, false, fsVar.r).a);
                break;
            case 8:
                org.telegram.ui.at atVar = (org.telegram.ui.at) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.et etVar = atVar.a;
                if (etVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ct ctVar = etVar.l;
                        TLObject tLObject = etVar.W;
                        if (tLObject == null) {
                            tLObject = etVar.Z;
                        }
                        ctVar.r(0, 0, etVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ct ctVar2 = etVar.l;
                        TLObject tLObject2 = etVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = etVar.Z;
                        }
                        ctVar2.r(0, 0, etVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(etVar.r).removeRecentGif(etVar.W);
                        etVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(etVar.r).addRecentGif(etVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(etVar.r).saveGif("gif", etVar.W);
                        etVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = etVar.W;
                        TLRPC.BotInlineResult botInlineResult = etVar.Z;
                        Object obj = etVar.b0;
                        org.telegram.ui.ct ctVar3 = etVar.l;
                        f5.L(etVar.w, ctVar3.a(), new a1.d(ctVar3, document, botInlineResult, obj, 11), etVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ct ctVar4 = etVar.l;
                        TLObject tLObject3 = etVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = etVar.Z;
                        }
                        ctVar4.x(tLObject3, etVar.b0);
                    }
                    etVar.p();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.vu vuVar = (org.telegram.ui.vu) this.b;
                bi.c cVar = (bi.c) this.c;
                org.telegram.ui.uu uuVar = vuVar.X;
                wy0[] wy0VarArr = vuVar.b0;
                for (wy0 wy0Var : wy0VarArr) {
                    if (wy0Var != null) {
                        boolean z13 = wy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var2.getTag()).intValue();
                wy0 wy0Var2 = wy0VarArr[intValue2];
                boolean z14 = wy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    wy0Var2.c = z15;
                    wy0Var2.d = true;
                }
                a2Var2.c(wy0Var2.c, true);
                boolean z16 = wy0VarArr[intValue2].c;
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z16;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z16;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z16;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z16;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            if (((bi.b) arrayList.get(i18)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i18))) {
                                        hashSet.add((bi.b) arrayList.get(i18));
                                        cVar.g((bi.b) arrayList.get(i18), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i18))) {
                                    hashSet.remove(arrayList.get(i18));
                                    cVar.g((bi.b) arrayList.get(i18), false);
                                }
                            }
                        }
                    }
                    vuVar.e0.c();
                    vuVar.a0.a(uuVar.d(), true);
                    uuVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                vuVar.e0.c();
                vuVar.a0.a(uuVar.d(), true);
                uuVar.c(true);
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.b;
                i80 i80Var = (i80) this.c;
                cyVar.getClass();
                i80Var.u();
                cyVar.presentFragment(new ProxyListActivity());
                break;
            case 11:
                hi.t0.e((org.telegram.ui.ActionBar.b2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.cy) this.b).Z2);
                break;
            case 12:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 13:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) this.b;
                cyVar2.p4((ArrayList) this.c, 102, false, false, null);
                cyVar2.finishPreviewFragment();
                break;
            case 14:
                org.telegram.ui.cy.D0((org.telegram.ui.cy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(i14, (org.telegram.ui.cy) this.b, (String) this.c), 250L);
                break;
            case 16:
                org.telegram.ui.l10 l10Var = (org.telegram.ui.l10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.m10) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (l10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = l10Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i19 = 0;
                while (i19 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i19 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i19 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i20);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            j10 = j11 != 0 ? -j11 : -inputPeer.channel_id;
                        }
                        i20 = com.google.android.gms.internal.play_billing.k3.h(j10, arrayList5, i20, 1);
                    }
                    i19++;
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
                org.telegram.ui.n00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, l10Var.e, new org.telegram.ui.lt(19, l10Var, suggestedFilter));
                break;
            case 17:
                pf.d.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 18:
                cz0 cz0Var = (cz0) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                cz0Var.run();
                f3Var.dismiss();
                break;
            case 19:
                org.telegram.ui.z20 z20Var = (org.telegram.ui.z20) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.q50 q50Var2 = z20Var.E;
                ChatObject.Call call = q50Var2.a1;
                if (call != null && call.recording) {
                    q50Var2.H1(textView);
                    break;
                }
                break;
            case 20:
                new org.telegram.ui.a50((Context) this.c, (org.telegram.ui.v10) this.b).show();
                break;
            case 21:
                org.telegram.ui.j70 j70Var = (org.telegram.ui.j70) this.b;
                yj0 yj0Var = (yj0) this.c;
                j70Var.getClass();
                if (!org.telegram.ui.cy.x4) {
                    org.telegram.ui.cy.x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z17 = !q6;
                    org.telegram.ui.ActionBar.g6 O0 = !q6 ? org.telegram.ui.ActionBar.h6.O0("Night") : org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.h6.o = 0;
                    org.telegram.ui.ActionBar.h6.r1();
                    org.telegram.ui.ActionBar.h6.A();
                    vj0 vj0Var2 = j70Var.v;
                    vj0Var2.P(!q6 ? vj0Var2.e[0] - 1 : 0);
                    yj0Var.d();
                    int[] iArr = {(yj0Var.getMeasuredWidth() / 2) + r14, (yj0Var.getMeasuredHeight() / 2) + r14};
                    yj0Var.getLocationInWindow(iArr);
                    int i21 = iArr[0];
                    int i22 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), yj0Var);
                    yj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.v70 v70Var = (org.telegram.ui.v70) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                v70Var.Q.dismiss();
                if (v70Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i23 = v70Var.c0;
                    if (i23 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i23 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.cy cyVar3 = new org.telegram.ui.cy(bundle);
                    cyVar3.C2 = new org.telegram.ui.xu(i12, v70Var, cyVar3);
                    n2Var2.presentFragment(cyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, v70Var.c0);
                    org.telegram.ui.e6 e6Var = new org.telegram.ui.e6(bundle2);
                    e6Var.d = v70Var.f0;
                    e6Var.U();
                    n2Var2.presentFragment(e6Var);
                    break;
                }
            case 23:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.p4[] p4VarArr = (org.telegram.ui.Cells.p4[]) this.c;
                Pattern pattern = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.p4) view).getCurrentLocale();
                int i24 = 0;
                while (i24 < 2) {
                    p4VarArr[i24].a.a(i24 == num.intValue(), true);
                    i24++;
                }
                break;
            case 24:
                f5.x((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.qa0((org.telegram.ui.ab0) this.b, i15));
                break;
            case 25:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (ab0Var.e == null) {
                    org.telegram.ui.xa0 xa0Var = ab0Var.f;
                    if (xa0Var.e.h) {
                        int i25 = -ab0Var.N;
                        ab0Var.N = i25;
                        AndroidUtilities.shakeViewSpring(xa0Var, i25);
                        break;
                    } else {
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        Switch r42 = v8Var.e;
                        v8Var.setChecked(!r42.h);
                        ab0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            ab0Var.f.setChecked(false);
                            ab0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            ab0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(ab0Var, i15);
                            runnableArr[0] = pa0Var;
                            AndroidUtilities.runOnUIThread(pa0Var, 60L);
                            break;
                        } else {
                            ab0Var.f.setCheckBoxIcon(0);
                            ab0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            org.telegram.ui.pa0 pa0Var2 = new org.telegram.ui.pa0(ab0Var, i16);
                            runnableArr[0] = pa0Var2;
                            AndroidUtilities.runOnUIThread(pa0Var2);
                            break;
                        }
                    }
                }
                break;
            case 26:
                org.telegram.ui.nc0 nc0Var = (org.telegram.ui.nc0) this.b;
                nc0Var.q0((org.telegram.ui.hc0) this.c);
                org.telegram.ui.fc0 fc0Var = nc0Var.I0;
                if (fc0Var != null) {
                    fc0Var.dismiss();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.kc0 kc0Var = (org.telegram.ui.kc0) this.b;
                org.telegram.ui.mc0 mc0Var = (org.telegram.ui.mc0) this.c;
                org.telegram.ui.nc0 nc0Var2 = kc0Var.b;
                nc0Var2.getClass();
                nc0Var2.F0.b(mc0Var.c, nc0Var2.G0, true, 0, 0L);
                nc0Var2.finishFragment();
                break;
            case 28:
                org.telegram.ui.md0 md0Var = (org.telegram.ui.md0) this.b;
                Context context2 = (Context) this.c;
                String string = md0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    n11 n11Var = new n11();
                    n11Var.a |= 256;
                    n11Var.b = indexOf;
                    int i26 = lastIndexOf + 1;
                    n11Var.c = i26;
                    spannableStringBuilder.setSpan(new o11(n11Var, 0), indexOf, i26, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i27 = md0Var.G;
                int i28 = i27 / 86400;
                int i29 = i27 % 86400;
                int i30 = i29 / 3600;
                int i31 = (i29 % 3600) / 60;
                if (i28 == 0 && i30 == 0) {
                    i31 = Math.max(1, i31);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i28 == 0 || i30 == 0) ? (i30 == 0 || i31 == 0) ? i28 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i28, new Object[0])) : i30 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i31, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i30, new Object[0]), LocaleController.formatPluralString("Minutes", i31, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i28, new Object[0]), LocaleController.formatPluralString("Hours", i30, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new org.telegram.ui.ut(md0Var, 17));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                org.telegram.ui.vd0 vd0Var = (org.telegram.ui.vd0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.dg0 dg0Var = vd0Var.y;
                if (dg0Var.V.getTag() == null) {
                    if (vd0Var.n.has_recovery) {
                        dg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.td0(vd0Var, i16), 10);
                        break;
                    } else {
                        AndroidUtilities.hideKeyboard(vd0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new org.telegram.ui.ut(vd0Var, i11));
                        alertDialog$Builder2.o();
                        break;
                    }
                }
                break;
        }
    }
}
