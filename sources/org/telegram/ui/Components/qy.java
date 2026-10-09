package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ qy(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
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
        ry ryVar = this.b;
        switch (i11) {
            case 0:
                ny nyVar = ryVar.s;
                if (nyVar != null && (stickerSet = nyVar.b) != null) {
                    a00 a00Var = ryVar.E;
                    if (!a00Var.v2) {
                        a00Var.v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new sx(a00Var, a00Var.Y1, a00Var.getContext(), a00Var.Z1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                rg.p0 p0Var = ryVar.h;
                TextView textView = ryVar.f;
                TextView textView2 = ryVar.e;
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
                a00 a00Var2 = ryVar.E;
                ArrayList arrayList2 = a00Var2.p1;
                ny nyVar2 = ryVar.s;
                if (nyVar2 != null && (stickerSet2 = nyVar2.b) != null) {
                    nyVar2.f = true;
                    jy jyVar = a00Var2.R;
                    int i12 = a00Var2.c1;
                    ArrayList arrayList3 = a00Var2.q1;
                    my myVar = a00Var2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(ryVar.s.b.id));
                    }
                    ryVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= myVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if (!(myVar.getChildAt(i13) instanceof py) || (R = RecyclerView.R((view2 = myVar.getChildAt(i13)))) < 0 || (i10 = jyVar.w.get(R)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || ryVar.s == null || ((ny) arrayList3.get(i10)).b.id != ryVar.s.b.id) {
                            i13++;
                        } else {
                            num = Integer.valueOf(R);
                        }
                    }
                    if (num != null) {
                        jyVar.E(num.intValue(), view2);
                    }
                    if (ryVar.n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ryVar.s.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = a00Var2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.z3(ryVar, 6);
                            }
                            iw.X(n2Var, stickerSet5, true, null, new nq(ryVar, 14));
                            break;
                        } else {
                            NotificationCenter.getInstance(i12).addObserver(ryVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            ryVar.n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                            break;
                        }
                    }
                }
                break;
            case 3:
                a00 a00Var3 = ryVar.E;
                ny nyVar3 = ryVar.s;
                if (nyVar3 != null && (stickerSet3 = nyVar3.b) != null) {
                    nyVar3.f = false;
                    ArrayList arrayList4 = a00Var3.p1;
                    int i14 = a00Var3.c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    ryVar.a(true);
                    ey eyVar = a00Var3.I;
                    if (eyVar != null) {
                        eyVar.p(a00Var3.getEmojipacks());
                    }
                    a00Var3.U(a00Var3.Q.I0());
                    if (ryVar.r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = ryVar.s.b;
                        tL_inputStickerSetID3.id = stickerSet6.id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = a00Var3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.z3(ryVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            zr zrVar = new zr(9, ryVar, stickerSet7);
                            Pattern pattern = iw.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, zrVar, false);
                                break;
                            }
                        } else {
                            NotificationCenter.getInstance(i14).addObserver(ryVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            ryVar.r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                az azVar = ryVar.E.t1;
                if (azVar != null) {
                    azVar.q();
                    break;
                }
                break;
            case 5:
                az azVar2 = ryVar.E.t1;
                if (azVar2 != null) {
                    azVar2.q();
                    break;
                }
                break;
            default:
                az azVar3 = ryVar.E.t1;
                if (azVar3 != null) {
                    azVar3.q();
                    break;
                }
                break;
        }
    }
}
