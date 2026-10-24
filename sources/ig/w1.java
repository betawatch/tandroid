package ig;

import ai.cb;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 h;
    public j71 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f;

    public w1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(w1 w1Var, int i10, ArrayList arrayList) {
        if (i10 == w1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((m61) arrayList.get(i11)).G instanceof y1) {
                    ((y1) ((m61) arrayList.get(i11)).G).c = i11;
                }
            }
            z1 f7 = z1.f(w1Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((y1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((y1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((y1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new d6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(w1 w1Var, ArrayList arrayList, b71 b71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        m61 m61Var = new m61(2);
        m61Var.l = string;
        m61Var.o = string2;
        m61Var.m = "RestrictedEmoji";
        m61Var.n = "📝";
        arrayList.add(m61Var);
        b71Var.U();
        z1 f7 = z1.f(w1Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((y1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((y1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.a).quickRepliesLimit) {
            m61 c10 = m61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        w1Var.e = b71Var.M();
        ArrayList arrayList3 = z1.f(w1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            m61 m61Var2 = new m61(16);
            m61Var2.G = y1Var;
            m61Var2.K(w1Var.b.contains(Integer.valueOf(y1Var.a)));
            arrayList.add(m61Var2);
        }
        b71Var.L();
        b71Var.T();
        i2.o1.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(w1 w1Var, m61 m61Var, View view) {
        if (m61Var.d == 1) {
            d0(w1Var.getParentActivity(), w1Var.currentAccount, null, null, w1Var.getResourceProvider(), new k0(w1Var, 2));
            return;
        }
        if (m61Var.a == 16 && (m61Var.G instanceof y1)) {
            if (!w1Var.b.isEmpty()) {
                w1Var.e0(m61Var, view);
                return;
            }
            y1 y1Var = (y1) m61Var.G;
            if (y1Var.g) {
                return;
            }
            Bundle i10 = org.telegram.ui.Cells.b1.i(5, "chatMode");
            i10.putLong("user_id", w1Var.getUserConfig().getClientUserId());
            i10.putString("quick_reply", y1Var.b);
            sn snVar = new sn(i10);
            snVar.tb(y1Var.a);
            w1Var.presentFragment(snVar);
        }
    }

    public static void X(w1 w1Var) {
        w1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) w1Var.a, (Utilities.Callback<View>) new ci.e(4));
        w1Var.actionBar.r();
        w1Var.a.C1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void d0(Activity activity, int i10, String str, y1 y1Var, g6 g6Var, Utilities.Callback callback) {
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder f2Var = z10 ? new f2(activity, 0, g6Var) : new AlertDialog$Builder(activity, 0, g6Var);
        String string = LocaleController.getString((y1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.R = string;
        final p1 p1Var = new p1(activity, g6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        p1Var.setTextSize(1, 18.0f);
        p1Var.setText(y1Var == null ? str == null ? "" : str : y1Var.b);
        int i11 = k6.j5;
        r6.W(p1Var, i11, g6Var);
        r6.m(p1Var, 34, k6.Xh, g6Var);
        p1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        p1Var.setSingleLine(true);
        p1Var.setFocusable(true);
        r6.H(p1Var, k6.k6, k6.l6, k6.p7, g6Var);
        p1Var.setImeOptions(6);
        p1Var.setBackgroundDrawable(null);
        p1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        p1Var.setFilters(new InputFilter[]{new q1()});
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString((y1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        r6.W(textView2, k6.q7, g6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new bc(r15, 23)};
        y2 y2Var = new y2(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        p1Var.addTextChangedListener(new r1(textView2, runnableArr));
        f7.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(p1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.o(f7);
        c2Var.a = AndroidUtilities.dp(292.0f);
        p1Var.setOnEditorActionListener(new s1(p1Var, i10, y1Var, textView2, y2Var, callback, c2VarArr, currentFocus));
        f2Var.k(LocaleController.getString(R.string.Done), new l1(p1Var, y2Var, i10, y1Var, textView2, callback));
        f2Var.h(LocaleController.getString(R.string.Cancel), new fh.b(29));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.c2 c2Var2 = h;
            boolean z11 = false;
            final int i12 = z11 ? 1 : 0;
            c2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.m1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            p1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var2);
                            break;
                        default:
                            p1 p1Var3 = p1Var;
                            p1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var3);
                            break;
                    }
                }
            });
            h.r(250L);
            r32 = z11;
        } else {
            r32 = 0;
            c2Var.O = new k0(p1Var, 3);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new cb(p1Var, 6));
            final int i13 = 1;
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ig.m1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            p1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var2);
                            break;
                        default:
                            p1 p1Var3 = p1Var;
                            p1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var3);
                            break;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[r32].j0 = r32;
        p1Var.setSelection(p1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new n1(this));
        org.telegram.ui.ActionBar.y i10 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(k6.x0(null, k6.y8, false));
        i10.addView(this.c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.u0 a2 = i10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        i10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        final int i11 = 0;
        o1 o1Var = new o1(context, null, i11);
        r6.i(k6.a7, o1Var, null);
        j71 j71Var = new j71(this, new Utilities.Callback2(this) { // from class: ig.j1
            public final /* synthetic */ w1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        w1.V(this.b, (ArrayList) obj, (b71) obj2);
                        break;
                    default:
                        w1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new k1(this), new k1(this));
        this.a = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.a;
        j71Var2.Z2.r = false;
        final int i12 = 1;
        j71Var2.H1(new Utilities.Callback2(this) { // from class: ig.j1
            public final /* synthetic */ w1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        w1.V(this.b, (ArrayList) obj, (b71) obj2);
                        break;
                    default:
                        w1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        o1Var.addView(this.a, z5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        b71 b71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (j71Var = this.a) == null || (b71Var = j71Var.Z2) == null) {
            return;
        }
        b71Var.N(true);
    }

    public final void e0(m61 m61Var, View view) {
        y1 y1Var = (y1) m61Var.G;
        v1 v1Var = (v1) view;
        Integer valueOf = Integer.valueOf(y1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(y1Var.a));
        } else {
            arrayList.add(Integer.valueOf(y1Var.a));
        }
        this.a.C1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(y1Var.a));
        m61Var.e = contains;
        v1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.N(null, null);
            }
        }
        this.c.a(Math.max(1, arrayList.size()), true);
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            y1 c10 = z1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || z1.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            sl.t(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), bs.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        z1.f(this.currentAccount).h();
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            NumberTextView numberTextView = this.c;
            if (numberTextView != null) {
                numberTextView.setTextColor(k6.x0(null, k6.y8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
