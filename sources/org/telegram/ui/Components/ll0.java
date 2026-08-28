package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ll0 extends Dialog {
    public static final /* synthetic */ int K = 0;
    public Drawable A;
    public kg.d B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;
    public final Context a;
    public final org.telegram.ui.ActionBar.b6 b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final ng.b h;
    public final ig.a n;
    public float r;
    public final fh.d2 s;
    public final xu0 v;
    public x60 w;
    public FrameLayout x;
    public ViewGroup y;

    public ll0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, R.style.TransparentDialog);
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = false;
        this.a = context;
        this.b = b6Var;
        fh.d2 d2Var = new fh.d2(this, context, 20);
        this.s = d2Var;
        d2Var.setOnClickListener(new h70(this, 10));
        xu0 xu0Var = new xu0(context, null);
        this.v = xu0Var;
        xu0Var.setClipToPadding(false);
        d2Var.addView(xu0Var, g7.e6.e(-1, -1, 119));
        ng.b bVar = new ng.b();
        this.h = bVar;
        ig.a aVar = new ig.a(bVar);
        this.n = aVar;
        aVar.d = new pg.i(d2Var);
        aVar.e = d2Var;
        m5.c0 c0Var = new m5.c0(this, 16);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(d2Var, c0Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new v2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 11));
        this.J.addListener(new androidx.fragment.app.g(this, z10, runnable, 6));
        this.J.setInterpolator(gr.h);
        this.J.setDuration(350L);
        this.J.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.I) {
            return;
        }
        this.I = true;
        c(new jl0(this, 1), false);
        this.s.invalidate();
    }

    public final void e(x60 x60Var) {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        x60Var.Q(this.n, mg.c.j(b6Var), false);
        this.w = x60Var;
        this.y = x60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.x = frameLayout;
        frameLayout.addView(this.y, g7.e6.c(-2.0f, -2));
        this.v.addView(this.x, g7.e6.c(-2.0f, -2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r14v8, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.graphics.Path, org.telegram.ui.Components.f80, org.telegram.ui.Components.kq] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.graphics.Path, org.telegram.ui.Components.f80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z10) {
        float f10;
        float f11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f12;
        boolean z11;
        float f13;
        float f14;
        int i9;
        int i10;
        int i11;
        ?? r14;
        float f15;
        RectF rectF;
        StaticLayout staticLayout;
        Layout layout;
        Paint paint;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink findLink;
        ArrayList<org.telegram.ui.Cells.r1> pollButtons;
        int i13;
        int i14;
        float f16;
        float f17;
        int i15;
        int i16;
        float f18;
        float f19;
        int i17;
        if (t1Var == null) {
            return;
        }
        t1Var.getCurrentMessagesGroup();
        MessageObject messageObject = t1Var.getMessageObject();
        int i18 = 0;
        boolean z12 = t1Var.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z12 && z10) {
            f10 = t1Var.getExplanationX();
            f11 = t1Var.getExplanationY();
            arrayList = t1Var.getExplanationLayout().textLayoutBlocks;
            f12 = t1Var.getExplanationLayout().textXOffset;
        } else if (t1Var.getCaptionLayout() != null) {
            f10 = t1Var.getCaptionX();
            f11 = t1Var.getCaptionY();
            arrayList = t1Var.getCaptionLayout().textLayoutBlocks;
            f12 = t1Var.getCaptionLayout().textXOffset;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            arrayList = null;
            f12 = 0.0f;
        }
        if (arrayList == null) {
            f10 = t1Var.getTextX();
            f11 = t1Var.getTextY() + t1Var.le;
            arrayList = messageObject.textLayoutBlocks;
            f12 = messageObject.textXOffset;
        }
        if (arrayList != null) {
            int i19 = 0;
            while (i19 < arrayList.size()) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i19);
                StaticLayout staticLayout2 = textLayoutBlock.textLayout;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spanned)) {
                    z11 = z12;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(i18, staticLayout2.getText().length(), CharacterStyle.class);
                    if (characterStyleArr != null) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i9 = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                i11 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                if (textLayoutBlock.isRtl()) {
                                    f18 = f10;
                                    f19 = f11;
                                    i17 = (int) Math.ceil(f12);
                                } else {
                                    f18 = f10;
                                    f19 = f11;
                                    i17 = 0;
                                }
                                f13 = i17 + f18;
                                f14 = textLayoutBlock.textYOffset(arrayList, t1Var.Vc) + textLayoutBlock.padTop + f19;
                                i10 = textLayoutBlock.originalWidth;
                                r14 = staticLayout2;
                                if (r14 == 0 && t1Var.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = t1Var.getDescriptionlayout();
                                    i15 = 0;
                                    r14 = r14;
                                    while (i15 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i16 = i9;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle3 : characterStyleArr2) {
                                                    if (characterStyle3 == characterStyle) {
                                                        i9 = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                        i11 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                        f13 = t1Var.getDescriptionLayoutX();
                                                        f14 = t1Var.getDescriptionLayoutY();
                                                        i10 = descriptionlayout.getWidth();
                                                        r14 = descriptionlayout;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i16 = i9;
                                        }
                                        i9 = i16;
                                        i15++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = t1Var.getPollButtons()) != null)) {
                                    i13 = 0;
                                    r14 = r14;
                                    while (i13 < pollButtons.size()) {
                                        org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i13);
                                        StaticLayout staticLayout3 = r1Var.p;
                                        if (staticLayout3 == null) {
                                            i14 = i9;
                                        } else {
                                            i14 = i9;
                                            if (staticLayout3.getText() instanceof Spanned) {
                                                f16 = f13;
                                                f17 = f14;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout3.getText()).getSpans(0, staticLayout3.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle4 : characterStyleArr3) {
                                                        if (characterStyle4 == characterStyle) {
                                                            i9 = ((Spanned) staticLayout3.getText()).getSpanStart(characterStyle);
                                                            i11 = ((Spanned) staticLayout3.getText()).getSpanEnd(characterStyle);
                                                            f13 = r1Var.m;
                                                            f14 = r1Var.n;
                                                            i10 = staticLayout3.getWidth();
                                                            r14 = staticLayout3;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i9 = i14;
                                                f14 = f17;
                                                f13 = f16;
                                                i13++;
                                                r14 = r14;
                                            }
                                        }
                                        f16 = f13;
                                        f17 = f14;
                                        i9 = i14;
                                        f14 = f17;
                                        f13 = f16;
                                        i13++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (findLink = richMessageLayout.findLink(characterStyle)) != null) {
                                    r14 = findLink.layout;
                                    i9 = findLink.start;
                                    i11 = findLink.end;
                                    i10 = findLink.originalWidth;
                                    f13 = t1Var.getTextX() + findLink.x;
                                    f14 = t1Var.getTextY() + findLink.y;
                                }
                                int i20 = i10;
                                int i21 = i9;
                                float f20 = f13;
                                int i22 = i11;
                                if (r14 != 0 && z11 && !z10) {
                                    f(t1Var, characterStyle, charSequence, true);
                                    return;
                                }
                                if (r14 != 0) {
                                    return;
                                }
                                if (charSequence != null) {
                                    int lineForOffset = r14.getLineForOffset(i21);
                                    float lineTop = f14 + r14.getLineTop(lineForOffset);
                                    float primaryHorizontal = r14.getPrimaryHorizontal(i21);
                                    float lineWidth = r14.getLineWidth(lineForOffset);
                                    ?? f80Var = new f80(0);
                                    f80Var.d(r14, i21, 0.0f);
                                    r14.getSelectionPath(i21, i22, f80Var);
                                    RectF rectF2 = new RectF();
                                    f80Var.computeBounds(rectF2, true);
                                    StaticLayout makeStaticLayout = MessageObject.makeStaticLayout(charSequence, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
                                    i22 = charSequence.length();
                                    float width = makeStaticLayout.getWidth();
                                    float f21 = 0.0f;
                                    for (int i23 = 0; i23 < makeStaticLayout.getLineCount(); i23++) {
                                        width = Math.min(width, makeStaticLayout.getLineLeft(i23));
                                        f21 = Math.max(f21, makeStaticLayout.getLineRight(i23));
                                    }
                                    f20 += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f21 - width)));
                                    rectF = rectF2;
                                    i21 = 0;
                                    f15 = lineTop;
                                    staticLayout = makeStaticLayout;
                                } else {
                                    f15 = f14;
                                    rectF = null;
                                    staticLayout = r14;
                                }
                                ?? r12 = staticLayout;
                                float f22 = f20;
                                Paint paint2 = new Paint(1);
                                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(messageObject.isOutOwner() ? org.telegram.ui.ActionBar.f6.Aa : org.telegram.ui.ActionBar.f6.ra, this.b));
                                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                ?? f80Var2 = new f80(0);
                                f80Var2.c = true;
                                f80Var2.d(r12, i21, 0.0f);
                                r12.getSelectionPath(i21, i22, f80Var2);
                                f80Var2.a();
                                RectF rectF3 = new RectF();
                                f80Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + AndroidUtilities.dp(5.0f));
                                if (!t1Var.C1() || width2 <= 0) {
                                    layout = r12;
                                    paint = paint2;
                                } else {
                                    if (rectF3.height() > 0.0f) {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
                                        ?? canvas = new Canvas(createBitmap);
                                        layout = r12;
                                        paint = paint2;
                                        Paint paint3 = new Paint(1);
                                        paint3.setColor(-1);
                                        canvas.drawRect(0.0f, 0.0f, width2, rectF3.height(), paint3);
                                        Paint paint4 = new Paint(1);
                                        paint4.setColor(-1);
                                        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(f80Var2, paint4);
                                        bitmap = createBitmap;
                                        Paint paint5 = new Paint(3);
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        t1Var.c4();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(t5.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i21 <= 0) {
                                            i12 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i21, 33);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i22 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i22, spannableStringBuilder.length(), 33);
                                        }
                                        StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i20, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                        int[] iArr = new int[2];
                                        t1Var.getLocationOnScreen(iArr);
                                        this.A = new kl0(f80Var2, new int[]{iArr[0] + ((int) f22), iArr[1] + ((int) f15)}, t1Var, iArr, bitmap, rectF3, paint5, paint, makeStaticLayout2);
                                        int dp = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr[0] + f22 + rectF3.left);
                                        int i24 = (int) (iArr[1] + f15 + rectF3.top);
                                        this.A.setBounds(dp, i24, ((int) rectF3.width()) + dp, ((int) rectF3.height()) + i24);
                                        if (charSequence == null) {
                                            float f23 = dp;
                                            if (rectF3.width() + f23 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                                                this.D -= (rectF3.width() + f23) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
                                            }
                                            float f24 = i24;
                                            if (rectF3.height() + f24 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                                                this.E -= (rectF3.height() + f24) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
                                            }
                                            if (rectF != null) {
                                                this.F = rectF.width() / rectF3.width();
                                                this.G = rectF.height() / rectF3.height();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    layout = r12;
                                    paint = paint2;
                                }
                                bitmap = null;
                                Paint paint52 = new Paint(3);
                                paint52.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                t1Var.c4();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(t5.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i21 <= 0) {
                                }
                                if (i22 < spannableStringBuilder.length()) {
                                }
                                StaticLayout makeStaticLayout22 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint2, i20, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                int[] iArr2 = new int[2];
                                t1Var.getLocationOnScreen(iArr2);
                                this.A = new kl0(f80Var2, new int[]{iArr2[0] + ((int) f22), iArr2[1] + ((int) f15)}, t1Var, iArr2, bitmap, rectF3, paint52, paint, makeStaticLayout22);
                                int dp2 = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr2[0] + f22 + rectF3.left);
                                int i242 = (int) (iArr2[1] + f15 + rectF3.top);
                                this.A.setBounds(dp2, i242, ((int) rectF3.width()) + dp2, ((int) rectF3.height()) + i242);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z11 = z12;
                }
                i19++;
                f10 = f10;
                z12 = z11;
                f11 = f11;
                i18 = 0;
            }
        }
        z11 = z12;
        f13 = f10;
        f14 = f11;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        r14 = 0;
        if (r14 == 0) {
            StaticLayout descriptionlayout2 = t1Var.getDescriptionlayout();
            i15 = 0;
            r14 = r14;
            while (i15 == 0) {
            }
        }
        if (r14 == 0) {
            i13 = 0;
            r14 = r14;
            while (i13 < pollButtons.size()) {
            }
        }
        if (r14 == 0) {
            r14 = findLink.layout;
            i9 = findLink.start;
            i11 = findLink.end;
            i10 = findLink.originalWidth;
            f13 = t1Var.getTextX() + findLink.x;
            f14 = t1Var.getTextY() + findLink.y;
        }
        int i202 = i10;
        int i212 = i9;
        float f202 = f13;
        int i222 = i11;
        if (r14 != 0) {
        }
        if (r14 != 0) {
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.I;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fh.d2 d2Var = this.s;
        setContentView(d2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i9 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        d2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(d2Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            d(new d(this, 19));
            c(null, true);
        }
    }
}
