package ig;

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
import bi.g7;
import bi.t4;
import bi.u3;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 h;
    public i71 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.u0 d;
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
                if (((m61) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((m61) arrayList.get(i11)).G).c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((a2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(21));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((a2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new g7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, a71 a71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        m61 m61Var = new m61(2);
        m61Var.l = string;
        m61Var.o = string2;
        m61Var.m = "RestrictedEmoji";
        m61Var.n = "📝";
        arrayList.add(m61Var);
        a71Var.U();
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
            m61 c10 = m61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        y1Var.e = a71Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            m61 m61Var2 = new m61(16);
            m61Var2.G = a2Var;
            m61Var2.K(y1Var.b.contains(Integer.valueOf(a2Var.a)));
            arrayList.add(m61Var2);
        }
        a71Var.L();
        a71Var.T();
        i2.d.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, m61 m61Var, View view) {
        if (m61Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new bi.o1(y1Var, 26));
            return;
        }
        if (m61Var.a == 16 && (m61Var.G instanceof a2)) {
            if (!y1Var.b.isEmpty()) {
                y1Var.e0(m61Var, view);
                return;
            }
            a2 a2Var = (a2) m61Var.G;
            if (a2Var.g) {
                return;
            }
            Bundle f7 = org.telegram.ui.Cells.c1.f(5, "chatMode");
            f7.putLong("user_id", y1Var.getUserConfig().getClientUserId());
            f7.putString("quick_reply", a2Var.b);
            fo foVar = new fo(f7);
            foVar.rb(a2Var.a);
            y1Var.presentFragment(foVar);
        }
    }

    public static void X(y1 y1Var) {
        y1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.a, (Utilities.Callback<View>) new bi.f(4));
        y1Var.actionBar.s();
        y1Var.a.x1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void d0(Activity activity, int i10, String str, a2 a2Var, c6 c6Var, Utilities.Callback callback) {
        ?? r32;
        m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder d2Var = z10 ? new org.telegram.ui.ActionBar.d2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.a2 a2Var2 = d2Var.a;
        a2Var2.R = string;
        final r1 r1Var = new r1(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        r1Var.setText(a2Var == null ? str == null ? "" : str : a2Var.b);
        int i11 = g6.j5;
        r1Var.setTextColor(g6.w0(i11, c6Var));
        r1Var.setHintColor(g6.w0(g6.Xh, c6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(g6.w0(g6.k6, c6Var), g6.w0(g6.l6, c6Var), g6.w0(g6.p7, c6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new s1()});
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        sk.o(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((a2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        sk.o(g6.q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new t0(r14, r9)};
        u3 u3Var = new u3(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        int i12 = 3;
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(r1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        d2Var.n(e);
        a2Var2.a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, u3Var, callback, a2VarArr, currentFocus));
        d2Var.k(LocaleController.getString(R.string.Done), new n1(r1Var, u3Var, i10, a2Var, textView2, callback));
        d2Var.h(LocaleController.getString(R.string.Cancel), new fi.c2(23));
        if (z10) {
            h = a2Var2;
            a2VarArr[0] = a2Var2;
            a2Var2.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.a2 a2Var3 = h;
            boolean z11 = false;
            final int i13 = z11 ? 1 : 0;
            a2Var3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.o1
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
            h.q(250L);
            r32 = z11;
        } else {
            r32 = 0;
            a2Var2.O = new bi.o1(r1Var, 27);
            a2VarArr[0] = a2Var2;
            a2Var2.setOnDismissListener(new t4(r1Var, i12));
            final int i14 = 1;
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.o1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i14) {
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
            a2VarArr[0].show();
        }
        a2VarArr[r32].h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(g6.x0(null, g6.y8, false));
        j10.addView(this.c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        q1 q1Var = new q1(context, null, i10);
        q1Var.setBackgroundColor(g6.x0(null, g6.a7, false));
        i71 i71Var = new i71(this, new Utilities.Callback2(this) { // from class: ig.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (a71) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new m1(this), new m1(this));
        this.a = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.a;
        i71Var2.W2.r = false;
        final int i11 = 1;
        i71Var2.C1(new Utilities.Callback2(this) { // from class: ig.l1
            public final /* synthetic */ y1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        y1.V(this.b, (ArrayList) obj, (a71) obj2);
                        break;
                    default:
                        y1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        q1Var.addView(this.a, z5.d(-1.0f, -1));
        this.actionBar.B(this.a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        a71 a71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (i71Var = this.a) == null || (a71Var = i71Var.W2) == null) {
            return;
        }
        a71Var.N(true);
    }

    public final void e0(m61 m61Var, View view) {
        a2 a2Var = (a2) m61Var.G;
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
        m61Var.e = contains;
        x1Var.d.a(contains, true);
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
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || b2.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            sk.t(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), es.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
