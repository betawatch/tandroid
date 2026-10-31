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
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class y8 {
    public static void a(org.telegram.ui.un unVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.z4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = unVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (x8 x8Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && x8Var.f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = x8Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        x8 x8Var2 = new x8();
        x8Var2.a = org.telegram.ui.un.class;
        x8Var2.b = i10;
        x8Var2.f = j10;
        x8Var2.h = i12;
        x8Var2.g = i11;
        x8Var2.c = chat;
        x8Var2.d = user;
        x8Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(x8Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0452  */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.g9] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.k1 b(org.telegram.ui.ActionBar.k2 k2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.p6 p6Var) {
        long j12;
        int i10;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.z4 z4Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        TLRPC.User user;
        long a2;
        Class cls;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.z4 z4Var2;
        List list;
        int i13;
        org.telegram.ui.ActionBar.z4 z4Var3;
        long j13;
        ArrayList arrayList2;
        float f7;
        int i14;
        Class<org.telegram.ui.un> cls2;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        String str;
        ?? r82;
        int i15;
        org.telegram.ui.ActionBar.z4 parentLayout = k2Var.getParentLayout();
        Activity parentActivity = k2Var.getParentActivity();
        View fragmentView = k2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        Class<org.telegram.ui.un> cls3 = org.telegram.ui.un.class;
        boolean z15 = true;
        if (j11 == 0 || org.telegram.messenger.w3.o0(k2Var.getCurrentAccount(), j10)) {
            j12 = 0;
            i10 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.z4 parentLayout2 = k2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i16 = 0;
                    while (i16 < size) {
                        org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) fragmentStack.get(i16);
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (unVar.f4 != 0) {
                                z11 = z15;
                                z4Var2 = parentLayout;
                                list = fragmentStack;
                                i13 = size;
                            } else if (unVar.M9()) {
                                z4Var2 = parentLayout;
                                list = fragmentStack;
                                i13 = size;
                                z11 = z15;
                            } else {
                                chat = unVar.e;
                                TLRPC.User j14 = unVar.j();
                                a2 = unVar.a();
                                z11 = z15;
                                i11 = unVar.Na;
                                i12 = unVar.Oa;
                                user = j14;
                                cls = cls3;
                                z4Var3 = parentLayout;
                                list = fragmentStack;
                                j13 = a2;
                                if (j13 != j10 || (j10 == 0 && org.telegram.messenger.h20.B(user))) {
                                    z4Var2 = z4Var3;
                                    i13 = size;
                                } else {
                                    z4Var2 = z4Var3;
                                    i13 = size;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < arrayList.size()) {
                                            int i18 = i17;
                                            if (((x8) arrayList.get(i17)).f == j13) {
                                                break;
                                            }
                                            i17 = i18 + 1;
                                        } else {
                                            x8 x8Var = new x8();
                                            x8Var.a = cls;
                                            x8Var.b = i16;
                                            x8Var.c = chat;
                                            x8Var.d = user;
                                            x8Var.f = j13;
                                            x8Var.g = i11;
                                            x8Var.h = i12;
                                            if (chat != null || user != null) {
                                                arrayList.add(x8Var);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z11 = z15;
                            if (k2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) k2Var2;
                                chat = profileActivity.D2;
                                try {
                                    user = profileActivity.u2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                a2 = profileActivity.a();
                                cls = ProfileActivity.class;
                                i11 = 0;
                                i12 = 0;
                                z4Var3 = parentLayout;
                                list = fragmentStack;
                                j13 = a2;
                                if (j13 != j10) {
                                }
                                z4Var2 = z4Var3;
                                i13 = size;
                            }
                            z4Var2 = parentLayout;
                            list = fragmentStack;
                            i13 = size;
                        }
                        i16++;
                        fragmentStack = list;
                        parentLayout = z4Var2;
                        size = i13;
                        z15 = z11;
                    }
                }
                z4Var = parentLayout;
                z10 = z15;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        x8 x8Var2 = (x8) pulledDialogs.get(size2);
                        if (x8Var2.f != j10) {
                            int i19 = 0;
                            while (true) {
                                if (i19 >= arrayList.size()) {
                                    arrayList.add(x8Var2);
                                    break;
                                }
                                if (((x8) arrayList.get(i19)).f == x8Var2.f) {
                                    break;
                                }
                                i19++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.f6(8));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, p6Var);
                Rect rect = new Rect();
                k2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, p6Var);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i20 = 0;
                while (i20 < size3) {
                    boolean z17 = i20 == 0 ? z10 : false;
                    boolean z18 = i20 == size3 + (-1) ? z10 : false;
                    x8 x8Var3 = (x8) arrayList2.get(i20);
                    TLRPC.Chat chat2 = x8Var3.c;
                    TLRPC.User user2 = x8Var3.d;
                    TLRPC.TL_forumTopic tL_forumTopic = x8Var3.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                    ?? g9Var = new g9(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    if (chat2 == null && user2 == null) {
                        f7 = 16.0f;
                        g9Var.setRoundRadius(0);
                    } else {
                        f7 = 16.0f;
                        g9Var.setRoundRadius((chat2 == null || !chat2.forum) ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f));
                    }
                    frameLayout.addView(g9Var, w7.b6.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    boolean z19 = z16;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i21 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f7);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, p6Var);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, w7.b6.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            g9Var.setImageDrawable(gg.e.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.od, p6Var), false));
                            i14 = i20;
                        } else if (tL_forumTopic.icon_emoji_id != j12) {
                            i14 = i20;
                            g9Var.setAnimatedEmojiDrawable(new f5(10, k2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i14 = i20;
                            g9Var.setImageDrawable(gg.e.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i14 = i20;
                        if (chat2 != null) {
                            k2Var.getCurrentAccount();
                            r8Var.q(chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                r8Var = r82;
                            }
                            k2Var.getCurrentAccount();
                            g9Var.j(org.telegram.messenger.ic.a(1, chat2), "50_50", r8Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = r8Var;
                                }
                                if (x8Var3.a == cls3 && org.telegram.messenger.h20.B(user2)) {
                                    str = org.telegram.messenger.cd.L0(2131745918, null);
                                    r8Var.g(1);
                                    g9Var.setImageDrawable(r8Var);
                                } else if (org.telegram.messenger.h20.z(user2)) {
                                    str = org.telegram.messenger.cd.L0(2131746281, null);
                                    r8Var.g(12);
                                    g9Var.setImageDrawable(r8Var);
                                } else {
                                    if (org.telegram.messenger.h20.x(user2)) {
                                        str = org.telegram.messenger.cd.L0(2131749337, null);
                                        k2Var.getCurrentAccount();
                                        r8Var.r(user2);
                                        cls2 = cls3;
                                        z12 = true;
                                        g9Var.j(org.telegram.messenger.ic.l(k2Var.getCurrentAccount(), 1, user2), "50_50", r8Var, user2);
                                    } else {
                                        cls2 = cls3;
                                        z12 = true;
                                        String p5 = org.telegram.messenger.h20.p(user2);
                                        k2Var.getCurrentAccount();
                                        r8Var.r(user2);
                                        g9Var.j(org.telegram.messenger.ic.l(k2Var.getCurrentAccount(), 1, user2), "50_50", drawable, user2);
                                        str = p5;
                                    }
                                    textView.setText(str);
                                    z14 = z12;
                                    z13 = false;
                                }
                                cls2 = cls3;
                                z12 = true;
                                textView.setText(str);
                                z14 = z12;
                                z13 = false;
                            } else {
                                cls2 = cls3;
                                z12 = true;
                                g9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                g9Var.u(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                                g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, p6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(org.telegram.messenger.cd.L0(2131754301, null));
                                z13 = true;
                                z14 = z19;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), i10, -1));
                            boolean z21 = z12;
                            int i22 = i10;
                            org.telegram.ui.ActionBar.z4 z4Var4 = z4Var;
                            frameLayout.setOnClickListener(new bi.c(atomicReference2, x8Var3, z4Var4, tL_forumTopic, k2Var, 6));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.b6.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z13) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.H8, frameLayout2, p6Var);
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.b6.o(-1, 8));
                            }
                            atomicReference = atomicReference2;
                            z4Var = z4Var4;
                            i10 = i22;
                            z16 = z14;
                            size3 = i21;
                            cls3 = cls2;
                            z10 = z21 ? 1 : 0;
                            i20 = i14 + 1;
                            arrayList2 = arrayList3;
                        }
                    }
                    cls2 = cls3;
                    z13 = false;
                    z12 = true;
                    z14 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), i10, -1));
                    boolean z212 = z12;
                    int i222 = i10;
                    org.telegram.ui.ActionBar.z4 z4Var42 = z4Var;
                    frameLayout.setOnClickListener(new bi.c(atomicReference2, x8Var3, z4Var42, tL_forumTopic, k2Var, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.b6.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                    if (!z13) {
                    }
                    atomicReference = atomicReference2;
                    z4Var = z4Var42;
                    i10 = i222;
                    z16 = z14;
                    size3 = i21;
                    cls3 = cls2;
                    z10 = z212 ? 1 : 0;
                    i20 = i14 + 1;
                    arrayList2 = arrayList3;
                }
                AtomicReference atomicReference3 = atomicReference;
                int i23 = i10;
                boolean z22 = z10;
                if (!z16) {
                    return null;
                }
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference3.set(k1Var);
                k1Var.e = z22;
                k1Var.c = org.telegram.messenger.zs.x3;
                k1Var.setOutsideTouchable(z22);
                k1Var.setClippingEnabled(z22);
                k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                k1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                k1Var.setInputMethodMode(i23);
                k1Var.setSoftInputMode(0);
                k1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
                int L = org.telegram.messenger.i0.L(7.0f) - rect.left;
                if (org.telegram.messenger.i0.Q1()) {
                    int[] iArr = new int[i23];
                    fragmentView.getLocationInWindow(iArr);
                    L += iArr[0];
                }
                k1Var.showAtLocation(fragmentView, 51, L, (view.getBottom() - rect.top) - org.telegram.messenger.i0.L(1.0f));
                return k1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.z4 parentLayout3 = k2Var.getParentLayout();
            if (parentLayout3 == null) {
                j12 = 0;
                i10 = 2;
            } else {
                j12 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i15 = -1;
                    i10 = 2;
                    for (int i24 = 0; i24 < pulledDialogs2.size(); i24++) {
                        x8 x8Var4 = (x8) pulledDialogs2.get(i24);
                        if (x8Var4.e != null && r8.id != j11) {
                            int i25 = x8Var4.b;
                            if (i25 >= i15) {
                                i15 = i25;
                            }
                            arrayList.add(x8Var4);
                        }
                    }
                } else {
                    i10 = 2;
                    i15 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof pb1)) {
                    x8 x8Var5 = new x8();
                    arrayList.add(x8Var5);
                    x8Var5.b = -1;
                    x8Var5.a = pb1.class;
                    x8Var5.c = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10));
                } else {
                    x8 x8Var6 = new x8();
                    arrayList.add(x8Var6);
                    x8Var6.b = i15 + 1;
                    x8Var6.a = org.telegram.ui.ay.class;
                    x8 x8Var7 = new x8();
                    arrayList.add(x8Var7);
                    x8Var7.b = -1;
                    x8Var7.a = pb1.class;
                    x8Var7.c = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10));
                }
                Collections.sort(arrayList, new org.telegram.ui.f6(9));
            }
        }
        z4Var = parentLayout;
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
