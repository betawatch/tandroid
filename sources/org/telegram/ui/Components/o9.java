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
import org.telegram.ui.te1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class o9 {
    public static void a(org.telegram.ui.sn snVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = snVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (n9 n9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && n9Var.f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = n9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        n9 n9Var2 = new n9();
        n9Var2.a = org.telegram.ui.sn.class;
        n9Var2.b = i10;
        n9Var2.f = j10;
        n9Var2.h = i12;
        n9Var2.g = i11;
        n9Var2.c = chat;
        n9Var2.d = user;
        n9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(n9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.m1 b(org.telegram.ui.ActionBar.n2 n2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.d5 d5Var;
        long j12;
        int i10;
        ArrayList arrayList;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        Class<ProfileActivity> cls;
        long j13;
        int i11;
        boolean z11;
        int i12;
        List list;
        int i13;
        ArrayList arrayList2;
        float f7;
        int i14;
        n9 n9Var;
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
        if (j11 == 0 || ChatObject.isMonoForum(n2Var.getCurrentAccount(), j10)) {
            d5Var = parentLayout;
            j12 = 0;
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
                        if (n2Var2 instanceof org.telegram.ui.sn) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var2;
                            if (snVar.R3 == 0 && !snVar.F9()) {
                                chat = snVar.e;
                                user = snVar.i();
                                j13 = snVar.a();
                                z11 = z15;
                                i12 = snVar.ua;
                                i11 = snVar.va;
                                cls = org.telegram.ui.sn.class;
                                if (j13 != j10 || (j10 == 0 && UserObject.isUserSelf(user))) {
                                    list = fragmentStack;
                                    i13 = size;
                                } else {
                                    list = fragmentStack;
                                    i13 = size;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < arrayList.size()) {
                                            int i18 = i17;
                                            if (((n9) arrayList.get(i17)).f == j13) {
                                                break;
                                            }
                                            i17 = i18 + 1;
                                        } else {
                                            n9 n9Var2 = new n9();
                                            n9Var2.a = cls;
                                            n9Var2.b = i16;
                                            n9Var2.c = chat;
                                            n9Var2.d = user;
                                            n9Var2.f = j13;
                                            n9Var2.g = i12;
                                            n9Var2.h = i11;
                                            if (chat != null || user != null) {
                                                arrayList.add(n9Var2);
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
                                chat = profileActivity.F2;
                                try {
                                    user = profileActivity.w2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                long a2 = profileActivity.a();
                                cls = ProfileActivity.class;
                                j13 = a2;
                                i11 = 0;
                                z11 = z15;
                                i12 = 0;
                                if (j13 != j10) {
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
                        n9 n9Var3 = (n9) pulledDialogs.get(size2);
                        if (n9Var3.f != j10) {
                            int i19 = 0;
                            while (true) {
                                if (i19 >= arrayList.size()) {
                                    arrayList.add(n9Var3);
                                    break;
                                }
                                if (((n9) arrayList.get(i19)).f == n9Var3.f) {
                                    break;
                                }
                                i19++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(13));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, d6Var);
                Rect rect = new Rect();
                n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z16 = false;
                int i20 = 0;
                while (i20 < size3) {
                    boolean z17 = i20 == 0 ? z10 : false;
                    boolean z18 = i20 == size3 + (-1) ? z10 : false;
                    n9 n9Var4 = (n9) arrayList2.get(i20);
                    TLRPC.Chat chat2 = n9Var4.c;
                    TLRPC.User user2 = n9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = n9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    ?? w9Var = new w9(parentActivity);
                    boolean z19 = z16;
                    if (chat2 == null && user2 == null) {
                        f7 = 16.0f;
                        w9Var.setRoundRadius(0);
                    } else {
                        f7 = 16.0f;
                        w9Var.setRoundRadius((chat2 == null || !chat2.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
                    }
                    frameLayout.addView(w9Var, w7.z5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    boolean z20 = z10;
                    textView.setLines(z20 ? 1 : 0);
                    int i21 = size3;
                    textView.setTextSize(z20 ? 1 : 0, f7);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, w7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            w9Var.setImageDrawable(og.d.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ac, d6Var), false));
                            i14 = i20;
                        } else if (tL_forumTopic.icon_emoji_id != j12) {
                            i14 = i20;
                            w9Var.setAnimatedEmojiDrawable(new r5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i14 = i20;
                            w9Var.setImageDrawable(og.d.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i14 = i20;
                        if (chat2 != null) {
                            h9Var.k(n2Var.getCurrentAccount(), chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                h9Var = r82;
                            }
                            w9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", h9Var, chat2);
                            textView.setText(chat2.title);
                        } else {
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                    drawable = h9Var;
                                }
                                if (n9Var4.a == org.telegram.ui.sn.class && UserObject.isUserSelf(user2)) {
                                    str = LocaleController.getString(R.string.SavedMessages);
                                    h9Var.g(1);
                                    w9Var.setImageDrawable(h9Var);
                                } else if (UserObject.isReplyUser(user2)) {
                                    str = LocaleController.getString(R.string.RepliesTitle);
                                    h9Var.g(12);
                                    w9Var.setImageDrawable(h9Var);
                                } else {
                                    if (UserObject.isDeleted(user2)) {
                                        str = LocaleController.getString(R.string.HiddenName);
                                        h9Var.m(n2Var.getCurrentAccount(), user2);
                                        n9Var = n9Var4;
                                        z12 = true;
                                        w9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", h9Var, user2);
                                    } else {
                                        n9Var = n9Var4;
                                        String userName = UserObject.getUserName(user2);
                                        h9Var.m(n2Var.getCurrentAccount(), user2);
                                        z12 = true;
                                        w9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user2, 1), "50_50", drawable, user2);
                                        str = userName;
                                    }
                                    textView.setText(str);
                                    z13 = z12;
                                    z14 = false;
                                }
                                n9Var = n9Var4;
                                z12 = true;
                                textView.setText(str);
                                z13 = z12;
                                z14 = false;
                            } else {
                                n9Var = n9Var4;
                                z12 = true;
                                w9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                w9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                                w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.MULTIPLY));
                                textView.setText(LocaleController.getString(R.string.AllChats));
                                z13 = z19;
                                z14 = true;
                            }
                            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), i10, -1));
                            boolean z21 = z12;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ci.e0(atomicReference, n9Var, d5Var, tL_forumTopic, n2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.p(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
                            if (!z14) {
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, d6Var));
                                frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z21 ? 1 : 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.z5.n(-1, 8));
                            }
                            i20 = i14 + 1;
                            arrayList2 = arrayList3;
                            z16 = z13;
                            size3 = i21;
                            i10 = 2;
                            z10 = z21 ? 1 : 0;
                        }
                    }
                    n9Var = n9Var4;
                    z14 = false;
                    z12 = true;
                    z13 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), i10, -1));
                    boolean z212 = z12;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new ci.e0(atomicReference, n9Var, d5Var, tL_forumTopic, n2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.p(-1, 44, 0.0f, 0, 0, !z17 ? 3 : 0, 0, !z18 ? 3 : 0));
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
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(m1Var);
                m1Var.e = z22;
                m1Var.c = 220;
                m1Var.setOutsideTouchable(z22);
                m1Var.setClippingEnabled(z22);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                m1Var.getContentView().setFocusableInTouchMode(z22);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z22);
                int dp = AndroidUtilities.dp(7.0f) - rect.left;
                if (AndroidUtilities.isTablet()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    dp += iArr[0];
                }
                m1Var.showAtLocation(fragmentView, 51, dp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
                return m1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.d5 parentLayout3 = n2Var.getParentLayout();
            if (parentLayout3 == null) {
                d5Var = parentLayout;
                j12 = 0;
                i10 = 2;
            } else {
                j12 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i15 = -1;
                    int i22 = 0;
                    i10 = 2;
                    while (i22 < pulledDialogs2.size()) {
                        n9 n9Var5 = (n9) pulledDialogs2.get(i22);
                        if (n9Var5.e != null) {
                            d5Var2 = parentLayout;
                            if (r7.id != j11) {
                                int i23 = n9Var5.b;
                                if (i23 >= i15) {
                                    i15 = i23;
                                }
                                arrayList.add(n9Var5);
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
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof te1)) {
                    n9 n9Var6 = new n9();
                    arrayList.add(n9Var6);
                    n9Var6.b = -1;
                    n9Var6.a = te1.class;
                    n9Var6.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                } else {
                    n9 n9Var7 = new n9();
                    arrayList.add(n9Var7);
                    n9Var7.b = i15 + 1;
                    n9Var7.a = org.telegram.ui.ey.class;
                    n9 n9Var8 = new n9();
                    arrayList.add(n9Var8);
                    n9Var8.b = -1;
                    n9Var8.a = te1.class;
                    n9Var8.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                }
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(14));
            }
        }
        z10 = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
