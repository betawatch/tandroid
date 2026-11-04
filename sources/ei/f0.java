package ei;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.x00;
import org.telegram.messenger.yc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.es;
import org.telegram.ui.gs;
import org.telegram.ui.gy0;
import org.telegram.ui.id0;
import org.telegram.ui.is;
import org.telegram.ui.l71;
import org.telegram.ui.m91;
import org.telegram.ui.u51;
import org.telegram.ui.uw;
import org.telegram.ui.vh0;
import org.telegram.ui.wm;
import org.telegram.ui.xj;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
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
        long j10;
        boolean z10;
        TLRPC.Chat M0;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User a22;
        Long l10;
        Long l11;
        int i3 = 3;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) this.c;
                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) this.d;
                d0 d0Var = (d0) this.e;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f;
                d0Var.a(Boolean.valueOf(c2Var.b()), Boolean.valueOf(c2Var2.b()), Boolean.valueOf(c2Var3.b()));
                t2Var.dismiss();
                break;
            case 1:
                j4 j4Var = (j4) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                r9 r9Var = (r9) this.d;
                Context context = (Context) this.e;
                g4 g4Var = (g4) this.f;
                h4 h4Var = j4Var.y1;
                ((i9) j4Var.A1).g(true);
                j4Var.c1 = null;
                boolean[] zArr = {false};
                if (j4Var.m1) {
                    z6 P1 = hp.s1(j4Var.m2).P1();
                    j10 = 0;
                    if (P1.Q == 0) {
                        P1.S();
                    }
                    hp.s1(j4Var.m2).P1().U();
                    gi.z0 z0Var = hp.s1(j4Var.m2).P1().w;
                    if (!z0Var.c && !z0Var.d) {
                        z0Var.d = true;
                        gi.v0 v0Var = new gi.v0(z0Var, i10);
                        qr a02 = qr.a0(z0Var.a);
                        a02.a.c(new ci.v6(a02, z12, v0Var, i3));
                    }
                } else {
                    j10 = 0;
                }
                if (!j4Var.m1) {
                    z6 P12 = hp.s1(j4Var.m2).P1();
                    TL_stories.StoryItem storyItem = h4Var.a;
                    int i11 = P12.a;
                    if (storyItem == null || storyItem.dialogId == h10.i(i11).e() || ((storyItem.dialogId <= j10 || (a22 = hp.s1(i11).a2(Long.valueOf(storyItem.dialogId))) == null || !a22.bot || !a22.bot_can_edit) && (storyItem.dialogId >= j10 || (M0 = hp.s1(i11).M0(Long.valueOf(-storyItem.dialogId))) == null || (!M0.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = M0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        b4 b4Var = new b4(j4Var, j4Var.getContext(), e6Var, e6Var, r9Var, h4Var.e, !j4Var.m1 || ((j4Var.n1 || j4Var.G0()) && z10), z10, context, g4Var, zArr);
                        j4Var.d1 = b4Var;
                        ImageView imageView = j4Var.g0;
                        int L = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        b4Var.a = true;
                        ((org.telegram.ui.ActionBar.f1) b4Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z10 = true;
                b4 b4Var2 = new b4(j4Var, j4Var.getContext(), e6Var, e6Var, r9Var, h4Var.e, !j4Var.m1 || ((j4Var.n1 || j4Var.G0()) && z10), z10, context, g4Var, zArr);
                j4Var.d1 = b4Var2;
                ImageView imageView2 = j4Var.g0;
                int L2 = org.telegram.messenger.g0.L(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                b4Var2.a = true;
                ((org.telegram.ui.ActionBar.f1) b4Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 2:
                b4 b4Var3 = (b4) this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
                Context context2 = (Context) this.d;
                r9 r9Var2 = (r9) this.e;
                g4 g4Var2 = (g4) this.f;
                j4 j4Var2 = b4Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -j4Var2.b1;
                    j4Var2.b1 = i12;
                    org.telegram.messenger.g0.G3(i12, view, null);
                    org.telegram.messenger.k5.p(null, 2131744683, new fc(j4Var2.M0, e6Var2), null);
                    break;
                } else {
                    Activity W = org.telegram.messenger.g0.W(context2);
                    if (W != null) {
                        b4Var3.c = true;
                        b4 b4Var4 = j4Var2.d1;
                        if (b4Var4 != null) {
                            b4Var4.a();
                        }
                        ai.z3 z3Var = new ai.z3(b4Var3, W, r9Var2, g4Var2, 13);
                        r9 r9Var3 = ((i9) j4Var2.A1).d;
                        q9 q9Var = r9Var3.A0;
                        if (q9Var != null) {
                            z12 = q9Var.release(z3Var);
                            r9Var3.A0 = null;
                        }
                        if (!z12) {
                            z3Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                b4 b4Var5 = (b4) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                r9 r9Var4 = (r9) this.e;
                g4 g4Var3 = (g4) this.f;
                j4 j4Var3 = b4Var5.x;
                File h = j4Var3.y1.h();
                if (h == null || !h.exists()) {
                    j4Var3.Y0();
                    break;
                } else {
                    Activity W2 = org.telegram.messenger.g0.W(context3);
                    if (W2 != null) {
                        b4Var5.c = true;
                        b4 b4Var6 = j4Var3.d1;
                        if (b4Var6 != null) {
                            b4Var6.a();
                        }
                        ai.t6 t6Var = new ai.t6((Object) b4Var5, (Object) W2, (Object) storyItem2, (Object) r9Var4, (Object) g4Var3, 11);
                        r9 r9Var5 = ((i9) j4Var3.A1).d;
                        q9 q9Var2 = r9Var5.A0;
                        if (q9Var2 != null) {
                            z13 = q9Var2.release(t6Var);
                            r9Var5.A0 = null;
                        }
                        if (!z13) {
                            t6Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                gi.d dVar = (gi.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                u10 u10Var = (u10) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) this.f;
                if (dVar.d0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        u10Var.a(strArr[0]);
                    }
                    t2Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.b;
                org.telegram.ui.n7 n7Var = (org.telegram.ui.n7) this.c;
                org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) this.d;
                tj0 tj0Var = (tj0) this.e;
                org.telegram.ui.u7.a(e7Var.f, n7Var, (org.telegram.ui.p7) g7Var, tj0Var);
                org.telegram.ui.ActionBar.f1 f1Var = e7Var.a;
                if (f1Var != null) {
                    f1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.a9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.e6) this.e, (org.telegram.ui.ActionBar.t2) this.f).show();
                break;
            case 7:
                wm wmVar = (wm) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wmVar.getParentActivity(), null);
                Drawable mutate = wmVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.r6.y(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.k6.G8, wmVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(wmVar.getParentActivity(), true, true);
                y0Var.j(bd.M0(2131743966, null), R.drawable.msg_translate, null);
                y0Var.setOnClickListener(new f0(wmVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new xp0(f1Var2, 29)};
                f1Var2.e = true;
                f1Var2.c = hs.x3;
                f1Var2.setOutsideTouchable(true);
                f1Var2.setClippingEnabled(true);
                f1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                f1Var2.setFocusable(true);
                f1Var2.showAsDropDown(f0Var, (f0Var.getWidth() / 2) - org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(-16.0f), 83);
                break;
            case 8:
                wm wmVar2 = (wm) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                f21.U0(wmVar2.getParentActivity(), wmVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.e;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f;
                if (d2Var.getParentActivity() != null) {
                    if (s4Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) org.telegram.messenger.t0.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        org.telegram.messenger.g0.F3(s4Var);
                        break;
                    } else {
                        if (d2Var instanceof l71) {
                            org.telegram.ui.ActionBar.k6.p();
                            d2Var.finishFragment();
                        }
                        if (g6Var != null) {
                            j6Var.u(g6Var.a);
                            org.telegram.ui.ActionBar.k6.t1(false, false);
                            Utilities.g.c(new org.telegram.ui.Components.y0(s4Var, s1Var, d2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.t4.d0(s4Var, s1Var, d2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) this.c;
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.f1) atomicReference.getAndSet(null)).dismiss();
                }
                if (a9Var.b >= 0) {
                    if (q4Var.getFragmentStack() != null && a9Var.b < q4Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) q4Var.getFragmentStack().get(a9Var.b);
                        if (d2Var3 instanceof wm) {
                            wm wmVar3 = (wm) d2Var3;
                            l11 = Long.valueOf(wmVar3.a());
                            l10 = Long.valueOf(wmVar3.b());
                        } else if (d2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) d2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l11 == null && l11.longValue() != a9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = q4Var.getFragmentStack().size() - 2; size > a9Var.b; size--) {
                                ((ActionBarLayout) q4Var).b0(size);
                            }
                        } else if (q4Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(q4Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = a9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.d2) arrayList.get(size2)).removeSelfFromStack();
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
                Class cls = a9Var.a;
                if (cls == wm.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = a9Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = a9Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", a9Var.g);
                    bundle.putInt("dialog_filter_id", a9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = a9Var.e;
                    if (tL_forumTopic2 != null) {
                        d2Var2.presentFragment(rg.c.g(d2Var2, a9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        d2Var2.presentFragment(new wm(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", a9Var.f);
                    d2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (a9Var.a == m91.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", a9Var.c.id);
                    d2Var2.presentFragment(new m91(bundle3), true);
                }
                if (a9Var.a == uw.class) {
                    d2Var2.presentFragment(new uw(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) this.e;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                f1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    cw0.a(tL_messages_stickerSet, d2Var4, e6Var3);
                    break;
                } else {
                    ((wm) d2Var4).ya();
                    is.p().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                xj xjVar = (xj) this.b;
                String str5 = (String) this.c;
                x00 x00Var = (x00) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    yc ycVar = bd.E0().B;
                    HashSet d02 = gy0.d0();
                    d02.add(lowerCase);
                    if (d02.size() == 1 && d02.contains(ycVar.f)) {
                        gy0.f0(null, Boolean.FALSE);
                    } else {
                        gy0.f0(d02, Boolean.FALSE);
                    }
                    x00.P = null;
                }
                x00Var.g();
                x00Var.J(xjVar.b, true, false);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(xjVar.r[0] ? bd.a0(null, null, 2131754356, str6) : bd.a0(null, null, 2131754355, str6));
                String[] strArr2 = f21.P1;
                if (X2.length() <= 0) {
                    X2 = null;
                } else {
                    X2.replace(0, 1, (CharSequence) X2.toString().substring(0, 1).toUpperCase());
                }
                fc.a0(xjVar.c).K(R.raw.msg_translate, X2, bd.M0(2131745505, null), new sp0(xjVar, 24)).j();
                f1Var4.d(true);
                break;
            case 13:
                es esVar = (es) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                u51 u51Var = (u51) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                is isVar = esVar.a;
                if (isVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = isVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            u51Var.requestLayout();
                            linearLayout.requestLayout();
                            u51Var.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            gs gsVar = isVar.l;
                            if (gsVar != null) {
                                gsVar.v(tL_messages_stickerSet2.set, TextUtils.join("", isVar.o));
                            }
                            isVar.o();
                            break;
                        }
                    } else {
                        if (isVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                isVar.l.O(TextUtils.join("", isVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (isVar.l.A()) {
                                    isVar.l.m(TextUtils.join("", isVar.o));
                                } else {
                                    isVar.l.y(TextUtils.join("", isVar.o));
                                }
                            }
                        }
                        isVar.o();
                        break;
                    }
                }
                break;
            case 14:
                id0 id0Var = (id0) this.b;
                e5.l lVar = (e5.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                gi.d dVar2 = id0Var.b;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    org.telegram.ui.s3 s3Var = new org.telegram.ui.s3(id0Var, 11);
                    org.telegram.messenger.a8.b("LoginBilling, querying done purchases...");
                    org.telegram.messenger.r1.i().p("inapp", new ci.r6(id0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new v60(id0Var, lVar, s3Var, tL_inputStorePaymentAuthCode, 27)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var3 = (org.telegram.ui.ActionBar.t2) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                vh0 vh0Var = (vh0) this.e;
                f60 F = f60.F(t2Var3.c, t2Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (h10.i(intValue3).f() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.o2(vh0Var, intValue3, 20));
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

    public /* synthetic */ f0(org.telegram.ui.ActionBar.t2 t2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, vh0 vh0Var) {
        this.a = 15;
        this.f = t2Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = vh0Var;
    }
}
