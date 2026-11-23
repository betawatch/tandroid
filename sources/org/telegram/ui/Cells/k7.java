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
import org.telegram.messenger.ev;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.t70;
import org.telegram.ui.b00;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public xh.f N;
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
    public fj c0;
    public i6.g d;
    public final TextPaint d0;
    public final n2.p0 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public final TextPaint g0;
    public int h;
    public int h0;
    public StaticLayout i0;
    public int j0;
    public StaticLayout k0;
    public org.telegram.ui.Components.t5 l0;
    public final org.telegram.ui.ActionBar.i6 m0;
    public k80 n;
    public final int n0;
    public final ImageReceiver r;
    public boolean s;
    public final t70 w;
    public final lp x;
    public j7 y;

    public k7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new n2.p0(this);
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
        this.m0 = i6Var;
        this.n0 = i7;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.d0 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.e0 = textPaint2;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.K0(org.telegram.messenger.g0.L(8.0f));
        this.w = new t70(0, i6Var);
        lp lpVar = new lp(21, context, i6Var);
        this.x = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(2);
        boolean z10 = gd.a0;
        addView(lpVar, c8.na.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i7 == 1) {
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
            a(ev.x(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + ev.x(richText));
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
        i6.g gVar = this.d;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        lp lpVar = this.x;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z10, z11);
    }

    public final void g(int i7, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C);
        e();
        this.N.q = new i7(this, 0);
        int i12 = i7 - L;
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
                    ((xh.f) it.next()).j(i12, ((i10 - this.G) - i11) + f10, sqrt, false);
                }
            }
        } else if (i13 == 1) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                ((xh.f) obj).j(i12, i10 - this.R, sqrt, false);
            }
        } else if (i13 == 2) {
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                ((xh.f) obj2).j(i12, i10 - this.U, sqrt, false);
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
        this.O = -1;
        this.N = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public fj getMessage() {
        return this.c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.Q();
        }
        this.l0 = org.telegram.ui.Components.x5.update(0, this, this.l0, this.k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.S();
        }
        org.telegram.ui.Components.x5.release(this, this.l0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k7 k7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.i6 i6Var = this.m0;
        if (this.n0 == 1) {
            this.f0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A6, i6Var));
        }
        StaticLayout staticLayout = this.i0;
        int i7 = this.P;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C) + (gd.a0 ? 0 : this.h0), i7);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C);
            if (gd.a0) {
                L += this.i0 == null ? 0.0f : org.telegram.messenger.g0.L(4.0f) + r3.getWidth();
            }
            canvas2.translate(L, i7);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.b0 != null) {
            this.g0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.a0);
            this.b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.S;
        TextPaint textPaint = this.e0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.R);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.U);
            xh.f.g(this, false, textPaint.getColor(), -org.telegram.messenger.g0.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            k7Var = this;
            canvas2.restore();
        } else {
            k7Var = this;
        }
        ArrayList arrayList = k7Var.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J6, i6Var));
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i11);
                List list = (List) k7Var.I.get(i11);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C), k7Var.G + i10);
                    Path path = k7Var.M;
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
        if (k7Var.k0 != null) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C), k7Var.j0);
            k7Var.k0.draw(canvas2);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, k7Var.k0, k7Var.l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        k7Var.w.draw(canvas2);
        if (k7Var.s) {
            k7Var.r.h(canvas2, null);
        }
        if (k7Var.E) {
            if (gd.a0) {
                canvas2.drawLine(0.0f, k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth(), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
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
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        String str;
        String str2;
        String str3;
        fj fjVar;
        float f10;
        SpannableStringBuilder spannableStringBuilder;
        fj fjVar2;
        int i11;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i12;
        String str4;
        int i13;
        fj fjVar3;
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
        t70 t70Var;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i18;
        boolean z11;
        SparseArray sparseArray2;
        int i19;
        t70 t70Var2;
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
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(8.0f);
        fj fjVar4 = this.c0;
        TLRPC.MessageMedia messageMedia = fjVar4.k.media;
        boolean z14 = true;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (fjVar4.p0 == null && webPage.photo != null) {
                    fjVar4.r0(true);
                }
                boolean z15 = (webPage.photo == null || this.c0.p0 == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z10 = z15;
                fjVar = this.c0;
                if (fjVar != null || fjVar.k.entities.isEmpty()) {
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
                                    ri.h(this.c0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    ri.h(this.c0, spannableStringBuilder4);
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
                                                            ez0 ez0Var = new ez0();
                                                            str8 = str3;
                                                            try {
                                                                ez0Var.a |= 256;
                                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                                try {
                                                                    valueOf.setSpan(new fz0(ez0Var, 0), Math.max(i24, i32), Math.min(i25, i34) + i33, 33);
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
                                    ri.h(this.c0, valueOf2);
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
                                    ri.h(this.c0, valueOf3);
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
                fjVar2 = this.c0;
                if (fjVar2 != null && (message = fjVar2.k) != null && (richMessage = message.rich_message) != null) {
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
                    String f14 = gd.f1(this.c0.k.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(f14));
                    textPaint = textPaint3;
                    this.i0 = r1.I1(f14, textPaint3, ceil, ceil, 0, 1);
                    this.h0 = (size - ceil) - org.telegram.messenger.g0.L(f10);
                    i12 = org.telegram.messenger.g0.L(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i12 = 0;
                }
                t70 t70Var3 = this.w;
                if (str2 != null) {
                    try {
                        ?? x13 = org.telegram.messenger.g0.x1(str2, this.c0.a2, null);
                        int i36 = size - i12;
                        StaticLayout I1 = r1.I1(x13 != 0 ? x13 : str2, this.d0, i36 - org.telegram.messenger.g0.L(4.0f), i36 - org.telegram.messenger.g0.L(4.0f), 0, 3);
                        this.Q = I1;
                        if (I1.getLineCount() > 0) {
                            this.R = this.P + this.Q.getLineBottom(r5.getLineCount() - 1) + org.telegram.messenger.g0.L(4.0f);
                        }
                    } catch (Exception e18) {
                        org.telegram.messenger.a8.g(e18, true);
                    }
                    t70Var3.a(str2);
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
                float f15 = 5.0f;
                if (str4 != null) {
                    try {
                        StaticLayout I12 = r1.I1(str4, textPaint4, size, size, 0, max);
                        this.S = I12;
                        if (I12.getLineCount() > 0) {
                            this.U = this.R + this.S.getLineBottom(r13.getLineCount() - 1) + org.telegram.messenger.g0.L(5.0f);
                        }
                        stack.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.c0.N0) {
                            xh.f.c(this, this.S, stack, arrayList4);
                        }
                    } catch (Exception e19) {
                        org.telegram.messenger.a8.g(e19, true);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i13 = max;
                    } catch (Exception e20) {
                        e = e20;
                        i13 = max;
                    }
                    try {
                        this.V = r1.I1(spannableStringBuilder2, textPaint4, size, size, 0, max);
                        if (this.S != null) {
                            this.U += org.telegram.messenger.g0.L(10.0f);
                        }
                        stack.addAll(arrayList3);
                        arrayList3.clear();
                        if (!this.c0.N0) {
                            xh.f.c(this, this.V, stack, arrayList3);
                        }
                    } catch (Exception e21) {
                        e = e21;
                        org.telegram.messenger.a8.g(e, true);
                        fjVar3 = this.c0;
                        if (fjVar3 != null) {
                        }
                        staticLayout = this.b0;
                        if (staticLayout != null) {
                        }
                        if (!arrayList6.isEmpty()) {
                        }
                        t70 t70Var4 = t70Var3;
                        int i37 = size;
                        int L2 = org.telegram.messenger.g0.L(52.0f);
                        if (gd.a0) {
                        }
                        t70Var4.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L2, org.telegram.messenger.g0.L(63.0f));
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
                        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.f3.b(17.0f, i38, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
                    }
                } else {
                    i13 = max;
                }
                fjVar3 = this.c0;
                if (fjVar3 != null && !TextUtils.isEmpty(fjVar3.k.message) && (x12 = org.telegram.messenger.g0.x1(org.telegram.messenger.j6.m(this.c0.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), false, null, 0), this.c0.a2, null)) != null) {
                    String str13 = (String) this.c0.a2.get(0);
                    TextPaint textPaint5 = this.g0;
                    this.b0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str13, size, textPaint5), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                staticLayout = this.b0;
                if (staticLayout != null) {
                    int i39 = this.R;
                    this.a0 = i39;
                    int C = org.telegram.messenger.f3.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i39);
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
                            t70Var2 = t70Var3;
                        } catch (Exception e22) {
                            e = e22;
                            t70Var = t70Var3;
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
                                } catch (Exception e23) {
                                    e = e23;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    t70Var = t70Var2;
                                    z11 = true;
                                }
                            } catch (Exception e24) {
                                e = e24;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                t70Var = t70Var2;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                                z11 = true;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i18 = size;
                            t70Var = t70Var2;
                            z11 = true;
                            sparseArray2 = sparseArray;
                            i19 = i41;
                            org.telegram.messenger.a8.g(e, z11);
                            i41 = i19 + 1;
                            sparseArray = sparseArray2;
                            t70Var3 = t70Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            size = i18;
                            f15 = 5.0f;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e26) {
                                e = e26;
                                z12 = true;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                z11 = z12;
                                t70Var = t70Var2;
                                sparseArray2 = sparseArray;
                                org.telegram.messenger.a8.g(e, z11);
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                t70Var3 = t70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f15 = 5.0f;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                z12 = true;
                                try {
                                    this.G = this.V.getLineBottom(r3.getLineCount() - 1) + org.telegram.messenger.g0.L(f15) + this.G;
                                    if (this.c0.N0) {
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
                                                t70Var = t70Var2;
                                                try {
                                                    xh.f.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack, arrayList7, null);
                                                } catch (Exception e27) {
                                                    e = e27;
                                                    org.telegram.messenger.a8.g(e, z11);
                                                    i41 = i19 + 1;
                                                    sparseArray = sparseArray2;
                                                    t70Var3 = t70Var;
                                                    textPaint4 = textPaint2;
                                                    arrayList6 = arrayList;
                                                    size = i18;
                                                    f15 = 5.0f;
                                                }
                                            } else {
                                                i19 = i42;
                                                arrayList = arrayList6;
                                                i18 = i20;
                                                z11 = z12;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                t70Var = t70Var2;
                                            }
                                            sparseArray2.put(i19, arrayList7);
                                        } catch (Exception e28) {
                                            e = e28;
                                            i19 = i42;
                                            arrayList = arrayList6;
                                            i18 = i20;
                                            z11 = z12;
                                            t70Var = t70Var2;
                                            sparseArray2 = sparseArray;
                                            org.telegram.messenger.a8.g(e, z11);
                                            i41 = i19 + 1;
                                            sparseArray = sparseArray2;
                                            t70Var3 = t70Var;
                                            textPaint4 = textPaint2;
                                            arrayList6 = arrayList;
                                            size = i18;
                                            f15 = 5.0f;
                                        }
                                    } else {
                                        i19 = i41;
                                        arrayList = arrayList6;
                                        i18 = i20;
                                        z11 = z12;
                                        sparseArray2 = sparseArray;
                                        staticLayout8 = staticLayout6;
                                        t70Var = t70Var2;
                                    }
                                    arrayList5.add(staticLayout8);
                                } catch (Exception e29) {
                                    e = e29;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    z11 = z12;
                                    t70Var = t70Var2;
                                    sparseArray2 = sparseArray;
                                    org.telegram.messenger.a8.g(e, z11);
                                    i41 = i19 + 1;
                                    sparseArray = sparseArray2;
                                    t70Var3 = t70Var;
                                    textPaint4 = textPaint2;
                                    arrayList6 = arrayList;
                                    size = i18;
                                    f15 = 5.0f;
                                }
                                i41 = i19 + 1;
                                sparseArray = sparseArray2;
                                t70Var3 = t70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i18;
                                f15 = 5.0f;
                            }
                        }
                        z12 = true;
                        if (this.c0.N0) {
                        }
                        arrayList5.add(staticLayout8);
                        i41 = i19 + 1;
                        sparseArray = sparseArray2;
                        t70Var3 = t70Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        size = i18;
                        f15 = 5.0f;
                    }
                }
                t70 t70Var42 = t70Var3;
                int i372 = size;
                int L22 = org.telegram.messenger.g0.L(52.0f);
                if (gd.a0) {
                    f11 = 10.0f;
                    L = org.telegram.messenger.f3.z(10.0f, View.MeasureSpec.getSize(i7), L22);
                } else {
                    f11 = 10.0f;
                    L = org.telegram.messenger.g0.L(10.0f);
                }
                t70Var42.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L22, org.telegram.messenger.g0.L(63.0f));
                if (z10) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.c0.p0, L22, true, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(this.c0.p0, 80, false, null, false);
                    TLRPC.PhotoSize photoSize = w11 == w10 ? null : w11;
                    if (w10 != null) {
                        w10.size = -1;
                    }
                    if (photoSize != null) {
                        photoSize.size = -1;
                    }
                    float L3 = org.telegram.messenger.g0.L(11.0f);
                    float f16 = L22;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.z0(L, L3, f16, f16);
                    org.telegram.messenger.w7.r(null, w10);
                    Locale locale = Locale.US;
                    imageReceiver.s0(fc.f(w10, this.c0.n0), com.google.android.gms.internal.vision.e2.j(L22, "_", L22), fc.f(photoSize, this.c0.n0), L22 + "_" + L22 + "_b", null, 0L, null, this.c0, 0);
                    this.s = true;
                }
                if (i11 == 1) {
                    f12 = f11;
                    i14 = 1;
                    StaticLayout I13 = r1.I1(b00.d(this.c0, true, 2, textPaint), textPaint, i372, i372, 0, i13);
                    this.k0 = I13;
                    i15 = 0;
                    this.l0 = org.telegram.ui.Components.x5.update(0, this, this.l0, I13);
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
                    i16 = org.telegram.messenger.f3.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i14), i16);
                }
                staticLayout4 = this.S;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.S;
                    i16 = org.telegram.messenger.f3.C(f13, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i14), i16);
                }
                staticLayout5 = this.V;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.V;
                    i16 = org.telegram.messenger.f3.C(f13, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i14), i16);
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
                    i382 = org.telegram.messenger.f3.C(f13, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i14), i382);
                }
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.f3.b(17.0f, i382, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
            }
        }
        z10 = false;
        str = null;
        str2 = null;
        str3 = null;
        fjVar = this.c0;
        if (fjVar != null) {
        }
        f10 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        fjVar2 = this.c0;
        if (fjVar2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i11 = this.n0;
        TextPaint textPaint32 = this.f0;
        if (i11 != 1) {
        }
        t70 t70Var32 = this.w;
        if (str2 != null) {
        }
        this.U = this.R;
        StaticLayout staticLayout92 = this.Q;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i11 != 1) {
        }
        TextPaint textPaint42 = this.e0;
        Stack stack2 = this.L;
        float f152 = 5.0f;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        fjVar3 = this.c0;
        if (fjVar3 != null) {
            String str132 = (String) this.c0.a2.get(0);
            TextPaint textPaint52 = this.g0;
            this.b0 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x12, str132, size, textPaint52), textPaint52, size, TextUtils.TruncateAt.END), textPaint52, org.telegram.messenger.g0.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        staticLayout = this.b0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        t70 t70Var422 = t70Var32;
        int i3722 = size;
        int L222 = org.telegram.messenger.g0.L(52.0f);
        if (gd.a0) {
        }
        t70Var422.setBounds(L, org.telegram.messenger.g0.L(11.0f), L + L222, org.telegram.messenger.g0.L(63.0f));
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
            i16 = org.telegram.messenger.f3.C(f13, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i14), i16);
        }
        staticLayout5 = this.V;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.V;
            i16 = org.telegram.messenger.f3.C(f13, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i14), i16);
            if (this.S != null) {
            }
        }
        while (i17 < arrayList5.size()) {
        }
        int i3822 = i16 + i15;
        if (this.k0 != null) {
        }
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.f3.b(17.0f, i3822, org.telegram.messenger.g0.L(76.0f)) + (this.E ? 1 : 0));
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
        j7 j7Var;
        boolean z11;
        int i7;
        int i10;
        int i11;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.c0 != null) {
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty() && (j7Var = this.y) != null && j7Var.d()) {
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
                int y10 = (int) motionEvent.getY();
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
                        int L = org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                        float f10 = x10;
                        float f11 = L;
                        if (f10 < staticLayout.getLineLeft(0) + f11 || f10 > staticLayout.getLineWidth(0) + f11 || y10 < (i11 = this.G + i13) || y10 > i11 + lineBottom) {
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
                                        xh.f fVar = (xh.f) it.next();
                                        if (fVar.getBounds().contains(x10 - L, (y10 - this.G) - i13)) {
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
                                    k80 k80Var = new k80(null, this.m0, x10 - L, (y10 - this.G) - i13, 0);
                                    this.n = k80Var;
                                    e80 b10 = k80Var.b();
                                    this.f = true;
                                    this.e.b(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new i6.g(this, 26);
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
                                g(x10, y10, i13);
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
                    int L2 = org.telegram.messenger.g0.L(gd.a0 ? 8.0f : org.telegram.messenger.g0.C);
                    StaticLayout staticLayout2 = this.S;
                    if (staticLayout2 != null && x10 >= L2 && x10 <= staticLayout2.getWidth() + L2 && y10 >= (i10 = this.R) && y10 <= this.S.getHeight() + i10) {
                        ArrayList arrayList2 = this.J;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i14);
                            i14++;
                            xh.f fVar2 = (xh.f) obj;
                            if (fVar2.getBounds().contains(x10 - L2, y10 - this.R)) {
                                this.N = fVar2;
                                this.O = 1;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.V;
                    if (staticLayout3 != null && x10 >= L2 && x10 <= staticLayout3.getWidth() + L2 && y10 >= (i7 = this.U) && y10 <= this.V.getHeight() + i7) {
                        ArrayList arrayList3 = this.K;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            xh.f fVar3 = (xh.f) obj2;
                            if (fVar3.getBounds().contains(x10 - L2, y10 - this.U)) {
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
                        g(x10, y10, 0);
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

    public void setDelegate(j7 j7Var) {
        this.y = j7Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            TextPaint textPaint = this.d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.m0));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
