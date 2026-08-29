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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, mg0 {
    public final ArrayList A;
    public org.telegram.ui.ActionBar.w0 B;
    public final ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.fs I;
    public FrameLayout J;
    public v8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public final Rect T;
    public final lg.e U;
    public final qg.d V;
    public final qg.d W;
    public final lg.a X;
    public lg.k Y;
    public final ArrayList Z;
    public final int a;
    public final RectF a0;
    public e9 b;
    public final RectF b0;
    public f2.j0 c;
    public org.telegram.ui.Components.u51 d;
    public c2.z e;
    public org.telegram.ui.Components.u10 f;
    public org.telegram.ui.Components.p00 h;
    public ih.j4 n;
    public cg.i0 r;
    public nh.t3 s;
    public boolean v;
    public boolean w;
    public ImageView x;
    public NumberTextView y;

    public h9() {
        this(null);
    }

    public static void U(h9 h9Var) {
        org.telegram.ui.Components.u51 u51Var = h9Var.d;
        if (u51Var != null) {
            int childCount = u51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = h9Var.d.getChildAt(i10);
                if (childAt instanceof c9) {
                    ((c9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = h9Var.x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(h9Var.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            h9Var.x.setBackground(org.telegram.ui.ActionBar.g6.f0(h9Var.getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.l lVar = h9Var.actionBar;
        if (lVar != null) {
            lVar.e();
        }
    }

    public static void V(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().putUsers(groupcall.users, false);
            h9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.h2.h(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.tc.a0(h9Var).d0(tL_error, false);
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
    public static void W(h9 h9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        d9 d9Var;
        TLRPC.User user2;
        ArrayList arrayList = h9Var.C;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(h9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(h9Var.currentAccount).putChats(messages_messages2.chats, false);
            h9Var.F = messages_messages2.messages.isEmpty();
            d9 d9Var2 = !arrayList.isEmpty() ? (d9) j7.l1.i(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i12;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == h9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = MessageObject.getFromChatId(message) == h9Var.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new j8(0)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (d9Var2 != null) {
                            i10 = i12;
                            if (d9Var2.a == tL_messageActionConferenceCall.call_id) {
                                d9Var = d9Var2;
                                if (d9Var == null) {
                                    ArrayList arrayList2 = d9Var.b;
                                    d9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l10 = (Long) it.next();
                                        long longValue = l10.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User user3 = h9Var.getMessagesController().getUser(l10);
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
                                    if (d9Var2 != null && !arrayList.contains(d9Var2)) {
                                        arrayList.add(d9Var2);
                                    }
                                    d9Var2 = new d9();
                                    d9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = d9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l11 = (Long) it2.next();
                                        l11.getClass();
                                        ArrayList arrayList4 = d9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new o8(fromChatId, 0)) && (user2 = h9Var.getMessagesController().getUser(l11)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    d9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    d9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                d9Var = null;
                                break;
                            }
                            d9Var = (d9) arrayList.get(i16);
                            int i17 = i16;
                            if (d9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (d9Var == null) {
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
                        if (d9Var2 != null) {
                            ArrayList arrayList5 = d9Var2.b;
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
                        if (d9Var2 != null && !arrayList.contains(d9Var2)) {
                            arrayList.add(d9Var2);
                        }
                        d9Var2 = new d9();
                        d9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l12 = (Long) it3.next();
                            l12.getClass();
                            ArrayList arrayList6 = d9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new o8(fromChatId, 1)) && (user = h9Var.getMessagesController().getUser(l12)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        d9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        d9Var2.e = messageAction4 != null && messageAction4.video;
                        d9Var2.c.add(message);
                    }
                }
                i12 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 1;
            }
            if (d9Var2 != null && !d9Var2.c.isEmpty() && !arrayList.contains(d9Var2)) {
                arrayList.add(d9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            h9Var.F = true;
        }
        h9Var.D = false;
        if (!h9Var.E) {
            h9Var.resumeDelayedFragmentAnimation();
        }
        h9Var.E = z10;
        h9Var.B.setVisibility(arrayList.isEmpty() ? 8 : 0);
        e9 e9Var = h9Var.b;
        if (e9Var != null) {
            e9Var.b();
        }
        org.telegram.ui.Components.u51 u51Var = h9Var.d;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
    }

    public static void X(h9 h9Var, org.telegram.ui.Components.w41 w41Var, View view) {
        int i10 = w41Var.d;
        if (i10 == 2) {
            h9Var.n0(true);
            org.telegram.ui.Components.mc I = org.telegram.ui.Components.tc.a0(h9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new h8(h9Var, 4));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            m0(h9Var);
            return;
        }
        Object obj = w41Var.G;
        if (!(obj instanceof d9)) {
            if (view instanceof g9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((g9) view).c.id);
                h9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                h9Var.presentFragment(new tn(bundle), h9Var.v);
                return;
            }
            return;
        }
        d9 d9Var = (d9) obj;
        ArrayList arrayList = d9Var.c;
        if (h9Var.actionBar.s()) {
            h9Var.e0(arrayList, (c9) view);
            return;
        }
        if (d9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            h9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            h9Var.presentFragment(new tn(bundle2), h9Var.v);
            return;
        }
        boolean z10 = d9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = d9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(h9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = h9Var.getMessagesController().conferenceCallSizeLimit;
        c2Var.setOnCancelListener(new n8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(h9Var, c2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
        c2Var.q(600L);
    }

    public static void Y(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().putUsers(groupcall.users, false);
            h9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.h2.h(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.tc.a0(h9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new a9(a4.w.i("isCall", true), o2Var.getCurrentAccount(), o2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10, final boolean z11) {
        int i11;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, i7.f6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, i7.f6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        frameLayout.addView(frameLayout2, i7.f6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, i7.f6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.y80 a2 = i7.j6.a(context, 20.0f, i13, true, c6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        g10.addView(a2, i7.f6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.y80 a10 = i7.j6.a(context, 14.0f, i13, false, c6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(nh.t3.a(a10.getText(), a10.getPaint()));
        g10.addView(a10, i7.f6.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        i7.h6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 12, 12));
        g10.addView(frameLayout3, i7.f6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.y80 a11 = i7.j6.a(context, 13.0f, i13, false, c6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(substring);
        frameLayout3.addView(a11, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r5, c6Var), mode));
        frameLayout3.addView(imageView3, i7.f6.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.x3.g(context, 0);
        g10.addView(g11, i7.f6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        g11.addView(dVar, i7.f6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        nh.d dVar2 = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        g11.addView(dVar2, i7.f6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            x8 x8Var = new x8(context, c6Var);
            x8Var.setGravity(17);
            x8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            x8Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            x8Var.setTextSize(14.0f);
            g10.addView(x8Var, i7.f6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ag.v0 v0Var = new ag.v0(str, i11, f3VarArr, 26);
            org.telegram.ui.Components.y80 a12 = i7.j6.a(context, 14.0f, i13, false, c6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), v0Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(nh.t3.a(a12.getText(), a12.getPaint()));
            g10.addView(a12, i7.f6.t(-1, -2, 17, 32, 8, 32, 12));
            i7.h6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(v0Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = g10;
        f3Var.show();
        f3VarArr[0] = f3Var;
        final int i15 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.q8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.tc tcVar;
                int i16;
                switch (i15) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i16 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i16 = R.string.LinkCopied;
                        break;
                }
                b.n(i16, tcVar);
            }
        });
        final int i16 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.q8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.tc tcVar;
                int i162;
                switch (i16) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i162 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i162 = R.string.LinkCopied;
                        break;
                }
                b.n(i162, tcVar);
            }
        });
        final ih.m2 m2Var = new ih.m2(i11, frameLayout3, inputGroupCall, f3Var, c6Var, a11, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F(d3Var, c6Var2, frameLayout3);
                int i17 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i17, string, new u1(strArr2, f3Var2, c6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.c(13, context, strArr2), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, m2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new lh.b0(context, str, strArr, c6Var, f3Var, 5));
        if (z11) {
            imageView2.setOnClickListener(new ih.u3(f3Var, c6Var, imageView2, m2Var, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10 = 0;
        if (!this.w) {
            th.y(false, this.actionBar);
        }
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.B = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.B.setOnClickListener(new l8(this, 2));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new b5(this, i11), new i8(this), new i8(this));
        this.d = u51Var;
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        u51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, this.resourceProvider));
        this.d.p1();
        this.d.U2.r = false;
        this.n = new ih.j4(this, context, i11);
        sg.i iVar = new sg.i(this.n);
        ih.j4 j4Var = this.n;
        lg.a aVar = this.X;
        aVar.d = iVar;
        aVar.e = j4Var;
        org.telegram.ui.Components.u51 u51Var2 = this.d;
        Objects.requireNonNull(u51Var2);
        this.Y = new lg.k(u51Var2, j4Var, new t8(u51Var2, i10));
        this.d.C0(new h8(this, 6));
        ih.j4 j4Var2 = this.n;
        this.fragmentView = j4Var2;
        j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.h = p00Var;
        p00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.h.w = false;
        e9 e9Var = new e9(this, context, this.h);
        this.b = e9Var;
        this.n.addView(e9Var, i7.f6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.b);
        org.telegram.ui.Components.u51 u51Var3 = this.d;
        f2.j0 j0Var = new f2.j0(1, false);
        this.c = j0Var;
        u51Var3.setLayoutManager(j0Var);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        c2.z zVar = new c2.z(this.d, this.c);
        this.e = zVar;
        zVar.h = new i8(this);
        ih.j4 j4Var3 = this.n;
        org.telegram.ui.Components.u51 u51Var4 = this.d;
        float f9 = -this.a;
        j4Var3.addView(u51Var4, i7.f6.d(-1, -1.0f, 3, 0.0f, f9, 0.0f, f9));
        this.d.setOnScrollListener(new u8(this));
        if (this.D) {
            this.b.a();
        } else {
            this.b.b();
        }
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.f = u10Var;
        u10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new l8(this, 3));
        this.n.addView(this.f, org.telegram.ui.Components.u10.b());
        org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
        this.I = fsVar;
        fsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.I.setOnAnimatedHeightChangedListener(new h8(this, i10));
        ng.d c3 = aVar.c(this.I, pg.a.m(this.resourceProvider), false);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        this.I.setBlurredBackground(c3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        v8 v8Var = new v8(this, context, this, this.n, this.resourceProvider, 0);
        this.K = v8Var;
        this.J.addView(v8Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, i7.f6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.actionBar);
        cg.i0 i0Var = new cg.i0(context, this.parentLayout);
        this.r = i0Var;
        i0Var.b(false, false);
        this.n.addView(this.r, i7.f6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new w8(this, i10));
        if (this.w) {
            View view = this.fragmentView;
            i8 i8Var = new i8(this);
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.j(view, i8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Long l10;
        org.telegram.ui.Components.u51 u51Var;
        int i12;
        ArrayList arrayList;
        d9 d9Var;
        TLRPC.User user;
        int i13 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList2 = this.C;
        if (i10 != i13) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.E && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        d9 d9Var2 = (d9) it.next();
                        Iterator it2 = d9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (d9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (u51Var = this.d) == null) {
                        return;
                    }
                    u51Var.U2.N(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.G = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.u51 u51Var2 = this.d;
                if (u51Var2 != null) {
                    u51Var2.U2.N(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l10 = this.N) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.h2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l11 = this.N;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().getGroupCall(this.N.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.h2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            this.N = null;
            return;
        }
        if (this.E && !((Boolean) objArr[2]).booleanValue()) {
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
                    long j10 = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                    int i16 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                    if (i16 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i16 = 2;
                    }
                    if (i16 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i16;
                    }
                    if (!arrayList2.isEmpty()) {
                        d9 d9Var3 = (d9) arrayList2.get(0);
                        ArrayList arrayList5 = d9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && d9Var3.d == r12) {
                                d9Var3.c.add(0, messageObject.messageOwner);
                                i14 = i12;
                            }
                            d9 d9Var4 = new d9();
                            ArrayList arrayList6 = d9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = d9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j10));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            d9Var4.d = r12;
                            d9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, d9Var4);
                            this.d.U2.N(true);
                        }
                    }
                    i12 = i15;
                    d9 d9Var42 = new d9();
                    ArrayList arrayList62 = d9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = d9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                    }
                    d9Var42.d = r12;
                    d9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, d9Var42);
                    this.d.U2.N(true);
                } else {
                    i12 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new j8(0)).collect(Collectors.toSet());
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
                                    d9Var = null;
                                    break;
                                }
                                d9Var = (d9) arrayList2.get(i18);
                                arrayList = arrayList2;
                                if (d9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                arrayList2 = arrayList;
                            }
                            if (d9Var != null) {
                                ArrayList arrayList8 = d9Var.b;
                                d9Var.c.add(0, messageObject.messageOwner);
                                for (Long l12 : set) {
                                    long longValue = l12.longValue();
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
                                            TLRPC.User user2 = getMessagesController().getUser(l12);
                                            if (user2 != null) {
                                                arrayList8.add(user2);
                                            }
                                        }
                                    }
                                }
                                this.d.U2.N(true);
                                i14 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        d9 d9Var5 = new d9();
                        d9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = d9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = d9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l13);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        d9Var5.d = r12;
                        d9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, d9Var5);
                        this.d.U2.N(true);
                        i14 = i12;
                    }
                }
                i14 = i12;
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.B;
            if (w0Var != null) {
                w0Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(ArrayList arrayList, c9 c9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.H;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.hp hpVar = c9Var.e;
            if (hpVar != null) {
                hpVar.a(false, true);
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
        org.telegram.ui.Components.hp hpVar2 = c9Var.e;
        if (hpVar2 != null) {
            hpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        lg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.U) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f) + ((int) this.I.c(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.a0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.b0;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.w ? 2 : 1, this.Z);
        eVar.e(this.Y, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void g0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, new Class[]{e9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, new Class[]{e9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        org.telegram.ui.Components.u10 u10Var = this.f;
        if (u10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(u10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.Q0;
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.V4, org.telegram.ui.ActionBar.g6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.W4, org.telegram.ui.ActionBar.g6.Y4}, null, org.telegram.ui.ActionBar.g6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.T;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.u51 u51Var = this.d;
        int i10 = this.a;
        u51Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.I.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.S + this.P);
        this.b.setPadding(0, 0, 0, this.S + this.P);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.D) {
            return;
        }
        this.D = true;
        e9 e9Var = this.b;
        if (e9Var != null && !this.E) {
            e9Var.a();
        }
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new o(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.hp hpVar;
        this.actionBar.r();
        this.H.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof c9) && (hpVar = ((c9) childAt).e) != null) {
                hpVar.a(false, z10);
            }
        }
        this.d.U2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
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
        this.d.U2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.O || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        nh.t3 t3Var = new nh.t3(getParentActivity(), 1);
        this.s = t3Var;
        t3Var.d = 3000L;
        t3Var.m(1.0f, -25.0f);
        this.s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.n.addView(this.s, i7.f6.e(-1, 80, 48));
        this.s.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.s.v();
        this.O = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        j0(0, 50);
        this.G = getMessagesController().getActiveGroupCalls();
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
        this.P = this.w ? AndroidUtilities.dp(72.0f) : 0;
        this.Q = this.w ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.S = i13;
        i0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
                org.telegram.ui.Components.voip.h2.i(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.h2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.L != null ? getMessagesController().getUserFull(this.L.id) : null;
                org.telegram.ui.Components.voip.h2.n(this.L, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
    }

    public final void p0(boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.DeleteAllCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            c2Var.N = LocaleController.getString(R.string.DeleteCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
        y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        y1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        y1Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public final void q0() {
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.H;
        boolean z10 = true;
        char c3 = 1;
        if (!s10) {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.A;
            if (!a2) {
                org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
                if (this.w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.x.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                    this.x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
                    this.x.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
                    this.x.setOnClickListener(new l8(this, c3 == true ? 1 : 0));
                    j10.addView(this.x, i7.f6.q(54, 54, 16));
                    arrayList2.add(this.x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.y = numberTextView;
                numberTextView.setTextSize(18);
                this.y.setTypeface(AndroidUtilities.bold());
                this.y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                j10.addView(this.y, i7.f6.m(1.0f, 0, -1, this.w ? 18 : 72, 0, 0));
                this.y.setOnTouchListener(new mh.d(2));
                arrayList2.add(j10.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.O(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                View view = (View) arrayList2.get(i10);
                view.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f);
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

    @Override // org.telegram.ui.mg0
    public final void s() {
        if (this.c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.z zVar = this.e;
        zVar.b = 1;
        zVar.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.mg0
    public final qg.d y() {
        return this.W;
    }

    public h9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.H = new ArrayList();
        this.O = false;
        this.T = new Rect();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        RectF rectF = new RectF();
        this.a0 = rectF;
        RectF rectF2 = new RectF();
        this.b0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        if (i10 < 31) {
            this.U = null;
            this.V = null;
            this.W = null;
            this.X = new lg.a(cVar);
            return;
        }
        this.U = new lg.e(false);
        this.V = new qg.d(null);
        qg.d dVar = new qg.d(null);
        this.W = dVar;
        lg.a aVar = new lg.a(dVar);
        this.X = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }
}
