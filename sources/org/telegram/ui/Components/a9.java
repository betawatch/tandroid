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
import org.telegram.ui.u91;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class a9 {
    public static void a(org.telegram.ui.an anVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.o4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = anVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (z8 z8Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && z8Var.f == j3) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = z8Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        z8 z8Var2 = new z8();
        z8Var2.a = org.telegram.ui.an.class;
        z8Var2.b = i7;
        z8Var2.f = j3;
        z8Var2.h = i11;
        z8Var2.g = i10;
        z8Var2.c = chat;
        z8Var2.d = user;
        z8Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(z8Var2);
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
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.i9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.g1 b(org.telegram.ui.ActionBar.e2 e2Var, View view, long j3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.o4 o4Var;
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
        z8 z8Var;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        String str;
        ?? r82;
        int i14;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 parentLayout = e2Var.getParentLayout();
        Activity parentActivity = e2Var.getParentActivity();
        View fragmentView = e2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        boolean z15 = true;
        if (j10 == 0 || org.telegram.messenger.t3.o0(e2Var.getCurrentAccount(), j3)) {
            o4Var = parentLayout;
            j11 = 0;
            i7 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.o4 parentLayout2 = e2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i15 = 0;
                    while (i15 < size) {
                        org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) fragmentStack.get(i15);
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (anVar.g4 == 0 && !anVar.Y9()) {
                                chat = anVar.e;
                                user = anVar.j();
                                j12 = anVar.a();
                                z11 = z15;
                                i11 = anVar.Qa;
                                i10 = anVar.Ra;
                                cls = org.telegram.ui.an.class;
                                if (j12 != j3 || (j3 == 0 && org.telegram.messenger.q10.B(user))) {
                                    list = fragmentStack;
                                    i12 = size;
                                } else {
                                    list = fragmentStack;
                                    i12 = size;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < arrayList.size()) {
                                            int i17 = i16;
                                            if (((z8) arrayList.get(i16)).f == j12) {
                                                break;
                                            }
                                            i16 = i17 + 1;
                                        } else {
                                            z8 z8Var2 = new z8();
                                            z8Var2.a = cls;
                                            z8Var2.b = i15;
                                            z8Var2.c = chat;
                                            z8Var2.d = user;
                                            z8Var2.f = j12;
                                            z8Var2.g = i11;
                                            z8Var2.h = i10;
                                            if (chat != null || user != null) {
                                                arrayList.add(z8Var2);
                                            }
                                        }
                                    }
                                }
                            }
                            list = fragmentStack;
                            i12 = size;
                            z11 = z15;
                        } else {
                            if (e2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) e2Var2;
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
                        z8 z8Var3 = (z8) pulledDialogs.get(size2);
                        if (z8Var3.f != j3) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(z8Var3);
                                    break;
                                }
                                if (((z8) arrayList.get(i18)).f == z8Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.me(5));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, e6Var);
                Rect rect = new Rect();
                e2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z17 = i19 == 0 ? z10 : false;
                    boolean z18 = i19 == size3 + (-1) ? z10 : false;
                    z8 z8Var4 = (z8) arrayList2.get(i19);
                    TLRPC.Chat chat2 = z8Var4.c;
                    TLRPC.User user2 = z8Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = z8Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                    ?? i9Var = new i9(parentActivity);
                    boolean z19 = z16;
                    if (chat2 == null && user2 == null) {
                        f10 = 16.0f;
                        i9Var.setRoundRadius(0);
                    } else {
                        f10 = 16.0f;
                        i9Var.setRoundRadius((chat2 == null || !chat2.forum) ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f));
                    }
                    frameLayout.addView(i9Var, c8.ja.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i20 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f10);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, e6Var);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, c8.ja.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
                    t8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            i9Var.setImageDrawable(qg.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.rd, e6Var), false));
                            i13 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j11) {
                            i13 = i19;
                            i9Var.setAnimatedEmojiDrawable(new g5(10, e2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i13 = i19;
                            i9Var.setImageDrawable(qg.c.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i13 = i19;
                        if (chat2 != null) {
                            e2Var.getCurrentAccount();
                            t8Var.q(chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                t8Var = r82;
                            }
                            e2Var.getCurrentAccount();
                            i9Var.j(org.telegram.messenger.gc.a(1, chat2), "50_50", t8Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = t8Var;
                                }
                                if (z8Var4.a == org.telegram.ui.an.class && org.telegram.messenger.q10.B(user2)) {
                                    str = org.telegram.messenger.hd.M0(2131745901, null);
                                    t8Var.g(1);
                                    i9Var.setImageDrawable(t8Var);
                                } else if (org.telegram.messenger.q10.z(user2)) {
                                    str = org.telegram.messenger.hd.M0(2131746266, null);
                                    t8Var.g(12);
                                    i9Var.setImageDrawable(t8Var);
                                } else {
                                    if (org.telegram.messenger.q10.x(user2)) {
                                        str = org.telegram.messenger.hd.M0(2131749328, null);
                                        e2Var.getCurrentAccount();
                                        t8Var.r(user2);
                                        z8Var = z8Var4;
                                        z12 = true;
                                        i9Var.j(org.telegram.messenger.gc.l(e2Var.getCurrentAccount(), 1, user2), "50_50", t8Var, user2);
                                    } else {
                                        z8Var = z8Var4;
                                        z12 = true;
                                        String p10 = org.telegram.messenger.q10.p(user2);
                                        e2Var.getCurrentAccount();
                                        t8Var.r(user2);
                                        i9Var.j(org.telegram.messenger.gc.l(e2Var.getCurrentAccount(), 1, user2), "50_50", drawable, user2);
                                        str = p10;
                                    }
                                    textView.setText(str);
                                    z13 = z12;
                                    z14 = false;
                                }
                                z8Var = z8Var4;
                                z12 = true;
                                textView.setText(str);
                                z13 = z12;
                                z14 = false;
                            } else {
                                z8Var = z8Var4;
                                z12 = true;
                                i9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                i9Var.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                i9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, e6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(org.telegram.messenger.hd.M0(2131754301, null));
                                z13 = z19;
                                z14 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var), i7, -1));
                            boolean z21 = z12;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new fi.d0(atomicReference, z8Var, o4Var, tL_forumTopic, e2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ja.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z14) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.H8, frameLayout2, e6Var);
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, c8.ja.o(-1, 8));
                            }
                            i19 = i13 + 1;
                            arrayList2 = arrayList3;
                            z16 = z13;
                            size3 = i20;
                            i7 = 2;
                            z10 = z21 ? 1 : 0;
                        }
                    }
                    z8Var = z8Var4;
                    z14 = false;
                    z12 = true;
                    z13 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var), i7, -1));
                    boolean z212 = z12;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new fi.d0(atomicReference, z8Var, o4Var, tL_forumTopic, e2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ja.q(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
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
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(g1Var);
                g1Var.e = z22;
                g1Var.c = org.telegram.messenger.ns.x3;
                g1Var.setOutsideTouchable(z22);
                g1Var.setClippingEnabled(z22);
                g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                g1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
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
            org.telegram.ui.ActionBar.o4 parentLayout3 = e2Var.getParentLayout();
            if (parentLayout3 == null) {
                o4Var = parentLayout;
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
                        z8 z8Var5 = (z8) pulledDialogs2.get(i21);
                        if (z8Var5.e != null) {
                            o4Var2 = parentLayout;
                            if (r7.id != j10) {
                                int i22 = z8Var5.b;
                                if (i22 >= i14) {
                                    i14 = i22;
                                }
                                arrayList.add(z8Var5);
                            }
                        } else {
                            o4Var2 = parentLayout;
                        }
                        i21++;
                        parentLayout = o4Var2;
                    }
                } else {
                    i7 = 2;
                    i14 = -1;
                }
                o4Var = parentLayout;
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof u91)) {
                    z8 z8Var6 = new z8();
                    arrayList.add(z8Var6);
                    z8Var6.b = -1;
                    z8Var6.a = u91.class;
                    z8Var6.c = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                } else {
                    z8 z8Var7 = new z8();
                    arrayList.add(z8Var7);
                    z8Var7.b = i14 + 1;
                    z8Var7.a = org.telegram.ui.yw.class;
                    z8 z8Var8 = new z8();
                    arrayList.add(z8Var8);
                    z8Var8.b = -1;
                    z8Var8.a = u91.class;
                    z8Var8.c = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                }
                Collections.sort(arrayList, new org.telegram.ui.me(6));
            }
        }
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
