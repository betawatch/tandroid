package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fi0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c9  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ArrayList arrayList = null;
        int i10 = 6;
        int i11 = 4;
        switch (this.a) {
            case 0:
                gi0 gi0Var = (gi0) this.c;
                Context context = (Context) this.b;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(gi0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, gi0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                break;
            case 1:
                String str = (String) this.c;
                Context context2 = (Context) this.b;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                context2.startActivity(createChooser);
                break;
            case 2:
                jh.k7 k7Var = (jh.k7) this.c;
                ih.o3 o3Var = (ih.o3) this.b;
                k7Var.e = !k7Var.e;
                o3Var.run();
                k7Var.i(true);
                break;
            case 3:
                jx0 jx0Var = (jx0) this.c;
                org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) this.b;
                org.telegram.ui.ht.q().v(jx0Var.r.i0);
                org.telegram.ui.ht.q().y(b8Var);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) this.c;
                jh.w2 w2Var = (jh.w2) this.b;
                AndroidUtilities.addToClipboard(charSequence);
                w2Var.run();
                break;
            case 5:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                boolean[] zArr = (boolean[]) this.b;
                f3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 6:
                v31 v31Var = (v31) this.c;
                k51 k51Var = (k51) this.b;
                v31Var.g0 = false;
                v31Var.I();
                k51Var.N(true);
                v31Var.s();
                break;
            case 7:
                q31 q31Var = (q31) this.c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.b;
                ImageView imageView = q31Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(jr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.c;
                ((org.telegram.ui.ActionBar.o1) this.b).d(true);
                a41.a(qkVar.getContext(), qkVar.d);
                break;
            case 9:
                UndoView undoView = (UndoView) this.c;
                TLRPC.Message message = (TLRPC.Message) this.b;
                int i12 = UndoView.a0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.o2 o2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = o2Var.getMessagesController().getInputPeer(message.peer_id);
                o2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new a2(undoView, 18), 2);
                break;
            case 10:
                b61 b61Var = (b61) this.c;
                File file = (File) this.b;
                if (file == null) {
                    b61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(b61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        b61Var.dismiss();
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.c;
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.b;
                if (j30Var.h()) {
                    if (df.d.a(r50Var.e0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(r50Var.e0);
                        r50Var.dismiss();
                        break;
                    } else {
                        c5.B(r50Var.e0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(r50Var.e0)) {
                    w20.a0 = false;
                    r50Var.dismiss();
                    break;
                } else {
                    c5.A(j30Var.getContext()).o();
                    break;
                }
            case 12:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.c;
                xi0 xi0Var = (xi0) this.b;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    xi0Var.K(69);
                    xi0Var.N(99);
                } else {
                    xi0Var.K(36);
                    xi0Var.N(69);
                }
                xi0Var.start();
                break;
            case 13:
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.b;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                y1Var.c(z11, true);
                break;
            case 14:
                org.telegram.ui.Components.voip.o2 o2Var2 = (org.telegram.ui.Components.voip.o2) this.c;
                Context context3 = (Context) this.b;
                o2Var2.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    oh1.w((Activity) context3, o2Var2.H);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.c;
                hsVar.showDialog(c5.m(hsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.b)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.x3(hsVar, i11), null, false, false, hsVar.r).a);
                break;
            case 16:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
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
                        c5.M(htVar.w, ftVar3.a(), new a1.d(ftVar3, document, botInlineResult, obj, 10), htVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ft ftVar4 = htVar.l;
                        TLObject tLObject3 = htVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = htVar.Z;
                        }
                        ftVar4.v(tLObject3, htVar.b0);
                    }
                    htVar.p();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.yu yuVar = (org.telegram.ui.yu) this.c;
                kh.b bVar = (kh.b) this.b;
                org.telegram.ui.xu xuVar = yuVar.T;
                ux0[] ux0VarArr = yuVar.X;
                for (ux0 ux0Var : ux0VarArr) {
                    if (ux0Var != null) {
                        boolean z13 = ux0Var.c;
                    }
                }
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                int intValue2 = ((Integer) y1Var2.getTag()).intValue();
                ux0 ux0Var2 = ux0VarArr[intValue2];
                boolean z14 = ux0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    ux0Var2.c = z15;
                    ux0Var2.d = true;
                }
                y1Var2.c(ux0Var2.c, true);
                boolean z16 = ux0VarArr[intValue2].c;
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
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            if (((kh.a) arrayList.get(i13)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i13))) {
                                        hashSet.add((kh.a) arrayList.get(i13));
                                        bVar.g((kh.a) arrayList.get(i13), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i13))) {
                                    hashSet.remove(arrayList.get(i13));
                                    bVar.g((kh.a) arrayList.get(i13), false);
                                }
                            }
                        }
                    }
                    yuVar.a0.c();
                    yuVar.W.a(xuVar.d(), true);
                    xuVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                yuVar.a0.c();
                yuVar.W.a(xuVar.d(), true);
                xuVar.c(true);
            case 18:
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) this.c;
                j70 j70Var = (j70) this.b;
                fyVar.getClass();
                j70Var.u();
                fyVar.presentFragment(new ProxyListActivity());
                break;
            case 19:
                qh.p0.e((org.telegram.ui.ActionBar.c2[]) this.b, r0, r0.currentAccount, ((org.telegram.ui.fy) this.c).U2);
                break;
            case 20:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.c)[0].getSwipeBack().e(((int[]) this.b)[0]);
                break;
            case 21:
                org.telegram.ui.fy fyVar2 = (org.telegram.ui.fy) this.c;
                fyVar2.r4((ArrayList) this.b, 102, false, false, null);
                fyVar2.finishPreviewFragment();
                break;
            case 22:
                org.telegram.ui.fy.H0((org.telegram.ui.fy) this.c, (BirthdayController.BirthdayState) this.b);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(i10, (org.telegram.ui.fy) this.c, (String) this.b), 250L);
                break;
            case 24:
                org.telegram.ui.n10 n10Var = (org.telegram.ui.n10) this.c;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.o10) this.b).getSuggestedFilter();
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
                int i14 = 0;
                while (i14 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i14 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i14 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(i15);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            if (j11 == 0) {
                                j11 = inputPeer.channel_id;
                            }
                            j10 = -j11;
                        }
                        i15 = a4.w.g(j10, arrayList5, i15, 1);
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
                org.telegram.ui.p00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, n10Var.e, new org.telegram.ui.Components.voip.o(23, n10Var, suggestedFilter));
                break;
            case 25:
                ye.d.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 26:
                org.telegram.ui.vs vsVar = (org.telegram.ui.vs) this.c;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.b;
                vsVar.run();
                f3Var2.dismiss();
                break;
            case 27:
                org.telegram.ui.b30 b30Var = (org.telegram.ui.b30) this.c;
                TextView textView = (TextView) this.b;
                org.telegram.ui.r50 r50Var2 = b30Var.A;
                ChatObject.Call call = r50Var2.W0;
                if (call != null && call.recording) {
                    r50Var2.G1(textView);
                    break;
                }
                break;
            case 28:
                new org.telegram.ui.a50((Context) this.b, (cg.h0) this.c).show();
                break;
            default:
                org.telegram.ui.k70 k70Var = (org.telegram.ui.k70) this.c;
                aj0 aj0Var = (aj0) this.b;
                k70Var.getClass();
                if (!org.telegram.ui.fy.t4) {
                    org.telegram.ui.fy.t4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                    boolean z17 = !q6;
                    org.telegram.ui.ActionBar.f6 N0 = !q6 ? org.telegram.ui.ActionBar.g6.N0("Night") : org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.g6.o = 0;
                    org.telegram.ui.ActionBar.g6.q1();
                    org.telegram.ui.ActionBar.g6.A();
                    xi0 xi0Var2 = k70Var.v;
                    xi0Var2.N(!q6 ? xi0Var2.e[0] - 1 : 0);
                    aj0Var.d();
                    int[] iArr = {(aj0Var.getMeasuredWidth() / 2) + r13, (aj0Var.getMeasuredHeight() / 2) + r13};
                    aj0Var.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), aj0Var);
                    aj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fi0(Context context, TL_fragment.TL_collectibleInfo tL_collectibleInfo) {
        this.a = 25;
        this.b = context;
        this.c = tL_collectibleInfo;
    }
}
