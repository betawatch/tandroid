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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class z70 extends r71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final y70 U;
    public final org.telegram.ui.ActionBar.u1 V;
    public final v70 W;
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
    public z30 j0;
    public int k0;
    public org.telegram.ui.e70 l0;
    public org.telegram.ui.mu m0;
    public ArrayList n0;
    public int o0;
    public final float p0;
    public final org.telegram.ui.ActionBar.m2 q0;
    public final androidx.mediarouter.app.w r0;
    public int s0;
    public final l20 t0;
    public int u0;
    public final long v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public TLRPC.TL_chatInviteExported z0;

    public z70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.e0 = new ArrayList();
        this.f0 = new a0.h();
        this.h0 = 0.0f;
        this.r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.q0 = m2Var;
        this.v0 = j10;
        fixNavigationBar();
        this.w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        v70 v70Var = new v70(this);
        this.W = v70Var;
        this.e = v70Var;
        bi.o0 o0Var = this.d;
        t70 t70Var = new t70(this);
        this.f = t70Var;
        o0Var.setAdapter(t70Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        y70 y70Var = new y70(this, context);
        this.U = y70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.bc(this, j10, m2Var, hVar, context));
        bi.o0 o0Var2 = this.d;
        r70 r70Var = new r70();
        r70Var.o = es.f;
        r70Var.e = 150L;
        r70Var.c = 150L;
        r70Var.d = 150L;
        setShowWithoutAnimation(false);
        o0Var2.setItemAnimator(r70Var);
        c0();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 1);
        this.V = u1Var;
        u1Var.setVisibility(8);
        u1Var.setClipChildren(false);
        u1Var.addView(y70Var);
        this.containerView.addView(u1Var);
        l20 l20Var = new l20(context, c6Var, false);
        this.t0 = l20Var;
        l20Var.setImageResource(R.drawable.floating_check);
        l20Var.setOnClickListener(new org.telegram.ui.ko(this, context, j10, 3));
        l20Var.e(false, false);
        l20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(l20Var, l20.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void N(z70 z70Var, long j10, org.telegram.ui.ActionBar.m2 m2Var, a0.h hVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.g0 adapter = z70Var.d.getAdapter();
        v70 v70Var = z70Var.W;
        TLObject tLObject = null;
        if (adapter == v70Var) {
            int size = v70Var.c.size();
            int size2 = z70Var.W.e.e.size();
            int size3 = z70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) z70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) z70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) z70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (z70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(z70Var.w.J);
            }
        } else if (i10 == z70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(z70Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(z70Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a1.g.q(MessagesController.getInstance(z70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    z70Var.dismiss();
                    zc.j(m2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!z70Var.y0) {
                    z70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(z70Var.currentAccount).getInputPeer(-z70Var.v0);
                    ConnectionsManager.getInstance(z70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new y1(z70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= z70Var.Y && i10 < z70Var.Z) {
            tLObject = ((t70) z70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j11 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (z70Var.f0.h(j11) >= 0) {
                        z30 z30Var = (z30) z70Var.f0.f(j11);
                        z70Var.f0.l(j11);
                        z70Var.U.b(z30Var);
                    } else {
                        z30 z30Var2 = new z30(context, tLObject);
                        z30Var2.setOnClickListener(z70Var.r0);
                        z70Var.f0.k(z30Var2, j11);
                        z70Var.U.a(z30Var2, true);
                    }
                }
                z70Var.b0(true);
                AndroidUtilities.updateVisibleRows(z70Var.d);
            }
        }
    }

    public static void O(z70 z70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = z70Var.f0;
        if ((z70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (z70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.hz hzVar = (org.telegram.ui.hz) z70Var.m0.b;
            ArrayList arrayList2 = hzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            hzVar.Z();
            org.telegram.ui.gz gzVar = hzVar.f;
            if (gzVar != null) {
                gzVar.a();
            }
            z70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(z70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(z70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            a2Var.T = spannableStringBuilder;
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new xv(z70Var, 7));
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void P(z70 z70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            z70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(z70Var.currentAccount).getChatFull(z70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = z70Var.z0;
            }
            if (z70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", z70Var.z0.link));
            zc.j(z70Var.q0).j();
            z70Var.dismiss();
        }
        z70Var.y0 = false;
    }

    public static /* synthetic */ void Q(z70 z70Var, ValueAnimator valueAnimator) {
        z70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z70Var.containerView.invalidate();
    }

    public static void R(z70 z70Var) {
        a0.h hVar = z70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(z70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.e70 e70Var = z70Var.l0;
        if (e70Var != null) {
            e70Var.i(0, arrayList);
        }
        z70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.r71
    public final p71 E(Context context) {
        return new q70(this, context);
    }

    @Override // org.telegram.ui.Components.r71
    public final void F(MotionEvent motionEvent, di.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
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
            m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            m2Var = null;
        }
        if (m2Var instanceof org.telegram.ui.fo) {
            boolean U9 = ((org.telegram.ui.fo) m2Var).U9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new vm(29, this, g2Var), U9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            g2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, g2Var));
        }
    }

    @Override // org.telegram.ui.Components.r71
    public final void H(String str) {
        v70 v70Var = this.W;
        if (v70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(v70Var.h);
            v70Var.h = null;
        }
        v70Var.c.clear();
        v70Var.d.clear();
        v70Var.e.f(null, null);
        v70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        v70Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.g0 adapter = v70Var.n.d.getAdapter();
            z70 z70Var = v70Var.n;
            lm0 lm0Var = z70Var.f;
            if (adapter != lm0Var) {
                z70Var.d.setAdapter(lm0Var);
                return;
            }
            return;
        }
        s4.g0 adapter2 = v70Var.n.d.getAdapter();
        z70 z70Var2 = v70Var.n;
        lm0 lm0Var2 = z70Var2.e;
        if (adapter2 != lm0Var2) {
            z70Var2.d.setAdapter(lm0Var2);
        }
        v70Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        u70 u70Var = new u70(v70Var, str, 0);
        v70Var.h = u70Var;
        dispatchQueue.postRunnable(u70Var, 300L);
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.mu muVar) {
        this.m0 = muVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(ArrayList arrayList) {
        y70 y70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            y70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            z30 z30Var = new z30(y70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            y70Var.a(z30Var, false);
            z30Var.setOnClickListener(this.r0);
            i12++;
        }
        b0(false);
        int childCount = y70Var.getChildCount();
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
                    View childAt = y70Var.getChildAt(i11);
                    if (childAt instanceof z30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.g0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.g0.C(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.m0 == null ? this.g0 ? Math.min(this.s0, dp3) : 0 : org.telegram.messenger.g0.b(52.0f, Math.min(this.s0, dp3), 0);
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

    public final void b0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.f0.m() > 0;
        if (this.g0 != z12) {
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.i0.cancel();
            }
            this.g0 = z12;
            org.telegram.ui.ActionBar.u1 u1Var = this.V;
            if (z12) {
                u1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h0, z12 ? 1.0f : 0.0f);
                this.i0 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 28));
                this.i0.addListener(new org.telegram.ui.vo(14, this, z12));
                this.i0.setDuration(150L);
                this.i0.start();
            } else {
                this.h0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    u1Var.setVisibility(8);
                }
            }
            if (!this.g0 && this.m0 == null) {
                z11 = false;
            }
            this.t0.e(z11, z10);
        }
    }

    public final void c0() {
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
                z10 = Y();
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

    @Override // org.telegram.ui.Components.r71, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (m2Var instanceof org.telegram.ui.fo) {
                    ((org.telegram.ui.fo) m2Var).Y9(true, true);
                }
            }
        }
    }
}
