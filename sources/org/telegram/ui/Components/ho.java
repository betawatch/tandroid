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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class ho extends LinearLayout {
    public static final /* synthetic */ int I = 0;
    public boolean B;
    public AnimatorSet C;
    public boolean D;
    public boolean E;
    public float F;
    public int G;
    public boolean H;
    public TLRPC.Document a;
    public final TextView b;
    public final TextView c;
    public go d;
    public final int e;
    public final FrameLayout f;
    public p9 h;
    public p9 n;
    public final org.telegram.ui.ActionBar.g6 r;
    public boolean s;
    public lj0 v;
    public TextView w;
    public fg.s0 x;
    public boolean y;

    public ho(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(1);
        this.e = i10;
        this.r = g6Var;
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
        p9 p9Var = new p9(context);
        this.h = p9Var;
        p9Var.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.h, k7.c6.c(112.0f, 112));
        k7.e6.a(this.h);
        p9 p9Var2 = new p9(context);
        this.n = p9Var2;
        p9Var2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.n, k7.c6.c(112.0f, 112));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        k7.e6.a(this.n);
        e();
        int i11 = org.telegram.ui.ActionBar.k6.ic;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(qh.f3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            this.a = MediaDataController.getInstance(i10).getGreetingsSticker();
        }
    }

    public static void a(ho hoVar) {
        AnimatorSet animatorSet = hoVar.C;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hoVar.n.setVisibility(0);
        hoVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        hoVar.C = animatorSet2;
        animatorSet2.setDuration(420L);
        hoVar.C.setInterpolator(pr.h);
        hoVar.C.addListener(new eg.u2(hoVar));
        AnimatorSet animatorSet3 = hoVar.C;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hoVar.n, (Property<p9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hoVar.n, (Property<p9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(hoVar.n, (Property<p9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(hoVar.n, (Property<p9, Float>) property4, -AndroidUtilities.dp(24.0f), 0.0f), ObjectAnimator.ofFloat(hoVar.h, (Property<p9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(hoVar.h, (Property<p9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(hoVar.h, (Property<p9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(hoVar.h, (Property<p9, Float>) property4, 0.0f, AndroidUtilities.dp(24.0f)));
        hoVar.C.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= document.attributes.size()) {
                i10 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                i11 = documentAttribute.w;
                i10 = documentAttribute.h;
                break;
            }
            i12++;
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && i11 == 0 && i10 == 0) {
            i11 = 512;
            i10 = 512;
        }
        if (i11 == 0) {
            i10 = (int) f11;
            i11 = AndroidUtilities.dp(100.0f) + i10;
        }
        int i13 = (int) ((f11 / i11) * i10);
        int i14 = (int) f11;
        float f12 = i13;
        if (f12 > f11) {
            i14 = (int) ((f11 / f12) * i14);
            i13 = i14;
        }
        float f13 = i14;
        float f14 = AndroidUtilities.density;
        int i15 = (int) (f13 / f14);
        int i16 = (int) (i13 / f14);
        Locale locale = Locale.US;
        return e2.c.h(i15, "_", i16);
    }

    public final void c(boolean z4, boolean z10, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.y == z4) {
            return;
        }
        this.y = z4;
        this.B = z10;
        if (z4) {
            if (this.v == null) {
                lj0 lj0Var = new lj0(getContext());
                this.v = lj0Var;
                lj0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.v.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.v.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(78.0f), 469762048));
                if (z10) {
                    this.v.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.v.f(R.raw.large_message_lock, 80, 80, null);
                    this.v.setOnClickListener(new g0(this, 8));
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
            textView2.setMaxWidth(qh.f3.a(textView2.getText(), this.w.getPaint()));
            TextView textView3 = this.w;
            int i10 = org.telegram.ui.ActionBar.k6.ic;
            org.telegram.ui.ActionBar.g6 g6Var = this.r;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            this.w.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.x == null) {
                fg.s0 s0Var = new fg.s0(getContext(), 4);
                this.x = s0Var;
                s0Var.setTextAlignment(4);
                this.x.setGravity(17);
                this.x.setTypeface(AndroidUtilities.bold());
                this.x.setTextSize(1, 14.0f);
                this.x.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                fg.s0 s0Var2 = this.x;
                int dp = AndroidUtilities.dp(15.0f);
                s0Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 503316480, 855638016, 855638016));
                k7.e6.a(this.x);
            }
            this.x.setText(str);
            this.x.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            this.x.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.E = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), qh.f3.a(textView.getText(), textView.getPaint())) : (int) (AndroidUtilities.displaySize.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.H) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.r;
            if (g6Var != null) {
                g6Var.l(0.0f, this.F + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.G);
            } else {
                org.telegram.ui.ActionBar.k6.q(0.0f, this.F + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.G);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.T0("paintChatActionBackground", g6Var));
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
            addView(this.b, k7.c6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, k7.c6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, k7.c6.t(112, 112, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.v, k7.c6.t(78, 78, 49, 20, 9, 20, 9));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.e).premiumFeaturesBlocked();
        addView(this.w, k7.c6.t(-2, -2, 49, 20, 0, 20, premiumFeaturesBlocked ? 13 : 9));
        if (premiumFeaturesBlocked) {
            return;
        }
        fg.s0 s0Var = this.x;
        if ((s0Var == null || TextUtils.isEmpty(s0Var.getText())) && this.B) {
            return;
        }
        addView(this.x, k7.c6.t(-2, 30, 49, 20, 2, 20, 13));
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
    public void onMeasure(int i10, int i11) {
        this.D = true;
        boolean z4 = this.E;
        TextView textView = this.c;
        if (!z4) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i11) || this.E) {
            if (!this.E) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.D = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.H = true;
    }

    public void setListener(go goVar) {
        this.d = goVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.lc, 1.0f);
        if (svgThumb != null) {
            this.h.n(ImageLocation.getForDocument(document), b(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.j(ImageLocation.getForDocument(document), b(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, 0, document2);
        }
        this.h.setOnClickListener(new eo(this, document2, 0));
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
