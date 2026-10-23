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
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0538  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10 = 5;
        ArrayList arrayList = null;
        int i11 = 2;
        int i12 = 0;
        switch (this.a) {
            case 0:
                f51 f51Var = (f51) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = f51Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(bs.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                p51.a(skVar.getContext(), skVar.d);
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i13 = UndoView.i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.o2 o2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = o2Var.getMessagesController().getInputPeer(message.peer_id);
                o2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 18), 2);
                break;
            case 3:
                o71 o71Var = (o71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    o71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(o71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        o71Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.k30 k30Var = (org.telegram.ui.k30) this.b;
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.c;
                if (k30Var.h()) {
                    if (uf.b.a(u50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(u50Var.i0);
                        u50Var.dismiss();
                        break;
                    } else {
                        f5.B(u50Var.i0, null, true).p();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(u50Var.i0)) {
                    i30.e0 = false;
                    u50Var.dismiss();
                    break;
                } else {
                    f5.A(k30Var.getContext()).p();
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
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                z1Var.c(z11, true);
                break;
            case 7:
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
                    oh1.v((Activity) context, k2Var.M);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.b;
                hsVar.showDialog(f5.m(hsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.u3(hsVar, i10), null, false, false, hsVar.r).a);
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
                        ftVar.r(0, 0, htVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ft ftVar2 = htVar.l;
                        TLObject tLObject2 = htVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = htVar.Z;
                        }
                        ftVar2.r(0, 0, htVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(htVar.r).removeRecentGif(htVar.W);
                        htVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(htVar.r).addRecentGif(htVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(htVar.r).saveGif("gif", htVar.W);
                        htVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = htVar.W;
                        TLRPC.BotInlineResult botInlineResult = htVar.Z;
                        Object obj = htVar.b0;
                        org.telegram.ui.ft ftVar3 = htVar.l;
                        f5.M(htVar.w, ftVar3.a(), new a1.d(ftVar3, document, botInlineResult, obj, 11), htVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ft ftVar4 = htVar.l;
                        TLObject tLObject3 = htVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = htVar.Z;
                        }
                        ftVar4.x(tLObject3, htVar.b0);
                    }
                    htVar.n();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.yu yuVar = (org.telegram.ui.yu) this.b;
                bi.c cVar = (bi.c) this.c;
                org.telegram.ui.xu xuVar = yuVar.X;
                zy0[] zy0VarArr = yuVar.b0;
                for (zy0 zy0Var : zy0VarArr) {
                    if (zy0Var != null) {
                        boolean z13 = zy0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                zy0 zy0Var2 = zy0VarArr[intValue2];
                boolean z14 = zy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    zy0Var2.c = z15;
                    zy0Var2.d = true;
                }
                z1Var2.c(zy0Var2.c, true);
                boolean z16 = zy0VarArr[intValue2].c;
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
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            if (((bi.b) arrayList.get(i14)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i14))) {
                                        hashSet.add((bi.b) arrayList.get(i14));
                                        cVar.g((bi.b) arrayList.get(i14), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i14))) {
                                    hashSet.remove(arrayList.get(i14));
                                    cVar.g((bi.b) arrayList.get(i14), false);
                                }
                            }
                        }
                    }
                    yuVar.e0.c();
                    yuVar.a0.a(xuVar.d(), true);
                    xuVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                yuVar.e0.c();
                yuVar.a0.a(xuVar.d(), true);
                xuVar.c(true);
            case 11:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.b;
                j80 j80Var = (j80) this.c;
                eyVar.getClass();
                j80Var.u();
                eyVar.presentFragment(new ProxyListActivity());
                break;
            case 12:
                hi.t0.e((org.telegram.ui.ActionBar.c2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.ey) this.b).Z2);
                break;
            case 13:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 14:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.b;
                eyVar2.p4((ArrayList) this.c, 102, false, false, null);
                eyVar2.finishPreviewFragment();
                break;
            case 15:
                org.telegram.ui.ey.D0((org.telegram.ui.ey) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(i11, (org.telegram.ui.ey) this.b, (String) this.c), 250L);
                break;
            case 17:
                org.telegram.ui.p10 p10Var = (org.telegram.ui.p10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.q10) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (p10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = p10Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i15 = 0;
                while (i15 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i15 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i15 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i16);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            if (j11 == 0) {
                                j11 = inputPeer.channel_id;
                            }
                            j10 = -j11;
                        }
                        i16 = com.google.android.gms.internal.play_billing.k3.h(j10, arrayList5, i16, 1);
                    }
                    i15++;
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
                org.telegram.ui.q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, p10Var.e, new org.telegram.ui.ot(19, p10Var, suggestedFilter));
                break;
            case 18:
                pf.d.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 19:
                fz0 fz0Var = (fz0) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                fz0Var.run();
                h3Var.dismiss();
                break;
            case 20:
                org.telegram.ui.c30 c30Var = (org.telegram.ui.c30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.u50 u50Var2 = c30Var.E;
                ChatObject.Call call = u50Var2.a1;
                if (call != null && call.recording) {
                    u50Var2.H1(textView);
                    break;
                }
                break;
            case 21:
                new org.telegram.ui.d50((Context) this.c, (org.telegram.ui.e50) this.b).show();
                break;
            case 22:
                org.telegram.ui.n70 n70Var = (org.telegram.ui.n70) this.b;
                bk0 bk0Var = (bk0) this.c;
                n70Var.getClass();
                if (!org.telegram.ui.ey.z4) {
                    org.telegram.ui.ey.z4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z17 = !q6;
                    org.telegram.ui.ActionBar.j6 P0 = !q6 ? org.telegram.ui.ActionBar.k6.P0("Night") : org.telegram.ui.ActionBar.k6.P0("Blue");
                    org.telegram.ui.ActionBar.k6.o = 0;
                    org.telegram.ui.ActionBar.k6.t1();
                    org.telegram.ui.ActionBar.k6.A();
                    yj0 yj0Var2 = n70Var.v;
                    yj0Var2.P(!q6 ? yj0Var2.e[0] - 1 : 0);
                    bk0Var.d();
                    int[] iArr = {(bk0Var.getMeasuredWidth() / 2) + r14, (bk0Var.getMeasuredHeight() / 2) + r14};
                    bk0Var.getLocationInWindow(iArr);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), bk0Var);
                    bk0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                c80Var.Q.dismiss();
                if (c80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i19 = c80Var.c0;
                    if (i19 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i19 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.ey eyVar3 = new org.telegram.ui.ey(bundle);
                    eyVar3.C2 = new org.telegram.ui.ks(12, c80Var, eyVar3);
                    o2Var2.presentFragment(eyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, c80Var.c0);
                    org.telegram.ui.d6 d6Var = new org.telegram.ui.d6(bundle2);
                    d6Var.d = c80Var.f0;
                    d6Var.U();
                    o2Var2.presentFragment(d6Var);
                    break;
                }
            case 24:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.p4[] p4VarArr = (org.telegram.ui.Cells.p4[]) this.c;
                Pattern pattern = LaunchActivity.E1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.p4) view).getCurrentLocale();
                int i20 = 0;
                while (i20 < 2) {
                    p4VarArr[i20].a.a(i20 == num.intValue(), true);
                    i20++;
                }
                break;
            case 25:
                f5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.xa0((org.telegram.ui.gb0) this.b, i12));
                break;
            case 26:
                org.telegram.ui.gb0 gb0Var = (org.telegram.ui.gb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (gb0Var.e == null) {
                    org.telegram.ui.db0 db0Var = gb0Var.f;
                    if (db0Var.e.h) {
                        int i21 = -gb0Var.N;
                        gb0Var.N = i21;
                        AndroidUtilities.shakeViewSpring(db0Var, i21);
                        break;
                    } else {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        Switch r42 = w8Var.e;
                        w8Var.setChecked(!r42.h);
                        gb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            gb0Var.f.setChecked(false);
                            gb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            gb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            org.telegram.ui.wa0 wa0Var = new org.telegram.ui.wa0(gb0Var, i11);
                            runnableArr[0] = wa0Var;
                            AndroidUtilities.runOnUIThread(wa0Var, 60L);
                            break;
                        } else {
                            gb0Var.f.setCheckBoxIcon(0);
                            gb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            org.telegram.ui.wa0 wa0Var2 = new org.telegram.ui.wa0(gb0Var, i12);
                            runnableArr[0] = wa0Var2;
                            AndroidUtilities.runOnUIThread(wa0Var2);
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) this.b;
                sc0Var.r0((org.telegram.ui.mc0) this.c);
                org.telegram.ui.kc0 kc0Var = sc0Var.I0;
                if (kc0Var != null) {
                    kc0Var.dismiss();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) this.b;
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) this.c;
                org.telegram.ui.sc0 sc0Var2 = pc0Var.b;
                sc0Var2.getClass();
                sc0Var2.F0.b(rc0Var.c, sc0Var2.G0, true, 0, 0L);
                sc0Var2.finishFragment();
                break;
            default:
                org.telegram.ui.rd0 rd0Var = (org.telegram.ui.rd0) this.b;
                Context context2 = (Context) this.c;
                String string = rd0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    q11 q11Var = new q11();
                    q11Var.a |= 256;
                    q11Var.b = indexOf;
                    int i22 = lastIndexOf + 1;
                    q11Var.c = i22;
                    spannableStringBuilder.setSpan(new r11(q11Var, 0), indexOf, i22, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i23 = rd0Var.G;
                int i24 = i23 / 86400;
                int i25 = i23 % 86400;
                int i26 = i25 / 3600;
                int i27 = (i25 % 3600) / 60;
                if (i24 == 0 && i26 == 0) {
                    i27 = Math.max(1, i27);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i24 == 0 || i26 == 0) ? (i26 == 0 || i27 == 0) ? i24 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i24, new Object[0])) : i26 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i24, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i27, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i26, new Object[0]), LocaleController.formatPluralString("Minutes", i27, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i24, new Object[0]), LocaleController.formatPluralString("Hours", i26, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new org.telegram.ui.xt(rd0Var, 17));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }
}
