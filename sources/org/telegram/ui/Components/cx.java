package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx b;

    public /* synthetic */ cx(dx dxVar, int i7) {
        this.a = i7;
        this.b = dxVar;
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
        dx dxVar = this.b;
        switch (i10) {
            case 0:
                zw zwVar = dxVar.x;
                if (zwVar != null && (stickerSet = zwVar.b) != null) {
                    ly lyVar = dxVar.H;
                    if (!lyVar.x2) {
                        lyVar.x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new fw(lyVar, lyVar.Z1, lyVar.getContext(), lyVar.a2, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ug.q0 q0Var = dxVar.r;
                TextView textView = dxVar.n;
                TextView textView2 = dxVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.w.isEnabled()) {
                            q0Var.performClick();
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
                ly lyVar2 = dxVar.H;
                ArrayList arrayList2 = lyVar2.q1;
                zw zwVar2 = dxVar.x;
                if (zwVar2 != null && (stickerSet2 = zwVar2.b) != null) {
                    zwVar2.f = true;
                    vw vwVar = lyVar2.S;
                    int i11 = lyVar2.d1;
                    ArrayList arrayList3 = lyVar2.r1;
                    yw ywVar = lyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(dxVar.x.b.id));
                    }
                    dxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= ywVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(ywVar.getChildAt(i12) instanceof bx) || (R = RecyclerView.R((view2 = ywVar.getChildAt(i12)))) < 0 || (i7 = vwVar.x.get(R)) < 0 || i7 >= arrayList3.size() || arrayList3.get(i7) == null || dxVar.x == null || ((zw) arrayList3.get(i7)).b.id != dxVar.x.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        vwVar.E(num.intValue(), view2);
                    }
                    if (dxVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = dxVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.e2 e2Var = lyVar2.Z1;
                            if (e2Var == null) {
                                e2Var = new bi.t6(dxVar, 8);
                            }
                            wu.J0(e2Var, m0, true, null, new fo(dxVar, 15));
                            break;
                        } else {
                            org.telegram.messenger.ns.f(i11).c(dxVar, 64);
                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i11);
                            dxVar.s = tL_inputStickerSetID2;
                            b02.m0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ly lyVar3 = dxVar.H;
                zw zwVar3 = dxVar.x;
                if (zwVar3 != null && (stickerSet3 = zwVar3.b) != null) {
                    zwVar3.f = false;
                    ArrayList arrayList4 = lyVar3.q1;
                    int i13 = lyVar3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    dxVar.a(true);
                    qw qwVar = lyVar3.J;
                    if (qwVar != null) {
                        qwVar.p(lyVar3.getEmojipacks());
                    }
                    lyVar3.V(lyVar3.R.I0());
                    if (dxVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = dxVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.si.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.e2 e2Var2 = lyVar3.Z1;
                            if (e2Var2 == null) {
                                e2Var2 = new bi.t6(dxVar, 8);
                            }
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                            vs vsVar = new vs(5, dxVar, m02);
                            Pattern pattern = wu.Q1;
                            if (e2Var3.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(e2Var3.getCurrentAccount()).g2(e2Var3.getFragmentView().getContext(), m02, null, 0, e2Var3, null, true, true, vsVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ns.f(i13).c(dxVar, 64);
                            org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(i13);
                            dxVar.w = tL_inputStickerSetID3;
                            b03.m0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                mx mxVar = dxVar.H.u1;
                if (mxVar != null) {
                    mxVar.q();
                    break;
                }
                break;
            case 5:
                mx mxVar2 = dxVar.H.u1;
                if (mxVar2 != null) {
                    mxVar2.q();
                    break;
                }
                break;
            default:
                mx mxVar3 = dxVar.H.u1;
                if (mxVar3 != null) {
                    mxVar3.q();
                    break;
                }
                break;
        }
    }
}
