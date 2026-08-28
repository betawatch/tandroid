package c3;

import a5.m;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bg.c2;
import bg.x2;
import f2.n;
import fg.j;
import fh.d2;
import fh.z2;
import gh.k5;
import ih.h3;
import ih.n6;
import ih.v6;
import j$.util.Objects;
import j3.r0;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kh.o8;
import mh.q4;
import of.f0;
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
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.ak;
import org.telegram.ui.b9;
import org.telegram.ui.f1;
import org.telegram.ui.jg;
import org.telegram.ui.jn;
import org.telegram.ui.jv;
import org.telegram.ui.l4;
import org.telegram.ui.ln;
import org.telegram.ui.on;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import org.telegram.ui.rl;
import org.telegram.ui.web.r;
import w2.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(int i9, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        o2 o2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        ak akVar;
        n00 n00Var;
        long peerId;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12 = this.a;
        int i13 = 6;
        int i14 = 5;
        String str = null;
        int i15 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i12) {
            case 0:
                h hVar = (h) obj3;
                i iVar = (i) obj2;
                Runnable runnable2 = (Runnable) obj;
                e3.c cVar = (e3.c) hVar.f;
                try {
                    try {
                        d3.d dVar = (d3.d) hVar.c;
                        Objects.requireNonNull(dVar);
                        ((d3.h) cVar).f(new a1.c(dVar, 10));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) hVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((d3.h) cVar).f(new e(hVar, iVar, i15, 0));
                        } else {
                            hVar.e(iVar, i15);
                        }
                    } catch (e3.a unused) {
                        ((m) hVar.d).A(iVar, i15 + 1, false);
                    }
                    runnable2.run();
                    return;
                } catch (Throwable th) {
                    runnable2.run();
                    throw th;
                }
            case 1:
                int i16 = this.b;
                k5 k5Var = new k5((Context) obj3, i16, UserConfig.getInstance(i16).getClientUserId(), (b6) obj2, null);
                k5Var.j2((TL_stars.SavedStarGift) obj, null);
                k5Var.show();
                return;
            case 2:
                n6 n6Var = (n6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = n6Var.k;
                int i17 = n6Var.f;
                AbstractSet abstractSet2 = n6Var.l;
                n6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = n6Var.e;
                sb2.append(i18);
                sb2.append("{");
                long j10 = n6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(v6.a(arrayList));
                r0.x("}", sb2);
                ArrayList arrayList2 = n6Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i19 = n6Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i19).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i19).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i19).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                n6Var.u = false;
                n6Var.s = tL_stories_stories.count;
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    n6Var.t((MessageObject) arrayList.get(i20), z10);
                    i20++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= n6Var.s;
                n6Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            n6Var.u(intValue, false);
                        }
                    }
                } else if (i17 <= 0) {
                    if (i15 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                                Integer num2 = (Integer) arrayList3.get(i21);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i9 = intValue2;
                                    i15 = i9;
                                }
                            }
                        }
                        i9 = -1;
                        i15 = i9;
                    }
                    int n10 = n6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i15 && intValue3 <= n10) {
                            it2.remove();
                            n6Var.u(intValue3, false);
                        }
                    }
                }
                n6Var.d(true);
                if (n6Var.r) {
                    if (n6.B == null) {
                        n6.B = new HashMap();
                    }
                    n6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i19), Integer.valueOf(i18), Long.valueOf(j10), Integer.valueOf(i17))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    n6Var.w();
                }
                n6Var.x();
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h3(MessagesStorage.getInstance(i15).getUsers((ArrayList) obj3), (HashMap) obj2, (Utilities.Callback) obj, 19));
                return;
            case 4:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                r rVar = (r) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    q4.b(i15, user, userFull2, rVar);
                    return;
                }
            case 5:
                f0 f0Var = (f0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                v3 v3Var = (v3) obj;
                ArrayList arrayList5 = f0Var.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - f0Var.j0 < 300) {
                    return;
                }
                f0Var.j0 = elapsedRealtime;
                int size = arrayList5.size();
                int size2 = arrayList4.size();
                int i22 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                int min = Math.min(3, size2) + size;
                int h = f0Var.h();
                boolean z12 = f0Var.C0;
                boolean z13 = h > ((z12 ? min : i22) + i15) + 1;
                n nVar = f0Var.e0;
                if (nVar != null) {
                    nVar.c = z13 ? 45L : 200L;
                    nVar.d = z13 ? 80L : 200L;
                    nVar.l = z13 ? 270L : 0L;
                }
                f0Var.C0 = !z12;
                v3Var.setRightTextMargin(16);
                String string = LocaleController.getString(f0Var.C0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = f0Var.C0;
                u3 u3Var = v3Var.b;
                u3Var.c(string, true, z14);
                u3Var.setVisibility(0);
                f0Var.k0 = null;
                View view = (View) v3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i23 = (!f0Var.C0 ? i15 + min : i22 + i15) + 1;
                    int i24 = 0;
                    while (true) {
                        if (i24 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i24);
                            if (RecyclerView.R(childAt) == i23) {
                                f0Var.k0 = childAt;
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                int i25 = i15 + min;
                int i26 = i25 + 1;
                int max = Math.max(0, size2 - 3);
                if (f0Var.C0) {
                    f0Var.t(i26, max);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new c2(f0Var, i25, 12), 350L);
                    } else {
                        f0Var.m(i25);
                    }
                } else {
                    f0Var.m(i25);
                    f0Var.s(i26, max);
                }
                o8 o8Var = f0Var.l0;
                if (o8Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o8Var);
                }
                if (!z13) {
                    f0Var.i0 = false;
                    return;
                }
                f0Var.i0 = true;
                o8 o8Var2 = new o8(15, f0Var, view);
                f0Var.l0 = o8Var2;
                AndroidUtilities.runOnUIThread(o8Var2, 400L);
                return;
            case 6:
                f0 f0Var2 = (f0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i27 = f0Var2.o0;
                if (i15 == f0Var2.Z && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    f0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    f0Var2.w = messages_messages.next_rate;
                    f0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i27).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i27).putChats(messages_messages.chats, false);
                    int i28 = 0;
                    while (i28 < messages_messages.messages.size()) {
                        f0Var2.x.add(new MessageObject(i27, messages_messages.messages.get(i28), z15, true));
                        i28++;
                        z15 = false;
                    }
                    ox oxVar = f0Var2.Q;
                    if (oxVar != null) {
                        oxVar.d(f0Var2.z0 > 0, true);
                    }
                    f0Var2.l();
                    return;
                }
                return;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i15, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                a5 a5Var = (a5) obj2;
                Runnable runnable3 = (Runnable) obj;
                g5.b bVar = actionBarLayout.W;
                boolean z16 = false;
                for (int i29 = 0; i29 < i15; i29++) {
                    if (i29 == 0) {
                        o2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.T) && actionBarLayout.K0.size() > 1) {
                            o2Var = (o2) r0.k(2, actionBarLayout.K0);
                        }
                    }
                    if (o2Var != null) {
                        if (a5Var.m != null) {
                            if (actionBarLayout.a0 == null) {
                                d5 d5Var = new d5(0, true, false, bVar);
                                actionBarLayout.a0 = d5Var;
                                d5Var.J = true;
                                d5 d5Var2 = new d5(1, true, false, bVar);
                                actionBarLayout.b0 = d5Var2;
                                d5Var2.J = true;
                            }
                            b6 b6Var = a5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) bVar.b;
                            sparseIntArray.clear();
                            for (int i30 : (int[]) bVar.c) {
                                sparseIntArray.put(i30, b6Var.q1(i30));
                            }
                        }
                        ArrayList<h6> themeDescriptions = o2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = o2Var.visibleDialog;
                        if (dialog instanceof f3) {
                            actionBarLayout.d(((f3) dialog).getThemeDescriptions());
                        }
                        if (i29 == 0 && (runnable = a5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = o2Var.visibleDialog;
                        if (dialog2 instanceof f3) {
                            actionBarLayout.b(((f3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                }
                if (z16) {
                    if (!a5Var.e) {
                        int size3 = actionBarLayout.K0.size() - ((actionBarLayout.h || actionBarLayout.T) ? 2 : 1);
                        for (int i31 = 0; i31 < size3; i31++) {
                            o2 o2Var2 = (o2) actionBarLayout.K0.get(i31);
                            o2Var2.clearViews();
                            o2Var2.setParentLayout(actionBarLayout);
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
                        jn jnVar = a5Var.j;
                        if (jnVar != null) {
                            jnVar.run();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    int i32 = f6.a;
                    f6.sl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    jn jnVar2 = a5Var.i;
                    if (jnVar2 != null) {
                        jnVar2.run();
                    }
                    ln lnVar = a5Var.k;
                    actionBarLayout.c0 = lnVar;
                    if (lnVar != null) {
                        on onVar = lnVar.a;
                        onVar.R.t0.invalidate();
                        onVar.E.I = 0.0f;
                        onVar.F.I = 0.0f;
                        onVar.k(0.0f);
                    }
                    actionBarLayout.h0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.g0 = animatorSet;
                    animatorSet.addListener(new j(9, actionBarLayout, a5Var));
                    actionBarLayout.g0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.g0.setDuration(a5Var.l);
                    actionBarLayout.g0.start();
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 9:
                ((f1) obj3).a(0, false);
                y4.f0(i15, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 10:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                String str3 = (String) obj;
                if (i15 == l4Var.S0) {
                    l4Var.d0(true);
                    l4Var.A = arrayList6;
                    l4Var.B = str3;
                    l4Var.q0[0].c.y.clear();
                    l4Var.q0[0].b.f1();
                    l4Var.W(0);
                    return;
                }
                return;
            case 11:
                b9 b9Var = (b9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i15).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                e2.n(user2, false, userFull != null && userFull.video_calls_available, b9Var.getParentActivity(), userFull, AccountInstance.getInstance(i15));
                return;
            case 12:
                qn qnVar = (qn) obj3;
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.P5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i15), Boolean.valueOf(qnVar.O4));
                qnVar.w3 = null;
                return;
            case 13:
                qn qnVar2 = (qn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                qn qnVar3 = (qn) obj;
                if (zArr[0] || i15 != qnVar2.ec || !qnVar2.B3 || qnVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new jg(qnVar2, 20), 200L);
                qnVar2.presentFragment(qnVar3);
                if (!qnVar2.x9() || qnVar3.hideKeyboardOnShow() || (akVar = qnVar3.U) == null || akVar.getEditField() == null) {
                    return;
                }
                qnVar3.U.getEditField().requestFocus();
                return;
            case 14:
                qn qnVar4 = (qn) obj3;
                qnVar4.getClass();
                qnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i15);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                lj ljVar = (lj) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                pj pjVar = ljVar.n;
                gh.f1 f1Var = pjVar.s;
                if (i15 != ljVar.h) {
                    return;
                }
                if (i15 != -1) {
                    f2.r0 adapter = f1Var.getAdapter();
                    lj ljVar2 = pjVar.B;
                    if (adapter != ljVar2) {
                        f1Var.setAdapter(ljVar2);
                    }
                }
                ljVar.d = arrayList7;
                ljVar.e = arrayList8;
                ljVar.l();
                return;
            case 16:
                gm gmVar = (gm) obj3;
                fm fmVar = (fm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                hm hmVar = gmVar.L;
                ValueAnimator valueAnimator = hmVar.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                hmVar.F = null;
                gmVar.C = 0.0f;
                gmVar.f(fmVar, photoEntry, i15);
                gmVar.j();
                gmVar.i(hmVar.L, false);
                return;
            case 17:
                y4.G(((x60) obj3).e, (b6) obj2, new x2(i15, (zn) obj, i13));
                return;
            case 18:
                o2 o2Var3 = (o2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (o2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList9 = new ArrayList();
                    for (int i33 = 0; i33 < vector.objects.size(); i33++) {
                        try {
                            arrayList9.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i33))));
                        } catch (Exception unused2) {
                        }
                    }
                    n00Var = new n00(o2Var3, i15, arrayList9);
                } else {
                    n00Var = new n00(o2Var3, i15, null);
                }
                n00Var.x0 = callback;
                o2Var3.showDialog(n00Var);
                return;
            case 19:
                a30 a30Var = (a30) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                a30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new rl(a30Var, i15, new ArrayList(), i14));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i34 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i34];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList11 = new ArrayList();
                int size4 = arrayList10.size();
                int i35 = 0;
                while (i35 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList10.get(i35);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        i35++;
                        str = null;
                    }
                    i10 = ((f3) a30Var.w).currentAccount;
                    TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user3)) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str;
                        }
                        int i36 = 0;
                        char c10 = 0;
                        while (true) {
                            if (i36 < i34) {
                                String str4 = strArr[i36];
                                if (lowerCase2.startsWith(str4) || l0.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || l0.w(" ", str4, translitString2)))) {
                                    c10 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 != 0) {
                                    arrayList11.add(tLObject4);
                                } else {
                                    i36++;
                                }
                            }
                        }
                        i35++;
                        str = null;
                    }
                    i35++;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new rl(a30Var, i15, arrayList11, 5));
                return;
            case 20:
                o30 o30Var = (o30) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                int i37 = o30Var.J;
                ArrayList arrayList12 = o30Var.K;
                if (i15 != o30Var.P) {
                    return;
                }
                boolean isEmpty = arrayList12.isEmpty();
                o30Var.O = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        o30Var.S = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        o30Var.S = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    o30Var.V = messages_messages2.next_rate;
                    MessagesController.getInstance(i37).putUsers(messages_messages2.users, false);
                    MessagesController.getInstance(i37).putChats(messages_messages2.chats, false);
                    for (int i38 = 0; i38 < messages_messages2.messages.size(); i38++) {
                        MessageObject messageObject = new MessageObject(i37, messages_messages2.messages.get(i38), false, true);
                        messageObject.setQuery(str5);
                        arrayList12.add(messageObject);
                    }
                    o30Var.R = arrayList12.size() >= o30Var.S;
                    o30Var.W();
                } else {
                    o30Var.R = true;
                    o30Var.S = arrayList12.size();
                }
                o30Var.N(true);
                if (isEmpty) {
                    ((ym0) o30Var).Y.p0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                sm0.c(((sm0) obj3).getContext(), i15, ((pm0) obj2).a.g(), (b6) obj);
                return;
            case 22:
                wp0 wp0Var = (wp0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str6 = (String) obj;
                HashMap hashMap = wp0Var.v;
                if (i15 != wp0Var.y) {
                    return;
                }
                wp0Var.x = 0;
                if (tLObject6 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                    MessagesController.getInstance(wp0Var.c).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(wp0Var.c).putChats(webpagepreview.chats, false);
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
                            hashMap.put(str6, webPage);
                            wp0Var.w = webPage;
                            wp0.a(wp0Var.a[0], webPage, str6);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            wp0Var.w = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            wp0Var.w = null;
                            if (wp0Var.b != 0) {
                                wp0Var.b = 0;
                                vp0 vp0Var = wp0Var.D;
                                if (vp0Var != null) {
                                    ((jv) vp0Var).h(0);
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
            case 23:
                ((eu0) obj3).H0((MessageObject) obj2, (View) obj, i15, false);
                return;
            case 24:
                eu0.g((eu0) obj3, i15, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 25:
                y4.f0(i15, (TLRPC.TL_error) obj2, ((eu0) obj3).r1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 26:
                at0 at0Var = (at0) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                String str7 = (String) obj;
                eu0 eu0Var = at0Var.v;
                if (at0Var.h != 0) {
                    if (i15 == at0Var.n) {
                        int h10 = at0Var.h();
                        at0Var.f = arrayList13;
                        at0Var.s--;
                        int h11 = at0Var.h();
                        if (at0Var.s == 0 || h11 != 0) {
                            eu0Var.m1(false);
                        }
                        int i39 = 0;
                        while (true) {
                            xs0[] xs0VarArr = eu0Var.g0;
                            if (i39 < xs0VarArr.length) {
                                xs0 xs0Var = xs0VarArr[i39];
                                if (xs0Var.B == at0Var.r) {
                                    if (at0Var.s == 0 && h11 == 0) {
                                        xs0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str7));
                                        xs0VarArr[i39].w.f.setVisibility(8);
                                        xs0VarArr[i39].w.e(false, true);
                                    } else if (h10 == 0) {
                                        eu0Var.z(xs0Var.h, 0, null);
                                    }
                                }
                                i39++;
                            } else {
                                at0Var.l();
                            }
                        }
                    }
                    at0Var.h = 0;
                    return;
                }
                return;
            case 27:
                ux0 ux0Var = (ux0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str8 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList14 = new ArrayList();
                int i40 = ux0Var.a;
                MediaDataController.getInstance(i40).getEmojiSuggestions(strArr2, str8, true, new z2(ux0Var, this.b, str8, hashSet, arrayList14, 3), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i40).isPremium());
                return;
            case 28:
                ux0 ux0Var2 = (ux0) obj3;
                String str9 = (String) obj2;
                ArrayList arrayList15 = (ArrayList) obj;
                if (i15 == ux0Var2.E) {
                    ux0Var2.D = str9;
                    ux0Var2.C = 2;
                    arrayList15.remove(arrayList15.size() - 1);
                    if (arrayList15.isEmpty()) {
                        ux0Var2.x = true;
                        ux0Var2.f();
                        return;
                    }
                    ux0Var2.x = false;
                    ux0Var2.v = false;
                    ux0Var2.c();
                    d2 d2Var = ux0Var2.d;
                    if (d2Var != null) {
                        d2Var.setVisibility(0);
                        ux0Var2.d.invalidate();
                    }
                    ux0Var2.w = arrayList15;
                    rx0 rx0Var = ux0Var2.f;
                    if (rx0Var != null) {
                        rx0Var.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                r01 r01Var = (r01) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                ArrayList arrayList17 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = r01Var.r;
                j01 j01Var = editorAlert.c;
                if (i15 != r01Var.d) {
                    return;
                }
                r01 r01Var2 = editorAlert.r;
                if (j01Var.getAdapter() != r01Var2) {
                    editorAlert.B = ThemeEditorView.EditorAlert.I(editorAlert);
                    j01Var.setAdapter(r01Var2);
                    r01Var2.l();
                }
                boolean z17 = !r01Var.e.isEmpty() && arrayList16.isEmpty();
                boolean z18 = r01Var.e.isEmpty() && arrayList16.isEmpty();
                if (z17) {
                    editorAlert.B = ThemeEditorView.EditorAlert.I(editorAlert);
                }
                r01Var.e = arrayList16;
                r01Var.f = arrayList17;
                r01Var.l();
                if (!z18 && !z17 && (i11 = editorAlert.B) > 0) {
                    editorAlert.h.h1(0, -i11);
                    editorAlert.B = -1000;
                }
                editorAlert.e.c();
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
        this.e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i9;
    }
}
