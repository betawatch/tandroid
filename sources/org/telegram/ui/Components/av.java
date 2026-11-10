package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class av extends vk0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final wu D;
    public final wu E;
    public final wu F;
    public final yu G;
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
    public v5 s;
    public final org.telegram.ui.ActionBar.h6 w;
    public final boolean x;
    public final wu y;

    public av(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10, boolean z11, boolean z12, int i7, Runnable runnable, int i10, boolean z13) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        this.n = !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q();
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
        this.x = z12;
        this.w = h6Var;
        this.R = runnable;
        this.T = i7;
        this.Q = i10;
        this.P = z13;
        su suVar = new su(this, context, z12, z13);
        this.b = suVar;
        suVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.b;
            wu wuVar = new wu(this, context, R.drawable.msg_emoji_stickers, false);
            this.y = wuVar;
            linearLayout.addView(wuVar);
            wuVar.setContentDescription(org.telegram.messenger.id.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i7 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z9) {
            LinearLayout linearLayout2 = this.b;
            wu wuVar2 = new wu(this, context, this.h, false);
            this.D = wuVar2;
            linearLayout2.addView(wuVar2);
            wuVar2.setContentDescription(org.telegram.messenger.id.M0(2131746361, null));
            wuVar2.a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.b;
            wu wuVar3 = new wu(this, context, R.drawable.msg_emoji_gem, false);
            this.E = wuVar3;
            linearLayout3.addView(wuVar3);
            wuVar3.setContentDescription(org.telegram.messenger.id.M0(2131751175, null));
            wuVar3.setAlpha(0.0f);
            wuVar3.a = Long.valueOf(98352451);
        }
        if (!z12) {
            int i11 = 0;
            while (i11 < 8) {
                wu wuVar4 = new wu(this, context, e0[i11], i11 == 0);
                wuVar4.setContentDescription(f(i11));
                this.b.addView(wuVar4);
                i11++;
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.b;
            yu yuVar = new yu(this, context);
            this.G = yuVar;
            linearLayout4.addView(yuVar);
            yuVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            wu wuVar5 = new wu(this, context, R.drawable.smiles_tab_settings, true);
            this.F = wuVar5;
            linearLayout5.addView(wuVar5);
            wuVar5.setContentDescription(org.telegram.messenger.id.M0(2131745495, null));
            wuVar5.a = Long.valueOf(1434631203);
            wuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.id.M0(2131751195, null);
            case 1:
                return org.telegram.messenger.id.M0(2131751194, null);
            case 2:
                return org.telegram.messenger.id.M0(2131751193, null);
            case 3:
                return org.telegram.messenger.id.M0(2131751192, null);
            case 4:
                return org.telegram.messenger.id.M0(2131751191, null);
            case 5:
                return org.telegram.messenger.id.M0(2131751190, null);
            case 6:
                return org.telegram.messenger.id.M0(2131751189, null);
            case 7:
                return org.telegram.messenger.id.M0(2131751188, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(tw twVar) {
        return twVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.m6.o0(this.w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z9) {
        int i10;
        int i11 = 1;
        boolean z10 = z9 && !this.c0;
        wu wuVar = this.y;
        if (wuVar != null) {
            i7++;
        }
        if (!this.W || wuVar != null) {
            i7 = Math.max(1, i7);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof yu) {
                yu yuVar = (yu) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < yuVar.b.getChildCount()) {
                    View childAt2 = yuVar.b.getChildAt(i15);
                    if (childAt2 instanceof wu) {
                        ((wu) childAt2).g(i7 == i16, z10);
                    }
                    i15++;
                    i16++;
                }
                i10 = i16 - 1;
            } else {
                if (childAt instanceof wu) {
                    ((wu) childAt).g(i7 == i14, z10);
                }
                i10 = i14;
            }
            if (i7 >= i14 && i7 <= i10) {
                this.M = i13;
            }
            i13++;
            i14 = i10 + 1;
        }
        int i17 = this.M;
        yu yuVar2 = this.G;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.K;
            float f11 = this.M;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new fi.k9(this, f10, f11, i11));
                this.J.setDuration(350L);
                this.J.setInterpolator(wq.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (yuVar2 != null) {
                boolean z11 = this.M == 1 || this.n;
                if (z11 != yuVar2.n) {
                    yuVar2.n = z11;
                    if (!z11) {
                        yuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = yuVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(yuVar2.r, z11 ? 1.0f : 0.0f);
                        yuVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new d6(yuVar2, 20));
                        yuVar2.c.setDuration(475L);
                        yuVar2.c.setInterpolator(wq.h);
                        yuVar2.c.start();
                    } else {
                        yuVar2.r = z11 ? 1.0f : 0.0f;
                        yuVar2.invalidate();
                        yuVar2.requestLayout();
                        yuVar2.c();
                        yuVar2.s.b.invalidate();
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
        if (this.N != i7) {
            if (yuVar2 != null && this.M == 1 && i7 >= 1 && i7 <= yuVar2.b.getChildCount() + 1) {
                int i18 = (i7 - 1) * 36;
                yuVar2.b(org.telegram.messenger.g0.L(i18 - 6), org.telegram.messenger.g0.L(i18 + 24));
            }
            this.N = i7;
        }
    }

    public final int k() {
        boolean z9 = this.P;
        org.telegram.ui.ActionBar.h6 h6Var = this.w;
        if (z9) {
            return i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 12.75f);
        }
        int i7 = this.T;
        return (i7 == 5 || i7 == 7) ? org.telegram.ui.ActionBar.m6.r1(0.09f, this.Q) : org.telegram.ui.ActionBar.m6.r1(0.18f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
    }

    public final void l(boolean z9) {
        wu wuVar = this.E;
        if (wuVar != null) {
            boolean z10 = this.a0;
            if (z10 || this.b0 != z9) {
                this.b0 = z9;
                if (z10) {
                    wuVar.setVisibility(z9 ? 0 : 8);
                    wuVar.setAlpha(z9 ? 1.0f : 0.0f);
                } else {
                    wuVar.setVisibility(0);
                    wuVar.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(wq.h).withEndAction(new bi.k1(23, this, z9)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z9) {
        wu wuVar = this.D;
        if (wuVar == null) {
            return;
        }
        if (z9) {
            wuVar.setBackground(new zu(k()));
        } else {
            wuVar.setBackground(null);
        }
    }

    public final void n(boolean z9) {
        this.r = z9;
        this.b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof yu) {
                yu yuVar = (yu) childAt;
                int i11 = 0;
                while (i11 < yuVar.b.getChildCount()) {
                    final int i12 = 0;
                    yuVar.b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ru
                        public final /* synthetic */ av b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    this.b.h(i10);
                                    break;
                                default:
                                    this.b.h(i10);
                                    break;
                            }
                        }
                    });
                    i11++;
                    i10++;
                }
                i10--;
            } else if (childAt != null) {
                final int i13 = 1;
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ru
                    public final /* synthetic */ av b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.h(i10);
                                break;
                            default:
                                this.b.h(i10);
                                break;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        wu wuVar = this.F;
        if (wuVar != null) {
            wuVar.setOnClickListener(new g0(this, 12));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.b.setPadding(org.telegram.messenger.g0.L(this.d0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(ArrayList arrayList) {
        int i7;
        int i10;
        wu wuVar;
        boolean z9;
        boolean z10;
        TLRPC.Document document;
        if (this.x) {
            if (!this.c0 || org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).W[5]) {
                this.c0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i11 = this.I;
                int i12 = childCount - i11;
                wu wuVar2 = this.F;
                int i13 = i12 - (wuVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    wu wuVar3 = i14 < i13 ? (wu) this.b.getChildAt(i14 + i11) : null;
                    tw twVar = i14 < arrayList.size() ? (tw) arrayList.get(i14) : null;
                    if (twVar == null) {
                        if (wuVar3 != null) {
                            this.b.removeView(wuVar3);
                        }
                    } else if (twVar.j == 0) {
                        boolean z12 = twVar.e;
                        Long l10 = twVar.a;
                        if (l10 != null) {
                            if (wuVar3 == null) {
                                i7 = i13;
                                wuVar3 = new wu(this, getContext(), twVar.a.longValue());
                                i(wuVar3);
                                this.b.addView(wuVar3, i11 + i14);
                            } else {
                                i7 = i13;
                                wuVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i10 = i11;
                            wuVar = wuVar2;
                            z9 = z11;
                            z10 = true;
                        } else {
                            i7 = i13;
                            TLRPC.StickerSet stickerSet = twVar.b;
                            ArrayList arrayList3 = twVar.c;
                            if (stickerSet == null) {
                                i10 = i11;
                                wuVar = wuVar2;
                                z9 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i15 = 0;
                                    while (i15 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i15);
                                        z9 = z11;
                                        i10 = i11;
                                        wuVar = wuVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z10 = true;
                                            break;
                                        }
                                        i15++;
                                        z11 = z9;
                                        i11 = i10;
                                        wuVar2 = wuVar;
                                    }
                                }
                                i10 = i11;
                                wuVar = wuVar2;
                                z9 = z11;
                                if (arrayList3 != null) {
                                    z10 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (wuVar3 == null) {
                                            wuVar3 = new wu(this, getContext(), document);
                                            i(wuVar3);
                                            this.b.addView(wuVar3, i10 + i14);
                                        } else {
                                            wuVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            wuVar3.setStickerThumb(twVar);
                                        }
                                    }
                                    document = null;
                                    if (wuVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z10 = true;
                            document = null;
                            if (wuVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        wuVar3.a = twVar.i ? Long.valueOf(439488310) : null;
                        wuVar3.g(this.M == i14 ? z10 : false, false);
                        int i16 = this.T;
                        if (i16 == 4) {
                            wuVar3.a((z9 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i16 != 6 && i16 != 5 && i16 != 7) {
                                if (!z9 && !z12) {
                                    wuVar3.a(Boolean.TRUE);
                                } else if (g(twVar)) {
                                    wuVar3.a(null);
                                } else {
                                    wuVar3.a(Boolean.FALSE);
                                }
                            }
                            wuVar3.a(null);
                        }
                        i14++;
                        i13 = i7;
                        z11 = z9;
                        i11 = i10;
                        wuVar2 = wuVar;
                    } else if (wuVar3 == null) {
                        wu wuVar4 = new wu(this, getContext(), twVar.j, false);
                        i(wuVar4);
                        this.b.addView(wuVar4, i11 + i14);
                    } else {
                        wuVar3.setDrawable(getResources().getDrawable(twVar.j).mutate());
                        wuVar3.d();
                        wuVar3.a(null);
                    }
                    i7 = i13;
                    i10 = i11;
                    wuVar = wuVar2;
                    z9 = z11;
                    i14++;
                    i13 = i7;
                    z11 = z9;
                    i11 = i10;
                    wuVar2 = wuVar;
                }
                wu wuVar5 = wuVar2;
                if (wuVar5 != null) {
                    wuVar5.bringToFront();
                    if (wuVar5.getAlpha() < 1.0f) {
                        wuVar5.animate().alpha(1.0f).setDuration(ch.e0.d() ? 0L : 200L).setInterpolator(wq.f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((wu) arrayList2.get(i17)).getClass();
                    ((wu) arrayList2.get(i17)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.S = i7;
    }

    public void setPaddingLeft(float f10) {
        this.d0 = f10;
    }

    public void i(wu wuVar) {
    }

    public void e() {
    }
}
