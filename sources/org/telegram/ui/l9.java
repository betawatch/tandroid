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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l9 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, ug0 {
    public final ArrayList B;
    public org.telegram.ui.ActionBar.w0 C;
    public final ArrayList D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.js J;
    public FrameLayout K;
    public z8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public final Rect U;
    public final ng.e V;
    public final sg.d W;
    public final sg.d X;
    public final ng.a Y;
    public ng.k Z;
    public final int a;
    public final ArrayList a0;
    public i9 b;
    public final RectF b0;
    public f2.i0 c;
    public final RectF c0;
    public org.telegram.ui.Components.g61 d;
    public c2.y e;
    public org.telegram.ui.Components.z10 f;
    public org.telegram.ui.Components.t00 h;
    public kh.j4 n;
    public eg.i0 r;
    public ph.f3 s;
    public boolean v;
    public boolean w;
    public ImageView x;
    public NumberTextView y;

    public l9() {
        this(null);
    }

    public static void U(l9 l9Var) {
        org.telegram.ui.Components.g61 g61Var = l9Var.d;
        if (g61Var != null) {
            int childCount = g61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = l9Var.d.getChildAt(i10);
                if (childAt instanceof g9) {
                    ((g9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = l9Var.x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            l9Var.x.setBackground(org.telegram.ui.ActionBar.j6.f0(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = l9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void V(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            l9Var.getMessagesController().putUsers(groupcall.users, false);
            l9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.f2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
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
    public static void W(l9 l9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z4;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        h9 h9Var;
        TLRPC.User user2;
        ArrayList arrayList = l9Var.D;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(l9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(l9Var.currentAccount).putChats(messages_messages2.chats, false);
            l9Var.G = messages_messages2.messages.isEmpty();
            h9 h9Var2 = !arrayList.isEmpty() ? (h9) kh.a2.i(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i12;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == l9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = MessageObject.getFromChatId(message) == l9Var.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new n8(0)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (h9Var2 != null) {
                            i10 = i12;
                            if (h9Var2.a == tL_messageActionConferenceCall.call_id) {
                                h9Var = h9Var2;
                                if (h9Var == null) {
                                    ArrayList arrayList2 = h9Var.b;
                                    h9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l10 = (Long) it.next();
                                        long longValue = l10.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User user3 = l9Var.getMessagesController().getUser(l10);
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
                                    if (h9Var2 != null && !arrayList.contains(h9Var2)) {
                                        arrayList.add(h9Var2);
                                    }
                                    h9Var2 = new h9();
                                    h9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = h9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l11 = (Long) it2.next();
                                        l11.getClass();
                                        ArrayList arrayList4 = h9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new s8(fromChatId, 0)) && (user2 = l9Var.getMessagesController().getUser(l11)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    h9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    h9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                h9Var = null;
                                break;
                            }
                            h9Var = (h9) arrayList.get(i16);
                            int i17 = i16;
                            if (h9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (h9Var == null) {
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
                        if (h9Var2 != null) {
                            ArrayList arrayList5 = h9Var2.b;
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
                        if (h9Var2 != null && !arrayList.contains(h9Var2)) {
                            arrayList.add(h9Var2);
                        }
                        h9Var2 = new h9();
                        h9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l12 = (Long) it3.next();
                            l12.getClass();
                            ArrayList arrayList6 = h9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new s8(fromChatId, 1)) && (user = l9Var.getMessagesController().getUser(l12)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        h9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        h9Var2.e = messageAction4 != null && messageAction4.video;
                        h9Var2.c.add(message);
                    }
                }
                i12 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 1;
            }
            if (h9Var2 != null && !h9Var2.c.isEmpty() && !arrayList.contains(h9Var2)) {
                arrayList.add(h9Var2);
            }
            z4 = true;
        } else {
            z4 = true;
            l9Var.G = true;
        }
        l9Var.E = false;
        if (!l9Var.F) {
            l9Var.resumeDelayedFragmentAnimation();
        }
        l9Var.F = z4;
        l9Var.C.setVisibility(arrayList.isEmpty() ? 8 : 0);
        i9 i9Var = l9Var.b;
        if (i9Var != null) {
            i9Var.b();
        }
        org.telegram.ui.Components.g61 g61Var = l9Var.d;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public static void X(l9 l9Var, org.telegram.ui.Components.i51 i51Var, View view) {
        int i10 = i51Var.d;
        if (i10 == 2) {
            l9Var.n0(true);
            org.telegram.ui.Components.ic I = org.telegram.ui.Components.qc.a0(l9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(l9Var, 4));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            m0(l9Var);
            return;
        }
        Object obj = i51Var.G;
        if (!(obj instanceof h9)) {
            if (view instanceof k9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((k9) view).c.id);
                l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                l9Var.presentFragment(new xn(bundle), l9Var.v);
                return;
            }
            return;
        }
        h9 h9Var = (h9) obj;
        ArrayList arrayList = h9Var.c;
        if (l9Var.actionBar.s()) {
            l9Var.e0(arrayList, (g9) view);
            return;
        }
        if (h9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            l9Var.presentFragment(new xn(bundle2), l9Var.v);
            return;
        }
        boolean z4 = h9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = h9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(l9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
        d2Var.setOnCancelListener(new r8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(l9Var, d2Var, hashSet, tL_inputGroupCallInviteMessage, z4, 0)), 0));
        d2Var.q(600L);
    }

    public static void Y(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            l9Var.getMessagesController().putUsers(groupcall.users, false);
            l9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.f2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(new e9(android.support.v4.media.a.i("isCall", true), p2Var.getCurrentAccount(), p2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.f6 f6Var, boolean z4, final boolean z10) {
        int i11;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var);
        final org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
        g3Var.setBackgroundColor(v02);
        g3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, k7.b6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        frameLayout.addView(frameLayout2, k7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 1, -1));
        if (z10) {
            frameLayout.addView(imageView2, k7.b6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.e90 a2 = k7.f6.a(context, 20.0f, i13, true, f6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f10.addView(a2, k7.b6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.e90 a10 = k7.f6.a(context, 14.0f, i13, false, f6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ph.f3.a(a10.getText(), a10.getPaint()));
        f10.addView(a10, k7.b6.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        k7.d6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 12, 12));
        f10.addView(frameLayout3, k7.b6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.e90 a11 = k7.f6.a(context, 13.0f, i13, false, f6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(substring);
        frameLayout3.addView(a11, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, f6Var), mode));
        frameLayout3.addView(imageView3, k7.b6.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        f10.addView(f11, k7.b6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f11.addView(dVar, k7.b6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ph.d dVar2 = new ph.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.mq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f11.addView(dVar2, k7.b6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        if (z4) {
            b9 b9Var = new b9(context, f6Var);
            b9Var.setGravity(17);
            b9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
            b9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            b9Var.setTextSize(14.0f);
            f10.addView(b9Var, k7.b6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ah.a aVar = new ah.a(str, i11, g3VarArr, 24);
            org.telegram.ui.Components.e90 a12 = k7.f6.a(context, 14.0f, i13, false, f6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), aVar), true));
            a12.setGravity(17);
            a12.setMaxWidth(ph.f3.a(a12.getText(), a12.getPaint()));
            f10.addView(a12, k7.b6.t(-1, -2, 17, 32, 8, 32, 12));
            k7.d6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(aVar, 9));
        } else {
            i11 = i10;
        }
        g3Var.customView = f10;
        g3Var.show();
        g3VarArr[0] = g3Var;
        final int i15 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.qc qcVar;
                int i16;
                switch (i15) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i16 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i16 = R.string.LinkCopied;
                        break;
                }
                b.m(i16, qcVar);
            }
        });
        final int i16 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.qc qcVar;
                int i162;
                switch (i16) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i162 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i162 = R.string.LinkCopied;
                        break;
                }
                b.m(i162, qcVar);
            }
        });
        final kh.m2 m2Var = new kh.m2(i11, frameLayout3, inputGroupCall, g3Var, f6Var, a11, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.g3 g3Var2 = org.telegram.ui.ActionBar.g3.this;
                org.telegram.ui.ActionBar.e3 e3Var = g3Var2.container;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(e3Var, f6Var2, frameLayout3);
                int i17 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i17, string, new s1(strArr2, g3Var2, f6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.b(22, context, strArr2), false);
                F.m(z10, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, m2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new nh.c0(context, str, strArr, f6Var, g3Var, 5));
        if (z10) {
            imageView2.setOnClickListener(new kh.u3(g3Var, f6Var, imageView2, m2Var, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.ug0
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10 = 0;
        if (!this.w) {
            yh.z(false, this.actionBar);
        }
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.C = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.C.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new d5(this, i11), new m8(this), new m8(this));
        this.d = g61Var;
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        g61Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, this.resourceProvider));
        this.d.p1();
        this.d.V2.r = false;
        this.n = new kh.j4(this, context, i11);
        ug.i iVar = new ug.i(this.n);
        kh.j4 j4Var = this.n;
        ng.a aVar = this.Y;
        aVar.d = iVar;
        aVar.e = j4Var;
        org.telegram.ui.Components.g61 g61Var2 = this.d;
        Objects.requireNonNull(g61Var2);
        this.Z = new ng.k(g61Var2, j4Var, new x8(g61Var2, i10));
        this.d.C0(new l8(this, 6));
        kh.j4 j4Var2 = this.n;
        this.fragmentView = j4Var2;
        j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.h = t00Var;
        t00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.h.w = false;
        i9 i9Var = new i9(this, context, this.h);
        this.b = i9Var;
        this.n.addView(i9Var, k7.b6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.b);
        org.telegram.ui.Components.g61 g61Var3 = this.d;
        f2.i0 i0Var = new f2.i0(1, false);
        this.c = i0Var;
        g61Var3.setLayoutManager(i0Var);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        c2.y yVar = new c2.y(this.d, this.c);
        this.e = yVar;
        yVar.h = new m8(this);
        kh.j4 j4Var3 = this.n;
        org.telegram.ui.Components.g61 g61Var4 = this.d;
        float f10 = -this.a;
        j4Var3.addView(g61Var4, k7.b6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.d.setOnScrollListener(new y8(this));
        if (this.E) {
            this.b.a();
        } else {
            this.b.b();
        }
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f = z10Var;
        z10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new p8(this, 3));
        this.n.addView(this.f, org.telegram.ui.Components.z10.b());
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.J = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.J.setOnAnimatedHeightChangedListener(new l8(this, i10));
        pg.b c3 = aVar.c(this.J, rg.b.m(this.resourceProvider), false);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        this.J.setBlurredBackground(c3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        z8 z8Var = new z8(this, context, this, this.n, this.resourceProvider, 0);
        this.L = z8Var;
        this.K.addView(z8Var);
        this.J.setCallFragmentContextView(this.L);
        this.n.addView(this.J, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.actionBar);
        eg.i0 i0Var2 = new eg.i0(context, this.parentLayout);
        this.r = i0Var2;
        i0Var2.b(false, false);
        this.n.addView(this.r, k7.b6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new a9(this, i10));
        if (this.w) {
            View view = this.fragmentView;
            m8 m8Var = new m8(this);
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.j(view, m8Var);
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
        org.telegram.ui.Components.g61 g61Var;
        int i12;
        ArrayList arrayList;
        h9 h9Var;
        TLRPC.User user;
        int i13 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList2 = this.D;
        if (i10 != i13) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.F && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        h9 h9Var2 = (h9) it.next();
                        Iterator it2 = h9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (h9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (g61Var = this.d) == null) {
                        return;
                    }
                    g61Var.V2.N(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.H = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.g61 g61Var2 = this.d;
                if (g61Var2 != null) {
                    g61Var2.V2.N(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l10 = this.O) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.f2.m(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.O = null;
                    return;
                }
                return;
            }
            Long l11 = this.O;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().getGroupCall(this.O.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.f2.m(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
            this.O = null;
            return;
        }
        if (this.F && !((Boolean) objArr[2]).booleanValue()) {
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
                        h9 h9Var3 = (h9) arrayList2.get(0);
                        ArrayList arrayList5 = h9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && h9Var3.d == r12) {
                                h9Var3.c.add(0, messageObject.messageOwner);
                                i14 = i12;
                            }
                            h9 h9Var4 = new h9();
                            ArrayList arrayList6 = h9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = h9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j10));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            h9Var4.d = r12;
                            h9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, h9Var4);
                            this.d.V2.N(true);
                        }
                    }
                    i12 = i15;
                    h9 h9Var42 = new h9();
                    ArrayList arrayList62 = h9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = h9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                    }
                    h9Var42.d = r12;
                    h9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, h9Var42);
                    this.d.V2.N(true);
                } else {
                    i12 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new n8(0)).collect(Collectors.toSet());
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
                                    h9Var = null;
                                    break;
                                }
                                h9Var = (h9) arrayList2.get(i18);
                                arrayList = arrayList2;
                                if (h9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                arrayList2 = arrayList;
                            }
                            if (h9Var != null) {
                                ArrayList arrayList8 = h9Var.b;
                                h9Var.c.add(0, messageObject.messageOwner);
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
                                this.d.V2.N(true);
                                i14 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        h9 h9Var5 = new h9();
                        h9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = h9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = h9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l13);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        h9Var5.d = r12;
                        h9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, h9Var5);
                        this.d.V2.N(true);
                        i14 = i12;
                    }
                }
                i14 = i12;
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.C;
            if (w0Var != null) {
                w0Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(ArrayList arrayList, g9 g9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.I;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.lp lpVar = g9Var.e;
            if (lpVar != null) {
                lpVar.a(false, true);
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
        org.telegram.ui.Components.lp lpVar2 = g9Var.e;
        if (lpVar2 != null) {
            lpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.V) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f) + ((int) this.J.c(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.T) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.b0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.c0;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.w ? 2 : 1, this.a0);
        eVar.e(this.Z, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void g0() {
        this.f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{i9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{i9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        org.telegram.ui.Components.z10 z10Var = this.f;
        if (z10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(z10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.Q0;
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.V4, org.telegram.ui.ActionBar.j6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.W4, org.telegram.ui.ActionBar.j6.Y4}, null, org.telegram.ui.ActionBar.j6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
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
        Rect rect = this.U;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.g61 g61Var = this.d;
        int i10 = this.a;
        g61Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.J.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.T + this.Q);
        this.b.setPadding(0, 0, 0, this.T + this.Q);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.E) {
            return;
        }
        this.E = true;
        i9 i9Var = this.b;
        if (i9Var != null && !this.F) {
            i9Var.a();
        }
        org.telegram.ui.Components.g61 g61Var = this.d;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new o(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z4) {
        org.telegram.ui.Components.lp lpVar;
        this.actionBar.r();
        this.I.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof g9) && (lpVar = ((g9) childAt).e) != null) {
                lpVar.a(false, z4);
            }
        }
        this.d.V2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void n0(boolean z4) {
        if (z4 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z4);
        this.d.V2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!this.actionBar.s()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.P || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        ph.f3 f3Var = new ph.f3(getParentActivity(), 1);
        this.s = f3Var;
        f3Var.d = 3000L;
        f3Var.m(1.0f, -25.0f);
        this.s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.n.addView(this.s, k7.b6.e(-1, 80, 48));
        this.s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.s.v();
        this.P = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        j0(0, 50);
        this.H = getMessagesController().getActiveGroupCalls();
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
        this.Q = this.w ? AndroidUtilities.dp(72.0f) : 0;
        this.R = this.w ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T = i13;
        i0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        if (i10 == 101 || i10 == 102 || i10 == 103) {
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z4 = true;
                    break;
                } else {
                    if (iArr[i11] != 0) {
                        z4 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (iArr.length <= 0 || !z4) {
                org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.f2.m(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.M != null ? getMessagesController().getUserFull(this.M.id) : null;
                org.telegram.ui.Components.voip.f2.n(this.M, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.g61 g61Var = this.d;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public final void p0(boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.DeleteAllCalls);
            d2Var.Q = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            d2Var.O = LocaleController.getString(R.string.DeleteCalls);
            d2Var.Q = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
        z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        z1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(z1Var, k7.b6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new o8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z4, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void q0() {
        boolean s6 = this.actionBar.s();
        ArrayList arrayList = this.I;
        boolean z4 = true;
        char c3 = 1;
        if (!s6) {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.B;
            if (!a2) {
                org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                if (this.w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.x.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                    this.x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
                    this.x.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
                    this.x.setOnClickListener(new p8(this, c3 == true ? 1 : 0));
                    j10.addView(this.x, k7.b6.q(54, 54, 16));
                    arrayList2.add(this.x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.y = numberTextView;
                numberTextView.setTextSize(18);
                this.y.setTypeface(AndroidUtilities.bold());
                this.y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
                j10.addView(this.y, k7.b6.m(1.0f, 0, -1, this.w ? 18 : 72, 0, 0));
                this.y.setOnTouchListener(new oh.d(2));
                arrayList2.add(j10.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
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
            z4 = false;
        } else if (arrayList.isEmpty()) {
            k0(true);
            return;
        }
        this.y.a(arrayList.size(), z4);
    }

    @Override // org.telegram.ui.ug0
    public final void s() {
        if (this.c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.y yVar = this.e;
        yVar.b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.ug0
    public final sg.d y() {
        return this.X;
    }

    public l9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.I = new ArrayList();
        this.P = false;
        this.U = new Rect();
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        RectF rectF = new RectF();
        this.b0 = rectF;
        RectF rectF2 = new RectF();
        this.c0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        if (i10 < 31) {
            this.V = null;
            this.W = null;
            this.X = null;
            this.Y = new ng.a(cVar);
            return;
        }
        this.V = new ng.e(false);
        this.W = new sg.d(null);
        sg.d dVar = new sg.d(null);
        this.X = dVar;
        ng.a aVar = new ng.a(dVar);
        this.Y = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }
}
