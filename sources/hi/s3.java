package hi;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.n5;
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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ s3(fi.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.k3 k3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, u6 u6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i10;
        this.f = j10;
        this.r = k3Var;
        this.s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.w = u6Var;
        this.x = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.tq(r13, (org.telegram.ui.Components.c10) r2, r1, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020d, code lost:
    
        r13.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fd, code lost:
    
        if (r2 != null) goto L74;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_payments.connectedBotStarRef connectedbotstarref;
        org.telegram.ui.ActionBar.r2 U;
        int i10;
        ArrayList arrayList;
        int i11 = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        long j10 = this.h;
        Object obj3 = this.v;
        Object obj4 = this.s;
        boolean z10 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                u6 u6Var = (u6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((fi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.d3.t(k3Var.topBulletinContainer, u6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i12 = this.b;
                    bi.m0 g7 = bi.m0.g(i12);
                    long j11 = this.f;
                    bi.j0 d = g7.d(j11);
                    int i13 = d.a;
                    MessagesController.getInstance(i13).putUsers(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList2 = d.e;
                    arrayList2.clear();
                    if (d.i != 0) {
                        ConnectionsManager.getInstance(i13).cancelRequest(d.i, true);
                        d.i = 0;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    d.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= d.c;
                    d.h = false;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
                    d.a();
                    k3Var.dismiss();
                    int i14 = 0;
                    while (true) {
                        if (i14 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i14);
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i14++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j10 != j11 || z10) && (U = LaunchActivity.U()) != null && (!(U instanceof d4) || ((d4) U).R != j11)) {
                        U.presentFragment(new d4(j11));
                    }
                    if (connectedbotstarref != null) {
                        bi.k0 e = bi.m0.g(i12).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e.e;
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i15)).bot_id == j12) {
                                    arrayList3.remove(i15);
                                    e.c--;
                                    NotificationCenter.getInstance(e.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(e.b));
                                } else {
                                    i15++;
                                }
                            }
                        }
                        new wc(d4.G0(context, i12, connectedbotstarref, j11, u6Var).topBulletinContainer, u6Var).W(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                        break;
                    }
                }
                break;
            default:
                mk mkVar = (mk) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = mkVar.P;
                SparseArray sparseArray = mkVar.O;
                ArrayList arrayList8 = mkVar.M;
                HashMap hashMap = mkVar.Q;
                ArrayList arrayList9 = mkVar.N;
                ArrayList arrayList10 = mkVar.L;
                nk nkVar = mkVar.X;
                n5 n5Var = nkVar.L;
                if (this.b == mkVar.T) {
                    mkVar.S = false;
                    if (tL_error == null) {
                        ck ckVar = nkVar.r;
                        n5Var.e(false, true);
                        aa0 aa0Var = n5Var.e;
                        xh.n nVar = n5Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        mkVar.G = messages_messages.next_rate;
                        ck ckVar2 = ckVar;
                        accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        accountInstance.getMessagesController().putUsers(messages_messages.users, false);
                        accountInstance.getMessagesController().putChats(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        mkVar.K = str;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            MessageObject messageObject = (MessageObject) arrayList4.get(i17);
                            ArrayList arrayList11 = (ArrayList) hashMap.get(messageObject.monthKey);
                            if (arrayList11 == null) {
                                arrayList11 = new ArrayList();
                                arrayList = arrayList4;
                                hashMap.put(messageObject.monthKey, arrayList11);
                                arrayList7.add(messageObject.monthKey);
                            } else {
                                arrayList = arrayList4;
                            }
                            arrayList11.add(messageObject);
                            arrayList9.add(messageObject);
                            sparseArray.put(messageObject.getId(), messageObject);
                            i17++;
                            arrayList4 = arrayList;
                        }
                        if (arrayList9.size() > i16) {
                            i16 = arrayList9.size();
                        }
                        mkVar.V = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(mkVar.K) && this.f == 0 && j10 == 0) {
                                nVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                aa0Var.setVisibility(0);
                                aa0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                nVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                aa0Var.setVisibility(0);
                                aa0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            mkVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(mkVar.K));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            ck ckVar3 = ckVar2;
                            View childAt = ckVar3.getChildAt(i20);
                            if (childAt instanceof c10) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            ckVar2 = ckVar3;
                        }
                        ck ckVar4 = ckVar2;
                        if (view != null) {
                            ckVar4.removeView(view);
                        }
                        if (nkVar.J.getVisibility() != 0) {
                            i10 = 1;
                            break;
                        } else {
                            i10 = 1;
                            break;
                        }
                    } else {
                        xh.n nVar2 = n5Var.d;
                        aa0 aa0Var2 = n5Var.e;
                        nVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        aa0Var2.setVisibility(0);
                        aa0Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        n5Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s3(mk mkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = mkVar;
        this.b = i10;
        this.c = tL_error;
        this.d = tLObject;
        this.r = accountInstance;
        this.e = z10;
        this.s = str;
        this.v = arrayList;
        this.f = j10;
        this.h = j11;
        this.w = arrayList2;
        this.x = arrayList3;
    }
}
