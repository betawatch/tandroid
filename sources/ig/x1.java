package ig;

import ai.bb;
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
import ci.d6;
import ci.y2;
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class x1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public a71 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f;

    public x1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(x1 x1Var, int i10, ArrayList arrayList) {
        if (i10 == x1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((f61) arrayList.get(i11)).G instanceof z1) {
                    ((z1) ((f61) arrayList.get(i11)).G).c = i11;
                }
            }
            a2 f7 = a2.f(x1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((z1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((z1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((z1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new d6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(x1 x1Var, ArrayList arrayList, s61 s61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        f61 f61Var = new f61(2);
        f61Var.l = string;
        f61Var.o = string2;
        f61Var.m = "RestrictedEmoji";
        f61Var.n = "📝";
        arrayList.add(f61Var);
        s61Var.U();
        a2 f7 = a2.f(x1Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((z1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((z1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            f61 c10 = f61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        x1Var.e = s61Var.M();
        ArrayList arrayList3 = a2.f(x1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            f61 f61Var2 = new f61(16);
            f61Var2.G = z1Var;
            f61Var2.K(x1Var.b.contains(Integer.valueOf(z1Var.a)));
            arrayList.add(f61Var2);
        }
        s61Var.L();
        s61Var.T();
        i2.d.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(x1 x1Var, f61 f61Var, View view) {
        if (f61Var.d == 1) {
            d0(x1Var.getParentActivity(), x1Var.currentAccount, null, null, x1Var.getResourceProvider(), new l0(x1Var, 2));
            return;
        }
        if (f61Var.a == 16 && (f61Var.G instanceof z1)) {
            if (!x1Var.b.isEmpty()) {
                x1Var.e0(f61Var, view);
                return;
            }
            z1 z1Var = (z1) f61Var.G;
            if (z1Var.g) {
                return;
            }
            Bundle i10 = org.telegram.ui.Cells.c1.i(5, "chatMode");
            i10.putLong("user_id", x1Var.getUserConfig().getClientUserId());
            i10.putString("quick_reply", z1Var.b);
            sn snVar = new sn(i10);
            snVar.rb(z1Var.a);
            x1Var.presentFragment(snVar);
        }
    }

    public static void X(x1 x1Var) {
        x1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) x1Var.a, (Utilities.Callback<View>) new ci.e(4));
        x1Var.actionBar.r();
        x1Var.a.x1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void d0(Activity activity, int i10, String str, z1 z1Var, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof jw0) && ((jw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, d6Var) : new AlertDialog$Builder(activity, 0, d6Var);
        String string = LocaleController.getString((z1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        final q1 q1Var = new q1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        q1Var.setTextSize(1, 18.0f);
        q1Var.setText(z1Var == null ? str == null ? "" : str : z1Var.b);
        int i11 = h6.j5;
        q1Var.setTextColor(h6.w0(i11, d6Var));
        q1Var.setHintColor(h6.w0(h6.Xh, d6Var));
        q1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        q1Var.setSingleLine(true);
        q1Var.setFocusable(true);
        q1Var.setLineColors(h6.w0(h6.k6, d6Var), h6.w0(h6.l6, d6Var), h6.w0(h6.p7, d6Var));
        q1Var.setImeOptions(6);
        q1Var.setBackgroundDrawable(null);
        q1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        q1Var.setFilters(new InputFilter[]{new r1()});
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        lk.o(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((z1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        lk.o(h6.q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new bc(r15, 23)};
        y2 y2Var = new y2(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        q1Var.addTextChangedListener(new s1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(q1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e);
        b2Var.a = AndroidUtilities.dp(292.0f);
        q1Var.setOnEditorActionListener(new t1(q1Var, i10, z1Var, textView2, y2Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new m1(q1Var, y2Var, i10, z1Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new fh.b(25));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.b2 b2Var2 = h;
            boolean z11 = false;
            final int i12 = z11 ? 1 : 0;
            b2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.n1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            q1 q1Var2 = q1Var;
                            q1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var2);
                            break;
                        default:
                            q1 q1Var3 = q1Var;
                            q1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
            r32 = z11;
        } else {
            r32 = 0;
            b2Var.O = new l0(q1Var, 3);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new bb(q1Var, 6));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.n1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            q1 q1Var2 = q1Var;
                            q1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var2);
                            break;
                        default:
                            q1 q1Var3 = q1Var;
                            q1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].h0 = r32;
        q1Var.setSelection(q1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new o1(this));
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
        p1 p1Var = new p1(context, null, i10);
        p1Var.setBackgroundColor(h6.x0(null, h6.a7, false));
        a71 a71Var = new a71(this, new Utilities.Callback2(this) { // from class: ig.k1
            public final /* synthetic */ x1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        x1.V(this.b, (ArrayList) obj, (s61) obj2);
                        break;
                    default:
                        x1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new l1(this), new l1(this));
        this.a = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.a;
        a71Var2.W2.r = false;
        final int i11 = 1;
        a71Var2.C1(new Utilities.Callback2(this) { // from class: ig.k1
            public final /* synthetic */ x1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        x1.V(this.b, (ArrayList) obj, (s61) obj2);
                        break;
                    default:
                        x1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        p1Var.addView(this.a, z5.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        this.fragmentView = p1Var;
        return p1Var;
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
        z1 z1Var = (z1) f61Var.G;
        w1 w1Var = (w1) view;
        Integer valueOf = Integer.valueOf(z1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(z1Var.a));
        } else {
            arrayList.add(Integer.valueOf(z1Var.a));
        }
        this.a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(z1Var.a));
        f61Var.e = contains;
        w1Var.d.a(contains, true);
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
            z1 c10 = a2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || a2.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            lk.t(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), bs.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        a2.f(this.currentAccount).h();
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
