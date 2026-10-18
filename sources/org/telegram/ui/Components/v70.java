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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class v70 extends j71 implements NotificationCenter.NotificationCenterDelegate {
    public final a0.h T;
    public final u70 U;
    public final org.telegram.ui.ActionBar.v1 V;
    public final r70 W;
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
    public v30 j0;
    public int k0;
    public org.telegram.ui.i60 l0;
    public org.telegram.ui.wt m0;
    public ArrayList n0;
    public int o0;
    public final float p0;
    public final org.telegram.ui.ActionBar.n2 q0;
    public final androidx.mediarouter.app.w r0;
    public int s0;
    public final h20 t0;
    public int u0;
    public final long v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public TLRPC.TL_chatInviteExported z0;

    public v70(Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.e0 = new ArrayList();
        this.f0 = new a0.h();
        this.h0 = 0.0f;
        this.r0 = new androidx.mediarouter.app.w(this, 9);
        this.T = hVar;
        this.G = false;
        this.q0 = n2Var;
        this.v0 = j10;
        fixNavigationBar();
        this.w.J.setHint(LocaleController.getString(R.string.SearchForChats));
        this.p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        r70 r70Var = new r70(this);
        this.W = r70Var;
        this.e = r70Var;
        ai.u1 u1Var = this.d;
        p70 p70Var = new p70(this);
        this.f = p70Var;
        u1Var.setAdapter(p70Var);
        this.s.e(false, false);
        this.s.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i10).contacts;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i11).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.e0.add(user);
            }
        }
        u70 u70Var = new u70(this, context);
        this.U = u70Var;
        this.d.setOnItemClickListener(new org.telegram.ui.yb(this, j10, n2Var, hVar, context));
        ai.u1 u1Var2 = this.d;
        n70 n70Var = new n70();
        n70Var.o = bs.f;
        n70Var.e = 150L;
        n70Var.c = 150L;
        n70Var.d = 150L;
        setShowWithoutAnimation(false);
        u1Var2.setItemAnimator(n70Var);
        c0();
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 1);
        this.V = v1Var;
        v1Var.setVisibility(8);
        v1Var.setClipChildren(false);
        v1Var.addView(u70Var);
        this.containerView.addView(v1Var);
        h20 h20Var = new h20(context, d6Var, false);
        this.t0 = h20Var;
        h20Var.setImageResource(R.drawable.floating_check);
        h20Var.setOnClickListener(new ai.c4(this, context, j10, 4));
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
    public static void N(v70 v70Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context, int i10) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        s4.g0 adapter = v70Var.d.getAdapter();
        r70 r70Var = v70Var.W;
        TLObject tLObject = null;
        if (adapter == r70Var) {
            int size = r70Var.c.size();
            int size2 = v70Var.W.e.e.size();
            int size3 = v70Var.W.e.d.size();
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < size) {
                tLObject = (TLObject) v70Var.W.c.get(i11);
            } else if (i11 >= size && i11 < size3 + size) {
                tLObject = (TLObject) v70Var.W.e.d.get(i11 - size);
            } else if (i11 > size + size3 && i11 <= size2 + size + size3) {
                tLObject = (TLObject) v70Var.W.e.e.get(((i11 - size) - size3) - 1);
            }
            if (v70Var.m0 != null) {
                AndroidUtilities.hideKeyboard(v70Var.w.J);
            }
        } else if (i10 == v70Var.X) {
            TLRPC.Chat chat = MessagesController.getInstance(v70Var.currentAccount).getChat(Long.valueOf(j10));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(v70Var.currentAccount).getChatFull(j10);
            if (chat != null) {
                String publicUsername = ChatObject.getPublicUsername(chat);
                if (!TextUtils.isEmpty(publicUsername)) {
                    str = a1.g.q(MessagesController.getInstance(v70Var.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
                    if (str != null) {
                        return;
                    }
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                    v70Var.dismiss();
                    xc.j(n2Var).j();
                }
            }
            if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
                if (!v70Var.y0) {
                    v70Var.y0 = true;
                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                    tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                    tL_messages_exportChatInvite.peer = MessagesController.getInstance(v70Var.currentAccount).getInputPeer(-v70Var.v0);
                    ConnectionsManager.getInstance(v70Var.currentAccount).sendRequest(tL_messages_exportChatInvite, new y1(v70Var, 7));
                }
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            if (str != null) {
            }
        } else if (i10 >= v70Var.Y && i10 < v70Var.Z) {
            tLObject = ((p70) v70Var.f).E(i10);
        }
        if (tLObject != null) {
            long j11 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (hVar == null || hVar.h(j11) < 0) {
                if (j11 != 0) {
                    if (v70Var.f0.h(j11) >= 0) {
                        v30 v30Var = (v30) v70Var.f0.f(j11);
                        v70Var.f0.l(j11);
                        v70Var.U.b(v30Var);
                    } else {
                        v30 v30Var2 = new v30(context, tLObject);
                        v30Var2.setOnClickListener(v70Var.r0);
                        v70Var.f0.k(v30Var2, j11);
                        v70Var.U.a(v30Var2, true);
                    }
                }
                v70Var.b0(true);
                AndroidUtilities.updateVisibleRows(v70Var.d);
            }
        }
    }

    public static void O(v70 v70Var, Context context, long j10) {
        Activity findActivity;
        a0.h hVar = v70Var.f0;
        if ((v70Var.m0 == null && hVar.i()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (v70Var.m0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
            org.telegram.ui.ny nyVar = (org.telegram.ui.ny) v70Var.m0.b;
            ArrayList arrayList2 = nyVar.e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            nyVar.Z();
            org.telegram.ui.my myVar = nyVar.f;
            if (myVar != null) {
                myVar.a();
            }
            v70Var.dismiss();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity);
        String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", hVar.m(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = formatPluralString;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            TLRPC.User user = MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i11)));
            if (user != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("**");
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(v70Var.currentAccount).getChat(Long.valueOf(j10));
        if (hVar.m() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", hVar.m(), chat.title)));
            String format = String.format("%d", Integer.valueOf(hVar.m()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            b2Var.T = spannableStringBuilder;
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb2, chat.title));
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Add), new tv(v70Var, 7));
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void P(v70 v70Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            v70Var.z0 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(v70Var.currentAccount).getChatFull(v70Var.v0);
            if (chatFull != null) {
                chatFull.exported_invite = v70Var.z0;
            }
            if (v70Var.z0.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v70Var.z0.link));
            xc.j(v70Var.q0).j();
            v70Var.dismiss();
        }
        v70Var.y0 = false;
    }

    public static /* synthetic */ void Q(v70 v70Var, ValueAnimator valueAnimator) {
        v70Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v70Var.containerView.invalidate();
    }

    public static void R(v70 v70Var) {
        a0.h hVar = v70Var.f0;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add(MessagesController.getInstance(v70Var.currentAccount).getUser(Long.valueOf(hVar.j(i10))));
        }
        org.telegram.ui.i60 i60Var = v70Var.l0;
        if (i60Var != null) {
            i60Var.i(0, arrayList);
        }
        v70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.j71
    public final h71 D(Context context) {
        return new m70(this, context);
    }

    @Override // org.telegram.ui.Components.j71
    public final void F(MotionEvent motionEvent, ei.e2 e2Var) {
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
        if (n2Var instanceof org.telegram.ui.sn) {
            boolean U9 = ((org.telegram.ui.sn) n2Var).U9();
            this.w0 = true;
            AndroidUtilities.runOnUIThread(new yt(this, e2Var, 18), U9 ? 200L : 0L);
        } else {
            this.w0 = true;
            setFocusable(true);
            e2Var.requestFocus();
            AndroidUtilities.runOnUIThread(new r1(1, e2Var));
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void H(String str) {
        r70 r70Var = this.W;
        if (r70Var.h != null) {
            Utilities.searchQueue.cancelRunnable(r70Var.h);
            r70Var.h = null;
        }
        r70Var.c.clear();
        r70Var.d.clear();
        r70Var.e.f(null, null);
        r70Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        r70Var.l();
        if (TextUtils.isEmpty(str)) {
            s4.g0 adapter = r70Var.n.d.getAdapter();
            v70 v70Var = r70Var.n;
            hm0 hm0Var = v70Var.f;
            if (adapter != hm0Var) {
                v70Var.d.setAdapter(hm0Var);
                return;
            }
            return;
        }
        s4.g0 adapter2 = r70Var.n.d.getAdapter();
        v70 v70Var2 = r70Var.n;
        hm0 hm0Var2 = v70Var2.e;
        if (adapter2 != hm0Var2) {
            v70Var2.d.setAdapter(hm0Var2);
        }
        r70Var.n.s.e(true, false);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        q70 q70Var = new q70(r70Var, str, 0);
        r70Var.h = q70Var;
        dispatchQueue.postRunnable(q70Var, 300L);
    }

    public boolean Y() {
        return true;
    }

    public final void Z(org.telegram.ui.wt wtVar) {
        this.m0 = wtVar;
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
        u70 u70Var;
        float max;
        int i10;
        int i11;
        int min;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            u70Var = this.U;
            if (i12 >= size) {
                break;
            }
            Long l4 = (Long) arrayList.get(i12);
            long longValue = l4.longValue();
            v30 v30Var = new v30(u70Var.getContext(), DialogObject.isChatDialog(longValue) ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)) : MessagesController.getInstance(this.currentAccount).getUser(l4));
            u70Var.a(v30Var, false);
            v30Var.setOnClickListener(this.r0);
            i12++;
        }
        b0(false);
        int childCount = u70Var.getChildCount();
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
                    View childAt = u70Var.getChildAt(i11);
                    if (childAt instanceof v30) {
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
            org.telegram.ui.ActionBar.v1 v1Var = this.V;
            if (z12) {
                v1Var.setVisibility(0);
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h0, z12 ? 1.0f : 0.0f);
                this.i0 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 28));
                this.i0.addListener(new org.telegram.ui.ho(14, this, z12));
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

    @Override // org.telegram.ui.Components.j71, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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
                if (n2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) n2Var).Y9(true, true);
                }
            }
        }
    }
}
