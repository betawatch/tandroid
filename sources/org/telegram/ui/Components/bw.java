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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class bw extends mm0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final xv E;
    public final xv F;
    public final zv G;
    public final HashMap H;
    public final int I;
    public ValueAnimator J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public final Runnable R;
    public int S;
    public final int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public float d0;
    public final int h;
    public final boolean n;
    public boolean r;
    public e6 s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean w;
    public final xv x;
    public final xv y;

    public bw(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.r = true;
        this.H = new HashMap();
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.S = 6;
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = true;
        this.b0 = false;
        this.c0 = true;
        this.d0 = 11.0f;
        this.w = z13;
        this.v = f6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        tv tvVar = new tv(this, context, z13, z14);
        this.b = tvVar;
        tvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            xv xvVar = new xv(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = xvVar;
            linearLayout.addView(xvVar);
            xvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            xv xvVar2 = new xv(this, context, this.h, false);
            this.y = xvVar2;
            linearLayout2.addView(xvVar2);
            xvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            xvVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            xv xvVar3 = new xv(this, context, i12, false);
            this.E = xvVar3;
            linearLayout3.addView(xvVar3);
            xvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            xvVar3.setAlpha(0.0f);
            xvVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                xv xvVar4 = new xv(this, context, e0[i14], i14 == 0);
                xvVar4.setContentDescription(f(i14));
                this.b.addView(xvVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            zv zvVar = new zv(this, context);
            this.G = zvVar;
            linearLayout4.addView(zvVar);
            zvVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            xv xvVar5 = new xv(this, context, i13, true);
            this.F = xvVar5;
            linearLayout5.addView(xvVar5);
            xvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            xvVar5.a = Long.valueOf(1434631203);
            xvVar5.setAlpha(0.0f);
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
        return org.telegram.ui.ActionBar.j6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        boolean z11 = z10 && !this.c0;
        xv xvVar = this.x;
        if (xvVar != null) {
            i10++;
        }
        if (!this.W || xvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < zvVar.b.getChildCount()) {
                    View childAt2 = zvVar.b.getChildAt(i16);
                    if (childAt2 instanceof xv) {
                        ((xv) childAt2).g(i10 == i15, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof xv) {
                    ((xv) childAt).g(i10 == i14, z11);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.M = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.M;
        zv zvVar2 = this.G;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = this.K;
            float f10 = this.M;
            int i18 = 2;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new di.bb(this, f7, f10, i18));
                this.J.setDuration(350L);
                this.J.setInterpolator(pr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.b.invalidate();
            }
            if (zvVar2 != null) {
                boolean z12 = this.M == 1 || this.n;
                if (z12 != zvVar2.n) {
                    zvVar2.n = z12;
                    if (!z12) {
                        zvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = zvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(zvVar2.r, z12 ? 1.0f : 0.0f);
                        zvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new l6(zvVar2, 20));
                        zvVar2.c.setDuration(475L);
                        zvVar2.c.setInterpolator(pr.h);
                        zvVar2.c.start();
                    } else {
                        zvVar2.r = z12 ? 1.0f : 0.0f;
                        zvVar2.invalidate();
                        zvVar2.requestLayout();
                        zvVar2.c();
                        zvVar2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (zvVar2 != null && this.M == 1 && i10 >= 1 && i10 <= zvVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                zvVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f);
        }
        int i10 = this.T;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.j6.l1(0.09f, this.Q) : org.telegram.ui.ActionBar.j6.l1(0.18f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
    }

    public final void l(boolean z10) {
        xv xvVar = this.E;
        if (xvVar != null) {
            boolean z11 = this.a0;
            if (z11 || this.b0 != z10) {
                this.b0 = z10;
                if (z11) {
                    xvVar.setVisibility(z10 ? 0 : 8);
                    xvVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    xvVar.setVisibility(0);
                    xvVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(pr.h).withEndAction(new ah.u(23, this, z10)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        xv xvVar = this.y;
        if (xvVar == null) {
            return;
        }
        if (z10) {
            xvVar.setBackground(new aw(k()));
        } else {
            xvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.r = z10;
        this.b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                int i12 = 0;
                while (i12 < zvVar.b.getChildCount()) {
                    final int i13 = 0;
                    zvVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                        public final /* synthetic */ bw b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                    public final /* synthetic */ bw b;

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
        xv xvVar = this.F;
        if (xvVar != null) {
            xvVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b.setPadding(AndroidUtilities.dp(this.d0), 0, AndroidUtilities.dp(11.0f), 0);
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
        xv xvVar;
        boolean z10;
        TLRPC.Document document;
        if (this.w) {
            if (!this.c0 || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.c0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i12 = this.I;
                int i13 = childCount - i12;
                xv xvVar2 = this.F;
                int i14 = i13 - (xvVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    xv xvVar3 = i15 < i14 ? (xv) this.b.getChildAt(i15 + i12) : null;
                    xx xxVar = i15 < arrayList.size() ? (xx) arrayList.get(i15) : null;
                    if (xxVar == null) {
                        if (xvVar3 != null) {
                            this.b.removeView(xvVar3);
                        }
                    } else if (xxVar.j == 0) {
                        boolean z12 = xxVar.e;
                        Long l4 = xxVar.a;
                        if (l4 != null) {
                            if (xvVar3 == null) {
                                i10 = i14;
                                xvVar3 = new xv(this, getContext(), xxVar.a.longValue());
                                i(xvVar3);
                                this.b.addView(xvVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                xvVar3.setAnimatedEmojiDocumentId(l4.longValue());
                            }
                            i11 = i12;
                            xvVar = xvVar2;
                            z10 = z11;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = xxVar.b;
                            ArrayList arrayList3 = xxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                xvVar = xvVar2;
                                z10 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z11;
                                        i11 = i12;
                                        xvVar = xvVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z11 = z10;
                                        i12 = i11;
                                        xvVar2 = xvVar;
                                    }
                                }
                                i11 = i12;
                                xvVar = xvVar2;
                                z10 = z11;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (xvVar3 == null) {
                                            xvVar3 = new xv(this, getContext(), document);
                                            i(xvVar3);
                                            this.b.addView(xvVar3, i11 + i15);
                                        } else {
                                            xvVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            xvVar3.setStickerThumb(xxVar);
                                        }
                                    }
                                    document = null;
                                    if (xvVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (xvVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        xvVar3.a = xxVar.i ? Long.valueOf(439488310) : null;
                        xvVar3.g(this.M == i15, false);
                        int i17 = this.T;
                        if (i17 == 4) {
                            xvVar3.a((z10 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z12) {
                                    xvVar3.a(Boolean.TRUE);
                                } else if (g(xxVar)) {
                                    xvVar3.a(null);
                                } else {
                                    xvVar3.a(Boolean.FALSE);
                                }
                            }
                            xvVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z11 = z10;
                        i12 = i11;
                        xvVar2 = xvVar;
                    } else if (xvVar3 == null) {
                        xv xvVar4 = new xv(this, getContext(), xxVar.j, false);
                        i(xvVar4);
                        this.b.addView(xvVar4, i12 + i15);
                    } else {
                        xvVar3.setDrawable(getResources().getDrawable(xxVar.j).mutate());
                        xvVar3.d();
                        xvVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    xvVar = xvVar2;
                    z10 = z11;
                    i15++;
                    i14 = i10;
                    z11 = z10;
                    i12 = i11;
                    xvVar2 = xvVar;
                }
                xv xvVar5 = xvVar2;
                if (xvVar5 != null) {
                    xvVar5.bringToFront();
                    if (xvVar5.getAlpha() < 1.0f) {
                        xvVar5.animate().alpha(1.0f).setDuration(ah.y0.d() ? 0L : 200L).setInterpolator(pr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((xv) arrayList2.get(i18)).getClass();
                    ((xv) arrayList2.get(i18)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.d0 = f7;
    }

    public void e() {
    }

    public void i(xv xvVar) {
    }
}
