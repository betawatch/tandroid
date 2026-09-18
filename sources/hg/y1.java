package hg;

import ai.e4;
import ai.g5;
import ai.t7;
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
import ci.uc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 h;
    public f61 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f;

    public y1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((j51) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((j51) arrayList.get(i11)).G).c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new t7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, x51 x51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        j51 j51Var = new j51(2);
        j51Var.l = string;
        j51Var.o = string2;
        j51Var.m = "RestrictedEmoji";
        j51Var.n = "📝";
        arrayList.add(j51Var);
        x51Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((a2) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            j51 c10 = j51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        y1Var.e = x51Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            j51 j51Var2 = new j51(16);
            j51Var2.G = a2Var;
            j51Var2.K(y1Var.b.contains(Integer.valueOf(a2Var.a)));
            arrayList.add(j51Var2);
        }
        x51Var.L();
        x51Var.T();
        com.google.android.gms.internal.vision.e2.w(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, j51 j51Var, View view) {
        if (j51Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new ai.y1(y1Var, 23));
            return;
        }
        if (j51Var.a == 16 && (j51Var.G instanceof a2)) {
            if (!y1Var.b.isEmpty()) {
                y1Var.e0(j51Var, view);
                return;
            }
            a2 a2Var = (a2) j51Var.G;
            if (a2Var.g) {
                return;
            }
            Bundle e = p6.e(5, "chatMode");
            e.putLong("user_id", y1Var.getUserConfig().getClientUserId());
            e.putString("quick_reply", a2Var.b);
            bo boVar = new bo(e);
            boVar.nb(a2Var.a);
            y1Var.presentFragment(boVar);
        }
    }

    public static void X(y1 y1Var) {
        y1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.a, (e2.h) new ai.i(4));
        y1Var.actionBar.r();
        y1Var.a.x1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void d0(Activity activity, int i10, String str, a2 a2Var, f6 f6Var, Utilities.Callback callback) {
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder f2Var = z10 ? new org.telegram.ui.ActionBar.f2(activity, 0, f6Var) : new AlertDialog$Builder(activity, 0, f6Var);
        String string = LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.R = string;
        final r1 r1Var = new r1(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        r1Var.setText(a2Var == null ? str == null ? "" : str : a2Var.b);
        int i11 = j6.j5;
        r1Var.setTextColor(j6.v0(i11, f6Var));
        r1Var.setHintColor(j6.v0(j6.Xh, f6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new s1()});
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        wl.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        wl.n(j6.q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        Runnable[] runnableArr = {new uc(r14, r9)};
        e4 e4Var = new e4(runnableArr, new ValueAnimator[1], textView2, textView, 2);
        int i12 = 24;
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        f7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(r1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(f7);
        c2Var.a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, e4Var, callback, c2VarArr, currentFocus));
        f2Var.k(LocaleController.getString(R.string.Done), new n1(r1Var, e4Var, i10, a2Var, textView2, callback));
        f2Var.h(LocaleController.getString(R.string.Cancel), new ga.a(2));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.c2 c2Var2 = h;
            r32 = 0;
            final boolean z11 = false ? 1 : 0;
            c2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.o1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            break;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            c2Var.O = new ai.y1(r1Var, i12);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new g5(r1Var, 3));
            final int i13 = 1;
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.o1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            break;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            break;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[r32].h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.a0 j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(j6.w0(null, j6.y8, false));
        j3.addView(this.c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.w0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        q1 q1Var = new q1(context, null, i10);
        q1Var.setBackgroundColor(j6.w0(null, j6.a7, false));
        f61 f61Var = new f61(this, new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (x51) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = f61Var;
        f61Var.q1();
        f61 f61Var2 = this.a;
        f61Var2.Y2.r = false;
        final int i11 = 1;
        f61Var2.C1(new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (x51) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        q1Var.addView(this.a, x5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f61 f61Var;
        x51 x51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (f61Var = this.a) == null || (x51Var = f61Var.Y2) == null) {
            return;
        }
        x51Var.N(true);
    }

    public final void e0(j51 j51Var, View view) {
        a2 a2Var = (a2) j51Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.a));
        }
        this.a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.a));
        j51Var.e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.c.a(Math.max(1, arrayList.size()), true);
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || b2.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            wl.q(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), qr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
