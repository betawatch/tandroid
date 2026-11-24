// default package

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
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a1 extends fy0 implements gk7 {
    public final u41 A2;
    public final u41 B2;
    public final u41 C2;
    public final FrameLayout D2;
    public boolean E2;
    public String F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public long K2;
    public x6c L2;
    public String M2;
    public oy8 N2;
    public l5c O2;
    public boolean P2;
    public h0 Q2;
    public uv1 R2;
    public CharSequence S1;
    public boolean S2;
    public TL_iv.RichMessage T1;
    public i0 T2;
    public boolean U1;
    public int U2;
    public CharSequence V1;
    public boolean V2;
    public TL_iv.RichMessage W1;
    public final TLRPC.TL_messages_composeMessageWithAI[] W2;
    public boolean X1;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] X2;
    public CharSequence Y1;
    public int Y2;
    public TL_iv.RichMessage Z1;
    public boolean a2;
    public CharSequence b2;
    public TL_iv.RichMessage c2;
    public CharSequence d2;
    public p8c e2;
    public p8c f2;
    public long g2;
    public boolean h2;
    public m8c i2;
    public wv1 j2;
    public final boolean[] k2;
    public final boolean[] l2;
    public String m2;
    public String n2;
    public String o2;
    public TL_aicompose.AiComposeTone p2;
    public boolean q2;
    public final ic r2;
    public final FrameLayout s2;
    public final z0 t2;
    public final z0 u2;
    public final ImageView v2;
    public final FrameLayout w2;
    public final it3 x2;
    public je5 y2;
    public final LinearLayout z2;

    public a1(Context context, wjb wjbVar) {
        super(context, null, true, true, 2, wjbVar);
        this.k2 = new boolean[1];
        this.l2 = new boolean[1];
        this.P2 = true;
        this.U2 = -1;
        byte b = 3;
        this.W2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.X2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        ic O1 = na7.q1(this.a).O1();
        this.r2 = O1;
        O1.b();
        O1.d = true;
        ImageView imageView = new ImageView(context);
        this.v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = bkb.F6;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_ATOP);
        ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.v0(i, this.J0)), 1, -1);
        vkb K = zkb.K(0.1f, i);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, K, wjbVar);
        this.o1.addView(imageView, nme.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ote.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new d(this, (byte) 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s2 = frameLayout;
        z0 z0Var = new z0(context, this.a, 0, false, wjbVar);
        this.t2 = z0Var;
        z0Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        int L = gl.L(28.0f);
        int i2 = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        z0Var.setBackground(b0);
        zkb.j(z0Var, b0, M, null, wjbVar);
        z0Var.setRoundRadius(28);
        z0Var.a(R.drawable.outline_ai_translate2, k96.M0(2131754962, null), new h(this, b));
        z0Var.a(R.drawable.menu_rewrite, k96.M0(2131754963, null), new h(this, b));
        z0Var.a(R.drawable.menu_proofread, k96.M0(2131754964, null), new h(this, b));
        z0Var.c(1, true);
        frameLayout.addView(z0Var, nme.d(-1, -1.0f, kk7.D1, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w2 = frameLayout2;
        it3 it3Var = new it3(context, k96.M0(2131754055, null), true, false, na7.q1(this.a).k4.V.f(), wjbVar);
        this.x2 = it3Var;
        ht3 ht3Var = it3Var.d;
        ht3Var.setImeOptions(6);
        ht3Var.setMaxLines(5);
        ShapeDrawable b02 = bkb.b0(gl.L(20.0f), bkb.v0(i2, wjbVar));
        vkb M2 = zkb.M(i2);
        it3Var.setBackground(b02);
        zkb.j(it3Var, b02, M2, null, wjbVar);
        ht3Var.addTextChangedListener(new v(this));
        frameLayout2.addView(it3Var, nme.c(-2.0f, -1));
        byte b2 = 0;
        frameLayout2.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        ht3Var.setPadding(gl.L(11.0f), gl.L(15.0f), gl.L(53.0f), gl.L(15.0f));
        z0 z0Var2 = new z0(context, this.a, 0, true, wjbVar);
        this.u2 = z0Var2;
        z0Var2.setDivider(true);
        z0Var2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        z0Var2.setRoundRadius(12);
        z0Var2.w = new r(this, wjbVar, context, b2);
        v1();
        z0Var2.c(-1, true);
        String G0 = rzb.G0();
        this.n2 = G0;
        if (G0 == null) {
            this.n2 = b1c.i();
        }
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        this.u1 = 0.35f;
        int i3 = bkb.Z6;
        s0(bkb.v0(i3, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.z2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, bkb.v0(i3, this.J0)), bkb.v0(i3, this.J0), bkb.v0(i3, this.J0)}));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setRoundRadius(24);
        this.B2 = u41Var;
        u41Var.setScaleLoading(true);
        linearLayout.addView(u41Var, nme.p(-1, 48, 1.0f, kk7.D1));
        u41 i4 = yjb.i(24, wjbVar, context, true);
        this.C2 = i4;
        i4.setOnClickListener(new d(this, (byte) 10));
        i4.setOnLongClickListener(new s(this, wjbVar, context, b2));
        linearLayout.addView(i4, nme.t(48, 48, 5, 10, 0, 0, 0));
        u41 i5 = yjb.i(24, wjbVar, context, true);
        this.A2 = i5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new s0(), length, spannableStringBuilder.length(), 33);
        i5.setText(spannableStringBuilder);
        i5.setOnClickListener(new t(this, wjbVar, b2));
        FrameLayout.LayoutParams e = nme.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(linearLayout, e);
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(i5, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D2 = frameLayout3;
        FrameLayout.LayoutParams d2 = nme.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i10 = d2.leftMargin;
        int i11 = this.u0;
        d2.leftMargin = i10 + i11;
        d2.rightMargin += i11;
        this.b.addView(frameLayout3, d2);
        s1(false);
        o39 o39Var = this.n1;
        int i12 = this.u0;
        o39Var.setPadding(i12, 0, i12, gl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, b2));
        this.I1 = true;
        x xVar = new x(this);
        xVar.m = false;
        xVar.C = false;
        xVar.o(s33.h);
        xVar.n(300L);
        this.n1.setItemAnimator(xVar);
        this.n1.setOnScrollListener(new y(this, b2));
        this.O2.O(false);
        gl.d3(new a(this, b2));
        kk7.f(this.a).b(this, kk7.a4);
    }

    public static void c1(TL_iv.PageBlock pageBlock, StringBuilder sb) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            d1(pageBlock.text, sb);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                d1(pageCaption.text, sb);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                d1(richText, sb);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i = 0; i < pageblocklist.items.size(); i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    d1(((TL_iv.TL_pageListItemText) pageListItem).text, sb);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (i2 > 0) {
                            sb.append("\n");
                        }
                        c1(arrayList.get(i2), sb);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                if (i3 > 0) {
                    sb.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    d1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        if (i4 > 0) {
                            sb.append("\n");
                        }
                        c1(arrayList2.get(i4), sb);
                    }
                }
            }
        }
    }

    public static void d1(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                d1(richText.text, sb);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                d1(textconcat.texts.get(i), sb);
            }
        }
    }

    public static void e1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) yi9.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) yi9.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) yi9.r(richText, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i = 0; i < pageblocklist.items.size(); i++) {
                if (i > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) yi9.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (i2 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        e1(arrayList.get(i2), spannableStringBuilder);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                if (i3 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) yi9.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        if (i4 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        e1(arrayList2.get(i4), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void q1(u21 u21Var, int i) {
        if (u21Var.X() == null) {
            return;
        }
        gr grVar = na7.q1(i).k4;
        boolean p = y6c.h(i).p();
        u21Var.I(!p ? R.raw.star_premium_2 : R.raw.error, k96.M0(2131754976, null), gl.O2(!p ? k96.a0(null, null, 2131754977, Integer.valueOf(grVar.W.f()), Integer.valueOf(grVar.X.f())) : k96.a0(null, null, 2131754978, Integer.valueOf(grVar.X.f())), -1, 0, new i(u21Var, (byte) 0), null)).j();
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new f(this, (byte) 0), this.J0);
        this.O2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        if (this.M2 == null) {
            this.M2 = k96.M0(2131755006, null);
            oy8 oy8Var = new oy8(R.raw.emoji_stars, gl.L(24.0f), gl.L(24.0f));
            this.N2 = oy8Var;
            oy8Var.E(true);
            this.N2.F(1);
        }
        return this.M2;
    }

    @Override // fy0
    public final void L0(float f) {
        float f2 = 1.0f - f;
        ImageView imageView = this.v2;
        imageView.setAlpha(f2);
        imageView.setScaleX(gl.R1(0.6f, 1.0f, f2));
        imageView.setScaleY(gl.R1(0.6f, 1.0f, f2));
    }

    public final void Y0(cs5 cs5Var, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = bkb.D8;
        int i2 = bkb.E8;
        a8 a8Var = new a8(1, this.J0, getContext(), false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        a8Var.setText(str);
        a8Var.setChecked(z);
        a8Var.d(bkb.v0(i, this.J0), bkb.v0(i2, this.J0));
        a8Var.setSelectorColor(bkb.p1(0.12f, bkb.v0(i, this.J0)));
        a8Var.setOnClickListener(new q(cs5Var, z, runnable, (byte) 0));
        linearLayout.addView(a8Var, nme.o(-1, -2));
    }

    public final TLRPC.TL_messages_composeMessageWithAI Z0(int i) {
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        if (i == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = b1c.D(this.n2);
            TL_aicompose.AiComposeTone aiComposeTone = this.p2;
            tL_messages_composeMessageWithAI.tone = aiComposeTone != null ? TL_aicompose.InputAiComposeTone.from(aiComposeTone) : TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.q2;
            return tL_messages_composeMessageWithAI;
        }
        if (i != 1) {
            if (i == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            return tL_messages_composeMessageWithAI;
        }
        TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
        if (selectedTone instanceof t0) {
            TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
            inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.F2) ? "" : this.F2;
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
        tL_messages_composeMessageWithAI.emojify = this.q2;
        return tL_messages_composeMessageWithAI;
    }

    public final void a1() {
        if (this.U2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.U2, true);
            this.U2 = -1;
        }
        this.V2 = false;
        jia titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final dc b1() {
        z0 z0Var = this.t2;
        if (z0Var == null) {
            return null;
        }
        int selectedTab = z0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI Z0 = Z0(selectedTab);
        boolean z = Z0.proofread;
        if (!z && Z0.translate_to_lang == null && Z0.tone == null) {
            return null;
        }
        TL_aicompose.InputAiComposeTone inputAiComposeTone = Z0.tone;
        if (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse) {
            return null;
        }
        dc dcVar = new dc();
        dcVar.f = selectedTab;
        dcVar.a = z;
        dcVar.b = Z0.emojify;
        dcVar.c = Z0.translate_to_lang;
        dcVar.d = inputAiComposeTone;
        if (selectedTab == 0) {
            String E0 = rzb.E0(rzb.J0(this.n2, null, null));
            if (this.o2 != null) {
                E0 = ls6.o(this.o2, " ", E0, new StringBuilder());
            }
            dcVar.e = E0;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
            dcVar.e = ((selectedTone instanceof t0) || selectedTone == null || TextUtils.isEmpty(selectedTone.title)) ? k96.M0(2131754963, null) : selectedTone.title;
        } else {
            dcVar.e = k96.M0(2131754964, null);
        }
        if (dcVar.b) {
            dcVar.e = b00.j(new StringBuilder(), dcVar.e, " + Emoji");
        }
        return dcVar;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.a4) {
            v1();
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        kk7.f(this.a).n(this, kk7.a4);
        ic icVar = this.r2;
        if (icVar != null) {
            icVar.d = false;
        }
        super.dismiss();
    }

    @Override // fy0, fx0
    public final void e0() {
        super.e0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.z2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final TL_iv.RichMessage f1() {
        if (this.V2) {
            return null;
        }
        int selectedTab = this.t2.getSelectedTab();
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

    public final CharSequence g1() {
        if (i1()) {
            TL_iv.RichMessage f1 = f1();
            if (f1 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < f1.blocks.size(); i++) {
                if (i > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                e1(f1.blocks.get(i), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.V2) {
            return null;
        }
        int selectedTab = this.t2.getSelectedTab();
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

    public final boolean h1() {
        return (this.Q2 == null || this.i2 == null || this.h2 || i1() || this.g2 == 0) ? false : true;
    }

    public final boolean i1() {
        return this.T1 != null;
    }

    public final c4c j1(int i, TL_iv.RichMessage richMessage, boolean z) {
        if (richMessage == null) {
            richMessage = this.T1;
        }
        int i2 = hg9.b;
        c4c K = c4c.K(hg9.class);
        K.H = richMessage;
        K.d = i;
        K.e = z;
        return K;
    }

    public final void k1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        r1();
        boolean i1 = i1();
        by0 by0Var = this.o1;
        z0 z0Var = this.t2;
        byte b = 0;
        if (!i1) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.S1};
            tL_textWithEntities.entities = hq6.d0(this.a).Y(charSequenceArr, true, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 != null ? charSequence4.toString() : "";
            int selectedTab = z0Var.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI Z0 = Z0(selectedTab);
            Z0.text = tL_textWithEntities;
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = this.W2[selectedTab];
            if (tL_messages_composeMessageWithAI != null && tL_messages_composeMessageWithAI.proofread == Z0.proofread && tL_messages_composeMessageWithAI.emojify == Z0.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI.tone, Z0.tone) && TextUtils.equals(tL_messages_composeMessageWithAI.translate_to_lang, Z0.translate_to_lang)) {
                return;
            }
            if (Z0.emojify || Z0.proofread || Z0.tone != null || Z0.translate_to_lang != null) {
                this.V2 = true;
                this.G2 = false;
                s1(true);
                jia titleTextView = by0Var.getTitleTextView();
                titleTextView.i(this.N2);
                this.N2.start();
                int selectedTab2 = z0Var.getSelectedTab();
                CharSequence charSequence5 = this.S1;
                if (selectedTab2 == 0 && (charSequence3 = this.V1) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.Y1) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.b2) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(gl.L(16.0f));
                int L = gl.q.x - gl.L(64.0f);
                int i = this.u0;
                int b2 = moe.b(new StaticLayout(charSequence6, textPaint, (L - i) - i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < b2; i2++) {
                    if (i2 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int L2 = gl.L((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) k96.M0(2131748587, null));
                    u86 u86Var = new u86(null, L2, 0, null);
                    u86Var.f = gl.L(6.0f);
                    u86Var.h = 0.5f;
                    u86Var.n = true;
                    spannableStringBuilder.setSpan(u86Var, length, spannableStringBuilder.length(), 33);
                }
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
                this.U2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(Z0, new hc(b), new e((Object) this, (Object) titleTextView, selectedTab, (Object) Z0, (byte) 0));
                this.O2.O(true);
                return;
            }
            return;
        }
        int selectedTab3 = z0Var.getSelectedTab();
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.T1;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i3 = 0; i3 < richMessage.blocks.size(); i3++) {
                tL_inputRichMessage.blocks.add(z3a.x0(richMessage.blocks.get(i3)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    TLRPC.Photo photo = arrayList2.get(i4);
                    i4++;
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
                int i5 = 0;
                while (i5 < size2) {
                    TLRPC.Document document = arrayList4.get(i5);
                    i5++;
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
            tL_messages_composeRichMessageWithAI.translate_to_lang = b1c.D(this.n2);
            TL_aicompose.AiComposeTone aiComposeTone = this.p2;
            tL_messages_composeRichMessageWithAI.tone = aiComposeTone != null ? TL_aicompose.InputAiComposeTone.from(aiComposeTone) : TL_aicompose.InputAiComposeTone.fromDefault(str);
            tL_messages_composeRichMessageWithAI.emojify = this.q2;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
            if (selectedTone instanceof t0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.F2) ? "" : this.F2;
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
            tL_messages_composeRichMessageWithAI.emojify = this.q2;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.X2[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.V2 = true;
            this.G2 = false;
            s1(true);
            jia titleTextView2 = by0Var.getTitleTextView();
            titleTextView2.i(this.N2);
            this.N2.start();
            if (selectedTab3 == 0) {
                this.U1 = true;
            } else if (selectedTab3 == 1) {
                this.X1 = true;
            } else if (selectedTab3 == 2) {
                this.a2 = true;
            }
            this.U2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new hc(b), new e((Object) this, (Object) titleTextView2, selectedTab3, (Object) tL_messages_composeRichMessageWithAI, (byte) 1));
            this.O2.O(true);
        }
    }

    public final void l1(int i, int i2, boolean z) {
        if (this.j2 != null) {
            TL_iv.RichMessage f1 = f1();
            if (f1 != null) {
                this.j2.a(f1, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (this.i2 == null || g1() == null) {
            return;
        }
        this.i2.a(g1(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public final void m1(long j, boolean z, m8c m8cVar) {
        this.g2 = j;
        this.h2 = z;
        this.i2 = m8cVar;
        if (this.Q2 != null) {
            return;
        }
        h0 h0Var = new h0(21, this.J0, getContext(), false);
        this.Q2 = h0Var;
        Switch checkBox = h0Var.getCheckBox();
        int i = bkb.L6;
        int i2 = bkb.Ei;
        int i3 = bkb.c6;
        checkBox.d(i, i2, i3, i3);
        this.Q2.setBackground(bkb.f0(bkb.v0(bkb.i6, this.J0), 2, -1));
        this.Q2.setOnClickListener(new d(this, (byte) 4));
    }

    public final void n1(TL_iv.RichMessage richMessage) {
        this.T1 = richMessage;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < richMessage.blocks.size(); i++) {
            if (i > 0) {
                sb.append("\n");
            }
            c1(richMessage.blocks.get(i), sb);
        }
        byte b = 1;
        cme.b(sb.toString(), new b(this, b), new c(b), false);
        v1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o1(CharSequence charSequence) {
        String str;
        byte b = 0;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {wib.class, nj2.class, ama.class, j4c.class, i4c.class, f4c.class, g4c.class, im4.class, e4c.class, d4c.class, gm.class};
            for (int i = 0; i < 11; i++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        } else {
            str = charSequence.toString();
        }
        this.S1 = str;
        cme.b(charSequence.toString(), new b(this, b), new c(b), false);
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (v0 != this.Y2) {
                this.Y2 = v0;
                s0(v0);
                this.z2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p1(TL_aicompose.AiComposeTone aiComposeTone) {
        this.p2 = aiComposeTone;
        this.o2 = (aiComposeTone == null || TextUtils.isEmpty(aiComposeTone.title)) ? null : aiComposeTone.title;
        a1();
        k1();
        this.O2.O(true);
    }

    public final void r1() {
        SpannableStringBuilder spannableStringBuilder;
        float f;
        if (h1()) {
            dc b = ec.b(this.a, this.g2);
            dc b1 = b1();
            if (b != null && b1 != null && (b.f != b1.f || b.a != b1.a || b.b != b1.b || !TextUtils.equals(b.c, b1.c) || !TL_aicompose.InputAiComposeTone.equals(ec.d(b.d), ec.d(b1.d)) || !TextUtils.equals(b.e, b1.e))) {
                ec.e(this.a, this.g2, b1);
                uv1 uv1Var = this.R2;
                if (uv1Var != null) {
                    uv1Var.run();
                }
                b = b1;
            }
            byte b2 = 0;
            boolean z = b != null;
            if (z) {
                b1 = b;
            }
            h0 h0Var = this.Q2;
            if (!h0Var.L) {
                h0Var.L = true;
                h0Var.g("Always use in this chat", "", false, false, false);
            }
            if (b1 != null) {
                if (this.T2 == null) {
                    this.T2 = new i0();
                }
                spannableStringBuilder = new SpannableStringBuilder("→");
                spannableStringBuilder.setSpan(this.T2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) b1.e);
            } else {
                spannableStringBuilder = null;
            }
            h0 h0Var2 = this.Q2;
            boolean z2 = h0Var2.isLaidOut() && this.Q2.isAttachedToWindow();
            if (spannableStringBuilder != null) {
                h0Var2.getValueTextView().setText(spannableStringBuilder);
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (h0Var2.N != f || (h0Var2.O == null && h0Var2.M != f)) {
                h0Var2.N = f;
                ValueAnimator valueAnimator = h0Var2.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    h0Var2.O.cancel();
                    h0Var2.O = null;
                }
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(h0Var2.M, f);
                    h0Var2.O = ofFloat;
                    ofFloat.addUpdateListener(new f0(h0Var2, b2));
                    h0Var2.O.addListener(new g0(h0Var2, (byte) 0));
                    h0Var2.O.setDuration(240L);
                    h0Var2.O.setInterpolator(s33.h);
                    h0Var2.O.start();
                } else {
                    h0Var2.M = f;
                    h0Var2.requestLayout();
                }
            }
            this.Q2.setChecked(z);
        }
    }

    public final void s1(boolean z) {
        boolean z2 = this.G2;
        byte b = 2;
        byte b2 = 1;
        u41 u41Var = this.B2;
        if (z2) {
            u41Var.setText(k96.M0(2131747638, null));
            u41Var.setOnClickListener(new d(this, r4));
        } else {
            z0 z0Var = this.t2;
            if ((z0Var != null ? z0Var.getSelectedTab() : 0) == 1 && (this.u2.getSelectedTone() instanceof t0) && !TextUtils.equals(this.x2.getText().toString(), this.F2)) {
                u41Var.setText(k96.M0(2131754056, null));
                u41Var.setOnClickListener(new d(this, b2));
            } else if (this.f2 == null && this.e2 == null) {
                u41Var.setText(k96.M0(2131747638, null));
                u41Var.setOnClickListener(new d(this, (byte) 3));
            } else {
                u41Var.setText(k96.M0(2131755002, null));
                u41Var.setOnClickListener(new d(this, b));
            }
        }
        boolean z3 = this.V2;
        x6c x6cVar = this.L2;
        if (x6cVar != null) {
            gl.r(x6cVar);
            this.L2 = null;
        }
        if (z3 != this.J2) {
            long max = z3 ? 150L : Math.max(0L, 300 - (SystemClock.uptimeMillis() - this.K2));
            x6c x6cVar2 = new x6c(b2, this, z3);
            this.L2 = x6cVar2;
            if (max <= 0) {
                x6cVar2.run();
            } else {
                gl.e3(x6cVar2, max);
            }
        }
        if (z && this.I2 == this.H2) {
            return;
        }
        boolean z4 = this.H2;
        this.I2 = z4;
        u41 u41Var2 = this.A2;
        LinearLayout linearLayout = this.z2;
        if (!z) {
            u41Var2.setVisibility(z4 ? 0 : 8);
            u41Var2.setAlpha(this.H2 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.H2 ? (byte) 8 : (byte) 0);
            linearLayout.setAlpha(this.H2 ? 0.0f : 1.0f);
            return;
        }
        u41Var2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = u41Var2.animate().alpha(this.H2 ? 1.0f : 0.0f);
        s33 s33Var = s33.h;
        alpha.setInterpolator(s33Var).setDuration(320L).withEndAction(new a(this, b2)).start();
        linearLayout.animate().alpha(this.H2 ? 0.0f : 1.0f).setInterpolator(s33Var).setDuration(320L).withEndAction(new a(this, b)).start();
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        String str;
        z0 z0Var;
        super.show();
        by0 by0Var = this.o1;
        if (by0Var != null) {
            by0Var.setTitle(J0());
        }
        int i = (this.h2 || (this.j2 == null && this.i2 == null)) ? 8 : 0;
        u41 u41Var = this.C2;
        u41Var.setVisibility(i);
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131745448, null));
        cm2 cm2Var = new cm2(this.h2 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        cm2Var.s = gl.L(1.0f);
        spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
        u41Var.setText(spannableStringBuilder);
        if (!this.S2 && h1()) {
            this.S2 = true;
            dc b = ec.b(this.a, this.g2);
            if (b != null) {
                int i2 = b.f;
                z0 z0Var2 = this.t2;
                if (i2 == 1) {
                    TL_aicompose.AiComposeTone a = ec.a(this.a, b.d);
                    if (a != null && (z0Var = this.u2) != null) {
                        this.q2 = b.b;
                        z0Var2.c(1, false);
                        z0Var.d(a, false);
                    }
                } else if (i2 == 0 && (str = b.c) != null) {
                    this.q2 = b.b;
                    this.n2 = str;
                    TL_aicompose.AiComposeTone a2 = ec.a(this.a, b.d);
                    this.p2 = a2;
                    if (a2 != null && !TextUtils.isEmpty(a2.title)) {
                        str2 = this.p2.title;
                    }
                    this.o2 = str2;
                    z0Var2.c(0, false);
                } else if (i2 == 2) {
                    z0Var2.c(2, false);
                }
            }
        }
        this.O2.O(false);
        k1();
        s1(true);
    }

    public final void t1() {
        String str = this.F2;
        it3 it3Var = this.x2;
        boolean equals = TextUtils.equals(str, it3Var.d.getText().toString());
        boolean z = !equals;
        if (this.E2 == z) {
            return;
        }
        ViewPropertyAnimator animate = it3Var.d.animate();
        this.E2 = z;
        ug8.s(animate, !equals ? 1.0f : 0.5f, 320L);
        this.O2.O(true);
    }

    public final void u1() {
        o39 o39Var;
        View view;
        if (this.y2 == null) {
            return;
        }
        int i = 0;
        while (true) {
            o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                view = null;
                break;
            }
            view = o39Var.getChildAt(i);
            c4c G = this.O2.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.u2) {
                break;
            } else {
                i++;
            }
        }
        je5 je5Var = this.y2;
        if (view == null) {
            je5Var.setVisibility(4);
            this.y2.f(true);
        } else {
            je5Var.setVisibility(0);
            this.y2.setTranslationY(view.getY() + o39Var.getY() + view.getHeight());
        }
    }

    public final void v1() {
        z0 z0Var = this.u2;
        TL_aicompose.AiComposeTone selectedTone = z0Var.getSelectedTone();
        z0Var.c.removeAllViews();
        byte b = 0;
        if (i1()) {
            z0Var.b(new t0(), new h(this, b));
        }
        z0Var.b(null, new h(this, b));
        ArrayList arrayList = this.r2.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z0Var.b((TL_aicompose.AiComposeTone) obj, new h(this, b));
        }
        if (selectedTone != z0Var.getSelectedTone()) {
            z0Var.d(null, true);
        }
    }
}
