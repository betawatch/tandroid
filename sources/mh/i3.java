package mh;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ih.b5;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.uj;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Runnable {
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

    public /* synthetic */ i3(kh.d dVar, TLObject tLObject, int i9, long j10, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, b6 b6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i9;
        this.f = j10;
        this.r = f3Var;
        this.s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.w = b6Var;
        this.x = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.nq(r13, (org.telegram.ui.Components.e00) r2, r1, r12));
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
        org.telegram.ui.ActionBar.o2 U;
        int i9;
        ArrayList arrayList;
        int i10 = this.a;
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
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                b6 b6Var = (b6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((kh.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.j2.s(f3Var.topBulletinContainer, b6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    gh.c0 g10 = gh.c0.g(i11);
                    long j11 = this.f;
                    gh.z d = g10.d(j11);
                    int i12 = d.a;
                    MessagesController.getInstance(i12).putUsers(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList2 = d.e;
                    arrayList2.clear();
                    if (d.i != 0) {
                        ConnectionsManager.getInstance(i12).cancelRequest(d.i, true);
                        d.i = 0;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    d.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= d.c;
                    d.h = false;
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
                    d.a();
                    f3Var.dismiss();
                    int i13 = 0;
                    while (true) {
                        if (i13 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i13);
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i13++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j10 != j11 || z10) && (U = LaunchActivity.U()) != null && (!(U instanceof u3) || ((u3) U).L != j11)) {
                        U.presentFragment(new u3(j11));
                    }
                    if (connectedbotstarref != null) {
                        gh.a0 e10 = gh.c0.g(i11).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e10.e;
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i14)).bot_id == j12) {
                                    arrayList3.remove(i14);
                                    e10.c--;
                                    NotificationCenter.getInstance(e10.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new oc(u3.G0(context, i11, connectedbotstarref, j11, b6Var).topBulletinContainer, b6Var).V(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                        break;
                    }
                }
                break;
            default:
                ek ekVar = (ek) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ekVar.L;
                SparseArray sparseArray = ekVar.K;
                ArrayList arrayList8 = ekVar.I;
                HashMap hashMap = ekVar.M;
                ArrayList arrayList9 = ekVar.J;
                ArrayList arrayList10 = ekVar.H;
                fk fkVar = ekVar.T;
                b5 b5Var = fkVar.H;
                if (this.b == ekVar.P) {
                    ekVar.O = false;
                    if (tL_error == null) {
                        uj ujVar = fkVar.r;
                        b5Var.e(false, true);
                        l80 l80Var = b5Var.e;
                        dh.u uVar = b5Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        ekVar.C = messages_messages.next_rate;
                        uj ujVar2 = ujVar;
                        accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        accountInstance.getMessagesController().putUsers(messages_messages.users, false);
                        accountInstance.getMessagesController().putChats(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i15 = messages_messages.count;
                        ekVar.G = str;
                        int size = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size) {
                            MessageObject messageObject = (MessageObject) arrayList4.get(i16);
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
                            i16++;
                            arrayList4 = arrayList;
                        }
                        if (arrayList9.size() > i15) {
                            i15 = arrayList9.size();
                        }
                        ekVar.R = arrayList9.size() >= i15;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(ekVar.G) && this.f == 0 && j10 == 0) {
                                uVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                l80Var.setVisibility(0);
                                l80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                uVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                l80Var.setVisibility(0);
                                l80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList10.size()) {
                                        arrayList10.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                    } else if (!(arrayList10.get(i17) instanceof TLRPC.User) || UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != ((TLRPC.User) arrayList10.get(i17)).id) {
                                        i17++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            ekVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(ekVar.G));
                        }
                        int i18 = -1;
                        View view = null;
                        int i19 = 0;
                        while (i19 < size) {
                            uj ujVar3 = ujVar2;
                            View childAt = ujVar3.getChildAt(i19);
                            if (childAt instanceof e00) {
                                i18 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i19++;
                            ujVar2 = ujVar3;
                        }
                        uj ujVar4 = ujVar2;
                        if (view != null) {
                            ujVar4.removeView(view);
                        }
                        if (fkVar.F.getVisibility() != 0) {
                            i9 = 1;
                            break;
                        } else {
                            i9 = 1;
                            break;
                        }
                    } else {
                        dh.u uVar2 = b5Var.d;
                        l80 l80Var2 = b5Var.e;
                        uVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        l80Var2.setVisibility(0);
                        l80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        b5Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i3(ek ekVar, int i9, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = ekVar;
        this.b = i9;
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
