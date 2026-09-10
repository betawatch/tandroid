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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v80;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout {
    public final ArrayList E;
    public int F;
    public final ArrayList G;
    public final SparseArray H;
    public final ArrayList I;
    public final ArrayList J;
    public final Stack K;
    public final Path L;
    public uh.h M;
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
    public MessageObject b0;
    public int c;
    public final TextPaint c0;
    public androidx.activity.i d;
    public final TextPaint d0;
    public final j90 e;
    public final TextPaint e0;
    public boolean f;
    public final TextPaint f0;
    public int g0;
    public int h;
    public StaticLayout h0;
    public int i0;
    public StaticLayout j0;
    public org.telegram.ui.Components.u5 k0;
    public final org.telegram.ui.ActionBar.f6 l0;
    public final int m0;
    public n90 n;
    public final ImageReceiver r;
    public boolean s;
    public final v80 v;
    public final tp w;
    public n7 x;
    public boolean y;

    public o7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new j90(this);
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.H = new SparseArray();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new Stack();
        this.L = new Path();
        this.N = -1;
        this.O = AndroidUtilities.dp(10.0f);
        this.Q = AndroidUtilities.dp(30.0f);
        this.S = new AtomicReference();
        this.T = AndroidUtilities.dp(30.0f);
        this.V = new AtomicReference();
        this.W = AndroidUtilities.dp(30.0f);
        this.i0 = AndroidUtilities.dp(30.0f);
        this.l0 = f6Var;
        this.m0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.c0 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.d0 = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new v80(0, f6Var);
        tp tpVar = new tp(context, 21, f6Var);
        this.w = tpVar;
        tpVar.setVisibility(4);
        tpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
        addView(tpVar, w7.a6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.e0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.f0 = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String trim = str.trim();
        if (trim.startsWith("#")) {
            return;
        }
        if (!AndroidUtilities.charSequenceContains(trim, "://") && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
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
            a(RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            a("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            a("mailto:" + RichMessageLayout.getString(richText));
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
        this.e.d(true);
        this.h = -1;
        this.n = null;
        this.f = false;
        this.a = false;
        androidx.emoji2.text.j jVar = this.b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        androidx.activity.i iVar = this.d;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        tp tpVar = this.w;
        if (tpVar.getVisibility() != 0) {
            tpVar.setVisibility(0);
        }
        tpVar.a(z10, z11);
    }

    public final void g(int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        e();
        this.M.q = new m7(this, 0);
        int i13 = i10 - dp;
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
                    ((uh.h) it.next()).j(i13, ((i11 - this.F) - i12) + f7, sqrt, false);
                }
            }
        } else if (i14 == 1) {
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ((uh.h) obj).j(i13, i11 - this.Q, sqrt, false);
            }
        } else if (i14 == 2) {
            int size2 = arrayList2.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList2.get(i17);
                i17++;
                ((uh.h) obj2).j(i13, i11 - this.T, sqrt, false);
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
                            ((uh.h) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i18 == 1) {
                    int size3 = arrayList.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        ((uh.h) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i18 == 2) {
                    int size4 = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        ((uh.h) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
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

    public MessageObject getMessage() {
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.onAttachedToWindow();
        }
        this.k0 = org.telegram.ui.Components.y5.update(0, this, this.k0, this.j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.y5.release(this, this.k0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o7 o7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.f6 f6Var = this.l0;
        if (this.m0 == 1) {
            this.e0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        }
        StaticLayout staticLayout = this.h0;
        int i10 = this.O;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.g0), i10);
            this.h0.draw(canvas2);
            canvas2.restore();
        }
        if (this.P != null) {
            canvas2.save();
            float dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                dp += this.h0 == null ? 0.0f : AndroidUtilities.dp(4.0f) + r3.getWidth();
            }
            canvas2.translate(dp, i10);
            this.P.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            this.f0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.W);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.R;
        TextPaint textPaint = this.d0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.Q);
            uh.h.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.S, 0, this.R, this.I, canvas2, false);
            canvas2.restore();
        }
        if (this.U != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.T);
            uh.h.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.V, 0, this.U, this.J, canvas2, false);
            o7Var = this;
            canvas2.restore();
        } else {
            o7Var = this;
        }
        ArrayList arrayList = o7Var.G;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i12);
                List list = (List) o7Var.H.get(i12);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), o7Var.F + i11);
                    Path path = o7Var.L;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((uh.h) it.next()).getBounds();
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
                        ((uh.h) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((uh.h) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (o7Var.e.f(canvas2)) {
                o7Var.invalidate();
            }
        }
        if (o7Var.j0 != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), o7Var.i0);
            o7Var.j0.draw(canvas2);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, o7Var.j0, o7Var.k0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        o7Var.v.draw(canvas2);
        if (o7Var.s) {
            o7Var.r.draw(canvas2);
        }
        if (o7Var.y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), o7Var.getMeasuredHeight() - 1, o7Var.getMeasuredWidth(), o7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
        if (this.w.a.q) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v26, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v61, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        String str;
        String str2;
        String str3;
        boolean z10;
        MessageObject messageObject;
        float f7;
        SpannableStringBuilder spannableStringBuilder;
        MessageObject messageObject2;
        int i12;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i13;
        String str4;
        int i14;
        MessageObject messageObject3;
        TLRPC.PhotoSize photoSize;
        StaticLayout staticLayout;
        int i15;
        float f10;
        int i16;
        StaticLayout staticLayout2;
        int i17;
        StaticLayout staticLayout3;
        float f11;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i18;
        SparseArray sparseArray;
        v80 v80Var;
        TLRPC.PhotoSize photoSize2;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i19;
        SparseArray sparseArray2;
        int i20;
        Stack stack;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i21;
        StaticLayout staticLayout7;
        StaticLayout staticLayout8;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i22;
        SpannableStringBuilder spannableStringBuilder3;
        String str5;
        int lastIndexOf2;
        String str6;
        int i23;
        String str7;
        String str8;
        ArrayList<TLRPC.MessageEntity> arrayList2;
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
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject4 = this.b0;
        TLRPC.MessageMedia messageMedia = messageObject4.messageOwner.media;
        int i24 = 1;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (messageObject4.photoThumbs == null && webPage.photo != null) {
                    messageObject4.generateThumbs(true);
                }
                boolean z11 = (webPage.photo == null || this.b0.photoThumbs == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z10 = z11;
                messageObject = this.b0;
                if (messageObject != null || messageObject.messageOwner.entities.isEmpty()) {
                    f7 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    f7 = 8.0f;
                    int i25 = 0;
                    while (i25 < this.b0.messageOwner.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.b0.messageOwner.entities.get(i25);
                        if (messageEntity.length > 0 && (i22 = messageEntity.offset) >= 0 && i22 < this.b0.messageOwner.message.length()) {
                            if (messageEntity.offset + messageEntity.length > this.b0.messageOwner.message.length()) {
                                messageEntity.length = this.b0.messageOwner.message.length() - messageEntity.offset;
                            }
                            if (i25 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.b0.messageOwner.message.length())) {
                                if (this.b0.messageOwner.entities.size() != i24) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.b0, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.b0.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.b0, spannableStringBuilder4);
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            try {
                            } catch (Exception e) {
                                e = e;
                            }
                            if (!(messageEntity instanceof TLRPC.TL_messageEntityTextUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityEmail) || (str2 != null && str2.length() != 0)) {
                                    str5 = null;
                                    if (str5 != null) {
                                        try {
                                            if (AndroidUtilities.charSequenceContains(str5, "://") || str5.toString().toLowerCase().indexOf("http") == 0 || str5.toString().toLowerCase().indexOf("mailto") == 0) {
                                                i23 = 0;
                                            } else {
                                                str5 = "http://" + ((Object) str5);
                                                i23 = 7;
                                            }
                                            SpannableString valueOf = SpannableString.valueOf(str5);
                                            int i26 = messageEntity.offset;
                                            int i27 = messageEntity.length + i26;
                                            ArrayList<TLRPC.MessageEntity> arrayList7 = this.b0.messageOwner.entities;
                                            str7 = str2;
                                            try {
                                                int size2 = arrayList7.size();
                                                int i28 = i23;
                                                int i29 = 0;
                                                while (i29 < size2) {
                                                    TLRPC.MessageEntity messageEntity2 = arrayList7.get(i29);
                                                    int i30 = i29 + 1;
                                                    int i31 = size2;
                                                    TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                                    int i32 = messageEntity3.offset;
                                                    String str9 = str3;
                                                    try {
                                                        int i33 = messageEntity3.length + i32;
                                                        if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i26 > i33 || i27 < i32) {
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                            arrayList2 = arrayList7;
                                                        } else {
                                                            b11 b11Var = new b11();
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                            try {
                                                                b11Var.a |= 256;
                                                                arrayList2 = arrayList7;
                                                                valueOf.setSpan(new c11(b11Var, 0), Math.max(i26, i32), Math.min(i27, i33) + i28, 33);
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                str2 = str7;
                                                                str3 = str9;
                                                                FileLog.e(e);
                                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                                i25++;
                                                                i24 = 1;
                                                            }
                                                        }
                                                        i29 = i30;
                                                        size2 = i31;
                                                        str3 = str9;
                                                        spannableStringBuilder5 = spannableStringBuilder3;
                                                        arrayList7 = arrayList2;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                    }
                                                }
                                                str8 = str3;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                arrayList6.add(valueOf);
                                            } catch (Exception e11) {
                                                e = e11;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                str2 = str7;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            FileLog.e(e);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i25++;
                                            i24 = 1;
                                        }
                                    } else {
                                        str7 = str2;
                                        str8 = str3;
                                        spannableStringBuilder3 = spannableStringBuilder5;
                                    }
                                    str2 = str7;
                                    str3 = str8;
                                    spannableStringBuilder4 = spannableStringBuilder3;
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("mailto:");
                                String str10 = this.b0.messageOwner.message;
                                int i34 = messageEntity.offset;
                                sb2.append(str10.substring(i34, messageEntity.length + i34));
                                str5 = sb2.toString();
                                String str11 = this.b0.messageOwner.message;
                                int i35 = messageEntity.offset;
                                str2 = str11.substring(i35, messageEntity.length + i35);
                                if (messageEntity.offset != 0 || messageEntity.length != this.b0.messageOwner.message.length()) {
                                    ?? valueOf2 = SpannableStringBuilder.valueOf(this.b0.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.b0, valueOf2);
                                    str6 = valueOf2;
                                    str3 = str6;
                                }
                                if (str5 != null) {
                                }
                                str2 = str7;
                                str3 = str8;
                                spannableStringBuilder4 = spannableStringBuilder3;
                            }
                            if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                String str12 = this.b0.messageOwner.message;
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
                                if (messageEntity.offset != 0 || messageEntity.length != this.b0.messageOwner.message.length()) {
                                    ?? valueOf3 = SpannableStringBuilder.valueOf(this.b0.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.b0, valueOf3);
                                    str6 = valueOf3;
                                    str3 = str6;
                                }
                            }
                            if (str5 != null) {
                            }
                            str2 = str7;
                            str3 = str8;
                            spannableStringBuilder4 = spannableStringBuilder3;
                        }
                        i25++;
                        i24 = 1;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                messageObject2 = this.b0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (richMessage = message.rich_message) != null) {
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
                    String stringForMessageListDate = LocaleController.stringForMessageListDate(this.b0.messageOwner.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(stringForMessageListDate));
                    textPaint = textPaint3;
                    this.h0 = t1.u2(stringForMessageListDate, textPaint3, ceil, ceil, 0, 1);
                    this.g0 = (size - ceil) - AndroidUtilities.dp(f7);
                    i13 = AndroidUtilities.dp(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i13 = 0;
                }
                v80 v80Var2 = this.v;
                if (str2 != null) {
                    try {
                        ?? highlightText = AndroidUtilities.highlightText(str2, this.b0.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                        int i37 = size - i13;
                        StaticLayout u22 = t1.u2(highlightText != 0 ? highlightText : str2, this.c0, i37 - AndroidUtilities.dp(4.0f), i37 - AndroidUtilities.dp(4.0f), 0, 3);
                        this.P = u22;
                        if (u22.getLineCount() > 0) {
                            this.Q = this.O + this.P.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                        }
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    v80Var2.a(str2);
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
                Stack stack2 = this.K;
                if (str4 != null) {
                    try {
                        StaticLayout u23 = t1.u2(str4, textPaint4, size, size, 0, max);
                        this.R = u23;
                        if (u23.getLineCount() > 0) {
                            this.T = this.Q + this.R.getLineBottom(r8.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                        }
                        stack2.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.b0.isSpoilersRevealed) {
                            uh.h.c(this, this.R, stack2, arrayList4);
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i14 = max;
                        try {
                            this.U = t1.u2(spannableStringBuilder2, textPaint4, size, size, 0, max);
                            if (this.R != null) {
                                this.T += AndroidUtilities.dp(10.0f);
                            }
                            stack2.addAll(arrayList3);
                            arrayList3.clear();
                            if (!this.b0.isSpoilersRevealed) {
                                uh.h.c(this, this.U, stack2, arrayList3);
                            }
                        } catch (Exception e15) {
                            e = e15;
                            FileLog.e(e);
                            messageObject3 = this.b0;
                            if (messageObject3 != null) {
                            }
                            photoSize = null;
                            staticLayout = this.a0;
                            if (staticLayout != null) {
                            }
                            if (!arrayList6.isEmpty()) {
                            }
                            v80 v80Var3 = v80Var2;
                            TLRPC.PhotoSize photoSize3 = photoSize;
                            int i38 = size;
                            int dp = AndroidUtilities.dp(52.0f);
                            if (LocaleController.isRTL) {
                            }
                            v80Var3.setBounds(r2, AndroidUtilities.dp(11.0f), r2 + dp, AndroidUtilities.dp(63.0f));
                            if (z10) {
                            }
                            if (i12 == i15) {
                            }
                            staticLayout2 = this.P;
                            if (staticLayout2 != null) {
                            }
                            i17 = 0;
                            staticLayout3 = this.a0;
                            if (staticLayout3 != null) {
                            }
                            f11 = 5.0f;
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
                            this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.a2.b(17.0f, i39, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
                        }
                    } catch (Exception e16) {
                        e = e16;
                        i14 = max;
                    }
                } else {
                    i14 = max;
                }
                messageObject3 = this.b0;
                if (messageObject3 != null || TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                    photoSize = null;
                } else {
                    photoSize = null;
                    CharSequence highlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.b0.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), this.b0.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                    if (highlightText2 != null) {
                        String str13 = this.b0.highlightedWords.get(0);
                        TextPaint textPaint5 = this.f0;
                        this.a0 = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(highlightText2, str13, size, textPaint5, 130), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, AndroidUtilities.dp(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                staticLayout = this.a0;
                if (staticLayout != null) {
                    int i40 = this.Q;
                    this.W = i40;
                    int C = org.telegram.messenger.a2.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i40);
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
                        stack2.addAll((Collection) sparseArray.get(i41));
                        i41++;
                    }
                    sparseArray.clear();
                    int i42 = 0;
                    while (i42 < arrayList6.size()) {
                        try {
                            stack = stack2;
                        } catch (Exception e17) {
                            e = e17;
                        }
                        try {
                            ellipsize = TextUtils.ellipsize(AndroidUtilities.replaceNewLines(SpannableStringBuilder.valueOf((CharSequence) arrayList6.get(i42))), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(r0, 0, r0.length())), size), TextUtils.TruncateAt.MIDDLE);
                            i21 = size;
                            TextPaint textPaint6 = textPaint4;
                            try {
                                staticLayout6 = new StaticLayout(ellipsize, textPaint6, i21, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                textPaint2 = textPaint6;
                                try {
                                    this.F = this.T;
                                    staticLayout7 = this.U;
                                } catch (Exception e18) {
                                    e = e18;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                stack2 = stack;
                                v80Var = v80Var2;
                                photoSize2 = photoSize;
                                i20 = i42;
                                arrayList = arrayList6;
                                i19 = i21;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                            }
                        } catch (Exception e20) {
                            e = e20;
                            stack2 = stack;
                            v80Var = v80Var2;
                            photoSize2 = photoSize;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i19 = size;
                            sparseArray2 = sparseArray;
                            i20 = i42;
                            FileLog.e(e);
                            i42 = i20 + 1;
                            size = i19;
                            sparseArray = sparseArray2;
                            v80Var2 = v80Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            photoSize = photoSize2;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e21) {
                                e = e21;
                                stack2 = stack;
                                v80Var = v80Var2;
                                photoSize2 = photoSize;
                                i20 = i42;
                                arrayList = arrayList6;
                                i19 = i21;
                                sparseArray2 = sparseArray;
                                FileLog.e(e);
                                i42 = i20 + 1;
                                size = i19;
                                sparseArray = sparseArray2;
                                v80Var2 = v80Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                this.F = this.U.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(5.0f) + this.F;
                                if (this.b0.isSpoilersRevealed) {
                                    TLRPC.PhotoSize photoSize4 = photoSize;
                                    try {
                                        ArrayList arrayList8 = new ArrayList();
                                        if (ellipsize instanceof Spannable) {
                                            i20 = i42;
                                            stack2 = stack;
                                            ArrayList arrayList9 = arrayList6;
                                            sparseArray2 = sparseArray;
                                            staticLayout8 = staticLayout6;
                                            v80Var = v80Var2;
                                            arrayList = arrayList9;
                                            photoSize2 = photoSize4;
                                            i19 = i21;
                                            try {
                                                uh.h.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack2, arrayList8, null);
                                            } catch (Exception e22) {
                                                e = e22;
                                                FileLog.e(e);
                                                i42 = i20 + 1;
                                                size = i19;
                                                sparseArray = sparseArray2;
                                                v80Var2 = v80Var;
                                                textPaint4 = textPaint2;
                                                arrayList6 = arrayList;
                                                photoSize = photoSize2;
                                            }
                                        } else {
                                            stack2 = stack;
                                            photoSize2 = photoSize4;
                                            i20 = i42;
                                            arrayList = arrayList6;
                                            i19 = i21;
                                            sparseArray2 = sparseArray;
                                            staticLayout8 = staticLayout6;
                                            v80Var = v80Var2;
                                        }
                                        sparseArray2.put(i20, arrayList8);
                                    } catch (Exception e23) {
                                        e = e23;
                                        stack2 = stack;
                                        v80Var = v80Var2;
                                        photoSize2 = photoSize4;
                                        i20 = i42;
                                        arrayList = arrayList6;
                                        i19 = i21;
                                        sparseArray2 = sparseArray;
                                        FileLog.e(e);
                                        i42 = i20 + 1;
                                        size = i19;
                                        sparseArray = sparseArray2;
                                        v80Var2 = v80Var;
                                        textPaint4 = textPaint2;
                                        arrayList6 = arrayList;
                                        photoSize = photoSize2;
                                    }
                                } else {
                                    stack2 = stack;
                                    photoSize2 = photoSize;
                                    i20 = i42;
                                    arrayList = arrayList6;
                                    i19 = i21;
                                    sparseArray2 = sparseArray;
                                    staticLayout8 = staticLayout6;
                                    v80Var = v80Var2;
                                }
                                arrayList5.add(staticLayout8);
                                i42 = i20 + 1;
                                size = i19;
                                sparseArray = sparseArray2;
                                v80Var2 = v80Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                        }
                        if (this.b0.isSpoilersRevealed) {
                        }
                        arrayList5.add(staticLayout8);
                        i42 = i20 + 1;
                        size = i19;
                        sparseArray = sparseArray2;
                        v80Var2 = v80Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        photoSize = photoSize2;
                    }
                }
                v80 v80Var32 = v80Var2;
                TLRPC.PhotoSize photoSize32 = photoSize;
                int i382 = size;
                int dp2 = AndroidUtilities.dp(52.0f);
                int B = LocaleController.isRTL ? org.telegram.messenger.a2.B(10.0f, View.MeasureSpec.getSize(i10), dp2) : AndroidUtilities.dp(10.0f);
                v80Var32.setBounds(B, AndroidUtilities.dp(11.0f), B + dp2, AndroidUtilities.dp(63.0f));
                if (z10) {
                    i15 = 1;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.b0.photoThumbs, dp2, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.b0.photoThumbs, 80);
                    if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                        closestPhotoSizeWithSize2 = photoSize32;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        closestPhotoSizeWithSize.size = -1;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        closestPhotoSizeWithSize2.size = -1;
                    }
                    float dp3 = AndroidUtilities.dp(11.0f);
                    float f12 = dp2;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.setImageCoords(B, dp3, f12, f12);
                    FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    Locale locale = Locale.US;
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.b0.photoThumbsObject), a4.a.k(dp2, dp2, "_"), ImageLocation.getForObject(closestPhotoSizeWithSize2, this.b0.photoThumbsObject), dp2 + "_" + dp2 + "_b", 0L, null, this.b0, 0);
                    this.s = true;
                } else {
                    i15 = 1;
                }
                if (i12 == i15) {
                    f10 = 10.0f;
                    StaticLayout u24 = t1.u2(z10.d(this.b0, i15, 2, textPaint), textPaint, i382, i382, 0, i14);
                    this.j0 = u24;
                    org.telegram.ui.Components.u5 u5Var = this.k0;
                    Layout[] layoutArr = new Layout[i15];
                    i16 = 0;
                    layoutArr[0] = u24;
                    this.k0 = org.telegram.ui.Components.y5.update(0, this, u5Var, layoutArr);
                } else {
                    f10 = 10.0f;
                    i16 = 0;
                }
                staticLayout2 = this.P;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i17 = 0;
                } else {
                    StaticLayout staticLayout10 = this.P;
                    i17 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i15) + AndroidUtilities.dp(4.0f);
                }
                staticLayout3 = this.a0;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f11 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.a0;
                    f11 = 5.0f;
                    i17 = org.telegram.messenger.a2.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i15), i17);
                }
                staticLayout4 = this.R;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.R;
                    i17 = org.telegram.messenger.a2.C(f11, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i15), i17);
                }
                staticLayout5 = this.U;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.U;
                    i17 = org.telegram.messenger.a2.C(f11, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i15), i17);
                    if (this.R != null) {
                        i17 += AndroidUtilities.dp(f10);
                    }
                }
                for (i18 = 0; i18 < arrayList5.size(); i18++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i18);
                    if (staticLayout14.getLineCount() > 0) {
                        i16 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i15) + i16;
                    }
                }
                int i392 = i17 + i16;
                if (this.j0 != null) {
                    this.i0 = AndroidUtilities.dp(f11) + this.F + i16;
                    StaticLayout staticLayout15 = this.j0;
                    i392 = org.telegram.messenger.a2.C(f11, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i15), i392);
                }
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.a2.b(17.0f, i392, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
            }
        }
        str = null;
        str2 = null;
        str3 = null;
        z10 = false;
        messageObject = this.b0;
        if (messageObject != null) {
        }
        f7 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        messageObject2 = this.b0;
        if (messageObject2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i12 = this.m0;
        TextPaint textPaint32 = this.e0;
        if (i12 != 1) {
        }
        v80 v80Var22 = this.v;
        if (str2 != null) {
        }
        this.T = this.Q;
        StaticLayout staticLayout92 = this.P;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i12 != 1) {
        }
        TextPaint textPaint42 = this.d0;
        Stack stack22 = this.K;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        messageObject3 = this.b0;
        if (messageObject3 != null) {
        }
        photoSize = null;
        staticLayout = this.a0;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        v80 v80Var322 = v80Var22;
        TLRPC.PhotoSize photoSize322 = photoSize;
        int i3822 = size;
        int dp22 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
        }
        v80Var322.setBounds(B, AndroidUtilities.dp(11.0f), B + dp22, AndroidUtilities.dp(63.0f));
        if (z10) {
        }
        if (i12 == i15) {
        }
        staticLayout2 = this.P;
        if (staticLayout2 != null) {
        }
        i17 = 0;
        staticLayout3 = this.a0;
        if (staticLayout3 != null) {
        }
        f11 = 5.0f;
        staticLayout4 = this.R;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.R;
            i17 = org.telegram.messenger.a2.C(f11, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i15), i17);
        }
        staticLayout5 = this.U;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.U;
            i17 = org.telegram.messenger.a2.C(f11, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i15), i17);
            if (this.R != null) {
            }
        }
        while (i18 < arrayList5.size()) {
        }
        int i3922 = i17 + i16;
        if (this.j0 != null) {
        }
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.a2.b(17.0f, i3922, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
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
            if (!arrayList.isEmpty() && (n7Var = this.x) != null && n7Var.e()) {
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
                        z11 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i13);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f7 = x10;
                        float f10 = dp;
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
                                        uh.h hVar = (uh.h) it.next();
                                        if (hVar.getBounds().contains(x10 - dp, (y3 - this.F) - i14)) {
                                            e();
                                            this.M = hVar;
                                            this.N = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.M == null && (this.h != i13 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i13;
                                    n90 n90Var = new n90(null, this.l0, x10 - dp, (y3 - this.F) - i14, 0);
                                    this.n = n90Var;
                                    g90 b10 = n90Var.b();
                                    this.f = true;
                                    this.e.a(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new androidx.activity.i(this, 28);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f10, this.F + i14);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.b0.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.x.a(((CharSequence) this.E.get(this.h)).toString(), false);
                                    } else {
                                        this.x.b(webPage, this.b0);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                e();
                            } else if (this.M != null) {
                                g(x10, y3, i14);
                            } else {
                                z10 = false;
                                z11 = true;
                            }
                            z10 = true;
                            z11 = true;
                        }
                    }
                    i13++;
                }
                if (motionEvent.getAction() == 0) {
                    int dp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                    StaticLayout staticLayout2 = this.R;
                    if (staticLayout2 != null && x10 >= dp2 && x10 <= staticLayout2.getWidth() + dp2 && y3 >= (i11 = this.Q) && y3 <= this.R.getHeight() + i11) {
                        ArrayList arrayList2 = this.I;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i15);
                            i15++;
                            uh.h hVar2 = (uh.h) obj;
                            if (hVar2.getBounds().contains(x10 - dp2, y3 - this.Q)) {
                                this.M = hVar2;
                                this.N = 1;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.U;
                    if (staticLayout3 != null && x10 >= dp2 && x10 <= staticLayout3.getWidth() + dp2 && y3 >= (i10 = this.T) && y3 <= this.U.getHeight() + i10) {
                        ArrayList arrayList3 = this.J;
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj2 = arrayList3.get(i16);
                            i16++;
                            uh.h hVar3 = (uh.h) obj2;
                            if (hVar3.getBounds().contains(x10 - dp2, y3 - this.T)) {
                                this.M = hVar3;
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
        this.x = n7Var;
    }
}
