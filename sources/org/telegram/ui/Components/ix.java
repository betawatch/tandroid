package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx b;

    public /* synthetic */ ix(jx jxVar, int i7) {
        this.a = i7;
        this.b = jxVar;
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
        jx jxVar = this.b;
        switch (i10) {
            case 0:
                fx fxVar = jxVar.x;
                if (fxVar != null && (stickerSet = fxVar.b) != null) {
                    ry ryVar = jxVar.H;
                    if (!ryVar.x2) {
                        ryVar.x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new lw(ryVar, ryVar.Z1, ryVar.getContext(), ryVar.a2, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ug.s0 s0Var = jxVar.r;
                TextView textView = jxVar.n;
                TextView textView2 = jxVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (s0Var != null && s0Var.getVisibility() == 0 && s0Var.w.isEnabled()) {
                            s0Var.performClick();
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
                ry ryVar2 = jxVar.H;
                ArrayList arrayList2 = ryVar2.q1;
                fx fxVar2 = jxVar.x;
                if (fxVar2 != null && (stickerSet2 = fxVar2.b) != null) {
                    fxVar2.f = true;
                    bx bxVar = ryVar2.S;
                    int i11 = ryVar2.d1;
                    ArrayList arrayList3 = ryVar2.r1;
                    ex exVar = ryVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(jxVar.x.b.id));
                    }
                    jxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= exVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(exVar.getChildAt(i12) instanceof hx) || (R = RecyclerView.R((view2 = exVar.getChildAt(i12)))) < 0 || (i7 = bxVar.x.get(R)) < 0 || i7 >= arrayList3.size() || arrayList3.get(i7) == null || jxVar.x == null || ((fx) arrayList3.get(i7)).b.id != jxVar.x.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        bxVar.E(num.intValue(), view2);
                    }
                    if (jxVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = jxVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.h2 h2Var = ryVar2.Z1;
                            if (h2Var == null) {
                                h2Var = new bi.z8(jxVar, 8);
                            }
                            bv.K0(h2Var, o02, true, null, new mo(jxVar, 15));
                            break;
                        } else {
                            org.telegram.messenger.ks.f(i11).c(jxVar, 64);
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                            jxVar.s = tL_inputStickerSetID2;
                            d02.o0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ry ryVar3 = jxVar.H;
                fx fxVar3 = jxVar.x;
                if (fxVar3 != null && (stickerSet3 = fxVar3.b) != null) {
                    fxVar3.f = false;
                    ArrayList arrayList4 = ryVar3.q1;
                    int i13 = ryVar3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    jxVar.a(true);
                    ww wwVar = ryVar3.J;
                    if (wwVar != null) {
                        wwVar.p(ryVar3.getEmojipacks());
                    }
                    ryVar3.V(ryVar3.R.I0());
                    if (jxVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = jxVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.h2 h2Var2 = ryVar3.Z1;
                            if (h2Var2 == null) {
                                h2Var2 = new bi.z8(jxVar, 8);
                            }
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                            dw dwVar = new dw(1, jxVar, o03);
                            Pattern pattern = bv.Q1;
                            if (h2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(h2Var3.getCurrentAccount()).l2(h2Var3.getFragmentView().getContext(), o03, null, 0, h2Var3, null, true, true, dwVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ks.f(i13).c(jxVar, 64);
                            org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                            jxVar.w = tL_inputStickerSetID3;
                            d03.o0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                rx rxVar = jxVar.H.u1;
                if (rxVar != null) {
                    rxVar.q();
                    break;
                }
                break;
            case 5:
                rx rxVar2 = jxVar.H.u1;
                if (rxVar2 != null) {
                    rxVar2.q();
                    break;
                }
                break;
            default:
                rx rxVar3 = jxVar.H.u1;
                if (rxVar3 != null) {
                    rxVar3.q();
                    break;
                }
                break;
        }
    }
}
