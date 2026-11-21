package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx b;

    public /* synthetic */ kx(lx lxVar, int i7) {
        this.a = i7;
        this.b = lxVar;
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
        lx lxVar = this.b;
        switch (i10) {
            case 0:
                hx hxVar = lxVar.x;
                if (hxVar != null && (stickerSet = hxVar.b) != null) {
                    ty tyVar = lxVar.H;
                    if (!tyVar.x2) {
                        tyVar.x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new nw(tyVar, tyVar.Z1, tyVar.getContext(), tyVar.a2, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ug.r0 r0Var = lxVar.r;
                TextView textView = lxVar.n;
                TextView textView2 = lxVar.h;
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
                ty tyVar2 = lxVar.H;
                ArrayList arrayList2 = tyVar2.q1;
                hx hxVar2 = lxVar.x;
                if (hxVar2 != null && (stickerSet2 = hxVar2.b) != null) {
                    hxVar2.f = true;
                    dx dxVar = tyVar2.S;
                    int i11 = tyVar2.d1;
                    ArrayList arrayList3 = tyVar2.r1;
                    gx gxVar = tyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(lxVar.x.b.id));
                    }
                    lxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= gxVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(gxVar.getChildAt(i12) instanceof jx) || (R = RecyclerView.R((view2 = gxVar.getChildAt(i12)))) < 0 || (i7 = dxVar.x.get(R)) < 0 || i7 >= arrayList3.size() || arrayList3.get(i7) == null || lxVar.x == null || ((hx) arrayList3.get(i7)).b.id != lxVar.x.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        dxVar.E(num.intValue(), view2);
                    }
                    if (lxVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = lxVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var = tyVar2.Z1;
                            if (g2Var == null) {
                                g2Var = new bi.c9(lxVar, 8);
                            }
                            ev.K0(g2Var, o02, true, null, new oo(lxVar, 15));
                            break;
                        } else {
                            org.telegram.messenger.ks.f(i11).c(lxVar, 64);
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                            lxVar.s = tL_inputStickerSetID2;
                            d02.o0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ty tyVar3 = lxVar.H;
                hx hxVar3 = lxVar.x;
                if (hxVar3 != null && (stickerSet3 = hxVar3.b) != null) {
                    hxVar3.f = false;
                    ArrayList arrayList4 = tyVar3.q1;
                    int i13 = tyVar3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    lxVar.a(true);
                    yw ywVar = tyVar3.J;
                    if (ywVar != null) {
                        ywVar.p(tyVar3.getEmojipacks());
                    }
                    tyVar3.V(tyVar3.R.I0());
                    if (lxVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = lxVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = tyVar3.Z1;
                            if (g2Var2 == null) {
                                g2Var2 = new bi.c9(lxVar, 8);
                            }
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            ou ouVar = new ou(3, lxVar, o03);
                            Pattern pattern = ev.Q1;
                            if (g2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), o03, null, 0, g2Var3, null, true, true, ouVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ks.f(i13).c(lxVar, 64);
                            org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                            lxVar.w = tL_inputStickerSetID3;
                            d03.o0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                tx txVar = lxVar.H.u1;
                if (txVar != null) {
                    txVar.q();
                    break;
                }
                break;
            case 5:
                tx txVar2 = lxVar.H.u1;
                if (txVar2 != null) {
                    txVar2.q();
                    break;
                }
                break;
            default:
                tx txVar3 = lxVar.H.u1;
                if (txVar3 != null) {
                    txVar3.q();
                    break;
                }
                break;
        }
    }
}
