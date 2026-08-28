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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l7 extends FrameLayout {
    public final ArrayList A;
    public int B;
    public final ArrayList C;
    public final SparseArray D;
    public final ArrayList E;
    public final ArrayList F;
    public final Stack G;
    public final Path H;
    public dh.l I;
    public int J;
    public final int K;
    public StaticLayout L;
    public int M;
    public StaticLayout N;
    public final AtomicReference O;
    public int P;
    public StaticLayout Q;
    public final AtomicReference R;
    public int S;
    public StaticLayout T;
    public MessageObject U;
    public final TextPaint V;
    public final TextPaint W;
    public boolean a;
    public final TextPaint a0;
    public androidx.emoji2.text.i b;
    public final TextPaint b0;
    public int c;
    public int c0;
    public m.i3 d;
    public StaticLayout d0;
    public final i80 e;
    public int e0;
    public boolean f;
    public StaticLayout f0;
    public org.telegram.ui.Components.p5 g0;
    public int h;
    public final org.telegram.ui.ActionBar.b6 h0;
    public final int i0;
    public m80 n;
    public final ImageReceiver r;
    public boolean s;
    public final u70 v;
    public final dp w;
    public k7 x;
    public boolean y;

    public l7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = new i80(this);
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.D = new SparseArray();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new Stack();
        this.H = new Path();
        this.J = -1;
        this.K = AndroidUtilities.dp(10.0f);
        this.M = AndroidUtilities.dp(30.0f);
        this.O = new AtomicReference();
        this.P = AndroidUtilities.dp(30.0f);
        this.R = new AtomicReference();
        this.S = AndroidUtilities.dp(30.0f);
        this.e0 = AndroidUtilities.dp(30.0f);
        this.h0 = b6Var;
        this.i0 = i9;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.V = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        TextPaint textPaint2 = new TextPaint(1);
        this.W = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.v = new u70(0, b6Var);
        dp dpVar = new dp(context, 21, b6Var);
        this.w = dpVar;
        dpVar.setVisibility(4);
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(2);
        boolean z10 = LocaleController.isRTL;
        addView(dpVar, g7.e6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 44.0f, 44.0f, z10 ? 44.0f : 0.0f, 0.0f));
        if (i9 == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.a0 = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.b0 = textPaint4;
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
        this.A.add(SpannableString.valueOf(trim));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
            for (int i9 = 0; i9 < richText.texts.size(); i9++) {
                d(richText.texts.get(i9));
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
        androidx.emoji2.text.i iVar = this.b;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
        m.i3 i3Var = this.d;
        if (i3Var != null) {
            removeCallbacks(i3Var);
        }
        invalidate();
    }

    public final void f(boolean z10, boolean z11) {
        dp dpVar = this.w;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
    }

    public final void g(int i9, int i10, int i11) {
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        e();
        this.I.q = new j7(this, 0);
        int i12 = i9 - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i13 = this.J;
        SparseArray sparseArray = this.D;
        ArrayList arrayList = this.E;
        ArrayList arrayList2 = this.F;
        ArrayList arrayList3 = this.C;
        if (i13 == 0) {
            float f10 = 0.0f;
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                Layout layout = (Layout) arrayList3.get(i14);
                f10 += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i14)).iterator();
                while (it.hasNext()) {
                    ((dh.l) it.next()).j(i12, ((i10 - this.B) - i11) + f10, sqrt, false);
                }
            }
        } else if (i13 == 1) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                ((dh.l) obj).j(i12, i10 - this.M, sqrt, false);
            }
        } else if (i13 == 2) {
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                ((dh.l) obj2).j(i12, i10 - this.P, sqrt, false);
            }
        }
        for (int i17 = 0; i17 <= 2; i17++) {
            if (i17 != this.J) {
                if (i17 == 0) {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        Layout layout2 = (Layout) arrayList3.get(i18);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it2 = ((List) sparseArray.get(i18)).iterator();
                        while (it2.hasNext()) {
                            ((dh.l) it2.next()).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                        }
                    }
                } else if (i17 == 1) {
                    int size3 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        ((dh.l) obj3).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                } else if (i17 == 2) {
                    int size4 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        ((dh.l) obj4).j(r12.getBounds().centerX(), r12.getBounds().centerY(), sqrt, false);
                    }
                }
            }
        }
        this.J = -1;
        this.I = null;
    }

    public ImageReceiver getLinkImageView() {
        return this.r;
    }

    public MessageObject getMessage() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.r.onAttachedToWindow();
        }
        this.g0 = org.telegram.ui.Components.t5.update(0, this, this.g0, this.f0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s) {
            this.r.onDetachedFromWindow();
        }
        org.telegram.ui.Components.t5.release(this, this.g0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l7 l7Var;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.b6 b6Var = this.h0;
        if (this.i0 == 1) {
            this.a0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        }
        StaticLayout staticLayout = this.d0;
        int i9 = this.K;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.c0), i9);
            this.d0.draw(canvas2);
            canvas2.restore();
        }
        if (this.L != null) {
            canvas2.save();
            float dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                dp += this.d0 == null ? 0.0f : AndroidUtilities.dp(4.0f) + r3.getWidth();
            }
            canvas2.translate(dp, i9);
            this.L.draw(canvas2);
            canvas2.restore();
        }
        if (this.T != null) {
            this.b0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.S);
            this.T.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.N;
        TextPaint textPaint = this.W;
        if (staticLayout2 != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.M);
            dh.l.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.O, 0, this.N, this.E, canvas2, false);
            canvas2.restore();
        }
        if (this.Q != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.P);
            dh.l.g(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.R, 0, this.Q, this.F, canvas2, false);
            l7Var = this;
            canvas2.restore();
        } else {
            l7Var = this;
        }
        ArrayList arrayList = l7Var.C;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                StaticLayout staticLayout3 = (StaticLayout) arrayList.get(i11);
                List list = (List) l7Var.D.get(i11);
                if (staticLayout3.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), l7Var.B + i10);
                    Path path = l7Var.H;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((dh.l) it.next()).getBounds();
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
                        ((dh.l) list.get(0)).e(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout3.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((dh.l) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i10 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
                }
            }
            if (l7Var.e.f(canvas2)) {
                l7Var.invalidate();
            }
        }
        if (l7Var.f0 != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), l7Var.e0);
            l7Var.f0.draw(canvas2);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, l7Var.f0, l7Var.g0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        l7Var.v.draw(canvas2);
        if (l7Var.s) {
            l7Var.r.draw(canvas2);
        }
        if (l7Var.y) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), l7Var.getMeasuredHeight() - 1, l7Var.getMeasuredWidth(), l7Var.getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.N != null) {
            sb2.append(", ");
            sb2.append(this.N.getText());
        }
        if (this.Q != null) {
            sb2.append(", ");
            sb2.append(this.Q.getText());
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
    public final void onMeasure(int i9, int i10) {
        String str;
        String str2;
        String str3;
        boolean z10;
        MessageObject messageObject;
        float f10;
        SpannableStringBuilder spannableStringBuilder;
        MessageObject messageObject2;
        int i11;
        SpannableStringBuilder spannableStringBuilder2;
        TextPaint textPaint;
        int i12;
        String str4;
        int i13;
        MessageObject messageObject3;
        TLRPC.PhotoSize photoSize;
        StaticLayout staticLayout;
        int i14;
        float f11;
        int i15;
        StaticLayout staticLayout2;
        int i16;
        StaticLayout staticLayout3;
        float f12;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        int i17;
        SparseArray sparseArray;
        u70 u70Var;
        TLRPC.PhotoSize photoSize2;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i18;
        SparseArray sparseArray2;
        int i19;
        Stack stack;
        CharSequence ellipsize;
        StaticLayout staticLayout6;
        int i20;
        StaticLayout staticLayout7;
        StaticLayout staticLayout8;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int lastIndexOf;
        int i21;
        SpannableStringBuilder spannableStringBuilder3;
        String str5;
        int lastIndexOf2;
        String str6;
        int i22;
        String str7;
        String str8;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        ArrayList arrayList3 = this.F;
        ArrayList arrayList4 = this.E;
        this.s = false;
        this.N = null;
        this.L = null;
        this.Q = null;
        this.T = null;
        ArrayList arrayList5 = this.C;
        arrayList5.clear();
        ArrayList arrayList6 = this.A;
        arrayList6.clear();
        int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject4 = this.U;
        TLRPC.MessageMedia messageMedia = messageObject4.messageOwner.media;
        int i23 = 1;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (messageObject4.photoThumbs == null && webPage.photo != null) {
                    messageObject4.generateThumbs(true);
                }
                boolean z11 = (webPage.photo == null || this.U.photoThumbs == null) ? false : true;
                str2 = webPage.title;
                if (str2 == null) {
                    str2 = webPage.site_name;
                }
                str3 = webPage.description;
                str = webPage.url;
                z10 = z11;
                messageObject = this.U;
                if (messageObject != null || messageObject.messageOwner.entities.isEmpty()) {
                    f10 = 8.0f;
                    spannableStringBuilder = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = null;
                    f10 = 8.0f;
                    int i24 = 0;
                    while (i24 < this.U.messageOwner.entities.size()) {
                        TLRPC.MessageEntity messageEntity = this.U.messageOwner.entities.get(i24);
                        if (messageEntity.length > 0 && (i21 = messageEntity.offset) >= 0 && i21 < this.U.messageOwner.message.length()) {
                            if (messageEntity.offset + messageEntity.length > this.U.messageOwner.message.length()) {
                                messageEntity.length = this.U.messageOwner.message.length() - messageEntity.offset;
                            }
                            if (i24 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length())) {
                                if (this.U.messageOwner.entities.size() != i23) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.U, spannableStringBuilder4);
                                } else if (str3 == null) {
                                    spannableStringBuilder4 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.U, spannableStringBuilder4);
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder4;
                            try {
                            } catch (Exception e10) {
                                e = e10;
                            }
                            if (!(messageEntity instanceof TLRPC.TL_messageEntityTextUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityEmail) || (str2 != null && str2.length() != 0)) {
                                    str5 = null;
                                    if (str5 != null) {
                                        try {
                                            if (AndroidUtilities.charSequenceContains(str5, "://") || str5.toString().toLowerCase().indexOf("http") == 0 || str5.toString().toLowerCase().indexOf("mailto") == 0) {
                                                i22 = 0;
                                            } else {
                                                str5 = "http://" + ((Object) str5);
                                                i22 = 7;
                                            }
                                            SpannableString valueOf = SpannableString.valueOf(str5);
                                            int i25 = messageEntity.offset;
                                            int i26 = messageEntity.length + i25;
                                            ArrayList<TLRPC.MessageEntity> arrayList7 = this.U.messageOwner.entities;
                                            str7 = str2;
                                            try {
                                                int size2 = arrayList7.size();
                                                int i27 = i22;
                                                int i28 = 0;
                                                while (i28 < size2) {
                                                    TLRPC.MessageEntity messageEntity2 = arrayList7.get(i28);
                                                    int i29 = i28 + 1;
                                                    int i30 = size2;
                                                    TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                                    int i31 = messageEntity3.offset;
                                                    String str9 = str3;
                                                    try {
                                                        int i32 = messageEntity3.length + i31;
                                                        if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i25 > i32 || i26 < i31) {
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                            arrayList2 = arrayList7;
                                                        } else {
                                                            vz0 vz0Var = new vz0();
                                                            spannableStringBuilder3 = spannableStringBuilder5;
                                                            try {
                                                                vz0Var.a |= 256;
                                                                arrayList2 = arrayList7;
                                                                valueOf.setSpan(new wz0(vz0Var, 0), Math.max(i25, i31), Math.min(i26, i32) + i27, 33);
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                str2 = str7;
                                                                str3 = str9;
                                                                FileLog.e(e);
                                                                spannableStringBuilder4 = spannableStringBuilder3;
                                                                i24++;
                                                                i23 = 1;
                                                            }
                                                        }
                                                        i28 = i29;
                                                        size2 = i30;
                                                        str3 = str9;
                                                        spannableStringBuilder5 = spannableStringBuilder3;
                                                        arrayList7 = arrayList2;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        spannableStringBuilder3 = spannableStringBuilder5;
                                                    }
                                                }
                                                str8 = str3;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                arrayList6.add(valueOf);
                                            } catch (Exception e13) {
                                                e = e13;
                                                spannableStringBuilder3 = spannableStringBuilder5;
                                                str2 = str7;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            spannableStringBuilder3 = spannableStringBuilder5;
                                            FileLog.e(e);
                                            spannableStringBuilder4 = spannableStringBuilder3;
                                            i24++;
                                            i23 = 1;
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
                                String str10 = this.U.messageOwner.message;
                                int i33 = messageEntity.offset;
                                sb2.append(str10.substring(i33, messageEntity.length + i33));
                                str5 = sb2.toString();
                                String str11 = this.U.messageOwner.message;
                                int i34 = messageEntity.offset;
                                str2 = str11.substring(i34, messageEntity.length + i34);
                                if (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length()) {
                                    ?? valueOf2 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.U, valueOf2);
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
                                String str12 = this.U.messageOwner.message;
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
                                if (messageEntity.offset != 0 || messageEntity.length != this.U.messageOwner.message.length()) {
                                    ?? valueOf3 = SpannableStringBuilder.valueOf(this.U.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.U, valueOf3);
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
                        i24++;
                        i23 = 1;
                    }
                    spannableStringBuilder = spannableStringBuilder4;
                }
                if (str != null && arrayList6.isEmpty()) {
                    arrayList6.add(str);
                }
                messageObject2 = this.U;
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
                i11 = this.i0;
                TextPaint textPaint3 = this.a0;
                if (i11 != 1) {
                    spannableStringBuilder2 = spannableStringBuilder;
                    String stringForMessageListDate = LocaleController.stringForMessageListDate(this.U.messageOwner.date);
                    int ceil = (int) Math.ceil(textPaint3.measureText(stringForMessageListDate));
                    textPaint = textPaint3;
                    this.d0 = t1.u2(stringForMessageListDate, textPaint3, ceil, ceil, 0, 1);
                    this.c0 = (size - ceil) - AndroidUtilities.dp(f10);
                    i12 = AndroidUtilities.dp(12.0f) + ceil;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                    textPaint = textPaint3;
                    i12 = 0;
                }
                u70 u70Var2 = this.v;
                if (str2 != null) {
                    try {
                        ?? highlightText = AndroidUtilities.highlightText(str2, this.U.highlightedWords, (org.telegram.ui.ActionBar.b6) null);
                        int i36 = size - i12;
                        StaticLayout u22 = t1.u2(highlightText != 0 ? highlightText : str2, this.V, i36 - AndroidUtilities.dp(4.0f), i36 - AndroidUtilities.dp(4.0f), 0, 3);
                        this.L = u22;
                        if (u22.getLineCount() > 0) {
                            this.M = this.K + this.L.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                        }
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                    u70Var2.a(str2);
                }
                this.P = this.M;
                StaticLayout staticLayout9 = this.L;
                int max = Math.max(1, 4 - (staticLayout9 == null ? staticLayout9.getLineCount() : 0));
                if (i11 != 1) {
                    spannableStringBuilder2 = null;
                    str4 = null;
                } else {
                    str4 = str3;
                }
                TextPaint textPaint4 = this.W;
                Stack stack2 = this.G;
                if (str4 != null) {
                    try {
                        StaticLayout u23 = t1.u2(str4, textPaint4, size, size, 0, max);
                        this.N = u23;
                        if (u23.getLineCount() > 0) {
                            this.P = this.M + this.N.getLineBottom(r8.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                        }
                        stack2.addAll(arrayList4);
                        arrayList4.clear();
                        if (!this.U.isSpoilersRevealed) {
                            dh.l.c(this, this.N, stack2, arrayList4);
                        }
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                }
                if (spannableStringBuilder2 == null) {
                    try {
                        i13 = max;
                        try {
                            this.Q = t1.u2(spannableStringBuilder2, textPaint4, size, size, 0, max);
                            if (this.N != null) {
                                this.P += AndroidUtilities.dp(10.0f);
                            }
                            stack2.addAll(arrayList3);
                            arrayList3.clear();
                            if (!this.U.isSpoilersRevealed) {
                                dh.l.c(this, this.Q, stack2, arrayList3);
                            }
                        } catch (Exception e17) {
                            e = e17;
                            FileLog.e(e);
                            messageObject3 = this.U;
                            if (messageObject3 != null) {
                            }
                            photoSize = null;
                            staticLayout = this.T;
                            if (staticLayout != null) {
                            }
                            if (!arrayList6.isEmpty()) {
                            }
                            u70 u70Var3 = u70Var2;
                            TLRPC.PhotoSize photoSize3 = photoSize;
                            int i37 = size;
                            int dp = AndroidUtilities.dp(52.0f);
                            if (LocaleController.isRTL) {
                            }
                            u70Var3.setBounds(r2, AndroidUtilities.dp(11.0f), r2 + dp, AndroidUtilities.dp(63.0f));
                            if (z10) {
                            }
                            if (i11 == i14) {
                            }
                            staticLayout2 = this.L;
                            if (staticLayout2 != null) {
                            }
                            i16 = 0;
                            staticLayout3 = this.T;
                            if (staticLayout3 != null) {
                            }
                            f12 = 5.0f;
                            staticLayout4 = this.N;
                            if (staticLayout4 != null) {
                            }
                            staticLayout5 = this.Q;
                            if (staticLayout5 != null) {
                            }
                            while (i17 < arrayList5.size()) {
                            }
                            int i38 = i16 + i15;
                            if (this.f0 != null) {
                            }
                            this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                            setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(17.0f, i38, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
                        }
                    } catch (Exception e18) {
                        e = e18;
                        i13 = max;
                    }
                } else {
                    i13 = max;
                }
                messageObject3 = this.U;
                if (messageObject3 != null || TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                    photoSize = null;
                } else {
                    photoSize = null;
                    CharSequence highlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.U.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), false), this.U.highlightedWords, (org.telegram.ui.ActionBar.b6) null);
                    if (highlightText2 != null) {
                        String str13 = this.U.highlightedWords.get(0);
                        TextPaint textPaint5 = this.b0;
                        this.T = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(highlightText2, str13, size, textPaint5, 130), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, AndroidUtilities.dp(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                staticLayout = this.T;
                if (staticLayout != null) {
                    int i39 = this.M;
                    this.S = i39;
                    int C = org.telegram.messenger.l0.C(5.0f, staticLayout.getLineBottom(staticLayout.getLineCount() - 1), i39);
                    this.M = C;
                    this.P = C;
                }
                if (!arrayList6.isEmpty()) {
                    int i40 = 0;
                    while (true) {
                        sparseArray = this.D;
                        if (i40 >= sparseArray.size()) {
                            break;
                        }
                        stack2.addAll((Collection) sparseArray.get(i40));
                        i40++;
                    }
                    sparseArray.clear();
                    int i41 = 0;
                    while (i41 < arrayList6.size()) {
                        try {
                            stack = stack2;
                        } catch (Exception e19) {
                            e = e19;
                        }
                        try {
                            ellipsize = TextUtils.ellipsize(AndroidUtilities.replaceNewLines(SpannableStringBuilder.valueOf((CharSequence) arrayList6.get(i41))), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(r0, 0, r0.length())), size), TextUtils.TruncateAt.MIDDLE);
                            i20 = size;
                            TextPaint textPaint6 = textPaint4;
                            try {
                                staticLayout6 = new StaticLayout(ellipsize, textPaint6, i20, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                textPaint2 = textPaint6;
                                try {
                                    this.B = this.P;
                                    staticLayout7 = this.Q;
                                } catch (Exception e20) {
                                    e = e20;
                                }
                            } catch (Exception e21) {
                                e = e21;
                                stack2 = stack;
                                u70Var = u70Var2;
                                photoSize2 = photoSize;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                sparseArray2 = sparseArray;
                                textPaint2 = textPaint6;
                            }
                        } catch (Exception e22) {
                            e = e22;
                            stack2 = stack;
                            u70Var = u70Var2;
                            photoSize2 = photoSize;
                            arrayList = arrayList6;
                            textPaint2 = textPaint4;
                            i18 = size;
                            sparseArray2 = sparseArray;
                            i19 = i41;
                            FileLog.e(e);
                            i41 = i19 + 1;
                            size = i18;
                            sparseArray = sparseArray2;
                            u70Var2 = u70Var;
                            textPaint4 = textPaint2;
                            arrayList6 = arrayList;
                            photoSize = photoSize2;
                        }
                        if (staticLayout7 != null) {
                            try {
                            } catch (Exception e23) {
                                e = e23;
                                stack2 = stack;
                                u70Var = u70Var2;
                                photoSize2 = photoSize;
                                i19 = i41;
                                arrayList = arrayList6;
                                i18 = i20;
                                sparseArray2 = sparseArray;
                                FileLog.e(e);
                                i41 = i19 + 1;
                                size = i18;
                                sparseArray = sparseArray2;
                                u70Var2 = u70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                            if (staticLayout7.getLineCount() != 0) {
                                this.B = this.Q.getLineBottom(r5.getLineCount() - 1) + AndroidUtilities.dp(5.0f) + this.B;
                                if (this.U.isSpoilersRevealed) {
                                    TLRPC.PhotoSize photoSize4 = photoSize;
                                    try {
                                        ArrayList arrayList8 = new ArrayList();
                                        if (ellipsize instanceof Spannable) {
                                            i19 = i41;
                                            stack2 = stack;
                                            ArrayList arrayList9 = arrayList6;
                                            sparseArray2 = sparseArray;
                                            staticLayout8 = staticLayout6;
                                            u70Var = u70Var2;
                                            arrayList = arrayList9;
                                            photoSize2 = photoSize4;
                                            i18 = i20;
                                            try {
                                                dh.l.a(this, staticLayout8, -1, -1, (Spannable) ellipsize, stack2, arrayList8, null);
                                            } catch (Exception e24) {
                                                e = e24;
                                                FileLog.e(e);
                                                i41 = i19 + 1;
                                                size = i18;
                                                sparseArray = sparseArray2;
                                                u70Var2 = u70Var;
                                                textPaint4 = textPaint2;
                                                arrayList6 = arrayList;
                                                photoSize = photoSize2;
                                            }
                                        } else {
                                            stack2 = stack;
                                            photoSize2 = photoSize4;
                                            i19 = i41;
                                            arrayList = arrayList6;
                                            i18 = i20;
                                            sparseArray2 = sparseArray;
                                            staticLayout8 = staticLayout6;
                                            u70Var = u70Var2;
                                        }
                                        sparseArray2.put(i19, arrayList8);
                                    } catch (Exception e25) {
                                        e = e25;
                                        stack2 = stack;
                                        u70Var = u70Var2;
                                        photoSize2 = photoSize4;
                                        i19 = i41;
                                        arrayList = arrayList6;
                                        i18 = i20;
                                        sparseArray2 = sparseArray;
                                        FileLog.e(e);
                                        i41 = i19 + 1;
                                        size = i18;
                                        sparseArray = sparseArray2;
                                        u70Var2 = u70Var;
                                        textPaint4 = textPaint2;
                                        arrayList6 = arrayList;
                                        photoSize = photoSize2;
                                    }
                                } else {
                                    stack2 = stack;
                                    photoSize2 = photoSize;
                                    i19 = i41;
                                    arrayList = arrayList6;
                                    i18 = i20;
                                    sparseArray2 = sparseArray;
                                    staticLayout8 = staticLayout6;
                                    u70Var = u70Var2;
                                }
                                arrayList5.add(staticLayout8);
                                i41 = i19 + 1;
                                size = i18;
                                sparseArray = sparseArray2;
                                u70Var2 = u70Var;
                                textPaint4 = textPaint2;
                                arrayList6 = arrayList;
                                photoSize = photoSize2;
                            }
                        }
                        if (this.U.isSpoilersRevealed) {
                        }
                        arrayList5.add(staticLayout8);
                        i41 = i19 + 1;
                        size = i18;
                        sparseArray = sparseArray2;
                        u70Var2 = u70Var;
                        textPaint4 = textPaint2;
                        arrayList6 = arrayList;
                        photoSize = photoSize2;
                    }
                }
                u70 u70Var32 = u70Var2;
                TLRPC.PhotoSize photoSize32 = photoSize;
                int i372 = size;
                int dp2 = AndroidUtilities.dp(52.0f);
                int B = LocaleController.isRTL ? org.telegram.messenger.l0.B(10.0f, View.MeasureSpec.getSize(i9), dp2) : AndroidUtilities.dp(10.0f);
                u70Var32.setBounds(B, AndroidUtilities.dp(11.0f), B + dp2, AndroidUtilities.dp(63.0f));
                if (z10) {
                    i14 = 1;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.U.photoThumbs, dp2, true);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.U.photoThumbs, 80);
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
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.U.photoThumbsObject), e2.c.l(dp2, "_", dp2), ImageLocation.getForObject(closestPhotoSizeWithSize2, this.U.photoThumbsObject), dp2 + "_" + dp2 + "_b", 0L, null, this.U, 0);
                    this.s = true;
                } else {
                    i14 = 1;
                }
                if (i11 == i14) {
                    f11 = 10.0f;
                    StaticLayout u24 = t1.u2(f10.d(this.U, i14, 2, textPaint), textPaint, i372, i372, 0, i13);
                    this.f0 = u24;
                    org.telegram.ui.Components.p5 p5Var = this.g0;
                    Layout[] layoutArr = new Layout[i14];
                    i15 = 0;
                    layoutArr[0] = u24;
                    this.g0 = org.telegram.ui.Components.t5.update(0, this, p5Var, layoutArr);
                } else {
                    f11 = 10.0f;
                    i15 = 0;
                }
                staticLayout2 = this.L;
                if (staticLayout2 != null || staticLayout2.getLineCount() == 0) {
                    i16 = 0;
                } else {
                    StaticLayout staticLayout10 = this.L;
                    i16 = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i14) + AndroidUtilities.dp(4.0f);
                }
                staticLayout3 = this.T;
                if (staticLayout3 != null || staticLayout3.getLineCount() == 0) {
                    f12 = 5.0f;
                } else {
                    StaticLayout staticLayout11 = this.T;
                    f12 = 5.0f;
                    i16 = org.telegram.messenger.l0.C(5.0f, staticLayout11.getLineBottom(staticLayout11.getLineCount() - i14), i16);
                }
                staticLayout4 = this.N;
                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                    StaticLayout staticLayout12 = this.N;
                    i16 = org.telegram.messenger.l0.C(f12, staticLayout12.getLineBottom(staticLayout12.getLineCount() - i14), i16);
                }
                staticLayout5 = this.Q;
                if (staticLayout5 != null && staticLayout5.getLineCount() != 0) {
                    StaticLayout staticLayout13 = this.Q;
                    i16 = org.telegram.messenger.l0.C(f12, staticLayout13.getLineBottom(staticLayout13.getLineCount() - i14), i16);
                    if (this.N != null) {
                        i16 += AndroidUtilities.dp(f11);
                    }
                }
                for (i17 = 0; i17 < arrayList5.size(); i17++) {
                    StaticLayout staticLayout14 = (StaticLayout) arrayList5.get(i17);
                    if (staticLayout14.getLineCount() > 0) {
                        i15 = staticLayout14.getLineBottom(staticLayout14.getLineCount() - i14) + i15;
                    }
                }
                int i382 = i16 + i15;
                if (this.f0 != null) {
                    this.e0 = AndroidUtilities.dp(f12) + this.B + i15;
                    StaticLayout staticLayout15 = this.f0;
                    i382 = org.telegram.messenger.l0.C(f12, staticLayout15.getLineBottom(staticLayout15.getLineCount() - i14), i382);
                }
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(17.0f, i382, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
            }
        }
        str = null;
        str2 = null;
        str3 = null;
        z10 = false;
        messageObject = this.U;
        if (messageObject != null) {
        }
        f10 = 8.0f;
        spannableStringBuilder = null;
        if (str != null) {
            arrayList6.add(str);
        }
        messageObject2 = this.U;
        if (messageObject2 != null) {
            b(richMessage.blocks);
            if (!arrayList6.isEmpty()) {
            }
        }
        i11 = this.i0;
        TextPaint textPaint32 = this.a0;
        if (i11 != 1) {
        }
        u70 u70Var22 = this.v;
        if (str2 != null) {
        }
        this.P = this.M;
        StaticLayout staticLayout92 = this.L;
        int max2 = Math.max(1, 4 - (staticLayout92 == null ? staticLayout92.getLineCount() : 0));
        if (i11 != 1) {
        }
        TextPaint textPaint42 = this.W;
        Stack stack22 = this.G;
        if (str4 != null) {
        }
        if (spannableStringBuilder2 == null) {
        }
        messageObject3 = this.U;
        if (messageObject3 != null) {
        }
        photoSize = null;
        staticLayout = this.T;
        if (staticLayout != null) {
        }
        if (!arrayList6.isEmpty()) {
        }
        u70 u70Var322 = u70Var22;
        TLRPC.PhotoSize photoSize322 = photoSize;
        int i3722 = size;
        int dp22 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
        }
        u70Var322.setBounds(B, AndroidUtilities.dp(11.0f), B + dp22, AndroidUtilities.dp(63.0f));
        if (z10) {
        }
        if (i11 == i14) {
        }
        staticLayout2 = this.L;
        if (staticLayout2 != null) {
        }
        i16 = 0;
        staticLayout3 = this.T;
        if (staticLayout3 != null) {
        }
        f12 = 5.0f;
        staticLayout4 = this.N;
        if (staticLayout4 != null) {
            StaticLayout staticLayout122 = this.N;
            i16 = org.telegram.messenger.l0.C(f12, staticLayout122.getLineBottom(staticLayout122.getLineCount() - i14), i16);
        }
        staticLayout5 = this.Q;
        if (staticLayout5 != null) {
            StaticLayout staticLayout132 = this.Q;
            i16 = org.telegram.messenger.l0.C(f12, staticLayout132.getLineBottom(staticLayout132.getLineCount() - i14), i16);
            if (this.N != null) {
            }
        }
        while (i17 < arrayList5.size()) {
        }
        int i3822 = i16 + i15;
        if (this.f0 != null) {
        }
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(17.0f, i3822, AndroidUtilities.dp(76.0f)) + (this.y ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        k7 k7Var;
        boolean z11;
        int i9;
        int i10;
        int i11;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.U != null) {
            ArrayList arrayList = this.C;
            if (!arrayList.isEmpty() && (k7Var = this.x) != null && k7Var.f()) {
                if (motionEvent.getAction() != 0 && ((!this.f && this.I == null) || motionEvent.getAction() != 1)) {
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
                        z11 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i12);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f10 = x10;
                        float f11 = dp;
                        if (f10 < staticLayout.getLineLeft(0) + f11 || f10 > staticLayout.getLineWidth(0) + f11 || y10 < (i11 = this.B + i13) || y10 > i11 + lineBottom) {
                            i13 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.I = null;
                                SparseArray sparseArray = this.D;
                                if (sparseArray.get(i12, null) != null) {
                                    Iterator it = ((List) sparseArray.get(i12)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        dh.l lVar = (dh.l) it.next();
                                        if (lVar.getBounds().contains(x10 - dp, (y10 - this.B) - i13)) {
                                            e();
                                            this.I = lVar;
                                            this.J = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.I == null && (this.h != i12 || this.n == null || !this.f)) {
                                    e();
                                    this.h = i12;
                                    m80 m80Var = new m80(null, this.h0, x10 - dp, (y10 - this.B) - i13, 0);
                                    this.n = m80Var;
                                    f80 b10 = m80Var.b();
                                    this.f = true;
                                    this.e.a(this.n, null);
                                    if (!this.a) {
                                        this.a = true;
                                        if (this.d == null) {
                                            this.d = new m.i3(this, 7);
                                        }
                                        postDelayed(this.d, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        b10.e(staticLayout, 0, f11, this.B + i13);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), b10);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            } else if (this.f) {
                                try {
                                    if (this.h == 0 && (messageMedia = this.U.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.x.a(((CharSequence) this.A.get(this.h)).toString(), false);
                                    } else {
                                        this.x.b(webPage, this.U);
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                e();
                            } else if (this.I != null) {
                                g(x10, y10, i13);
                            } else {
                                z10 = false;
                                z11 = true;
                            }
                            z10 = true;
                            z11 = true;
                        }
                    }
                    i12++;
                }
                if (motionEvent.getAction() == 0) {
                    int dp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                    StaticLayout staticLayout2 = this.N;
                    if (staticLayout2 != null && x10 >= dp2 && x10 <= staticLayout2.getWidth() + dp2 && y10 >= (i10 = this.M) && y10 <= this.N.getHeight() + i10) {
                        ArrayList arrayList2 = this.E;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i14);
                            i14++;
                            dh.l lVar2 = (dh.l) obj;
                            if (lVar2.getBounds().contains(x10 - dp2, y10 - this.M)) {
                                this.I = lVar2;
                                this.J = 1;
                                z10 = true;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.Q;
                    if (staticLayout3 != null && x10 >= dp2 && x10 <= staticLayout3.getWidth() + dp2 && y10 >= (i9 = this.P) && y10 <= this.Q.getHeight() + i9) {
                        ArrayList arrayList3 = this.F;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            dh.l lVar3 = (dh.l) obj2;
                            if (lVar3.getBounds().contains(x10 - dp2, y10 - this.P)) {
                                this.I = lVar3;
                                this.J = 2;
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
                    if (motionEvent.getAction() == 1 && this.I != null) {
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

    public void setDelegate(k7 k7Var) {
        this.x = k7Var;
    }
}
