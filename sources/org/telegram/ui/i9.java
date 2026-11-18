package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i9 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, le0 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.cs I;
    public FrameLayout J;
    public x8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public xi.e O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public di.n4 a;
    public v4.c0 b;
    public org.telegram.ui.Components.e51 c;
    public View d;
    public org.telegram.ui.ActionBar.l5 e;
    public org.telegram.ui.Components.a10 f;
    public org.telegram.ui.Components.wz h;
    public v8 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.h5 w;
    public final ArrayList x;
    public boolean y;

    public i9() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ea, code lost:
    
        if (r5.d != r15) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(i9 i9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i7;
        TLRPC.User c22;
        f9 f9Var;
        TLRPC.User c23;
        ArrayList arrayList = i9Var.x;
        int i10 = 0;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            org.telegram.messenger.mp.u1(i9Var.currentAccount).f4(messages_messages2.users, false);
            org.telegram.messenger.mp.u1(i9Var.currentAccount).Z3(messages_messages2.chats, false);
            i9Var.F = messages_messages2.messages.isEmpty();
            f9 f9Var2 = !arrayList.isEmpty() ? (f9) i5.c.h(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i7 = i12;
                } else {
                    long B1 = org.telegram.messenger.fj.B1(message.from_id);
                    if (B1 == i9Var.getUserConfig().e()) {
                        B1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = org.telegram.messenger.fj.B1(message.from_id) == i9Var.getUserConfig().e() ? i10 : i11;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(B1));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new aa.l(8)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (f9Var2 != null) {
                            i7 = i12;
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
                                                TLRPC.User c24 = i9Var.getMessagesController().c2(l10);
                                                if (c24 != null) {
                                                    arrayList2.add(c24);
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
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new p8(B1, 0)) && (c23 = i9Var.getMessagesController().c2(l11)) != null) {
                                            arrayList4.add(c23);
                                        }
                                    }
                                    f9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    f9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i7 = i12;
                        }
                        int i16 = i10;
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
                        i7 = i12;
                        hashSet.add(Long.valueOf(B1));
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
                            if (Collection.-EL.stream(arrayList6).noneMatch(new p8(B1, 1)) && (c22 = i9Var.getMessagesController().c2(l12)) != null) {
                                arrayList6.add(c22);
                            }
                        }
                        f9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        f9Var2.e = messageAction4 != null && messageAction4.video;
                        f9Var2.c.add(message);
                    }
                }
                i12 = i7 + 1;
                messages_messages2 = messages_messages;
                i10 = 0;
                i11 = 1;
            }
            if (f9Var2 != null && !f9Var2.c.isEmpty() && !arrayList.contains(f9Var2)) {
                arrayList.add(f9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            i9Var.F = true;
        }
        i9Var.y = false;
        if (!i9Var.E) {
            i9Var.resumeDelayedFragmentAnimation();
        }
        i9Var.E = z10;
        i9Var.w.setVisibility(arrayList.isEmpty() ? 8 : 0);
        di.n4 n4Var = i9Var.a;
        if (n4Var != null) {
            n4Var.e();
        }
        org.telegram.ui.Components.e51 e51Var = i9Var.c;
        if (e51Var != null) {
            e51Var.g3.O(true);
        }
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.l41 l41Var, View view) {
        int i7 = l41Var.d;
        int i10 = 0;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.gc J = org.telegram.ui.Components.lc.b0(i9Var).J(R.raw.contact_check, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749266, null)), org.telegram.messenger.gd.M0(2131743648, null), 5000, true, new m8(i9Var, 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i7 == 1) {
            l0(i9Var);
            return;
        }
        Object obj = l41Var.H;
        boolean z10 = obj instanceof f9;
        int i11 = org.telegram.messenger.ks.t;
        if (!z10) {
            if (view instanceof h9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((h9) view).c.id);
                i9Var.getNotificationCenter().k(i11, new Object[0]);
                i9Var.presentFragment(new bn(bundle), i9Var.r);
                return;
            }
            return;
        }
        f9 f9Var = (f9) obj;
        ArrayList arrayList = f9Var.c;
        if (i9Var.simpleActionBar.x()) {
            i9Var.f0(arrayList, (e9) view);
            return;
        }
        if (f9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", org.telegram.messenger.fj.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            i9Var.getNotificationCenter().k(i11, new Object[0]);
            i9Var.presentFragment(new bn(bundle2), i9Var.r);
            return;
        }
        boolean z11 = f9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = f9Var.b;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, i9Var.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = i9Var.getMessagesController().S6;
        u1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, u1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), i10));
        u1Var.r(600L);
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().f4(groupcall.users, false);
            i9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.b2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(i9Var).g0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().f4(groupcall.users, false);
            i9Var.getMessagesController().Z3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.b2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ws(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.lc.b0(i9Var).g0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z10) {
            u1Var.S = org.telegram.messenger.gd.M0(2131751578, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131751577, null);
        } else {
            u1Var.S = org.telegram.messenger.gd.M0(2131751548, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131751488, null);
        }
        int i7 = 0;
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(i9Var.getParentActivity(), 1);
        d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        d2Var.e(org.telegram.messenger.gd.M0(2131751547, null), "", false, false, false);
        d2Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : 0, 0, org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(8.0f), 0);
        frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        d2Var.setOnClickListener(new k8(i7, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ab.j(i9Var, z10, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        i9Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.h2 h2Var) {
        h2Var.presentFragment(new c9(a8.p0.k("isCall", true), h2Var.getCurrentAccount(), h2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.i6 i6Var, boolean z10, final boolean z11) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.n6.h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        final org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context, i6Var, false);
        x2Var.v0(w02);
        x2Var.P(w02);
        x2Var.w0(i11);
        x2Var.Q(i11);
        final String[] strArr = {str};
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.ma.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ma.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        frameLayout.addView(frameLayout2, c8.ma.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i13 = org.telegram.ui.ActionBar.n6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView2, i13, i6Var, mode);
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        if (z11) {
            frameLayout.addView(imageView2, c8.ma.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.Components.k80 a10 = c8.va.a(context, 20.0f, i15, true, i6Var);
        a10.setText(org.telegram.messenger.gd.M0(2131749280, null));
        a10.setGravity(17);
        g10.addView(a10, c8.ma.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.k80 a11 = c8.va.a(context, 14.0f, i15, false, i6Var);
        a11.setText(org.telegram.messenger.gd.M0(2131749281, null));
        a11.setGravity(17);
        a11.setMaxWidth(hi.m3.a(a11.getText(), a11.getPaint()));
        g10.addView(a11, c8.ma.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.ra.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.n6.a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(org.telegram.ui.ActionBar.n6.w0(i16, i6Var), org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i16, i6Var), org.telegram.ui.ActionBar.n6.w0(i14, i6Var)), 12, 12);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i16);
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.u6.j(frameLayout3, b02, M3, p10, i6Var);
        g10.addView(frameLayout3, c8.ma.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.k80 a12 = c8.va.a(context, 13.0f, i15, false, i6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(substring);
        frameLayout3.addView(a12, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.r5, i6Var, mode);
        frameLayout3.addView(imageView3, c8.ma.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        g10.addView(g11, c8.ma.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131749288, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        g11.addView(dVar, c8.ma.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131749282, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        g11.addView(dVar2, c8.ma.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.x2[] x2VarArr = new org.telegram.ui.ActionBar.x2[1];
        if (z10) {
            z8 z8Var = new z8(context, i6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(z8Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
            z8Var.setText(" " + org.telegram.messenger.gd.M0(2131749287, null) + " ");
            z8Var.setTextSize(14.0f);
            g10.addView(z8Var, c8.ma.t(org.telegram.messenger.ks.U2, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            b0 b0Var = new b0(str, i10, x2VarArr);
            org.telegram.ui.Components.k80 a13 = c8.va.a(context, 14.0f, i15, false, i6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131749286, null), b0Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(hi.m3.a(a13.getText(), a13.getPaint()));
            g10.addView(a13, c8.ma.t(-1, -2, 17, 32, 8, 32, 12));
            c8.ra.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(b0Var, 8));
        } else {
            i10 = i7;
        }
        x2Var.O = g10;
        x2Var.show();
        final int i17 = 0;
        x2VarArr[0] = x2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i18 = i17;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                String[] strArr2 = strArr;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                }
                org.telegram.messenger.n10.t(null, 2131748729, lcVar);
            }
        });
        final int i18 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                int i182 = i18;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                String[] strArr2 = strArr;
                switch (i182) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        lcVar = new org.telegram.ui.Components.lc(x2Var2.F, i6Var2);
                        break;
                }
                org.telegram.messenger.n10.t(null, 2131748729, lcVar);
            }
        });
        final bi.c5 c5Var = new bi.c5(i10, frameLayout3, inputGroupCall, x2Var, i6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.x2 x2Var2 = org.telegram.ui.ActionBar.x2.this;
                org.telegram.ui.ActionBar.n2 n2Var = x2Var2.c;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.Components.y60 G = org.telegram.ui.Components.y60.G(n2Var, i6Var2, frameLayout3);
                String M0 = org.telegram.messenger.gd.M0(2131751756, null);
                String[] strArr2 = strArr;
                G.c(R.drawable.msg_copy, M0, new o1(strArr2, x2Var2, i6Var2, 7), false);
                G.c(R.drawable.msg_qrcode, org.telegram.messenger.gd.M0(2131750456, null), new oi.s2(28, context, strArr2), false);
                G.m(R.drawable.msg_delete, c5Var, org.telegram.messenger.gd.M0(2131745828, null), z11, true);
                G.a0();
            }
        });
        dVar2.setOnClickListener(new fi.d0(context, str, strArr, i6Var, x2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.m6(x2Var, i6Var, imageView2, c5Var, 6));
        }
    }

    @Override // org.telegram.ui.le0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2, org.telegram.ui.le0
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752585, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, i7));
        org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(10, R.drawable.ic_ab_other);
        this.w = b10;
        b10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.w.e(3, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751578, null));
        int i11 = org.telegram.ui.ActionBar.n6.p7;
        e10.d(getThemedColor(i11), getThemedColor(i11));
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(this, new a5(this, i7), new u8(this), new u8(this));
        this.c = e51Var;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        v8 v8Var = new v8(i10, context, this);
        this.n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        this.h = wzVar;
        wzVar.setViewType(8);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, this.h, null);
        this.h.x = false;
        this.a = new di.n4(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.e51 e51Var2 = this.c;
        v4.c0 c0Var = new v4.c0(1, false);
        this.b = c0Var;
        e51Var2.setLayoutManager(c0Var);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this.c, this.b);
        this.e = l5Var;
        ri.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        l5Var.n = new w0(qVar, 12);
        this.n.addView(this.c, c8.ma.e(-1, -1, 3));
        this.n.addView(this.a, c8.ma.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, c8.ma.e(-1, 0, 48));
        this.c.setOnScrollListener(new w8(this));
        if (this.y) {
            this.a.d();
        } else {
            this.a.e();
        }
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f = a10Var;
        a10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(org.telegram.messenger.gd.M0(2131752623, null));
        this.f.setOnClickListener(new l8(this, i7));
        this.n.addView(this.f, org.telegram.ui.Components.a10.b());
        org.telegram.ui.Components.cs csVar = new org.telegram.ui.Components.cs(context);
        this.I = csVar;
        csVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.cs csVar2 = this.I;
        fh.g c10 = getBaseSimpleGlass().c.c(this.I, null, false);
        c10.p(c8.i0.o(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        csVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        x8 x8Var = new x8(this, context, this, this.n, this.resourceProvider);
        this.K = x8Var;
        this.J.addView(x8Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, c8.ma.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new y8(this, i10));
        if (this.s) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2  */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Long l10;
        org.telegram.ui.Components.e51 e51Var;
        int i11;
        TLRPC.User c22;
        int i12;
        ArrayList arrayList;
        f9 f9Var;
        int i13 = 2;
        ArrayList arrayList2 = this.x;
        if (i7 != 1) {
            if (i7 == org.telegram.messenger.ks.w) {
                if (this.E && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        f9 f9Var2 = (f9) it.next();
                        Iterator it2 = f9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r3 = 1;
                            }
                        }
                        if (f9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r3 == 0 || (e51Var = this.c) == null) {
                        return;
                    }
                    e51Var.g3.O(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.A2) {
                org.telegram.messenger.mp messagesController = getMessagesController();
                messagesController.getClass();
                this.G = new ArrayList(messagesController.h.keySet());
                org.telegram.ui.Components.e51 e51Var2 = this.c;
                if (e51Var2 != null) {
                    e51Var2.g3.O(true);
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.ks.T) {
                if (i7 == org.telegram.messenger.ks.w2 && (l10 = this.N) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.b2.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l11 = this.N;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().i1(this.N.longValue(), true, null) == null) {
                return;
            }
            org.telegram.ui.Components.voip.b2.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                TLRPC.MessageAction messageAction = fjVar.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long Z0 = fjVar.Z0();
                    long j3 = Z0 == getUserConfig().e() ? fjVar.k.peer_id.user_id : Z0;
                    int i16 = Z0 == getUserConfig().e() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = fjVar.k.action.reason;
                    if (i16 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i16 = i13;
                    }
                    if (i16 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i16;
                    }
                    if (!arrayList2.isEmpty()) {
                        f9 f9Var3 = (f9) arrayList2.get(0);
                        ArrayList arrayList5 = f9Var3.b;
                        if (arrayList5.size() == 1) {
                            i11 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j3 && f9Var3.d == r12) {
                                f9Var3.c.add(0, fjVar.k);
                                i14 = i11;
                            }
                            f9 f9Var4 = new f9();
                            ArrayList arrayList6 = f9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(fjVar.k);
                            ArrayList arrayList7 = f9Var4.b;
                            arrayList7.clear();
                            c22 = getMessagesController().c2(Long.valueOf(j3));
                            if (c22 != null) {
                                arrayList7.add(c22);
                            }
                            f9Var4.d = r12;
                            f9Var4.e = fjVar.J4();
                            arrayList2.add(0, f9Var4);
                            this.c.g3.O(true);
                            i12 = i13;
                        }
                    }
                    i11 = i15;
                    f9 f9Var42 = new f9();
                    ArrayList arrayList62 = f9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(fjVar.k);
                    ArrayList arrayList72 = f9Var42.b;
                    arrayList72.clear();
                    c22 = getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                    }
                    f9Var42.d = r12;
                    f9Var42.e = fjVar.J4();
                    arrayList2.add(0, f9Var42);
                    this.c.g3.O(true);
                    i12 = i13;
                } else {
                    i11 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long Z02 = fjVar.Z0();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new aa.l(8)).collect(Collectors.toSet());
                        set.add(Long.valueOf(Z02 == getUserConfig().e() ? fjVar.k.peer_id.user_id : Z02));
                        int i17 = Z02 == getUserConfig().e() ? 0 : 1;
                        if (i17 == 1 && tL_messageActionConferenceCall.missed) {
                            i17 = i13;
                        }
                        r12 = (i17 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i17;
                        if (arrayList2.isEmpty()) {
                            i12 = i13;
                            arrayList = arrayList2;
                        } else {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList2.size()) {
                                    i12 = i13;
                                    arrayList = arrayList2;
                                    f9Var = null;
                                    break;
                                }
                                f9Var = (f9) arrayList2.get(i18);
                                i12 = i13;
                                arrayList = arrayList2;
                                if (f9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                i13 = i12;
                                arrayList2 = arrayList;
                            }
                            if (f9Var != null) {
                                ArrayList arrayList8 = f9Var.b;
                                f9Var.c.add(0, fjVar.k);
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
                                            TLRPC.User c23 = getMessagesController().c2(l12);
                                            if (c23 != null) {
                                                arrayList8.add(c23);
                                            }
                                        }
                                    }
                                }
                                this.c.g3.O(true);
                                i14 = i11;
                                i13 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        f9 f9Var5 = new f9();
                        f9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = f9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(fjVar.k);
                        ArrayList arrayList10 = f9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User c24 = getMessagesController().c2(l13);
                            if (c24 != null) {
                                arrayList10.add(c24);
                            }
                        }
                        f9Var5.d = r12;
                        f9Var5.e = fjVar.J4();
                        arrayList2 = arrayList;
                        arrayList2.add(0, f9Var5);
                        this.c.g3.O(true);
                    } else {
                        i12 = i13;
                    }
                }
                i14 = i11;
                i13 = i12;
            }
            org.telegram.ui.ActionBar.h5 h5Var = this.w;
            if (h5Var != null) {
                h5Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void f0(ArrayList arrayList, e9 e9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.H;
        if (k02) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).id));
            }
            org.telegram.ui.Components.mp mpVar = e9Var.e;
            if (mpVar != null) {
                mpVar.a(false, true);
            }
            o0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.mp mpVar2 = e9Var.e;
        if (mpVar2 != null) {
            mpVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        org.telegram.ui.Components.a10 a10Var = this.f;
        if (a10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(a10Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.e51 e51Var = this.c;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(e51Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.d(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (ri.a.d(this.mSystemInsets.b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.S + this.P);
    }

    public final void i0(int i7, int i10) {
        if (this.y) {
            return;
        }
        this.y = true;
        di.n4 n4Var = this.a;
        if (n4Var != null && !this.E) {
            n4Var.d();
        }
        org.telegram.ui.Components.e51 e51Var = this.c;
        if (e51Var != null) {
            e51Var.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.mp mpVar;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.c.getChildAt(i7);
            if ((childAt instanceof e9) && (mpVar = ((e9) childAt).e) != null) {
                mpVar.a(false, z10);
            }
        }
        this.c.g3.O(true);
    }

    @Override // org.telegram.ui.le0
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.j10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.c.g3.O(true);
        org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean x10 = this.simpleActionBar.x();
        ArrayList arrayList = this.H;
        if (x10) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            if (a5Var.e == null) {
                a5Var.q().d(2, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
            }
            this.simpleActionBar.J();
            z10 = false;
        }
        this.simpleActionBar.E(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.x()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        j0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0(0, 50);
        org.telegram.messenger.mp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        xi.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
            this.O = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ks.w);
        eVar2.c(org.telegram.messenger.ks.A2);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.w2);
        this.O = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.P = this.s ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.Q = this.s ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        xi.e eVar = this.O;
        if (eVar != null) {
            eVar.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.S = i12;
        h0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        if (i7 == 101 || i7 == 102 || i7 == 103) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = true;
                    break;
                } else {
                    if (iArr[i10] != 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (iArr.length <= 0 || !z10) {
                org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
            } else if (i7 == 103) {
                org.telegram.ui.Components.voip.b2.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull d2 = this.L != null ? getMessagesController().d2(this.L.id) : null;
                org.telegram.ui.Components.voip.b2.m(this.L, i7 == 102, i7 == 102 || (d2 != null && d2.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.e51 e51Var = this.c;
        if (e51Var != null) {
            e51Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.e51 e51Var = this.c;
            if (e51Var != null) {
                int childCount = e51Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.c.getChildAt(i7);
                    if (childAt instanceof e9) {
                        ((e9) childAt).d.y(0);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.le0
    public final void v() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        l5Var.b = 1;
        l5Var.k(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.x = new ArrayList();
        this.H = new ArrayList();
    }
}
