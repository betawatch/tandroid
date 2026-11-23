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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gw0 extends dk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ kw0 r;

    public gw0(kw0 kw0Var, Context context) {
        this.r = kw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return this.h;
    }

    @Override // v4.i0
    public final int d(int i7) {
        kw0 kw0Var = this.r;
        if (kw0Var.R1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i7) ? 0 : 3;
        }
        Object obj = this.e.get(i7);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // v4.i0
    public final void f() {
        int i7;
        int i10;
        kw0 kw0Var = this.r;
        if (kw0Var.R1 != null) {
            int measuredWidth = kw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            kw0Var.H1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i11 = 0; i11 < kw0Var.R1.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) kw0Var.R1.get(i11);
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
                        i7 = 1;
                    } else {
                        i7 = (int) Math.ceil(list.size() / this.d);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            sparseArray.put(this.h + i14, list.get(i14));
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        i10 = this.d * i7;
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
            ArrayList arrayList = kw0Var.T1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = kw0Var.N1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // v4.i0
    public final void s(int i7) {
        ArrayList arrayList = this.r.T1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        kw0 kw0Var = this.r;
        ArrayList arrayList = kw0Var.R1;
        if (arrayList == null) {
            if (kw0Var.S1 != null) {
                ((org.telegram.ui.Cells.a8) view).setSticker((org.telegram.messenger.ty) kw0Var.T1.get(i7));
                return;
            }
            if (f1Var.f != 3) {
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                a8Var.d(tL_messages_stickerSet.documents.get(i7), null, kw0Var.N1, null, kw0Var.c2, kw0Var.M1);
                a8Var.K.setOnClickListener(new m8(24, this, a8Var));
                return;
            }
            return;
        }
        int i10 = f1Var.f;
        SparseArray sparseArray = this.e;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f.get(i7), null, false, false);
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.n3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
        } else {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        kw0 kw0Var = this.r;
        Context context = this.c;
        if (i7 != 0) {
            if (i7 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.n3(context);
            } else if (i7 == 2) {
                frameLayout2 = new org.telegram.ui.Cells.v3(8, this.c, kw0Var.J0, true, false);
            } else if (i7 != 3) {
                frameLayout2 = null;
            } else {
                org.telegram.ui.ActionBar.h6 h6Var = kw0Var.J0;
                ew0 ew0Var = new ew0(context);
                ew0Var.a = h6Var;
                View view = new View(context);
                ew0Var.c = view;
                int L = org.telegram.messenger.g0.L(28.0f);
                int i10 = org.telegram.ui.ActionBar.m6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
                ew0Var.b = d02;
                Drawable g10 = i5.c.g(context, R.drawable.filled_add_sticker);
                org.telegram.ui.ActionBar.t6.x(ew0Var, g10, i10, h6Var, PorterDuff.Mode.MULTIPLY);
                oq oqVar = new oq(d02, g10);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                int L3 = org.telegram.messenger.g0.L(56.0f);
                oqVar.h = L2;
                oqVar.n = L3;
                int L4 = org.telegram.messenger.g0.L(24.0f);
                int L5 = org.telegram.messenger.g0.L(24.0f);
                oqVar.e = L4;
                oqVar.f = L5;
                view.setBackground(oqVar);
                c8.ra.a(view);
                ew0Var.addView(view, c8.ma.e(56, 56, 17));
                frameLayout = ew0Var;
            }
            return new mj0(frameLayout2);
        }
        fw0 fw0Var = new fw0(this, context, kw0Var.J0);
        fw0Var.getImageView().E0(7);
        frameLayout = fw0Var;
        frameLayout2 = frameLayout;
        return new mj0(frameLayout2);
    }
}
