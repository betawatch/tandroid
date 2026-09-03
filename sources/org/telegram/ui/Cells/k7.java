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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.y80;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k7 extends FrameLayout {
    public final ArrayList B;
    public int C;
    public final ArrayList D;
    public final SparseArray E;
    public final ArrayList F;
    public final ArrayList G;
    public final Stack H;
    public final Path I;
    public ih.k J;
    public int K;
    public final int L;
    public StaticLayout M;
    public int N;
    public StaticLayout O;
    public final AtomicReference P;
    public int Q;
    public StaticLayout R;
    public final AtomicReference S;
    public int T;
    public StaticLayout U;
    public MessageObject V;
    public final TextPaint W;
    public boolean a;
    public final TextPaint a0;
    public androidx.emoji2.text.j b;
    public final TextPaint b0;
    public int c;
    public final TextPaint c0;
    public m2.b d;
    public int d0;
    public final c90 e;
    public StaticLayout e0;
    public boolean f;
    public int f0;
    public StaticLayout g0;
    public int h;
    public org.telegram.ui.Components.q5 h0;
    public final org.telegram.ui.ActionBar.f6 i0;
    public final int j0;
    public g90 n;
    public final ImageReceiver r;
    public boolean s;
    public final n80 v;
    public final kp w;
    public j7 x;
    public boolean y;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new c90(this);
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.E = new SparseArray();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new Stack();
        this.I = new Path();
        this.K = -1;
        this.L = AndroidUtilities.dp(10.0f);
        this.N = AndroidUtilities.dp(30.0f);
        this.P = new AtomicReference();
        this.Q = AndroidUtilities.dp(30.0f);
        this.S = new AtomicReference();
        this.T = AndroidUtilities.dp(30.0f);
        this.f0 = AndroidUtilities.dp(30.0f);
        this.i0 = f6Var;
        this.j0 = i10;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.W = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.a0 = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new n80(0, f6Var);
        kp kpVar = new kp(context, 21, f6Var);
        this.w = kpVar;
        kpVar.setVisibility(4);
        kpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(2);
        boolean z4 = LocaleController.isRTL;
        addView(kpVar, k7.b6.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 44.0f, z4 ? 44.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.b0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.c0 = textPaint4;
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
        this.B.add(SpannableString.valueOf(trim));
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
        m2.b bVar = this.d;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        invalidate();
    }

    public final void f(boolean z4, boolean z10) {
        kp kpVar = this.w;
        if (kpVar.getVisibility() != 0) {
            kpVar.setVisibility(0);
        }
        kpVar.a(z4, z10);
    }

    public final void g(int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        e();
        this.J.q = new i7(this, 0);
        int i13 = i10 - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i14 = this.K;
        SparseArray sparseArray = this.E;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.G;
        ArrayList arrayList3 = this.D;
        if (i14 == 0) {
            float f10 = 0.0f;
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                Layout layout = (Layout) arrayList3.get(i15);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i15)).iterator();
                while (it.hasNext()) {
                    ((ih.k) it.next()).j(i13, ((i11 - this.C) - i12) + f10, sqrt, false);
                }
            }
        } else if (i14 == 1) {
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ((ih.k) obj).j(i13, i11 - this.N, sqrt, false);
            }
        } else if (i14 == 2) {
            int size2 = arrayList2.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList2.get(i17);
                i17++;
                ((ih.k) obj2).j(i13, i11 - this.Q, sqrt, false);
            }
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            if (i18 != this.K) {
                if (i18 == 0) {
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        Layout layout2 = (Layout) arrayList3.get(i19);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i19)).iterator();
                        while (it2.hasNext()) {
                            ((ih.k) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i18 == 1) {
                    int size3 = arrayList.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        ((ih.k) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i18 == 2) {
                    int size4 = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        ((ih.k) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                }
            }
        }
        this.K = -1;
        this.J = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public MessageObject getMessage() {
        return this.V;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.onAttachedToWindow();
        }
        this.h0 = org.telegram.ui.Components.u5.update(0, this, this.h0, this.g0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.u5.release(this, this.h0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k7 k7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.f6 f6Var = this.i0;
        if (this.j0 == 1) {
            this.b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        }
        StaticLayout staticLayout = this.e0;
        int i10 = this.L;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.d0), i10);
            this.e0.draw(canvas2);
            canvas2.restore();
        }
        if (this.M != null) {
            canvas2.save();
            float dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                dp += this.e0 == null ? 0.0f : AndroidUtilities.dp(4.0f) + r3.getWidth();
            }
            canvas2.translate(dp, i10);
            this.M.draw(canvas2);
            canvas2.restore();
        }
        if (this.U != null) {
            this.c0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.T);
            this.U.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.O;
        TextPaint textPaint = this.a0;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.N);
            ih.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.P, 0, this.O, this.F, canvas2, false);
            canvas2.restore();
        }
        if (this.R != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.Q);
            ih.k.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.S, 0, this.R, this.G, canvas2, false);
            k7Var = this;
            canvas2.restore();
        } else {
            k7Var = this;
        }
        ArrayList arrayList = k7Var.D;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i12);
                List list = (List) k7Var.E.get(i12);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), k7Var.C + i11);
                    Path path = k7Var.I;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((ih.k) it.next()).getBounds();
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
                        ((ih.k) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((ih.k) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i11 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (k7Var.e.f(canvas2)) {
                k7Var.invalidate();
            }
        }
        if (k7Var.g0 != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), k7Var.f0);
            k7Var.g0.draw(canvas2);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, k7Var.g0, k7Var.h0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        k7Var.v.draw(canvas2);
        if (k7Var.s) {
            k7Var.r.draw(canvas2);
        }
        if (k7Var.y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), k7Var.getMeasuredHeight() - 1, k7Var.getMeasuredWidth(), k7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.O != null) {
            sb.append(", ");
            sb.append(this.O.getText());
        }
        if (this.R != null) {
            sb.append(", ");
            sb.append(this.R.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
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
        boolean z4;
        MessageObject messageObject;
        float f10;
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
        float f11;
        int i16;
        StaticLayout staticLayout2;
        int i17;
        StaticLayout staticLayout3;
        float f12;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i18;
        SparseArray sparseArray;
        n80 n80Var;
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
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        this.s = false;
        this.O = null;
        this.M = null;
        this.R = null;
        this.U = null;
        ArrayList arrayList5 = this.D;
        arrayList5.clear();
        ArrayList arrayList6 = this.B;
        arrayList6.clear();
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject4 = this.V;
        TLRPC.MessageMedia messageMedia = messageObject4.messageOwner.media;
        int i24 = 1;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (messageObject4.photoThumbs == null && webPage.photo != null) {
                    messageObject4.generateThumbs(true);
                }
                boolean z10 = (webPage.photo == null || this.V.photoThumbs == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z4 = z10;
                messageObject = this.V;
                if (messageObject != null || messageObject.messageOwner.entities.isEmpty()) {
                    f10 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    f10 = 8.0f;
                    int i25 = 0;
                    while (i25 < this.V.messageOwner.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.V.messageOwner.entities.get(i25);
                        if (messageEntity.length > 0 && (i22 = messageEntity.offset) >= 0 && i22 < this.V.messageOwner.message.length()) {
                            if (messageEntity.offset + messageEntity.length > this.V.messageOwner.message.length()) {
                                messageEntity.length = this.V.messageOwner.message.length() - messageEntity.offset;
                            }
                            if (i25 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.V.messageOwner.message.length())) {
                                if (this.V.messageOwner.entities.size() != i24) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.V.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.V, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.V.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.V, spannableStringBuilder4);
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
                                            ArrayList<TLRPC.MessageEntity> arrayList7 = this.V.messageOwner.entities;
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
                                                            s01 s01Var = new s01();
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                            try {
                                                                s01Var.a |= 256;
                                                                arrayList2 = arrayList7;
                                                                valueOf.setSpan(new t01(s01Var, 0), Math.max(i26, i32), Math.min(i27, i33) + i28, 33);
                                                            } catch (Exception e6) {
                                                                e = e6;
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
                                StringBuilder sb = new StringBuilder();
                                sb.append("mailto:");
                                String str10 = this.V.messageOwner.message;
                                int i34 = messageEntity.offset;
                                sb.append(str10.substring(i34, messageEntity.length + i34));
                                str5 = sb.toString();
                                String str11 = this.V.messageOwner.message;
                                int i35 = messageEntity.offset;
                                str2 = str11.substring(i35, messageEntity.length + i35);
                                if (messageEntity.offset != 0 || messageEntity.length != this.V.messageOwner.message.length()) {
                                    ?? valueOf2 = SpannableStringBuilder.valueOf(this.V.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.V, valueOf2);
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
                                String str12 = this.V.messageOwner.message;
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
                                if (messageEntity.offset != 0 || messageEntity.length != this.V.messageOwner.message.length()) {
                                    ?? valueOf3 = SpannableStringBuilder.valueOf(this.V.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.V, valueOf3);
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
                messageObject2 = this.V;
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
                i12 = this.j0;
                TextPaint textPaint3 = this.b0;
                if (i12 != 1) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String stringForMessageListDate = LocaleController.stringForMessageListDate(this.V.messageOwner.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(stringForMessageListDate));
                    textPaint = textPaint3;
                    this.e0 = s1.u2(stringForMessageListDate, textPaint3, ceil, ceil, 0, 1);
                    this.d0 = (size - ceil) - AndroidUtilities.dp(f10);
                    i13 = AndroidUtilities.dp(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i13 = 0;
                }
                n80 n80Var2 = this.v;
                if (str2 != null) {
                    try {
                        ?? highlightText = AndroidUtilities.highlightText(str2, this.V.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                        int i37 = size - i13;
                        StaticLayout u22 = s1.u2(highlightText != 0 ? highlightText : str2, this.W, i37 - AndroidUtilities.dp(4.0f), i37 - AndroidUtilities.dp(4.0f), 0, 3);
                        this.M = u22;
                        if (u22.getLineCount() > 0) {
                            this.N = this.L + this.M.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                        }
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    n80Var2.a(str2);
                }
                this.Q = this.N;
                StaticLayout staticLayout9 = this.M;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (i12 != 1) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.a0;
                Stack stack2 = this.H;
                if (str4 != null) {
                    try {
                        StaticLayout u23 = s1.u2(str4, textPaint4, size, size, 0, max);
                        this.O = u23;
                        if (u23.getLineCount() > 0) {
                            this.Q = this.N + this.O.getLineBottom(r8.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                        }
                        stack2.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.V.isSpoilersRevealed) {
                            ih.k.c(this, this.O, stack2, arrayList4);
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i14 = max;
                        try {
                            this.R = s1.u2(spannableStringBuilder2, textPaint4, size, size, 0, max);
                            if (this.O != null) {
                                this.Q += AndroidUtilities.dp(10.0f);
                            }
                            stack2.addAll(arrayList3);
                            arrayList3.clear();
                            if (!this.V.isSpoilersRevealed) {
                                ih.k.c(this, this.R, stack2, arrayList3);
                            }
                        } catch (Exception e15) {
                            e = e15;
                            FileLog.e(e);
                            messageObject3 = this.V;
                            if (messageObject3 != null) {
                            }
                            photoSize = null;
                            staticLayout = this.U;
                            if (staticLayout != null) {
                            }
                            if (!arrayList6.isEmpty()) {
                            }
                            n80 n80Var3 = n80Var2;
                            TLRPC.PhotoSize photoSize3 = photoSize;
                            int i38 = size;
                            int dp = AndroidUtilities.dp(52.0f);
                            if (LocaleController.isRTL) {
                            }
                            n80Var3.setBounds(r2, AndroidUtilities.dp(11.0f), r2 + dp, AndroidUtilities.dp(63.0f));
                            if (z4) {
                            }
                            if (i12 == i15) {
                            }
                            staticLayout2 = this.M;
                            if (staticLayout2 != null) {
                            }
                            i17 = 0;
                            staticLayout3 = this.U;
                            if (staticLayout3 != null) {
                            }
                            f12 = 5.0f;
                            staticLayout4 = this.O;
                            if (staticLayout4 != null) {
                            }
                            staticLayout5 = this.R;
                            if (staticLayout5 != null) {
                            }
                            while (i18 < arrayList5.size()) {
                            }
                            int i39 = i17 + i16;
                            if (this.g0 != null) {
                            }
                            this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(17.0f, i39, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
                        }
                    } catch (Exception e16) {
                        e = e16;
                        i14 = max;
                    }
                } else {
                    i14 = max;
                }
                messageObject3 = this.V;
                if (messageObject3 != null || TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                    photoSize = null;
                } else {
                    photoSize = null;
                    CharSequence highlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.V.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), this.V.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                    if (highlightText2 != null) {
                        String str13 = this.V.highlightedWords.get(0);
                        TextPaint textPaint5 = this.c0;
                        this.U = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(highlightText2, str13, size, textPaint5, 130), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, AndroidUtilities.dp(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                staticLayout = this.U;
                if (staticLayout != null) {
                    int i40 = this.N;
                    this.T = i40;
                    int C = org.telegram.messenger.y3.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i40);
                    this.N = C;
                    this.Q = C;
                }
                if (!arrayList6.isEmpty()) {
                    int i41 = 0;
                    while (true) {
                        sparseArray = this.E;
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
                                    this.C = this.Q;
                                    staticLayout7 = this.R;
                                } catch (Exception e18) {
                                    e = e18;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                stack2 = stack;
                                n80Var = n80Var2;
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
                            n80Var = n80Var2;
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
                            n80Var2 = n80Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            photoSize = photoSize2;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e21) {
                                e = e21;
                                stack2 = stack;
                                n80Var = n80Var2;
                                photoSize2 = photoSize;
                                i20 = i42;
                                arrayList = arrayList6;
                                i19 = i21;
                                sparseArray2 = sparseArray;
                                FileLog.e(e);
                                i42 = i20 + 1;
                                size = i19;
                                sparseArray = sparseArray2;
                                n80Var2 = n80Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                this.C = this.R.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(5.0f) + this.C;
                                if (this.V.isSpoilersRevealed) {
                                    TLRPC.PhotoSize photoSize4 = photoSize;
                                    try {
                                        ArrayList arrayList8 = new ArrayList();
                                        if (ellipsize instanceof Spannable) {
                                            i20 = i42;
                                            stack2 = stack;
                                            ArrayList arrayList9 = arrayList6;
                                            sparseArray2 = sparseArray;
                                            staticLayout8 = staticLayout6;
                                            n80Var = n80Var2;
                                            arrayList = arrayList9;
                                            photoSize2 = photoSize4;
                                            i19 = i21;
                                            try {
                                                ih.k.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack2, arrayList8, null);
                                            } catch (Exception e22) {
                                                e = e22;
                                                FileLog.e(e);
                                                i42 = i20 + 1;
                                                size = i19;
                                                sparseArray = sparseArray2;
                                                n80Var2 = n80Var;
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
                                            n80Var = n80Var2;
                                        }
                                        sparseArray2.put(i20, arrayList8);
                                    } catch (Exception e23) {
                                        e = e23;
                                        stack2 = stack;
                                        n80Var = n80Var2;
                                        photoSize2 = photoSize4;
                                        i20 = i42;
                                        arrayList = arrayList6;
                                        i19 = i21;
                                        sparseArray2 = sparseArray;
                                        FileLog.e(e);
                                        i42 = i20 + 1;
                                        size = i19;
                                        sparseArray = sparseArray2;
                                        n80Var2 = n80Var;
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
                                    n80Var = n80Var2;
                                }
                                arrayList5.add(staticLayout8);
                                i42 = i20 + 1;
                                size = i19;
                                sparseArray = sparseArray2;
                                n80Var2 = n80Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                        }
                        if (this.V.isSpoilersRevealed) {
                        }
                        arrayList5.add(staticLayout8);
                        i42 = i20 + 1;
                        size = i19;
                        sparseArray = sparseArray2;
                        n80Var2 = n80Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        photoSize = photoSize2;
                    }
                }
                n80 n80Var32 = n80Var2;
                TLRPC.PhotoSize photoSize32 = photoSize;
                int i382 = size;
                int dp2 = AndroidUtilities.dp(52.0f);
                int B = LocaleController.isRTL ? org.telegram.messenger.y3.B(10.0f, View.MeasureSpec.getSize(i10), dp2) : AndroidUtilities.dp(10.0f);
                n80Var32.setBounds(B, AndroidUtilities.dp(11.0f), B + dp2, AndroidUtilities.dp(63.0f));
                if (z4) {
                    i15 = 1;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.V.photoThumbs, dp2, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.V.photoThumbs, 80);
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
                    float f13 = dp2;
                    ImageReceiver imageReceiver = this.r;
                    imageReceiver.setImageCoords(B, dp3, f13, f13);
                    FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    Locale locale = Locale.US;
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.V.photoThumbsObject), e2.c.h(dp2, "_", dp2), ImageLocation.getForObject(closestPhotoSizeWithSize2, this.V.photoThumbsObject), dp2 + "_" + dp2 + "_b", 0L, null, this.V, 0);
                    this.s = true;
                } else {
                    i15 = 1;
                }
                if (i12 == i15) {
                    f11 = 10.0f;
                    StaticLayout u24 = s1.u2(u10.d(this.V, i15, 2, textPaint), textPaint, i382, i382, 0, i14);
                    this.g0 = u24;
                    org.telegram.ui.Components.q5 q5Var = this.h0;
                    Layout[] layoutArr = new Layout[i15];
                    i16 = 0;
                    layoutArr[0] = u24;
                    this.h0 = org.telegram.ui.Components.u5.update(0, this, q5Var, layoutArr);
                } else {
                    f11 = 10.0f;
                    i16 = 0;
                }
                staticLayout2 = this.M;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i17 = 0;
                } else {
                    StaticLayout staticLayout10 = this.M;
                    i17 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i15) + AndroidUtilities.dp(4.0f);
                }
                staticLayout3 = this.U;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f12 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.U;
                    f12 = 5.0f;
                    i17 = org.telegram.messenger.y3.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i15), i17);
                }
                staticLayout4 = this.O;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.O;
                    i17 = org.telegram.messenger.y3.C(f12, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i15), i17);
                }
                staticLayout5 = this.R;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.R;
                    i17 = org.telegram.messenger.y3.C(f12, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i15), i17);
                    if (this.O != null) {
                        i17 += AndroidUtilities.dp(f11);
                    }
                }
                for (i18 = 0; i18 < arrayList5.size(); i18++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i18);
                    if (staticLayout14.getLineCount() > 0) {
                        i16 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i15) + i16;
                    }
                }
                int i392 = i17 + i16;
                if (this.g0 != null) {
                    this.f0 = AndroidUtilities.dp(f12) + this.C + i16;
                    StaticLayout staticLayout15 = this.g0;
                    i392 = org.telegram.messenger.y3.C(f12, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i15), i392);
                }
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(17.0f, i392, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
            }
        }
        str = null;
        str2 = null;
        str3 = null;
        z4 = false;
        messageObject = this.V;
        if (messageObject != null) {
        }
        f10 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        messageObject2 = this.V;
        if (messageObject2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i12 = this.j0;
        TextPaint textPaint32 = this.b0;
        if (i12 != 1) {
        }
        n80 n80Var22 = this.v;
        if (str2 != null) {
        }
        this.Q = this.N;
        StaticLayout staticLayout92 = this.M;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i12 != 1) {
        }
        TextPaint textPaint42 = this.a0;
        Stack stack22 = this.H;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        messageObject3 = this.V;
        if (messageObject3 != null) {
        }
        photoSize = null;
        staticLayout = this.U;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        n80 n80Var322 = n80Var22;
        TLRPC.PhotoSize photoSize322 = photoSize;
        int i3822 = size;
        int dp22 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
        }
        n80Var322.setBounds(B, AndroidUtilities.dp(11.0f), B + dp22, AndroidUtilities.dp(63.0f));
        if (z4) {
        }
        if (i12 == i15) {
        }
        staticLayout2 = this.M;
        if (staticLayout2 != null) {
        }
        i17 = 0;
        staticLayout3 = this.U;
        if (staticLayout3 != null) {
        }
        f12 = 5.0f;
        staticLayout4 = this.O;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.O;
            i17 = org.telegram.messenger.y3.C(f12, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i15), i17);
        }
        staticLayout5 = this.R;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.R;
            i17 = org.telegram.messenger.y3.C(f12, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i15), i17);
            if (this.O != null) {
            }
        }
        while (i18 < arrayList5.size()) {
        }
        int i3922 = i17 + i16;
        if (this.g0 != null) {
        }
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(17.0f, i3922, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        j7 j7Var;
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.V != null) {
            ArrayList arrayList = this.D;
            if (!arrayList.isEmpty() && (j7Var = this.x) != null && j7Var.e()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.J == null) || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    z4 = false;
                    if (z4) {
                        return true;
                    }
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z4 = false;
                        z10 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i13);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f10 = x10;
                        float f11 = dp;
                        if (f10 < staticLayout.getLineLeft(0) + f11 || f10 > staticLayout.getLineWidth(0) + f11 || y10 < (i12 = this.C + i14) || y10 > i12 + lineBottom) {
                            i14 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.J = null;
                                SparseArray sparseArray = this.E;
                                if (sparseArray.get(i13, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i13)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        ih.k kVar = (ih.k) it.next();
                                        if (kVar.getBounds().contains(x10 - dp, (y10 - this.C) - i14)) {
                                            e();
                                            this.J = kVar;
                                            this.K = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.J == null && (this.h != i13 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i13;
                                    g90 g90Var = new g90(null, this.i0, x10 - dp, (y10 - this.C) - i14, 0);
                                    this.n = g90Var;
                                    y80 b10 = g90Var.b();
                                    this.f = true;
                                    this.e.a(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new m2.b(this, 9);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f11, this.C + i14);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.V.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.x.a(((CharSequence) this.B.get(this.h)).toString(), false);
                                    } else {
                                        this.x.b(webPage, this.V);
                                    }
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                                e();
                            } else if (this.J != null) {
                                g(x10, y10, i14);
                            } else {
                                z4 = false;
                                z10 = true;
                            }
                            z4 = true;
                            z10 = true;
                        }
                    }
                    i13++;
                }
                if (motionEvent.getAction() == 0) {
                    int dp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                    StaticLayout staticLayout2 = this.O;
                    if (staticLayout2 != null && x10 >= dp2 && x10 <= staticLayout2.getWidth() + dp2 && y10 >= (i11 = this.N) && y10 <= this.O.getHeight() + i11) {
                        ArrayList arrayList2 = this.F;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i15);
                            i15++;
                            ih.k kVar2 = (ih.k) obj;
                            if (kVar2.getBounds().contains(x10 - dp2, y10 - this.N)) {
                                this.J = kVar2;
                                this.K = 1;
                                z4 = true;
                                z10 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.R;
                    if (staticLayout3 != null && x10 >= dp2 && x10 <= staticLayout3.getWidth() + dp2 && y10 >= (i10 = this.Q) && y10 <= this.R.getHeight() + i10) {
                        ArrayList arrayList3 = this.G;
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj2 = arrayList3.get(i16);
                            i16++;
                            ih.k kVar3 = (ih.k) obj2;
                            if (kVar3.getBounds().contains(x10 - dp2, y10 - this.Q)) {
                                this.J = kVar3;
                                this.K = 2;
                                z4 = true;
                                z10 = true;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        e();
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.J != null) {
                        g(x10, y10, 0);
                        z4 = true;
                        z10 = true;
                        break;
                    }
                    if (!z10) {
                    }
                }
                return !z4 || super.onTouchEvent(motionEvent);
            }
        }
        e();
        z4 = false;
        if (z4) {
        }
    }

    public void setDelegate(j7 j7Var) {
        this.x = j7Var;
    }
}
