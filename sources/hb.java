// default package

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hb(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p8c p8cVar;
        ii9 N2;
        li9 q;
        TLRPC.Chat K0;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z;
        byte b = this.a;
        String str = "";
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        byte b2 = 4;
        byte b3 = 2;
        boolean z2 = false;
        boolean z3 = false;
        byte b4 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ib ibVar = (ib) obj;
                if (b4 == 0) {
                    ibVar.Y1 = !ibVar.Y1;
                } else if (b4 == 1) {
                    ibVar.Z1 = !ibVar.Z1;
                } else if (b4 == 2) {
                    ibVar.a2 = !ibVar.a2;
                }
                ibVar.S1.O(true);
                ibVar.D0();
                break;
            case 1:
                View.OnClickListener onClickListener = ((su1) obj).b[b4];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                o41 o41Var = ((dz1) obj).h;
                if (o41Var != null) {
                    o41Var.g(b4);
                    break;
                }
                break;
            case 3:
                jv5 jv5Var = (jv5) obj;
                jv5Var.R.dismiss();
                int i = jv5Var.d0;
                if (i >= 0) {
                    o51 o51Var = jv5Var.e0;
                    int[] iArr = o51Var.c;
                    if (!o51Var.b) {
                        o51Var.b = true;
                        for (int i2 = 0; i2 < 4; i2++) {
                            iArr[i2] = gba.q().getInt(de9.k(i2, "keep_media_type_"), o51.b(i2));
                        }
                    }
                    iArr[i] = b4;
                    gba.q().edit().putInt("keep_media_type_" + i, b4).apply();
                    gv5 gv5Var = jv5Var.f0;
                    if (gv5Var != null) {
                        gv5Var.a(b4);
                        break;
                    }
                } else {
                    gv5 gv5Var2 = jv5Var.f0;
                    if (gv5Var2 != null) {
                        gv5Var2.a(b4);
                        break;
                    }
                }
                break;
            case 4:
                vx7 vx7Var = (vx7) obj;
                xw7 xw7Var = vx7Var.E1;
                vx7Var.T0 = b4;
                if (b4 == 1) {
                    vx7Var.j0 = vx7Var.h0;
                } else if (b4 == 4) {
                    vx7Var.j0 = vx7Var.i0;
                } else if (b4 == 2) {
                    vx7Var.j0 = vx7Var.f0;
                } else if (b4 == 3) {
                    vx7Var.j0 = vx7Var.g0;
                } else {
                    vx7Var.j0 = vx7Var.e0;
                }
                uu9 uu9Var = (uu9) view.getTag();
                PhotoViewer.r0().S1(null, vx7Var, null);
                if (b4 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vx7Var.k1);
                    PhotoViewer.r0().j1(arrayList, 0, xw7Var);
                    break;
                } else if (b4 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(vx7Var.m1);
                    PhotoViewer.r0().j1(arrayList2, 0, xw7Var);
                    break;
                } else if (b4 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vx7Var.n1);
                    PhotoViewer.r0().j1(arrayList3, 0, xw7Var);
                    break;
                } else if (b4 == 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    ArrayList arrayList4 = vx7Var.j1;
                    r0.j1(arrayList4, arrayList4.indexOf(uu9Var), xw7Var);
                    break;
                } else {
                    PhotoViewer r02 = PhotoViewer.r0();
                    ArrayList arrayList5 = vx7Var.l1;
                    r02.j1(arrayList5, arrayList5.indexOf(uu9Var), xw7Var);
                    break;
                }
            case 5:
                vi8 vi8Var = ((ti8) obj).b;
                if (vi8Var.r && (p8cVar = vi8Var.f) != null) {
                    p8cVar.a(Integer.valueOf(b4));
                    break;
                }
                break;
            case 6:
                final e72 e72Var = ((df9) obj).a.a;
                wjb wjbVar = e72Var.a;
                ye9 ye9Var = e72Var.r;
                lk0 M2 = ye9Var.M2();
                byte b5 = 9;
                byte b6 = 7;
                byte b7 = 5;
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 4) {
                            if (b4 != 7) {
                                if (b4 == 9) {
                                    ye9Var.p3();
                                    break;
                                }
                            } else {
                                if (M2 != null) {
                                    TL_iv.PageBlock pageBlock = M2.b;
                                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                    }
                                }
                                Context context = e72Var.getContext();
                                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                    str = pageblockmath.source;
                                }
                                e72.X(context, str, new pz1(e72Var, pageblockmath, b7), wjbVar);
                                break;
                            }
                        } else {
                            ii9 ii9Var = ye9Var.q4;
                            if (ii9Var == null && (N2 = ye9Var.N2()) != null && N2.getModel() != null) {
                                View findFocus = ye9Var.findFocus();
                                if ((findFocus instanceof mc9) && (q = N2.q((mc9) findFocus)) != null) {
                                    pagetablecell = q.b;
                                }
                                if (pagetablecell != null) {
                                    ye9Var.b2(N2);
                                    if (N2.I.add(pagetablecell)) {
                                        N2.w.invalidate();
                                        N2.v();
                                    }
                                    ii9Var = N2;
                                }
                            }
                            if (ii9Var != null && ii9Var.getModel() != null && !ii9Var.I.isEmpty()) {
                                ye9Var.H4(ii9Var);
                                break;
                            } else {
                                ye9Var.N1(wi9.t(2, 2));
                                break;
                            }
                        }
                    } else {
                        cs5 cs5Var = e72Var.I;
                        if (cs5Var != null) {
                            cs5Var.u();
                        }
                        final cs5 G = cs5.G(e72Var, wjbVar, view);
                        G.T = true;
                        G.i(M2 == null || !M2.b(), R.drawable.field_carret_empty, null, k96.M0(2131753996, null), new v62(e72Var, M2, r11 ? (byte) 1 : (byte) 0));
                        G.i((M2 == null || !M2.b() || M2.a() || M2.c()) ? false : true, R.drawable.iv_list, null, k96.M0(2131754003, null), new v62(e72Var, M2, b3));
                        G.i(M2 != null && M2.b() && !M2.a() && M2.c(), R.drawable.iv_ordered_list, null, k96.M0(2131754000, null), new v62(e72Var, M2, (byte) 3));
                        G.i(M2 != null && M2.b() && M2.a() && !M2.c(), R.drawable.iv_todo, null, k96.M0(2131753998, null), new v62(e72Var, M2, b2));
                        G.i(M2 != null && (M2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, k96.M0(2131753984, null), new q62(ye9Var, r11 ? (byte) 1 : (byte) 0));
                        boolean h2 = ye9Var.h2();
                        boolean k2 = ye9Var.k2();
                        if (h2 || k2) {
                            G.j();
                            if (h2) {
                                String M0 = k96.M0(2131754010, null);
                                final boolean z4 = z2 ? 1 : 0;
                                G.b(R.drawable.iv_list_tab, M0, new Runnable() { // from class: w62
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b8 = z4;
                                        cs5 cs5Var2 = G;
                                        e72 e72Var2 = e72Var;
                                        switch (b8) {
                                            case 0:
                                                e72Var2.r.n3(false);
                                                cs5Var2.u();
                                                break;
                                            default:
                                                e72Var2.r.n3(true);
                                                cs5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (k2) {
                                String M02 = k96.M0(2131753995, null);
                                final byte b8 = r11 ? (byte) 1 : (byte) 0;
                                G.b(R.drawable.iv_list_untab, M02, new Runnable() { // from class: w62
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b82 = b8;
                                        cs5 cs5Var2 = G;
                                        e72 e72Var2 = e72Var;
                                        switch (b82) {
                                            case 0:
                                                e72Var2.r.n3(false);
                                                cs5Var2.u();
                                                break;
                                            default:
                                                e72Var2.r.n3(true);
                                                cs5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        G.X = true;
                        G.a0();
                        e72Var.I = G;
                        break;
                    }
                } else {
                    int i3 = e72Var.n;
                    cs5 cs5Var2 = e72Var.I;
                    if (cs5Var2 != null) {
                        cs5Var2.u();
                    }
                    cs5 H = cs5.H(e72Var, wjbVar, view, true);
                    H.T = true;
                    cs5 K = H.K();
                    boolean z5 = (na7.q1(i3).u4() || y6c.h(i3).p()) ? false : true;
                    K.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new en1(H, r11 ? (byte) 1 : (byte) 0), false);
                    K.j();
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, k96.M0(2131754027, null), gba.T0 + 2, H);
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, k96.M0(2131754026, null), gba.T0 + 1, H);
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, k96.M0(2131754025, null), gba.T0, H);
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, k96.M0(2131754024, null), gba.T0 - 1, H);
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, k96.M0(2131754023, null), gba.T0 - 2, H);
                    e72Var.P(K, M2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, k96.M0(2131754022, null), gba.T0 - 3, H);
                    boolean z6 = M2 != null && ye9.y3(M2.b);
                    fd9 fd9Var = new fd9(e72Var.getContext(), R.drawable.iv_h1);
                    fd9Var.a(z5);
                    H.i(z6, 0, fd9Var, k96.M0(2131754028, null), new c10(H, K, b7));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, k96.M0(2131753985, null), new v62(e72Var, M2, b7));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, k96.M0(2131753993, null), new v62(e72Var, M2, (byte) 6));
                    boolean z7 = M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote);
                    fd9 fd9Var2 = new fd9(e72Var.getContext(), R.drawable.iv_pullquote);
                    fd9Var2.a(z5);
                    H.i(z7, 0, fd9Var2, k96.M0(2131753994, null), new v62(e72Var, M2, b6));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, k96.M0(2131754052, null), new v62(e72Var, M2, (byte) 8));
                    boolean z8 = M2 != null && (M2.b instanceof TL_iv.pageBlockFooter);
                    fd9 fd9Var3 = new fd9(e72Var.getContext(), R.drawable.iv_footer);
                    fd9Var3.a(z5);
                    H.i(z8, 0, fd9Var3, k96.M0(2131754029, null), new v62(e72Var, M2, b5));
                    H.a0();
                    e72Var.I = H;
                    break;
                }
                break;
            default:
                final nfa nfaVar = (nfa) obj;
                kca kcaVar = nfaVar.a0;
                yea yeaVar = nfaVar.U;
                wjb wjbVar2 = nfaVar.I1;
                long j = nfaVar.m1;
                SparseArray[] sparseArrayArr = nfaVar.c1;
                d dVar = nfaVar.y1;
                if (b4 == 101) {
                    if (!nfa.j0(nfaVar.getSelectedTab()) && nfaVar.getSelectedTab() != 13) {
                        if (nfaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = dVar.getMessagesController().D1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                                long j2 = ((up9) arrayList6.get(i4)).a;
                                if (yeaVar.x.contains(Long.valueOf(j2))) {
                                    arrayList7.add(Long.valueOf(j2));
                                }
                            }
                            if (arrayList7.isEmpty()) {
                                z = false;
                            } else {
                                Long l = (Long) arrayList7.get(0);
                                long longValue = l.longValue();
                                boolean z9 = longValue == dVar.getUserConfig().e();
                                z = z9;
                                if (longValue < 0) {
                                    TLRPC.Chat K02 = dVar.getMessagesController().K0(Long.valueOf(-longValue));
                                    z = z9;
                                    if (K02 != null) {
                                        str = K02.title;
                                        z = z9;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User V1 = dVar.getMessagesController().V1(l);
                                    z = z9;
                                    if (V1 != null) {
                                        if (l7c.t(V1)) {
                                            str = k96.M0(2131754249, null);
                                            z = z9;
                                        } else {
                                            str = l7c.q(V1);
                                            z = z9;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                            String a0 = arrayList7.size() == 1 ? k96.a0(null, null, z ? 2131752069 : 2131752065, str) : k96.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = a0;
                            hdVar.U = arrayList7.size() == 1 ? k96.a0(null, null, z ? 2131752070 : 2131752071, str) : k96.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            String M03 = k96.M0(2131746128, null);
                            final byte b9 = r11 ? (byte) 1 : (byte) 0;
                            alertDialog$Builder.j(M03, new ed() { // from class: gca
                                @Override // ed
                                public final void u(hd hdVar2, int i5) {
                                    byte b10 = b9;
                                    ArrayList arrayList8 = arrayList7;
                                    nfa nfaVar2 = nfaVar;
                                    switch (b10) {
                                        case 0:
                                            d dVar2 = nfaVar2.y1;
                                            dVar2.getMessagesController().M1().r(arrayList8, nfaVar2.m1);
                                            u21.b0(dVar2).Q(R.raw.ic_delete, 36, k96.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            nfaVar2.E(false);
                                            break;
                                        default:
                                            for (int i6 = 0; i6 < arrayList8.size(); i6++) {
                                                nfaVar2.y1.getMessagesController().e0(((Long) arrayList8.get(i6)).longValue(), 0, null);
                                            }
                                            nfaVar2.E(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            dVar.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                break;
                            }
                        } else {
                            if (cf3.B(j)) {
                                encryptedChat = dVar.getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L)));
                                user = null;
                                K0 = null;
                            } else if (cf3.D(j)) {
                                user = dVar.getMessagesController().V1(Long.valueOf(j));
                                K0 = null;
                                encryptedChat = null;
                            } else {
                                K0 = dVar.getMessagesController().K0(Long.valueOf(-j));
                                user = null;
                                encryptedChat = null;
                            }
                            ij.y(dVar, user, K0, encryptedChat, null, nfaVar.f1, null, nfaVar.c1, null, 0, 0, null, new oba(nfaVar, (byte) 14), null, nfaVar.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (nfaVar.l0() && kcaVar != null && kcaVar.getCurrentList() != null) {
                            s1b currentList = kcaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i5 = 0; i5 < sparseArrayArr[0].size(); i5++) {
                                TL_stories.StoryItem storyItem = ((k27) sparseArrayArr[0].valueAt(i5)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                                String M04 = k96.M0(arrayList8.size() > 1 ? 2131751548 : 2131751552, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M04;
                                hdVar2.U = k96.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(k96.M0(2131751586, null), new io9(nfaVar, currentList, arrayList8));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), new ho9((byte) 15));
                                hdVar2.show();
                                hdVar2.h();
                                break;
                            }
                        } else {
                            final ArrayList arrayList9 = new ArrayList();
                            for (int i6 = 0; i6 < sparseArrayArr[0].size(); i6++) {
                                TL_stories.StoryItem storyItem2 = ((k27) sparseArrayArr[0].valueAt(i6)).l;
                                if (storyItem2 != null) {
                                    arrayList9.add(storyItem2);
                                }
                            }
                            if (!arrayList9.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wjbVar2, nfaVar.getContext());
                                String M05 = k96.M0(arrayList9.size() > 1 ? 2131751477 : 2131751475, null);
                                hd hdVar3 = alertDialog$Builder3.a;
                                hdVar3.S = M05;
                                hdVar3.U = k96.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                                String M06 = k96.M0(2131751586, null);
                                final boolean z10 = z3 ? 1 : 0;
                                alertDialog$Builder3.j(M06, new ed() { // from class: gca
                                    @Override // ed
                                    public final void u(hd hdVar22, int i52) {
                                        byte b10 = z10;
                                        ArrayList arrayList82 = arrayList9;
                                        nfa nfaVar2 = nfaVar;
                                        switch (b10) {
                                            case 0:
                                                d dVar2 = nfaVar2.y1;
                                                dVar2.getMessagesController().M1().r(arrayList82, nfaVar2.m1);
                                                u21.b0(dVar2).Q(R.raw.ic_delete, 36, k96.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                                nfaVar2.E(false);
                                                break;
                                            default:
                                                for (int i62 = 0; i62 < arrayList82.size(); i62++) {
                                                    nfaVar2.y1.getMessagesController().e0(((Long) arrayList82.get(i62)).longValue(), 0, null);
                                                }
                                                nfaVar2.E(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.g(k96.M0(2131752577, null), new ho9((byte) 16));
                                hdVar3.show();
                                hdVar3.h();
                                break;
                            }
                        }
                    }
                } else if (b4 == 100) {
                    if (nfaVar.h1 != null) {
                        na7 messagesController = dVar.getMessagesController();
                        TLRPC.UserFull userFull = nfaVar.h1;
                        messagesController.getClass();
                        if (na7.J2(userFull)) {
                            je5 je5Var = nfaVar.H1;
                            if (je5Var != null) {
                                je5Var.t(k96.M0(2131750517, null));
                                nfaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (nfaVar.g1 != null) {
                        TLRPC.Chat K03 = dVar.getMessagesController().K0(Long.valueOf(nfaVar.g1.id));
                        if (dVar.getMessagesController().k2(K03)) {
                            je5 je5Var2 = nfaVar.H1;
                            if (je5Var2 != null) {
                                je5Var2.t((!hc2.T(K03) || K03.megagroup) ? k96.M0(2131750518, null) : k96.M0(2131750519, null));
                                nfaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (nfaVar.e0()) {
                        je5 je5Var3 = nfaVar.H1;
                        if (je5Var3 != null) {
                            je5Var3.t(k96.M0(2131750520, "ForwardsRestrictedInfoBot"));
                            nfaVar.H1.x(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        cj3 cj3Var = new cj3(bundle);
                        cj3Var.E2 = new qba(nfaVar);
                        dVar.presentFragment(cj3Var);
                        break;
                    }
                } else if (b4 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        k27 k27Var = (k27) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = k27.B0(k27Var.k);
                        if (cf3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (cf3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat K04 = dVar.getMessagesController().K0(Long.valueOf(-B0));
                            if (K04 != null && K04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -K04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", k27Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        mu1 mu1Var = new mu1(bundle2);
                        mu1Var.d8 = k27Var.e1();
                        long j3 = nfaVar.G;
                        if (j3 != 0) {
                            mm4.a(mu1Var, zc7.a(B0, j3));
                            bundle2.putInt("message_id", k27Var.e1());
                        }
                        dVar.presentFragment(mu1Var, false);
                        break;
                    }
                } else if (b4 == 103 || b4 == 104) {
                    if (nfaVar.getClosestTab() != 8) {
                        vp9 D1 = dVar.getMessagesController().D1();
                        ArrayList arrayList10 = D1.j;
                        ArrayList arrayList11 = new ArrayList();
                        for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                            long j4 = ((up9) arrayList10.get(i7)).a;
                            if (yeaVar.x.contains(Long.valueOf(j4))) {
                                arrayList11.add(Long.valueOf(j4));
                            }
                        }
                        if (D1.m(arrayList11, b4 == 103, true)) {
                            int i8 = 0;
                            while (true) {
                                iea[] ieaVarArr = nfaVar.n0;
                                if (i8 < ieaVarArr.length) {
                                    iea ieaVar = ieaVarArr[i8];
                                    if (ieaVar.F == 11) {
                                        ieaVar.x.g1(0, 0);
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            dVar.showDialog(new h26(33, dVar.getCurrentAccount(), null, nfaVar.getContext(), dVar));
                        }
                        nfaVar.E(true);
                        break;
                    } else {
                        xda xdaVar = nfaVar.f0;
                        if (xdaVar != null && xdaVar.s != null) {
                            ArrayList arrayList12 = new ArrayList();
                            for (int i9 = 0; i9 < sparseArrayArr[0].size(); i9++) {
                                arrayList12.add(Integer.valueOf(((k27) sparseArrayArr[0].valueAt(i9)).e1()));
                            }
                            nfaVar.a1(arrayList12, b4 == 103);
                            nfaVar.E(false);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
