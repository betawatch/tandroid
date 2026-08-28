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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class nv extends xl0 {
    public static final int[] a0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] b0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final jv A;
    public final jv B;
    public final lv C;
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
    public y5 s;
    public final org.telegram.ui.ActionBar.b6 v;
    public final boolean w;
    public final jv x;
    public final jv y;

    public nv(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i9, Runnable runnable, int i10, boolean z14) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i11 = R.drawable.msg_emoji_gem;
        int i12 = R.drawable.smiles_tab_settings;
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
        this.v = b6Var;
        this.N = runnable;
        this.P = i9;
        this.M = i10;
        this.L = z14;
        fv fvVar = new fv(this, context, z13, z14);
        this.b = fvVar;
        fvVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i9 == 4) {
            LinearLayout linearLayout = this.b;
            jv jvVar = new jv(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = jvVar;
            linearLayout.addView(jvVar);
            jvVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i9 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i9 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.b;
            jv jvVar2 = new jv(this, context, this.h, false);
            this.y = jvVar2;
            linearLayout2.addView(jvVar2);
            jvVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            jvVar2.a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.b;
            jv jvVar3 = new jv(this, context, i11, false);
            this.A = jvVar3;
            linearLayout3.addView(jvVar3);
            jvVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            jvVar3.setAlpha(0.0f);
            jvVar3.a = Long.valueOf(98352451);
        }
        if (!z13) {
            int i13 = 0;
            while (i13 < 8) {
                jv jvVar4 = new jv(this, context, a0[i13], i13 == 0);
                jvVar4.setContentDescription(f(i13));
                this.b.addView(jvVar4);
                i13++;
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.b;
            lv lvVar = new lv(this, context);
            this.C = lvVar;
            linearLayout4.addView(lvVar);
            lvVar.h = 3552126;
        }
        this.E = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            jv jvVar5 = new jv(this, context, i12, true);
            this.B = jvVar5;
            linearLayout5.addView(jvVar5);
            jvVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            jvVar5.a = Long.valueOf(1434631203);
            jvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i9) {
        switch (i9) {
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

    public boolean g(jx jxVar) {
        return jxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.f6.n0(this.v);
    }

    public abstract boolean h(int i9);

    public final void j(int i9, boolean z10) {
        int i10;
        int i11 = 1;
        boolean z11 = z10 && !this.V;
        jv jvVar = this.x;
        if (jvVar != null) {
            i9++;
        }
        if (!this.S || jvVar != null) {
            i9 = Math.max(1, i9);
        }
        int i12 = this.I;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i13);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i15 = i14;
                int i16 = 0;
                while (i16 < lvVar.b.getChildCount()) {
                    View childAt2 = lvVar.b.getChildAt(i16);
                    if (childAt2 instanceof jv) {
                        ((jv) childAt2).g(i9 == i15, z11);
                    }
                    i16++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof jv) {
                    ((jv) childAt).g(i9 == i14, z11);
                }
                i10 = i14;
            }
            if (i9 >= i14 && i9 <= i10) {
                this.I = i13;
            }
            i13++;
            i14 = i10 + 1;
        }
        int i17 = this.I;
        lv lvVar2 = this.C;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.G;
            float f11 = this.I;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new kh.ka(this, f10, f11, i11));
                this.F.setDuration(350L);
                this.F.setInterpolator(gr.h);
                this.F.start();
            } else {
                this.H = 1.0f;
                this.G = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (lvVar2 != null) {
                boolean z12 = this.I == 1 || this.n;
                if (z12 != lvVar2.n) {
                    lvVar2.n = z12;
                    if (!z12) {
                        lvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = lvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lvVar2.r, z12 ? 1.0f : 0.0f);
                        lvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new e6(lvVar2, 20));
                        lvVar2.c.setDuration(475L);
                        lvVar2.c.setInterpolator(gr.h);
                        lvVar2.c.start();
                    } else {
                        lvVar2.r = z12 ? 1.0f : 0.0f;
                        lvVar2.invalidate();
                        lvVar2.requestLayout();
                        lvVar2.c();
                        lvVar2.s.b.invalidate();
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
        if (this.J != i9) {
            if (lvVar2 != null && this.I == 1 && i9 >= 1 && i9 <= lvVar2.b.getChildCount() + 1) {
                int i18 = (i9 - 1) * 36;
                lvVar2.b(AndroidUtilities.dp(i18 - 6), AndroidUtilities.dp(i18 + 24));
            }
            this.J = i9;
        }
    }

    public final int k() {
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (z10) {
            return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) 12.75f);
        }
        int i9 = this.P;
        return (i9 == 5 || i9 == 7) ? org.telegram.ui.ActionBar.f6.l1(0.09f, this.M) : org.telegram.ui.ActionBar.f6.l1(0.18f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var));
    }

    public final void l(boolean z10) {
        jv jvVar = this.A;
        if (jvVar != null) {
            boolean z11 = this.T;
            if (z11 || this.U != z10) {
                this.U = z10;
                if (z11) {
                    jvVar.setVisibility(z10 ? 0 : 8);
                    jvVar.setAlpha(z10 ? 1.0f : 0.0f);
                } else {
                    jvVar.setVisibility(0);
                    jvVar.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(gr.h).withEndAction(new eh.f(27, this, z10)).start();
                }
                this.b.requestLayout();
                this.T = false;
            }
        }
    }

    public final void m(boolean z10) {
        jv jvVar = this.y;
        if (jvVar == null) {
            return;
        }
        if (z10) {
            jvVar.setBackground(new mv(k()));
        } else {
            jvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.r = z10;
        this.b.invalidate();
    }

    public final void o() {
        int i9 = 0;
        final int i10 = 0;
        while (i9 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i9);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i11 = 0;
                while (i11 < lvVar.b.getChildCount()) {
                    final int i12 = 0;
                    lvVar.b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                        public final /* synthetic */ nv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ev
                    public final /* synthetic */ nv b;

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
            i9++;
            i10++;
        }
        jv jvVar = this.B;
        if (jvVar != null) {
            jvVar.setOnClickListener(new f0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.b.setPadding(AndroidUtilities.dp(this.W), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(ArrayList arrayList) {
        int i9;
        int i10;
        jv jvVar;
        boolean z10;
        TLRPC.Document document;
        if (this.w) {
            if (!this.V || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.V = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i11 = this.E;
                int i12 = childCount - i11;
                jv jvVar2 = this.B;
                int i13 = i12 - (jvVar2 != null ? 1 : 0);
                if (i13 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z11 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (i14 < Math.max(arrayList.size(), i13)) {
                    jv jvVar3 = i14 < i13 ? (jv) this.b.getChildAt(i14 + i11) : null;
                    jx jxVar = i14 < arrayList.size() ? (jx) arrayList.get(i14) : null;
                    if (jxVar == null) {
                        if (jvVar3 != null) {
                            this.b.removeView(jvVar3);
                        }
                    } else if (jxVar.j == 0) {
                        boolean z12 = jxVar.e;
                        Long l10 = jxVar.a;
                        if (l10 != null) {
                            if (jvVar3 == null) {
                                i9 = i13;
                                jvVar3 = new jv(this, getContext(), jxVar.a.longValue());
                                i(jvVar3);
                                this.b.addView(jvVar3, i11 + i14);
                            } else {
                                i9 = i13;
                                jvVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i10 = i11;
                            jvVar = jvVar2;
                            z10 = z11;
                        } else {
                            i9 = i13;
                            TLRPC.StickerSet stickerSet = jxVar.b;
                            ArrayList arrayList3 = jxVar.c;
                            if (stickerSet == null) {
                                i10 = i11;
                                jvVar = jvVar2;
                                z10 = z11;
                            } else {
                                if (arrayList3 != null) {
                                    int i15 = 0;
                                    while (i15 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i15);
                                        z10 = z11;
                                        i10 = i11;
                                        jvVar = jvVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i15++;
                                        z11 = z10;
                                        i11 = i10;
                                        jvVar2 = jvVar;
                                    }
                                }
                                i10 = i11;
                                jvVar = jvVar2;
                                z10 = z11;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (jvVar3 == null) {
                                            jvVar3 = new jv(this, getContext(), document);
                                            i(jvVar3);
                                            this.b.addView(jvVar3, i10 + i14);
                                        } else {
                                            jvVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            jvVar3.setStickerThumb(jxVar);
                                        }
                                    }
                                    document = null;
                                    if (jvVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (jvVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        jvVar3.a = jxVar.i ? Long.valueOf(439488310) : null;
                        jvVar3.g(this.I == i14, false);
                        int i16 = this.P;
                        if (i16 == 4) {
                            jvVar3.a((z10 || z12) ? null : Boolean.TRUE);
                        } else {
                            if (i16 != 6 && i16 != 5 && i16 != 7) {
                                if (!z10 && !z12) {
                                    jvVar3.a(Boolean.TRUE);
                                } else if (g(jxVar)) {
                                    jvVar3.a(null);
                                } else {
                                    jvVar3.a(Boolean.FALSE);
                                }
                            }
                            jvVar3.a(null);
                        }
                        i14++;
                        i13 = i9;
                        z11 = z10;
                        i11 = i10;
                        jvVar2 = jvVar;
                    } else if (jvVar3 == null) {
                        jv jvVar4 = new jv(this, getContext(), jxVar.j, false);
                        i(jvVar4);
                        this.b.addView(jvVar4, i11 + i14);
                    } else {
                        jvVar3.setDrawable(getResources().getDrawable(jxVar.j).mutate());
                        jvVar3.d();
                        jvVar3.a(null);
                    }
                    i9 = i13;
                    i10 = i11;
                    jvVar = jvVar2;
                    z10 = z11;
                    i14++;
                    i13 = i9;
                    z11 = z10;
                    i11 = i10;
                    jvVar2 = jvVar;
                }
                jv jvVar5 = jvVar2;
                if (jvVar5 != null) {
                    jvVar5.bringToFront();
                    if (jvVar5.getAlpha() < 1.0f) {
                        jvVar5.animate().alpha(1.0f).setDuration(hg.h0.d() ? 0L : 200L).setInterpolator(gr.f).start();
                    }
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    ((jv) arrayList2.get(i17)).getClass();
                    ((jv) arrayList2.get(i17)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i9) {
        this.O = i9;
    }

    public void setPaddingLeft(float f10) {
        this.W = f10;
    }

    public void e() {
    }

    public void i(jv jvVar) {
    }
}
