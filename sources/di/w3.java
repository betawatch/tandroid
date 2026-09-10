package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Runnable {
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

    public /* synthetic */ w3(bi.d dVar, TLObject tLObject, int i10, long j3, org.telegram.ui.ActionBar.h3 h3Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i10;
        this.f = j3;
        this.r = h3Var;
        this.s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.v = context;
        this.w = f6Var;
        this.x = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.dr(r13, (org.telegram.ui.Components.a10) r2, r1, r12));
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
        org.telegram.ui.ActionBar.p2 U;
        int i10;
        ArrayList arrayList;
        int i11 = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        long j3 = this.h;
        Object obj3 = this.v;
        Object obj4 = this.s;
        boolean z10 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                f6 f6Var = (f6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((bi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        r6.q(h3Var.topBulletinContainer, f6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i12 = this.b;
                    xh.p g10 = xh.p.g(i12);
                    long j10 = this.f;
                    xh.m d = g10.d(j10);
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
                    h3Var.dismiss();
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
                    if ((j3 != j10 || z10) && (U = LaunchActivity.U()) != null && (!(U instanceof h4) || ((h4) U).P != j10)) {
                        U.presentFragment(new h4(j10));
                    }
                    if (connectedbotstarref != null) {
                        xh.n e = xh.p.g(i12).e(j10);
                        long j11 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e.e;
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i15)).bot_id == j11) {
                                    arrayList3.remove(i15);
                                    e.c--;
                                    NotificationCenter.getInstance(e.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(e.b));
                                } else {
                                    i15++;
                                }
                            }
                        }
                        new wc(h4.H0(context, i12, connectedbotstarref, j10, f6Var).topBulletinContainer, f6Var).V(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                        break;
                    }
                }
                break;
            default:
                sk skVar = (sk) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = skVar.P;
                SparseArray sparseArray = skVar.O;
                ArrayList arrayList8 = skVar.M;
                HashMap hashMap = skVar.Q;
                ArrayList arrayList9 = skVar.N;
                ArrayList arrayList10 = skVar.L;
                tk tkVar = skVar.X;
                hk hkVar = tkVar.L;
                if (this.b == skVar.T) {
                    skVar.S = false;
                    if (tL_error == null) {
                        ik ikVar = tkVar.r;
                        hkVar.e(false, true);
                        m90 m90Var = hkVar.e;
                        uh.o oVar = hkVar.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        skVar.G = messages_messages.next_rate;
                        ik ikVar2 = ikVar;
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
                        skVar.K = str;
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
                        skVar.V = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(skVar.K) && this.f == 0 && j3 == 0) {
                                oVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                m90Var.setVisibility(0);
                                m90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                oVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                m90Var.setVisibility(0);
                                m90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
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
                            skVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(skVar.K));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            ik ikVar3 = ikVar2;
                            View childAt = ikVar3.getChildAt(i20);
                            if (childAt instanceof a10) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            ikVar2 = ikVar3;
                        }
                        ik ikVar4 = ikVar2;
                        if (view != null) {
                            ikVar4.removeView(view);
                        }
                        if (tkVar.J.getVisibility() != 0) {
                            i10 = 1;
                            break;
                        } else {
                            i10 = 1;
                            break;
                        }
                    } else {
                        uh.o oVar2 = hkVar.d;
                        m90 m90Var2 = hkVar.e;
                        oVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        m90Var2.setVisibility(0);
                        m90Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        hkVar.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w3(sk skVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = skVar;
        this.b = i10;
        this.c = tL_error;
        this.d = tLObject;
        this.r = accountInstance;
        this.e = z10;
        this.s = str;
        this.v = arrayList;
        this.f = j3;
        this.h = j10;
        this.w = arrayList2;
        this.x = arrayList3;
    }
}
