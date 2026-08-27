package ag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseIntArray;
import android.view.View;
import hh.i5;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import jh.j6;
import jh.s6;
import nh.o4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zo;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.c9;
import org.telegram.ui.ck;
import org.telegram.ui.kn;
import org.telegram.ui.lg;
import org.telegram.ui.m4;
import org.telegram.ui.mn;
import org.telegram.ui.mv;
import org.telegram.ui.pn;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i10, Context context, c6 c6Var, TL_stars.SavedStarGift savedStarGift) {
        this.a = 2;
        this.b = i10;
        this.c = context;
        this.d = c6Var;
        this.e = savedStarGift;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        ck ckVar;
        q00 q00Var;
        long peerId;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 6;
        int i15 = 4;
        String str = null;
        int i16 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
                i1.R((i1) obj3, (ArrayList) obj2, i16, (TLRPC.TL_messages_inactiveChats) obj);
                return;
            case 1:
                c3.g gVar = (c3.g) obj3;
                w2.i iVar = (w2.i) obj2;
                Runnable runnable2 = (Runnable) obj;
                e3.c cVar = (e3.c) gVar.f;
                try {
                    try {
                        d3.d dVar = (d3.d) gVar.c;
                        Objects.requireNonNull(dVar);
                        ((d3.h) cVar).f(new a1.c(dVar, 4));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) gVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((d3.h) cVar).f(new c3.d(gVar, iVar, i16, 0));
                        } else {
                            gVar.e(iVar, i16);
                        }
                    } catch (Throwable th) {
                        runnable2.run();
                        throw th;
                    }
                } catch (e3.a unused) {
                    ((a5.n) gVar.d).y(iVar, i16 + 1, false);
                }
                runnable2.run();
                return;
            case 2:
                int i17 = this.b;
                i5 i5Var = new i5((Context) obj3, i17, UserConfig.getInstance(i17).getClientUserId(), (c6) obj2, null);
                i5Var.j2((TL_stars.SavedStarGift) obj, null);
                i5Var.show();
                return;
            case 3:
                j6 j6Var = (j6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = j6Var.k;
                int i18 = j6Var.f;
                AbstractSet abstractSet2 = j6Var.l;
                j6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = j6Var.e;
                sb2.append(i19);
                sb2.append("{");
                long j10 = j6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(s6.a(arrayList));
                pa.v("}", sb2);
                ArrayList arrayList2 = j6Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i20 = j6Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i20).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i20).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i20).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                j6Var.u = false;
                j6Var.s = tL_stories_stories.count;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    j6Var.t((MessageObject) arrayList.get(i21), z10);
                    i21++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= j6Var.s;
                j6Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            j6Var.u(intValue, false);
                        }
                    }
                } else if (i18 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                                Integer num2 = (Integer) arrayList3.get(i22);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i16 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i16 = i10;
                    }
                    int n10 = j6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
                            it2.remove();
                            j6Var.u(intValue3, false);
                        }
                    }
                }
                j6Var.d(true);
                if (j6Var.r) {
                    if (j6.B == null) {
                        j6.B = new HashMap();
                    }
                    j6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i20), Integer.valueOf(i19), Long.valueOf(j10), Integer.valueOf(i18))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    j6Var.w();
                }
                j6Var.x();
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j3.m(MessagesStorage.getInstance(i16).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 19));
                return;
            case 5:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    sVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    o4.b(i16, user, userFull2, sVar);
                    return;
                }
            case 6:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                a5 a5Var = (a5) obj2;
                Runnable runnable3 = (Runnable) obj;
                g5.b bVar = actionBarLayout.W;
                boolean z12 = false;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (i23 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.T) && actionBarLayout.K0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) i0.a.j(2, actionBarLayout.K0);
                        }
                    }
                    if (n2Var != null) {
                        if (a5Var.m != null) {
                            if (actionBarLayout.a0 == null) {
                                d5 d5Var = new d5(0, true, false, bVar);
                                actionBarLayout.a0 = d5Var;
                                d5Var.J = true;
                                d5 d5Var2 = new d5(1, true, false, bVar);
                                actionBarLayout.b0 = d5Var2;
                                d5Var2.J = true;
                            }
                            c6 c6Var = a5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) bVar.b;
                            sparseIntArray.clear();
                            for (int i24 : (int[]) bVar.c) {
                                sparseIntArray.put(i24, c6Var.o1(i24));
                            }
                        }
                        ArrayList<i6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.e3) dialog).getThemeDescriptions());
                        }
                        if (i23 == 0 && (runnable = a5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = n2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.e3) dialog2).getThemeDescriptions());
                        }
                        z12 = true;
                    }
                }
                if (z12) {
                    if (!a5Var.e) {
                        int size = actionBarLayout.K0.size() - ((actionBarLayout.h || actionBarLayout.T) ? 2 : 1);
                        for (int i25 = 0; i25 < size; i25++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.K0.get(i25);
                            n2Var2.clearViews();
                            n2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (a5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.d0.clear();
                        actionBarLayout.U.clear();
                        actionBarLayout.V.clear();
                        actionBarLayout.f0.clear();
                        actionBarLayout.e0 = null;
                        actionBarLayout.c0 = null;
                        kn knVar = a5Var.j;
                        if (knVar != null) {
                            knVar.run();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    int i26 = g6.a;
                    g6.sl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    kn knVar2 = a5Var.i;
                    if (knVar2 != null) {
                        knVar2.run();
                    }
                    mn mnVar = a5Var.k;
                    actionBarLayout.c0 = mnVar;
                    if (mnVar != null) {
                        pn pnVar = mnVar.a;
                        pnVar.R.t0.invalidate();
                        pnVar.E.I = 0.0f;
                        pnVar.F.I = 0.0f;
                        pnVar.k(0.0f);
                    }
                    actionBarLayout.h0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.g0 = animatorSet;
                    animatorSet.addListener(new x1(11, actionBarLayout, a5Var));
                    actionBarLayout.g0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.g0.setDuration(a5Var.l);
                    actionBarLayout.g0.start();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.g1) obj3).a(0, false);
                y4.f0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 9:
                m4 m4Var = (m4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                String str2 = (String) obj;
                if (i16 == m4Var.S0) {
                    m4Var.d0(true);
                    m4Var.A = arrayList4;
                    m4Var.B = str2;
                    m4Var.q0[0].c.y.clear();
                    m4Var.q0[0].b.f1();
                    m4Var.W(0);
                    return;
                }
                return;
            case 10:
                c9 c9Var = (c9) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i16).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.e2.n(user2, false, userFull != null && userFull.video_calls_available, c9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                return;
            case 11:
                rn rnVar = (rn) obj3;
                rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(rnVar.P5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i16), Boolean.valueOf(rnVar.O4));
                rnVar.w3 = null;
                return;
            case 12:
                rn rnVar2 = (rn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                rn rnVar3 = (rn) obj;
                if (zArr[0] || i16 != rnVar2.ec || !rnVar2.B3 || rnVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new lg(rnVar2, 20), 200L);
                rnVar2.presentFragment(rnVar3);
                if (!rnVar2.x9() || rnVar3.hideKeyboardOnShow() || (ckVar = rnVar3.U) == null || ckVar.getEditField() == null) {
                    return;
                }
                rnVar3.U.getEditField().requestFocus();
                return;
            case 13:
                rn rnVar4 = (rn) obj3;
                rnVar4.getClass();
                rnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                return;
            case 14:
                hj hjVar = (hj) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                lj ljVar = hjVar.n;
                hh.f1 f1Var = ljVar.s;
                if (i16 != hjVar.h) {
                    return;
                }
                if (i16 != -1) {
                    f2.q0 adapter = f1Var.getAdapter();
                    hj hjVar2 = ljVar.B;
                    if (adapter != hjVar2) {
                        f1Var.setAdapter(hjVar2);
                    }
                }
                hjVar.d = arrayList5;
                hjVar.e = arrayList6;
                hjVar.l();
                return;
            case 15:
                dm dmVar = (dm) obj3;
                cm cmVar = (cm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                em emVar = dmVar.L;
                ValueAnimator valueAnimator = emVar.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                emVar.F = null;
                dmVar.C = 0.0f;
                dmVar.f(cmVar, photoEntry, i16);
                dmVar.j();
                dmVar.i(emVar.L, false);
                return;
            case 16:
                y4.G(((b70) obj3).e, (c6) obj2, new cg.p2(i16, (xn) obj, i14));
                return;
            case 17:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList7 = new ArrayList();
                    for (int i27 = 0; i27 < vector.objects.size(); i27++) {
                        try {
                            arrayList7.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i27))));
                        } catch (Exception unused2) {
                        }
                    }
                    q00Var = new q00(n2Var3, i16, arrayList7);
                } else {
                    q00Var = new q00(n2Var3, i16, null);
                }
                q00Var.x0 = callback;
                n2Var3.showDialog(q00Var);
                return;
            case 18:
                f30 f30Var = (f30) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                f30Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new km(f30Var, i16, new ArrayList(), i15));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i28 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i28];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList9 = new ArrayList();
                int size2 = arrayList8.size();
                int i29 = 0;
                while (i29 < size2) {
                    TLObject tLObject3 = (TLObject) arrayList8.get(i29);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else {
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                        }
                        i29++;
                        str = null;
                    }
                    i11 = ((org.telegram.ui.ActionBar.e3) f30Var.w).currentAccount;
                    TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user3)) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str;
                        }
                        int i30 = 0;
                        char c10 = 0;
                        while (true) {
                            if (i30 < i28) {
                                String str3 = strArr[i30];
                                if (lowerCase2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, translitString2)))) {
                                    c10 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    if (publicUsername != null && publicUsername.startsWith(str3)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 != 0) {
                                    arrayList9.add(tLObject3);
                                } else {
                                    i30++;
                                }
                            }
                        }
                        i29++;
                        str = null;
                    }
                    i29++;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new km(f30Var, i16, arrayList9, 4));
                return;
            case 19:
                t30 t30Var = (t30) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                int i31 = t30Var.J;
                ArrayList arrayList10 = t30Var.K;
                if (i16 != t30Var.P) {
                    return;
                }
                boolean isEmpty = arrayList10.isEmpty();
                t30Var.O = false;
                if (tLObject4 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        t30Var.S = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                    } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        t30Var.S = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    t30Var.V = messages_messages.next_rate;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        MessageObject messageObject = new MessageObject(i31, messages_messages.messages.get(i32), false, true);
                        messageObject.setQuery(str4);
                        arrayList10.add(messageObject);
                    }
                    t30Var.R = arrayList10.size() >= t30Var.S;
                    t30Var.W();
                } else {
                    t30Var.R = true;
                    t30Var.S = arrayList10.size();
                }
                t30Var.N(true);
                if (isEmpty) {
                    ((an0) t30Var).Y.p0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                um0.c(((um0) obj3).getContext(), i16, ((rm0) obj2).a.g(), (c6) obj);
                return;
            case 21:
                xp0 xp0Var = (xp0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                HashMap hashMap = xp0Var.v;
                if (i16 != xp0Var.y) {
                    return;
                }
                xp0Var.x = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    MessagesController.getInstance(xp0Var.c).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(xp0Var.c).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage)) {
                            if (hashMap.size() > 5) {
                                Iterator it3 = hashMap.keySet().iterator();
                                while (it3.hasNext() && hashMap.size() > 5) {
                                    it3.next();
                                    it3.remove();
                                }
                            }
                            hashMap.put(str5, webPage);
                            xp0Var.w = webPage;
                            xp0.a(xp0Var.a[0], webPage, str5);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            xp0Var.w = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            xp0Var.w = null;
                            if (xp0Var.b != 0) {
                                xp0Var.b = 0;
                                wp0 wp0Var = xp0Var.D;
                                if (wp0Var != null) {
                                    ((mv) wp0Var).h(0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                webPage = null;
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                }
            case 22:
                ((hu0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                return;
            case 23:
                hu0.g((hu0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 24:
                y4.f0(i16, (TLRPC.TL_error) obj2, ((hu0) obj3).r1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 25:
                ct0 ct0Var = (ct0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                String str6 = (String) obj;
                hu0 hu0Var = ct0Var.v;
                if (ct0Var.h != 0) {
                    if (i16 == ct0Var.n) {
                        int h = ct0Var.h();
                        ct0Var.f = arrayList11;
                        ct0Var.s--;
                        int h10 = ct0Var.h();
                        if (ct0Var.s == 0 || h10 != 0) {
                            hu0Var.m1(false);
                        }
                        int i33 = 0;
                        while (true) {
                            zs0[] zs0VarArr = hu0Var.g0;
                            if (i33 < zs0VarArr.length) {
                                zs0 zs0Var = zs0VarArr[i33];
                                if (zs0Var.B == ct0Var.r) {
                                    if (ct0Var.s == 0 && h10 == 0) {
                                        zs0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str6));
                                        zs0VarArr[i33].w.f.setVisibility(8);
                                        zs0VarArr[i33].w.e(false, true);
                                    } else if (h == 0) {
                                        hu0Var.z(zs0Var.h, 0, null);
                                    }
                                }
                                i33++;
                            } else {
                                ct0Var.l();
                            }
                        }
                    }
                    ct0Var.h = 0;
                    return;
                }
                return;
            case 26:
                wx0 wx0Var = (wx0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str7 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList12 = new ArrayList();
                int i34 = wx0Var.a;
                MediaDataController.getInstance(i34).getEmojiSuggestions(strArr2, str7, true, new gh.u2(wx0Var, this.b, str7, hashSet, arrayList12, 3), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i34).isPremium());
                return;
            case 27:
                wx0 wx0Var2 = (wx0) obj3;
                String str8 = (String) obj;
                ArrayList arrayList13 = (ArrayList) obj2;
                if (i16 == wx0Var2.E) {
                    wx0Var2.D = str8;
                    wx0Var2.C = 2;
                    arrayList13.remove(arrayList13.size() - 1);
                    if (arrayList13.isEmpty()) {
                        wx0Var2.x = true;
                        wx0Var2.f();
                        return;
                    }
                    wx0Var2.x = false;
                    wx0Var2.v = false;
                    wx0Var2.c();
                    p1 p1Var = wx0Var2.d;
                    if (p1Var != null) {
                        p1Var.setVisibility(0);
                        wx0Var2.d.invalidate();
                    }
                    wx0Var2.w = arrayList13;
                    tx0 tx0Var = wx0Var2.f;
                    if (tx0Var != null) {
                        tx0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                t01 t01Var = (t01) obj3;
                ArrayList arrayList14 = (ArrayList) obj2;
                ArrayList arrayList15 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = t01Var.r;
                l01 l01Var = editorAlert.c;
                if (i16 != t01Var.d) {
                    return;
                }
                t01 t01Var2 = editorAlert.r;
                if (l01Var.getAdapter() != t01Var2) {
                    editorAlert.B = ThemeEditorView.EditorAlert.J(editorAlert);
                    l01Var.setAdapter(t01Var2);
                    t01Var2.l();
                }
                boolean z13 = !t01Var.e.isEmpty() && arrayList14.isEmpty();
                boolean z14 = t01Var.e.isEmpty() && arrayList14.isEmpty();
                if (z13) {
                    editorAlert.B = ThemeEditorView.EditorAlert.J(editorAlert);
                }
                t01Var.e = arrayList14;
                t01Var.f = arrayList15;
                t01Var.l();
                if (!z14 && !z13 && (i12 = editorAlert.B) > 0) {
                    editorAlert.h.h1(0, -i12);
                    editorAlert.B = -1000;
                }
                editorAlert.e.c();
                return;
            default:
                b11 b11Var = (b11) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((zo) obj2).b;
                if (drawable instanceof nb0) {
                    nb0 nb0Var = (nb0) drawable;
                    nb0Var.t(b11.e(bitmap), i16);
                    nb0Var.u(b11Var.H);
                    b11Var.invalidate();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k0(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 4;
        this.b = i10;
        this.d = arrayList;
        this.c = hashMap;
        this.e = callback;
    }

    public /* synthetic */ k0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ k0(f30 f30Var, String str, int i10, ArrayList arrayList) {
        this.a = 18;
        this.c = f30Var;
        this.e = str;
        this.b = i10;
        this.d = arrayList;
    }

    public /* synthetic */ k0(wx0 wx0Var, int i10, String str, ArrayList arrayList) {
        this.a = 27;
        this.c = wx0Var;
        this.b = i10;
        this.e = str;
        this.d = arrayList;
    }
}
