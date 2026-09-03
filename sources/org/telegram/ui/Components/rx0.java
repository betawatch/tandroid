package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0383  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ArrayList arrayList = null;
        int i10 = 13;
        int i11 = 4;
        int i12 = 0;
        switch (this.a) {
            case 0:
                tx0 tx0Var = (tx0) this.b;
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) this.c;
                org.telegram.ui.qt.q().v(tx0Var.r.j0);
                org.telegram.ui.qt.q().y(d8Var);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.b;
                mh.m2 m2Var = (mh.m2) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                m2Var.run();
                break;
            case 2:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                g41 g41Var = (g41) this.b;
                w51 w51Var = (w51) this.c;
                g41Var.h0 = false;
                g41Var.I();
                w51Var.N(true);
                g41Var.s();
                break;
            case 4:
                b41 b41Var = (b41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = b41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(pr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                l41.a(wkVar.getContext(), wkVar.d);
                break;
            case 6:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i13 = UndoView.b0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.p2 p2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = p2Var.getMessagesController().getInputPeer(message.peer_id);
                p2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, 18), 2);
                break;
            case 7:
                n61 n61Var = (n61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    n61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(n61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        n61Var.dismiss();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.w30 w30Var = (org.telegram.ui.w30) this.b;
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.c;
                if (w30Var.h()) {
                    if (ff.d.a(d60Var.f0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(d60Var.f0);
                        d60Var.dismiss();
                        break;
                    } else {
                        z4.B(d60Var.f0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.f0)) {
                    c30.b0 = false;
                    d60Var.dismiss();
                    break;
                } else {
                    z4.A(w30Var.getContext()).o();
                    break;
                }
            case 9:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                hj0 hj0Var = (hj0) this.c;
                boolean z4 = v0Var.v;
                v0Var.v = !z4;
                if (z4) {
                    hj0Var.K(69);
                    hj0Var.N(99);
                } else {
                    hj0Var.K(36);
                    hj0Var.N(69);
                }
                hj0Var.start();
                break;
            case 10:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z10 = !zArr2[0];
                zArr2[0] = z10;
                z1Var.c(z10, true);
                break;
            case 11:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                Context context = (Context) this.c;
                n2Var.getClass();
                boolean z11 = context instanceof LaunchActivity;
                if (!z11 || ApplicationLoader.mainInterfacePaused) {
                    if (z11) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    ii1.w((Activity) context, n2Var.I);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.os osVar = (org.telegram.ui.os) this.b;
                osVar.showDialog(z4.m(osVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.w3(osVar, i11), null, false, false, osVar.r).a);
                break;
            case 13:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.qt qtVar = mtVar.a;
                if (qtVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ot otVar = qtVar.l;
                        TLObject tLObject = qtVar.W;
                        if (tLObject == null) {
                            tLObject = qtVar.Z;
                        }
                        otVar.r(0, 0, qtVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ot otVar2 = qtVar.l;
                        TLObject tLObject2 = qtVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = qtVar.Z;
                        }
                        otVar2.r(0, 0, qtVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(qtVar.r).removeRecentGif(qtVar.W);
                        qtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(qtVar.r).addRecentGif(qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(qtVar.r).saveGif("gif", qtVar.W);
                        qtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = qtVar.W;
                        TLRPC.BotInlineResult botInlineResult = qtVar.Z;
                        Object obj = qtVar.b0;
                        org.telegram.ui.ot otVar3 = qtVar.l;
                        z4.M(qtVar.w, otVar3.a(), new a1.d(otVar3, document, botInlineResult, obj, 10), qtVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ot otVar4 = qtVar.l;
                        TLObject tLObject3 = qtVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = qtVar.Z;
                        }
                        otVar4.v(tLObject3, qtVar.b0);
                    }
                    qtVar.p();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.hv hvVar = (org.telegram.ui.hv) this.b;
                nh.b bVar = (nh.b) this.c;
                org.telegram.ui.gv gvVar = hvVar.U;
                ey0[] ey0VarArr = hvVar.Y;
                for (ey0 ey0Var : ey0VarArr) {
                    if (ey0Var != null) {
                        boolean z12 = ey0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                ey0 ey0Var2 = ey0VarArr[intValue2];
                boolean z13 = ey0Var2.c;
                boolean z14 = !z13;
                if (z13 != z14) {
                    ey0Var2.c = z14;
                    ey0Var2.d = true;
                }
                z1Var2.c(ey0Var2.c, true);
                boolean z15 = ey0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue2 == 0) {
                    bVar.m = z15;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar.e;
                        bVar.o = z15;
                    } else if (intValue2 == 3) {
                        arrayList = bVar.f;
                        bVar.p = z15;
                    } else if (intValue2 == 4) {
                        arrayList = bVar.g;
                        bVar.q = z15;
                    } else if (intValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            if (((nh.a) arrayList.get(i14)).d == intValue2) {
                                if (z15) {
                                    if (!hashSet.contains(arrayList.get(i14))) {
                                        hashSet.add((nh.a) arrayList.get(i14));
                                        bVar.g((nh.a) arrayList.get(i14), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i14))) {
                                    hashSet.remove(arrayList.get(i14));
                                    bVar.g((nh.a) arrayList.get(i14), false);
                                }
                            }
                        }
                    }
                    hvVar.b0.c();
                    hvVar.X.a(gvVar.d(), true);
                    gvVar.c(true);
                    break;
                } else {
                    bVar.n = z15;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                hvVar.b0.c();
                hvVar.X.a(gvVar.d(), true);
                gvVar.c(true);
            case 15:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.b;
                q70 q70Var = (q70) this.c;
                pyVar.getClass();
                q70Var.u();
                pyVar.presentFragment(new ProxyListActivity());
                break;
            case 16:
                th.o0.e((org.telegram.ui.ActionBar.d2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.py) this.b).V2);
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 18:
                org.telegram.ui.py pyVar2 = (org.telegram.ui.py) this.b;
                pyVar2.r4((ArrayList) this.c, 102, false, false, null);
                pyVar2.finishPreviewFragment();
                break;
            case 19:
                org.telegram.ui.py.H0((org.telegram.ui.py) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new q51(i10, (org.telegram.ui.py) this.b, (String) this.c), 250L);
                break;
            case 21:
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.b20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (a20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = a20Var.e.getMessagesController().getDialogFilters().size();
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
                            j10 = j11 != 0 ? -j11 : -inputPeer.channel_id;
                        }
                        i16 = android.support.v4.media.a.g(j10, arrayList5, i16, 1);
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
                org.telegram.ui.b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, a20Var.e, new org.telegram.ui.z10(i12, a20Var, suggestedFilter));
                break;
            case 22:
                af.g.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 23:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) this.b;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.c;
                dtVar.run();
                h3Var2.dismiss();
                break;
            case 24:
                org.telegram.ui.o30 o30Var = (org.telegram.ui.o30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.d60 d60Var2 = o30Var.B;
                ChatObject.Call call = d60Var2.X0;
                if (call != null && call.recording) {
                    d60Var2.G1(textView);
                    break;
                }
                break;
            case 25:
                new org.telegram.ui.n50((Context) this.c, (fg.h0) this.b).show();
                break;
            case 26:
                org.telegram.ui.v70 v70Var = (org.telegram.ui.v70) this.b;
                kj0 kj0Var = (kj0) this.c;
                v70Var.getClass();
                if (!org.telegram.ui.py.u4) {
                    org.telegram.ui.py.u4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z16 = !q10;
                    org.telegram.ui.ActionBar.j6 N0 = !q10 ? org.telegram.ui.ActionBar.k6.N0("Night") : org.telegram.ui.ActionBar.k6.N0("Blue");
                    org.telegram.ui.ActionBar.k6.o = 0;
                    org.telegram.ui.ActionBar.k6.q1();
                    org.telegram.ui.ActionBar.k6.A();
                    hj0 hj0Var2 = v70Var.v;
                    hj0Var2.N(!q10 ? hj0Var2.e[0] - 1 : 0);
                    kj0Var.d();
                    int[] iArr = {(kj0Var.getMeasuredWidth() / 2) + r14, (kj0Var.getMeasuredHeight() / 2) + r14};
                    kj0Var.getLocationInWindow(iArr);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z16), kj0Var);
                    kj0Var.setContentDescription(LocaleController.getString(!q10 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) this.b;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                h80Var.N.dismiss();
                if (h80Var.c0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i19 = h80Var.W;
                    if (i19 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i19 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.py pyVar3 = new org.telegram.ui.py(bundle);
                    pyVar3.z2 = new org.telegram.ui.rs(i10, h80Var, pyVar3);
                    p2Var2.presentFragment(pyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, h80Var.W);
                    org.telegram.ui.d6 d6Var = new org.telegram.ui.d6(bundle2);
                    d6Var.d = h80Var.c0;
                    d6Var.U();
                    p2Var2.presentFragment(d6Var);
                    break;
                }
            case 28:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.y1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i20 = 0;
                while (i20 < 2) {
                    q4VarArr[i20].a.a(i20 == num.intValue(), true);
                    i20++;
                }
                break;
            default:
                z4.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.db0((org.telegram.ui.ob0) this.b, i12));
                break;
        }
    }
}
