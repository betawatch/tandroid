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
import org.telegram.messenger.DispatchQueue2;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class y70 extends b81 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final x70 U;
    public final org.telegram.ui.ActionBar.w1 V;
    public final u70 W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public AnimatorSet d0;
    public final ArrayList e0;
    public final a0.h f0;
    public boolean g0;
    public float h0;
    public ValueAnimator i0;
    public x30 j0;
    public int k0;
    public org.telegram.ui.m60 l0;
    public org.telegram.ui.qt m0;
    public ArrayList n0;
    public int o0;
    public final float p0;
    public final org.telegram.ui.ActionBar.r2 q0;
    public final androidx.mediarouter.app.x r0;
    public int s0;
    public final j20 t0;
    public int u0;
    public final long v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public TLRPC.TL_chatInviteExported z0;

    public y70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.e0 = new ArrayList();
        this.f0 = new a0.h();
        this.h0 = 0.0f;
        this.r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = hVar;
        this.G = false;
        this.q0 = r2Var;
        this.v0 = j10;
        fixNavigationBar();
        this.w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        u70 u70Var = new u70(this);
        this.W = u70Var;
        this.e = u70Var;
        bi.r1 r1Var = this.d;
        s70 s70Var = new s70(this);
        this.f = s70Var;
        r1Var.setAdapter(s70Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        x70 x70Var = new x70(this, context);
        this.U = x70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j10, r2Var, hVar, context));
        bi.r1 r1Var2 = this.d;
        q70 q70Var = new q70();
        q70Var.o = ds.f;
        q70Var.e = 150L;
        q70Var.c = 150L;
        q70Var.d = 150L;
        setShowWithoutAnimation(false);
        r1Var2.setItemAnimator(q70Var);
        b0();
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 1);
        this.V = w1Var;
        w1Var.setVisibility(8);
        w1Var.setClipChildren(false);
        w1Var.addView(x70Var);
        this.containerView.addView(w1Var);
        j20 j20Var = new j20(context, u6Var, false);
        this.t0 = j20Var;
        j20Var.setImageResource(R.drawable.floating_check);
        j20Var.setOnClickListener(new bi.p3(this, context, j10, 4));
        j20Var.e(false, false);
        j20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(j20Var, j20.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M(y70 y70Var, long j10, org.telegram.ui.ActionBar.r2 r2Var, a0.h hVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.h0 adapter = y70Var.d.getAdapter();
        u70 u70Var = y70Var.W;
        TLObject tLObject = null;
        if (adapter == u70Var) {
            int size = u70Var.c.size();
            int size2 = y70Var.W.e.e.size();
            int size3 = y70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) y70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) y70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) y70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (y70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(y70Var.w.J);
            }
        } else if (i10 == y70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(y70Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(y70Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a1.g.q(MessagesController.getInstance(y70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    y70Var.dismiss();
                    wc.j(r2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!y70Var.y0) {
                    y70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(y70Var.currentAccount).getInputPeer(-y70Var.v0);
                    ConnectionsManager.getInstance(y70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new b2(y70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= y70Var.Y && i10 < y70Var.Z) {
            tLObject = ((s70) y70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j11 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (y70Var.f0.h(j11) >= 0) {
                        x30 x30Var = (x30) y70Var.f0.f(j11);
                        y70Var.f0.l(j11);
                        y70Var.U.b(x30Var);
                    } else {
                        x30 x30Var2 = new x30(context, tLObject);
                        x30Var2.setOnClickListener(y70Var.r0);
                        y70Var.f0.k(x30Var2, j11);
                        y70Var.U.a(x30Var2, true);
                    }
                }
                y70Var.a0(true);
                AndroidUtilities.updateVisibleRows(y70Var.d);
            }
        }
    }

    public static void N(y70 y70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = y70Var.f0;
        if ((y70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (y70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ly lyVar = (org.telegram.ui.ly) y70Var.m0.b;
            ArrayList arrayList2 = lyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            lyVar.a0();
            org.telegram.ui.ky kyVar = lyVar.f;
            if (kyVar != null) {
                kyVar.a();
            }
            y70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(y70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(y70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            e2Var.T = spannableStringBuilder;
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(y70Var, 7));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void O(y70 y70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            y70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(y70Var.currentAccount).getChatFull(y70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = y70Var.z0;
            }
            if (y70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y70Var.z0.link));
            wc.j(y70Var.q0).j();
            y70Var.dismiss();
        }
        y70Var.y0 = false;
    }

    public static /* synthetic */ void P(y70 y70Var, ValueAnimator valueAnimator) {
        y70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y70Var.containerView.invalidate();
    }

    public static void Q(y70 y70Var) {
        a0.h hVar = y70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(y70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.m60 m60Var = y70Var.l0;
        if (m60Var != null) {
            m60Var.f(0, arrayList);
        }
        y70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.b81
    public final z71 C(Context context) {
        return new p70(this, context);
    }

    @Override // org.telegram.ui.Components.b81
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (motionEvent.getAction() == 0) {
            this.x0 = this.y;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.y - this.x0) >= this.p0 || this.w0) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            r2Var = null;
        }
        if (r2Var instanceof org.telegram.ui.un) {
            boolean Z9 = ((org.telegram.ui.un) r2Var).Z9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new so(28, this, c2Var), Z9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            c2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new o70(c2Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.b81
    public final void G(String str) {
        u70 u70Var = this.W;
        if (u70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(u70Var.h);
            u70Var.h = null;
        }
        u70Var.c.clear();
        u70Var.d.clear();
        u70Var.e.f(null, null);
        u70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        u70Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.h0 adapter = u70Var.n.d.getAdapter();
            y70 y70Var = u70Var.n;
            lm0 lm0Var = y70Var.f;
            if (adapter != lm0Var) {
                y70Var.d.setAdapter(lm0Var);
                return;
            }
            return;
        }
        s4.h0 adapter2 = u70Var.n.d.getAdapter();
        y70 y70Var2 = u70Var.n;
        lm0 lm0Var2 = y70Var2.e;
        if (adapter2 != lm0Var2) {
            y70Var2.d.setAdapter(lm0Var2);
        }
        u70Var.n.s.e(true, false);
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        t70 t70Var = new t70(u70Var, str, 0);
        u70Var.h = t70Var;
        dispatchQueue2.postRunnable(t70Var, 300L);
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.qt qtVar) {
        this.m0 = qtVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(ArrayList arrayList) {
        x70 x70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            x70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            x30 x30Var = new x30(x70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            x70Var.a(x30Var, false);
            x30Var.setOnClickListener(this.r0);
            i12++;
        }
        a0(false);
        int childCount = x70Var.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x < point.y;
        if (AndroidUtilities.isTablet() || z10) {
            this.s0 = AndroidUtilities.dp(144.0f);
        } else {
            this.s0 = AndroidUtilities.dp(56.0f);
        }
        if (AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            max = Math.min(point2.x, point2.y) * 0.8f;
        } else {
            if (z10) {
                i10 = AndroidUtilities.displaySize.x;
                int dp = i10 - AndroidUtilities.dp(26.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i13 = 0;
                for (i11 = 0; i11 < childCount; i11++) {
                    View childAt = x70Var.getChildAt(i11);
                    if (childAt instanceof x30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.m0 == null ? this.g0 ? Math.min(this.s0, dp3) : 0 : org.telegram.messenger.t.c(52.0f, Math.min(this.s0, dp3), 0);
                int i14 = this.u0;
                int dp4 = this.f0.m() > 0 ? AndroidUtilities.dp(56.0f) : 0;
                this.u0 = dp4;
                if (min == this.o0 || i14 != dp4) {
                    this.o0 = min;
                }
                return;
            }
            max = Math.max(AndroidUtilities.displaySize.x * 0.8f, Math.min(AndroidUtilities.dp(480.0f), AndroidUtilities.displaySize.x));
        }
        i10 = (int) max;
        int dp5 = i10 - AndroidUtilities.dp(26.0f);
        int dp22 = AndroidUtilities.dp(10.0f);
        int i132 = 0;
        while (i11 < childCount) {
        }
        int dp32 = AndroidUtilities.dp(42.0f) + dp22;
        if (this.m0 == null) {
        }
        int i142 = this.u0;
        if (this.f0.m() > 0) {
        }
        this.u0 = dp4;
        if (min == this.o0) {
        }
        this.o0 = min;
    }

    public final void a0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.f0.m() > 0;
        if (this.g0 != z12) {
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.i0.cancel();
            }
            this.g0 = z12;
            org.telegram.ui.ActionBar.w1 w1Var = this.V;
            if (z12) {
                w1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h0, z12 ? 1.0f : 0.0f);
                this.i0 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 28));
                this.i0.addListener(new org.telegram.ui.jo(14, this, z12));
                this.i0.setDuration(150L);
                this.i0.start();
            } else {
                this.h0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    w1Var.setVisibility(8);
                }
            }
            if (!this.g0 && this.m0 == null) {
                z11 = false;
            }
            this.t0.e(z11, z10);
        }
    }

    public final void b0() {
        this.Y = -1;
        this.Z = -1;
        this.X = -1;
        this.a0 = -1;
        boolean z10 = true;
        this.c0 = 1;
        if (this.m0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z10 = X();
            }
            if (z10) {
                int i10 = this.c0;
                this.c0 = i10 + 1;
                this.X = i10;
            }
            ArrayList arrayList = this.e0;
            if (arrayList.size() != 0) {
                int i11 = this.c0;
                this.Y = i11;
                int size = arrayList.size() + i11;
                this.c0 = size;
                this.Z = size;
            } else {
                int i12 = this.c0;
                this.c0 = i12 + 1;
                this.a0 = i12;
            }
        } else if (this.n0.size() != 0) {
            int i13 = this.c0;
            this.Y = i13;
            int size2 = this.n0.size() + i13;
            this.c0 = size2;
            this.Z = size2;
        } else {
            int i14 = this.c0;
            this.c0 = i14 + 1;
            this.a0 = i14;
        }
        int i15 = this.c0;
        this.c0 = i15 + 1;
        this.b0 = i15;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.m0 != null && this.n0.isEmpty()) {
            this.n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f.l();
        }
    }

    @Override // org.telegram.ui.Components.b81, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (r2Var instanceof org.telegram.ui.un) {
                    ((org.telegram.ui.un) r2Var).da(true, true);
                }
            }
        }
    }
}
