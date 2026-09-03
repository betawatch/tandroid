package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class zv extends um0 {
    public static final int[] b0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] c0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final vv B;
    public final vv C;
    public final xv D;
    public final HashMap E;
    public final int F;
    public ValueAnimator G;
    public float H;
    public float I;
    public int J;
    public int K;
    public boolean L;
    public final boolean M;
    public final int N;
    public final Runnable O;
    public int P;
    public final int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a0;
    public final int h;
    public final boolean n;
    public boolean r;
    public z5 s;
    public final org.telegram.ui.ActionBar.g6 v;
    public final boolean w;
    public final vv x;
    public final vv y;

    public zv(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, boolean z11, boolean z12, int i10, Runnable runnable, int i11, boolean z13) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.r = true;
        this.E = new HashMap();
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.P = 6;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.a0 = 11.0f;
        this.w = z12;
        this.v = g6Var;
        this.O = runnable;
        this.Q = i10;
        this.N = i11;
        this.M = z13;
        rv rvVar = new rv(this, context, z12, z13);
        this.b = rvVar;
        rvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            vv vvVar = new vv(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = vvVar;
            linearLayout.addView(vvVar);
            vvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z4) {
            LinearLayout linearLayout2 = this.b;
            vv vvVar2 = new vv(this, context, this.h, false);
            this.y = vvVar2;
            linearLayout2.addView(vvVar2);
            vvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            vvVar2.a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.b;
            vv vvVar3 = new vv(this, context, i12, false);
            this.B = vvVar3;
            linearLayout3.addView(vvVar3);
            vvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            vvVar3.setAlpha(0.0f);
            vvVar3.a = Long.valueOf(98352451);
        }
        if (!z12) {
            int i14 = 0;
            while (i14 < 8) {
                vv vvVar4 = new vv(this, context, b0[i14], i14 == 0);
                vvVar4.setContentDescription(f(i14));
                this.b.addView(vvVar4);
                i14++;
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.b;
            xv xvVar = new xv(this, context);
            this.D = xvVar;
            linearLayout4.addView(xvVar);
            xvVar.h = 3552126;
        }
        this.F = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            vv vvVar5 = new vv(this, context, i13, true);
            this.C = vvVar5;
            linearLayout5.addView(vvVar5);
            vvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            vvVar5.a = Long.valueOf(1434631203);
            vvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i10) {
        switch (i10) {
            case 0:
                return LocaleController.getString(R.string.Emoji1);
            case 1:
                return LocaleController.getString(R.string.Emoji2);
            case 2:
                return LocaleController.getString(R.string.Emoji3);
            case 3:
                return LocaleController.getString(R.string.Emoji4);
            case 4:
                return LocaleController.getString(R.string.Emoji5);
            case 5:
                return LocaleController.getString(R.string.Emoji6);
            case 6:
                return LocaleController.getString(R.string.Emoji7);
            case 7:
                return LocaleController.getString(R.string.Emoji8);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(xx xxVar) {
        return xxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z4) {
        int i11;
        int i12 = 0;
        boolean z10 = z4 && !this.W;
        vv vvVar = this.x;
        if (vvVar != null) {
            i10++;
        }
        if (!this.T || vvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i13 = this.J;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i14);
            if (childAt instanceof xv) {
                xv xvVar = (xv) childAt;
                int i16 = i15;
                int i17 = 0;
                while (i17 < xvVar.b.getChildCount()) {
                    View childAt2 = xvVar.b.getChildAt(i17);
                    if (childAt2 instanceof vv) {
                        ((vv) childAt2).g(i10 == i16, z10);
                    }
                    i17++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof vv) {
                    ((vv) childAt).g(i10 == i15, z10);
                }
                i11 = i15;
            }
            if (i10 >= i15 && i10 <= i11) {
                this.J = i14;
            }
            i14++;
            i15 = i11 + 1;
        }
        int i18 = this.J;
        xv xvVar2 = this.D;
        if (i13 != i18) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.H;
            float f11 = this.J;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new pv(this, f10, f11, i12));
                this.G.setDuration(350L);
                this.G.setInterpolator(pr.h);
                this.G.start();
            } else {
                this.I = 1.0f;
                this.H = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (xvVar2 != null) {
                boolean z11 = this.J == 1 || this.n;
                if (z11 != xvVar2.n) {
                    xvVar2.n = z11;
                    if (!z11) {
                        xvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = xvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xvVar2.r, z11 ? 1.0f : 0.0f);
                        xvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new f6(xvVar2, 20));
                        xvVar2.c.setDuration(475L);
                        xvVar2.c.setInterpolator(pr.h);
                        xvVar2.c.start();
                    } else {
                        xvVar2.r = z11 ? 1.0f : 0.0f;
                        xvVar2.invalidate();
                        xvVar2.requestLayout();
                        xvVar2.c();
                        xvVar2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.J);
            if (this.J >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.K != i10) {
            if (xvVar2 != null && this.J == 1 && i10 >= 1 && i10 <= xvVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                xvVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.K = i10;
        }
    }

    public final int k() {
        boolean z4 = this.M;
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (z4) {
            return i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f);
        }
        int i10 = this.Q;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.k6.l1(0.09f, this.N) : org.telegram.ui.ActionBar.k6.l1(0.18f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var));
    }

    public final void l(boolean z4) {
        vv vvVar = this.B;
        if (vvVar != null) {
            boolean z10 = this.U;
            if (z10 || this.V != z4) {
                this.V = z4;
                if (z10) {
                    vvVar.setVisibility(z4 ? 0 : 8);
                    vvVar.setAlpha(z4 ? 1.0f : 0.0f);
                } else {
                    vvVar.setVisibility(0);
                    vvVar.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(pr.h).withEndAction(new kh.f(20, this, z4)).start();
                }
                this.b.requestLayout();
                this.U = false;
            }
        }
    }

    public final void m(boolean z4) {
        vv vvVar = this.y;
        if (vvVar == null) {
            return;
        }
        if (z4) {
            vvVar.setBackground(new yv(k()));
        } else {
            vvVar.setBackground(null);
        }
    }

    public final void n(boolean z4) {
        this.r = z4;
        this.b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof xv) {
                xv xvVar = (xv) childAt;
                int i12 = 0;
                while (i12 < xvVar.b.getChildCount()) {
                    final int i13 = 0;
                    xvVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                        public final /* synthetic */ zv b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    this.b.h(i11);
                                    break;
                                default:
                                    this.b.h(i11);
                                    break;
                            }
                        }
                    });
                    i12++;
                    i11++;
                }
                i11--;
            } else if (childAt != null) {
                final int i14 = 1;
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                    public final /* synthetic */ zv b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.h(i11);
                                break;
                            default:
                                this.b.h(i11);
                                break;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        vv vvVar = this.C;
        if (vvVar != null) {
            vvVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b.setPadding(AndroidUtilities.dp(this.a0), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(ArrayList arrayList) {
        int i10;
        int i11;
        vv vvVar;
        boolean z4;
        TLRPC.Document document;
        if (this.w) {
            if (!this.W || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.W = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i12 = this.F;
                int i13 = childCount - i12;
                vv vvVar2 = this.C;
                int i14 = i13 - (vvVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z10 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    vv vvVar3 = i15 < i14 ? (vv) this.b.getChildAt(i15 + i12) : null;
                    xx xxVar = i15 < arrayList.size() ? (xx) arrayList.get(i15) : null;
                    if (xxVar == null) {
                        if (vvVar3 != null) {
                            this.b.removeView(vvVar3);
                        }
                    } else if (xxVar.j == 0) {
                        boolean z11 = xxVar.e;
                        Long l10 = xxVar.a;
                        if (l10 != null) {
                            if (vvVar3 == null) {
                                i10 = i14;
                                vvVar3 = new vv(this, getContext(), xxVar.a.longValue());
                                i(vvVar3);
                                this.b.addView(vvVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                vvVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i11 = i12;
                            vvVar = vvVar2;
                            z4 = z10;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = xxVar.b;
                            ArrayList arrayList3 = xxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                vvVar = vvVar2;
                                z4 = z10;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z4 = z10;
                                        i11 = i12;
                                        vvVar = vvVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z10 = z4;
                                        i12 = i11;
                                        vvVar2 = vvVar;
                                    }
                                }
                                i11 = i12;
                                vvVar = vvVar2;
                                z4 = z10;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (vvVar3 == null) {
                                            vvVar3 = new vv(this, getContext(), document);
                                            i(vvVar3);
                                            this.b.addView(vvVar3, i11 + i15);
                                        } else {
                                            vvVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            vvVar3.setStickerThumb(xxVar);
                                        }
                                    }
                                    document = null;
                                    if (vvVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (vvVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        vvVar3.a = xxVar.i ? Long.valueOf(439488310) : null;
                        vvVar3.g(this.J == i15, false);
                        int i17 = this.Q;
                        if (i17 == 4) {
                            vvVar3.a((z4 || z11) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z4 && !z11) {
                                    vvVar3.a(Boolean.TRUE);
                                } else if (g(xxVar)) {
                                    vvVar3.a(null);
                                } else {
                                    vvVar3.a(Boolean.FALSE);
                                }
                            }
                            vvVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z10 = z4;
                        i12 = i11;
                        vvVar2 = vvVar;
                    } else if (vvVar3 == null) {
                        vv vvVar4 = new vv(this, getContext(), xxVar.j, false);
                        i(vvVar4);
                        this.b.addView(vvVar4, i12 + i15);
                    } else {
                        vvVar3.setDrawable(getResources().getDrawable(xxVar.j).mutate());
                        vvVar3.d();
                        vvVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    vvVar = vvVar2;
                    z4 = z10;
                    i15++;
                    i14 = i10;
                    z10 = z4;
                    i12 = i11;
                    vvVar2 = vvVar;
                }
                vv vvVar5 = vvVar2;
                if (vvVar5 != null) {
                    vvVar5.bringToFront();
                    if (vvVar5.getAlpha() < 1.0f) {
                        vvVar5.animate().alpha(1.0f).setDuration(ng.g0.d() ? 0L : 200L).setInterpolator(pr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((vv) arrayList2.get(i18)).getClass();
                    ((vv) arrayList2.get(i18)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.P = i10;
    }

    public void setPaddingLeft(float f10) {
        this.a0 = f10;
    }

    public void e() {
    }

    public void i(vv vvVar) {
    }
}
