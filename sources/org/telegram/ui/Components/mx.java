package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx b;

    public /* synthetic */ mx(nx nxVar, int i9) {
        this.a = i9;
        this.b = nxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i9;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.a;
        nx nxVar = this.b;
        switch (i10) {
            case 0:
                jx jxVar = nxVar.s;
                if (jxVar != null && (stickerSet = jxVar.b) != null) {
                    wy wyVar = nxVar.A;
                    if (!wyVar.s2) {
                        wyVar.s2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new qw(wyVar, wyVar.U1, wyVar.getContext(), wyVar.V1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                zf.p0 p0Var = nxVar.h;
                TextView textView = nxVar.f;
                TextView textView2 = nxVar.e;
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
                wy wyVar2 = nxVar.A;
                ArrayList arrayList2 = wyVar2.l1;
                jx jxVar2 = nxVar.s;
                if (jxVar2 != null && (stickerSet2 = jxVar2.b) != null) {
                    jxVar2.f = true;
                    fx fxVar = wyVar2.N;
                    int i11 = wyVar2.Y0;
                    ArrayList arrayList3 = wyVar2.m1;
                    ww wwVar = wyVar2.L;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(nxVar.s.b.id));
                    }
                    nxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= wwVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(wwVar.getChildAt(i12) instanceof lx) || (R = RecyclerView.R((view2 = wwVar.getChildAt(i12)))) < 0 || (i9 = fxVar.w.get(R)) < 0 || i9 >= arrayList3.size() || arrayList3.get(i9) == null || nxVar.s == null || ((jx) arrayList3.get(i9)).b.id != nxVar.s.b.id) {
                            i12++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        fxVar.E(num.intValue(), view2);
                    }
                    if (nxVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = nxVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = wyVar2.U1;
                            if (o2Var == null) {
                                o2Var = new bg.i1(nxVar, 9);
                            }
                            dv.V(o2Var, stickerSet5, true, null, new np(nxVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i11).addObserver(nxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                            nxVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                wy wyVar3 = nxVar.A;
                jx jxVar3 = nxVar.s;
                if (jxVar3 != null && (stickerSet3 = jxVar3.b) != null) {
                    jxVar3.f = false;
                    ArrayList arrayList4 = wyVar3.l1;
                    int i13 = wyVar3.Y0;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    nxVar.a(true);
                    vv vvVar = wyVar3.E;
                    if (vvVar != null) {
                        vvVar.p(wyVar3.getEmojipacks());
                    }
                    wyVar3.V(wyVar3.M.I0());
                    if (nxVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = nxVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i13).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = wyVar3.U1;
                            if (o2Var2 == null) {
                                o2Var2 = new bg.i1(nxVar, 9);
                            }
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            zq zqVar = new zq(9, nxVar, stickerSet7);
                            Pattern pattern = dv.R;
                            if (o2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSet7, 0, o2Var3, true, true, zqVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i13).addObserver(nxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i13);
                            nxVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                wx wxVar = nxVar.A.p1;
                if (wxVar != null) {
                    wxVar.q();
                    break;
                }
                break;
            case 5:
                wx wxVar2 = nxVar.A.p1;
                if (wxVar2 != null) {
                    wxVar2.q();
                    break;
                }
                break;
            default:
                wx wxVar3 = nxVar.A.p1;
                if (wxVar3 != null) {
                    wxVar3.q();
                    break;
                }
                break;
        }
    }
}
