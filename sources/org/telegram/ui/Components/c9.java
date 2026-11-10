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
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class c9 {
    public static void a(org.telegram.ui.cn cnVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.r4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = cnVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (b9 b9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && b9Var.f == j3) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = b9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        b9 b9Var2 = new b9();
        b9Var2.a = org.telegram.ui.cn.class;
        b9Var2.b = i7;
        b9Var2.f = j3;
        b9Var2.h = i11;
        b9Var2.g = i10;
        b9Var2.c = chat;
        b9Var2.d = user;
        b9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(b9Var2);
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
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.g1 b(org.telegram.ui.ActionBar.f2 f2Var, View view, long j3, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.r4 r4Var;
        long j11;
        int i7;
        ArrayList arrayList;
        boolean z9;
        TLRPC.Chat chat;
        TLRPC.User user;
        Class<ProfileActivity> cls;
        long j12;
        int i10;
        boolean z10;
        int i11;
        List list;
        int i12;
        ArrayList arrayList2;
        float f10;
        int i13;
        b9 b9Var;
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable;
        String str;
        ?? r82;
        int i14;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 parentLayout = f2Var.getParentLayout();
        Activity parentActivity = f2Var.getParentActivity();
        View fragmentView = f2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        boolean z14 = true;
        if (j10 == 0 || org.telegram.messenger.t3.o0(f2Var.getCurrentAccount(), j3)) {
            r4Var = parentLayout;
            j11 = 0;
            i7 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.r4 parentLayout2 = f2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i15 = 0;
                    while (i15 < size) {
                        org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) fragmentStack.get(i15);
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var2;
                            if (cnVar.f4 == 0 && !cnVar.X9()) {
                                chat = cnVar.e;
                                user = cnVar.j();
                                j12 = cnVar.a();
                                z10 = z14;
                                i11 = cnVar.Pa;
                                i10 = cnVar.Qa;
                                cls = org.telegram.ui.cn.class;
                                if (j12 != j3 || (j3 == 0 && org.telegram.messenger.t10.B(user))) {
                                    list = fragmentStack;
                                    i12 = size;
                                } else {
                                    list = fragmentStack;
                                    i12 = size;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < arrayList.size()) {
                                            int i17 = i16;
                                            if (((b9) arrayList.get(i16)).f == j12) {
                                                break;
                                            }
                                            i16 = i17 + 1;
                                        } else {
                                            b9 b9Var2 = new b9();
                                            b9Var2.a = cls;
                                            b9Var2.b = i15;
                                            b9Var2.c = chat;
                                            b9Var2.d = user;
                                            b9Var2.f = j12;
                                            b9Var2.g = i11;
                                            b9Var2.h = i10;
                                            if (chat != null || user != null) {
                                                arrayList.add(b9Var2);
                                            }
                                        }
                                    }
                                }
                            }
                            list = fragmentStack;
                            i12 = size;
                            z10 = z14;
                        } else {
                            if (f2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) f2Var2;
                                chat = profileActivity.D2;
                                try {
                                    user = profileActivity.u2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                long a10 = profileActivity.a();
                                cls = ProfileActivity.class;
                                j12 = a10;
                                i10 = 0;
                                z10 = z14;
                                i11 = 0;
                                if (j12 != j3) {
                                }
                                list = fragmentStack;
                                i12 = size;
                            }
                            list = fragmentStack;
                            i12 = size;
                            z10 = z14;
                        }
                        i15++;
                        fragmentStack = list;
                        size = i12;
                        z14 = z10;
                    }
                }
                z9 = z14;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        b9 b9Var3 = (b9) pulledDialogs.get(size2);
                        if (b9Var3.f != j3) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(b9Var3);
                                    break;
                                }
                                if (((b9) arrayList.get(i18)).f == b9Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.pe(6));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, h6Var);
                Rect rect = new Rect();
                f2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h6Var);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z15 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z16 = i19 == 0 ? z9 : false;
                    boolean z17 = i19 == size3 + (-1) ? z9 : false;
                    b9 b9Var4 = (b9) arrayList2.get(i19);
                    TLRPC.Chat chat2 = b9Var4.c;
                    TLRPC.User user2 = b9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = b9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    ?? k9Var = new k9(parentActivity);
                    boolean z18 = z15;
                    if (chat2 == null && user2 == null) {
                        f10 = 16.0f;
                        k9Var.setRoundRadius(0);
                    } else {
                        f10 = 16.0f;
                        k9Var.setRoundRadius((chat2 == null || !chat2.forum) ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    frameLayout.addView(k9Var, c8.ha.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z19 = z9;
                    textView.setLines(z19 ? 1 : 0);
                    int i20 = size3;
                    textView.setTextSize(z19 ? 1 : 0, f10);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, h6Var);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, c8.ha.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    v8 v8Var = new v8((org.telegram.ui.ActionBar.h6) null);
                    v8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            k9Var.setImageDrawable(qg.d.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.od, h6Var), false));
                            i13 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j11) {
                            i13 = i19;
                            k9Var.setAnimatedEmojiDrawable(new h5(10, f2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i13 = i19;
                            k9Var.setImageDrawable(qg.d.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i13 = i19;
                        if (chat2 != null) {
                            f2Var.getCurrentAccount();
                            v8Var.q(chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                v8Var = r82;
                            }
                            f2Var.getCurrentAccount();
                            k9Var.j(org.telegram.messenger.hc.a(1, chat2), "50_50", v8Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = v8Var;
                                }
                                if (b9Var4.a == org.telegram.ui.cn.class && org.telegram.messenger.t10.B(user2)) {
                                    str = org.telegram.messenger.id.M0(2131745901, null);
                                    v8Var.g(1);
                                    k9Var.setImageDrawable(v8Var);
                                } else if (org.telegram.messenger.t10.z(user2)) {
                                    str = org.telegram.messenger.id.M0(2131746266, null);
                                    v8Var.g(12);
                                    k9Var.setImageDrawable(v8Var);
                                } else {
                                    if (org.telegram.messenger.t10.x(user2)) {
                                        str = org.telegram.messenger.id.M0(2131749328, null);
                                        f2Var.getCurrentAccount();
                                        v8Var.r(user2);
                                        b9Var = b9Var4;
                                        z11 = true;
                                        k9Var.j(org.telegram.messenger.hc.l(f2Var.getCurrentAccount(), 1, user2), "50_50", v8Var, user2);
                                    } else {
                                        b9Var = b9Var4;
                                        z11 = true;
                                        String p10 = org.telegram.messenger.t10.p(user2);
                                        f2Var.getCurrentAccount();
                                        v8Var.r(user2);
                                        k9Var.j(org.telegram.messenger.hc.l(f2Var.getCurrentAccount(), 1, user2), "50_50", drawable, user2);
                                        str = p10;
                                    }
                                    textView.setText(str);
                                    z12 = z11;
                                    z13 = false;
                                }
                                b9Var = b9Var4;
                                z11 = true;
                                textView.setText(str);
                                z12 = z11;
                                z13 = false;
                            } else {
                                b9Var = b9Var4;
                                z11 = true;
                                k9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                k9Var.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, h6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(org.telegram.messenger.id.M0(2131754301, null));
                                z12 = z18;
                                z13 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var), i7, -1));
                            boolean z20 = z11;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new di.d0(atomicReference, b9Var, r4Var, tL_forumTopic, f2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ha.q(-1, 44, 0.0f, 0, 0, !z16 ? 3 : 0, 0, !z17 ? 3 : 0));
                            if (!z13) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, frameLayout2, h6Var);
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z20 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, c8.ha.o(-1, 8));
                            }
                            i19 = i13 + 1;
                            arrayList2 = arrayList3;
                            z15 = z12;
                            size3 = i20;
                            i7 = 2;
                            z9 = z20 ? 1 : 0;
                        }
                    }
                    b9Var = b9Var4;
                    z13 = false;
                    z11 = true;
                    z12 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var), i7, -1));
                    boolean z202 = z11;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new di.d0(atomicReference, b9Var, r4Var, tL_forumTopic, f2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ha.q(-1, 44, 0.0f, 0, 0, !z16 ? 3 : 0, 0, !z17 ? 3 : 0));
                    if (!z13) {
                    }
                    i19 = i13 + 1;
                    arrayList2 = arrayList3;
                    z15 = z12;
                    size3 = i20;
                    i7 = 2;
                    z9 = z202 ? 1 : 0;
                }
                boolean z21 = z9;
                if (!z15) {
                    return null;
                }
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(g1Var);
                g1Var.e = z21;
                g1Var.c = org.telegram.messenger.qs.x3;
                g1Var.setOutsideTouchable(z21);
                g1Var.setClippingEnabled(z21);
                g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var.setFocusable(z21);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                g1Var.getContentView().setFocusableInTouchMode(z21);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z21);
                int L = org.telegram.messenger.g0.L(7.0f) - rect.left;
                if (org.telegram.messenger.g0.Q1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L += iArr[0];
                }
                g1Var.showAtLocation(fragmentView, 51, L, (view.getBottom() - rect.top) - org.telegram.messenger.g0.L(1.0f));
                return g1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.r4 parentLayout3 = f2Var.getParentLayout();
            if (parentLayout3 == null) {
                r4Var = parentLayout;
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
                        b9 b9Var5 = (b9) pulledDialogs2.get(i21);
                        if (b9Var5.e != null) {
                            r4Var2 = parentLayout;
                            if (r7.id != j10) {
                                int i22 = b9Var5.b;
                                if (i22 >= i14) {
                                    i14 = i22;
                                }
                                arrayList.add(b9Var5);
                            }
                        } else {
                            r4Var2 = parentLayout;
                        }
                        i21++;
                        parentLayout = r4Var2;
                    }
                } else {
                    i7 = 2;
                    i14 = -1;
                }
                r4Var = parentLayout;
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof z91)) {
                    b9 b9Var6 = new b9();
                    arrayList.add(b9Var6);
                    b9Var6.b = -1;
                    b9Var6.a = z91.class;
                    b9Var6.c = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                } else {
                    b9 b9Var7 = new b9();
                    arrayList.add(b9Var7);
                    b9Var7.b = i14 + 1;
                    b9Var7.a = org.telegram.ui.zw.class;
                    b9 b9Var8 = new b9();
                    arrayList.add(b9Var8);
                    b9Var8.b = -1;
                    b9Var8.a = z91.class;
                    b9Var8.c = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                }
                Collections.sort(arrayList, new org.telegram.ui.pe(7));
            }
        }
        z9 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
