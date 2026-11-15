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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i9 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, ie0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.vr J;
    public FrameLayout K;
    public x8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public xi.e P;
    public boolean Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public di.k4 a;
    public v4.b0 b;
    public org.telegram.ui.Components.u41 c;
    public View d;
    public org.telegram.ui.Components.wi0 e;
    public org.telegram.ui.Components.t00 f;
    public org.telegram.ui.Components.pz h;
    public v8 n;
    public hi.l3 r;
    public boolean s;
    public boolean w;
    public org.telegram.ui.ActionBar.d5 x;
    public final ArrayList y;

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
        TLRPC.User a22;
        f9 f9Var;
        TLRPC.User a23;
        ArrayList arrayList = i9Var.y;
        int i10 = 0;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            org.telegram.messenger.np.s1(i9Var.currentAccount).Y3(messages_messages2.users, false);
            org.telegram.messenger.np.s1(i9Var.currentAccount).S3(messages_messages2.chats, false);
            i9Var.G = messages_messages2.messages.isEmpty();
            f9 f9Var2 = !arrayList.isEmpty() ? (f9) i5.c.h(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i7 = i12;
                } else {
                    long B1 = org.telegram.messenger.gj.B1(message.from_id);
                    if (B1 == i9Var.getUserConfig().e()) {
                        B1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = org.telegram.messenger.gj.B1(message.from_id) == i9Var.getUserConfig().e() ? i10 : i11;
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
                                                TLRPC.User a24 = i9Var.getMessagesController().a2(l10);
                                                if (a24 != null) {
                                                    arrayList2.add(a24);
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
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new p8(B1, 0)) && (a23 = i9Var.getMessagesController().a2(l11)) != null) {
                                            arrayList4.add(a23);
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
                            if (Collection.-EL.stream(arrayList6).noneMatch(new p8(B1, 1)) && (a22 = i9Var.getMessagesController().a2(l12)) != null) {
                                arrayList6.add(a22);
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
            i9Var.G = true;
        }
        i9Var.E = false;
        if (!i9Var.F) {
            i9Var.resumeDelayedFragmentAnimation();
        }
        i9Var.F = z10;
        i9Var.x.setVisibility(arrayList.isEmpty() ? 8 : 0);
        di.k4 k4Var = i9Var.a;
        if (k4Var != null) {
            k4Var.e();
        }
        org.telegram.ui.Components.u41 u41Var = i9Var.c;
        if (u41Var != null) {
            u41Var.g3.O(true);
        }
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = b41Var.d;
        int i10 = 0;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.xb J = org.telegram.ui.Components.cc.a0(i9Var).J(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749458, null)), org.telegram.messenger.hd.M0(2131743885, null), 5000, true, new m8(i9Var, 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i7 == 1) {
            l0(i9Var);
            return;
        }
        Object obj = b41Var.G;
        boolean z10 = obj instanceof f9;
        int i11 = org.telegram.messenger.ns.t;
        if (!z10) {
            if (view instanceof h9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((h9) view).c.id);
                i9Var.getNotificationCenter().k(i11, new Object[0]);
                i9Var.presentFragment(new an(bundle), i9Var.s);
                return;
            }
            return;
        }
        f9 f9Var = (f9) obj;
        ArrayList arrayList = f9Var.c;
        if (i9Var.simpleActionBar.v()) {
            i9Var.f0(arrayList, (e9) view);
            return;
        }
        if (f9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", org.telegram.messenger.gj.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            i9Var.getNotificationCenter().k(i11, new Object[0]);
            i9Var.presentFragment(new an(bundle2), i9Var.s);
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
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, i9Var.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = i9Var.getMessagesController().Q6;
        t1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), i10));
        t1Var.r(600L);
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.c2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        t1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.c2.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new vs(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.M0(2131751589, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131751588, null);
        } else {
            t1Var.S = org.telegram.messenger.hd.M0(2131751559, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131751499, null);
        }
        int i7 = 0;
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
        c2Var.e(org.telegram.messenger.hd.M0(2131751558, null), "", false, false, false);
        c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(8.0f), 0);
        frameLayout.addView(c2Var, c8.ja.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new k8(i7, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ab.j(i9Var, z10, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        i9Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.e2 e2Var) {
        e2Var.presentFragment(new c9(a8.p0.k("isCall", true), e2Var.getCurrentAccount(), e2Var));
    }

    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        final org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        u2Var.v0(w02);
        u2Var.P(w02);
        u2Var.w0(i11);
        u2Var.Q(i11);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ja.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ja.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, e6Var);
        frameLayout.addView(frameLayout2, c8.ja.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView2, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M2, e6Var);
        if (z11) {
            frameLayout.addView(imageView2, c8.ja.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(context, 20.0f, i15, true, e6Var);
        a10.setText(org.telegram.messenger.hd.M0(2131749472, null));
        a10.setGravity(17);
        f10.addView(a10, c8.ja.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.z70 a11 = c8.sa.a(context, 14.0f, i15, false, e6Var);
        a11.setText(org.telegram.messenger.hd.M0(2131749473, null));
        a11.setGravity(17);
        a11.setMaxWidth(hi.l3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, c8.ja.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.na.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.j6.a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), org.telegram.ui.ActionBar.j6.w0(i14, e6Var)), 12, 12);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i16);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.q6.j(frameLayout3, b02, M3, p10, e6Var);
        f10.addView(frameLayout3, c8.ja.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.z70 a12 = c8.sa.a(context, 13.0f, i15, false, e6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(substring);
        frameLayout3.addView(a12, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.r5, e6Var, mode);
        frameLayout3.addView(imageView3, c8.ja.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, c8.ja.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749480, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, c8.ja.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749474, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, c8.ja.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        if (z10) {
            z8 z8Var = new z8(context, e6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(z8Var, org.telegram.ui.ActionBar.j6.z6, e6Var);
            z8Var.setText(" " + org.telegram.messenger.hd.M0(2131749479, null) + " ");
            z8Var.setTextSize(14.0f);
            f10.addView(z8Var, c8.ja.t(org.telegram.messenger.ns.U2, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            f0 f0Var = new f0(str, i10, u2VarArr, 3);
            org.telegram.ui.Components.z70 a13 = c8.sa.a(context, 14.0f, i15, false, e6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749478, null), f0Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(hi.l3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, c8.ja.t(-1, -2, 17, 32, 8, 32, 12));
            c8.na.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(f0Var, 8));
        } else {
            i10 = i7;
        }
        u2Var.O = f10;
        u2Var.show();
        final int i17 = 0;
        u2VarArr[0] = u2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i18 = i17;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                String[] strArr2 = strArr;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.i20.s(null, 2131748921, ccVar);
            }
        });
        final int i18 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i182 = i18;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                String[] strArr2 = strArr;
                switch (i182) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(u2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.i20.s(null, 2131748921, ccVar);
            }
        });
        final bi.u2 u2Var2 = new bi.u2(i10, frameLayout3, inputGroupCall, u2Var, e6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u2 u2Var3 = org.telegram.ui.ActionBar.u2.this;
                org.telegram.ui.ActionBar.k2 k2Var = u2Var3.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(k2Var, e6Var2, frameLayout3);
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(R.drawable.msg_copy, M0, new o1(strArr2, u2Var3, e6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131750472, null), new u5(2, context, strArr2), false);
                F.m(R.drawable.msg_delete, u2Var2, org.telegram.messenger.hd.M0(2131746023, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new fi.d0(context, str, strArr, e6Var, u2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new bi.f4(u2Var, e6Var, imageView2, u2Var2, 6));
        }
    }

    @Override // org.telegram.ui.ie0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2, org.telegram.ui.ie0
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        if (!this.w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 29));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(10, R.drawable.ic_ab_other);
        this.x = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.x.e(3, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751589, null));
        int i11 = org.telegram.ui.ActionBar.j6.p7;
        e10.d(getThemedColor(i11), getThemedColor(i11));
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new a5(this, i7), new u8(this), new u8(this));
        this.c = u41Var;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        v8 v8Var = new v8(i10, context, this);
        this.n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.h = pzVar;
        pzVar.setViewType(8);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, this.h, null);
        this.h.x = false;
        this.a = new di.k4(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.u41 u41Var2 = this.c;
        v4.b0 b0Var = new v4.b0(1, false);
        this.b = b0Var;
        u41Var2.setLayoutManager(b0Var);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(this.c, this.b);
        this.e = wi0Var;
        ri.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        wi0Var.h = new w0(qVar, 12);
        this.n.addView(this.c, c8.ja.e(-1, -1, 3));
        this.n.addView(this.a, c8.ja.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, c8.ja.e(-1, 0, 48));
        this.c.setOnScrollListener(new w8(this));
        if (this.E) {
            this.a.d();
        } else {
            this.a.e();
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.f = t00Var;
        t00Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        this.f.setOnClickListener(new l8(this, i7));
        this.n.addView(this.f, org.telegram.ui.Components.t00.b());
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(context);
        this.J = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.J.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.vr vrVar2 = this.J;
        fh.g c10 = getBaseSimpleGlass().c.c(this.J, null, false);
        c10.p(c8.g0.n(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        vrVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        x8 x8Var = new x8(this, context, this, this.n, this.resourceProvider);
        this.L = x8Var;
        this.K.addView(x8Var);
        this.J.setCallFragmentContextView(this.L);
        this.n.addView(this.J, c8.ja.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new y8(this, i10));
        if (this.w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2  */
    @Override // org.telegram.messenger.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Long l10;
        org.telegram.ui.Components.u41 u41Var;
        int i11;
        TLRPC.User a22;
        int i12;
        ArrayList arrayList;
        f9 f9Var;
        int i13 = 2;
        ArrayList arrayList2 = this.y;
        if (i7 != 1) {
            if (i7 == org.telegram.messenger.ns.w) {
                if (this.F && !((Boolean) objArr[2]).booleanValue()) {
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
                    if (r3 == 0 || (u41Var = this.c) == null) {
                        return;
                    }
                    u41Var.g3.O(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.A2) {
                org.telegram.messenger.np messagesController = getMessagesController();
                messagesController.getClass();
                this.H = new ArrayList(messagesController.h.keySet());
                org.telegram.ui.Components.u41 u41Var2 = this.c;
                if (u41Var2 != null) {
                    u41Var2.g3.O(true);
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.ns.T) {
                if (i7 == org.telegram.messenger.ns.w2 && (l10 = this.O) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.c2.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.O = null;
                    return;
                }
                return;
            }
            Long l11 = this.O;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().g1(this.O.longValue(), true, null) == null) {
                return;
            }
            org.telegram.ui.Components.voip.c2.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                TLRPC.MessageAction messageAction = gjVar.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long Z0 = gjVar.Z0();
                    long j3 = Z0 == getUserConfig().e() ? gjVar.k.peer_id.user_id : Z0;
                    int i16 = Z0 == getUserConfig().e() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = gjVar.k.action.reason;
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
                                f9Var3.c.add(0, gjVar.k);
                                i14 = i11;
                            }
                            f9 f9Var4 = new f9();
                            ArrayList arrayList6 = f9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(gjVar.k);
                            ArrayList arrayList7 = f9Var4.b;
                            arrayList7.clear();
                            a22 = getMessagesController().a2(Long.valueOf(j3));
                            if (a22 != null) {
                                arrayList7.add(a22);
                            }
                            f9Var4.d = r12;
                            f9Var4.e = gjVar.J4();
                            arrayList2.add(0, f9Var4);
                            this.c.g3.O(true);
                            i12 = i13;
                        }
                    }
                    i11 = i15;
                    f9 f9Var42 = new f9();
                    ArrayList arrayList62 = f9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(gjVar.k);
                    ArrayList arrayList72 = f9Var42.b;
                    arrayList72.clear();
                    a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                    }
                    f9Var42.d = r12;
                    f9Var42.e = gjVar.J4();
                    arrayList2.add(0, f9Var42);
                    this.c.g3.O(true);
                    i12 = i13;
                } else {
                    i11 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long Z02 = gjVar.Z0();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new aa.l(8)).collect(Collectors.toSet());
                        set.add(Long.valueOf(Z02 == getUserConfig().e() ? gjVar.k.peer_id.user_id : Z02));
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
                                f9Var.c.add(0, gjVar.k);
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
                                            TLRPC.User a23 = getMessagesController().a2(l12);
                                            if (a23 != null) {
                                                arrayList8.add(a23);
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
                        arrayList9.add(gjVar.k);
                        ArrayList arrayList10 = f9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User a24 = getMessagesController().a2(l13);
                            if (a24 != null) {
                                arrayList10.add(a24);
                            }
                        }
                        f9Var5.d = r12;
                        f9Var5.e = gjVar.J4();
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
            org.telegram.ui.ActionBar.d5 d5Var = this.x;
            if (d5Var != null) {
                d5Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void f0(ArrayList arrayList, e9 e9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.I;
        if (k02) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).id));
            }
            org.telegram.ui.Components.fp fpVar = e9Var.e;
            if (fpVar != null) {
                fpVar.a(false, true);
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
        org.telegram.ui.Components.fp fpVar2 = e9Var.e;
        if (fpVar2 != null) {
            fpVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f.setTranslationY(((-this.U) - this.S) - this.T);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
        org.telegram.ui.Components.t00 t00Var = this.f;
        if (t00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(t00Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.u41 u41Var = this.c;
        i0.c cVar = this.mSystemInsets;
        ri.a.e(u41Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f))), this.R);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = (ri.a.d(this.mSystemInsets.b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.U + this.R);
    }

    public final void i0(int i7, int i10) {
        if (this.E) {
            return;
        }
        this.E = true;
        di.k4 k4Var = this.a;
        if (k4Var != null && !this.F) {
            k4Var.d();
        }
        org.telegram.ui.Components.u41 u41Var = this.c;
        if (u41Var != null) {
            u41Var.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.fp fpVar;
        this.simpleActionBar.u();
        this.I.clear();
        int childCount = this.c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.c.getChildAt(i7);
            if ((childAt instanceof e9) && (fpVar = ((e9) childAt).e) != null) {
                fpVar.a(false, z10);
            }
        }
        this.c.g3.O(true);
    }

    @Override // org.telegram.ui.ie0
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
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i7)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.m10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.c.g3.O(true);
        org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.O5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean v = this.simpleActionBar.v();
        ArrayList arrayList = this.I;
        if (v) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            if (w4Var.e == null) {
                w4Var.o().d(2, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
            }
            this.simpleActionBar.F();
            z10 = false;
        }
        this.simpleActionBar.A(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.v()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        j0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Q || !getUserConfig().X || org.telegram.messenger.np.e1().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        hi.l3 l3Var = new hi.l3(getParentActivity(), 1);
        this.r = l3Var;
        l3Var.d = 3000L;
        l3Var.o(1.0f, -25.0f);
        this.r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.r.l(getBaseSimpleGlass().c);
        this.r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744255, null)));
        this.n.addView(this.r, c8.ja.e(-1, 80, 48));
        this.r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f));
        this.r.w();
        this.Q = true;
        org.telegram.messenger.np.e1().edit().putInt("hidecallshint", org.telegram.messenger.np.e1().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0(0, 50);
        org.telegram.messenger.np messagesController = getMessagesController();
        messagesController.getClass();
        this.H = new ArrayList(messagesController.h.keySet());
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ns.w);
        eVar2.c(org.telegram.messenger.ns.A2);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.w2);
        this.P = eVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.s = bundle.getBoolean("needFinishFragment", true);
            this.w = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.R = this.w ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.S = this.w ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.U = i12;
        h0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.e2
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
                org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
            } else if (i7 == 103) {
                org.telegram.ui.Components.voip.c2.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull b22 = this.M != null ? getMessagesController().b2(this.M.id) : null;
                org.telegram.ui.Components.voip.c2.m(this.M, i7 == 102, i7 == 102 || (b22 != null && b22.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u41 u41Var = this.c;
        if (u41Var != null) {
            u41Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.u41 u41Var = this.c;
            if (u41Var != null) {
                int childCount = u41Var.getChildCount();
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.wi0 wi0Var = this.e;
        wi0Var.b = 1;
        wi0Var.d(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.s = true;
        this.y = new ArrayList();
        this.I = new ArrayList();
        this.Q = false;
    }
}
