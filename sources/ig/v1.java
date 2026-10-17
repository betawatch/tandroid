package ig;

import ai.ab;
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
import ci.e6;
import ci.z2;
import com.google.android.gms.internal.cast.a6;
import ei.bc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class v1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public a71 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f;

    public v1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(v1 v1Var, int i10, ArrayList arrayList) {
        if (i10 == v1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((f61) arrayList.get(i11)).G instanceof x1) {
                    ((x1) ((f61) arrayList.get(i11)).G).c = i11;
                }
            }
            y1 f7 = y1.f(v1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = a6.f(((x1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((x1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = a6.f(((x1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new e6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(v1 v1Var, ArrayList arrayList, s61 s61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        f61 f61Var = new f61(2);
        f61Var.l = string;
        f61Var.o = string2;
        f61Var.m = "RestrictedEmoji";
        f61Var.n = "📝";
        arrayList.add(f61Var);
        s61Var.U();
        y1 f7 = y1.f(v1Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((x1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((x1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            f61 c10 = f61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        v1Var.e = s61Var.M();
        ArrayList arrayList3 = y1.f(v1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            f61 f61Var2 = new f61(16);
            f61Var2.G = x1Var;
            f61Var2.K(v1Var.b.contains(Integer.valueOf(x1Var.a)));
            arrayList.add(f61Var2);
        }
        s61Var.L();
        s61Var.T();
        i0.a.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(v1 v1Var, f61 f61Var, View view) {
        if (f61Var.d == 1) {
            d0(v1Var.getParentActivity(), v1Var.currentAccount, null, null, v1Var.getResourceProvider(), new l0(v1Var, 2));
            return;
        }
        if (f61Var.a == 16 && (f61Var.G instanceof x1)) {
            if (!v1Var.b.isEmpty()) {
                v1Var.e0(f61Var, view);
                return;
            }
            x1 x1Var = (x1) f61Var.G;
            if (x1Var.g) {
                return;
            }
            Bundle j10 = org.telegram.ui.Cells.t0.j(5, "chatMode");
            j10.putLong("user_id", v1Var.getUserConfig().getClientUserId());
            j10.putString("quick_reply", x1Var.b);
            sn snVar = new sn(j10);
            snVar.rb(x1Var.a);
            v1Var.presentFragment(snVar);
        }
    }

    public static void X(v1 v1Var) {
        v1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) v1Var.a, (Utilities.Callback<View>) new ci.e(4));
        v1Var.actionBar.r();
        v1Var.a.x1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void d0(Activity activity, int i10, String str, x1 x1Var, d6 d6Var, Utilities.Callback callback) {
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof jw0) && ((jw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new e2(activity, 0, d6Var) : new AlertDialog$Builder(activity, 0, d6Var);
        String string = LocaleController.getString((x1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        final o1 o1Var = new o1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        o1Var.setTextSize(1, 18.0f);
        o1Var.setText(x1Var == null ? str == null ? "" : str : x1Var.b);
        int i11 = h6.j5;
        o1Var.setTextColor(h6.w0(i11, d6Var));
        o1Var.setHintColor(h6.w0(h6.Xh, d6Var));
        o1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        o1Var.setSingleLine(true);
        o1Var.setFocusable(true);
        o1Var.setLineColors(h6.w0(h6.k6, d6Var), h6.w0(h6.l6, d6Var), h6.w0(h6.p7, d6Var));
        o1Var.setImeOptions(6);
        o1Var.setBackgroundDrawable(null);
        o1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        o1Var.setFilters(new InputFilter[]{new p1()});
        LinearLayout e = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        wh.o(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((x1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        wh.o(h6.q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new bc(r15, 23)};
        z2 z2Var = new z2(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        o1Var.addTextChangedListener(new q1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(o1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e);
        b2Var.a = AndroidUtilities.dp(292.0f);
        o1Var.setOnEditorActionListener(new r1(o1Var, i10, x1Var, textView2, z2Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new k1(o1Var, z2Var, i10, x1Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new fh.b(25));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.b2 b2Var2 = h;
            boolean z11 = false;
            final int i12 = z11 ? 1 : 0;
            b2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.l1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            o1 o1Var2 = o1Var;
                            o1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var2);
                            break;
                        default:
                            o1 o1Var3 = o1Var;
                            o1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
            r32 = z11;
        } else {
            r32 = 0;
            b2Var.O = new l0(o1Var, 3);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new ab(o1Var, 6));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.l1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            o1 o1Var2 = o1Var;
                            o1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var2);
                            break;
                        default:
                            o1 o1Var3 = o1Var;
                            o1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].h0 = r32;
        o1Var.setSelection(o1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        i0.a.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new m1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(h6.x0(null, h6.y8, false));
        j10.addView(this.c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        n1 n1Var = new n1(context, null, i10);
        n1Var.setBackgroundColor(h6.x0(null, h6.a7, false));
        a71 a71Var = new a71(this, new Utilities.Callback2(this) { // from class: ig.i1
            public final /* synthetic */ v1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        v1.V(this.b, (ArrayList) obj, (s61) obj2);
                        break;
                    default:
                        v1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new j1(this), new j1(this));
        this.a = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.a;
        a71Var2.W2.r = false;
        final int i11 = 1;
        a71Var2.C1(new Utilities.Callback2(this) { // from class: ig.i1
            public final /* synthetic */ v1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        v1.V(this.b, (ArrayList) obj, (s61) obj2);
                        break;
                    default:
                        v1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        n1Var.addView(this.a, z5.d(-1.0f, -1));
        this.actionBar.A(this.a, true);
        this.fragmentView = n1Var;
        return n1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        s61 s61Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (a71Var = this.a) == null || (s61Var = a71Var.W2) == null) {
            return;
        }
        s61Var.N(true);
    }

    public final void e0(f61 f61Var, View view) {
        x1 x1Var = (x1) f61Var.G;
        u1 u1Var = (u1) view;
        Integer valueOf = Integer.valueOf(x1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(x1Var.a));
        } else {
            arrayList.add(Integer.valueOf(x1Var.a));
        }
        this.a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(x1Var.a));
        f61Var.e = contains;
        u1Var.d.a(contains, true);
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
            x1 c10 = y1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || y1.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            wh.t(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), bs.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        y1.f(this.currentAccount).h();
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
