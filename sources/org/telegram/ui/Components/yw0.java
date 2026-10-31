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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yw0 extends sk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ cx0 r;

    public yw0(cx0 cx0Var, Context context) {
        this.r = cx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        return this.h;
    }

    @Override // s4.g0
    public final int d(int i10) {
        cx0 cx0Var = this.r;
        if (cx0Var.N1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // s4.g0
    public final void f() {
        int i10;
        int i11;
        cx0 cx0Var = this.r;
        if (cx0Var.N1 != null) {
            int measuredWidth = cx0Var.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.q.x;
            }
            int L = measuredWidth / org.telegram.messenger.i0.L(72.0f);
            this.d = L;
            cx0Var.D1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < cx0Var.N1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cx0Var.N1.get(i12);
                List list = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i13 = this.h;
                    this.h = i13 + 1;
                    sparseArray.put(i13, Integer.valueOf(i12));
                    int i14 = this.h / this.d;
                    if (list.isEmpty()) {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i10 = 1;
                    } else {
                        i10 = (int) Math.ceil(list.size() / this.d);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            sparseArray.put(this.h + i15, list.get(i15));
                        }
                    }
                    int i16 = 0;
                    while (true) {
                        i11 = this.d * i10;
                        if (i16 >= i11) {
                            break;
                        }
                        sparseArray2.put(this.h + i16, stickerSetCovered);
                        i16++;
                    }
                    this.h = i11 + this.h;
                }
            }
        } else {
            ArrayList arrayList = cx0Var.P1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.J1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = cx0Var.J1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // s4.g0
    public final void s(int i10) {
        ArrayList arrayList = this.r.P1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i10);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        cx0 cx0Var = this.r;
        ArrayList arrayList = cx0Var.N1;
        if (arrayList == null) {
            if (cx0Var.O1 != null) {
                ((org.telegram.ui.Cells.d8) view).setSticker((org.telegram.messenger.jz) cx0Var.P1.get(i10));
                return;
            }
            if (c1Var.f != 3) {
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                d8Var.d(tL_messages_stickerSet.documents.get(i10), null, cx0Var.J1, null, cx0Var.Y1, cx0Var.I1);
                d8Var.J.setOnClickListener(new sr(15, this, d8Var));
                return;
            }
            return;
        }
        int i11 = c1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.o3) view).setHeight(org.telegram.messenger.i0.L(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.w3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        cx0 cx0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.o3(context);
            } else if (i10 == 2) {
                frameLayout2 = new org.telegram.ui.Cells.w3(8, this.c, cx0Var.I0, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                org.telegram.ui.ActionBar.p6 p6Var = cx0Var.I0;
                ww0 ww0Var = new ww0(context);
                ww0Var.a = p6Var;
                View view = new View(context);
                ww0Var.c = view;
                int L = org.telegram.messenger.i0.L(28.0f);
                int i11 = org.telegram.ui.ActionBar.t6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
                ww0Var.b = d02;
                Drawable f7 = i0.a.f(context, R.drawable.filled_add_sticker);
                org.telegram.ui.ActionBar.a7.y(ww0Var, f7, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                eq eqVar = new eq(d02, f7);
                int L2 = org.telegram.messenger.i0.L(56.0f);
                int L3 = org.telegram.messenger.i0.L(56.0f);
                eqVar.h = L2;
                eqVar.n = L3;
                int L4 = org.telegram.messenger.i0.L(24.0f);
                int L5 = org.telegram.messenger.i0.L(24.0f);
                eqVar.e = L4;
                eqVar.f = L5;
                view.setBackground(eqVar);
                w7.e6.a(view);
                ww0Var.addView(view, w7.b6.e(56, 56, 17));
                frameLayout = ww0Var;
            }
            return new ck0(frameLayout2);
        }
        xw0 xw0Var = new xw0(this, context, cx0Var.I0);
        xw0Var.getImageView().E0(7);
        frameLayout = xw0Var;
        frameLayout2 = frameLayout;
        return new ck0(frameLayout2);
    }
}
