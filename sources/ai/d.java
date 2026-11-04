package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.lb;
import ci.v8;
import ci.wb;
import ei.c8;
import ei.i9;
import ei.k8;
import ei.r9;
import gi.m7;
import gi.v7;
import gi.va;
import gi.w8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.pe;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.pu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        ei.c4 c4Var;
        int i3 = this.a;
        int i10 = 0;
        ci.k1 k1Var = null;
        CharSequence charSequence = null;
        k1Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                g gVar = (g) obj2;
                gVar.getClass();
                long o10 = org.telegram.messenger.m5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                gVar.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && !l10.A(o10)) {
                    Bundle bundle = new Bundle();
                    if (o10 > 0) {
                        bundle.putLong("user_id", o10);
                        if (o10 == h10.i(gVar.a).e()) {
                            z10 = true;
                            bundle.putBoolean("my_profile", true);
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                        bundle.putLong("chat_id", -o10);
                    }
                    bundle.putBoolean("open_gifts", z10);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                i6 i6Var = (i6) obj2;
                i6Var.getClass();
                if (((lb) obj).f > 0) {
                    i6Var.presentFragment(new wb());
                    break;
                }
                break;
            case 2:
                h6 h6Var = (h6) obj2;
                g6 g6Var = (g6) obj;
                f60 F = f60.F(h6Var.c, h6Var.J0, h6Var.T1);
                F.c(R.drawable.menu_sort_value, bd.M0(2131746149, null), new z5(g6Var, 3), false);
                F.c(R.drawable.menu_sort_date, bd.M0(2131746153, null), new z5(g6Var, 4), false);
                F.c(R.drawable.menu_sort_number, bd.M0(2131746151, null), new z5(g6Var, 5), false);
                F.t = false;
                F.Y = true;
                F.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                F.Z();
                break;
            case 3:
                m6 m6Var = (m6) obj2;
                g3 g3Var = (g3) obj;
                HashSet hashSet = m6Var.S1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = m6Var.R1.l;
                        int size = arrayList2.size();
                        int i11 = i10;
                        while (true) {
                            if (i11 < size) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if ((i12 == 0 || i12 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                        i10 = 0;
                    }
                    g3Var.a(arrayList);
                    m6Var.dismiss();
                    break;
                }
                break;
            case 4:
                v8 v8Var = ((l6) obj2).c.R1;
                v8Var.e = !v8Var.e;
                ((k6) obj).run();
                v8Var.j(true);
                break;
            case 5:
                ci.v.c0((ci.v) obj2, (Context) obj, view);
                break;
            case 6:
                ci.t0 t0Var = (ci.t0) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = ci.t0.q2;
                    if (i13 >= 6) {
                        String M0 = bd.M0(2131749738, null);
                        v2 v2Var = new v2(t0Var, 8);
                        Pattern pattern = org.telegram.ui.Components.t4.a;
                        lg.y1 b10 = lg.y1.b(h10.t0);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                            org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                            l10.w0 = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cb0 cb0Var = new cb0(context, null);
                            cb0Var.setAllItemsCount(6);
                            cb0Var.setItemCount(Math.min(6, 8));
                            cb0Var.setTextColor(x02);
                            cb0Var.setGravity(17);
                            cb0Var.setMinValue(0);
                            cb0Var.setMaxValue(5);
                            cb0Var.setValue(i14);
                            linearLayout.addView(cb0Var, mf.l(1.0f, 0, 432));
                            cb0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(context, cb0Var, 2);
                            d4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(M0);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            frameLayout.addView(textView, mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new fi.a(10));
                            d4Var.addView(frameLayout, mf.t(-1, -2, 51, 22, 0, 0, 4));
                            d4Var.addView(linearLayout, mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            gi.d dVar = new gi.d(context, null, true);
                            dVar.i(bd.M0(2131745682, null), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.g2(r3, 1));
                            d4Var.addView(dVar, mf.t(-1, 48, 0, 16, 12, 16, 12));
                            l10.O = d4Var;
                            l10.show();
                            l10.setOnDismissListener(new ci.h3(9, v2Var, cb0Var));
                            l10.v0(x03);
                            l10.O(x03);
                            org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
                            break;
                        }
                    } else {
                        strArr[i13] = bd.G(iArr[i13] / 3600, "GiftOfferHours", new Object[0]);
                        if (iArr[i13] == t0Var.h2) {
                            i14 = i13;
                        }
                        i13++;
                    }
                }
                break;
            case 7:
                ci.a1 a1Var = (ci.a1) obj2;
                o1 o1Var = (o1) obj;
                gi.d dVar2 = a1Var.n1;
                if (dVar2.d0 && !dVar2.R) {
                    org.telegram.messenger.g0.v1(a1Var.k1);
                    dVar2.setLoading(true);
                    o1Var.a(a1Var.w1);
                    break;
                }
                break;
            case 8:
                ci.p1 p1Var = (ci.p1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                ci.h1 h1Var = p1Var.h2;
                int i15 = p1Var.s2;
                if (i15 != 2) {
                    if (i15 == 1) {
                        ci.k1 k1Var2 = new ci.k1(h1Var.getUpgradeBackdropAttribute(), h1Var.getUpgradePatternAttribute(), h1Var.getUpgradeImageViewAttribute());
                        p1Var.m2 = k1Var2;
                        h1Var.setPreviewAttributes(k1Var2);
                        p1Var.g1(2);
                        break;
                    }
                } else {
                    h1Var.setPreviewingAttributes(arrayList3);
                    p1Var.g1(1);
                    break;
                }
                break;
            case 9:
                ci.k1 k1Var3 = (ci.k1) obj;
                ci.p1 p1Var2 = ((ci.i1) obj2).Q;
                int i16 = p1Var2.s2;
                ci.h1 h1Var2 = p1Var2.h2;
                if (i16 == 1) {
                    p1Var2.m2 = new ci.k1(h1Var2.getUpgradeBackdropAttribute(), h1Var2.getUpgradePatternAttribute(), h1Var2.getUpgradeImageViewAttribute());
                    p1Var2.g1(2);
                }
                int i17 = p1Var2.c2.s;
                ci.k1 k1Var4 = p1Var2.m2;
                if (k1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = k1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = k1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = k1Var4.b;
                    if (i17 == 1) {
                        k1Var = new ci.k1(k1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        k1Var = new ci.k1(stargiftattributebackdrop, k1Var3.b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        k1Var = new ci.k1(stargiftattributebackdrop, stargiftattributepattern, k1Var3.c);
                    }
                }
                p1Var2.m2 = k1Var;
                h1Var2.setPreviewAttributes(k1Var);
                p1Var2.i1();
                break;
            case 10:
                ci.l6 l6Var = (ci.l6) obj2;
                boolean z11 = !l6Var.q3;
                l6Var.q3 = z11;
                ((org.telegram.ui.Cells.c2) obj).c(z11, true);
                break;
            case 11:
                sf.c.v(((ci.l6) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                break;
            case 12:
                ((ci.l6) obj2).o2((CharSequence) obj);
                break;
            case 13:
                ci.h5 h5Var = (ci.h5) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (h5Var.F.getAlpha() >= 1.0f && !h5Var.i0 && !h5Var.k0 && h5Var.e0 != null) {
                    new ci.p1(h5Var.getContext(), e6Var, h5Var.a0, h5Var.d0, h5Var.e0, true).show();
                    break;
                }
                break;
            case 14:
                sf.c.t((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
            case 15:
                ei.g1 g1Var = (ei.g1) obj2;
                Context context2 = (Context) obj;
                if (g1Var != null) {
                    int i18 = g1Var.e;
                    if (i18 != h10.t0) {
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            launchActivity.O0(i18);
                        }
                    }
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        TL_stories.StoryItem u10 = hp.s1(i18).P1().u(g1Var.c, g1Var.b);
                        if (u10 == null) {
                            u10 = g1Var.a;
                        }
                        if (u10 != null) {
                            T2.getOrCreateStoryViewer().O(i18, context2, u10, null);
                            org.telegram.messenger.g0.i3(new y1(10), 200L);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ei.j4 j4Var = (ei.j4) obj2;
                c8 c8Var = (c8) obj;
                r9 r9Var = j4Var.t0;
                if (c8Var.b == null) {
                    ac Q = new fc(j4Var.M0, j4Var.l0).Q(R.raw.error, 36, bd.M0(2131744674, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    if (c8Var.b.longValue() >= 0) {
                        bundle2.putLong("user_id", c8Var.b.longValue());
                    } else {
                        bundle2.putLong("chat_id", -c8Var.b.longValue());
                    }
                    if (c8Var.e && (num = c8Var.d) != null) {
                        bundle2.putInt("message_id", num.intValue());
                        r9Var.V(new wm(bundle2));
                        break;
                    } else {
                        r9Var.V(new ProfileActivity(bundle2, null));
                        break;
                    }
                }
                break;
            case 17:
                ei.j4 j4Var2 = (ei.j4) obj2;
                ((i9) j4Var2.A1).h(new vg.v0(j4Var2.t0.f, 14, false));
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                break;
            case 18:
                ei.j4 j4Var3 = ((ei.b4) obj2).x;
                pu alert = ((k8) obj).getAlert();
                if (alert != null && (c4Var = j4Var3.A1) != null) {
                    ((i9) c4Var).h(alert);
                    j4Var3.d1.a();
                    break;
                }
                break;
            case 19:
                gi.d3 d3Var = (gi.d3) obj2;
                d3Var.e((pe) obj, false);
                d3Var.G.o();
                break;
            case 20:
                m7 m7Var = (m7) obj2;
                g2.c cVar = (g2.c) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
                try {
                    charSequence = ((ClipboardManager) m7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(m7Var.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    k3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                    i3Var.setSelection(0, i3Var.getText().length());
                }
                cVar.run();
                break;
            case 21:
                va vaVar = (va) obj2;
                new v7((Context) obj, vaVar.c, true, vaVar.y0, new w8(vaVar, 20), vaVar.a).show();
                break;
            case 22:
                ii.k.A0((ii.k) obj2, (Context) obj);
                break;
            case 23:
                ii.a3 a3Var = (ii.a3) obj2;
                ii.h0 h0Var = (ii.h0) obj;
                if (h0Var.c()) {
                    h0Var.a();
                } else {
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = h0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.K1, null, true);
                    }
                }
                f60 f60Var = a3Var.P0;
                if (f60Var != null) {
                    f60Var.u();
                    a3Var.P0 = null;
                    break;
                }
                break;
            case 24:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.t2) obj2).dismiss();
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.A4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                fc.a0((wm) obj).k(false).j();
                break;
            case 26:
                lg.j0 j0Var = (lg.j0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                lg.b0 b0Var = j0Var.S1;
                gi.d dVar3 = j0Var.W1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = hp.s1(j0Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = b0Var.b();
                    ConnectionsManager.getInstance(j0Var.a).sendRequest(updateconnectedbot, new r6(j0Var, tL_connectedBot, b0Var.c(), 11));
                    break;
                }
                break;
            case 27:
                li.b bVar = (li.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                break;
            case 28:
                mi.c2.c0((mi.c2) obj2, (Context) obj, view);
                break;
            default:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
        }
    }
}
