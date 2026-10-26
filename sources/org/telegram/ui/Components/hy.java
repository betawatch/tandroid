package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy b;

    public /* synthetic */ hy(iy iyVar, int i10) {
        this.a = i10;
        this.b = iyVar;
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
        iy iyVar = this.b;
        switch (i11) {
            case 0:
                ey eyVar = iyVar.w;
                if (eyVar != null && (stickerSet = eyVar.b) != null) {
                    sz szVar = iyVar.G;
                    if (!szVar.w2) {
                        szVar.w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new jx(szVar, szVar.Y1, szVar.getContext(), szVar.Z1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                tg.p0 p0Var = iyVar.r;
                TextView textView = iyVar.n;
                TextView textView2 = iyVar.h;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.v.isEnabled()) {
                            p0Var.performClick();
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
                sz szVar2 = iyVar.G;
                ArrayList arrayList2 = szVar2.p1;
                ey eyVar2 = iyVar.w;
                if (eyVar2 != null && (stickerSet2 = eyVar2.b) != null) {
                    eyVar2.f = true;
                    zx zxVar = szVar2.R;
                    int i12 = szVar2.c1;
                    ArrayList arrayList3 = szVar2.q1;
                    dy dyVar = szVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(iyVar.w.b.id));
                    }
                    iyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= dyVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(dyVar.getChildAt(i13) instanceof gy) || (R = RecyclerView.R((view2 = dyVar.getChildAt(i13)))) < 0 || (i10 = zxVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || iyVar.w == null || ((ey) arrayList3.get(i10)).b.id != iyVar.w.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        zxVar.E(num.intValue(), view2);
                    }
                    if (iyVar.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = iyVar.w.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.r2 r2Var = szVar2.Y1;
                            if (r2Var == null) {
                                r2Var = new bi.v4(iyVar, 7);
                            }
                            aw.g0(r2Var, stickerSet5, true, null, new bq(iyVar, 15));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            iyVar.s = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                sz szVar3 = iyVar.G;
                ey eyVar3 = iyVar.w;
                if (eyVar3 != null && (stickerSet3 = eyVar3.b) != null) {
                    eyVar3.f = false;
                    ArrayList arrayList4 = szVar3.p1;
                    int i14 = szVar3.c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    iyVar.a(true);
                    ux uxVar = szVar3.I;
                    if (uxVar != null) {
                        uxVar.p(szVar3.getEmojipacks());
                    }
                    szVar3.U(szVar3.Q.I0());
                    if (iyVar.v == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = iyVar.w.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.r2 r2Var2 = szVar3.Y1;
                            if (r2Var2 == null) {
                                r2Var2 = new bi.v4(iyVar, 7);
                            }
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                            so soVar = new so(14, iyVar, stickerSet7);
                            Pattern pattern = aw.V;
                            if (r2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(r2Var3.getCurrentAccount()).toggleStickerSet(r2Var3.getFragmentView().getContext(), stickerSet7, 0, r2Var3, true, true, soVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            iyVar.v = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ty tyVar = iyVar.G.t1;
                if (tyVar != null) {
                    tyVar.q();
                    break;
                }
                break;
            case 5:
                ty tyVar2 = iyVar.G.t1;
                if (tyVar2 != null) {
                    tyVar2.q();
                    break;
                }
                break;
            default:
                ty tyVar3 = iyVar.G.t1;
                if (tyVar3 != null) {
                    tyVar3.q();
                    break;
                }
                break;
        }
    }
}
