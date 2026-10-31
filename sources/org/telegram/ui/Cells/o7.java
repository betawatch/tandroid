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
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.vv;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public nh.i M;
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
    public jj b0;
    public int c;
    public final TextPaint c0;
    public mg.c2 d;
    public final TextPaint d0;
    public final ji.a e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public int g0;
    public int h;
    public StaticLayout h0;
    public int i0;
    public StaticLayout j0;
    public org.telegram.ui.Components.k5 k0;
    public final org.telegram.ui.ActionBar.p6 l0;
    public final int m0;
    public q80 n;
    public final ImageReceiver r;
    public boolean s;
    public final z70 w;
    public final ep x;
    public n7 y;

    public o7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new ji.a(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = org.telegram.messenger.i0.L(10.0f);
        this.Q = org.telegram.messenger.i0.L(30.0f);
        this.S = new AtomicReference();
        this.T = org.telegram.messenger.i0.L(30.0f);
        this.V = new AtomicReference();
        this.W = org.telegram.messenger.i0.L(30.0f);
        this.i0 = org.telegram.messenger.i0.L(30.0f);
        this.l0 = p6Var;
        this.m0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.c0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.d0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(8.0f));
        this.w = new z70(0, p6Var);
        ep epVar = new ep(21, context, p6Var);
        this.x = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(2);
        boolean z10 = cd.X;
        addView(epVar, w7.b6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.e0 = textPaint3;
            textPaint3.setTextSize(org.telegram.messenger.i0.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f0 = textPaint4;
        textPaint4.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String trim = str.trim();
        if (trim.startsWith("#")) {
            return;
        }
        if (org.telegram.messenger.i0.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
            trim = "http://".concat(trim);
        }
        this.E.add(SpannableString.valueOf(trim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
            a(vv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + vv.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                d(richText.texts.get(i10));
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
        mg.c2 c2Var = this.d;
        if (c2Var != null) {
            removeCallbacks(c2Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        ep epVar = this.x;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        int L = org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C);
        e();
        this.M.q = new m7(this, 0);
        int i13 = i10 - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.N;
        SparseArray sparseArray = this.H;
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.J;
        ArrayList arrayList3 = this.G;
        if (i14 == 0) {
            float f7 = 0.0f;
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                Layout layout = (Layout) arrayList3.get(i15);
                f7 += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i15)).iterator();
                while (it.hasNext()) {
                    ((nh.i) it.next()).j(i13, ((i11 - this.F) - i12) + f7, sqrt, false);
                }
            }
        } else if (i14 == 1) {
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ((nh.i) obj).j(i13, i11 - this.Q, sqrt, false);
            }
        } else if (i14 == 2) {
            int size2 = arrayList2.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList2.get(i17);
                i17++;
                ((nh.i) obj2).j(i13, i11 - this.T, sqrt, false);
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.N) {
                if (i18 == 0) {
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        Layout layout2 = (Layout) arrayList3.get(i19);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i19)).iterator();
                        while (it2.hasNext()) {
                            ((nh.i) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i18 == 1) {
                    int size3 = arrayList.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        ((nh.i) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i18 == 2) {
                    int size4 = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        ((nh.i) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
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

    public jj getMessage() {
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.P();
        }
        this.k0 = org.telegram.ui.Components.o5.update(0, this, this.k0, this.j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.R();
        }
        org.telegram.ui.Components.o5.release(this, this.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o7 o7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.p6 p6Var = this.l0;
        if (this.m0 == 1) {
            this.e0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
        }
        StaticLayout staticLayout = this.h0;
        int i10 = this.O;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C) + (cd.X ? 0 : this.g0), i10);
            this.h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            float L = org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C);
            if (cd.X) {
                L += this.h0 == null ? 0.0f : org.telegram.messenger.i0.L(4.0f) + r3.getWidth();
            }
            canvas2.translate(L, i10);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            this.f0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.W);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.R;
        TextPaint textPaint = this.d0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.Q);
            nh.i.g(this, false, textPaint.getColor(), -org.telegram.messenger.i0.L(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.T);
            nh.i.g(this, false, textPaint.getColor(), -org.telegram.messenger.i0.L(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            o7Var = this;
            canvas2.restore();
        } else {
            o7Var = this;
        }
        ArrayList arrayList = o7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J6, p6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i12);
                List list = (List) o7Var.H.get(i12);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), o7Var.F + i11);
                    Path path = o7Var.L;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((nh.i) it.next()).getBounds();
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
                        ((nh.i) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((nh.i) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (o7Var.e.h(canvas2)) {
                o7Var.invalidate();
            }
        }
        if (o7Var.j0 != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), o7Var.i0);
            o7Var.j0.draw(canvas2);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, o7Var.j0, o7Var.k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        o7Var.w.draw(canvas2);
        if (o7Var.s) {
            o7Var.r.h(canvas2, null);
        }
        if (o7Var.D) {
            if (cd.X) {
                canvas2.drawLine(0.0f, o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth(), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
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
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        String str;
        String str2;
        String str3;
        jj jjVar;
        float f7;
        SpannableStringBuilder spannableStringBuilder;
        jj jjVar2;
        int i12;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i13;
        String str4;
        int i14;
        jj jjVar3;
        StaticLayout staticLayout;
        float f10;
        int L;
        float f11;
        int i15;
        int i16;
        StaticLayout staticLayout2;
        int i17;
        StaticLayout staticLayout3;
        float f12;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i18;
        SparseArray sparseArray;
        z70 z70Var;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i19;
        boolean z11;
        SparseArray sparseArray2;
        int i20;
        z70 z70Var2;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i21;
        StaticLayout staticLayout7;
        boolean z12;
        StaticLayout staticLayout8;
        CharSequence x12;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i22;
        int i23;
        SpannableStringBuilder spannableStringBuilder3;
        boolean z13;
        String str5;
        int lastIndexOf2;
        String str6;
        String str7;
        String str8;
        int i24;
        SpannableString valueOf;
        int i25;
        int i26;
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
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C)) - org.telegram.messenger.i0.L(8.0f);
        jj jjVar4 = this.b0;
        TLRPC.MessageMedia messageMedia = jjVar4.k.media;
        boolean z14 = true;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (jjVar4.n0 == null && webPage.photo != null) {
                    jjVar4.r0(true);
                }
                boolean z15 = (webPage.photo == null || this.b0.n0 == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z10 = z15;
                jjVar = this.b0;
                if (jjVar != null || jjVar.k.entities.isEmpty()) {
                    f7 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    f7 = 8.0f;
                    int i27 = 0;
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    while (i27 < this.b0.k.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.b0.k.entities.get(i27);
                        if (messageEntity.length <= 0 || (i23 = messageEntity.offset) < 0 || i23 >= this.b0.k.message.length()) {
                            i22 = i27;
                        } else {
                            if (messageEntity.offset + messageEntity.length > this.b0.k.message.length()) {
                                messageEntity.length = this.b0.k.message.length() - messageEntity.offset;
                            }
                            if (i27 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.b0.k.message.length())) {
                                if (this.b0.k.entities.size() != z14) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.k.message);
                                    ui.h(this.b0, spannableStringBuilder4);
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            try {
                            } catch (Exception e) {
                                e = e;
                                i22 = i27;
                            }
                            if (!(messageEntity instanceof TLRPC.TL_messageEntityTextUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityEmail) {
                                    if (str2 != null) {
                                        try {
                                        } catch (Exception e7) {
                                            e = e7;
                                            i22 = i27;
                                            z13 = z14;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            org.telegram.messenger.f8.g(e, z13);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i27 = i22 + 1;
                                            z14 = true;
                                        }
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("mailto:");
                                    String str10 = this.b0.k.message;
                                    int i28 = messageEntity.offset;
                                    sb2.append(str10.substring(i28, messageEntity.length + i28));
                                    str5 = sb2.toString();
                                    String str11 = this.b0.k.message;
                                    int i29 = messageEntity.offset;
                                    str2 = str11.substring(i29, messageEntity.length + i29);
                                    if (messageEntity.offset == 0) {
                                        if (messageEntity.length != this.b0.k.message.length()) {
                                        }
                                        if (str5 == null) {
                                            try {
                                                if ((org.telegram.messenger.i0.t(str5, "://") != -1) || str5.toString().toLowerCase().indexOf("http") == 0 || str5.toString().toLowerCase().indexOf("mailto") == 0) {
                                                    i24 = 0;
                                                } else {
                                                    str5 = "http://" + ((Object) str5);
                                                    i24 = 7;
                                                }
                                                try {
                                                    valueOf = SpannableString.valueOf(str5);
                                                    i25 = messageEntity.offset;
                                                    i26 = messageEntity.length + i25;
                                                    arrayList2 = this.b0.k.entities;
                                                    i22 = i27;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    i22 = i27;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                i22 = i27;
                                                str7 = str2;
                                                str8 = str3;
                                            }
                                            try {
                                                int size2 = arrayList2.size();
                                                str7 = str2;
                                                int i30 = 0;
                                                while (i30 < size2) {
                                                    try {
                                                        TLRPC.MessageEntity messageEntity2 = arrayList2.get(i30);
                                                        int i31 = i30 + 1;
                                                        int i32 = size2;
                                                        TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                                        int i33 = messageEntity3.offset;
                                                        int i34 = i24;
                                                        int i35 = messageEntity3.length + i33;
                                                        if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i25 > i35 || i26 < i33) {
                                                            str8 = str3;
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                        } else {
                                                            yz0 yz0Var = new yz0();
                                                            str8 = str3;
                                                            try {
                                                                yz0Var.a |= 256;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                try {
                                                                    valueOf.setSpan(new zz0(yz0Var, 0), Math.max(i25, i33), Math.min(i26, i35) + i34, 33);
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                    z13 = true;
                                                                    org.telegram.messenger.f8.g(e, z13);
                                                                    spannableStringBuilder4 = spannableStringBuilder3;
                                                                    i27 = i22 + 1;
                                                                    z14 = true;
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                str2 = str7;
                                                                str3 = str8;
                                                                z13 = true;
                                                                org.telegram.messenger.f8.g(e, z13);
                                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                                i27 = i22 + 1;
                                                                z14 = true;
                                                            }
                                                        }
                                                        i30 = i31;
                                                        size2 = i32;
                                                        i24 = i34;
                                                        str3 = str8;
                                                        spannableStringBuilder5 = spannableStringBuilder3;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                        str2 = str7;
                                                        z13 = true;
                                                        org.telegram.messenger.f8.g(e, z13);
                                                        spannableStringBuilder4 = spannableStringBuilder3;
                                                        i27 = i22 + 1;
                                                        z14 = true;
                                                    }
                                                }
                                                str9 = str3;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                arrayList6.add(valueOf);
                                            } catch (Exception e15) {
                                                e = e15;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                z13 = true;
                                                org.telegram.messenger.f8.g(e, z13);
                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                i27 = i22 + 1;
                                                z14 = true;
                                            }
                                        } else {
                                            i22 = i27;
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
                                int i36 = messageEntity.offset;
                                str5 = str12.substring(i36, messageEntity.length + i36);
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
                        i27 = i22 + 1;
                        z14 = true;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                jjVar2 = this.b0;
                if (jjVar2 != null && (message = jjVar2.k) != null && (richMessage = message.rich_message) != null) {
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
                i12 = this.m0;
                TextPaint textPaint3 = this.e0;
                if (i12 != 1) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String a12 = cd.a1(this.b0.k.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(a12));
                    textPaint = textPaint3;
                    this.h0 = q1.F1(a12, textPaint3, ceil, ceil, 0, 1);
                    this.g0 = (size - ceil) - org.telegram.messenger.i0.L(f7);
                    i13 = org.telegram.messenger.i0.L(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i13 = 0;
                }
                z70 z70Var3 = this.w;
                if (str2 != null) {
                    try {
                        ?? x13 = org.telegram.messenger.i0.x1(str2, this.b0.Y1, null);
                        int i37 = size - i13;
                        StaticLayout F1 = q1.F1(x13 != 0 ? x13 : str2, this.c0, i37 - org.telegram.messenger.i0.L(4.0f), i37 - org.telegram.messenger.i0.L(4.0f), 0, 3);
                        this.P = F1;
                        if (F1.getLineCount() > 0) {
                            this.Q = this.O + this.P.getLineBottom(r5.getLineCount() - 1) + org.telegram.messenger.i0.L(4.0f);
                        }
                    } catch (Exception e16) {
                        org.telegram.messenger.f8.g(e16, true);
                    }
                    z70Var3.a(str2);
                }
                this.T = this.Q;
                StaticLayout staticLayout9 = this.P;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (i12 != 1) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.d0;
                Stack stack = this.K;
                float f13 = 5.0f;
                if (str4 != null) {
                    try {
                        StaticLayout F12 = q1.F1(str4, textPaint4, size, size, 0, max);
                        this.R = F12;
                        if (F12.getLineCount() > 0) {
                            this.T = this.Q + this.R.getLineBottom(r13.getLineCount() - 1) + org.telegram.messenger.i0.L(5.0f);
                        }
                        stack.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.b0.L0) {
                            nh.i.c(this, this.R, stack, arrayList4);
                        }
                    } catch (Exception e17) {
                        org.telegram.messenger.f8.g(e17, true);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i14 = max;
                    } catch (Exception e18) {
                        e = e18;
                        i14 = max;
                    }
                    try {
                        this.U = q1.F1(spannableStringBuilder2, textPaint4, size, size, 0, max);
                        if (this.R != null) {
                            this.T += org.telegram.messenger.i0.L(10.0f);
                        }
                        stack.addAll(arrayList3);
                        arrayList3.clear();
                        if (!this.b0.L0) {
                            nh.i.c(this, this.U, stack, arrayList3);
                        }
                    } catch (Exception e19) {
                        e = e19;
                        org.telegram.messenger.f8.g(e, true);
                        jjVar3 = this.b0;
                        if (jjVar3 != null) {
                        }
                        staticLayout = this.a0;
                        if (staticLayout != null) {
                        }
                        if (!arrayList6.isEmpty()) {
                        }
                        z70 z70Var4 = z70Var3;
                        int i38 = size;
                        int L2 = org.telegram.messenger.i0.L(52.0f);
                        if (cd.X) {
                        }
                        z70Var4.setBounds(L, org.telegram.messenger.i0.L(11.0f), L + L2, org.telegram.messenger.i0.L(63.0f));
                        if (z10) {
                        }
                        if (i12 == 1) {
                        }
                        staticLayout2 = this.P;
                        if (staticLayout2 != null) {
                        }
                        i17 = i16;
                        staticLayout3 = this.a0;
                        if (staticLayout3 != null) {
                        }
                        f12 = 5.0f;
                        staticLayout4 = this.R;
                        if (staticLayout4 != null) {
                        }
                        staticLayout5 = this.U;
                        if (staticLayout5 != null) {
                        }
                        while (i18 < arrayList5.size()) {
                        }
                        int i39 = i17 + i16;
                        if (this.j0 != null) {
                        }
                        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
                        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(17.0f, i39, org.telegram.messenger.i0.L(76.0f)) + (this.D ? 1 : 0));
                    }
                } else {
                    i14 = max;
                }
                jjVar3 = this.b0;
                if (jjVar3 != null && !TextUtils.isEmpty(jjVar3.k.message) && (x12 = org.telegram.messenger.i0.x1(org.telegram.messenger.k6.m(this.b0.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false, null, 0), this.b0.Y1, null)) != null) {
                    String str13 = (String) this.b0.Y1.get(0);
                    TextPaint textPaint5 = this.f0;
                    this.a0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i0.Q(x12, str13, size, textPaint5), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, org.telegram.messenger.i0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                staticLayout = this.a0;
                if (staticLayout != null) {
                    int i40 = this.Q;
                    this.W = i40;
                    int C = org.telegram.messenger.m5.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i40);
                    this.Q = C;
                    this.T = C;
                }
                if (!arrayList6.isEmpty()) {
                    int i41 = 0;
                    while (true) {
                        sparseArray = this.H;
                        if (i41 >= sparseArray.size()) {
                            break;
                        }
                        stack.addAll((Collection) sparseArray.get(i41));
                        i41++;
                    }
                    sparseArray.clear();
                    int i42 = 0;
                    while (i42 < arrayList6.size()) {
                        try {
                            z70Var2 = z70Var3;
                        } catch (Exception e20) {
                            e = e20;
                            z70Var = z70Var3;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i19 = size;
                        }
                        try {
                            ellipsize = TextUtils.ellipsize(org.telegram.messenger.i0.M2(SpannableStringBuilder.valueOf((CharSequence) arrayList6.get(i42))), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(r0, 0, r0.length())), size), TextUtils.TruncateAt.MIDDLE);
                            i21 = size;
                            TextPaint textPaint6 = textPaint4;
                            try {
                                staticLayout6 = new StaticLayout(ellipsize, textPaint6, i21, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                textPaint2 = textPaint6;
                                try {
                                    this.F = this.T;
                                    staticLayout7 = this.U;
                                } catch (Exception e21) {
                                    e = e21;
                                    i20 = i42;
                                    arrayList = arrayList6;
                                    i19 = i21;
                                    z70Var = z70Var2;
                                    z11 = true;
                                }
                            } catch (Exception e22) {
                                e = e22;
                                i20 = i42;
                                arrayList = arrayList6;
                                i19 = i21;
                                z70Var = z70Var2;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                                z11 = true;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i19 = size;
                            z70Var = z70Var2;
                            z11 = true;
                            sparseArray2 = sparseArray;
                            i20 = i42;
                            org.telegram.messenger.f8.g(e, z11);
                            i42 = i20 + 1;
                            sparseArray = sparseArray2;
                            z70Var3 = z70Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            size = i19;
                            f13 = 5.0f;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e24) {
                                e = e24;
                                z12 = true;
                                i20 = i42;
                                arrayList = arrayList6;
                                i19 = i21;
                                z11 = z12;
                                z70Var = z70Var2;
                                sparseArray2 = sparseArray;
                                org.telegram.messenger.f8.g(e, z11);
                                i42 = i20 + 1;
                                sparseArray = sparseArray2;
                                z70Var3 = z70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i19;
                                f13 = 5.0f;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                z12 = true;
                                try {
                                    this.F = this.U.getLineBottom(r3.getLineCount() - 1) + org.telegram.messenger.i0.L(f13) + this.F;
                                    if (this.b0.L0) {
                                        int i43 = i42;
                                        try {
                                            ArrayList arrayList7 = new ArrayList();
                                            if (ellipsize instanceof Spannable) {
                                                i20 = i43;
                                                arrayList = arrayList6;
                                                i19 = i21;
                                                z11 = z12;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                z70Var = z70Var2;
                                                try {
                                                    nh.i.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack, arrayList7, null);
                                                } catch (Exception e25) {
                                                    e = e25;
                                                    org.telegram.messenger.f8.g(e, z11);
                                                    i42 = i20 + 1;
                                                    sparseArray = sparseArray2;
                                                    z70Var3 = z70Var;
                                                    textPaint4 = textPaint2;
                                                    arrayList6 = arrayList;
                                                    size = i19;
                                                    f13 = 5.0f;
                                                }
                                            } else {
                                                i20 = i43;
                                                arrayList = arrayList6;
                                                i19 = i21;
                                                z11 = z12;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                z70Var = z70Var2;
                                            }
                                            sparseArray2.put(i20, arrayList7);
                                        } catch (Exception e26) {
                                            e = e26;
                                            i20 = i43;
                                            arrayList = arrayList6;
                                            i19 = i21;
                                            z11 = z12;
                                            z70Var = z70Var2;
                                            sparseArray2 = sparseArray;
                                            org.telegram.messenger.f8.g(e, z11);
                                            i42 = i20 + 1;
                                            sparseArray = sparseArray2;
                                            z70Var3 = z70Var;
                                            textPaint4 = textPaint2;
                                            arrayList6 = arrayList;
                                            size = i19;
                                            f13 = 5.0f;
                                        }
                                    } else {
                                        i20 = i42;
                                        arrayList = arrayList6;
                                        i19 = i21;
                                        z11 = z12;
                                        sparseArray2 = sparseArray;
                                        staticLayout8 = staticLayout6;
                                        z70Var = z70Var2;
                                    }
                                    arrayList5.add(staticLayout8);
                                } catch (Exception e27) {
                                    e = e27;
                                    i20 = i42;
                                    arrayList = arrayList6;
                                    i19 = i21;
                                    z11 = z12;
                                    z70Var = z70Var2;
                                    sparseArray2 = sparseArray;
                                    org.telegram.messenger.f8.g(e, z11);
                                    i42 = i20 + 1;
                                    sparseArray = sparseArray2;
                                    z70Var3 = z70Var;
                                    textPaint4 = textPaint2;
                                    arrayList6 = arrayList;
                                    size = i19;
                                    f13 = 5.0f;
                                }
                                i42 = i20 + 1;
                                sparseArray = sparseArray2;
                                z70Var3 = z70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i19;
                                f13 = 5.0f;
                            }
                        }
                        z12 = true;
                        if (this.b0.L0) {
                        }
                        arrayList5.add(staticLayout8);
                        i42 = i20 + 1;
                        sparseArray = sparseArray2;
                        z70Var3 = z70Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        size = i19;
                        f13 = 5.0f;
                    }
                }
                z70 z70Var42 = z70Var3;
                int i382 = size;
                int L22 = org.telegram.messenger.i0.L(52.0f);
                if (cd.X) {
                    f10 = 10.0f;
                    L = org.telegram.messenger.m5.z(10.0f, View.MeasureSpec.getSize(i10), L22);
                } else {
                    f10 = 10.0f;
                    L = org.telegram.messenger.i0.L(10.0f);
                }
                z70Var42.setBounds(L, org.telegram.messenger.i0.L(11.0f), L + L22, org.telegram.messenger.i0.L(63.0f));
                if (z10) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(this.b0.n0, L22, true, null, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(this.b0.n0, 80, false, null, false);
                    TLRPC.PhotoSize photoSize = w10 == w9 ? null : w10;
                    if (w9 != null) {
                        w9.size = -1;
                    }
                    if (photoSize != null) {
                        photoSize.size = -1;
                    }
                    float L3 = org.telegram.messenger.i0.L(11.0f);
                    float f14 = L22;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.y0(L, L3, f14, f14);
                    org.telegram.messenger.b8.r(null, w9);
                    Locale locale = Locale.US;
                    imageReceiver.r0(ic.f(w9, this.b0.l0), a1.g.i(L22, L22, "_"), ic.f(photoSize, this.b0.l0), L22 + "_" + L22 + "_b", null, 0L, null, this.b0, 0);
                    this.s = true;
                }
                if (i12 == 1) {
                    f11 = f10;
                    i15 = 1;
                    StaticLayout F13 = q1.F1(z00.d(this.b0, true, 2, textPaint), textPaint, i382, i382, 0, i14);
                    this.j0 = F13;
                    i16 = 0;
                    this.k0 = org.telegram.ui.Components.o5.update(0, this, this.k0, F13);
                } else {
                    f11 = f10;
                    i15 = 1;
                    i16 = 0;
                }
                staticLayout2 = this.P;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i17 = i16;
                } else {
                    StaticLayout staticLayout10 = this.P;
                    i17 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i15) + org.telegram.messenger.i0.L(4.0f);
                }
                staticLayout3 = this.a0;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f12 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.a0;
                    f12 = 5.0f;
                    i17 = org.telegram.messenger.m5.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i15), i17);
                }
                staticLayout4 = this.R;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.R;
                    i17 = org.telegram.messenger.m5.C(f12, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i15), i17);
                }
                staticLayout5 = this.U;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.U;
                    i17 = org.telegram.messenger.m5.C(f12, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i15), i17);
                    if (this.R != null) {
                        i17 += org.telegram.messenger.i0.L(f11);
                    }
                }
                for (i18 = i16; i18 < arrayList5.size(); i18++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i18);
                    if (staticLayout14.getLineCount() > 0) {
                        i16 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i15) + i16;
                    }
                }
                int i392 = i17 + i16;
                if (this.j0 != null) {
                    this.i0 = org.telegram.messenger.i0.L(f12) + this.F + i16;
                    StaticLayout staticLayout15 = this.j0;
                    i392 = org.telegram.messenger.m5.C(f12, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i15), i392);
                }
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(17.0f, i392, org.telegram.messenger.i0.L(76.0f)) + (this.D ? 1 : 0));
            }
        }
        z10 = false;
        str = null;
        str2 = null;
        str3 = null;
        jjVar = this.b0;
        if (jjVar != null) {
        }
        f7 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        jjVar2 = this.b0;
        if (jjVar2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i12 = this.m0;
        TextPaint textPaint32 = this.e0;
        if (i12 != 1) {
        }
        z70 z70Var32 = this.w;
        if (str2 != null) {
        }
        this.T = this.Q;
        StaticLayout staticLayout92 = this.P;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i12 != 1) {
        }
        TextPaint textPaint42 = this.d0;
        Stack stack2 = this.K;
        float f132 = 5.0f;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        jjVar3 = this.b0;
        if (jjVar3 != null) {
            String str132 = (String) this.b0.Y1.get(0);
            TextPaint textPaint52 = this.f0;
            this.a0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i0.Q(x12, str132, size, textPaint52), textPaint52, size, TextUtils.TruncateAt.END), textPaint52, org.telegram.messenger.i0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        staticLayout = this.a0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        z70 z70Var422 = z70Var32;
        int i3822 = size;
        int L222 = org.telegram.messenger.i0.L(52.0f);
        if (cd.X) {
        }
        z70Var422.setBounds(L, org.telegram.messenger.i0.L(11.0f), L + L222, org.telegram.messenger.i0.L(63.0f));
        if (z10) {
        }
        if (i12 == 1) {
        }
        staticLayout2 = this.P;
        if (staticLayout2 != null) {
        }
        i17 = i16;
        staticLayout3 = this.a0;
        if (staticLayout3 != null) {
        }
        f12 = 5.0f;
        staticLayout4 = this.R;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.R;
            i17 = org.telegram.messenger.m5.C(f12, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i15), i17);
        }
        staticLayout5 = this.U;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.U;
            i17 = org.telegram.messenger.m5.C(f12, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i15), i17);
            if (this.R != null) {
            }
        }
        while (i18 < arrayList5.size()) {
        }
        int i3922 = i17 + i16;
        if (this.j0 != null) {
        }
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(17.0f, i3922, org.telegram.messenger.i0.L(76.0f)) + (this.D ? 1 : 0));
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
        n7 n7Var;
        boolean z11;
        int i10;
        int i11;
        int i12;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.b0 != null) {
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty() && (n7Var = this.y) != null && n7Var.c()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.M == null) || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    z10 = false;
                    if (z10) {
                        return true;
                    }
                }
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z10 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i13);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int L = org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C);
                        float f7 = x10;
                        float f10 = L;
                        if (f7 < staticLayout.getLineLeft(0) + f10 || f7 > staticLayout.getLineWidth(0) + f10 || y3 < (i12 = this.F + i14) || y3 > i12 + lineBottom) {
                            i14 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.M = null;
                                SparseArray sparseArray = this.H;
                                if (sparseArray.get(i13, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i13)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        nh.i iVar = (nh.i) it.next();
                                        if (iVar.getBounds().contains(x10 - L, (y3 - this.F) - i14)) {
                                            e();
                                            this.M = iVar;
                                            this.N = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.M == null && (this.h != i13 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i13;
                                    q80 q80Var = new q80(null, this.l0, x10 - L, (y3 - this.F) - i14, 0);
                                    this.n = q80Var;
                                    k80 b10 = q80Var.b();
                                    this.f = true;
                                    this.e.b(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new mg.c2(this, 20);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f10, this.F + i14);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
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
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, true);
                                }
                                e();
                            } else if (this.M != null) {
                                g(x10, y3, i14);
                            } else {
                                z11 = true;
                                z10 = false;
                            }
                            z10 = true;
                        }
                    }
                    i13++;
                }
                z11 = z10;
                if (motionEvent.getAction() == 0) {
                    int L2 = org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C);
                    StaticLayout staticLayout2 = this.R;
                    if (staticLayout2 != null && x10 >= L2 && x10 <= staticLayout2.getWidth() + L2 && y3 >= (i11 = this.Q) && y3 <= this.R.getHeight() + i11) {
                        ArrayList arrayList2 = this.I;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i15);
                            i15++;
                            nh.i iVar2 = (nh.i) obj;
                            if (iVar2.getBounds().contains(x10 - L2, y3 - this.Q)) {
                                this.M = iVar2;
                                this.N = 1;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.U;
                    if (staticLayout3 != null && x10 >= L2 && x10 <= staticLayout3.getWidth() + L2 && y3 >= (i10 = this.T) && y3 <= this.U.getHeight() + i10) {
                        ArrayList arrayList3 = this.J;
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj2 = arrayList3.get(i16);
                            i16++;
                            nh.i iVar3 = (nh.i) obj2;
                            if (iVar3.getBounds().contains(x10 - L2, y3 - this.T)) {
                                this.M = iVar3;
                                this.N = 2;
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
                    if (motionEvent.getAction() == 1 && this.M != null) {
                        g(x10, y3, 0);
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

    public void setDelegate(n7 n7Var) {
        this.y = n7Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            TextPaint textPaint = this.c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.l0));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
