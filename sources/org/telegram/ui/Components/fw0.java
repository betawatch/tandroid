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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fw0 extends dk0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ jw0 r;

    public fw0(jw0 jw0Var, Context context) {
        this.r = jw0Var;
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
        jw0 jw0Var = this.r;
        if (jw0Var.R1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
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
        jw0 jw0Var = this.r;
        if (jw0Var.R1 != null) {
            int measuredWidth = jw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            jw0Var.H1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i11 = 0; i11 < jw0Var.R1.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) jw0Var.R1.get(i11);
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
            ArrayList arrayList = jw0Var.T1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = jw0Var.N1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = jw0Var.N1.set;
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
        jw0 jw0Var = this.r;
        ArrayList arrayList = jw0Var.R1;
        if (arrayList == null) {
            if (jw0Var.S1 != null) {
                ((org.telegram.ui.Cells.z7) view).setSticker((org.telegram.messenger.sy) jw0Var.T1.get(i7));
                return;
            }
            if (f1Var.f != 3) {
                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                z7Var.d(tL_messages_stickerSet.documents.get(i7), null, jw0Var.N1, null, jw0Var.c2, jw0Var.M1);
                z7Var.K.setOnClickListener(new l8(24, this, z7Var));
                return;
            }
            return;
        }
        int i10 = f1Var.f;
        SparseArray sparseArray = this.e;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f.get(i7), null, false, false);
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
        jw0 jw0Var = this.r;
        Context context = this.c;
        if (i7 != 0) {
            if (i7 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.n3(context);
            } else if (i7 == 2) {
                frameLayout2 = new org.telegram.ui.Cells.v3(8, this.c, jw0Var.J0, true, false);
            } else if (i7 != 3) {
                frameLayout2 = null;
            } else {
                org.telegram.ui.ActionBar.i6 i6Var = jw0Var.J0;
                dw0 dw0Var = new dw0(context);
                dw0Var.a = i6Var;
                View view = new View(context);
                dw0Var.c = view;
                int L = org.telegram.messenger.g0.L(28.0f);
                int i10 = org.telegram.ui.ActionBar.n6.Ef;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
                dw0Var.b = d02;
                Drawable g10 = i5.c.g(context, R.drawable.filled_add_sticker);
                org.telegram.ui.ActionBar.u6.x(dw0Var, g10, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                lq lqVar = new lq(d02, g10);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                int L3 = org.telegram.messenger.g0.L(56.0f);
                lqVar.h = L2;
                lqVar.n = L3;
                int L4 = org.telegram.messenger.g0.L(24.0f);
                int L5 = org.telegram.messenger.g0.L(24.0f);
                lqVar.e = L4;
                lqVar.f = L5;
                view.setBackground(lqVar);
                c8.sa.a(view);
                dw0Var.addView(view, c8.na.e(56, 56, 17));
                frameLayout = dw0Var;
            }
            return new mj0(frameLayout2);
        }
        ew0 ew0Var = new ew0(this, context, jw0Var.J0);
        ew0Var.getImageView().F0(7);
        frameLayout = ew0Var;
        frameLayout2 = frameLayout;
        return new mj0(frameLayout2);
    }
}
