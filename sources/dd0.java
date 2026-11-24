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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class dd0 {
    public static void a(mu1 mu1Var, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        ui5 parentLayout;
        if ((chat == null && user == null) || (parentLayout = mu1Var.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (cd0 cd0Var : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = cd0Var.e;
                if (tL_forumTopic2 != null && tL_forumTopic2.id == tL_forumTopic.id) {
                    return;
                }
            } else if (cd0Var.f == j) {
                return;
            }
        }
        cd0 cd0Var2 = new cd0();
        cd0Var2.a = mu1.class;
        cd0Var2.b = i;
        cd0Var2.f = j;
        cd0Var2.h = i3;
        cd0Var2.g = i2;
        cd0Var2.c = chat;
        cd0Var2.d = user;
        cd0Var2.e = tL_forumTopic;
        parentLayout.getPulledDialogs().add(cd0Var2);
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
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, be0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.graphics.drawable.BitmapDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m8 b(d dVar, View view, long j, long j2, wjb wjbVar) {
        long j3;
        int i;
        ArrayList arrayList;
        ui5 ui5Var;
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
        ui5 ui5Var2;
        ui5 ui5Var3;
        long j4;
        int i5;
        int i6;
        ArrayList arrayList2;
        float f;
        int L;
        Class<mu1> cls2;
        boolean z3;
        Class<mu1> cls3;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z4;
        boolean z5;
        boolean z6;
        Drawable drawable;
        String str;
        ?? r8;
        int i7;
        ui5 parentLayout = dVar.getParentLayout();
        Activity parentActivity = dVar.getParentActivity();
        View fragmentView = dVar.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        Class<mu1> cls4 = mu1.class;
        boolean z7 = true;
        if (j2 == 0 || hc2.o0(dVar.getCurrentAccount(), j)) {
            j3 = 0;
            i = 2;
            arrayList = new ArrayList();
            ui5 parentLayout2 = dVar.getParentLayout();
            if (parentLayout2 != null) {
                List fragmentStack = parentLayout2.getFragmentStack();
                List pulledDialogs = parentLayout2.getPulledDialogs();
                if (fragmentStack != null) {
                    int size = fragmentStack.size();
                    int i8 = 0;
                    while (i8 < size) {
                        d dVar2 = (d) fragmentStack.get(i8);
                        if (dVar2 instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (mu1Var.g4 != 0) {
                                z2 = z7;
                                list = fragmentStack;
                                ui5Var2 = parentLayout;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = ui5Var2;
                                size = i5;
                                z7 = z2;
                            } else if (mu1Var.R7()) {
                                list = fragmentStack;
                                ui5Var2 = parentLayout;
                                z2 = z7;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = ui5Var2;
                                size = i5;
                                z7 = z2;
                            } else {
                                chat = mu1Var.e;
                                user2 = mu1Var.h();
                                a = mu1Var.a();
                                z2 = z7;
                                i3 = mu1Var.Ra;
                                i4 = mu1Var.Sa;
                                cls = cls4;
                                list = fragmentStack;
                                ui5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j || (j == 0 && l7c.C(user2))) {
                                    ui5Var2 = ui5Var3;
                                    i5 = size;
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = ui5Var2;
                                    size = i5;
                                    z7 = z2;
                                } else {
                                    ui5Var2 = ui5Var3;
                                    i5 = size;
                                    while (true) {
                                        if (i6 < arrayList.size()) {
                                            i6 = ((cd0) arrayList.get(i6)).f != j4 ? i6 + 1 : 0;
                                        } else {
                                            cd0 cd0Var = new cd0();
                                            cd0Var.a = cls;
                                            cd0Var.b = i8;
                                            cd0Var.c = chat;
                                            cd0Var.d = user2;
                                            cd0Var.f = j4;
                                            cd0Var.g = i3;
                                            cd0Var.h = i4;
                                            if (chat != null || user2 != null) {
                                                arrayList.add(cd0Var);
                                            }
                                        }
                                    }
                                    i8++;
                                    fragmentStack = list;
                                    parentLayout = ui5Var2;
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
                                ui5Var3 = parentLayout;
                                j4 = a;
                                if (j4 != j) {
                                }
                                ui5Var2 = ui5Var3;
                                i5 = size;
                                i8++;
                                fragmentStack = list;
                                parentLayout = ui5Var2;
                                size = i5;
                                z7 = z2;
                            }
                            list = fragmentStack;
                            ui5Var2 = parentLayout;
                            i5 = size;
                            i8++;
                            fragmentStack = list;
                            parentLayout = ui5Var2;
                            size = i5;
                            z7 = z2;
                        }
                    }
                }
                ui5Var = parentLayout;
                z = z7;
                if (pulledDialogs != null) {
                    for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                        cd0 cd0Var2 = (cd0) pulledDialogs.get(size2);
                        if (cd0Var2.f != j) {
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    arrayList.add(cd0Var2);
                                    break;
                                }
                                i2 = ((cd0) arrayList.get(i2)).f != cd0Var2.f ? i2 + 1 : 0;
                            }
                        }
                    }
                }
                Collections.sort(arrayList, new sa((byte) 5));
                arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    return null;
                }
                ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, wjbVar, parentActivity);
                Rect rect = new Rect();
                dVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate().getPadding(rect);
                zkb.h(bkb.F8, wjbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                AtomicReference atomicReference = new AtomicReference();
                int size3 = arrayList2.size();
                boolean z8 = false;
                int i9 = 0;
                while (i9 < size3) {
                    boolean z9 = i9 == 0 ? z : false;
                    boolean z10 = i9 == size3 + (-1) ? z : false;
                    cd0 cd0Var3 = (cd0) arrayList2.get(i9);
                    TLRPC.Chat chat2 = cd0Var3.c;
                    TLRPC.User user3 = cd0Var3.d;
                    TLRPC.TL_forumTopic tL_forumTopic2 = cd0Var3.e;
                    ArrayList arrayList3 = arrayList2;
                    ?? frameLayout = new FrameLayout(parentActivity);
                    int i10 = size3;
                    frameLayout.setMinimumWidth(gl.L(200.0f));
                    ?? be0Var = new be0(parentActivity);
                    boolean z11 = z8;
                    if (chat2 != null) {
                        f = 16.0f;
                        if (chat2.forum) {
                            L = gl.L(8.0f);
                            be0Var.setRoundRadius(L);
                            frameLayout.addView(be0Var, nme.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                            TextView textView = new TextView(parentActivity);
                            AtomicReference atomicReference2 = atomicReference;
                            boolean z12 = z;
                            textView.setLines(z12 ? 1 : 0);
                            int i11 = i9;
                            textView.setTextSize(z12 ? 1 : 0, f);
                            zkb.X(textView, bkb.D8, wjbVar);
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            frameLayout.addView(textView, nme.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                            pb0 pb0Var = new pb0((wjb) null);
                            pb0Var.p = 0.8f;
                            if (tL_forumTopic2 != null) {
                            }
                            z3 = z9;
                            cls3 = cls2;
                            z5 = false;
                            z6 = true;
                            tL_forumTopic = tL_forumTopic2;
                            z4 = true;
                            frameLayout.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), i, -1));
                            ui5 ui5Var4 = ui5Var;
                            boolean z13 = z4;
                            atomicReference = atomicReference2;
                            frameLayout.setOnClickListener(new ng(atomicReference, cd0Var3, ui5Var4, tL_forumTopic, dVar));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                            if (!z5) {
                            }
                            size3 = i10;
                            i9 = i11 + 1;
                            cls4 = cls3;
                            z8 = z6;
                            i = 2;
                            arrayList2 = arrayList3;
                            z = z13 ? 1 : 0;
                            ui5Var = ui5Var4;
                        }
                    } else if (user3 == null) {
                        f = 16.0f;
                        be0Var.setRoundRadius(0);
                        frameLayout.addView(be0Var, nme.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(parentActivity);
                        AtomicReference atomicReference22 = atomicReference;
                        boolean z122 = z;
                        textView2.setLines(z122 ? 1 : 0);
                        int i112 = i9;
                        textView2.setTextSize(z122 ? 1 : 0, f);
                        zkb.X(textView2, bkb.D8, wjbVar);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        frameLayout.addView(textView2, nme.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                        pb0 pb0Var2 = new pb0((wjb) null);
                        pb0Var2.p = 0.8f;
                        if (tL_forumTopic2 != null) {
                            if (tL_forumTopic2.id == 1) {
                                be0Var.setImageDrawable(mm4.d(fragmentView.getContext(), 1.0f, bkb.v0(bkb.qd, wjbVar), false));
                                cls2 = cls4;
                            } else if (tL_forumTopic2.icon_emoji_id != j3) {
                                cls2 = cls4;
                                be0Var.setAnimatedEmojiDrawable(new vl(10, dVar.getCurrentAccount(), tL_forumTopic2.icon_emoji_id));
                            } else {
                                cls2 = cls4;
                                be0Var.setImageDrawable(mm4.f(tL_forumTopic2));
                            }
                            textView2.setText(tL_forumTopic2.title);
                        } else {
                            cls2 = cls4;
                            if (chat2 != null) {
                                dVar.getCurrentAccount();
                                pb0Var2.p(chat2);
                                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                if (chatPhoto != null && (r8 = chatPhoto.strippedBitmap) != 0) {
                                    pb0Var2 = r8;
                                }
                                dVar.getCurrentAccount();
                                be0Var.m(gl5.a(1, chat2), "50_50", pb0Var2, chat2);
                                textView2.setText(chat2.title);
                            } else {
                                if (user3 != null) {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                                        drawable = pb0Var2;
                                    }
                                    z3 = z9;
                                    cls3 = cls2;
                                    if (cd0Var3.a == cls3 && l7c.C(user3)) {
                                        str = k96.M0(2131745709, null);
                                        pb0Var2.f(1);
                                        be0Var.setImageDrawable(pb0Var2);
                                    } else if (l7c.A(user3)) {
                                        str = k96.M0(2131746073, null);
                                        pb0Var2.f(12);
                                        be0Var.setImageDrawable(pb0Var2);
                                    } else {
                                        if (l7c.y(user3)) {
                                            str = k96.M0(2131749136, null);
                                            dVar.getCurrentAccount();
                                            pb0Var2.q(user3);
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            be0Var.m(gl5.l(dVar.getCurrentAccount(), 1, user3), "50_50", pb0Var2, user3);
                                        } else {
                                            tL_forumTopic = tL_forumTopic2;
                                            z4 = true;
                                            String q = l7c.q(user3);
                                            dVar.getCurrentAccount();
                                            pb0Var2.q(user3);
                                            be0Var.m(gl5.l(dVar.getCurrentAccount(), 1, user3), "50_50", drawable, user3);
                                            str = q;
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
                                    be0Var.setImageDrawable(parentActivity.getDrawable(R.drawable.msg_viewchats).mutate());
                                    be0Var.t(gl.L(24.0f), gl.L(24.0f));
                                    be0Var.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.E8, wjbVar), PorterDuff.Mode.MULTIPLY));
                                    textView2.setText(k96.M0(2131754298, null));
                                    z5 = true;
                                    z6 = z11;
                                }
                                frameLayout.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), i, -1));
                                ui5 ui5Var42 = ui5Var;
                                boolean z132 = z4;
                                atomicReference = atomicReference22;
                                frameLayout.setOnClickListener(new ng(atomicReference, cd0Var3, ui5Var42, tL_forumTopic, dVar));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                                if (!z5) {
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    zkb.h(bkb.G8, wjbVar, frameLayout2);
                                    frameLayout2.setTag(R.id.fit_width_tag, Integer.valueOf(z132 ? 1 : 0));
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, nme.o(-1, 8));
                                }
                                size3 = i10;
                                i9 = i112 + 1;
                                cls4 = cls3;
                                z8 = z6;
                                i = 2;
                                arrayList2 = arrayList3;
                                z = z132 ? 1 : 0;
                                ui5Var = ui5Var42;
                            }
                        }
                        z3 = z9;
                        cls3 = cls2;
                        z5 = false;
                        z6 = true;
                        tL_forumTopic = tL_forumTopic2;
                        z4 = true;
                        frameLayout.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), i, -1));
                        ui5 ui5Var422 = ui5Var;
                        boolean z1322 = z4;
                        atomicReference = atomicReference22;
                        frameLayout.setOnClickListener(new ng(atomicReference, cd0Var3, ui5Var422, tL_forumTopic, dVar));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                        if (!z5) {
                        }
                        size3 = i10;
                        i9 = i112 + 1;
                        cls4 = cls3;
                        z8 = z6;
                        i = 2;
                        arrayList2 = arrayList3;
                        z = z1322 ? 1 : 0;
                        ui5Var = ui5Var422;
                    } else {
                        f = 16.0f;
                    }
                    L = gl.L(f);
                    be0Var.setRoundRadius(L);
                    frameLayout.addView(be0Var, nme.i(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView22 = new TextView(parentActivity);
                    AtomicReference atomicReference222 = atomicReference;
                    boolean z1222 = z;
                    textView22.setLines(z1222 ? 1 : 0);
                    int i1122 = i9;
                    textView22.setTextSize(z1222 ? 1 : 0, f);
                    zkb.X(textView22, bkb.D8, wjbVar);
                    textView22.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout.addView(textView22, nme.i(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
                    pb0 pb0Var22 = new pb0((wjb) null);
                    pb0Var22.p = 0.8f;
                    if (tL_forumTopic2 != null) {
                    }
                    z3 = z9;
                    cls3 = cls2;
                    z5 = false;
                    z6 = true;
                    tL_forumTopic = tL_forumTopic2;
                    z4 = true;
                    frameLayout.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), i, -1));
                    ui5 ui5Var4222 = ui5Var;
                    boolean z13222 = z4;
                    atomicReference = atomicReference222;
                    frameLayout.setOnClickListener(new ng(atomicReference, cd0Var3, ui5Var4222, tL_forumTopic, dVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.q(-1, 44, 0.0f, 0, 0, !z3 ? 3 : 0, 0, !z10 ? 3 : 0));
                    if (!z5) {
                    }
                    size3 = i10;
                    i9 = i1122 + 1;
                    cls4 = cls3;
                    z8 = z6;
                    i = 2;
                    arrayList2 = arrayList3;
                    z = z13222 ? 1 : 0;
                    ui5Var = ui5Var4222;
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
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                m8Var.setInputMethodMode(2);
                m8Var.setSoftInputMode(0);
                m8Var.getContentView().setFocusableInTouchMode(z14);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(z14);
                int L2 = gl.L(7.0f) - rect.left;
                if (gl.O1()) {
                    int[] iArr = new int[2];
                    fragmentView.getLocationInWindow(iArr);
                    L2 += iArr[0];
                }
                m8Var.showAtLocation(fragmentView, 51, L2, (view.getBottom() - rect.top) - gl.L(1.0f));
                return m8Var;
            }
        } else {
            arrayList = new ArrayList();
            ui5 parentLayout3 = dVar.getParentLayout();
            j3 = 0;
            if (parentLayout3 == null) {
                i = 2;
            } else {
                List pulledDialogs2 = parentLayout3.getPulledDialogs();
                if (pulledDialogs2 != null) {
                    i7 = -1;
                    i = 2;
                    for (int i12 = 0; i12 < pulledDialogs2.size(); i12++) {
                        cd0 cd0Var4 = (cd0) pulledDialogs2.get(i12);
                        if (cd0Var4.e != null && r5.id != j2) {
                            int i13 = cd0Var4.b;
                            if (i13 >= i7) {
                                i7 = i13;
                            }
                            arrayList.add(cd0Var4);
                        }
                    }
                } else {
                    i = 2;
                    i7 = -1;
                }
                if (parentLayout3.getFragmentStack().size() <= 1 || !(parentLayout3.getFragmentStack().get(parentLayout3.getFragmentStack().size() - 2) instanceof qvb)) {
                    cd0 cd0Var5 = new cd0();
                    arrayList.add(cd0Var5);
                    cd0Var5.b = -1;
                    cd0Var5.a = qvb.class;
                    cd0Var5.c = na7.q1(dVar.getCurrentAccount()).K0(Long.valueOf(-j));
                } else {
                    cd0 cd0Var6 = new cd0();
                    arrayList.add(cd0Var6);
                    cd0Var6.b = i7 + 1;
                    cd0Var6.a = cj3.class;
                    cd0 cd0Var7 = new cd0();
                    arrayList.add(cd0Var7);
                    cd0Var7.b = -1;
                    cd0Var7.a = qvb.class;
                    cd0Var7.c = na7.q1(dVar.getCurrentAccount()).K0(Long.valueOf(-j));
                }
                Collections.sort(arrayList, new sa((byte) 6));
            }
        }
        ui5Var = parentLayout;
        z = true;
        arrayList2 = arrayList;
        if (arrayList2.size() > 0) {
        }
    }
}
