package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mx b;

    public /* synthetic */ lx(mx mxVar, int i10) {
        this.a = i10;
        this.b = mxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i10;
        TLRPC.StickerSet stickerSet3;
        int i11 = this.a;
        mx mxVar = this.b;
        switch (i11) {
            case 0:
                ix ixVar = mxVar.x;
                if (ixVar != null && (stickerSet = ixVar.b) != null) {
                    vy vyVar = mxVar.G;
                    if (!vyVar.w2) {
                        vyVar.w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new nw(vyVar, vyVar.Y1, vyVar.getContext(), vyVar.Z1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                kg.x0 x0Var = mxVar.r;
                TextView textView = mxVar.n;
                TextView textView2 = mxVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (x0Var != null && x0Var.getVisibility() == 0 && x0Var.w.isEnabled()) {
                            x0Var.performClick();
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
                vy vyVar2 = mxVar.G;
                ArrayList arrayList2 = vyVar2.p1;
                ix ixVar2 = mxVar.x;
                if (ixVar2 != null && (stickerSet2 = ixVar2.b) != null) {
                    ixVar2.f = true;
                    ex exVar = vyVar2.R;
                    int i12 = vyVar2.c1;
                    ArrayList arrayList3 = vyVar2.q1;
                    hx hxVar = vyVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(mxVar.x.b.id));
                    }
                    mxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= hxVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(hxVar.getChildAt(i13) instanceof kx) || (R = RecyclerView.R((view2 = hxVar.getChildAt(i13)))) < 0 || (i10 = exVar.x.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || mxVar.x == null || ((ix) arrayList3.get(i10)).b.id != mxVar.x.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        exVar.E(num.intValue(), view2);
                    }
                    if (mxVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = mxVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i12).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.k2 k2Var = vyVar2.Y1;
                            if (k2Var == null) {
                                k2Var = new kg.q1(mxVar, 4);
                            }
                            cv.J0(k2Var, m0, true, null, new ho(mxVar, 15));
                            break;
                        } else {
                            org.telegram.messenger.zs.f(i12).c(mxVar, 64);
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i12);
                            mxVar.s = tL_inputStickerSetID2;
                            b02.m0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                vy vyVar3 = mxVar.G;
                ix ixVar3 = mxVar.x;
                if (ixVar3 != null && (stickerSet3 = ixVar3.b) != null) {
                    ixVar3.f = false;
                    ArrayList arrayList4 = vyVar3.p1;
                    int i14 = vyVar3.c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    mxVar.a(true);
                    zw zwVar = vyVar3.I;
                    if (zwVar != null) {
                        zwVar.p(vyVar3.getEmojipacks());
                    }
                    vyVar3.V(vyVar3.Q.I0());
                    if (mxVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = mxVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.ui.b0(i14).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = vyVar3.Y1;
                            if (k2Var2 == null) {
                                k2Var2 = new kg.q1(mxVar, 4);
                            }
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                            at atVar = new at(5, mxVar, m02);
                            Pattern pattern = cv.M1;
                            if (k2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(k2Var3.getCurrentAccount()).g2(k2Var3.getFragmentView().getContext(), m02, null, 0, k2Var3, null, true, true, atVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.zs.f(i14).c(mxVar, 64);
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i14);
                            mxVar.w = tL_inputStickerSetID3;
                            b03.m0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                vx vxVar = mxVar.G.t1;
                if (vxVar != null) {
                    vxVar.q();
                    break;
                }
                break;
            case 5:
                vx vxVar2 = mxVar.G.t1;
                if (vxVar2 != null) {
                    vxVar2.q();
                    break;
                }
                break;
            default:
                vx vxVar3 = mxVar.G.t1;
                if (vxVar3 != null) {
                    vxVar3.q();
                    break;
                }
                break;
        }
    }
}
