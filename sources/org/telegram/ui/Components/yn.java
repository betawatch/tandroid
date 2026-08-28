package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class yn extends LinearLayout {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public AnimatorSet B;
    public boolean C;
    public boolean D;
    public float E;
    public int F;
    public boolean G;
    public TLRPC.Document a;
    public final TextView b;
    public final TextView c;
    public xn d;
    public final int e;
    public final FrameLayout f;
    public o9 h;
    public o9 n;
    public final org.telegram.ui.ActionBar.b6 r;
    public boolean s;
    public pi0 v;
    public TextView w;
    public bh.e x;
    public boolean y;

    public yn(Context context, int i9, TLRPC.Document document, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setOrientation(1);
        this.e = i9;
        this.r = b6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        o9 o9Var = new o9(context);
        this.h = o9Var;
        o9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, g7.e6.c(112.0f, 112));
        g7.g6.a(this.h);
        o9 o9Var2 = new o9(context);
        this.n = o9Var2;
        o9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.n, g7.e6.c(112.0f, 112));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        g7.g6.a(this.n);
        e();
        int i10 = org.telegram.ui.ActionBar.f6.ic;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(kh.x3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            this.a = MediaDataController.getInstance(i9).getGreetingsSticker();
        }
    }

    public static void a(yn ynVar) {
        AnimatorSet animatorSet = ynVar.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ynVar.n.setVisibility(0);
        ynVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ynVar.B = animatorSet2;
        animatorSet2.setDuration(420L);
        ynVar.B.setInterpolator(gr.h);
        ynVar.B.addListener(new u9(ynVar));
        AnimatorSet animatorSet3 = ynVar.B;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ynVar.n, (Property<o9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ynVar.n, (Property<o9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ynVar.n, (Property<o9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(ynVar.n, (Property<o9, Float>) property4, -AndroidUtilities.dp(24.0f), 0.0f), ObjectAnimator.ofFloat(ynVar.h, (Property<o9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(ynVar.h, (Property<o9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(ynVar.h, (Property<o9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(ynVar.h, (Property<o9, Float>) property4, 0.0f, AndroidUtilities.dp(24.0f)));
        ynVar.B.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i9;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                i9 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                i10 = documentAttribute.w;
                i9 = documentAttribute.h;
                break;
            }
            i11++;
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && i10 == 0 && i9 == 0) {
            i10 = 512;
            i9 = 512;
        }
        if (i10 == 0) {
            i9 = (int) f11;
            i10 = AndroidUtilities.dp(100.0f) + i9;
        }
        int i12 = (int) ((f11 / i10) * i9);
        int i13 = (int) f11;
        float f12 = i12;
        if (f12 > f11) {
            i13 = (int) ((f11 / f12) * i13);
            i12 = i13;
        }
        float f13 = i13;
        float f14 = AndroidUtilities.density;
        int i14 = (int) (f13 / f14);
        int i15 = (int) (i12 / f14);
        Locale locale = Locale.US;
        return e2.c.l(i14, "_", i15);
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.A = z11;
        if (z10) {
            if (this.v == null) {
                pi0 pi0Var = new pi0(getContext());
                this.v = pi0Var;
                pi0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z11) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new f0(this, 8));
                }
            }
            this.v.d();
            if (this.w == null) {
                TextView textView = new TextView(getContext());
                this.w = textView;
                textView.setTextAlignment(4);
                this.w.setGravity(17);
                this.w.setTextSize(1, 13.0f);
            }
            this.w.setText(spannableStringBuilder);
            TextView textView2 = this.w;
            textView2.setMaxWidth(kh.x3.a(textView2.getText(), this.w.getPaint()));
            TextView textView3 = this.w;
            int i9 = org.telegram.ui.ActionBar.f6.ic;
            org.telegram.ui.ActionBar.b6 b6Var = this.r;
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.x == null) {
                bh.e eVar = new bh.e(getContext(), 6);
                this.x = eVar;
                eVar.setTextAlignment(4);
                this.x.setGravity(17);
                this.x.setTypeface(AndroidUtilities.bold());
                this.x.setTextSize(1, 14.0f);
                this.x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                bh.e eVar2 = this.x;
                int dp = AndroidUtilities.dp(15.0f);
                eVar2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                g7.g6.a(this.x);
            }
            this.x.setText(str);
            this.x.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.D = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), kh.x3.a(textView.getText(), textView.getPaint())) : (int) (AndroidUtilities.displaySize.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.G) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.r;
            if (b6Var != null) {
                b6Var.o(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            } else {
                org.telegram.ui.ActionBar.f6.q(0.0f, this.E + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.F);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var));
        }
        if (!this.s) {
            this.s = true;
            setSticker(this.a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        removeAllViews();
        if (!this.y) {
            addView(this.b, g7.e6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, g7.e6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, g7.e6.t(112, 112, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.v, g7.e6.t(78, 78, 49, 20, 9, 20, 9));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.e).premiumFeaturesBlocked();
        addView(this.w, g7.e6.t(-2, -2, 49, 20, 0, 20, premiumFeaturesBlocked ? 13 : 9));
        if (premiumFeaturesBlocked) {
            return;
        }
        bh.e eVar = this.x;
        if ((eVar == null || TextUtils.isEmpty(eVar.getText())) && this.A) {
            return;
        }
        addView(this.x, g7.e6.t(-2, 30, 49, 20, 2, 20, 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.e).getGreetingsSticker();
            this.a = greetingsSticker;
            if (this.s) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        this.C = true;
        boolean z10 = this.D;
        TextView textView = this.c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i9, i10);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i10) || this.D) {
            if (!this.D) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.C = false;
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.G = true;
    }

    public void setListener(xn xnVar) {
        this.d = xnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new vn(this, document2, 0));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.j(ImageLocation.getForPath(str), "256_256", null, null, 0, null);
    }
}
