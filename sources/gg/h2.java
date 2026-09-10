package gg;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h2 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 h;
    public r61 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f;

    public h2() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(h2 h2Var, int i10, ArrayList arrayList) {
        if (i10 == h2Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((v51) arrayList.get(i11)).G instanceof j2) {
                    ((j2) ((v51) arrayList.get(i11)).G).c = i11;
                }
            }
            k2 f7 = k2.f(h2Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.d(((j2) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(9));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((j2) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.d(((j2) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new bi.g1(1));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(h2 h2Var, ArrayList arrayList, j61 j61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        v51 v51Var = new v51(2);
        v51Var.l = string;
        v51Var.o = string2;
        v51Var.m = "RestrictedEmoji";
        v51Var.n = "📝";
        arrayList.add(v51Var);
        j61Var.U();
        k2 f7 = k2.f(h2Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((j2) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((j2) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            v51 c10 = v51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        h2Var.e = j61Var.M();
        ArrayList arrayList3 = k2.f(h2Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            j2 j2Var = (j2) obj;
            v51 v51Var2 = new v51(16);
            v51Var2.G = j2Var;
            v51Var2.K(h2Var.b.contains(Integer.valueOf(j2Var.a)));
            arrayList.add(v51Var2);
        }
        j61Var.L();
        j61Var.T();
        com.google.android.gms.internal.vision.e2.w(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(h2 h2Var, v51 v51Var, View view) {
        if (v51Var.d == 1) {
            d0(h2Var.getParentActivity(), h2Var.currentAccount, null, null, h2Var.getResourceProvider(), new ai.b(h2Var, 19));
            return;
        }
        if (v51Var.a == 16 && (v51Var.G instanceof j2)) {
            if (!h2Var.b.isEmpty()) {
                h2Var.e0(v51Var, view);
                return;
            }
            j2 j2Var = (j2) v51Var.G;
            if (j2Var.g) {
                return;
            }
            Bundle e = r6.e(5, "chatMode");
            e.putLong("user_id", h2Var.getUserConfig().getClientUserId());
            e.putString("quick_reply", j2Var.b);
            eo eoVar = new eo(e);
            eoVar.nb(j2Var.a);
            h2Var.presentFragment(eoVar);
        }
    }

    public static void X(h2 h2Var) {
        h2Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) h2Var.a, (e2.h) new g0(1));
        h2Var.actionBar.r();
        h2Var.a.v1(false);
    }

    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    public static void d0(Activity activity, int i10, String str, j2 j2Var, f6 f6Var, Utilities.Callback callback) {
        ?? r02;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof aw0) && ((aw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder g2Var = z10 ? new org.telegram.ui.ActionBar.g2(activity, 0, f6Var) : new AlertDialog$Builder(activity, 0, f6Var);
        String string = LocaleController.getString((j2Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.d2 d2Var = g2Var.a;
        d2Var.R = string;
        final a2 a2Var = new a2(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setText(j2Var == null ? str == null ? "" : str : j2Var.b);
        int i11 = j6.j5;
        a2Var.setTextColor(j6.v0(i11, f6Var));
        a2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        a2Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        a2Var.setSingleLine(true);
        a2Var.setFocusable(true);
        a2Var.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        a2Var.setFilters(new InputFilter[]{new b2()});
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        em.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((j2Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, a6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        em.n(j6.q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, a6.e(-1, -2, 83));
        Runnable[] runnableArr = {new v1(r14, 0)};
        u1 u1Var = new u1(runnableArr, new ValueAnimator[1], textView2, textView, 0);
        a2Var.addTextChangedListener(new c2(textView2, runnableArr));
        f7.addView(frameLayout, a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(a2Var, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        g2Var.n(f7);
        d2Var.a = AndroidUtilities.dp(292.0f);
        a2Var.setOnEditorActionListener(new d2(a2Var, i10, j2Var, textView2, u1Var, callback, d2VarArr, currentFocus));
        g2Var.k(LocaleController.getString(R.string.Done), new w1(a2Var, u1Var, i10, j2Var, textView2, callback));
        g2Var.h(LocaleController.getString(R.string.Cancel), new dh.a(24));
        if (z10) {
            h = d2Var;
            r02 = 0;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new s(1, currentFocus));
            org.telegram.ui.ActionBar.d2 d2Var2 = h;
            final boolean z11 = false ? 1 : 0;
            d2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: gg.x1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var2);
                            break;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var3);
                            break;
                    }
                }
            });
            h.q(250L);
        } else {
            r02 = 0;
            d2Var.O = new ai.b(a2Var, 20);
            d2VarArr[0] = d2Var;
            final int i12 = 1;
            d2Var.setOnDismissListener(new o(a2Var, i12));
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: gg.x1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var2);
                            break;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var3);
                            break;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[r02].h0 = r02;
        a2Var.setSelection(a2Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new y1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(j6.w0(null, j6.y8, false));
        j3.addView(this.c, a6.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new ai.h(2));
        org.telegram.ui.ActionBar.w0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i10 = 0;
        z1 z1Var = new z1(context, null, i10);
        z1Var.setBackgroundColor(j6.w0(null, j6.a7, false));
        r61 r61Var = new r61(this, new Utilities.Callback2(this) { // from class: gg.r1
            public final /* synthetic */ h2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        h2.V(this.b, (ArrayList) obj, (j61) obj2);
                        break;
                    default:
                        h2.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new s1(this), new s1(this));
        this.a = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.a;
        r61Var2.Y2.r = false;
        final int i11 = 1;
        r61Var2.A1(new Utilities.Callback2(this) { // from class: gg.r1
            public final /* synthetic */ h2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        h2.V(this.b, (ArrayList) obj, (j61) obj2);
                        break;
                    default:
                        h2.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        z1Var.addView(this.a, a6.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        this.fragmentView = z1Var;
        return z1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r61 r61Var;
        j61 j61Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (r61Var = this.a) == null || (j61Var = r61Var.Y2) == null) {
            return;
        }
        j61Var.N(true);
    }

    public final void e0(v51 v51Var, View view) {
        j2 j2Var = (j2) v51Var.G;
        g2 g2Var = (g2) view;
        Integer valueOf = Integer.valueOf(j2Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(j2Var.a));
        } else {
            arrayList.add(Integer.valueOf(j2Var.a));
        }
        this.a.v1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(j2Var.a));
        v51Var.e = contains;
        g2Var.d.a(contains, true);
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
            j2 c10 = k2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || k2.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            em.q(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), wr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        k2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
