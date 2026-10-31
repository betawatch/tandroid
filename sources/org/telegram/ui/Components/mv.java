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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class mv extends yl0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final iv D;
    public final iv E;
    public final iv F;
    public final kv G;
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
    public t5 s;
    public final org.telegram.ui.ActionBar.p6 w;
    public final boolean x;
    public final iv y;

    public mv(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        this.n = !org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q();
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
        this.x = z13;
        this.w = p6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        ev evVar = new ev(this, context, z13, z14);
        this.b = evVar;
        evVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            iv ivVar = new iv(this, context, R.drawable.msg_emoji_stickers, false);
            this.y = ivVar;
            linearLayout.addView(ivVar);
            ivVar.setContentDescription(org.telegram.messenger.cd.L0(2131754756, null));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            iv ivVar2 = new iv(this, context, this.h, false);
            this.D = ivVar2;
            linearLayout2.addView(ivVar2);
            ivVar2.setContentDescription(org.telegram.messenger.cd.L0(2131746376, null));
            ivVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            iv ivVar3 = new iv(this, context, R.drawable.msg_emoji_gem, false);
            this.E = ivVar3;
            linearLayout3.addView(ivVar3);
            ivVar3.setContentDescription(org.telegram.messenger.cd.L0(2131751176, null));
            ivVar3.setAlpha(0.0f);
            ivVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i12 = 0;
            while (i12 < 8) {
                iv ivVar4 = new iv(this, context, e0[i12], i12 == 0);
                ivVar4.setContentDescription(f(i12));
                this.b.addView(ivVar4);
                i12++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            kv kvVar = new kv(this, context);
            this.G = kvVar;
            linearLayout4.addView(kvVar);
            kvVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            iv ivVar5 = new iv(this, context, R.drawable.smiles_tab_settings, true);
            this.F = ivVar5;
            linearLayout5.addView(ivVar5);
            ivVar5.setContentDescription(org.telegram.messenger.cd.L0(2131745512, null));
            ivVar5.a = Long.valueOf(1434631203);
            ivVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i10) {
        switch (i10) {
            case 0:
                return org.telegram.messenger.cd.L0(2131751196, null);
            case 1:
                return org.telegram.messenger.cd.L0(2131751195, null);
            case 2:
                return org.telegram.messenger.cd.L0(2131751194, null);
            case 3:
                return org.telegram.messenger.cd.L0(2131751193, null);
            case 4:
                return org.telegram.messenger.cd.L0(2131751192, null);
            case 5:
                return org.telegram.messenger.cd.L0(2131751191, null);
            case 6:
                return org.telegram.messenger.cd.L0(2131751190, null);
            case 7:
                return org.telegram.messenger.cd.L0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(ix ixVar) {
        return ixVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.t6.o0(this.w);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        boolean z11 = z10 && !this.c0;
        iv ivVar = this.y;
        if (ivVar != null) {
            i10++;
        }
        if (!this.W || ivVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < kvVar.b.getChildCount()) {
                    View childAt2 = kvVar.b.getChildAt(i15);
                    if (childAt2 instanceof iv) {
                        ((iv) childAt2).g(i10 == i16, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof iv) {
                    ((iv) childAt).g(i10 == i14, z11);
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
        kv kvVar2 = this.G;
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
                ofFloat.addUpdateListener(new fe.c(this, f7, f10, i18));
                this.J.setDuration(350L);
                this.J.setInterpolator(gr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.i0.T1(f7, f10, 1.0f);
                this.b.invalidate();
            }
            if (kvVar2 != null) {
                boolean z12 = this.M == 1 || this.n;
                if (z12 != kvVar2.n) {
                    kvVar2.n = z12;
                    if (!z12) {
                        kvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = kvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(kvVar2.r, z12 ? 1.0f : 0.0f);
                        kvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new a6(kvVar2, 20));
                        kvVar2.c.setDuration(475L);
                        kvVar2.c.setInterpolator(gr.h);
                        kvVar2.c.start();
                    } else {
                        kvVar2.r = z12 ? 1.0f : 0.0f;
                        kvVar2.invalidate();
                        kvVar2.requestLayout();
                        kvVar2.c();
                        kvVar2.s.b.invalidate();
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
            if (kvVar2 != null && this.M == 1 && i10 >= 1 && i10 <= kvVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                kvVar2.b(org.telegram.messenger.i0.L(i19 - 6), org.telegram.messenger.i0.L(i19 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.p6 p6Var = this.w;
        if (z10) {
            return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f);
        }
        int i10 = this.T;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.t6.r1(0.09f, this.Q) : org.telegram.ui.ActionBar.t6.r1(0.18f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var));
    }

    public final void l(boolean z10) {
        iv ivVar = this.E;
        if (ivVar != null) {
            boolean z11 = this.a0;
            if (z11 || this.b0 != z10) {
                this.b0 = z10;
                if (z11) {
                    ivVar.setVisibility(z10 ? 0 : 8);
                    ivVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    ivVar.setVisibility(0);
                    ivVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(gr.h).withEndAction(new k2.v(13, this, z10)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        iv ivVar = this.D;
        if (ivVar == null) {
            return;
        }
        if (z10) {
            ivVar.setBackground(new lv(k()));
        } else {
            ivVar.setBackground(null);
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
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i12 = 0;
                while (i12 < kvVar.b.getChildCount()) {
                    final int i13 = 0;
                    kvVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                        public final /* synthetic */ mv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                    public final /* synthetic */ mv b;

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
        iv ivVar = this.F;
        if (ivVar != null) {
            ivVar.setOnClickListener(new h0(this, 11));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b.setPadding(org.telegram.messenger.i0.L(this.d0), 0, org.telegram.messenger.i0.L(11.0f), 0);
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
        iv ivVar;
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        if (this.x) {
            if (!this.c0 || org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).W[5]) {
                this.c0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i12 = this.I;
                int i13 = childCount - i12;
                iv ivVar2 = this.F;
                int i14 = i13 - (ivVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z12 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    iv ivVar3 = i15 < i14 ? (iv) this.b.getChildAt(i15 + i12) : null;
                    ix ixVar = i15 < arrayList.size() ? (ix) arrayList.get(i15) : null;
                    if (ixVar == null) {
                        if (ivVar3 != null) {
                            this.b.removeView(ivVar3);
                        }
                    } else if (ixVar.j == 0) {
                        boolean z13 = ixVar.e;
                        Long l4 = ixVar.a;
                        if (l4 != null) {
                            if (ivVar3 == null) {
                                i10 = i14;
                                ivVar3 = new iv(this, getContext(), ixVar.a.longValue());
                                i(ivVar3);
                                this.b.addView(ivVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                ivVar3.setAnimatedEmojiDocumentId(l4.longValue());
                            }
                            i11 = i12;
                            ivVar = ivVar2;
                            z10 = z12;
                            z11 = true;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = ixVar.b;
                            ArrayList arrayList3 = ixVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                ivVar = ivVar2;
                                z10 = z12;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z12;
                                        i11 = i12;
                                        ivVar = ivVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z11 = true;
                                            break;
                                        }
                                        i16++;
                                        z12 = z10;
                                        i12 = i11;
                                        ivVar2 = ivVar;
                                    }
                                }
                                i11 = i12;
                                ivVar = ivVar2;
                                z10 = z12;
                                if (arrayList3 != null) {
                                    z11 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (ivVar3 == null) {
                                            ivVar3 = new iv(this, getContext(), document);
                                            i(ivVar3);
                                            this.b.addView(ivVar3, i11 + i15);
                                        } else {
                                            ivVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            ivVar3.setStickerThumb(ixVar);
                                        }
                                    }
                                    document = null;
                                    if (ivVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z11 = true;
                            document = null;
                            if (ivVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        ivVar3.a = ixVar.i ? Long.valueOf(439488310) : null;
                        ivVar3.g(this.M == i15 ? z11 : false, false);
                        int i17 = this.T;
                        if (i17 == 4) {
                            ivVar3.a((z10 || z13) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z13) {
                                    ivVar3.a(Boolean.TRUE);
                                } else if (g(ixVar)) {
                                    ivVar3.a(null);
                                } else {
                                    ivVar3.a(Boolean.FALSE);
                                }
                            }
                            ivVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z12 = z10;
                        i12 = i11;
                        ivVar2 = ivVar;
                    } else if (ivVar3 == null) {
                        iv ivVar4 = new iv(this, getContext(), ixVar.j, false);
                        i(ivVar4);
                        this.b.addView(ivVar4, i12 + i15);
                    } else {
                        ivVar3.setDrawable(getResources().getDrawable(ixVar.j).mutate());
                        ivVar3.d();
                        ivVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    ivVar = ivVar2;
                    z10 = z12;
                    i15++;
                    i14 = i10;
                    z12 = z10;
                    i12 = i11;
                    ivVar2 = ivVar;
                }
                iv ivVar5 = ivVar2;
                if (ivVar5 != null) {
                    ivVar5.bringToFront();
                    if (ivVar5.getAlpha() < 1.0f) {
                        ivVar5.animate().alpha(1.0f).setDuration(sg.e0.d() ? 0L : 200L).setInterpolator(gr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((iv) arrayList2.get(i18)).getClass();
                    ((iv) arrayList2.get(i18)).c();
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

    public void i(iv ivVar) {
    }

    public void e() {
    }
}
