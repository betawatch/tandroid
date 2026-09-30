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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public abstract class fw extends an0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final bw E;
    public final bw F;
    public final dw G;
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
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean w;
    public final bw x;
    public final bw y;

    public fw(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
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
        this.v = d6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        xv xvVar = new xv(this, context, z13, z14);
        this.b = xvVar;
        xvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            bw bwVar = new bw(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = bwVar;
            linearLayout.addView(bwVar);
            bwVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            bw bwVar2 = new bw(this, context, this.h, false);
            this.y = bwVar2;
            linearLayout2.addView(bwVar2);
            bwVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            bwVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            bw bwVar3 = new bw(this, context, i12, false);
            this.E = bwVar3;
            linearLayout3.addView(bwVar3);
            bwVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            bwVar3.setAlpha(0.0f);
            bwVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                bw bwVar4 = new bw(this, context, e0[i14], i14 == 0);
                bwVar4.setContentDescription(f(i14));
                this.b.addView(bwVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            dw dwVar = new dw(this, context);
            this.G = dwVar;
            linearLayout4.addView(dwVar);
            dwVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            bw bwVar5 = new bw(this, context, i13, true);
            this.F = bwVar5;
            linearLayout5.addView(bwVar5);
            bwVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            bwVar5.a = Long.valueOf(1434631203);
            bwVar5.setAlpha(0.0f);
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

    public boolean g(zx zxVar) {
        return zxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.h6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        boolean z11 = z10 && !this.c0;
        bw bwVar = this.x;
        if (bwVar != null) {
            i10++;
        }
        if (!this.W || bwVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof dw) {
                dw dwVar = (dw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < dwVar.b.getChildCount()) {
                    View childAt2 = dwVar.b.getChildAt(i16);
                    if (childAt2 instanceof bw) {
                        ((bw) childAt2).g(i10 == i15, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof bw) {
                    ((bw) childAt).g(i10 == i14, z11);
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
        dw dwVar2 = this.G;
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
                ofFloat.addUpdateListener(new ci.ya(this, f7, f10, i18));
                this.J.setDuration(350L);
                this.J.setInterpolator(sr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.b.invalidate();
            }
            if (dwVar2 != null) {
                boolean z12 = this.M == 1 || this.n;
                if (z12 != dwVar2.n) {
                    dwVar2.n = z12;
                    if (!z12) {
                        dwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = dwVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dwVar2.r, z12 ? 1.0f : 0.0f);
                        dwVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(dwVar2, 20));
                        dwVar2.c.setDuration(475L);
                        dwVar2.c.setInterpolator(sr.h);
                        dwVar2.c.start();
                    } else {
                        dwVar2.r = z12 ? 1.0f : 0.0f;
                        dwVar2.invalidate();
                        dwVar2.requestLayout();
                        dwVar2.c();
                        dwVar2.s.b.invalidate();
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
            if (dwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= dwVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                dwVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.d6 d6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f);
        }
        int i10 = this.T;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.h6.l1(0.09f, this.Q) : org.telegram.ui.ActionBar.h6.l1(0.18f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Me, d6Var));
    }

    public final void l(boolean z10) {
        bw bwVar = this.E;
        if (bwVar != null) {
            boolean z11 = this.a0;
            if (z11 || this.b0 != z10) {
                this.b0 = z10;
                if (z11) {
                    bwVar.setVisibility(z10 ? 0 : 8);
                    bwVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    bwVar.setVisibility(0);
                    bwVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(sr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        bw bwVar = this.y;
        if (bwVar == null) {
            return;
        }
        if (z10) {
            bwVar.setBackground(new ew(k()));
        } else {
            bwVar.setBackground(null);
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
            if (childAt instanceof dw) {
                dw dwVar = (dw) childAt;
                int i12 = 0;
                while (i12 < dwVar.b.getChildCount()) {
                    final int i13 = 0;
                    dwVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                        public final /* synthetic */ fw b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wv
                    public final /* synthetic */ fw b;

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
        bw bwVar = this.F;
        if (bwVar != null) {
            bwVar.setOnClickListener(new f0(this, 13));
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
        bw bwVar;
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
                bw bwVar2 = this.F;
                int i14 = i13 - (bwVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    bw bwVar3 = i15 < i14 ? (bw) this.b.getChildAt(i15 + i12) : null;
                    zx zxVar = i15 < arrayList.size() ? (zx) arrayList.get(i15) : null;
                    if (zxVar == null) {
                        if (bwVar3 != null) {
                            this.b.removeView(bwVar3);
                        }
                    } else if (zxVar.j == 0) {
                        boolean z12 = zxVar.e;
                        Long l4 = zxVar.a;
                        if (l4 != null) {
                            if (bwVar3 == null) {
                                i10 = i14;
                                bwVar3 = new bw(this, getContext(), zxVar.a.longValue());
                                i(bwVar3);
                                this.b.addView(bwVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                bwVar3.setAnimatedEmojiDocumentId(l4.longValue());
                            }
                            i11 = i12;
                            bwVar = bwVar2;
                            z10 = z11;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = zxVar.b;
                            ArrayList arrayList3 = zxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                bwVar = bwVar2;
                                z10 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z11;
                                        i11 = i12;
                                        bwVar = bwVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z11 = z10;
                                        i12 = i11;
                                        bwVar2 = bwVar;
                                    }
                                }
                                i11 = i12;
                                bwVar = bwVar2;
                                z10 = z11;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (bwVar3 == null) {
                                            bwVar3 = new bw(this, getContext(), document);
                                            i(bwVar3);
                                            this.b.addView(bwVar3, i11 + i15);
                                        } else {
                                            bwVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            bwVar3.setStickerThumb(zxVar);
                                        }
                                    }
                                    document = null;
                                    if (bwVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (bwVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        bwVar3.a = zxVar.i ? Long.valueOf(439488310) : null;
                        bwVar3.g(this.M == i15, false);
                        int i17 = this.T;
                        if (i17 == 4) {
                            bwVar3.a((z10 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z12) {
                                    bwVar3.a(Boolean.TRUE);
                                } else if (g(zxVar)) {
                                    bwVar3.a(null);
                                } else {
                                    bwVar3.a(Boolean.FALSE);
                                }
                            }
                            bwVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z11 = z10;
                        i12 = i11;
                        bwVar2 = bwVar;
                    } else if (bwVar3 == null) {
                        bw bwVar4 = new bw(this, getContext(), zxVar.j, false);
                        i(bwVar4);
                        this.b.addView(bwVar4, i12 + i15);
                    } else {
                        bwVar3.setDrawable(getResources().getDrawable(zxVar.j).mutate());
                        bwVar3.d();
                        bwVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    bwVar = bwVar2;
                    z10 = z11;
                    i15++;
                    i14 = i10;
                    z11 = z10;
                    i12 = i11;
                    bwVar2 = bwVar;
                }
                bw bwVar5 = bwVar2;
                if (bwVar5 != null) {
                    bwVar5.bringToFront();
                    if (bwVar5.getAlpha() < 1.0f) {
                        bwVar5.animate().alpha(1.0f).setDuration(zg.e0.d() ? 0L : 200L).setInterpolator(sr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((bw) arrayList2.get(i18)).getClass();
                    ((bw) arrayList2.get(i18)).c();
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

    public void i(bw bwVar) {
    }
}
