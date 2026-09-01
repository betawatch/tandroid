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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public static final Rect U = new Rect();
    public boolean B;
    public final boolean C;
    public MediaController.PhotoEntry D;
    public MediaController.SearchImage E;
    public final Paint F;
    public AnimatorSet G;
    public final org.telegram.ui.ActionBar.g6 H;
    public jh.k I;
    public jh.j J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public Bitmap O;
    public Float P;
    public float Q;
    public r5 R;
    public SpannableString S;
    public SpannableString T;
    public final p5 a;
    public final o5 b;
    public final FrameLayout c;
    public final np d;
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

    public t5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.C = true;
        this.F = new Paint();
        new Path();
        this.Q = 1.0f;
        this.H = g6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.b = o5Var;
        addView(o5Var, k7.c6.c(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, k7.c6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, k7.c6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, k7.c6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, k7.c6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        np npVar = new np(context, 24, g6Var);
        this.d = npVar;
        npVar.setDrawBackgroundAsArc(7);
        npVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        addView(npVar, k7.c6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, k7.c6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i10, boolean z4, boolean z10) {
        this.d.a.f(i10, z4, z10);
        boolean z11 = false;
        if (this.x) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            o5 o5Var = this.b;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_X, z4 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(o5Var, (Property<o5, Float>) View.SCALE_Y, z4 ? 0.787f : 1.0f));
                this.G.setDuration(200L);
                this.G.addListener(new eg.u2(13, this, z4));
                this.G.start();
            } else {
                o5Var.setScaleX(z4 ? 0.787f : 1.0f);
                o5Var.setScaleY(z4 ? 0.787f : 1.0f);
            }
        }
        MediaController.PhotoEntry photoEntry = this.D;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z11 = true;
        }
        setHighQuality(z11);
    }

    public final void c(boolean z4, Float f10) {
        if (this.K != z4) {
            boolean isLaidOut = isLaidOut();
            p5 p5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.O;
                this.O = AndroidUtilities.snapshotView(p5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.Q = 0.0f;
            } else {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.O = null;
                }
                this.Q = 1.0f;
            }
            this.K = z4;
            this.P = f10;
            p5Var.setHasBlur(z4);
            p5Var.invalidate();
            if (z4) {
                h(z4);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
            np npVar = this.d;
            float f10 = npVar.a.q ? 0.787f : 1.0f;
            o5 o5Var = this.b;
            o5Var.setScaleX(f10);
            o5Var.setScaleY(npVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z4, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        this.v = false;
        this.D = photoEntry;
        this.r = z11;
        this.s = z12;
        boolean z14 = photoEntry.isVideo;
        ImageView imageView = this.e;
        TextView textView = this.f;
        q5 q5Var = this.h;
        p5 p5Var = this.a;
        if (z14 && !photoEntry.isLivePhoto()) {
            p5Var.q(0, true);
            q5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.D.duration));
        } else if (this.D.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.D;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else if (photoEntry2.path == null) {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.D;
                p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                p5Var.f("thumb://" + this.D.imageId + ":" + this.D.path, null, org.telegram.ui.ActionBar.k6.R4);
            } else {
                p5Var.f("vthumb://" + this.D.imageId + ":" + this.D.path, null, org.telegram.ui.ActionBar.k6.R4);
            }
        }
        boolean z15 = z10 && PhotoViewer.L1(this.D.path);
        p5Var.getImageReceiver().setVisible(!z15, true);
        this.d.setAlpha(z15 ? 0.0f : 1.0f);
        q5Var.setAlpha(z15 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z13 = true;
        }
        setHighQuality(z13);
        f(photoEntry.starsAmount, z4);
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
        this.E = searchImage;
        this.r = false;
        Drawable drawable = this.C ? org.telegram.ui.ActionBar.k6.R4 : getResources().getDrawable(R.drawable.nophotos);
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

    public final void f(long j10, boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        if (z4 == this.N && j10 == this.M) {
            return;
        }
        this.M = j10;
        this.N = z4;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.S == null) {
                this.S = new SpannableString("⭐");
                oq oqVar = new oq(R.drawable.star_small_inner, 0);
                oqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.S;
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.S);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z4) {
                if (this.T == null) {
                    this.T = new SpannableString("l");
                    oq oqVar2 = new oq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.T;
                    spannableString2.setSpan(oqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.T);
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

    public final void g(boolean z4) {
        np npVar = this.d;
        if (z4 && npVar.getAlpha() == 1.0f) {
            return;
        }
        if (z4 || npVar.getAlpha() != 0.0f) {
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
            float[] fArr = {z4 ? 1.0f : 0.0f};
            q5 q5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(q5Var, (Property<q5, Float>) property, fArr), ObjectAnimator.ofFloat(npVar, (Property<np, Float>) property, z4 ? 1.0f : 0.0f));
            this.n.addListener(new org.telegram.ui.s5(this, 7));
            this.n.start();
        }
    }

    public np getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.D;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z4) {
        p5 p5Var;
        o5 o5Var = this.b;
        if (o5Var == null || (p5Var = this.a) == null || p5Var.getMeasuredHeight() <= 0 || p5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z4) {
            if (this.J == null) {
                this.J = jh.j.e(o5Var);
            }
        } else {
            jh.j jVar = this.J;
            if (jVar != null) {
                jVar.b(this);
                this.J = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jh.j jVar = this.J;
        if (jVar != null) {
            if (jVar.i) {
                this.J = jh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jh.j jVar = this.J;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z4 = this.d.a.q;
        p5 p5Var = this.a;
        if (!z4 && this.b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.D) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.E) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.X9, this.H);
        Paint paint = this.F;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.D;
        if (photoEntry == null || !photoEntry.isLivePhoto()) {
            MediaController.PhotoEntry photoEntry2 = this.D;
            if (photoEntry2 == null || !photoEntry2.isVideo) {
                sb.append(LocaleController.getString(R.string.AttachPhoto));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(this.D.duration));
                sb.append(sb2.toString());
            }
        } else {
            sb.append(LocaleController.getString(R.string.AttachLivePhoto));
        }
        if (this.D != null) {
            sb.append(". ");
            sb.append(LocaleController.getInstance().getFormatterStats().format(this.D.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.y, TLObject.FLAG_30), org.telegram.ui.b.B(2.0f, this.y, TLObject.FLAG_30));
            return;
        }
        if (this.B) {
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
        Rect rect = U;
        frameLayout.getHitRect(rect);
        boolean z4 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = true;
                invalidate();
                return z4 ? super.onTouchEvent(motionEvent) : z4;
            }
        } else if (this.v) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.v = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.w.b(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.v = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.v = false;
                invalidate();
            }
        }
        z4 = false;
        if (z4) {
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
        this.R = r5Var;
    }

    public void setHasSpoiler(boolean z4) {
        c(z4, null);
    }

    public void setHighQuality(boolean z4) {
        boolean z10 = z4 && a();
        if (this.L != z10) {
            this.L = z10;
            MediaController.PhotoEntry photoEntry = this.D;
            if (photoEntry != null) {
                boolean z11 = photoEntry.isVideo;
                ImageView imageView = this.e;
                q5 q5Var = this.h;
                TextView textView = this.f;
                if (z11 && !photoEntry.isLivePhoto()) {
                    this.a.q(0, true);
                    q5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.D.duration));
                    return;
                }
                if (!this.D.isHighQuality()) {
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

    public void setIsVertical(boolean z4) {
        this.B = z4;
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
        np npVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) npVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        npVar.setDrawBackgroundAsArc(6);
        this.x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
