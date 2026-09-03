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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    /* JADX WARN: Removed duplicated region for block: B:144:0x0383  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ArrayList arrayList = null;
        int i10 = 4;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                tx0 tx0Var = (tx0) this.b;
                org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) this.c;
                org.telegram.ui.rt.q().v(tx0Var.r.j0);
                org.telegram.ui.rt.q().y(c8Var);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.b;
                lh.n2 n2Var = (lh.n2) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                n2Var.run();
                break;
            case 2:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                g3Var.dismiss();
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
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(mr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                m41.a(ykVar.getContext(), ykVar.d);
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
                m61 m61Var = (m61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    m61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(m61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        m61Var.dismiss();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) this.b;
                org.telegram.ui.e60 e60Var = (org.telegram.ui.e60) this.c;
                if (x30Var.h()) {
                    if (ef.d.a(e60Var.f0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(e60Var.f0);
                        e60Var.dismiss();
                        break;
                    } else {
                        z4.B(e60Var.f0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(e60Var.f0)) {
                    b30.b0 = false;
                    e60Var.dismiss();
                    break;
                } else {
                    z4.A(x30Var.getContext()).o();
                    break;
                }
            case 9:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                gj0 gj0Var = (gj0) this.c;
                boolean z4 = u0Var.v;
                u0Var.v = !z4;
                if (z4) {
                    gj0Var.K(69);
                    gj0Var.N(99);
                } else {
                    gj0Var.K(36);
                    gj0Var.N(69);
                }
                gj0Var.start();
                break;
            case 10:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.c;
                boolean z10 = !zArr2[0];
                zArr2[0] = z10;
                y1Var.c(z10, true);
                break;
            case 11:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.b;
                Context context = (Context) this.c;
                m2Var.getClass();
                boolean z11 = context instanceof LaunchActivity;
                if (!z11 || ApplicationLoader.mainInterfacePaused) {
                    if (z11) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    }
                } else {
                    ii1.w((Activity) context, m2Var.I);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.b;
                psVar.showDialog(z4.m(psVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.y3(psVar, i10), null, false, false, psVar.r).a);
                break;
            case 13:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.rt rtVar = ntVar.a;
                if (rtVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.pt ptVar = rtVar.l;
                        TLObject tLObject = rtVar.W;
                        if (tLObject == null) {
                            tLObject = rtVar.Z;
                        }
                        ptVar.s(0, 0, rtVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.pt ptVar2 = rtVar.l;
                        TLObject tLObject2 = rtVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = rtVar.Z;
                        }
                        ptVar2.s(0, 0, rtVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(rtVar.r).removeRecentGif(rtVar.W);
                        rtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(rtVar.r).addRecentGif(rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(rtVar.r).saveGif("gif", rtVar.W);
                        rtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = rtVar.W;
                        TLRPC.BotInlineResult botInlineResult = rtVar.Z;
                        Object obj = rtVar.b0;
                        org.telegram.ui.pt ptVar3 = rtVar.l;
                        z4.M(rtVar.w, ptVar3.a(), new a1.d(ptVar3, document, botInlineResult, obj, 10), rtVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.pt ptVar4 = rtVar.l;
                        TLObject tLObject3 = rtVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = rtVar.Z;
                        }
                        ptVar4.w(tLObject3, rtVar.b0);
                    }
                    rtVar.p();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.iv ivVar = (org.telegram.ui.iv) this.b;
                mh.b bVar = (mh.b) this.c;
                org.telegram.ui.hv hvVar = ivVar.U;
                ey0[] ey0VarArr = ivVar.Y;
                for (ey0 ey0Var : ey0VarArr) {
                    if (ey0Var != null) {
                        boolean z12 = ey0Var.c;
                    }
                }
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                int intValue2 = ((Integer) y1Var2.getTag()).intValue();
                ey0 ey0Var2 = ey0VarArr[intValue2];
                boolean z13 = ey0Var2.c;
                boolean z14 = !z13;
                if (z13 != z14) {
                    ey0Var2.c = z14;
                    ey0Var2.d = true;
                }
                y1Var2.c(ey0Var2.c, true);
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
                            if (((mh.a) arrayList.get(i14)).d == intValue2) {
                                if (z15) {
                                    if (!hashSet.contains(arrayList.get(i14))) {
                                        hashSet.add((mh.a) arrayList.get(i14));
                                        bVar.g((mh.a) arrayList.get(i14), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i14))) {
                                    hashSet.remove(arrayList.get(i14));
                                    bVar.g((mh.a) arrayList.get(i14), false);
                                }
                            }
                        }
                    }
                    ivVar.b0.c();
                    ivVar.X.a(hvVar.d(), true);
                    hvVar.c(true);
                    break;
                } else {
                    bVar.n = z15;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ivVar.b0.c();
                ivVar.X.a(hvVar.d(), true);
                hvVar.c(true);
            case 15:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.b;
                p70 p70Var = (p70) this.c;
                qyVar.getClass();
                p70Var.u();
                qyVar.presentFragment(new ProxyListActivity());
                break;
            case 16:
                sh.o0.e((org.telegram.ui.ActionBar.d2[]) this.c, r1, r1.currentAccount, ((org.telegram.ui.qy) this.b).V2);
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 18:
                org.telegram.ui.qy qyVar2 = (org.telegram.ui.qy) this.b;
                qyVar2.r4((ArrayList) this.c, 102, false, false, null);
                qyVar2.finishPreviewFragment();
                break;
            case 19:
                org.telegram.ui.qy.H0((org.telegram.ui.qy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new k41(14, (org.telegram.ui.qy) this.b, (String) this.c), 250L);
                break;
            case 21:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.c20) this.c).getSuggestedFilter();
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
                org.telegram.ui.c10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, b20Var.e, new org.telegram.ui.w10(i12, b20Var, suggestedFilter));
                break;
            case 22:
                ze.d.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 23:
                org.telegram.ui.et etVar = (org.telegram.ui.et) this.b;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.c;
                etVar.run();
                g3Var2.dismiss();
                break;
            case 24:
                org.telegram.ui.p30 p30Var = (org.telegram.ui.p30) this.b;
                TextView textView = (TextView) this.c;
                org.telegram.ui.e60 e60Var2 = p30Var.B;
                ChatObject.Call call = e60Var2.X0;
                if (call != null && call.recording) {
                    e60Var2.G1(textView);
                    break;
                }
                break;
            case 25:
                new org.telegram.ui.o50((Context) this.c, (eg.h0) this.b).show();
                break;
            case 26:
                org.telegram.ui.w70 w70Var = (org.telegram.ui.w70) this.b;
                jj0 jj0Var = (jj0) this.c;
                w70Var.getClass();
                if (!org.telegram.ui.qy.u4) {
                    org.telegram.ui.qy.u4 = true;
                    boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z16 = !q10;
                    org.telegram.ui.ActionBar.i6 N0 = !q10 ? org.telegram.ui.ActionBar.j6.N0("Night") : org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.j6.o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    gj0 gj0Var2 = w70Var.v;
                    gj0Var2.N(!q10 ? gj0Var2.e[0] - 1 : 0);
                    jj0Var.d();
                    int[] iArr = {(jj0Var.getMeasuredWidth() / 2) + r14, (jj0Var.getMeasuredHeight() / 2) + r14};
                    jj0Var.getLocationInWindow(iArr);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z16), jj0Var);
                    jj0Var.setContentDescription(LocaleController.getString(!q10 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.i80 i80Var = (org.telegram.ui.i80) this.b;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                i80Var.N.dismiss();
                if (i80Var.c0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i19 = i80Var.W;
                    if (i19 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i19 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    org.telegram.ui.qy qyVar3 = new org.telegram.ui.qy(bundle);
                    qyVar3.z2 = new org.telegram.ui.ss(13, i80Var, qyVar3);
                    p2Var2.presentFragment(qyVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i80Var.W);
                    org.telegram.ui.f6 f6Var = new org.telegram.ui.f6(bundle2);
                    f6Var.d = i80Var.c0;
                    f6Var.U();
                    p2Var2.presentFragment(f6Var);
                    break;
                }
            case 28:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.p4[] p4VarArr = (org.telegram.ui.Cells.p4[]) this.c;
                Pattern pattern = LaunchActivity.y1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.p4) view).getCurrentLocale();
                int i20 = 0;
                while (i20 < 2) {
                    p4VarArr[i20].a.a(i20 == num.intValue(), true);
                    i20++;
                }
                break;
            default:
                z4.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new org.telegram.ui.eb0((org.telegram.ui.pb0) this.b, i11));
                break;
        }
    }
}
