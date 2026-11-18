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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ck;
import org.telegram.ui.cx;
import org.telegram.ui.di0;
import org.telegram.ui.f61;
import org.telegram.ui.hq0;
import org.telegram.ui.ii;
import org.telegram.ui.js;
import org.telegram.ui.ld0;
import org.telegram.ui.ls;
import org.telegram.ui.ns;
import org.telegram.ui.sy0;
import org.telegram.ui.x71;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) this.c;
                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) this.d;
                b0 b0Var = (b0) this.e;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f;
                b0Var.a(Boolean.valueOf(c2Var.b()), Boolean.valueOf(c2Var2.b()), Boolean.valueOf(c2Var3.b()));
                x2Var.dismiss();
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
                    hi.b1 b1Var = mp.u1(z3Var.m2).R1().w;
                    if (!b1Var.c && !b1Var.d) {
                        b1Var.d = true;
                        hi.x0 x0Var = new hi.x0(b1Var, i10);
                        tr a02 = tr.a0(b1Var.a);
                        a02.a.c(new di.p6(a02, z12, x0Var, i7));
                    }
                } else {
                    j3 = 0;
                }
                if (!z3Var.m1) {
                    p6 R12 = mp.u1(z3Var.m2).R1();
                    TL_stories.StoryItem storyItem = x3Var.a;
                    int i11 = R12.a;
                    if (storyItem == null || storyItem.dialogId == j10.i(i11).e() || ((storyItem.dialogId <= j3 || (c22 = mp.u1(i11).c2(Long.valueOf(storyItem.dialogId))) == null || !c22.bot || !c22.bot_can_edit) && (storyItem.dialogId >= j3 || (O0 = mp.u1(i11).O0(Long.valueOf(-storyItem.dialogId))) == null || (!O0.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = O0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        r3 r3Var = new r3(z3Var, z3Var.getContext(), i6Var, i6Var, f9Var, x3Var.e, !z3Var.m1 || ((z3Var.n1 || z3Var.G0()) && z10), z10, context, w3Var, zArr);
                        z3Var.d1 = r3Var;
                        ImageView imageView = z3Var.g0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        r3Var.a = true;
                        ((org.telegram.ui.ActionBar.h1) r3Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z10 = true;
                r3 r3Var2 = new r3(z3Var, z3Var.getContext(), i6Var, i6Var, f9Var, x3Var.e, !z3Var.m1 || ((z3Var.n1 || z3Var.G0()) && z10), z10, context, w3Var, zArr);
                z3Var.d1 = r3Var2;
                ImageView imageView2 = z3Var.g0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                r3Var2.a = true;
                ((org.telegram.ui.ActionBar.h1) r3Var2.b).showAsDropDown(imageView2, 0, L2);
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
                    org.telegram.messenger.f3.o(null, 2131744438, new lc(z3Var2.M0, i6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        r3Var3.c = true;
                        r3 r3Var4 = z3Var2.d1;
                        if (r3Var4 != null) {
                            r3Var4.a();
                        }
                        ai.s sVar = new ai.s(r3Var3, W, f9Var2, w3Var2, 16);
                        f9 f9Var3 = ((w8) z3Var2.A1).d;
                        e9 e9Var = f9Var3.A0;
                        if (e9Var != null) {
                            z12 = e9Var.release(sVar);
                            f9Var3.A0 = null;
                        }
                        if (!z12) {
                            sVar.run();
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
                        ai.b bVar = new ai.b(r3Var5, W2, storyItem2, f9Var4, w3Var3, 13);
                        f9 f9Var5 = ((w8) z3Var3.A1).d;
                        e9 e9Var2 = f9Var5.A0;
                        if (e9Var2 != null) {
                            z13 = e9Var2.release(bVar);
                            f9Var5.A0 = null;
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
                x10 x10Var = (x10) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) this.f;
                if (dVar.e0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        x10Var.a(strArr[0]);
                    }
                    x2Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.b;
                org.telegram.ui.l7 l7Var = (org.telegram.ui.l7) this.c;
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.d;
                ck0 ck0Var = (ck0) this.e;
                org.telegram.ui.s7.a(c7Var.f, l7Var, (org.telegram.ui.n7) e7Var, ck0Var);
                org.telegram.ui.ActionBar.h1 h1Var = c7Var.a;
                if (h1Var != null) {
                    h1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.b9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.i6) this.e, (org.telegram.ui.ActionBar.x2) this.f).show();
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
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(bnVar.getParentActivity(), true, true);
                z0Var.j(gd.M0(2131743719, null), R.drawable.msg_translate, null);
                z0Var.setOnClickListener(new d0(bnVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new hq0(h1Var2, 29)};
                h1Var2.e = true;
                h1Var2.c = ks.x3;
                h1Var2.setOutsideTouchable(true);
                h1Var2.setClippingEnabled(true);
                h1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                h1Var2.setFocusable(true);
                h1Var2.showAsDropDown(g0Var, (g0Var.getWidth() / 2) - org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(-16.0f), 83);
                break;
            case 8:
                bn bnVar2 = (bn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                y21.W0(bnVar2.getParentActivity(), bnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.b;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.c;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.d;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.e;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f;
                if (h2Var.getParentActivity() != null) {
                    if (a5Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.t0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.g0.D3(a5Var);
                        break;
                    } else {
                        if (h2Var instanceof x71) {
                            org.telegram.ui.ActionBar.n6.p();
                            h2Var.finishFragment();
                        }
                        if (k6Var != null) {
                            m6Var.u(k6Var.a);
                            org.telegram.ui.ActionBar.n6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.h1(a5Var, u1Var, h2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.b5.b0(a5Var, u1Var, h2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.c;
                org.telegram.ui.ActionBar.s4 s4Var = (org.telegram.ui.ActionBar.s4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.h1) atomicReference.getAndSet(null)).dismiss();
                }
                if (h9Var.b >= 0) {
                    if (s4Var.getFragmentStack() != null && h9Var.b < s4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) s4Var.getFragmentStack().get(h9Var.b);
                        if (h2Var3 instanceof bn) {
                            bn bnVar3 = (bn) h2Var3;
                            l11 = Long.valueOf(bnVar3.a());
                            l10 = Long.valueOf(bnVar3.d());
                        } else if (h2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) h2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l11 == null && l11.longValue() != h9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = s4Var.getFragmentStack().size() - 2; size > h9Var.b; size--) {
                                ((ActionBarLayout) s4Var).b0(size);
                            }
                        } else if (s4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(s4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = h9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.h2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < s4Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) s4Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (s4Var.getFragmentStack() != null) {
                    }
                }
                Class cls = h9Var.a;
                if (cls == bn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = h9Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = h9Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", h9Var.g);
                    bundle.putInt("dialog_filter_id", h9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = h9Var.e;
                    if (tL_forumTopic2 != null) {
                        h2Var2.presentFragment(qg.c.h(h2Var2, h9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        h2Var2.presentFragment(new bn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", h9Var.f);
                    h2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (h9Var.a == y91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", h9Var.c.id);
                    h2Var2.presentFragment(new y91(bundle3), true);
                }
                if (h9Var.a == cx.class) {
                    h2Var2.presentFragment(new cx(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.h1 h1Var3 = (org.telegram.ui.ActionBar.h1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.h2 h2Var4 = (org.telegram.ui.ActionBar.h2) this.e;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                h1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    nw0.a(tL_messages_stickerSet, h2Var4, i6Var3);
                    break;
                } else {
                    ((bn) h2Var4).Ba();
                    ns.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                ck ckVar = (ck) this.b;
                String str5 = (String) this.c;
                z00 z00Var = (z00) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.h1 h1Var4 = (org.telegram.ui.ActionBar.h1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    cd cdVar = gd.E0().B;
                    HashSet d02 = sy0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(cdVar.f)) {
                        sy0.f0(null, Boolean.FALSE);
                    } else {
                        sy0.f0(d02, Boolean.FALSE);
                    }
                    z00.P = null;
                }
                z00Var.g();
                z00Var.J(ckVar.b, true, false);
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(ckVar.r[0] ? gd.a0(null, null, 2131754354, str6) : gd.a0(null, null, 2131754353, str6));
                String[] strArr2 = y21.S1;
                if (W22.length() <= 0) {
                    W22 = null;
                } else {
                    W22.replace(0, 1, (CharSequence) W22.toString().substring(0, 1).toUpperCase());
                }
                lc.b0(ckVar.c).K(R.raw.msg_translate, W22, gd.M0(2131745300, null), new ap0(ckVar, 25)).j();
                h1Var4.d(true);
                break;
            case 13:
                js jsVar = (js) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                f61 f61Var = (f61) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ns nsVar = jsVar.a;
                if (nsVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nsVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            f61Var.requestLayout();
                            linearLayout.requestLayout();
                            f61Var.getAdapter().f();
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
                ld0 ld0Var = (ld0) this.b;
                f5.m mVar = (f5.m) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                hi.d dVar2 = ld0Var.b;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    org.telegram.ui.r3 r3Var7 = new org.telegram.ui.r3(ld0Var, 12);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new di.l6(ld0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new n20(ld0Var, mVar, r3Var7, tL_inputStorePaymentAuthCode, 28)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var3 = (org.telegram.ui.ActionBar.x2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                di0 di0Var = (di0) this.e;
                y60 G = y60.G(x2Var3.c, x2Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (j10.i(intValue3).f() != null) {
                        G.e(intValue3, iArr[0] == intValue3, new ii(di0Var, intValue3, 26));
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

    public /* synthetic */ d0(org.telegram.ui.ActionBar.x2 x2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, di0 di0Var) {
        this.a = 15;
        this.f = x2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = di0Var;
    }
}
