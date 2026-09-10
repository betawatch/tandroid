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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class k70 extends b71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final j70 U;
    public final org.telegram.ui.ActionBar.x1 V;
    public final g70 W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public AnimatorSet d0;
    public final ArrayList e0;
    public final a0.i f0;
    public boolean g0;
    public float h0;
    public ValueAnimator i0;
    public w30 j0;
    public int k0;
    public org.telegram.ui.z60 l0;
    public org.telegram.ui.iu m0;
    public ArrayList n0;
    public int o0;
    public final float p0;
    public final org.telegram.ui.ActionBar.p2 q0;
    public final androidx.mediarouter.app.x r0;
    public int s0;
    public final h20 t0;
    public int u0;
    public final long v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public TLRPC.TL_chatInviteExported z0;

    public k70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e0 = new ArrayList();
        this.f0 = new a0.i();
        this.h0 = 0.0f;
        this.r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.q0 = p2Var;
        this.v0 = j3;
        fixNavigationBar();
        this.w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        g70 g70Var = new g70(this);
        this.W = g70Var;
        this.e = g70Var;
        bi.y1 y1Var = this.d;
        e70 e70Var = new e70(this);
        this.f = e70Var;
        y1Var.setAdapter(e70Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        j70 j70Var = new j70(this, context);
        this.U = j70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.xb(this, j3, p2Var, iVar, context));
        bi.y1 y1Var2 = this.d;
        c70 c70Var = new c70();
        c70Var.o = wr.f;
        c70Var.e = 150L;
        c70Var.c = 150L;
        c70Var.d = 150L;
        setShowWithoutAnimation(false);
        y1Var2.setItemAnimator(c70Var);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.V = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(j70Var);
        this.containerView.addView(x1Var);
        h20 h20Var = new h20(context, f6Var, false);
        this.t0 = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        h20Var.setOnClickListener(new org.telegram.ui.jo(this, context, j3, 3));
        h20Var.e(false, false);
        h20Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(h20Var, h20.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M(k70 k70Var, long j3, org.telegram.ui.ActionBar.p2 p2Var, a0.i iVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.h0 adapter = k70Var.d.getAdapter();
        g70 g70Var = k70Var.W;
        TLObject tLObject = null;
        if (adapter == g70Var) {
            int size = g70Var.c.size();
            int size2 = k70Var.W.e.e.size();
            int size3 = k70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) k70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) k70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) k70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (k70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(k70Var.w.J);
            }
        } else if (i10 == k70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(k70Var.currentAccount).getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k70Var.currentAccount).getChatFull(j3);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a4.a.q(MessagesController.getInstance(k70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    k70Var.dismiss();
                    wc.j(p2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!k70Var.y0) {
                    k70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(k70Var.currentAccount).getInputPeer(-k70Var.v0);
                    ConnectionsManager.getInstance(k70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new z1(k70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= k70Var.Y && i10 < k70Var.Z) {
            tLObject = ((e70) k70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (iVar == null || iVar.h(j10) < 0) {
                if (j10 != 0) {
                    if (k70Var.f0.h(j10) >= 0) {
                        w30 w30Var = (w30) k70Var.f0.f(j10);
                        k70Var.f0.l(j10);
                        k70Var.U.b(w30Var);
                    } else {
                        w30 w30Var2 = new w30(context, tLObject);
                        w30Var2.setOnClickListener(k70Var.r0);
                        k70Var.f0.k(w30Var2, j10);
                        k70Var.U.a(w30Var2, true);
                    }
                }
                k70Var.a0(true);
                AndroidUtilities.updateVisibleRows(k70Var.d);
            }
        }
    }

    public static void N(k70 k70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = k70Var.f0;
        if ((k70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (k70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.fz fzVar = (org.telegram.ui.fz) k70Var.m0.b;
            ArrayList arrayList2 = fzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            fzVar.Z();
            org.telegram.ui.ez ezVar = fzVar.f;
            if (ezVar != null) {
                ezVar.a();
            }
            k70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(k70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(k70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            d2Var.T = spannableStringBuilder;
        } else {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new pv(k70Var, 6));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void O(k70 k70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            k70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k70Var.currentAccount).getChatFull(k70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = k70Var.z0;
            }
            if (k70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k70Var.z0.link));
            wc.j(k70Var.q0).j();
            k70Var.dismiss();
        }
        k70Var.y0 = false;
    }

    public static /* synthetic */ void P(k70 k70Var, ValueAnimator valueAnimator) {
        k70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k70Var.containerView.invalidate();
    }

    public static void Q(k70 k70Var) {
        a0.i iVar = k70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(k70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = k70Var.l0;
        if (z60Var != null) {
            z60Var.k(0, arrayList);
        }
        k70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.b71
    public final z61 C(Context context) {
        return new b70(this, context);
    }

    @Override // org.telegram.ui.Components.b71
    public final void D(MotionEvent motionEvent, bi.t2 t2Var) {
        org.telegram.ui.ActionBar.p2 p2Var;
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
            p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            p2Var = null;
        }
        if (p2Var instanceof org.telegram.ui.eo) {
            boolean P9 = ((org.telegram.ui.eo) p2Var).P9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new hy(14, this, t2Var), P9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            t2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new s1(2, t2Var));
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final void F(String str) {
        g70 g70Var = this.W;
        if (g70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(g70Var.h);
            g70Var.h = null;
        }
        g70Var.c.clear();
        g70Var.d.clear();
        g70Var.e.f(null, null);
        g70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        g70Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.h0 adapter = g70Var.n.d.getAdapter();
            k70 k70Var = g70Var.n;
            ul0 ul0Var = k70Var.f;
            if (adapter != ul0Var) {
                k70Var.d.setAdapter(ul0Var);
                return;
            }
            return;
        }
        s4.h0 adapter2 = g70Var.n.d.getAdapter();
        k70 k70Var2 = g70Var.n;
        ul0 ul0Var2 = k70Var2.e;
        if (adapter2 != ul0Var2) {
            k70Var2.d.setAdapter(ul0Var2);
        }
        g70Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        f70 f70Var = new f70(g70Var, str, 0);
        g70Var.h = f70Var;
        dispatchQueue.postRunnable(f70Var, 300L);
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.iu iuVar) {
        this.m0 = iuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.n0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(ArrayList arrayList) {
        j70 j70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            j70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            w30 w30Var = new w30(j70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            j70Var.a(w30Var, false);
            w30Var.setOnClickListener(this.r0);
            i12++;
        }
        a0(false);
        int childCount = j70Var.getChildCount();
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
                    View childAt = j70Var.getChildAt(i11);
                    if (childAt instanceof w30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.m0 == null ? this.g0 ? Math.min(this.s0, dp3) : 0 : hc.b.g(52.0f, Math.min(this.s0, dp3), 0);
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
            org.telegram.ui.ActionBar.x1 x1Var = this.V;
            if (z12) {
                x1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h0, z12 ? 1.0f : 0.0f);
                this.i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.i0.addListener(new yo(9, this, z12));
                this.i0.setDuration(150L);
                this.i0.start();
            } else {
                this.h0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    x1Var.setVisibility(8);
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
            long j3 = this.v0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
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

    @Override // org.telegram.ui.Components.b71, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (p2Var instanceof org.telegram.ui.eo) {
                    ((org.telegram.ui.eo) p2Var).T9(true, true);
                }
            }
        }
    }
}
