package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, bh0 {
    public org.telegram.ui.ActionBar.v0 E;
    public final ArrayList F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList J;
    public final ArrayList K;
    public org.telegram.ui.Components.ns L;
    public FrameLayout M;
    public a9 N;
    public TLRPC.User O;
    public TLRPC.Chat P;
    public Long Q;
    public NotificationCenter.ObserversGroup R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public int W;
    public j9 a;
    public s4.c0 b;
    public org.telegram.ui.Components.c71 c;
    public View d;
    public org.telegram.ui.Components.bl0 e;
    public org.telegram.ui.Components.c20 f;
    public org.telegram.ui.Components.w00 h;
    public y8 n;
    public ci.e4 r;
    public boolean s;
    public boolean v;
    public ImageView w;
    public NumberTextView x;
    public final ArrayList y;

    public m9() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e3, code lost:
    
        if (r5.d != r15) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(m9 m9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        i9 i9Var;
        TLRPC.User user2;
        ArrayList arrayList = m9Var.F;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(m9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(m9Var.currentAccount).putChats(messages_messages2.chats, false);
            m9Var.I = messages_messages2.messages.isEmpty();
            i9 i9Var2 = !arrayList.isEmpty() ? (i9) hg.k0.g(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i12;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == m9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = MessageObject.getFromChatId(message) == m9Var.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new m8(0)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (i9Var2 != null) {
                            i10 = i12;
                            if (i9Var2.a == tL_messageActionConferenceCall.call_id) {
                                i9Var = i9Var2;
                                if (i9Var == null) {
                                    ArrayList arrayList2 = i9Var.b;
                                    i9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l4 = (Long) it.next();
                                        long longValue = l4.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User user3 = m9Var.getMessagesController().getUser(l4);
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
                                    if (i9Var2 != null && !arrayList.contains(i9Var2)) {
                                        arrayList.add(i9Var2);
                                    }
                                    i9Var2 = new i9();
                                    i9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = i9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l10 = (Long) it2.next();
                                        l10.getClass();
                                        ArrayList arrayList4 = i9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new t8(fromChatId, 0)) && (user2 = m9Var.getMessagesController().getUser(l10)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    i9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    i9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                i9Var = null;
                                break;
                            }
                            i9Var = (i9) arrayList.get(i16);
                            int i17 = i16;
                            if (i9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (i9Var == null) {
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
                        if (i9Var2 != null) {
                            ArrayList arrayList5 = i9Var2.b;
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
                        if (i9Var2 != null && !arrayList.contains(i9Var2)) {
                            arrayList.add(i9Var2);
                        }
                        i9Var2 = new i9();
                        i9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l11 = (Long) it3.next();
                            l11.getClass();
                            ArrayList arrayList6 = i9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new t8(fromChatId, 1)) && (user = m9Var.getMessagesController().getUser(l11)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        i9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        i9Var2.e = messageAction4 != null && messageAction4.video;
                        i9Var2.c.add(message);
                    }
                }
                i12 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 1;
            }
            if (i9Var2 != null && !i9Var2.c.isEmpty() && !arrayList.contains(i9Var2)) {
                arrayList.add(i9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            m9Var.I = true;
        }
        m9Var.G = false;
        if (!m9Var.H) {
            m9Var.resumeDelayedFragmentAnimation();
        }
        m9Var.H = z10;
        m9Var.E.setVisibility(arrayList.isEmpty() ? 8 : 0);
        j9 j9Var = m9Var.a;
        if (j9Var != null) {
            j9Var.b();
        }
        org.telegram.ui.Components.c71 c71Var = m9Var.c;
        if (c71Var != null) {
            c71Var.f3.N(true);
        }
    }

    public static void T(m9 m9Var) {
        org.telegram.ui.Components.c71 c71Var = m9Var.c;
        if (c71Var != null) {
            int childCount = c71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = m9Var.c.getChildAt(i10);
                if (childAt instanceof h9) {
                    ((h9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = m9Var.w;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(m9Var.getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.MULTIPLY));
            m9Var.w.setBackground(org.telegram.ui.ActionBar.i6.f0(m9Var.getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = m9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void U(m9 m9Var, org.telegram.ui.Components.g61 g61Var, View view) {
        int i10 = g61Var.d;
        if (i10 == 2) {
            m9Var.h0(true);
            org.telegram.ui.Components.rc I = org.telegram.ui.Components.yc.a0(m9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(m9Var, 2));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            g0(m9Var);
            return;
        }
        Object obj = g61Var.G;
        if (!(obj instanceof i9)) {
            if (view instanceof l9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((l9) view).c.id);
                m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                m9Var.presentFragment(new yn(bundle), m9Var.s);
                return;
            }
            return;
        }
        i9 i9Var = (i9) obj;
        ArrayList arrayList = i9Var.c;
        if (m9Var.actionBar.s()) {
            m9Var.Z(arrayList, (h9) view);
            return;
        }
        if (i9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            m9Var.presentFragment(new yn(bundle2), m9Var.s);
            return;
        }
        boolean z10 = i9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = i9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(m9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
        b2Var.q(600L);
    }

    public static void W(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.g2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(m9Var).d0(tL_error, false);
        }
    }

    public static void X(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.g2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(m9Var).d0(tL_error, false);
        }
    }

    public static void g0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new f9(a4.a.i("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static void i0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10, final boolean z11) {
        int i11;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, d6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final ?? r12 = {str};
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        frameLayout.addView(frameLayout2, w7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.y6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.i6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.z5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context, 20.0f, i13, true, d6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.z5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context, 14.0f, i13, false, d6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ci.e4.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.z5.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.b6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.i6.a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(i14, d6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i14, d6Var), org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), 12, 12));
        f7.addView(frameLayout3, w7.z5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.q90 a11 = w7.d6.a(context, 13.0f, i13, false, d6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(substring);
        frameLayout3.addView(a11, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.r5, d6Var), mode));
        frameLayout3.addView(imageView3, w7.z5.e(40, 48, 21));
        LinearLayout f10 = org.telegram.messenger.ok.f(context, 0);
        f7.addView(f10, w7.z5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.z5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ci.d dVar2 = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            c9 c9Var = new c9(context, d6Var);
            c9Var.setGravity(17);
            c9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z6, d6Var));
            c9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            c9Var.setTextSize(14.0f);
            f7.addView(c9Var, w7.z5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ai.s1 s1Var = new ai.s1(str, i11, f3VarArr);
            org.telegram.ui.Components.q90 a12 = w7.d6.a(context, 14.0f, i13, false, d6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), s1Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(ci.e4.a(a12.getText(), a12.getPaint()));
            f7.addView(a12, w7.z5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.b6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(s1Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = f7;
        f3Var.show();
        f3VarArr[0] = f3Var;
        final int i15 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.yc ycVar;
                int i16;
                switch (i15) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i16 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i16 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.ok.o(i16, ycVar);
            }
        });
        final int i16 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.yc ycVar;
                int i162;
                switch (i16) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i162 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i162 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.ok.o(i162, ycVar);
            }
        });
        final gg.e1 e1Var = new gg.e1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, d6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(d3Var, d6Var2, frameLayout3);
                int i17 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i17, string, new r1(strArr, f3Var2, d6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.g6(8, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, e1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ai.s0(context, str, r12, d6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.o5(f3Var, d6Var, imageView2, e1Var, 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.bh0
    public final boolean Q(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    public final void Z(ArrayList arrayList, h9 h9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean f02 = f0(arrayList);
        ArrayList arrayList2 = this.K;
        if (f02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.qp qpVar = h9Var.e;
            if (qpVar != null) {
                qpVar.a(false, true);
            }
            k0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.qp qpVar2 = h9Var.e;
        if (qpVar2 != null) {
            qpVar2.a(true, true);
        }
        k0();
    }

    public final void b0() {
        this.f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    public final void c0() {
        org.telegram.ui.Components.c71 c71Var = this.c;
        i0.b bVar = this.mSystemInsets;
        li.a.c(c71Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.L.c(AndroidUtilities.dp(7.0f))), this.T);
        this.d.getLayoutParams().height = this.actionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.L.c(AndroidUtilities.dp(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).topMargin = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b) - AndroidUtilities.dp(19.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.W + this.T);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.J();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        if (!this.v) {
            hg.k0.u(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 24));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.E = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.E.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new c5(this, i10), new x8(this), new x8(this));
        this.c = c71Var;
        c71Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.s1();
        this.c.setSectionsDrawBackground(true);
        this.c.f3.r = false;
        y8 y8Var = new y8(this, context, i11);
        this.n = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        this.h = w00Var;
        w00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        this.h.w = false;
        j9 j9Var = new j9(this, context, this.h);
        this.a = j9Var;
        this.n.addView(j9Var, w7.z5.c(-1.0f, -1));
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.c71 c71Var2 = this.c;
        s4.c0 c0Var = new s4.c0(1, false);
        this.b = c0Var;
        c71Var2.setLayoutManager(c0Var);
        this.c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(this.c, this.b);
        this.e = bl0Var;
        li.m mVar = this.glassEngine;
        Objects.requireNonNull(mVar);
        bl0Var.h = new z0(mVar, 12);
        int i12 = 3;
        this.n.addView(this.c, w7.z5.e(-1, -1, 3));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, w7.z5.e(-1, 0, 48));
        this.c.setOnScrollListener(new z8(this));
        if (this.G) {
            this.a.a();
        } else {
            this.a.b();
        }
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.f = c20Var;
        c20Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new p8(this, i12));
        this.n.addView(this.f, org.telegram.ui.Components.c20.b());
        org.telegram.ui.Components.ns nsVar = new org.telegram.ui.Components.ns(context);
        this.L = nsVar;
        nsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.L.setOnAnimatedHeightChangedListener(new n8(this, 4));
        org.telegram.ui.Components.ns nsVar2 = this.L;
        ch.d c10 = getBaseSimpleGlass().c.c(this.L, null, false);
        c10.x(eh.b.o(this.resourceProvider));
        c10.z(AndroidUtilities.dp(24.0f));
        c10.y(AndroidUtilities.dp(7.0f));
        nsVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        this.L.addView(frameLayout);
        this.L.i(this.M, true, false);
        a9 a9Var = new a9(this, context, this, this.n, this.resourceProvider);
        this.N = a9Var;
        this.M.addView(a9Var);
        this.L.setCallFragmentContextView(this.N);
        this.n.addView(this.L, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.actionBar);
        setBulletinDelegate(new b9(this, i11));
        if (this.v) {
            View view2 = this.fragmentView;
            x8 x8Var = new x8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.j(view2, x8Var);
        }
        return this.fragmentView;
    }

    public final void d0(int i10, int i11) {
        if (this.G) {
            return;
        }
        this.G = true;
        j9 j9Var = this.a;
        if (j9Var != null && !this.H) {
            j9Var.a();
        }
        org.telegram.ui.Components.c71 c71Var = this.c;
        if (c71Var != null) {
            c71Var.f3.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Long l4;
        org.telegram.ui.Components.c71 c71Var;
        int i12;
        ArrayList arrayList;
        i9 i9Var;
        TLRPC.User user;
        int i13 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList2 = this.F;
        if (i10 != i13) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.H && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        i9 i9Var2 = (i9) it.next();
                        Iterator it2 = i9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (i9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (c71Var = this.c) == null) {
                        return;
                    }
                    c71Var.f3.N(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.J = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.c71 c71Var2 = this.c;
                if (c71Var2 != null) {
                    c71Var2.f3.N(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l4 = this.Q) != null && l4.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.g2.l(this.P, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.Q = null;
                    return;
                }
                return;
            }
            Long l10 = this.Q;
            if (l10 == null || ((TLRPC.ChatFull) objArr[0]).id != l10.longValue() || getMessagesController().getGroupCall(this.Q.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.g2.l(this.P, null, false, null, getParentActivity(), this, getAccountInstance());
            this.Q = null;
            return;
        }
        if (this.H && !((Boolean) objArr[2]).booleanValue()) {
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
                        i9 i9Var3 = (i9) arrayList2.get(0);
                        ArrayList arrayList5 = i9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j3 && i9Var3.d == r12) {
                                i9Var3.c.add(0, messageObject.messageOwner);
                                i14 = i12;
                            }
                            i9 i9Var4 = new i9();
                            ArrayList arrayList6 = i9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = i9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j3));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            i9Var4.d = r12;
                            i9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, i9Var4);
                            this.c.f3.N(true);
                        }
                    }
                    i12 = i15;
                    i9 i9Var42 = new i9();
                    ArrayList arrayList62 = i9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = i9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                    }
                    i9Var42.d = r12;
                    i9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, i9Var42);
                    this.c.f3.N(true);
                } else {
                    i12 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new m8(0)).collect(Collectors.toSet());
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
                                    i9Var = null;
                                    break;
                                }
                                i9Var = (i9) arrayList2.get(i18);
                                arrayList = arrayList2;
                                if (i9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                arrayList2 = arrayList;
                            }
                            if (i9Var != null) {
                                ArrayList arrayList8 = i9Var.b;
                                i9Var.c.add(0, messageObject.messageOwner);
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
                                this.c.f3.N(true);
                                i14 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        i9 i9Var5 = new i9();
                        i9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = i9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = i9Var5.b;
                        arrayList10.clear();
                        for (Long l12 : set) {
                            l12.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l12);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        i9Var5.d = r12;
                        i9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, i9Var5);
                        this.c.f3.N(true);
                        i14 = i12;
                    }
                }
                i14 = i12;
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.E;
            if (v0Var != null) {
                v0Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(boolean z10) {
        org.telegram.ui.Components.qp qpVar;
        this.actionBar.r();
        this.K.clear();
        int childCount = this.c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.c.getChildAt(i10);
            if ((childAt instanceof h9) && (qpVar = ((h9) childAt).e) != null) {
                qpVar.a(false, z10);
            }
        }
        this.c.f3.N(true);
    }

    public final boolean f0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.K.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.a, 4, new Class[]{j9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.a, 4, new Class[]{j9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h6));
        int i10 = org.telegram.ui.ActionBar.i6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        org.telegram.ui.Components.c20 c20Var = this.f;
        if (c20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(c20Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f.c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.il));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f1}, null, org.telegram.ui.ActionBar.i6.z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.Q0;
        int i11 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, textPaint, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{h9.class}, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.V4, org.telegram.ui.ActionBar.i6.X4}, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.W4, org.telegram.ui.ActionBar.i6.Y4}, null, org.telegram.ui.ActionBar.i6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        return arrayList;
    }

    public final void h0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.c.f3.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
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
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(getParentActivity(), 1);
        a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
        a2Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        a2Var.setOnClickListener(new o8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public final void k0() {
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.K;
        boolean z10 = true;
        char c10 = 1;
        if (!s10) {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.y;
            if (!a2) {
                org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
                if (this.v) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.w = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.w.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.w.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.MULTIPLY));
                    this.w.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.z8), 1, -1));
                    this.w.setOnClickListener(new p8(this, c10 == true ? 1 : 0));
                    j3.addView(this.w, w7.z5.q(54, 54, 16));
                    arrayList2.add(this.w);
                }
                NumberTextView numberTextView = new NumberTextView(j3.getContext());
                this.x = numberTextView;
                numberTextView.setTextSize(18);
                this.x.setTypeface(AndroidUtilities.bold());
                this.x.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y8, false));
                j3.addView(this.x, w7.z5.m(1.0f, 0, -1, this.v ? 18 : 72, 0, 0));
                this.x.setOnTouchListener(new bi.d(2));
                arrayList2.add(j3.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.M(null, null);
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
            e0(true);
            return;
        }
        this.x.a(arrayList.size(), z10);
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
        e0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.S || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        ci.e4 e4Var = new ci.e4(getParentActivity(), 1);
        this.r = e4Var;
        e4Var.d = 3000L;
        e4Var.l(1.0f, -25.0f);
        this.r.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.r.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.n.addView(this.r, w7.z5.e(-1, 80, 48));
        this.r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.r.u();
        this.S = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        d0(0, 50);
        this.J = getMessagesController().getActiveGroupCalls();
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        this.R = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messagesDeleted).add(NotificationCenter.activeGroupCallsUpdated).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.s = bundle.getBoolean("needFinishFragment", true);
            this.v = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.T = this.v ? AndroidUtilities.dp(72.0f) : 0;
        this.U = this.v ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        c0();
        b0();
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
                org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.g2.l(this.P, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.O != null ? getMessagesController().getUserFull(this.O.id) : null;
                org.telegram.ui.Components.voip.g2.m(this.O, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.c71 c71Var = this.c;
        if (c71Var != null) {
            c71Var.f3.N(true);
        }
    }

    @Override // org.telegram.ui.bh0
    public final void r() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.bl0 bl0Var = this.e;
        bl0Var.b = 1;
        bl0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.bh0
    public final fh.d x() {
        return null;
    }

    public m9(Bundle bundle) {
        super(bundle);
        this.s = true;
        this.y = new ArrayList();
        this.F = new ArrayList();
        this.K = new ArrayList();
        this.S = false;
    }
}
