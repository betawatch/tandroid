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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class ew extends ym0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final aw E;
    public final aw F;
    public final cw G;
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
    public final aw x;
    public final aw y;

    public ew(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
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
        wv wvVar = new wv(this, context, z13, z14);
        this.b = wvVar;
        wvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            aw awVar = new aw(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = awVar;
            linearLayout.addView(awVar);
            awVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            aw awVar2 = new aw(this, context, this.h, false);
            this.y = awVar2;
            linearLayout2.addView(awVar2);
            awVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            awVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            aw awVar3 = new aw(this, context, i12, false);
            this.E = awVar3;
            linearLayout3.addView(awVar3);
            awVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            awVar3.setAlpha(0.0f);
            awVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                aw awVar4 = new aw(this, context, e0[i14], i14 == 0);
                awVar4.setContentDescription(f(i14));
                this.b.addView(awVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            cw cwVar = new cw(this, context);
            this.G = cwVar;
            linearLayout4.addView(cwVar);
            cwVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            aw awVar5 = new aw(this, context, i13, true);
            this.F = awVar5;
            linearLayout5.addView(awVar5);
            awVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            awVar5.a = Long.valueOf(1434631203);
            awVar5.setAlpha(0.0f);
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

    public boolean g(yx yxVar) {
        return yxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.h6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        boolean z11 = z10 && !this.c0;
        aw awVar = this.x;
        if (awVar != null) {
            i10++;
        }
        if (!this.W || awVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < cwVar.b.getChildCount()) {
                    View childAt2 = cwVar.b.getChildAt(i16);
                    if (childAt2 instanceof aw) {
                        ((aw) childAt2).g(i10 == i15, z11);
                    }
                    i16++;
                    i15++;
                }
                i11 = i15 - 1;
            } else {
                if (childAt instanceof aw) {
                    ((aw) childAt).g(i10 == i14, z11);
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
        cw cwVar2 = this.G;
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
                this.J.setInterpolator(rr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.b.invalidate();
            }
            if (cwVar2 != null) {
                boolean z12 = this.M == 1 || this.n;
                if (z12 != cwVar2.n) {
                    cwVar2.n = z12;
                    if (!z12) {
                        cwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = cwVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(cwVar2.r, z12 ? 1.0f : 0.0f);
                        cwVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new k6(cwVar2, 20));
                        cwVar2.c.setDuration(475L);
                        cwVar2.c.setInterpolator(rr.h);
                        cwVar2.c.start();
                    } else {
                        cwVar2.r = z12 ? 1.0f : 0.0f;
                        cwVar2.invalidate();
                        cwVar2.requestLayout();
                        cwVar2.c();
                        cwVar2.s.b.invalidate();
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
            if (cwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= cwVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                cwVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
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
        aw awVar = this.E;
        if (awVar != null) {
            boolean z11 = this.a0;
            if (z11 || this.b0 != z10) {
                this.b0 = z10;
                if (z11) {
                    awVar.setVisibility(z10 ? 0 : 8);
                    awVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    awVar.setVisibility(0);
                    awVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(rr.h).withEndAction(new bi.f(23, this, z10)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        aw awVar = this.y;
        if (awVar == null) {
            return;
        }
        if (z10) {
            awVar.setBackground(new dw(k()));
        } else {
            awVar.setBackground(null);
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
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                int i12 = 0;
                while (i12 < cwVar.b.getChildCount()) {
                    final int i13 = 0;
                    cwVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vv
                        public final /* synthetic */ ew b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vv
                    public final /* synthetic */ ew b;

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
        aw awVar = this.F;
        if (awVar != null) {
            awVar.setOnClickListener(new f0(this, 13));
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
        aw awVar;
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
                aw awVar2 = this.F;
                int i14 = i13 - (awVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    aw awVar3 = i15 < i14 ? (aw) this.b.getChildAt(i15 + i12) : null;
                    yx yxVar = i15 < arrayList.size() ? (yx) arrayList.get(i15) : null;
                    if (yxVar == null) {
                        if (awVar3 != null) {
                            this.b.removeView(awVar3);
                        }
                    } else if (yxVar.j == 0) {
                        boolean z12 = yxVar.e;
                        Long l4 = yxVar.a;
                        if (l4 != null) {
                            if (awVar3 == null) {
                                i10 = i14;
                                awVar3 = new aw(this, getContext(), yxVar.a.longValue());
                                i(awVar3);
                                this.b.addView(awVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                awVar3.setAnimatedEmojiDocumentId(l4.longValue());
                            }
                            i11 = i12;
                            awVar = awVar2;
                            z10 = z11;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = yxVar.b;
                            ArrayList arrayList3 = yxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                awVar = awVar2;
                                z10 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z11;
                                        i11 = i12;
                                        awVar = awVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z11 = z10;
                                        i12 = i11;
                                        awVar2 = awVar;
                                    }
                                }
                                i11 = i12;
                                awVar = awVar2;
                                z10 = z11;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (awVar3 == null) {
                                            awVar3 = new aw(this, getContext(), document);
                                            i(awVar3);
                                            this.b.addView(awVar3, i11 + i15);
                                        } else {
                                            awVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            awVar3.setStickerThumb(yxVar);
                                        }
                                    }
                                    document = null;
                                    if (awVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (awVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        awVar3.a = yxVar.i ? Long.valueOf(439488310) : null;
                        awVar3.g(this.M == i15, false);
                        int i17 = this.T;
                        if (i17 == 4) {
                            awVar3.a((z10 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z12) {
                                    awVar3.a(Boolean.TRUE);
                                } else if (g(yxVar)) {
                                    awVar3.a(null);
                                } else {
                                    awVar3.a(Boolean.FALSE);
                                }
                            }
                            awVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z11 = z10;
                        i12 = i11;
                        awVar2 = awVar;
                    } else if (awVar3 == null) {
                        aw awVar4 = new aw(this, getContext(), yxVar.j, false);
                        i(awVar4);
                        this.b.addView(awVar4, i12 + i15);
                    } else {
                        awVar3.setDrawable(getResources().getDrawable(yxVar.j).mutate());
                        awVar3.d();
                        awVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    awVar = awVar2;
                    z10 = z11;
                    i15++;
                    i14 = i10;
                    z11 = z10;
                    i12 = i11;
                    awVar2 = awVar;
                }
                aw awVar5 = awVar2;
                if (awVar5 != null) {
                    awVar5.bringToFront();
                    if (awVar5.getAlpha() < 1.0f) {
                        awVar5.animate().alpha(1.0f).setDuration(zg.e0.d() ? 0L : 200L).setInterpolator(rr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((aw) arrayList2.get(i18)).getClass();
                    ((aw) arrayList2.get(i18)).c();
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

    public void i(aw awVar) {
    }
}
