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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class m70 extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final l70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final i70 W;
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
    public m30 j0;
    public int k0;
    public org.telegram.ui.z60 l0;
    public org.telegram.ui.fu m0;
    public ArrayList n0;
    public int o0;
    public final float p0;
    public final org.telegram.ui.ActionBar.n2 q0;
    public final androidx.mediarouter.app.x r0;
    public int s0;
    public final y10 t0;
    public int u0;
    public final long v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public TLRPC.TL_chatInviteExported z0;

    public m70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e0 = new ArrayList();
        this.f0 = new a0.i();
        this.h0 = 0.0f;
        this.r0 = new androidx.mediarouter.app.x(this, 9);
        this.T = iVar;
        this.G = false;
        this.q0 = n2Var;
        this.v0 = j3;
        fixNavigationBar();
        this.w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        i70 i70Var = new i70(this);
        this.W = i70Var;
        this.e = i70Var;
        ai.w0 w0Var = this.d;
        g70 g70Var = new g70(this);
        this.f = g70Var;
        w0Var.setAdapter(g70Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        l70 l70Var = new l70(this, context);
        this.U = l70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.wb(this, j3, n2Var, iVar, context));
        ai.w0 w0Var2 = this.d;
        e70 e70Var = new e70();
        e70Var.o = qr.f;
        e70Var.e = 150L;
        e70Var.c = 150L;
        e70Var.d = 150L;
        setShowWithoutAnimation(false);
        w0Var2.setItemAnimator(e70Var);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(l70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, f6Var, false);
        this.t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.fo(this, context, j3, 3));
        y10Var.e(false, false);
        y10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(y10Var, y10.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M(m70 m70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.h0 adapter = m70Var.d.getAdapter();
        i70 i70Var = m70Var.W;
        TLObject tLObject = null;
        if (adapter == i70Var) {
            int size = i70Var.c.size();
            int size2 = m70Var.W.e.e.size();
            int size3 = m70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) m70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) m70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) m70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (m70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(m70Var.w.J);
            }
        } else if (i10 == m70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(m70Var.currentAccount).getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(m70Var.currentAccount).getChatFull(j3);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a4.a.q(MessagesController.getInstance(m70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    m70Var.dismiss();
                    xc.j(n2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!m70Var.y0) {
                    m70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(m70Var.currentAccount).getInputPeer(-m70Var.v0);
                    ConnectionsManager.getInstance(m70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new x1(m70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= m70Var.Y && i10 < m70Var.Z) {
            tLObject = ((g70) m70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (iVar == null || iVar.h(j10) < 0) {
                if (j10 != 0) {
                    if (m70Var.f0.h(j10) >= 0) {
                        m30 m30Var = (m30) m70Var.f0.f(j10);
                        m70Var.f0.l(j10);
                        m70Var.U.b(m30Var);
                    } else {
                        m30 m30Var2 = new m30(context, tLObject);
                        m30Var2.setOnClickListener(m70Var.r0);
                        m70Var.f0.k(m30Var2, j10);
                        m70Var.U.a(m30Var2, true);
                    }
                }
                m70Var.a0(true);
                AndroidUtilities.updateVisibleRows(m70Var.d);
            }
        }
    }

    public static void N(m70 m70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = m70Var.f0;
        if ((m70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (m70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) m70Var.m0.b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f;
            if (czVar != null) {
                czVar.a();
            }
            m70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(m70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(m70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new mv(m70Var, 7));
        hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void O(m70 m70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            m70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(m70Var.currentAccount).getChatFull(m70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = m70Var.z0;
            }
            if (m70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.z0.link));
            xc.j(m70Var.q0).j();
            m70Var.dismiss();
        }
        m70Var.y0 = false;
    }

    public static /* synthetic */ void P(m70 m70Var, ValueAnimator valueAnimator) {
        m70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m70Var.containerView.invalidate();
    }

    public static void Q(m70 m70Var) {
        a0.i iVar = m70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(m70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.z60 z60Var = m70Var.l0;
        if (z60Var != null) {
            z60Var.i(0, arrayList);
        }
        m70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.e71
    public final c71 B(Context context) {
        return new d70(this, context);
    }

    @Override // org.telegram.ui.Components.e71
    public final void D(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
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
            n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            n2Var = null;
        }
        if (n2Var instanceof org.telegram.ui.zn) {
            boolean P9 = ((org.telegram.ui.zn) n2Var).P9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new bv(17, this, h2Var), P9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, h2Var));
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final void F(String str) {
        i70 i70Var = this.W;
        if (i70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(i70Var.h);
            i70Var.h = null;
        }
        i70Var.c.clear();
        i70Var.d.clear();
        i70Var.e.f(null, null);
        i70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        i70Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.h0 adapter = i70Var.n.d.getAdapter();
            m70 m70Var = i70Var.n;
            xl0 xl0Var = m70Var.f;
            if (adapter != xl0Var) {
                m70Var.d.setAdapter(xl0Var);
                return;
            }
            return;
        }
        s4.h0 adapter2 = i70Var.n.d.getAdapter();
        m70 m70Var2 = i70Var.n;
        xl0 xl0Var2 = m70Var2.e;
        if (adapter2 != xl0Var2) {
            m70Var2.d.setAdapter(xl0Var2);
        }
        i70Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        h70 h70Var = new h70(i70Var, str, 0);
        i70Var.h = h70Var;
        dispatchQueue.postRunnable(h70Var, 300L);
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.m0 = fuVar;
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
        l70 l70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            l70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            m30 m30Var = new m30(l70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            l70Var.a(m30Var, false);
            m30Var.setOnClickListener(this.r0);
            i12++;
        }
        a0(false);
        int childCount = l70Var.getChildCount();
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
                    View childAt = l70Var.getChildAt(i11);
                    if (childAt instanceof m30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.m0 == null ? this.g0 ? Math.min(this.s0, dp3) : 0 : org.telegram.messenger.l0.b(52.0f, Math.min(this.s0, dp3), 0);
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
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z12) {
                v1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h0, z12 ? 1.0f : 0.0f);
                this.i0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 27));
                this.i0.addListener(new ba(13, this, z12));
                this.i0.setDuration(150L);
                this.i0.start();
            } else {
                this.h0 = z12 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z12) {
                    v1Var.setVisibility(8);
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

    @Override // org.telegram.ui.Components.e71, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.w0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (n2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) n2Var).T9(true, true);
                }
            }
        }
    }
}
