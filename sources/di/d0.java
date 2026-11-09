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
import org.telegram.messenger.f10;
import org.telegram.messenger.fd;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.cn;
import org.telegram.ui.dk;
import org.telegram.ui.f61;
import org.telegram.ui.iq0;
import org.telegram.ui.is;
import org.telegram.ui.ks;
import org.telegram.ui.ms;
import org.telegram.ui.nd0;
import org.telegram.ui.ty0;
import org.telegram.ui.w71;
import org.telegram.ui.y91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                j4 j4Var = (j4) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                q9 q9Var = (q9) this.d;
                Context context = (Context) this.e;
                g4 g4Var = (g4) this.f;
                h4 h4Var = j4Var.x1;
                ((h9) j4Var.z1).g(true);
                j4Var.b1 = null;
                boolean[] zArr = {false};
                if (j4Var.l1) {
                    z6 P1 = qp.s1(j4Var.l2).P1();
                    j3 = 0;
                    if (P1.Q == 0) {
                        P1.S();
                    }
                    qp.s1(j4Var.l2).P1().U();
                    fi.z0 z0Var = qp.s1(j4Var.l2).P1().w;
                    if (!z0Var.c && !z0Var.d) {
                        z0Var.d = true;
                        fi.v0 v0Var = new fi.v0(z0Var, i10);
                        yr a02 = yr.a0(z0Var.a);
                        a02.a.c(new bi.u7(a02, z11, v0Var, i7));
                    }
                } else {
                    j3 = 0;
                }
                if (!j4Var.l1) {
                    z6 P12 = qp.s1(j4Var.l2).P1();
                    TL_stories.StoryItem storyItem = h4Var.a;
                    int i11 = P12.a;
                    if (storyItem == null || storyItem.dialogId == p10.i(i11).e() || ((storyItem.dialogId <= j3 || (a22 = qp.s1(i11).a2(Long.valueOf(storyItem.dialogId))) == null || !a22.bot || !a22.bot_can_edit) && (storyItem.dialogId >= j3 || (M0 = qp.s1(i11).M0(Long.valueOf(-storyItem.dialogId))) == null || (!M0.creator && ((!(z10 = storyItem.out) || (tL_chatAdminRights2 = M0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z10 || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z9 = false;
                        a4 a4Var = new a4(j4Var, j4Var.getContext(), g6Var, g6Var, q9Var, h4Var.e, !j4Var.l1 || ((j4Var.m1 || j4Var.G0()) && z9), z9, context, g4Var, zArr);
                        j4Var.c1 = a4Var;
                        ImageView imageView = j4Var.f0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        a4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) a4Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z9 = true;
                a4 a4Var2 = new a4(j4Var, j4Var.getContext(), g6Var, g6Var, q9Var, h4Var.e, !j4Var.l1 || ((j4Var.m1 || j4Var.G0()) && z9), z9, context, g4Var, zArr);
                j4Var.c1 = a4Var2;
                ImageView imageView2 = j4Var.f0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                a4Var2.a = true;
                ((org.telegram.ui.ActionBar.g1) a4Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 2:
                a4 a4Var3 = (a4) this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.c;
                Context context2 = (Context) this.d;
                q9 q9Var2 = (q9) this.e;
                g4 g4Var2 = (g4) this.f;
                j4 j4Var2 = a4Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -j4Var2.a1;
                    j4Var2.a1 = i12;
                    org.telegram.messenger.g0.G3(i12, view, null);
                    org.telegram.messenger.k5.p(null, 2131744673, new hc(j4Var2.L0, g6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        a4Var3.c = true;
                        a4 a4Var4 = j4Var2.c1;
                        if (a4Var4 != null) {
                            a4Var4.a();
                        }
                        ai.d0 d0Var = new ai.d0(a4Var3, W, q9Var2, g4Var2, 12);
                        q9 q9Var3 = ((h9) j4Var2.z1).d;
                        p9 p9Var = q9Var3.z0;
                        if (p9Var != null) {
                            z11 = p9Var.release(d0Var);
                            q9Var3.z0 = null;
                        }
                        if (!z11) {
                            d0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                a4 a4Var5 = (a4) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                q9 q9Var4 = (q9) this.e;
                g4 g4Var3 = (g4) this.f;
                j4 j4Var3 = a4Var5.x;
                File h = j4Var3.x1.h();
                if (h == null || !h.exists()) {
                    j4Var3.Y0();
                    break;
                } else {
                    Activity W2 = org.telegram.messenger.g0.W(context3);
                    if (W2 != null) {
                        a4Var5.c = true;
                        a4 a4Var6 = j4Var3.c1;
                        if (a4Var6 != null) {
                            a4Var6.a();
                        }
                        bi.u0 u0Var = new bi.u0(a4Var5, W2, storyItem2, q9Var4, g4Var3, 10);
                        q9 q9Var5 = ((h9) j4Var3.z1).d;
                        p9 p9Var2 = q9Var5.z0;
                        if (p9Var2 != null) {
                            z12 = p9Var2.release(u0Var);
                            q9Var5.z0 = null;
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
                qj0 qj0Var = (qj0) this.e;
                org.telegram.ui.t7.a(d7Var.f, m7Var, (org.telegram.ui.o7) f7Var, qj0Var);
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.b9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.g6) this.e, (org.telegram.ui.ActionBar.v2) this.f).show();
                break;
            case 7:
                cn cnVar = (cn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(cnVar.getParentActivity(), null);
                Drawable mutate = cnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.s6.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.l6.G8, cnVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(cnVar.getParentActivity(), true, true);
                z0Var2.j(id.M0(2131743956, null), R.drawable.msg_translate, null);
                z0Var2.setOnClickListener(new d0(cnVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new iq0(g1Var2, 29)};
                g1Var2.e = true;
                g1Var2.c = qs.x3;
                g1Var2.setOutsideTouchable(true);
                g1Var2.setClippingEnabled(true);
                g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var2.setFocusable(true);
                g1Var2.showAsDropDown(f0Var, (f0Var.getWidth() / 2) - org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(-16.0f), 83);
                break;
            case 8:
                cn cnVar2 = (cn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                l21.U0(cnVar2.getParentActivity(), cnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                org.telegram.ui.Components.u4 u4Var = (org.telegram.ui.Components.u4) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.e;
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
                        if (f2Var instanceof w71) {
                            org.telegram.ui.ActionBar.l6.p();
                            f2Var.finishFragment();
                        }
                        if (i6Var != null) {
                            k6Var.u(i6Var.a);
                            org.telegram.ui.ActionBar.l6.t1(false, false);
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
                        if (f2Var3 instanceof cn) {
                            cn cnVar3 = (cn) f2Var3;
                            l11 = Long.valueOf(cnVar3.a());
                            l10 = Long.valueOf(cnVar3.b());
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
                if (cls == cn.class) {
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
                        f2Var2.presentFragment(new cn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", c9Var.f);
                    f2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (c9Var.a == y91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", c9Var.c.id);
                    f2Var2.presentFragment(new y91(bundle3), true);
                }
                if (c9Var.a == yw.class) {
                    f2Var2.presentFragment(new yw(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.f2 f2Var4 = (org.telegram.ui.ActionBar.f2) this.e;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                g1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ew0.a(tL_messages_stickerSet, f2Var4, g6Var3);
                    break;
                } else {
                    ((cn) f2Var4).Aa();
                    ms.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                dk dkVar = (dk) this.b;
                String str5 = (String) this.c;
                f10 f10Var = (f10) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    fd fdVar = id.E0().B;
                    HashSet d02 = ty0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(fdVar.f)) {
                        ty0.f0(null, Boolean.FALSE);
                    } else {
                        ty0.f0(d02, Boolean.FALSE);
                    }
                    f10.O = null;
                }
                f10Var.g();
                f10Var.J(dkVar.b, true, false);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(dkVar.r[0] ? id.a0(null, null, 2131754356, str6) : id.a0(null, null, 2131754355, str6));
                String[] strArr2 = l21.O1;
                if (X2.length() <= 0) {
                    X2 = null;
                } else {
                    X2.replace(0, 1, (CharSequence) X2.toString().substring(0, 1).toUpperCase());
                }
                hc.a0(dkVar.c).K(R.raw.msg_translate, X2, id.M0(2131745495, null), new kr0(dkVar, 23)).j();
                g1Var4.d(true);
                break;
            case 13:
                is isVar = (is) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                f61 f61Var = (f61) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ms msVar = isVar.a;
                if (msVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = msVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            f61Var.requestLayout();
                            linearLayout.requestLayout();
                            f61Var.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ks ksVar = msVar.l;
                            if (ksVar != null) {
                                ksVar.w(tL_messages_stickerSet2.set, TextUtils.join("", msVar.o));
                            }
                            msVar.o();
                            break;
                        }
                    } else {
                        if (msVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                msVar.l.O(TextUtils.join("", msVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (msVar.l.B()) {
                                    msVar.l.n(TextUtils.join("", msVar.o));
                                } else {
                                    msVar.l.z(TextUtils.join("", msVar.o));
                                }
                            }
                        }
                        msVar.o();
                        break;
                    }
                }
                break;
            case 14:
                nd0 nd0Var = (nd0) this.b;
                f5.l lVar = (f5.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                fi.d dVar2 = nd0Var.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.r3 r3Var = new org.telegram.ui.r3(nd0Var, 11);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new bi.q7(nd0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new ln0(nd0Var, lVar, r3Var, tL_inputStorePaymentAuthCode, 21)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var3 = (org.telegram.ui.ActionBar.v2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                ai0 ai0Var = (ai0) this.e;
                l60 F = l60.F(v2Var3.c, v2Var3.I0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (p10.i(intValue3).f() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.r2(ai0Var, intValue3, 20));
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

    public /* synthetic */ d0(org.telegram.ui.ActionBar.v2 v2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, ai0 ai0Var) {
        this.a = 15;
        this.f = v2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = ai0Var;
    }
}
