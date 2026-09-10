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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public static final Rect a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.f6 K;
    public uh.h L;
    public uh.g M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public r5 U;
    public SpannableString V;
    public SpannableString W;
    public final p5 a;
    public final o5 b;
    public final FrameLayout c;
    public final tp d;
    public final ImageView e;
    public final TextView f;
    public final q5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public boolean v;
    public s5 w;
    public boolean x;
    public int y;

    public t5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = f6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.b = o5Var;
        addView(o5Var, w7.a6.c(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, w7.a6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, w7.a6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, w7.a6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        tp tpVar = new tp(context, 24, f6Var);
        this.d = tpVar;
        tpVar.setDrawBackgroundAsArc(7);
        tpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(tpVar, w7.a6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        tpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, w7.a6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
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
            o5 o5Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.J.setDuration(200L);
                this.J.addListener(new ai.e(19, this, z10));
                this.J.start();
            } else {
                o5Var.setScaleX(z10 ? 0.787f : 1.0f);
                o5Var.setScaleY(z10 ? 0.787f : 1.0f);
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
            p5 p5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(p5Var);
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
            p5Var.setHasBlur(z10);
            p5Var.invalidate();
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
            tp tpVar = this.d;
            float f7 = tpVar.a.q ? 0.787f : 1.0f;
            o5 o5Var = this.b;
            o5Var.setScaleX(f7);
            o5Var.setScaleY(tpVar.a.q ? 0.787f : 1.0f);
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
        q5 q5Var = this.h;
        p5 p5Var = this.a;
        if (z15 && !photoEntry.isLivePhoto()) {
            p5Var.q(0, true);
            q5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path == null) {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.G;
                p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                p5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                p5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.L1(this.G.path);
        p5Var.getImageReceiver().setVisible(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        q5Var.setAlpha(z16 ? 0.0f : 1.0f);
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
        p5 p5Var;
        this.v = false;
        this.H = searchImage;
        this.r = false;
        Drawable drawable = this.F ? org.telegram.ui.ActionBar.j6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        p5 p5Var2 = this.a;
        if (photoSize != null) {
            p5Var2.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
        } else {
            TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
            if (photoSize2 != null) {
                p5Var2.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            } else {
                String str = searchImage.thumbPath;
                if (str != null) {
                    p5Var2.f(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(searchImage.thumbUrl)) {
                        TLRPC.Document document = searchImage.document;
                        if (document != null) {
                            MessageObject.getDocumentVideoThumb(document);
                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(searchImage.document);
                            if (documentVideoThumb != null) {
                                p5Var2.k(ImageLocation.getForDocument(documentVideoThumb, searchImage.document), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 90), searchImage.document), "52_52", -1L, null, searchImage, 1);
                                p5Var = p5Var2;
                            } else {
                                p5Var = p5Var2;
                                p5Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
                            }
                        } else {
                            p5Var = p5Var2;
                            p5Var.setImageDrawable(drawable);
                        }
                        boolean L1 = PhotoViewer.L1(searchImage.getPathToAttach());
                        p5Var.getImageReceiver().setVisible(!L1, true);
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
                    p5Var2.h(forPath, null, drawable, searchImage);
                }
            }
        }
        p5Var = p5Var2;
        boolean L12 = PhotoViewer.L1(searchImage.getPathToAttach());
        p5Var.getImageReceiver().setVisible(!L12, true);
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
                uq uqVar = new uq(R.drawable.star_small_inner, 0);
                uqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    uq uqVar2 = new uq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(uqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        p5 p5Var = this.a;
        p5Var.setBlurredText(spannableStringBuilder);
        p5Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z10) {
        tp tpVar = this.d;
        if (z10 && tpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || tpVar.getAlpha() != 0.0f) {
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
            q5 q5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(q5Var, (Property<q5, Float>) property, fArr), ObjectAnimator.ofFloat(tpVar, (Property<tp, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new bi.h(this, 28));
            this.n.start();
        }
    }

    public tp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.w9 getImageView() {
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
        p5 p5Var;
        o5 o5Var = this.b;
        if (o5Var == null || (p5Var = this.a) == null || p5Var.getMeasuredHeight() <= 0 || p5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.M == null) {
                this.M = uh.g.e(o5Var);
            }
        } else {
            uh.g gVar = this.M;
            if (gVar != null) {
                gVar.b(this);
                this.M = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        uh.g gVar = this.M;
        if (gVar != null) {
            if (gVar.i) {
                this.M = uh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.a.q;
        p5 p5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
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
                em.l(R.string.AttachVideo, ", ", sb3);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.y, TLObject.FLAG_30), em.C(2.0f, this.y, TLObject.FLAG_30));
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
                this.w.a(this);
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

    public void setDelegate(s5 s5Var) {
        this.w = s5Var;
    }

    public void setFastScrollDelegate(r5 r5Var) {
        this.U = r5Var;
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
                q5 q5Var = this.h;
                TextView textView = this.f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.a.q(0, true);
                    q5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                    return;
                }
                if (!this.G.isHighQuality()) {
                    imageView.setVisibility(8);
                    q5Var.setVisibility(4);
                } else {
                    q5Var.setVisibility(0);
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
        tp tpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) tpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        tpVar.setDrawBackgroundAsArc(6);
        this.x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
