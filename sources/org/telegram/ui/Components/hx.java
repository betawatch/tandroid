package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ix b;

    public /* synthetic */ hx(ix ixVar, int i7) {
        this.a = i7;
        this.b = ixVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i7;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.a;
        ix ixVar = this.b;
        switch (i10) {
            case 0:
                ex exVar = ixVar.x;
                if (exVar != null && (stickerSet = exVar.b) != null) {
                    qy qyVar = ixVar.H;
                    if (!qyVar.x2) {
                        qyVar.x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new kw(qyVar, qyVar.Z1, qyVar.getContext(), qyVar.a2, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ug.r0 r0Var = ixVar.r;
                TextView textView = ixVar.n;
                TextView textView2 = ixVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (r0Var != null && r0Var.getVisibility() == 0 && r0Var.w.isEnabled()) {
                            r0Var.performClick();
                            break;
                        }
                    } else {
                        textView.performClick();
                        break;
                    }
                } else {
                    textView2.performClick();
                    break;
                }
                break;
            case 2:
                qy qyVar2 = ixVar.H;
                ArrayList arrayList2 = qyVar2.q1;
                ex exVar2 = ixVar.x;
                if (exVar2 != null && (stickerSet2 = exVar2.b) != null) {
                    exVar2.f = true;
                    ax axVar = qyVar2.S;
                    int i11 = qyVar2.d1;
                    ArrayList arrayList3 = qyVar2.r1;
                    dx dxVar = qyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(ixVar.x.b.id));
                    }
                    ixVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= dxVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(dxVar.getChildAt(i12) instanceof gx) || (R = RecyclerView.R((view2 = dxVar.getChildAt(i12)))) < 0 || (i7 = axVar.x.get(R)) < 0 || i7 >= arrayList3.size() || arrayList3.get(i7) == null || ixVar.x == null || ((ex) arrayList3.get(i7)).b.id != ixVar.x.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        axVar.E(num.intValue(), view2);
                    }
                    if (ixVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ixVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var = qyVar2.Z1;
                            if (g2Var == null) {
                                g2Var = new bi.e9(ixVar, 8);
                            }
                            bv.K0(g2Var, o02, true, null, new lo(ixVar, 15));
                            break;
                        } else {
                            org.telegram.messenger.ks.f(i11).c(ixVar, 64);
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                            ixVar.s = tL_inputStickerSetID2;
                            d02.o0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                qy qyVar3 = ixVar.H;
                ex exVar3 = ixVar.x;
                if (exVar3 != null && (stickerSet3 = exVar3.b) != null) {
                    exVar3.f = false;
                    ArrayList arrayList4 = qyVar3.q1;
                    int i13 = qyVar3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    ixVar.a(true);
                    vw vwVar = qyVar3.J;
                    if (vwVar != null) {
                        vwVar.p(qyVar3.getEmojipacks());
                    }
                    qyVar3.V(qyVar3.R.I0());
                    if (ixVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = ixVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = qyVar3.Z1;
                            if (g2Var2 == null) {
                                g2Var2 = new bi.e9(ixVar, 8);
                            }
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            bt btVar = new bt(5, ixVar, o03);
                            Pattern pattern = bv.Q1;
                            if (g2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), o03, null, 0, g2Var3, null, true, true, btVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ks.f(i13).c(ixVar, 64);
                            org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                            ixVar.w = tL_inputStickerSetID3;
                            d03.o0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                qx qxVar = ixVar.H.u1;
                if (qxVar != null) {
                    qxVar.q();
                    break;
                }
                break;
            case 5:
                qx qxVar2 = ixVar.H.u1;
                if (qxVar2 != null) {
                    qxVar2.q();
                    break;
                }
                break;
            default:
                qx qxVar3 = ixVar.H.u1;
                if (qxVar3 != null) {
                    qxVar3.q();
                    break;
                }
                break;
        }
    }
}
