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
import org.telegram.ui.dg1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class o9 {
    public static void a(org.telegram.ui.zn znVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = znVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (n9 n9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && n9Var.f == j3) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = n9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        n9 n9Var2 = new n9();
        n9Var2.a = org.telegram.ui.zn.class;
        n9Var2.b = i10;
        n9Var2.f = j3;
        n9Var2.h = i12;
        n9Var2.g = i11;
        n9Var2.c = chat;
        n9Var2.d = user;
        n9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(n9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044a  */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 n2Var, View view, long j3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        long j11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.d5 d5Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        long a2;
        Class<ProfileActivity> cls;
        TLRPC.User user2;
        int i10;
        int i11;
        List list;
        int i12;
        org.telegram.ui.ActionBar.d5 d5Var2;
        long j12;
        int i13;
        int i14;
        ArrayList arrayList2;
        int i15;
        n9 n9Var;
        boolean z10;
        boolean z11;
        Drawable drawable;
        String str;
        ?? r82;
        int i16;
        org.telegram.ui.ActionBar.d5 parentLayout = n2Var.getParentLayout();
        Activity parentActivity = n2Var.getParentActivity();
        View fragmentView = n2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        if (j10 == 0 || ChatObject.isMonoForum(n2Var.getCurrentAccount(), j3)) {
            j11 = 0;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.d5 parentLayout2 = n2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i17 = 0;
                    while (i17 < size) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(i17);
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var2;
                            if (znVar.R3 != 0) {
                                list = fragmentStack;
                                i12 = size;
                                d5Var2 = parentLayout;
                            } else if (znVar.A9()) {
                                list = fragmentStack;
                                i12 = size;
                                d5Var2 = parentLayout;
                            } else {
                                chat = znVar.e;
                                user2 = znVar.i();
                                a2 = znVar.a();
                                i10 = znVar.ua;
                                i11 = znVar.va;
                                cls = org.telegram.ui.zn.class;
                                list = fragmentStack;
                                i12 = size;
                                j12 = a2;
                                if (j12 != j3 && (j3 != 0 || !UserObject.isUserSelf(user2))) {
                                    d5Var2 = parentLayout;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                            i14 = i13;
                                            if (((n9) arrayList.get(i13)).f == j12) {
                                                break;
                                            }
                                            i13 = i14 + 1;
                                        } else {
                                            n9 n9Var2 = new n9();
                                            n9Var2.a = cls;
                                            n9Var2.b = i17;
                                            n9Var2.c = chat;
                                            n9Var2.d = user2;
                                            n9Var2.f = j12;
                                            n9Var2.g = i10;
                                            n9Var2.h = i11;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(n9Var2);
                                            }
                                        }
                                    }
                                }
                                d5Var2 = parentLayout;
                            }
                        } else {
                            if (n2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) n2Var2;
                                chat = profileActivity.E2;
                                try {
                                    user = profileActivity.v2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                a2 = profileActivity.a();
                                cls = ProfileActivity.class;
                                user2 = user;
                                i10 = 0;
                                i11 = 0;
                                list = fragmentStack;
                                i12 = size;
                                j12 = a2;
                                if (j12 != j3) {
                                    d5Var2 = parentLayout;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                        }
                                        i13 = i14 + 1;
                                    }
                                }
                                d5Var2 = parentLayout;
                            }
                            list = fragmentStack;
                            i12 = size;
                            d5Var2 = parentLayout;
                        }
                        i17++;
                        fragmentStack = list;
                        size = i12;
                        parentLayout = d5Var2;
                    }
                }
                d5Var = parentLayout;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        n9 n9Var3 = (n9) pulledDialogs.get(size2);
                        if (n9Var3.f != j3) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(n9Var3);
                                    break;
                                }
                                if (((n9) arrayList.get(i18)).f == n9Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new org.telegram.ui.df(6));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, e6Var);
                Rect rect = new Rect();
                n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, e6Var));
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z12 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z13 = i19 == 0;
                    boolean z14 = i19 == size3 + (-1);
                    n9 n9Var4 = (n9) arrayList2.get(i19);
                    TLRPC.Chat chat2 = n9Var4.c;
                    TLRPC.User user3 = n9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = n9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    w9 w9Var = new w9(parentActivity);
                    boolean z15 = z12;
                    if (chat2 == null && user3 == null) {
                        w9Var.setRoundRadius(0);
                    } else {
                        w9Var.setRoundRadius((chat2 == null || !chat2.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
                    }
                    frameLayout.addView(w9Var, w7.y5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    textView.setLines(1);
                    int i20 = size3;
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, w7.y5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
                    h9Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            w9Var.setImageDrawable(ng.d.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ac, e6Var), false));
                            i15 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j11) {
                            i15 = i19;
                            w9Var.setAnimatedEmojiDrawable(new q5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i15 = i19;
                            w9Var.setImageDrawable(ng.d.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i15 = i19;
                        if (chat2 != null) {
                            h9Var.k(n2Var.getCurrentAccount(), chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                h9Var = r82;
                            }
                            w9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", h9Var, chat2);
                            textView.setText(chat2.title);
                        } else if (user3 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                            if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                drawable = h9Var;
                            }
                            if (n9Var4.a == org.telegram.ui.zn.class && UserObject.isUserSelf(user3)) {
                                str = LocaleController.getString(R.string.SavedMessages);
                                h9Var.g(1);
                                w9Var.setImageDrawable(h9Var);
                            } else if (UserObject.isReplyUser(user3)) {
                                str = LocaleController.getString(R.string.RepliesTitle);
                                h9Var.g(12);
                                w9Var.setImageDrawable(h9Var);
                            } else {
                                if (UserObject.isDeleted(user3)) {
                                    str = LocaleController.getString(R.string.HiddenName);
                                    h9Var.m(n2Var.getCurrentAccount(), user3);
                                    n9Var = n9Var4;
                                    w9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user3, 1), "50_50", h9Var, user3);
                                } else {
                                    n9Var = n9Var4;
                                    String userName = UserObject.getUserName(user3);
                                    h9Var.m(n2Var.getCurrentAccount(), user3);
                                    w9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user3, 1), "50_50", drawable, user3);
                                    str = userName;
                                }
                                textView.setText(str);
                                z11 = false;
                                z10 = true;
                                frameLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 2, -1));
                                org.telegram.ui.ActionBar.d5 d5Var3 = d5Var;
                                atomicReference = atomicReference2;
                                frameLayout.setOnClickListener(new ai.s0(atomicReference, n9Var, d5Var3, tL_forumTopic, n2Var, 10));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                                if (!z11) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, e6Var));
                                    frameLayout2.setTag(R.id.fit_width_tag, 1);
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.y5.n(-1, 8));
                                }
                                i19 = i15 + 1;
                                arrayList2 = arrayList3;
                                d5Var = d5Var3;
                                z12 = z10;
                                size3 = i20;
                            }
                            n9Var = n9Var4;
                            textView.setText(str);
                            z11 = false;
                            z10 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 2, -1));
                            org.telegram.ui.ActionBar.d5 d5Var32 = d5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ai.s0(atomicReference, n9Var, d5Var32, tL_forumTopic, n2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i19 = i15 + 1;
                            arrayList2 = arrayList3;
                            d5Var = d5Var32;
                            z12 = z10;
                            size3 = i20;
                        } else {
                            n9Var = n9Var4;
                            w9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                            w9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var), PorterDuff.Mode.MULTIPLY));
                            textView.setText(LocaleController.getString(R.string.AllChats));
                            z10 = z15;
                            z11 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 2, -1));
                            org.telegram.ui.ActionBar.d5 d5Var322 = d5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ai.s0(atomicReference, n9Var, d5Var322, tL_forumTopic, n2Var, 10));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i19 = i15 + 1;
                            arrayList2 = arrayList3;
                            d5Var = d5Var322;
                            z12 = z10;
                            size3 = i20;
                        }
                    }
                    n9Var = n9Var4;
                    z11 = false;
                    z10 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 2, -1));
                    org.telegram.ui.ActionBar.d5 d5Var3222 = d5Var;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new ai.s0(atomicReference, n9Var, d5Var3222, tL_forumTopic, n2Var, 10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                    if (!z11) {
                    }
                    i19 = i15 + 1;
                    arrayList2 = arrayList3;
                    d5Var = d5Var3222;
                    z12 = z10;
                    size3 = i20;
                }
                if (!z12) {
                    return null;
                }
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(n1Var);
                n1Var.e = true;
                n1Var.c = 220;
                n1Var.setOutsideTouchable(true);
                n1Var.setClippingEnabled(true);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                n1Var.getContentView().setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
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
                j11 = 0;
            } else {
                j11 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i16 = -1;
                    for (int i21 = 0; i21 < pulledDialogs2.size(); i21++) {
                        n9 n9Var5 = (n9) pulledDialogs2.get(i21);
                        if (n9Var5.e != null && r5.id != j10) {
                            int i22 = n9Var5.b;
                            if (i22 >= i16) {
                                i16 = i22;
                            }
                            arrayList.add(n9Var5);
                        }
                    }
                } else {
                    i16 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof dg1)) {
                    n9 n9Var6 = new n9();
                    arrayList.add(n9Var6);
                    n9Var6.b = -1;
                    n9Var6.a = dg1.class;
                    n9Var6.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                } else {
                    n9 n9Var7 = new n9();
                    arrayList.add(n9Var7);
                    n9Var7.b = i16 + 1;
                    n9Var7.a = org.telegram.ui.uy.class;
                    n9 n9Var8 = new n9();
                    arrayList.add(n9Var8);
                    n9Var8.b = -1;
                    n9Var8.a = dg1.class;
                    n9Var8.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                }
                Collections.sort(arrayList, new org.telegram.ui.df(7));
            }
        }
        d5Var = parentLayout;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
