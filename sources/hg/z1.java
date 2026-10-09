package hg;

import ai.f4;
import ai.g5;
import ai.v7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public k71 a;
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
                if (((p61) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((p61) arrayList.get(i11)).G).c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new v7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(z1 z1Var, ArrayList arrayList, c71 c71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        p61 p61Var = new p61(2);
        p61Var.l = string;
        p61Var.o = string2;
        p61Var.m = "RestrictedEmoji";
        p61Var.n = "📝";
        arrayList.add(p61Var);
        c71Var.U();
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
            p61 c10 = p61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        z1Var.e = c71Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            p61 p61Var2 = new p61(16);
            p61Var2.G = b2Var;
            p61Var2.K(z1Var.b.contains(Integer.valueOf(b2Var.a)));
            arrayList.add(p61Var2);
        }
        c71Var.L();
        c71Var.T();
        c.n(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(z1 z1Var, p61 p61Var, View view) {
        if (p61Var.d == 1) {
            d0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ai.y1(z1Var, 26));
            return;
        }
        if (p61Var.a == 16 && (p61Var.G instanceof b2)) {
            if (!z1Var.b.isEmpty()) {
                z1Var.e0(p61Var, view);
                return;
            }
            b2 b2Var = (b2) p61Var.G;
            if (b2Var.g) {
                return;
            }
            Bundle f7 = org.telegram.ui.Cells.c1.f(5, "chatMode");
            f7.putLong("user_id", z1Var.getUserConfig().getClientUserId());
            f7.putString("quick_reply", b2Var.b);
            zn znVar = new zn(f7);
            znVar.rb(b2Var.a);
            z1Var.presentFragment(znVar);
        }
    }

    public static void X(z1 z1Var) {
        z1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.a, (Utilities.Callback<View>) new ai.i(4));
        z1Var.actionBar.s();
        z1Var.a.x1(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    public static void d0(Activity activity, int i10, String str, b2 b2Var, e6 e6Var, Utilities.Callback callback) {
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final int i11 = 0;
        boolean z10 = R != null && (R.getFragmentView() instanceof sw0) && ((sw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        ?? e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, e6Var) : new AlertDialog$Builder(activity, 0, e6Var);
        String string = LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var2 = e2Var.a;
        b2Var2.R = string;
        final s1 s1Var = new s1(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        s1Var.setText(b2Var == null ? str == null ? "" : str : b2Var.b);
        int i12 = i6.j5;
        s1Var.setTextColor(i6.w0(i12, e6Var));
        s1Var.setHintColor(i6.w0(i6.Xh, e6Var));
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        s1Var.setLineColors(i6.w0(i6.k6, e6Var), i6.w0(i6.l6, e6Var), i6.w0(i6.p7, e6Var));
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new t1()});
        ?? e7 = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        bi.o(i12, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((b2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        bi.o(i6.q7, e6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        Runnable[] runnableArr = {new rc(r14, 24)};
        f4 f4Var = new f4(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        e7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(s1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e7);
        b2Var2.a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, f4Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new n1(s1Var, f4Var, i10, b2Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new o1(i11));
        if (z10) {
            h = b2Var2;
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new r(1, currentFocus));
            h.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hg.p1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
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
            b2Var2.O = new ai.y1(s1Var, 27);
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new g5(s1Var, 3));
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
        b2VarArr[0].h0 = false;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new q1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(i6.x0(null, i6.y8, false));
        j3.addView(this.c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        r1 r1Var = new r1(context, null, i10);
        r1Var.setBackgroundColor(i6.x0(null, i6.a7, false));
        k71 k71Var = new k71(this, new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        z1.V(this.b, (ArrayList) obj, (c71) obj2);
                        break;
                    default:
                        z1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = k71Var;
        k71Var.p1();
        k71 k71Var2 = this.a;
        k71Var2.W2.r = false;
        final int i11 = 1;
        k71Var2.C1(new Utilities.Callback2(this) { // from class: hg.l1
            public final /* synthetic */ z1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        z1.V(this.b, (ArrayList) obj, (c71) obj2);
                        break;
                    default:
                        z1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        r1Var.addView(this.a, x5.d(-1.0f, -1));
        this.actionBar.B(this.a, true);
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        c71 c71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (k71Var = this.a) == null || (c71Var = k71Var.W2) == null) {
            return;
        }
        c71Var.N(true);
    }

    public final void e0(p61 p61Var, View view) {
        b2 b2Var = (b2) p61Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.a));
        }
        this.a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.a));
        p61Var.e = contains;
        y1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
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
            bi.t(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), hs.h, 340L);
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
