package di;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ed;
import org.telegram.messenger.f10;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.bk;
import org.telegram.ui.e61;
import org.telegram.ui.fq0;
import org.telegram.ui.gs;
import org.telegram.ui.is;
import org.telegram.ui.ks;
import org.telegram.ui.ld0;
import org.telegram.ui.qy0;
import org.telegram.ui.u71;
import org.telegram.ui.v91;
import org.telegram.ui.ww;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
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
        boolean z9;
        TLRPC.Chat M0;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User a22;
        Long l10;
        Long l11;
        int i7 = 3;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) this.c;
                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) this.d;
                b0 b0Var = (b0) this.e;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f;
                b0Var.a(Boolean.valueOf(c2Var.b()), Boolean.valueOf(c2Var2.b()), Boolean.valueOf(c2Var3.b()));
                v2Var.dismiss();
                break;
            case 1:
                i4 i4Var = (i4) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                p9 p9Var = (p9) this.d;
                Context context = (Context) this.e;
                f4 f4Var = (f4) this.f;
                g4 g4Var = i4Var.x1;
                ((g9) i4Var.z1).g(true);
                i4Var.b1 = null;
                boolean[] zArr = {false};
                if (i4Var.l1) {
                    y6 P1 = qp.s1(i4Var.l2).P1();
                    j3 = 0;
                    if (P1.Q == 0) {
                        P1.S();
                    }
                    qp.s1(i4Var.l2).P1().U();
                    fi.z0 z0Var = qp.s1(i4Var.l2).P1().w;
                    if (!z0Var.c && !z0Var.d) {
                        z0Var.d = true;
                        fi.v0 v0Var = new fi.v0(z0Var, i10);
                        yr a02 = yr.a0(z0Var.a);
                        a02.a.c(new bi.u7(a02, z11, v0Var, i7));
                    }
                } else {
                    j3 = 0;
                }
                if (!i4Var.l1) {
                    y6 P12 = qp.s1(i4Var.l2).P1();
                    TL_stories.StoryItem storyItem = g4Var.a;
                    int i11 = P12.a;
                    if (storyItem == null || storyItem.dialogId == p10.i(i11).e() || ((storyItem.dialogId <= j3 || (a22 = qp.s1(i11).a2(Long.valueOf(storyItem.dialogId))) == null || !a22.bot || !a22.bot_can_edit) && (storyItem.dialogId >= j3 || (M0 = qp.s1(i11).M0(Long.valueOf(-storyItem.dialogId))) == null || (!M0.creator && ((!(z10 = storyItem.out) || (tL_chatAdminRights2 = M0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z10 || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z9 = false;
                        z3 z3Var = new z3(i4Var, i4Var.getContext(), f6Var, f6Var, p9Var, g4Var.e, !i4Var.l1 || ((i4Var.m1 || i4Var.G0()) && z9), z9, context, f4Var, zArr);
                        i4Var.c1 = z3Var;
                        ImageView imageView = i4Var.f0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        z3Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) z3Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z9 = true;
                z3 z3Var2 = new z3(i4Var, i4Var.getContext(), f6Var, f6Var, p9Var, g4Var.e, !i4Var.l1 || ((i4Var.m1 || i4Var.G0()) && z9), z9, context, f4Var, zArr);
                i4Var.c1 = z3Var2;
                ImageView imageView2 = i4Var.f0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                z3Var2.a = true;
                ((org.telegram.ui.ActionBar.g1) z3Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 2:
                z3 z3Var3 = (z3) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                Context context2 = (Context) this.d;
                p9 p9Var2 = (p9) this.e;
                f4 f4Var2 = (f4) this.f;
                i4 i4Var2 = z3Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -i4Var2.a1;
                    i4Var2.a1 = i12;
                    org.telegram.messenger.g0.G3(i12, view, null);
                    org.telegram.messenger.k5.p(null, 2131744674, new hc(i4Var2.L0, f6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        z3Var3.c = true;
                        z3 z3Var4 = i4Var2.c1;
                        if (z3Var4 != null) {
                            z3Var4.a();
                        }
                        ai.d0 d0Var = new ai.d0(z3Var3, W, p9Var2, f4Var2, 12);
                        p9 p9Var3 = ((g9) i4Var2.z1).d;
                        o9 o9Var = p9Var3.z0;
                        if (o9Var != null) {
                            z11 = o9Var.release(d0Var);
                            p9Var3.z0 = null;
                        }
                        if (!z11) {
                            d0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                z3 z3Var5 = (z3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                p9 p9Var4 = (p9) this.e;
                f4 f4Var3 = (f4) this.f;
                i4 i4Var3 = z3Var5.x;
                File h = i4Var3.x1.h();
                if (h == null || !h.exists()) {
                    i4Var3.Y0();
                    break;
                } else {
                    Activity W2 = org.telegram.messenger.g0.W(context3);
                    if (W2 != null) {
                        z3Var5.c = true;
                        z3 z3Var6 = i4Var3.c1;
                        if (z3Var6 != null) {
                            z3Var6.a();
                        }
                        bi.u0 u0Var = new bi.u0(z3Var5, W2, storyItem2, p9Var4, f4Var3, 10);
                        p9 p9Var5 = ((g9) i4Var3.z1).d;
                        o9 o9Var2 = p9Var5.z0;
                        if (o9Var2 != null) {
                            z12 = o9Var2.release(u0Var);
                            p9Var5.z0 = null;
                        }
                        if (!z12) {
                            u0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                fi.d dVar = (fi.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                c20 c20Var = (c20) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) this.f;
                if (dVar.c0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        c20Var.a(strArr[0]);
                    }
                    v2Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                pj0 pj0Var = (pj0) this.e;
                org.telegram.ui.t7.a(d7Var.f, m7Var, (org.telegram.ui.o7) f7Var, pj0Var);
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.b9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.ActionBar.v2) this.f).show();
                break;
            case 7:
                an anVar = (an) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(anVar.getParentActivity(), null);
                Drawable mutate = anVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.r6.y(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.k6.G8, anVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), true, true);
                z0Var2.j(hd.M0(2131743957, null), R.drawable.msg_translate, null);
                z0Var2.setOnClickListener(new d0(anVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new fq0(g1Var2, 29)};
                g1Var2.e = true;
                g1Var2.c = qs.x3;
                g1Var2.setOutsideTouchable(true);
                g1Var2.setClippingEnabled(true);
                g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var2.setFocusable(true);
                g1Var2.showAsDropDown(f0Var, (f0Var.getWidth() / 2) - org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(-16.0f), 83);
                break;
            case 8:
                an anVar2 = (an) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                e21.U0(anVar2.getParentActivity(), anVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                org.telegram.ui.Components.u4 u4Var = (org.telegram.ui.Components.u4) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.e;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f;
                if (f2Var.getParentActivity() != null) {
                    if (u4Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.t0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.g0.F3(u4Var);
                        break;
                    } else {
                        if (f2Var instanceof u71) {
                            org.telegram.ui.ActionBar.k6.p();
                            f2Var.finishFragment();
                        }
                        if (h6Var != null) {
                            j6Var.u(h6Var.a);
                            org.telegram.ui.ActionBar.k6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.z0(u4Var, u1Var, f2Var, z11 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.v4.b0(u4Var, u1Var, f2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.c;
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.g1) atomicReference.getAndSet(null)).dismiss();
                }
                if (c9Var.b >= 0) {
                    if (q4Var.getFragmentStack() != null && c9Var.b < q4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) q4Var.getFragmentStack().get(c9Var.b);
                        if (f2Var3 instanceof an) {
                            an anVar3 = (an) f2Var3;
                            l11 = Long.valueOf(anVar3.a());
                            l10 = Long.valueOf(anVar3.b());
                        } else if (f2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) f2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.f1);
                        }
                        if ((l11 == null && l11.longValue() != c9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = q4Var.getFragmentStack().size() - 2; size > c9Var.b; size--) {
                                ((ActionBarLayout) q4Var).b0(size);
                            }
                        } else if (q4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = c9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.f2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < q4Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) q4Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (q4Var.getFragmentStack() != null) {
                    }
                }
                Class cls = c9Var.a;
                if (cls == an.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = c9Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = c9Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", c9Var.g);
                    bundle.putInt("dialog_filter_id", c9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = c9Var.e;
                    if (tL_forumTopic2 != null) {
                        f2Var2.presentFragment(qg.d.g(f2Var2, c9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        f2Var2.presentFragment(new an(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", c9Var.f);
                    f2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (c9Var.a == v91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", c9Var.c.id);
                    f2Var2.presentFragment(new v91(bundle3), true);
                }
                if (c9Var.a == ww.class) {
                    f2Var2.presentFragment(new ww(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.f2 f2Var4 = (org.telegram.ui.ActionBar.f2) this.e;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                g1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    dw0.a(tL_messages_stickerSet, f2Var4, f6Var3);
                    break;
                } else {
                    ((an) f2Var4).ya();
                    ks.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                bk bkVar = (bk) this.b;
                String str5 = (String) this.c;
                f10 f10Var = (f10) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    ed edVar = hd.E0().B;
                    HashSet d02 = qy0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(edVar.f)) {
                        qy0.f0(null, Boolean.FALSE);
                    } else {
                        qy0.f0(d02, Boolean.FALSE);
                    }
                    f10.O = null;
                }
                f10Var.g();
                f10Var.J(bkVar.b, true, false);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bkVar.r[0] ? hd.a0(null, null, 2131754356, str6) : hd.a0(null, null, 2131754355, str6));
                String[] strArr2 = e21.O1;
                if (X2.length() <= 0) {
                    X2 = null;
                } else {
                    X2.replace(0, 1, (CharSequence) X2.toString().substring(0, 1).toUpperCase());
                }
                hc.a0(bkVar.c).K(R.raw.msg_translate, X2, hd.M0(2131745496, null), new ir0(bkVar, 22)).j();
                g1Var4.d(true);
                break;
            case 13:
                gs gsVar = (gs) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                e61 e61Var = (e61) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ks ksVar = gsVar.a;
                if (ksVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ksVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            e61Var.requestLayout();
                            linearLayout.requestLayout();
                            e61Var.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            is isVar = ksVar.l;
                            if (isVar != null) {
                                isVar.w(tL_messages_stickerSet2.set, TextUtils.join("", ksVar.o));
                            }
                            ksVar.o();
                            break;
                        }
                    } else {
                        if (ksVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ksVar.l.O(TextUtils.join("", ksVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ksVar.l.B()) {
                                    ksVar.l.n(TextUtils.join("", ksVar.o));
                                } else {
                                    ksVar.l.z(TextUtils.join("", ksVar.o));
                                }
                            }
                        }
                        ksVar.o();
                        break;
                    }
                }
                break;
            case 14:
                ld0 ld0Var = (ld0) this.b;
                f5.l lVar = (f5.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                fi.d dVar2 = ld0Var.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.r3 r3Var = new org.telegram.ui.r3(ld0Var, 11);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new bi.q7(ld0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new kn0(ld0Var, lVar, r3Var, tL_inputStorePaymentAuthCode, 21)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var3 = (org.telegram.ui.ActionBar.v2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                yh0 yh0Var = (yh0) this.e;
                k60 F = k60.F(v2Var3.c, v2Var3.I0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (p10.i(intValue3).f() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.r2(yh0Var, intValue3, 20));
                    }
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ d0(org.telegram.ui.ActionBar.v2 v2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, yh0 yh0Var) {
        this.a = 15;
        this.f = v2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = yh0Var;
    }
}
