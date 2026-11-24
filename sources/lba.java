// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lba extends FrameLayout implements tjb {
    public boolean E;
    public final ArrayList F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final ArrayList J;
    public final ArrayList K;
    public final Stack L;
    public final Path M;
    public qla N;
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
    public ef0 b;
    public StaticLayout b0;
    public int c;
    public k27 c0;
    public bg7 d;
    public final TextPaint d0;
    public final i46 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public final TextPaint g0;
    public int h;
    public int h0;
    public StaticLayout i0;
    public int j0;
    public StaticLayout k0;
    public cm l0;
    public final wjb m0;
    public m46 n;
    public final boolean n0;
    public final ImageReceiver r;
    public boolean s;
    public final o06 w;
    public final wf2 x;
    public kba y;

    /* JADX WARN: Multi-variable type inference failed */
    public lba(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new i46(this);
        this.F = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new Stack();
        this.M = new Path();
        this.O = -1;
        this.P = gl.L(10.0f);
        this.R = gl.L(30.0f);
        this.T = new AtomicReference();
        this.U = gl.L(30.0f);
        this.W = new AtomicReference();
        this.a0 = gl.L(30.0f);
        this.j0 = gl.L(30.0f);
        this.m0 = wjbVar;
        this.n0 = i;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.d0 = textPaint;
        textPaint.setTypeface(gl.o());
        textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
        TextPaint textPaint2 = new TextPaint(1);
        this.e0 = textPaint2;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint2.setTextSize(gl.L(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gl.L(8.0f));
        this.w = new o06(0, wjbVar);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.x = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(2);
        boolean z = k96.a0;
        addView(wf2Var, nme.d(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 44.0f, 44.0f, z ? 44.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f0 = textPaint3;
            textPaint3.setTextSize(gl.L(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.g0 = textPaint4;
        textPaint4.setTextSize(gl.L(13.0f));
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String trim = str.trim();
        if (trim.startsWith("#")) {
            return;
        }
        if (gl.t(trim, "://") == -1 && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
            trim = "http://".concat(trim);
        }
        this.F.add(SpannableString.valueOf(trim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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
            a(rh9.w(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:".concat(rh9.w(richText)));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                d(richText.texts.get(i));
            }
            return;
        }
        if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            d(richText.text);
        }
    }

    public final void e() {
        this.e.e(true);
        this.h = -1;
        this.n = null;
        this.f = false;
        this.a = false;
        ef0 ef0Var = this.b;
        if (ef0Var != null) {
            removeCallbacks(ef0Var);
        }
        bg7 bg7Var = this.d;
        if (bg7Var != null) {
            removeCallbacks(bg7Var);
        }
        invalidate();
    }

    public final void f(boolean z, boolean z2) {
        wf2 wf2Var = this.x;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void g(int i, int i2, int i3) {
        int L = gl.L(k96.a0 ? 8.0f : gl.C);
        e();
        this.N.q = new jba(this, (byte) 0);
        int i4 = i - L;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i5 = this.O;
        SparseArray sparseArray = this.I;
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.H;
        if (i5 == 0) {
            float f = 0.0f;
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                Layout layout = (Layout) arrayList3.get(i6);
                f += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i6)).iterator();
                while (it.hasNext()) {
                    ((qla) it.next()).j(i4, ((i2 - this.G) - i3) + f, sqrt, false);
                }
            }
        } else if (i5 == 1) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((qla) obj).j(i4, i2 - this.R, sqrt, false);
            }
        } else if (i5 == 2) {
            int size2 = arrayList2.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList2.get(i8);
                i8++;
                ((qla) obj2).j(i4, i2 - this.U, sqrt, false);
            }
        }
        for (int i9 = 0; i9 <= 2; i9++) {
            if (i9 != this.O) {
                if (i9 == 0) {
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        Layout layout2 = (Layout) arrayList3.get(i10);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i10)).iterator();
                        while (it2.hasNext()) {
                            ((qla) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i9 == 1) {
                    int size3 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        ((qla) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i9 == 2) {
                    int size4 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size4) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        ((qla) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
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

    public k27 getMessage() {
        return this.c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.I();
        }
        this.l0 = gm.update(0, this, this.l0, this.k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.K();
        }
        gm.release(this, this.l0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lba lbaVar;
        Canvas canvas2 = canvas;
        wjb wjbVar = this.m0;
        if (this.n0) {
            this.f0.setColor(bkb.v0(bkb.z6, wjbVar));
        }
        StaticLayout staticLayout = this.i0;
        int i = this.P;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C) + (k96.a0 ? 0 : this.h0), i);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.Q != null) {
            canvas2.save();
            float L = gl.L(k96.a0 ? 8.0f : gl.C);
            if (k96.a0) {
                L += this.i0 == null ? 0.0f : gl.L(4.0f) + r3.getWidth();
            }
            canvas2.translate(L, i);
            this.Q.draw(canvas2);
            canvas2.restore();
        }
        if (this.b0 != null) {
            this.g0.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C), this.a0);
            this.b0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.S;
        TextPaint textPaint = this.e0;
        if (staticLayout2 != null) {
            textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C), this.R);
            qla.g(this, false, textPaint.getColor(), -gl.L(2.0f), this.T, 0, this.S, this.J, canvas2, false);
            canvas2.restore();
        }
        if (this.V != null) {
            textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas2.save();
            canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C), this.U);
            qla.g(this, false, textPaint.getColor(), -gl.L(2.0f), this.W, 0, this.V, this.K, canvas2, false);
            lbaVar = this;
            canvas2.restore();
        } else {
            lbaVar = this;
        }
        ArrayList arrayList = lbaVar.H;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(bkb.v0(bkb.I6, wjbVar));
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i3);
                List list = (List) lbaVar.I.get(i3);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C), lbaVar.G + i2);
                    Path path = lbaVar.M;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((qla) it.next()).getBounds();
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
                        ((qla) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((qla) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i2 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (lbaVar.e.g(canvas2)) {
                lbaVar.invalidate();
            }
        }
        if (lbaVar.k0 != null) {
            canvas2.save();
            canvas2.translate(gl.L(k96.a0 ? 8.0f : gl.C), lbaVar.j0);
            lbaVar.k0.draw(canvas2);
            gm.drawAnimatedEmojis(canvas, lbaVar.k0, lbaVar.l0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        lbaVar.w.draw(canvas2);
        if (lbaVar.s) {
            lbaVar.r.h(canvas2, null);
        }
        if (lbaVar.E) {
            if (k96.a0) {
                canvas2.drawLine(0.0f, lbaVar.getMeasuredHeight() - 1, lbaVar.getMeasuredWidth() - gl.L(gl.C), lbaVar.getMeasuredHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(gl.L(gl.C), lbaVar.getMeasuredHeight() - 1, lbaVar.getMeasuredWidth(), lbaVar.getMeasuredHeight() - 1, bkb.j0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.S != null) {
            sb.append(", ");
            sb.append(this.S.getText());
        }
        if (this.V != null) {
            sb.append(", ");
            sb.append(this.V.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.x.a.q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0120, code lost:
    
        if (r6.length() == 0) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v29, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v65, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        String str;
        String str2;
        String str3;
        k27 k27Var;
        float f;
        SpannableStringBuilder spannableStringBuilder;
        k27 k27Var2;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i3;
        String str4;
        int i4;
        k27 k27Var3;
        StaticLayout staticLayout;
        float f2;
        int L;
        float f3;
        int i5;
        int i6;
        StaticLayout staticLayout2;
        int i7;
        StaticLayout staticLayout3;
        float f4;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i8;
        SparseArray sparseArray;
        o06 o06Var;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i9;
        boolean z3;
        SparseArray sparseArray2;
        int i10;
        o06 o06Var2;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i11;
        StaticLayout staticLayout7;
        boolean z4;
        StaticLayout staticLayout8;
        CharSequence v1;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i12;
        int i13;
        SpannableStringBuilder spannableStringBuilder3;
        boolean z5;
        String str5;
        int lastIndexOf2;
        String str6;
        String str7;
        String str8;
        int i14;
        SpannableString valueOf;
        int i15;
        int i16;
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
        int size = (View.MeasureSpec.getSize(i) - gl.L(gl.C)) - gl.L(8.0f);
        k27 k27Var4 = this.c0;
        TLRPC.MessageMedia messageMedia = k27Var4.k.media;
        boolean z6 = true;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (k27Var4.p0 == null && webPage.photo != null) {
                    k27Var4.r0(true);
                }
                boolean z7 = (webPage.photo == null || this.c0.p0 == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z = z7;
                k27Var = this.c0;
                if (k27Var != null || k27Var.k.entities.isEmpty()) {
                    f = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    f = 8.0f;
                    int i17 = 0;
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    while (i17 < this.c0.k.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.c0.k.entities.get(i17);
                        if (messageEntity.length <= 0 || (i13 = messageEntity.offset) < 0 || i13 >= this.c0.k.message.length()) {
                            i12 = i17;
                        } else {
                            if (messageEntity.offset + messageEntity.length > this.c0.k.message.length()) {
                                messageEntity.length = this.c0.k.message.length() - messageEntity.offset;
                            }
                            if (i17 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.c0.k.message.length())) {
                                if (this.c0.k.entities.size() != z6) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    hq6.g(this.c0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                    hq6.g(this.c0, spannableStringBuilder4);
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            try {
                            } catch (Exception e) {
                                e = e;
                                i12 = i17;
                            }
                            if ((messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                    String str10 = this.c0.k.message;
                                    int i18 = messageEntity.offset;
                                    str5 = str10.substring(i18, messageEntity.length + i18);
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
                                        ?? valueOf2 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                        hq6.g(this.c0, valueOf2);
                                        str6 = valueOf2;
                                        str3 = str6;
                                    }
                                }
                                if (str5 != null) {
                                    try {
                                        if ((gl.t(str5, "://") != -1) || str5.toString().toLowerCase().indexOf("http") == 0 || str5.toString().toLowerCase().indexOf("mailto") == 0) {
                                            i14 = 0;
                                        } else {
                                            str5 = "http://" + ((Object) str5);
                                            i14 = 7;
                                        }
                                        valueOf = SpannableString.valueOf(str5);
                                        i15 = messageEntity.offset;
                                        i16 = messageEntity.length + i15;
                                        arrayList2 = this.c0.k.entities;
                                        i12 = i17;
                                    } catch (Exception e2) {
                                        e = e2;
                                        i12 = i17;
                                        str7 = str2;
                                        str8 = str3;
                                    }
                                    try {
                                        int size2 = arrayList2.size();
                                        str7 = str2;
                                        int i19 = 0;
                                        while (i19 < size2) {
                                            try {
                                                TLRPC.MessageEntity messageEntity2 = arrayList2.get(i19);
                                                int i20 = i19 + 1;
                                                int i21 = size2;
                                                TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                                int i22 = messageEntity3.offset;
                                                int i23 = i14;
                                                int i24 = messageEntity3.length + i22;
                                                if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i15 > i24 || i16 < i22) {
                                                    str8 = str3;
                                                    spannableStringBuilder3 = spannableStringBuilder5;
                                                } else {
                                                    vib vibVar = new vib();
                                                    str8 = str3;
                                                    try {
                                                        vibVar.a |= 256;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                        try {
                                                            valueOf.setSpan(new wib(vibVar, 0), Math.max(i15, i22), Math.min(i16, i24) + i23, 33);
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str2 = str7;
                                                            str3 = str8;
                                                            z5 = true;
                                                            fa4.g(e, z5);
                                                            spannableStringBuilder4 = spannableStringBuilder3;
                                                            i17 = i12 + 1;
                                                            z6 = true;
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                        str2 = str7;
                                                        str3 = str8;
                                                        z5 = true;
                                                        fa4.g(e, z5);
                                                        spannableStringBuilder4 = spannableStringBuilder3;
                                                        i17 = i12 + 1;
                                                        z6 = true;
                                                    }
                                                }
                                                i19 = i20;
                                                size2 = i21;
                                                i14 = i23;
                                                str3 = str8;
                                                spannableStringBuilder5 = spannableStringBuilder3;
                                            } catch (Exception e5) {
                                                e = e5;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                str2 = str7;
                                                z5 = true;
                                                fa4.g(e, z5);
                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                i17 = i12 + 1;
                                                z6 = true;
                                            }
                                        }
                                        str9 = str3;
                                        spannableStringBuilder3 = spannableStringBuilder5;
                                        arrayList6.add(valueOf);
                                    } catch (Exception e6) {
                                        e = e6;
                                        spannableStringBuilder3 = spannableStringBuilder5;
                                        z5 = true;
                                        fa4.g(e, z5);
                                        spannableStringBuilder4 = spannableStringBuilder3;
                                        i17 = i12 + 1;
                                        z6 = true;
                                    }
                                } else {
                                    i12 = i17;
                                    str7 = str2;
                                    str9 = str3;
                                    spannableStringBuilder3 = spannableStringBuilder5;
                                }
                                str2 = str7;
                                str3 = str9;
                                spannableStringBuilder4 = spannableStringBuilder3;
                            } else {
                                if (messageEntity instanceof TLRPC.TL_messageEntityEmail) {
                                    if (str2 != null) {
                                        try {
                                        } catch (Exception e7) {
                                            e = e7;
                                            i12 = i17;
                                            z5 = z6;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            fa4.g(e, z5);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i17 = i12 + 1;
                                            z6 = true;
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("mailto:");
                                    String str11 = this.c0.k.message;
                                    int i25 = messageEntity.offset;
                                    sb.append(str11.substring(i25, messageEntity.length + i25));
                                    str5 = sb.toString();
                                    String str12 = this.c0.k.message;
                                    int i26 = messageEntity.offset;
                                    str2 = str12.substring(i26, messageEntity.length + i26);
                                    if (messageEntity.offset != 0 || messageEntity.length != this.c0.k.message.length()) {
                                        ?? valueOf3 = SpannableStringBuilder.valueOf(this.c0.k.message);
                                        hq6.g(this.c0, valueOf3);
                                        str6 = valueOf3;
                                        str3 = str6;
                                    }
                                    if (str5 != null) {
                                    }
                                    str2 = str7;
                                    str3 = str9;
                                    spannableStringBuilder4 = spannableStringBuilder3;
                                }
                                str5 = null;
                                if (str5 != null) {
                                }
                                str2 = str7;
                                str3 = str9;
                                spannableStringBuilder4 = spannableStringBuilder3;
                            }
                        }
                        i17 = i12 + 1;
                        z6 = true;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                k27Var2 = this.c0;
                if (k27Var2 != null && (message = k27Var2.k) != null && (richMessage = message.rich_message) != null) {
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
                z2 = this.n0;
                TextPaint textPaint3 = this.f0;
                if (!z2) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String e1 = k96.e1(this.c0.k.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(e1));
                    textPaint = textPaint3;
                    this.i0 = gb2.K1(e1, textPaint3, ceil, ceil, 0, 1);
                    this.h0 = (size - ceil) - gl.L(f);
                    i3 = gl.L(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i3 = 0;
                }
                o06 o06Var3 = this.w;
                if (str2 != null) {
                    try {
                        ?? v12 = gl.v1(str2, this.c0.a2, null);
                        int i27 = size - i3;
                        StaticLayout K1 = gb2.K1(v12 != 0 ? v12 : str2, this.d0, i27 - gl.L(4.0f), i27 - gl.L(4.0f), 0, 3);
                        this.Q = K1;
                        if (K1.getLineCount() > 0) {
                            this.R = this.P + this.Q.getLineBottom(r5.getLineCount() - 1) + gl.L(4.0f);
                        }
                    } catch (Exception e8) {
                        fa4.g(e8, true);
                    }
                    o06Var3.a(str2);
                }
                this.U = this.R;
                StaticLayout staticLayout9 = this.Q;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (!z2) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.e0;
                Stack stack = this.L;
                float f5 = 5.0f;
                if (str4 != null) {
                    try {
                        StaticLayout K12 = gb2.K1(str4, textPaint4, size, size, 0, max);
                        this.S = K12;
                        if (K12.getLineCount() > 0) {
                            this.U = this.R + this.S.getLineBottom(r13.getLineCount() - 1) + gl.L(5.0f);
                        }
                        stack.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.c0.N0) {
                            qla.c(this, this.S, stack, arrayList4);
                        }
                    } catch (Exception e9) {
                        fa4.g(e9, true);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i4 = max;
                    } catch (Exception e10) {
                        e = e10;
                        i4 = max;
                    }
                    try {
                        this.V = gb2.K1(spannableStringBuilder2, textPaint4, size, size, 0, max);
                        if (this.S != null) {
                            this.U += gl.L(10.0f);
                        }
                        stack.addAll(arrayList3);
                        arrayList3.clear();
                        if (!this.c0.N0) {
                            qla.c(this, this.V, stack, arrayList3);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fa4.g(e, true);
                        k27Var3 = this.c0;
                        if (k27Var3 != null) {
                        }
                        staticLayout = this.b0;
                        if (staticLayout != null) {
                        }
                        if (!arrayList6.isEmpty()) {
                        }
                        o06 o06Var4 = o06Var3;
                        int i28 = size;
                        int L2 = gl.L(52.0f);
                        if (k96.a0) {
                        }
                        o06Var4.setBounds(L, gl.L(11.0f), L + L2, gl.L(63.0f));
                        if (z) {
                        }
                        if (z2) {
                        }
                        staticLayout2 = this.Q;
                        if (staticLayout2 != null) {
                        }
                        i7 = i6;
                        staticLayout3 = this.b0;
                        if (staticLayout3 != null) {
                        }
                        f4 = 5.0f;
                        staticLayout4 = this.S;
                        if (staticLayout4 != null) {
                        }
                        staticLayout5 = this.V;
                        if (staticLayout5 != null) {
                        }
                        while (i8 < arrayList5.size()) {
                        }
                        int i29 = i7 + i6;
                        if (this.k0 != null) {
                        }
                        this.x.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
                        setMeasuredDimension(View.MeasureSpec.getSize(i), ls6.e(17.0f, i29, gl.L(76.0f)) + (this.E ? 1 : 0));
                    }
                } else {
                    i4 = max;
                }
                k27Var3 = this.c0;
                if (k27Var3 != null && !TextUtils.isEmpty(k27Var3.k.message) && (v1 = gl.v1(vu3.m(this.c0.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), bkb.n2.getFontMetricsInt(), false, null, 0), this.c0.a2, null)) != null) {
                    String str13 = (String) this.c0.a2.get(0);
                    TextPaint textPaint5 = this.g0;
                    this.b0 = new StaticLayout(TextUtils.ellipsize(gl.Q(v1, str13, size, textPaint5), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, gl.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                staticLayout = this.b0;
                if (staticLayout != null) {
                    int i30 = this.R;
                    this.a0 = i30;
                    int w = de9.w(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i30);
                    this.R = w;
                    this.U = w;
                }
                if (!arrayList6.isEmpty()) {
                    int i31 = 0;
                    while (true) {
                        sparseArray = this.I;
                        if (i31 >= sparseArray.size()) {
                            break;
                        }
                        stack.addAll((Collection) sparseArray.get(i31));
                        i31++;
                    }
                    sparseArray.clear();
                    int i32 = 0;
                    while (i32 < arrayList6.size()) {
                        try {
                            o06Var2 = o06Var3;
                        } catch (Exception e12) {
                            e = e12;
                            o06Var = o06Var3;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i9 = size;
                        }
                        try {
                            ellipsize = TextUtils.ellipsize(gl.K2(SpannableStringBuilder.valueOf((CharSequence) arrayList6.get(i32))), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(r0, 0, r0.length())), size), TextUtils.TruncateAt.MIDDLE);
                            i11 = size;
                            TextPaint textPaint6 = textPaint4;
                            try {
                                staticLayout6 = new StaticLayout(ellipsize, textPaint6, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                textPaint2 = textPaint6;
                                try {
                                    this.G = this.U;
                                    staticLayout7 = this.V;
                                } catch (Exception e13) {
                                    e = e13;
                                    i10 = i32;
                                    arrayList = arrayList6;
                                    i9 = i11;
                                    o06Var = o06Var2;
                                    z3 = true;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                i10 = i32;
                                arrayList = arrayList6;
                                i9 = i11;
                                o06Var = o06Var2;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                                z3 = true;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i9 = size;
                            o06Var = o06Var2;
                            z3 = true;
                            sparseArray2 = sparseArray;
                            i10 = i32;
                            fa4.g(e, z3);
                            i32 = i10 + 1;
                            sparseArray = sparseArray2;
                            o06Var3 = o06Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            size = i9;
                            f5 = 5.0f;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e16) {
                                e = e16;
                                z4 = true;
                                i10 = i32;
                                arrayList = arrayList6;
                                i9 = i11;
                                z3 = z4;
                                o06Var = o06Var2;
                                sparseArray2 = sparseArray;
                                fa4.g(e, z3);
                                i32 = i10 + 1;
                                sparseArray = sparseArray2;
                                o06Var3 = o06Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i9;
                                f5 = 5.0f;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                z4 = true;
                                try {
                                    this.G = this.V.getLineBottom(r3.getLineCount() - 1) + gl.L(f5) + this.G;
                                    if (this.c0.N0) {
                                        int i33 = i32;
                                        try {
                                            ArrayList arrayList7 = new ArrayList();
                                            if (ellipsize instanceof Spannable) {
                                                i10 = i33;
                                                arrayList = arrayList6;
                                                i9 = i11;
                                                z3 = z4;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                o06Var = o06Var2;
                                                try {
                                                    qla.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack, arrayList7, null);
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    fa4.g(e, z3);
                                                    i32 = i10 + 1;
                                                    sparseArray = sparseArray2;
                                                    o06Var3 = o06Var;
                                                    textPaint4 = textPaint2;
                                                    arrayList6 = arrayList;
                                                    size = i9;
                                                    f5 = 5.0f;
                                                }
                                            } else {
                                                i10 = i33;
                                                arrayList = arrayList6;
                                                i9 = i11;
                                                z3 = z4;
                                                sparseArray2 = sparseArray;
                                                staticLayout8 = staticLayout6;
                                                o06Var = o06Var2;
                                            }
                                            sparseArray2.put(i10, arrayList7);
                                        } catch (Exception e18) {
                                            e = e18;
                                            i10 = i33;
                                            arrayList = arrayList6;
                                            i9 = i11;
                                            z3 = z4;
                                            o06Var = o06Var2;
                                            sparseArray2 = sparseArray;
                                            fa4.g(e, z3);
                                            i32 = i10 + 1;
                                            sparseArray = sparseArray2;
                                            o06Var3 = o06Var;
                                            textPaint4 = textPaint2;
                                            arrayList6 = arrayList;
                                            size = i9;
                                            f5 = 5.0f;
                                        }
                                    } else {
                                        i10 = i32;
                                        arrayList = arrayList6;
                                        i9 = i11;
                                        z3 = z4;
                                        sparseArray2 = sparseArray;
                                        staticLayout8 = staticLayout6;
                                        o06Var = o06Var2;
                                    }
                                    arrayList5.add(staticLayout8);
                                } catch (Exception e19) {
                                    e = e19;
                                    i10 = i32;
                                    arrayList = arrayList6;
                                    i9 = i11;
                                    z3 = z4;
                                    o06Var = o06Var2;
                                    sparseArray2 = sparseArray;
                                    fa4.g(e, z3);
                                    i32 = i10 + 1;
                                    sparseArray = sparseArray2;
                                    o06Var3 = o06Var;
                                    textPaint4 = textPaint2;
                                    arrayList6 = arrayList;
                                    size = i9;
                                    f5 = 5.0f;
                                }
                                i32 = i10 + 1;
                                sparseArray = sparseArray2;
                                o06Var3 = o06Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                size = i9;
                                f5 = 5.0f;
                            }
                        }
                        z4 = true;
                        if (this.c0.N0) {
                        }
                        arrayList5.add(staticLayout8);
                        i32 = i10 + 1;
                        sparseArray = sparseArray2;
                        o06Var3 = o06Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        size = i9;
                        f5 = 5.0f;
                    }
                }
                o06 o06Var42 = o06Var3;
                int i282 = size;
                int L22 = gl.L(52.0f);
                if (k96.a0) {
                    f2 = 10.0f;
                    L = ls6.x(10.0f, View.MeasureSpec.getSize(i), L22);
                } else {
                    f2 = 10.0f;
                    L = gl.L(10.0f);
                }
                o06Var42.setBounds(L, gl.L(11.0f), L + L22, gl.L(63.0f));
                if (z) {
                    TLRPC.PhotoSize w2 = ba4.w(this.c0.p0, L22, true, null, false);
                    TLRPC.PhotoSize w3 = ba4.w(this.c0.p0, 80, false, null, false);
                    TLRPC.PhotoSize photoSize = w3 == w2 ? null : w3;
                    if (w2 != null) {
                        w2.size = -1;
                    }
                    if (photoSize != null) {
                        photoSize.size = -1;
                    }
                    float L3 = gl.L(11.0f);
                    float f6 = L22;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.i0(L, L3, f6, f6);
                    ba4.r(null, w2);
                    Locale locale = Locale.US;
                    imageReceiver.Z(gl5.f(w2, this.c0.n0), tb4.m(L22, L22, "_"), gl5.f(photoSize, this.c0.n0), L22 + "_" + L22 + "_b", null, 0L, null, this.c0, 0);
                    this.s = true;
                }
                if (z2) {
                    f3 = f2;
                    i5 = 1;
                    StaticLayout K13 = gb2.K1(af4.c(this.c0, true, 2, textPaint), textPaint, i282, i282, 0, i4);
                    this.k0 = K13;
                    i6 = 0;
                    this.l0 = gm.update(0, this, this.l0, K13);
                } else {
                    f3 = f2;
                    i5 = 1;
                    i6 = 0;
                }
                staticLayout2 = this.Q;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i7 = i6;
                } else {
                    StaticLayout staticLayout10 = this.Q;
                    i7 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i5) + gl.L(4.0f);
                }
                staticLayout3 = this.b0;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f4 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.b0;
                    f4 = 5.0f;
                    i7 = de9.w(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i5), i7);
                }
                staticLayout4 = this.S;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.S;
                    i7 = de9.w(f4, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i5), i7);
                }
                staticLayout5 = this.V;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.V;
                    i7 = de9.w(f4, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i5), i7);
                    if (this.S != null) {
                        i7 += gl.L(f3);
                    }
                }
                for (i8 = i6; i8 < arrayList5.size(); i8++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i8);
                    if (staticLayout14.getLineCount() > 0) {
                        i6 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i5) + i6;
                    }
                }
                int i292 = i7 + i6;
                if (this.k0 != null) {
                    this.j0 = gl.L(f4) + this.G + i6;
                    StaticLayout staticLayout15 = this.k0;
                    i292 = de9.w(f4, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i5), i292);
                }
                this.x.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i), ls6.e(17.0f, i292, gl.L(76.0f)) + (this.E ? 1 : 0));
            }
        }
        z = false;
        str = null;
        str2 = null;
        str3 = null;
        k27Var = this.c0;
        if (k27Var != null) {
        }
        f = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        k27Var2 = this.c0;
        if (k27Var2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        z2 = this.n0;
        TextPaint textPaint32 = this.f0;
        if (!z2) {
        }
        o06 o06Var32 = this.w;
        if (str2 != null) {
        }
        this.U = this.R;
        StaticLayout staticLayout92 = this.Q;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (!z2) {
        }
        TextPaint textPaint42 = this.e0;
        Stack stack2 = this.L;
        float f52 = 5.0f;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        k27Var3 = this.c0;
        if (k27Var3 != null) {
            String str132 = (String) this.c0.a2.get(0);
            TextPaint textPaint52 = this.g0;
            this.b0 = new StaticLayout(TextUtils.ellipsize(gl.Q(v1, str132, size, textPaint52), textPaint52, size, TextUtils.TruncateAt.END), textPaint52, gl.L(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        staticLayout = this.b0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        o06 o06Var422 = o06Var32;
        int i2822 = size;
        int L222 = gl.L(52.0f);
        if (k96.a0) {
        }
        o06Var422.setBounds(L, gl.L(11.0f), L + L222, gl.L(63.0f));
        if (z) {
        }
        if (z2) {
        }
        staticLayout2 = this.Q;
        if (staticLayout2 != null) {
        }
        i7 = i6;
        staticLayout3 = this.b0;
        if (staticLayout3 != null) {
        }
        f4 = 5.0f;
        staticLayout4 = this.S;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.S;
            i7 = de9.w(f4, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i5), i7);
        }
        staticLayout5 = this.V;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.V;
            i7 = de9.w(f4, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i5), i7);
            if (this.S != null) {
            }
        }
        while (i8 < arrayList5.size()) {
        }
        int i2922 = i7 + i6;
        if (this.k0 != null) {
        }
        this.x.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i), ls6.e(17.0f, i2922, gl.L(76.0f)) + (this.E ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        kba kbaVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.c0 != null) {
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty() && (kbaVar = this.y) != null && kbaVar.b()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.N == null) || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    z = false;
                    if (z) {
                        return true;
                    }
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i4);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int L = gl.L(k96.a0 ? 8.0f : gl.C);
                        float f = x;
                        float f2 = L;
                        if (f < staticLayout.getLineLeft(0) + f2 || f > staticLayout.getLineWidth(0) + f2 || y < (i3 = this.G + i5) || y > i3 + lineBottom) {
                            i5 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.N = null;
                                SparseArray sparseArray = this.I;
                                if (sparseArray.get(i4, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i4)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        qla qlaVar = (qla) it.next();
                                        if (qlaVar.getBounds().contains(x - L, (y - this.G) - i5)) {
                                            e();
                                            this.N = qlaVar;
                                            this.O = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.N == null && (this.h != i4 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i4;
                                    m46 m46Var = new m46(null, this.m0, x - L, (y - this.G) - i5, 0);
                                    this.n = m46Var;
                                    b46 b = m46Var.b();
                                    this.f = true;
                                    this.e.a(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        bg7 bg7Var = this.d;
                                        if (bg7Var == null) {
                                            bg7Var = new bg7(this, (byte) 27);
                                            this.d = bg7Var;
                                        }
                                        postDelayed(bg7Var, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b.e(staticLayout, 0, f2, this.G + i5);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.c0.k.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.y.c(((CharSequence) this.F.get(this.h)).toString(), false);
                                    } else {
                                        this.y.a(webPage, this.c0);
                                    }
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                                e();
                            } else if (this.N != null) {
                                g(x, y, i5);
                            } else {
                                z2 = true;
                                z = false;
                            }
                            z = true;
                        }
                    }
                    i4++;
                }
                z2 = z;
                if (motionEvent.getAction() == 0) {
                    int L2 = gl.L(k96.a0 ? 8.0f : gl.C);
                    StaticLayout staticLayout2 = this.S;
                    if (staticLayout2 != null && x >= L2 && x <= staticLayout2.getWidth() + L2 && y >= (i2 = this.R) && y <= this.S.getHeight() + i2) {
                        ArrayList arrayList2 = this.J;
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i6);
                            i6++;
                            qla qlaVar2 = (qla) obj;
                            if (qlaVar2.getBounds().contains(x - L2, y - this.R)) {
                                this.N = qlaVar2;
                                this.O = 1;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.V;
                    if (staticLayout3 != null && x >= L2 && x <= staticLayout3.getWidth() + L2 && y >= (i = this.U) && y <= this.V.getHeight() + i) {
                        ArrayList arrayList3 = this.K;
                        int size2 = arrayList3.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj2 = arrayList3.get(i7);
                            i7++;
                            qla qlaVar3 = (qla) obj2;
                            if (qlaVar3.getBounds().contains(x - L2, y - this.U)) {
                                this.N = qlaVar3;
                                this.O = 2;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        e();
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.N != null) {
                        g(x, y, 0);
                        z = true;
                        z2 = true;
                        break;
                    }
                    if (!z2) {
                    }
                }
                return !z || super.onTouchEvent(motionEvent);
            }
        }
        e();
        z = false;
        if (z) {
        }
    }

    public void setDelegate(kba kbaVar) {
        this.y = kbaVar;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            TextPaint textPaint = this.d0;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.F6, this.m0));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
