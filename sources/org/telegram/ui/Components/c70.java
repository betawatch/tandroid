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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class c70 extends q61 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h Q;
    public final b70 R;
    public final org.telegram.ui.ActionBar.x1 S;
    public final y60 T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public AnimatorSet a0;
    public final ArrayList b0;
    public final a0.h c0;
    public boolean d0;
    public float e0;
    public ValueAnimator f0;
    public n30 g0;
    public int h0;
    public org.telegram.ui.t60 i0;
    public org.telegram.ui.fu j0;
    public ArrayList k0;
    public int l0;
    public final float m0;
    public final org.telegram.ui.ActionBar.p2 n0;
    public final androidx.mediarouter.app.y o0;
    public int p0;
    public final z10 q0;
    public int r0;
    public final long s0;
    public boolean t0;
    public float u0;
    public boolean v0;
    public TLRPC.TL_chatInviteExported w0;

    public c70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.b0 = new ArrayList();
        this.c0 = new a0.h();
        this.e0 = 0.0f;
        this.o0 = new androidx.mediarouter.app.y(this, 9);
        this.Q = hVar;
        this.D = false;
        this.n0 = p2Var;
        this.s0 = j10;
        fixNavigationBar();
        this.w.G.setHint(LocaleController.getString(R.string.SearchForChats));
        this.m0 = ViewConfiguration.get(context).getScaledTouchSlop();
        y60 y60Var = new y60(this);
        this.T = y60Var;
        this.e = y60Var;
        lh.e1 e1Var = this.d;
        w60 w60Var = new w60(this);
        this.f = w60Var;
        e1Var.setAdapter(w60Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.b0.add(user);
            }
        }
        b70 b70Var = new b70(this, context);
        this.R = b70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.tb(this, j10, p2Var, hVar, context));
        lh.e1 e1Var2 = this.d;
        u60 u60Var = new u60();
        u60Var.o = nr.f;
        u60Var.e = 150L;
        u60Var.c = 150L;
        u60Var.d = 150L;
        setShowWithoutAnimation(false);
        e1Var2.setItemAnimator(u60Var);
        b0();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 1);
        this.S = x1Var;
        x1Var.setVisibility(8);
        x1Var.setClipChildren(false);
        x1Var.addView(b70Var);
        this.containerView.addView(x1Var);
        z10 z10Var = new z10(context, f6Var, false);
        this.q0 = z10Var;
        z10Var.setImageResource(R.drawable.floating_check);
        z10Var.setOnClickListener(new lh.r2(this, context, j10, 4));
        z10Var.e(false, false);
        z10Var.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(z10Var, z10.b());
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M(c70 c70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        f2.o0 adapter = c70Var.d.getAdapter();
        y60 y60Var = c70Var.T;
        TLObject tLObject = null;
        if (adapter == y60Var) {
            int size = y60Var.c.size();
            int size2 = c70Var.T.e.e.size();
            int size3 = c70Var.T.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) c70Var.T.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) c70Var.T.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) c70Var.T.e.e.get(((i11 - size) - size3) - 1);
            }
            if (c70Var.j0 != null) {
                AndroidUtilities.hideKeyboard(c70Var.w.G);
            }
        } else if (i10 == c70Var.U) {
            TLRPC.Chat chat = MessagesController.getInstance(c70Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(c70Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = android.support.v4.media.a.p(MessagesController.getInstance(c70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    c70Var.dismiss();
                    qc.j(p2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!c70Var.v0) {
                    c70Var.v0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(c70Var.currentAccount).getInputPeer(-c70Var.s0);
                    ConnectionsManager.getInstance(c70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new y1(c70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= c70Var.V && i10 < c70Var.W) {
            tLObject = ((w60) c70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j11 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (c70Var.c0.h(j11) >= 0) {
                        n30 n30Var = (n30) c70Var.c0.f(j11);
                        c70Var.c0.l(j11);
                        c70Var.R.b(n30Var);
                    } else {
                        n30 n30Var2 = new n30(context, tLObject);
                        n30Var2.setOnClickListener(c70Var.o0);
                        c70Var.c0.k(n30Var2, j11);
                        c70Var.R.a(n30Var2, true);
                    }
                }
                c70Var.a0(true);
                AndroidUtilities.updateVisibleRows(c70Var.d);
            }
        }
    }

    public static void N(c70 c70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = c70Var.c0;
        if ((c70Var.j0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (c70Var.j0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.xy xyVar = (org.telegram.ui.xy) c70Var.j0.b;
            ArrayList arrayList2 = xyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            xyVar.Z();
            org.telegram.ui.wy wyVar = xyVar.f;
            if (wyVar != null) {
                wyVar.a();
            }
            c70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = formatPluralString;
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(c70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            d2Var.Q = spannableStringBuilder;
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new fv(c70Var, 6));
        kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void O(c70 c70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            c70Var.w0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(c70Var.currentAccount).getChatFull(c70Var.s0);
            if (chatFull != null) {
                chatFull.exported_invite = c70Var.w0;
            }
            if (c70Var.w0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", c70Var.w0.link));
            qc.j(c70Var.n0).j();
            c70Var.dismiss();
        }
        c70Var.v0 = false;
    }

    public static /* synthetic */ void P(c70 c70Var, ValueAnimator valueAnimator) {
        c70Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c70Var.containerView.invalidate();
    }

    public static void Q(c70 c70Var) {
        a0.h hVar = c70Var.c0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(c70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.t60 t60Var = c70Var.i0;
        if (t60Var != null) {
            t60Var.j(0, arrayList);
        }
        c70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q61
    public final o61 C(Context context) {
        return new t60(this, context);
    }

    @Override // org.telegram.ui.Components.q61
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (motionEvent.getAction() == 0) {
            this.u0 = this.y;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.y - this.u0) >= this.m0 || this.t0) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
        } else {
            p2Var = null;
        }
        if (p2Var instanceof org.telegram.ui.xn) {
            boolean P9 = ((org.telegram.ui.xn) p2Var).P9();
            this.t0 = true;
            AndroidUtilities.runOnUIThread(new il(29, this, fVar), P9 ? 200L : 0L);
        } else {
            this.t0 = true;
            setFocusable(true);
            fVar.requestFocus();
            AndroidUtilities.runOnUIThread(new q1(2, fVar));
        }
    }

    @Override // org.telegram.ui.Components.q61
    public final void F(String str) {
        y60 y60Var = this.T;
        if (y60Var.h != null) {
            Utilities.searchQueue.cancelRunnable(y60Var.h);
            y60Var.h = null;
        }
        y60Var.c.clear();
        y60Var.d.clear();
        y60Var.e.f(null, null);
        y60Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        y60Var.l();
        if (TextUtils.isEmpty(str)) {
            f2.o0 adapter = y60Var.n.d.getAdapter();
            c70 c70Var = y60Var.n;
            rl0 rl0Var = c70Var.f;
            if (adapter != rl0Var) {
                c70Var.d.setAdapter(rl0Var);
                return;
            }
            return;
        }
        f2.o0 adapter2 = y60Var.n.d.getAdapter();
        c70 c70Var2 = y60Var.n;
        rl0 rl0Var2 = c70Var2.e;
        if (adapter2 != rl0Var2) {
            c70Var2.d.setAdapter(rl0Var2);
        }
        y60Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        x60 x60Var = new x60(y60Var, str, 0);
        y60Var.h = x60Var;
        dispatchQueue.postRunnable(x60Var, 300L);
    }

    public boolean X() {
        return true;
    }

    public final void Y(org.telegram.ui.fu fuVar) {
        this.j0 = fuVar;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
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
        b70 b70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            b70Var = this.R;
            if (i12 >= size) {
                break;
            }
            Long l10 = (Long) arrayList.get(i12);
            long longValue = l10.longValue();
            n30 n30Var = new n30(b70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l10));
            b70Var.a(n30Var, false);
            n30Var.setOnClickListener(this.o0);
            i12++;
        }
        a0(false);
        int childCount = b70Var.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z4 = point.x < point.y;
        if (AndroidUtilities.isTablet() || z4) {
            this.p0 = AndroidUtilities.dp(144.0f);
        } else {
            this.p0 = AndroidUtilities.dp(56.0f);
        }
        if (AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            max = Math.min(point2.x, point2.y) * 0.8f;
        } else {
            if (z4) {
                i10 = AndroidUtilities.displaySize.x;
                int dp = i10 - AndroidUtilities.dp(26.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i13 = 0;
                for (i11 = 0; i11 < childCount; i11++) {
                    View childAt = b70Var.getChildAt(i11);
                    if (childAt instanceof n30) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i13 > dp) {
                            dp2 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i13);
                    }
                }
                int dp3 = AndroidUtilities.dp(42.0f) + dp2;
                min = this.j0 == null ? this.d0 ? Math.min(this.p0, dp3) : 0 : kh.a2.c(52.0f, Math.min(this.p0, dp3), 0);
                int i14 = this.r0;
                int dp4 = this.c0.m() > 0 ? AndroidUtilities.dp(56.0f) : 0;
                this.r0 = dp4;
                if (min == this.l0 || i14 != dp4) {
                    this.l0 = min;
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
        if (this.j0 == null) {
        }
        int i142 = this.r0;
        if (this.c0.m() > 0) {
        }
        this.r0 = dp4;
        if (min == this.l0) {
        }
        this.l0 = min;
    }

    public final void a0(boolean z4) {
        boolean z10 = true;
        boolean z11 = this.c0.m() > 0;
        if (this.d0 != z11) {
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f0.cancel();
            }
            this.d0 = z11;
            org.telegram.ui.ActionBar.x1 x1Var = this.S;
            if (z11) {
                x1Var.setVisibility(0);
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e0, z11 ? 1.0f : 0.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 27));
                this.f0.addListener(new l00(5, this, z11));
                this.f0.setDuration(150L);
                this.f0.start();
            } else {
                this.e0 = z11 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z11) {
                    x1Var.setVisibility(8);
                }
            }
            if (!this.d0 && this.j0 == null) {
                z10 = false;
            }
            this.q0.e(z10, z4);
        }
    }

    public final void b0() {
        this.V = -1;
        this.W = -1;
        this.U = -1;
        this.X = -1;
        boolean z4 = true;
        this.Z = 1;
        if (this.j0 == null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            long j10 = this.s0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) && (chatFull == null || chatFull.exported_invite == null)) {
                z4 = X();
            }
            if (z4) {
                int i10 = this.Z;
                this.Z = i10 + 1;
                this.U = i10;
            }
            ArrayList arrayList = this.b0;
            if (arrayList.size() != 0) {
                int i11 = this.Z;
                this.V = i11;
                int size = arrayList.size() + i11;
                this.Z = size;
                this.W = size;
            } else {
                int i12 = this.Z;
                this.Z = i12 + 1;
                this.X = i12;
            }
        } else if (this.k0.size() != 0) {
            int i13 = this.Z;
            this.V = i13;
            int size2 = this.k0.size() + i13;
            this.Z = size2;
            this.W = size2;
        } else {
            int i14 = this.Z;
            this.Z = i14 + 1;
            this.X = i14;
        }
        int i15 = this.Z;
        this.Z = i15 + 1;
        this.Y = i15;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogsNeedReload && this.j0 != null && this.k0.isEmpty()) {
            this.k0 = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.f.l();
        }
    }

    @Override // org.telegram.ui.Components.q61, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.t0) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
                if (p2Var instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) p2Var).T9(true, true);
                }
            }
        }
    }
}
