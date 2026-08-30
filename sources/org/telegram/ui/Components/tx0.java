package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tx0 extends rl0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ xx0 r;

    public tx0(xx0 xx0Var, Context context) {
        this.r = xx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.h;
    }

    @Override // f2.o0
    public final int j(int i10) {
        xx0 xx0Var = this.r;
        if (xx0Var.T == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // f2.o0
    public final void l() {
        int i10;
        int i11;
        xx0 xx0Var = this.r;
        if (xx0Var.T != null) {
            int measuredWidth = xx0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            xx0Var.J.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < xx0Var.T.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xx0Var.T.get(i12);
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
            ArrayList arrayList = xx0Var.V;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = xx0Var.P.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override // f2.o0
    public final void u(int i10) {
        ArrayList arrayList = this.r.V;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        xx0 xx0Var = this.r;
        ArrayList arrayList = xx0Var.T;
        if (arrayList == null) {
            if (xx0Var.U != null) {
                ((org.telegram.ui.Cells.d8) view).setSticker((SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10));
                return;
            }
            if (l1Var.f != 3) {
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                d8Var.d(tL_messages_stickerSet.documents.get(i10), null, xx0Var.P, null, xx0Var.e0, xx0Var.O);
                d8Var.G.setOnClickListener(new rx0(0, this, d8Var));
                return;
            }
            return;
        }
        int i11 = l1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.r3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        xx0 xx0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            } else if (i10 == 2) {
                f6Var2 = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.r3(8, this.c, f6Var2, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                f6Var3 = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
                FrameLayout qx0Var = new qx0(context);
                View view = new View(context);
                int dp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.j6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var3)));
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var3), PorterDuff.Mode.MULTIPLY));
                nq nqVar = new nq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                nqVar.h = dp2;
                nqVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                nqVar.e = dp4;
                nqVar.f = dp5;
                view.setBackground(nqVar);
                k7.d6.a(view);
                qx0Var.addView(view, k7.b6.e(56, 56, 17));
                frameLayout = qx0Var;
            }
            return new el0(frameLayout2);
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
        sx0 sx0Var = new sx0(this, context, f6Var);
        sx0Var.getImageView().setLayerNum(7);
        frameLayout = sx0Var;
        frameLayout2 = frameLayout;
        return new el0(frameLayout2);
    }
}
