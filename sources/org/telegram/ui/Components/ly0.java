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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ly0 extends hm0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ py0 r;

    public ly0(py0 py0Var, Context context) {
        this.r = py0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.h;
    }

    @Override // s4.g0
    public final int j(int i10) {
        py0 py0Var = this.r;
        if (py0Var.W == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // s4.g0
    public final void l() {
        int i10;
        int i11;
        py0 py0Var = this.r;
        if (py0Var.W != null) {
            int measuredWidth = py0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            py0Var.M.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < py0Var.W.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) py0Var.W.get(i12);
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
            ArrayList arrayList = py0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = py0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = py0Var.S.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override // s4.g0
    public final void u(int i10) {
        ArrayList arrayList = this.r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        py0 py0Var = this.r;
        ArrayList arrayList = py0Var.W;
        if (arrayList == null) {
            if (py0Var.X != null) {
                ((org.telegram.ui.Cells.e8) view).setSticker((SendMessagesHelper.ImportingSticker) py0Var.Y.get(i10));
                return;
            }
            if (b1Var.f != 3) {
                org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                e8Var.d(tL_messages_stickerSet.documents.get(i10), null, py0Var.S, null, py0Var.h0, py0Var.R);
                e8Var.J.setOnClickListener(new ca(25, this, e8Var));
                return;
            }
            return;
        }
        int i11 = b1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.e8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.r3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        py0 py0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            } else if (i10 == 2) {
                d6Var2 = ((org.telegram.ui.ActionBar.f3) py0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.r3(8, this.c, d6Var2, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                d6Var3 = ((org.telegram.ui.ActionBar.f3) py0Var).resourcesProvider;
                FrameLayout jy0Var = new jy0(context);
                View view = new View(context);
                int dp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.h6.Me;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var3)));
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var3), PorterDuff.Mode.MULTIPLY));
                zq zqVar = new zq(c02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                zqVar.h = dp2;
                zqVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                zqVar.e = dp4;
                zqVar.f = dp5;
                view.setBackground(zqVar);
                w7.b6.a(view);
                jy0Var.addView(view, w7.z5.e(56, 56, 17));
                frameLayout = jy0Var;
            }
            return new sl0(frameLayout2);
        }
        d6Var = ((org.telegram.ui.ActionBar.f3) py0Var).resourcesProvider;
        ky0 ky0Var = new ky0(this, context, d6Var);
        ky0Var.getImageView().setLayerNum(7);
        frameLayout = ky0Var;
        frameLayout2 = frameLayout;
        return new sl0(frameLayout2);
    }
}
