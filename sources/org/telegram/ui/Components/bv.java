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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class bv extends vk0 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final xu D;
    public final xu E;
    public final xu F;
    public final zu G;
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
    public w5 s;
    public final org.telegram.ui.ActionBar.f6 w;
    public final boolean x;
    public final xu y;

    public bv(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10, boolean z11, boolean z12, int i7, Runnable runnable, int i10, boolean z13) {
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
        this.w = f6Var;
        this.R = runnable;
        this.T = i7;
        this.Q = i10;
        this.P = z13;
        tu tuVar = new tu(this, context, z12, z13);
        this.b = tuVar;
        tuVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.b;
            xu xuVar = new xu(this, context, R.drawable.msg_emoji_stickers, false);
            this.y = xuVar;
            linearLayout.addView(xuVar);
            xuVar.setContentDescription(org.telegram.messenger.id.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i7 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z9) {
            LinearLayout linearLayout2 = this.b;
            xu xuVar2 = new xu(this, context, this.h, false);
            this.D = xuVar2;
            linearLayout2.addView(xuVar2);
            xuVar2.setContentDescription(org.telegram.messenger.id.M0(2131746362, null));
            xuVar2.a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.b;
            xu xuVar3 = new xu(this, context, R.drawable.msg_emoji_gem, false);
            this.E = xuVar3;
            linearLayout3.addView(xuVar3);
            xuVar3.setContentDescription(org.telegram.messenger.id.M0(2131751176, null));
            xuVar3.setAlpha(0.0f);
            xuVar3.a = Long.valueOf(98352451);
        }
        if (!z12) {
            int i11 = 0;
            while (i11 < 8) {
                xu xuVar4 = new xu(this, context, e0[i11], i11 == 0);
                xuVar4.setContentDescription(f(i11));
                this.b.addView(xuVar4);
                i11++;
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.b;
            zu zuVar = new zu(this, context);
            this.G = zuVar;
            linearLayout4.addView(zuVar);
            zuVar.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            xu xuVar5 = new xu(this, context, R.drawable.smiles_tab_settings, true);
            this.F = xuVar5;
            linearLayout5.addView(xuVar5);
            xuVar5.setContentDescription(org.telegram.messenger.id.M0(2131745498, null));
            xuVar5.a = Long.valueOf(1434631203);
            xuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.id.M0(2131751196, null);
            case 1:
                return org.telegram.messenger.id.M0(2131751195, null);
            case 2:
                return org.telegram.messenger.id.M0(2131751194, null);
            case 3:
                return org.telegram.messenger.id.M0(2131751193, null);
            case 4:
                return org.telegram.messenger.id.M0(2131751192, null);
            case 5:
                return org.telegram.messenger.id.M0(2131751191, null);
            case 6:
                return org.telegram.messenger.id.M0(2131751190, null);
            case 7:
                return org.telegram.messenger.id.M0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(uw uwVar) {
        return uwVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.o0(this.w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z9) {
        int i10;
        int i11 = 1;
        boolean z10 = z9 && !this.c0;
        xu xuVar = this.y;
        if (xuVar != null) {
            i7++;
        }
        if (!this.W || xuVar != null) {
            i7 = Math.max(1, i7);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof zu) {
                zu zuVar = (zu) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < zuVar.b.getChildCount()) {
                    View childAt2 = zuVar.b.getChildAt(i15);
                    if (childAt2 instanceof xu) {
                        ((xu) childAt2).g(i7 == i16, z10);
                    }
                    i15++;
                    i16++;
                }
                i10 = i16 - 1;
            } else {
                if (childAt instanceof xu) {
                    ((xu) childAt).g(i7 == i14, z10);
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
        zu zuVar2 = this.G;
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
                ofFloat.addUpdateListener(new fi.l9(this, f10, f11, i11));
                this.J.setDuration(350L);
                this.J.setInterpolator(xq.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (zuVar2 != null) {
                boolean z11 = this.M == 1 || this.n;
                if (z11 != zuVar2.n) {
                    zuVar2.n = z11;
                    if (!z11) {
                        zuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = zuVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(zuVar2.r, z11 ? 1.0f : 0.0f);
                        zuVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new e6(zuVar2, 20));
                        zuVar2.c.setDuration(475L);
                        zuVar2.c.setInterpolator(xq.h);
                        zuVar2.c.start();
                    } else {
                        zuVar2.r = z11 ? 1.0f : 0.0f;
                        zuVar2.invalidate();
                        zuVar2.requestLayout();
                        zuVar2.c();
                        zuVar2.s.b.invalidate();
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
            if (zuVar2 != null && this.M == 1 && i7 >= 1 && i7 <= zuVar2.b.getChildCount() + 1) {
                int i18 = (i7 - 1) * 36;
                zuVar2.b(org.telegram.messenger.g0.L(i18 - 6), org.telegram.messenger.g0.L(i18 + 24));
            }
            this.N = i7;
        }
    }

    public final int k() {
        boolean z9 = this.P;
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        if (z9) {
            return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 12.75f);
        }
        int i7 = this.T;
        return (i7 == 5 || i7 == 7) ? org.telegram.ui.ActionBar.k6.r1(0.09f, this.Q) : org.telegram.ui.ActionBar.k6.r1(0.18f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var));
    }

    public final void l(boolean z9) {
        xu xuVar = this.E;
        if (xuVar != null) {
            boolean z10 = this.a0;
            if (z10 || this.b0 != z9) {
                this.b0 = z9;
                if (z10) {
                    xuVar.setVisibility(z9 ? 0 : 8);
                    xuVar.setAlpha(z9 ? 1.0f : 0.0f);
                } else {
                    xuVar.setVisibility(0);
                    xuVar.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(xq.h).withEndAction(new bi.k1(23, this, z9)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z9) {
        xu xuVar = this.D;
        if (xuVar == null) {
            return;
        }
        if (z9) {
            xuVar.setBackground(new av(k()));
        } else {
            xuVar.setBackground(null);
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
            if (childAt instanceof zu) {
                zu zuVar = (zu) childAt;
                int i11 = 0;
                while (i11 < zuVar.b.getChildCount()) {
                    final int i12 = 0;
                    zuVar.b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.su
                        public final /* synthetic */ bv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.su
                    public final /* synthetic */ bv b;

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
        xu xuVar = this.F;
        if (xuVar != null) {
            xuVar.setOnClickListener(new h0(this, 12));
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
        xu xuVar;
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
                xu xuVar2 = this.F;
                int i13 = i12 - (xuVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    xu xuVar3 = i14 < i13 ? (xu) this.b.getChildAt(i14 + i11) : null;
                    uw uwVar = i14 < arrayList.size() ? (uw) arrayList.get(i14) : null;
                    if (uwVar == null) {
                        if (xuVar3 != null) {
                            this.b.removeView(xuVar3);
                        }
                    } else if (uwVar.j == 0) {
                        boolean z12 = uwVar.e;
                        Long l10 = uwVar.a;
                        if (l10 != null) {
                            if (xuVar3 == null) {
                                i7 = i13;
                                xuVar3 = new xu(this, getContext(), uwVar.a.longValue());
                                i(xuVar3);
                                this.b.addView(xuVar3, i11 + i14);
                            } else {
                                i7 = i13;
                                xuVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i10 = i11;
                            xuVar = xuVar2;
                            z9 = z11;
                            z10 = true;
                        } else {
                            i7 = i13;
                            TLRPC.StickerSet stickerSet = uwVar.b;
                            ArrayList arrayList3 = uwVar.c;
                            if (stickerSet == null) {
                                i10 = i11;
                                xuVar = xuVar2;
                                z9 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i15 = 0;
                                    while (i15 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i15);
                                        z9 = z11;
                                        i10 = i11;
                                        xuVar = xuVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z10 = true;
                                            break;
                                        }
                                        i15++;
                                        z11 = z9;
                                        i11 = i10;
                                        xuVar2 = xuVar;
                                    }
                                }
                                i10 = i11;
                                xuVar = xuVar2;
                                z9 = z11;
                                if (arrayList3 != null) {
                                    z10 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (xuVar3 == null) {
                                            xuVar3 = new xu(this, getContext(), document);
                                            i(xuVar3);
                                            this.b.addView(xuVar3, i10 + i14);
                                        } else {
                                            xuVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            xuVar3.setStickerThumb(uwVar);
                                        }
                                    }
                                    document = null;
                                    if (xuVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z10 = true;
                            document = null;
                            if (xuVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        xuVar3.a = uwVar.i ? Long.valueOf(439488310) : null;
                        xuVar3.g(this.M == i14 ? z10 : false, false);
                        int i16 = this.T;
                        if (i16 == 4) {
                            xuVar3.a((z9 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i16 != 6 && i16 != 5 && i16 != 7) {
                                if (!z9 && !z12) {
                                    xuVar3.a(Boolean.TRUE);
                                } else if (g(uwVar)) {
                                    xuVar3.a(null);
                                } else {
                                    xuVar3.a(Boolean.FALSE);
                                }
                            }
                            xuVar3.a(null);
                        }
                        i14++;
                        i13 = i7;
                        z11 = z9;
                        i11 = i10;
                        xuVar2 = xuVar;
                    } else if (xuVar3 == null) {
                        xu xuVar4 = new xu(this, getContext(), uwVar.j, false);
                        i(xuVar4);
                        this.b.addView(xuVar4, i11 + i14);
                    } else {
                        xuVar3.setDrawable(getResources().getDrawable(uwVar.j).mutate());
                        xuVar3.d();
                        xuVar3.a(null);
                    }
                    i7 = i13;
                    i10 = i11;
                    xuVar = xuVar2;
                    z9 = z11;
                    i14++;
                    i13 = i7;
                    z11 = z9;
                    i11 = i10;
                    xuVar2 = xuVar;
                }
                xu xuVar5 = xuVar2;
                if (xuVar5 != null) {
                    xuVar5.bringToFront();
                    if (xuVar5.getAlpha() < 1.0f) {
                        xuVar5.animate().alpha(1.0f).setDuration(ch.e0.d() ? 0L : 200L).setInterpolator(xq.f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((xu) arrayList2.get(i17)).getClass();
                    ((xu) arrayList2.get(i17)).c();
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

    public void i(xu xuVar) {
    }

    public void e() {
    }
}
