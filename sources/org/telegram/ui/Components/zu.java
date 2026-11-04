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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class zu extends zk0 {
    public static final int[] f0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] g0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final vu E;
    public final vu F;
    public final vu G;
    public final xu H;
    public final HashMap I;
    public final int J;
    public ValueAnimator K;
    public float L;
    public float M;
    public int N;
    public int O;
    public boolean P;
    public final boolean Q;
    public final int R;
    public final Runnable S;
    public int T;
    public final int U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public float e0;
    public final int h;
    public final boolean n;
    public boolean r;
    public u5 s;
    public final org.telegram.ui.ActionBar.e6 w;
    public final boolean x;
    public final vu y;

    public zu(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i3, Runnable runnable, int i10, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        this.n = !org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q();
        this.r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = true;
        this.e0 = 11.0f;
        this.x = z13;
        this.w = e6Var;
        this.S = runnable;
        this.U = i3;
        this.R = i10;
        this.Q = z14;
        ru ruVar = new ru(this, context, z13, z14);
        this.b = ruVar;
        ruVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i3 == 4) {
            LinearLayout linearLayout = this.b;
            vu vuVar = new vu(this, context, R.drawable.msg_emoji_stickers, false);
            this.y = vuVar;
            linearLayout.addView(vuVar);
            vuVar.setContentDescription(org.telegram.messenger.bd.M0(2131754756, null));
        }
        if (i3 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i3 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            vu vuVar2 = new vu(this, context, this.h, false);
            this.E = vuVar2;
            linearLayout2.addView(vuVar2);
            vuVar2.setContentDescription(org.telegram.messenger.bd.M0(2131746369, null));
            vuVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            vu vuVar3 = new vu(this, context, R.drawable.msg_emoji_gem, false);
            this.F = vuVar3;
            linearLayout3.addView(vuVar3);
            vuVar3.setContentDescription(org.telegram.messenger.bd.M0(2131751176, null));
            vuVar3.setAlpha(0.0f);
            vuVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i11 = 0;
            while (i11 < 8) {
                vu vuVar4 = new vu(this, context, f0[i11], i11 == 0);
                vuVar4.setContentDescription(f(i11));
                this.b.addView(vuVar4);
                i11++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            xu xuVar = new xu(this, context);
            this.H = xuVar;
            linearLayout4.addView(xuVar);
            xuVar.h = 3552126;
        }
        this.J = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            vu vuVar5 = new vu(this, context, R.drawable.smiles_tab_settings, true);
            this.G = vuVar5;
            linearLayout5.addView(vuVar5);
            vuVar5.setContentDescription(org.telegram.messenger.bd.M0(2131745505, null));
            vuVar5.a = Long.valueOf(1434631203);
            vuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i3) {
        switch (i3) {
            case 0:
                return org.telegram.messenger.bd.M0(2131751196, null);
            case 1:
                return org.telegram.messenger.bd.M0(2131751195, null);
            case 2:
                return org.telegram.messenger.bd.M0(2131751194, null);
            case 3:
                return org.telegram.messenger.bd.M0(2131751193, null);
            case 4:
                return org.telegram.messenger.bd.M0(2131751192, null);
            case 5:
                return org.telegram.messenger.bd.M0(2131751191, null);
            case 6:
                return org.telegram.messenger.bd.M0(2131751190, null);
            case 7:
                return org.telegram.messenger.bd.M0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(sw swVar) {
        return swVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.o0(this.w);
    }

    public abstract boolean h(int i3);

    public final void j(int i3, boolean z10) {
        int i10;
        int i11 = 1;
        boolean z11 = z10 && !this.d0;
        vu vuVar = this.y;
        if (vuVar != null) {
            i3++;
        }
        if (!this.a0 || vuVar != null) {
            i3 = Math.max(1, i3);
        }
        int i12 = this.N;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof xu) {
                xu xuVar = (xu) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < xuVar.b.getChildCount()) {
                    View childAt2 = xuVar.b.getChildAt(i15);
                    if (childAt2 instanceof vu) {
                        ((vu) childAt2).g(i3 == i16, z11);
                    }
                    i15++;
                    i16++;
                }
                i10 = i16 - 1;
            } else {
                if (childAt instanceof vu) {
                    ((vu) childAt).g(i3 == i14, z11);
                }
                i10 = i14;
            }
            if (i3 >= i14 && i3 <= i10) {
                this.N = i13;
            }
            i13++;
            i14 = i10 + 1;
        }
        int i17 = this.N;
        xu xuVar2 = this.H;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.L;
            float f11 = this.N;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new gi.l9(this, f10, f11, i11));
                this.K.setDuration(350L);
                this.K.setInterpolator(xq.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (xuVar2 != null) {
                boolean z12 = this.N == 1 || this.n;
                if (z12 != xuVar2.n) {
                    xuVar2.n = z12;
                    if (!z12) {
                        xuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = xuVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xuVar2.r, z12 ? 1.0f : 0.0f);
                        xuVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(xuVar2, 20));
                        xuVar2.c.setDuration(475L);
                        xuVar2.c.setInterpolator(xq.h);
                        xuVar2.c.start();
                    } else {
                        xuVar2.r = z12 ? 1.0f : 0.0f;
                        xuVar2.invalidate();
                        xuVar2.requestLayout();
                        xuVar2.c();
                        xuVar2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i3) {
            if (xuVar2 != null && this.N == 1 && i3 >= 1 && i3 <= xuVar2.b.getChildCount() + 1) {
                int i18 = (i3 - 1) * 36;
                xuVar2.b(org.telegram.messenger.g0.L(i18 - 6), org.telegram.messenger.g0.L(i18 + 24));
            }
            this.O = i3;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.e6 e6Var = this.w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f);
        }
        int i3 = this.U;
        return (i3 == 5 || i3 == 7) ? org.telegram.ui.ActionBar.k6.r1(0.09f, this.R) : org.telegram.ui.ActionBar.k6.r1(0.18f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var));
    }

    public final void l(boolean z10) {
        vu vuVar = this.F;
        if (vuVar != null) {
            boolean z11 = this.b0;
            if (z11 || this.c0 != z10) {
                this.c0 = z10;
                if (z11) {
                    vuVar.setVisibility(z10 ? 0 : 8);
                    vuVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    vuVar.setVisibility(0);
                    vuVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(xq.h).withEndAction(new ci.e1(23, this, z10)).start();
                }
                this.b.requestLayout();
                this.b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        vu vuVar = this.E;
        if (vuVar == null) {
            return;
        }
        if (z10) {
            vuVar.setBackground(new yu(k()));
        } else {
            vuVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.r = z10;
        this.b.invalidate();
    }

    public final void o() {
        int i3 = 0;
        final int i10 = 0;
        while (i3 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i3);
            if (childAt instanceof xu) {
                xu xuVar = (xu) childAt;
                int i11 = 0;
                while (i11 < xuVar.b.getChildCount()) {
                    final int i12 = 0;
                    xuVar.b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                        public final /* synthetic */ zu b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                    public final /* synthetic */ zu b;

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
            i3++;
            i10++;
        }
        vu vuVar = this.G;
        if (vuVar != null) {
            vuVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.b.setPadding(org.telegram.messenger.g0.L(this.e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(ArrayList arrayList) {
        int i3;
        int i10;
        vu vuVar;
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        if (this.x) {
            if (!this.d0 || org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).X[5]) {
                this.d0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i11 = this.J;
                int i12 = childCount - i11;
                vu vuVar2 = this.G;
                int i13 = i12 - (vuVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z12 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    vu vuVar3 = i14 < i13 ? (vu) this.b.getChildAt(i14 + i11) : null;
                    sw swVar = i14 < arrayList.size() ? (sw) arrayList.get(i14) : null;
                    if (swVar == null) {
                        if (vuVar3 != null) {
                            this.b.removeView(vuVar3);
                        }
                    } else if (swVar.j == 0) {
                        boolean z13 = swVar.e;
                        Long l10 = swVar.a;
                        if (l10 != null) {
                            if (vuVar3 == null) {
                                i3 = i13;
                                vuVar3 = new vu(this, getContext(), swVar.a.longValue());
                                i(vuVar3);
                                this.b.addView(vuVar3, i11 + i14);
                            } else {
                                i3 = i13;
                                vuVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i10 = i11;
                            vuVar = vuVar2;
                            z10 = z12;
                            z11 = true;
                        } else {
                            i3 = i13;
                            TLRPC.StickerSet stickerSet = swVar.b;
                            ArrayList arrayList3 = swVar.c;
                            if (stickerSet == null) {
                                i10 = i11;
                                vuVar = vuVar2;
                                z10 = z12;
                            } else {
                                if (arrayList3 != null) {
                                    int i15 = 0;
                                    while (i15 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i15);
                                        z10 = z12;
                                        i10 = i11;
                                        vuVar = vuVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z11 = true;
                                            break;
                                        }
                                        i15++;
                                        z12 = z10;
                                        i11 = i10;
                                        vuVar2 = vuVar;
                                    }
                                }
                                i10 = i11;
                                vuVar = vuVar2;
                                z10 = z12;
                                if (arrayList3 != null) {
                                    z11 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (vuVar3 == null) {
                                            vuVar3 = new vu(this, getContext(), document);
                                            i(vuVar3);
                                            this.b.addView(vuVar3, i10 + i14);
                                        } else {
                                            vuVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            vuVar3.setStickerThumb(swVar);
                                        }
                                    }
                                    document = null;
                                    if (vuVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z11 = true;
                            document = null;
                            if (vuVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        vuVar3.a = swVar.i ? Long.valueOf(439488310) : null;
                        vuVar3.g(this.N == i14 ? z11 : false, false);
                        int i16 = this.U;
                        if (i16 == 4) {
                            vuVar3.a((z10 || z13) ? null : Boolean.TRUE);
                        } else {
                            if (i16 != 6 && i16 != 5 && i16 != 7) {
                                if (!z10 && !z13) {
                                    vuVar3.a(Boolean.TRUE);
                                } else if (g(swVar)) {
                                    vuVar3.a(null);
                                } else {
                                    vuVar3.a(Boolean.FALSE);
                                }
                            }
                            vuVar3.a(null);
                        }
                        i14++;
                        i13 = i3;
                        z12 = z10;
                        i11 = i10;
                        vuVar2 = vuVar;
                    } else if (vuVar3 == null) {
                        vu vuVar4 = new vu(this, getContext(), swVar.j, false);
                        i(vuVar4);
                        this.b.addView(vuVar4, i11 + i14);
                    } else {
                        vuVar3.setDrawable(getResources().getDrawable(swVar.j).mutate());
                        vuVar3.d();
                        vuVar3.a(null);
                    }
                    i3 = i13;
                    i10 = i11;
                    vuVar = vuVar2;
                    z10 = z12;
                    i14++;
                    i13 = i3;
                    z12 = z10;
                    i11 = i10;
                    vuVar2 = vuVar;
                }
                vu vuVar5 = vuVar2;
                if (vuVar5 != null) {
                    vuVar5.bringToFront();
                    if (vuVar5.getAlpha() < 1.0f) {
                        vuVar5.animate().alpha(1.0f).setDuration(dh.d0.d() ? 0L : 200L).setInterpolator(xq.f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((vu) arrayList2.get(i17)).getClass();
                    ((vu) arrayList2.get(i17)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i3) {
        this.T = i3;
    }

    public void setPaddingLeft(float f10) {
        this.e0 = f10;
    }

    public void i(vu vuVar) {
    }

    public void e() {
    }
}
