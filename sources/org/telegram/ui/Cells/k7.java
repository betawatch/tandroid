package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.kv;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x70;
import org.telegram.ui.yz;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public xh.f M;
    public int N;
    public final int O;
    public StaticLayout P;
    public int Q;
    public StaticLayout R;
    public final AtomicReference S;
    public int T;
    public StaticLayout U;
    public final AtomicReference V;
    public int W;
    public boolean a;
    public StaticLayout a0;
    public androidx.emoji2.text.j b;
    public ij b0;
    public int c;
    public final TextPaint c0;
    public m.f3 d;
    public final TextPaint d0;
    public final n2.n0 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public int g0;
    public int h;
    public StaticLayout h0;
    public int i0;
    public StaticLayout j0;
    public org.telegram.ui.Components.n5 k0;
    public final org.telegram.ui.ActionBar.f6 l0;
    public final int m0;
    public x70 n;
    public final ImageReceiver r;
    public boolean s;
    public final g70 w;
    public final wo x;
    public j7 y;

    public k7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new n2.n0(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = org.telegram.messenger.g0.L(10.0f);
        this.Q = org.telegram.messenger.g0.L(30.0f);
        this.S = new AtomicReference();
        this.T = org.telegram.messenger.g0.L(30.0f);
        this.V = new AtomicReference();
        this.W = org.telegram.messenger.g0.L(30.0f);
        this.i0 = org.telegram.messenger.g0.L(30.0f);
        this.l0 = f6Var;
        this.m0 = i7;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.c0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.d0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        this.w = new g70(0, f6Var);
        wo woVar = new wo(21, context, f6Var);
        this.x = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        boolean z9 = hd.a0;
        addView(woVar, c8.ha.d(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 44.0f, 44.0f, z9 ? 44.0f : 0.0f, 0.0f));
        if (i7 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.e0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f0 = textPaint4;
        textPaint4.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String trim = str.trim();
        if (trim.startsWith("#")) {
            return;
        }
        if (org.telegram.messenger.g0.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
            trim = "http://".concat(trim);
        }
        this.E.add(SpannableString.valueOf(trim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c((TL_iv.PageBlock) obj);
        }
    }

    public final void c(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            d(pageBlock.text);
        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
            c(((TL_iv.pageBlockCover) pageBlock).cover);
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            b(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
        }
    }

    public final void d(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            a(richText.url);
            return;
        }
        if (richText instanceof TL_iv.textAutoUrl) {
            a(kv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + kv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                d(richText.texts.get(i7));
            }
            return;
        }
        if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.e.f(true);
        this.h = -1;
        this.n = null;
        this.f = false;
        this.a = false;
        androidx.emoji2.text.j jVar = this.b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        m.f3 f3Var = this.d;
        if (f3Var != null) {
            removeCallbacks(f3Var);
        }
        invalidate();
    }

    public final void f(boolean z9, boolean z10) {
        wo woVar = this.x;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
    }

    public final void g(int i7, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C);
        e();
        this.M.q = new i7(this, 0);
        int i12 = i7 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.N;
        SparseArray sparseArray = this.H;
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.J;
        ArrayList arrayList3 = this.G;
        if (i13 == 0) {
            float f10 = 0.0f;
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                Layout layout = (Layout) arrayList3.get(i14);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i14)).iterator();
                while (it.hasNext()) {
                    ((xh.f) it.next()).j(i12, ((i10 - this.F) - i11) + f10, sqrt, false);
                }
            }
        } else if (i13 == 1) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                ((xh.f) obj).j(i12, i10 - this.Q, sqrt, false);
            }
        } else if (i13 == 2) {
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                ((xh.f) obj2).j(i12, i10 - this.T, sqrt, false);
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.N) {
                if (i17 == 0) {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        Layout layout2 = (Layout) arrayList3.get(i18);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i18)).iterator();
                        while (it2.hasNext()) {
                            ((xh.f) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i17 == 1) {
                    int size3 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        ((xh.f) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i17 == 2) {
                    int size4 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        ((xh.f) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                }
            }
        }
        this.N = -1;
        this.M = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public ij getMessage() {
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.P();
        }
        this.k0 = org.telegram.ui.Components.r5.update(0, this, this.k0, this.j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.R();
        }
        org.telegram.ui.Components.r5.release(this, this.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k7 k7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.f6 f6Var = this.l0;
        if (this.m0 == 1) {
            this.e0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, f6Var));
        }
        StaticLayout staticLayout = this.h0;
        int i7 = this.O;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C) + (hd.a0 ? 0 : this.g0), i7);
            this.h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C);
            if (hd.a0) {
                L += this.h0 == null ? 0.0f : org.telegram.messenger.g0.L(4.0f) + r3.getWidth();
            }
            canvas2.translate(L, i7);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            this.f0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.W);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.R;
        TextPaint textPaint = this.d0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.Q);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.T);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            k7Var = this;
            canvas2.restore();
        } else {
            k7Var = this;
        }
        ArrayList arrayList = k7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, f6Var));
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i11);
                List list = (List) k7Var.H.get(i11);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), k7Var.F + i10);
                    Path path = k7Var.L;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((xh.f) it.next()).getBounds();
                            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipPath(path);
                    path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((xh.f) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((xh.f) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i10 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (k7Var.e.h(canvas2)) {
                k7Var.invalidate();
            }
        }
        if (k7Var.j0 != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), k7Var.i0);
            k7Var.j0.draw(canvas2);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, k7Var.j0, k7Var.k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        k7Var.w.draw(canvas2);
        if (k7Var.s) {
            k7Var.r.h(canvas2, null);
        }
        if (k7Var.D) {
            if (hd.a0) {
                canvas2.drawLine(0.0f, k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth(), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.P;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.R != null) {
            sb2.append(", ");
            sb2.append(this.R.getText());
        }
        if (this.U != null) {
            sb2.append(", ");
            sb2.append(this.U.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        if (this.x.a.q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0126, code lost:
    
        if (r6.length() == 0) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x03e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v29, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v65, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        String str;
        String str2;
        String str3;
        ij ijVar;
        float f10;
        SpannableStringBuilder spannableStringBuilder;
        ij ijVar2;
        int i11;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i12;
        String str4;
        int i13;
        ij ijVar3;
        StaticLayout staticLayout;
        float f11;
        int L;
        float f12;
        int i14;
        int i15;
        StaticLayout staticLayout2;
        int i16;
        StaticLayout staticLayout3;
        float f13;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i17;
        SparseArray sparseArray;
        g70 g70Var;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i18;
        boolean z10;
        SparseArray sparseArray2;
        int i19;
        g70 g70Var2;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i20;
        StaticLayout staticLayout7;
        boolean z11;
        StaticLayout staticLayout8;
        CharSequence x12;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i21;
        int i22;
        SpannableStringBuilder spannableStringBuilder3;
        boolean z12;
        String str5;
        int lastIndexOf2;
        String str6;
        String str7;
        String str8;
        int i23;
        SpannableString valueOf;
        int i24;
        int i25;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        String str9;
        ArrayList arrayList3 = this.J;
        ArrayList arrayList4 = this.I;
        this.s = false;
        this.R = null;
        this.P = null;
        this.U = null;
        this.a0 = null;
        ArrayList arrayList5 = this.G;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList6.clear();
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(8.0f);
        ij ijVar4 = this.b0;
        TLRPC.MessageMedia messageMedia = ijVar4.k.media;
        boolean z13 = true;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (ijVar4.n0 == null && webPage.photo != null) {
                    ijVar4.r0(true);
                }
                boolean z14 = (webPage.photo == null || this.b0.n0 == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z9 = z14;
                ijVar = this.b0;
                if (ijVar != null || ijVar.k.entities.isEmpty()) {
                    f10 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    f10 = 8.0f;
                    int i26 = 0;
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    while (i26 < this.b0.k.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.b0.k.entities.get(i26);
                        if (messageEntity.length <= 0 || (i22 = messageEntity.offset) < 0 || i22 >= this.b0.k.message.length()) {
                            i21 = i26;
                        } else {
                            if (messageEntity.offset + messageEntity.length > this.b0.k.message.length()) {
                                messageEntity.length = this.b0.k.message.length() - messageEntity.offset;
                            }
                            if (i26 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.b0.k.message.length())) {
                                if (this.b0.k.entities.size() != z13) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, spannableStringBuilder4);
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            try {
                            } catch (Exception e10) {
                                e = e10;
                                i21 = i26;
                            }
                            if (!(messageEntity instanceof TLRPC.TL_messageEntityTextUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityEmail) {
                                    if (str2 != null) {
                                        try {
                                        } catch (Exception e11) {
                                            e = e11;
                                            i21 = i26;
                                            z12 = z13;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            org.telegram.messenger.a8.g(e, z12);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i26 = i21 + 1;
                                            z13 = true;
                                        }
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("mailto:");
                                    String str10 = this.b0.k.message;
                                    int i27 = messageEntity.offset;
                                    sb2.append(str10.substring(i27, messageEntity.length + i27));
                                    str5 = sb2.toString();
                                    String str11 = this.b0.k.message;
                                    int i28 = messageEntity.offset;
                                    str2 = str11.substring(i28, messageEntity.length + i28);
                                    if (messageEntity.offset == 0) {
                                        if (messageEntity.length != this.b0.k.message.length()) {
                                        }
                                        if (str5 == null) {
                                            try {
                                                if ((org.telegram.messenger.g0.t(str5, "://") != -1) || str5.toString().toLowerCase().indexOf("http") == 0 || str5.toString().toLowerCase().indexOf("mailto") == 0) {
                                                    i23 = 0;
                                                } else {
                                                    str5 = "http://" + ((Object) str5);
                                                    i23 = 7;
                                                }
                                                try {
                                                    valueOf = SpannableString.valueOf(str5);
                                                    i24 = messageEntity.offset;
                                                    i25 = messageEntity.length + i24;
                                                    arrayList2 = this.b0.k.entities;
                                                    i21 = i26;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    i21 = i26;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                i21 = i26;
                                                str7 = str2;
                                                str8 = str3;
                                            }
                                            try {
                                                int size2 = arrayList2.size();
                                                str7 = str2;
                                                int i29 = 0;
                                                while (i29 < size2) {
                                                    try {
                                                        TLRPC.MessageEntity messageEntity2 = arrayList2.get(i29);
                                                        int i30 = i29 + 1;
                                                        int i31 = size2;
                                                        TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                                        int i32 = messageEntity3.offset;
                                                        int i33 = i23;
                                                        int i34 = messageEntity3.length + i32;
                                                        if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i24 > i34 || i25 < i32) {
                                                            str8 = str3;
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                        } else {
                                                            uy0 uy0Var = new uy0();
                                                            str8 = str3;
                                                            try {
                                                                uy0Var.a |= 256;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                try {
                                                                    valueOf.setSpan(new vy0(uy0Var, 0), Math.max(i24, i32), Math.min(i25, i34) + i33, 33);
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                    z12 = true;
                                                                    org.telegram.messenger.a8.g(e, z12);
                                                                    spannableStringBuilder4 = spannableStringBuilder3;
                                                                    i26 = i21 + 1;
                                                                    z13 = true;
                                                                }
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                str2 = str7;
                                                                str3 = str8;
                                                                z12 = true;
                                                                org.telegram.messenger.a8.g(e, z12);
                                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                                i26 = i21 + 1;
                                                                z13 = true;
                                                            }
                                                        }
                                                        i29 = i30;
                                                        size2 = i31;
                                                        i23 = i33;
                                                        str3 = str8;
                                                        spannableStringBuilder5 = spannableStringBuilder3;
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                        str2 = str7;
                                                        z12 = true;
                                                        org.telegram.messenger.a8.g(e, z12);
                                                        spannableStringBuilder4 = spannableStringBuilder3;
                                                        i26 = i21 + 1;
                                                        z13 = true;
                                                    }
                                                }
                                                str9 = str3;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                arrayList6.add(valueOf);
                                            } catch (Exception e17) {
                                                e = e17;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                z12 = true;
                                                org.telegram.messenger.a8.g(e, z12);
                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                i26 = i21 + 1;
                                                z13 = true;
                                            }
                                        } else {
                                            i21 = i26;
                                            str7 = str2;
                                            str9 = str3;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                        }
                                        str2 = str7;
                                        str3 = str9;
                                        spannableStringBuilder4 = spannableStringBuilder3;
                                    }
                                    ?? valueOf2 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, valueOf2);
                                    str6 = valueOf2;
                                    str3 = str6;
                                    if (str5 == null) {
                                    }
                                    str2 = str7;
                                    str3 = str9;
                                    spannableStringBuilder4 = spannableStringBuilder3;
                                }
                                str5 = null;
                                if (str5 == null) {
                                }
                                str2 = str7;
                                str3 = str9;
                                spannableStringBuilder4 = spannableStringBuilder3;
                            }
                            if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                String str12 = this.b0.k.message;
                                int i35 = messageEntity.offset;
                                str5 = str12.substring(i35, messageEntity.length + i35);
                            } else {
                                str5 = messageEntity.url;
                            }
                            if (str2 == null || str2.length() == 0) {
                                str2 = Uri.parse(str5.toString()).getHost();
                                if (str2 == null) {
                                    str2 = str5.toString();
                                }
                                if (str2 != null && (lastIndexOf2 = str2.lastIndexOf(46)) >= 0) {
                                    String substring = str2.substring(0, lastIndexOf2);
                                    int lastIndexOf3 = substring.lastIndexOf(46);
                                    if (lastIndexOf3 >= 0) {
                                        substring = substring.substring(lastIndexOf3 + 1);
                                    }
                                    str2 = substring.substring(0, 1).toUpperCase() + substring.substring(1);
                                }
                                if (messageEntity.offset != 0 || messageEntity.length != this.b0.k.message.length()) {
                                    ?? valueOf3 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, valueOf3);
                                    str6 = valueOf3;
                                    str3 = str6;
                                }
                            }
                            if (str5 == null) {
                            }
                            str2 = str7;
                            str3 = str9;
                            spannableStringBuilder4 = spannableStringBuilder3;
                        }
                        i26 = i21 + 1;
                        z13 = true;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                ijVar2 = this.b0;
                if (ijVar2 != null && (message = ijVar2.k) != null && (richMessage = message.rich_message) != null) {
                    b(richMessage.blocks);
                    if (!arrayList6.isEmpty()) {
                        String charSequence = ((CharSequence) arrayList6.get(0)).toString();
                        if (str2 == null || str2.length() == 0) {
                            String host = Uri.parse(charSequence.toString()).getHost();
                            str2 = host == null ? charSequence.toString() : host;
                            if (str2 != null && (lastIndexOf = str2.lastIndexOf(46)) >= 0) {
                                String substring2 = str2.substring(0, lastIndexOf);
                                int lastIndexOf4 = substring2.lastIndexOf(46);
                                if (lastIndexOf4 >= 0) {
                                    substring2 = substring2.substring(lastIndexOf4 + 1);
                                }
                                str2 = substring2.substring(0, 1).toUpperCase() + substring2.substring(1);
                            }
                        }
                    }
                }
                i11 = this.m0;
                TextPaint textPaint3 = this.e0;
                if (i11 != 1) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String e18 = hd.e1(this.b0.k.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(e18));
                    textPaint = textPaint3;
                    this.h0 = q1.H1(e18, textPaint3, ceil, ceil, 0, 1);
                    this.g0 = (size - ceil) - org.telegram.messenger.g0.L(f10);
                    i12 = org.telegram.messenger.g0.L(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i12 = 0;
                }
                g70 g70Var3 = this.w;
                if (str2 != null) {
                    try {
                        ?? x13 = org.telegram.messenger.g0.x1(str2, this.b0.Y1, null);
                        int i36 = size - i12;
                        StaticLayout H1 = q1.H1(x13 != 0 ? x13 : str2, this.c0, i36 - org.telegram.messenger.g0.L(4.0f), i36 - org.telegram.messenger.g0.L(4.0f), 0, 3);
                        this.P = H1;
                        if (H1.getLineCount() > 0) {
                            this.Q = this.O + this.P.getLineBottom(r5.getLineCount() - 1) + org.telegram.messenger.g0.L(4.0f);
                        }
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, true);
                    }
                    g70Var3.a(str2);
                }
                this.T = this.Q;
                StaticLayout staticLayout9 = this.P;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (i11 != 1) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.d0;
                Stack stack = this.K;
                float f14 = 5.0f;
                if (str4 != null) {
                    try {
                        StaticLayout H12 = q1.H1(str4, textPaint4, size, size, 0, max);
                        this.R = H12;
                        if (H12.getLineCount() > 0) {
                            this.T = this.Q + this.R.getLineBottom(r13.getLineCount() - 1) + org.telegram.messenger.g0.L(5.0f);
                        }
                        stack.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.b0.L0) {
                            xh.f.c(this, this.R, stack, arrayList4);
                        }
                    } catch (Exception e20) {
                        org.telegram.messenger.a8.g(e20, true);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i13 = max;
                    } catch (Exception e21) {
                        e = e21;
                        i13 = max;
                    }
                    try {
                        this.U = q1.H1(spannableStringBuilder2, textPaint4, size, size, 0, max);
                        if (this.R != null) {
                            this.T += org.telegram.messenger.g0.L(10.0f);
                        }
                        stack.addAll(arrayList3);
                        arrayList3.clear();
                        if (!this.b0.L0) {
                            xh.f.c(this, this.U, stack, arrayList3);
                        }
                    } catch (Exception e22) {
                        e = e22;
                        org.telegram.messenger.a8.g(e, true);
                        ijVar3 = this.b0;
                        if (ijVar3 != null) {
                        }
                        staticLayout = this.a0;
                        if (staticLayout != null) {
                        }
                        if (!arrayList6.isEmpty()) {
                        }
                        g70 g70Var4 = g70Var3;
                        int i37 = size;
                        int L2 = org.telegram.messenger.g0.L(52.0f);
                        if (hd.a0) {
                        }
                        g70Var4.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L2, org.telegram.messenger.g0.L(63.0f));
                        if (z9) {
                        }
                        if (i11 == 1) {
                        }
                        staticLayout2 = this.P;
                        if (staticLayout2 != null) {
                        }
                        i16 = i15;
                        staticLayout3 = this.a0;
                        if (staticLayout3 != null) {
                        }
                        f13 = 5.0f;
                        staticLayout4 = this.R;
                        if (staticLayout4 != null) {
                        }
                        staticLayout5 = this.U;
                        if (staticLayout5 != null) {
                        }
                        while (i17 < arrayList5.size()) {
                        }
                        int i38 = i16 + i15;
                        if (this.j0 != null) {
                        }
                        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(17.0f, i38, org.telegram.messenger.g0.L(76.0f)) + (this.D ? 1 : 0));
                    }
                } else {
                    i13 = max;
                }
                ijVar3 = this.b0;
                if (ijVar3 != null && !TextUtils.isEmpty(ijVar3.k.message) && (x12 = org.telegram.messenger.g0.x1(org.telegram.messenger.i6.m(this.b0.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), this.b0.Y1, null)) != null) {
                    String str13 = (String) this.b0.Y1.get(0);
                    TextPaint textPaint5 = this.f0;
                    this.a0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str13, size, textPaint5), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                staticLayout = this.a0;
                if (staticLayout != null) {
                    int i39 = this.Q;
                    this.W = i39;
                    int C = org.telegram.messenger.k5.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i39);
                    this.Q = C;
                    this.T = C;
                }
                if (!arrayList6.isEmpty()) {
                    int i40 = 0;
                    while (true) {
                        sparseArray = this.H;
                        if (i40 >= sparseArray.size()) {
                            break;
                        }
                        stack.addAll((Collection) sparseArray.get(i40));
                        i40++;
                    }
                    sparseArray.clear();
                    int i41 = 0;
                    while (i41 < arrayList6.size()) {
                        try {
                            g70Var2 = g70Var3;
                        } catch (Exception e23) {
                            e = e23;
                            g70Var = g70Var3;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i18 = size;
                        }
                        try {
                            ellipsize = TextUtils.ellipsize(org.telegram.messenger.g0.N2(SpannableStringBuilder.valueOf((CharSequence) arrayList6.get(i41))), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(r0, 0, r0.length())), size), TextUtils.TruncateAt.MIDDLE);
                            i20 = size;
                            TextPaint textPaint6 = textPaint4;
                            try {
                                staticLayout6 = new StaticLayout(ellipsize, textPaint6, i20, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                textPaint2 = textPaint6;
                                try {
                                    this.F = this.T;
                                    staticLayout7 = this.U;
                                } catch (Exception e24) {
                                    e = e24;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    g70Var = g70Var2;
                                    z10 = true;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                g70Var = g70Var2;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                                z10 = true;
                            }
                        } catch (Exception e26) {
                            e = e26;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i18 = size;
                            g70Var = g70Var2;
                            z10 = true;
                            sparseArray2 = sparseArray;
                            i19 = i41;
                            org.telegram.messenger.a8.g(e, z10);
                            i41 = i19 + 1;
                            sparseArray = sparseArray2;
                            g70Var3 = g70Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            size = i18;
                            f14 = 5.0f;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e27) {
                                e = e27;
                                z11 = true;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                z10 = z11;
                                g70Var = g70Var2;
                                sparseArray2 = sparseArray;
                                org.telegram.messenger.a8.g(e, z10);
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                g70Var3 = g70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f14 = 5.0f;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                z11 = true;
                                try {
                                    this.F = this.U.getLineBottom(r3.getLineCount() - 1) + org.telegram.messenger.g0.L(f14) + this.F;
                                    if (this.b0.L0) {
                                        int i42 = i41;
                                        try {
                                            ArrayList arrayList7 = new ArrayList();
                                            if (ellipsize instanceof Spannable) {
                                                i19 = i42;
                                                arrayList = arrayList6;
                                                i18 = i20;
                                                z10 = z11;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                g70Var = g70Var2;
                                                try {
                                                    xh.f.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack, arrayList7, null);
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    org.telegram.messenger.a8.g(e, z10);
                                                    i41 = i19 + 1;
                                                    sparseArray = sparseArray2;
                                                    g70Var3 = g70Var;
                                                    textPaint4 = textPaint2;
                                                    arrayList6 = arrayList;
                                                    size = i18;
                                                    f14 = 5.0f;
                                                }
                                            } else {
                                                i19 = i42;
                                                arrayList = arrayList6;
                                                i18 = i20;
                                                z10 = z11;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                g70Var = g70Var2;
                                            }
                                            sparseArray2.put(i19, arrayList7);
                                        } catch (Exception e29) {
                                            e = e29;
                                            i19 = i42;
                                            arrayList = arrayList6;
                                            i18 = i20;
                                            z10 = z11;
                                            g70Var = g70Var2;
                                            sparseArray2 = sparseArray;
                                            org.telegram.messenger.a8.g(e, z10);
                                            i41 = i19 + 1;
                                            sparseArray = sparseArray2;
                                            g70Var3 = g70Var;
                                            textPaint4 = textPaint2;
                                            arrayList6 = arrayList;
                                            size = i18;
                                            f14 = 5.0f;
                                        }
                                    } else {
                                        i19 = i41;
                                        arrayList = arrayList6;
                                        i18 = i20;
                                        z10 = z11;
                                        sparseArray2 = sparseArray;
                                        staticLayout8 = staticLayout6;
                                        g70Var = g70Var2;
                                    }
                                    arrayList5.add(staticLayout8);
                                } catch (Exception e30) {
                                    e = e30;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    z10 = z11;
                                    g70Var = g70Var2;
                                    sparseArray2 = sparseArray;
                                    org.telegram.messenger.a8.g(e, z10);
                                    i41 = i19 + 1;
                                    sparseArray = sparseArray2;
                                    g70Var3 = g70Var;
                                    textPaint4 = textPaint2;
                                    arrayList6 = arrayList;
                                    size = i18;
                                    f14 = 5.0f;
                                }
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                g70Var3 = g70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f14 = 5.0f;
                            }
                        }
                        z11 = true;
                        if (this.b0.L0) {
                        }
                        arrayList5.add(staticLayout8);
                        i41 = i19 + 1;
                        sparseArray = sparseArray2;
                        g70Var3 = g70Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        size = i18;
                        f14 = 5.0f;
                    }
                }
                g70 g70Var42 = g70Var3;
                int i372 = size;
                int L22 = org.telegram.messenger.g0.L(52.0f);
                if (hd.a0) {
                    f11 = 10.0f;
                    L = org.telegram.messenger.k5.z(10.0f, View.MeasureSpec.getSize(i7), L22);
                } else {
                    f11 = 10.0f;
                    L = org.telegram.messenger.g0.L(10.0f);
                }
                g70Var42.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L22, org.telegram.messenger.g0.L(63.0f));
                if (z9) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.b0.n0, L22, true, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(this.b0.n0, 80, false, null, false);
                    TLRPC.PhotoSize photoSize = w11 == w10 ? null : w11;
                    if (w10 != null) {
                        w10.size = -1;
                    }
                    if (photoSize != null) {
                        photoSize.size = -1;
                    }
                    float L3 = org.telegram.messenger.g0.L(11.0f);
                    float f15 = L22;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.y0(L, L3, f15, f15);
                    org.telegram.messenger.w7.r(null, w10);
                    Locale locale = Locale.US;
                    imageReceiver.r0(hc.f(w10, this.b0.l0), com.google.android.recaptcha.internal.a.j(L22, "_", L22), hc.f(photoSize, this.b0.l0), L22 + "_" + L22 + "_b", null, 0L, null, this.b0, 0);
                    this.s = true;
                }
                if (i11 == 1) {
                    f12 = f11;
                    i14 = 1;
                    StaticLayout H13 = q1.H1(yz.d(this.b0, true, 2, textPaint), textPaint, i372, i372, 0, i13);
                    this.j0 = H13;
                    i15 = 0;
                    this.k0 = org.telegram.ui.Components.r5.update(0, this, this.k0, H13);
                } else {
                    f12 = f11;
                    i14 = 1;
                    i15 = 0;
                }
                staticLayout2 = this.P;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i16 = i15;
                } else {
                    StaticLayout staticLayout10 = this.P;
                    i16 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i14) + org.telegram.messenger.g0.L(4.0f);
                }
                staticLayout3 = this.a0;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f13 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.a0;
                    f13 = 5.0f;
                    i16 = org.telegram.messenger.k5.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i14), i16);
                }
                staticLayout4 = this.R;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.R;
                    i16 = org.telegram.messenger.k5.C(f13, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i14), i16);
                }
                staticLayout5 = this.U;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.U;
                    i16 = org.telegram.messenger.k5.C(f13, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i14), i16);
                    if (this.R != null) {
                        i16 += org.telegram.messenger.g0.L(f12);
                    }
                }
                for (i17 = i15; i17 < arrayList5.size(); i17++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i17);
                    if (staticLayout14.getLineCount() > 0) {
                        i15 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i14) + i15;
                    }
                }
                int i382 = i16 + i15;
                if (this.j0 != null) {
                    this.i0 = org.telegram.messenger.g0.L(f13) + this.F + i15;
                    StaticLayout staticLayout15 = this.j0;
                    i382 = org.telegram.messenger.k5.C(f13, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i14), i382);
                }
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(17.0f, i382, org.telegram.messenger.g0.L(76.0f)) + (this.D ? 1 : 0));
            }
        }
        z9 = false;
        str = null;
        str2 = null;
        str3 = null;
        ijVar = this.b0;
        if (ijVar != null) {
        }
        f10 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        ijVar2 = this.b0;
        if (ijVar2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i11 = this.m0;
        TextPaint textPaint32 = this.e0;
        if (i11 != 1) {
        }
        g70 g70Var32 = this.w;
        if (str2 != null) {
        }
        this.T = this.Q;
        StaticLayout staticLayout92 = this.P;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i11 != 1) {
        }
        TextPaint textPaint42 = this.d0;
        Stack stack2 = this.K;
        float f142 = 5.0f;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        ijVar3 = this.b0;
        if (ijVar3 != null) {
            String str132 = (String) this.b0.Y1.get(0);
            TextPaint textPaint52 = this.f0;
            this.a0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str132, size, textPaint52), textPaint52, size, TextUtils.TruncateAt.END), textPaint52, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        staticLayout = this.a0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        g70 g70Var422 = g70Var32;
        int i3722 = size;
        int L222 = org.telegram.messenger.g0.L(52.0f);
        if (hd.a0) {
        }
        g70Var422.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L222, org.telegram.messenger.g0.L(63.0f));
        if (z9) {
        }
        if (i11 == 1) {
        }
        staticLayout2 = this.P;
        if (staticLayout2 != null) {
        }
        i16 = i15;
        staticLayout3 = this.a0;
        if (staticLayout3 != null) {
        }
        f13 = 5.0f;
        staticLayout4 = this.R;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.R;
            i16 = org.telegram.messenger.k5.C(f13, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i14), i16);
        }
        staticLayout5 = this.U;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.U;
            i16 = org.telegram.messenger.k5.C(f13, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i14), i16);
            if (this.R != null) {
            }
        }
        while (i17 < arrayList5.size()) {
        }
        int i3822 = i16 + i15;
        if (this.j0 != null) {
        }
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(17.0f, i3822, org.telegram.messenger.g0.L(76.0f)) + (this.D ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        j7 j7Var;
        boolean z10;
        int i7;
        int i10;
        int i11;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.b0 != null) {
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty() && (j7Var = this.y) != null && j7Var.d()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.M == null) || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    z9 = false;
                    if (z9) {
                        return true;
                    }
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z9 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i12);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int L = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                        float f10 = x10;
                        float f11 = L;
                        if (f10 < staticLayout.getLineLeft(0) + f11 || f10 > staticLayout.getLineWidth(0) + f11 || y10 < (i11 = this.F + i13) || y10 > i11 + lineBottom) {
                            i13 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.M = null;
                                SparseArray sparseArray = this.H;
                                if (sparseArray.get(i12, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i12)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        xh.f fVar = (xh.f) it.next();
                                        if (fVar.getBounds().contains(x10 - L, (y10 - this.F) - i13)) {
                                            e();
                                            this.M = fVar;
                                            this.N = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.M == null && (this.h != i12 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i12;
                                    x70 x70Var = new x70(null, this.l0, x10 - L, (y10 - this.F) - i13, 0);
                                    this.n = x70Var;
                                    r70 b10 = x70Var.b();
                                    this.f = true;
                                    this.e.b(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new m.f3(this, 22);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f11, this.F + i13);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.b0.k.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.y.a(((CharSequence) this.E.get(this.h)).toString(), false);
                                    } else {
                                        this.y.b(webPage, this.b0);
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                e();
                            } else if (this.M != null) {
                                g(x10, y10, i13);
                            } else {
                                z10 = true;
                                z9 = false;
                            }
                            z9 = true;
                        }
                    }
                    i12++;
                }
                z10 = z9;
                if (motionEvent.getAction() == 0) {
                    int L2 = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                    StaticLayout staticLayout2 = this.R;
                    if (staticLayout2 != null && x10 >= L2 && x10 <= staticLayout2.getWidth() + L2 && y10 >= (i10 = this.Q) && y10 <= this.R.getHeight() + i10) {
                        ArrayList arrayList2 = this.I;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i14);
                            i14++;
                            xh.f fVar2 = (xh.f) obj;
                            if (fVar2.getBounds().contains(x10 - L2, y10 - this.Q)) {
                                this.M = fVar2;
                                this.N = 1;
                                z9 = true;
                                z10 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.U;
                    if (staticLayout3 != null && x10 >= L2 && x10 <= staticLayout3.getWidth() + L2 && y10 >= (i7 = this.T) && y10 <= this.U.getHeight() + i7) {
                        ArrayList arrayList3 = this.J;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            xh.f fVar3 = (xh.f) obj2;
                            if (fVar3.getBounds().contains(x10 - L2, y10 - this.T)) {
                                this.M = fVar3;
                                this.N = 2;
                                z9 = true;
                                z10 = true;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        e();
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.M != null) {
                        g(x10, y10, 0);
                        z9 = true;
                        z10 = true;
                        break;
                    }
                    if (!z10) {
                    }
                }
                return !z9 || super.onTouchEvent(motionEvent);
            }
        }
        e();
        z9 = false;
        if (z9) {
        }
    }

    public void setDelegate(j7 j7Var) {
        this.y = j7Var;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            TextPaint textPaint = this.c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.l0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
