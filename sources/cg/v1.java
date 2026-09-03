package cg;

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
import android.view.ViewGroup;
import dg.l3;
import dg.q3;
import dg.u2;
import dg.y2;
import gg.m2;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import lh.g5;
import n7.qa;
import nh.l6;
import nh.t6;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pq0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ai;
import org.telegram.ui.g9;
import org.telegram.ui.lk;
import org.telegram.ui.n4;
import org.telegram.ui.pg;
import org.telegram.ui.sn;
import org.telegram.ui.un;
import org.telegram.ui.uv;
import org.telegram.ui.xn;
import org.telegram.ui.zn;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1(int i10, Context context, f6 f6Var, TL_stars.SavedStarGift savedStarGift) {
        this.a = 4;
        this.b = i10;
        this.c = context;
        this.d = f6Var;
        this.e = savedStarGift;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        p2 p2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        lk lkVar;
        d10 d10Var;
        long peerId;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 7;
        int i15 = 2;
        String str = null;
        int i16 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
                z1 z1Var = (z1) obj3;
                s1 s1Var = (s1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = z1Var.c;
                boolean z4 = s1Var != null;
                z1Var.d = z4;
                if (!z4 || i16 < 0 || i16 >= arrayList2.size()) {
                    z1Var.i = arrayList;
                } else {
                    z1Var.a++;
                    ((y1) arrayList2.get(i16)).c++;
                    z1Var.g.edit().putInt(kf.k0.j(i16, "score"), ((y1) arrayList2.get(i16)).c).putInt("scoreall", z1Var.a).apply();
                    z1Var.i = null;
                }
                z1Var.e.run(s1Var);
                return;
            case 1:
                q3 q3Var = (q3) obj3;
                q3Var.m((Bitmap) obj2, this.b, q3Var.Q, q3Var.R, (zq0) obj);
                return;
            case 2:
                e3.g gVar = (e3.g) obj3;
                y2.i iVar = (y2.i) obj2;
                Runnable runnable2 = (Runnable) obj;
                g3.c cVar = (g3.c) gVar.f;
                try {
                    try {
                        f3.d dVar = (f3.d) gVar.c;
                        Objects.requireNonNull(dVar);
                        ((f3.h) cVar).f(new a1.c(dVar, 23));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) gVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((f3.h) cVar).f(new e3.d(gVar, iVar, i16, 0));
                        } else {
                            gVar.e(iVar, i16);
                        }
                    } catch (g3.a unused) {
                        ((af.d) gVar.d).A(iVar, i16 + 1, false);
                    }
                    runnable2.run();
                    return;
                } catch (Throwable th2) {
                    runnable2.run();
                    throw th2;
                }
            case 3:
                eg.v0.R((eg.v0) obj3, (ArrayList) obj, i16, (TLRPC.TL_messages_inactiveChats) obj2);
                return;
            case 4:
                int i17 = this.b;
                g5 g5Var = new g5((Context) obj3, i17, UserConfig.getInstance(i17).getClientUserId(), (f6) obj2, null);
                g5Var.j2((TL_stars.SavedStarGift) obj, null);
                g5Var.show();
                return;
            case 5:
                l6 l6Var = (l6) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj2;
                AbstractSet abstractSet = l6Var.k;
                int i18 = l6Var.f;
                AbstractSet abstractSet2 = l6Var.l;
                l6Var.A = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i19 = l6Var.e;
                sb.append(i19);
                sb.append("{");
                long j10 = l6Var.d;
                sb.append(j10);
                sb.append("} loaded {");
                sb.append(t6.a(arrayList3));
                ai.v("}", sb);
                ArrayList arrayList4 = l6Var.g;
                arrayList4.clear();
                arrayList4.addAll(tL_stories_stories.pinned_to_top);
                int i20 = l6Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i20).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i20).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i20).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                l6Var.u = false;
                l6Var.s = tL_stories_stories.count;
                int i21 = 0;
                while (i21 < arrayList3.size()) {
                    l6Var.t((MessageObject) arrayList3.get(i21), z10);
                    i21++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= l6Var.s;
                l6Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            l6Var.u(intValue, false);
                        }
                    }
                } else if (i18 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(abstractSet2);
                            for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                Integer num2 = (Integer) arrayList5.get(i22);
                                int intValue2 = num2.intValue();
                                if (!arrayList4.contains(num2)) {
                                    i10 = intValue2;
                                    i16 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i16 = i10;
                    }
                    int n10 = l6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
                            it2.remove();
                            l6Var.u(intValue3, false);
                        }
                    }
                }
                l6Var.d(true);
                if (l6Var.r) {
                    if (l6.B == null) {
                        l6.B = new HashMap();
                    }
                    l6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i20), Integer.valueOf(i19), Long.valueOf(j10), Integer.valueOf(i18))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    l6Var.w();
                }
                l6Var.x();
                return;
            case 6:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                d5 d5Var = (d5) obj2;
                Runnable runnable3 = (Runnable) obj;
                qa qaVar = actionBarLayout.a0;
                boolean z12 = false;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (i23 == 0) {
                        p2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.U) && actionBarLayout.L0.size() > 1) {
                            p2Var = (p2) ai.j(2, actionBarLayout.L0);
                        }
                    }
                    if (p2Var != null) {
                        if (d5Var.m != null) {
                            if (actionBarLayout.b0 == null) {
                                org.telegram.ui.ActionBar.g5 g5Var2 = new org.telegram.ui.ActionBar.g5(0, true, false, qaVar);
                                actionBarLayout.b0 = g5Var2;
                                g5Var2.J = true;
                                org.telegram.ui.ActionBar.g5 g5Var3 = new org.telegram.ui.ActionBar.g5(1, true, false, qaVar);
                                actionBarLayout.c0 = g5Var3;
                                g5Var3.J = true;
                            }
                            f6 f6Var = d5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) qaVar.b;
                            sparseIntArray.clear();
                            for (int i24 : (int[]) qaVar.c) {
                                sparseIntArray.put(i24, f6Var.f1(i24));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = p2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = p2Var.visibleDialog;
                        if (dialog instanceof g3) {
                            actionBarLayout.d(((g3) dialog).getThemeDescriptions());
                        }
                        if (i23 == 0 && (runnable = d5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = p2Var.visibleDialog;
                        if (dialog2 instanceof g3) {
                            actionBarLayout.b(((g3) dialog2).getThemeDescriptions());
                        }
                        z12 = true;
                    }
                }
                if (z12) {
                    if (!d5Var.e) {
                        int size = actionBarLayout.L0.size() - ((actionBarLayout.h || actionBarLayout.U) ? 2 : 1);
                        for (int i25 = 0; i25 < size; i25++) {
                            p2 p2Var2 = (p2) actionBarLayout.L0.get(i25);
                            p2Var2.clearViews();
                            p2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (d5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.e0.clear();
                        actionBarLayout.V.clear();
                        actionBarLayout.W.clear();
                        actionBarLayout.g0.clear();
                        actionBarLayout.f0 = null;
                        actionBarLayout.d0 = null;
                        sn snVar = d5Var.j;
                        if (snVar != null) {
                            snVar.run();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    int i26 = j6.a;
                    j6.sl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    sn snVar2 = d5Var.i;
                    if (snVar2 != null) {
                        snVar2.run();
                    }
                    un unVar = d5Var.k;
                    actionBarLayout.d0 = unVar;
                    if (unVar != null) {
                        xn xnVar = unVar.a;
                        xnVar.S.u0.invalidate();
                        xnVar.F.I = 0.0f;
                        xnVar.G.I = 0.0f;
                        xnVar.k(0.0f);
                    }
                    actionBarLayout.i0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.h0 = animatorSet;
                    animatorSet.addListener(new y2(8, actionBarLayout, d5Var));
                    actionBarLayout.h0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.h0.setDuration(d5Var.l);
                    actionBarLayout.h0.start();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.g1) obj3).a(0, false);
                z4.f0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 9:
                n4 n4Var = (n4) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                String str2 = (String) obj2;
                if (i16 == n4Var.T0) {
                    n4Var.d0(true);
                    n4Var.B = arrayList6;
                    n4Var.C = str2;
                    n4Var.r0[0].c.y.clear();
                    n4Var.r0[0].b.e1();
                    n4Var.W(0);
                    return;
                }
                return;
            case 10:
                g9 g9Var = (g9) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    MessagesController.getInstance(i16).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i16).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user, false, userFull != null && userFull.video_calls_available, g9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                return;
            case 11:
                zn znVar = (zn) obj3;
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.Q5), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i16), Boolean.valueOf(znVar.P4));
                znVar.x3 = null;
                return;
            case 12:
                zn znVar2 = (zn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                zn znVar3 = (zn) obj;
                if (zArr[0] || i16 != znVar2.fc || !znVar2.C3 || znVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new pg(znVar2, 20), 200L);
                znVar2.presentFragment(znVar3);
                if (!znVar2.x9() || znVar3.hideKeyboardOnShow() || (lkVar = znVar3.V) == null || lkVar.getEditField() == null) {
                    return;
                }
                znVar3.V.getEditField().requestFocus();
                return;
            case 13:
                zn znVar4 = (zn) obj3;
                znVar4.getClass();
                znVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                return;
            case 14:
                mj mjVar = (mj) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj2;
                qj qjVar = mjVar.n;
                lh.e1 e1Var = qjVar.s;
                if (i16 != mjVar.h) {
                    return;
                }
                if (i16 != -1) {
                    f2.o0 adapter = e1Var.getAdapter();
                    mj mjVar2 = qjVar.C;
                    if (adapter != mjVar2) {
                        e1Var.setAdapter(mjVar2);
                    }
                }
                mjVar.d = arrayList7;
                mjVar.e = arrayList8;
                mjVar.l();
                return;
            case 15:
                mm mmVar = (mm) obj3;
                lm lmVar = (lm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                nm nmVar = mmVar.M;
                ValueAnimator valueAnimator = nmVar.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nmVar.G = null;
                mmVar.D = 0.0f;
                mmVar.f(lmVar, photoEntry, i16);
                mmVar.j();
                mmVar.i(nmVar.M, false);
                return;
            case 16:
                z4.G(((p70) obj3).e, (f6) obj2, new m2(i16, (fo) obj, i14));
                return;
            case 17:
                p2 p2Var3 = (p2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (p2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList9 = new ArrayList();
                    for (int i27 = 0; i27 < vector.objects.size(); i27++) {
                        try {
                            arrayList9.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i27))));
                        } catch (Exception unused2) {
                        }
                    }
                    d10Var = new d10(p2Var3, i16, arrayList9);
                } else {
                    d10Var = new d10(p2Var3, i16, null);
                }
                d10Var.y0 = callback;
                p2Var3.showDialog(d10Var);
                return;
            case 18:
                t30 t30Var = (t30) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                t30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ey(t30Var, i16, new ArrayList(), i15));
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
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i29 = 0;
                while (i29 < size2) {
                    TLObject tLObject3 = (TLObject) arrayList10.get(i29);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                        peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                    } else {
                        i29++;
                        str = null;
                    }
                    i11 = ((g3) t30Var.w).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user2)) {
                        String lowerCase2 = UserObject.getUserName(user2).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str;
                        }
                        int i30 = 0;
                        char c3 = 0;
                        while (true) {
                            if (i30 < i28) {
                                String str3 = strArr[i30];
                                if (lowerCase2.startsWith(str3) || y3.w(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || y3.w(" ", str3, translitString2)))) {
                                    c3 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user2);
                                    if (publicUsername != null && publicUsername.startsWith(str3)) {
                                        c3 = 2;
                                    }
                                }
                                if (c3 != 0) {
                                    arrayList11.add(tLObject3);
                                } else {
                                    i30++;
                                }
                            }
                        }
                    }
                    i29++;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new ey(t30Var, i16, arrayList11, 2));
                return;
            case 19:
                h40 h40Var = (h40) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                int i31 = h40Var.K;
                ArrayList arrayList12 = h40Var.L;
                if (i16 != h40Var.Q) {
                    return;
                }
                boolean isEmpty = arrayList12.isEmpty();
                h40Var.P = false;
                if (tLObject4 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        h40Var.T = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                    } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        h40Var.T = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    h40Var.W = messages_messages.next_rate;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        MessageObject messageObject = new MessageObject(i31, messages_messages.messages.get(i32), false, true);
                        messageObject.setQuery(str4);
                        arrayList12.add(messageObject);
                    }
                    h40Var.S = arrayList12.size() >= h40Var.T;
                    h40Var.W();
                } else {
                    h40Var.S = true;
                    h40Var.T = arrayList12.size();
                }
                h40Var.N(true);
                if (isEmpty) {
                    ((tn0) h40Var).Z.q0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                nn0.c(((nn0) obj3).getContext(), i16, ((kn0) obj2).a.g(), (f6) obj);
                return;
            case 21:
                qq0 qq0Var = (qq0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                HashMap hashMap = qq0Var.v;
                if (i16 != qq0Var.y) {
                    return;
                }
                qq0Var.x = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    MessagesController.getInstance(qq0Var.c).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(qq0Var.c).putChats(webpagepreview.chats, false);
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
                            qq0Var.w = webPage;
                            qq0.a(qq0Var.a[0], webPage, str5);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            qq0Var.w = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            qq0Var.w = null;
                            if (qq0Var.b != 0) {
                                qq0Var.b = 0;
                                pq0 pq0Var = qq0Var.E;
                                if (pq0Var != null) {
                                    ((uv) pq0Var).g(0);
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
                ((yu0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                return;
            case 23:
                yu0.g((yu0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 24:
                z4.f0(i16, (TLRPC.TL_error) obj2, ((yu0) obj3).s1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 25:
                tt0 tt0Var = (tt0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                String str6 = (String) obj2;
                yu0 yu0Var = tt0Var.v;
                if (tt0Var.h != 0) {
                    if (i16 == tt0Var.n) {
                        int h = tt0Var.h();
                        tt0Var.f = arrayList13;
                        tt0Var.s--;
                        int h9 = tt0Var.h();
                        if (tt0Var.s == 0 || h9 != 0) {
                            yu0Var.m1(false);
                        }
                        int i33 = 0;
                        while (true) {
                            qt0[] qt0VarArr = yu0Var.h0;
                            if (i33 < qt0VarArr.length) {
                                qt0 qt0Var = qt0VarArr[i33];
                                if (qt0Var.C == tt0Var.r) {
                                    if (tt0Var.s == 0 && h9 == 0) {
                                        qt0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str6));
                                        qt0VarArr[i33].w.f.setVisibility(8);
                                        qt0VarArr[i33].w.e(false, true);
                                    } else if (h == 0) {
                                        yu0Var.z(qt0Var.h, 0, null);
                                    }
                                }
                                i33++;
                            } else {
                                tt0Var.l();
                            }
                        }
                    }
                    tt0Var.h = 0;
                    return;
                }
                return;
            case 26:
                qy0 qy0Var = (qy0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str7 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList14 = new ArrayList();
                int i34 = qy0Var.a;
                MediaDataController.getInstance(i34).getEmojiSuggestions(strArr2, str7, true, new l3(qy0Var, this.b, str7, hashSet, arrayList14, 4), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i34).isPremium());
                return;
            case 27:
                qy0 qy0Var2 = (qy0) obj3;
                String str8 = (String) obj2;
                ArrayList arrayList15 = (ArrayList) obj;
                if (i16 == qy0Var2.F) {
                    qy0Var2.E = str8;
                    qy0Var2.D = 2;
                    arrayList15.remove(arrayList15.size() - 1);
                    if (arrayList15.isEmpty()) {
                        qy0Var2.x = true;
                        qy0Var2.f();
                        return;
                    }
                    qy0Var2.x = false;
                    qy0Var2.v = false;
                    qy0Var2.c();
                    u2 u2Var = qy0Var2.d;
                    if (u2Var != null) {
                        u2Var.setVisibility(0);
                        qy0Var2.d.invalidate();
                    }
                    qy0Var2.w = arrayList15;
                    ny0 ny0Var = qy0Var2.f;
                    if (ny0Var != null) {
                        ny0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                o11 o11Var = (o11) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = (ArrayList) obj2;
                ThemeEditorView.EditorAlert editorAlert = o11Var.r;
                g11 g11Var = editorAlert.c;
                if (i16 != o11Var.d) {
                    return;
                }
                o11 o11Var2 = editorAlert.r;
                if (g11Var.getAdapter() != o11Var2) {
                    editorAlert.C = ThemeEditorView.EditorAlert.I(editorAlert);
                    g11Var.setAdapter(o11Var2);
                    o11Var2.l();
                }
                boolean z13 = !o11Var.e.isEmpty() && arrayList16.isEmpty();
                boolean z14 = o11Var.e.isEmpty() && arrayList16.isEmpty();
                if (z13) {
                    editorAlert.C = ThemeEditorView.EditorAlert.I(editorAlert);
                }
                o11Var.e = arrayList16;
                o11Var.f = arrayList17;
                o11Var.l();
                if (!z14 && !z13 && (i12 = editorAlert.C) > 0) {
                    editorAlert.h.h1(0, -i12);
                    editorAlert.C = -1000;
                }
                editorAlert.e.c();
                return;
            default:
                w11 w11Var = (w11) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((ip) obj2).b;
                if (drawable instanceof ec0) {
                    ec0 ec0Var = (ec0) drawable;
                    ec0Var.t(w11.e(bitmap), i16);
                    ec0Var.u(w11Var.I);
                    w11Var.invalidate();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ v1(eg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.a = 3;
        this.c = v0Var;
        this.e = arrayList;
        this.b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public /* synthetic */ v1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ v1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.e = arrayList;
        this.d = serializable;
    }

    public /* synthetic */ v1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ v1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.e = arrayList;
        this.d = obj2;
        this.b = i10;
    }
}
