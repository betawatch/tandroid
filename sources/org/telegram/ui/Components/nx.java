package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ox b;

    public /* synthetic */ nx(ox oxVar, int i10) {
        this.a = i10;
        this.b = oxVar;
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
        ox oxVar = this.b;
        switch (i11) {
            case 0:
                kx kxVar = oxVar.s;
                if (kxVar != null && (stickerSet = kxVar.b) != null) {
                    yy yyVar = oxVar.A;
                    if (!yyVar.s2) {
                        yyVar.s2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new qw(yyVar, yyVar.U1, yyVar.getContext(), yyVar.V1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ag.s1 s1Var = oxVar.h;
                TextView textView = oxVar.f;
                TextView textView2 = oxVar.e;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (s1Var != null && s1Var.getVisibility() == 0 && s1Var.r.isEnabled()) {
                            s1Var.performClick();
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
                yy yyVar2 = oxVar.A;
                ArrayList arrayList2 = yyVar2.l1;
                kx kxVar2 = oxVar.s;
                if (kxVar2 != null && (stickerSet2 = kxVar2.b) != null) {
                    kxVar2.f = true;
                    gx gxVar = yyVar2.N;
                    int i12 = yyVar2.Y0;
                    ArrayList arrayList3 = yyVar2.m1;
                    ww wwVar = yyVar2.L;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(oxVar.s.b.id));
                    }
                    oxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= wwVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(wwVar.getChildAt(i13) instanceof mx) || (R = RecyclerView.R((view2 = wwVar.getChildAt(i13)))) < 0 || (i10 = gxVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || oxVar.s == null || ((kx) arrayList3.get(i10)).b.id != oxVar.s.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        gxVar.E(num.intValue(), view2);
                    }
                    if (oxVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = oxVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = yyVar2.U1;
                            if (n2Var == null) {
                                n2Var = new ag.r2(oxVar, 10);
                            }
                            cv.W(n2Var, stickerSet5, true, null, new lp(oxVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(oxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            oxVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                yy yyVar3 = oxVar.A;
                kx kxVar3 = oxVar.s;
                if (kxVar3 != null && (stickerSet3 = kxVar3.b) != null) {
                    kxVar3.f = false;
                    ArrayList arrayList4 = yyVar3.l1;
                    int i14 = yyVar3.Y0;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    oxVar.a(true);
                    uv uvVar = yyVar3.E;
                    if (uvVar != null) {
                        uvVar.p(yyVar3.getEmojipacks());
                    }
                    yyVar3.W(yyVar3.M.I0());
                    if (oxVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = oxVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = yyVar3.U1;
                            if (n2Var2 == null) {
                                n2Var2 = new ag.r2(oxVar, 10);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            xq xqVar = new xq(9, oxVar, stickerSet7);
                            Pattern pattern = cv.R;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, xqVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(oxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            oxVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                xx xxVar = oxVar.A.p1;
                if (xxVar != null) {
                    xxVar.q();
                    break;
                }
                break;
            case 5:
                xx xxVar2 = oxVar.A.p1;
                if (xxVar2 != null) {
                    xxVar2.q();
                    break;
                }
                break;
            default:
                xx xxVar3 = oxVar.A.p1;
                if (xxVar3 != null) {
                    xxVar3.q();
                    break;
                }
                break;
        }
    }
}
