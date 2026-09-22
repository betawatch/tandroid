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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public u61 a;
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

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((y51) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((y51) arrayList.get(i11)).G).c = i11;
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

    public static void V(y1 y1Var, ArrayList arrayList, m61 m61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        y51 y51Var = new y51(2);
        y51Var.l = string;
        y51Var.o = string2;
        y51Var.m = "RestrictedEmoji";
        y51Var.n = "📝";
        arrayList.add(y51Var);
        m61Var.U();
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
            y51 c10 = y51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        y1Var.e = m61Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            y51 y51Var2 = new y51(16);
            y51Var2.G = a2Var;
            y51Var2.K(y1Var.b.contains(Integer.valueOf(a2Var.a)));
            arrayList.add(y51Var2);
        }
        m61Var.L();
        m61Var.T();
        com.google.android.gms.internal.vision.e2.w(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, y51 y51Var, View view) {
        if (y51Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new ai.y1(y1Var, 23));
            return;
        }
        if (y51Var.a == 16 && (y51Var.G instanceof a2)) {
            if (!y1Var.b.isEmpty()) {
                y1Var.e0(y51Var, view);
                return;
            }
            a2 a2Var = (a2) y51Var.G;
            if (a2Var.g) {
                return;
            }
            Bundle g10 = org.telegram.ui.Cells.c1.g(5, "chatMode");
            g10.putLong("user_id", y1Var.getUserConfig().getClientUserId());
            g10.putString("quick_reply", a2Var.b);
            zn znVar = new zn(g10);
            znVar.nb(a2Var.a);
            y1Var.presentFragment(znVar);
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
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof cw0) && ((cw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, f6Var) : new AlertDialog$Builder(activity, 0, f6Var);
        String string = LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
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
        LinearLayout e = org.telegram.messenger.l0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        rk.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, y5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        rk.n(j6.q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, y5.e(-1, -2, 83));
        Runnable[] runnableArr = {new uc(r14, r9)};
        e4 e4Var = new e4(runnableArr, new ValueAnimator[1], textView2, textView, 2);
        int i12 = 24;
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e.addView(frameLayout, y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(r1Var, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e);
        b2Var.a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, e4Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new n1(r1Var, e4Var, i10, a2Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new ga.a(2));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new q(1, currentFocus));
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
            b2Var.O = new ai.y1(r1Var, i12);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new g5(r1Var, 3));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.o1
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
            b2VarArr[0].show();
        }
        b2VarArr[r32].h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(j6.w0(null, j6.y8, false));
        j3.addView(this.c, y5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        q1 q1Var = new q1(context, null, i10);
        q1Var.setBackgroundColor(j6.w0(null, j6.a7, false));
        u61 u61Var = new u61(this, new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (m61) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = u61Var;
        u61Var.q1();
        u61 u61Var2 = this.a;
        u61Var2.Y2.r = false;
        final int i11 = 1;
        u61Var2.C1(new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (m61) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        q1Var.addView(this.a, y5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        m61 m61Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (u61Var = this.a) == null || (m61Var = u61Var.Y2) == null) {
            return;
        }
        m61Var.N(true);
    }

    public final void e0(y51 y51Var, View view) {
        a2 a2Var = (a2) y51Var.G;
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
        y51Var.e = contains;
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
            rk.s(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), qr.h, 340L);
        }
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
