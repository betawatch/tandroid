package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ zx(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
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
        ay ayVar = this.b;
        switch (i11) {
            case 0:
                wx wxVar = ayVar.s;
                if (wxVar != null && (stickerSet = wxVar.b) != null) {
                    kz kzVar = ayVar.E;
                    if (!kzVar.v2) {
                        kzVar.v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new cx(kzVar, kzVar.Y1, kzVar.getContext(), kzVar.Z1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                rg.p0 p0Var = ayVar.h;
                TextView textView = ayVar.f;
                TextView textView2 = ayVar.e;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.r.isEnabled()) {
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
                kz kzVar2 = ayVar.E;
                ArrayList arrayList2 = kzVar2.p1;
                wx wxVar2 = ayVar.s;
                if (wxVar2 != null && (stickerSet2 = wxVar2.b) != null) {
                    wxVar2.f = true;
                    sx sxVar = kzVar2.R;
                    int i12 = kzVar2.c1;
                    ArrayList arrayList3 = kzVar2.q1;
                    vx vxVar = kzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(ayVar.s.b.id));
                    }
                    ayVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= vxVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(vxVar.getChildAt(i13) instanceof yx) || (R = RecyclerView.R((view2 = vxVar.getChildAt(i13)))) < 0 || (i10 = sxVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || ayVar.s == null || ((wx) arrayList3.get(i10)).b.id != ayVar.s.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        sxVar.E(num.intValue(), view2);
                    }
                    if (ayVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ayVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = kzVar2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.y3(ayVar, 6);
                            }
                            sv.W(n2Var, stickerSet5, true, null, new xp(ayVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(ayVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            ayVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                kz kzVar3 = ayVar.E;
                wx wxVar3 = ayVar.s;
                if (wxVar3 != null && (stickerSet3 = wxVar3.b) != null) {
                    wxVar3.f = false;
                    ArrayList arrayList4 = kzVar3.p1;
                    int i14 = kzVar3.c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    ayVar.a(true);
                    nx nxVar = kzVar3.I;
                    if (nxVar != null) {
                        nxVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.U(kzVar3.Q.I0());
                    if (ayVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = ayVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = kzVar3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.y3(ayVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            oh ohVar = new oh(27, ayVar, stickerSet7);
                            Pattern pattern = sv.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, ohVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(ayVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            ayVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ky kyVar = ayVar.E.t1;
                if (kyVar != null) {
                    kyVar.q();
                    break;
                }
                break;
            case 5:
                ky kyVar2 = ayVar.E.t1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    break;
                }
                break;
            default:
                ky kyVar3 = ayVar.E.t1;
                if (kyVar3 != null) {
                    kyVar3.q();
                    break;
                }
                break;
        }
    }
}
