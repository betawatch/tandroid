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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yw0 extends vk0 {
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

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.h;
    }

    @Override // f2.r0
    public final int j(int i9) {
        cx0 cx0Var = this.r;
        if (cx0Var.S == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i9) ? 0 : 3;
        }
        Object obj = this.e.get(i9);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // f2.r0
    public final void l() {
        int i9;
        int i10;
        cx0 cx0Var = this.r;
        if (cx0Var.S != null) {
            int measuredWidth = cx0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            cx0Var.I.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i11 = 0; i11 < cx0Var.S.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cx0Var.S.get(i11);
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
                        i9 = 1;
                    } else {
                        i9 = (int) Math.ceil(list.size() / this.d);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            sparseArray.put(this.h + i14, list.get(i14));
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        i10 = this.d * i9;
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
            ArrayList arrayList = cx0Var.U;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.O;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = cx0Var.O.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override // f2.r0
    public final void u(int i9) {
        ArrayList arrayList = this.r.U;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i9);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        cx0 cx0Var = this.r;
        ArrayList arrayList = cx0Var.S;
        if (arrayList == null) {
            if (cx0Var.T != null) {
                ((org.telegram.ui.Cells.d8) view).setSticker((SendMessagesHelper.ImportingSticker) cx0Var.U.get(i9));
                return;
            }
            if (q1Var.f != 3) {
                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                d8Var.d(tL_messages_stickerSet.documents.get(i9), null, cx0Var.O, null, cx0Var.d0, cx0Var.N);
                d8Var.F.setOnClickListener(new vh0(2, this, d8Var));
                return;
            }
            return;
        }
        int i10 = q1Var.f;
        SparseArray sparseArray = this.e;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i9), null, this.f.get(i9), null, false, false);
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        cx0 cx0Var = this.r;
        Context context = this.c;
        if (i9 != 0) {
            if (i9 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.l3(context);
            } else if (i9 == 2) {
                b6Var2 = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.s3(8, this.c, b6Var2, true, false);
            } else if (i9 != 3) {
                frameLayout2 = null;
            } else {
                b6Var3 = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
                FrameLayout ww0Var = new ww0(context);
                View view = new View(context);
                int dp = AndroidUtilities.dp(28.0f);
                int i10 = org.telegram.ui.ActionBar.f6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var3)));
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var3), PorterDuff.Mode.MULTIPLY));
                fq fqVar = new fq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                fqVar.h = dp2;
                fqVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                fqVar.e = dp4;
                fqVar.f = dp5;
                view.setBackground(fqVar);
                g7.g6.a(view);
                ww0Var.addView(view, g7.e6.e(56, 56, 17));
                frameLayout = ww0Var;
            }
            return new ik0(frameLayout2);
        }
        b6Var = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
        xw0 xw0Var = new xw0(this, context, b6Var);
        xw0Var.getImageView().setLayerNum(7);
        frameLayout = xw0Var;
        frameLayout2 = frameLayout;
        return new ik0(frameLayout2);
    }
}
