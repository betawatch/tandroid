package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ yx(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
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
        zx zxVar = this.b;
        switch (i11) {
            case 0:
                vx vxVar = zxVar.s;
                if (vxVar != null && (stickerSet = vxVar.b) != null) {
                    kz kzVar = zxVar.B;
                    if (!kzVar.t2) {
                        kzVar.t2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new bx(kzVar, kzVar.V1, kzVar.getContext(), kzVar.W1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                eg.c1 c1Var = zxVar.h;
                TextView textView = zxVar.f;
                TextView textView2 = zxVar.e;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (c1Var != null && c1Var.getVisibility() == 0 && c1Var.r.isEnabled()) {
                            c1Var.performClick();
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
                kz kzVar2 = zxVar.B;
                ArrayList arrayList2 = kzVar2.m1;
                vx vxVar2 = zxVar.s;
                if (vxVar2 != null && (stickerSet2 = vxVar2.b) != null) {
                    vxVar2.f = true;
                    rx rxVar = kzVar2.O;
                    int i12 = kzVar2.Z0;
                    ArrayList arrayList3 = kzVar2.n1;
                    ix ixVar = kzVar2.M;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(zxVar.s.b.id));
                    }
                    zxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= ixVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(ixVar.getChildAt(i13) instanceof xx) || (R = RecyclerView.R((view2 = ixVar.getChildAt(i13)))) < 0 || (i10 = rxVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || zxVar.s == null || ((vx) arrayList3.get(i10)).b.id != zxVar.s.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        rxVar.E(num.intValue(), view2);
                    }
                    if (zxVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = zxVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = kzVar2.V1;
                            if (p2Var == null) {
                                p2Var = new eg.y1(zxVar, 8);
                            }
                            mv.W(p2Var, stickerSet5, true, null, new vp(zxVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(zxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            zxVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                kz kzVar3 = zxVar.B;
                vx vxVar3 = zxVar.s;
                if (vxVar3 != null && (stickerSet3 = vxVar3.b) != null) {
                    vxVar3.f = false;
                    ArrayList arrayList4 = kzVar3.m1;
                    int i14 = kzVar3.Z0;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    zxVar.a(true);
                    fw fwVar = kzVar3.F;
                    if (fwVar != null) {
                        fwVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.W(kzVar3.N.I0());
                    if (zxVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = zxVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = kzVar3.V1;
                            if (p2Var2 == null) {
                                p2Var2 = new eg.y1(zxVar, 8);
                            }
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            il ilVar = new il(15, zxVar, stickerSet7);
                            Pattern pattern = mv.S;
                            if (p2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSet7, 0, p2Var3, true, true, ilVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(zxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            zxVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ky kyVar = zxVar.B.q1;
                if (kyVar != null) {
                    kyVar.q();
                    break;
                }
                break;
            case 5:
                ky kyVar2 = zxVar.B.q1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    break;
                }
                break;
            default:
                ky kyVar3 = zxVar.B.q1;
                if (kyVar3 != null) {
                    kyVar3.q();
                    break;
                }
                break;
        }
    }
}
