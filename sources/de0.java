// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class de0 {
    public static void a(yv1 yv1Var, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        tk5 parentLayout;
        if ((chat == null && user == null) || (parentLayout = yv1Var.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (ce0 ce0Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ce0Var.e;
                if (tL_forumTopic2 != null && tL_forumTopic2.id == tL_forumTopic.id) {
                    return;
                }
            } else if (ce0Var.f == j) {
                return;
            }
        }
        ce0 ce0Var2 = new ce0();
        ce0Var2.a = yv1.class;
        ce0Var2.b = i;
        ce0Var2.f = j;
        ce0Var2.h = i3;
        ce0Var2.g = i2;
        ce0Var2.c = chat;
        ce0Var2.d = user;
        ce0Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(ce0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, bf0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m8 b(d dVar, View view, long j, long j2, ylb ylbVar) {
        long j3;
        int i;
        ArrayList arrayList;
        tk5 tk5Var;
        boolean z;
        int i2;
        boolean z2;
        TLRPC.Chat chat;
        TLRPC.User user;
        long a;
        Class cls;
        TLRPC.User user2;
        int i3;
        int i4;
        List list;
        tk5 tk5Var2;
        tk5 tk5Var3;
        long j4;
        int i5;
        int i6;
        ArrayList arrayList2;
        float f;
        int L;
        Class<yv1> cls2;
        boolean z3;
        Class<yv1> cls3;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z4;
        boolean z5;
        boolean z6;
        Drawable drawable;
        String str;
        ?? r8;
        int i7;
        tk5 parentLayout = dVar.getParentLayout();
        Activity parentActivity = dVar.getParentActivity();
        View fragmentView = dVar.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        Class<yv1> cls4 = yv1.class;
        boolean z7 = true;
        if (j2 == 0 || sd2.o0(dVar.getCurrentAccount(), j)) {
            j3 = 0;
            i = 2;
            arrayList = new ArrayList();
            tk5 parentLayout2 = dVar.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i8 = 0;
                    while (i8 < size) {
                        d dVar2 = (d) fragmentStack.get(i8);
                        if (dVar2 instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (yv1Var.g4 != 0) {
                                z2 = z7;
                                list = fragmentStack;
                                tk5Var2 = parentLayout;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = tk5Var2;
                                size = i5;
                                z7 = z2;
                            } else if (yv1Var.c8()) {
                                list = fragmentStack;
                                tk5Var2 = parentLayout;
                                z2 = z7;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = tk5Var2;
                                size = i5;
                                z7 = z2;
                            } else {
                                chat = yv1Var.e;
                                user2 = yv1Var.h();
                                a = yv1Var.a();
                                z2 = z7;
                                i3 = yv1Var.Ra;
                                i4 = yv1Var.Sa;
                                cls = cls4;
                                list = fragmentStack;
                                tk5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j || (j == 0 && m9c.D(user2))) {
                                    tk5Var2 = tk5Var3;
                                    i5 = size;
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = tk5Var2;
                                    size = i5;
                                    z7 = z2;
                                } else {
                                    tk5Var2 = tk5Var3;
                                    i5 = size;
                                    while (true) {
                                        if (i6 < arrayList.size()) {
                                            i6 = ((ce0) arrayList.get(i6)).f != j4 ? i6 + 1 : 0;
                                        } else {
                                            ce0 ce0Var = new ce0();
                                            ce0Var.a = cls;
                                            ce0Var.b = i8;
                                            ce0Var.c = chat;
                                            ce0Var.d = user2;
                                            ce0Var.f = j4;
                                            ce0Var.g = i3;
                                            ce0Var.h = i4;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(ce0Var);
                                            }
                                        }
                                    }
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = tk5Var2;
                                    size = i5;
                                    z7 = z2;
                                }
                            }
                        } else {
                            z2 = z7;
                            if (dVar2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) dVar2;
                                chat = profileActivity.F2;
                                try {
                                    user = profileActivity.w2.user;
                                } catch (Exception unused) {
                                    user = null;
                                }
                                a = profileActivity.a();
                                cls = ProfileActivity.class;
                                user2 = user;
                                i3 = 0;
                                i4 = 0;
                                list = fragmentStack;
                                tk5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j) {
                                }
                                tk5Var2 = tk5Var3;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = tk5Var2;
                                size = i5;
                                z7 = z2;
                            }
                            list = fragmentStack;
                            tk5Var2 = parentLayout;
                            i5 = size;
                            i8++;
                            fragmentStack = list;
                            parentLayout = tk5Var2;
                            size = i5;
                            z7 = z2;
                        }
                    }
                }
                tk5Var = parentLayout;
                z = z7;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        ce0 ce0Var2 = (ce0) pulledDialogs.get(size2);
                        if (ce0Var2.f != j) {
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    arrayList.add(ce0Var2);
                                    break;
                                }
                                i2 = ((ce0) arrayList.get(i2)).f != ce0Var2.f ? i2 + 1 : 0;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new sa((byte) 5));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, ylbVar, parentActivity);
                Rect rect = new Rect();
                dVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                anb.h(cmb.F8, ylbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z8 = false;
                int i9 = 0;
                while (i9 < size3) {
                    boolean z9 = i9 == 0 ? z : false;
                    boolean z10 = i9 == size3 + (-1) ? z : false;
                    ce0 ce0Var3 = (ce0) arrayList2.get(i9);
                    TLRPC.Chat chat2 = ce0Var3.c;
                    TLRPC.User user3 = ce0Var3.d;
                    TLRPC.TL_forumTopic tL_forumTopic2 = ce0Var3.e;
                    ArrayList arrayList3 = arrayList2;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    int i10 = size3;
                    frameLayout.setMinimumWidth(gm.L(200.0f));
                    ?? bf0Var = new bf0(parentActivity);
                    boolean z11 = z8;
                    if (chat2 != null) {
                        f = 16.0f;
                        if (chat2.forum) {
                            L = gm.L(8.0f);
                            bf0Var.setRoundRadius(L);
                            frameLayout.addView(bf0Var, qoe.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                            TextView textView = new TextView(parentActivity);
                            AtomicReference atomicReference2 = atomicReference;
                            boolean z12 = z;
                            textView.setLines(z12 ? 1 : 0);
                            int i11 = i9;
                            textView.setTextSize(z12 ? 1 : 0, f);
                            anb.X(textView, cmb.D8, ylbVar);
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            frameLayout.addView(textView, qoe.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                            pc0 pc0Var = new pc0((ylb) null);
                            pc0Var.p = 0.8f;
                            if (tL_forumTopic2 != null) {
                            }
                            z3 = z9;
                            cls3 = cls2;
                            z5 = false;
                            z6 = true;
                            tL_forumTopic = tL_forumTopic2;
                            z4 = true;
                            frameLayout.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), i, -1));
                            tk5 tk5Var4 = tk5Var;
                            boolean z13 = z4;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new oh(atomicReference, ce0Var3, tk5Var4, tL_forumTopic, dVar));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                            if (!z5) {
                            }
                            size3 = i10;
                            i9 = i11 + 1;
                            cls4 = cls3;
                            z8 = z6;
                            i = 2;
                            arrayList2 = arrayList3;
                            z = z13 ? 1 : 0;
                            tk5Var = tk5Var4;
                        }
                    } else if (user3 == null) {
                        f = 16.0f;
                        bf0Var.setRoundRadius(0);
                        frameLayout.addView(bf0Var, qoe.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(parentActivity);
                        AtomicReference atomicReference22 = atomicReference;
                        boolean z122 = z;
                        textView2.setLines(z122 ? 1 : 0);
                        int i112 = i9;
                        textView2.setTextSize(z122 ? 1 : 0, f);
                        anb.X(textView2, cmb.D8, ylbVar);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        frameLayout.addView(textView2, qoe.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                        pc0 pc0Var2 = new pc0((ylb) null);
                        pc0Var2.p = 0.8f;
                        if (tL_forumTopic2 != null) {
                            if (tL_forumTopic2.id == 1) {
                                bf0Var.setImageDrawable(no4.d(fragmentView.getContext(), 1.0f, cmb.v0(cmb.qd, ylbVar), false));
                                cls2 = cls4;
                            } else if (tL_forumTopic2.icon_emoji_id != j3) {
                                cls2 = cls4;
                                bf0Var.setAnimatedEmojiDrawable(new vm(10, dVar.getCurrentAccount(), tL_forumTopic2.icon_emoji_id));
                            } else {
                                cls2 = cls4;
                                bf0Var.setImageDrawable(no4.f(tL_forumTopic2));
                            }
                            textView2.setText(tL_forumTopic2.title);
                        } else {
                            cls2 = cls4;
                            if (chat2 != null) {
                                dVar.getCurrentAccount();
                                pc0Var2.p(chat2);
                                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                if (chatPhoto != null && (r8 = chatPhoto.strippedBitmap) != 0) {
                                    pc0Var2 = r8;
                                }
                                dVar.getCurrentAccount();
                                bf0Var.m(gn5.a(1, chat2), "50_50", pc0Var2, chat2);
                                textView2.setText(chat2.title);
                            } else {
                                if (user3 != null) {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                        drawable = pc0Var2;
                                    }
                                    z3 = z9;
                                    cls3 = cls2;
                                    if (ce0Var3.a == cls3 && m9c.D(user3)) {
                                        str = jb6.M0(2131745635, null);
                                        pc0Var2.f(1);
                                        bf0Var.setImageDrawable(pc0Var2);
                                    } else if (m9c.B(user3)) {
                                        str = jb6.M0(2131745999, null);
                                        pc0Var2.f(12);
                                        bf0Var.setImageDrawable(pc0Var2);
                                    } else {
                                        if (m9c.z(user3)) {
                                            str = jb6.M0(2131749085, null);
                                            dVar.getCurrentAccount();
                                            pc0Var2.q(user3);
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            bf0Var.m(gn5.l(dVar.getCurrentAccount(), 1, user3), "50_50", pc0Var2, user3);
                                        } else {
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            String r = m9c.r(user3);
                                            dVar.getCurrentAccount();
                                            pc0Var2.q(user3);
                                            bf0Var.m(gn5.l(dVar.getCurrentAccount(), 1, user3), "50_50", drawable, user3);
                                            str = r;
                                        }
                                        textView2.setText(str);
                                        z6 = z4;
                                        z5 = false;
                                    }
                                    tL_forumTopic = tL_forumTopic2;
                                    z4 = true;
                                    textView2.setText(str);
                                    z6 = z4;
                                    z5 = false;
                                } else {
                                    z3 = z9;
                                    cls3 = cls2;
                                    tL_forumTopic = tL_forumTopic2;
                                    z4 = true;
                                    bf0Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                    bf0Var.t(gm.L(24.0f), gm.L(24.0f));
                                    bf0Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.E8, ylbVar), PorterDuff.Mode.MULTIPLY));
                                    textView2.setText(jb6.M0(2131754266, null));
                                    z5 = true;
                                    z6 = z11;
                                }
                                frameLayout.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), i, -1));
                                tk5 tk5Var42 = tk5Var;
                                boolean z132 = z4;
                                atomicReference = atomicReference22;
                                frameLayout.setOnClickListener(new oh(atomicReference, ce0Var3, tk5Var42, tL_forumTopic, dVar));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                                if (!z5) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    anb.h(cmb.G8, ylbVar, frameLayout2);
                                    frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z132 ? 1 : 0));
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, qoe.o(-1, 8));
                                }
                                size3 = i10;
                                i9 = i112 + 1;
                                cls4 = cls3;
                                z8 = z6;
                                i = 2;
                                arrayList2 = arrayList3;
                                z = z132 ? 1 : 0;
                                tk5Var = tk5Var42;
                            }
                        }
                        z3 = z9;
                        cls3 = cls2;
                        z5 = false;
                        z6 = true;
                        tL_forumTopic = tL_forumTopic2;
                        z4 = true;
                        frameLayout.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), i, -1));
                        tk5 tk5Var422 = tk5Var;
                        boolean z1322 = z4;
                        atomicReference = atomicReference22;
                        frameLayout.setOnClickListener(new oh(atomicReference, ce0Var3, tk5Var422, tL_forumTopic, dVar));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                        if (!z5) {
                        }
                        size3 = i10;
                        i9 = i112 + 1;
                        cls4 = cls3;
                        z8 = z6;
                        i = 2;
                        arrayList2 = arrayList3;
                        z = z1322 ? 1 : 0;
                        tk5Var = tk5Var422;
                    } else {
                        f = 16.0f;
                    }
                    L = gm.L(f);
                    bf0Var.setRoundRadius(L);
                    frameLayout.addView(bf0Var, qoe.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView22 = new TextView(parentActivity);
                    AtomicReference atomicReference222 = atomicReference;
                    boolean z1222 = z;
                    textView22.setLines(z1222 ? 1 : 0);
                    int i1122 = i9;
                    textView22.setTextSize(z1222 ? 1 : 0, f);
                    anb.X(textView22, cmb.D8, ylbVar);
                    textView22.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView22, qoe.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    pc0 pc0Var22 = new pc0((ylb) null);
                    pc0Var22.p = 0.8f;
                    if (tL_forumTopic2 != null) {
                    }
                    z3 = z9;
                    cls3 = cls2;
                    z5 = false;
                    z6 = true;
                    tL_forumTopic = tL_forumTopic2;
                    z4 = true;
                    frameLayout.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), i, -1));
                    tk5 tk5Var4222 = tk5Var;
                    boolean z13222 = z4;
                    atomicReference = atomicReference222;
                    frameLayout.setOnClickListener(new oh(atomicReference, ce0Var3, tk5Var4222, tL_forumTopic, dVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                    if (!z5) {
                    }
                    size3 = i10;
                    i9 = i1122 + 1;
                    cls4 = cls3;
                    z8 = z6;
                    i = 2;
                    arrayList2 = arrayList3;
                    z = z13222 ? 1 : 0;
                    tk5Var = tk5Var4222;
                }
                boolean z14 = z;
                if (!z8) {
                    return null;
                }
                m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(m8Var);
                m8Var.e = z14;
                m8Var.c = (short) 220;
                m8Var.setOutsideTouchable(z14);
                m8Var.setClippingEnabled(z14);
                m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                m8Var.setFocusable(z14);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                m8Var.setInputMethodMode(2);
                m8Var.setSoftInputMode(0);
                m8Var.getContentView().setFocusableInTouchMode(z14);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z14);
                int L2 = gm.L(7.0f) - rect.left;
                if (gm.O1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L2 += iArr[0];
                }
                m8Var.showAtLocation(fragmentView, 51, L2, (view.getBottom() - rect.top) - gm.L(1.0f));
                return m8Var;
            }
        } else {
            arrayList = new ArrayList();
            tk5 parentLayout3 = dVar.getParentLayout();
            j3 = 0;
            if (parentLayout3 == null) {
                i = 2;
            } else {
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i7 = -1;
                    i = 2;
                    for (int i12 = 0; i12 < pulledDialogs2.size(); i12++) {
                        ce0 ce0Var4 = (ce0) pulledDialogs2.get(i12);
                        if (ce0Var4.e != null && r5.id != j2) {
                            int i13 = ce0Var4.b;
                            if (i13 >= i7) {
                                i7 = i13;
                            }
                            arrayList.add(ce0Var4);
                        }
                    }
                } else {
                    i = 2;
                    i7 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof sxb)) {
                    ce0 ce0Var5 = new ce0();
                    arrayList.add(ce0Var5);
                    ce0Var5.b = -1;
                    ce0Var5.a = sxb.class;
                    ce0Var5.c = oc7.r1(dVar.getCurrentAccount()).L0(Long.valueOf(-j));
                } else {
                    ce0 ce0Var6 = new ce0();
                    arrayList.add(ce0Var6);
                    ce0Var6.b = i7 + 1;
                    ce0Var6.a = nk3.class;
                    ce0 ce0Var7 = new ce0();
                    arrayList.add(ce0Var7);
                    ce0Var7.b = -1;
                    ce0Var7.a = sxb.class;
                    ce0Var7.c = oc7.r1(dVar.getCurrentAccount()).L0(Long.valueOf(-j));
                }
                Collections.sort(arrayList, new sa((byte) 6));
            }
        }
        tk5Var = parentLayout;
        z = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
