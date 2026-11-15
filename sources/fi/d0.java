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
import org.telegram.messenger.c10;
import org.telegram.messenger.dd;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.an;
import org.telegram.ui.b61;
import org.telegram.ui.bk;
import org.telegram.ui.fq0;
import org.telegram.ui.js;
import org.telegram.ui.kd0;
import org.telegram.ui.ls;
import org.telegram.ui.oy0;
import org.telegram.ui.t71;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        boolean z10;
        TLRPC.Chat M0;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User a22;
        Long l10;
        Long l11;
        int i7 = 3;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) this.c;
                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) this.d;
                b0 b0Var = (b0) this.e;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f;
                b0Var.a(Boolean.valueOf(c2Var.b()), Boolean.valueOf(c2Var2.b()), Boolean.valueOf(c2Var3.b()));
                u2Var.dismiss();
                break;
            case 1:
                b4 b4Var = (b4) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.e;
                y3 y3Var = (y3) this.f;
                z3 z3Var = b4Var.y1;
                ((z8) b4Var.A1).g(true);
                b4Var.c1 = null;
                boolean[] zArr = {false};
                if (b4Var.m1) {
                    s6 P1 = np.s1(b4Var.m2).P1();
                    j3 = 0;
                    if (P1.Q == 0) {
                        P1.S();
                    }
                    np.s1(b4Var.m2).P1().U();
                    hi.a1 a1Var = np.s1(b4Var.m2).P1().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        hi.w0 w0Var = new hi.w0(a1Var, i10);
                        vr a02 = vr.a0(a1Var.a);
                        a02.a.c(new di.m6(a02, z12, w0Var, i7));
                    }
                } else {
                    j3 = 0;
                }
                if (!b4Var.m1) {
                    s6 P12 = np.s1(b4Var.m2).P1();
                    TL_stories.StoryItem storyItem = z3Var.a;
                    int i11 = P12.a;
                    if (storyItem == null || storyItem.dialogId == m10.i(i11).e() || ((storyItem.dialogId <= j3 || (a22 = np.s1(i11).a2(Long.valueOf(storyItem.dialogId))) == null || !a22.bot || !a22.bot_can_edit) && (storyItem.dialogId >= j3 || (M0 = np.s1(i11).M0(Long.valueOf(-storyItem.dialogId))) == null || (!M0.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = M0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        t3 t3Var = new t3(b4Var, b4Var.getContext(), e6Var, e6Var, i9Var, z3Var.e, !b4Var.m1 || ((b4Var.n1 || b4Var.G0()) && z10), z10, context, y3Var, zArr);
                        b4Var.d1 = t3Var;
                        ImageView imageView = b4Var.g0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        t3Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) t3Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z10 = true;
                t3 t3Var2 = new t3(b4Var, b4Var.getContext(), e6Var, e6Var, i9Var, z3Var.e, !b4Var.m1 || ((b4Var.n1 || b4Var.G0()) && z10), z10, context, y3Var, zArr);
                b4Var.d1 = t3Var2;
                ImageView imageView2 = b4Var.g0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                t3Var2.a = true;
                ((org.telegram.ui.ActionBar.g1) t3Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 2:
                t3 t3Var3 = (t3) this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.e;
                y3 y3Var2 = (y3) this.f;
                b4 b4Var2 = t3Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -b4Var2.b1;
                    b4Var2.b1 = i12;
                    org.telegram.messenger.g0.F3(i12, view, null);
                    org.telegram.messenger.k5.o(null, 2131744673, new cc(b4Var2.M0, e6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        t3Var3.c = true;
                        t3 t3Var4 = b4Var2.d1;
                        if (t3Var4 != null) {
                            t3Var4.a();
                        }
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(t3Var3, W, i9Var2, y3Var2, 13);
                        i9 i9Var3 = ((z8) b4Var2.A1).d;
                        h9 h9Var = i9Var3.A0;
                        if (h9Var != null) {
                            z12 = h9Var.release(aVar);
                            i9Var3.A0 = null;
                        }
                        if (!z12) {
                            aVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                t3 t3Var5 = (t3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.e;
                y3 y3Var3 = (y3) this.f;
                b4 b4Var3 = t3Var5.x;
                File h = b4Var3.y1.h();
                if (h == null || !h.exists()) {
                    b4Var3.Y0();
                    break;
                } else {
                    Activity W2 = org.telegram.messenger.g0.W(context3);
                    if (W2 != null) {
                        t3Var5.c = true;
                        t3 t3Var6 = b4Var3.d1;
                        if (t3Var6 != null) {
                            t3Var6.a();
                        }
                        ai.b bVar = new ai.b(t3Var5, W2, storyItem2, i9Var4, y3Var3, 12);
                        i9 i9Var5 = ((z8) b4Var3.A1).d;
                        h9 h9Var2 = i9Var5.A0;
                        if (h9Var2 != null) {
                            z13 = h9Var2.release(bVar);
                            i9Var5.A0 = null;
                        }
                        if (!z13) {
                            bVar.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                hi.d dVar = (hi.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                z10 z10Var = (z10) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) this.f;
                if (dVar.d0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        z10Var.a(strArr[0]);
                    }
                    u2Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                uj0 uj0Var = (uj0) this.e;
                org.telegram.ui.t7.a(d7Var.f, m7Var, (org.telegram.ui.o7) f7Var, uj0Var);
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.b9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.e6) this.e, (org.telegram.ui.ActionBar.u2) this.f).show();
                break;
            case 7:
                an anVar = (an) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(anVar.getParentActivity(), null);
                Drawable mutate = anVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.q6.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.j6.G8, anVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), true, true);
                z0Var.j(hd.M0(2131743956, null), R.drawable.msg_translate, null);
                z0Var.setOnClickListener(new d0(anVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new fq0(g1Var2, 29)};
                g1Var2.e = true;
                g1Var2.c = ns.x3;
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
                p21.V0(anVar2.getParentActivity(), anVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f;
                if (e2Var.getParentActivity() != null) {
                    if (s4Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.t0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.g0.E3(s4Var);
                        break;
                    } else {
                        if (e2Var instanceof t71) {
                            org.telegram.ui.ActionBar.j6.p();
                            e2Var.finishFragment();
                        }
                        if (g6Var != null) {
                            i6Var.u(g6Var.a);
                            org.telegram.ui.ActionBar.j6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.w0(s4Var, t1Var, e2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.t4.b0(s4Var, t1Var, e2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.c;
                org.telegram.ui.ActionBar.o4 o4Var = (org.telegram.ui.ActionBar.o4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.g1) atomicReference.getAndSet(null)).dismiss();
                }
                if (z8Var.b >= 0) {
                    if (o4Var.getFragmentStack() != null && z8Var.b < o4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) o4Var.getFragmentStack().get(z8Var.b);
                        if (e2Var3 instanceof an) {
                            an anVar3 = (an) e2Var3;
                            l11 = Long.valueOf(anVar3.a());
                            l10 = Long.valueOf(anVar3.b());
                        } else if (e2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) e2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l11 == null && l11.longValue() != z8Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = o4Var.getFragmentStack().size() - 2; size > z8Var.b; size--) {
                                ((ActionBarLayout) o4Var).b0(size);
                            }
                        } else if (o4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(o4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = z8Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.e2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < o4Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) o4Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (o4Var.getFragmentStack() != null) {
                    }
                }
                Class cls = z8Var.a;
                if (cls == an.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = z8Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = z8Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", z8Var.g);
                    bundle.putInt("dialog_filter_id", z8Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = z8Var.e;
                    if (tL_forumTopic2 != null) {
                        e2Var2.presentFragment(qg.c.g(e2Var2, z8Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        e2Var2.presentFragment(new an(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", z8Var.f);
                    e2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (z8Var.a == u91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", z8Var.c.id);
                    e2Var2.presentFragment(new u91(bundle3), true);
                }
                if (z8Var.a == yw.class) {
                    e2Var2.presentFragment(new yw(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.e2 e2Var4 = (org.telegram.ui.ActionBar.e2) this.e;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                g1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    gw0.a(tL_messages_stickerSet, e2Var4, e6Var3);
                    break;
                } else {
                    ((an) e2Var4).Ba();
                    org.telegram.ui.ns.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                bk bkVar = (bk) this.b;
                String str5 = (String) this.c;
                c10 c10Var = (c10) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    dd ddVar = hd.E0().B;
                    HashSet d02 = oy0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(ddVar.f)) {
                        oy0.f0(null, Boolean.FALSE);
                    } else {
                        oy0.f0(d02, Boolean.FALSE);
                    }
                    c10.P = null;
                }
                c10Var.g();
                c10Var.J(bkVar.b, true, false);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bkVar.r[0] ? hd.a0(null, null, 2131754356, str6) : hd.a0(null, null, 2131754355, str6));
                String[] strArr2 = p21.S1;
                if (X2.length() <= 0) {
                    X2 = null;
                } else {
                    X2.replace(0, 1, (CharSequence) X2.toString().substring(0, 1).toUpperCase());
                }
                cc.a0(bkVar.c).K(R.raw.msg_translate, X2, hd.M0(2131745495, null), new ro0(bkVar, 26)).j();
                g1Var4.d(true);
                break;
            case 13:
                js jsVar = (js) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                b61 b61Var = (b61) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                org.telegram.ui.ns nsVar = jsVar.a;
                if (nsVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nsVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            b61Var.requestLayout();
                            linearLayout.requestLayout();
                            b61Var.getAdapter().f();
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
                                if (nsVar.l.A()) {
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
                kd0 kd0Var = (kd0) this.b;
                f5.m mVar = (f5.m) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                hi.d dVar2 = kd0Var.b;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    org.telegram.ui.r3 r3Var = new org.telegram.ui.r3(kd0Var, 11);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new di.i6(kd0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new ma0(kd0Var, mVar, r3Var, tL_inputStorePaymentAuthCode, 24)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var3 = (org.telegram.ui.ActionBar.u2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                ai0 ai0Var = (ai0) this.e;
                m60 F = m60.F(u2Var3.c, u2Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (m10.i(intValue3).f() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.a2(ai0Var, intValue3, 23));
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

    public /* synthetic */ d0(org.telegram.ui.ActionBar.u2 u2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, ai0 ai0Var) {
        this.a = 15;
        this.f = u2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = ai0Var;
    }
}
