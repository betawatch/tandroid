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
import ci.rc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public d61 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.v0 d;
    public int e;
    public boolean f;

    public z1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h51) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((h51) arrayList.get(i11)).G).c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new u7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(z1 z1Var, ArrayList arrayList, v51 v51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.m = "RestrictedEmoji";
        h51Var.n = "📝";
        arrayList.add(h51Var);
        v51Var.U();
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
            h51 c10 = h51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        z1Var.e = v51Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            h51 h51Var2 = new h51(16);
            h51Var2.G = b2Var;
            h51Var2.K(z1Var.b.contains(Integer.valueOf(b2Var.a)));
            arrayList.add(h51Var2);
        }
        v51Var.L();
        v51Var.T();
        c.p(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(z1 z1Var, h51 h51Var, View view) {
        if (h51Var.d == 1) {
            d0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ai.y1(z1Var, 26));
            return;
        }
        if (h51Var.a == 16 && (h51Var.G instanceof b2)) {
            if (!z1Var.b.isEmpty()) {
                z1Var.e0(h51Var, view);
                return;
            }
            b2 b2Var = (b2) h51Var.G;
            if (b2Var.g) {
                return;
            }
            Bundle e = q3.e(5, "chatMode");
            e.putLong("user_id", z1Var.getUserConfig().getClientUserId());
            e.putString("quick_reply", b2Var.b);
            xn xnVar = new xn(e);
            xnVar.nb(b2Var.a);
            z1Var.presentFragment(xnVar);
        }
    }

    public static void X(z1 z1Var) {
        z1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.a, (Utilities.Callback<View>) new ai.i(4));
        z1Var.actionBar.r();
        z1Var.a.w1(false);
    }

    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static void d0(Activity activity, int i10, String str, b2 b2Var, d6 d6Var, Utilities.Callback callback) {
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, d6Var) : new AlertDialog$Builder(activity, 0, d6Var);
        String string = LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var2 = e2Var.a;
        b2Var2.R = string;
        final s1 s1Var = new s1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        s1Var.setText(b2Var == null ? str == null ? "" : str : b2Var.b);
        int i11 = h6.j5;
        s1Var.setTextColor(h6.v0(i11, d6Var));
        s1Var.setHintColor(h6.v0(h6.Xh, d6Var));
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        s1Var.setLineColors(h6.v0(h6.k6, d6Var), h6.v0(h6.l6, d6Var), h6.v0(h6.p7, d6Var));
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new t1()});
        LinearLayout f7 = org.telegram.messenger.z0.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        ul.o(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        ul.o(h6.q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        Runnable[] runnableArr = {new rc(r14, 24)};
        e4 e4Var = new e4(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        f7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(s1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(f7);
        b2Var2.a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, e4Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new o1(s1Var, e4Var, i10, b2Var, textView2, callback));
        int i12 = 1;
        e2Var.h(LocaleController.getString(R.string.Cancel), new r(i12));
        if (z10) {
            h = b2Var2;
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new s(i12, currentFocus));
            org.telegram.ui.ActionBar.b2 b2Var3 = h;
            r32 = 0;
            final boolean z11 = false ? 1 : 0;
            b2Var3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.p1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
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
            h.q(250L);
        } else {
            r32 = 0;
            b2Var2.O = new ai.y1(s1Var, 27);
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new f5(s1Var, 3));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.p1
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
            b2VarArr[0].show();
        }
        b2VarArr[r32].h0 = r32;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new q1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(h6.w0(null, h6.y8, false));
        j3.addView(this.c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        r1 r1Var = new r1(context, null, i10);
        r1Var.setBackgroundColor(h6.w0(null, h6.a7, false));
        d61 d61Var = new d61(this, new Utilities.Callback2(this) { // from class: hg.m1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        z1.V(this.b, (ArrayList) obj, (v51) obj2);
                        break;
                    default:
                        z1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new n1(this), new n1(this));
        this.a = d61Var;
        d61Var.p1();
        d61 d61Var2 = this.a;
        d61Var2.Y2.r = false;
        final int i11 = 1;
        d61Var2.B1(new Utilities.Callback2(this) { // from class: hg.m1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        z1.V(this.b, (ArrayList) obj, (v51) obj2);
                        break;
                    default:
                        z1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        r1Var.addView(this.a, x5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        v51 v51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (d61Var = this.a) == null || (v51Var = d61Var.Y2) == null) {
            return;
        }
        v51Var.N(true);
    }

    public final void e0(h51 h51Var, View view) {
        b2 b2Var = (b2) h51Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.a));
        }
        this.a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.a));
        h51Var.e = contains;
        y1Var.d.a(contains, true);
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
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || c2.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            ul.r(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), rr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        c2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
