package fi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.ck;
import org.telegram.ui.d61;
import org.telegram.ui.hq0;
import org.telegram.ui.ii;
import org.telegram.ui.js;
import org.telegram.ui.ld0;
import org.telegram.ui.ls;
import org.telegram.ui.ns;
import org.telegram.ui.ry0;
import org.telegram.ui.v71;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02f8  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j3;
        boolean z10;
        TLRPC.Chat O0;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User c22;
        Long l10;
        Long l11;
        int i7 = 3;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.b;
                org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) this.c;
                org.telegram.ui.Cells.d2 d2Var3 = (org.telegram.ui.Cells.d2) this.d;
                b0 b0Var = (b0) this.e;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f;
                b0Var.a(Boolean.valueOf(d2Var.b()), Boolean.valueOf(d2Var2.b()), Boolean.valueOf(d2Var3.b()));
                w2Var.dismiss();
                break;
            case 1:
                z3 z3Var = (z3) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                f9 f9Var = (f9) this.d;
                Context context = (Context) this.e;
                w3 w3Var = (w3) this.f;
                x3 x3Var = z3Var.y1;
                ((w8) z3Var.A1).g(true);
                z3Var.c1 = null;
                boolean[] zArr = {false};
                if (z3Var.m1) {
                    p6 R1 = mp.u1(z3Var.m2).R1();
                    j3 = 0;
                    if (R1.Q == 0) {
                        R1.S();
                    }
                    mp.u1(z3Var.m2).R1().U();
                    hi.j1 j1Var = mp.u1(z3Var.m2).R1().w;
                    if (!j1Var.c && !j1Var.d) {
                        j1Var.d = true;
                        hi.f1 f1Var = new hi.f1(j1Var, i10);
                        tr a02 = tr.a0(j1Var.a);
                        a02.a.c(new di.p6(a02, z12, f1Var, i7));
                    }
                } else {
                    j3 = 0;
                }
                if (!z3Var.m1) {
                    p6 R12 = mp.u1(z3Var.m2).R1();
                    TL_stories.StoryItem storyItem = x3Var.a;
                    int i11 = R12.a;
                    if (storyItem == null || storyItem.dialogId == i10.i(i11).e() || ((storyItem.dialogId <= j3 || (c22 = mp.u1(i11).c2(Long.valueOf(storyItem.dialogId))) == null || !c22.bot || !c22.bot_can_edit) && (storyItem.dialogId >= j3 || (O0 = mp.u1(i11).O0(Long.valueOf(-storyItem.dialogId))) == null || (!O0.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = O0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        r3 r3Var = new r3(z3Var, z3Var.getContext(), i6Var, i6Var, f9Var, x3Var.e, !z3Var.m1 || ((z3Var.n1 || z3Var.G0()) && z10), z10, context, w3Var, zArr);
                        z3Var.d1 = r3Var;
                        ImageView imageView = z3Var.g0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        r3Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) r3Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z10 = true;
                r3 r3Var2 = new r3(z3Var, z3Var.getContext(), i6Var, i6Var, f9Var, x3Var.e, !z3Var.m1 || ((z3Var.n1 || z3Var.G0()) && z10), z10, context, w3Var, zArr);
                z3Var.d1 = r3Var2;
                ImageView imageView2 = z3Var.g0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                r3Var2.a = true;
                ((org.telegram.ui.ActionBar.g1) r3Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 2:
                r3 r3Var3 = (r3) this.b;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.c;
                Context context2 = (Context) this.d;
                f9 f9Var2 = (f9) this.e;
                w3 w3Var2 = (w3) this.f;
                z3 z3Var2 = r3Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -z3Var2.b1;
                    z3Var2.b1 = i12;
                    org.telegram.messenger.g0.E3(i12, view, null);
                    org.telegram.messenger.f3.o(null, 2131744429, new kc(z3Var2.M0, i6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        r3Var3.c = true;
                        r3 r3Var4 = z3Var2.d1;
                        if (r3Var4 != null) {
                            r3Var4.a();
                        }
                        ai.j jVar = new ai.j(r3Var3, W, f9Var2, w3Var2, 17);
                        f9 f9Var3 = ((w8) z3Var2.A1).d;
                        e9 e9Var = f9Var3.A0;
                        if (e9Var != null) {
                            z12 = e9Var.release(jVar);
                            f9Var3.A0 = null;
                        }
                        if (!z12) {
                            jVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                r3 r3Var5 = (r3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                f9 f9Var4 = (f9) this.e;
                w3 w3Var3 = (w3) this.f;
                z3 z3Var3 = r3Var5.x;
                File h = z3Var3.y1.h();
                if (h == null || !h.exists()) {
                    z3Var3.Y0();
                    break;
                } else {
                    Activity W2 = org.telegram.messenger.g0.W(context3);
                    if (W2 != null) {
                        r3Var5.c = true;
                        r3 r3Var6 = z3Var3.d1;
                        if (r3Var6 != null) {
                            r3Var6.a();
                        }
                        bi.s1 s1Var = new bi.s1((Object) r3Var5, (Object) W2, (Object) storyItem2, (Object) f9Var4, (Object) w3Var3, 12);
                        f9 f9Var5 = ((w8) z3Var3.A1).d;
                        e9 e9Var2 = f9Var5.A0;
                        if (e9Var2 != null) {
                            z13 = e9Var2.release(s1Var);
                            f9Var5.A0 = null;
                        }
                        if (!z13) {
                            s1Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                hi.e eVar = (hi.e) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                w10 w10Var = (w10) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) this.f;
                if (eVar.e0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        w10Var.a(strArr[0]);
                    }
                    w2Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                ek0 ek0Var = (ek0) this.e;
                org.telegram.ui.t7.a(d7Var.f, m7Var, (org.telegram.ui.o7) f7Var, ek0Var);
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.c9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.i6) this.e, (org.telegram.ui.ActionBar.w2) this.f).show();
                break;
            case 7:
                bn bnVar = (bn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(bnVar.getParentActivity(), null);
                Drawable mutate = bnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.u6.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.n6.G8, bnVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), true, true);
                y0Var.j(gd.N0(2131743709, null), R.drawable.msg_translate, null);
                y0Var.setOnClickListener(new d0(bnVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new hq0(g1Var2, 29)};
                g1Var2.e = true;
                g1Var2.c = ks.x3;
                g1Var2.setOutsideTouchable(true);
                g1Var2.setClippingEnabled(true);
                g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var2.setFocusable(true);
                g1Var2.showAsDropDown(g0Var, (g0Var.getWidth() / 2) - org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(-16.0f), 83);
                break;
            case 8:
                bn bnVar2 = (bn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                a31.W0(bnVar2.getParentActivity(), bnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.b;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.c;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.d;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.e;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f;
                if (g2Var.getParentActivity() != null) {
                    if (a5Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.t0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.g0.D3(a5Var);
                        break;
                    } else {
                        if (g2Var instanceof v71) {
                            org.telegram.ui.ActionBar.n6.p();
                            g2Var.finishFragment();
                        }
                        if (k6Var != null) {
                            m6Var.u(k6Var.a);
                            org.telegram.ui.ActionBar.n6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.h1(a5Var, t1Var, g2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.b5.b0(a5Var, t1Var, g2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.c;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.g1) atomicReference.getAndSet(null)).dismiss();
                }
                if (g9Var.b >= 0) {
                    if (r4Var.getFragmentStack() != null && g9Var.b < r4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) r4Var.getFragmentStack().get(g9Var.b);
                        if (g2Var3 instanceof bn) {
                            bn bnVar3 = (bn) g2Var3;
                            l11 = Long.valueOf(bnVar3.a());
                            l10 = Long.valueOf(bnVar3.b());
                        } else if (g2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) g2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l11 == null && l11.longValue() != g9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = r4Var.getFragmentStack().size() - 2; size > g9Var.b; size--) {
                                ((ActionBarLayout) r4Var).b0(size);
                            }
                        } else if (r4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(r4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = g9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.g2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < r4Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) r4Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (r4Var.getFragmentStack() != null) {
                    }
                }
                Class cls = g9Var.a;
                if (cls == bn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = g9Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = g9Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", g9Var.g);
                    bundle.putInt("dialog_filter_id", g9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = g9Var.e;
                    if (tL_forumTopic2 != null) {
                        g2Var2.presentFragment(qg.c.h(g2Var2, g9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        g2Var2.presentFragment(new bn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", g9Var.f);
                    g2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (g9Var.a == w91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", g9Var.c.id);
                    g2Var2.presentFragment(new w91(bundle3), true);
                }
                if (g9Var.a == bx.class) {
                    g2Var2.presentFragment(new bx(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) this.e;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                g1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ow0.a(tL_messages_stickerSet, g2Var4, i6Var3);
                    break;
                } else {
                    ((bn) g2Var4).Ba();
                    ns.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                ck ckVar = (ck) this.b;
                String str5 = (String) this.c;
                y00 y00Var = (y00) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    cd cdVar = gd.E0().B;
                    HashSet d02 = ry0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(cdVar.f)) {
                        ry0.f0(null, Boolean.FALSE);
                    } else {
                        ry0.f0(d02, Boolean.FALSE);
                    }
                    y00.P = null;
                }
                y00Var.g();
                y00Var.J(ckVar.b, true, false);
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(ckVar.r[0] ? gd.a0(null, null, 2131754353, str6) : gd.a0(null, null, 2131754352, str6));
                String[] strArr2 = a31.S1;
                if (W22.length() <= 0) {
                    W22 = null;
                } else {
                    W22.replace(0, 1, (CharSequence) W22.toString().substring(0, 1).toUpperCase());
                }
                kc.b0(ckVar.c).K(R.raw.msg_translate, W22, gd.N0(2131745299, null), new bp0(ckVar, 25)).j();
                g1Var4.d(true);
                break;
            case 13:
                js jsVar = (js) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                d61 d61Var = (d61) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ns nsVar = jsVar.a;
                if (nsVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nsVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            d61Var.requestLayout();
                            linearLayout.requestLayout();
                            d61Var.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ls lsVar = nsVar.l;
                            if (lsVar != null) {
                                lsVar.u(tL_messages_stickerSet2.set, TextUtils.join("", nsVar.o));
                            }
                            nsVar.o();
                            break;
                        }
                    } else {
                        if (nsVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                nsVar.l.O(TextUtils.join("", nsVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (nsVar.l.z()) {
                                    nsVar.l.m(TextUtils.join("", nsVar.o));
                                } else {
                                    nsVar.l.x(TextUtils.join("", nsVar.o));
                                }
                            }
                        }
                        nsVar.o();
                        break;
                    }
                }
                break;
            case 14:
                ld0 ld0Var = (ld0) this.b;
                f5.m mVar = (f5.m) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                hi.e eVar2 = ld0Var.b;
                if (!eVar2.R) {
                    eVar2.setLoading(true);
                    org.telegram.ui.r3 r3Var7 = new org.telegram.ui.r3(ld0Var, 12);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new di.l6(ld0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new xz(ld0Var, mVar, r3Var7, tL_inputStorePaymentAuthCode, 29)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var3 = (org.telegram.ui.ActionBar.w2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                bi0 bi0Var = (bi0) this.e;
                x60 G = x60.G(w2Var3.c, w2Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (i10.i(intValue3).f() != null) {
                        G.e(intValue3, iArr[0] == intValue3, new ii(bi0Var, intValue3, 28));
                    }
                }
                G.t = false;
                G.b0 = true;
                G.s = 0;
                G.i = 3;
                G.b0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                G.a0();
                break;
        }
    }

    public /* synthetic */ d0(org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, bi0 bi0Var) {
        this.a = 15;
        this.f = w2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = bi0Var;
    }
}
