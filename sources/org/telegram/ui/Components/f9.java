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
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class f9 {
    public static void a(org.telegram.ui.rn rnVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = rnVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (e9 e9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && e9Var.f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = e9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        e9 e9Var2 = new e9();
        e9Var2.a = org.telegram.ui.rn.class;
        e9Var2.b = i10;
        e9Var2.f = j10;
        e9Var2.h = i12;
        e9Var2.g = i11;
        e9Var2.c = chat;
        e9Var2.d = user;
        e9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(e9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x048a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044c  */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 n2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        long j12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        long a2;
        Class<ProfileActivity> cls;
        TLRPC.User user2;
        int i10;
        int i11;
        List list;
        int i12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        long j13;
        int i13;
        int i14;
        ArrayList arrayList2;
        int i15;
        e9 e9Var;
        boolean z10;
        boolean z11;
        Drawable drawable;
        String str;
        ?? r82;
        int i16;
        org.telegram.ui.ActionBar.b5 parentLayout = n2Var.getParentLayout();
        Activity parentActivity = n2Var.getParentActivity();
        View fragmentView = n2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        if (j11 == 0 || ChatObject.isMonoForum(n2Var.getCurrentAccount(), j10)) {
            j12 = 0;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.b5 parentLayout2 = n2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i17 = 0;
                    while (i17 < size) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(i17);
                        if (n2Var2 instanceof org.telegram.ui.rn) {
                            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                            if (rnVar.N3 != 0) {
                                list = fragmentStack;
                                i12 = size;
                                b5Var2 = parentLayout;
                            } else if (rnVar.A9()) {
                                list = fragmentStack;
                                i12 = size;
                                b5Var2 = parentLayout;
                            } else {
                                chat = rnVar.e;
                                user2 = rnVar.i();
                                a2 = rnVar.a();
                                i10 = rnVar.qa;
                                i11 = rnVar.ra;
                                cls = org.telegram.ui.rn.class;
                                list = fragmentStack;
                                i12 = size;
                                j13 = a2;
                                if (j13 != j10 && (j10 != 0 || !UserObject.isUserSelf(user2))) {
                                    b5Var2 = parentLayout;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                            i14 = i13;
                                            if (((e9) arrayList.get(i13)).f == j13) {
                                                break;
                                            }
                                            i13 = i14 + 1;
                                        } else {
                                            e9 e9Var2 = new e9();
                                            e9Var2.a = cls;
                                            e9Var2.b = i17;
                                            e9Var2.c = chat;
                                            e9Var2.d = user2;
                                            e9Var2.f = j13;
                                            e9Var2.g = i10;
                                            e9Var2.h = i11;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(e9Var2);
                                            }
                                        }
                                    }
                                }
                                b5Var2 = parentLayout;
                            }
                        } else {
                            if (n2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) n2Var2;
                                chat = profileActivity.A2;
                                try {
                                    user = profileActivity.r2.user;
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
                                j13 = a2;
                                if (j13 != j10) {
                                    b5Var2 = parentLayout;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                        }
                                        i13 = i14 + 1;
                                    }
                                }
                                b5Var2 = parentLayout;
                            }
                            list = fragmentStack;
                            i12 = size;
                            b5Var2 = parentLayout;
                        }
                        i17++;
                        fragmentStack = list;
                        size = i12;
                        parentLayout = b5Var2;
                    }
                }
                b5Var = parentLayout;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        e9 e9Var3 = (e9) pulledDialogs.get(size2);
                        if (e9Var3.f != j10) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList.size()) {
                                    arrayList.add(e9Var3);
                                    break;
                                }
                                if (((e9) arrayList.get(i18)).f == e9Var3.f) {
                                    break;
                                }
                                i18++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new k9.a(20));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, c6Var);
                Rect rect = new Rect();
                n2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z12 = false;
                int i19 = 0;
                while (i19 < size3) {
                    boolean z13 = i19 == 0;
                    boolean z14 = i19 == size3 + (-1);
                    e9 e9Var4 = (e9) arrayList2.get(i19);
                    TLRPC.Chat chat2 = e9Var4.c;
                    TLRPC.User user3 = e9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = e9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    n9 n9Var = new n9(parentActivity);
                    boolean z15 = z12;
                    if (chat2 == null && user3 == null) {
                        n9Var.setRoundRadius(0);
                    } else {
                        n9Var.setRoundRadius((chat2 == null || !chat2.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
                    }
                    frameLayout.addView(n9Var, h7.z5.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    textView.setLines(1);
                    int i20 = size3;
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, h7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            n9Var.setImageDrawable(wf.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ac, c6Var), false));
                            i15 = i19;
                        } else if (tL_forumTopic.icon_emoji_id != j12) {
                            i15 = i19;
                            n9Var.setAnimatedEmojiDrawable(new k5(10, n2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i15 = i19;
                            n9Var.setImageDrawable(wf.c.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i15 = i19;
                        if (chat2 != null) {
                            y8Var.k(n2Var.getCurrentAccount(), chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                y8Var = r82;
                            }
                            n9Var.h(ImageLocation.getForChat(n2Var.getCurrentAccount(), chat2, 1), "50_50", y8Var, chat2);
                            textView.setText(chat2.title);
                        } else if (user3 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                            if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                drawable = y8Var;
                            }
                            if (e9Var4.a == org.telegram.ui.rn.class && UserObject.isUserSelf(user3)) {
                                str = LocaleController.getString(R.string.SavedMessages);
                                y8Var.g(1);
                                n9Var.setImageDrawable(y8Var);
                            } else if (UserObject.isReplyUser(user3)) {
                                str = LocaleController.getString(R.string.RepliesTitle);
                                y8Var.g(12);
                                n9Var.setImageDrawable(y8Var);
                            } else {
                                if (UserObject.isDeleted(user3)) {
                                    str = LocaleController.getString(R.string.HiddenName);
                                    y8Var.m(n2Var.getCurrentAccount(), user3);
                                    e9Var = e9Var4;
                                    n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user3, 1), "50_50", y8Var, user3);
                                } else {
                                    e9Var = e9Var4;
                                    String userName = UserObject.getUserName(user3);
                                    y8Var.m(n2Var.getCurrentAccount(), user3);
                                    n9Var.h(ImageLocation.getForUser(n2Var.getCurrentAccount(), user3, 1), "50_50", drawable, user3);
                                    str = userName;
                                }
                                textView.setText(str);
                                z11 = false;
                                z10 = true;
                                frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
                                org.telegram.ui.ActionBar.b5 b5Var3 = b5Var;
                                atomicReference = atomicReference2;
                                frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var3, tL_forumTopic, n2Var, 9));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                                if (!z11) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
                                    frameLayout2.setTag(R.id.fit_width_tag, 1);
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, h7.z5.n(-1, 8));
                                }
                                i19 = i15 + 1;
                                arrayList2 = arrayList3;
                                b5Var = b5Var3;
                                z12 = z10;
                                size3 = i20;
                            }
                            e9Var = e9Var4;
                            textView.setText(str);
                            z11 = false;
                            z10 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
                            org.telegram.ui.ActionBar.b5 b5Var32 = b5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var32, tL_forumTopic, n2Var, 9));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i19 = i15 + 1;
                            arrayList2 = arrayList3;
                            b5Var = b5Var32;
                            z12 = z10;
                            size3 = i20;
                        } else {
                            e9Var = e9Var4;
                            n9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                            n9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                            n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.MULTIPLY));
                            textView.setText(LocaleController.getString(R.string.AllChats));
                            z10 = z15;
                            z11 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
                            org.telegram.ui.ActionBar.b5 b5Var322 = b5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var322, tL_forumTopic, n2Var, 9));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i19 = i15 + 1;
                            arrayList2 = arrayList3;
                            b5Var = b5Var322;
                            z12 = z10;
                            size3 = i20;
                        }
                    }
                    e9Var = e9Var4;
                    z11 = false;
                    z10 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
                    org.telegram.ui.ActionBar.b5 b5Var3222 = b5Var;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new jh.b0(atomicReference, e9Var, b5Var3222, tL_forumTopic, n2Var, 9));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                    if (!z11) {
                    }
                    i19 = i15 + 1;
                    arrayList2 = arrayList3;
                    b5Var = b5Var3222;
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
            org.telegram.ui.ActionBar.b5 parentLayout3 = n2Var.getParentLayout();
            if (parentLayout3 == null) {
                j12 = 0;
            } else {
                j12 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i16 = -1;
                    for (int i21 = 0; i21 < pulledDialogs2.size(); i21++) {
                        e9 e9Var5 = (e9) pulledDialogs2.get(i21);
                        if (e9Var5.e != null && r5.id != j11) {
                            int i22 = e9Var5.b;
                            if (i22 >= i16) {
                                i16 = i22;
                            }
                            arrayList.add(e9Var5);
                        }
                    }
                } else {
                    i16 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof we1)) {
                    e9 e9Var6 = new e9();
                    arrayList.add(e9Var6);
                    e9Var6.b = -1;
                    e9Var6.a = we1.class;
                    e9Var6.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                } else {
                    e9 e9Var7 = new e9();
                    arrayList.add(e9Var7);
                    e9Var7.b = i16 + 1;
                    e9Var7.a = org.telegram.ui.gy.class;
                    e9 e9Var8 = new e9();
                    arrayList.add(e9Var8);
                    e9Var8.b = -1;
                    e9Var8.a = we1.class;
                    e9Var8.c = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                }
                Collections.sort(arrayList, new k9.a(21));
            }
        }
        b5Var = parentLayout;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
