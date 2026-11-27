// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class je3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ je3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x060b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        f89 U;
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList arrayList2;
        byte b = 3;
        byte b2 = 4;
        ArrayList arrayList3 = null;
        final byte b3 = 1;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                me3 me3Var = (me3) this.b;
                l9c l9cVar = (l9c) this.c;
                me3Var.w2 = !me3Var.w2;
                l9cVar.O(true);
                break;
            case 1:
                df3 df3Var = (df3) this.b;
                d71 d71Var = (d71) this.c;
                cf3 cf3Var = df3Var.S1;
                j35[] j35VarArr = df3Var.W1;
                for (j35 j35Var : j35VarArr) {
                    if (j35Var != null) {
                        boolean z = j35Var.b;
                    }
                }
                sg2 sg2Var = (sg2) view;
                int intValue = ((Integer) sg2Var.getTag()).intValue();
                j35 j35Var2 = j35VarArr[intValue];
                boolean z2 = j35Var2.b;
                boolean z3 = !z2;
                if (z2 != z3) {
                    j35Var2.b = z3;
                    j35Var2.c = true;
                    z2 = z3;
                }
                sg2Var.c(z2, true);
                boolean z4 = j35VarArr[intValue].b;
                ArrayList arrayList4 = d71Var.d;
                HashSet hashSet = d71Var.j;
                if (intValue == 0) {
                    d71Var.m = z4;
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        arrayList3 = d71Var.e;
                        d71Var.o = z4;
                    } else if (intValue == 3) {
                        arrayList3 = d71Var.f;
                        d71Var.p = z4;
                    } else if (intValue == 4) {
                        arrayList3 = d71Var.g;
                        d71Var.q = z4;
                    } else if (intValue == 7) {
                        arrayList3 = d71Var.h;
                    }
                    if (arrayList3 != null) {
                        for (int i = 0; i < arrayList3.size(); i++) {
                            if (((c71) arrayList3.get(i)).d == intValue) {
                                if (z4) {
                                    if (!hashSet.contains(arrayList3.get(i))) {
                                        hashSet.add((c71) arrayList3.get(i));
                                        d71Var.g((c71) arrayList3.get(i), true);
                                    }
                                } else if (hashSet.contains(arrayList3.get(i))) {
                                    hashSet.remove(arrayList3.get(i));
                                    d71Var.g((c71) arrayList3.get(i), false);
                                }
                            }
                        }
                    }
                    df3Var.Z1.d();
                    df3Var.V1.a(cf3Var.d(), true);
                    cf3Var.c(true);
                    break;
                } else {
                    d71Var.n = z4;
                }
                arrayList3 = arrayList4;
                if (arrayList3 != null) {
                }
                df3Var.Z1.d();
                df3Var.V1.a(cf3Var.d(), true);
                cf3Var.c(true);
            case 2:
                uj3 uj3Var = (uj3) this.b;
                ((fu5) this.c).u();
                uj3Var.presentFragment(new ProxyListActivity());
                break;
            case 3:
                ((uj3) this.b).R3((id[]) this.c);
                break;
            case 4:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 5:
                uj3 uj3Var2 = (uj3) this.b;
                uj3Var2.K4((ArrayList) this.c, jn7.m1, false, false, null);
                uj3Var2.finishPreviewFragment();
                break;
            case 6:
                ((uj3) this.b).n4((nj0) this.c);
                break;
            case 7:
                uk3 uk3Var = (uk3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (uk3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 8:
                q61 q61Var = (q61) this.b;
                e eVar = (e) this.c;
                q61Var.dismiss();
                eVar.presentFragment(new z61());
                break;
            case 9:
                ly3 ly3Var = (ly3) this.b;
                hm hmVar = (hm) this.c;
                n8 n8Var = ly3Var.A1;
                if (n8Var != null) {
                    n8Var.d(true);
                    ly3Var.A1 = null;
                    SpannableString spannableString = new SpannableString(r47.U(wl.e(ly3Var.a, hmVar.getDocumentId())));
                    spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                    if (hl.g(spannableString)) {
                        new d31((FrameLayout) ly3Var.b, ly3Var.J0).i(ob6.M0(2131751149, null)).j();
                        break;
                    }
                }
                break;
            case 10:
                g24 g24Var = (g24) this.b;
                t3b t3bVar = (t3b) this.c;
                o24 o24Var = g24Var.w;
                wz3 wz3Var = o24Var.E0;
                if (wz3Var.indexOfChild(t3bVar) != -1 && (U = wz3Var.U(t3bVar)) != null) {
                    if (U.b() == o24Var.g1) {
                        if (o24Var.i1 != null) {
                            p14 p14Var = o24Var.u1;
                            if (p14Var != null) {
                                p14Var.y(o24Var.K1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = uc7.s1(o24Var.d1).Y3.edit();
                            String str = "group_hide_stickers_" + o24Var.K1.id;
                            TLRPC.StickerSet stickerSet = o24Var.K1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            o24Var.X(false);
                            g24 g24Var2 = o24Var.z0;
                            if (g24Var2 != null) {
                                g24Var2.f();
                                break;
                            }
                        }
                    } else if (g24Var.h.get(U.b()) == o24Var.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g24Var.c);
                        alertDialog$Builder.a.S = ob6.M0(2131752028, null);
                        alertDialog$Builder.a.U = ob6.M0(2131752029, null);
                        alertDialog$Builder.j(ob6.M0(2131752064, null), new lu3(g24Var, b2));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        id idVar = alertDialog$Builder.a;
                        idVar.show();
                        TextView textView = (TextView) idVar.c(-1);
                        if (textView != null) {
                            yob.X(textView, aob.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((o94) this.b).c.a(Integer.valueOf(((TL_feed.InterestCategory) this.c).id));
                break;
            case 12:
                ih4 ih4Var = (ih4) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((jh4) this.c).getSuggestedFilter();
                ac7 ac7Var = new ac7();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                ac7Var.b = tL_textWithEntities.text;
                ac7Var.c = tL_textWithEntities.entities;
                ac7Var.a = 2;
                while (ih4Var.e.getMessagesController().J0.get(ac7Var.a) != null) {
                    ac7Var.a++;
                }
                ac7Var.f = ih4Var.e.getMessagesController().T0().size();
                ac7Var.d = -1;
                ac7Var.e = -1;
                int i2 = 0;
                while (true) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    if (i2 >= 2) {
                        if (dialogFilter.groups) {
                            int i3 = ac7Var.g;
                            int i4 = uc7.r5;
                            ac7Var.g = i3 | 4;
                        }
                        if (dialogFilter.bots) {
                            int i5 = ac7Var.g;
                            int i6 = uc7.r5;
                            ac7Var.g = i5 | 16;
                        }
                        if (dialogFilter.contacts) {
                            int i7 = ac7Var.g;
                            int i8 = uc7.r5;
                            ac7Var.g = i7 | 1;
                        }
                        if (dialogFilter.non_contacts) {
                            int i9 = ac7Var.g;
                            int i10 = uc7.r5;
                            ac7Var.g = i9 | 2;
                        }
                        if (dialogFilter.broadcasts) {
                            int i11 = ac7Var.g;
                            int i12 = uc7.r5;
                            ac7Var.g = i11 | 8;
                        }
                        if (dialogFilter.exclude_archived) {
                            int i13 = ac7Var.g;
                            int i14 = uc7.r5;
                            ac7Var.g = i13 | 128;
                        }
                        if (dialogFilter.exclude_read) {
                            int i15 = ac7Var.g;
                            int i16 = uc7.r5;
                            ac7Var.g = i15 | 64;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i17 = ac7Var.g;
                            int i18 = uc7.r5;
                            ac7Var.g = i17 | 32;
                        }
                        nf4.z0(ac7Var, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, ac7Var.j, true, true, true, true, true, ih4Var.e, new se4(ih4Var, suggestedFilter, b2));
                        break;
                    } else {
                        if (i2 == 0) {
                            arrayList = dialogFilter.include_peers;
                            arrayList2 = ac7Var.h;
                        } else {
                            arrayList = dialogFilter.exclude_peers;
                            arrayList2 = ac7Var.i;
                        }
                        int size = arrayList.size();
                        int i19 = 0;
                        while (i19 < size) {
                            TLRPC.InputPeer inputPeer = arrayList.get(i19);
                            long j = inputPeer.user_id;
                            if (j == 0) {
                                long j2 = inputPeer.chat_id;
                                if (j2 == 0) {
                                    j2 = inputPeer.channel_id;
                                }
                                j = -j2;
                            }
                            i19 = dze.c(i19, 1, j, arrayList2);
                        }
                        i2++;
                    }
                }
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.W0;
                float A = MediaController.z().A(fragmentContextView.W);
                int i20 = 0;
                while (true) {
                    if (i20 >= 3) {
                        i20 = -1;
                    } else if (A - 0.1f > fArr[i20]) {
                        i20++;
                    }
                }
                int i21 = i20 + 1;
                if (i21 >= 3) {
                    i21 = 0;
                }
                float f = fArr[i21];
                MediaController.z().o0(fragmentContextView.W, f);
                fragmentContextView.l(A, f, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    mg5 mg5Var = mg5.w;
                    if (mg5Var.c()) {
                        mg5Var.b();
                        e eVar2 = fragmentContextView.h;
                        if (eVar2 != null && fragmentContextView.C0 != null) {
                            kg5 kg5Var = new kg5(fragmentContextView.getContext(), 1);
                            kg5Var.p(true);
                            kg5Var.d = 2300L;
                            kg5Var.U = true;
                            kg5Var.e = true;
                            kg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                            kg5Var.v0 = -hl.L(6.0f);
                            fragmentContextView.B0 = kg5Var;
                            kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            if (eVar2 instanceof zu1) {
                                kg5Var.k(((zu1) eVar2).L);
                            }
                            kg5Var.t(ob6.M0(2131744926, null));
                            kg5Var.r0 = new ug(kg5Var, b);
                            fragmentContextView.C0.addView(kg5Var, tre.e(-1, jn7.f2, 55));
                            kg5Var.x(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 14:
                rq4 rq4Var = (rq4) this.b;
                r7 r7Var = (r7) this.c;
                int indexOf = rq4Var.H.indexOf(r7Var.getFilter());
                if (rq4Var.K != indexOf) {
                    rq4Var.K = indexOf;
                    rq4Var.f();
                    break;
                } else if (r7Var.getFilter().h) {
                    if (r7Var.a.f) {
                        ph4 filter = r7Var.getFilter();
                        rq4Var.g(filter);
                        qq4 qq4Var = rq4Var.J;
                        if (qq4Var != null) {
                            ((xi3) qq4Var).a(filter);
                            break;
                        }
                    } else {
                        r7Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 15:
                m01.u((Activity) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 16:
                lg lgVar = (lg) this.b;
                nx0 nx0Var = (nx0) this.c;
                lgVar.run();
                nx0Var.dismiss();
                break;
            case 17:
                ((te2) this.c).a(Long.valueOf(((jt4) this.b).d));
                break;
            case 18:
                wt4 wt4Var = (wt4) this.b;
                wt4Var.e((do6) this.c, false);
                wt4Var.G.p();
                break;
            case 19:
                final rv4 rv4Var = (rv4) this.b;
                final o8 o8Var = (o8) this.c;
                if (rv4Var.d) {
                    if (!o8Var.a.R) {
                        o8Var.b(true);
                        String str2 = rv4Var.h;
                        pcc pccVar = new pcc() { // from class: qv4
                            @Override // pcc
                            public final void a(Object obj) {
                                byte b5 = b4;
                                o8 o8Var2 = o8Var;
                                rv4 rv4Var2 = rv4Var;
                                switch (b5) {
                                    case 0:
                                        o8Var2.b(false);
                                        sv4 sv4Var = (sv4) rv4Var2;
                                        hl.d3(new rj4(sv4Var, (byte) 12), 200L);
                                        sv4Var.r.dismiss();
                                        break;
                                    default:
                                        o8Var2.b(false);
                                        ym0.c((TLRPC.TL_error) obj, rv4Var2.n, rv4Var2.c, new pv4(rv4Var2, (byte) 1));
                                        break;
                                }
                            }
                        };
                        pcc pccVar2 = new pcc() { // from class: qv4
                            @Override // pcc
                            public final void a(Object obj) {
                                byte b5 = b3;
                                o8 o8Var2 = o8Var;
                                rv4 rv4Var2 = rv4Var;
                                switch (b5) {
                                    case 0:
                                        o8Var2.b(false);
                                        sv4 sv4Var = (sv4) rv4Var2;
                                        hl.d3(new rj4(sv4Var, (byte) 12), 200L);
                                        sv4Var.r.dismiss();
                                        break;
                                    default:
                                        o8Var2.b(false);
                                        ym0.c((TLRPC.TL_error) obj, rv4Var2.n, rv4Var2.c, new pv4(rv4Var2, (byte) 1));
                                        break;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new hn0(pccVar2, pccVar, b4), 2);
                        break;
                    }
                } else {
                    ((sv4) rv4Var).r.dismiss();
                    break;
                }
                break;
            case 20:
                final bx4 bx4Var = (bx4) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                fu5 G = fu5.G(bx4Var.c, bx4Var.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, ob6.M0(2131745329, null), new Runnable() { // from class: sw4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        TLRPC.User user2 = user;
                        bx4 bx4Var2 = bx4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                zu1 zu1Var = new zu1(bundle);
                                e eVar3 = bx4Var2.r1;
                                if (eVar3 == null) {
                                    e S = LaunchActivity.S();
                                    if (S != null) {
                                        bg0 bg0Var = new bg0();
                                        bg0Var.a = true;
                                        S.showAsSheet(zu1Var, bg0Var);
                                        break;
                                    }
                                } else {
                                    eVar3.presentFragment(zu1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                e eVar4 = bx4Var2.r1;
                                if (eVar4 == null) {
                                    e S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        bg0 bg0Var2 = new bg0();
                                        bg0Var2.a = true;
                                        S2.showAsSheet(profileActivity, bg0Var2);
                                        break;
                                    }
                                } else {
                                    eVar4.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.b(R.drawable.msg_openprofile, ob6.M0(2131747513, null), new Runnable() { // from class: sw4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b3;
                        TLRPC.User user2 = user;
                        bx4 bx4Var2 = bx4Var;
                        switch (b5) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                zu1 zu1Var = new zu1(bundle);
                                e eVar3 = bx4Var2.r1;
                                if (eVar3 == null) {
                                    e S = LaunchActivity.S();
                                    if (S != null) {
                                        bg0 bg0Var = new bg0();
                                        bg0Var.a = true;
                                        S.showAsSheet(zu1Var, bg0Var);
                                        break;
                                    }
                                } else {
                                    eVar3.presentFragment(zu1Var);
                                    break;
                                }
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                e eVar4 = bx4Var2.r1;
                                if (eVar4 == null) {
                                    e S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        bg0 bg0Var2 = new bg0();
                                        bg0Var2.a = true;
                                        S2.showAsSheet(profileActivity, bg0Var2);
                                        break;
                                    }
                                } else {
                                    eVar4.presentFragment(profileActivity);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 21:
                c51 c51Var = (c51) this.b;
                jl7 jl7Var = (jl7) this.c;
                if (!c51Var.R) {
                    jl7Var.dismiss();
                    break;
                }
                break;
            case 22:
                w45 w45Var = (w45) this.b;
                sk7 sk7Var = (sk7) this.c;
                if (!w45Var.m) {
                    sk7Var.dismiss();
                    break;
                }
                break;
            case 23:
                x65 x65Var = (x65) this.b;
                TextView textView2 = (TextView) this.c;
                j95 j95Var = x65Var.F;
                vc2 vc2Var = j95Var.T2;
                if (vc2Var != null && vc2Var.w) {
                    j95Var.C1(textView2);
                    break;
                }
                break;
            case 24:
                new x85((LaunchActivity) this.c, (tb) this.b).show();
                break;
            case 25:
                g75 g75Var = (g75) this.b;
                j95 j95Var2 = (j95) this.c;
                vc2 vc2Var2 = g75Var.j0;
                if (vc2Var2 == null || !vc2Var2.b.rtmp_stream) {
                    ra5.g0 = false;
                    j95Var2.dismiss();
                    break;
                } else {
                    ir9.e(j95Var2.b2);
                    break;
                }
                break;
            case 26:
                xd5 xd5Var = (xd5) this.b;
                ((hd2) this.c).run();
                xd5Var.dismiss();
                break;
            case 27:
                yr5 yr5Var = (yr5) this.b;
                e29 e29Var = (e29) this.c;
                if (!uj3.E4) {
                    uj3.E4 = true;
                    boolean o = aob.I.o();
                    boolean z5 = !o;
                    znb O0 = !o ? aob.O0("Night") : aob.O0("Blue");
                    aob.o = 0;
                    aob.u1();
                    aob.A();
                    b29 b29Var = yr5Var.w;
                    b29Var.K(!o ? b29Var.e[0] - 1 : 0);
                    e29Var.d();
                    int[] iArr = {(e29Var.getMeasuredWidth() / 2) + r12, (e29Var.getMeasuredHeight() / 2) + r12};
                    e29Var.getLocationInWindow(iArr);
                    int i22 = iArr[0];
                    int i23 = iArr[1];
                    jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z5), e29Var);
                    e29Var.setContentDescription(ob6.M0(!o ? 2131754746 : 2131754745, null));
                    break;
                }
                break;
            case 28:
                fu5 fu5Var = (fu5) this.b;
                ((vg3) this.c).run();
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            default:
                fu5 fu5Var2 = (fu5) this.b;
                cq6 cq6Var = (cq6) this.c;
                fu5Var2.u();
                cq6Var.run();
                break;
        }
    }
}
