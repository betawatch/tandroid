package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tv0 extends sj0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ xv0 r;

    public tv0(xv0 xv0Var, Context context) {
        this.r = xv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        return this.h;
    }

    @Override // u4.h0
    public final int d(int i3) {
        xv0 xv0Var = this.r;
        if (xv0Var.O1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i3) ? 0 : 3;
        }
        Object obj = this.e.get(i3);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // u4.h0
    public final void f() {
        int i3;
        int i10;
        xv0 xv0Var = this.r;
        if (xv0Var.O1 != null) {
            int measuredWidth = xv0Var.k1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            xv0Var.E1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i11 = 0; i11 < xv0Var.O1.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xv0Var.O1.get(i11);
                List list = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i12 = this.h;
                    this.h = i12 + 1;
                    sparseArray.put(i12, Integer.valueOf(i11));
                    int i13 = this.h / this.d;
                    if (list.isEmpty()) {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i3 = 1;
                    } else {
                        i3 = (int) Math.ceil(list.size() / this.d);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            sparseArray.put(this.h + i14, list.get(i14));
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        i10 = this.d * i3;
                        if (i15 >= i10) {
                            break;
                        }
                        sparseArray2.put(this.h + i15, stickerSetCovered);
                        i15++;
                    }
                    this.h = i10 + this.h;
                }
            }
        } else {
            ArrayList arrayList = xv0Var.Q1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = xv0Var.K1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // u4.h0
    public final void s(int i3) {
        ArrayList arrayList = this.r.Q1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i3);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        xv0 xv0Var = this.r;
        ArrayList arrayList = xv0Var.O1;
        if (arrayList == null) {
            if (xv0Var.P1 != null) {
                ((org.telegram.ui.Cells.y7) view).setSticker((org.telegram.messenger.ry) xv0Var.Q1.get(i3));
                return;
            }
            if (d1Var.f != 3) {
                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                y7Var.d(tL_messages_stickerSet.documents.get(i3), null, xv0Var.K1, null, xv0Var.Z1, xv0Var.J1);
                y7Var.K.setOnClickListener(new q2(28, this, y7Var));
                return;
            }
            return;
        }
        int i10 = d1Var.f;
        SparseArray sparseArray = this.e;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) sparseArray.get(i3), null, this.f.get(i3), null, false, false);
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
        } else {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        xv0 xv0Var = this.r;
        Context context = this.c;
        if (i3 != 0) {
            if (i3 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            } else if (i3 == 2) {
                frameLayout2 = new org.telegram.ui.Cells.u3(8, this.c, xv0Var.J0, true, false);
            } else if (i3 != 3) {
                frameLayout2 = null;
            } else {
                org.telegram.ui.ActionBar.e6 e6Var = xv0Var.J0;
                rv0 rv0Var = new rv0(context);
                rv0Var.a = e6Var;
                View view = new View(context);
                rv0Var.c = view;
                int L = org.telegram.messenger.g0.L(28.0f);
                int i10 = org.telegram.ui.ActionBar.k6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
                rv0Var.b = d02;
                Drawable g7 = k2.p1.g(context, R.drawable.filled_add_sticker);
                org.telegram.ui.ActionBar.r6.y(rv0Var, g7, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(d02, g7);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                int L3 = org.telegram.messenger.g0.L(56.0f);
                xpVar.h = L2;
                xpVar.n = L3;
                int L4 = org.telegram.messenger.g0.L(24.0f);
                int L5 = org.telegram.messenger.g0.L(24.0f);
                xpVar.e = L4;
                xpVar.f = L5;
                view.setBackground(xpVar);
                b8.pf.a(view);
                rv0Var.addView(view, b8.mf.e(56, 56, 17));
                frameLayout = rv0Var;
            }
            return new bj0(frameLayout2);
        }
        sv0 sv0Var = new sv0(this, context, xv0Var.J0);
        sv0Var.getImageView().E0(7);
        frameLayout = sv0Var;
        frameLayout2 = frameLayout;
        return new bj0(frameLayout2);
    }
}
