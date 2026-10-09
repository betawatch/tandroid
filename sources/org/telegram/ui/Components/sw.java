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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class sw extends sn0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final ow E;
    public final ow F;
    public final qw G;
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
    public g6 s;
    public final org.telegram.ui.ActionBar.e6 v;
    public final boolean w;
    public final ow x;
    public final ow y;

    public sw(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
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
        this.v = e6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        kw kwVar = new kw(this, context, z13, z14);
        this.b = kwVar;
        kwVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            ow owVar = new ow(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = owVar;
            linearLayout.addView(owVar);
            owVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            ow owVar2 = new ow(this, context, this.h, false);
            this.y = owVar2;
            linearLayout2.addView(owVar2);
            owVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            owVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            ow owVar3 = new ow(this, context, i12, false);
            this.E = owVar3;
            linearLayout3.addView(owVar3);
            owVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            owVar3.setAlpha(0.0f);
            owVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                ow owVar4 = new ow(this, context, e0[i14], i14 == 0);
                owVar4.setContentDescription(f(i14));
                this.b.addView(owVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            qw qwVar = new qw(this, context);
            this.G = qwVar;
            linearLayout4.addView(qwVar);
            qwVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            ow owVar5 = new ow(this, context, i13, true);
            this.F = owVar5;
            linearLayout5.addView(owVar5);
            owVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            owVar5.a = Long.valueOf(1434631203);
            owVar5.setAlpha(0.0f);
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

    public boolean g(ny nyVar) {
        return nyVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.i6.o0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        boolean z11 = z10 && !this.c0;
        ow owVar = this.x;
        if (owVar != null) {
            i10++;
        }
        if (!this.W || owVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof qw) {
                qw qwVar = (qw) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < qwVar.b.getChildCount()) {
                    View childAt2 = qwVar.b.getChildAt(i15);
                    if (childAt2 instanceof ow) {
                        ((ow) childAt2).g(i10 == i16, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof ow) {
                    ((ow) childAt).g(i10 == i14, z11);
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
        qw qwVar2 = this.G;
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
                this.J.setInterpolator(hs.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = AndroidUtilities.lerp(f7, f10, 1.0f);
                this.b.invalidate();
            }
            if (qwVar2 != null) {
                boolean z12 = this.M == 1 || this.n;
                if (z12 != qwVar2.n) {
                    qwVar2.n = z12;
                    if (!z12) {
                        qwVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = qwVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(qwVar2.r, z12 ? 1.0f : 0.0f);
                        qwVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new m6(qwVar2, 21));
                        qwVar2.c.setDuration(475L);
                        qwVar2.c.setInterpolator(hs.h);
                        qwVar2.c.start();
                    } else {
                        qwVar2.r = z12 ? 1.0f : 0.0f;
                        qwVar2.invalidate();
                        qwVar2.requestLayout();
                        qwVar2.c();
                        qwVar2.s.b.invalidate();
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
            if (qwVar2 != null && this.M == 1 && i10 >= 1 && i10 <= qwVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                qwVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.e6 e6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) 12.75f);
        }
        int i10 = this.T;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.i6.m1(0.09f, this.Q) : org.telegram.ui.ActionBar.i6.m1(0.18f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Me, e6Var));
    }

    public final void l(boolean z10) {
        ow owVar = this.E;
        if (owVar != null) {
            boolean z11 = this.a0;
            if (z11 || this.b0 != z10) {
                this.b0 = z10;
                if (z11) {
                    owVar.setVisibility(z10 ? 0 : 8);
                    owVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    owVar.setVisibility(0);
                    owVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(hs.h).withEndAction(new bi.f(24, this, z10)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        ow owVar = this.y;
        if (owVar == null) {
            return;
        }
        if (z10) {
            owVar.setBackground(new rw(k()));
        } else {
            owVar.setBackground(null);
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
            if (childAt instanceof qw) {
                qw qwVar = (qw) childAt;
                int i12 = 0;
                while (i12 < qwVar.b.getChildCount()) {
                    final int i13 = 0;
                    qwVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                        public final /* synthetic */ sw b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                    public final /* synthetic */ sw b;

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
        ow owVar = this.F;
        if (owVar != null) {
            owVar.setOnClickListener(new f0(this, 12));
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
        ow owVar;
        boolean z10;
        boolean z11;
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
                ow owVar2 = this.F;
                int i14 = i13 - (owVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z12 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    ow owVar3 = i15 < i14 ? (ow) this.b.getChildAt(i15 + i12) : null;
                    ny nyVar = i15 < arrayList.size() ? (ny) arrayList.get(i15) : null;
                    if (nyVar == null) {
                        if (owVar3 != null) {
                            this.b.removeView(owVar3);
                        }
                    } else if (nyVar.j == 0) {
                        boolean z13 = nyVar.e;
                        Long l4 = nyVar.a;
                        if (l4 != null) {
                            if (owVar3 == null) {
                                i10 = i14;
                                owVar3 = new ow(this, getContext(), nyVar.a.longValue());
                                i(owVar3);
                                this.b.addView(owVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                owVar3.setAnimatedEmojiDocumentId(l4.longValue());
                            }
                            i11 = i12;
                            owVar = owVar2;
                            z10 = z12;
                            z11 = true;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = nyVar.b;
                            ArrayList arrayList3 = nyVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                owVar = owVar2;
                                z10 = z12;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z12;
                                        i11 = i12;
                                        owVar = owVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z11 = true;
                                            break;
                                        }
                                        i16++;
                                        z12 = z10;
                                        i12 = i11;
                                        owVar2 = owVar;
                                    }
                                }
                                i11 = i12;
                                owVar = owVar2;
                                z10 = z12;
                                if (arrayList3 != null) {
                                    z11 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (owVar3 == null) {
                                            owVar3 = new ow(this, getContext(), document);
                                            i(owVar3);
                                            this.b.addView(owVar3, i11 + i15);
                                        } else {
                                            owVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            owVar3.setStickerThumb(nyVar);
                                        }
                                    }
                                    document = null;
                                    if (owVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z11 = true;
                            document = null;
                            if (owVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        owVar3.a = nyVar.i ? Long.valueOf(439488310) : null;
                        owVar3.g(this.M == i15 ? z11 : false, false);
                        int i17 = this.T;
                        if (i17 == 4) {
                            owVar3.a((z10 || z13) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z13) {
                                    owVar3.a(Boolean.TRUE);
                                } else if (g(nyVar)) {
                                    owVar3.a(null);
                                } else {
                                    owVar3.a(Boolean.FALSE);
                                }
                            }
                            owVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z12 = z10;
                        i12 = i11;
                        owVar2 = owVar;
                    } else if (owVar3 == null) {
                        ow owVar4 = new ow(this, getContext(), nyVar.j, false);
                        i(owVar4);
                        this.b.addView(owVar4, i12 + i15);
                    } else {
                        owVar3.setDrawable(getResources().getDrawable(nyVar.j).mutate());
                        owVar3.d();
                        owVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    owVar = owVar2;
                    z10 = z12;
                    i15++;
                    i14 = i10;
                    z12 = z10;
                    i12 = i11;
                    owVar2 = owVar;
                }
                ow owVar5 = owVar2;
                if (owVar5 != null) {
                    owVar5.bringToFront();
                    if (owVar5.getAlpha() < 1.0f) {
                        owVar5.animate().alpha(1.0f).setDuration(zg.d0.d() ? 0L : 200L).setInterpolator(hs.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((ow) arrayList2.get(i18)).getClass();
                    ((ow) arrayList2.get(i18)).c();
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

    public void i(ow owVar) {
    }
}
