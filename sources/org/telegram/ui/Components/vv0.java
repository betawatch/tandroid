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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vv0 extends pj0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ zv0 r;

    public vv0(zv0 zv0Var, Context context) {
        this.r = zv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        return this.h;
    }

    @Override // v4.g0
    public final int d(int i7) {
        zv0 zv0Var = this.r;
        if (zv0Var.N1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i7) ? 0 : 3;
        }
        Object obj = this.e.get(i7);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // v4.g0
    public final void f() {
        int i7;
        int i10;
        zv0 zv0Var = this.r;
        if (zv0Var.N1 != null) {
            int measuredWidth = zv0Var.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            zv0Var.D1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i11 = 0; i11 < zv0Var.N1.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) zv0Var.N1.get(i11);
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
            ArrayList arrayList = zv0Var.P1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = zv0Var.J1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = zv0Var.J1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // v4.g0
    public final void s(int i7) {
        ArrayList arrayList = this.r.P1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        zv0 zv0Var = this.r;
        ArrayList arrayList = zv0Var.N1;
        if (arrayList == null) {
            if (zv0Var.O1 != null) {
                ((org.telegram.ui.Cells.z7) view).setSticker((org.telegram.messenger.zy) zv0Var.P1.get(i7));
                return;
            }
            if (d1Var.f != 3) {
                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                z7Var.d(tL_messages_stickerSet.documents.get(i7), null, zv0Var.J1, null, zv0Var.Y1, zv0Var.I1);
                z7Var.J.setOnClickListener(new lk(22, this, z7Var));
                return;
            }
            return;
        }
        int i10 = d1Var.f;
        SparseArray sparseArray = this.e;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f.get(i7), null, false, false);
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
        } else {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        zv0 zv0Var = this.r;
        Context context = this.c;
        if (i7 != 0) {
            if (i7 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            } else if (i7 == 2) {
                frameLayout2 = new org.telegram.ui.Cells.u3(8, this.c, zv0Var.I0, true, false);
            } else if (i7 != 3) {
                frameLayout2 = null;
            } else {
                org.telegram.ui.ActionBar.g6 g6Var = zv0Var.I0;
                tv0 tv0Var = new tv0(context);
                tv0Var.a = g6Var;
                View view = new View(context);
                tv0Var.c = view;
                int L = org.telegram.messenger.g0.L(28.0f);
                int i10 = org.telegram.ui.ActionBar.l6.Bf;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
                tv0Var.b = d02;
                Drawable h = jg.g.h(context, R.drawable.filled_add_sticker);
                org.telegram.ui.ActionBar.s6.x(tv0Var, h, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(d02, h);
                int L2 = org.telegram.messenger.g0.L(56.0f);
                int L3 = org.telegram.messenger.g0.L(56.0f);
                xpVar.h = L2;
                xpVar.n = L3;
                int L4 = org.telegram.messenger.g0.L(24.0f);
                int L5 = org.telegram.messenger.g0.L(24.0f);
                xpVar.e = L4;
                xpVar.f = L5;
                view.setBackground(xpVar);
                c8.ka.a(view);
                tv0Var.addView(view, c8.ha.e(56, 56, 17));
                frameLayout = tv0Var;
            }
            return new yi0(frameLayout2);
        }
        uv0 uv0Var = new uv0(this, context, zv0Var.I0);
        uv0Var.getImageView().E0(7);
        frameLayout = uv0Var;
        frameLayout2 = frameLayout;
        return new yi0(frameLayout2);
    }
}
