// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class og implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ og(m8 m8Var, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, wjb wjbVar) {
        this.a = (byte) 14;
        this.c = m8Var;
        this.d = arrayList;
        this.e = tL_messages_stickerSet;
        this.b = dVar;
        this.f = wjbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0646  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Long l;
        Long l2;
        long j;
        boolean z;
        TLRPC.Chat K0;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User V1;
        byte b = 1;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                hj hjVar = (hj) this.c;
                zjb zjbVar = (zjb) this.d;
                akb akbVar = (akb) this.e;
                hd hdVar = (hd) this.f;
                if (dVar.getParentActivity() != null) {
                    if (hjVar.length() == 0) {
                        Vibrator vibrator = (Vibrator) a.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        gl.z3(hjVar);
                        break;
                    } else {
                        if (dVar instanceof qmb) {
                            bkb.o();
                            dVar.finishFragment();
                        }
                        if (zjbVar != null) {
                            akbVar.u(zjbVar.a);
                            bkb.r1(false, false);
                            Utilities.g.c(new qe(hjVar, hdVar, dVar, z3 ? (byte) 1 : (byte) 0));
                            break;
                        } else {
                            ij.b0(hjVar, hdVar, dVar);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.c;
                cd0 cd0Var = (cd0) this.d;
                ui5 ui5Var = (ui5) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                d dVar2 = (d) this.b;
                if (atomicReference.get() != null) {
                    ((m8) atomicReference.getAndSet(null)).dismiss();
                }
                if (cd0Var.b >= 0) {
                    if (ui5Var.getFragmentStack() != null && cd0Var.b < ui5Var.getFragmentStack().size()) {
                        d dVar3 = (d) ui5Var.getFragmentStack().get(cd0Var.b);
                        if (dVar3 instanceof mu1) {
                            mu1 mu1Var = (mu1) dVar3;
                            l2 = Long.valueOf(mu1Var.a());
                            l = Long.valueOf(mu1Var.d());
                        } else if (dVar3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) dVar3;
                            l2 = Long.valueOf(profileActivity.a());
                            l = Long.valueOf(profileActivity.g1);
                        }
                        if ((l2 == null && l2.longValue() != cd0Var.f) || !(tL_forumTopic == null || l == null || tL_forumTopic.id == l.longValue())) {
                            for (int size = ui5Var.getFragmentStack().size() - 2; size > cd0Var.b; size--) {
                                ((ActionBarLayout) ui5Var).a0(size);
                            }
                        } else if (ui5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(ui5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i = cd0Var.b;
                                if (size2 > i) {
                                    ((d) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i < ui5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) ui5Var).j(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l = null;
                    l2 = null;
                    if (l2 == null) {
                    }
                    if (ui5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = cd0Var.a;
                if (cls == mu1.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = cd0Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = cd0Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", cd0Var.g);
                    bundle.putInt("dialog_filter_id", cd0Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = cd0Var.e;
                    if (tL_forumTopic2 != null) {
                        dVar2.presentFragment(mm4.h(dVar2, cd0Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        dVar2.presentFragment(new mu1(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", cd0Var.f);
                    dVar2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (cd0Var.a == qvb.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", cd0Var.c.id);
                    dVar2.presentFragment(new qvb(bundle3), true);
                }
                if (cd0Var.a == cj3.class) {
                    dVar2.presentFragment(new cj3(null), true);
                    break;
                }
                break;
            case 2:
                z61 z61Var = (z61) this.b;
                h71 h71Var = (h71) this.c;
                a71 a71Var = (a71) this.d;
                o39 o39Var = (o39) this.e;
                z61Var.f.c(h71Var, (j71) a71Var, o39Var);
                m8 m8Var = z61Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    break;
                }
                break;
            case 3:
                new s81((Context) this.b, (String) this.c, ((String[]) this.d)[0], (wjb) this.e, (fx0) this.f).show();
                break;
            case 4:
                mu1 mu1Var2 = (mu1) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                eq0 eq0Var = (eq0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mu1Var2.getParentActivity(), null);
                Drawable mutate = mu1Var2.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                zkb.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, bkb.F8, mu1Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                a8 a8Var = new a8(mu1Var2.getParentActivity(), true, true);
                a8Var.j(k96.M0(2131743717, null), R.drawable.msg_translate, null);
                a8Var.setOnClickListener(new og(mu1Var2, str, str2, charSequence, r11, (byte) 5));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                m8 m8Var2 = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new wn1(m8Var2, (byte) 0)};
                m8Var2.e = true;
                m8Var2.c = (short) 220;
                m8Var2.setOutsideTouchable(true);
                m8Var2.setClippingEnabled(true);
                m8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                m8Var2.setFocusable(true);
                m8Var2.showAsDropDown(eq0Var, (eq0Var.getWidth() / 2) - gl.L(90.0f), gl.L(-16.0f), 83);
                break;
            case 5:
                mu1 mu1Var3 = (mu1) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                rzb.Q0(mu1Var3.getParentActivity(), mu1Var3, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                u41 u41Var = (u41) this.b;
                boolean[] zArr = (boolean[]) this.c;
                p8c p8cVar = (p8c) this.d;
                String[] strArr = (String[]) this.e;
                fx0 fx0Var = (fx0) this.f;
                if (u41Var.e0) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        p8cVar.a(strArr[0]);
                    }
                    fx0Var.dismiss();
                    break;
                }
                break;
            case 7:
                tv2 tv2Var = (tv2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                rkb rkbVar = (rkb) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                xv2 xv2Var = tv2Var.a;
                if (xv2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv2Var.T;
                        if (tL_messages_stickerSet == null) {
                            rkbVar.requestLayout();
                            linearLayout.requestLayout();
                            rkbVar.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            vv2 vv2Var = xv2Var.l;
                            if (vv2Var != null) {
                                vv2Var.s(tL_messages_stickerSet.set, TextUtils.join("", xv2Var.o));
                            }
                            xv2Var.d();
                            break;
                        }
                    } else {
                        if (xv2Var.l != null) {
                            if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                                xv2Var.l.Q(TextUtils.join("", xv2Var.o));
                            } else if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                                boolean x = xv2Var.l.x();
                                vv2 vv2Var2 = xv2Var.l;
                                ArrayList arrayList3 = xv2Var.o;
                                if (x) {
                                    vv2Var2.l(TextUtils.join("", arrayList3));
                                } else {
                                    vv2Var2.v(TextUtils.join("", arrayList3));
                                }
                            }
                        }
                        xv2Var.d();
                        break;
                    }
                }
                break;
            case 8:
                ag2 ag2Var = (ag2) this.b;
                ag2 ag2Var2 = (ag2) this.c;
                ag2 ag2Var3 = (ag2) this.d;
                qo0 qo0Var = (qo0) this.e;
                fx0 fx0Var2 = (fx0) this.f;
                qo0Var.a(Boolean.valueOf(ag2Var.b()), Boolean.valueOf(ag2Var2.b()), Boolean.valueOf(ag2Var3.b()));
                fx0Var2.dismiss();
                break;
            case 9:
                ve6 ve6Var = (ve6) this.b;
                kl8 kl8Var = (kl8) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str5 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                u41 u41Var2 = ve6Var.b;
                if (!u41Var2.R) {
                    u41Var2.setLoading(true);
                    hj3 hj3Var = new hj3(ve6Var, (byte) 24);
                    fa4.b("LoginBilling, querying done purchases...");
                    ci0.h().p("inapp", new kh(ve6Var, str5, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new e45(ve6Var, kl8Var, hj3Var, tL_inputStorePaymentAuthCode, (byte) 20)));
                    break;
                }
                break;
            case 10:
                fx0 fx0Var3 = (fx0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                int[] iArr = (int[]) this.e;
                rn7 rn7Var = (rn7) this.f;
                cs5 G = cs5.G(fx0Var3.c, fx0Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    int intValue2 = ((Integer) obj).intValue();
                    if (y6c.h(intValue2).f() != null) {
                        G.d(intValue2, iArr[0] == intValue2, new on7(rn7Var, intValue2, z3 ? (byte) 1 : (byte) 0));
                    }
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-gl.L(8.0f), -gl.L(8.0f));
                G.a0();
                break;
            case 11:
                y28 y28Var = (y28) this.b;
                f53 f53Var = (f53) this.c;
                m8b m8bVar = (m8b) this.d;
                Context context = (Context) this.e;
                w28 w28Var = (w28) this.f;
                x28 x28Var = y28Var.E1;
                ((d8b) y28Var.G1).g(true);
                y28Var.i1 = null;
                boolean[] zArr2 = {false};
                if (y28Var.s1) {
                    g2b M1 = na7.q1(y28Var.s2).M1();
                    j = 0;
                    if (M1.Q == 0) {
                        M1.R();
                    }
                    na7.q1(y28Var.s2).M1().T();
                    jq3 jq3Var = na7.q1(y28Var.s2).M1().w;
                    if (!jq3Var.c && !jq3Var.d) {
                        jq3Var.d = true;
                        fq3 fq3Var = new fq3(jq3Var, b);
                        ad7 Y = ad7.Y(jq3Var.a);
                        Y.a.c(new mn6((Object) Y, z3, (Object) fq3Var, (byte) 18));
                    }
                } else {
                    j = 0;
                }
                if (!y28Var.s1) {
                    g2b M12 = na7.q1(y28Var.s2).M1();
                    TL_stories.StoryItem storyItem = x28Var.a;
                    int i3 = M12.a;
                    if (storyItem == null || storyItem.dialogId == y6c.h(i3).e() || ((storyItem.dialogId <= j || (V1 = na7.q1(i3).V1(Long.valueOf(storyItem.dialogId))) == null || !V1.bot || !V1.bot_can_edit) && (storyItem.dialogId >= j || (K0 = na7.q1(i3).K0(Long.valueOf(-storyItem.dialogId))) == null || (!K0.creator && ((!(z2 = storyItem.out) || (tL_chatAdminRights2 = K0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z2 || (tL_chatAdminRights = K0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z = false;
                        s28 s28Var = new s28(y28Var, y28Var.getContext(), f53Var, f53Var, m8bVar, x28Var.e, !y28Var.s1 || ((y28Var.t1 || y28Var.A0()) && z), z, context, w28Var, zArr2);
                        y28Var.j1 = s28Var;
                        ImageView imageView = y28Var.m0;
                        int L = gl.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                        s28Var.a = true;
                        ((m8) s28Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z = true;
                s28 s28Var2 = new s28(y28Var, y28Var.getContext(), f53Var, f53Var, m8bVar, x28Var.e, !y28Var.s1 || ((y28Var.t1 || y28Var.A0()) && z), z, context, w28Var, zArr2);
                y28Var.j1 = s28Var2;
                ImageView imageView2 = y28Var.m0;
                int L2 = gl.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                s28Var2.a = true;
                ((m8) s28Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 12:
                s28 s28Var3 = (s28) this.b;
                f53 f53Var2 = (f53) this.c;
                Context context2 = (Context) this.d;
                m8b m8bVar2 = (m8b) this.e;
                w28 w28Var2 = (w28) this.f;
                y28 y28Var2 = s28Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i4 = -y28Var2.h1;
                    y28Var2.h1 = i4;
                    gl.A3(i4, view, null);
                    yjb.x(null, 2131744433, new u21(y28Var2.S0, f53Var2), null);
                    break;
                } else {
                    Activity W = gl.W(context2);
                    if (W != null) {
                        s28Var3.c = true;
                        s28 s28Var4 = y28Var2.j1;
                        if (s28Var4 != null) {
                            s28Var4.a();
                        }
                        jw6 jw6Var = new jw6(s28Var3, W, m8bVar2, w28Var2, (byte) 17);
                        m8b m8bVar3 = ((d8b) y28Var2.G1).d;
                        l8b l8bVar = m8bVar3.A0;
                        if (l8bVar != null) {
                            z3 = l8bVar.release(jw6Var);
                            m8bVar3.A0 = null;
                        }
                        if (!z3) {
                            jw6Var.run();
                            break;
                        }
                    }
                }
                break;
            case 13:
                s28 s28Var5 = (s28) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                m8b m8bVar4 = (m8b) this.e;
                w28 w28Var3 = (w28) this.f;
                y28 y28Var3 = s28Var5.x;
                File f = y28Var3.E1.f();
                if (f == null || !f.exists()) {
                    y28Var3.V0();
                    break;
                } else {
                    Activity W2 = gl.W(context3);
                    if (W2 != null) {
                        s28Var5.c = true;
                        s28 s28Var6 = y28Var3.j1;
                        if (s28Var6 != null) {
                            s28Var6.a();
                        }
                        ex7 ex7Var = new ex7((Object) s28Var5, (Object) W2, (Object) storyItem2, (Object) m8bVar4, (Object) w28Var3, (byte) 5);
                        m8b m8bVar5 = ((d8b) y28Var3.G1).d;
                        l8b l8bVar2 = m8bVar5.A0;
                        if (l8bVar2 != null) {
                            z4 = l8bVar2.release(ex7Var);
                            m8bVar5.A0 = null;
                        }
                        if (!z4) {
                            ex7Var.run();
                            break;
                        }
                    }
                }
                break;
            case 14:
                m8 m8Var3 = (m8) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.e;
                d dVar4 = (d) this.b;
                wjb wjbVar = (wjb) this.f;
                int intValue3 = ((Integer) view.getTag()).intValue();
                m8Var3.d(true);
                if (((Integer) arrayList5.get(intValue3)).intValue() == 1) {
                    a1b.a(tL_messages_stickerSet2, dVar4, wjbVar);
                    break;
                } else {
                    ((mu1) dVar4).da();
                    xv2.e().T = tL_messages_stickerSet2;
                    break;
                }
            default:
                mr1 mr1Var = (mr1) this.b;
                String str6 = (String) this.c;
                b1c b1cVar = (b1c) this.d;
                String str7 = (String) this.e;
                m8 m8Var4 = (m8) this.f;
                if (str6 != null) {
                    String lowerCase = str6.toLowerCase();
                    i96 i96Var = k96.D0().B;
                    HashSet b0 = qa9.b0();
                    b0.add(lowerCase);
                    if (b0.size() == 1 && b0.contains(i96Var.f)) {
                        qa9.e0(null, Boolean.FALSE);
                    } else {
                        qa9.e0(b0, Boolean.FALSE);
                    }
                    b1c.P = null;
                }
                b1cVar.f();
                b1cVar.J(mr1Var.b, true, false);
                SpannableStringBuilder S2 = gl.S2(mr1Var.r[0] ? k96.a0(null, null, 2131754353, str7) : k96.a0(null, null, 2131754352, str7));
                String[] strArr2 = rzb.R1;
                if (S2.length() <= 0) {
                    S2 = null;
                } else {
                    S2.replace(0, 1, (CharSequence) S2.toString().substring(0, 1).toUpperCase());
                }
                u21.b0(mr1Var.c).K(R.raw.msg_translate, S2, k96.M0(2131745303, null), new cib(mr1Var, (byte) 16)).j();
                m8Var4.d(true);
                break;
        }
    }

    public /* synthetic */ og(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ og(AtomicReference atomicReference, cd0 cd0Var, ui5 ui5Var, TLRPC.TL_forumTopic tL_forumTopic, d dVar) {
        this.a = (byte) 1;
        this.c = atomicReference;
        this.d = cd0Var;
        this.e = ui5Var;
        this.f = tL_forumTopic;
        this.b = dVar;
    }
}
