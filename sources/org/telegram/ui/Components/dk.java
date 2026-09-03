package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ TLRPC.TL_error h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ dk(gk gkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z4, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = gkVar;
        this.c = i10;
        this.h = tL_error;
        this.b = tLObject;
        this.r = accountInstance;
        this.f = z4;
        this.s = str;
        this.v = arrayList;
        this.d = j10;
        this.e = j11;
        this.w = arrayList2;
        this.x = arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0354, code lost:
    
        if (r2.getChildCount() > 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x035a, code lost:
    
        r7.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.xq(r12, (org.telegram.ui.Components.u00) r13, r1, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0368, code lost:
    
        r12.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0358, code lost:
    
        if (r13 != null) goto L122;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ArrayList arrayList;
        int i11;
        TLRPC.User user;
        char c3;
        TL_payments.connectedBotStarRef connectedbotstarref;
        org.telegram.ui.ActionBar.p2 U;
        int i12 = this.a;
        TLRPC.TL_error tL_error = this.h;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.v;
        boolean z4 = this.f;
        long j10 = this.e;
        Object obj4 = this.s;
        Object obj5 = this.r;
        TLObject tLObject = this.b;
        Object obj6 = this.n;
        switch (i12) {
            case 0:
                gk gkVar = (gk) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = gkVar.M;
                SparseArray sparseArray = gkVar.L;
                ArrayList arrayList6 = gkVar.J;
                HashMap hashMap = gkVar.N;
                ArrayList arrayList7 = gkVar.K;
                ArrayList arrayList8 = gkVar.I;
                hk hkVar = gkVar.U;
                nh.y4 y4Var = hkVar.I;
                if (this.c == gkVar.Q) {
                    gkVar.P = false;
                    if (tL_error != null) {
                        ih.s sVar = y4Var.d;
                        f90 f90Var = y4Var.e;
                        sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        f90Var.setVisibility(0);
                        f90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        y4Var.e(false, true);
                        break;
                    } else {
                        vj vjVar = hkVar.r;
                        y4Var.e(false, true);
                        f90 f90Var2 = y4Var.e;
                        ih.s sVar2 = y4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        gkVar.D = messages_messages.next_rate;
                        vj vjVar2 = vjVar;
                        accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        accountInstance.getMessagesController().putUsers(messages_messages.users, false);
                        accountInstance.getMessagesController().putChats(messages_messages.chats, false);
                        if (!z4) {
                            arrayList7.clear();
                            sparseArray.clear();
                            arrayList5.clear();
                            hashMap.clear();
                        }
                        int i13 = messages_messages.count;
                        gkVar.H = str;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            MessageObject messageObject = (MessageObject) arrayList2.get(i14);
                            ArrayList arrayList9 = (ArrayList) hashMap.get(messageObject.monthKey);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                arrayList = arrayList2;
                                hashMap.put(messageObject.monthKey, arrayList9);
                                arrayList5.add(messageObject.monthKey);
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList9.add(messageObject);
                            arrayList7.add(messageObject);
                            sparseArray.put(messageObject.getId(), messageObject);
                            i14++;
                            arrayList2 = arrayList;
                        }
                        if (arrayList7.size() > i13) {
                            i13 = arrayList7.size();
                        }
                        gkVar.S = arrayList7.size() >= i13;
                        if (arrayList7.isEmpty()) {
                            if (TextUtils.isEmpty(gkVar.H) && this.d == 0 && j10 == 0) {
                                sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                f90Var2.setVisibility(0);
                                f90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                f90Var2.setVisibility(0);
                                f90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            }
                        }
                        if (!z4) {
                            arrayList8.clear();
                            if (arrayList3 != null) {
                                arrayList8.addAll(arrayList3);
                            }
                            if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                                    if (!(arrayList8.get(i15) instanceof TLRPC.User) || UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != ((TLRPC.User) arrayList8.get(i15)).id) {
                                    }
                                }
                                arrayList8.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                arrayList6.clear();
                                arrayList6.addAll(arrayList4);
                                gkVar.a0(arrayList8, arrayList6, TextUtils.isEmpty(gkVar.H));
                            }
                            arrayList6.clear();
                            arrayList6.addAll(arrayList4);
                            gkVar.a0(arrayList8, arrayList6, TextUtils.isEmpty(gkVar.H));
                        }
                        int i16 = -1;
                        View view = null;
                        int i17 = 0;
                        while (i17 < size) {
                            vj vjVar3 = vjVar2;
                            View childAt = vjVar3.getChildAt(i17);
                            if (childAt instanceof u00) {
                                i16 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i17++;
                            vjVar2 = vjVar3;
                        }
                        vj vjVar4 = vjVar2;
                        if (view != null) {
                            vjVar4.removeView(view);
                        }
                        if (hkVar.G.getVisibility() == 0) {
                            i10 = 1;
                            break;
                        } else {
                            i10 = 1;
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ((ph.d) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i18 = this.c;
                    lh.b0 g10 = lh.b0.g(i18);
                    long j11 = this.d;
                    lh.y d = g10.d(j11);
                    int i19 = d.a;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList10 = d.e;
                    arrayList10.clear();
                    if (d.i != 0) {
                        i11 = i18;
                        user = user2;
                        ConnectionsManager.getInstance(i19).cancelRequest(d.i, true);
                        d.i = 0;
                    } else {
                        i11 = i18;
                        user = user2;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList10.addAll(connectedstarrefbots.connected_bots);
                    d.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList10.size() >= d.c;
                    d.h = false;
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
                    d.a();
                    g3Var.dismiss();
                    int i20 = 0;
                    while (true) {
                        if (i20 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i20);
                            c3 = 0;
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i20++;
                            }
                        } else {
                            c3 = 0;
                            connectedbotstarref = null;
                        }
                    }
                    if ((j10 != j11 || z4) && (U = LaunchActivity.U()) != null && (!(U instanceof rh.d3) || ((rh.d3) U).M != j11)) {
                        U.presentFragment(new rh.d3(j11));
                    }
                    if (connectedbotstarref != null) {
                        lh.z e = lh.b0.g(i11).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList11 = e.e;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList11.size()) {
                                if (((TL_payments.starRefProgram) arrayList11.get(i21)).bot_id == j12) {
                                    arrayList11.remove(i21);
                                    e.c--;
                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(e.a);
                                    int i22 = NotificationCenter.channelSuggestedBotsUpdate;
                                    Object[] objArr = new Object[1];
                                    objArr[c3] = Long.valueOf(e.b);
                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                                } else {
                                    i21++;
                                }
                            }
                        }
                        qc qcVar = new qc(rh.d3.H0(context, i11, connectedbotstarref, j11, f6Var).topBulletinContainer, f6Var);
                        String string = LocaleController.getString(R.string.AffiliateProgramJoinedTitle);
                        String string2 = LocaleController.getString(R.string.AffiliateProgramJoinedText);
                        TLObject[] tLObjectArr = new TLObject[1];
                        tLObjectArr[c3] = user;
                        qcVar.V(Arrays.asList(tLObjectArr), string, string2, null).j();
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.ai.u(g3Var.topBulletinContainer, f6Var, tL_error, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dk(ph.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.g3 g3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.b = tLObject;
        this.c = i10;
        this.d = j10;
        this.r = g3Var;
        this.s = starrefprogram;
        this.e = j11;
        this.f = z4;
        this.v = context;
        this.w = f6Var;
        this.x = user;
        this.h = tL_error;
    }
}
