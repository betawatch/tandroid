package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny b;

    public /* synthetic */ my(ny nyVar, int i10) {
        this.a = i10;
        this.b = nyVar;
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
        ny nyVar = this.b;
        switch (i11) {
            case 0:
                jy jyVar = nyVar.s;
                if (jyVar != null && (stickerSet = jyVar.b) != null) {
                    wz wzVar = nyVar.E;
                    if (!wzVar.v2) {
                        wzVar.v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new ox(wzVar, wzVar.Y1, wzVar.getContext(), wzVar.Z1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                sg.q0 q0Var = nyVar.h;
                TextView textView = nyVar.f;
                TextView textView2 = nyVar.e;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView == null || textView.getVisibility() != 0 || !textView.isEnabled()) {
                        if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.r.isEnabled()) {
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
                wz wzVar2 = nyVar.E;
                ArrayList arrayList2 = wzVar2.p1;
                jy jyVar2 = nyVar.s;
                if (jyVar2 != null && (stickerSet2 = jyVar2.b) != null) {
                    jyVar2.f = true;
                    fy fyVar = wzVar2.R;
                    int i12 = wzVar2.c1;
                    ArrayList arrayList3 = wzVar2.q1;
                    iy iyVar = wzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(nyVar.s.b.id));
                    }
                    nyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= iyVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(iyVar.getChildAt(i13) instanceof ly) || (R = RecyclerView.R((view2 = iyVar.getChildAt(i13)))) < 0 || (i10 = fyVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || nyVar.s == null || ((jy) arrayList3.get(i10)).b.id != nyVar.s.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        fyVar.E(num.intValue(), view2);
                    }
                    if (nyVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = nyVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = wzVar2.Y1;
                            if (m2Var == null) {
                                m2Var = new bi.o3(nyVar, 6);
                            }
                            ew.X(m2Var, stickerSet5, true, null, new kq(nyVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(nyVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            nyVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                wz wzVar3 = nyVar.E;
                jy jyVar3 = nyVar.s;
                if (jyVar3 != null && (stickerSet3 = jyVar3.b) != null) {
                    jyVar3.f = false;
                    ArrayList arrayList4 = wzVar3.p1;
                    int i14 = wzVar3.c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    nyVar.a(true);
                    zx zxVar = wzVar3.I;
                    if (zxVar != null) {
                        zxVar.p(wzVar3.getEmojipacks());
                    }
                    wzVar3.U(wzVar3.Q.I0());
                    if (nyVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = nyVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = wzVar3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new bi.o3(nyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            sk skVar = new sk(20, nyVar, stickerSet7);
                            Pattern pattern = ew.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, skVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(nyVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            nyVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                wy wyVar = nyVar.E.t1;
                if (wyVar != null) {
                    wyVar.q();
                    break;
                }
                break;
            case 5:
                wy wyVar2 = nyVar.E.t1;
                if (wyVar2 != null) {
                    wyVar2.q();
                    break;
                }
                break;
            default:
                wy wyVar3 = nyVar.E.t1;
                if (wyVar3 != null) {
                    wyVar3.q();
                    break;
                }
                break;
        }
    }
}
