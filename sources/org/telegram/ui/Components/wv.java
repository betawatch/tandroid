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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class wv extends tm0 {
    public static final int[] b0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] c0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final sv B;
    public final sv C;
    public final uv D;
    public final HashMap E;
    public final int F;
    public ValueAnimator G;
    public float H;
    public float I;
    public int J;
    public int K;
    public boolean L;
    public final boolean M;
    public final int N;
    public final Runnable O;
    public int P;
    public final int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a0;
    public final int h;
    public final boolean n;
    public boolean r;
    public z5 s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean w;
    public final sv x;
    public final sv y;

    public wv(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, boolean z11, boolean z12, int i10, Runnable runnable, int i11, boolean z13) {
        super(context);
        this.h = R.drawable.msg_emoji_recent;
        int i12 = R.drawable.msg_emoji_gem;
        int i13 = R.drawable.smiles_tab_settings;
        this.n = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.r = true;
        this.E = new HashMap();
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.P = 6;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.a0 = 11.0f;
        this.w = z12;
        this.v = f6Var;
        this.O = runnable;
        this.Q = i10;
        this.N = i11;
        this.M = z13;
        ov ovVar = new ov(this, context, z12, z13);
        this.b = ovVar;
        ovVar.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.b;
            sv svVar = new sv(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = svVar;
            linearLayout.addView(svVar);
            svVar.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i10 == 3) {
            this.h = R.drawable.msg_emoji_smiles;
        }
        if (i10 == 6) {
            this.h = R.drawable.emoji_love;
        }
        if (z4) {
            LinearLayout linearLayout2 = this.b;
            sv svVar2 = new sv(this, context, this.h, false);
            this.y = svVar2;
            linearLayout2.addView(svVar2);
            svVar2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            svVar2.a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.b;
            sv svVar3 = new sv(this, context, i12, false);
            this.B = svVar3;
            linearLayout3.addView(svVar3);
            svVar3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            svVar3.setAlpha(0.0f);
            svVar3.a = Long.valueOf(98352451);
        }
        if (!z12) {
            int i14 = 0;
            while (i14 < 8) {
                sv svVar4 = new sv(this, context, b0[i14], i14 == 0);
                svVar4.setContentDescription(f(i14));
                this.b.addView(svVar4);
                i14++;
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.b;
            uv uvVar = new uv(this, context);
            this.D = uvVar;
            linearLayout4.addView(uvVar);
            uvVar.h = 3552126;
        }
        this.F = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            sv svVar5 = new sv(this, context, i13, true);
            this.C = svVar5;
            linearLayout5.addView(svVar5);
            svVar5.setContentDescription(LocaleController.getString(R.string.Settings));
            svVar5.a = Long.valueOf(1434631203);
            svVar5.setAlpha(0.0f);
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

    public boolean g(vx vxVar) {
        return vxVar.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.n0(this.v);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z4) {
        int i11;
        int i12 = 0;
        boolean z10 = z4 && !this.W;
        sv svVar = this.x;
        if (svVar != null) {
            i10++;
        }
        if (!this.T || svVar != null) {
            i10 = Math.max(1, i10);
        }
        int i13 = this.J;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i14);
            if (childAt instanceof uv) {
                uv uvVar = (uv) childAt;
                int i16 = i15;
                int i17 = 0;
                while (i17 < uvVar.b.getChildCount()) {
                    View childAt2 = uvVar.b.getChildAt(i17);
                    if (childAt2 instanceof sv) {
                        ((sv) childAt2).g(i10 == i16, z10);
                    }
                    i17++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof sv) {
                    ((sv) childAt).g(i10 == i15, z10);
                }
                i11 = i15;
            }
            if (i10 >= i15 && i10 <= i11) {
                this.J = i14;
            }
            i14++;
            i15 = i11 + 1;
        }
        int i18 = this.J;
        uv uvVar2 = this.D;
        if (i13 != i18) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.H;
            float f11 = this.J;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new mv(this, f10, f11, i12));
                this.G.setDuration(350L);
                this.G.setInterpolator(mr.h);
                this.G.start();
            } else {
                this.I = 1.0f;
                this.H = AndroidUtilities.lerp(f10, f11, 1.0f);
                this.b.invalidate();
            }
            if (uvVar2 != null) {
                boolean z11 = this.J == 1 || this.n;
                if (z11 != uvVar2.n) {
                    uvVar2.n = z11;
                    if (!z11) {
                        uvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = uvVar2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(uvVar2.r, z11 ? 1.0f : 0.0f);
                        uvVar2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new f6(uvVar2, 20));
                        uvVar2.c.setDuration(475L);
                        uvVar2.c.setInterpolator(mr.h);
                        uvVar2.c.start();
                    } else {
                        uvVar2.r = z11 ? 1.0f : 0.0f;
                        uvVar2.invalidate();
                        uvVar2.requestLayout();
                        uvVar2.c();
                        uvVar2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.J);
            if (this.J >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.K != i10) {
            if (uvVar2 != null && this.J == 1 && i10 >= 1 && i10 <= uvVar2.b.getChildCount() + 1) {
                int i19 = (i10 - 1) * 36;
                uvVar2.b(AndroidUtilities.dp(i19 - 6), AndroidUtilities.dp(i19 + 24));
            }
            this.K = i10;
        }
    }

    public final int k() {
        boolean z4 = this.M;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (z4) {
            return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f);
        }
        int i10 = this.Q;
        return (i10 == 5 || i10 == 7) ? org.telegram.ui.ActionBar.j6.l1(0.09f, this.N) : org.telegram.ui.ActionBar.j6.l1(0.18f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
    }

    public final void l(boolean z4) {
        sv svVar = this.B;
        if (svVar != null) {
            boolean z10 = this.U;
            if (z10 || this.V != z4) {
                this.V = z4;
                if (z10) {
                    svVar.setVisibility(z4 ? 0 : 8);
                    svVar.setAlpha(z4 ? 1.0f : 0.0f);
                } else {
                    svVar.setVisibility(0);
                    svVar.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(200L).setInterpolator(mr.h).withEndAction(new jh.f(21, this, z4)).start();
                }
                this.b.requestLayout();
                this.U = false;
            }
        }
    }

    public final void m(boolean z4) {
        sv svVar = this.y;
        if (svVar == null) {
            return;
        }
        if (z4) {
            svVar.setBackground(new vv(k()));
        } else {
            svVar.setBackground(null);
        }
    }

    public final void n(boolean z4) {
        this.r = z4;
        this.b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof uv) {
                uv uvVar = (uv) childAt;
                int i12 = 0;
                while (i12 < uvVar.b.getChildCount()) {
                    final int i13 = 0;
                    uvVar.b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nv
                        public final /* synthetic */ wv b;

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
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nv
                    public final /* synthetic */ wv b;

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
        sv svVar = this.C;
        if (svVar != null) {
            svVar.setOnClickListener(new g0(this, 13));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b.setPadding(AndroidUtilities.dp(this.a0), 0, AndroidUtilities.dp(11.0f), 0);
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
        sv svVar;
        boolean z4;
        TLRPC.Document document;
        if (this.w) {
            if (!this.W || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.W = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i12 = this.F;
                int i13 = childCount - i12;
                sv svVar2 = this.C;
                int i14 = i13 - (svVar2 != null ? 1 : 0);
                if (i14 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z10 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || d();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (i15 < Math.max(arrayList.size(), i14)) {
                    sv svVar3 = i15 < i14 ? (sv) this.b.getChildAt(i15 + i12) : null;
                    vx vxVar = i15 < arrayList.size() ? (vx) arrayList.get(i15) : null;
                    if (vxVar == null) {
                        if (svVar3 != null) {
                            this.b.removeView(svVar3);
                        }
                    } else if (vxVar.j == 0) {
                        boolean z11 = vxVar.e;
                        Long l10 = vxVar.a;
                        if (l10 != null) {
                            if (svVar3 == null) {
                                i10 = i14;
                                svVar3 = new sv(this, getContext(), vxVar.a.longValue());
                                i(svVar3);
                                this.b.addView(svVar3, i12 + i15);
                            } else {
                                i10 = i14;
                                svVar3.setAnimatedEmojiDocumentId(l10.longValue());
                            }
                            i11 = i12;
                            svVar = svVar2;
                            z4 = z10;
                        } else {
                            i10 = i14;
                            TLRPC.StickerSet stickerSet = vxVar.b;
                            ArrayList arrayList3 = vxVar.c;
                            if (stickerSet == null) {
                                i11 = i12;
                                svVar = svVar2;
                                z4 = z10;
                            } else {
                                if (arrayList3 != null) {
                                    int i16 = 0;
                                    while (i16 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i16);
                                        z4 = z10;
                                        i11 = i12;
                                        svVar = svVar2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            break;
                                        }
                                        i16++;
                                        z10 = z4;
                                        i12 = i11;
                                        svVar2 = svVar;
                                    }
                                }
                                i11 = i12;
                                svVar = svVar2;
                                z4 = z10;
                                if (arrayList3 != null) {
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (svVar3 == null) {
                                            svVar3 = new sv(this, getContext(), document);
                                            i(svVar3);
                                            this.b.addView(svVar3, i11 + i15);
                                        } else {
                                            svVar3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            svVar3.setStickerThumb(vxVar);
                                        }
                                    }
                                    document = null;
                                    if (svVar3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            document = null;
                            if (svVar3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        svVar3.a = vxVar.i ? Long.valueOf(439488310) : null;
                        svVar3.g(this.J == i15, false);
                        int i17 = this.Q;
                        if (i17 == 4) {
                            svVar3.a((z4 || z11) ? null : Boolean.TRUE);
                        } else {
                            if (i17 != 6 && i17 != 5 && i17 != 7) {
                                if (!z4 && !z11) {
                                    svVar3.a(Boolean.TRUE);
                                } else if (g(vxVar)) {
                                    svVar3.a(null);
                                } else {
                                    svVar3.a(Boolean.FALSE);
                                }
                            }
                            svVar3.a(null);
                        }
                        i15++;
                        i14 = i10;
                        z10 = z4;
                        i12 = i11;
                        svVar2 = svVar;
                    } else if (svVar3 == null) {
                        sv svVar4 = new sv(this, getContext(), vxVar.j, false);
                        i(svVar4);
                        this.b.addView(svVar4, i12 + i15);
                    } else {
                        svVar3.setDrawable(getResources().getDrawable(vxVar.j).mutate());
                        svVar3.d();
                        svVar3.a(null);
                    }
                    i10 = i14;
                    i11 = i12;
                    svVar = svVar2;
                    z4 = z10;
                    i15++;
                    i14 = i10;
                    z10 = z4;
                    i12 = i11;
                    svVar2 = svVar;
                }
                sv svVar5 = svVar2;
                if (svVar5 != null) {
                    svVar5.bringToFront();
                    if (svVar5.getAlpha() < 1.0f) {
                        svVar5.animate().alpha(1.0f).setDuration(mg.g0.d() ? 0L : 200L).setInterpolator(mr.f).start();
                    }
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    ((sv) arrayList2.get(i18)).getClass();
                    ((sv) arrayList2.get(i18)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.P = i10;
    }

    public void setPaddingLeft(float f10) {
        this.a0 = f10;
    }

    public void e() {
    }

    public void i(sv svVar) {
    }
}
