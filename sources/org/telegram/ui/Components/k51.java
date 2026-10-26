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
import org.telegram.ui.ph1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x053a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10 = 18;
        int i11 = 5;
        int i12 = 6;
        ArrayList arrayList = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                m51 m51Var = (m51) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = m51Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(ds.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                x51.a(tkVar.getContext(), tkVar.d);
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
                r2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new b2(undoView, i10), 2);
                break;
            case 3:
                x71 x71Var = (x71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    x71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(x71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        x71Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.m30 m30Var = (org.telegram.ui.m30) this.b;
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.c;
                if (m30Var.h()) {
                    if (vf.b.a(v50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(v50Var.i0);
                        v50Var.dismiss();
                        break;
                    } else {
                        g5.A(v50Var.i0, null, true).p();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(v50Var.i0)) {
                    k30.e0 = false;
                    v50Var.dismiss();
                    break;
                } else {
                    g5.z(m30Var.getContext()).p();
                    break;
                }
            case 5:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                xj0 xj0Var = (xj0) this.c;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    xj0Var.M(69);
                    xj0Var.P(99);
                } else {
                    xj0Var.M(36);
                    xj0Var.P(69);
                }
                xj0Var.start();
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
                    ph1.v((Activity) context, n2Var.M);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) this.b;
                jsVar.showDialog(g5.l(jsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(jsVar, i11), null, false, false, jsVar.r).a);
                break;
            case 9:
                org.telegram.ui.bt btVar = (org.telegram.ui.bt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ft ftVar = btVar.a;
                if (ftVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.dt dtVar = ftVar.l;
                        TLObject tLObject = ftVar.W;
                        if (tLObject == null) {
                            tLObject = ftVar.Z;
                        }
                        dtVar.s(0, 0, ftVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.dt dtVar2 = ftVar.l;
                        TLObject tLObject2 = ftVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ftVar.Z;
                        }
                        dtVar2.s(0, 0, ftVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(ftVar.r).removeRecentGif(ftVar.W);
                        ftVar.l.K();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(ftVar.r).addRecentGif(ftVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(ftVar.r).saveGif("gif", ftVar.W);
                        ftVar.l.K();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = ftVar.W;
                        TLRPC.BotInlineResult botInlineResult = ftVar.Z;
                        Object obj = ftVar.b0;
                        org.telegram.ui.dt dtVar3 = ftVar.l;
                        g5.L(ftVar.w, dtVar3.a(), new a1.d(dtVar3, document, botInlineResult, obj, 11), ftVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.dt dtVar4 = ftVar.l;
                        TLObject tLObject3 = ftVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ftVar.Z;
                        }
                        dtVar4.w(tLObject3, ftVar.b0);
                    }
                    ftVar.n();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.vu vuVar = (org.telegram.ui.vu) this.b;
                ci.b bVar = (ci.b) this.c;
                org.telegram.ui.uu uuVar = vuVar.X;
                iz0[] iz0VarArr = vuVar.b0;
                for (iz0 iz0Var : iz0VarArr) {
                    if (iz0Var != null) {
                        boolean z13 = iz0Var.c;
                    }
                }
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                int intValue2 = ((Integer) y1Var2.getTag()).intValue();
                iz0 iz0Var2 = iz0VarArr[intValue2];
                boolean z14 = iz0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    iz0Var2.c = z15;
                    iz0Var2.d = true;
                }
                y1Var2.c(iz0Var2.c, true);
                boolean z16 = iz0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue2 == 0) {
                    bVar.m = z16;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar.e;
                        bVar.o = z16;
                    } else if (intValue2 == 3) {
                        arrayList = bVar.f;
                        bVar.p = z16;
                    } else if (intValue2 == 4) {
                        arrayList = bVar.g;
                        bVar.q = z16;
                    } else if (intValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((ci.a) arrayList.get(i17)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((ci.a) arrayList.get(i17));
                                        bVar.g((ci.a) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    bVar.g((ci.a) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    vuVar.e0.d();
                    vuVar.a0.a(uuVar.d(), true);
                    uuVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                vuVar.e0.d();
                vuVar.a0.a(uuVar.d(), true);
                uuVar.c(true);
            case 11:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.b;
                k80 k80Var = (k80) this.c;
                cyVar.getClass();
                k80Var.u();
                cyVar.presentFragment(new ProxyListActivity());
                break;
            case 12:
                ii.s0.e((org.telegram.ui.ActionBar.e2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.cy) this.b).Z2);
                break;
            case 13:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 14:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) this.b;
                cyVar2.z4((ArrayList) this.c, 102, false, false, null);
                cyVar2.finishPreviewFragment();
                break;
            case 15:
                org.telegram.ui.cy.F0((org.telegram.ui.cy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new c71(20, (org.telegram.ui.cy) this.b, (String) this.c), 250L);
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
                        i19 = c3.h0.j(j10, arrayList5, i19, 1);
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
                org.telegram.ui.o00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, p10Var.e, new org.telegram.ui.sz(i12, p10Var, suggestedFilter));
                break;
            case 18:
                qf.d.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 19:
                zr0 zr0Var = (zr0) this.b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                zr0Var.run();
                k3Var.dismiss();
                break;
            case 20:
                org.telegram.ui.e30 e30Var = (org.telegram.ui.e30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.v50 v50Var2 = e30Var.E;
                ChatObject.Call call = v50Var2.a1;
                if (call != null && call.recording) {
                    v50Var2.H1(textView);
                    break;
                }
                break;
            case 21:
                new org.telegram.ui.e50((Context) this.c, (org.telegram.ui.z10) this.b).show();
                break;
            case 22:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) this.b;
                ak0 ak0Var = (ak0) this.c;
                p70Var.getClass();
                if (!org.telegram.ui.cy.y4) {
                    org.telegram.ui.cy.y4 = true;
                    boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                    boolean z17 = !q5;
                    org.telegram.ui.ActionBar.x6 P0 = !q5 ? org.telegram.ui.ActionBar.y6.P0("Night") : org.telegram.ui.ActionBar.y6.P0("Blue");
                    org.telegram.ui.ActionBar.y6.o = 0;
                    org.telegram.ui.ActionBar.y6.t1();
                    org.telegram.ui.ActionBar.y6.A();
                    xj0 xj0Var2 = p70Var.v;
                    xj0Var2.P(!q5 ? xj0Var2.e[0] - 1 : 0);
                    ak0Var.d();
                    int[] iArr = {(ak0Var.getMeasuredWidth() / 2) + r14, (ak0Var.getMeasuredHeight() / 2) + r14};
                    ak0Var.getLocationInWindow(iArr);
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), ak0Var);
                    ak0Var.setContentDescription(LocaleController.getString(!q5 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) this.b;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.c;
                b80Var.Q.dismiss();
                if (b80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = b80Var.c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.cy cyVar3 = new org.telegram.ui.cy(bundle);
                    cyVar3.C2 = new org.telegram.ui.Components.voip.k1(16, b80Var, cyVar3);
                    r2Var2.presentFragment(cyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, b80Var.c0);
                    org.telegram.ui.c6 c6Var = new org.telegram.ui.c6(bundle2);
                    c6Var.d = b80Var.f0;
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
                int i23 = 0;
                while (i23 < 2) {
                    u4VarArr[i23].a.a(i23 == num.intValue(), true);
                    i23++;
                }
                break;
            case 25:
                g5.x((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.ta0((org.telegram.ui.db0) this.b, i14));
                break;
            case 26:
                org.telegram.ui.db0 db0Var = (org.telegram.ui.db0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (db0Var.e == null) {
                    org.telegram.ui.ab0 ab0Var = db0Var.f;
                    if (ab0Var.e.h) {
                        int i24 = -db0Var.M;
                        db0Var.M = i24;
                        AndroidUtilities.shakeViewSpring(ab0Var, i24);
                        break;
                    } else {
                        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                        Switch r42 = a9Var.e;
                        a9Var.setChecked(!r42.h);
                        db0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r42.h) {
                            db0Var.f.setChecked(false);
                            db0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            db0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            org.telegram.ui.wa0 wa0Var = new org.telegram.ui.wa0(db0Var, i15);
                            runnableArr[0] = wa0Var;
                            AndroidUtilities.runOnUIThread(wa0Var, 60L);
                            break;
                        } else {
                            db0Var.f.setCheckBoxIcon(0);
                            db0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            org.telegram.ui.wa0 wa0Var2 = new org.telegram.ui.wa0(db0Var, i13);
                            runnableArr[0] = wa0Var2;
                            AndroidUtilities.runOnUIThread(wa0Var2);
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) this.b;
                pc0Var.s0((org.telegram.ui.jc0) this.c);
                org.telegram.ui.hc0 hc0Var = pc0Var.H0;
                if (hc0Var != null) {
                    hc0Var.dismiss();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.mc0 mc0Var = (org.telegram.ui.mc0) this.b;
                org.telegram.ui.oc0 oc0Var = (org.telegram.ui.oc0) this.c;
                org.telegram.ui.pc0 pc0Var2 = mc0Var.b;
                pc0Var2.getClass();
                pc0Var2.E0.d(oc0Var.c, pc0Var2.F0, true, 0, 0L);
                pc0Var2.finishFragment();
                break;
            default:
                org.telegram.ui.od0 od0Var = (org.telegram.ui.od0) this.b;
                Context context2 = (Context) this.c;
                String string = od0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    y11 y11Var = new y11();
                    y11Var.a |= 256;
                    y11Var.b = indexOf;
                    int i25 = lastIndexOf + 1;
                    y11Var.c = i25;
                    spannableStringBuilder.setSpan(new z11(y11Var, 0), indexOf, i25, 0);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new org.telegram.ui.qt(od0Var, i10));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }
}
