package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f0 extends ma implements org.telegram.messenger.ls {
    public final fi.d A2;
    public final FrameLayout B2;
    public boolean C2;
    public String D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public String H2;
    public zg0 I2;
    public m41 J2;
    public boolean K2;
    public int L2;
    public boolean M2;
    public final TLRPC.TL_messages_composeMessageWithAI[] N2;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] O2;
    public int P2;
    public CharSequence S1;
    public TL_iv.RichMessage T1;
    public boolean U1;
    public CharSequence V1;
    public TL_iv.RichMessage W1;
    public boolean X1;
    public CharSequence Y1;
    public TL_iv.RichMessage Z1;
    public boolean a2;
    public CharSequence b2;
    public TL_iv.RichMessage c2;
    public CharSequence d2;
    public org.telegram.messenger.c20 e2;
    public org.telegram.messenger.c20 f2;
    public long g2;
    public boolean h2;
    public org.telegram.messenger.z10 i2;
    public ld j2;
    public final boolean[] k2;
    public final boolean[] l2;
    public String m2;
    public String n2;
    public boolean o2;
    public final org.telegram.messenger.e p2;
    public final FrameLayout q2;
    public final e0 r2;
    public final e0 s2;
    public final ImageView t2;
    public final FrameLayout u2;
    public final org.telegram.ui.Cells.k3 v2;
    public fi.m3 w2;
    public final LinearLayout x2;
    public final fi.d y2;
    public final fi.d z2;

    public f0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, 2, h6Var);
        this.k2 = new boolean[1];
        this.l2 = new boolean[1];
        this.K2 = true;
        this.L2 = -1;
        int i7 = 3;
        this.N2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.O2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        org.telegram.messenger.e R1 = org.telegram.messenger.qp.s1(this.a).R1();
        this.p2 = R1;
        R1.b();
        R1.d = true;
        ImageView imageView = new ImageView(context);
        this.t2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.o1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q2 = frameLayout;
        int i11 = 0;
        e0 e0Var = new e0(this.a, context, h6Var, false);
        this.r2 = e0Var;
        e0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        int L = org.telegram.messenger.g0.L(28.0f);
        int i12 = org.telegram.ui.ActionBar.m6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        e0Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(e0Var, d02, M, null, h6Var);
        e0Var.setRoundRadius(28);
        e0Var.a(R.drawable.outline_ai_translate2, org.telegram.messenger.id.M0(2131754962, null), new f(this, i7));
        e0Var.a(R.drawable.menu_rewrite, org.telegram.messenger.id.M0(2131754963, null), new f(this, i7));
        e0Var.a(R.drawable.menu_proofread, org.telegram.messenger.id.M0(2131754964, null), new f(this, i7));
        e0Var.c(1);
        frameLayout.addView(e0Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.u2 = frameLayout2;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.a).x7.R.b).c, h6Var);
        this.v2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        k3Var.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(k3Var, d03, M2, null, h6Var);
        i3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(k3Var, c8.ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        i3Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(15.0f));
        e0 e0Var2 = new e0(this.a, context, h6Var, true);
        this.s2 = e0Var2;
        e0Var2.setDivider(true);
        e0Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e0Var2.setRoundRadius(12);
        e0Var2.n = new fi.u4(this, h6Var, context, 1);
        x1();
        e0Var2.c(-1);
        String M0 = k21.M0();
        this.n2 = M0;
        if (M0 == null) {
            this.n2 = org.telegram.messenger.f10.j();
        }
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.u1 = 0.35f;
        int i13 = org.telegram.ui.ActionBar.m6.a7;
        v0(org.telegram.ui.ActionBar.m6.w0(i13, this.I0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.x2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i13, this.I0)), org.telegram.ui.ActionBar.m6.w0(i13, this.I0), org.telegram.ui.ActionBar.m6.w0(i13, this.I0)}));
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.setRoundRadius(24);
        this.z2 = dVar;
        linearLayout.addView(dVar, c8.ha.p(-1, 48, 1.0f, org.telegram.messenger.qs.E1));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.A2 = h;
        h.setOnClickListener(new c(this, 9));
        h.setOnLongClickListener(new i(this, h6Var, context, i11));
        linearLayout.addView(h, c8.ha.t(48, 48, 5, 10, 0, 0, 0));
        fi.d h7 = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.y2 = h7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new kg.o1(), length, spannableStringBuilder.length(), 33);
        h7.setText(spannableStringBuilder);
        h7.setOnClickListener(new org.telegram.ui.ActionBar.l1(17, this, h6Var));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.t0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.b.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i16 = d.leftMargin;
        int i17 = this.t0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(h7, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.B2 = frameLayout3;
        FrameLayout.LayoutParams d2 = c8.ha.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i18 = d2.leftMargin;
        int i19 = this.t0;
        d2.leftMargin = i18 + i19;
        d2.rightMargin += i19;
        this.b.addView(frameLayout3, d2);
        u1(false);
        pj0 pj0Var = this.n1;
        int i20 = this.t0;
        pj0Var.setPadding(i20, 0, i20, org.telegram.messenger.g0.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new j(this, i11));
        this.I1 = true;
        n nVar = new n(this);
        nVar.m = false;
        nVar.C = false;
        nVar.o(wq.h);
        nVar.n(350L);
        this.n1.setItemAnimator(nVar);
        this.n1.setOnScrollListener(new ai.b(this, 25));
        this.J2.O(false);
        org.telegram.messenger.g0.h3(new a(this, i11));
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.Y3);
    }

    public static void d1(f0 f0Var, View view) {
        f0Var.o2 = !f0Var.o2;
        f0Var.p1();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof wo) {
                ((wo) linearLayout.getChildAt(0)).a(f0Var.o2, true);
            }
        }
    }

    public static void e1(f0 f0Var, int i7) {
        e0 e0Var = f0Var.r2;
        if (e0Var.getSelectedTab() == i7) {
            return;
        }
        fi.m3 m3Var = f0Var.w2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        e0Var.c(i7);
        f0Var.p1();
        f0Var.J2.O(true);
    }

    public static void f1(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        e0 e0Var = f0Var.s2;
        fi.m3 m3Var = f0Var.w2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (aiComposeTone instanceof a0) {
            e0Var.d(aiComposeTone);
            f0Var.J2.O(true);
            org.telegram.messenger.g0.i3(new a(f0Var, 3), 150L);
            return;
        }
        if (aiComposeTone != null) {
            if (e0Var.getSelectedTone() == aiComposeTone) {
                return;
            }
            e0Var.d(aiComposeTone);
            f0Var.p1();
            f0Var.J2.O(true);
            return;
        }
        ArrayList arrayList = f0Var.p2.b;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) {
                i7++;
            }
        }
        if (i7 + 1 > (org.telegram.messenger.p10.i(f0Var.a).q() ? ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(f0Var.a).x7.T.b).c : ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(f0Var.a).x7.S.b).c)) {
            t1(new gc(f0Var.B2, f0Var.I0), f0Var.a);
            return;
        }
        z zVar = new z(f0Var.getContext(), f0Var.I0);
        zVar.f2 = new f(f0Var, 1);
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
            spannableStringBuilder.append((CharSequence) li.c6.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) li.c6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) li.c6.r(richText, null, true));
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
                    spannableStringBuilder.append((CharSequence) li.c6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                    spannableStringBuilder.append((CharSequence) li.c6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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

    public static void t1(gc gcVar, int i7) {
        if (gcVar.W() == null) {
            return;
        }
        org.telegram.messenger.p0 p0Var = org.telegram.messenger.qp.s1(i7).x7;
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        gcVar.I(!q10 ? R.raw.star_premium_2 : R.raw.error, org.telegram.messenger.id.M0(2131754976, null), org.telegram.messenger.g0.U2(!q10 ? org.telegram.messenger.id.a0(null, null, 2131754977, Integer.valueOf(((org.telegram.messenger.j0) p0Var.S.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.b).c)) : org.telegram.messenger.id.a0(null, null, 2131754978, Integer.valueOf(((org.telegram.messenger.j0) p0Var.T.b).c)), new wf(gcVar, 1))).j();
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new d(this, 0), this.I0);
        this.J2 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        if (this.H2 == null) {
            this.H2 = org.telegram.messenger.id.M0(2131755006, null);
            zg0 zg0Var = new zg0(R.raw.emoji_stars, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            this.I2 = zg0Var;
            zg0Var.J(true);
            this.I2.K(1);
        }
        return this.H2;
    }

    @Override // org.telegram.ui.Components.ma
    public final void Q0(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.t2;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Y3) {
            x1();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.Y3);
        org.telegram.messenger.e eVar = this.p2;
        if (eVar != null) {
            eVar.d = false;
        }
        super.dismiss();
    }

    public final void g1(k60 k60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new h(k60Var, z9, runnable, 0));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.w2
    public final void h0() {
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        LinearLayout linearLayout = this.x2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void h1() {
        if (this.L2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.L2, true);
            this.L2 = -1;
        }
        this.M2 = false;
        org.telegram.ui.ActionBar.m5 titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final TL_iv.RichMessage l1() {
        if (this.M2) {
            return null;
        }
        int selectedTab = this.r2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.U1) {
                return null;
            }
            return this.W1;
        }
        if (selectedTab == 2) {
            if (this.a2) {
                return null;
            }
            return this.c2;
        }
        if (this.X1) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.Z1;
        return richMessage == null ? this.T1 : richMessage;
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
        if (this.M2) {
            return null;
        }
        int selectedTab = this.r2.getSelectedTab();
        if (selectedTab == 0) {
            if (this.U1) {
                return null;
            }
            return this.V1;
        }
        if (selectedTab == 2) {
            if (this.a2) {
                return null;
            }
            return this.d2;
        }
        if (this.X1) {
            return null;
        }
        CharSequence charSequence = this.Y1;
        return charSequence == null ? this.S1 : charSequence;
    }

    public final boolean n1() {
        return this.T1 != null;
    }

    public final x31 o1(int i7, TL_iv.RichMessage richMessage, boolean z9) {
        if (richMessage == null) {
            richMessage = this.T1;
        }
        int i10 = org.telegram.messenger.zt.b;
        x31 K = x31.K(org.telegram.messenger.zt.class);
        K.G = richMessage;
        K.d = i7;
        K.e = z9;
        return K;
    }

    public final void p1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean n1 = n1();
        ia iaVar = this.o1;
        e0 e0Var = this.s2;
        e0 e0Var2 = this.r2;
        if (!n1) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.S1};
            tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = e0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.n2);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.o2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.D2) ? "" : this.D2;
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
                tL_messages_composeMessageWithAI.emojify = this.o2;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.N2[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.M2 = true;
                this.E2 = false;
                u1(true);
                org.telegram.ui.ActionBar.m5 titleTextView = iaVar.getTitleTextView();
                titleTextView.i(this.I2);
                this.I2.start();
                int selectedTab2 = e0Var2.getSelectedTab();
                CharSequence charSequence5 = this.S1;
                if (selectedTab2 == 0 && (charSequence3 = this.V1) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.Y1) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.b2) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(64.0f);
                int i7 = this.t0;
                int b10 = c8.j9.b(new StaticLayout(charSequence6, textPaint, (L - i7) - i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < b10; i10++) {
                    if (i10 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int L2 = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748779, null));
                    b80 b80Var = new b80(null, L2, 0, null);
                    b80Var.f = org.telegram.messenger.g0.L(6.0f);
                    b80Var.h = 0.5f;
                    b80Var.n = true;
                    spannableStringBuilder.setSpan(b80Var, length, spannableStringBuilder.length(), 33);
                }
                int i11 = 1;
                if (selectedTab == 0) {
                    this.U1 = true;
                    this.V1 = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.X1 = true;
                    this.Y1 = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.a2 = true;
                    this.b2 = spannableStringBuilder;
                }
                this.L2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(i11), new bi.v0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 5));
                this.J2.O(true);
                return;
            }
            return;
        }
        int selectedTab3 = e0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.T1;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i12 = 0; i12 < richMessage.blocks.size(); i12++) {
                tL_inputRichMessage.blocks.add(org.telegram.messenger.gz.y0(richMessage.blocks.get(i12)));
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
            tL_messages_composeRichMessageWithAI.translate_to_lang = org.telegram.messenger.f10.D(this.n2);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.o2;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = e0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.D2) ? str : this.D2;
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
            tL_messages_composeRichMessageWithAI.emojify = this.o2;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.O2[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            int i15 = 1;
            this.M2 = true;
            this.E2 = false;
            u1(true);
            org.telegram.ui.ActionBar.m5 titleTextView2 = iaVar.getTitleTextView();
            titleTextView2.i(this.I2);
            this.I2.start();
            if (selectedTab3 == 0) {
                this.U1 = true;
            } else if (selectedTab3 == 1) {
                this.X1 = true;
            } else if (selectedTab3 == 2) {
                this.a2 = true;
            }
            this.L2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new d3.b(i15), new bi.v0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 6));
            this.J2.O(true);
        }
    }

    public final void q1(int i7, int i10, boolean z9) {
        if (this.j2 != null) {
            TL_iv.RichMessage l1 = l1();
            if (l1 != null) {
                this.j2.a(l1, Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
                return;
            }
            return;
        }
        if (this.i2 == null || m1() == null) {
            return;
        }
        this.i2.a(m1(), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    public final void r1(Editable editable) {
        ?? spannableStringBuilder;
        int i7 = 3;
        int i10 = 0;
        if (com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {vy0.class, ni.j.class, fu0.class, e41.class, d41.class, a41.class, b41.class, zz.class, z31.class, y31.class, q5.class};
            for (int i11 = 0; i11 < 11; i11++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i11])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            spannableStringBuilder = editable.toString();
        }
        this.S1 = spannableStringBuilder;
        org.telegram.messenger.b6.d(editable.toString(), new b(this, i10), new org.telegram.ui.cr(i7), false);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0);
            if (w02 != this.P2) {
                this.P2 = w02;
                v0(w02);
                this.x2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        this.T1 = richMessage;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
            if (i7 > 0) {
                sb2.append("\n");
            }
            i1(richMessage.blocks.get(i7), sb2);
        }
        org.telegram.messenger.b6.d(sb2.toString(), new b(this, 1), new org.telegram.ui.cr(4), false);
        x1();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        ia iaVar = this.o1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        int i7 = (this.h2 || (this.j2 == null && this.i2 == null)) ? 8 : 0;
        fi.d dVar = this.A2;
        dVar.setVisibility(i7);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131745640, null));
        wp wpVar = new wp(this.h2 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        wpVar.s = org.telegram.messenger.g0.L(1.0f);
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.J2.O(false);
        p1();
        u1(true);
    }

    public final void u1(boolean z9) {
        boolean z10 = this.E2;
        int i7 = 2;
        int i10 = 1;
        fi.d dVar = this.z2;
        if (z10) {
            dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
            dVar.setOnClickListener(new c(this, r5));
        } else {
            e0 e0Var = this.r2;
            if ((e0Var != null ? e0Var.getSelectedTab() : 0) == 1 && (this.s2.getSelectedTone() instanceof a0) && !TextUtils.equals(this.v2.getText().toString(), this.D2)) {
                dVar.setText(org.telegram.messenger.id.M0(2131754059, null));
                dVar.setOnClickListener(new c(this, i10));
            } else if (this.f2 == null && this.e2 == null) {
                dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(org.telegram.messenger.id.M0(2131755002, null));
                dVar.setOnClickListener(new c(this, i7));
            }
        }
        dVar.setLoading(this.M2);
        if (z9 && this.G2 == this.F2) {
            return;
        }
        boolean z11 = this.F2;
        this.G2 = z11;
        LinearLayout linearLayout = this.x2;
        fi.d dVar2 = this.y2;
        if (!z9) {
            dVar2.setVisibility(z11 ? 0 : 8);
            dVar2.setAlpha(this.F2 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.F2 ? 8 : 0);
            linearLayout.setAlpha(this.F2 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = dVar2.animate().alpha(this.F2 ? 1.0f : 0.0f);
        wq wqVar = wq.h;
        alpha.setInterpolator(wqVar).setDuration(320L).withEndAction(new a(this, i10)).start();
        linearLayout.animate().alpha(this.F2 ? 0.0f : 1.0f).setInterpolator(wqVar).setDuration(320L).withEndAction(new a(this, i7)).start();
    }

    public final void v1() {
        String str = this.D2;
        org.telegram.ui.Cells.k3 k3Var = this.v2;
        boolean equals = TextUtils.equals(str, k3Var.d.getText().toString());
        boolean z9 = !equals;
        if (this.C2 == z9) {
            return;
        }
        ViewPropertyAnimator animate = k3Var.d.animate();
        this.C2 = z9;
        org.telegram.messenger.camera.q.k(animate, !equals ? 1.0f : 0.5f, 320L);
        this.J2.O(true);
    }

    public final void w1() {
        pj0 pj0Var;
        View view;
        if (this.w2 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            pj0Var = this.n1;
            if (i7 >= pj0Var.getChildCount()) {
                view = null;
                break;
            }
            view = pj0Var.getChildAt(i7);
            x31 G = this.J2.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.s2) {
                break;
            } else {
                i7++;
            }
        }
        if (view == null) {
            this.w2.setVisibility(4);
            this.w2.f(true);
        } else {
            this.w2.setVisibility(0);
            this.w2.setTranslationY(view.getY() + pj0Var.getY() + view.getHeight());
        }
    }

    public final void x1() {
        e0 e0Var = this.s2;
        TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
        e0Var.c.removeAllViews();
        if (n1()) {
            e0Var.b(new a0(), new f(this, 0));
        }
        e0Var.b(null, new f(this, 0));
        ArrayList arrayList = this.p2.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e0Var.b((TL_aicompose.AiComposeTone) obj, new f(this, 0));
        }
        if (selectedTone != e0Var.getSelectedTone()) {
            e0Var.d(null);
        }
    }
}
