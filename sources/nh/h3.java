package nh;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import jh.x4;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qj;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Runnable {
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

    public /* synthetic */ h3(lh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.e3 e3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, c6 c6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i10;
        this.f = j10;
        this.r = e3Var;
        this.s = starrefprogram;
        this.h = j11;
        this.e = z10;
        this.v = context;
        this.w = c6Var;
        this.x = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.pq(r13, (org.telegram.ui.Components.h00) r2, r1, r12));
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
        org.telegram.ui.ActionBar.n2 U;
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
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                c6 c6Var = (c6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((lh.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        pa.t(e3Var.topBulletinContainer, c6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i12 = this.b;
                    hh.c0 g10 = hh.c0.g(i12);
                    long j11 = this.f;
                    hh.z d = g10.d(j11);
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
                    e3Var.dismiss();
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
                    if ((j10 != j11 || z10) && (U = LaunchActivity.U()) != null && (!(U instanceof s3) || ((s3) U).L != j11)) {
                        U.presentFragment(new s3(j11));
                    }
                    if (connectedbotstarref != null) {
                        hh.a0 e9 = hh.c0.g(i12).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e9.e;
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i15)).bot_id == j12) {
                                    arrayList3.remove(i15);
                                    e9.c--;
                                    NotificationCenter.getInstance(e9.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(e9.b));
                                } else {
                                    i15++;
                                }
                            }
                        }
                        new mc(s3.H0(context, i12, connectedbotstarref, j11, c6Var).topBulletinContainer, c6Var).V(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                        break;
                    }
                }
                break;
            default:
                ak akVar = (ak) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = akVar.L;
                SparseArray sparseArray = akVar.K;
                ArrayList arrayList8 = akVar.I;
                HashMap hashMap = akVar.M;
                ArrayList arrayList9 = akVar.J;
                ArrayList arrayList10 = akVar.H;
                bk bkVar = akVar.T;
                x4 x4Var = bkVar.H;
                if (this.b == akVar.P) {
                    akVar.O = false;
                    if (tL_error == null) {
                        qj qjVar = bkVar.r;
                        x4Var.e(false, true);
                        p80 p80Var = x4Var.e;
                        eh.s sVar = x4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        akVar.C = messages_messages.next_rate;
                        qj qjVar2 = qjVar;
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
                        akVar.G = str;
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
                        akVar.R = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(akVar.G) && this.f == 0 && j10 == 0) {
                                sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                p80Var.setVisibility(0);
                                p80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                p80Var.setVisibility(0);
                                p80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
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
                            akVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(akVar.G));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            qj qjVar3 = qjVar2;
                            View childAt = qjVar3.getChildAt(i20);
                            if (childAt instanceof h00) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            qjVar2 = qjVar3;
                        }
                        qj qjVar4 = qjVar2;
                        if (view != null) {
                            qjVar4.removeView(view);
                        }
                        if (bkVar.F.getVisibility() != 0) {
                            i10 = 1;
                            break;
                        } else {
                            i10 = 1;
                            break;
                        }
                    } else {
                        eh.s sVar2 = x4Var.d;
                        p80 p80Var2 = x4Var.e;
                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        p80Var2.setVisibility(0);
                        p80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        x4Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h3(ak akVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = akVar;
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
