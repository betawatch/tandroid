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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class q9 {
    public static void a(org.telegram.ui.zn znVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = znVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (p9 p9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && p9Var.f == j3) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = p9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        p9 p9Var2 = new p9();
        p9Var2.a = org.telegram.ui.zn.class;
        p9Var2.b = i10;
        p9Var2.f = j3;
        p9Var2.h = i12;
        p9Var2.g = i11;
        p9Var2.c = chat;
        p9Var2.d = user;
        p9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(p9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x048f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.y9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 n2Var, View view, long j3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.d5 d5Var;
        long j11;
        int i10;
        ArrayList arrayList;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        Class<ProfileActivity> cls;
        long j12;
        int i11;
        boolean z11;
        int i12;
        List list;
        int i13;
        ArrayList arrayList2;
        float f7;
        int i14;
        p9 p9Var;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable drawable;
        String str;
        ?? r82;
        int i15;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 parentLayout = n2Var.getParentLayout();
        Activity parentActivity = n2Var.getParentActivity();
        View fragmentView = n2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        boolean z15 = true;
        if (j10 == 0 || ChatObject.isMonoForum(n2Var.getCurrentAccount(), j3)) {
            d5Var = parentLayout;
            j11 = 0;
            i10 = 2;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.d5 parentLayout2 = n2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i16 = 0;
                    while (i16 < size) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(i16);
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var2;
                            if (znVar.R3 == 0 && !znVar.F9()) {
                                chat = znVar.e;
                                user = znVar.i();
                                j12 = znVar.a();
                                z11 = z15;
                                i12 = znVar.ua;
                                i11 = znVar.va;
                                cls = org.telegram.ui.zn.class;
                                if (j12 != j3 || (j3 == 0 && UserObject.isUserSelf(user))) {
                                    list = fragmentStack;
                                    i13 = size;
                                } else {
                                    list = fragmentStack;
                                    i13 = size;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < arrayList.size()) {
                                            int i18 = i17;
                                            if (((p9) arrayList.get(i17)).f == j12) {
                                                break;
                                            }
                                            i17 = i18 + 1;
                                        } else {
                                            p9 p9Var2 = new p9();
                                            p9Var2.a = cls;
                                            p9Var2.b = i16;
                                            p9Var2.c = chat;
                                            p9Var2.d = user;
                                            p9Var2.f = j12;
                                            p9Var2.g = i12;
                                            p9Var2.h = i11;
                                            if (chat != null || user != null) {
                                                arrayList.add(p9Var2);
                                            }
                                        }
                                    }
                                }
                            }
                            list = fragmentStack;
                            i13 = size;
                            z11 = z15;
                        } else {
                            if (n2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) n2Var2;
                                chat = profileActivity.E2;
                                try {
                                    user = profileActivity.v2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                long a2 = profileActivity.a();
                                cls = ProfileActivity.class;
                                j12 = a2;
                                i11 = 0;
                                z11 = z15;
                                i12 = 0;
                                if (j12 != j3) {
                                }
                                list = fragmentStack;
                                i13 = size;
                            }
                            list = fragmentStack;
                            i13 = size;
                            z11 = z15;
                        }
                        i16++;
                        fragmentStack = list;
                        size = i13;
                        z15 = z11;
                    }
                }
                z10 = z15;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        p9 p9Var3 = (p9) pulledDialogs.get(size2);
                        if (p9Var3.f != j3) {
                            int i19 = 0;
                            while (true) {
                                if (i19 >= arrayList.size()) {
                                    arrayList.add(p9Var3);
                                    break;
                                }
                                if (((p9) arrayList.get(i19)).f == p9Var3.f) {
                                    break;
                                }
                                i19++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.gf(6));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, e6Var);
                Rect rect = new Rect();
                n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var));
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i20 = 0;
                while (i20 < size3) {
                    boolean z17 = i20 == 0 ? z10 : false;
                    boolean z18 = i20 == size3 + (-1) ? z10 : false;
                    p9 p9Var4 = (p9) arrayList2.get(i20);
                    TLRPC.Chat chat2 = p9Var4.c;
                    TLRPC.User user2 = p9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = p9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    ?? y9Var = new y9(parentActivity);
                    boolean z19 = z16;
                    if (chat2 == null && user2 == null) {
                        f7 = 16.0f;
                        y9Var.setRoundRadius(0);
                    } else {
                        f7 = 16.0f;
                        y9Var.setRoundRadius((chat2 == null || !chat2.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
                    }
                    frameLayout.addView(y9Var, w7.x5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i21 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f7);
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, e6Var));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
                    j9Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            y9Var.setImageDrawable(ng.d.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ac, e6Var), false));
                            i14 = i20;
                        } else if (tL_forumTopic.icon_emoji_id != j11) {
                            i14 = i20;
                            y9Var.setAnimatedEmojiDrawable(new s5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i14 = i20;
                            y9Var.setImageDrawable(ng.d.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i14 = i20;
                        if (chat2 != null) {
                            j9Var.k(n2Var.getCurrentAccount(), chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                j9Var = r82;
                            }
                            y9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", j9Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = j9Var;
                                }
                                if (p9Var4.a == org.telegram.ui.zn.class && UserObject.isUserSelf(user2)) {
                                    str = LocaleController.getString(R.string.SavedMessages);
                                    j9Var.g(1);
                                    y9Var.setImageDrawable(j9Var);
                                } else if (UserObject.isReplyUser(user2)) {
                                    str = LocaleController.getString(R.string.RepliesTitle);
                                    j9Var.g(12);
                                    y9Var.setImageDrawable(j9Var);
                                } else {
                                    if (UserObject.isDeleted(user2)) {
                                        str = LocaleController.getString(R.string.HiddenName);
                                        j9Var.m(n2Var.getCurrentAccount(), user2);
                                        p9Var = p9Var4;
                                        z12 = true;
                                        y9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", j9Var, user2);
                                    } else {
                                        p9Var = p9Var4;
                                        String userName = UserObject.getUserName(user2);
                                        j9Var.m(n2Var.getCurrentAccount(), user2);
                                        z12 = true;
                                        y9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", drawable, user2);
                                        str = userName;
                                    }
                                    textView.setText(str);
                                    z13 = z12;
                                    z14 = false;
                                }
                                p9Var = p9Var4;
                                z12 = true;
                                textView.setText(str);
                                z13 = z12;
                                z14 = false;
                            } else {
                                p9Var = p9Var4;
                                z12 = true;
                                y9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                y9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                                y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(LocaleController.getString(R.string.AllChats));
                                z13 = z19;
                                z14 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), i10, -1));
                            boolean z21 = z12;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ai.s0(atomicReference, p9Var, d5Var, tL_forumTopic, n2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.p(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z14) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H8, e6Var));
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.x5.n(-1, 8));
                            }
                            i20 = i14 + 1;
                            arrayList2 = arrayList3;
                            z16 = z13;
                            size3 = i21;
                            i10 = 2;
                            z10 = z21 ? 1 : 0;
                        }
                    }
                    p9Var = p9Var4;
                    z14 = false;
                    z12 = true;
                    z13 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), i10, -1));
                    boolean z212 = z12;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new ai.s0(atomicReference, p9Var, d5Var, tL_forumTopic, n2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.p(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                    if (!z14) {
                    }
                    i20 = i14 + 1;
                    arrayList2 = arrayList3;
                    z16 = z13;
                    size3 = i21;
                    i10 = 2;
                    z10 = z212 ? 1 : 0;
                }
                boolean z22 = z10;
                if (!z16) {
                    return null;
                }
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(n1Var);
                n1Var.e = z22;
                n1Var.c = 220;
                n1Var.setOutsideTouchable(z22);
                n1Var.setClippingEnabled(z22);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                n1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
                int dp = AndroidUtilities.dp(7.0f) - rect.left;
                if (AndroidUtilities.isTablet()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    dp += iArr[0];
                }
                n1Var.showAtLocation(fragmentView, 51, dp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
                return n1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.d5 parentLayout3 = n2Var.getParentLayout();
            if (parentLayout3 == null) {
                d5Var = parentLayout;
                j11 = 0;
                i10 = 2;
            } else {
                j11 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i15 = -1;
                    int i22 = 0;
                    i10 = 2;
                    while (i22 < pulledDialogs2.size()) {
                        p9 p9Var5 = (p9) pulledDialogs2.get(i22);
                        if (p9Var5.e != null) {
                            d5Var2 = parentLayout;
                            if (r7.id != j10) {
                                int i23 = p9Var5.b;
                                if (i23 >= i15) {
                                    i15 = i23;
                                }
                                arrayList.add(p9Var5);
                            }
                        } else {
                            d5Var2 = parentLayout;
                        }
                        i22++;
                        parentLayout = d5Var2;
                    }
                } else {
                    i10 = 2;
                    i15 = -1;
                }
                d5Var = parentLayout;
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof fg1)) {
                    p9 p9Var6 = new p9();
                    arrayList.add(p9Var6);
                    p9Var6.b = -1;
                    p9Var6.a = fg1.class;
                    p9Var6.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                } else {
                    p9 p9Var7 = new p9();
                    arrayList.add(p9Var7);
                    p9Var7.b = i15 + 1;
                    p9Var7.a = org.telegram.ui.ty.class;
                    p9 p9Var8 = new p9();
                    arrayList.add(p9Var8);
                    p9Var8.b = -1;
                    p9Var8.a = fg1.class;
                    p9Var8.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                }
                Collections.sort(arrayList, new org.telegram.ui.gf(7));
            }
        }
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
