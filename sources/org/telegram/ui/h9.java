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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h9 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, de0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.pr J;
    public FrameLayout K;
    public w8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public za.p P;
    public boolean Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public ci.t4 a;
    public u4.b0 b;
    public org.telegram.ui.Components.l41 c;
    public View d;
    public org.telegram.ui.Components.vi0 e;
    public org.telegram.ui.Components.l00 f;
    public org.telegram.ui.Components.iz h;
    public ai.h5 n;
    public gi.l3 r;
    public boolean s;
    public boolean w;
    public org.telegram.ui.ActionBar.f5 x;
    public final ArrayList y;

    public h9() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e9, code lost:
    
        if (r5.d != r15) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(h9 h9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i3;
        TLRPC.User a22;
        e9 e9Var;
        TLRPC.User a23;
        ArrayList arrayList = h9Var.y;
        int i10 = 0;
        int i11 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            org.telegram.messenger.hp.s1(h9Var.currentAccount).Y3(messages_messages2.users, false);
            org.telegram.messenger.hp.s1(h9Var.currentAccount).S3(messages_messages2.chats, false);
            h9Var.G = messages_messages2.messages.isEmpty();
            e9 e9Var2 = !arrayList.isEmpty() ? (e9) k2.p1.h(1, arrayList) : null;
            int i12 = 0;
            while (i12 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i12);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i3 = i12;
                } else {
                    long C1 = org.telegram.messenger.zi.C1(message.from_id);
                    if (C1 == h9Var.getUserConfig().e()) {
                        C1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i13 = org.telegram.messenger.zi.C1(message.from_id) == h9Var.getUserConfig().e() ? i10 : i11;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(C1));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new fa.b(7)).collect(Collectors.toSet()));
                        if (i13 == i11 && tL_messageActionConferenceCall.missed) {
                            i13 = 2;
                        }
                        int i14 = (i13 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i13;
                        messages_messages = messages_messages2;
                        if (e9Var2 != null) {
                            i3 = i12;
                            if (e9Var2.a == tL_messageActionConferenceCall.call_id) {
                                e9Var = e9Var2;
                                if (e9Var == null) {
                                    ArrayList arrayList2 = e9Var.b;
                                    e9Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l10 = (Long) it.next();
                                        long longValue = l10.longValue();
                                        int size = arrayList2.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= size) {
                                                TLRPC.User a24 = h9Var.getMessagesController().a2(l10);
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
                                    if (e9Var2 != null && !arrayList.contains(e9Var2)) {
                                        arrayList.add(e9Var2);
                                    }
                                    e9Var2 = new e9();
                                    e9Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = e9Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l11 = (Long) it2.next();
                                        l11.getClass();
                                        ArrayList arrayList4 = e9Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new p8(C1, 0)) && (a23 = h9Var.getMessagesController().a2(l11)) != null) {
                                            arrayList4.add(a23);
                                        }
                                    }
                                    e9Var2.d = i14;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    e9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i3 = i12;
                        }
                        int i16 = i10;
                        while (true) {
                            if (i16 >= arrayList.size()) {
                                e9Var = null;
                                break;
                            }
                            e9Var = (e9) arrayList.get(i16);
                            int i17 = i16;
                            if (e9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i16 = i17 + 1;
                            }
                        }
                        if (e9Var == null) {
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i3 = i12;
                        hashSet.add(Long.valueOf(C1));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i13 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i13 = 2;
                        }
                        int i18 = (i13 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i13;
                        if (e9Var2 != null) {
                            ArrayList arrayList5 = e9Var2.b;
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
                        if (e9Var2 != null && !arrayList.contains(e9Var2)) {
                            arrayList.add(e9Var2);
                        }
                        e9Var2 = new e9();
                        e9Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l12 = (Long) it3.next();
                            l12.getClass();
                            ArrayList arrayList6 = e9Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new p8(C1, 1)) && (a22 = h9Var.getMessagesController().a2(l12)) != null) {
                                arrayList6.add(a22);
                            }
                        }
                        e9Var2.d = i18;
                        TLRPC.MessageAction messageAction4 = message.action;
                        e9Var2.e = messageAction4 != null && messageAction4.video;
                        e9Var2.c.add(message);
                    }
                }
                i12 = i3 + 1;
                messages_messages2 = messages_messages;
                i10 = 0;
                i11 = 1;
            }
            if (e9Var2 != null && !e9Var2.c.isEmpty() && !arrayList.contains(e9Var2)) {
                arrayList.add(e9Var2);
            }
            z10 = true;
        } else {
            z10 = true;
            h9Var.G = true;
        }
        h9Var.E = false;
        if (!h9Var.F) {
            h9Var.resumeDelayedFragmentAnimation();
        }
        h9Var.F = z10;
        h9Var.x.setVisibility(arrayList.isEmpty() ? 8 : 0);
        ci.t4 t4Var = h9Var.a;
        if (t4Var != null) {
            t4Var.e();
        }
        org.telegram.ui.Components.l41 l41Var = h9Var.c;
        if (l41Var != null) {
            l41Var.g3.O(true);
        }
    }

    public static void a0(h9 h9Var, org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = r31Var.d;
        int i10 = 0;
        if (i3 == 2) {
            h9Var.m0(true);
            org.telegram.ui.Components.ac J = org.telegram.ui.Components.fc.a0(h9Var).J(R.raw.contact_check, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749466, null)), org.telegram.messenger.bd.M0(2131743895, null), 5000, true, new m8(h9Var, 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i3 == 1) {
            l0(h9Var);
            return;
        }
        Object obj = r31Var.G;
        boolean z10 = obj instanceof e9;
        int i11 = org.telegram.messenger.hs.t;
        if (!z10) {
            if (view instanceof g9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((g9) view).c.id);
                h9Var.getNotificationCenter().k(i11, new Object[0]);
                h9Var.presentFragment(new wm(bundle), h9Var.s);
                return;
            }
            return;
        }
        e9 e9Var = (e9) obj;
        ArrayList arrayList = e9Var.c;
        if (h9Var.simpleActionBar.s()) {
            h9Var.f0(arrayList, (d9) view);
            return;
        }
        if (e9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", org.telegram.messenger.zi.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            h9Var.getNotificationCenter().k(i11, new Object[0]);
            h9Var.presentFragment(new wm(bundle2), h9Var.s);
            return;
        }
        boolean z11 = e9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = e9Var.b;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, h9Var.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = h9Var.getMessagesController().P6;
        s1Var.setOnCancelListener(new o8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(h9Var, s1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), i10));
        s1Var.r(600L);
    }

    public static void b0(h9 h9Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        s1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().Y3(groupcall.users, false);
            h9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.n1.g(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.fc.a0(h9Var).f0(tL_error, false);
        }
    }

    public static void c0(h9 h9Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        s1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().Y3(groupcall.users, false);
            h9Var.getMessagesController().S3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.n1.g(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new qs(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.fc.a0(h9Var).f0(tL_error, false);
        }
    }

    public static void e0(h9 h9Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h9Var.getParentActivity());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131751590, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131751589, null);
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131751560, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131751500, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(h9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(h9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        c2Var.e(org.telegram.messenger.bd.M0(2131751559, null), "", false, false, false);
        c2Var.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : 0, 0, org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(8.0f), 0);
        frameLayout.addView(c2Var, b8.mf.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.l3(h9Var, z10, zArr, 2));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        h9Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void l0(org.telegram.ui.ActionBar.d2 d2Var) {
        d2Var.presentFragment(new b9(a1.g.k("isCall", true), d2Var.getCurrentAccount(), d2Var));
    }

    public static void n0(final Context context, int i3, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        final org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, e6Var, false);
        t2Var.v0(w02);
        t2Var.O(w02);
        t2Var.w0(i11);
        t2Var.P(i11);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, b8.mf.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, b8.mf.e(-1, -1, 17));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, e6Var);
        frameLayout.addView(frameLayout2, b8.mf.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView2, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        if (z11) {
            frameLayout.addView(imageView2, b8.mf.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(context, 20.0f, i15, true, e6Var);
        a10.setText(org.telegram.messenger.bd.M0(2131749480, null));
        a10.setGravity(17);
        f10.addView(a10, b8.mf.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.s70 a11 = b8.rf.a(context, 14.0f, i15, false, e6Var);
        a11.setText(org.telegram.messenger.bd.M0(2131749481, null));
        a11.setGravity(17);
        a11.setMaxWidth(gi.l3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, b8.mf.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        b8.pf.b(frameLayout3, 0.01f, 1.2f);
        int i16 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.w0(i16, e6Var), org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i16, e6Var), org.telegram.ui.ActionBar.k6.w0(i14, e6Var)), 12, 12);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i16, i14);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, b02, N3, q10, e6Var);
        f10.addView(frameLayout3, b8.mf.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.s70 a12 = b8.rf.a(context, 13.0f, i15, false, e6Var);
        a12.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
        a12.setText(substring);
        frameLayout3.addView(a12, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.r5, e6Var, mode);
        frameLayout3.addView(imageView3, b8.mf.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        f10.addView(f11, b8.mf.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749488, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f11.addView(dVar, b8.mf.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        gi.d dVar2 = new gi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131749482, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f11.addView(dVar2, b8.mf.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        if (z10) {
            y8 y8Var = new y8(context, e6Var);
            y8Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(y8Var, org.telegram.ui.ActionBar.k6.z6, e6Var);
            y8Var.setText(" " + org.telegram.messenger.bd.M0(2131749487, null) + " ");
            y8Var.setTextSize(14.0f);
            f10.addView(y8Var, b8.mf.t(org.telegram.messenger.hs.U2, -2, 1, 28, 12, 28, 8));
            i10 = i3;
            f4 f4Var = new f4(str, i10, t2VarArr, 1);
            org.telegram.ui.Components.s70 a13 = b8.rf.a(context, 14.0f, i15, false, e6Var);
            a13.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131749486, null), f4Var), true));
            a13.setGravity(17);
            a13.setMaxWidth(gi.l3.a(a13.getText(), a13.getPaint()));
            f10.addView(a13, b8.mf.t(-1, -2, 17, 32, 8, 32, 12));
            b8.pf.b(a13, 0.05f, 1.2f);
            a13.setOnClickListener(new a(f4Var, 8));
        } else {
            i10 = i3;
        }
        t2Var.O = f10;
        t2Var.show();
        final int i17 = 0;
        t2VarArr[0] = t2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                int i18 = i17;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                String[] strArr2 = strArr;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748929, fcVar);
            }
        });
        final int i18 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                int i182 = i18;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                String[] strArr2 = strArr;
                switch (i182) {
                    case 0:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                    default:
                        org.telegram.messenger.g0.g(strArr2[0]);
                        fcVar = new org.telegram.ui.Components.fc(t2Var2.F, e6Var2);
                        break;
                }
                org.telegram.messenger.camera.q.r(null, 2131748929, fcVar);
            }
        });
        final ai.d3 d3Var = new ai.d3(i10, frameLayout3, inputGroupCall, t2Var, e6Var, a12, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t2 t2Var2 = org.telegram.ui.ActionBar.t2.this;
                org.telegram.ui.ActionBar.j2 j2Var = t2Var2.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(j2Var, e6Var2, frameLayout3);
                String M0 = org.telegram.messenger.bd.M0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(R.drawable.msg_copy, M0, new p1(strArr2, t2Var2, e6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, org.telegram.messenger.bd.M0(2131750480, null), new org.telegram.messenger.voip.l0(18, context, strArr2), false);
                F.m(R.drawable.msg_delete, d3Var, org.telegram.messenger.bd.M0(2131746033, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ei.f0(context, str, strArr, e6Var, t2Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.r4(t2Var, e6Var, imageView2, d3Var, 6));
        }
    }

    @Override // org.telegram.ui.de0
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2, org.telegram.ui.de0
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        if (!this.w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 29));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(10, R.drawable.ic_ab_other);
        this.x = b10;
        b10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        org.telegram.ui.ActionBar.y0 e10 = this.x.e(3, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751590, null));
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        e10.d(getThemedColor(i11), getThemedColor(i11));
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new c5(this, i3), new u8(this), new u8(this));
        this.c = l41Var;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        ai.h5 h5Var = new ai.h5(i3, context, this);
        this.n = h5Var;
        this.fragmentView = h5Var;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.h = izVar;
        izVar.setViewType(8);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, this.h, null);
        this.h.x = false;
        this.a = new ci.t4(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.l41 l41Var2 = this.c;
        u4.b0 b0Var = new u4.b0(1, false);
        this.b = b0Var;
        l41Var2.setLayoutManager(b0Var);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(this.c, this.b);
        this.e = vi0Var;
        pi.q qVar = this.glassEngine;
        Objects.requireNonNull(qVar);
        vi0Var.h = new x0(qVar, 12);
        this.n.addView(this.c, b8.mf.e(-1, -1, 3));
        this.n.addView(this.a, b8.mf.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, b8.mf.e(-1, 0, 48));
        this.c.setOnScrollListener(new v8(this));
        if (this.E) {
            this.a.d();
        } else {
            this.a.e();
        }
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.f = l00Var;
        l00Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(org.telegram.messenger.bd.M0(2131752634, null));
        this.f.setOnClickListener(new l8(this, i3));
        this.n.addView(this.f, org.telegram.ui.Components.l00.b());
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.J = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f));
        this.J.setOnAnimatedHeightChangedListener(new m8(this, 1));
        org.telegram.ui.Components.pr prVar2 = this.J;
        gh.g c2 = getBaseSimpleGlass().c.c(this.J, null, false);
        c2.p(b8.cd.o(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(24.0f));
        c2.q(org.telegram.messenger.g0.L(7.0f));
        prVar2.setBlurredBackground(c2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        w8 w8Var = new w8(this, context, this, this.n, this.resourceProvider);
        this.L = w8Var;
        this.K.addView(w8Var);
        this.J.setCallFragmentContextView(this.L);
        this.n.addView(this.J, b8.mf.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new x8(this, i10));
        if (this.w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2  */
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Long l10;
        org.telegram.ui.Components.l41 l41Var;
        int i11;
        TLRPC.User a22;
        int i12;
        ArrayList arrayList;
        e9 e9Var;
        int i13 = 2;
        ArrayList arrayList2 = this.y;
        if (i3 != 1) {
            if (i3 == org.telegram.messenger.hs.w) {
                if (this.F && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        e9 e9Var2 = (e9) it.next();
                        Iterator it2 = e9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r3 = 1;
                            }
                        }
                        if (e9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r3 == 0 || (l41Var = this.c) == null) {
                        return;
                    }
                    l41Var.g3.O(true);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.A2) {
                org.telegram.messenger.hp messagesController = getMessagesController();
                messagesController.getClass();
                this.H = new ArrayList(messagesController.h.keySet());
                org.telegram.ui.Components.l41 l41Var2 = this.c;
                if (l41Var2 != null) {
                    l41Var2.g3.O(true);
                    return;
                }
                return;
            }
            if (i3 != org.telegram.messenger.hs.T) {
                if (i3 == org.telegram.messenger.hs.w2 && (l10 = this.O) != null && l10.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.n1.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.O = null;
                    return;
                }
                return;
            }
            Long l11 = this.O;
            if (l11 == null || ((TLRPC.ChatFull) objArr[0]).id != l11.longValue() || getMessagesController().g1(this.O.longValue(), true, null) == null) {
                return;
            }
            org.telegram.ui.Components.voip.n1.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
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
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                TLRPC.MessageAction messageAction = ziVar.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long Z0 = ziVar.Z0();
                    long j10 = Z0 == getUserConfig().e() ? ziVar.k.peer_id.user_id : Z0;
                    int i16 = Z0 == getUserConfig().e() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = ziVar.k.action.reason;
                    if (i16 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i16 = i13;
                    }
                    if (i16 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i16;
                    }
                    if (!arrayList2.isEmpty()) {
                        e9 e9Var3 = (e9) arrayList2.get(0);
                        ArrayList arrayList5 = e9Var3.b;
                        if (arrayList5.size() == 1) {
                            i11 = i15;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && e9Var3.d == r12) {
                                e9Var3.c.add(0, ziVar.k);
                                i14 = i11;
                            }
                            e9 e9Var4 = new e9();
                            ArrayList arrayList6 = e9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(ziVar.k);
                            ArrayList arrayList7 = e9Var4.b;
                            arrayList7.clear();
                            a22 = getMessagesController().a2(Long.valueOf(j10));
                            if (a22 != null) {
                                arrayList7.add(a22);
                            }
                            e9Var4.d = r12;
                            e9Var4.e = ziVar.K4();
                            arrayList2.add(0, e9Var4);
                            this.c.g3.O(true);
                            i12 = i13;
                        }
                    }
                    i11 = i15;
                    e9 e9Var42 = new e9();
                    ArrayList arrayList62 = e9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(ziVar.k);
                    ArrayList arrayList72 = e9Var42.b;
                    arrayList72.clear();
                    a22 = getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                    }
                    e9Var42.d = r12;
                    e9Var42.e = ziVar.K4();
                    arrayList2.add(0, e9Var42);
                    this.c.g3.O(true);
                    i12 = i13;
                } else {
                    i11 = i15;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long Z02 = ziVar.Z0();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new fa.b(7)).collect(Collectors.toSet());
                        set.add(Long.valueOf(Z02 == getUserConfig().e() ? ziVar.k.peer_id.user_id : Z02));
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
                                    e9Var = null;
                                    break;
                                }
                                e9Var = (e9) arrayList2.get(i18);
                                i12 = i13;
                                arrayList = arrayList2;
                                if (e9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i18++;
                                i13 = i12;
                                arrayList2 = arrayList;
                            }
                            if (e9Var != null) {
                                ArrayList arrayList8 = e9Var.b;
                                e9Var.c.add(0, ziVar.k);
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
                        e9 e9Var5 = new e9();
                        e9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = e9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(ziVar.k);
                        ArrayList arrayList10 = e9Var5.b;
                        arrayList10.clear();
                        for (Long l13 : set) {
                            l13.getClass();
                            TLRPC.User a24 = getMessagesController().a2(l13);
                            if (a24 != null) {
                                arrayList10.add(a24);
                            }
                        }
                        e9Var5.d = r12;
                        e9Var5.e = ziVar.K4();
                        arrayList2 = arrayList;
                        arrayList2.add(0, e9Var5);
                        this.c.g3.O(true);
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

    public final void f0(ArrayList arrayList, d9 d9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.I;
        if (k02) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i3)).id));
            }
            org.telegram.ui.Components.wo woVar = d9Var.e;
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
        org.telegram.ui.Components.wo woVar2 = d9Var.e;
        if (woVar2 != null) {
            woVar2.a(true, true);
        }
        o0();
    }

    public final void g0() {
        this.f.setTranslationY(((-this.U) - this.S) - this.T);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        org.telegram.ui.Components.l00 l00Var = this.f;
        if (l00Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l00Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.l41 l41Var = this.c;
        i0.b bVar = this.mSystemInsets;
        pi.a.e(l41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f))), this.R);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.J.c(org.telegram.messenger.g0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = (pi.a.d(this.mSystemInsets.b) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.U + this.R);
    }

    public final void i0(int i3, int i10) {
        if (this.E) {
            return;
        }
        this.E = true;
        ci.t4 t4Var = this.a;
        if (t4Var != null && !this.F) {
            t4Var.d();
        }
        org.telegram.ui.Components.l41 l41Var = this.c;
        if (l41Var != null) {
            l41Var.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new l(this, 1), 2), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.wo woVar;
        this.simpleActionBar.r();
        this.I.clear();
        int childCount = this.c.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.c.getChildAt(i3);
            if ((childAt instanceof d9) && (woVar = ((d9) childAt).e) != null) {
                woVar.a(false, z10);
            }
        }
        this.c.g3.O(true);
    }

    @Override // org.telegram.ui.de0
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i3)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().X) {
            return;
        }
        org.telegram.messenger.h10 userConfig = getUserConfig();
        if (userConfig.X != z10) {
            userConfig.X = z10;
            userConfig.v(false);
        }
        this.c.g3.O(true);
        org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        boolean z10;
        boolean s6 = this.simpleActionBar.s();
        ArrayList arrayList = this.I;
        if (s6) {
            z10 = true;
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var.e == null) {
                y4Var.l().d(2, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
            }
            this.simpleActionBar.B();
            z10 = false;
        }
        this.simpleActionBar.x(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.s()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        j0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Q || !getUserConfig().X || org.telegram.messenger.hp.e1().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        gi.l3 l3Var = new gi.l3(getParentActivity(), 1);
        this.r = l3Var;
        l3Var.d = 3000L;
        l3Var.o(1.0f, -25.0f);
        this.r.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.r.l(getBaseSimpleGlass().c);
        this.r.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744265, null)));
        this.n.addView(this.r, b8.mf.e(-1, 80, 48));
        this.r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f));
        this.r.w();
        this.Q = true;
        org.telegram.messenger.hp.e1().edit().putInt("hidecallshint", org.telegram.messenger.hp.e1().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0(0, 50);
        org.telegram.messenger.hp messagesController = getMessagesController();
        messagesController.getClass();
        this.H = new ArrayList(messagesController.h.keySet());
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar2 = new za.p(notificationCenter, this);
        pVar2.b(1);
        pVar2.b(org.telegram.messenger.hs.w);
        pVar2.b(org.telegram.messenger.hs.A2);
        pVar2.b(org.telegram.messenger.hs.T);
        pVar2.b(org.telegram.messenger.hs.w2);
        this.P = pVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.s = bundle.getBoolean("needFinishFragment", true);
            this.w = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.R = this.w ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.S = this.w ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.U = i12;
        h0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        if (i3 == 101 || i3 == 102 || i3 == 103) {
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
                org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
            } else if (i3 == 103) {
                org.telegram.ui.Components.voip.n1.l(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull b22 = this.M != null ? getMessagesController().b2(this.M.id) : null;
                org.telegram.ui.Components.voip.n1.m(this.M, i3 == 102, i3 == 102 || (b22 != null && b22.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l41 l41Var = this.c;
        if (l41Var != null) {
            l41Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.l41 l41Var = this.c;
            if (l41Var != null) {
                int childCount = l41Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.c.getChildAt(i3);
                    if (childAt instanceof d9) {
                        ((d9) childAt).d.y(0);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.de0
    public final void v() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.vi0 vi0Var = this.e;
        vi0Var.b = 1;
        vi0Var.d(0, 0, false, false);
    }

    public h9(Bundle bundle) {
        super(bundle);
        this.s = true;
        this.y = new ArrayList();
        this.I = new ArrayList();
        this.Q = false;
    }
}
