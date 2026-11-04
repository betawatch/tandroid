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
import b8.mf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cv;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public yh.f N;
    public int O;
    public final int P;
    public StaticLayout Q;
    public int R;
    public StaticLayout S;
    public final AtomicReference T;
    public int U;
    public StaticLayout V;
    public final AtomicReference W;
    public boolean a;
    public int a0;
    public androidx.emoji2.text.j b;
    public StaticLayout b0;
    public int c;
    public zi c0;
    public mi.b0 d;
    public final TextPaint d0;
    public final m2.p0 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public final TextPaint g0;
    public int h;
    public int h0;
    public StaticLayout i0;
    public int j0;
    public StaticLayout k0;
    public org.telegram.ui.Components.l5 l0;
    public final org.telegram.ui.ActionBar.e6 m0;
    public t70 n;
    public final int n0;
    public final ImageReceiver r;
    public boolean s;
    public final c70 w;
    public final wo x;
    public i7 y;

    public j7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new m2.p0(this);
        this.F = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new Stack();
        this.M = new Path();
        this.O = -1;
        this.P = org.telegram.messenger.g0.L(10.0f);
        this.R = org.telegram.messenger.g0.L(30.0f);
        this.T = new AtomicReference();
        this.U = org.telegram.messenger.g0.L(30.0f);
        this.W = new AtomicReference();
        this.a0 = org.telegram.messenger.g0.L(30.0f);
        this.j0 = org.telegram.messenger.g0.L(30.0f);
        this.m0 = e6Var;
        this.n0 = i3;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.d0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.e0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        this.w = new c70(0, e6Var);
        wo woVar = new wo(21, context, e6Var);
        this.x = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        boolean z10 = bd.a0;
        addView(woVar, mf.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i3 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.g0 = textPaint4;
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
        this.F.add(SpannableString.valueOf(trim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
            a(cv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + cv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i3 = 0; i3 < richText.texts.size(); i3++) {
                d(richText.texts.get(i3));
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
        mi.b0 b0Var = this.d;
        if (b0Var != null) {
            removeCallbacks(b0Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        wo woVar = this.x;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void g(int i3, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C);
        e();
        this.N.q = new h7(this, 0);
        int i12 = i3 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.O;
        SparseArray sparseArray = this.I;
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.H;
        if (i13 == 0) {
            float f10 = 0.0f;
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                Layout layout = (Layout) arrayList3.get(i14);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i14)).iterator();
                while (it.hasNext()) {
                    ((yh.f) it.next()).j(i12, ((i10 - this.G) - i11) + f10, sqrt, false);
                }
            }
        } else if (i13 == 1) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                ((yh.f) obj).j(i12, i10 - this.R, sqrt, false);
            }
        } else if (i13 == 2) {
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                ((yh.f) obj2).j(i12, i10 - this.U, sqrt, false);
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.O) {
                if (i17 == 0) {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        Layout layout2 = (Layout) arrayList3.get(i18);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i18)).iterator();
                        while (it2.hasNext()) {
                            ((yh.f) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i17 == 1) {
                    int size3 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        ((yh.f) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i17 == 2) {
                    int size4 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        ((yh.f) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                }
            }
        }
        this.O = -1;
        this.N = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public zi getMessage() {
        return this.c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.P();
        }
        this.l0 = org.telegram.ui.Components.p5.update(0, this, this.l0, this.k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.R();
        }
        org.telegram.ui.Components.p5.release(this, this.l0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j7 j7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.e6 e6Var = this.m0;
        if (this.n0 == 1) {
            this.f0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, e6Var));
        }
        StaticLayout staticLayout = this.i0;
        int i3 = this.P;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C) + (bd.a0 ? 0 : this.h0), i3);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C);
            if (bd.a0) {
                L += this.i0 == null ? 0.0f : org.telegram.messenger.g0.L(4.0f) + r3.getWidth();
            }
            canvas2.translate(L, i3);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.b0 != null) {
            this.g0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.a0);
            this.b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.S;
        TextPaint textPaint = this.e0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.R);
            yh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.U);
            yh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            j7Var = this;
            canvas2.restore();
        } else {
            j7Var = this;
        }
        ArrayList arrayList = j7Var.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, e6Var));
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i11);
                List list = (List) j7Var.I.get(i11);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), j7Var.G + i10);
                    Path path = j7Var.M;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((yh.f) it.next()).getBounds();
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
                        ((yh.f) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((yh.f) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i10 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (j7Var.e.h(canvas2)) {
                j7Var.invalidate();
            }
        }
        if (j7Var.k0 != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), j7Var.j0);
            j7Var.k0.draw(canvas2);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, j7Var.k0, j7Var.l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        j7Var.w.draw(canvas2);
        if (j7Var.s) {
            j7Var.r.h(canvas2, null);
        }
        if (j7Var.E) {
            if (bd.a0) {
                canvas2.drawLine(0.0f, j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), j7Var.getMeasuredHeight() - 1, j7Var.getMeasuredWidth(), j7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.S != null) {
            sb2.append(", ");
            sb2.append(this.S.getText());
        }
        if (this.V != null) {
            sb2.append(", ");
            sb2.append(this.V.getText());
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
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        String str;
        String str2;
        String str3;
        zi ziVar;
        float f10;
        SpannableStringBuilder spannableStringBuilder;
        zi ziVar2;
        int i11;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i12;
        String str4;
        int i13;
        zi ziVar3;
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
        c70 c70Var;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i18;
        boolean z11;
        SparseArray sparseArray2;
        int i19;
        c70 c70Var2;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i20;
        StaticLayout staticLayout7;
        boolean z12;
        StaticLayout staticLayout8;
        CharSequence x12;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i21;
        int i22;
        SpannableStringBuilder spannableStringBuilder3;
        boolean z13;
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
        ArrayList arrayList3 = this.K;
        ArrayList arrayList4 = this.J;
        this.s = false;
        this.S = null;
        this.Q = null;
        this.V = null;
        this.b0 = null;
        ArrayList arrayList5 = this.H;
        arrayList5.clear();
        ArrayList arrayList6 = this.F;
        arrayList6.clear();
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(8.0f);
        zi ziVar4 = this.c0;
        TLRPC.MessageMedia messageMedia = ziVar4.k.media;
        boolean z14 = true;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (ziVar4.n0 == null && webPage.photo != null) {
                    ziVar4.r0(true);
                }
                boolean z15 = (webPage.photo == null || this.c0.n0 == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z10 = z15;
                ziVar = this.c0;
                if (ziVar != null || ziVar.k.entities.isEmpty()) {
                    f10 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    f10 = 8.0f;
                    int i26 = 0;
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    while (i26 < this.c0.k.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.c0.k.entities.get(i26);
                        if (messageEntity.length <= 0 || (i22 = messageEntity.offset) < 0 || i22 >= this.c0.k.message.length()) {
                            i21 = i26;
                        } else {
                            if (messageEntity.offset + messageEntity.length > this.c0.k.message.length()) {
                                messageEntity.length = this.c0.k.message.length() - messageEntity.offset;
                            }
                            if (i26 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.c0.k.message.length())) {
                                if (this.c0.k.entities.size() != z14) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    li.h(this.c0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    li.h(this.c0, spannableStringBuilder4);
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
                                            z13 = z14;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            org.telegram.messenger.a8.g(e, z13);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i26 = i21 + 1;
                                            z14 = true;
                                        }
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("mailto:");
                                    String str10 = this.c0.k.message;
                                    int i27 = messageEntity.offset;
                                    sb2.append(str10.substring(i27, messageEntity.length + i27));
                                    str5 = sb2.toString();
                                    String str11 = this.c0.k.message;
                                    int i28 = messageEntity.offset;
                                    str2 = str11.substring(i28, messageEntity.length + i28);
                                    if (messageEntity.offset == 0) {
                                        if (messageEntity.length != this.c0.k.message.length()) {
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
                                                    arrayList2 = this.c0.k.entities;
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
                                                            ty0 ty0Var = new ty0();
                                                            str8 = str3;
                                                            try {
                                                                ty0Var.a |= 256;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                try {
                                                                    valueOf.setSpan(new uy0(ty0Var, 0), Math.max(i24, i32), Math.min(i25, i34) + i33, 33);
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                    z13 = true;
                                                                    org.telegram.messenger.a8.g(e, z13);
                                                                    spannableStringBuilder4 = spannableStringBuilder3;
                                                                    i26 = i21 + 1;
                                                                    z14 = true;
                                                                }
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                str2 = str7;
                                                                str3 = str8;
                                                                z13 = true;
                                                                org.telegram.messenger.a8.g(e, z13);
                                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                                i26 = i21 + 1;
                                                                z14 = true;
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
                                                        z13 = true;
                                                        org.telegram.messenger.a8.g(e, z13);
                                                        spannableStringBuilder4 = spannableStringBuilder3;
                                                        i26 = i21 + 1;
                                                        z14 = true;
                                                    }
                                                }
                                                str9 = str3;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                arrayList6.add(valueOf);
                                            } catch (Exception e17) {
                                                e = e17;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                z13 = true;
                                                org.telegram.messenger.a8.g(e, z13);
                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                i26 = i21 + 1;
                                                z14 = true;
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
                                    ?? valueOf2 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    li.h(this.c0, valueOf2);
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
                                String str12 = this.c0.k.message;
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
                                if (messageEntity.offset != 0 || messageEntity.length != this.c0.k.message.length()) {
                                    ?? valueOf3 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    li.h(this.c0, valueOf3);
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
                        z14 = true;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                ziVar2 = this.c0;
                if (ziVar2 != null && (message = ziVar2.k) != null && (richMessage = message.rich_message) != null) {
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
                i11 = this.n0;
                TextPaint textPaint3 = this.f0;
                if (i11 != 1) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String e18 = bd.e1(this.c0.k.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(e18));
                    textPaint = textPaint3;
                    this.i0 = q1.H1(e18, textPaint3, ceil, ceil, 0, 1);
                    this.h0 = (size - ceil) - org.telegram.messenger.g0.L(f10);
                    i12 = org.telegram.messenger.g0.L(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i12 = 0;
                }
                c70 c70Var3 = this.w;
                if (str2 != null) {
                    try {
                        ?? x13 = org.telegram.messenger.g0.x1(str2, this.c0.Y1, null);
                        int i36 = size - i12;
                        StaticLayout H1 = q1.H1(x13 != 0 ? x13 : str2, this.d0, i36 - org.telegram.messenger.g0.L(4.0f), i36 - org.telegram.messenger.g0.L(4.0f), 0, 3);
                        this.Q = H1;
                        if (H1.getLineCount() > 0) {
                            this.R = this.P + this.Q.getLineBottom(r5.getLineCount() - 1) + org.telegram.messenger.g0.L(4.0f);
                        }
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, true);
                    }
                    c70Var3.a(str2);
                }
                this.U = this.R;
                StaticLayout staticLayout9 = this.Q;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (i11 != 1) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.e0;
                Stack stack = this.L;
                float f14 = 5.0f;
                if (str4 != null) {
                    try {
                        StaticLayout H12 = q1.H1(str4, textPaint4, size, size, 0, max);
                        this.S = H12;
                        if (H12.getLineCount() > 0) {
                            this.U = this.R + this.S.getLineBottom(r13.getLineCount() - 1) + org.telegram.messenger.g0.L(5.0f);
                        }
                        stack.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.c0.L0) {
                            yh.f.c(this, this.S, stack, arrayList4);
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
                        this.V = q1.H1(spannableStringBuilder2, textPaint4, size, size, 0, max);
                        if (this.S != null) {
                            this.U += org.telegram.messenger.g0.L(10.0f);
                        }
                        stack.addAll(arrayList3);
                        arrayList3.clear();
                        if (!this.c0.L0) {
                            yh.f.c(this, this.V, stack, arrayList3);
                        }
                    } catch (Exception e22) {
                        e = e22;
                        org.telegram.messenger.a8.g(e, true);
                        ziVar3 = this.c0;
                        if (ziVar3 != null) {
                        }
                        staticLayout = this.b0;
                        if (staticLayout != null) {
                        }
                        if (!arrayList6.isEmpty()) {
                        }
                        c70 c70Var4 = c70Var3;
                        int i37 = size;
                        int L2 = org.telegram.messenger.g0.L(52.0f);
                        if (bd.a0) {
                        }
                        c70Var4.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L2, org.telegram.messenger.g0.L(63.0f));
                        if (z10) {
                        }
                        if (i11 == 1) {
                        }
                        staticLayout2 = this.Q;
                        if (staticLayout2 != null) {
                        }
                        i16 = i15;
                        staticLayout3 = this.b0;
                        if (staticLayout3 != null) {
                        }
                        f13 = 5.0f;
                        staticLayout4 = this.S;
                        if (staticLayout4 != null) {
                        }
                        staticLayout5 = this.V;
                        if (staticLayout5 != null) {
                        }
                        while (i17 < arrayList5.size()) {
                        }
                        int i38 = i16 + i15;
                        if (this.k0 != null) {
                        }
                        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(17.0f, i38, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
                    }
                } else {
                    i13 = max;
                }
                ziVar3 = this.c0;
                if (ziVar3 != null && !TextUtils.isEmpty(ziVar3.k.message) && (x12 = org.telegram.messenger.g0.x1(org.telegram.messenger.i6.m(this.c0.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), this.c0.Y1, null)) != null) {
                    String str13 = (String) this.c0.Y1.get(0);
                    TextPaint textPaint5 = this.g0;
                    this.b0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str13, size, textPaint5), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                staticLayout = this.b0;
                if (staticLayout != null) {
                    int i39 = this.R;
                    this.a0 = i39;
                    int C = org.telegram.messenger.k5.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i39);
                    this.R = C;
                    this.U = C;
                }
                if (!arrayList6.isEmpty()) {
                    int i40 = 0;
                    while (true) {
                        sparseArray = this.I;
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
                            c70Var2 = c70Var3;
                        } catch (Exception e23) {
                            e = e23;
                            c70Var = c70Var3;
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
                                    this.G = this.U;
                                    staticLayout7 = this.V;
                                } catch (Exception e24) {
                                    e = e24;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    c70Var = c70Var2;
                                    z11 = true;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                c70Var = c70Var2;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                                z11 = true;
                            }
                        } catch (Exception e26) {
                            e = e26;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i18 = size;
                            c70Var = c70Var2;
                            z11 = true;
                            sparseArray2 = sparseArray;
                            i19 = i41;
                            org.telegram.messenger.a8.g(e, z11);
                            i41 = i19 + 1;
                            sparseArray = sparseArray2;
                            c70Var3 = c70Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            size = i18;
                            f14 = 5.0f;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e27) {
                                e = e27;
                                z12 = true;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                z11 = z12;
                                c70Var = c70Var2;
                                sparseArray2 = sparseArray;
                                org.telegram.messenger.a8.g(e, z11);
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                c70Var3 = c70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f14 = 5.0f;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                z12 = true;
                                try {
                                    this.G = this.V.getLineBottom(r3.getLineCount() - 1) + org.telegram.messenger.g0.L(f14) + this.G;
                                    if (this.c0.L0) {
                                        int i42 = i41;
                                        try {
                                            ArrayList arrayList7 = new ArrayList();
                                            if (ellipsize instanceof Spannable) {
                                                i19 = i42;
                                                arrayList = arrayList6;
                                                i18 = i20;
                                                z11 = z12;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                c70Var = c70Var2;
                                                try {
                                                    yh.f.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack, arrayList7, null);
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    org.telegram.messenger.a8.g(e, z11);
                                                    i41 = i19 + 1;
                                                    sparseArray = sparseArray2;
                                                    c70Var3 = c70Var;
                                                    textPaint4 = textPaint2;
                                                    arrayList6 = arrayList;
                                                    size = i18;
                                                    f14 = 5.0f;
                                                }
                                            } else {
                                                i19 = i42;
                                                arrayList = arrayList6;
                                                i18 = i20;
                                                z11 = z12;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                c70Var = c70Var2;
                                            }
                                            sparseArray2.put(i19, arrayList7);
                                        } catch (Exception e29) {
                                            e = e29;
                                            i19 = i42;
                                            arrayList = arrayList6;
                                            i18 = i20;
                                            z11 = z12;
                                            c70Var = c70Var2;
                                            sparseArray2 = sparseArray;
                                            org.telegram.messenger.a8.g(e, z11);
                                            i41 = i19 + 1;
                                            sparseArray = sparseArray2;
                                            c70Var3 = c70Var;
                                            textPaint4 = textPaint2;
                                            arrayList6 = arrayList;
                                            size = i18;
                                            f14 = 5.0f;
                                        }
                                    } else {
                                        i19 = i41;
                                        arrayList = arrayList6;
                                        i18 = i20;
                                        z11 = z12;
                                        sparseArray2 = sparseArray;
                                        staticLayout8 = staticLayout6;
                                        c70Var = c70Var2;
                                    }
                                    arrayList5.add(staticLayout8);
                                } catch (Exception e30) {
                                    e = e30;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    z11 = z12;
                                    c70Var = c70Var2;
                                    sparseArray2 = sparseArray;
                                    org.telegram.messenger.a8.g(e, z11);
                                    i41 = i19 + 1;
                                    sparseArray = sparseArray2;
                                    c70Var3 = c70Var;
                                    textPaint4 = textPaint2;
                                    arrayList6 = arrayList;
                                    size = i18;
                                    f14 = 5.0f;
                                }
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                c70Var3 = c70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f14 = 5.0f;
                            }
                        }
                        z12 = true;
                        if (this.c0.L0) {
                        }
                        arrayList5.add(staticLayout8);
                        i41 = i19 + 1;
                        sparseArray = sparseArray2;
                        c70Var3 = c70Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        size = i18;
                        f14 = 5.0f;
                    }
                }
                c70 c70Var42 = c70Var3;
                int i372 = size;
                int L22 = org.telegram.messenger.g0.L(52.0f);
                if (bd.a0) {
                    f11 = 10.0f;
                    L = org.telegram.messenger.k5.z(10.0f, View.MeasureSpec.getSize(i3), L22);
                } else {
                    f11 = 10.0f;
                    L = org.telegram.messenger.g0.L(10.0f);
                }
                c70Var42.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L22, org.telegram.messenger.g0.L(63.0f));
                if (z10) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.c0.n0, L22, true, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(this.c0.n0, 80, false, null, false);
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
                    imageReceiver.r0(ac.f(w10, this.c0.l0), com.google.android.recaptcha.internal.a.i(L22, "_", L22), ac.f(photoSize, this.c0.l0), L22 + "_" + L22 + "_b", null, 0L, null, this.c0, 0);
                    this.s = true;
                }
                if (i11 == 1) {
                    f12 = f11;
                    i14 = 1;
                    StaticLayout H13 = q1.H1(wz.d(this.c0, true, 2, textPaint), textPaint, i372, i372, 0, i13);
                    this.k0 = H13;
                    i15 = 0;
                    this.l0 = org.telegram.ui.Components.p5.update(0, this, this.l0, H13);
                } else {
                    f12 = f11;
                    i14 = 1;
                    i15 = 0;
                }
                staticLayout2 = this.Q;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i16 = i15;
                } else {
                    StaticLayout staticLayout10 = this.Q;
                    i16 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i14) + org.telegram.messenger.g0.L(4.0f);
                }
                staticLayout3 = this.b0;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f13 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.b0;
                    f13 = 5.0f;
                    i16 = org.telegram.messenger.k5.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i14), i16);
                }
                staticLayout4 = this.S;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.S;
                    i16 = org.telegram.messenger.k5.C(f13, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i14), i16);
                }
                staticLayout5 = this.V;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.V;
                    i16 = org.telegram.messenger.k5.C(f13, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i14), i16);
                    if (this.S != null) {
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
                if (this.k0 != null) {
                    this.j0 = org.telegram.messenger.g0.L(f13) + this.G + i15;
                    StaticLayout staticLayout15 = this.k0;
                    i382 = org.telegram.messenger.k5.C(f13, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i14), i382);
                }
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(17.0f, i382, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
            }
        }
        z10 = false;
        str = null;
        str2 = null;
        str3 = null;
        ziVar = this.c0;
        if (ziVar != null) {
        }
        f10 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        ziVar2 = this.c0;
        if (ziVar2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i11 = this.n0;
        TextPaint textPaint32 = this.f0;
        if (i11 != 1) {
        }
        c70 c70Var32 = this.w;
        if (str2 != null) {
        }
        this.U = this.R;
        StaticLayout staticLayout92 = this.Q;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i11 != 1) {
        }
        TextPaint textPaint42 = this.e0;
        Stack stack2 = this.L;
        float f142 = 5.0f;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        ziVar3 = this.c0;
        if (ziVar3 != null) {
            String str132 = (String) this.c0.Y1.get(0);
            TextPaint textPaint52 = this.g0;
            this.b0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str132, size, textPaint52), textPaint52, size, TextUtils.TruncateAt.END), textPaint52, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        staticLayout = this.b0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        c70 c70Var422 = c70Var32;
        int i3722 = size;
        int L222 = org.telegram.messenger.g0.L(52.0f);
        if (bd.a0) {
        }
        c70Var422.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L222, org.telegram.messenger.g0.L(63.0f));
        if (z10) {
        }
        if (i11 == 1) {
        }
        staticLayout2 = this.Q;
        if (staticLayout2 != null) {
        }
        i16 = i15;
        staticLayout3 = this.b0;
        if (staticLayout3 != null) {
        }
        f13 = 5.0f;
        staticLayout4 = this.S;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.S;
            i16 = org.telegram.messenger.k5.C(f13, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i14), i16);
        }
        staticLayout5 = this.V;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.V;
            i16 = org.telegram.messenger.k5.C(f13, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i14), i16);
            if (this.S != null) {
            }
        }
        while (i17 < arrayList5.size()) {
        }
        int i3822 = i16 + i15;
        if (this.k0 != null) {
        }
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(17.0f, i3822, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        i7 i7Var;
        boolean z11;
        int i3;
        int i10;
        int i11;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.c0 != null) {
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty() && (i7Var = this.y) != null && i7Var.c()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.N == null) || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    z10 = false;
                    if (z10) {
                        return true;
                    }
                }
                int x10 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z10 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i12);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int L = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                        float f10 = x10;
                        float f11 = L;
                        if (f10 < staticLayout.getLineLeft(0) + f11 || f10 > staticLayout.getLineWidth(0) + f11 || y9 < (i11 = this.G + i13) || y9 > i11 + lineBottom) {
                            i13 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.N = null;
                                SparseArray sparseArray = this.I;
                                if (sparseArray.get(i12, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i12)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        yh.f fVar = (yh.f) it.next();
                                        if (fVar.getBounds().contains(x10 - L, (y9 - this.G) - i13)) {
                                            e();
                                            this.N = fVar;
                                            this.O = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.N == null && (this.h != i12 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i12;
                                    t70 t70Var = new t70(null, this.m0, x10 - L, (y9 - this.G) - i13, 0);
                                    this.n = t70Var;
                                    n70 b10 = t70Var.b();
                                    this.f = true;
                                    this.e.b(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new mi.b0(this, 21);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f11, this.G + i13);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.c0.k.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.y.a(((CharSequence) this.F.get(this.h)).toString(), false);
                                    } else {
                                        this.y.b(webPage, this.c0);
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                e();
                            } else if (this.N != null) {
                                g(x10, y9, i13);
                            } else {
                                z11 = true;
                                z10 = false;
                            }
                            z10 = true;
                        }
                    }
                    i12++;
                }
                z11 = z10;
                if (motionEvent.getAction() == 0) {
                    int L2 = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                    StaticLayout staticLayout2 = this.S;
                    if (staticLayout2 != null && x10 >= L2 && x10 <= staticLayout2.getWidth() + L2 && y9 >= (i10 = this.R) && y9 <= this.S.getHeight() + i10) {
                        ArrayList arrayList2 = this.J;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i14);
                            i14++;
                            yh.f fVar2 = (yh.f) obj;
                            if (fVar2.getBounds().contains(x10 - L2, y9 - this.R)) {
                                this.N = fVar2;
                                this.O = 1;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.V;
                    if (staticLayout3 != null && x10 >= L2 && x10 <= staticLayout3.getWidth() + L2 && y9 >= (i3 = this.U) && y9 <= this.V.getHeight() + i3) {
                        ArrayList arrayList3 = this.K;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            yh.f fVar3 = (yh.f) obj2;
                            if (fVar3.getBounds().contains(x10 - L2, y9 - this.U)) {
                                this.N = fVar3;
                                this.O = 2;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        e();
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.N != null) {
                        g(x10, y9, 0);
                        z10 = true;
                        z11 = true;
                        break;
                    }
                    if (!z11) {
                    }
                }
                return !z10 || super.onTouchEvent(motionEvent);
            }
        }
        e();
        z10 = false;
        if (z10) {
        }
    }

    public void setDelegate(i7 i7Var) {
        this.y = i7Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            TextPaint textPaint = this.d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.m0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
