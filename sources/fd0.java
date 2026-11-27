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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class fd0 {
    public static void a(zu1 zu1Var, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        wk5 parentLayout;
        if ((chat == null && user == null) || (parentLayout = zu1Var.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (ed0 ed0Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ed0Var.e;
                if (tL_forumTopic2 != null && tL_forumTopic2.id == tL_forumTopic.id) {
                    return;
                }
            } else if (ed0Var.f == j) {
                return;
            }
        }
        ed0 ed0Var2 = new ed0();
        ed0Var2.a = zu1.class;
        ed0Var2.b = i;
        ed0Var2.f = j;
        ed0Var2.h = i3;
        ed0Var2.g = i2;
        ed0Var2.c = chat;
        ed0Var2.d = user;
        ed0Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(ed0Var2);
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
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, de0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n8 b(e eVar, View view, long j, long j2, vnb vnbVar) {
        long j3;
        int i;
        ArrayList arrayList;
        wk5 wk5Var;
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
        wk5 wk5Var2;
        wk5 wk5Var3;
        long j4;
        int i5;
        int i6;
        ArrayList arrayList2;
        float f;
        int L;
        Class<zu1> cls2;
        boolean z3;
        Class<zu1> cls3;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z4;
        boolean z5;
        boolean z6;
        Drawable drawable;
        String str;
        ?? r8;
        int i7;
        wk5 parentLayout = eVar.getParentLayout();
        Activity parentActivity = eVar.getParentActivity();
        View fragmentView = eVar.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        Class<zu1> cls4 = zu1.class;
        boolean z7 = true;
        if (j2 == 0 || xc2.o0(eVar.getCurrentAccount(), j)) {
            j3 = 0;
            i = 2;
            arrayList = new ArrayList();
            wk5 parentLayout2 = eVar.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i8 = 0;
                    while (i8 < size) {
                        e eVar2 = (e) fragmentStack.get(i8);
                        if (eVar2 instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (zu1Var.g4 != 0) {
                                z2 = z7;
                                list = fragmentStack;
                                wk5Var2 = parentLayout;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = wk5Var2;
                                size = i5;
                                z7 = z2;
                            } else if (zu1Var.c8()) {
                                list = fragmentStack;
                                wk5Var2 = parentLayout;
                                z2 = z7;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = wk5Var2;
                                size = i5;
                                z7 = z2;
                            } else {
                                chat = zu1Var.e;
                                user2 = zu1Var.h();
                                a = zu1Var.a();
                                z2 = z7;
                                i3 = zu1Var.Ra;
                                i4 = zu1Var.Sa;
                                cls = cls4;
                                list = fragmentStack;
                                wk5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j || (j == 0 && lbc.D(user2))) {
                                    wk5Var2 = wk5Var3;
                                    i5 = size;
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = wk5Var2;
                                    size = i5;
                                    z7 = z2;
                                } else {
                                    wk5Var2 = wk5Var3;
                                    i5 = size;
                                    while (true) {
                                        if (i6 < arrayList.size()) {
                                            i6 = ((ed0) arrayList.get(i6)).f != j4 ? i6 + 1 : 0;
                                        } else {
                                            ed0 ed0Var = new ed0();
                                            ed0Var.a = cls;
                                            ed0Var.b = i8;
                                            ed0Var.c = chat;
                                            ed0Var.d = user2;
                                            ed0Var.f = j4;
                                            ed0Var.g = i3;
                                            ed0Var.h = i4;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(ed0Var);
                                            }
                                        }
                                    }
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = wk5Var2;
                                    size = i5;
                                    z7 = z2;
                                }
                            }
                        } else {
                            z2 = z7;
                            if (eVar2 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) eVar2;
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
                                wk5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j) {
                                }
                                wk5Var2 = wk5Var3;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = wk5Var2;
                                size = i5;
                                z7 = z2;
                            }
                            list = fragmentStack;
                            wk5Var2 = parentLayout;
                            i5 = size;
                            i8++;
                            fragmentStack = list;
                            parentLayout = wk5Var2;
                            size = i5;
                            z7 = z2;
                        }
                    }
                }
                wk5Var = parentLayout;
                z = z7;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        ed0 ed0Var2 = (ed0) pulledDialogs.get(size2);
                        if (ed0Var2.f != j) {
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    arrayList.add(ed0Var2);
                                    break;
                                }
                                i2 = ((ed0) arrayList.get(i2)).f != ed0Var2.f ? i2 + 1 : 0;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new ta((byte) 5));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, vnbVar, parentActivity);
                Rect rect = new Rect();
                eVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                yob.h(aob.G8, vnbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z8 = false;
                int i9 = 0;
                while (i9 < size3) {
                    boolean z9 = i9 == 0 ? z : false;
                    boolean z10 = i9 == size3 + (-1) ? z : false;
                    ed0 ed0Var3 = (ed0) arrayList2.get(i9);
                    TLRPC.Chat chat2 = ed0Var3.c;
                    TLRPC.User user3 = ed0Var3.d;
                    TLRPC.TL_forumTopic tL_forumTopic2 = ed0Var3.e;
                    ArrayList arrayList3 = arrayList2;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    int i10 = size3;
                    frameLayout.setMinimumWidth(hl.L(200.0f));
                    ?? de0Var = new de0(parentActivity);
                    boolean z11 = z8;
                    if (chat2 != null) {
                        f = 16.0f;
                        if (chat2.forum) {
                            L = hl.L(8.0f);
                            de0Var.setRoundRadius(L);
                            frameLayout.addView(de0Var, tre.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                            TextView textView = new TextView(parentActivity);
                            AtomicReference atomicReference2 = atomicReference;
                            boolean z12 = z;
                            textView.setLines(z12 ? 1 : 0);
                            int i11 = i9;
                            textView.setTextSize(z12 ? 1 : 0, f);
                            yob.X(textView, aob.E8, vnbVar);
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            frameLayout.addView(textView, tre.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                            rb0 rb0Var = new rb0((vnb) null);
                            rb0Var.p = 0.8f;
                            if (tL_forumTopic2 != null) {
                            }
                            z3 = z9;
                            cls3 = cls2;
                            z5 = false;
                            z6 = true;
                            tL_forumTopic = tL_forumTopic2;
                            z4 = true;
                            frameLayout.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), i, -1));
                            wk5 wk5Var4 = wk5Var;
                            boolean z13 = z4;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new nh(atomicReference, ed0Var3, wk5Var4, tL_forumTopic, eVar));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                            if (!z5) {
                            }
                            size3 = i10;
                            i9 = i11 + 1;
                            cls4 = cls3;
                            z8 = z6;
                            i = 2;
                            arrayList2 = arrayList3;
                            z = z13 ? 1 : 0;
                            wk5Var = wk5Var4;
                        }
                    } else if (user3 == null) {
                        f = 16.0f;
                        de0Var.setRoundRadius(0);
                        frameLayout.addView(de0Var, tre.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(parentActivity);
                        AtomicReference atomicReference22 = atomicReference;
                        boolean z122 = z;
                        textView2.setLines(z122 ? 1 : 0);
                        int i112 = i9;
                        textView2.setTextSize(z122 ? 1 : 0, f);
                        yob.X(textView2, aob.E8, vnbVar);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        frameLayout.addView(textView2, tre.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                        rb0 rb0Var2 = new rb0((vnb) null);
                        rb0Var2.p = 0.8f;
                        if (tL_forumTopic2 != null) {
                            if (tL_forumTopic2.id == 1) {
                                de0Var.setImageDrawable(ro4.d(fragmentView.getContext(), 1.0f, aob.v0(aob.rd, vnbVar), false));
                                cls2 = cls4;
                            } else if (tL_forumTopic2.icon_emoji_id != j3) {
                                cls2 = cls4;
                                de0Var.setAnimatedEmojiDrawable(new wl(10, eVar.getCurrentAccount(), tL_forumTopic2.icon_emoji_id));
                            } else {
                                cls2 = cls4;
                                de0Var.setImageDrawable(ro4.f(tL_forumTopic2));
                            }
                            textView2.setText(tL_forumTopic2.title);
                        } else {
                            cls2 = cls4;
                            if (chat2 != null) {
                                eVar.getCurrentAccount();
                                rb0Var2.p(chat2);
                                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                if (chatPhoto != null && (r8 = chatPhoto.strippedBitmap) != 0) {
                                    rb0Var2 = r8;
                                }
                                eVar.getCurrentAccount();
                                de0Var.m(jn5.a(1, chat2), "50_50", rb0Var2, chat2);
                                textView2.setText(chat2.title);
                            } else {
                                if (user3 != null) {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                        drawable = rb0Var2;
                                    }
                                    z3 = z9;
                                    cls3 = cls2;
                                    if (ed0Var3.a == cls3 && lbc.D(user3)) {
                                        str = ob6.M0(2131745629, null);
                                        rb0Var2.f(1);
                                        de0Var.setImageDrawable(rb0Var2);
                                    } else if (lbc.B(user3)) {
                                        str = ob6.M0(2131745993, null);
                                        rb0Var2.f(12);
                                        de0Var.setImageDrawable(rb0Var2);
                                    } else {
                                        if (lbc.z(user3)) {
                                            str = ob6.M0(2131749082, null);
                                            eVar.getCurrentAccount();
                                            rb0Var2.q(user3);
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            de0Var.m(jn5.l(eVar.getCurrentAccount(), 1, user3), "50_50", rb0Var2, user3);
                                        } else {
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            String r = lbc.r(user3);
                                            eVar.getCurrentAccount();
                                            rb0Var2.q(user3);
                                            de0Var.m(jn5.l(eVar.getCurrentAccount(), 1, user3), "50_50", drawable, user3);
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
                                    de0Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                    de0Var.t(hl.L(24.0f), hl.L(24.0f));
                                    de0Var.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.F8, vnbVar), PorterDuff.Mode.MULTIPLY));
                                    textView2.setText(ob6.M0(2131754294, null));
                                    z5 = true;
                                    z6 = z11;
                                }
                                frameLayout.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), i, -1));
                                wk5 wk5Var42 = wk5Var;
                                boolean z132 = z4;
                                atomicReference = atomicReference22;
                                frameLayout.setOnClickListener(new nh(atomicReference, ed0Var3, wk5Var42, tL_forumTopic, eVar));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                                if (!z5) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    yob.h(aob.H8, vnbVar, frameLayout2);
                                    frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z132 ? 1 : 0));
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, tre.o(-1, 8));
                                }
                                size3 = i10;
                                i9 = i112 + 1;
                                cls4 = cls3;
                                z8 = z6;
                                i = 2;
                                arrayList2 = arrayList3;
                                z = z132 ? 1 : 0;
                                wk5Var = wk5Var42;
                            }
                        }
                        z3 = z9;
                        cls3 = cls2;
                        z5 = false;
                        z6 = true;
                        tL_forumTopic = tL_forumTopic2;
                        z4 = true;
                        frameLayout.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), i, -1));
                        wk5 wk5Var422 = wk5Var;
                        boolean z1322 = z4;
                        atomicReference = atomicReference22;
                        frameLayout.setOnClickListener(new nh(atomicReference, ed0Var3, wk5Var422, tL_forumTopic, eVar));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                        if (!z5) {
                        }
                        size3 = i10;
                        i9 = i112 + 1;
                        cls4 = cls3;
                        z8 = z6;
                        i = 2;
                        arrayList2 = arrayList3;
                        z = z1322 ? 1 : 0;
                        wk5Var = wk5Var422;
                    } else {
                        f = 16.0f;
                    }
                    L = hl.L(f);
                    de0Var.setRoundRadius(L);
                    frameLayout.addView(de0Var, tre.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView22 = new TextView(parentActivity);
                    AtomicReference atomicReference222 = atomicReference;
                    boolean z1222 = z;
                    textView22.setLines(z1222 ? 1 : 0);
                    int i1122 = i9;
                    textView22.setTextSize(z1222 ? 1 : 0, f);
                    yob.X(textView22, aob.E8, vnbVar);
                    textView22.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView22, tre.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    rb0 rb0Var22 = new rb0((vnb) null);
                    rb0Var22.p = 0.8f;
                    if (tL_forumTopic2 != null) {
                    }
                    z3 = z9;
                    cls3 = cls2;
                    z5 = false;
                    z6 = true;
                    tL_forumTopic = tL_forumTopic2;
                    z4 = true;
                    frameLayout.setBackground(aob.f0(aob.v0(aob.i6, vnbVar), i, -1));
                    wk5 wk5Var4222 = wk5Var;
                    boolean z13222 = z4;
                    atomicReference = atomicReference222;
                    frameLayout.setOnClickListener(new nh(atomicReference, ed0Var3, wk5Var4222, tL_forumTopic, eVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                    if (!z5) {
                    }
                    size3 = i10;
                    i9 = i1122 + 1;
                    cls4 = cls3;
                    z8 = z6;
                    i = 2;
                    arrayList2 = arrayList3;
                    z = z13222 ? 1 : 0;
                    wk5Var = wk5Var4222;
                }
                boolean z14 = z;
                if (!z8) {
                    return null;
                }
                n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                atomicReference.set(n8Var);
                n8Var.e = z14;
                n8Var.c = (short) 220;
                n8Var.setOutsideTouchable(z14);
                n8Var.setClippingEnabled(z14);
                n8Var.setAnimationStyle(R.style.PopupContextAnimation);
                n8Var.setFocusable(z14);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                n8Var.setInputMethodMode(2);
                n8Var.setSoftInputMode(0);
                n8Var.getContentView().setFocusableInTouchMode(z14);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z14);
                int L2 = hl.L(7.0f) - rect.left;
                if (hl.O1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L2 += iArr[0];
                }
                n8Var.showAtLocation(fragmentView, 51, L2, (view.getBottom() - rect.top) - hl.L(1.0f));
                return n8Var;
            }
        } else {
            arrayList = new ArrayList();
            wk5 parentLayout3 = eVar.getParentLayout();
            j3 = 0;
            if (parentLayout3 == null) {
                i = 2;
            } else {
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i7 = -1;
                    i = 2;
                    for (int i12 = 0; i12 < pulledDialogs2.size(); i12++) {
                        ed0 ed0Var4 = (ed0) pulledDialogs2.get(i12);
                        if (ed0Var4.e != null && r5.id != j2) {
                            int i13 = ed0Var4.b;
                            if (i13 >= i7) {
                                i7 = i13;
                            }
                            arrayList.add(ed0Var4);
                        }
                    }
                } else {
                    i = 2;
                    i7 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof tzb)) {
                    ed0 ed0Var5 = new ed0();
                    arrayList.add(ed0Var5);
                    ed0Var5.b = -1;
                    ed0Var5.a = tzb.class;
                    ed0Var5.c = uc7.s1(eVar.getCurrentAccount()).M0(Long.valueOf(-j));
                } else {
                    ed0 ed0Var6 = new ed0();
                    arrayList.add(ed0Var6);
                    ed0Var6.b = i7 + 1;
                    ed0Var6.a = uj3.class;
                    ed0 ed0Var7 = new ed0();
                    arrayList.add(ed0Var7);
                    ed0Var7.b = -1;
                    ed0Var7.a = tzb.class;
                    ed0Var7.c = uc7.s1(eVar.getCurrentAccount()).M0(Long.valueOf(-j));
                }
                Collections.sort(arrayList, new ta((byte) 6));
            }
        }
        wk5Var = parentLayout;
        z = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
