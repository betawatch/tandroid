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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        qac qacVar;
        kk9 N2;
        nk9 q;
        TLRPC.Chat L0;
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
                View.OnClickListener onClickListener = ((ew1) obj).b[b4];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                v51 v51Var = ((q02) obj).h;
                if (v51Var != null) {
                    v51Var.h(b4);
                    break;
                }
                break;
            case 3:
                jx5 jx5Var = (jx5) obj;
                jx5Var.R.dismiss();
                int i = jx5Var.d0;
                if (i >= 0) {
                    v61 v61Var = jx5Var.e0;
                    int[] iArr = v61Var.c;
                    if (!v61Var.b) {
                        v61Var.b = true;
                        for (int i2 = 0; i2 < 4; i2++) {
                            iArr[i2] = gda.q().getInt(hg9.j(i2, "keep_media_type_"), v61.b(i2));
                        }
                    }
                    iArr[i] = b4;
                    gda.q().edit().putInt("keep_media_type_" + i, b4).apply();
                    gx5 gx5Var = jx5Var.f0;
                    if (gx5Var != null) {
                        gx5Var.a(b4);
                        break;
                    }
                } else {
                    gx5 gx5Var2 = jx5Var.f0;
                    if (gx5Var2 != null) {
                        gx5Var2.a(b4);
                        break;
                    }
                }
                break;
            case 4:
                xz7 xz7Var = (xz7) obj;
                az7 az7Var = xz7Var.E1;
                xz7Var.T0 = b4;
                if (b4 == 1) {
                    xz7Var.j0 = xz7Var.h0;
                } else if (b4 == 4) {
                    xz7Var.j0 = xz7Var.i0;
                } else if (b4 == 2) {
                    xz7Var.j0 = xz7Var.f0;
                } else if (b4 == 3) {
                    xz7Var.j0 = xz7Var.g0;
                } else {
                    xz7Var.j0 = xz7Var.e0;
                }
                xw9 xw9Var = (xw9) view.getTag();
                PhotoViewer.r0().T1(null, xz7Var, null);
                if (b4 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xz7Var.k1);
                    PhotoViewer.r0().j1(arrayList, 0, az7Var);
                    break;
                } else if (b4 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(xz7Var.m1);
                    PhotoViewer.r0().j1(arrayList2, 0, az7Var);
                    break;
                } else if (b4 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(xz7Var.n1);
                    PhotoViewer.r0().j1(arrayList3, 0, az7Var);
                    break;
                } else if (b4 == 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    ArrayList arrayList4 = xz7Var.j1;
                    r0.j1(arrayList4, arrayList4.indexOf(xw9Var), az7Var);
                    break;
                } else {
                    PhotoViewer r02 = PhotoViewer.r0();
                    ArrayList arrayList5 = xz7Var.l1;
                    r02.j1(arrayList5, arrayList5.indexOf(xw9Var), az7Var);
                    break;
                }
            case 5:
                yk8 yk8Var = ((vk8) obj).b;
                if (yk8Var.r && (qacVar = yk8Var.f) != null) {
                    qacVar.a(Integer.valueOf(b4));
                    break;
                }
                break;
            case 6:
                final p82 p82Var = ((hh9) obj).a.a;
                ylb ylbVar = p82Var.a;
                ch9 ch9Var = p82Var.r;
                ll0 M2 = ch9Var.M2();
                byte b5 = 6;
                byte b6 = 9;
                byte b7 = 7;
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 4) {
                            if (b4 != 7) {
                                if (b4 == 9) {
                                    ch9Var.p3();
                                    break;
                                }
                            } else {
                                if (M2 != null) {
                                    TL_iv.PageBlock pageBlock = M2.b;
                                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                    }
                                }
                                Context context = p82Var.getContext();
                                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                    str = pageblockmath.source;
                                }
                                p82.X(context, str, new qy1(p82Var, pageblockmath, b5), ylbVar);
                                break;
                            }
                        } else {
                            kk9 kk9Var = ch9Var.q4;
                            if (kk9Var == null && (N2 = ch9Var.N2()) != null && N2.getModel() != null) {
                                View findFocus = ch9Var.findFocus();
                                if ((findFocus instanceof ne9) && (q = N2.q((ne9) findFocus)) != null) {
                                    pagetablecell = q.b;
                                }
                                if (pagetablecell != null) {
                                    ch9Var.b2(N2);
                                    if (N2.I.add(pagetablecell)) {
                                        N2.w.invalidate();
                                        N2.v();
                                    }
                                    kk9Var = N2;
                                }
                            }
                            if (kk9Var != null && kk9Var.getModel() != null && !kk9Var.I.isEmpty()) {
                                ch9Var.H4(kk9Var);
                                break;
                            } else {
                                ch9Var.N1(xk9.t(2, 2));
                                break;
                            }
                        }
                    } else {
                        bu5 bu5Var = p82Var.I;
                        if (bu5Var != null) {
                            bu5Var.u();
                        }
                        final bu5 G = bu5.G(p82Var, ylbVar, view);
                        G.T = true;
                        G.i(M2 == null || !M2.b(), R.drawable.field_carret_empty, null, jb6.M0(2131753964, null), new g82(p82Var, M2, r11 ? (byte) 1 : (byte) 0));
                        G.i((M2 == null || !M2.b() || M2.a() || M2.c()) ? false : true, R.drawable.iv_list, null, jb6.M0(2131753971, null), new g82(p82Var, M2, b3));
                        G.i(M2 != null && M2.b() && !M2.a() && M2.c(), R.drawable.iv_ordered_list, null, jb6.M0(2131753968, null), new g82(p82Var, M2, (byte) 3));
                        G.i(M2 != null && M2.b() && M2.a() && !M2.c(), R.drawable.iv_todo, null, jb6.M0(2131753966, null), new g82(p82Var, M2, b2));
                        G.i(M2 != null && (M2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, jb6.M0(2131753952, null), new b82(ch9Var, r11 ? (byte) 1 : (byte) 0));
                        boolean h2 = ch9Var.h2();
                        boolean k2 = ch9Var.k2();
                        if (h2 || k2) {
                            G.j();
                            if (h2) {
                                String M0 = jb6.M0(2131753978, null);
                                final boolean z4 = z2 ? 1 : 0;
                                G.b(R.drawable.iv_list_tab, M0, new Runnable() { // from class: h82
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b8 = z4;
                                        bu5 bu5Var2 = G;
                                        p82 p82Var2 = p82Var;
                                        switch (b8) {
                                            case 0:
                                                p82Var2.r.n3(false);
                                                bu5Var2.u();
                                                break;
                                            default:
                                                p82Var2.r.n3(true);
                                                bu5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (k2) {
                                String M02 = jb6.M0(2131753963, null);
                                final byte b8 = r11 ? (byte) 1 : (byte) 0;
                                G.b(R.drawable.iv_list_untab, M02, new Runnable() { // from class: h82
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b82 = b8;
                                        bu5 bu5Var2 = G;
                                        p82 p82Var2 = p82Var;
                                        switch (b82) {
                                            case 0:
                                                p82Var2.r.n3(false);
                                                bu5Var2.u();
                                                break;
                                            default:
                                                p82Var2.r.n3(true);
                                                bu5Var2.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        G.X = true;
                        G.a0();
                        p82Var.I = G;
                        break;
                    }
                } else {
                    int i3 = p82Var.n;
                    bu5 bu5Var2 = p82Var.I;
                    if (bu5Var2 != null) {
                        bu5Var2.u();
                    }
                    bu5 H = bu5.H(p82Var, ylbVar, view, true);
                    H.T = true;
                    bu5 K = H.K();
                    boolean z5 = (oc7.r1(i3).x4() || z8c.h(i3).p()) ? false : true;
                    K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(H, r11 ? (byte) 1 : (byte) 0), false);
                    K.j();
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, jb6.M0(2131753995, null), gda.S0 + 2, H);
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, jb6.M0(2131753994, null), gda.S0 + 1, H);
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, jb6.M0(2131753993, null), gda.S0, H);
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, jb6.M0(2131753992, null), gda.S0 - 1, H);
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, jb6.M0(2131753991, null), gda.S0 - 2, H);
                    p82Var.O(K, M2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, jb6.M0(2131753990, null), gda.S0 - 3, H);
                    boolean z6 = M2 != null && ch9.y3(M2.b);
                    hf9 hf9Var = new hf9(p82Var.getContext(), R.drawable.iv_h1);
                    hf9Var.a(z5);
                    byte b9 = 5;
                    H.i(z6, 0, hf9Var, jb6.M0(2131753996, null), new c20(H, K, b9));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, jb6.M0(2131753953, null), new g82(p82Var, M2, b9));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, jb6.M0(2131753961, null), new g82(p82Var, M2, b5));
                    boolean z7 = M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote);
                    hf9 hf9Var2 = new hf9(p82Var.getContext(), R.drawable.iv_pullquote);
                    hf9Var2.a(z5);
                    H.i(z7, 0, hf9Var2, jb6.M0(2131753962, null), new g82(p82Var, M2, b7));
                    H.i(M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, jb6.M0(2131754020, null), new g82(p82Var, M2, (byte) 8));
                    boolean z8 = M2 != null && (M2.b instanceof TL_iv.pageBlockFooter);
                    hf9 hf9Var3 = new hf9(p82Var.getContext(), R.drawable.iv_footer);
                    hf9Var3.a(z5);
                    H.i(z8, 0, hf9Var3, jb6.M0(2131753997, null), new g82(p82Var, M2, b6));
                    H.a0();
                    p82Var.I = H;
                    break;
                }
                break;
            default:
                final nha nhaVar = (nha) obj;
                kea keaVar = nhaVar.a0;
                yga ygaVar = nhaVar.U;
                ylb ylbVar2 = nhaVar.I1;
                long j = nhaVar.m1;
                SparseArray[] sparseArrayArr = nhaVar.c1;
                d dVar = nhaVar.y1;
                if (b4 == 101) {
                    if (!nha.j0(nhaVar.getSelectedTab()) && nhaVar.getSelectedTab() != 13) {
                        if (nhaVar.getSelectedTab() == 11) {
                            ArrayList arrayList6 = dVar.getMessagesController().E1().j;
                            final ArrayList arrayList7 = new ArrayList();
                            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                                long j2 = ((vr9) arrayList6.get(i4)).a;
                                if (ygaVar.x.contains(Long.valueOf(j2))) {
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
                                    TLRPC.Chat L02 = dVar.getMessagesController().L0(Long.valueOf(-longValue));
                                    z = z9;
                                    if (L02 != null) {
                                        str = L02.title;
                                        z = z9;
                                    }
                                } else if (longValue >= 0) {
                                    TLRPC.User W1 = dVar.getMessagesController().W1(l);
                                    z = z9;
                                    if (W1 != null) {
                                        if (m9c.u(W1)) {
                                            str = jb6.M0(2131754217, null);
                                            z = z9;
                                        } else {
                                            str = m9c.r(W1);
                                            z = z9;
                                        }
                                    }
                                }
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                            String a0 = arrayList7.size() == 1 ? jb6.a0(null, null, z ? 2131752018 : 2131752014, str) : jb6.G(arrayList7.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = a0;
                            heVar.U = arrayList7.size() == 1 ? jb6.a0(null, null, z ? 2131752019 : 2131752020, str) : jb6.G(arrayList7.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            String M03 = jb6.M0(2131746054, null);
                            final byte b10 = r11 ? (byte) 1 : (byte) 0;
                            alertDialog$Builder.j(M03, new ee() { // from class: hea
                                @Override // ee
                                public final void r(he heVar2, int i5) {
                                    byte b11 = b10;
                                    ArrayList arrayList8 = arrayList7;
                                    nha nhaVar2 = nhaVar;
                                    switch (b11) {
                                        case 0:
                                            d dVar2 = nhaVar2.y1;
                                            dVar2.getMessagesController().N1().r(arrayList8, nhaVar2.m1);
                                            c41.b0(dVar2).Q(R.raw.ic_delete, 36, jb6.G(arrayList8.size(), "StoriesDeleted", new Object[0])).j();
                                            nhaVar2.E(false);
                                            break;
                                        default:
                                            for (int i6 = 0; i6 < arrayList8.size(); i6++) {
                                                nhaVar2.y1.getMessagesController().e0(((Long) arrayList8.get(i6)).longValue(), 0, null);
                                            }
                                            nhaVar2.E(true);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            dVar.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                break;
                            }
                        } else {
                            if (pg3.B(j)) {
                                encryptedChat = dVar.getMessagesController().Z0(Integer.valueOf((int) (j & 4294967295L)));
                                user = null;
                                L0 = null;
                            } else if (pg3.D(j)) {
                                user = dVar.getMessagesController().W1(Long.valueOf(j));
                                L0 = null;
                                encryptedChat = null;
                            } else {
                                L0 = dVar.getMessagesController().L0(Long.valueOf(-j));
                                user = null;
                                encryptedChat = null;
                            }
                            ik.y(dVar, user, L0, encryptedChat, null, nhaVar.f1, null, nhaVar.c1, null, 0, 0, null, new oda(nhaVar, (byte) 14), null, nhaVar.I1);
                            break;
                        }
                    } else if (sparseArrayArr[0] != null) {
                        if (nhaVar.l0() && keaVar != null && keaVar.getCurrentList() != null) {
                            t3b currentList = keaVar.getCurrentList();
                            ArrayList arrayList8 = new ArrayList();
                            for (int i5 = 0; i5 < sparseArrayArr[0].size(); i5++) {
                                TL_stories.StoryItem storyItem = ((k47) sparseArrayArr[0].valueAt(i5)).l;
                                if (storyItem != null) {
                                    arrayList8.add(storyItem.media);
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                                String M04 = jb6.M0(arrayList8.size() > 1 ? 2131751497 : 2131751501, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.S = M04;
                                heVar2.U = jb6.G(arrayList8.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.j(jb6.M0(2131751535, null), new jq9(nhaVar, currentList, arrayList8));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), new dq9((byte) 16));
                                heVar2.show();
                                heVar2.h();
                                break;
                            }
                        } else {
                            final ArrayList arrayList9 = new ArrayList();
                            for (int i6 = 0; i6 < sparseArrayArr[0].size(); i6++) {
                                TL_stories.StoryItem storyItem2 = ((k47) sparseArrayArr[0].valueAt(i6)).l;
                                if (storyItem2 != null) {
                                    arrayList9.add(storyItem2);
                                }
                            }
                            if (!arrayList9.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ylbVar2, nhaVar.getContext());
                                String M05 = jb6.M0(arrayList9.size() > 1 ? 2131751426 : 2131751424, null);
                                he heVar3 = alertDialog$Builder3.a;
                                heVar3.S = M05;
                                heVar3.U = jb6.G(arrayList9.size(), "DeleteStoriesSubtitle", new Object[0]);
                                String M06 = jb6.M0(2131751535, null);
                                final boolean z10 = z3 ? 1 : 0;
                                alertDialog$Builder3.j(M06, new ee() { // from class: hea
                                    @Override // ee
                                    public final void r(he heVar22, int i52) {
                                        byte b11 = z10;
                                        ArrayList arrayList82 = arrayList9;
                                        nha nhaVar2 = nhaVar;
                                        switch (b11) {
                                            case 0:
                                                d dVar2 = nhaVar2.y1;
                                                dVar2.getMessagesController().N1().r(arrayList82, nhaVar2.m1);
                                                c41.b0(dVar2).Q(R.raw.ic_delete, 36, jb6.G(arrayList82.size(), "StoriesDeleted", new Object[0])).j();
                                                nhaVar2.E(false);
                                                break;
                                            default:
                                                for (int i62 = 0; i62 < arrayList82.size(); i62++) {
                                                    nhaVar2.y1.getMessagesController().e0(((Long) arrayList82.get(i62)).longValue(), 0, null);
                                                }
                                                nhaVar2.E(true);
                                                break;
                                        }
                                    }
                                });
                                alertDialog$Builder3.g(jb6.M0(2131752542, null), new dq9((byte) 17));
                                heVar3.show();
                                heVar3.h();
                                break;
                            }
                        }
                    }
                } else if (b4 == 100) {
                    if (nhaVar.h1 != null) {
                        oc7 messagesController = dVar.getMessagesController();
                        TLRPC.UserFull userFull = nhaVar.h1;
                        messagesController.getClass();
                        if (oc7.M2(userFull)) {
                            hg5 hg5Var = nhaVar.H1;
                            if (hg5Var != null) {
                                hg5Var.t(jb6.M0(2131750466, null));
                                nhaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (nhaVar.g1 != null) {
                        TLRPC.Chat L03 = dVar.getMessagesController().L0(Long.valueOf(nhaVar.g1.id));
                        if (dVar.getMessagesController().l2(L03)) {
                            hg5 hg5Var2 = nhaVar.H1;
                            if (hg5Var2 != null) {
                                hg5Var2.t((!sd2.T(L03) || L03.megagroup) ? jb6.M0(2131750467, null) : jb6.M0(2131750468, null));
                                nhaVar.H1.x(view, true);
                                break;
                            }
                        }
                    }
                    if (nhaVar.e0()) {
                        hg5 hg5Var3 = nhaVar.H1;
                        if (hg5Var3 != null) {
                            hg5Var3.t(jb6.M0(2131750469, "ForwardsRestrictedInfoBot"));
                            nhaVar.H1.x(view, true);
                            break;
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("canSelectTopics", true);
                        bundle.putInt("dialogsType", 3);
                        nk3 nk3Var = new nk3(bundle);
                        nk3Var.E2 = new qda(nhaVar);
                        dVar.presentFragment(nk3Var);
                        break;
                    }
                } else if (b4 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        k47 k47Var = (k47) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = k47.B0(k47Var.k);
                        if (pg3.B(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (pg3.D(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat L04 = dVar.getMessagesController().L0(Long.valueOf(-B0));
                            if (L04 != null && L04.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -L04.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", k47Var.e1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        yv1 yv1Var = new yv1(bundle2);
                        yv1Var.d8 = k47Var.e1();
                        long j3 = nhaVar.G;
                        if (j3 != 0) {
                            no4.a(yv1Var, bf7.a(B0, j3));
                            bundle2.putInt("message_id", k47Var.e1());
                        }
                        dVar.presentFragment(yv1Var, false);
                        break;
                    }
                } else if (b4 == 103 || b4 == 104) {
                    if (nhaVar.getClosestTab() != 8) {
                        wr9 E1 = dVar.getMessagesController().E1();
                        ArrayList arrayList10 = E1.j;
                        ArrayList arrayList11 = new ArrayList();
                        for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                            long j4 = ((vr9) arrayList10.get(i7)).a;
                            if (ygaVar.x.contains(Long.valueOf(j4))) {
                                arrayList11.add(Long.valueOf(j4));
                            }
                        }
                        if (E1.m(arrayList11, b4 == 103, true)) {
                            int i8 = 0;
                            while (true) {
                                iga[] igaVarArr = nhaVar.n0;
                                if (i8 < igaVarArr.length) {
                                    iga igaVar = igaVarArr[i8];
                                    if (igaVar.F == 11) {
                                        igaVar.x.g1(0, 0);
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            dVar.showDialog(new i46(33, dVar.getCurrentAccount(), null, nhaVar.getContext(), dVar));
                        }
                        nhaVar.E(true);
                        break;
                    } else {
                        xfa xfaVar = nhaVar.f0;
                        if (xfaVar != null && xfaVar.s != null) {
                            ArrayList arrayList12 = new ArrayList();
                            for (int i9 = 0; i9 < sparseArrayArr[0].size(); i9++) {
                                arrayList12.add(Integer.valueOf(((k47) sparseArrayArr[0].valueAt(i9)).e1()));
                            }
                            nhaVar.a1(arrayList12, b4 == 103);
                            nhaVar.E(false);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
