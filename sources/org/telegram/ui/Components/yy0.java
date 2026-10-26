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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yy0 extends lm0 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ cz0 r;

    public yy0(cz0 cz0Var, Context context) {
        this.r = cz0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        cz0 cz0Var = this.r;
        if (cz0Var.W == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
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
        cz0 cz0Var = this.r;
        if (cz0Var.W != null) {
            int measuredWidth = cz0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            cz0Var.M.z1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i12 = 0; i12 < cz0Var.W.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cz0Var.W.get(i12);
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
            ArrayList arrayList = cz0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cz0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = cz0Var.S.set;
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
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        cz0 cz0Var = this.r;
        ArrayList arrayList = cz0Var.W;
        if (arrayList == null) {
            if (cz0Var.X != null) {
                ((org.telegram.ui.Cells.i8) view).setSticker((SendMessagesHelper.ImportingSticker) cz0Var.Y.get(i10));
                return;
            }
            if (e1Var.f != 3) {
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                i8Var.d(tL_messages_stickerSet.documents.get(i10), null, cz0Var.S, null, cz0Var.h0, cz0Var.R);
                i8Var.J.setOnClickListener(new ga(26, this, i8Var));
                return;
            }
            return;
        }
        int i11 = e1Var.f;
        SparseArray sparseArray = this.e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.i8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.q3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        cz0 cz0Var = this.r;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                frameLayout2 = new org.telegram.ui.Cells.i3(context);
            } else if (i10 == 2) {
                u6Var2 = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
                frameLayout2 = new org.telegram.ui.Cells.q3(8, this.c, u6Var2, true, false);
            } else if (i10 != 3) {
                frameLayout2 = null;
            } else {
                u6Var3 = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
                wy0 wy0Var = new wy0(context);
                wy0Var.a = u6Var3;
                View view = new View(context);
                wy0Var.c = view;
                int dp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.y6.Me;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var3)));
                wy0Var.b = c02;
                Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.f7.y(wy0Var, mutate, i11, u6Var3, PorterDuff.Mode.MULTIPLY);
                ar arVar = new ar(c02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                arVar.h = dp2;
                arVar.n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                arVar.e = dp4;
                arVar.f = dp5;
                view.setBackground(arVar);
                gb1.b(view);
                wy0Var.addView(view, gb1.i(56, 56, 17));
                frameLayout = wy0Var;
            }
            return new vl0(frameLayout2);
        }
        u6Var = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
        xy0 xy0Var = new xy0(this, context, u6Var);
        xy0Var.getImageView().setLayerNum(7);
        frameLayout = xy0Var;
        frameLayout2 = frameLayout;
        return new vl0(frameLayout2);
    }
}
