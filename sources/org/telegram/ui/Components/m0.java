package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m0 extends ra implements org.telegram.messenger.fs {
    public final LinearLayout A2;
    public final hi.e B2;
    public final hi.e C2;
    public final hi.e D2;
    public final FrameLayout E2;
    public boolean F2;
    public String G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public long L2;
    public ch.k M2;
    public String N2;
    public nh0 O2;
    public b51 P2;
    public boolean Q2;
    public y R2;
    public dd S2;
    public CharSequence T1;
    public boolean T2;
    public TL_iv.RichMessage U1;
    public z U2;
    public boolean V1;
    public int V2;
    public CharSequence W1;
    public boolean W2;
    public TL_iv.RichMessage X1;
    public final TLRPC.TL_messages_composeMessageWithAI[] X2;
    public boolean Y1;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] Y2;
    public CharSequence Z1;
    public int Z2;
    public TL_iv.RichMessage a2;
    public boolean b2;
    public CharSequence c2;
    public TL_iv.RichMessage d2;
    public CharSequence e2;
    public org.telegram.messenger.w10 f2;
    public org.telegram.messenger.w10 g2;
    public long h2;
    public boolean i2;
    public org.telegram.messenger.t10 j2;
    public vd k2;
    public final boolean[] l2;
    public final boolean[] m2;
    public String n2;
    public String o2;
    public String p2;
    public TL_aicompose.AiComposeTone q2;
    public boolean r2;
    public final org.telegram.messenger.e s2;
    public final FrameLayout t2;
    public final l0 u2;
    public final l0 v2;
    public final ImageView w2;
    public final FrameLayout x2;
    public final org.telegram.ui.Cells.l3 y2;
    public hi.u3 z2;

    public m0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, true, true, 2, i6Var);
        this.l2 = new boolean[1];
        this.m2 = new boolean[1];
        this.Q2 = true;
        this.V2 = -1;
        int i7 = 3;
        this.X2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.Y2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e T1 = org.telegram.messenger.mp.u1(this.a).T1();
        this.s2 = T1;
        T1.b();
        T1.d = true;
        ImageView imageView = new ImageView(context);
        this.w2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
        this.p1.addView(imageView, c8.na.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.sa.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t2 = frameLayout;
        l0 l0Var = new l0(context, this.a, 0, false, i6Var);
        this.u2 = l0Var;
        l0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        l0Var.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(l0Var, d02, M, null, i6Var);
        int i12 = 28;
        l0Var.setRoundRadius(28);
        l0Var.a(R.drawable.outline_ai_translate2, org.telegram.messenger.gd.N0(2131754962, null), new f(this, i7));
        l0Var.a(R.drawable.menu_rewrite, org.telegram.messenger.gd.N0(2131754963, null), new f(this, i7));
        l0Var.a(R.drawable.menu_proofread, org.telegram.messenger.gd.N0(2131754964, null), new f(this, i7));
        l0Var.c(1, true);
        frameLayout.addView(l0Var, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x2 = frameLayout2;
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754055, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.a).A7.W.b).c, i6Var);
        this.y2 = l3Var;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        l3Var.setBackground(d03);
        org.telegram.ui.ActionBar.u6.j(l3Var, d03, M2, null, i6Var);
        j3Var.addTextChangedListener(new o(this));
        frameLayout2.addView(l3Var, c8.na.c(-2.0f, -1));
        int i13 = 0;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        j3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        l0 l0Var2 = new l0(context, this.a, 0, true, i6Var);
        this.v2 = l0Var2;
        l0Var2.setDivider(true);
        l0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        l0Var2.setRoundRadius(12);
        l0Var2.w = new hi.b5(this, i6Var, context, 1);
        E1();
        l0Var2.c(-1, true);
        String N0 = a31.N0();
        this.o2 = N0;
        if (N0 == null) {
            this.o2 = org.telegram.messenger.y00.j();
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.v1 = 0.35f;
        int i14 = org.telegram.ui.ActionBar.n6.a7;
        v0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.A2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, org.telegram.ui.ActionBar.n6.w0(i14, this.J0)), org.telegram.ui.ActionBar.n6.w0(i14, this.J0), org.telegram.ui.ActionBar.n6.w0(i14, this.J0)}));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.setRoundRadius(24);
        this.C2 = eVar;
        eVar.setScaleLoading(true);
        linearLayout.addView(eVar, c8.na.p(-1, 48, 1.0f, org.telegram.messenger.ks.E1));
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.D2 = g10;
        g10.setOnClickListener(new c(this, 10));
        g10.setOnLongClickListener(new m(this, i6Var, context, i13));
        linearLayout.addView(g10, c8.na.t(48, 48, 5, 10, 0, 0, 0));
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.B2 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.r1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new oi.i1(19, this, i6Var));
        FrameLayout.LayoutParams e10 = c8.na.e(-1, -2, 80);
        int i15 = e10.leftMargin;
        int i16 = this.u0;
        e10.leftMargin = i15 + i16;
        e10.rightMargin += i16;
        this.b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i17 = d.leftMargin;
        int i18 = this.u0;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.b.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.E2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.na.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i19 = d2.leftMargin;
        int i20 = this.u0;
        d2.leftMargin = i19 + i20;
        d2.rightMargin += i20;
        this.b.addView(frameLayout3, d2);
        B1(false);
        ek0 ek0Var = this.o1;
        int i21 = this.u0;
        ek0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(66.0f));
        this.o1.setClipToPadding(false);
        this.o1.r1();
        this.o1.setOnItemClickListener(new n(this, i13));
        this.J1 = true;
        q qVar = new q(this);
        qVar.m = false;
        qVar.C = false;
        qVar.o(kr.h);
        qVar.n(300L);
        this.o1.setItemAnimator(qVar);
        this.o1.setOnScrollListener(new bi.v1(this, i12));
        this.P2.O(false);
        org.telegram.messenger.g0.g3(new a(this, i13));
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.b4);
    }

    public static void e1(m0 m0Var, View view) {
        m0Var.r2 = !m0Var.r2;
        m0Var.t1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof lp) {
                ((lp) linearLayout.getChildAt(0)).a(m0Var.r2, true);
            }
        }
    }

    public static void f1(m0 m0Var, int i7) {
        l0 l0Var = m0Var.u2;
        if (l0Var.getSelectedTab() == i7) {
            return;
        }
        hi.u3 u3Var = m0Var.z2;
        if (u3Var != null) {
            u3Var.f(true);
        }
        l0Var.c(i7, true);
        m0Var.t1();
        m0Var.P2.O(true);
    }

    public static void g1(m0 m0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        l0 l0Var = m0Var.v2;
        hi.u3 u3Var = m0Var.z2;
        if (u3Var != null) {
            u3Var.f(true);
        }
        if (aiComposeTone instanceof i0) {
            l0Var.d(aiComposeTone, true);
            m0Var.P2.O(true);
            org.telegram.messenger.g0.h3(new a(m0Var, 3), 150L);
            return;
        }
        if (aiComposeTone == null) {
            ArrayList arrayList = m0Var.s2.b;
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) {
                    i7++;
                }
            }
            if (i7 + 1 > (org.telegram.messenger.i10.i(m0Var.a).q() ? ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(m0Var.a).A7.Y.b).c : ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(m0Var.a).A7.X.b).c)) {
                z1(new kc(m0Var.E2, m0Var.J0), m0Var.a);
                return;
            }
            h0 h0Var = new h0(m0Var.getContext(), m0Var.J0);
            h0Var.g2 = new f(m0Var, 1);
            h0Var.show();
            return;
        }
        if (l0Var.getSelectedTone() != aiComposeTone) {
            l0Var.d(aiComposeTone, true);
            m0Var.t1();
            m0Var.P2.O(true);
            return;
        }
        if (m0Var.W2 || m0Var.Y1) {
            m0Var.j1();
        }
        l0Var.c(-1, true);
        m0Var.Y1 = false;
        m0Var.Z1 = null;
        m0Var.a2 = null;
        m0Var.X2[1] = null;
        if (m0Var.q1() && r0.b(m0Var.a, m0Var.h2) != null) {
            r0.e(m0Var.a, m0Var.h2, null);
            dd ddVar = m0Var.S2;
            if (ddVar != null) {
                ddVar.run();
            }
        }
        m0Var.B1(true);
        m0Var.t1();
        m0Var.P2.O(true);
    }

    public static void l1(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            m1(pageBlock.text, sb2);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                m1(pageCaption.text, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                m1(richText, sb2);
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
                    m1(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (i10 > 0) {
                            sb2.append("\n");
                        }
                        l1(arrayList.get(i10), sb2);
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
                    m1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            sb2.append("\n");
                        }
                        l1(arrayList2.get(i12), sb2);
                    }
                }
            }
        }
    }

    public static void m1(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                m1(richText.text, sb2);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                m1(textconcat.texts.get(i7), sb2);
            }
        }
    }

    public static void n1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) oi.c6.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) oi.c6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) oi.c6.r(richText, null, true));
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
                    spannableStringBuilder.append((CharSequence) oi.c6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (i10 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        n1(arrayList.get(i10), spannableStringBuilder);
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
                    spannableStringBuilder.append((CharSequence) oi.c6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        n1(arrayList2.get(i12), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void z1(kc kcVar, int i7) {
        if (kcVar.X() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.mp.u1(i7).A7;
        boolean q10 = org.telegram.messenger.i10.i(i7).q();
        kcVar.I(!q10 ? R.raw.star_premium_2 : R.raw.error, org.telegram.messenger.gd.N0(2131754976, null), org.telegram.messenger.g0.T2(!q10 ? org.telegram.messenger.gd.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.X.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Y.b).c)) : org.telegram.messenger.gd.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.Y.b).c)), new ng(kcVar, 1))).j();
    }

    public final void A1() {
        SpannableStringBuilder spannableStringBuilder;
        if (q1()) {
            q0 b10 = r0.b(this.a, this.h2);
            q0 k12 = k1();
            if (b10 != null && k12 != null && (b10.f != k12.f || b10.a != k12.a || b10.b != k12.b || !TextUtils.equals(b10.c, k12.c) || !TL_aicompose.InputAiComposeTone.equals(r0.d(b10.d), r0.d(k12.d)) || !TextUtils.equals(b10.e, k12.e))) {
                r0.e(this.a, this.h2, k12);
                dd ddVar = this.S2;
                if (ddVar != null) {
                    ddVar.run();
                }
                b10 = k12;
            }
            int i7 = 0;
            boolean z10 = b10 != null;
            if (z10) {
                k12 = b10;
            }
            y yVar = this.R2;
            if (!yVar.L) {
                yVar.L = true;
                yVar.g("Always use in this chat", "", false, false, false);
            }
            if (k12 != null) {
                if (this.U2 == null) {
                    this.U2 = new z();
                }
                spannableStringBuilder = new SpannableStringBuilder("→");
                spannableStringBuilder.setSpan(this.U2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) k12.e);
            } else {
                spannableStringBuilder = null;
            }
            y yVar2 = this.R2;
            boolean z11 = yVar2.isLaidOut() && this.R2.isAttachedToWindow();
            if (spannableStringBuilder != null) {
                yVar2.getValueTextView().setText(spannableStringBuilder);
            }
            float f10 = spannableStringBuilder != null ? 1.0f : 0.0f;
            if (yVar2.N != f10 || (yVar2.O == null && yVar2.M != f10)) {
                yVar2.N = f10;
                ValueAnimator valueAnimator = yVar2.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    yVar2.O.cancel();
                    yVar2.O = null;
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(yVar2.M, f10);
                    yVar2.O = ofFloat;
                    ofFloat.addUpdateListener(new w(yVar2, i7));
                    yVar2.O.addListener(new x(yVar2, i7));
                    yVar2.O.setDuration(240L);
                    yVar2.O.setInterpolator(kr.h);
                    yVar2.O.start();
                } else {
                    yVar2.M = f10;
                    yVar2.requestLayout();
                }
            }
            this.R2.setChecked(z10);
        }
    }

    public final void B1(boolean z10) {
        boolean z11 = this.H2;
        int i7 = 2;
        int i10 = 1;
        hi.e eVar = this.C2;
        if (z11) {
            eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
            eVar.setOnClickListener(new c(this, r4));
        } else {
            l0 l0Var = this.u2;
            if ((l0Var != null ? l0Var.getSelectedTab() : 0) == 1 && (this.v2.getSelectedTone() instanceof i0) && !TextUtils.equals(this.y2.getText().toString(), this.G2)) {
                eVar.setText(org.telegram.messenger.gd.N0(2131754056, null));
                eVar.setOnClickListener(new c(this, i10));
            } else if (this.g2 == null && this.f2 == null) {
                eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
                eVar.setOnClickListener(new c(this, 3));
            } else {
                eVar.setText(org.telegram.messenger.gd.N0(2131755002, null));
                eVar.setOnClickListener(new c(this, i7));
            }
        }
        boolean z12 = this.W2;
        ch.k kVar = this.M2;
        if (kVar != null) {
            org.telegram.messenger.g0.r(kVar);
            this.M2 = null;
        }
        if (z12 != this.K2) {
            long max = z12 ? 150L : Math.max(0L, 300 - (SystemClock.uptimeMillis() - this.L2));
            ch.k kVar2 = new ch.k(22, this, z12);
            this.M2 = kVar2;
            if (max <= 0) {
                kVar2.run();
            } else {
                org.telegram.messenger.g0.h3(kVar2, max);
            }
        }
        if (z10 && this.J2 == this.I2) {
            return;
        }
        boolean z13 = this.I2;
        this.J2 = z13;
        LinearLayout linearLayout = this.A2;
        hi.e eVar2 = this.B2;
        if (!z10) {
            eVar2.setVisibility(z13 ? 0 : 8);
            eVar2.setAlpha(this.I2 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.I2 ? 8 : 0);
            linearLayout.setAlpha(this.I2 ? 0.0f : 1.0f);
            return;
        }
        eVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = eVar2.animate().alpha(this.I2 ? 1.0f : 0.0f);
        kr krVar = kr.h;
        alpha.setInterpolator(krVar).setDuration(320L).withEndAction(new a(this, i10)).start();
        linearLayout.animate().alpha(this.I2 ? 0.0f : 1.0f).setInterpolator(krVar).setDuration(320L).withEndAction(new a(this, i7)).start();
    }

    public final void C1() {
        String str = this.G2;
        org.telegram.ui.Cells.l3 l3Var = this.y2;
        boolean equals = TextUtils.equals(str, l3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.F2 == z10) {
            return;
        }
        ViewPropertyAnimator animate = l3Var.d.animate();
        this.F2 = z10;
        org.telegram.messenger.m10.n(animate, !equals ? 1.0f : 0.5f, 320L);
        this.P2.O(true);
    }

    public final void D1() {
        ek0 ek0Var;
        View view;
        if (this.z2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                view = null;
                break;
            }
            view = ek0Var.getChildAt(i7);
            n41 G = this.P2.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.v2) {
                break;
            } else {
                i7++;
            }
        }
        if (view == null) {
            this.z2.setVisibility(4);
            this.z2.f(true);
        } else {
            this.z2.setVisibility(0);
            this.z2.setTranslationY(view.getY() + ek0Var.getY() + view.getHeight());
        }
    }

    public final void E1() {
        l0 l0Var = this.v2;
        TL_aicompose.AiComposeTone selectedTone = l0Var.getSelectedTone();
        l0Var.c.removeAllViews();
        if (r1()) {
            l0Var.b(new i0(), new f(this, 0));
        }
        l0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.s2.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            l0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != l0Var.getSelectedTone()) {
            l0Var.d(null, true);
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, 0, true, new d(this, 0), this.J0);
        this.P2 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        if (this.N2 == null) {
            this.N2 = org.telegram.messenger.gd.N0(2131755006, null);
            nh0 nh0Var = new nh0(R.raw.emoji_stars, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.O2 = nh0Var;
            nh0Var.J(true);
            this.O2.K(1);
        }
        return this.N2;
    }

    @Override // org.telegram.ui.Components.ra
    public final void R0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.w2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.b4) {
            E1();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.b4);
        org.telegram.messenger.e eVar = this.s2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.Components.ra, org.telegram.ui.ActionBar.w2
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.A2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1(x60 x60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        int i10 = org.telegram.ui.ActionBar.n6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.n6.w0(i7, this.J0), org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(i7, this.J0)));
        y0Var.setOnClickListener(new l(x60Var, z10, runnable, 0));
        linearLayout.addView(y0Var, c8.na.o(-1, -2));
    }

    public final TLRPC.TL_messages_composeMessageWithAI i1(int i7) {
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        if (i7 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.y00.D(this.o2);
            TL_aicompose.AiComposeTone aiComposeTone = this.q2;
            tL_messages_composeMessageWithAI.tone = aiComposeTone != null ? TL_aicompose.InputAiComposeTone.from(aiComposeTone) : TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.r2;
            return tL_messages_composeMessageWithAI;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            return tL_messages_composeMessageWithAI;
        }
        TL_aicompose.AiComposeTone selectedTone = this.v2.getSelectedTone();
        if (selectedTone instanceof i0) {
            TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
            inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.G2) ? "" : this.G2;
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
        tL_messages_composeMessageWithAI.emojify = this.r2;
        return tL_messages_composeMessageWithAI;
    }

    public final void j1() {
        if (this.V2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.V2, true);
            this.V2 = -1;
        }
        this.W2 = false;
        org.telegram.ui.ActionBar.n5 titleTextView = this.p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final q0 k1() {
        l0 l0Var = this.u2;
        if (l0Var == null) {
            return null;
        }
        int selectedTab = l0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI i12 = i1(selectedTab);
        boolean z10 = i12.proofread;
        if (!z10 && i12.translate_to_lang == null && i12.tone == null) {
            return null;
        }
        TL_aicompose.InputAiComposeTone inputAiComposeTone = i12.tone;
        if (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse) {
            return null;
        }
        q0 q0Var = new q0();
        q0Var.f = selectedTab;
        q0Var.a = z10;
        q0Var.b = i12.emojify;
        q0Var.c = i12.translate_to_lang;
        q0Var.d = inputAiComposeTone;
        if (selectedTab == 0) {
            String L0 = a31.L0(a31.P0(this.o2, null, null));
            if (this.p2 != null) {
                L0 = p5.c.m(this.p2, " ", L0, new StringBuilder());
            }
            q0Var.e = L0;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.v2.getSelectedTone();
            q0Var.e = ((selectedTone instanceof i0) || selectedTone == null || TextUtils.isEmpty(selectedTone.title)) ? org.telegram.messenger.gd.N0(2131754963, null) : selectedTone.title;
        } else {
            q0Var.e = org.telegram.messenger.gd.N0(2131754964, null);
        }
        if (q0Var.b) {
            q0Var.e = a8.p0.s(new StringBuilder(), q0Var.e, " + Emoji");
        }
        return q0Var;
    }

    public final TL_iv.RichMessage o1() {
        if (this.W2) {
            return null;
        }
        int selectedTab = this.u2.getSelectedTab();
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

    public final CharSequence p1() {
        if (r1()) {
            TL_iv.RichMessage o12 = o1();
            if (o12 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < o12.blocks.size(); i7++) {
                if (i7 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                n1(o12.blocks.get(i7), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.W2) {
            return null;
        }
        int selectedTab = this.u2.getSelectedTab();
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

    public final boolean q1() {
        return (this.R2 == null || this.j2 == null || this.i2 || r1() || this.h2 == 0) ? false : true;
    }

    public final boolean r1() {
        return this.U1 != null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
            if (w02 != this.Z2) {
                this.Z2 = w02;
                v0(w02);
                this.A2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final n41 s1(int i7, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U1;
        }
        int i10 = org.telegram.messenger.tt.b;
        n41 K = n41.K(org.telegram.messenger.tt.class);
        K.H = richMessage;
        K.d = i7;
        K.e = z10;
        return K;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        String str;
        l0 l0Var;
        super.show();
        ma maVar = this.p1;
        if (maVar != null) {
            maVar.setTitle(P0());
        }
        int i7 = (this.i2 || (this.k2 == null && this.j2 == null)) ? 8 : 0;
        hi.e eVar = this.D2;
        eVar.setVisibility(i7);
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131745444, null));
        kq kqVar = new kq(this.i2 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        kqVar.s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
        eVar.setText(spannableStringBuilder);
        if (!this.T2 && q1()) {
            this.T2 = true;
            q0 b10 = r0.b(this.a, this.h2);
            if (b10 != null) {
                int i10 = b10.f;
                l0 l0Var2 = this.u2;
                if (i10 == 1) {
                    TL_aicompose.AiComposeTone a10 = r0.a(this.a, b10.d);
                    if (a10 != null && (l0Var = this.v2) != null) {
                        this.r2 = b10.b;
                        l0Var2.c(1, false);
                        l0Var.d(a10, false);
                    }
                } else if (i10 == 0 && (str = b10.c) != null) {
                    this.r2 = b10.b;
                    this.o2 = str;
                    TL_aicompose.AiComposeTone a11 = r0.a(this.a, b10.d);
                    this.q2 = a11;
                    if (a11 != null && !TextUtils.isEmpty(a11.title)) {
                        str2 = this.q2.title;
                    }
                    this.p2 = str2;
                    l0Var2.c(0, false);
                } else if (i10 == 2) {
                    l0Var2.c(2, false);
                }
            }
        }
        this.P2.O(false);
        t1();
        B1(true);
    }

    public final void t1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        A1();
        boolean r12 = r1();
        ma maVar = this.p1;
        l0 l0Var = this.u2;
        int i7 = 1;
        if (!r12) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.T1};
            tL_textWithEntities.entities = org.telegram.messenger.ri.d0(this.a).Y(charSequenceArr, true, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 != null ? charSequence4.toString() : "";
            int selectedTab = l0Var.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI i12 = i1(selectedTab);
            i12.text = tL_textWithEntities;
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = this.X2[selectedTab];
            if (tL_messages_composeMessageWithAI != null && tL_messages_composeMessageWithAI.proofread == i12.proofread && tL_messages_composeMessageWithAI.emojify == i12.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI.tone, i12.tone) && TextUtils.equals(tL_messages_composeMessageWithAI.translate_to_lang, i12.translate_to_lang)) {
                return;
            }
            if (i12.emojify || i12.proofread || i12.tone != null || i12.translate_to_lang != null) {
                this.W2 = true;
                this.H2 = false;
                B1(true);
                org.telegram.ui.ActionBar.n5 titleTextView = maVar.getTitleTextView();
                titleTextView.i(this.O2);
                this.O2.start();
                int selectedTab2 = l0Var.getSelectedTab();
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
                int i10 = this.u0;
                int b10 = c8.m9.b(new StaticLayout(charSequence6, textPaint, (L - i10) - i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < b10; i11++) {
                    if (i11 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131748586, null));
                    o80 o80Var = new o80(null, L2, 0, null);
                    o80Var.f = org.telegram.messenger.g0.L(6.0f);
                    o80Var.h = 0.5f;
                    o80Var.n = true;
                    spannableStringBuilder.setSpan(o80Var, length, spannableStringBuilder.length(), 33);
                }
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
                this.V2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(i12, new d3.b(i7), new di.j0(this, titleTextView, selectedTab, i12, 5));
                this.P2.O(true);
                return;
            }
            return;
        }
        int selectedTab3 = l0Var.getSelectedTab();
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.U1;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i13 = 0; i13 < richMessage.blocks.size(); i13++) {
                tL_inputRichMessage.blocks.add(org.telegram.messenger.zy.y0(richMessage.blocks.get(i13)));
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
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            str = null;
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
            tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.y00.D(this.o2);
            TL_aicompose.AiComposeTone aiComposeTone = this.q2;
            tL_messages_composeRichMessageWithAI.tone = aiComposeTone != null ? TL_aicompose.InputAiComposeTone.from(aiComposeTone) : TL_aicompose.InputAiComposeTone.fromDefault(str);
            tL_messages_composeRichMessageWithAI.emojify = this.r2;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.v2.getSelectedTone();
            if (selectedTone instanceof i0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.G2) ? "" : this.G2;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                inputaicomposetoneid.id = tL_aiComposeTone.id;
                inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
            }
            tL_messages_composeRichMessageWithAI.emojify = this.r2;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.Y2[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.W2 = true;
            this.H2 = false;
            B1(true);
            org.telegram.ui.ActionBar.n5 titleTextView2 = maVar.getTitleTextView();
            titleTextView2.i(this.O2);
            this.O2.start();
            if (selectedTab3 == 0) {
                this.V1 = true;
            } else if (selectedTab3 == 1) {
                this.Y1 = true;
            } else if (selectedTab3 == 2) {
                this.b2 = true;
            }
            this.V2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(i7), new di.j0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 6));
            this.P2.O(true);
        }
    }

    public final void u1(int i7, int i10, boolean z10) {
        if (this.k2 != null) {
            TL_iv.RichMessage o12 = o1();
            if (o12 != null) {
                this.k2.a(o12, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        if (this.j2 == null || p1() == null) {
            return;
        }
        this.j2.a(p1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public final void v1(long j3, boolean z10, org.telegram.messenger.t10 t10Var) {
        this.h2 = j3;
        this.i2 = z10;
        this.j2 = t10Var;
        if (this.R2 != null) {
            return;
        }
        y yVar = new y(21, getContext(), this.J0, false);
        this.R2 = yVar;
        Switch checkBox = yVar.getCheckBox();
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        checkBox.d(i7, i10, i11, i11);
        this.R2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j6, this.J0), 2, -1));
        this.R2.setOnClickListener(new c(this, 4));
    }

    public final void w1(TL_iv.RichMessage richMessage) {
        this.U1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            l1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.c6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.cr(9), false);
        E1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(CharSequence charSequence) {
        String str;
        int i7 = 8;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {fz0.class, qi.g.class, pu0.class, u41.class, t41.class, q41.class, r41.class, k00.class, p41.class, o41.class, x5.class};
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
        org.telegram.messenger.c6.d(charSequence.toString(), new b(this, 0), new org.telegram.ui.cr(i7), false);
    }

    public final void y1(TL_aicompose.AiComposeTone aiComposeTone) {
        this.q2 = aiComposeTone;
        this.p2 = (aiComposeTone == null || TextUtils.isEmpty(aiComposeTone.title)) ? null : aiComposeTone.title;
        j1();
        t1();
        this.P2.O(true);
    }
}
