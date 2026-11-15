package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d0 extends ja implements org.telegram.messenger.is {
    public final hi.d A2;
    public final hi.d B2;
    public final FrameLayout C2;
    public boolean D2;
    public String E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public String I2;
    public ch0 J2;
    public p41 K2;
    public boolean L2;
    public int M2;
    public boolean N2;
    public final TLRPC.TL_messages_composeMessageWithAI[] O2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] P2;
    public int Q2;
    public CharSequence T1;
    public TL_iv.RichMessage U1;
    public boolean V1;
    public CharSequence W1;
    public TL_iv.RichMessage X1;
    public boolean Y1;
    public CharSequence Z1;
    public TL_iv.RichMessage a2;
    public boolean b2;
    public CharSequence c2;
    public TL_iv.RichMessage d2;
    public CharSequence e2;
    public org.telegram.messenger.z10 f2;
    public org.telegram.messenger.z10 g2;
    public long h2;
    public boolean i2;
    public org.telegram.messenger.w10 j2;
    public ld k2;
    public final boolean[] l2;
    public final boolean[] m2;
    public String n2;
    public String o2;
    public boolean p2;
    public final org.telegram.messenger.e q2;
    public final FrameLayout r2;
    public final c0 s2;
    public final c0 t2;
    public final ImageView u2;
    public final FrameLayout v2;
    public final org.telegram.ui.Cells.k3 w2;
    public hi.l3 x2;
    public final LinearLayout y2;
    public final hi.d z2;

    public d0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        this.l2 = new boolean[1];
        this.m2 = new boolean[1];
        this.L2 = true;
        this.M2 = -1;
        int i7 = 3;
        this.O2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.P2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.np.s1(this.a).R1();
        this.q2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.u2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
        this.p1.addView(imageView, c8.ja.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.na.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r2 = frameLayout;
        int i11 = 0;
        c0 c0Var = new c0(this.a, context, e6Var, false);
        this.s2 = c0Var;
        c0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        c0Var.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(c0Var, d02, M, null, e6Var);
        c0Var.setRoundRadius(28);
        c0Var.a(R.drawable.outline_ai_translate2, org.telegram.messenger.hd.M0(2131754962, null), new f(this, i7));
        c0Var.a(R.drawable.menu_rewrite, org.telegram.messenger.hd.M0(2131754963, null), new f(this, i7));
        c0Var.a(R.drawable.menu_proofread, org.telegram.messenger.hd.M0(2131754964, null), new f(this, i7));
        c0Var.c(1);
        frameLayout.addView(c0Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.a).y7.R.b).c, e6Var);
        this.w2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(k3Var, d03, M2, null, e6Var);
        i3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(k3Var, c8.ja.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        c0 c0Var2 = new c0(this.a, context, e6Var, true);
        this.t2 = c0Var2;
        c0Var2.setDivider(true);
        c0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        c0Var2.setRoundRadius(12);
        c0Var2.n = new hi.s4(this, e6Var, context, 1);
        x1();
        c0Var2.c(-1);
        String M0 = p21.M0();
        this.o2 = M0;
        if (M0 == null) {
            this.o2 = org.telegram.messenger.c10.j();
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.v1 = 0.35f;
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        v0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.y2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, org.telegram.ui.ActionBar.j6.w0(i13, this.J0)), org.telegram.ui.ActionBar.j6.w0(i13, this.J0), org.telegram.ui.ActionBar.j6.w0(i13, this.J0)}));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        this.A2 = dVar;
        linearLayout.addView(dVar, c8.ja.p(-1, 48, 1.0f, org.telegram.messenger.ns.E1));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.B2 = g10;
        g10.setOnClickListener(new c(this, 9));
        g10.setOnLongClickListener(new i(this, e6Var, context, i11));
        linearLayout.addView(g10, c8.ja.t(48, 48, 5, 10, 0, 0, 0));
        hi.d g11 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.z2 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.p1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new org.telegram.messenger.video.e(24, this, e6Var));
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i16 = d.leftMargin;
        int i17 = this.u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ja.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i18 = d2.leftMargin;
        int i19 = this.u0;
        d2.leftMargin = i18 + i19;
        d2.rightMargin += i19;
        this.b.addView(frameLayout3, d2);
        u1(false);
        uj0 uj0Var = this.o1;
        int i20 = this.u0;
        uj0Var.setPadding(i20, 0, i20, org.telegram.messenger.g0.L(66.0f));
        this.o1.setClipToPadding(false);
        this.o1.r1();
        this.o1.setOnItemClickListener(new j(this, i11));
        this.J1 = true;
        m mVar = new m(this);
        mVar.m = false;
        mVar.C = false;
        mVar.o(er.h);
        mVar.n(350L);
        this.o1.setItemAnimator(mVar);
        this.o1.setOnScrollListener(new bi.z4(this, 27));
        this.K2.O(false);
        org.telegram.messenger.g0.h3(new a(this, i11));
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.Y3);
    }

    public static void d1(d0 d0Var, View view) {
        d0Var.p2 = !d0Var.p2;
        d0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof fp) {
                ((fp) linearLayout.getChildAt(0)).a(d0Var.p2, true);
            }
        }
    }

    public static void e1(d0 d0Var, int i7) {
        c0 c0Var = d0Var.s2;
        if (c0Var.getSelectedTab() == i7) {
            return;
        }
        hi.l3 l3Var = d0Var.x2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        c0Var.c(i7);
        d0Var.p1();
        d0Var.K2.O(true);
    }

    public static void f1(d0 d0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        c0 c0Var = d0Var.t2;
        hi.l3 l3Var = d0Var.x2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (aiComposeTone instanceof z) {
            c0Var.d(aiComposeTone);
            d0Var.K2.O(true);
            org.telegram.messenger.g0.i3(new a(d0Var, 3), 150L);
            return;
        }
        if (aiComposeTone != null) {
            if (c0Var.getSelectedTone() == aiComposeTone) {
                return;
            }
            c0Var.d(aiComposeTone);
            d0Var.p1();
            d0Var.K2.O(true);
            return;
        }
        ArrayList arrayList = d0Var.q2.b;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) {
                i7++;
            }
        }
        if (i7 + 1 > (org.telegram.messenger.m10.i(d0Var.a).q() ? ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(d0Var.a).y7.T.b).c : ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(d0Var.a).y7.S.b).c)) {
            t1(new cc(d0Var.C2, d0Var.J0), d0Var.a);
            return;
        }
        y yVar = new y(d0Var.getContext(), d0Var.J0);
        yVar.g2 = new f(d0Var, 1);
        yVar.show();
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
            for (int i7 = 0; i7 < pageblocklist.items.size(); i7++) {
                if (i7 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i7);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    j1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (i10 > 0) {
                            sb2.append("\n");
                        }
                        i1(arrayList.get(i10), sb2);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    j1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            sb2.append("\n");
                        }
                        i1(arrayList2.get(i12), sb2);
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
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                j1(textconcat.texts.get(i7), sb2);
            }
        }
    }

    public static void k1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) oi.a6.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) oi.a6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) oi.a6.r(richText, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i7 = 0; i7 < pageblocklist.items.size(); i7++) {
                if (i7 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i7);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) oi.a6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (i10 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        k1(arrayList.get(i10), spannableStringBuilder);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                if (i11 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) oi.a6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        k1(arrayList2.get(i12), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void t1(cc ccVar, int i7) {
        if (ccVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.s1(i7).y7;
        boolean q10 = org.telegram.messenger.m10.i(i7).q();
        ccVar.I(!q10 ? R.raw.star_premium_2 : R.raw.error, org.telegram.messenger.hd.M0(2131754976, null), org.telegram.messenger.g0.U2(!q10 ? org.telegram.messenger.hd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.b).c)) : org.telegram.messenger.hd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.b).c)), new dg(ccVar, 1))).j();
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new d(this, 0), this.J0);
        this.K2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        if (this.I2 == null) {
            this.I2 = org.telegram.messenger.hd.M0(2131755006, null);
            ch0 ch0Var = new ch0(R.raw.emoji_stars, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.J2 = ch0Var;
            ch0Var.J(true);
            this.J2.K(1);
        }
        return this.I2;
    }

    @Override // org.telegram.ui.Components.ja
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.u2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.Y3) {
            x1();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.Y3);
        org.telegram.messenger.e eVar = this.q2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(m60 m60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        int i10 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.J0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z10);
        z0Var.d(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)));
        z0Var.setOnClickListener(new h(m60Var, z10, runnable, 0));
        linearLayout.addView(z0Var, c8.ja.o(-1, -2));
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.ActionBar.u2
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.y2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.M2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.M2, true);
            this.M2 = -1;
        }
        this.N2 = false;
        org.telegram.ui.ActionBar.j5 titleTextView = this.p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (this.N2) {
            return null;
        }
        int selectedTab = this.s2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V1) {
                return null;
            }
            return this.X1;
        }
        if (selectedTab == 2) {
            if (this.b2) {
                return null;
            }
            return this.d2;
        }
        if (this.Y1) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.a2;
        return richMessage == null ? this.U1 : richMessage;
    }

    public final CharSequence m1() {
        if (n1()) {
            TL_iv.RichMessage l1 = l1();
            if (l1 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < l1.blocks.size(); i7++) {
                if (i7 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                k1(l1.blocks.get(i7), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.N2) {
            return null;
        }
        int selectedTab = this.s2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V1) {
                return null;
            }
            return this.W1;
        }
        if (selectedTab == 2) {
            if (this.b2) {
                return null;
            }
            return this.e2;
        }
        if (this.Y1) {
            return null;
        }
        CharSequence charSequence = this.Z1;
        return charSequence == null ? this.T1 : charSequence;
    }

    public final boolean n1() {
        return this.U1 != null;
    }

    public final b41 o1(int i7, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U1;
        }
        int i10 = org.telegram.messenger.wt.b;
        b41 K = b41.K(org.telegram.messenger.wt.class);
        K.G = richMessage;
        K.d = i7;
        K.e = z10;
        return K;
    }

    public final void p1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean n1 = n1();
        fa faVar = this.p1;
        c0 c0Var = this.t2;
        c0 c0Var2 = this.s2;
        if (!n1) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.T1};
            tL_textWithEntities.entities = org.telegram.messenger.si.b0(this.a).W(charSequenceArr, true, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = c0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.c10.D(this.o2);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.p2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = c0Var.getSelectedTone();
                if (selectedTone instanceof z) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.E2) ? "" : this.E2;
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
                tL_messages_composeMessageWithAI.emojify = this.p2;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.O2[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.N2 = true;
                this.F2 = false;
                u1(true);
                org.telegram.ui.ActionBar.j5 titleTextView = faVar.getTitleTextView();
                titleTextView.i(this.J2);
                this.J2.start();
                int selectedTab2 = c0Var2.getSelectedTab();
                CharSequence charSequence5 = this.T1;
                if (selectedTab2 == 0 && (charSequence3 = this.W1) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.Z1) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.c2) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(64.0f);
                int i7 = this.u0;
                int b10 = c8.i9.b(new StaticLayout(charSequence6, textPaint, (L - i7) - i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < b10; i10++) {
                    if (i10 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748779, null));
                    e80 e80Var = new e80(null, L2, 0, null);
                    e80Var.f = org.telegram.messenger.g0.L(6.0f);
                    e80Var.h = 0.5f;
                    e80Var.n = true;
                    spannableStringBuilder.setSpan(e80Var, length, spannableStringBuilder.length(), 33);
                }
                int i11 = 1;
                if (selectedTab == 0) {
                    this.V1 = true;
                    this.W1 = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.Y1 = true;
                    this.Z1 = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.b2 = true;
                    this.c2 = spannableStringBuilder;
                }
                this.M2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(i11), new di.k0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 5));
                this.K2.O(true);
                return;
            }
            return;
        }
        int selectedTab3 = c0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.U1;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i12 = 0; i12 < richMessage.blocks.size(); i12++) {
                tL_inputRichMessage.blocks.add(org.telegram.messenger.ez.y0(richMessage.blocks.get(i12)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    TLRPC.Photo photo = arrayList2.get(i13);
                    i13++;
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
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document = arrayList4.get(i14);
                    i14++;
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
            tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.c10.D(this.o2);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.p2;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = c0Var.getSelectedTone();
            if (selectedTone2 instanceof z) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.E2) ? str : this.E2;
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
            tL_messages_composeRichMessageWithAI.emojify = this.p2;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.P2[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            int i15 = 1;
            this.N2 = true;
            this.F2 = false;
            u1(true);
            org.telegram.ui.ActionBar.j5 titleTextView2 = faVar.getTitleTextView();
            titleTextView2.i(this.J2);
            this.J2.start();
            if (selectedTab3 == 0) {
                this.V1 = true;
            } else if (selectedTab3 == 1) {
                this.Y1 = true;
            } else if (selectedTab3 == 2) {
                this.b2 = true;
            }
            this.M2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(i15), new di.k0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 6));
            this.K2.O(true);
        }
    }

    public final void q1(int i7, int i10, boolean z10) {
        if (this.k2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.k2.a(l1, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        if (this.j2 == null || m1() == null) {
            return;
        }
        this.j2.a(m1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public final void r1(TL_iv.RichMessage richMessage) {
        this.U1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.br(8), false);
        x1();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
            if (w02 != this.Q2) {
                this.Q2 = w02;
                v0(w02);
                this.y2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(CharSequence charSequence) {
        String str;
        int i7 = 7;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {xy0.class, qi.g.class, fu0.class, i41.class, h41.class, e41.class, f41.class, d00.class, d41.class, c41.class, p5.class};
            for (int i10 = 0; i10 < 11; i10++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i10])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        } else {
            str = charSequence.toString();
        }
        this.T1 = str;
        org.telegram.messenger.b6.d(charSequence.toString(), new b(this, 0), new org.telegram.ui.br(i7), false);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        fa faVar = this.p1;
        if (faVar != null) {
            faVar.setTitle(O0());
        }
        int i7 = (this.i2 || (this.k2 == null && this.j2 == null)) ? 8 : 0;
        hi.d dVar = this.B2;
        dVar.setVisibility(i7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745640, null));
        eq eqVar = new eq(this.i2 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        eqVar.s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.K2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z10) {
        boolean z11 = this.F2;
        int i7 = 2;
        int i10 = 1;
        hi.d dVar = this.A2;
        if (z11) {
            dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
            dVar.setOnClickListener(new c(this, r5));
        } else {
            c0 c0Var = this.s2;
            if ((c0Var != null ? c0Var.getSelectedTab() : 0) == 1 && (this.t2.getSelectedTone() instanceof z) && !TextUtils.equals(this.w2.getText().toString(), this.E2)) {
                dVar.setText(org.telegram.messenger.hd.M0(2131754059, null));
                dVar.setOnClickListener(new c(this, i10));
            } else if (this.g2 == null && this.f2 == null) {
                dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.hd.M0(2131755002, null));
                dVar.setOnClickListener(new c(this, i7));
            }
        }
        dVar.setLoading(this.N2);
        if (z10 && this.H2 == this.G2) {
            return;
        }
        boolean z12 = this.G2;
        this.H2 = z12;
        LinearLayout linearLayout = this.y2;
        hi.d dVar2 = this.z2;
        if (!z10) {
            dVar2.setVisibility(z12 ? 0 : 8);
            dVar2.setAlpha(this.G2 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.G2 ? 8 : 0);
            linearLayout.setAlpha(this.G2 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = dVar2.animate().alpha(this.G2 ? 1.0f : 0.0f);
        er erVar = er.h;
        alpha.setInterpolator(erVar).setDuration(320L).withEndAction(new a(this, i10)).start();
        linearLayout.animate().alpha(this.G2 ? 0.0f : 1.0f).setInterpolator(erVar).setDuration(320L).withEndAction(new a(this, i7)).start();
    }

    public final void v1() {
        String str = this.E2;
        org.telegram.ui.Cells.k3 k3Var = this.w2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.D2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.D2 = z10;
        org.telegram.messenger.i20.m(animate, !equals ? 1.0f : 0.5f, 320L);
        this.K2.O(true);
    }

    public final void w1() {
        uj0 uj0Var;
        View view;
        if (this.x2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            uj0Var = this.o1;
            if (i7 >= uj0Var.getChildCount()) {
                view = null;
                break;
            }
            view = uj0Var.getChildAt(i7);
            b41 G = this.K2.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.t2) {
                break;
            } else {
                i7++;
            }
        }
        if (view == null) {
            this.x2.setVisibility(4);
            this.x2.f(true);
        } else {
            this.x2.setVisibility(0);
            this.x2.setTranslationY(view.getY() + uj0Var.getY() + view.getHeight());
        }
    }

    public final void x1() {
        c0 c0Var = this.t2;
        TL_aicompose.AiComposeTone selectedTone = c0Var.getSelectedTone();
        c0Var.c.removeAllViews();
        if (n1()) {
            c0Var.b(new z(), new f(this, 0));
        }
        c0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.q2.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != c0Var.getSelectedTone()) {
            c0Var.d(null);
        }
    }
}
