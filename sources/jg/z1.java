package jg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.cb;
import di.d6;
import di.y2;
import fi.ua;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z1 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 f;
    public s71 a;
    public final ArrayList b;
    public y5 c;
    public int d;
    public boolean e;

    public z1() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void V(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.d) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((u61) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((u61) arrayList.get(i11)).G).c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = c3.h0.i(((b2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = c3.h0.i(((b2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new d6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void W(z1 z1Var, ArrayList arrayList, k71 k71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        u61 u61Var = new u61(2);
        u61Var.l = string;
        u61Var.o = string2;
        u61Var.m = "RestrictedEmoji";
        u61Var.n = "📝";
        arrayList.add(u61Var);
        k71Var.V();
        c2 f7 = c2.f(z1Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((b2) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((b2) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            u61 c10 = u61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        z1Var.d = k71Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            u61 u61Var2 = new u61(16);
            u61Var2.G = b2Var;
            u61Var2.L(z1Var.b.contains(Integer.valueOf(b2Var.a)));
            arrayList.add(u61Var2);
        }
        k71Var.L();
        k71Var.U();
        ic.a.z(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void X(z1 z1Var, u61 u61Var, View view) {
        if (u61Var.d == 1) {
            e0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ig.o(z1Var, 6));
            return;
        }
        if (u61Var.a == 16 && (u61Var.G instanceof b2)) {
            if (!z1Var.b.isEmpty()) {
                z1Var.f0(u61Var, view);
                return;
            }
            b2 b2Var = (b2) u61Var.G;
            if (b2Var.g) {
                return;
            }
            Bundle g7 = b10.g(5, "chatMode");
            g7.putLong("user_id", z1Var.getUserConfig().getClientUserId());
            g7.putString("quick_reply", b2Var.b);
            wn wnVar = new wn(g7);
            wnVar.Cb(b2Var.a);
            z1Var.presentFragment(wnVar);
        }
    }

    public static void Y(z1 z1Var) {
        z1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.a, (Utilities.Callback<View>) new di.e(4));
        z1Var.simpleActionBar.n();
        z1Var.a.C1(false);
    }

    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static void e0(Activity activity, int i10, String str, b2 b2Var, u6 u6Var, Utilities.Callback callback) {
        ?? r32;
        r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ww0) && ((ww0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder h2Var = z10 ? new h2(activity, 0, u6Var) : new AlertDialog$Builder(activity, 0, u6Var);
        String string = LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.e2 e2Var = h2Var.a;
        e2Var.R = string;
        final s1 s1Var = new s1(activity, u6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        s1Var.setText(b2Var == null ? str == null ? "" : str : b2Var.b);
        int i11 = y6.j5;
        f7.V(s1Var, i11, u6Var);
        f7.m(s1Var, 34, y6.Xh, u6Var);
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        f7.G(s1Var, y6.k6, y6.l6, y6.p7, u6Var);
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new t1()});
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, kb1.i(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        f7.V(textView2, y6.q7, u6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, kb1.i(-1, -2, 83));
        Runnable[] runnableArr = {new ua(r15, r9)};
        y2 y2Var = new y2(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        int i12 = 28;
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        f7.addView(frameLayout, kb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(s1Var, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        h2Var.o(f7);
        e2Var.a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, y2Var, callback, e2VarArr, currentFocus));
        h2Var.k(LocaleController.getString(R.string.Done), new o1(s1Var, y2Var, i10, b2Var, textView2, callback));
        h2Var.h(LocaleController.getString(R.string.Cancel), new j2.d(i12));
        if (z10) {
            f = e2Var;
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new r(1, currentFocus));
            org.telegram.ui.ActionBar.e2 e2Var2 = f;
            boolean z11 = false;
            final int i13 = z11 ? 1 : 0;
            e2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jg.p1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            break;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            break;
                    }
                }
            });
            f.r(250L);
            r32 = z11;
        } else {
            r32 = 0;
            e2Var.O = new ig.o(s1Var, 7);
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new cb(s1Var, 6));
            final int i14 = 1;
            e2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: jg.p1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i14) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            break;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            break;
                    }
                }
            });
            e2VarArr[0].show();
        }
        e2VarArr[r32].j0 = r32;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.simpleActionBar.setActionBarMenuOnItemClick(new q1(this));
        x5 h = this.simpleActionBar.h();
        y5 a2 = h.a(1, R.drawable.msg_edit);
        this.c = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        h.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        r1 r1Var = new r1(context, null, 0);
        final int i10 = 1;
        s71 s71Var = new s71(this, new Utilities.Callback2(this) { // from class: jg.n1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        z1.V(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        z1.W(this.b, (ArrayList) obj, (k71) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = s71Var;
        s71Var.u1();
        this.a.setSectionsDrawBackground(true);
        s71 s71Var2 = this.a;
        s71Var2.g3.r = false;
        final int i11 = 0;
        s71Var2.H1(new Utilities.Callback2(this) { // from class: jg.n1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        z1.V(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        z1.W(this.b, (ArrayList) obj, (k71) obj2);
                        break;
                }
            }
        }, false);
        r1Var.addView(this.a, kb1.g(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s71 s71Var;
        k71 k71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (s71Var = this.a) == null || (k71Var = s71Var.g3) == null) {
            return;
        }
        k71Var.O(true);
    }

    public final void f0(u61 u61Var, View view) {
        b2 b2Var = (b2) u61Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.a));
        }
        this.a.C1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.a));
        u61Var.e = contains;
        y1Var.d.a(contains, true);
        if (this.simpleActionBar.o() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.n();
            } else {
                this.simpleActionBar.x();
            }
        }
        this.simpleActionBar.t(Math.max(1, arrayList.size()), true);
        boolean z10 = false;
        boolean z11 = arrayList.size() == 1;
        if (z11) {
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !c2.g(c10.b)) {
                z10 = true;
            }
            z11 = z10;
        }
        if (this.e != z11) {
            this.e = z11;
            this.c.Y(z11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.quickRepliesUpdated);
        c2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
