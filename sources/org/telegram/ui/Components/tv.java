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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class tv extends km0 {
    public static final int[] a0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] b0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final pv A;
    public final pv B;
    public final rv C;
    public final HashMap D;
    public final int E;
    public ValueAnimator F;
    public float G;
    public float H;
    public int I;
    public int J;
    public boolean K;
    public final boolean L;
    public final int M;
    public final Runnable N;
    public int O;
    public final int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int h;
    public final boolean n;
    public boolean r;
    public d6 s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final boolean w;
    public final pv x;
    public final pv y;

    public tv(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.r = true;
        this.D = new HashMap();
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = true;
        this.O = 6;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        this.V = true;
        this.W = 11.0f;
        this.w = z13;
        this.v = c6Var;
        this.N = runnable;
        this.P = i10;
        this.M = i11;
        this.L = z14;
        lv lvVar = new lv(this, context, z13, z14);
        this.b = lvVar;
        lvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            pv pvVar = new pv(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = pvVar;
            linearLayout.addView(pvVar);
            pvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            pv pvVar2 = new pv(this, context, this.h, false);
            this.y = pvVar2;
            linearLayout2.addView(pvVar2);
            pvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            pvVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            pv pvVar3 = new pv(this, context, i12, false);
            this.A = pvVar3;
            linearLayout3.addView(pvVar3);
            pvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            pvVar3.setAlpha(0.0f);
            pvVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i14 = 0;
            while (i14 < 8) {
                pv pvVar4 = new pv(this, context, a0[i14], i14 == 0);
                pvVar4.setContentDescription(f(i14));
                this.b.addView(pvVar4);
                i14++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            rv rvVar = new rv(this, context);
            this.C = rvVar;
            linearLayout4.addView(rvVar);
            rvVar.h = 3552126;
        }
        this.E = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            pv pvVar5 = new pv(this, context, i13, true);
            this.B = pvVar5;
            linearLayout5.addView(pvVar5);
            pvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            pvVar5.a = Long.valueOf(1434631203);
            pvVar5.setAlpha(0.0f);
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

    public boolean g(rx rxVar) {
        return rxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.g6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        int i11;
        int i12 = 1;
        boolean z11 = z10 && !this.V;
        pv pvVar = this.x;
        if (pvVar != null) {
            i10++;
        }
        if (!this.S || pvVar != null) {
            i10 = Math.max(1, i10);
        }
        int i13 = this.I;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i14);
            if (childAt instanceof rv) {
                rv rvVar = (rv) childAt;
                int i16 = i15;
                int i17 = 0;
                while (i17 < rvVar.b.getChildCount()) {
                    View childAt2 = rvVar.b.getChildAt(i17);
                    if (childAt2 instanceof pv) {
                        ((pv) childAt2).g(i10 == i16, z11);
                    }
                    i17++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof pv) {
                    ((pv) childAt).g(i10 == i15, z11);
                }
                i11 = i15;
            }
            if (i10 >= i15 && i10 <= i11) {
                this.I = i14;
            }
            i14++;
            i15 = i11 + 1;
        }
        int i18 = this.I;
        rv rvVar2 = this.C;
        if (i13 != i18) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f9 = this.G;
            float f10 = this.I;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new nh.v9(this, f9, f10, i12));
                this.F.setDuration(350L);
                this.F.setInterpolator(jr.h);
                this.F.start();
            } else {
                this.H = 1.0f;
                this.G = AndroidUtilities.lerp(f9, f10, 1.0f);
                this.b.invalidate();
            }
            if (rvVar2 != null) {
                boolean z12 = this.I == 1 || this.n;
                if (z12 != rvVar2.n) {
                    rvVar2.n = z12;
                    if (!z12) {
                        rvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = rvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(rvVar2.r, z12 ? 1.0f : 0.0f);
                        rvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new j6(rvVar2, 20));
                        rvVar2.c.setDuration(475L);
                        rvVar2.c.setInterpolator(jr.h);
                        rvVar2.c.start();
                    } else {
                        rvVar2.r = z12 ? 1.0f : 0.0f;
                        rvVar2.invalidate();
                        rvVar2.requestLayout();
                        rvVar2.c();
                        rvVar2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.I);
            if (this.I >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.J != i10) {
            if (rvVar2 != null && this.I == 1 && i10 >= 1 && i10 <= rvVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                rvVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.J = i10;
        }
    }

    public final int k() {
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f);
        }
        int i10 = this.P;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.g6.l1(0.09f, this.M) : org.telegram.ui.ActionBar.g6.l1(0.18f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
    }

    public final void l(boolean z10) {
        pv pvVar = this.A;
        if (pvVar != null) {
            boolean z11 = this.T;
            if (z11 || this.U != z10) {
                this.U = z10;
                if (z11) {
                    pvVar.setVisibility(z10 ? 0 : 8);
                    pvVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    pvVar.setVisibility(0);
                    pvVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(jr.h).withEndAction(new hh.f(26, this, z10)).start();
                }
                this.b.requestLayout();
                this.T = false;
            }
        }
    }

    public final void m(boolean z10) {
        pv pvVar = this.y;
        if (pvVar == null) {
            return;
        }
        if (z10) {
            pvVar.setBackground(new sv(k()));
        } else {
            pvVar.setBackground(null);
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
            if (childAt instanceof rv) {
                rv rvVar = (rv) childAt;
                int i12 = 0;
                while (i12 < rvVar.b.getChildCount()) {
                    final int i13 = 0;
                    rvVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                        public final /* synthetic */ tv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                    public final /* synthetic */ tv b;

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
        pv pvVar = this.B;
        if (pvVar != null) {
            pvVar.setOnClickListener(new h0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b.setPadding(AndroidUtilities.dp(this.W), 0, AndroidUtilities.dp(11.0f), 0);
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
        pv pvVar;
        boolean z10;
        TLRPC.Document document;
        if (this.w) {
            if (!this.V || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.V = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i12 = this.E;
                int i13 = childCount - i12;
                pv pvVar2 = this.B;
                int i14 = i13 - (pvVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    pv pvVar3 = i15 < i14 ? (pv) this.b.getChildAt(i15 + i12) : null;
                    rx rxVar = i15 < arrayList.size() ? (rx) arrayList.get(i15) : null;
                    if (rxVar == null) {
                        if (pvVar3 != null) {
                            this.b.removeView(pvVar3);
                        }
                    } else if (rxVar.j == 0) {
                        boolean z12 = rxVar.e;
                        Long l10 = rxVar.a;
                        if (l10 != null) {
                            if (pvVar3 == null) {
                                i10 = i14;
                                pvVar3 = new pv(this, getContext(), rxVar.a.longValue());
                                i(pvVar3);
                                this.b.addView(pvVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                pvVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i11 = i12;
                            pvVar = pvVar2;
                            z10 = z11;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = rxVar.b;
                            ArrayList arrayList3 = rxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                pvVar = pvVar2;
                                z10 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z10 = z11;
                                        i11 = i12;
                                        pvVar = pvVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z11 = z10;
                                        i12 = i11;
                                        pvVar2 = pvVar;
                                    }
                                }
                                i11 = i12;
                                pvVar = pvVar2;
                                z10 = z11;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (pvVar3 == null) {
                                            pvVar3 = new pv(this, getContext(), document);
                                            i(pvVar3);
                                            this.b.addView(pvVar3, i11 + i15);
                                        } else {
                                            pvVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            pvVar3.setStickerThumb(rxVar);
                                        }
                                    }
                                    document = null;
                                    if (pvVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (pvVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        pvVar3.a = rxVar.i ? Long.valueOf(439488310) : null;
                        pvVar3.g(this.I == i15, false);
                        int i17 = this.P;
                        if (i17 == 4) {
                            pvVar3.a((z10 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z10 && !z12) {
                                    pvVar3.a(Boolean.TRUE);
                                } else if (g(rxVar)) {
                                    pvVar3.a(null);
                                } else {
                                    pvVar3.a(Boolean.FALSE);
                                }
                            }
                            pvVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z11 = z10;
                        i12 = i11;
                        pvVar2 = pvVar;
                    } else if (pvVar3 == null) {
                        pv pvVar4 = new pv(this, getContext(), rxVar.j, false);
                        i(pvVar4);
                        this.b.addView(pvVar4, i12 + i15);
                    } else {
                        pvVar3.setDrawable(getResources().getDrawable(rxVar.j).mutate());
                        pvVar3.d();
                        pvVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    pvVar = pvVar2;
                    z10 = z11;
                    i15++;
                    i14 = i10;
                    z11 = z10;
                    i12 = i11;
                    pvVar2 = pvVar;
                }
                pv pvVar5 = pvVar2;
                if (pvVar5 != null) {
                    pvVar5.bringToFront();
                    if (pvVar5.getAlpha() < 1.0f) {
                        pvVar5.animate().alpha(1.0f).setDuration(kg.g0.d() ? 0L : 200L).setInterpolator(jr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((pv) arrayList2.get(i18)).getClass();
                    ((pv) arrayList2.get(i18)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.O = i10;
    }

    public void setPaddingLeft(float f9) {
        this.W = f9;
    }

    public void e() {
    }

    public void i(pv pvVar) {
    }
}
