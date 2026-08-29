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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jx0 extends il0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ nx0 r;

    public jx0(nx0 nx0Var, Context context) {
        this.r = nx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        nx0 nx0Var = this.r;
        if (nx0Var.S == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // f2.p0
    public final void l() {
        int i10;
        int i11;
        nx0 nx0Var = this.r;
        if (nx0Var.S != null) {
            int measuredWidth = nx0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            nx0Var.I.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < nx0Var.S.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nx0Var.S.get(i12);
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
            ArrayList arrayList = nx0Var.U;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nx0Var.O;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = nx0Var.O.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override // f2.p0
    public final void u(int i10) {
        ArrayList arrayList = this.r.U;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
        nx0 nx0Var = this.r;
        ArrayList arrayList = nx0Var.S;
        if (arrayList == null) {
            if (nx0Var.T != null) {
                ((org.telegram.ui.Cells.b8) view).setSticker((SendMessagesHelper.ImportingSticker) nx0Var.U.get(i10));
                return;
            }
            if (n1Var.f != 3) {
                org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                b8Var.d(tL_messages_stickerSet.documents.get(i10), null, nx0Var.O, null, nx0Var.d0, nx0Var.N);
                b8Var.F.setOnClickListener(new fi0(3, this, b8Var));
                return;
            }
            return;
        }
        int i11 = n1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.b8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.p3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        nx0 nx0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.i3(context);
            } else if (i10 == 2) {
                c6Var2 = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.p3(8, this.c, c6Var2, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                c6Var3 = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
                FrameLayout hx0Var = new hx0(context);
                View view = new View(context);
                int dp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.g6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var3)));
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var3), PorterDuff.Mode.MULTIPLY));
                jq jqVar = new jq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                jqVar.h = dp2;
                jqVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                jqVar.e = dp4;
                jqVar.f = dp5;
                view.setBackground(jqVar);
                i7.h6.a(view);
                hx0Var.addView(view, i7.f6.e(56, 56, 17));
                frameLayout = hx0Var;
            }
            return new vk0(frameLayout2);
        }
        c6Var = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
        ix0 ix0Var = new ix0(this, context, c6Var);
        ix0Var.getImageView().setLayerNum(7);
        frameLayout = ix0Var;
        frameLayout2 = frameLayout;
        return new vk0(frameLayout2);
    }
}
