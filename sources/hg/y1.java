package hg;

import ai.e4;
import ai.f5;
import ai.u7;
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
import ci.qc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public e71 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.v0 d;
    public int e;
    public boolean f;

    public y1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void S(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h61) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((h61) arrayList.get(i11)).G).c = i11;
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
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new u7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void T(y1 y1Var, ArrayList arrayList, w61 w61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h61 h61Var = new h61(2);
        h61Var.l = string;
        h61Var.o = string2;
        h61Var.m = "RestrictedEmoji";
        h61Var.n = "📝";
        arrayList.add(h61Var);
        w61Var.U();
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
            h61 c10 = h61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        y1Var.e = w61Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            h61 h61Var2 = new h61(16);
            h61Var2.G = a2Var;
            h61Var2.L(y1Var.b.contains(Integer.valueOf(a2Var.a)));
            arrayList.add(h61Var2);
        }
        w61Var.L();
        w61Var.T();
        c.n(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void U(y1 y1Var, h61 h61Var, View view) {
        if (h61Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new ai.y1(y1Var, 26));
            return;
        }
        if (h61Var.a == 16 && (h61Var.G instanceof a2)) {
            if (!y1Var.b.isEmpty()) {
                y1Var.e0(h61Var, view);
                return;
            }
            a2 a2Var = (a2) h61Var.G;
            if (a2Var.g) {
                return;
            }
            Bundle h10 = org.telegram.ui.Cells.c1.h(5, "chatMode");
            h10.putLong("user_id", y1Var.getUserConfig().getClientUserId());
            h10.putString("quick_reply", a2Var.b);
            yn ynVar = new yn(h10);
            ynVar.mb(a2Var.a);
            y1Var.presentFragment(ynVar);
        }
    }

    public static void W(y1 y1Var) {
        y1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.a, (Utilities.Callback<View>) new ai.i(4));
        y1Var.actionBar.r();
        y1Var.a.x1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void d0(Activity activity, int i10, String str, a2 a2Var, d6 d6Var, Utilities.Callback callback) {
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof mw0) && ((mw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, d6Var) : new AlertDialog$Builder(activity, 0, d6Var);
        String string = LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        final r1 r1Var = new r1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        r1Var.setText(a2Var == null ? str == null ? "" : str : a2Var.b);
        int i11 = i6.j5;
        r1Var.setTextColor(i6.v0(i11, d6Var));
        r1Var.setHintColor(i6.v0(i6.Xh, d6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(i6.v0(i6.k6, d6Var), i6.v0(i6.l6, d6Var), i6.v0(i6.p7, d6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new s1()});
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        bi.m(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        bi.m(i6.q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new qc(r14, 24)};
        e4 e4Var = new e4(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e7.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(r1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e7);
        b2Var.a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, e4Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new n1(r1Var, e4Var, i10, a2Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new ga.a(2));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new r(1, currentFocus));
            org.telegram.ui.ActionBar.b2 b2Var2 = h;
            r32 = 0;
            final boolean z11 = false ? 1 : 0;
            b2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.o1
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
            b2Var.O = new ai.y1(r1Var, 27);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new f5(r1Var, 3));
            final int i12 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.o1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
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
            b2VarArr[0].show();
        }
        b2VarArr[r32].h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(i6.w0(null, i6.y8, false));
        j3.addView(this.c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        q1 q1Var = new q1(context, null, i10);
        e71 e71Var = new e71(this, new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        y1.T(this.b, (ArrayList) obj, (w61) obj2);
                        break;
                    default:
                        y1.S(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = e71Var;
        e71Var.r1();
        this.a.setSectionsDrawBackground(true);
        e71 e71Var2 = this.a;
        e71Var2.f3.r = false;
        final int i11 = 1;
        e71Var2.C1(new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        y1.T(this.b, (ArrayList) obj, (w61) obj2);
                        break;
                    default:
                        y1.S(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        q1Var.addView(this.a, z5.c(-1.0f, -1));
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        w61 w61Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (e71Var = this.a) == null || (w61Var = e71Var.f3) == null) {
            return;
        }
        w61Var.N(true);
    }

    public final void e0(h61 h61Var, View view) {
        a2 a2Var = (a2) h61Var.G;
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
        h61Var.e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.L(null, null);
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
            bi.r(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), tr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final zl0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }
}
