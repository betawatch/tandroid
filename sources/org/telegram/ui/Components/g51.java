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
import org.telegram.ui.jh1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x05aa  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11 = 18;
        int i12 = 5;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                i51.a(tkVar.getContext(), tkVar.d);
                break;
            case 1:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.n2 n2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = n2Var.getMessagesController().getInputPeer(message.peer_id);
                n2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, i11), 2);
                break;
            case 2:
                f71 f71Var = (f71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    f71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(f71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        f71Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.b;
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.c;
                if (j30Var.h()) {
                    if (uf.b.a(s50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(s50Var.i0);
                        s50Var.dismiss();
                        break;
                    } else {
                        f5.A(s50Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(s50Var.i0)) {
                    i30.e0 = false;
                    s50Var.dismiss();
                    break;
                } else {
                    f5.z(j30Var.getContext()).o();
                    break;
                }
            case 4:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                uj0 uj0Var = (uj0) this.c;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    uj0Var.M(69);
                    uj0Var.P(99);
                } else {
                    uj0Var.M(36);
                    uj0Var.P(69);
                }
                uj0Var.start();
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
                    jh1.v((Activity) context, k2Var.M);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.b;
                hsVar.showDialog(f5.l(hsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.v3(hsVar, i12), null, false, false, hsVar.r).a);
                break;
            case 8:
                org.telegram.ui.ct ctVar = (org.telegram.ui.ct) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.gt gtVar = ctVar.a;
                if (gtVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.et etVar = gtVar.l;
                        TLObject tLObject = gtVar.W;
                        if (tLObject == null) {
                            tLObject = gtVar.Z;
                        }
                        etVar.r(0, 0, gtVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.et etVar2 = gtVar.l;
                        TLObject tLObject2 = gtVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = gtVar.Z;
                        }
                        etVar2.r(0, 0, gtVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(gtVar.r).removeRecentGif(gtVar.W);
                        gtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(gtVar.r).addRecentGif(gtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(gtVar.r).saveGif("gif", gtVar.W);
                        gtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = gtVar.W;
                        TLRPC.BotInlineResult botInlineResult = gtVar.Z;
                        Object obj = gtVar.b0;
                        org.telegram.ui.et etVar3 = gtVar.l;
                        f5.L(gtVar.w, etVar3.a(), new a1.d(etVar3, document, botInlineResult, obj, 11), gtVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.et etVar4 = gtVar.l;
                        TLObject tLObject3 = gtVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = gtVar.Z;
                        }
                        etVar4.x(tLObject3, gtVar.b0);
                    }
                    gtVar.p();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.b;
                bi.c cVar = (bi.c) this.c;
                org.telegram.ui.wu wuVar = xuVar.X;
                uy0[] uy0VarArr = xuVar.b0;
                for (uy0 uy0Var : uy0VarArr) {
                    if (uy0Var != null) {
                        boolean z13 = uy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var2.getTag()).intValue();
                uy0 uy0Var2 = uy0VarArr[intValue2];
                boolean z14 = uy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    uy0Var2.c = z15;
                    uy0Var2.d = true;
                }
                a2Var2.c(uy0Var2.c, true);
                boolean z16 = uy0VarArr[intValue2].c;
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
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((bi.b) arrayList.get(i17)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((bi.b) arrayList.get(i17));
                                        cVar.g((bi.b) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    cVar.g((bi.b) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    xuVar.e0.c();
                    xuVar.a0.a(wuVar.d(), true);
                    wuVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                xuVar.e0.c();
                xuVar.a0.a(wuVar.d(), true);
                wuVar.c(true);
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.b;
                i80 i80Var = (i80) this.c;
                eyVar.getClass();
                i80Var.u();
                eyVar.presentFragment(new ProxyListActivity());
                break;
            case 11:
                hi.t0.e((org.telegram.ui.ActionBar.b2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.ey) this.b).Z2);
                break;
            case 12:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 13:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.b;
                eyVar2.p4((ArrayList) this.c, 102, false, false, null);
                eyVar2.finishPreviewFragment();
                break;
            case 14:
                org.telegram.ui.ey.D0((org.telegram.ui.ey) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nt(i13, (org.telegram.ui.ey) this.b, (String) this.c), 250L);
                break;
            case 16:
                org.telegram.ui.n10 n10Var = (org.telegram.ui.n10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.o10) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (n10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = n10Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i18 = 0;
                while (i18 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i18 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i18 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i19);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            if (j11 == 0) {
                                j11 = inputPeer.channel_id;
                            }
                            j10 = -j11;
                        }
                        i19 = com.google.android.gms.internal.cast.a6.h(j10, arrayList5, i19, 1);
                    }
                    i18++;
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
                org.telegram.ui.p00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, n10Var.e, new org.telegram.ui.nt(19, n10Var, suggestedFilter));
                break;
            case 17:
                pf.d.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 18:
                az0 az0Var = (az0) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                az0Var.run();
                f3Var.dismiss();
                break;
            case 19:
                org.telegram.ui.b30 b30Var = (org.telegram.ui.b30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.s50 s50Var2 = b30Var.E;
                ChatObject.Call call = s50Var2.a1;
                if (call != null && call.recording) {
                    s50Var2.H1(textView);
                    break;
                }
                break;
            case 20:
                new org.telegram.ui.c50((Context) this.c, (org.telegram.ui.x10) this.b).show();
                break;
            case 21:
                org.telegram.ui.l70 l70Var = (org.telegram.ui.l70) this.b;
                xj0 xj0Var = (xj0) this.c;
                l70Var.getClass();
                if (!org.telegram.ui.ey.x4) {
                    org.telegram.ui.ey.x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z17 = !q6;
                    org.telegram.ui.ActionBar.g6 O0 = !q6 ? org.telegram.ui.ActionBar.h6.O0("Night") : org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.h6.o = 0;
                    org.telegram.ui.ActionBar.h6.r1();
                    org.telegram.ui.ActionBar.h6.A();
                    uj0 uj0Var2 = l70Var.v;
                    uj0Var2.P(!q6 ? uj0Var2.e[0] - 1 : 0);
                    xj0Var.d();
                    int[] iArr = {(xj0Var.getMeasuredWidth() / 2) + r14, (xj0Var.getMeasuredHeight() / 2) + r14};
                    xj0Var.getLocationInWindow(iArr);
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), xj0Var);
                    xj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.x70 x70Var = (org.telegram.ui.x70) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                x70Var.Q.dismiss();
                if (x70Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = x70Var.c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.ey eyVar3 = new org.telegram.ui.ey(bundle);
                    eyVar3.C2 = new org.telegram.ui.ov(x70Var, eyVar3);
                    n2Var2.presentFragment(eyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, x70Var.c0);
                    org.telegram.ui.e6 e6Var = new org.telegram.ui.e6(bundle2);
                    e6Var.d = x70Var.f0;
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
                int i23 = 0;
                while (i23 < 2) {
                    p4VarArr[i23].a.a(i23 == num.intValue(), true);
                    i23++;
                }
                break;
            case 24:
                f5.x((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.sa0((org.telegram.ui.cb0) this.b, i14));
                break;
            case 25:
                org.telegram.ui.cb0 cb0Var = (org.telegram.ui.cb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (cb0Var.e == null) {
                    org.telegram.ui.za0 za0Var = cb0Var.f;
                    if (za0Var.e.h) {
                        int i24 = -cb0Var.N;
                        cb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(za0Var, i24);
                        break;
                    } else {
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        Switch r42 = v8Var.e;
                        v8Var.setChecked(!r42.h);
                        cb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            cb0Var.f.setChecked(false);
                            cb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            cb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            org.telegram.ui.ra0 ra0Var = new org.telegram.ui.ra0(cb0Var, i14);
                            runnableArr[0] = ra0Var;
                            AndroidUtilities.runOnUIThread(ra0Var, 60L);
                            break;
                        } else {
                            cb0Var.f.setCheckBoxIcon(0);
                            cb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            org.telegram.ui.ra0 ra0Var2 = new org.telegram.ui.ra0(cb0Var, i15);
                            runnableArr[0] = ra0Var2;
                            AndroidUtilities.runOnUIThread(ra0Var2);
                            break;
                        }
                    }
                }
                break;
            case 26:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) this.b;
                pc0Var.q0((org.telegram.ui.jc0) this.c);
                org.telegram.ui.hc0 hc0Var = pc0Var.I0;
                if (hc0Var != null) {
                    hc0Var.dismiss();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.mc0 mc0Var = (org.telegram.ui.mc0) this.b;
                org.telegram.ui.oc0 oc0Var = (org.telegram.ui.oc0) this.c;
                org.telegram.ui.pc0 pc0Var2 = mc0Var.b;
                pc0Var2.getClass();
                pc0Var2.F0.b(oc0Var.c, pc0Var2.G0, true, 0, 0L);
                pc0Var2.finishFragment();
                break;
            case 28:
                org.telegram.ui.od0 od0Var = (org.telegram.ui.od0) this.b;
                Context context2 = (Context) this.c;
                String string = od0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    l11 l11Var = new l11();
                    l11Var.a |= 256;
                    l11Var.b = indexOf;
                    int i25 = lastIndexOf + 1;
                    l11Var.c = i25;
                    spannableStringBuilder.setSpan(new m11(l11Var, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = od0Var.G;
                int i27 = i26 / 86400;
                int i28 = i26 % 86400;
                int i29 = i28 / 3600;
                int i30 = (i28 % 3600) / 60;
                if (i27 == 0 && i29 == 0) {
                    i30 = Math.max(1, i30);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i27 == 0 || i29 == 0) ? (i29 == 0 || i30 == 0) ? i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i27, new Object[0])) : i29 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i27, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i30, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i29, new Object[0]), LocaleController.formatPluralString("Minutes", i30, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i27, new Object[0]), LocaleController.formatPluralString("Hours", i29, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new org.telegram.ui.wt(od0Var, 17));
                i0.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                org.telegram.ui.xd0 xd0Var = (org.telegram.ui.xd0) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.fg0 fg0Var = xd0Var.y;
                if (fg0Var.V.getTag() == null) {
                    if (xd0Var.n.has_recovery) {
                        fg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new org.telegram.ui.vd0(xd0Var, i15), 10);
                        break;
                    } else {
                        AndroidUtilities.hideKeyboard(xd0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new org.telegram.ui.wt(xd0Var, i11));
                        alertDialog$Builder2.o();
                        break;
                    }
                }
                break;
        }
    }
}
