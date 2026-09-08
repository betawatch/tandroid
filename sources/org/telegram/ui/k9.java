package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, dh0 {
    public final ArrayList E;
    public org.telegram.ui.ActionBar.v0 F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public final ArrayList L;
    public org.telegram.ui.Components.js M;
    public FrameLayout N;
    public y8 O;
    public TLRPC.User P;
    public TLRPC.Chat Q;
    public Long R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public int W;
    public final Rect X;
    public final bh.f Y;
    public final gh.d Z;
    public final int a;
    public final gh.d a0;
    public h9 b;
    public final bh.b b0;
    public s4.c0 c;
    public bh.l c0;
    public org.telegram.ui.Components.d61 d;
    public final ArrayList d0;
    public org.telegram.ui.Components.ok0 e;
    public final RectF e0;
    public org.telegram.ui.Components.y10 f;
    public final RectF f0;
    public org.telegram.ui.Components.t00 h;
    public w8 n;
    public di.r6 r;
    public di.f4 s;
    public boolean v;
    public boolean w;
    public ImageView x;
    public NumberTextView y;

    public k9() {
        this(null);
    }

    public static void U(k9 k9Var) {
        org.telegram.ui.Components.d61 d61Var = k9Var.d;
        if (d61Var != null) {
            int childCount = d61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k9Var.d.getChildAt(i10);
                if (childAt instanceof f9) {
                    ((f9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = k9Var.x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            k9Var.x.setBackground(org.telegram.ui.ActionBar.j6.f0(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = k9Var.actionBar;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void V(k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            k9Var.getMessagesController().putUsers(groupcall.users, false);
            k9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                k9Var.showDialog(new du(k9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.d2.g(k9Var.getParentActivity(), k9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            k9Var.showDialog(new du(k9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(k9Var).d0(tL_error, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e3, code lost:
    
        if (r5.d != r15) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(k9 k9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        g9 g9Var;
        TLRPC.User user2;
        ArrayList arrayList = k9Var.G;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(k9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(k9Var.currentAccount).putChats(messages_messages2.chats, false);
            k9Var.J = messages_messages2.messages.isEmpty();
            g9 g9Var2 = !arrayList.isEmpty() ? (g9) i2.g.h(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i12;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == k9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = MessageObject.getFromChatId(message) == k9Var.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new l8(0)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (g9Var2 != null) {
                            i10 = i12;
                            if (g9Var2.a == tL_messageActionConferenceCall.call_id) {
                                g9Var = g9Var2;
                                if (g9Var == null) {
                                    ArrayList arrayList2 = g9Var.b;
                                    g9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l4 = (Long) it.next();
                                        long longValue = l4.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User user3 = k9Var.getMessagesController().getUser(l4);
                                                if (user3 != null) {
                                                    arrayList2.add(user3);
                                                }
                                            } else {
                                                Object obj = arrayList2.get(i15);
                                                i15++;
                                                if (longValue == ((TLRPC.User) obj).id) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (g9Var2 != null && !arrayList.contains(g9Var2)) {
                                        arrayList.add(g9Var2);
                                    }
                                    g9Var2 = new g9();
                                    g9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = g9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l10 = (Long) it2.next();
                                        l10.getClass();
                                        ArrayList arrayList4 = g9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new q8(fromChatId, 0)) && (user2 = k9Var.getMessagesController().getUser(l10)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    g9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    g9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                g9Var = null;
                                break;
                            }
                            g9Var = (g9) arrayList.get(i16);
                            int i17 = i16;
                            if (g9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (g9Var == null) {
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i10 = i12;
                        hashSet.add(Long.valueOf(fromChatId));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i13 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i13 = 2;
                        }
                        int i18 = (i13 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i13;
                        if (g9Var2 != null) {
                            ArrayList arrayList5 = g9Var2.b;
                            if (hashSet.size() == arrayList5.size()) {
                                int size2 = arrayList5.size();
                                int i19 = 0;
                                while (true) {
                                    if (i19 < size2) {
                                        Object obj2 = arrayList5.get(i19);
                                        i19++;
                                        if (!hashSet.contains(Long.valueOf(((TLRPC.User) obj2).id))) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (g9Var2 != null && !arrayList.contains(g9Var2)) {
                            arrayList.add(g9Var2);
                        }
                        g9Var2 = new g9();
                        g9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l11 = (Long) it3.next();
                            l11.getClass();
                            ArrayList arrayList6 = g9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new q8(fromChatId, 1)) && (user = k9Var.getMessagesController().getUser(l11)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        g9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        g9Var2.e = messageAction4 != null && messageAction4.video;
                        g9Var2.c.add(message);
                    }
                }
                i12 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 1;
            }
            if (g9Var2 != null && !g9Var2.c.isEmpty() && !arrayList.contains(g9Var2)) {
                arrayList.add(g9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            k9Var.J = true;
        }
        k9Var.H = false;
        if (!k9Var.I) {
            k9Var.resumeDelayedFragmentAnimation();
        }
        k9Var.I = z10;
        k9Var.F.setVisibility(arrayList.isEmpty() ? 8 : 0);
        h9 h9Var = k9Var.b;
        if (h9Var != null) {
            h9Var.b();
        }
        org.telegram.ui.Components.d61 d61Var = k9Var.d;
        if (d61Var != null) {
            d61Var.Y2.N(true);
        }
    }

    public static void X(k9 k9Var, org.telegram.ui.Components.h51 h51Var, View view) {
        int i10 = h51Var.d;
        if (i10 == 2) {
            k9Var.n0(true);
            org.telegram.ui.Components.qc I = org.telegram.ui.Components.yc.a0(k9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(k9Var, 4));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            m0(k9Var);
            return;
        }
        Object obj = h51Var.G;
        if (!(obj instanceof g9)) {
            if (view instanceof j9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((j9) view).c.id);
                k9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                k9Var.presentFragment(new co(bundle), k9Var.v);
                return;
            }
            return;
        }
        g9 g9Var = (g9) obj;
        ArrayList arrayList = g9Var.c;
        if (k9Var.actionBar.s()) {
            k9Var.e0(arrayList, (f9) view);
            return;
        }
        if (g9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            k9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            k9Var.presentFragment(new co(bundle2), k9Var.v);
            return;
        }
        boolean z10 = g9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = g9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(k9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
        b2Var.q(600L);
    }

    public static void Y(k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            k9Var.getMessagesController().putUsers(groupcall.users, false);
            k9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                k9Var.showDialog(new du(k9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.d2.g(k9Var.getParentActivity(), k9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            k9Var.showDialog(new du(k9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(k9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new d9(a4.a.i("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.f6 f6Var, boolean z10, final boolean z11) {
        int i11;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, f6Var, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final ?? r12 = {str};
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.x5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.x5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        frameLayout.addView(frameLayout2, w7.x5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.x5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.d90 a2 = w7.b6.a(context, 20.0f, i13, true, f6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.x5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.d90 a10 = w7.b6.a(context, 14.0f, i13, false, f6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(di.f4.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.x5.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.z5.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 12, 12));
        f7.addView(frameLayout3, w7.x5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.d90 a11 = w7.b6.a(context, 13.0f, i13, false, f6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(substring);
        frameLayout3.addView(a11, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, f6Var), mode));
        frameLayout3.addView(imageView3, w7.x5.e(40, 48, 21));
        LinearLayout f10 = org.telegram.messenger.wl.f(context, 0);
        f7.addView(f10, w7.x5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        di.d dVar = new di.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.x5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        di.d dVar2 = new di.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            a9 a9Var = new a9(context, f6Var);
            a9Var.setGravity(17);
            a9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
            a9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            a9Var.setTextSize(14.0f);
            f7.addView(a9Var, w7.x5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ah.p pVar = new ah.p(str, i11, f3VarArr, 27);
            org.telegram.ui.Components.d90 a12 = w7.b6.a(context, 14.0f, i13, false, f6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), pVar), true));
            a12.setGravity(17);
            a12.setMaxWidth(di.f4.a(a12.getText(), a12.getPaint()));
            f7.addView(a12, w7.x5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.z5.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(pVar, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = f7;
        f3Var.show();
        f3VarArr[0] = f3Var;
        final int i15 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.yc ycVar;
                int i16;
                switch (i15) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f6Var);
                        i16 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f6Var);
                        i16 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.wl.o(i16, ycVar);
            }
        });
        final int i16 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.yc ycVar;
                int i162;
                switch (i16) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f6Var);
                        i162 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f6Var);
                        i162 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.wl.o(i162, ycVar);
            }
        });
        final hg.e1 e1Var = new hg.e1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, f6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(d3Var, f6Var2, frameLayout3);
                int i17 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i17, string, new r1(strArr, f3Var2, f6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.c6(10, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, e1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new bi.l0(context, str, r12, f6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.z4(f3Var, f6Var, imageView2, e1Var, 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.dh0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.L();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 0;
        if (!this.w) {
            i2.g.x(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 25));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.F = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.F.setOnClickListener(new n8(this, 2));
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(this, new b5(this, 1), new k8(this), new k8(this));
        this.d = d61Var;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        d61Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider));
        this.d.o1();
        this.d.Y2.r = false;
        this.n = new w8(this, context, i10);
        ih.k kVar = new ih.k(this.n);
        w8 w8Var = this.n;
        bh.b bVar = this.b0;
        bVar.d = kVar;
        bVar.e = w8Var;
        org.telegram.ui.Components.d61 d61Var2 = this.d;
        Objects.requireNonNull(d61Var2);
        this.c0 = new bh.l(d61Var2, w8Var, new v8(d61Var2, i10));
        this.d.C0(new j8(this, 6));
        w8 w8Var2 = this.n;
        this.fragmentView = w8Var2;
        w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.h = t00Var;
        t00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.h.w = false;
        h9 h9Var = new h9(this, context, this.h);
        this.b = h9Var;
        this.n.addView(h9Var, w7.x5.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.b);
        org.telegram.ui.Components.d61 d61Var3 = this.d;
        s4.c0 c0Var = new s4.c0(1, false);
        this.c = c0Var;
        d61Var3.setLayoutManager(c0Var);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(this.d, this.c);
        this.e = ok0Var;
        ok0Var.h = new k8(this);
        w8 w8Var3 = this.n;
        org.telegram.ui.Components.d61 d61Var4 = this.d;
        float f7 = -this.a;
        w8Var3.addView(d61Var4, w7.x5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.d.setOnScrollListener(new x8(this));
        if (this.H) {
            this.b.a();
        } else {
            this.b.b();
        }
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f = y10Var;
        y10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new n8(this, 3));
        this.n.addView(this.f, org.telegram.ui.Components.y10.b());
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.M = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.M.setOnAnimatedHeightChangedListener(new j8(this, i10));
        dh.d c10 = bVar.c(this.M, fh.b.n(this.resourceProvider), false);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        this.M.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        this.M.addView(frameLayout);
        this.M.i(this.N, true, false);
        y8 y8Var = new y8(this, context, this, this.n, this.resourceProvider, 0);
        this.O = y8Var;
        this.N.addView(y8Var);
        this.M.setCallFragmentContextView(this.O);
        this.n.addView(this.M, w7.x5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.actionBar);
        di.r6 r6Var = new di.r6(context, this.parentLayout);
        this.r = r6Var;
        r6Var.b(false, false);
        this.n.addView(this.r, w7.x5.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new z8(this, i10));
        if (this.w) {
            View view = this.fragmentView;
            k8 k8Var = new k8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.j(view, k8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Long l4;
        org.telegram.ui.Components.d61 d61Var;
        int i12;
        ArrayList arrayList;
        g9 g9Var;
        TLRPC.User user;
        int i13 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList2 = this.G;
        if (i10 != i13) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.I && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        g9 g9Var2 = (g9) it.next();
                        Iterator it2 = g9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (g9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (d61Var = this.d) == null) {
                        return;
                    }
                    d61Var.Y2.N(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.K = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.d61 d61Var2 = this.d;
                if (d61Var2 != null) {
                    d61Var2.Y2.N(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l4 = this.R) != null && l4.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.d2.l(this.Q, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.R = null;
                    return;
                }
                return;
            }
            Long l10 = this.R;
            if (l10 == null || ((TLRPC.ChatFull) objArr[0]).id != l10.longValue() || getMessagesController().getGroupCall(this.R.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.d2.l(this.Q, null, false, null, getParentActivity(), this, getAccountInstance());
            this.R = null;
            return;
        }
        if (this.I && !((Boolean) objArr[2]).booleanValue()) {
            ArrayList arrayList4 = (ArrayList) objArr[1];
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                int i15 = i14 + 1;
                MessageObject messageObject = (MessageObject) obj;
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long fromChatId = messageObject.getFromChatId();
                    long j3 = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                    int i16 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                    if (i16 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i16 = 2;
                    }
                    if (i16 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i16;
                    }
                    if (!arrayList2.isEmpty()) {
                        g9 g9Var3 = (g9) arrayList2.get(0);
                        ArrayList arrayList5 = g9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j3 && g9Var3.d == r12) {
                                g9Var3.c.add(0, messageObject.messageOwner);
                                i14 = i12;
                            }
                            g9 g9Var4 = new g9();
                            ArrayList arrayList6 = g9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = g9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j3));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            g9Var4.d = r12;
                            g9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, g9Var4);
                            this.d.Y2.N(true);
                        }
                    }
                    i12 = i15;
                    g9 g9Var42 = new g9();
                    ArrayList arrayList62 = g9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = g9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                    }
                    g9Var42.d = r12;
                    g9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, g9Var42);
                    this.d.Y2.N(true);
                } else {
                    i12 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new l8(0)).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i17 = fromChatId2 == getUserConfig().getClientUserId() ? 0 : 1;
                        if (i17 == 1 && tL_messageActionConferenceCall.missed) {
                            i17 = 2;
                        }
                        r12 = (i17 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i17;
                        if (arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        } else {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList2.size()) {
                                    arrayList = arrayList2;
                                    g9Var = null;
                                    break;
                                }
                                g9Var = (g9) arrayList2.get(i18);
                                arrayList = arrayList2;
                                if (g9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                arrayList2 = arrayList;
                            }
                            if (g9Var != null) {
                                ArrayList arrayList8 = g9Var.b;
                                g9Var.c.add(0, messageObject.messageOwner);
                                for (Long l11 : set) {
                                    long longValue = l11.longValue();
                                    int size2 = arrayList8.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < size2) {
                                            Object obj2 = arrayList8.get(i19);
                                            i19++;
                                            if (longValue == ((TLRPC.User) obj2).id) {
                                                break;
                                            }
                                        } else {
                                            TLRPC.User user2 = getMessagesController().getUser(l11);
                                            if (user2 != null) {
                                                arrayList8.add(user2);
                                            }
                                        }
                                    }
                                }
                                this.d.Y2.N(true);
                                i14 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        g9 g9Var5 = new g9();
                        g9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = g9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = g9Var5.b;
                        arrayList10.clear();
                        for (Long l12 : set) {
                            l12.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l12);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        g9Var5.d = r12;
                        g9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, g9Var5);
                        this.d.Y2.N(true);
                        i14 = i12;
                    }
                }
                i14 = i12;
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.F;
            if (v0Var != null) {
                v0Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(ArrayList arrayList, f9 f9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.L;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.mp mpVar = f9Var.e;
            if (mpVar != null) {
                mpVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.mp mpVar2 = f9Var.e;
        if (mpVar2 != null) {
            mpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.Y) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f) + ((int) this.M.c(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.W) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.e0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.f0;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.w ? 2 : 1, this.d0);
        fVar.e(this.c0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void g0() {
        this.f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{h9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{h9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        org.telegram.ui.Components.y10 y10Var = this.f;
        if (y10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(y10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.Q0;
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{f9.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.V4, org.telegram.ui.ActionBar.j6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.W4, org.telegram.ui.ActionBar.j6.Y4}, null, org.telegram.ui.ActionBar.j6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Y0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.X;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.d61 d61Var = this.d;
        int i10 = this.a;
        d61Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.M.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.W + this.T);
        this.b.setPadding(0, 0, 0, this.W + this.T);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.H) {
            return;
        }
        this.H = true;
        h9 h9Var = this.b;
        if (h9Var != null && !this.I) {
            h9Var.a();
        }
        org.telegram.ui.Components.d61 d61Var = this.d;
        if (d61Var != null) {
            d61Var.Y2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.mp mpVar;
        this.actionBar.r();
        this.L.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof f9) && (mpVar = ((f9) childAt).e) != null) {
                mpVar.a(false, z10);
            }
        }
        this.d.Y2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.L.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void n0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.d.Y2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!this.actionBar.s()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.S || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        di.f4 f4Var = new di.f4(getParentActivity(), 1);
        this.s = f4Var;
        f4Var.d = 3000L;
        f4Var.l(1.0f, -25.0f);
        this.s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.s.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.n.addView(this.s, w7.x5.e(-1, 80, 48));
        this.s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.s.u();
        this.S = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        j0(0, 50);
        this.K = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.v = bundle.getBoolean("needFinishFragment", true);
            this.w = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.T = this.w ? AndroidUtilities.dp(72.0f) : 0;
        this.U = this.w ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        i0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (i10 == 101 || i10 == 102 || i10 == 103) {
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = true;
                    break;
                } else {
                    if (iArr[i11] != 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (iArr.length <= 0 || !z10) {
                org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.d2.l(this.Q, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.P != null ? getMessagesController().getUserFull(this.P.id) : null;
                org.telegram.ui.Components.voip.d2.m(this.P, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.d61 d61Var = this.d;
        if (d61Var != null) {
            d61Var.Y2.N(true);
        }
    }

    public final void p0(boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.DeleteAllCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            b2Var.R = LocaleController.getString(R.string.DeleteCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
        z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        z1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new m8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void q0() {
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.L;
        boolean z10 = true;
        char c10 = 1;
        if (!s10) {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.E;
            if (!a2) {
                org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
                if (this.w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.x.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
                    this.x.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
                    this.x.setOnClickListener(new n8(this, c10 == true ? 1 : 0));
                    j3.addView(this.x, w7.x5.q(54, 54, 16));
                    arrayList2.add(this.x);
                }
                NumberTextView numberTextView = new NumberTextView(j3.getContext());
                this.y = numberTextView;
                numberTextView.setTextSize(18);
                this.y.setTypeface(AndroidUtilities.bold());
                this.y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
                j3.addView(this.y, w7.x5.m(1.0f, 0, -1, this.w ? 18 : 72, 0, 0));
                this.y.setOnTouchListener(new ci.d(2));
                arrayList2.add(j3.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.O(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                View view = (View) arrayList2.get(i10);
                view.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList3.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList3);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z10 = false;
        } else if (arrayList.isEmpty()) {
            k0(true);
            return;
        }
        this.y.a(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.dh0
    public final void r() {
        if (this.c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        org.telegram.ui.Components.ok0 ok0Var = this.e;
        ok0Var.b = 1;
        ok0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.dh0
    public final gh.d x() {
        return this.a0;
    }

    public k9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.L = new ArrayList();
        this.S = false;
        this.X = new Rect();
        ArrayList arrayList = new ArrayList();
        this.d0 = arrayList;
        RectF rectF = new RectF();
        this.e0 = rectF;
        RectF rectF2 = new RectF();
        this.f0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        if (i10 < 31) {
            this.Y = null;
            this.Z = null;
            this.a0 = null;
            this.b0 = new bh.b(cVar);
            return;
        }
        this.Y = new bh.f(false);
        this.Z = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.a0 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.b0 = bVar;
        bVar.f = LiteMode.isEnabled(262144);
    }
}
