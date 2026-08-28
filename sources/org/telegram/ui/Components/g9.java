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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class g9 {
    public static void a(org.telegram.ui.qn qnVar, int i9, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10, int i11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || (parentLayout = qnVar.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (f9 f9Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && f9Var.f == j10) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = f9Var.e) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        f9 f9Var2 = new f9();
        f9Var2.a = org.telegram.ui.qn.class;
        f9Var2.b = i9;
        f9Var2.f = j10;
        f9Var2.h = i11;
        f9Var2.g = i10;
        f9Var2.c = chat;
        f9Var2.d = user;
        f9Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(f9Var2);
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
    public static org.telegram.ui.ActionBar.o1 b(org.telegram.ui.ActionBar.o2 o2Var, View view, long j10, long j11, org.telegram.ui.ActionBar.b6 b6Var) {
        long j12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        long a2;
        Class<ProfileActivity> cls;
        TLRPC.User user2;
        int i9;
        int i10;
        List list;
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var2;
        long j13;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        f9 f9Var;
        boolean z10;
        boolean z11;
        Drawable drawable;
        String str;
        ?? r82;
        int i15;
        org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
        Activity parentActivity = o2Var.getParentActivity();
        View fragmentView = o2Var.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        if (j11 == 0 || ChatObject.isMonoForum(o2Var.getCurrentAccount(), j10)) {
            j12 = 0;
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.b5 parentLayout2 = o2Var.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i16 = 0;
                    while (i16 < size) {
                        org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(i16);
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (qnVar.N3 != 0) {
                                list = fragmentStack;
                                i11 = size;
                                b5Var2 = parentLayout;
                            } else if (qnVar.A9()) {
                                list = fragmentStack;
                                i11 = size;
                                b5Var2 = parentLayout;
                            } else {
                                chat = qnVar.e;
                                user2 = qnVar.i();
                                a2 = qnVar.a();
                                i9 = qnVar.qa;
                                i10 = qnVar.ra;
                                cls = org.telegram.ui.qn.class;
                                list = fragmentStack;
                                i11 = size;
                                j13 = a2;
                                if (j13 != j10 && (j10 != 0 || !UserObject.isUserSelf(user2))) {
                                    b5Var2 = parentLayout;
                                    i12 = 0;
                                    while (true) {
                                        if (i12 >= arrayList.size()) {
                                            i13 = i12;
                                            if (((f9) arrayList.get(i12)).f == j13) {
                                                break;
                                            }
                                            i12 = i13 + 1;
                                        } else {
                                            f9 f9Var2 = new f9();
                                            f9Var2.a = cls;
                                            f9Var2.b = i16;
                                            f9Var2.c = chat;
                                            f9Var2.d = user2;
                                            f9Var2.f = j13;
                                            f9Var2.g = i9;
                                            f9Var2.h = i10;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(f9Var2);
                                            }
                                        }
                                    }
                                }
                                b5Var2 = parentLayout;
                            }
                        } else {
                            if (o2Var2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) o2Var2;
                                chat = profileActivity.A2;
                                try {
                                    user = profileActivity.r2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                a2 = profileActivity.a();
                                cls = ProfileActivity.class;
                                user2 = user;
                                i9 = 0;
                                i10 = 0;
                                list = fragmentStack;
                                i11 = size;
                                j13 = a2;
                                if (j13 != j10) {
                                    b5Var2 = parentLayout;
                                    i12 = 0;
                                    while (true) {
                                        if (i12 >= arrayList.size()) {
                                        }
                                        i12 = i13 + 1;
                                    }
                                }
                                b5Var2 = parentLayout;
                            }
                            list = fragmentStack;
                            i11 = size;
                            b5Var2 = parentLayout;
                        }
                        i16++;
                        fragmentStack = list;
                        size = i11;
                        parentLayout = b5Var2;
                    }
                }
                b5Var = parentLayout;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        f9 f9Var3 = (f9) pulledDialogs.get(size2);
                        if (f9Var3.f != j10) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList.size()) {
                                    arrayList.add(f9Var3);
                                    break;
                                }
                                if (((f9) arrayList.get(i17)).f == f9Var3.f) {
                                    break;
                                }
                                i17++;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new j9.a(22));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, parentActivity, b6Var);
                Rect rect = new Rect();
                o2Var.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z12 = false;
                int i18 = 0;
                while (i18 < size3) {
                    boolean z13 = i18 == 0;
                    boolean z14 = i18 == size3 + (-1);
                    f9 f9Var4 = (f9) arrayList2.get(i18);
                    TLRPC.Chat chat2 = f9Var4.c;
                    TLRPC.User user3 = f9Var4.d;
                    TLRPC.TL_forumTopic tL_forumTopic = f9Var4.e;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    ArrayList arrayList3 = arrayList2;
                    frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    o9 o9Var = new o9(parentActivity);
                    boolean z15 = z12;
                    if (chat2 == null && user3 == null) {
                        o9Var.setRoundRadius(0);
                    } else {
                        o9Var.setRoundRadius((chat2 == null || !chat2.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
                    }
                    frameLayout.addView(o9Var, g7.e6.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView = new TextView(parentActivity);
                    AtomicReference atomicReference2 = atomicReference;
                    textView.setLines(1);
                    int i19 = size3;
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView, g7.e6.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var.p = 0.8f;
                    if (tL_forumTopic != null) {
                        if (tL_forumTopic.id == 1) {
                            o9Var.setImageDrawable(vf.c.c(fragmentView.getContext(), 1.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ac, b6Var), false));
                            i14 = i18;
                        } else if (tL_forumTopic.icon_emoji_id != j12) {
                            i14 = i18;
                            o9Var.setAnimatedEmojiDrawable(new k5(10, o2Var.getCurrentAccount(), tL_forumTopic.icon_emoji_id));
                        } else {
                            i14 = i18;
                            o9Var.setImageDrawable(vf.c.e(tL_forumTopic));
                        }
                        textView.setText(tL_forumTopic.title);
                    } else {
                        i14 = i18;
                        if (chat2 != null) {
                            z8Var.k(o2Var.getCurrentAccount(), chat2);
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            if (chatPhoto != null && (r82 = chatPhoto.strippedBitmap) != 0) {
                                z8Var = r82;
                            }
                            o9Var.h(ImageLocation.getForChat(o2Var.getCurrentAccount(), chat2, 1), "50_50", z8Var, chat2);
                            textView.setText(chat2.title);
                        } else if (user3 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                            if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                drawable = z8Var;
                            }
                            if (f9Var4.a == org.telegram.ui.qn.class && UserObject.isUserSelf(user3)) {
                                str = LocaleController.getString(R.string.SavedMessages);
                                z8Var.g(1);
                                o9Var.setImageDrawable(z8Var);
                            } else if (UserObject.isReplyUser(user3)) {
                                str = LocaleController.getString(R.string.RepliesTitle);
                                z8Var.g(12);
                                o9Var.setImageDrawable(z8Var);
                            } else {
                                if (UserObject.isDeleted(user3)) {
                                    str = LocaleController.getString(R.string.HiddenName);
                                    z8Var.m(o2Var.getCurrentAccount(), user3);
                                    f9Var = f9Var4;
                                    o9Var.h(ImageLocation.getForUser(o2Var.getCurrentAccount(), user3, 1), "50_50", z8Var, user3);
                                } else {
                                    f9Var = f9Var4;
                                    String userName = UserObject.getUserName(user3);
                                    z8Var.m(o2Var.getCurrentAccount(), user3);
                                    o9Var.h(ImageLocation.getForUser(o2Var.getCurrentAccount(), user3, 1), "50_50", drawable, user3);
                                    str = userName;
                                }
                                textView.setText(str);
                                z11 = false;
                                z10 = true;
                                frameLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1));
                                org.telegram.ui.ActionBar.b5 b5Var3 = b5Var;
                                atomicReference = atomicReference2;
                                frameLayout.setOnClickListener(new ih.d0(atomicReference, f9Var, b5Var3, tL_forumTopic, o2Var, 9));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                                if (!z11) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H8, b6Var));
                                    frameLayout2.setTag(R.id.fit_width_tag, 1);
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, g7.e6.n(-1, 8));
                                }
                                i18 = i14 + 1;
                                arrayList2 = arrayList3;
                                b5Var = b5Var3;
                                z12 = z10;
                                size3 = i19;
                            }
                            f9Var = f9Var4;
                            textView.setText(str);
                            z11 = false;
                            z10 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1));
                            org.telegram.ui.ActionBar.b5 b5Var32 = b5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ih.d0(atomicReference, f9Var, b5Var32, tL_forumTopic, o2Var, 9));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i18 = i14 + 1;
                            arrayList2 = arrayList3;
                            b5Var = b5Var32;
                            z12 = z10;
                            size3 = i19;
                        } else {
                            f9Var = f9Var4;
                            o9Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                            o9Var.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                            o9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var), PorterDuff.Mode.MULTIPLY));
                            textView.setText(LocaleController.getString(R.string.AllChats));
                            z10 = z15;
                            z11 = true;
                            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1));
                            org.telegram.ui.ActionBar.b5 b5Var322 = b5Var;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ih.d0(atomicReference, f9Var, b5Var322, tL_forumTopic, o2Var, 9));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                            if (!z11) {
                            }
                            i18 = i14 + 1;
                            arrayList2 = arrayList3;
                            b5Var = b5Var322;
                            z12 = z10;
                            size3 = i19;
                        }
                    }
                    f9Var = f9Var4;
                    z11 = false;
                    z10 = true;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1));
                    org.telegram.ui.ActionBar.b5 b5Var3222 = b5Var;
                    atomicReference = atomicReference2;
                    frameLayout.setOnClickListener(new ih.d0(atomicReference, f9Var, b5Var3222, tL_forumTopic, o2Var, 9));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, g7.e6.p(-1, 44, 0.0f, 0, 0, !z13 ? 3 : 0, 0, !z14 ? 3 : 0));
                    if (!z11) {
                    }
                    i18 = i14 + 1;
                    arrayList2 = arrayList3;
                    b5Var = b5Var3222;
                    z12 = z10;
                    size3 = i19;
                }
                if (!z12) {
                    return null;
                }
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(o1Var);
                o1Var.e = true;
                o1Var.c = 220;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                o1Var.setInputMethodMode(2);
                o1Var.setSoftInputMode(0);
                o1Var.getContentView().setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                int dp = AndroidUtilities.dp(7.0f) - rect.left;
                if (AndroidUtilities.isTablet()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    dp += iArr[0];
                }
                o1Var.showAtLocation(fragmentView, 51, dp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
                return o1Var;
            }
        } else {
            arrayList = new ArrayList();
            org.telegram.ui.ActionBar.b5 parentLayout3 = o2Var.getParentLayout();
            if (parentLayout3 == null) {
                j12 = 0;
            } else {
                j12 = 0;
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i15 = -1;
                    for (int i20 = 0; i20 < pulledDialogs2.size(); i20++) {
                        f9 f9Var5 = (f9) pulledDialogs2.get(i20);
                        if (f9Var5.e != null && r5.id != j11) {
                            int i21 = f9Var5.b;
                            if (i21 >= i15) {
                                i15 = i21;
                            }
                            arrayList.add(f9Var5);
                        }
                    }
                } else {
                    i15 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof we1)) {
                    f9 f9Var6 = new f9();
                    arrayList.add(f9Var6);
                    f9Var6.b = -1;
                    f9Var6.a = we1.class;
                    f9Var6.c = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                } else {
                    f9 f9Var7 = new f9();
                    arrayList.add(f9Var7);
                    f9Var7.b = i15 + 1;
                    f9Var7.a = org.telegram.ui.dy.class;
                    f9 f9Var8 = new f9();
                    arrayList.add(f9Var8);
                    f9Var8.b = -1;
                    f9Var8.a = we1.class;
                    f9Var8.c = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                }
                Collections.sort(arrayList, new j9.a(23));
            }
        }
        b5Var = parentLayout;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
