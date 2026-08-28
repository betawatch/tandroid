package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class k60 extends s51 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h P;
    public final j60 Q;
    public final org.telegram.ui.ActionBar.w1 R;
    public final g60 S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public AnimatorSet Z;
    public final ArrayList a0;
    public final a0.h b0;
    public boolean c0;
    public float d0;
    public ValueAnimator e0;
    public w20 f0;
    public int g0;
    public org.telegram.ui.f60 h0;
    public org.telegram.ui.wt i0;
    public ArrayList j0;
    public int k0;
    public final float l0;
    public final org.telegram.ui.ActionBar.o2 m0;
    public final androidx.mediarouter.app.y n0;
    public int o0;
    public final j10 p0;
    public int q0;
    public final long r0;
    public boolean s0;
    public float t0;
    public boolean u0;
    public TLRPC.TL_chatInviteExported v0;

    public k60(Context context, int i9, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.a0 = new ArrayList();
        this.b0 = new a0.h();
        this.d0 = 0.0f;
        this.n0 = new androidx.mediarouter.app.y(this, 9);
        this.P = hVar;
        this.C = false;
        this.m0 = o2Var;
        this.r0 = j10;
        fixNavigationBar();
        this.w.F.setHint(LocaleController.getString(R.string.SearchForChats));
        this.l0 = ViewConfiguration.get(context).getScaledTouchSlop();
        g60 g60Var = new g60(this);
        this.S = g60Var;
        this.e = g60Var;
        gh.f1 f1Var = this.d;
        e60 e60Var = new e60(this);
        this.f = e60Var;
        f1Var.setAdapter(e60Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i9).contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.a0.add(user);
            }
        }
        j60 j60Var = new j60(this, context);
        this.Q = j60Var;
        this.d.setOnItemClickListener(new org.telegram.ui.qb(this, j10, o2Var, hVar, context));
        gh.f1 f1Var2 = this.d;
        c60 c60Var = new c60();
        c60Var.o = gr.f;
        c60Var.e = 150L;
        c60Var.c = 150L;
        c60Var.d = 150L;
        setShowWithoutAnimation(false);
        f1Var2.setItemAnimator(c60Var);
        a0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.R = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(j60Var);
        this.containerView.addView(w1Var);
        j10 j10Var = new j10(context, b6Var, false);
        this.p0 = j10Var;
        j10Var.setImageResource(R.drawable.floating_check);
        j10Var.setOnClickListener(new gh.s2(this, context, j10, 4));
        j10Var.e(false, false);
        j10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(j10Var, j10.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L(k60 k60Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context, int i9) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        f2.r0 adapter = k60Var.d.getAdapter();
        g60 g60Var = k60Var.S;
        TLObject tLObject = null;
        if (adapter == g60Var) {
            int size = g60Var.c.size();
            int size2 = k60Var.S.e.e.size();
            int size3 = k60Var.S.e.d.size();
            int i10 = i9 - 1;
            if (i10 >= 0 && i10 < size) {
                tLObject = (TLObject) k60Var.S.c.get(i10);
            } else if (i10 >= size && i10 < size3 + size) {
                tLObject = (TLObject) k60Var.S.e.d.get(i10 - size);
            } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                tLObject = (TLObject) k60Var.S.e.e.get(((i10 - size) - size3) - 1);
            }
            if (k60Var.i0 != null) {
                AndroidUtilities.hideKeyboard(k60Var.w.F);
            }
        } else if (i9 == k60Var.T) {
            TLRPC.Chat chat = MessagesController.getInstance(k60Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k60Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = aa.d.p(MessagesController.getInstance(k60Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    k60Var.dismiss();
                    oc.j(o2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!k60Var.u0) {
                    k60Var.u0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(k60Var.currentAccount).getInputPeer(-k60Var.r0);
                    ConnectionsManager.getInstance(k60Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new w1(k60Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i9 >= k60Var.U && i9 < k60Var.V) {
            tLObject = ((e60) k60Var.f).E(i9);
        }
        if (tLObject != null) {
            long j11 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (k60Var.b0.h(j11) >= 0) {
                        w20 w20Var = (w20) k60Var.b0.f(j11);
                        k60Var.b0.l(j11);
                        k60Var.Q.b(w20Var);
                    } else {
                        w20 w20Var2 = new w20(context, tLObject);
                        w20Var2.setOnClickListener(k60Var.n0);
                        k60Var.b0.k(w20Var2, j11);
                        k60Var.Q.a(w20Var2, true);
                    }
                }
                k60Var.Z(true);
                AndroidUtilities.updateVisibleRows(k60Var.d);
            }
        }
    }

    public static void M(k60 k60Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = k60Var.b0;
        if ((k60Var.i0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (k60Var.i0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < hVar.m(); i9++) {
                arrayList.add(Long.valueOf(hVar.j(i9)));
            }
            org.telegram.ui.my myVar = (org.telegram.ui.my) k60Var.i0.b;
            ArrayList arrayList2 = myVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            myVar.Y();
            org.telegram.ui.ly lyVar = myVar.f;
            if (lyVar != null) {
                lyVar.a();
            }
            k60Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TLRPC.User user = MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(hVar.j(i10)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(k60Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            c2Var.P = spannableStringBuilder;
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new wu(k60Var, 6));
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void N(k60 k60Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            k60Var.v0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k60Var.currentAccount).getChatFull(k60Var.r0);
            if (chatFull != null) {
                chatFull.exported_invite = k60Var.v0;
            }
            if (k60Var.v0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k60Var.v0.link));
            oc.j(k60Var.m0).j();
            k60Var.dismiss();
        }
        k60Var.u0 = false;
    }

    public static /* synthetic */ void O(k60 k60Var, ValueAnimator valueAnimator) {
        k60Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k60Var.containerView.invalidate();
    }

    public static void P(k60 k60Var) {
        a0.h hVar = k60Var.b0;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            arrayList.add(MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(hVar.j(i9))));
        }
        org.telegram.ui.f60 f60Var = k60Var.h0;
        if (f60Var != null) {
            f60Var.j(0, arrayList);
        }
        k60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.s51
    public final q51 C(Context context) {
        return new b60(this, context);
    }

    @Override // org.telegram.ui.Components.s51
    public final void D(MotionEvent motionEvent, fg.g gVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (motionEvent.getAction() == 0) {
            this.t0 = this.y;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.y - this.t0) >= this.l0 || this.s0) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            o2Var = null;
        }
        if (o2Var instanceof org.telegram.ui.qn) {
            boolean P9 = ((org.telegram.ui.qn) o2Var).P9();
            this.s0 = true;
            AndroidUtilities.runOnUIThread(new zq(23, this, gVar), P9 ? 200L : 0L);
        } else {
            this.s0 = true;
            setFocusable(true);
            gVar.requestFocus();
            AndroidUtilities.runOnUIThread(new p1(2, gVar));
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final void F(String str) {
        g60 g60Var = this.S;
        if (g60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(g60Var.h);
            g60Var.h = null;
        }
        g60Var.c.clear();
        g60Var.d.clear();
        g60Var.e.f(null, null);
        g60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        g60Var.l();
        if (TextUtils.isEmpty(str)) {
            f2.r0 adapter = g60Var.n.d.getAdapter();
            k60 k60Var = g60Var.n;
            vk0 vk0Var = k60Var.f;
            if (adapter != vk0Var) {
                k60Var.d.setAdapter(vk0Var);
                return;
            }
            return;
        }
        f2.r0 adapter2 = g60Var.n.d.getAdapter();
        k60 k60Var2 = g60Var.n;
        vk0 vk0Var2 = k60Var2.e;
        if (adapter2 != vk0Var2) {
            k60Var2.d.setAdapter(vk0Var2);
        }
        g60Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        f60 f60Var = new f60(g60Var, str, 0);
        g60Var.h = f60Var;
        dispatchQueue.postRunnable(f60Var, 300L);
    }

    public boolean W() {
        return true;
    }

    public final void X(org.telegram.ui.wt wtVar) {
        this.i0 = wtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(ArrayList arrayList) {
        j60 j60Var;
        float max;
        int i9;
        int i10;
        int min;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            j60Var = this.Q;
            if (i11 >= size) {
                break;
            }
            Long l10 = (Long) arrayList.get(i11);
            long longValue = l10.longValue();
            w20 w20Var = new w20(j60Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l10));
            j60Var.a(w20Var, false);
            w20Var.setOnClickListener(this.n0);
            i11++;
        }
        Z(false);
        int childCount = j60Var.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x < point.y;
        if (AndroidUtilities.isTablet() || z10) {
            this.o0 = AndroidUtilities.dp(144.0f);
        } else {
            this.o0 = AndroidUtilities.dp(56.0f);
        }
        if (AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            max = Math.min(point2.x, point2.y) * 0.8f;
        } else {
            if (z10) {
                i9 = AndroidUtilities.displaySize.x;
                int dp = i9 - AndroidUtilities.dp(26.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i12 = 0;
                for (i10 = 0; i10 < childCount; i10++) {
                    View childAt = j60Var.getChildAt(i10);
                    if (childAt instanceof w20) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i12 > dp) {
                            dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i12 = 0;
                        }
                        i12 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i12);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.i0 == null ? this.c0 ? Math.min(this.o0, dp3) : 0 : org.telegram.messenger.l0.b(52.0f, Math.min(this.o0, dp3), 0);
                int i13 = this.q0;
                int dp4 = this.b0.m() > 0 ? AndroidUtilities.dp(56.0f) : 0;
                this.q0 = dp4;
                if (min == this.k0 || i13 != dp4) {
                    this.k0 = min;
                }
                return;
            }
            max = Math.max(AndroidUtilities.displaySize.x * 0.8f, Math.min(AndroidUtilities.dp(480.0f), AndroidUtilities.displaySize.x));
        }
        i9 = (int) max;
        int dp5 = i9 - AndroidUtilities.dp(26.0f);
        int dp22 = AndroidUtilities.dp(10.0f);
        int i122 = 0;
        while (i10 < childCount) {
        }
        int dp32 = AndroidUtilities.dp(42.0f) + dp22;
        if (this.i0 == null) {
        }
        int i132 = this.q0;
        if (this.b0.m() > 0) {
        }
        this.q0 = dp4;
        if (min == this.k0) {
        }
        this.k0 = min;
    }

    public final void Z(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.b0.m() > 0;
        if (this.c0 != z12) {
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.e0.cancel();
            }
            this.c0 = z12;
            org.telegram.ui.ActionBar.w1 w1Var = this.R;
            if (z12) {
                w1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, z12 ? 1.0f : 0.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 27));
                this.e0.addListener(new u9(13, this, z12));
                this.e0.setDuration(150L);
                this.e0.start();
            } else {
                this.d0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.c0 && this.i0 == null) {
                z11 = false;
            }
            this.p0.e(z11, z10);
        }
    }

    public final void a0() {
        this.U = -1;
        this.V = -1;
        this.T = -1;
        this.W = -1;
        boolean z10 = true;
        this.Y = 1;
        if (this.i0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.r0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = W();
            }
            if (z10) {
                int i9 = this.Y;
                this.Y = i9 + 1;
                this.T = i9;
            }
            ArrayList arrayList = this.a0;
            if (arrayList.size() != 0) {
                int i10 = this.Y;
                this.U = i10;
                int size = arrayList.size() + i10;
                this.Y = size;
                this.V = size;
            } else {
                int i11 = this.Y;
                this.Y = i11 + 1;
                this.W = i11;
            }
        } else if (this.j0.size() != 0) {
            int i12 = this.Y;
            this.U = i12;
            int size2 = this.j0.size() + i12;
            this.Y = size2;
            this.V = size2;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.W = i13;
        }
        int i14 = this.Y;
        this.Y = i14 + 1;
        this.X = i14;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogsNeedReload && this.i0 != null && this.j0.isEmpty()) {
            this.j0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f.l();
        }
    }

    @Override // org.telegram.ui.Components.s51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.s0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (o2Var instanceof org.telegram.ui.qn) {
                    ((org.telegram.ui.qn) o2Var).T9(true, true);
                }
            }
        }
    }
}
