package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class i9 {
    public static void a(org.telegram.ui.bn bnVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.s4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = bnVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (h9 h9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && h9Var.f == j3) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = h9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        h9 h9Var2 = new h9();
        h9Var2.a = org.telegram.ui.bn.class;
        h9Var2.b = i7;
        h9Var2.f = j3;
        h9Var2.h = i11;
        h9Var2.g = i10;
        h9Var2.c = chat;
        h9Var2.d = user;
        h9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(h9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.q9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.h1 b(org.telegram.ui.ActionBar.h2 h2Var, View view, long j3, long j10, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.s4 s4Var;
        long j11;
        int i7;
        ArrayList arrayList;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        Class<ProfileActivity> cls;
        long j12;
        int i10;
        boolean z11;
        int i11;
        List list;
        int i12;
        ArrayList arrayList2;
        float f10;
        int i13;
        h9 h9Var;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        String str;
        ?? r82;
        int i14;
        org.telegram.ui.ActionBar.s4 s4Var2;
        org.telegram.ui.ActionBar.s4 parentLayout = h2Var.getParentLayout();
        Activity parentActivity = h2Var.getParentActivity();
        View fragmentView = h2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        boolean z15 = true;
        if (j10 == 0 || org.telegram.messenger.v3.o0(h2Var.getCurrentAccount(), j3)) {
            s4Var = parentLayout;
            j11 = 0;
            i7 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.s4 parentLayout2 = h2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i15 = 0;
                    while (i15 < size) {
                        org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) fragmentStack.get(i15);
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var2;
                            if (bnVar.g4 == 0 && !bnVar.Y9()) {
                                chat = bnVar.e;
                                user = bnVar.j();
                                j12 = bnVar.a();
                                z11 = z15;
                                i11 = bnVar.Ra;
                                i10 = bnVar.Sa;
                                cls = org.telegram.ui.bn.class;
                                if (j12 != j3 || (j3 == 0 && org.telegram.messenger.o10.C(user))) {
                                    list = fragmentStack;
                                    i12 = size;
                                } else {
                                    list = fragmentStack;
                                    i12 = size;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < arrayList.size()) {
                                            int i17 = i16;
                                            if (((h9) arrayList.get(i16)).f == j12) {
                                                break;
                                            }
                                            i16 = i17 + 1;
                                        } else {
                                            h9 h9Var2 = new h9();
                                            h9Var2.a = cls;
                                            h9Var2.b = i15;
                                            h9Var2.c = chat;
                                            h9Var2.d = user;
                                            h9Var2.f = j12;
                                            h9Var2.g = i11;
                                            h9Var2.h = i10;
                                            if (chat != null || user != null) {
                                                arrayList.add(h9Var2);
                                            }
                                        }
                                    }
                                }
                            }
                            list = fragmentStack;
                            i12 = size;
                            z11 = z15;
                        } else {
                            if (h2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) h2Var2;
                                chat = profileActivity.F2;
                                try {
                                    user = profileActivity.w2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                long a10 = profileActivity.a();
                                cls = ProfileActivity.class;
                                j12 = a10;
                                i10 = 0;
                                z11 = z15;
                                i11 = 0;
                                if (j12 != j3) {
                                }
                                list = fragmentStack;
                                i12 = size;
                            }
                            list = fragmentStack;
                            i12 = size;
                            z11 = z15;
                        }
                        i15++;
                        fragmentStack = list;
                        size = i12;
                        z15 = z11;
                    }
                }
                z10 = z15;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        h9 h9Var3 = (h9) pulledDialogs.get(size2);
                        if (h9Var3.f != j3) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(h9Var3);
                                    break;
                                }
                                if (((h9) arrayList.get(i18)).f == h9Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.pe(5));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, i6Var);
                Rect rect = new Rect();
                h2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i6Var);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z17 = i19 == 0 ? z10 : false;
                    boolean z18 = i19 == size3 + (-1) ? z10 : false;
                    h9 h9Var4 = (h9) arrayList2.get(i19);
                    TLRPC.Chat chat2 = h9Var4.c;
                    TLRPC.User user2 = h9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = h9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    ?? q9Var = new q9(parentActivity);
                    boolean z19 = z16;
                    if (chat2 == null && user2 == null) {
                        f10 = 16.0f;
                        q9Var.setRoundRadius(0);
                    } else {
                        f10 = 16.0f;
                        q9Var.setRoundRadius((chat2 == null || !chat2.forum) ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    frameLayout.addView(q9Var, c8.ma.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i20 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f10);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, i6Var);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, c8.ma.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
                    b9Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            q9Var.setImageDrawable(qg.c.d(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.rd, i6Var), false));
                            i13 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j11) {
                            i13 = i19;
                            q9Var.setAnimatedEmojiDrawable(new o5(10, h2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i13 = i19;
                            q9Var.setImageDrawable(qg.c.f(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i13 = i19;
                        if (chat2 != null) {
                            h2Var.getCurrentAccount();
                            b9Var.q(chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                b9Var = r82;
                            }
                            h2Var.getCurrentAccount();
                            q9Var.j(org.telegram.messenger.fc.a(1, chat2), "50_50", b9Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = b9Var;
                                }
                                if (h9Var4.a == org.telegram.ui.bn.class && org.telegram.messenger.o10.C(user2)) {
                                    str = org.telegram.messenger.gd.M0(2131745706, null);
                                    b9Var.g(1);
                                    q9Var.setImageDrawable(b9Var);
                                } else if (org.telegram.messenger.o10.A(user2)) {
                                    str = org.telegram.messenger.gd.M0(2131746071, null);
                                    b9Var.g(12);
                                    q9Var.setImageDrawable(b9Var);
                                } else {
                                    if (org.telegram.messenger.o10.y(user2)) {
                                        str = org.telegram.messenger.gd.M0(2131749136, null);
                                        h2Var.getCurrentAccount();
                                        b9Var.r(user2);
                                        h9Var = h9Var4;
                                        z12 = true;
                                        q9Var.j(org.telegram.messenger.fc.l(h2Var.getCurrentAccount(), 1, user2), "50_50", b9Var, user2);
                                    } else {
                                        h9Var = h9Var4;
                                        z12 = true;
                                        String q10 = org.telegram.messenger.o10.q(user2);
                                        h2Var.getCurrentAccount();
                                        b9Var.r(user2);
                                        q9Var.j(org.telegram.messenger.fc.l(h2Var.getCurrentAccount(), 1, user2), "50_50", drawable, user2);
                                        str = q10;
                                    }
                                    textView.setText(str);
                                    z13 = z12;
                                    z14 = false;
                                }
                                h9Var = h9Var4;
                                z12 = true;
                                textView.setText(str);
                                z13 = z12;
                                z14 = false;
                            } else {
                                h9Var = h9Var4;
                                z12 = true;
                                q9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                q9Var.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                q9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, i6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(org.telegram.messenger.gd.M0(2131754299, null));
                                z13 = z19;
                                z14 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var), i7, -1));
                            boolean z21 = z12;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new fi.d0(atomicReference, h9Var, s4Var, tL_forumTopic, h2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ma.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z14) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout2, i6Var);
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, c8.ma.o(-1, 8));
                            }
                            i19 = i13 + 1;
                            arrayList2 = arrayList3;
                            z16 = z13;
                            size3 = i20;
                            i7 = 2;
                            z10 = z21 ? 1 : 0;
                        }
                    }
                    h9Var = h9Var4;
                    z14 = false;
                    z12 = true;
                    z13 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var), i7, -1));
                    boolean z212 = z12;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new fi.d0(atomicReference, h9Var, s4Var, tL_forumTopic, h2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ma.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                    if (!z14) {
                    }
                    i19 = i13 + 1;
                    arrayList2 = arrayList3;
                    z16 = z13;
                    size3 = i20;
                    i7 = 2;
                    z10 = z212 ? 1 : 0;
                }
                boolean z22 = z10;
                if (!z16) {
                    return null;
                }
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(h1Var);
                h1Var.e = z22;
                h1Var.c = org.telegram.messenger.ks.x3;
                h1Var.setOutsideTouchable(z22);
                h1Var.setClippingEnabled(z22);
                h1Var.setAnimationStyle(R.style.PopupContextAnimation);
                h1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                h1Var.setInputMethodMode(2);
                h1Var.setSoftInputMode(0);
                h1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
                int L = org.telegram.messenger.g0.L(7.0f) - rect.left;
                if (org.telegram.messenger.g0.Q1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L += iArr[0];
                }
                h1Var.showAtLocation(fragmentView, 51, L, (view.getBottom() - rect.top) - org.telegram.messenger.g0.L(1.0f));
                return h1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.s4 parentLayout3 = h2Var.getParentLayout();
            if (parentLayout3 == null) {
                s4Var = parentLayout;
                j11 = 0;
                i7 = 2;
            } else {
                j11 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i14 = -1;
                    int i21 = 0;
                    i7 = 2;
                    while (i21 < pulledDialogs2.size()) {
                        h9 h9Var5 = (h9) pulledDialogs2.get(i21);
                        if (h9Var5.e != null) {
                            s4Var2 = parentLayout;
                            if (r7.id != j10) {
                                int i22 = h9Var5.b;
                                if (i22 >= i14) {
                                    i14 = i22;
                                }
                                arrayList.add(h9Var5);
                            }
                        } else {
                            s4Var2 = parentLayout;
                        }
                        i21++;
                        parentLayout = s4Var2;
                    }
                } else {
                    i7 = 2;
                    i14 = -1;
                }
                s4Var = parentLayout;
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof y91)) {
                    h9 h9Var6 = new h9();
                    arrayList.add(h9Var6);
                    h9Var6.b = -1;
                    h9Var6.a = y91.class;
                    h9Var6.c = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
                } else {
                    h9 h9Var7 = new h9();
                    arrayList.add(h9Var7);
                    h9Var7.b = i14 + 1;
                    h9Var7.a = org.telegram.ui.cx.class;
                    h9 h9Var8 = new h9();
                    arrayList.add(h9Var8);
                    h9Var8.b = -1;
                    h9Var8.a = y91.class;
                    h9Var8.c = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
                }
                Collections.sort(arrayList, new org.telegram.ui.pe(6));
            }
        }
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
