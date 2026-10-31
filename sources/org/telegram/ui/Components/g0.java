package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends ha implements org.telegram.messenger.us {
    public String A2;
    public boolean B2;
    public boolean C2;
    public boolean D2;
    public String E2;
    public bi0 F2;
    public p51 G2;
    public boolean H2;
    public int I2;
    public boolean J2;
    public final TLRPC.TL_messages_composeMessageWithAI[] K2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] L2;
    public int M2;
    public CharSequence P1;
    public TL_iv.RichMessage Q1;
    public boolean R1;
    public Spannable S1;
    public TL_iv.RichMessage T1;
    public boolean U1;
    public Spannable V1;
    public TL_iv.RichMessage W1;
    public boolean X1;
    public Spannable Y1;
    public TL_iv.RichMessage Z1;
    public Spannable a2;
    public org.telegram.messenger.q20 b2;
    public org.telegram.messenger.q20 c2;
    public long d2;
    public boolean e2;
    public org.telegram.messenger.n20 f2;
    public gd g2;
    public final boolean[] h2;
    public final boolean[] i2;
    public String j2;
    public String k2;
    public boolean l2;
    public final org.telegram.messenger.e m2;
    public final FrameLayout n2;
    public final f0 o2;
    public final f0 p2;
    public final ImageView q2;
    public final FrameLayout r2;
    public final org.telegram.ui.Cells.m3 s2;
    public vh.p2 t2;
    public final LinearLayout u2;
    public final vh.d v2;
    public final vh.d w2;
    public final vh.d x2;
    public final FrameLayout y2;
    public boolean z2;

    public g0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, 2, p6Var);
        this.h2 = new boolean[1];
        this.i2 = new boolean[1];
        this.H2 = true;
        this.I2 = -1;
        int i10 = 3;
        this.K2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.L2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e Q1 = org.telegram.messenger.vp.r1(this.a).Q1();
        this.m2 = Q1;
        Q1.b();
        Q1.d = true;
        ImageView imageView = new ImageView(context);
        this.q2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        this.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n2 = frameLayout;
        int i12 = 0;
        f0 f0Var = new f0(this.a, context, p6Var, false);
        this.o2 = f0Var;
        f0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        int L2 = org.telegram.messenger.i0.L(28.0f);
        int i13 = org.telegram.ui.ActionBar.t6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        f0Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f0Var, d02, N, null, p6Var);
        f0Var.setRoundRadius(28);
        f0Var.a(R.drawable.outline_ai_translate2, org.telegram.messenger.cd.L0(2131754962, null), new f(this, i10));
        f0Var.a(R.drawable.menu_rewrite, org.telegram.messenger.cd.L0(2131754963, null), new f(this, i10));
        f0Var.a(R.drawable.menu_proofread, org.telegram.messenger.cd.L0(2131754964, null), new f(this, i10));
        f0Var.c(1);
        frameLayout.addView(f0Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r2 = frameLayout2;
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131754058, null), true, false, ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(this.a).y7.R.a).c, p6Var);
        this.s2 = m3Var;
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        k3Var.setImeOptions(6);
        k3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        m3Var.setBackground(d03);
        org.telegram.ui.ActionBar.a7.k(m3Var, d03, N2, null, p6Var);
        k3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(m3Var, w7.b6.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        k3Var.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(15.0f));
        f0 f0Var2 = new f0(this.a, context, p6Var, true);
        this.p2 = f0Var2;
        f0Var2.setDivider(true);
        f0Var2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        f0Var2.setRoundRadius(12);
        f0Var2.n = new i(this, p6Var, context, i12);
        x1();
        f0Var2.c(-1);
        String M0 = m31.M0();
        this.k2 = M0;
        if (M0 == null) {
            this.k2 = org.telegram.messenger.t10.j();
        }
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.r1 = 0.35f;
        int i14 = org.telegram.ui.ActionBar.t6.a7;
        v0(org.telegram.ui.ActionBar.t6.w0(i14, this.I0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.u2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i14, this.I0)), org.telegram.ui.ActionBar.t6.w0(i14, this.I0), org.telegram.ui.ActionBar.t6.w0(i14, this.I0)}));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        this.w2 = dVar;
        linearLayout.addView(dVar, w7.b6.p(-1, 48, 1.0f, org.telegram.messenger.zs.E1));
        vh.d i15 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.x2 = i15;
        int i16 = 9;
        i15.setOnClickListener(new c(this, i16));
        i15.setOnLongClickListener(new j(this, p6Var, context, i12));
        linearLayout.addView(i15, w7.b6.t(48, 48, 5, 10, 0, 0, 0));
        vh.d i17 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.v2 = i17;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new ag.x2(), length, spannableStringBuilder.length(), 33);
        i17.setText(spannableStringBuilder);
        i17.setOnClickListener(new org.telegram.ui.ud(i16, this, p6Var));
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 80);
        int i18 = e.leftMargin;
        int i19 = this.t0;
        e.leftMargin = i18 + i19;
        e.rightMargin += i19;
        this.b.addView(linearLayout, e);
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i20 = d.leftMargin;
        int i21 = this.t0;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.b.addView(i17, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.y2 = frameLayout3;
        FrameLayout.LayoutParams d10 = w7.b6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i22 = d10.leftMargin;
        int i23 = this.t0;
        d10.leftMargin = i22 + i23;
        d10.rightMargin += i23;
        this.b.addView(frameLayout3, d10);
        u1(false);
        tk0 tk0Var = this.k1;
        int i24 = this.t0;
        tk0Var.setPadding(i24, 0, i24, org.telegram.messenger.i0.L(66.0f));
        this.k1.setClipToPadding(false);
        this.k1.r1();
        this.k1.setOnItemClickListener(new k(this, i12));
        this.F1 = true;
        n nVar = new n(this);
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.k1.setItemAnimator(nVar);
        this.k1.setOnScrollListener(new ag.u(this, 10));
        this.G2.O(false);
        org.telegram.messenger.i0.g3(new a(this, i12));
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.Y3);
    }

    public static void d1(g0 g0Var, View view) {
        g0Var.l2 = !g0Var.l2;
        g0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof ep) {
                ((ep) linearLayout.getChildAt(0)).a(g0Var.l2, true);
            }
        }
    }

    public static void e1(g0 g0Var, int i10) {
        f0 f0Var = g0Var.o2;
        if (f0Var.getSelectedTab() == i10) {
            return;
        }
        vh.p2 p2Var = g0Var.t2;
        if (p2Var != null) {
            p2Var.e(true);
        }
        f0Var.c(i10);
        g0Var.p1();
        g0Var.G2.O(true);
    }

    public static void f1(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        f0 f0Var = g0Var.p2;
        vh.p2 p2Var = g0Var.t2;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            f0Var.d(aiComposeTone);
            g0Var.G2.O(true);
            org.telegram.messenger.i0.h3(new a(g0Var, 3), 150L);
            return;
        }
        if (aiComposeTone != null) {
            if (f0Var.getSelectedTone() == aiComposeTone) {
                return;
            }
            f0Var.d(aiComposeTone);
            g0Var.p1();
            g0Var.G2.O(true);
            return;
        }
        ArrayList arrayList = g0Var.m2.b;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                i10++;
            }
        }
        if (i10 + 1 > (org.telegram.messenger.d20.i(g0Var.a).q() ? ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(g0Var.a).y7.T.a).c : ((org.telegram.messenger.l0) org.telegram.messenger.vp.r1(g0Var.a).y7.S.a).c)) {
            t1(new cc(g0Var.y2, g0Var.I0), g0Var.a);
            return;
        }
        z zVar = new z(g0Var.getContext(), g0Var.I0);
        zVar.c2 = new f(g0Var, 1);
        zVar.show();
    }

    public static void i1(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            j1(pageBlock.text, sb2);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                j1(pageCaption.text, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                j1(richText, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    j1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (i11 > 0) {
                            sb2.append("\n");
                        }
                        i1(arrayList.get(i11), sb2);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    j1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (i13 > 0) {
                            sb2.append("\n");
                        }
                        i1(arrayList2.get(i13), sb2);
                    }
                }
            }
        }
    }

    public static void j1(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                j1(richText.text, sb2);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                j1(textconcat.texts.get(i10), sb2);
            }
        }
    }

    public static void k1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) bi.s6.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) bi.s6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) bi.s6.r(richText, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) bi.s6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (i11 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        k1(arrayList.get(i11), spannableStringBuilder);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) bi.s6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (i13 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        k1(arrayList2.get(i13), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void t1(cc ccVar, int i10) {
        if (ccVar.W() == null) {
            return;
        }
        org.telegram.messenger.s0 s0Var = org.telegram.messenger.vp.r1(i10).y7;
        boolean q6 = org.telegram.messenger.d20.i(i10).q();
        ccVar.I(!q6 ? R.raw.star_premium_2 : R.raw.error, org.telegram.messenger.cd.L0(2131754976, null), org.telegram.messenger.i0.T2(!q6 ? org.telegram.messenger.cd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.l0) s0Var.S.a).c), Integer.valueOf(((org.telegram.messenger.l0) s0Var.T.a).c)) : org.telegram.messenger.cd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.l0) s0Var.T.a).c)), new tf(ccVar, 1))).j();
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, true, new d(this, 0), this.I0);
        this.G2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        if (this.E2 == null) {
            this.E2 = org.telegram.messenger.cd.L0(2131755006, null);
            bi0 bi0Var = new bi0(R.raw.emoji_stars, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            this.F2 = bi0Var;
            bi0Var.J(true);
            this.F2.K(1);
        }
        return this.E2;
    }

    @Override // org.telegram.ui.Components.ha
    public final void Q0(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.q2;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.Y3) {
            x1();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.Y3);
        org.telegram.messenger.e eVar = this.m2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(z60 z60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, getContext(), this.I0, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(str);
        b1Var.setChecked(z10);
        b1Var.d(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)));
        b1Var.setOnClickListener(new h(z60Var, z10, runnable, 0));
        linearLayout.addView(b1Var, w7.b6.o(-1, -2));
    }

    @Override // org.telegram.ui.Components.ha, org.telegram.ui.ActionBar.z2
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        LinearLayout linearLayout = this.u2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.I2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.I2, true);
            this.I2 = -1;
        }
        this.J2 = false;
        org.telegram.ui.ActionBar.u5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (this.J2) {
            return null;
        }
        int selectedTab = this.o2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.R1) {
                return null;
            }
            return this.T1;
        }
        if (selectedTab == 2) {
            if (this.X1) {
                return null;
            }
            return this.Z1;
        }
        if (this.U1) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.W1;
        return richMessage == null ? this.Q1 : richMessage;
    }

    public final CharSequence m1() {
        if (n1()) {
            TL_iv.RichMessage l1 = l1();
            if (l1 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < l1.blocks.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                k1(l1.blocks.get(i10), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.J2) {
            return null;
        }
        int selectedTab = this.o2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.R1) {
                return null;
            }
            return this.S1;
        }
        if (selectedTab == 2) {
            if (this.X1) {
                return null;
            }
            return this.a2;
        }
        if (this.U1) {
            return null;
        }
        Spannable spannable = this.V1;
        return spannable == null ? this.P1 : spannable;
    }

    public final boolean n1() {
        return this.Q1 != null;
    }

    public final a51 o1(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.Q1;
        }
        int i11 = org.telegram.messenger.ku.b;
        a51 K = a51.K(org.telegram.messenger.ku.class);
        K.G = richMessage;
        K.d = i10;
        K.e = z10;
        return K;
    }

    public final void p1() {
        Spannable spannable;
        Spannable spannable2;
        Spannable spannable3;
        String str;
        String str2;
        boolean n12 = n1();
        da daVar = this.l1;
        f0 f0Var = this.p2;
        f0 f0Var2 = this.o2;
        if (!n12) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.P1};
            tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
            CharSequence charSequence = charSequenceArr[0];
            tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
            int selectedTab = f0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.t10.D(this.k2);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.l2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.A2) ? "" : this.A2;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.id = tL_aiComposeTone.id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeMessageWithAI.emojify = this.l2;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.K2[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.J2 = true;
                this.B2 = false;
                u1(true);
                org.telegram.ui.ActionBar.u5 titleTextView = daVar.getTitleTextView();
                titleTextView.i(this.F2);
                this.F2.start();
                int selectedTab2 = f0Var2.getSelectedTab();
                CharSequence charSequence2 = this.P1;
                if (selectedTab2 == 0 && (spannable3 = this.S1) != null) {
                    charSequence2 = spannable3;
                }
                if (selectedTab2 == 1 && (spannable2 = this.V1) != null) {
                    charSequence2 = spannable2;
                }
                CharSequence charSequence3 = (selectedTab2 != 2 || (spannable = this.Y1) == null) ? charSequence2 : spannable;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(64.0f);
                int i10 = this.t0;
                int b10 = w7.u.b(new StaticLayout(charSequence3, textPaint, (L - i10) - i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < b10; i11++) {
                    if (i11 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int L2 = org.telegram.messenger.i0.L((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131748789, null));
                    u80 u80Var = new u80(null, L2, 0, null);
                    u80Var.f = org.telegram.messenger.i0.L(6.0f);
                    u80Var.h = 0.5f;
                    u80Var.n = true;
                    spannableStringBuilder.setSpan(u80Var, length, spannableStringBuilder.length(), 33);
                }
                int i12 = 1;
                if (selectedTab == 0) {
                    this.R1 = true;
                    this.S1 = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.U1 = true;
                    this.V1 = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.X1 = true;
                    this.Y1 = spannableStringBuilder;
                }
                this.I2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new a3.b(i12), new org.telegram.ui.f0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 1));
                this.G2.O(true);
                return;
            }
            return;
        }
        int selectedTab3 = f0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.Q1;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i13 = 0; i13 < richMessage.blocks.size(); i13++) {
                tL_inputRichMessage.blocks.add(org.telegram.messenger.qz.y0(richMessage.blocks.get(i13)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    TLRPC.Photo photo = arrayList2.get(i14);
                    i14++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    String str4 = str3;
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                    str3 = str4;
                }
            }
            str = str3;
            str2 = null;
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    TLRPC.Document document = arrayList4.get(i15);
                    i15++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
        }
        tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
        if (selectedTab3 == 0) {
            tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.t10.D(this.k2);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.l2;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = f0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.A2) ? str : this.A2;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.id = tL_aiComposeTone2.id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeRichMessageWithAI.emojify = this.l2;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.L2[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            int i16 = 1;
            this.J2 = true;
            this.B2 = false;
            u1(true);
            org.telegram.ui.ActionBar.u5 titleTextView2 = daVar.getTitleTextView();
            titleTextView2.i(this.F2);
            this.F2.start();
            if (selectedTab3 == 0) {
                this.R1 = true;
            } else if (selectedTab3 == 1) {
                this.U1 = true;
            } else if (selectedTab3 == 2) {
                this.X1 = true;
            }
            this.I2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new a3.b(i16), new org.telegram.ui.f0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 2));
            this.G2.O(true);
        }
    }

    public final void q1(int i10, int i11, boolean z10) {
        if (this.g2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.g2.a(l1, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        if (this.f2 == null || m1() == null) {
            return;
        }
        this.f2.a(m1(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        int i10 = 0;
        if (c3.i0.t(editable)) {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {zz0.class, di.i.class, gv0.class, h51.class, g51.class, d51.class, e51.class, n00.class, c51.class, b51.class, o5.class};
            for (int i11 = 0; i11 < 11; i11++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i11])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            spannableStringBuilder = editable.toString();
        }
        this.P1 = spannableStringBuilder;
        org.telegram.messenger.js.d(editable.toString(), new b(this, i10), new org.telegram.ui.Cells.m5(17), false);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
            if (w02 != this.M2) {
                this.M2 = w02;
                v0(w02);
                this.u2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.Q1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
            if (i10 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i10), sb2);
        }
        org.telegram.messenger.js.d(sb2.toString(), new b(this, 1), new org.telegram.ui.Cells.m5(18), false);
        x1();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
        int i10 = (this.e2 || (this.g2 == null && this.f2 == null)) ? 8 : 0;
        vh.d dVar = this.x2;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131745657, null));
        dq dqVar = new dq(this.e2 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        dqVar.s = org.telegram.messenger.i0.L(1.0f);
        spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.G2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z10) {
        boolean z11 = this.B2;
        int i10 = 2;
        int i11 = 1;
        vh.d dVar = this.w2;
        if (z11) {
            dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
            dVar.setOnClickListener(new c(this, r5));
        } else {
            f0 f0Var = this.o2;
            if ((f0Var != null ? f0Var.getSelectedTab() : 0) == 1 && (this.p2.getSelectedTone() instanceof a0) && !TextUtils.equals(this.s2.getText().toString(), this.A2)) {
                dVar.setText(org.telegram.messenger.cd.L0(2131754059, null));
                dVar.setOnClickListener(new c(this, i11));
            } else if (this.c2 == null && this.b2 == null) {
                dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.cd.L0(2131755002, null));
                dVar.setOnClickListener(new c(this, i10));
            }
        }
        dVar.setLoading(this.J2);
        if (z10 && this.D2 == this.C2) {
            return;
        }
        boolean z12 = this.C2;
        this.D2 = z12;
        LinearLayout linearLayout = this.u2;
        vh.d dVar2 = this.v2;
        if (!z10) {
            dVar2.setVisibility(z12 ? 0 : 8);
            dVar2.setAlpha(this.C2 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.C2 ? 8 : 0);
            linearLayout.setAlpha(this.C2 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = dVar2.animate().alpha(this.C2 ? 1.0f : 0.0f);
        gr grVar = gr.h;
        alpha.setInterpolator(grVar).setDuration(320L).withEndAction(new a(this, i11)).start();
        linearLayout.animate().alpha(this.C2 ? 0.0f : 1.0f).setInterpolator(grVar).setDuration(320L).withEndAction(new a(this, i10)).start();
    }

    public final void v1() {
        String str = this.A2;
        org.telegram.ui.Cells.m3 m3Var = this.s2;
        boolean equals = TextUtils.equals(str, m3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.z2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = m3Var.d.animate();
        this.z2 = z10;
        org.telegram.messenger.z20.l(animate, !equals ? 1.0f : 0.5f, 320L);
        this.G2.O(true);
    }

    public final void w1() {
        tk0 tk0Var;
        View view;
        if (this.t2 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            tk0Var = this.k1;
            if (i10 >= tk0Var.getChildCount()) {
                view = null;
                break;
            }
            view = tk0Var.getChildAt(i10);
            a51 G = this.G2.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.p2) {
                break;
            } else {
                i10++;
            }
        }
        if (view == null) {
            this.t2.setVisibility(4);
            this.t2.e(true);
        } else {
            this.t2.setVisibility(0);
            this.t2.setTranslationY(view.getY() + tk0Var.getY() + view.getHeight());
        }
    }

    public final void x1() {
        f0 f0Var = this.p2;
        TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
        f0Var.c.removeAllViews();
        if (n1()) {
            f0Var.b(new a0(), new f(this, 0));
        }
        f0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.m2.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != f0Var.getSelectedTone()) {
            f0Var.d(null);
        }
    }
}
