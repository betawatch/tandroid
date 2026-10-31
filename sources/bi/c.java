package bi;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.q20;
import org.telegram.messenger.t10;
import org.telegram.messenger.vp;
import org.telegram.messenger.zc;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.bk0;
import org.telegram.ui.c9;
import org.telegram.ui.d7;
import org.telegram.ui.e01;
import org.telegram.ui.f7;
import org.telegram.ui.gj0;
import org.telegram.ui.gt;
import org.telegram.ui.jo;
import org.telegram.ui.jt;
import org.telegram.ui.lt;
import org.telegram.ui.m7;
import org.telegram.ui.m91;
import org.telegram.ui.o7;
import org.telegram.ui.pb1;
import org.telegram.ui.px0;
import org.telegram.ui.rr0;
import org.telegram.ui.se0;
import org.telegram.ui.t7;
import org.telegram.ui.un;
import org.telegram.ui.w50;
import org.telegram.ui.w71;
import org.telegram.ui.xk;
import th.n7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(Context context, String str, String[] strArr, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var) {
        this.a = 2;
        this.b = context;
        this.c = str;
        this.e = strArr;
        this.d = p6Var;
        this.f = z2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0531  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Long l4;
        Long l10;
        long j10;
        boolean z10;
        TLRPC.Chat L0;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User Z1;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                vh.d dVar = (vh.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                q20 q20Var = (q20) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f;
                if (dVar.c0) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        q20Var.a(strArr[0]);
                    }
                    z2Var.dismiss();
                    break;
                }
                break;
            case 1:
                d7 d7Var = (d7) this.b;
                m7 m7Var = (m7) this.c;
                f7 f7Var = (f7) this.d;
                tk0 tk0Var = (tk0) this.e;
                t7.a(d7Var.f, m7Var, (o7) f7Var, tk0Var);
                org.telegram.ui.ActionBar.k1 k1Var = d7Var.a;
                if (k1Var != null) {
                    k1Var.d(true);
                    break;
                }
                break;
            case 2:
                new c9((Context) this.b, (String) this.c, ((String[]) this.e)[0], (org.telegram.ui.ActionBar.p6) this.d, (org.telegram.ui.ActionBar.z2) this.f).show();
                break;
            case 3:
                un unVar = (un) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(unVar.getParentActivity(), null);
                Drawable mutate = unVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                a7.y(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.t6.G8, unVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(unVar.getParentActivity(), true, true);
                b1Var.j(cd.L0(2131743981, null), R.drawable.msg_translate, null);
                b1Var.setOnClickListener(new c(unVar, str, str2, charSequence, r11, 4));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new rr0(k1Var2, 29)};
                k1Var2.e = true;
                k1Var2.c = zs.x3;
                k1Var2.setOutsideTouchable(true);
                k1Var2.setClippingEnabled(true);
                k1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                k1Var2.setFocusable(true);
                k1Var2.showAsDropDown(f0Var, (f0Var.getWidth() / 2) - org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(-16.0f), 83);
                break;
            case 4:
                un unVar2 = (un) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                m31.U0(unVar2.getParentActivity(), unVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.b;
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) this.c;
                org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) this.d;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.e;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f;
                if (k2Var.getParentActivity() != null) {
                    if (r4Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.w0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.i0.E3(r4Var);
                        break;
                    } else {
                        if (k2Var instanceof m91) {
                            org.telegram.ui.ActionBar.t6.p();
                            k2Var.finishFragment();
                        }
                        if (r6Var != null) {
                            s6Var.u(r6Var.a);
                            org.telegram.ui.ActionBar.t6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.z0(r4Var, x1Var, k2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.s4.d0(r4Var, x1Var, k2Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AtomicReference atomicReference = (AtomicReference) this.b;
                x8 x8Var = (x8) this.c;
                org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.k1) atomicReference.getAndSet(null)).dismiss();
                }
                if (x8Var.b >= 0) {
                    if (z4Var.getFragmentStack() != null && x8Var.b < z4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) z4Var.getFragmentStack().get(x8Var.b);
                        if (k2Var3 instanceof un) {
                            un unVar3 = (un) k2Var3;
                            l10 = Long.valueOf(unVar3.a());
                            l4 = Long.valueOf(unVar3.b());
                        } else if (k2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) k2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.f1);
                        }
                        if ((l10 == null && l10.longValue() != x8Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = z4Var.getFragmentStack().size() - 2; size > x8Var.b; size--) {
                                ((ActionBarLayout) z4Var).a0(size);
                            }
                        } else if (z4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(z4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i11 = x8Var.b;
                                if (size2 > i11) {
                                    ((org.telegram.ui.ActionBar.k2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i11 < z4Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) z4Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (z4Var.getFragmentStack() != null) {
                    }
                }
                Class cls = x8Var.a;
                if (cls == un.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = x8Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = x8Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", x8Var.g);
                    bundle.putInt("dialog_filter_id", x8Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = x8Var.e;
                    if (tL_forumTopic2 != null) {
                        k2Var2.presentFragment(gg.e.g(k2Var2, x8Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        k2Var2.presentFragment(new un(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", x8Var.f);
                    k2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (x8Var.a == pb1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", x8Var.c.id);
                    k2Var2.presentFragment(new pb1(bundle3), true);
                }
                if (x8Var.a == ay.class) {
                    k2Var2.presentFragment(new ay(null), true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.k1 k1Var3 = (org.telegram.ui.ActionBar.k1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.k2 k2Var4 = (org.telegram.ui.ActionBar.k2) this.e;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                k1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    hx0.a(tL_messages_stickerSet, k2Var4, p6Var);
                    break;
                } else {
                    ((un) k2Var4).oa();
                    lt.p().T = tL_messages_stickerSet;
                    break;
                }
            case 8:
                xk xkVar = (xk) this.b;
                String str5 = (String) this.c;
                t10 t10Var = (t10) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.k1 k1Var4 = (org.telegram.ui.ActionBar.k1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    zc zcVar = cd.D0().B;
                    HashSet c02 = e01.c0();
                    c02.add(lowerCase);
                    if (c02.size() == 1 && c02.contains(zcVar.f)) {
                        e01.e0(null, Boolean.FALSE);
                    } else {
                        e01.e0(c02, Boolean.FALSE);
                    }
                    t10.O = null;
                }
                t10Var.g();
                t10Var.J(xkVar.b, true, false);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(xkVar.r[0] ? cd.a0(null, null, 2131754356, str6) : cd.a0(null, null, 2131754355, str6));
                String[] strArr2 = m31.O1;
                if (W2.length() <= 0) {
                    W2 = null;
                } else {
                    W2.replace(0, 1, (CharSequence) W2.toString().substring(0, 1).toUpperCase());
                }
                cc.a0(xkVar.c).K(R.raw.msg_translate, W2, cd.L0(2131745512, null), new uo0(xkVar, 27)).j();
                k1Var4.d(true);
                break;
            case 9:
                gt gtVar = (gt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                w71 w71Var = (w71) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                lt ltVar = gtVar.a;
                if (ltVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ltVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            w71Var.requestLayout();
                            linearLayout.requestLayout();
                            w71Var.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            jt jtVar = ltVar.l;
                            if (jtVar != null) {
                                jtVar.u(tL_messages_stickerSet2.set, TextUtils.join("", ltVar.o));
                            }
                            ltVar.o();
                            break;
                        }
                    } else {
                        if (ltVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ltVar.l.O(TextUtils.join("", ltVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ltVar.l.z()) {
                                    ltVar.l.m(TextUtils.join("", ltVar.o));
                                } else {
                                    ltVar.l.x(TextUtils.join("", ltVar.o));
                                }
                            }
                        }
                        ltVar.o();
                        break;
                    }
                }
                break;
            case 10:
                se0 se0Var = (se0) this.b;
                c5.m mVar = (c5.m) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                vh.d dVar2 = se0Var.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.s3 s3Var = new org.telegram.ui.s3(se0Var, 11);
                    f8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.u1.i().p("inapp", new f1.a(se0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new w50(se0Var, mVar, s3Var, tL_inputStorePaymentAuthCode, 11)));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                gj0 gj0Var = (gj0) this.e;
                z60 F = z60.F(z2Var2.c, z2Var2.I0, frameLayout);
                int size3 = arrayList4.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (d20.i(intValue3).f() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new qq(gj0Var, intValue3, 15));
                    }
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                F.Z();
                break;
            case 12:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) this.c;
                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) this.d;
                jo joVar = (jo) this.e;
                org.telegram.ui.ActionBar.z2 z2Var3 = (org.telegram.ui.ActionBar.z2) this.f;
                joVar.a(Boolean.valueOf(c2Var.b()), Boolean.valueOf(c2Var2.b()), Boolean.valueOf(c2Var3.b()));
                z2Var3.dismiss();
                break;
            case 13:
                th.z2 z2Var4 = (th.z2) this.b;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) this.c;
                th.o7 o7Var = (th.o7) this.d;
                Context context = (Context) this.e;
                th.x2 x2Var = (th.x2) this.f;
                th.y2 y2Var = z2Var4.x1;
                ((th.f7) z2Var4.z1).g(true);
                z2Var4.b1 = null;
                boolean[] zArr2 = {false};
                if (z2Var4.l1) {
                    th.e5 O1 = vp.r1(z2Var4.l2).O1();
                    j10 = 0;
                    if (O1.Q == 0) {
                        O1.S();
                    }
                    vp.r1(z2Var4.l2).O1().U();
                    vh.s0 s0Var = vp.r1(z2Var4.l2).O1().w;
                    if (!s0Var.c && !s0Var.d) {
                        s0Var.d = true;
                        vh.p0 p0Var = new vh.p0(s0Var, i10);
                        hs a02 = hs.a0(s0Var.a);
                        a02.a.c(new bk0(a02, z12, p0Var, 17));
                    }
                } else {
                    j10 = 0;
                }
                if (!z2Var4.l1) {
                    th.e5 O12 = vp.r1(z2Var4.l2).O1();
                    TL_stories.StoryItem storyItem = y2Var.a;
                    int i13 = O12.a;
                    if (storyItem == null || storyItem.dialogId == d20.i(i13).e() || ((storyItem.dialogId <= j10 || (Z1 = vp.r1(i13).Z1(Long.valueOf(storyItem.dialogId))) == null || !Z1.bot || !Z1.bot_can_edit) && (storyItem.dialogId >= j10 || (L0 = vp.r1(i13).L0(Long.valueOf(-storyItem.dialogId))) == null || (!L0.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = L0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        th.u2 u2Var = new th.u2(z2Var4, z2Var4.getContext(), p6Var2, p6Var2, o7Var, y2Var.e, !z2Var4.l1 || ((z2Var4.m1 || z2Var4.G0()) && z10), z10, context, x2Var, zArr2);
                        z2Var4.c1 = u2Var;
                        ImageView imageView = z2Var4.f0;
                        int L = org.telegram.messenger.i0.L(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                        u2Var.a = true;
                        ((org.telegram.ui.ActionBar.k1) u2Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z10 = true;
                th.u2 u2Var2 = new th.u2(z2Var4, z2Var4.getContext(), p6Var2, p6Var2, o7Var, y2Var.e, !z2Var4.l1 || ((z2Var4.m1 || z2Var4.G0()) && z10), z10, context, x2Var, zArr2);
                z2Var4.c1 = u2Var2;
                ImageView imageView2 = z2Var4.f0;
                int L2 = org.telegram.messenger.i0.L(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                u2Var2.a = true;
                ((org.telegram.ui.ActionBar.k1) u2Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 14:
                th.u2 u2Var3 = (th.u2) this.b;
                org.telegram.ui.ActionBar.p6 p6Var3 = (org.telegram.ui.ActionBar.p6) this.c;
                Context context2 = (Context) this.d;
                th.o7 o7Var2 = (th.o7) this.e;
                th.x2 x2Var2 = (th.x2) this.f;
                th.z2 z2Var5 = u2Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i14 = -z2Var5.a1;
                    z2Var5.a1 = i14;
                    org.telegram.messenger.i0.F3(i14, view, null);
                    new cc(z2Var5.L0, p6Var3).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity W = org.telegram.messenger.i0.W(context2);
                    if (W != null) {
                        u2Var3.c = true;
                        th.u2 u2Var4 = z2Var5.c1;
                        if (u2Var4 != null) {
                            u2Var4.a();
                        }
                        px0 px0Var = new px0(u2Var3, W, o7Var2, x2Var2, 23);
                        th.o7 o7Var3 = ((th.f7) z2Var5.z1).d;
                        n7 n7Var = o7Var3.z0;
                        if (n7Var != null) {
                            z12 = n7Var.release(px0Var);
                            o7Var3.z0 = null;
                        }
                        if (!z12) {
                            px0Var.run();
                            break;
                        }
                    }
                }
                break;
            default:
                th.u2 u2Var5 = (th.u2) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                th.o7 o7Var4 = (th.o7) this.e;
                th.x2 x2Var3 = (th.x2) this.f;
                th.z2 z2Var6 = u2Var5.x;
                File h = z2Var6.x1.h();
                if (h == null || !h.exists()) {
                    z2Var6.Y0();
                    break;
                } else {
                    Activity W3 = org.telegram.messenger.i0.W(context3);
                    if (W3 != null) {
                        u2Var5.c = true;
                        th.u2 u2Var6 = z2Var6.c1;
                        if (u2Var6 != null) {
                            u2Var6.a();
                        }
                        rh.r4 r4Var2 = new rh.r4((Object) u2Var5, (Object) W3, (Object) storyItem2, (Object) o7Var4, (Object) x2Var3, 9);
                        th.o7 o7Var5 = ((th.f7) z2Var6.z1).d;
                        n7 n7Var2 = o7Var5.z0;
                        if (n7Var2 != null) {
                            z13 = n7Var2.release(r4Var2);
                            o7Var5.z0 = null;
                        }
                        if (!z13) {
                            r4Var2.run();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ c(org.telegram.ui.ActionBar.z2 z2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, gj0 gj0Var) {
        this.a = 11;
        this.f = z2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = gj0Var;
    }
}
