package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.rh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0544  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10 = 7;
        int i11 = 18;
        int i12 = 5;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                n51 n51Var = (n51) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = n51Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(ds.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.vk vkVar = (org.telegram.ui.vk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                y51.a(vkVar.getContext(), vkVar.d);
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.r2 r2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = r2Var.getMessagesController().getInputPeer(message.peer_id);
                r2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new b2(undoView, i11), 2);
                break;
            case 3:
                y71 y71Var = (y71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    y71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(y71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        y71Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.o30 o30Var = (org.telegram.ui.o30) this.b;
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) this.c;
                if (o30Var.h()) {
                    if (vf.b.a(x50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(x50Var.i0);
                        x50Var.dismiss();
                        break;
                    } else {
                        g5.A(x50Var.i0, null, true).p();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(x50Var.i0)) {
                    k30.e0 = false;
                    x50Var.dismiss();
                    break;
                } else {
                    g5.z(o30Var.getContext()).p();
                    break;
                }
            case 5:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                yj0 yj0Var = (yj0) this.c;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    yj0Var.M(69);
                    yj0Var.P(99);
                } else {
                    yj0Var.M(36);
                    yj0Var.P(69);
                }
                yj0Var.start();
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                y1Var.c(z11, true);
                break;
            case 7:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                Context context = (Context) this.c;
                n2Var.getClass();
                boolean z12 = context instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    rh1.v((Activity) context, n2Var.M);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ls lsVar = (org.telegram.ui.ls) this.b;
                lsVar.showDialog(g5.l(lsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(lsVar, i12), null, false, false, lsVar.r).a);
                break;
            case 9:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ht htVar = dtVar.a;
                if (htVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ft ftVar = htVar.l;
                        TLObject tLObject = htVar.W;
                        if (tLObject == null) {
                            tLObject = htVar.Z;
                        }
                        ftVar.s(0, 0, htVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ft ftVar2 = htVar.l;
                        TLObject tLObject2 = htVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = htVar.Z;
                        }
                        ftVar2.s(0, 0, htVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(htVar.r).removeRecentGif(htVar.W);
                        htVar.l.K();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(htVar.r).addRecentGif(htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(htVar.r).saveGif("gif", htVar.W);
                        htVar.l.K();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = htVar.W;
                        TLRPC.BotInlineResult botInlineResult = htVar.Z;
                        Object obj = htVar.b0;
                        org.telegram.ui.ft ftVar3 = htVar.l;
                        g5.L(htVar.w, ftVar3.a(), new a1.d(ftVar3, document, botInlineResult, obj, 11), htVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ft ftVar4 = htVar.l;
                        TLObject tLObject3 = htVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = htVar.Z;
                        }
                        ftVar4.w(tLObject3, htVar.b0);
                    }
                    htVar.n();
                    break;
                }
                break;
            case 10:
                boolean z13 = false;
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.b;
                ci.b bVar = (ci.b) this.c;
                org.telegram.ui.wu wuVar = xuVar.X;
                jz0[] jz0VarArr = xuVar.b0;
                for (jz0 jz0Var : jz0VarArr) {
                    if (jz0Var != null) {
                        boolean z14 = jz0Var.c;
                    }
                }
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                int intValue2 = ((Integer) y1Var2.getTag()).intValue();
                jz0 jz0Var2 = jz0VarArr[intValue2];
                boolean z15 = jz0Var2.c;
                boolean z16 = !z15;
                if (z15 != z16) {
                    jz0Var2.c = z16;
                    jz0Var2.d = true;
                }
                y1Var2.c(jz0Var2.c, true);
                boolean z17 = jz0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue2 == 0) {
                    bVar.m = z17;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar.e;
                        bVar.o = z17;
                    } else if (intValue2 == 3) {
                        arrayList = bVar.f;
                        bVar.p = z17;
                    } else if (intValue2 == 4) {
                        arrayList = bVar.g;
                        bVar.q = z17;
                    } else if (intValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            if (((ci.a) arrayList.get(i17)).d == intValue2) {
                                if (z17) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((ci.a) arrayList.get(i17));
                                        bVar.g((ci.a) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    bVar.g((ci.a) arrayList.get(i17), z13);
                                }
                            }
                            i17++;
                            z13 = false;
                        }
                    }
                    xuVar.e0.d();
                    xuVar.a0.a(wuVar.d(), true);
                    wuVar.c(true);
                    break;
                } else {
                    bVar.n = z17;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                xuVar.e0.d();
                xuVar.a0.a(wuVar.d(), true);
                wuVar.c(true);
            case 11:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.b;
                l80 l80Var = (l80) this.c;
                eyVar.getClass();
                l80Var.u();
                eyVar.presentFragment(new ProxyListActivity());
                break;
            case 12:
                ii.s0.e((org.telegram.ui.ActionBar.e2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.ey) this.b).Z2);
                break;
            case 13:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 14:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.b;
                eyVar2.z4((ArrayList) this.c, 102, false, false, null);
                eyVar2.finishPreviewFragment();
                break;
            case 15:
                org.telegram.ui.ey.F0((org.telegram.ui.ey) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new d71(21, (org.telegram.ui.ey) this.b, (String) this.c), 250L);
                break;
            case 17:
                org.telegram.ui.r10 r10Var = (org.telegram.ui.r10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.s10) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (r10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = r10Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i18 = 0;
                while (i18 < i13) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i18 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i18 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i19 = i14;
                    while (i19 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i19);
                        int i20 = i14;
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            j10 = j11 != 0 ? -j11 : -inputPeer.channel_id;
                        }
                        i19 = c3.h0.j(j10, arrayList5, i19, 1);
                        i14 = i20;
                    }
                    i18++;
                    i13 = 2;
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
                org.telegram.ui.q00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, r10Var.e, new org.telegram.ui.kz(i10, r10Var, suggestedFilter));
                break;
            case 18:
                qf.d.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 19:
                as0 as0Var = (as0) this.b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                as0Var.run();
                k3Var.dismiss();
                break;
            case 20:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.x50 x50Var2 = g30Var.E;
                ChatObject.Call call = x50Var2.a1;
                if (call != null && call.recording) {
                    x50Var2.H1(textView);
                    break;
                }
                break;
            case 21:
                new org.telegram.ui.g50((Context) this.c, (org.telegram.ui.b20) this.b).show();
                break;
            case 22:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) this.b;
                bk0 bk0Var = (bk0) this.c;
                r70Var.getClass();
                if (!org.telegram.ui.ey.y4) {
                    org.telegram.ui.ey.y4 = true;
                    boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                    boolean z18 = !q5;
                    org.telegram.ui.ActionBar.x6 P0 = !q5 ? org.telegram.ui.ActionBar.y6.P0("Night") : org.telegram.ui.ActionBar.y6.P0("Blue");
                    org.telegram.ui.ActionBar.y6.o = 0;
                    org.telegram.ui.ActionBar.y6.t1();
                    org.telegram.ui.ActionBar.y6.A();
                    yj0 yj0Var2 = r70Var.v;
                    yj0Var2.P(!q5 ? yj0Var2.e[0] - 1 : 0);
                    bk0Var.d();
                    int[] iArr = {(bk0Var.getMeasuredWidth() / 2) + r14, (bk0Var.getMeasuredHeight() / 2) + r14};
                    bk0Var.getLocationInWindow(iArr);
                    int i21 = iArr[0];
                    int i22 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z18), bk0Var);
                    bk0Var.setContentDescription(LocaleController.getString(!q5 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.d80 d80Var = (org.telegram.ui.d80) this.b;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.c;
                d80Var.Q.dismiss();
                if (d80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i23 = d80Var.c0;
                    if (i23 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i23 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.ey eyVar3 = new org.telegram.ui.ey(bundle);
                    eyVar3.C2 = new org.telegram.ui.Components.voip.k1(16, d80Var, eyVar3);
                    r2Var2.presentFragment(eyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, d80Var.c0);
                    org.telegram.ui.c6 c6Var = new org.telegram.ui.c6(bundle2);
                    c6Var.d = d80Var.f0;
                    c6Var.V();
                    r2Var2.presentFragment(c6Var);
                    break;
                }
            case 24:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.u4[] u4VarArr = (org.telegram.ui.Cells.u4[]) this.c;
                Pattern pattern = LaunchActivity.D1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.u4) view).getCurrentLocale();
                int i24 = 0;
                while (i24 < 2) {
                    u4VarArr[i24].a.a(i24 == num.intValue(), true);
                    i24++;
                }
                break;
            case 25:
                g5.x((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.va0((org.telegram.ui.fb0) this.b, i14));
                break;
            case 26:
                org.telegram.ui.fb0 fb0Var = (org.telegram.ui.fb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (fb0Var.e == null) {
                    org.telegram.ui.cb0 cb0Var = fb0Var.f;
                    if (cb0Var.e.h) {
                        int i25 = -fb0Var.M;
                        fb0Var.M = i25;
                        AndroidUtilities.shakeViewSpring(cb0Var, i25);
                        break;
                    } else {
                        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                        Switch r42 = a9Var.e;
                        a9Var.setChecked(!r42.h);
                        fb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            fb0Var.f.setChecked(false);
                            fb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            fb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            org.telegram.ui.ya0 ya0Var = new org.telegram.ui.ya0(fb0Var, i15);
                            runnableArr[0] = ya0Var;
                            AndroidUtilities.runOnUIThread(ya0Var, 60L);
                            break;
                        } else {
                            fb0Var.f.setCheckBoxIcon(0);
                            fb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            org.telegram.ui.ya0 ya0Var2 = new org.telegram.ui.ya0(fb0Var, i13);
                            runnableArr[0] = ya0Var2;
                            AndroidUtilities.runOnUIThread(ya0Var2);
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) this.b;
                rc0Var.s0((org.telegram.ui.lc0) this.c);
                org.telegram.ui.jc0 jc0Var = rc0Var.H0;
                if (jc0Var != null) {
                    jc0Var.dismiss();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.oc0 oc0Var = (org.telegram.ui.oc0) this.b;
                org.telegram.ui.qc0 qc0Var = (org.telegram.ui.qc0) this.c;
                org.telegram.ui.rc0 rc0Var2 = oc0Var.b;
                rc0Var2.getClass();
                rc0Var2.E0.d(qc0Var.c, rc0Var2.F0, true, 0, 0L);
                rc0Var2.finishFragment();
                break;
            default:
                org.telegram.ui.qd0 qd0Var = (org.telegram.ui.qd0) this.b;
                Context context2 = (Context) this.c;
                String string = qd0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    z11 z11Var = new z11();
                    z11Var.a |= 256;
                    z11Var.b = indexOf;
                    int i26 = lastIndexOf + 1;
                    z11Var.c = i26;
                    spannableStringBuilder.setSpan(new a21(z11Var, 0), indexOf, i26, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i27 = qd0Var.G;
                int i28 = i27 / 86400;
                int i29 = i27 % 86400;
                int i30 = i29 / 3600;
                int i31 = (i29 % 3600) / 60;
                if (i28 == 0 && i30 == 0) {
                    i31 = Math.max(1, i31);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i28 == 0 || i30 == 0) ? (i30 == 0 || i31 == 0) ? i28 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i28, new Object[0])) : i30 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i31, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i30, new Object[0]), LocaleController.formatPluralString("Minutes", i31, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i28, new Object[0]), LocaleController.formatPluralString("Hours", i30, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new org.telegram.ui.st(qd0Var, i11));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }
}
