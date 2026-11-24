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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oh implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oh(m8 m8Var, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, ylb ylbVar) {
        this.a = (byte) 14;
        this.c = m8Var;
        this.d = arrayList;
        this.e = tL_messages_stickerSet;
        this.b = dVar;
        this.f = ylbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0642  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Long l;
        Long l2;
        boolean z;
        TLRPC.Chat L0;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User W1;
        byte b = 24;
        byte b2 = 2;
        byte b3 = 1;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                hk hkVar = (hk) this.c;
                amb ambVar = (amb) this.d;
                bmb bmbVar = (bmb) this.e;
                he heVar = (he) this.f;
                if (dVar.getParentActivity() != null) {
                    if (hkVar.length() == 0) {
                        Vibrator vibrator = (Vibrator) a.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        gm.z3(hkVar);
                        break;
                    } else {
                        if (dVar instanceof rob) {
                            cmb.o();
                            dVar.finishFragment();
                        }
                        if (ambVar != null) {
                            bmbVar.u(ambVar.a);
                            cmb.r1(false, false);
                            Utilities.g.c(new rf(hkVar, heVar, dVar, z3 ? (byte) 1 : (byte) 0));
                            break;
                        } else {
                            ik.b0(hkVar, heVar, dVar);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.c;
                ce0 ce0Var = (ce0) this.d;
                tk5 tk5Var = (tk5) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                d dVar2 = (d) this.b;
                if (atomicReference.get() != null) {
                    ((m8) atomicReference.getAndSet(null)).dismiss();
                }
                if (ce0Var.b >= 0) {
                    if (tk5Var.getFragmentStack() != null && ce0Var.b < tk5Var.getFragmentStack().size()) {
                        d dVar3 = (d) tk5Var.getFragmentStack().get(ce0Var.b);
                        if (dVar3 instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar3;
                            l2 = Long.valueOf(yv1Var.a());
                            l = Long.valueOf(yv1Var.d());
                        } else if (dVar3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) dVar3;
                            l2 = Long.valueOf(profileActivity.a());
                            l = Long.valueOf(profileActivity.g1);
                        }
                        if ((l2 == null && l2.longValue() != ce0Var.f) || !(tL_forumTopic == null || l == null || tL_forumTopic.id == l.longValue())) {
                            for (int size = tk5Var.getFragmentStack().size() - 2; size > ce0Var.b; size--) {
                                ((ActionBarLayout) tk5Var).a0(size);
                            }
                        } else if (tk5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(tk5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i = ce0Var.b;
                                if (size2 > i) {
                                    ((d) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i < tk5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) tk5Var).j(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l = null;
                    l2 = null;
                    if (l2 == null) {
                    }
                    if (tk5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = ce0Var.a;
                if (cls == yv1.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = ce0Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = ce0Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", ce0Var.g);
                    bundle.putInt("dialog_filter_id", ce0Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = ce0Var.e;
                    if (tL_forumTopic2 != null) {
                        dVar2.presentFragment(no4.h(dVar2, ce0Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        dVar2.presentFragment(new yv1(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", ce0Var.f);
                    dVar2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (ce0Var.a == sxb.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", ce0Var.c.id);
                    dVar2.presentFragment(new sxb(bundle3), true);
                }
                if (ce0Var.a == nk3.class) {
                    dVar2.presentFragment(new nk3(null), true);
                    break;
                }
                break;
            case 2:
                g81 g81Var = (g81) this.b;
                p81 p81Var = (p81) this.c;
                h81 h81Var = (h81) this.d;
                r59 r59Var = (r59) this.e;
                g81Var.f.c(p81Var, (r81) h81Var, r59Var);
                m8 m8Var = g81Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    break;
                }
                break;
            case 3:
                new ba1((Context) this.b, (String) this.c, ((String[]) this.d)[0], (ylb) this.e, (my0) this.f).show();
                break;
            case 4:
                yv1 yv1Var2 = (yv1) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                er0 er0Var = (er0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(yv1Var2.getParentActivity(), null);
                Drawable mutate = yv1Var2.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                anb.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, cmb.F8, yv1Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                a8 a8Var = new a8(yv1Var2.getParentActivity(), true, true);
                a8Var.j(jb6.M0(2131743643, null), R.drawable.msg_translate, null);
                a8Var.setOnClickListener(new oh(yv1Var2, str, str2, charSequence, r12, (byte) 5));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                m8 m8Var2 = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new hp1(m8Var2, (byte) 0)};
                m8Var2.e = true;
                m8Var2.c = (short) 220;
                m8Var2.setOutsideTouchable(true);
                m8Var2.setClippingEnabled(true);
                m8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                m8Var2.setFocusable(true);
                m8Var2.showAsDropDown(er0Var, (er0Var.getWidth() / 2) - gm.L(90.0f), gm.L(-16.0f), 83);
                break;
            case 5:
                yv1 yv1Var3 = (yv1) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                s1c.Q0(yv1Var3.getParentActivity(), yv1Var3, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                b61 b61Var = (b61) this.b;
                boolean[] zArr = (boolean[]) this.c;
                qac qacVar = (qac) this.d;
                String[] strArr = (String[]) this.e;
                my0 my0Var = (my0) this.f;
                if (b61Var.e0) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        qacVar.a(strArr[0]);
                    }
                    my0Var.dismiss();
                    break;
                }
                break;
            case 7:
                dx2 dx2Var = (dx2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                smb smbVar = (smb) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                hx2 hx2Var = dx2Var.a;
                if (hx2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hx2Var.T;
                        if (tL_messages_stickerSet == null) {
                            smbVar.requestLayout();
                            linearLayout.requestLayout();
                            smbVar.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            fx2 fx2Var = hx2Var.l;
                            if (fx2Var != null) {
                                fx2Var.s(tL_messages_stickerSet.set, TextUtils.join("", hx2Var.o));
                            }
                            hx2Var.d();
                            break;
                        }
                    } else {
                        if (hx2Var.l != null) {
                            if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                                hx2Var.l.R(TextUtils.join("", hx2Var.o));
                            } else if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                                boolean y = hx2Var.l.y();
                                fx2 fx2Var2 = hx2Var.l;
                                ArrayList arrayList3 = hx2Var.o;
                                if (y) {
                                    fx2Var2.l(TextUtils.join("", arrayList3));
                                } else {
                                    fx2Var2.w(TextUtils.join("", arrayList3));
                                }
                            }
                        }
                        hx2Var.d();
                        break;
                    }
                }
                break;
            case 8:
                oh2 oh2Var = (oh2) this.b;
                oh2 oh2Var2 = (oh2) this.c;
                oh2 oh2Var3 = (oh2) this.d;
                qp0 qp0Var = (qp0) this.e;
                my0 my0Var2 = (my0) this.f;
                qp0Var.a(Boolean.valueOf(oh2Var.b()), Boolean.valueOf(oh2Var2.b()), Boolean.valueOf(oh2Var3.b()));
                my0Var2.dismiss();
                break;
            case 9:
                wg6 wg6Var = (wg6) this.b;
                ln8 ln8Var = (ln8) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str5 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                b61 b61Var2 = wg6Var.b;
                if (!b61Var2.R) {
                    b61Var2.setLoading(true);
                    sk3 sk3Var = new sk3(wg6Var, (byte) 24);
                    fc4.b("LoginBilling, querying done purchases...");
                    cj0.h().p("inapp", new ki(wg6Var, str5, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new d65(wg6Var, ln8Var, sk3Var, tL_inputStorePaymentAuthCode, (byte) 20)));
                    break;
                }
                break;
            case 10:
                my0 my0Var3 = (my0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                int[] iArr = (int[]) this.e;
                up7 up7Var = (up7) this.f;
                bu5 G = bu5.G(my0Var3.c, my0Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    int intValue2 = ((Integer) obj).intValue();
                    if (z8c.h(intValue2).f() != null) {
                        G.d(intValue2, iArr[0] == intValue2, new ge7(up7Var, intValue2, b2));
                    }
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-gm.L(8.0f), -gm.L(8.0f));
                G.a0();
                break;
            case 11:
                a58 a58Var = (a58) this.b;
                r63 r63Var = (r63) this.c;
                oab oabVar = (oab) this.d;
                Context context = (Context) this.e;
                y48 y48Var = (y48) this.f;
                z48 z48Var = a58Var.E1;
                ((fab) a58Var.G1).g(true);
                a58Var.i1 = null;
                boolean[] zArr2 = {false};
                if (a58Var.s1) {
                    h4b N1 = oc7.r1(a58Var.s2).N1();
                    if (N1.Q == 0) {
                        N1.R();
                    }
                    oc7.r1(a58Var.s2).N1().T();
                    tr3 tr3Var = oc7.r1(a58Var.s2).N1().w;
                    if (!tr3Var.c && !tr3Var.d) {
                        tr3Var.d = true;
                        pr3 pr3Var = new pr3(tr3Var, b3);
                        cf7 Y = cf7.Y(tr3Var.a);
                        Y.a.c(new np6((Object) Y, z3, (Object) pr3Var, (byte) 18));
                    }
                }
                if (!a58Var.s1) {
                    h4b N12 = oc7.r1(a58Var.s2).N1();
                    TL_stories.StoryItem storyItem = z48Var.a;
                    int i3 = N12.a;
                    if (storyItem == null || storyItem.dialogId == z8c.h(i3).e() || ((storyItem.dialogId <= 0 || (W1 = oc7.r1(i3).W1(Long.valueOf(storyItem.dialogId))) == null || !W1.bot || !W1.bot_can_edit) && (storyItem.dialogId >= 0 || (L0 = oc7.r1(i3).L0(Long.valueOf(-storyItem.dialogId))) == null || (!L0.creator && ((!(z2 = storyItem.out) || (tL_chatAdminRights2 = L0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z2 || (tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z = false;
                        v48 v48Var = new v48(a58Var, a58Var.getContext(), r63Var, r63Var, oabVar, z48Var.e, !a58Var.s1 || ((a58Var.t1 || a58Var.A0()) && z), z, context, y48Var, zArr2);
                        a58Var.j1 = v48Var;
                        ImageView imageView = a58Var.m0;
                        int L = gm.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                        v48Var.a = true;
                        ((m8) v48Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z = true;
                v48 v48Var2 = new v48(a58Var, a58Var.getContext(), r63Var, r63Var, oabVar, z48Var.e, !a58Var.s1 || ((a58Var.t1 || a58Var.A0()) && z), z, context, y48Var, zArr2);
                a58Var.j1 = v48Var2;
                ImageView imageView2 = a58Var.m0;
                int L2 = gm.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                v48Var2.a = true;
                ((m8) v48Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 12:
                v48 v48Var3 = (v48) this.b;
                r63 r63Var2 = (r63) this.c;
                Context context2 = (Context) this.d;
                oab oabVar2 = (oab) this.e;
                y48 y48Var2 = (y48) this.f;
                a58 a58Var2 = v48Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i4 = -a58Var2.h1;
                    a58Var2.h1 = i4;
                    gm.A3(i4, view, null);
                    mlb.y(null, 2131744359, new c41(a58Var2.S0, r63Var2), null);
                    break;
                } else {
                    Activity W = gm.W(context2);
                    if (W != null) {
                        v48Var3.c = true;
                        v48 v48Var4 = a58Var2.j1;
                        if (v48Var4 != null) {
                            v48Var4.a();
                        }
                        jy6 jy6Var = new jy6(v48Var3, W, oabVar2, y48Var2, (byte) 17);
                        oab oabVar3 = ((fab) a58Var2.G1).d;
                        nab nabVar = oabVar3.A0;
                        if (nabVar != null) {
                            z3 = nabVar.release(jy6Var);
                            oabVar3.A0 = null;
                        }
                        if (!z3) {
                            jy6Var.run();
                            break;
                        }
                    }
                }
                break;
            case 13:
                v48 v48Var5 = (v48) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                oab oabVar4 = (oab) this.e;
                y48 y48Var3 = (y48) this.f;
                a58 a58Var3 = v48Var5.x;
                File f = a58Var3.E1.f();
                if (f == null || !f.exists()) {
                    a58Var3.V0();
                    break;
                } else {
                    Activity W2 = gm.W(context3);
                    if (W2 != null) {
                        v48Var5.c = true;
                        v48 v48Var6 = a58Var3.j1;
                        if (v48Var6 != null) {
                            v48Var6.a();
                        }
                        hz7 hz7Var = new hz7((Object) v48Var5, (Object) W2, (Object) storyItem2, (Object) oabVar4, (Object) y48Var3, (byte) 5);
                        oab oabVar5 = ((fab) a58Var3.G1).d;
                        nab nabVar2 = oabVar5.A0;
                        if (nabVar2 != null) {
                            z4 = nabVar2.release(hz7Var);
                            oabVar5.A0 = null;
                        }
                        if (!z4) {
                            hz7Var.run();
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
                ylb ylbVar = (ylb) this.f;
                int intValue3 = ((Integer) view.getTag()).intValue();
                m8Var3.d(true);
                if (((Integer) arrayList5.get(intValue3)).intValue() == 1) {
                    c3b.a(tL_messages_stickerSet2, dVar4, ylbVar);
                    break;
                } else {
                    ((yv1) dVar4).na();
                    hx2.e().T = tL_messages_stickerSet2;
                    break;
                }
            default:
                zs1 zs1Var = (zs1) this.b;
                String str6 = (String) this.c;
                b3c b3cVar = (b3c) this.d;
                String str7 = (String) this.e;
                m8 m8Var4 = (m8) this.f;
                if (str6 != null) {
                    String lowerCase = str6.toLowerCase();
                    hb6 hb6Var = jb6.D0().B;
                    HashSet c0 = qc9.c0();
                    c0.add(lowerCase);
                    if (c0.size() == 1 && c0.contains(hb6Var.f)) {
                        qc9.f0(null, Boolean.FALSE);
                    } else {
                        qc9.f0(c0, Boolean.FALSE);
                    }
                    b3c.P = null;
                }
                b3cVar.f();
                b3cVar.J(zs1Var.b, true, false);
                SpannableStringBuilder S2 = gm.S2(zs1Var.r[0] ? jb6.a0(null, null, 2131754353, str7) : jb6.a0(null, null, 2131754352, str7));
                String[] strArr2 = s1c.R1;
                if (S2.length() <= 0) {
                    S2 = null;
                } else {
                    S2.replace(0, 1, (CharSequence) S2.toString().substring(0, 1).toUpperCase());
                }
                c41.b0(zs1Var.c).K(R.raw.msg_translate, S2, jb6.M0(2131745229, null), new zcb(zs1Var, b)).j();
                m8Var4.d(true);
                break;
        }
    }

    public /* synthetic */ oh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ oh(AtomicReference atomicReference, ce0 ce0Var, tk5 tk5Var, TLRPC.TL_forumTopic tL_forumTopic, d dVar) {
        this.a = (byte) 1;
        this.c = atomicReference;
        this.d = ce0Var;
        this.e = tk5Var;
        this.f = tL_forumTopic;
        this.b = dVar;
    }
}
