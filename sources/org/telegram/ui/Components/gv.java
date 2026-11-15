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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class gv extends al0 {
    public static final int[] f0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] g0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final cv E;
    public final cv F;
    public final cv G;
    public final ev H;
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
    public final cv y;

    public gv(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Runnable runnable, int i10, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        this.n = !org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q();
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
        this.U = i7;
        this.R = i10;
        this.Q = z14;
        yu yuVar = new yu(this, context, z13, z14);
        this.b = yuVar;
        yuVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.b;
            cv cvVar = new cv(this, context, R.drawable.msg_emoji_stickers, false);
            this.y = cvVar;
            linearLayout.addView(cvVar);
            cvVar.setContentDescription(org.telegram.messenger.hd.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i7 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            cv cvVar2 = new cv(this, context, this.h, false);
            this.E = cvVar2;
            linearLayout2.addView(cvVar2);
            cvVar2.setContentDescription(org.telegram.messenger.hd.M0(2131746361, null));
            cvVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            cv cvVar3 = new cv(this, context, R.drawable.msg_emoji_gem, false);
            this.F = cvVar3;
            linearLayout3.addView(cvVar3);
            cvVar3.setContentDescription(org.telegram.messenger.hd.M0(2131751175, null));
            cvVar3.setAlpha(0.0f);
            cvVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i11 = 0;
            while (i11 < 8) {
                cv cvVar4 = new cv(this, context, f0[i11], i11 == 0);
                cvVar4.setContentDescription(f(i11));
                this.b.addView(cvVar4);
                i11++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            ev evVar = new ev(this, context);
            this.H = evVar;
            linearLayout4.addView(evVar);
            evVar.h = 3552126;
        }
        this.J = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            cv cvVar5 = new cv(this, context, R.drawable.smiles_tab_settings, true);
            this.G = cvVar5;
            linearLayout5.addView(cvVar5);
            cvVar5.setContentDescription(org.telegram.messenger.hd.M0(2131745495, null));
            cvVar5.a = Long.valueOf(1434631203);
            cvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.hd.M0(2131751195, null);
            case 1:
                return org.telegram.messenger.hd.M0(2131751194, null);
            case 2:
                return org.telegram.messenger.hd.M0(2131751193, null);
            case 3:
                return org.telegram.messenger.hd.M0(2131751192, null);
            case 4:
                return org.telegram.messenger.hd.M0(2131751191, null);
            case 5:
                return org.telegram.messenger.hd.M0(2131751190, null);
            case 6:
                return org.telegram.messenger.hd.M0(2131751189, null);
            case 7:
                return org.telegram.messenger.hd.M0(2131751188, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(zw zwVar) {
        return zwVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.o0(this.w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z10) {
        int i10;
        int i11 = 1;
        boolean z11 = z10 && !this.d0;
        cv cvVar = this.y;
        if (cvVar != null) {
            i7++;
        }
        if (!this.a0 || cvVar != null) {
            i7 = Math.max(1, i7);
        }
        int i12 = this.N;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof ev) {
                ev evVar = (ev) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < evVar.b.getChildCount()) {
                    View childAt2 = evVar.b.getChildAt(i15);
                    if (childAt2 instanceof cv) {
                        ((cv) childAt2).g(i7 == i16, z11);
                    }
                    i15++;
                    i16++;
                }
                i10 = i16 - 1;
            } else {
                if (childAt instanceof cv) {
                    ((cv) childAt).g(i7 == i14, z11);
                }
                i10 = i14;
            }
            if (i7 >= i14 && i7 <= i10) {
                this.N = i13;
            }
            i13++;
            i14 = i10 + 1;
        }
        int i17 = this.N;
        ev evVar2 = this.H;
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
                ofFloat.addUpdateListener(new hi.i9(this, f10, f11, i11));
                this.K.setDuration(350L);
                this.K.setInterpolator(er.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (evVar2 != null) {
                boolean z12 = this.N == 1 || this.n;
                if (z12 != evVar2.n) {
                    evVar2.n = z12;
                    if (!z12) {
                        evVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = evVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(evVar2.r, z12 ? 1.0f : 0.0f);
                        evVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(evVar2, 20));
                        evVar2.c.setDuration(475L);
                        evVar2.c.setInterpolator(er.h);
                        evVar2.c.start();
                    } else {
                        evVar2.r = z12 ? 1.0f : 0.0f;
                        evVar2.invalidate();
                        evVar2.requestLayout();
                        evVar2.c();
                        evVar2.s.b.invalidate();
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
        if (this.O != i7) {
            if (evVar2 != null && this.N == 1 && i7 >= 1 && i7 <= evVar2.b.getChildCount() + 1) {
                int i18 = (i7 - 1) * 36;
                evVar2.b(org.telegram.messenger.g0.L(i18 - 6), org.telegram.messenger.g0.L(i18 + 24));
            }
            this.O = i7;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.e6 e6Var = this.w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var), (int) 12.75f);
        }
        int i7 = this.U;
        return (i7 == 5 || i7 == 7) ? org.telegram.ui.ActionBar.j6.r1(0.09f, this.R) : org.telegram.ui.ActionBar.j6.r1(0.18f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, e6Var));
    }

    public final void l(boolean z10) {
        cv cvVar = this.F;
        if (cvVar != null) {
            boolean z11 = this.b0;
            if (z11 || this.c0 != z10) {
                this.c0 = z10;
                if (z11) {
                    cvVar.setVisibility(z10 ? 0 : 8);
                    cvVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    cvVar.setVisibility(0);
                    cvVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(er.h).withEndAction(new ai.q(24, this, z10)).start();
                }
                this.b.requestLayout();
                this.b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        cv cvVar = this.E;
        if (cvVar == null) {
            return;
        }
        if (z10) {
            cvVar.setBackground(new fv(k()));
        } else {
            cvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.r = z10;
        this.b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof ev) {
                ev evVar = (ev) childAt;
                int i11 = 0;
                while (i11 < evVar.b.getChildCount()) {
                    final int i12 = 0;
                    evVar.b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xu
                        public final /* synthetic */ gv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xu
                    public final /* synthetic */ gv b;

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
        cv cvVar = this.G;
        if (cvVar != null) {
            cvVar.setOnClickListener(new e0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.b.setPadding(org.telegram.messenger.g0.L(this.e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
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
        cv cvVar;
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        if (this.x) {
            if (!this.d0 || org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).X[5]) {
                this.d0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i11 = this.J;
                int i12 = childCount - i11;
                cv cvVar2 = this.G;
                int i13 = i12 - (cvVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z12 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    cv cvVar3 = i14 < i13 ? (cv) this.b.getChildAt(i14 + i11) : null;
                    zw zwVar = i14 < arrayList.size() ? (zw) arrayList.get(i14) : null;
                    if (zwVar == null) {
                        if (cvVar3 != null) {
                            this.b.removeView(cvVar3);
                        }
                    } else if (zwVar.j == 0) {
                        boolean z13 = zwVar.e;
                        Long l10 = zwVar.a;
                        if (l10 != null) {
                            if (cvVar3 == null) {
                                i7 = i13;
                                cvVar3 = new cv(this, getContext(), zwVar.a.longValue());
                                i(cvVar3);
                                this.b.addView(cvVar3, i11 + i14);
                            } else {
                                i7 = i13;
                                cvVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i10 = i11;
                            cvVar = cvVar2;
                            z10 = z12;
                            z11 = true;
                        } else {
                            i7 = i13;
                            TLRPC.StickerSet stickerSet = zwVar.b;
                            ArrayList arrayList3 = zwVar.c;
                            if (stickerSet == null) {
                                i10 = i11;
                                cvVar = cvVar2;
                                z10 = z12;
                            } else {
                                if (arrayList3 != null) {
                                    int i15 = 0;
                                    while (i15 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i15);
                                        z10 = z12;
                                        i10 = i11;
                                        cvVar = cvVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z11 = true;
                                            break;
                                        }
                                        i15++;
                                        z12 = z10;
                                        i11 = i10;
                                        cvVar2 = cvVar;
                                    }
                                }
                                i10 = i11;
                                cvVar = cvVar2;
                                z10 = z12;
                                if (arrayList3 != null) {
                                    z11 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (cvVar3 == null) {
                                            cvVar3 = new cv(this, getContext(), document);
                                            i(cvVar3);
                                            this.b.addView(cvVar3, i10 + i14);
                                        } else {
                                            cvVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            cvVar3.setStickerThumb(zwVar);
                                        }
                                    }
                                    document = null;
                                    if (cvVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z11 = true;
                            document = null;
                            if (cvVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        cvVar3.a = zwVar.i ? Long.valueOf(439488310) : null;
                        cvVar3.g(this.N == i14 ? z11 : false, false);
                        int i16 = this.U;
                        if (i16 == 4) {
                            cvVar3.a((z10 || z13) ? null : Boolean.TRUE);
                        } else {
                            if (i16 != 6 && i16 != 5 && i16 != 7) {
                                if (!z10 && !z13) {
                                    cvVar3.a(Boolean.TRUE);
                                } else if (g(zwVar)) {
                                    cvVar3.a(null);
                                } else {
                                    cvVar3.a(Boolean.FALSE);
                                }
                            }
                            cvVar3.a(null);
                        }
                        i14++;
                        i13 = i7;
                        z12 = z10;
                        i11 = i10;
                        cvVar2 = cvVar;
                    } else if (cvVar3 == null) {
                        cv cvVar4 = new cv(this, getContext(), zwVar.j, false);
                        i(cvVar4);
                        this.b.addView(cvVar4, i11 + i14);
                    } else {
                        cvVar3.setDrawable(getResources().getDrawable(zwVar.j).mutate());
                        cvVar3.d();
                        cvVar3.a(null);
                    }
                    i7 = i13;
                    i10 = i11;
                    cvVar = cvVar2;
                    z10 = z12;
                    i14++;
                    i13 = i7;
                    z12 = z10;
                    i11 = i10;
                    cvVar2 = cvVar;
                }
                cv cvVar5 = cvVar2;
                if (cvVar5 != null) {
                    cvVar5.bringToFront();
                    if (cvVar5.getAlpha() < 1.0f) {
                        cvVar5.animate().alpha(1.0f).setDuration(ch.f0.d() ? 0L : 200L).setInterpolator(er.f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((cv) arrayList2.get(i17)).getClass();
                    ((cv) arrayList2.get(i17)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.T = i7;
    }

    public void setPaddingLeft(float f10) {
        this.e0 = f10;
    }

    public void i(cv cvVar) {
    }

    public void e() {
    }
}
