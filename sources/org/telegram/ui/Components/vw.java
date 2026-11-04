package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ vw(ww wwVar, int i3) {
        this.a = i3;
        this.b = wwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i3;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.a;
        ww wwVar = this.b;
        switch (i10) {
            case 0:
                sw swVar = wwVar.x;
                if (swVar != null && (stickerSet = swVar.b) != null) {
                    ey eyVar = wwVar.H;
                    if (!eyVar.x2) {
                        eyVar.x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new yv(eyVar, eyVar.Z1, eyVar.getContext(), eyVar.a2, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                vg.o0 o0Var = wwVar.r;
                TextView textView = wwVar.n;
                TextView textView2 = wwVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (o0Var != null && o0Var.getVisibility() == 0 && o0Var.w.isEnabled()) {
                            o0Var.performClick();
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
                ey eyVar2 = wwVar.H;
                ArrayList arrayList2 = eyVar2.q1;
                sw swVar2 = wwVar.x;
                if (swVar2 != null && (stickerSet2 = swVar2.b) != null) {
                    swVar2.f = true;
                    ow owVar = eyVar2.S;
                    int i11 = eyVar2.d1;
                    ArrayList arrayList3 = eyVar2.r1;
                    rw rwVar = eyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(wwVar.x.b.id));
                    }
                    wwVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= rwVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(rwVar.getChildAt(i12) instanceof uw) || (R = RecyclerView.R((view2 = rwVar.getChildAt(i12)))) < 0 || (i3 = owVar.x.get(R)) < 0 || i3 >= arrayList3.size() || arrayList3.get(i3) == null || wwVar.x == null || ((sw) arrayList3.get(i3)).b.id != wwVar.x.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        owVar.E(num.intValue(), view2);
                    }
                    if (wwVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = wwVar.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.d2 d2Var = eyVar2.Z1;
                            if (d2Var == null) {
                                d2Var = new ai.c7(wwVar, 8);
                            }
                            pu.J0(d2Var, m0, true, null, new gp(wwVar, 13));
                            break;
                        } else {
                            org.telegram.messenger.hs.f(i11).c(wwVar, 64);
                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i11);
                            wwVar.s = tL_inputStickerSetID2;
                            b02.m0(tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ey eyVar3 = wwVar.H;
                sw swVar3 = wwVar.x;
                if (swVar3 != null && (stickerSet3 = swVar3.b) != null) {
                    swVar3.f = false;
                    ArrayList arrayList4 = eyVar3.q1;
                    int i13 = eyVar3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    wwVar.a(true);
                    jw jwVar = eyVar3.J;
                    if (jwVar != null) {
                        jwVar.p(eyVar3.getEmojipacks());
                    }
                    eyVar3.U(eyVar3.R.I0());
                    if (wwVar.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = wwVar.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.li.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.d2 d2Var2 = eyVar3.Z1;
                            if (d2Var2 == null) {
                                d2Var2 = new ai.c7(wwVar, 8);
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                            cl clVar = new cl(16, wwVar, m02);
                            Pattern pattern = pu.N1;
                            if (d2Var3.getFragmentView() != null) {
                                org.telegram.messenger.li.b0(d2Var3.getCurrentAccount()).g2(d2Var3.getFragmentView().getContext(), m02, null, 0, d2Var3, null, true, true, clVar, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.hs.f(i13).c(wwVar, 64);
                            org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i13);
                            wwVar.w = tL_inputStickerSetID3;
                            b03.m0(tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                fx fxVar = wwVar.H.u1;
                if (fxVar != null) {
                    fxVar.q();
                    break;
                }
                break;
            case 5:
                fx fxVar2 = wwVar.H.u1;
                if (fxVar2 != null) {
                    fxVar2.q();
                    break;
                }
                break;
            default:
                fx fxVar3 = wwVar.H.u1;
                if (fxVar3 != null) {
                    fxVar3.q();
                    break;
                }
                break;
        }
    }
}
