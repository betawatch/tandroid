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
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class b9 {
    public static void a(org.telegram.ui.wm wmVar, int i3, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10, int i11) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = wmVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (a9 a9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && a9Var.f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = a9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        a9 a9Var2 = new a9();
        a9Var2.a = org.telegram.ui.wm.class;
        a9Var2.b = i3;
        a9Var2.f = j10;
        a9Var2.h = i11;
        a9Var2.g = i10;
        a9Var2.c = chat;
        a9Var2.d = user;
        a9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(a9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f1 b(org.telegram.ui.ActionBar.d2 d2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.q4 q4Var;
        long j12;
        int i3;
        ArrayList arrayList;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        Class<ProfileActivity> cls;
        long j13;
        int i10;
        boolean z11;
        int i11;
        List list;
        int i12;
        ArrayList arrayList2;
        float f10;
        int i13;
        a9 a9Var;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        String str;
        ?? r82;
        int i14;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 parentLayout = d2Var.getParentLayout();
        Activity parentActivity = d2Var.getParentActivity();
        View fragmentView = d2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        boolean z15 = true;
        if (j11 == 0 || org.telegram.messenger.t3.o0(d2Var.getCurrentAccount(), j10)) {
            q4Var = parentLayout;
            j12 = 0;
            i3 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.q4 parentLayout2 = d2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i15 = 0;
                    while (i15 < size) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) fragmentStack.get(i15);
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (wmVar.g4 == 0 && !wmVar.W9()) {
                                chat = wmVar.e;
                                user = wmVar.j();
                                j13 = wmVar.a();
                                z11 = z15;
                                i11 = wmVar.Oa;
                                i10 = wmVar.Pa;
                                cls = org.telegram.ui.wm.class;
                                if (j13 != j10 || (j10 == 0 && org.telegram.messenger.l10.B(user))) {
                                    list = fragmentStack;
                                    i12 = size;
                                } else {
                                    list = fragmentStack;
                                    i12 = size;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < arrayList.size()) {
                                            int i17 = i16;
                                            if (((a9) arrayList.get(i16)).f == j13) {
                                                break;
                                            }
                                            i16 = i17 + 1;
                                        } else {
                                            a9 a9Var2 = new a9();
                                            a9Var2.a = cls;
                                            a9Var2.b = i15;
                                            a9Var2.c = chat;
                                            a9Var2.d = user;
                                            a9Var2.f = j13;
                                            a9Var2.g = i11;
                                            a9Var2.h = i10;
                                            if (chat != null || user != null) {
                                                arrayList.add(a9Var2);
                                            }
                                        }
                                    }
                                }
                            }
                            list = fragmentStack;
                            i12 = size;
                            z11 = z15;
                        } else {
                            if (d2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) d2Var2;
                                chat = profileActivity.E2;
                                try {
                                    user = profileActivity.v2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                long a10 = profileActivity.a();
                                cls = ProfileActivity.class;
                                j13 = a10;
                                i10 = 0;
                                z11 = z15;
                                i11 = 0;
                                if (j13 != j10) {
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
                        a9 a9Var3 = (a9) pulledDialogs.get(size2);
                        if (a9Var3.f != j10) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(a9Var3);
                                    break;
                                }
                                if (((a9) arrayList.get(i18)).f == a9Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.messenger.tq(26));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, e6Var);
                Rect rect = new Rect();
                d2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z17 = i19 == 0 ? z10 : false;
                    boolean z18 = i19 == size3 + (-1) ? z10 : false;
                    a9 a9Var4 = (a9) arrayList2.get(i19);
                    TLRPC.Chat chat2 = a9Var4.c;
                    TLRPC.User user2 = a9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = a9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    ?? k9Var = new k9(parentActivity);
                    boolean z19 = z16;
                    if (chat2 == null && user2 == null) {
                        f10 = 16.0f;
                        k9Var.setRoundRadius(0);
                    } else {
                        f10 = 16.0f;
                        k9Var.setRoundRadius((chat2 == null || !chat2.forum) ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    frameLayout.addView(k9Var, b8.mf.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i20 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f10);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, e6Var);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, b8.mf.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            k9Var.setImageDrawable(rg.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.od, e6Var), false));
                            i13 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j12) {
                            i13 = i19;
                            k9Var.setAnimatedEmojiDrawable(new g5(10, d2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i13 = i19;
                            k9Var.setImageDrawable(rg.c.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i13 = i19;
                        if (chat2 != null) {
                            d2Var.getCurrentAccount();
                            u8Var.q(chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                u8Var = r82;
                            }
                            d2Var.getCurrentAccount();
                            k9Var.j(org.telegram.messenger.ac.a(1, chat2), "50_50", u8Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = u8Var;
                                }
                                if (a9Var4.a == org.telegram.ui.wm.class && org.telegram.messenger.l10.B(user2)) {
                                    str = org.telegram.messenger.bd.M0(2131745911, null);
                                    u8Var.g(1);
                                    k9Var.setImageDrawable(u8Var);
                                } else if (org.telegram.messenger.l10.z(user2)) {
                                    str = org.telegram.messenger.bd.M0(2131746274, null);
                                    u8Var.g(12);
                                    k9Var.setImageDrawable(u8Var);
                                } else {
                                    if (org.telegram.messenger.l10.x(user2)) {
                                        str = org.telegram.messenger.bd.M0(2131749336, null);
                                        d2Var.getCurrentAccount();
                                        u8Var.r(user2);
                                        a9Var = a9Var4;
                                        z12 = true;
                                        k9Var.j(org.telegram.messenger.ac.l(d2Var.getCurrentAccount(), 1, user2), "50_50", u8Var, user2);
                                    } else {
                                        a9Var = a9Var4;
                                        z12 = true;
                                        String p10 = org.telegram.messenger.l10.p(user2);
                                        d2Var.getCurrentAccount();
                                        u8Var.r(user2);
                                        k9Var.j(org.telegram.messenger.ac.l(d2Var.getCurrentAccount(), 1, user2), "50_50", drawable, user2);
                                        str = p10;
                                    }
                                    textView.setText(str);
                                    z13 = z12;
                                    z14 = false;
                                }
                                a9Var = a9Var4;
                                z12 = true;
                                textView.setText(str);
                                z13 = z12;
                                z14 = false;
                            } else {
                                a9Var = a9Var4;
                                z12 = true;
                                k9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                k9Var.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, e6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(org.telegram.messenger.bd.M0(2131754301, null));
                                z13 = z19;
                                z14 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var), i3, -1));
                            boolean z21 = z12;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ei.f0(atomicReference, a9Var, q4Var, tL_forumTopic, d2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, b8.mf.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z14) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout2, e6Var);
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, b8.mf.o(-1, 8));
                            }
                            i19 = i13 + 1;
                            arrayList2 = arrayList3;
                            z16 = z13;
                            size3 = i20;
                            i3 = 2;
                            z10 = z21 ? 1 : 0;
                        }
                    }
                    a9Var = a9Var4;
                    z14 = false;
                    z12 = true;
                    z13 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var), i3, -1));
                    boolean z212 = z12;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new ei.f0(atomicReference, a9Var, q4Var, tL_forumTopic, d2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, b8.mf.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                    if (!z14) {
                    }
                    i19 = i13 + 1;
                    arrayList2 = arrayList3;
                    z16 = z13;
                    size3 = i20;
                    i3 = 2;
                    z10 = z212 ? 1 : 0;
                }
                boolean z22 = z10;
                if (!z16) {
                    return null;
                }
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(f1Var);
                f1Var.e = z22;
                f1Var.c = org.telegram.messenger.hs.x3;
                f1Var.setOutsideTouchable(z22);
                f1Var.setClippingEnabled(z22);
                f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                f1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                f1Var.setInputMethodMode(2);
                f1Var.setSoftInputMode(0);
                f1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
                int L = org.telegram.messenger.g0.L(7.0f) - rect.left;
                if (org.telegram.messenger.g0.Q1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L += iArr[0];
                }
                f1Var.showAtLocation(fragmentView, 51, L, (view.getBottom() - rect.top) - org.telegram.messenger.g0.L(1.0f));
                return f1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.q4 parentLayout3 = d2Var.getParentLayout();
            if (parentLayout3 == null) {
                q4Var = parentLayout;
                j12 = 0;
                i3 = 2;
            } else {
                j12 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i14 = -1;
                    int i21 = 0;
                    i3 = 2;
                    while (i21 < pulledDialogs2.size()) {
                        a9 a9Var5 = (a9) pulledDialogs2.get(i21);
                        if (a9Var5.e != null) {
                            q4Var2 = parentLayout;
                            if (r7.id != j11) {
                                int i22 = a9Var5.b;
                                if (i22 >= i14) {
                                    i14 = i22;
                                }
                                arrayList.add(a9Var5);
                            }
                        } else {
                            q4Var2 = parentLayout;
                        }
                        i21++;
                        parentLayout = q4Var2;
                    }
                } else {
                    i3 = 2;
                    i14 = -1;
                }
                q4Var = parentLayout;
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof m91)) {
                    a9 a9Var6 = new a9();
                    arrayList.add(a9Var6);
                    a9Var6.b = -1;
                    a9Var6.a = m91.class;
                    a9Var6.c = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10));
                } else {
                    a9 a9Var7 = new a9();
                    arrayList.add(a9Var7);
                    a9Var7.b = i14 + 1;
                    a9Var7.a = org.telegram.ui.uw.class;
                    a9 a9Var8 = new a9();
                    arrayList.add(a9Var8);
                    a9Var8.b = -1;
                    a9Var8.a = m91.class;
                    a9Var8.c = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10));
                }
                Collections.sort(arrayList, new org.telegram.messenger.tq(27));
            }
        }
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
