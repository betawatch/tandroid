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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nh implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nh(n8 n8Var, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, e eVar, vnb vnbVar) {
        this.a = (byte) 14;
        this.c = n8Var;
        this.d = arrayList;
        this.e = tL_messages_stickerSet;
        this.b = eVar;
        this.f = vnbVar;
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
        TLRPC.Chat M0;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User X1;
        byte b = 3;
        byte b2 = 1;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                ij ijVar = (ij) this.c;
                ynb ynbVar = (ynb) this.d;
                znb znbVar = (znb) this.e;
                id idVar = (id) this.f;
                if (eVar.getParentActivity() != null) {
                    if (ijVar.length() == 0) {
                        Vibrator vibrator = (Vibrator) a.b.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        hl.z3(ijVar);
                        break;
                    } else {
                        if (eVar instanceof pqb) {
                            aob.o();
                            eVar.finishFragment();
                        }
                        if (ynbVar != null) {
                            znbVar.u(ynbVar.a);
                            aob.r1(false, false);
                            Utilities.g.c(new re(ijVar, idVar, eVar, z3 ? (byte) 1 : (byte) 0));
                            break;
                        } else {
                            jj.b0(ijVar, idVar, eVar);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.c;
                ed0 ed0Var = (ed0) this.d;
                wk5 wk5Var = (wk5) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                e eVar2 = (e) this.b;
                if (atomicReference.get() != null) {
                    ((n8) atomicReference.getAndSet(null)).dismiss();
                }
                if (ed0Var.b >= 0) {
                    if (wk5Var.getFragmentStack() != null && ed0Var.b < wk5Var.getFragmentStack().size()) {
                        e eVar3 = (e) wk5Var.getFragmentStack().get(ed0Var.b);
                        if (eVar3 instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar3;
                            l2 = Long.valueOf(zu1Var.a());
                            l = Long.valueOf(zu1Var.c());
                        } else if (eVar3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) eVar3;
                            l2 = Long.valueOf(profileActivity.a());
                            l = Long.valueOf(profileActivity.g1);
                        }
                        if ((l2 == null && l2.longValue() != ed0Var.f) || !(tL_forumTopic == null || l == null || tL_forumTopic.id == l.longValue())) {
                            for (int size = wk5Var.getFragmentStack().size() - 2; size > ed0Var.b; size--) {
                                ((ActionBarLayout) wk5Var).a0(size);
                            }
                        } else if (wk5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(wk5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i = ed0Var.b;
                                if (size2 > i) {
                                    ((e) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i < wk5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) wk5Var).j(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l = null;
                    l2 = null;
                    if (l2 == null) {
                    }
                    if (wk5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = ed0Var.a;
                if (cls == zu1.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat = ed0Var.c;
                    if (chat != null) {
                        bundle.putLong("chat_id", chat.id);
                    } else {
                        TLRPC.User user = ed0Var.d;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", ed0Var.g);
                    bundle.putInt("dialog_filter_id", ed0Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = ed0Var.e;
                    if (tL_forumTopic2 != null) {
                        eVar2.presentFragment(ro4.h(eVar2, ed0Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        eVar2.presentFragment(new zu1(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", ed0Var.f);
                    eVar2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (ed0Var.a == tzb.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", ed0Var.c.id);
                    eVar2.presentFragment(new tzb(bundle3), true);
                }
                if (ed0Var.a == uj3.class) {
                    eVar2.presentFragment(new uj3(null), true);
                    break;
                }
                break;
            case 2:
                h71 h71Var = (h71) this.b;
                p71 p71Var = (p71) this.c;
                i71 i71Var = (i71) this.d;
                d79 d79Var = (d79) this.e;
                h71Var.f.c(p71Var, (r71) i71Var, d79Var);
                n8 n8Var = h71Var.a;
                if (n8Var != null) {
                    n8Var.d(true);
                    break;
                }
                break;
            case 3:
                new b91((Context) this.b, (String) this.c, ((String[]) this.d)[0], (vnb) this.e, (nx0) this.f).show();
                break;
            case 4:
                zu1 zu1Var2 = (zu1) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                eq0 eq0Var = (eq0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zu1Var2.getParentActivity(), null);
                Drawable mutate = zu1Var2.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                yob.x(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, aob.G8, zu1Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                b8 b8Var = new b8(zu1Var2.getParentActivity(), true, true);
                b8Var.j(ob6.M0(2131743611, null), R.drawable.msg_translate, null);
                b8Var.setOnClickListener(new nh(zu1Var2, str, str2, charSequence, r12, (byte) 5));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                n8 n8Var2 = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new jo1(n8Var2, (byte) 0)};
                n8Var2.e = true;
                n8Var2.c = (short) 220;
                n8Var2.setOutsideTouchable(true);
                n8Var2.setClippingEnabled(true);
                n8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                n8Var2.setFocusable(true);
                n8Var2.showAsDropDown(eq0Var, (eq0Var.getWidth() / 2) - hl.L(90.0f), hl.L(-16.0f), 83);
                break;
            case 5:
                zu1 zu1Var3 = (zu1) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                r3c.R0(zu1Var3.getParentActivity(), zu1Var3, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                c51 c51Var = (c51) this.b;
                boolean[] zArr = (boolean[]) this.c;
                pcc pccVar = (pcc) this.d;
                String[] strArr = (String[]) this.e;
                nx0 nx0Var = (nx0) this.f;
                if (c51Var.e0) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        pccVar.a(strArr[0]);
                    }
                    nx0Var.dismiss();
                    break;
                }
                break;
            case 7:
                nw2 nw2Var = (nw2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                qob qobVar = (qob) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                rw2 rw2Var = nw2Var.a;
                if (rw2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rw2Var.T;
                        if (tL_messages_stickerSet == null) {
                            qobVar.requestLayout();
                            linearLayout.requestLayout();
                            qobVar.getAdapter().f();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            pw2 pw2Var = rw2Var.l;
                            if (pw2Var != null) {
                                pw2Var.t(tL_messages_stickerSet.set, TextUtils.join("", rw2Var.o));
                            }
                            rw2Var.d();
                            break;
                        }
                    } else {
                        if (rw2Var.l != null) {
                            if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                                rw2Var.l.R(TextUtils.join("", rw2Var.o));
                            } else if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                                boolean y = rw2Var.l.y();
                                pw2 pw2Var2 = rw2Var.l;
                                ArrayList arrayList3 = rw2Var.o;
                                if (y) {
                                    pw2Var2.l(TextUtils.join("", arrayList3));
                                } else {
                                    pw2Var2.w(TextUtils.join("", arrayList3));
                                }
                            }
                        }
                        rw2Var.d();
                        break;
                    }
                }
                break;
            case 8:
                sg2 sg2Var = (sg2) this.b;
                sg2 sg2Var2 = (sg2) this.c;
                sg2 sg2Var3 = (sg2) this.d;
                qo0 qo0Var = (qo0) this.e;
                nx0 nx0Var2 = (nx0) this.f;
                qo0Var.a(Boolean.valueOf(sg2Var.b()), Boolean.valueOf(sg2Var2.b()), Boolean.valueOf(sg2Var3.b()));
                nx0Var2.dismiss();
                break;
            case 9:
                zg6 zg6Var = (zg6) this.b;
                wo8 wo8Var = (wo8) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str5 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                c51 c51Var2 = zg6Var.b;
                if (!c51Var2.R) {
                    c51Var2.setLoading(true);
                    zj3 zj3Var = new zj3(zg6Var, (byte) 24);
                    cc4.b("LoginBilling, querying done purchases...");
                    di0.h().p("inapp", new xg(zg6Var, str5, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new g65(zg6Var, wo8Var, zj3Var, tL_inputStorePaymentAuthCode, (byte) 20)));
                    break;
                }
                break;
            case 10:
                nx0 nx0Var3 = (nx0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                int[] iArr = (int[]) this.e;
                rq7 rq7Var = (rq7) this.f;
                fu5 G = fu5.G(nx0Var3.c, nx0Var3.J0, frameLayout);
                int size3 = arrayList4.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    int intValue2 = ((Integer) obj).intValue();
                    if (yac.h(intValue2).f() != null) {
                        G.d(intValue2, iArr[0] == intValue2, new me7(rq7Var, intValue2, b));
                    }
                }
                G.t = false;
                G.e0 = true;
                G.s = (short) 0;
                G.i = (byte) 3;
                G.b0(-hl.L(8.0f), -hl.L(8.0f));
                G.a0();
                break;
            case 11:
                o68 o68Var = (o68) this.b;
                x53 x53Var = (x53) this.c;
                lcb lcbVar = (lcb) this.d;
                Context context = (Context) this.e;
                m68 m68Var = (m68) this.f;
                n68 n68Var = o68Var.y1;
                ((ccb) o68Var.A1).g(true);
                o68Var.c1 = null;
                boolean[] zArr2 = {false};
                if (o68Var.m1) {
                    c6b O1 = uc7.s1(o68Var.m2).O1();
                    if (O1.Q == 0) {
                        O1.R();
                    }
                    uc7.s1(o68Var.m2).O1().T();
                    ar3 ar3Var = uc7.s1(o68Var.m2).O1().w;
                    if (!ar3Var.c && !ar3Var.d) {
                        ar3Var.d = true;
                        wq3 wq3Var = new wq3(ar3Var, b2);
                        jf7 Y = jf7.Y(ar3Var.a);
                        Y.a.c(new ds6((Object) Y, z3, (Object) wq3Var, (byte) 18));
                    }
                }
                if (!o68Var.m1) {
                    c6b O12 = uc7.s1(o68Var.m2).O1();
                    TL_stories.StoryItem storyItem = n68Var.a;
                    int i3 = O12.a;
                    if (storyItem == null || storyItem.dialogId == yac.h(i3).e() || ((storyItem.dialogId <= 0 || (X1 = uc7.s1(i3).X1(Long.valueOf(storyItem.dialogId))) == null || !X1.bot || !X1.bot_can_edit) && (storyItem.dialogId >= 0 || (M0 = uc7.s1(i3).M0(Long.valueOf(-storyItem.dialogId))) == null || (!M0.creator && ((!(z2 = storyItem.out) || (tL_chatAdminRights2 = M0.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z2 || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z = false;
                        j68 j68Var = new j68(o68Var, o68Var.getContext(), x53Var, x53Var, lcbVar, n68Var.e, !o68Var.m1 || ((o68Var.n1 || o68Var.A0()) && z), z, context, m68Var, zArr2);
                        o68Var.d1 = j68Var;
                        ImageView imageView = o68Var.g0;
                        int L = hl.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                        j68Var.a = true;
                        ((n8) j68Var.b).showAsDropDown(imageView, 0, L);
                        break;
                    }
                }
                z = true;
                j68 j68Var2 = new j68(o68Var, o68Var.getContext(), x53Var, x53Var, lcbVar, n68Var.e, !o68Var.m1 || ((o68Var.n1 || o68Var.A0()) && z), z, context, m68Var, zArr2);
                o68Var.d1 = j68Var2;
                ImageView imageView2 = o68Var.g0;
                int L2 = hl.L(6.0f) + (-org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
                j68Var2.a = true;
                ((n8) j68Var2.b).showAsDropDown(imageView2, 0, L2);
                break;
            case 12:
                j68 j68Var3 = (j68) this.b;
                x53 x53Var2 = (x53) this.c;
                Context context2 = (Context) this.d;
                lcb lcbVar2 = (lcb) this.e;
                m68 m68Var2 = (m68) this.f;
                o68 o68Var2 = j68Var3.x;
                if (view.getAlpha() < 1.0f) {
                    int i4 = -o68Var2.b1;
                    o68Var2.b1 = i4;
                    hl.A3(i4, view, null);
                    xnb.x(null, 2131744327, new d31(o68Var2.M0, x53Var2), null);
                    break;
                } else {
                    Activity W = hl.W(context2);
                    if (W != null) {
                        j68Var3.c = true;
                        j68 j68Var4 = o68Var2.d1;
                        if (j68Var4 != null) {
                            j68Var4.a();
                        }
                        oy6 oy6Var = new oy6(j68Var3, W, lcbVar2, m68Var2, (byte) 17);
                        lcb lcbVar3 = ((ccb) o68Var2.A1).d;
                        kcb kcbVar = lcbVar3.A0;
                        if (kcbVar != null) {
                            z3 = kcbVar.release(oy6Var);
                            lcbVar3.A0 = null;
                        }
                        if (!z3) {
                            oy6Var.run();
                            break;
                        }
                    }
                }
                break;
            case 13:
                j68 j68Var5 = (j68) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                lcb lcbVar4 = (lcb) this.e;
                m68 m68Var3 = (m68) this.f;
                o68 o68Var3 = j68Var5.x;
                File f = o68Var3.y1.f();
                if (f == null || !f.exists()) {
                    o68Var3.V0();
                    break;
                } else {
                    Activity W2 = hl.W(context3);
                    if (W2 != null) {
                        j68Var5.c = true;
                        j68 j68Var6 = o68Var3.d1;
                        if (j68Var6 != null) {
                            j68Var6.a();
                        }
                        cp7 cp7Var = new cp7((Object) j68Var5, (Object) W2, (Object) storyItem2, (Object) lcbVar4, (Object) m68Var3, (byte) 6);
                        lcb lcbVar5 = ((ccb) o68Var3.A1).d;
                        kcb kcbVar2 = lcbVar5.A0;
                        if (kcbVar2 != null) {
                            z4 = kcbVar2.release(cp7Var);
                            lcbVar5.A0 = null;
                        }
                        if (!z4) {
                            cp7Var.run();
                            break;
                        }
                    }
                }
                break;
            case 14:
                n8 n8Var3 = (n8) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.e;
                e eVar4 = (e) this.b;
                vnb vnbVar = (vnb) this.f;
                int intValue3 = ((Integer) view.getTag()).intValue();
                n8Var3.d(true);
                if (((Integer) arrayList5.get(intValue3)).intValue() == 1) {
                    x4b.a(tL_messages_stickerSet2, eVar4, vnbVar);
                    break;
                } else {
                    ((zu1) eVar4).oa();
                    rw2.e().T = tL_messages_stickerSet2;
                    break;
                }
            default:
                as1 as1Var = (as1) this.b;
                String str6 = (String) this.c;
                a5c a5cVar = (a5c) this.d;
                String str7 = (String) this.e;
                n8 n8Var4 = (n8) this.f;
                if (str6 != null) {
                    String lowerCase = str6.toLowerCase();
                    mb6 mb6Var = ob6.D0().B;
                    HashSet b0 = ee9.b0();
                    b0.add(lowerCase);
                    if (b0.size() == 1 && b0.contains(mb6Var.f)) {
                        ee9.e0(null, Boolean.FALSE);
                    } else {
                        ee9.e0(b0, Boolean.FALSE);
                    }
                    a5c.P = null;
                }
                a5cVar.f();
                a5cVar.J(as1Var.b, true, false);
                SpannableStringBuilder S2 = hl.S2(as1Var.r[0] ? ob6.a0(null, null, 2131754349, str7) : ob6.a0(null, null, 2131754348, str7));
                String[] strArr2 = r3c.R1;
                if (S2.length() <= 0) {
                    S2 = null;
                } else {
                    S2.replace(0, 1, (CharSequence) S2.toString().substring(0, 1).toUpperCase());
                }
                d31.b0(as1Var.c).K(R.raw.msg_translate, S2, ob6.M0(2131745223, null), new azb(as1Var, (byte) 3)).j();
                n8Var4.d(true);
                break;
        }
    }

    public /* synthetic */ nh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ nh(AtomicReference atomicReference, ed0 ed0Var, wk5 wk5Var, TLRPC.TL_forumTopic tL_forumTopic, e eVar) {
        this.a = (byte) 1;
        this.c = atomicReference;
        this.d = ed0Var;
        this.e = wk5Var;
        this.f = tL_forumTopic;
        this.b = eVar;
    }
}
