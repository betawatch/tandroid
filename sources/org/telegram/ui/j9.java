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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j9 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, of0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.zr I;
    public FrameLayout J;
    public y8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public xa.n O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public jg.b1 a;
    public s4.a0 b;
    public org.telegram.ui.Components.u51 c;
    public View d;
    public org.telegram.ui.Components.vj0 e;
    public org.telegram.ui.Components.f10 f;
    public org.telegram.ui.Components.zz h;
    public w8 n;
    public vh.p2 r;
    public boolean s;
    public boolean w;
    public org.telegram.ui.ActionBar.p5 x;
    public final ArrayList y;

    public j9() {
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
    public static void Y(j9 j9Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        TLRPC.messages_Messages messages_messages;
        int i10;
        TLRPC.User Z1;
        g9 g9Var;
        TLRPC.User Z12;
        ArrayList arrayList = j9Var.y;
        int i11 = 0;
        int i12 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            org.telegram.messenger.vp.r1(j9Var.currentAccount).V3(messages_messages2.users, false);
            org.telegram.messenger.vp.r1(j9Var.currentAccount).P3(messages_messages2.chats, false);
            j9Var.F = messages_messages2.messages.isEmpty();
            g9 g9Var2 = !arrayList.isEmpty() ? (g9) i0.a.g(1, arrayList) : null;
            int i13 = 0;
            while (i13 < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i13);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                    i10 = i13;
                } else {
                    long C1 = org.telegram.messenger.jj.C1(message.from_id);
                    if (C1 == j9Var.getUserConfig().e()) {
                        C1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    int i14 = org.telegram.messenger.jj.C1(message.from_id) == j9Var.getUserConfig().e() ? i11 : i12;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(C1));
                        hashSet.addAll((Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new k2.f(6)).collect(Collectors.toSet()));
                        if (i14 == i12 && tL_messageActionConferenceCall.missed) {
                            i14 = 2;
                        }
                        int i15 = (i14 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i14;
                        messages_messages = messages_messages2;
                        if (g9Var2 != null) {
                            i10 = i13;
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
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size) {
                                                TLRPC.User Z13 = j9Var.getMessagesController().Z1(l4);
                                                if (Z13 != null) {
                                                    arrayList2.add(Z13);
                                                }
                                            } else {
                                                Object obj = arrayList2.get(i16);
                                                i16++;
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
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new o8(C1, 0)) && (Z12 = j9Var.getMessagesController().Z1(l10)) != null) {
                                            arrayList4.add(Z12);
                                        }
                                    }
                                    g9Var2.d = i15;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    g9Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            i10 = i13;
                        }
                        int i17 = i11;
                        while (true) {
                            if (i17 >= arrayList.size()) {
                                g9Var = null;
                                break;
                            }
                            g9Var = (g9) arrayList.get(i17);
                            int i18 = i17;
                            if (g9Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i17 = i18 + 1;
                            }
                        }
                        if (g9Var == null) {
                        }
                    } else {
                        messages_messages = messages_messages2;
                        i10 = i13;
                        hashSet.add(Long.valueOf(C1));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i14 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i14 = 2;
                        }
                        int i19 = (i14 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i14;
                        if (g9Var2 != null) {
                            ArrayList arrayList5 = g9Var2.b;
                            if (hashSet.size() == arrayList5.size()) {
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size2) {
                                        Object obj2 = arrayList5.get(i20);
                                        i20++;
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
                            if (Collection.-EL.stream(arrayList6).noneMatch(new o8(C1, 1)) && (Z1 = j9Var.getMessagesController().Z1(l11)) != null) {
                                arrayList6.add(Z1);
                            }
                        }
                        g9Var2.d = i19;
                        TLRPC.MessageAction messageAction4 = message.action;
                        g9Var2.e = messageAction4 != null && messageAction4.video;
                        g9Var2.c.add(message);
                    }
                }
                i13 = i10 + 1;
                messages_messages2 = messages_messages;
                i11 = 0;
                i12 = 1;
            }
            if (g9Var2 != null && !g9Var2.c.isEmpty() && !arrayList.contains(g9Var2)) {
                arrayList.add(g9Var2);
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
        j9Var.x.setVisibility(arrayList.isEmpty() ? 8 : 0);
        jg.b1 b1Var = j9Var.a;
        if (b1Var != null) {
            b1Var.e();
        }
        org.telegram.ui.Components.u51 u51Var = j9Var.c;
        if (u51Var != null) {
            u51Var.f3.O(true);
        }
    }

    public static void Z(j9 j9Var, org.telegram.ui.Components.a51 a51Var, View view) {
        int i10 = a51Var.d;
        int i11 = 0;
        if (i10 == 2) {
            j9Var.l0(true);
            org.telegram.ui.Components.wb J = org.telegram.ui.Components.cc.a0(j9Var).J(R.raw.contact_check, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749467, null)), org.telegram.messenger.cd.L0(2131743910, null), 5000, true, new l8(j9Var, 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i10 == 1) {
            k0(j9Var);
            return;
        }
        Object obj = a51Var.G;
        boolean z10 = obj instanceof g9;
        int i12 = org.telegram.messenger.zs.t;
        if (!z10) {
            if (view instanceof i9) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((i9) view).c.id);
                j9Var.getNotificationCenter().k(i12, new Object[0]);
                j9Var.presentFragment(new un(bundle), j9Var.s);
                return;
            }
            return;
        }
        g9 g9Var = (g9) obj;
        ArrayList arrayList = g9Var.c;
        if (j9Var.simpleActionBar.s()) {
            j9Var.e0(arrayList, (f9) view);
            return;
        }
        if (g9Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", org.telegram.messenger.jj.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            j9Var.getNotificationCenter().k(i12, new Object[0]);
            j9Var.presentFragment(new un(bundle2), j9Var.s);
            return;
        }
        boolean z11 = g9Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = g9Var.b;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, j9Var.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = j9Var.getMessagesController().Q6;
        x1Var.setOnCancelListener(new n8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(j9Var, x1Var, hashSet, tL_inputGroupCallInviteMessage, z11, 0)), i11));
        x1Var.r(600L);
    }

    public static void a0(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        x1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().V3(groupcall.users, false);
            j9Var.getMessagesController().P3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.m1.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(j9Var).f0(tL_error, false);
        }
    }

    public static void b0(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        x1Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().V3(groupcall.users, false);
            j9Var.getMessagesController().P3(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
                return;
            } else {
                org.telegram.ui.Components.voip.m1.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new ut(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(j9Var).f0(tL_error, false);
        }
    }

    public static void d0(j9 j9Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j9Var.getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131751590, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131751589, null);
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131751560, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131751500, null);
        }
        int i10 = 1;
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(j9Var.getParentActivity());
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(j9Var.getParentActivity(), 1);
        c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        c2Var.e(org.telegram.messenger.cd.L0(2131751559, null), "", false, false, false);
        c2Var.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : 0, 0, org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(8.0f), 0);
        frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        c2Var.setOnClickListener(new j8(0, zArr));
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ag.v0(j9Var, z10, zArr, i10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        j9Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public static void k0(org.telegram.ui.ActionBar.k2 k2Var) {
        k2Var.presentFragment(new d9(a1.g.g("isCall", true), k2Var.getCurrentAccount(), k2Var));
    }

    public static void m0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.p6 p6Var, boolean z10, final boolean z11) {
        int i11;
        int i12 = org.telegram.ui.ActionBar.t6.h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, p6Var, false);
        z2Var.v0(w02);
        z2Var.P(w02);
        z2Var.w0(i12);
        z2Var.Q(i12);
        final String[] strArr = {str};
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.b6.e(-1, -1, 17));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, p6Var);
        frameLayout.addView(frameLayout2, w7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i14 = org.telegram.ui.ActionBar.t6.y6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView2, i14, p6Var, mode);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        if (z11) {
            frameLayout.addView(imageView2, w7.b6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i16 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context, 20.0f, i16, true, p6Var);
        a2.setText(org.telegram.messenger.cd.L0(2131749481, null));
        a2.setGravity(17);
        f7.addView(a2, w7.b6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context, 14.0f, i16, false, p6Var);
        a10.setText(org.telegram.messenger.cd.L0(2131749482, null));
        a10.setGravity(17);
        a10.setMaxWidth(vh.p2.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.b6.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.e6.b(frameLayout3, 0.01f, 1.2f);
        int i17 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i17, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i17, p6Var), org.telegram.ui.ActionBar.t6.w0(i15, p6Var)), 12, 12);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i17, i15);
        frameLayout3.setBackground(b02);
        org.telegram.ui.ActionBar.a7.k(frameLayout3, b02, N3, q6, p6Var);
        f7.addView(frameLayout3, w7.b6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.p80 a11 = w7.g6.a(context, 13.0f, i16, false, p6Var);
        a11.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
        a11.setText(substring);
        frameLayout3.addView(a11, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.r5, p6Var, mode);
        frameLayout3.addView(imageView3, w7.b6.e(40, 48, 21));
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
        f7.addView(f10, w7.b6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749489, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.b6.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        vh.d dVar2 = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131749483, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        if (z10) {
            a9 a9Var = new a9(context, p6Var);
            a9Var.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(a9Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
            a9Var.setText(" " + org.telegram.messenger.cd.L0(2131749488, null) + " ");
            a9Var.setTextSize(14.0f);
            f7.addView(a9Var, w7.b6.t(org.telegram.messenger.zs.U2, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ag.o0 o0Var = new ag.o0(str, i11, z2VarArr, 17);
            org.telegram.ui.Components.p80 a12 = w7.g6.a(context, 14.0f, i16, false, p6Var);
            a12.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131749487, null), o0Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(vh.p2.a(a12.getText(), a12.getPaint()));
            f7.addView(a12, w7.b6.t(-1, -2, 17, 32, 8, 32, 12));
            w7.e6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(o0Var, 8));
        } else {
            i11 = i10;
        }
        z2Var.N = f7;
        z2Var.show();
        final int i18 = 0;
        z2VarArr[0] = z2Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i19 = i18;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                String[] strArr2 = strArr;
                switch (i19) {
                    case 0:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                    default:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                }
                org.telegram.messenger.z20.r(null, 2131748931, ccVar);
            }
        });
        final int i19 = 1;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.cc ccVar;
                int i192 = i19;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                String[] strArr2 = strArr;
                switch (i192) {
                    case 0:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                    default:
                        org.telegram.messenger.i0.g(strArr2[0]);
                        ccVar = new org.telegram.ui.Components.cc(z2Var2.E, p6Var2);
                        break;
                }
                org.telegram.messenger.z20.r(null, 2131748931, ccVar);
            }
        });
        final org.telegram.messenger.fe feVar = new org.telegram.messenger.fe(inputGroupCall, i11, strArr, frameLayout3, a11, z2Var, p6Var, 3);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.z2 z2Var2 = org.telegram.ui.ActionBar.z2.this;
                org.telegram.ui.ActionBar.p2 p2Var = z2Var2.c;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(p2Var, p6Var2, frameLayout3);
                String L0 = org.telegram.messenger.cd.L0(2131751767, null);
                String[] strArr2 = strArr;
                F.c(R.drawable.msg_copy, L0, new p1(strArr2, z2Var2, p6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, org.telegram.messenger.cd.L0(2131750481, null), new h0(7, context, strArr2), false);
                F.m(R.drawable.msg_delete, feVar, org.telegram.messenger.cd.L0(2131746040, null), z11, true);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new bi.c(context, str, strArr, p6Var, z2Var));
        if (z11) {
            imageView2.setOnClickListener(new org.telegram.messenger.video.h(z2Var, p6Var, imageView2, feVar, 1));
        }
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.of0
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        if (!this.w) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        }
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752596, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 18));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(10, R.drawable.ic_ab_other);
        this.x = b10;
        b10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        org.telegram.ui.ActionBar.b1 e = this.x.e(3, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751590, null));
        int i12 = org.telegram.ui.ActionBar.t6.p7;
        e.d(getThemedColor(i12), getThemedColor(i12));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new z4(this, i10), new u8(this), new u8(this));
        this.c = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.f3.r = false;
        w8 w8Var = new w8(this, context, i11);
        this.n = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.h = zzVar;
        zzVar.setViewType(8);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, this.h, null);
        this.h.x = false;
        this.a = new jg.b1(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        org.telegram.ui.Components.u51 u51Var2 = this.c;
        s4.a0 a0Var = new s4.a0(1, false);
        this.b = a0Var;
        u51Var2.setLayoutManager(a0Var);
        this.c.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(this.c, this.b);
        this.e = vj0Var;
        ei.r rVar = this.glassEngine;
        Objects.requireNonNull(rVar);
        vj0Var.h = new y0(rVar, 12);
        this.n.addView(this.c, w7.b6.e(-1, -1, 3));
        this.n.addView(this.a, w7.b6.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, w7.b6.e(-1, 0, 48));
        this.c.setOnScrollListener(new x8(this));
        if (this.D) {
            this.a.d();
        } else {
            this.a.e();
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.f = f10Var;
        f10Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(org.telegram.messenger.cd.L0(2131752634, null));
        this.f.setOnClickListener(new k8(this, i10));
        this.n.addView(this.f, org.telegram.ui.Components.f10.b());
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.I = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new l8(this, 1));
        org.telegram.ui.Components.zr zrVar2 = this.I;
        vg.f c10 = getBaseSimpleGlass().c.c(this.I, null, false);
        c10.o(w7.b9.o(this.resourceProvider));
        c10.q(org.telegram.messenger.i0.L(24.0f));
        c10.p(org.telegram.messenger.i0.L(7.0f));
        zrVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        y8 y8Var = new y8(this, context, this, this.n, this.resourceProvider);
        this.K = y8Var;
        this.J.addView(y8Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, w7.b6.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new z8(this, i11));
        if (this.w) {
            View view2 = this.fragmentView;
            u8 u8Var = new u8(this);
            WeakHashMap weakHashMap = r0.h0.a;
            r0.z.i(view2, u8Var);
        }
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2  */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Long l4;
        org.telegram.ui.Components.u51 u51Var;
        int i12;
        TLRPC.User Z1;
        int i13;
        ArrayList arrayList;
        g9 g9Var;
        int i14 = 2;
        ArrayList arrayList2 = this.y;
        if (i10 != 1) {
            if (i10 == org.telegram.messenger.zs.w) {
                if (this.E && !((Boolean) objArr[2]).booleanValue()) {
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        g9 g9Var2 = (g9) it.next();
                        Iterator it2 = g9Var2.c.iterator();
                        while (it2.hasNext()) {
                            if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                                it2.remove();
                                r3 = 1;
                            }
                        }
                        if (g9Var2.c.isEmpty()) {
                            it.remove();
                        }
                    }
                    if (r3 == 0 || (u51Var = this.c) == null) {
                        return;
                    }
                    u51Var.f3.O(true);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.A2) {
                org.telegram.messenger.vp messagesController = getMessagesController();
                messagesController.getClass();
                this.G = new ArrayList(messagesController.h.keySet());
                org.telegram.ui.Components.u51 u51Var2 = this.c;
                if (u51Var2 != null) {
                    u51Var2.f3.O(true);
                    return;
                }
                return;
            }
            if (i10 != org.telegram.messenger.zs.T) {
                if (i10 == org.telegram.messenger.zs.w2 && (l4 = this.N) != null && l4.equals((Long) objArr[0])) {
                    org.telegram.ui.Components.voip.m1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l10 = this.N;
            if (l10 == null || ((TLRPC.ChatFull) objArr[0]).id != l10.longValue() || getMessagesController().f1(this.N.longValue(), true, null) == null) {
                return;
            }
            org.telegram.ui.Components.voip.m1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            this.N = null;
            return;
        }
        if (this.E && !((Boolean) objArr[2]).booleanValue()) {
            ArrayList arrayList4 = (ArrayList) objArr[1];
            int size = arrayList4.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList4.get(i15);
                int i16 = i15 + 1;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                TLRPC.MessageAction messageAction = jjVar.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                    long Z0 = jjVar.Z0();
                    long j10 = Z0 == getUserConfig().e() ? jjVar.k.peer_id.user_id : Z0;
                    int i17 = Z0 == getUserConfig().e() ? 0 : 1;
                    TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = jjVar.k.action.reason;
                    if (i17 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        i17 = i14;
                    }
                    if (i17 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                        r12 = i17;
                    }
                    if (!arrayList2.isEmpty()) {
                        g9 g9Var3 = (g9) arrayList2.get(0);
                        ArrayList arrayList5 = g9Var3.b;
                        if (arrayList5.size() == 1) {
                            i12 = i16;
                            if (((TLRPC.User) arrayList5.get(0)).id == j10 && g9Var3.d == r12) {
                                g9Var3.c.add(0, jjVar.k);
                                i15 = i12;
                            }
                            g9 g9Var4 = new g9();
                            ArrayList arrayList6 = g9Var4.c;
                            arrayList6.clear();
                            arrayList6.add(jjVar.k);
                            ArrayList arrayList7 = g9Var4.b;
                            arrayList7.clear();
                            Z1 = getMessagesController().Z1(Long.valueOf(j10));
                            if (Z1 != null) {
                                arrayList7.add(Z1);
                            }
                            g9Var4.d = r12;
                            g9Var4.e = jjVar.J4();
                            arrayList2.add(0, g9Var4);
                            this.c.f3.O(true);
                            i13 = i14;
                        }
                    }
                    i12 = i16;
                    g9 g9Var42 = new g9();
                    ArrayList arrayList62 = g9Var42.c;
                    arrayList62.clear();
                    arrayList62.add(jjVar.k);
                    ArrayList arrayList72 = g9Var42.b;
                    arrayList72.clear();
                    Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                    }
                    g9Var42.d = r12;
                    g9Var42.e = jjVar.J4();
                    arrayList2.add(0, g9Var42);
                    this.c.f3.O(true);
                    i13 = i14;
                } else {
                    i12 = i16;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long Z02 = jjVar.Z0();
                        Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new k2.f(6)).collect(Collectors.toSet());
                        set.add(Long.valueOf(Z02 == getUserConfig().e() ? jjVar.k.peer_id.user_id : Z02));
                        int i18 = Z02 == getUserConfig().e() ? 0 : 1;
                        if (i18 == 1 && tL_messageActionConferenceCall.missed) {
                            i18 = i14;
                        }
                        r12 = (i18 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i18;
                        if (arrayList2.isEmpty()) {
                            i13 = i14;
                            arrayList = arrayList2;
                        } else {
                            int i19 = 0;
                            while (true) {
                                if (i19 >= arrayList2.size()) {
                                    i13 = i14;
                                    arrayList = arrayList2;
                                    g9Var = null;
                                    break;
                                }
                                g9Var = (g9) arrayList2.get(i19);
                                i13 = i14;
                                arrayList = arrayList2;
                                if (g9Var.a == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i19++;
                                i14 = i13;
                                arrayList2 = arrayList;
                            }
                            if (g9Var != null) {
                                ArrayList arrayList8 = g9Var.b;
                                g9Var.c.add(0, jjVar.k);
                                for (Long l11 : set) {
                                    long longValue = l11.longValue();
                                    int size2 = arrayList8.size();
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 < size2) {
                                            Object obj2 = arrayList8.get(i20);
                                            i20++;
                                            if (longValue == ((TLRPC.User) obj2).id) {
                                                break;
                                            }
                                        } else {
                                            TLRPC.User Z12 = getMessagesController().Z1(l11);
                                            if (Z12 != null) {
                                                arrayList8.add(Z12);
                                            }
                                        }
                                    }
                                }
                                this.c.f3.O(true);
                                i15 = i12;
                                i14 = i13;
                                arrayList2 = arrayList;
                            }
                        }
                        g9 g9Var5 = new g9();
                        g9Var5.a = tL_messageActionConferenceCall.call_id;
                        ArrayList arrayList9 = g9Var5.c;
                        arrayList9.clear();
                        arrayList9.add(jjVar.k);
                        ArrayList arrayList10 = g9Var5.b;
                        arrayList10.clear();
                        for (Long l12 : set) {
                            l12.getClass();
                            TLRPC.User Z13 = getMessagesController().Z1(l12);
                            if (Z13 != null) {
                                arrayList10.add(Z13);
                            }
                        }
                        g9Var5.d = r12;
                        g9Var5.e = jjVar.J4();
                        arrayList2 = arrayList;
                        arrayList2.add(0, g9Var5);
                        this.c.f3.O(true);
                    } else {
                        i13 = i14;
                    }
                }
                i15 = i12;
                i14 = i13;
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.x;
            if (p5Var != null) {
                p5Var.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            }
        }
    }

    public final void e0(ArrayList arrayList, f9 f9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean j02 = j0(arrayList);
        ArrayList arrayList2 = this.H;
        if (j02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id));
            }
            org.telegram.ui.Components.ep epVar = f9Var.e;
            if (epVar != null) {
                epVar.a(false, true);
            }
            n0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.ep epVar2 = f9Var.e;
        if (epVar2 != null) {
            epVar2.a(true, true);
        }
        n0();
    }

    public final void f0() {
        this.f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    public final void g0() {
        org.telegram.ui.Components.u51 u51Var = this.c;
        i0.c cVar = this.mSystemInsets;
        ei.b.e(u51Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((int) this.I.c(org.telegram.messenger.i0.L(7.0f))), this.Q);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(org.telegram.messenger.i0.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (ei.b.d(this.mSystemInsets.b) - org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.T + this.Q);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        org.telegram.ui.Components.f10 f10Var = this.f;
        if (f10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(f10Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q9));
        }
        return arrayList;
    }

    public final void h0(int i10, int i11) {
        if (this.D) {
            return;
        }
        this.D = true;
        jg.b1 b1Var = this.a;
        if (b1Var != null && !this.E) {
            b1Var.d();
        }
        org.telegram.ui.Components.u51 u51Var = this.c;
        if (u51Var != null) {
            u51Var.f3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new k(this, 1), 2), this.classGuid);
    }

    public final void i0(boolean z10) {
        org.telegram.ui.Components.ep epVar;
        this.simpleActionBar.r();
        this.H.clear();
        int childCount = this.c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.c.getChildAt(i10);
            if ((childAt instanceof f9) && (epVar = ((f9) childAt).e) != null) {
                epVar.a(false, z10);
            }
        }
        this.c.f3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).id))) {
                return true;
            }
        }
        return false;
    }

    public final void l0(boolean z10) {
        if (z10 == getUserConfig().W) {
            return;
        }
        org.telegram.messenger.d20 userConfig = getUserConfig();
        if (userConfig.W != z10) {
            userConfig.W = z10;
            userConfig.v(false);
        }
        this.c.f3.O(true);
        org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.O5, new Object[0]);
    }

    public final void n0() {
        boolean z10;
        boolean s10 = this.simpleActionBar.s();
        ArrayList arrayList = this.H;
        if (s10) {
            z10 = true;
            if (arrayList.isEmpty()) {
                i0(true);
                return;
            }
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var.e == null) {
                i5Var.l().d(2, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
            }
            this.simpleActionBar.C();
            z10 = false;
        }
        this.simpleActionBar.y(arrayList.size(), z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.s()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        i0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.P || !getUserConfig().W || org.telegram.messenger.vp.d1().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        vh.p2 p2Var = new vh.p2(getParentActivity(), 1);
        this.r = p2Var;
        p2Var.d = 3000L;
        p2Var.l(1.0f, -25.0f);
        this.r.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        this.r.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744281, null)));
        this.n.addView(this.r, w7.b6.e(-1, 80, 48));
        this.r.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(16.0f));
        this.r.u();
        this.P = true;
        org.telegram.messenger.vp.d1().edit().putInt("hidecallshint", org.telegram.messenger.vp.d1().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        h0(0, 50);
        org.telegram.messenger.vp messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        xa.n nVar = this.O;
        if (nVar != null) {
            nVar.a();
            this.O = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(1);
        nVar2.e(org.telegram.messenger.zs.w);
        nVar2.e(org.telegram.messenger.zs.A2);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.w2);
        this.O = nVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.s = bundle.getBoolean("needFinishFragment", true);
            this.w = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.Q = this.w ? org.telegram.messenger.i0.L(72.0f) : 0;
        this.R = this.w ? org.telegram.messenger.i0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        xa.n nVar = this.O;
        if (nVar != null) {
            nVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T = i13;
        g0();
        f0();
    }

    @Override // org.telegram.ui.ActionBar.k2
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
                org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
            } else if (i10 == 103) {
                org.telegram.ui.Components.voip.m1.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull a2 = this.L != null ? getMessagesController().a2(this.L.id) : null;
                org.telegram.ui.Components.voip.m1.m(this.L, i10 == 102, i10 == 102 || (a2 != null && a2.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u51 u51Var = this.c;
        if (u51Var != null) {
            u51Var.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.u51 u51Var = this.c;
            if (u51Var != null) {
                int childCount = u51Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.c.getChildAt(i10);
                    if (childAt instanceof f9) {
                        ((f9) childAt).d.A(0);
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        if (this.b.L0() < 15) {
            this.c.y0(0);
            return;
        }
        org.telegram.ui.Components.vj0 vj0Var = this.e;
        vj0Var.b = 1;
        vj0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public j9(Bundle bundle) {
        super(bundle);
        this.s = true;
        this.y = new ArrayList();
        this.H = new ArrayList();
        this.P = false;
    }
}
