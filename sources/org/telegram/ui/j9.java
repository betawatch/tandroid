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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, pg0 {
    public final ArrayList A;
    public org.telegram.ui.ActionBar.v0 B;
    public final ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.zr I;
    public FrameLayout J;
    public x8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public final Rect T;
    public final jg.e U;
    public final og.d V;
    public final og.d W;
    public final jg.a X;
    public jg.k Y;
    public final ArrayList Z;
    public final int a;
    public final RectF a0;
    public g9 b;
    public final RectF b0;
    public f2.k0 c;
    public org.telegram.ui.Components.k51 d;
    public c2.x e;
    public org.telegram.ui.Components.m10 f;
    public org.telegram.ui.Components.h00 h;
    public gh.q4 n;
    public ag.t0 r;
    public lh.w3 s;
    public boolean v;
    public boolean w;
    public ImageView x;
    public NumberTextView y;

    public j9() {
        this(null);
    }

    public static void U(j9 j9Var) {
        org.telegram.ui.Components.k51 k51Var = j9Var.d;
        if (k51Var != null) {
            int childCount = k51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = j9Var.d.getChildAt(i10);
                if (childAt instanceof e9) {
                    ((e9) childAt).d.v(0);
                }
            }
        }
        ImageView imageView = j9Var.x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            j9Var.x.setBackground(org.telegram.ui.ActionBar.g6.f0(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = j9Var.actionBar;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void V(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().putUsers(groupcall.users, false);
            j9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new vt(j9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.e2.h(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new vt(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.mc.a0(j9Var).d0(tL_error, false);
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
    public static void W(j9 j9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User user;
        f9 f9Var;
        TLRPC.User user2;
        ArrayList arrayList = j9Var.C;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(j9Var.currentAccount).putUsers(messages_messages2.users, false);
            MessagesController.getInstance(j9Var.currentAccount).putChats(messages_messages2.chats, false);
            j9Var.F = messages_messages2.messages.isEmpty();
            f9 f9Var2 = !arrayList.isEmpty() ? (f9) i0.a.i(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i12;
                } else {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == j9Var.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = MessageObject.getFromChatId(message) == j9Var.getUserConfig().getClientUserId() ? 0 : 1;
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
                        if (f9Var2 != null) {
                            i10 = i12;
                            if (f9Var2.a == tL_messageActionConferenceCall.call_id) {
                                f9Var = f9Var2;
                                if (f9Var == null) {
                                    ArrayList arrayList2 = f9Var.b;
                                    f9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l10 = (Long) it.next();
                                        long longValue = l10.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User user3 = j9Var.getMessagesController().getUser(l10);
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
                                    if (f9Var2 != null && !arrayList.contains(f9Var2)) {
                                        arrayList.add(f9Var2);
                                    }
                                    f9Var2 = new f9();
                                    f9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = f9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l11 = (Long) it2.next();
                                        l11.getClass();
                                        ArrayList arrayList4 = f9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new q8(fromChatId, 0)) && (user2 = j9Var.getMessagesController().getUser(l11)) != null) {
                                            arrayList4.add(user2);
                                        }
                                    }
                                    f9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    f9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                f9Var = null;
                                break;
                            }
                            f9Var = (f9) arrayList.get(i16);
                            int i17 = i16;
                            if (f9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (f9Var == null) {
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
                        if (f9Var2 != null) {
                            ArrayList arrayList5 = f9Var2.b;
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
                        if (f9Var2 != null && !arrayList.contains(f9Var2)) {
                            arrayList.add(f9Var2);
                        }
                        f9Var2 = new f9();
                        f9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l12 = (Long) it3.next();
                            l12.getClass();
                            ArrayList arrayList6 = f9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new q8(fromChatId, 1)) && (user = j9Var.getMessagesController().getUser(l12)) != null) {
                                arrayList6.add(user);
                            }
                        }
                        f9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        f9Var2.e = messageAction4 != null && messageAction4.video;
                        f9Var2.c.add(message);
                    }
                }
                i12 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 1;
            }
            if (f9Var2 != null && !f9Var2.c.isEmpty() && !arrayList.contains(f9Var2)) {
                arrayList.add(f9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            j9Var.F = true;
        }
        j9Var.D = false;
        if (!j9Var.E) {
            j9Var.resumeDelayedFragmentAnimation();
        }
        j9Var.E = z10;
        j9Var.B.setVisibility(arrayList.isEmpty() ? 8 : 0);
        g9 g9Var = j9Var.b;
        if (g9Var != null) {
            g9Var.b();
        }
        org.telegram.ui.Components.k51 k51Var = j9Var.d;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
    }

    public static void X(j9 j9Var, org.telegram.ui.Components.n41 n41Var, View view) {
        int i10 = n41Var.d;
        if (i10 == 2) {
            j9Var.n0(true);
            org.telegram.ui.Components.ec I = org.telegram.ui.Components.mc.a0(j9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(j9Var, 4));
            I.j = 5000;
            I.j();
            return;
        }
        if (i10 == 1) {
            m0(j9Var);
            return;
        }
        Object obj = n41Var.G;
        if (!(obj instanceof f9)) {
            if (view instanceof i9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((i9) view).c.id);
                j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                j9Var.presentFragment(new rn(bundle), j9Var.v);
                return;
            }
            return;
        }
        f9 f9Var = (f9) obj;
        ArrayList arrayList = f9Var.c;
        if (j9Var.actionBar.t()) {
            j9Var.e0(arrayList, (e9) view);
            return;
        }
        if (f9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            j9Var.presentFragment(new rn(bundle2), j9Var.v);
            return;
        }
        boolean z10 = f9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = f9Var.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(j9Var.getParentActivity(), 3, null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = j9Var.getMessagesController().conferenceCallSizeLimit;
        b2Var.setOnCancelListener(new p8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(j9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
        b2Var.q(600L);
    }

    public static void Y(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().putUsers(groupcall.users, false);
            j9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new vt(j9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.e2.h(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new vt(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.mc.a0(j9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new c9(a9.p.h("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10, final boolean z11) {
        int i11;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var);
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.setBackgroundColor(v02);
        e3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, h7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, h7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        frameLayout.addView(frameLayout2, h7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, h7.z5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.p80 a2 = h7.d6.a(context, 20.0f, i13, true, c6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        g10.addView(a2, h7.z5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.p80 a3 = h7.d6.a(context, 14.0f, i13, false, c6Var);
        a3.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a3.setGravity(17);
        a3.setMaxWidth(lh.w3.a(a3.getText(), a3.getPaint()));
        g10.addView(a3, h7.z5.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        h7.b6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 12, 12));
        g10.addView(frameLayout3, h7.z5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.p80 a10 = h7.d6.a(context, 13.0f, i13, false, c6Var);
        a10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a10.setText(substring);
        frameLayout3.addView(a10, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r5, c6Var), mode));
        frameLayout3.addView(imageView3, h7.z5.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.y1.g(context, 0);
        g10.addView(g11, h7.z5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        g11.addView(dVar, h7.z5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        lh.d dVar2 = new lh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        g11.addView(dVar2, h7.z5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        if (z10) {
            z8 z8Var = new z8(context, c6Var);
            z8Var.setGravity(17);
            z8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            z8Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            z8Var.setTextSize(14.0f);
            g10.addView(z8Var, h7.z5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            d5.i iVar = new d5.i(str, i11, e3VarArr, 26);
            org.telegram.ui.Components.p80 a11 = h7.d6.a(context, 14.0f, i13, false, c6Var);
            a11.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), iVar), true));
            a11.setGravity(17);
            a11.setMaxWidth(lh.w3.a(a11.getText(), a11.getPaint()));
            g10.addView(a11, h7.z5.t(-1, -2, 17, 32, 8, 32, 12));
            h7.b6.b(a11, 0.05f, 1.2f);
            a11.setOnClickListener(new a(iVar, 9));
        } else {
            i11 = i10;
        }
        e3Var.customView = g10;
        e3Var.show();
        e3VarArr[0] = e3Var;
        final int i15 = 0;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.mc mcVar;
                int i16;
                switch (i15) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        mcVar = new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, c6Var);
                        i16 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        mcVar = new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, c6Var);
                        i16 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.rl.m(i16, mcVar);
            }
        });
        final int i16 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.mc mcVar;
                int i162;
                switch (i16) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        mcVar = new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, c6Var);
                        i162 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        mcVar = new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, c6Var);
                        i162 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.rl.m(i162, mcVar);
            }
        });
        final gh.p2 p2Var = new gh.p2(i11, frameLayout3, inputGroupCall, e3Var, c6Var, a10, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e3 e3Var2 = org.telegram.ui.ActionBar.e3.this;
                org.telegram.ui.ActionBar.c3 c3Var = e3Var2.container;
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.Components.b70 F = org.telegram.ui.Components.b70.F(c3Var, c6Var2, frameLayout3);
                int i17 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i17, string, new u1(strArr2, e3Var2, c6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.l0(16, context, strArr2), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, p2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new jh.b0(context, str, strArr, c6Var, e3Var, 5));
        if (z11) {
            imageView2.setOnClickListener(new gh.a4(e3Var, c6Var, imageView2, p2Var, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.pg0
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
            org.telegram.ui.Cells.pa.x(false, this.actionBar);
        }
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 20));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.B = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.B.setOnClickListener(new n8(this, 2));
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new b5(this, i11), new k8(this), new k8(this));
        this.d = k51Var;
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        k51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, this.resourceProvider));
        this.d.p1();
        this.d.U2.r = false;
        this.n = new gh.q4(this, context, i11);
        qg.j jVar = new qg.j(this.n);
        gh.q4 q4Var = this.n;
        jg.a aVar = this.X;
        aVar.d = jVar;
        aVar.e = q4Var;
        org.telegram.ui.Components.k51 k51Var2 = this.d;
        Objects.requireNonNull(k51Var2);
        this.Y = new jg.k(k51Var2, q4Var, new v8(k51Var2, i10));
        this.d.C0(new j8(this, 6));
        gh.q4 q4Var2 = this.n;
        this.fragmentView = q4Var2;
        q4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        this.h = h00Var;
        h00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.h.w = false;
        g9 g9Var = new g9(this, context, this.h);
        this.b = g9Var;
        this.n.addView(g9Var, h7.z5.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.b);
        org.telegram.ui.Components.k51 k51Var3 = this.d;
        f2.k0 k0Var = new f2.k0(1, false);
        this.c = k0Var;
        k51Var3.setLayoutManager(k0Var);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        c2.x xVar = new c2.x(this.d, this.c);
        this.e = xVar;
        xVar.h = new k8(this);
        gh.q4 q4Var3 = this.n;
        org.telegram.ui.Components.k51 k51Var4 = this.d;
        float f10 = -this.a;
        q4Var3.addView(k51Var4, h7.z5.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.d.setOnScrollListener(new w8(this));
        if (this.D) {
            this.b.a();
        } else {
            this.b.b();
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.f = m10Var;
        m10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f.setOnClickListener(new n8(this, 3));
        this.n.addView(this.f, org.telegram.ui.Components.m10.b());
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.I = zrVar;
        zrVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.I.setOnAnimatedHeightChangedListener(new j8(this, i10));
        lg.d c10 = aVar.c(this.I, ng.c.m(this.resourceProvider), false);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        this.I.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        x8 x8Var = new x8(this, context, this, this.n, this.resourceProvider, 0);
        this.K = x8Var;
        this.J.addView(x8Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, h7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.n.addView(this.actionBar);
        ag.t0 t0Var = new ag.t0(context, this.parentLayout);
        this.r = t0Var;
        t0Var.b(false, false);
        this.n.addView(this.r, h7.z5.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new y8(this, i10));
        if (this.w) {
            View view = this.fragmentView;
            k8 k8Var = new k8(this);
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.j(view, k8Var);
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
        org.telegram.ui.Components.k51 k51Var;
        int i12;
        ArrayList arrayList;
        f9 f9Var;
        TLRPC.User user;
        int i13 = NotificationCenter.didReceiveNewMessages;
        ArrayList arrayList2 = this.C;
        if (i10 != i13) {
            if (i10 == NotificationCenter.messagesDeleted) {
                if (this.E && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        f9 f9Var2 = (f9) it.next();
                        Iterator it2 = f9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r4 = 1;
                            }
                        }
                        if (f9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r4 == 0 || (k51Var = this.d) == null) {
                        return;
                    }
                    k51Var.U2.N(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.activeGroupCallsUpdated) {
                this.G = getMessagesController().getActiveGroupCalls();
                org.telegram.ui.Components.k51 k51Var2 = this.d;
                if (k51Var2 != null) {
                    k51Var2.U2.N(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.chatInfoDidLoad) {
                if (i10 == NotificationCenter.groupCallUpdated && (l10 = this.N) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.e2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l11 = this.N;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().getGroupCall(this.N.longValue(), true) == null) {
                return;
            }
            org.telegram.ui.Components.voip.e2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
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
                        f9 f9Var3 = (f9) arrayList2.get(0);
                        ArrayList arrayList5 = f9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && f9Var3.d == r12) {
                                f9Var3.c.add(0, messageObject.messageOwner);
                                i14 = i12;
                            }
                            f9 f9Var4 = new f9();
                            ArrayList arrayList6 = f9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(messageObject.messageOwner);
                            ArrayList arrayList7 = f9Var4.b;
                            arrayList7.clear();
                            user = getMessagesController().getUser(Long.valueOf(j10));
                            if (user != null) {
                                arrayList7.add(user);
                            }
                            f9Var4.d = r12;
                            f9Var4.e = messageObject.isVideoCall();
                            arrayList2.add(0, f9Var4);
                            this.d.U2.N(true);
                        }
                    }
                    i12 = i15;
                    f9 f9Var42 = new f9();
                    ArrayList arrayList62 = f9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(messageObject.messageOwner);
                    ArrayList arrayList72 = f9Var42.b;
                    arrayList72.clear();
                    user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                    }
                    f9Var42.d = r12;
                    f9Var42.e = messageObject.isVideoCall();
                    arrayList2.add(0, f9Var42);
                    this.d.U2.N(true);
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
                                    f9Var = null;
                                    break;
                                }
                                f9Var = (f9) arrayList2.get(i18);
                                arrayList = arrayList2;
                                if (f9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                arrayList2 = arrayList;
                            }
                            if (f9Var != null) {
                                ArrayList arrayList8 = f9Var.b;
                                f9Var.c.add(0, messageObject.messageOwner);
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
                        f9 f9Var5 = new f9();
                        f9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = f9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(messageObject.messageOwner);
                        ArrayList arrayList10 = f9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User user3 = getMessagesController().getUser(l13);
                            if (user3 != null) {
                                arrayList10.add(user3);
                            }
                        }
                        f9Var5.d = r12;
                        f9Var5.e = messageObject.isVideoCall();
                        arrayList2 = arrayList;
                        arrayList2.add(0, f9Var5);
                        this.d.U2.N(true);
                        i14 = i12;
                    }
                }
                i14 = i12;
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.B;
            if (v0Var != null) {
                v0Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(ArrayList arrayList, e9 e9Var) {
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
            org.telegram.ui.Components.bp bpVar = e9Var.e;
            if (bpVar != null) {
                bpVar.a(false, true);
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
        org.telegram.ui.Components.bp bpVar2 = e9Var.e;
        if (bpVar2 != null) {
            bpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        jg.e eVar;
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

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, new Class[]{g9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, new Class[]{g9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        org.telegram.ui.Components.m10 m10Var = this.f;
        if (m10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(m10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.Q0;
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{e9.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.V4, org.telegram.ui.ActionBar.g6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.W4, org.telegram.ui.ActionBar.g6.Y4}, null, org.telegram.ui.ActionBar.g6.r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
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
        org.telegram.ui.Components.k51 k51Var = this.d;
        int i10 = this.a;
        k51Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.I.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.S + this.P);
        this.b.setPadding(0, 0, 0, this.S + this.P);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.D) {
            return;
        }
        this.D = true;
        g9 g9Var = this.b;
        if (g9Var != null && !this.E) {
            g9Var.a();
        }
        org.telegram.ui.Components.k51 k51Var = this.d;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new n(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.bp bpVar;
        this.actionBar.s();
        this.H.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof e9) && (bpVar = ((e9) childAt).e) != null) {
                bpVar.a(false, z10);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!this.actionBar.t()) {
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
        if (this.O || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        lh.w3 w3Var = new lh.w3(getParentActivity(), 1);
        this.s = w3Var;
        w3Var.d = 3000L;
        w3Var.m(1.0f, -25.0f);
        this.s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.n.addView(this.s, h7.z5.e(-1, 80, 48));
        this.s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
        this.s.v();
        this.O = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        this.S = i13;
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
                org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.e2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.L != null ? getMessagesController().getUserFull(this.L.id) : null;
                org.telegram.ui.Components.voip.e2.n(this.L, i10 == 102, i10 == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.k51 k51Var = this.d;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
    }

    public final void p0(boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.N = LocaleController.getString(R.string.DeleteAllCalls);
            b2Var.P = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            b2Var.N = LocaleController.getString(R.string.DeleteCalls);
            b2Var.P = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
        y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        y1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(y1Var, h7.z5.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        y1Var.setOnClickListener(new m8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b5.d(this, z10, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public final void q0() {
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.H;
        boolean z10 = true;
        char c10 = 1;
        if (!t10) {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.A;
            if (!a2) {
                org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                if (this.w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.x.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
                    this.x.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
                    this.x.setOnClickListener(new n8(this, c10 == true ? 1 : 0));
                    j10.addView(this.x, h7.z5.q(54, 54, 16));
                    arrayList2.add(this.x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.y = numberTextView;
                numberTextView.setTextSize(18);
                this.y.setTypeface(AndroidUtilities.bold());
                this.y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                j10.addView(this.y, h7.z5.m(1.0f, 0, -1, this.w ? 18 : 72, 0, 0));
                this.y.setOnTouchListener(new kh.e(2));
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
            z10 = false;
        } else if (arrayList.isEmpty()) {
            k0(true);
            return;
        }
        this.y.a(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.pg0
    public final void t() {
        if (this.c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.x xVar = this.e;
        xVar.b = 1;
        xVar.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.pg0
    public final og.d z() {
        return this.W;
    }

    public j9(Bundle bundle) {
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
        og.c cVar = new og.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        if (i10 < 31) {
            this.U = null;
            this.V = null;
            this.W = null;
            this.X = new jg.a(cVar);
            return;
        }
        this.U = new jg.e(false);
        this.V = new og.d(null);
        og.d dVar = new og.d(null);
        this.W = dVar;
        jg.a aVar = new jg.a(dVar);
        this.X = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }
}
