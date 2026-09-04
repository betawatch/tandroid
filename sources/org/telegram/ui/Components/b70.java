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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class b70 extends o61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.i T;
    public final a70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final x60 W;
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
    public org.telegram.ui.a70 l0;
    public org.telegram.ui.iu m0;
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

    public b70(Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
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
        x60 x60Var = new x60(this);
        this.W = x60Var;
        this.e = x60Var;
        bi.o0 o0Var = this.d;
        v60 v60Var = new v60(this);
        this.f = v60Var;
        o0Var.setAdapter(v60Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        a70 a70Var = new a70(this, context);
        this.U = a70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.vb(this, j3, n2Var, iVar, context));
        bi.o0 o0Var2 = this.d;
        t60 t60Var = new t60();
        t60Var.o = pr.f;
        t60Var.e = 150L;
        t60Var.c = 150L;
        t60Var.d = 150L;
        setShowWithoutAnimation(false);
        o0Var2.setItemAnimator(t60Var);
        b0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(a70Var);
        this.containerView.addView(v1Var);
        y10 y10Var = new y10(context, f6Var, false);
        this.t0 = y10Var;
        y10Var.setImageResource(R.drawable.floating_check);
        y10Var.setOnClickListener(new org.telegram.ui.io(this, context, j3, 3));
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
    public static void M(b70 b70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.h0 adapter = b70Var.d.getAdapter();
        x60 x60Var = b70Var.W;
        TLObject tLObject = null;
        if (adapter == x60Var) {
            int size = x60Var.c.size();
            int size2 = b70Var.W.e.e.size();
            int size3 = b70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) b70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) b70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) b70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (b70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(b70Var.w.J);
            }
        } else if (i10 == b70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(b70Var.currentAccount).getChat(Long.valueOf(j3));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(b70Var.currentAccount).getChatFull(j3);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a4.a.q(MessagesController.getInstance(b70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    b70Var.dismiss();
                    yc.j(n2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!b70Var.y0) {
                    b70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(b70Var.currentAccount).getInputPeer(-b70Var.v0);
                    ConnectionsManager.getInstance(b70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new y1(b70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= b70Var.Y && i10 < b70Var.Z) {
            tLObject = ((v60) b70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (iVar == null || iVar.h(j10) < 0) {
                if (j10 != 0) {
                    if (b70Var.f0.h(j10) >= 0) {
                        m30 m30Var = (m30) b70Var.f0.f(j10);
                        b70Var.f0.l(j10);
                        b70Var.U.b(m30Var);
                    } else {
                        m30 m30Var2 = new m30(context, tLObject);
                        m30Var2.setOnClickListener(b70Var.r0);
                        b70Var.f0.k(m30Var2, j10);
                        b70Var.U.a(m30Var2, true);
                    }
                }
                b70Var.a0(true);
                AndroidUtilities.updateVisibleRows(b70Var.d);
            }
        }
    }

    public static void N(b70 b70Var, Context context, long j3) {
        Activity findActivity;
        a0.i iVar = b70Var.f0;
        if ((b70Var.m0 == null && iVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (b70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iVar.m(); i10++) {
                arrayList.add(Long.valueOf(iVar.j(i10)));
            }
            org.telegram.ui.dz dzVar = (org.telegram.ui.dz) b70Var.m0.b;
            ArrayList arrayList2 = dzVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dzVar.Z();
            org.telegram.ui.cz czVar = dzVar.f;
            if (czVar != null) {
                czVar.a();
            }
            b70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", iVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(iVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(b70Var.currentAccount).getChat(Long.valueOf(j3));
        if (iVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", iVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(iVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new kv(b70Var, 6));
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void O(b70 b70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            b70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(b70Var.currentAccount).getChatFull(b70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = b70Var.z0;
            }
            if (b70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", b70Var.z0.link));
            yc.j(b70Var.q0).j();
            b70Var.dismiss();
        }
        b70Var.y0 = false;
    }

    public static /* synthetic */ void P(b70 b70Var, ValueAnimator valueAnimator) {
        b70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b70Var.containerView.invalidate();
    }

    public static void Q(b70 b70Var) {
        a0.i iVar = b70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(b70Var.currentAccount).getUser(Long.valueOf(iVar.j(i10))));
        }
        org.telegram.ui.a70 a70Var = b70Var.l0;
        if (a70Var != null) {
            a70Var.j(0, arrayList);
        }
        b70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.o61
    public final m61 C(Context context) {
        return new s60(this, context);
    }

    @Override // org.telegram.ui.Components.o61
    public final void D(MotionEvent motionEvent, di.h2 h2Var) {
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
        if (n2Var instanceof org.telegram.ui.co) {
            boolean P9 = ((org.telegram.ui.co) n2Var).P9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new zu(17, this, h2Var), P9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            h2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(2, h2Var));
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final void G(String str) {
        x60 x60Var = this.W;
        if (x60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(x60Var.h);
            x60Var.h = null;
        }
        x60Var.c.clear();
        x60Var.d.clear();
        x60Var.e.f(null, null);
        x60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        x60Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.h0 adapter = x60Var.n.d.getAdapter();
            b70 b70Var = x60Var.n;
            kl0 kl0Var = b70Var.f;
            if (adapter != kl0Var) {
                b70Var.d.setAdapter(kl0Var);
                return;
            }
            return;
        }
        s4.h0 adapter2 = x60Var.n.d.getAdapter();
        b70 b70Var2 = x60Var.n;
        kl0 kl0Var2 = b70Var2.e;
        if (adapter2 != kl0Var2) {
            b70Var2.d.setAdapter(kl0Var2);
        }
        x60Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        w60 w60Var = new w60(x60Var, str, 0);
        x60Var.h = w60Var;
        dispatchQueue.postRunnable(w60Var, 300L);
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
        a70 a70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            a70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            m30 m30Var = new m30(a70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            a70Var.a(m30Var, false);
            m30Var.setOnClickListener(this.r0);
            i12++;
        }
        a0(false);
        int childCount = a70Var.getChildCount();
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
                    View childAt = a70Var.getChildAt(i11);
                    if (childAt instanceof m30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.m0 == null ? this.g0 ? Math.min(this.s0, dp3) : 0 : i2.g.f(52.0f, Math.min(this.s0, dp3), 0);
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
                ofFloat.addUpdateListener(new l6(this, 27));
                this.i0.addListener(new org.telegram.ui.to(14, this, z12));
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

    @Override // org.telegram.ui.Components.o61, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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
                if (n2Var instanceof org.telegram.ui.co) {
                    ((org.telegram.ui.co) n2Var).T9(true, true);
                }
            }
        }
    }
}
