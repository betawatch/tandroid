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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rx0 extends kl0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ vx0 r;

    public rx0(vx0 vx0Var, Context context) {
        this.r = vx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        vx0 vx0Var = this.r;
        if (vx0Var.W == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override // s4.h0
    public final void l() {
        int i10;
        int i11;
        vx0 vx0Var = this.r;
        if (vx0Var.W != null) {
            int measuredWidth = vx0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            vx0Var.M.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < vx0Var.W.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vx0Var.W.get(i12);
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
            ArrayList arrayList = vx0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = vx0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = vx0Var.S.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override // s4.h0
    public final void u(int i10) {
        ArrayList arrayList = this.r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        vx0 vx0Var = this.r;
        ArrayList arrayList = vx0Var.W;
        if (arrayList == null) {
            if (vx0Var.X != null) {
                ((org.telegram.ui.Cells.f8) view).setSticker((SendMessagesHelper.ImportingSticker) vx0Var.Y.get(i10));
                return;
            }
            if (c1Var.f != 3) {
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                f8Var.d(tL_messages_stickerSet.documents.get(i10), null, vx0Var.S, null, vx0Var.h0, vx0Var.R);
                f8Var.J.setOnClickListener(new dt(15, this, f8Var));
                return;
            }
            return;
        }
        int i11 = c1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        vx0 vx0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            } else if (i10 == 2) {
                e6Var2 = ((org.telegram.ui.ActionBar.f3) vx0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.s3(8, this.c, e6Var2, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                e6Var3 = ((org.telegram.ui.ActionBar.f3) vx0Var).resourcesProvider;
                FrameLayout px0Var = new px0(context);
                View view = new View(context);
                int dp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.i6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(i11, e6Var3)));
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var3), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                pqVar.h = dp2;
                pqVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                pqVar.e = dp4;
                pqVar.f = dp5;
                view.setBackground(pqVar);
                w7.z5.a(view);
                px0Var.addView(view, w7.x5.e(56, 56, 17));
                frameLayout = px0Var;
            }
            return new vk0(frameLayout2);
        }
        e6Var = ((org.telegram.ui.ActionBar.f3) vx0Var).resourcesProvider;
        qx0 qx0Var = new qx0(this, context, e6Var);
        qx0Var.getImageView().setLayerNum(7);
        frameLayout = qx0Var;
        frameLayout2 = frameLayout;
        return new vk0(frameLayout2);
    }
}
