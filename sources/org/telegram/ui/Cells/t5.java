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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public static final Rect T = new Rect();
    public boolean A;
    public final boolean B;
    public MediaController.PhotoEntry C;
    public MediaController.SearchImage D;
    public final Paint E;
    public AnimatorSet F;
    public final org.telegram.ui.ActionBar.b6 G;
    public dh.l H;
    public dh.k I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public Bitmap N;
    public Float O;
    public float P;
    public r5 Q;
    public SpannableString R;
    public SpannableString S;
    public final p5 a;
    public final o5 b;
    public final FrameLayout c;
    public final dp d;
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

    public t5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.B = true;
        this.E = new Paint();
        new Path();
        this.P = 1.0f;
        this.G = b6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.b = o5Var;
        addView(o5Var, g7.e6.c(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, g7.e6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, g7.e6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, g7.e6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, g7.e6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        dp dpVar = new dp(context, 24, b6Var);
        this.d = dpVar;
        dpVar.setDrawBackgroundAsArc(7);
        dpVar.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
        addView(dpVar, g7.e6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        dpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, g7.e6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i9, boolean z10, boolean z11) {
        this.d.a.f(i9, z10, z11);
        boolean z12 = false;
        if (this.x) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            o5 o5Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.F.setDuration(200L);
                this.F.addListener(new hg.b0(23, this, z10));
                this.F.start();
            } else {
                o5Var.setScaleX(z10 ? 0.787f : 1.0f);
                o5Var.setScaleY(z10 ? 0.787f : 1.0f);
            }
        }
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.J != z10) {
            boolean isLaidOut = isLaidOut();
            p5 p5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.N;
                this.N = AndroidUtilities.snapshotView(p5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.P = 0.0f;
            } else {
                Bitmap bitmap2 = this.N;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.N = null;
                }
                this.P = 1.0f;
            }
            this.J = z10;
            this.O = f10;
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
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
            dp dpVar = this.d;
            float f10 = dpVar.a.q ? 0.787f : 1.0f;
            o5 o5Var = this.b;
            o5Var.setScaleX(f10);
            o5Var.setScaleY(dpVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        this.v = false;
        this.C = photoEntry;
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
            textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
        } else if (this.C.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.C;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.f6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.f6.R4);
            } else if (photoEntry2.path == null) {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.C;
                p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                p5Var.f("thumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.f6.R4);
            } else {
                p5Var.f("vthumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.f6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.L1(this.C.path);
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
        this.D = searchImage;
        this.r = false;
        Drawable drawable = this.B ? org.telegram.ui.ActionBar.f6.R4 : getResources().getDrawable(R.drawable.nophotos);
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

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.M && j10 == this.L) {
            return;
        }
        this.L = j10;
        this.M = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.R == null) {
                this.R = new SpannableString("⭐");
                eq eqVar = new eq(R.drawable.star_small_inner, 0);
                eqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.R;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.R);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.S == null) {
                    this.S = new SpannableString("l");
                    eq eqVar2 = new eq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.S;
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.S);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
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
        dp dpVar = this.d;
        if (z10 && dpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || dpVar.getAlpha() != 0.0f) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(q5Var, (Property<q5, Float>) property, fArr), ObjectAnimator.ofFloat(dpVar, (Property<dp, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new mh.x(this, 14));
            this.n.start();
        }
    }

    public dp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.C;
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
            if (this.I == null) {
                this.I = dh.k.e(o5Var);
            }
        } else {
            dh.k kVar = this.I;
            if (kVar != null) {
                kVar.b(this);
                this.I = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dh.k kVar = this.I;
        if (kVar != null) {
            if (kVar.i) {
                this.I = dh.k.e(this);
            } else {
                kVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dh.k kVar = this.I;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.a.q;
        p5 p5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.C) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.D) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.X9, this.G);
        Paint paint = this.E;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry == null || !photoEntry.isLivePhoto()) {
            MediaController.PhotoEntry photoEntry2 = this.C;
            if (photoEntry2 == null || !photoEntry2.isVideo) {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            } else {
                StringBuilder sb3 = new StringBuilder();
                j2.k(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.C.duration));
                sb2.append(sb3.toString());
            }
        } else {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        }
        if (this.C != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.C.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.y, TLObject.FLAG_30), ll.C(2.0f, this.y, TLObject.FLAG_30));
            return;
        }
        if (this.A) {
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
        Rect rect = T;
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
                this.w.d(this);
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
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (i9 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    public void setDelegate(s5 s5Var) {
        this.w = s5Var;
    }

    public void setFastScrollDelegate(r5 r5Var) {
        this.Q = r5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11 = z10 && a();
        if (this.K != z11) {
            this.K = z11;
            MediaController.PhotoEntry photoEntry = this.C;
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
                    textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
                    return;
                }
                if (!this.C.isHighQuality()) {
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
        this.A = z10;
    }

    public void setItemSize(int i9) {
        this.y = i9;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i10 = this.y;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        dp dpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        dpVar.setDrawBackgroundAsArc(6);
        this.x = true;
    }

    public void setNum(int i9) {
        this.d.setNum(i9);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
