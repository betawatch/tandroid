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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yl0 extends Dialog {
    public static final /* synthetic */ int K = 0;
    public Drawable A;
    public ng.d B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;
    public final Context a;
    public final org.telegram.ui.ActionBar.c6 b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final qg.b h;
    public final lg.a n;
    public float r;
    public final bg.x2 s;
    public final hv0 v;
    public j70 w;
    public FrameLayout x;
    public ViewGroup y;

    public yl0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = false;
        this.a = context;
        this.b = c6Var;
        bg.x2 x2Var = new bg.x2(this, context, 25);
        this.s = x2Var;
        int i10 = 10;
        x2Var.setOnClickListener(new u70(this, i10));
        hv0 hv0Var = new hv0(context, null);
        this.v = hv0Var;
        hv0Var.setClipToPadding(false);
        x2Var.addView(hv0Var, i7.f6.e(-1, -1, 119));
        qg.b bVar = new qg.b();
        this.h = bVar;
        lg.a aVar = new lg.a(bVar);
        this.n = aVar;
        aVar.d = new sg.i(x2Var);
        aVar.e = x2Var;
        o1.a aVar2 = new o1.a(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(x2Var, aVar2);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new y2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new d70(this, 11));
        this.J.addListener(new androidx.fragment.app.g(this, z10, runnable, 7));
        this.J.setInterpolator(jr.h);
        this.J.setDuration(350L);
        this.J.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.I) {
            return;
        }
        this.I = true;
        c(new wl0(this, 1), false);
        this.s.invalidate();
    }

    public final void e(j70 j70Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        j70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        j70Var.Q(this.n, pg.a.j(c6Var), false);
        this.w = j70Var;
        this.y = j70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.x = frameLayout;
        frameLayout.addView(this.y, i7.f6.c(-2.0f, -2));
        this.v.addView(this.x, i7.f6.c(-2.0f, -2));
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
    /* JADX WARN: Type inference failed for: r5v6, types: [android.graphics.Path, org.telegram.ui.Components.oq, org.telegram.ui.Components.s80] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.graphics.Path, org.telegram.ui.Components.s80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z10) {
        float f9;
        float f10;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f11;
        boolean z11;
        float f12;
        float f13;
        int i10;
        int i11;
        int i12;
        ?? r14;
        float f14;
        RectF rectF;
        StaticLayout staticLayout;
        Layout layout;
        Paint paint;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink findLink;
        ArrayList<org.telegram.ui.Cells.q1> pollButtons;
        int i14;
        int i15;
        float f15;
        float f16;
        int i16;
        int i17;
        float f17;
        float f18;
        int i18;
        if (s1Var == null) {
            return;
        }
        s1Var.getCurrentMessagesGroup();
        MessageObject messageObject = s1Var.getMessageObject();
        int i19 = 0;
        boolean z12 = s1Var.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z12 && z10) {
            f9 = s1Var.getExplanationX();
            f10 = s1Var.getExplanationY();
            arrayList = s1Var.getExplanationLayout().textLayoutBlocks;
            f11 = s1Var.getExplanationLayout().textXOffset;
        } else if (s1Var.getCaptionLayout() != null) {
            f9 = s1Var.getCaptionX();
            f10 = s1Var.getCaptionY();
            arrayList = s1Var.getCaptionLayout().textLayoutBlocks;
            f11 = s1Var.getCaptionLayout().textXOffset;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
            arrayList = null;
            f11 = 0.0f;
        }
        if (arrayList == null) {
            f9 = s1Var.getTextX();
            f10 = s1Var.getTextY() + s1Var.le;
            arrayList = messageObject.textLayoutBlocks;
            f11 = messageObject.textXOffset;
        }
        if (arrayList != null) {
            int i20 = 0;
            while (i20 < arrayList.size()) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i20);
                StaticLayout staticLayout2 = textLayoutBlock.textLayout;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spanned)) {
                    z11 = z12;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(i19, staticLayout2.getText().length(), CharacterStyle.class);
                    if (characterStyleArr != null) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i10 = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                i12 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                if (textLayoutBlock.isRtl()) {
                                    f17 = f9;
                                    f18 = f10;
                                    i18 = (int) Math.ceil(f11);
                                } else {
                                    f17 = f9;
                                    f18 = f10;
                                    i18 = 0;
                                }
                                f12 = i18 + f17;
                                f13 = textLayoutBlock.textYOffset(arrayList, s1Var.Vc) + textLayoutBlock.padTop + f18;
                                i11 = textLayoutBlock.originalWidth;
                                r14 = staticLayout2;
                                if (r14 == 0 && s1Var.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = s1Var.getDescriptionlayout();
                                    i16 = 0;
                                    r14 = r14;
                                    while (i16 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i17 = i10;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle3 : characterStyleArr2) {
                                                    if (characterStyle3 == characterStyle) {
                                                        i10 = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                        i12 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                        f12 = s1Var.getDescriptionLayoutX();
                                                        f13 = s1Var.getDescriptionLayoutY();
                                                        i11 = descriptionlayout.getWidth();
                                                        r14 = descriptionlayout;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i17 = i10;
                                        }
                                        i10 = i17;
                                        i16++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = s1Var.getPollButtons()) != null)) {
                                    i14 = 0;
                                    r14 = r14;
                                    while (i14 < pollButtons.size()) {
                                        org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i14);
                                        StaticLayout staticLayout3 = q1Var.p;
                                        if (staticLayout3 == null) {
                                            i15 = i10;
                                        } else {
                                            i15 = i10;
                                            if (staticLayout3.getText() instanceof Spanned) {
                                                f15 = f12;
                                                f16 = f13;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout3.getText()).getSpans(0, staticLayout3.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle4 : characterStyleArr3) {
                                                        if (characterStyle4 == characterStyle) {
                                                            i10 = ((Spanned) staticLayout3.getText()).getSpanStart(characterStyle);
                                                            i12 = ((Spanned) staticLayout3.getText()).getSpanEnd(characterStyle);
                                                            f12 = q1Var.m;
                                                            f13 = q1Var.n;
                                                            i11 = staticLayout3.getWidth();
                                                            r14 = staticLayout3;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i10 = i15;
                                                f13 = f16;
                                                f12 = f15;
                                                i14++;
                                                r14 = r14;
                                            }
                                        }
                                        f15 = f12;
                                        f16 = f13;
                                        i10 = i15;
                                        f13 = f16;
                                        f12 = f15;
                                        i14++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (findLink = richMessageLayout.findLink(characterStyle)) != null) {
                                    r14 = findLink.layout;
                                    i10 = findLink.start;
                                    i12 = findLink.end;
                                    i11 = findLink.originalWidth;
                                    f12 = s1Var.getTextX() + findLink.x;
                                    f13 = s1Var.getTextY() + findLink.y;
                                }
                                int i21 = i11;
                                int i22 = i10;
                                float f19 = f12;
                                int i23 = i12;
                                if (r14 != 0 && z11 && !z10) {
                                    f(s1Var, characterStyle, charSequence, true);
                                    return;
                                }
                                if (r14 != 0) {
                                    return;
                                }
                                if (charSequence != null) {
                                    int lineForOffset = r14.getLineForOffset(i22);
                                    float lineTop = f13 + r14.getLineTop(lineForOffset);
                                    float primaryHorizontal = r14.getPrimaryHorizontal(i22);
                                    float lineWidth = r14.getLineWidth(lineForOffset);
                                    ?? s80Var = new s80(0);
                                    s80Var.d(r14, i22, 0.0f);
                                    r14.getSelectionPath(i22, i23, s80Var);
                                    RectF rectF2 = new RectF();
                                    s80Var.computeBounds(rectF2, true);
                                    StaticLayout makeStaticLayout = MessageObject.makeStaticLayout(charSequence, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
                                    i23 = charSequence.length();
                                    float width = makeStaticLayout.getWidth();
                                    float f20 = 0.0f;
                                    for (int i24 = 0; i24 < makeStaticLayout.getLineCount(); i24++) {
                                        width = Math.min(width, makeStaticLayout.getLineLeft(i24));
                                        f20 = Math.max(f20, makeStaticLayout.getLineRight(i24));
                                    }
                                    f19 += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f20 - width)));
                                    rectF = rectF2;
                                    i22 = 0;
                                    f14 = lineTop;
                                    staticLayout = makeStaticLayout;
                                } else {
                                    f14 = f13;
                                    rectF = null;
                                    staticLayout = r14;
                                }
                                ?? r12 = staticLayout;
                                float f21 = f19;
                                Paint paint2 = new Paint(1);
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(messageObject.isOutOwner() ? org.telegram.ui.ActionBar.g6.Aa : org.telegram.ui.ActionBar.g6.ra, this.b));
                                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                ?? s80Var2 = new s80(0);
                                s80Var2.c = true;
                                s80Var2.d(r12, i22, 0.0f);
                                r12.getSelectionPath(i22, i23, s80Var2);
                                s80Var2.a();
                                RectF rectF3 = new RectF();
                                s80Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + AndroidUtilities.dp(5.0f));
                                if (!s1Var.C1() || width2 <= 0) {
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
                                        canvas.drawPath(s80Var2, paint4);
                                        bitmap = createBitmap;
                                        Paint paint5 = new Paint(3);
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        s1Var.c4();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(y5.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i22 <= 0) {
                                            i13 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i22, 33);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i23 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i23, spannableStringBuilder.length(), 33);
                                        }
                                        StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i21, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                        int[] iArr = new int[2];
                                        s1Var.getLocationOnScreen(iArr);
                                        this.A = new xl0(s80Var2, new int[]{iArr[0] + ((int) f21), iArr[1] + ((int) f14)}, s1Var, iArr, bitmap, rectF3, paint5, paint, makeStaticLayout2);
                                        int dp = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr[0] + f21 + rectF3.left);
                                        int i25 = (int) (iArr[1] + f14 + rectF3.top);
                                        this.A.setBounds(dp, i25, ((int) rectF3.width()) + dp, ((int) rectF3.height()) + i25);
                                        if (charSequence == null) {
                                            float f22 = dp;
                                            if (rectF3.width() + f22 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                                                this.D -= (rectF3.width() + f22) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
                                            }
                                            float f23 = i25;
                                            if (rectF3.height() + f23 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                                                this.E -= (rectF3.height() + f23) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
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
                                s1Var.c4();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(y5.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i22 <= 0) {
                                }
                                if (i23 < spannableStringBuilder.length()) {
                                }
                                StaticLayout makeStaticLayout22 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint2, i21, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                int[] iArr2 = new int[2];
                                s1Var.getLocationOnScreen(iArr2);
                                this.A = new xl0(s80Var2, new int[]{iArr2[0] + ((int) f21), iArr2[1] + ((int) f14)}, s1Var, iArr2, bitmap, rectF3, paint52, paint, makeStaticLayout22);
                                int dp2 = (int) ((AndroidUtilities.dp(5.0f) / 2.0f) + iArr2[0] + f21 + rectF3.left);
                                int i252 = (int) (iArr2[1] + f14 + rectF3.top);
                                this.A.setBounds(dp2, i252, ((int) rectF3.width()) + dp2, ((int) rectF3.height()) + i252);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z11 = z12;
                }
                i20++;
                f9 = f9;
                z12 = z11;
                f10 = f10;
                i19 = 0;
            }
        }
        z11 = z12;
        f12 = f9;
        f13 = f10;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        r14 = 0;
        if (r14 == 0) {
            StaticLayout descriptionlayout2 = s1Var.getDescriptionlayout();
            i16 = 0;
            r14 = r14;
            while (i16 == 0) {
            }
        }
        if (r14 == 0) {
            i14 = 0;
            r14 = r14;
            while (i14 < pollButtons.size()) {
            }
        }
        if (r14 == 0) {
            r14 = findLink.layout;
            i10 = findLink.start;
            i12 = findLink.end;
            i11 = findLink.originalWidth;
            f12 = s1Var.getTextX() + findLink.x;
            f13 = s1Var.getTextY() + findLink.y;
        }
        int i212 = i11;
        int i222 = i10;
        float f192 = f12;
        int i232 = i12;
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
        bg.x2 x2Var = this.s;
        setContentView(x2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        x2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(x2Var, !org.telegram.ui.ActionBar.g6.I.q());
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
