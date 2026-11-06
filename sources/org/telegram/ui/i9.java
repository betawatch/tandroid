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
import java.io.Serializable;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i9 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, ie0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.pr I;
    public FrameLayout J;
    public x8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public ab.b0 O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public bi.m5 a;
    public v4.b0 b;
    public org.telegram.ui.Components.q41 c;
    public View d;
    public org.telegram.ui.Components.ri0 e;
    public org.telegram.ui.Components.p00 f;
    public org.telegram.ui.Components.lz h;
    public v8 n;
    public fi.m3 r;
    public boolean s;
    public boolean w;
    public org.telegram.ui.ActionBar.f5 x;
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
        boolean z9;
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
            org.telegram.messenger.qp.s1(i9Var.currentAccount).Y3(messages_messages2.users, false);
            org.telegram.messenger.qp.s1(i9Var.currentAccount).S3(messages_messages2.chats, false);
            i9Var.F = messages_messages2.messages.isEmpty();
            f9 f9Var2 = !arrayList.isEmpty() ? (f9) jg.g.i(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i7 = i12;
                } else {
                    long C1 = org.telegram.messenger.ij.C1(message.from_id);
                    if (C1 == i9Var.getUserConfig().e()) {
                        C1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = org.telegram.messenger.ij.C1(message.from_id) == i9Var.getUserConfig().e() ? i10 : i11;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(C1));
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
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new o8(C1, 0)) && (a23 = i9Var.getMessagesController().a2(l11)) != null) {
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
                        hashSet.add(Long.valueOf(C1));
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
                            if (Collection.-EL.stream(arrayList6).noneMatch(new o8(C1, 1)) && (a22 = i9Var.getMessagesController().a2(l12)) != null) {
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
            z9 = true;
        } else {
            z9 = true;
            i9Var.F = true;
        }
        i9Var.D = false;
        if (!i9Var.E) {
            i9Var.resumeDelayedFragmentAnimation();
        }
        i9Var.E = z9;
        i9Var.x.setVisibility(arrayList.isEmpty() ? 8 : 0);
        bi.m5 m5Var = i9Var.a;
        if (m5Var != null) {
            m5Var.e();
        }
        org.telegram.ui.Components.q41 q41Var = i9Var.c;
        if (q41Var != null) {
            q41Var.f3.O(true);
        }
    }

    public static void a0(i9 i9Var, org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = x31Var.d;
        int i10 = 0;
        if (i7 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.cc J = org.telegram.ui.Components.hc.a0(i9Var).J(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749457, null)), org.telegram.messenger.hd.M0(2131743886, null), 5000, true, new l8(i9Var, 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i7 == 1) {
            l0(i9Var);
            return;
        }
        Object obj = x31Var.G;
        boolean z9 = obj instanceof f9;
        int i11 = org.telegram.messenger.qs.t;
        if (!z9) {
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
        if (i9Var.simpleActionBar.s()) {
            i9Var.f0(arrayList, (e9) view);
            return;
        }
        if (f9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", org.telegram.messenger.ij.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            i9Var.getNotificationCenter().k(i11, new Object[0]);
            i9Var.presentFragment(new an(bundle2), i9Var.s);
            return;
        }
        boolean z10 = f9Var.e;
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
        getgroupcall.limit = i9Var.getMessagesController().P6;
        u1Var.setOnCancelListener(new n8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(i9Var, u1Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), i10));
        u1Var.r(600L);
    }

    public static void b0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.y1.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z9, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void c0(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, TLRPC.TL_error tL_error) {
        u1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().Y3(groupcall.users, false);
            i9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.y1.g(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z9, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new ss(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.hc.a0(i9Var).f0(tL_error, false);
        }
    }

    public static void e0(i9 i9Var, boolean z9) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i9Var.getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9) {
            u1Var.R = org.telegram.messenger.hd.M0(2131751590, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131751589, null);
        } else {
            u1Var.R = org.telegram.messenger.hd.M0(2131751560, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131751500, null);
        }
        int i7 = 0;
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(i9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        c2Var.e(org.telegram.messenger.hd.M0(2131751559, null), "", false, false, false);
        c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(8.0f), 0);
        frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new j8(i7, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new ab.j(i9Var, z9, zArr, 3));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        i9Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.f2 f2Var) {
        f2Var.presentFragment(new c9(a8.p0.k("isCall", true), f2Var.getCurrentAccount(), f2Var));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public static void n0(final Context context, int i7, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.f6 f6Var, boolean z9, final boolean z10) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        final org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, f6Var, false);
        v2Var.v0(w02);
        v2Var.O(w02);
        v2Var.w0(i11);
        v2Var.P(i11);
        final ?? r12 = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ha.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, c8.ha.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, f6Var);
        frameLayout.addView(frameLayout2, c8.ha.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, f6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, f6Var);
        if (z10) {
            frameLayout.addView(imageView2, c8.ha.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(context, 20.0f, i15, true, f6Var);
        a10.setText(org.telegram.messenger.hd.M0(2131749471, null));
        a10.setGravity(17);
        f10.addView(a10, c8.ha.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.w70 a11 = c8.qa.a(context, 14.0f, i15, false, f6Var);
        a11.setText(org.telegram.messenger.hd.M0(2131749472, null));
        a11.setGravity(17);
        a11.setMaxWidth(fi.m3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, c8.ha.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        c8.ka.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.w0(i16, f6Var), org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i16, f6Var), org.telegram.ui.ActionBar.k6.w0(i14, f6Var)), 12, 12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, b02, N3, q10, f6Var);
        f10.addView(frameLayout3, c8.ha.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.w70 a12 = c8.qa.a(context, 13.0f, i15, false, f6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(substring);
        frameLayout3.addView(a12, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.r5, f6Var, mode);
        frameLayout3.addView(imageView3, c8.ha.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, c8.ha.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749479, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, c8.ha.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        fi.d dVar2 = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749473, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        if (z9) {
            z8 z8Var = new z8(context, f6Var);
            z8Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(z8Var, org.telegram.ui.ActionBar.k6.z6, f6Var);
            z8Var.setText(" " + org.telegram.messenger.hd.M0(2131749478, null) + " ");
            z8Var.setTextSize(14.0f);
            f10.addView(z8Var, c8.ha.t(org.telegram.messenger.qs.U2, -2, 1, 28, 12, 28, 8));
            i10 = i7;
            q8 q8Var = new q8(str, i10, v2VarArr, 0);
            org.telegram.ui.Components.w70 a13 = c8.qa.a(context, 14.0f, i15, false, f6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749477, null), q8Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(fi.m3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, c8.ha.t(-1, -2, 17, 32, 8, 32, 12));
            c8.ka.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(q8Var, 8));
        } else {
            i10 = i7;
        }
        v2Var.N = f10;
        v2Var.show();
        final int i17 = 0;
        v2VarArr[0] = v2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.hc hcVar;
                int i18 = i17;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                String[] strArr = r12;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748920, hcVar);
            }
        });
        final int i18 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.hc hcVar;
                int i182 = i18;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                String[] strArr = r12;
                switch (i182) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr[0]);
                        hcVar = new org.telegram.ui.Components.hc(v2Var2.E, f6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748920, hcVar);
            }
        });
        final jg.c1 c1Var = new jg.c1(inputGroupCall, i10, (Serializable) r12, frameLayout3, a12, v2Var, f6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v2 v2Var2 = org.telegram.ui.ActionBar.v2.this;
                org.telegram.ui.ActionBar.l2 l2Var = v2Var2.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(l2Var, f6Var2, frameLayout3);
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String[] strArr = r12;
                F.c(R.drawable.msg_copy, M0, new o1(strArr, v2Var2, f6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131750471, null), new org.telegram.ui.ActionBar.p(13, context, strArr), false);
                F.m(R.drawable.msg_delete, c1Var, org.telegram.messenger.hd.M0(2131746024, null), z10, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new di.d0(context, str, r12, f6Var, v2Var, 6));
        if (z10) {
            imageView2.setOnClickListener(new di.u3(v2Var, f6Var, imageView2, c1Var, 5));
        }
    }

    @Override // org.telegram.ui.ie0
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2, org.telegram.ui.ie0
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        if (!this.w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 28));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(10, R.drawable.ic_ab_other);
        this.x = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        org.telegram.ui.ActionBar.z0 e10 = this.x.e(3, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751590, null));
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        e10.d(getThemedColor(i11), getThemedColor(i11));
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new a5(this, i7), new u8(this), new u8(this));
        this.c = q41Var;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.f3.r = false;
        v8 v8Var = new v8(i10, context, this);
        this.n = v8Var;
        this.fragmentView = v8Var;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.h = lzVar;
        lzVar.setViewType(8);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, this.h, null);
        this.h.x = false;
        this.a = new bi.m5(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.q41 q41Var2 = this.c;
        v4.b0 b0Var = new v4.b0(1, false);
        this.b = b0Var;
        q41Var2.setLayoutManager(b0Var);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(this.c, this.b);
        this.e = ri0Var;
        oi.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        ri0Var.h = new w0(qVar, 12);
        this.n.addView(this.c, c8.ha.e(-1, -1, 3));
        this.n.addView(this.a, c8.ha.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, c8.ha.e(-1, 0, 48));
        this.c.setOnScrollListener(new w8(this));
        if (this.D) {
            this.a.d();
        } else {
            this.a.e();
        }
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.f = p00Var;
        p00Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        this.f.setOnClickListener(new k8(this, i7));
        this.n.addView(this.f, org.telegram.ui.Components.p00.b());
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.I = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new l8(this, 1));
        org.telegram.ui.Components.pr prVar2 = this.I;
        fh.g c10 = getBaseSimpleGlass().c.c(this.I, null, false);
        c10.p(c8.g0.o(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(24.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        prVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        x8 x8Var = new x8(this, context, this, this.n, this.resourceProvider);
        this.K = x8Var;
        this.J.addView(x8Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, c8.ha.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
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
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Long l10;
        org.telegram.ui.Components.q41 q41Var;
        int i11;
        TLRPC.User a22;
        int i12;
        ArrayList arrayList;
        f9 f9Var;
        int i13 = 2;
        ArrayList arrayList2 = this.y;
        if (i7 != 1) {
            if (i7 == org.telegram.messenger.qs.w) {
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
                    if (r3 == 0 || (q41Var = this.c) == null) {
                        return;
                    }
                    q41Var.f3.O(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.A2) {
                org.telegram.messenger.qp messagesController = getMessagesController();
                messagesController.getClass();
                this.G = new ArrayList(messagesController.h.keySet());
                org.telegram.ui.Components.q41 q41Var2 = this.c;
                if (q41Var2 != null) {
                    q41Var2.f3.O(true);
                    return;
                }
                return;
            }
            if (i7 != org.telegram.messenger.qs.T) {
                if (i7 == org.telegram.messenger.qs.w2 && (l10 = this.N) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.y1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l11 = this.N;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().g1(this.N.longValue(), true, null) == null) {
                return;
            }
            org.telegram.ui.Components.voip.y1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
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
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                TLRPC.MessageAction messageAction = ijVar.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long Z0 = ijVar.Z0();
                    long j3 = Z0 == getUserConfig().e() ? ijVar.k.peer_id.user_id : Z0;
                    int i16 = Z0 == getUserConfig().e() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = ijVar.k.action.reason;
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
                                f9Var3.c.add(0, ijVar.k);
                                i14 = i11;
                            }
                            f9 f9Var4 = new f9();
                            ArrayList arrayList6 = f9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(ijVar.k);
                            ArrayList arrayList7 = f9Var4.b;
                            arrayList7.clear();
                            a22 = getMessagesController().a2(Long.valueOf(j3));
                            if (a22 != null) {
                                arrayList7.add(a22);
                            }
                            f9Var4.d = r12;
                            f9Var4.e = ijVar.K4();
                            arrayList2.add(0, f9Var4);
                            this.c.f3.O(true);
                            i12 = i13;
                        }
                    }
                    i11 = i15;
                    f9 f9Var42 = new f9();
                    ArrayList arrayList62 = f9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(ijVar.k);
                    ArrayList arrayList72 = f9Var42.b;
                    arrayList72.clear();
                    a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                    }
                    f9Var42.d = r12;
                    f9Var42.e = ijVar.K4();
                    arrayList2.add(0, f9Var42);
                    this.c.f3.O(true);
                    i12 = i13;
                } else {
                    i11 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long Z02 = ijVar.Z0();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new aa.l(8)).collect(Collectors.toSet());
                        set.add(Long.valueOf(Z02 == getUserConfig().e() ? ijVar.k.peer_id.user_id : Z02));
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
                                f9Var.c.add(0, ijVar.k);
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
                                this.c.f3.O(true);
                                i14 = i11;
                                i13 = i12;
                                arrayList2 = arrayList;
                            }
                        }
                        f9 f9Var5 = new f9();
                        f9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = f9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(ijVar.k);
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
                        f9Var5.e = ijVar.K4();
                        arrayList2 = arrayList;
                        arrayList2.add(0, f9Var5);
                        this.c.f3.O(true);
                    } else {
                        i12 = i13;
                    }
                }
                i14 = i11;
                i13 = i12;
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.x;
            if (f5Var != null) {
                f5Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
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
            org.telegram.ui.Components.wo woVar = e9Var.e;
            if (woVar != null) {
                woVar.a(false, true);
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
        org.telegram.ui.Components.wo woVar2 = e9Var.e;
        if (woVar2 != null) {
            woVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        org.telegram.ui.Components.p00 p00Var = this.f;
        if (p00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(p00Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.q41 q41Var = this.c;
        i0.b bVar = this.mSystemInsets;
        oi.a.e(q41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.I.c(org.telegram.messenger.g0.L(7.0f))), this.Q);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (oi.a.d(this.mSystemInsets.b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.T + this.Q);
    }

    public final void i0(int i7, int i10) {
        if (this.D) {
            return;
        }
        this.D = true;
        bi.m5 m5Var = this.a;
        if (m5Var != null && !this.E) {
            m5Var.d();
        }
        org.telegram.ui.Components.q41 q41Var = this.c;
        if (q41Var != null) {
            q41Var.f3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i7;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        org.telegram.ui.Components.wo woVar;
        this.simpleActionBar.r();
        this.H.clear();
        int childCount = this.c.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.c.getChildAt(i7);
            if ((childAt instanceof e9) && (woVar = ((e9) childAt).e) != null) {
                woVar.a(false, z9);
            }
        }
        this.c.f3.O(true);
    }

    @Override // org.telegram.ui.ie0
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
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

    public final void m0(boolean z9) {
        if (z9 == getUserConfig().W) {
            return;
        }
        org.telegram.messenger.p10 userConfig = getUserConfig();
        if (userConfig.W != z9) {
            userConfig.W = z9;
            userConfig.v(false);
        }
        this.c.f3.O(true);
        org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z9;
        boolean s5 = this.simpleActionBar.s();
        ArrayList arrayList = this.H;
        if (s5) {
            z9 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.e == null) {
                y4Var.l().d(2, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751599, null));
            }
            this.simpleActionBar.B();
            z9 = false;
        }
        this.simpleActionBar.x(arrayList.size(), z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!this.simpleActionBar.s()) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        j0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.P || !getUserConfig().W || org.telegram.messenger.qp.e1().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        fi.m3 m3Var = new fi.m3(getParentActivity(), 1);
        this.r = m3Var;
        m3Var.d = 3000L;
        m3Var.o(1.0f, -25.0f);
        this.r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.r.l(getBaseSimpleGlass().c);
        this.r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744256, null)));
        this.n.addView(this.r, c8.ha.e(-1, 80, 48));
        this.r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f));
        this.r.w();
        this.P = true;
        org.telegram.messenger.qp.e1().edit().putInt("hidecallshint", org.telegram.messenger.qp.e1().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0(0, 50);
        org.telegram.messenger.qp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(1);
        b0Var2.c(org.telegram.messenger.qs.w);
        b0Var2.c(org.telegram.messenger.qs.A2);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.w2);
        this.O = b0Var2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.s = bundle.getBoolean("needFinishFragment", true);
            this.w = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.Q = this.w ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.R = this.w ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.T = i12;
        h0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        if (i7 == 101 || i7 == 102 || i7 == 103) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z9 = true;
                    break;
                } else {
                    if (iArr[i10] != 0) {
                        z9 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (iArr.length <= 0 || !z9) {
                org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
            } else if (i7 == 103) {
                org.telegram.ui.Components.voip.y1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull b22 = this.L != null ? getMessagesController().b2(this.L.id) : null;
                org.telegram.ui.Components.voip.y1.m(this.L, i7 == 102, i7 == 102 || (b22 != null && b22.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.q41 q41Var = this.c;
        if (q41Var != null) {
            q41Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.q41 q41Var = this.c;
            if (q41Var != null) {
                int childCount = q41Var.getChildCount();
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.ri0 ri0Var = this.e;
        ri0Var.b = 1;
        ri0Var.d(0, 0, false, false);
    }

    public i9(Bundle bundle) {
        super(bundle);
        this.s = true;
        this.y = new ArrayList();
        this.H = new ArrayList();
        this.P = false;
    }
}
