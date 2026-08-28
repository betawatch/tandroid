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
import org.telegram.ui.mh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vh0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0336  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ArrayList arrayList = null;
        int i9 = 4;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                Context context = (Context) this.c;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                context.startActivity(createChooser);
                break;
            case 1:
                gh.n7 n7Var = (gh.n7) this.b;
                fh.z3 z3Var = (fh.z3) this.c;
                n7Var.e = !n7Var.e;
                z3Var.run();
                n7Var.i(true);
                break;
            case 2:
                yw0 yw0Var = (yw0) this.b;
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) this.c;
                org.telegram.ui.ht.q().v(yw0Var.r.i0);
                org.telegram.ui.ht.q().y(d8Var);
                break;
            case 3:
                CharSequence charSequence = (CharSequence) this.b;
                e5.u uVar = (e5.u) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                uVar.run();
                break;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 5:
                k31 k31Var = (k31) this.b;
                z41 z41Var = (z41) this.c;
                k31Var.g0 = false;
                k31Var.I();
                z41Var.N(true);
                k31Var.s();
                break;
            case 6:
                f31 f31Var = (f31) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = f31Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(gr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                p31.a(nkVar.getContext(), nkVar.d);
                break;
            case 8:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i10 = UndoView.a0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.o2 o2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = o2Var.getMessagesController().getInputPeer(message.peer_id);
                o2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new w1(undoView, 18), 2);
                break;
            case 9:
                o51 o51Var = (o51) this.b;
                File file = (File) this.c;
                if (file == null) {
                    o51Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(o51Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        o51Var.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) this.b;
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.c;
                if (g30Var.h()) {
                    if (af.d.a(o50Var.e0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(o50Var.e0);
                        o50Var.dismiss();
                        break;
                    } else {
                        y4.B(o50Var.e0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(o50Var.e0)) {
                    j20.a0 = false;
                    o50Var.dismiss();
                    break;
                } else {
                    y4.A(g30Var.getContext()).o();
                    break;
                }
            case 11:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                mi0 mi0Var = (mi0) this.c;
                boolean z10 = u0Var.v;
                u0Var.v = !z10;
                if (z10) {
                    mi0Var.K(69);
                    mi0Var.N(99);
                } else {
                    mi0Var.K(36);
                    mi0Var.N(69);
                }
                mi0Var.start();
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                z1Var.c(z11, true);
                break;
            case 13:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.b;
                Context context2 = (Context) this.c;
                l2Var.getClass();
                boolean z12 = context2 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent2 = new Intent(context2, (Class<?>) LaunchActivity.class);
                        intent2.setAction("voip");
                        context2.startActivity(intent2);
                        break;
                    }
                } else {
                    mh1.w((Activity) context2, l2Var.H);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.b;
                isVar.showDialog(y4.m(isVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.w3(isVar, i9), null, false, false, isVar.r).a);
                break;
            case 15:
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
                        y4.M(htVar.w, ftVar3.a(), new a1.d(ftVar3, document, botInlineResult, obj, 11), htVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ft ftVar4 = htVar.l;
                        TLObject tLObject3 = htVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = htVar.Z;
                        }
                        ftVar4.w(tLObject3, htVar.b0);
                    }
                    htVar.p();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.b;
                hh.b bVar = (hh.b) this.c;
                org.telegram.ui.wu wuVar = xuVar.T;
                jx0[] jx0VarArr = xuVar.X;
                for (jx0 jx0Var : jx0VarArr) {
                    if (jx0Var != null) {
                        boolean z13 = jx0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                jx0 jx0Var2 = jx0VarArr[intValue2];
                boolean z14 = jx0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    jx0Var2.c = z15;
                    jx0Var2.d = true;
                }
                z1Var2.c(jx0Var2.c, true);
                boolean z16 = jx0VarArr[intValue2].c;
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
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((hh.a) arrayList.get(i11)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i11))) {
                                        hashSet.add((hh.a) arrayList.get(i11));
                                        bVar.g((hh.a) arrayList.get(i11), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i11))) {
                                    hashSet.remove(arrayList.get(i11));
                                    bVar.g((hh.a) arrayList.get(i11), false);
                                }
                            }
                        }
                    }
                    xuVar.a0.c();
                    xuVar.W.a(wuVar.d(), true);
                    wuVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                xuVar.a0.c();
                xuVar.W.a(wuVar.d(), true);
                wuVar.c(true);
            case 17:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.b;
                x60 x60Var = (x60) this.c;
                dyVar.getClass();
                x60Var.u();
                dyVar.presentFragment(new ProxyListActivity());
                break;
            case 18:
                nh.r0.e((org.telegram.ui.ActionBar.c2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.dy) this.b).U2);
                break;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 20:
                org.telegram.ui.dy dyVar2 = (org.telegram.ui.dy) this.b;
                dyVar2.r4((ArrayList) this.c, 102, false, false, null);
                dyVar2.finishPreviewFragment();
                break;
            case 21:
                org.telegram.ui.dy.G0((org.telegram.ui.dy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new p61(9, (org.telegram.ui.dy) this.c, (String) this.b), 250L);
                break;
            case 23:
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
                int i12 = 0;
                while (i12 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i12 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i12 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i13);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            if (j11 == 0) {
                                j11 = inputPeer.channel_id;
                            }
                            j10 = -j11;
                        }
                        i13 = aa.d.g(j10, arrayList5, i13, 1);
                    }
                    i12++;
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
                org.telegram.ui.n00.s0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, l10Var.e, new p61(26, l10Var, suggestedFilter));
                break;
            case 24:
                ve.e.s((Context) this.c, ((TL_fragment.TL_collectibleInfo) this.b).url);
                break;
            case 25:
                y01 y01Var = (y01) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.c;
                y01Var.run();
                f3Var2.dismiss();
                break;
            case 26:
                org.telegram.ui.y20 y20Var = (org.telegram.ui.y20) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.o50 o50Var2 = y20Var.A;
                ChatObject.Call call = o50Var2.W0;
                if (call != null && call.recording) {
                    o50Var2.G1(textView);
                    break;
                }
                break;
            case 27:
                new org.telegram.ui.y40((Context) this.c, (fh.l2) this.b).show();
                break;
            case 28:
                org.telegram.ui.i70 i70Var = (org.telegram.ui.i70) this.b;
                pi0 pi0Var = (pi0) this.c;
                i70Var.getClass();
                if (!org.telegram.ui.dy.t4) {
                    org.telegram.ui.dy.t4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
                    boolean z17 = !q10;
                    org.telegram.ui.ActionBar.e6 N0 = !q10 ? org.telegram.ui.ActionBar.f6.N0("Night") : org.telegram.ui.ActionBar.f6.N0("Blue");
                    org.telegram.ui.ActionBar.f6.o = 0;
                    org.telegram.ui.ActionBar.f6.q1();
                    org.telegram.ui.ActionBar.f6.A();
                    mi0 mi0Var2 = i70Var.v;
                    mi0Var2.N(!q10 ? mi0Var2.e[0] - 1 : 0);
                    pi0Var.d();
                    int[] iArr = {(pi0Var.getMeasuredWidth() / 2) + r14, (pi0Var.getMeasuredHeight() / 2) + r14};
                    pi0Var.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), pi0Var);
                    pi0Var.setContentDescription(LocaleController.getString(!q10 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            default:
                org.telegram.ui.u70 u70Var = (org.telegram.ui.u70) this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                u70Var.M.dismiss();
                if (u70Var.b0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i16 = u70Var.V;
                    if (i16 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i16 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.dy dyVar3 = new org.telegram.ui.dy(bundle);
                    dyVar3.y2 = new org.telegram.ui.yr(14, u70Var, dyVar3);
                    o2Var2.presentFragment(dyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, u70Var.V);
                    org.telegram.ui.z5 z5Var = new org.telegram.ui.z5(bundle2);
                    z5Var.d = u70Var.b0;
                    z5Var.T();
                    o2Var2.presentFragment(z5Var);
                    break;
                }
        }
    }

    public /* synthetic */ vh0(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }
}
