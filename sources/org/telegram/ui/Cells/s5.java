package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public static final Rect a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.f6 K;
    public wh.h L;
    public wh.g M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public q5 U;
    public SpannableString V;
    public SpannableString W;
    public final o5 a;
    public final n5 b;
    public final FrameLayout c;
    public final mp d;
    public final ImageView e;
    public final TextView f;
    public final p5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public boolean v;
    public r5 w;
    public boolean x;
    public int y;

    public s5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = f6Var;
        setWillNotDraw(false);
        n5 n5Var = new n5(this, context);
        this.b = n5Var;
        addView(n5Var, w7.x5.c(80.0f, 80));
        o5 o5Var = new o5(this, context);
        this.a = o5Var;
        o5Var.setBlurAllowed(true);
        n5Var.addView(o5Var, w7.x5.c(-1.0f, -1));
        p5 p5Var = new p5(context, 0);
        p5Var.b = new RectF();
        this.h = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        n5Var.addView(p5Var, w7.x5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        p5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        mp mpVar = new mp(context, 24, f6Var);
        this.d = mpVar;
        mpVar.setDrawBackgroundAsArc(7);
        mpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(mpVar, w7.x5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        mpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, w7.x5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        this.d.a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            n5 n5Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.J.setDuration(200L);
                this.J.addListener(new ah.q0(24, this, z10));
                this.J.start();
            } else {
                n5Var.setScaleX(z10 ? 0.787f : 1.0f);
                n5Var.setScaleY(z10 ? 0.787f : 1.0f);
            }
        }
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f7) {
        if (this.N != z10) {
            boolean isLaidOut = isLaidOut();
            o5 o5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(o5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.T = 0.0f;
            } else {
                Bitmap bitmap2 = this.R;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.R = null;
                }
                this.T = 1.0f;
            }
            this.N = z10;
            this.S = f7;
            o5Var.setHasBlur(z10);
            o5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J = null;
            mp mpVar = this.d;
            float f7 = mpVar.a.q ? 0.787f : 1.0f;
            n5 n5Var = this.b;
            n5Var.setScaleX(f7);
            n5Var.setScaleY(mpVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        this.v = false;
        this.G = photoEntry;
        this.r = z12;
        this.s = z13;
        boolean z15 = photoEntry.isVideo;
        ImageView imageView = this.e;
        TextView textView = this.f;
        p5 p5Var = this.h;
        o5 o5Var = this.a;
        if (z15 && !photoEntry.isLivePhoto()) {
            o5Var.q(0, true);
            p5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            p5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            p5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            o5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                o5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path == null) {
                o5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.G;
                o5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                o5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                o5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.L1(this.G.path);
        o5Var.getImageReceiver().setVisible(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        p5Var.setAlpha(z16 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(photoEntry.starsAmount, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MediaController.SearchImage searchImage) {
        o5 o5Var;
        this.v = false;
        this.H = searchImage;
        this.r = false;
        Drawable drawable = this.F ? org.telegram.ui.ActionBar.j6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        o5 o5Var2 = this.a;
        if (photoSize != null) {
            o5Var2.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
        } else {
            TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
            if (photoSize2 != null) {
                o5Var2.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            } else {
                String str = searchImage.thumbPath;
                if (str != null) {
                    o5Var2.f(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(searchImage.thumbUrl)) {
                        TLRPC.Document document = searchImage.document;
                        if (document != null) {
                            MessageObject.getDocumentVideoThumb(document);
                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(searchImage.document);
                            if (documentVideoThumb != null) {
                                o5Var2.k(ImageLocation.getForDocument(documentVideoThumb, searchImage.document), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 90), searchImage.document), "52_52", -1L, null, searchImage, 1);
                                o5Var = o5Var2;
                            } else {
                                o5Var = o5Var2;
                                o5Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
                            }
                        } else {
                            o5Var = o5Var2;
                            o5Var.setImageDrawable(drawable);
                        }
                        boolean L1 = PhotoViewer.L1(searchImage.getPathToAttach());
                        o5Var.getImageReceiver().setVisible(!L1, true);
                        this.d.setAlpha(!L1 ? 0.0f : 1.0f);
                        this.h.setAlpha(L1 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    ImageLocation forPath = ImageLocation.getForPath(searchImage.thumbUrl);
                    if (searchImage.type == 1 && searchImage.thumbUrl.endsWith("mp4")) {
                        forPath.imageType = 2;
                    }
                    o5Var2.h(forPath, null, drawable, searchImage);
                }
            }
        }
        o5Var = o5Var2;
        boolean L12 = PhotoViewer.L1(searchImage.getPathToAttach());
        o5Var.getImageReceiver().setVisible(!L12, true);
        this.d.setAlpha(!L12 ? 0.0f : 1.0f);
        this.h.setAlpha(L12 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j3 == this.P) {
            return;
        }
        this.P = j3;
        this.Q = z10;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                nq nqVar = new nq(R.drawable.star_small_inner, 0);
                nqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    nq nqVar2 = new nq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        o5 o5Var = this.a;
        o5Var.setBlurredText(spannableStringBuilder);
        o5Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z10) {
        mp mpVar = this.d;
        if (z10 && mpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || mpVar.getAlpha() != 0.0f) {
            AnimatorSet animatorSet = this.n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.n.setDuration(180L);
            AnimatorSet animatorSet3 = this.n;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            p5 p5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property, fArr), ObjectAnimator.ofFloat(mpVar, (Property<mp, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new org.telegram.ui.s0(this, 11));
            this.n.start();
        }
    }

    public mp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.x9 getImageView() {
        return this.a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        o5 o5Var;
        n5 n5Var = this.b;
        if (n5Var == null || (o5Var = this.a) == null || o5Var.getMeasuredHeight() <= 0 || o5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.M == null) {
                this.M = wh.g.e(n5Var);
            }
        } else {
            wh.g gVar = this.M;
            if (gVar != null) {
                gVar.b(this);
                this.M = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wh.g gVar = this.M;
        if (gVar != null) {
            if (gVar.i) {
                this.M = wh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.a.q;
        o5 o5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && o5Var.getImageReceiver().hasNotThumb() && o5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry == null || !photoEntry.isLivePhoto()) {
            MediaController.PhotoEntry photoEntry2 = this.G;
            if (photoEntry2 == null || !photoEntry2.isVideo) {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            } else {
                StringBuilder sb3 = new StringBuilder();
                wl.l(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.G.duration));
                sb2.append(sb3.toString());
            }
        } else {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        }
        if (this.G != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.G.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.y, TLObject.FLAG_30), wl.C(2.0f, this.y, TLObject.FLAG_30));
            return;
        }
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.c;
        Rect rect = a0;
        frameLayout.getHitRect(rect);
        boolean z10 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = true;
                invalidate();
                return z10 ? super.onTouchEvent(motionEvent) : z10;
            }
        } else if (this.v) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.v = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.w.c(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.v = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = false;
                invalidate();
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(r5 r5Var) {
        this.w = r5Var;
    }

    public void setFastScrollDelegate(q5 q5Var) {
        this.U = q5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11 = z10 && a();
        if (this.O != z11) {
            this.O = z11;
            MediaController.PhotoEntry photoEntry = this.G;
            if (photoEntry != null) {
                boolean z12 = photoEntry.isVideo;
                ImageView imageView = this.e;
                p5 p5Var = this.h;
                TextView textView = this.f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.a.q(0, true);
                    p5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                    return;
                }
                if (!this.G.isHighQuality()) {
                    imageView.setVisibility(8);
                    p5Var.setVisibility(4);
                } else {
                    p5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i11 = this.y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        mp mpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) mpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        mpVar.setDrawBackgroundAsArc(6);
        this.x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
