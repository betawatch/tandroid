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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ib implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ib(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pcc pccVar;
        xl9 O2;
        am9 q;
        TLRPC.Chat M0;
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
                jb jbVar = (jb) obj;
                if (b4 == 0) {
                    jbVar.Y1 = !jbVar.Y1;
                } else if (b4 == 1) {
                    jbVar.Z1 = !jbVar.Z1;
                } else if (b4 == 2) {
                    jbVar.a2 = !jbVar.a2;
                }
                jbVar.S1.O(true);
                jbVar.E0();
                break;
            case 1:
                View.OnClickListener onClickListener = ((fv1) obj).b[b4];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                w41 w41Var = ((vz1) obj).h;
                if (w41Var != null) {
                    w41Var.h(b4);
                    break;
                }
                break;
            case 3:
                ox5 ox5Var = (ox5) obj;
                ox5Var.R.dismiss();
                int i = ox5Var.d0;
                if (i >= 0) {
                    w51 w51Var = ox5Var.e0;
                    int[] iArr = w51Var.c;
                    if (!w51Var.b) {
                        w51Var.b = true;
                        for (int i2 = 0; i2 < 4; i2++) {
                            iArr[i2] = xea.q().getInt(uh9.k(i2, "keep_media_type_"), w51.b(i2));
                        }
                    }
                    iArr[i] = b4;
                    xea.q().edit().putInt("keep_media_type_" + i, b4).apply();
                    lx5 lx5Var = ox5Var.f0;
                    if (lx5Var != null) {
                        lx5Var.a(b4);
                        break;
                    }
                } else {
                    lx5 lx5Var2 = ox5Var.f0;
                    if (lx5Var2 != null) {
                        lx5Var2.a(b4);
                        break;
                    }
                }
                break;
            case 4:
                b18 b18Var = (b18) obj;
                f08 f08Var = b18Var.E1;
                b18Var.T0 = b4;
                if (b4 == 1) {
                    b18Var.j0 = b18Var.h0;
                } else if (b4 == 4) {
                    b18Var.j0 = b18Var.i0;
                } else if (b4 == 2) {
                    b18Var.j0 = b18Var.f0;
                } else if (b4 == 3) {
                    b18Var.j0 = b18Var.g0;
                } else {
                    b18Var.j0 = b18Var.e0;
                }
                oy9 oy9Var = (oy9) view.getTag();
                PhotoViewer.q0().T1(null, b18Var, null);
                if (b4 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b18Var.k1);
                    PhotoViewer.q0().j1(arrayList, 0, f08Var);
                    break;
                } else if (b4 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(b18Var.m1);
                    PhotoViewer.q0().j1(arrayList2, 0, f08Var);
                    break;
                } else if (b4 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(b18Var.n1);
                    PhotoViewer.q0().j1(arrayList3, 0, f08Var);
                    break;
                } else if (b4 == 0) {
                    PhotoViewer q0 = PhotoViewer.q0();
                    ArrayList arrayList4 = b18Var.j1;
                    q0.j1(arrayList4, arrayList4.indexOf(oy9Var), f08Var);
                    break;
                } else {
                    PhotoViewer q02 = PhotoViewer.q0();
                    ArrayList arrayList5 = b18Var.l1;
                    q02.j1(arrayList5, arrayList5.indexOf(oy9Var), f08Var);
                    break;
                }
            case 5:
                im8 im8Var = ((gm8) obj).b;
                if (im8Var.r && (pccVar = im8Var.f) != null) {
                    pccVar.a(Integer.valueOf(b4));
                    break;
                }
                break;
            case 6:
                final v72 v72Var = ((ui9) obj).a.a;
                vnb vnbVar = v72Var.a;
                pi9 pi9Var = v72Var.r;
                mk0 N2 = pi9Var.N2();
                byte b5 = 6;
                byte b6 = 9;
                byte b7 = 7;
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 4) {
                            if (b4 != 7) {
                                if (b4 == 9) {
                                    pi9Var.q3();
                                    break;
                                }
                            } else {
                                if (N2 != null) {
                                    TL_iv.PageBlock pageBlock = N2.b;
                                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                    }
                                }
                                Context context = v72Var.getContext();
                                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                    str = pageblockmath.source;
                                }
                                v72.W(context, str, new rx1(v72Var, pageblockmath, b5), vnbVar);
                                break;
                            }
                        } else {
                            xl9 xl9Var = pi9Var.q4;
                            if (xl9Var == null && (O2 = pi9Var.O2()) != null && O2.getModel() != null) {
                                View findFocus = pi9Var.findFocus();
                                if ((findFocus instanceof dg9) && (q = O2.q((dg9) findFocus)) != null) {
                                    pagetablecell = q.b;
                                }
                                if (pagetablecell != null) {
                                    pi9Var.c2(O2);
                                    if (O2.I.add(pagetablecell)) {
                                        O2.w.invalidate();
                                        O2.v();
                                    }
                                    xl9Var = O2;
                                }
                            }
                            if (xl9Var != null && xl9Var.getModel() != null && !xl9Var.I.isEmpty()) {
                                pi9Var.I4(xl9Var);
                                break;
                            } else {
                                pi9Var.O1(km9.t(2, 2));
                                break;
                            }
                        }
                    } else {
                        fu5 fu5Var = v72Var.I;
                        if (fu5Var != null) {
                            fu5Var.u();
                        }
                        final fu5 G = fu5.G(v72Var, vnbVar, view);
                        G.W = true;
                        G.i(N2 == null || !N2.b(), R.drawable.field_carret_empty, null, ob6.M0(2131753992, null), new g72(v72Var, N2, r11 ? (byte) 1 : (byte) 0));
                        G.i((N2 == null || !N2.b() || N2.a() || N2.c()) ? false : true, R.drawable.iv_list, null, ob6.M0(2131753999, null), new g72(v72Var, N2, b3));
                        G.i(N2 != null && N2.b() && !N2.a() && N2.c(), R.drawable.iv_ordered_list, null, ob6.M0(2131753996, null), new g72(v72Var, N2, (byte) 3));
                        G.i(N2 != null && N2.b() && N2.a() && !N2.c(), R.drawable.iv_todo, null, ob6.M0(2131753994, null), new g72(v72Var, N2, b2));
                        G.i(N2 != null && (N2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, ob6.M0(2131753980, null), new m72(pi9Var, r11 ? (byte) 1 : (byte) 0));
                        boolean i22 = pi9Var.i2();
                        boolean l2 = pi9Var.l2();
                        if (i22 || l2) {
                            G.j();
                            if (i22) {
                                String M02 = ob6.M0(2131754006, null);
                                final boolean z4 = z2 ? 1 : 0;
                                G.b(R.drawable.iv_list_tab, M02, new Runnable() { // from class: n72
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b8 = z4;
                                        fu5 fu5Var2 = G;
                                        v72 v72Var2 = v72Var;
                                        switch (b8) {
                                            case 0:
                                                v72Var2.r.o3(false);
                                                fu5Var2.u();
                                                break;
                                            default:
                                                v72Var2.r.o3(true);
                                                fu5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (l2) {
                                String M03 = ob6.M0(2131753991, null);
                                final byte b8 = r11 ? (byte) 1 : (byte) 0;
                                G.b(R.drawable.iv_list_untab, M03, new Runnable() { // from class: n72
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b82 = b8;
                                        fu5 fu5Var2 = G;
                                        v72 v72Var2 = v72Var;
                                        switch (b82) {
                                            case 0:
                                                v72Var2.r.o3(false);
                                                fu5Var2.u();
                                                break;
                                            default:
                                                v72Var2.r.o3(true);
                                                fu5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        G.a0 = true;
                        G.a0();
                        v72Var.I = G;
                        break;
                    }
                } else {
                    int i3 = v72Var.n;
                    fu5 fu5Var2 = v72Var.I;
                    if (fu5Var2 != null) {
                        fu5Var2.u();
                    }
                    fu5 H = fu5.H(v72Var, vnbVar, view, true);
                    H.W = true;
                    fu5 K = H.K();
                    boolean z5 = (uc7.s1(i3).D4() || yac.h(i3).p()) ? false : true;
                    K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(H, r11 ? (byte) 1 : (byte) 0), false);
                    K.j();
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, ob6.M0(2131754023, null), xea.S0 + 2, H);
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, ob6.M0(2131754022, null), xea.S0 + 1, H);
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, ob6.M0(2131754021, null), xea.S0, H);
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, ob6.M0(2131754020, null), xea.S0 - 1, H);
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, ob6.M0(2131754019, null), xea.S0 - 2, H);
                    v72Var.O(K, N2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, ob6.M0(2131754018, null), xea.S0 - 3, H);
                    boolean z6 = N2 != null && pi9.z3(N2.b);
                    wg9 wg9Var = new wg9(v72Var.getContext(), R.drawable.iv_h1);
                    wg9Var.a(z5);
                    byte b9 = 5;
                    H.i(z6, 0, wg9Var, ob6.M0(2131754024, null), new c10(H, K, b9));
                    H.i(N2 != null && (N2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, ob6.M0(2131753981, null), new g72(v72Var, N2, b9));
                    H.i(N2 != null && (N2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, ob6.M0(2131753989, null), new g72(v72Var, N2, b5));
                    boolean z7 = N2 != null && (N2.b instanceof TL_iv.pageBlockPullquote);
                    wg9 wg9Var2 = new wg9(v72Var.getContext(), R.drawable.iv_pullquote);
                    wg9Var2.a(z5);
                    H.i(z7, 0, wg9Var2, ob6.M0(2131753990, null), new g72(v72Var, N2, b7));
                    H.i(N2 != null && (N2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, ob6.M0(2131754048, null), new g72(v72Var, N2, (byte) 8));
                    boolean z8 = N2 != null && (N2.b instanceof TL_iv.pageBlockFooter);
                    wg9 wg9Var3 = new wg9(v72Var.getContext(), R.drawable.iv_footer);
                    wg9Var3.a(z5);
                    H.i(z8, 0, wg9Var3, ob6.M0(2131754025, null), new g72(v72Var, N2, b6));
                    H.a0();
                    v72Var.I = H;
                    break;
                }
                break;
            default:
                final eja ejaVar = (eja) obj;
                bga bgaVar = ejaVar.a0;
                pia piaVar = ejaVar.U;
                vnb vnbVar2 = ejaVar.I1;
                long j = ejaVar.m1;
                SparseArray[] sparseArrayArr = ejaVar.c1;
                e eVar = ejaVar.y1;
                if (b4 == 101) {
                    byte b10 = 13;
                    if (!eja.j0(ejaVar.getSelectedTab()) && ejaVar.getSelectedTab() != 13) {
                        if (ejaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = eVar.getMessagesController().F1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                                long j2 = ((mt9) arrayList6.get(i4)).a;
                                if (piaVar.x.contains(Long.valueOf(j2))) {
                                    arrayList7.add(Long.valueOf(j2));
                                }
                            }
                            if (arrayList7.isEmpty()) {
                                z = false;
                            } else {
                                Long l = (Long) arrayList7.get(0);
                                long longValue = l.longValue();
                                boolean z9 = longValue == eVar.getUserConfig().e();
                                z = z9;
                                if (longValue < 0) {
                                    TLRPC.Chat M04 = eVar.getMessagesController().M0(Long.valueOf(-longValue));
                                    z = z9;
                                    if (M04 != null) {
                                        str = M04.title;
                                        z = z9;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User X1 = eVar.getMessagesController().X1(l);
                                    z = z9;
                                    if (X1 != null) {
                                        if (lbc.u(X1)) {
                                            str = ob6.M0(2131754245, null);
                                            z = z9;
                                        } else {
                                            str = lbc.r(X1);
                                            z = z9;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                            String a0 = arrayList7.size() == 1 ? ob6.a0(null, null, z ? 2131752046 : 2131752042, str) : ob6.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = a0;
                            idVar.U = arrayList7.size() == 1 ? ob6.a0(null, null, z ? 2131752047 : 2131752048, str) : ob6.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            String M05 = ob6.M0(2131746048, null);
                            final byte b11 = r11 ? (byte) 1 : (byte) 0;
                            alertDialog$Builder.j(M05, new fd() { // from class: qfa
                                @Override // fd
                                public final void w(id idVar2, int i5) {
                                    byte b12 = b11;
                                    ArrayList arrayList8 = arrayList7;
                                    eja ejaVar2 = ejaVar;
                                    switch (b12) {
                                        case 0:
                                            e eVar2 = ejaVar2.y1;
                                            eVar2.getMessagesController().O1().r(arrayList8, ejaVar2.m1);
                                            d31.b0(eVar2).Q(R.raw.ic_delete, 36, ob6.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            ejaVar2.E(false);
                                            break;
                                        default:
                                            for (int i6 = 0; i6 < arrayList8.size(); i6++) {
                                                ejaVar2.y1.getMessagesController().g0(((Long) arrayList8.get(i6)).longValue(), 0, null);
                                            }
                                            ejaVar2.E(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            eVar.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                break;
                            }
                        } else {
                            if (wf3.B(j)) {
                                encryptedChat = eVar.getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L)));
                                user = null;
                                M0 = null;
                            } else if (wf3.D(j)) {
                                user = eVar.getMessagesController().X1(Long.valueOf(j));
                                M0 = null;
                                encryptedChat = null;
                            } else {
                                M0 = eVar.getMessagesController().M0(Long.valueOf(-j));
                                user = null;
                                encryptedChat = null;
                            }
                            jj.y(eVar, user, M0, encryptedChat, null, ejaVar.f1, null, ejaVar.c1, null, 0, 0, null, new gfa(ejaVar, b10), null, ejaVar.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (ejaVar.l0() && bgaVar != null && bgaVar.getCurrentList() != null) {
                            o5b currentList = bgaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i5 = 0; i5 < sparseArrayArr[0].size(); i5++) {
                                TL_stories.StoryItem storyItem = ((r47) sparseArrayArr[0].valueAt(i5)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                                String M06 = ob6.M0(arrayList8.size() > 1 ? 2131751525 : 2131751529, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M06;
                                idVar2.U = ob6.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(ob6.M0(2131751563, null), new o48(ejaVar, currentList, arrayList8, b10));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), new vr9((byte) 17));
                                idVar2.show();
                                idVar2.h();
                                break;
                            }
                        } else {
                            final ArrayList arrayList9 = new ArrayList();
                            for (int i6 = 0; i6 < sparseArrayArr[0].size(); i6++) {
                                TL_stories.StoryItem storyItem2 = ((r47) sparseArrayArr[0].valueAt(i6)).l;
                                if (storyItem2 != null) {
                                    arrayList9.add(storyItem2);
                                }
                            }
                            if (!arrayList9.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vnbVar2, ejaVar.getContext());
                                String M07 = ob6.M0(arrayList9.size() > 1 ? 2131751454 : 2131751452, null);
                                id idVar3 = alertDialog$Builder3.a;
                                idVar3.S = M07;
                                idVar3.U = ob6.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                                String M08 = ob6.M0(2131751563, null);
                                final boolean z10 = z3 ? 1 : 0;
                                alertDialog$Builder3.j(M08, new fd() { // from class: qfa
                                    @Override // fd
                                    public final void w(id idVar22, int i52) {
                                        byte b12 = z10;
                                        ArrayList arrayList82 = arrayList9;
                                        eja ejaVar2 = ejaVar;
                                        switch (b12) {
                                            case 0:
                                                e eVar2 = ejaVar2.y1;
                                                eVar2.getMessagesController().O1().r(arrayList82, ejaVar2.m1);
                                                d31.b0(eVar2).Q(R.raw.ic_delete, 36, ob6.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                                ejaVar2.E(false);
                                                break;
                                            default:
                                                for (int i62 = 0; i62 < arrayList82.size(); i62++) {
                                                    ejaVar2.y1.getMessagesController().g0(((Long) arrayList82.get(i62)).longValue(), 0, null);
                                                }
                                                ejaVar2.E(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.g(ob6.M0(2131752570, null), new vr9((byte) 18));
                                idVar3.show();
                                idVar3.h();
                                break;
                            }
                        }
                    }
                } else if (b4 == 100) {
                    if (ejaVar.h1 != null) {
                        uc7 messagesController = eVar.getMessagesController();
                        TLRPC.UserFull userFull = ejaVar.h1;
                        messagesController.getClass();
                        if (uc7.Q2(userFull)) {
                            kg5 kg5Var = ejaVar.H1;
                            if (kg5Var != null) {
                                kg5Var.t(ob6.M0(2131750494, null));
                                ejaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (ejaVar.g1 != null) {
                        TLRPC.Chat M09 = eVar.getMessagesController().M0(Long.valueOf(ejaVar.g1.id));
                        if (eVar.getMessagesController().m2(M09)) {
                            kg5 kg5Var2 = ejaVar.H1;
                            if (kg5Var2 != null) {
                                kg5Var2.t((!xc2.T(M09) || M09.megagroup) ? ob6.M0(2131750495, null) : ob6.M0(2131750496, null));
                                ejaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (ejaVar.e0()) {
                        kg5 kg5Var3 = ejaVar.H1;
                        if (kg5Var3 != null) {
                            kg5Var3.t(ob6.M0(2131750497, "ForwardsRestrictedInfoBot"));
                            ejaVar.H1.x(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        uj3 uj3Var = new uj3(bundle);
                        uj3Var.E2 = new hfa(ejaVar);
                        eVar.presentFragment(uj3Var);
                        break;
                    }
                } else if (b4 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        r47 r47Var = (r47) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = r47.B0(r47Var.k);
                        if (wf3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (wf3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat M010 = eVar.getMessagesController().M0(Long.valueOf(-B0));
                            if (M010 != null && M010.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -M010.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", r47Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        zu1 zu1Var = new zu1(bundle2);
                        zu1Var.d8 = r47Var.e1();
                        long j3 = ejaVar.G;
                        if (j3 != 0) {
                            ro4.a(zu1Var, if7.a(B0, j3));
                            bundle2.putInt("message_id", r47Var.e1());
                        }
                        eVar.presentFragment(zu1Var, false);
                        break;
                    }
                } else if (b4 == 103 || b4 == 104) {
                    if (ejaVar.getClosestTab() != 8) {
                        nt9 F1 = eVar.getMessagesController().F1();
                        ArrayList arrayList10 = F1.j;
                        ArrayList arrayList11 = new ArrayList();
                        for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                            long j4 = ((mt9) arrayList10.get(i7)).a;
                            if (piaVar.x.contains(Long.valueOf(j4))) {
                                arrayList11.add(Long.valueOf(j4));
                            }
                        }
                        if (F1.m(arrayList11, b4 == 103, true)) {
                            int i8 = 0;
                            while (true) {
                                zha[] zhaVarArr = ejaVar.n0;
                                if (i8 < zhaVarArr.length) {
                                    zha zhaVar = zhaVarArr[i8];
                                    if (zhaVar.F == 11) {
                                        zhaVar.x.g1(0, 0);
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            eVar.showDialog(new l46(33, eVar.getCurrentAccount(), null, ejaVar.getContext(), eVar));
                        }
                        ejaVar.E(true);
                        break;
                    } else {
                        oha ohaVar = ejaVar.f0;
                        if (ohaVar != null && ohaVar.s != null) {
                            ArrayList arrayList12 = new ArrayList();
                            for (int i9 = 0; i9 < sparseArrayArr[0].size(); i9++) {
                                arrayList12.add(Integer.valueOf(((r47) sparseArrayArr[0].valueAt(i9)).e1()));
                            }
                            ejaVar.a1(arrayList12, b4 == 103);
                            ejaVar.E(false);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
