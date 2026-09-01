package dg;

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
import eg.j3;
import eg.o3;
import eg.s2;
import eg.w2;
import hg.m2;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import mh.g5;
import n7.qa;
import oh.l6;
import oh.t6;
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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.e9;
import org.telegram.ui.jk;
import org.telegram.ui.l4;
import org.telegram.ui.ng;
import org.telegram.ui.qn;
import org.telegram.ui.sn;
import org.telegram.ui.tv;
import org.telegram.ui.uq0;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u1(int i10, Context context, g6 g6Var, TL_stars.SavedStarGift savedStarGift) {
        this.a = 4;
        this.b = i10;
        this.c = context;
        this.d = g6Var;
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
        jk jkVar;
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
                y1 y1Var = (y1) obj3;
                r1 r1Var = (r1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = y1Var.c;
                boolean z4 = r1Var != null;
                y1Var.d = z4;
                if (!z4 || i16 < 0 || i16 >= arrayList2.size()) {
                    y1Var.i = arrayList;
                } else {
                    y1Var.a++;
                    ((x1) arrayList2.get(i16)).c++;
                    y1Var.g.edit().putInt(l.d.j(i16, "score"), ((x1) arrayList2.get(i16)).c).putInt("scoreall", y1Var.a).apply();
                    y1Var.i = null;
                }
                y1Var.e.run(r1Var);
                return;
            case 1:
                e3.g gVar = (e3.g) obj3;
                y2.i iVar = (y2.i) obj2;
                Runnable runnable2 = (Runnable) obj;
                g3.c cVar = (g3.c) gVar.f;
                try {
                    try {
                        f3.d dVar = (f3.d) gVar.c;
                        Objects.requireNonNull(dVar);
                        ((f3.h) cVar).f(new a1.c(dVar, 14));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) gVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((f3.h) cVar).f(new e3.d(gVar, iVar, i16, 0));
                        } else {
                            gVar.e(iVar, i16);
                        }
                    } catch (Throwable th2) {
                        runnable2.run();
                        throw th2;
                    }
                } catch (g3.a unused) {
                    ((androidx.biometric.e) gVar.d).A(iVar, i16 + 1, false);
                }
                runnable2.run();
                return;
            case 2:
                o3 o3Var = (o3) obj3;
                o3Var.m((Bitmap) obj2, this.b, o3Var.Q, o3Var.R, (uq0) obj);
                return;
            case 3:
                fg.v0.R((fg.v0) obj3, (ArrayList) obj, i16, (TLRPC.TL_messages_inactiveChats) obj2);
                return;
            case 4:
                int i17 = this.b;
                g5 g5Var = new g5((Context) obj3, i17, UserConfig.getInstance(i17).getClientUserId(), (g6) obj2, null);
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
                yh.v("}", sb);
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
                e5 e5Var = (e5) obj2;
                Runnable runnable3 = (Runnable) obj;
                qa qaVar = actionBarLayout.a0;
                boolean z12 = false;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (i23 == 0) {
                        p2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.U) && actionBarLayout.L0.size() > 1) {
                            p2Var = (p2) yh.j(2, actionBarLayout.L0);
                        }
                    }
                    if (p2Var != null) {
                        if (e5Var.m != null) {
                            if (actionBarLayout.b0 == null) {
                                h5 h5Var = new h5(0, true, false, qaVar);
                                actionBarLayout.b0 = h5Var;
                                h5Var.J = true;
                                h5 h5Var2 = new h5(1, true, false, qaVar);
                                actionBarLayout.c0 = h5Var2;
                                h5Var2.J = true;
                            }
                            g6 g6Var = e5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) qaVar.b;
                            sparseIntArray.clear();
                            for (int i24 : (int[]) qaVar.c) {
                                sparseIntArray.put(i24, g6Var.Z0(i24));
                            }
                        }
                        ArrayList<m6> themeDescriptions = p2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = p2Var.visibleDialog;
                        if (dialog instanceof h3) {
                            actionBarLayout.d(((h3) dialog).getThemeDescriptions());
                        }
                        if (i23 == 0 && (runnable = e5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = p2Var.visibleDialog;
                        if (dialog2 instanceof h3) {
                            actionBarLayout.b(((h3) dialog2).getThemeDescriptions());
                        }
                        z12 = true;
                    }
                }
                if (z12) {
                    if (!e5Var.e) {
                        int size = actionBarLayout.L0.size() - ((actionBarLayout.h || actionBarLayout.U) ? 2 : 1);
                        for (int i25 = 0; i25 < size; i25++) {
                            p2 p2Var2 = (p2) actionBarLayout.L0.get(i25);
                            p2Var2.clearViews();
                            p2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (e5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.e0.clear();
                        actionBarLayout.V.clear();
                        actionBarLayout.W.clear();
                        actionBarLayout.g0.clear();
                        actionBarLayout.f0 = null;
                        actionBarLayout.d0 = null;
                        qn qnVar = e5Var.j;
                        if (qnVar != null) {
                            qnVar.run();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    int i26 = k6.a;
                    k6.sl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    qn qnVar2 = e5Var.i;
                    if (qnVar2 != null) {
                        qnVar2.run();
                    }
                    sn snVar = e5Var.k;
                    actionBarLayout.d0 = snVar;
                    if (snVar != null) {
                        vn vnVar = snVar.a;
                        vnVar.S.u0.invalidate();
                        vnVar.F.I = 0.0f;
                        vnVar.G.I = 0.0f;
                        vnVar.k(0.0f);
                    }
                    actionBarLayout.i0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.h0 = animatorSet;
                    animatorSet.addListener(new w2(8, actionBarLayout, e5Var));
                    actionBarLayout.h0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.h0.setDuration(e5Var.l);
                    actionBarLayout.h0.start();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.e1) obj3).a(0, false);
                z4.f0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 9:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                String str2 = (String) obj2;
                if (i16 == l4Var.T0) {
                    l4Var.d0(true);
                    l4Var.B = arrayList6;
                    l4Var.C = str2;
                    l4Var.r0[0].c.y.clear();
                    l4Var.r0[0].b.f1();
                    l4Var.W(0);
                    return;
                }
                return;
            case 10:
                e9 e9Var = (e9) obj3;
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
                org.telegram.ui.Components.voip.g2.n(user, false, userFull != null && userFull.video_calls_available, e9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                return;
            case 11:
                xn xnVar = (xn) obj3;
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.Q5), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i16), Boolean.valueOf(xnVar.P4));
                xnVar.x3 = null;
                return;
            case 12:
                xn xnVar2 = (xn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                xn xnVar3 = (xn) obj;
                if (zArr[0] || i16 != xnVar2.fc || !xnVar2.C3 || xnVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new ng(xnVar2, 20), 200L);
                xnVar2.presentFragment(xnVar3);
                if (!xnVar2.x9() || xnVar3.hideKeyboardOnShow() || (jkVar = xnVar3.V) == null || jkVar.getEditField() == null) {
                    return;
                }
                xnVar3.V.getEditField().requestFocus();
                return;
            case 13:
                xn xnVar4 = (xn) obj3;
                xnVar4.getClass();
                xnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                return;
            case 14:
                oj ojVar = (oj) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj2;
                sj sjVar = ojVar.n;
                mh.d1 d1Var = sjVar.s;
                if (i16 != ojVar.h) {
                    return;
                }
                if (i16 != -1) {
                    f2.p0 adapter = d1Var.getAdapter();
                    oj ojVar2 = sjVar.C;
                    if (adapter != ojVar2) {
                        d1Var.setAdapter(ojVar2);
                    }
                }
                ojVar.d = arrayList7;
                ojVar.e = arrayList8;
                ojVar.l();
                return;
            case 15:
                pm pmVar = (pm) obj3;
                om omVar = (om) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                qm qmVar = pmVar.M;
                ValueAnimator valueAnimator = qmVar.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qmVar.G = null;
                pmVar.D = 0.0f;
                pmVar.f(omVar, photoEntry, i16);
                pmVar.j();
                pmVar.i(qmVar.M, false);
                return;
            case 16:
                z4.G(((q70) obj3).e, (g6) obj2, new m2(i16, (io) obj, i14));
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
                u30 u30Var = (u30) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                u30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gy(u30Var, i16, new ArrayList(), i15));
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
                    i11 = ((h3) u30Var.w).currentAccount;
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
                AndroidUtilities.runOnUIThread(new gy(u30Var, i16, arrayList11, 2));
                return;
            case 19:
                i40 i40Var = (i40) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                int i31 = i40Var.K;
                ArrayList arrayList12 = i40Var.L;
                if (i16 != i40Var.Q) {
                    return;
                }
                boolean isEmpty = arrayList12.isEmpty();
                i40Var.P = false;
                if (tLObject4 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        i40Var.T = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                    } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        i40Var.T = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    i40Var.W = messages_messages.next_rate;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        MessageObject messageObject = new MessageObject(i31, messages_messages.messages.get(i32), false, true);
                        messageObject.setQuery(str4);
                        arrayList12.add(messageObject);
                    }
                    i40Var.S = arrayList12.size() >= i40Var.T;
                    i40Var.W();
                } else {
                    i40Var.S = true;
                    i40Var.T = arrayList12.size();
                }
                i40Var.N(true);
                if (isEmpty) {
                    ((vn0) i40Var).Z.q0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                pn0.c(((pn0) obj3).getContext(), i16, ((mn0) obj2).a.g(), (g6) obj);
                return;
            case 21:
                rq0 rq0Var = (rq0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                HashMap hashMap = rq0Var.v;
                if (i16 != rq0Var.y) {
                    return;
                }
                rq0Var.x = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    MessagesController.getInstance(rq0Var.c).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(rq0Var.c).putChats(webpagepreview.chats, false);
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
                            rq0Var.w = webPage;
                            rq0.a(rq0Var.a[0], webPage, str5);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            rq0Var.w = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            rq0Var.w = null;
                            if (rq0Var.b != 0) {
                                rq0Var.b = 0;
                                qq0 qq0Var = rq0Var.E;
                                if (qq0Var != null) {
                                    ((tv) qq0Var).g(0);
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
                ((zu0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                return;
            case 23:
                zu0.g((zu0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 24:
                z4.f0(i16, (TLRPC.TL_error) obj2, ((zu0) obj3).s1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 25:
                ut0 ut0Var = (ut0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                String str6 = (String) obj2;
                zu0 zu0Var = ut0Var.v;
                if (ut0Var.h != 0) {
                    if (i16 == ut0Var.n) {
                        int h = ut0Var.h();
                        ut0Var.f = arrayList13;
                        ut0Var.s--;
                        int h9 = ut0Var.h();
                        if (ut0Var.s == 0 || h9 != 0) {
                            zu0Var.m1(false);
                        }
                        int i33 = 0;
                        while (true) {
                            rt0[] rt0VarArr = zu0Var.h0;
                            if (i33 < rt0VarArr.length) {
                                rt0 rt0Var = rt0VarArr[i33];
                                if (rt0Var.C == ut0Var.r) {
                                    if (ut0Var.s == 0 && h9 == 0) {
                                        rt0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str6));
                                        rt0VarArr[i33].w.f.setVisibility(8);
                                        rt0VarArr[i33].w.e(false, true);
                                    } else if (h == 0) {
                                        zu0Var.z(rt0Var.h, 0, null);
                                    }
                                }
                                i33++;
                            } else {
                                ut0Var.l();
                            }
                        }
                    }
                    ut0Var.h = 0;
                    return;
                }
                return;
            case 26:
                ry0 ry0Var = (ry0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str7 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList14 = new ArrayList();
                int i34 = ry0Var.a;
                MediaDataController.getInstance(i34).getEmojiSuggestions(strArr2, str7, true, new j3(ry0Var, this.b, str7, hashSet, arrayList14, 4), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i34).isPremium());
                return;
            case 27:
                ry0 ry0Var2 = (ry0) obj3;
                String str8 = (String) obj2;
                ArrayList arrayList15 = (ArrayList) obj;
                if (i16 == ry0Var2.F) {
                    ry0Var2.E = str8;
                    ry0Var2.D = 2;
                    arrayList15.remove(arrayList15.size() - 1);
                    if (arrayList15.isEmpty()) {
                        ry0Var2.x = true;
                        ry0Var2.f();
                        return;
                    }
                    ry0Var2.x = false;
                    ry0Var2.v = false;
                    ry0Var2.c();
                    s2 s2Var = ry0Var2.d;
                    if (s2Var != null) {
                        s2Var.setVisibility(0);
                        ry0Var2.d.invalidate();
                    }
                    ry0Var2.w = arrayList15;
                    oy0 oy0Var = ry0Var2.f;
                    if (oy0Var != null) {
                        oy0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                p11 p11Var = (p11) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = (ArrayList) obj2;
                ThemeEditorView.EditorAlert editorAlert = p11Var.r;
                h11 h11Var = editorAlert.c;
                if (i16 != p11Var.d) {
                    return;
                }
                p11 p11Var2 = editorAlert.r;
                if (h11Var.getAdapter() != p11Var2) {
                    editorAlert.C = ThemeEditorView.EditorAlert.I(editorAlert);
                    h11Var.setAdapter(p11Var2);
                    p11Var2.l();
                }
                boolean z13 = !p11Var.e.isEmpty() && arrayList16.isEmpty();
                boolean z14 = p11Var.e.isEmpty() && arrayList16.isEmpty();
                if (z13) {
                    editorAlert.C = ThemeEditorView.EditorAlert.I(editorAlert);
                }
                p11Var.e = arrayList16;
                p11Var.f = arrayList17;
                p11Var.l();
                if (!z14 && !z13 && (i12 = editorAlert.C) > 0) {
                    editorAlert.h.h1(0, -i12);
                    editorAlert.C = -1000;
                }
                editorAlert.e.c();
                return;
            default:
                x11 x11Var = (x11) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((lp) obj2).b;
                if (drawable instanceof fc0) {
                    fc0 fc0Var = (fc0) drawable;
                    fc0Var.t(x11.e(bitmap), i16);
                    fc0Var.u(x11Var.I);
                    x11Var.invalidate();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ u1(fg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.a = 3;
        this.c = v0Var;
        this.e = arrayList;
        this.b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public /* synthetic */ u1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ u1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.e = arrayList;
        this.d = serializable;
    }

    public /* synthetic */ u1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ u1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.e = arrayList;
        this.d = obj2;
        this.b = i10;
    }
}
