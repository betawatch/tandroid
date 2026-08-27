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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public static final Rect T = new Rect();
    public boolean A;
    public final boolean B;
    public MediaController.PhotoEntry C;
    public MediaController.SearchImage D;
    public final Paint E;
    public AnimatorSet F;
    public final org.telegram.ui.ActionBar.c6 G;
    public eh.k H;
    public eh.j I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public Bitmap N;
    public Float O;
    public float P;
    public o5 Q;
    public SpannableString R;
    public SpannableString S;
    public final m5 a;
    public final l5 b;
    public final FrameLayout c;
    public final bp d;
    public final ImageView e;
    public final TextView f;
    public final n5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public boolean v;
    public p5 w;
    public boolean x;
    public int y;

    public q5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.B = true;
        this.E = new Paint();
        new Path();
        this.P = 1.0f;
        this.G = c6Var;
        setWillNotDraw(false);
        l5 l5Var = new l5(this, context);
        this.b = l5Var;
        addView(l5Var, h7.z5.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.a = m5Var;
        m5Var.setBlurAllowed(true);
        l5Var.addView(m5Var, h7.z5.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        l5Var.addView(n5Var, h7.z5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, h7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, h7.z5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        bp bpVar = new bp(context, 24, c6Var);
        this.d = bpVar;
        bpVar.setDrawBackgroundAsArc(7);
        bpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        addView(bpVar, h7.z5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        bpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, h7.z5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        this.d.a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.x) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            l5 l5Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(l5Var, (Property<l5, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.F.setDuration(200L);
                this.F.addListener(new ag.x(24, this, z10));
                this.F.start();
            } else {
                l5Var.setScaleX(z10 ? 0.787f : 1.0f);
                l5Var.setScaleY(z10 ? 0.787f : 1.0f);
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
            m5 m5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.N;
                this.N = AndroidUtilities.snapshotView(m5Var);
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
            m5Var.setHasBlur(z10);
            m5Var.invalidate();
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
            bp bpVar = this.d;
            float f10 = bpVar.a.q ? 0.787f : 1.0f;
            l5 l5Var = this.b;
            l5Var.setScaleX(f10);
            l5Var.setScaleY(bpVar.a.q ? 0.787f : 1.0f);
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
        n5 n5Var = this.h;
        m5 m5Var = this.a;
        if (z15 && !photoEntry.isLivePhoto()) {
            m5Var.q(0, true);
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
        } else if (this.C.isHighQuality() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.C;
        String str = photoEntry2.coverPath;
        if (str != null) {
            m5Var.f(str, null, org.telegram.ui.ActionBar.g6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                m5Var.f(str2, null, org.telegram.ui.ActionBar.g6.R4);
            } else if (photoEntry2.path == null) {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.C;
                m5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                m5Var.f("thumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                m5Var.f("vthumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.L1(this.C.path);
        m5Var.getImageReceiver().setVisible(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        n5Var.setAlpha(z16 ? 0.0f : 1.0f);
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
        m5 m5Var;
        this.v = false;
        this.D = searchImage;
        this.r = false;
        Drawable drawable = this.B ? org.telegram.ui.ActionBar.g6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        m5 m5Var2 = this.a;
        if (photoSize != null) {
            m5Var2.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
        } else {
            TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
            if (photoSize2 != null) {
                m5Var2.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            } else {
                String str = searchImage.thumbPath;
                if (str != null) {
                    m5Var2.f(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(searchImage.thumbUrl)) {
                        TLRPC.Document document = searchImage.document;
                        if (document != null) {
                            MessageObject.getDocumentVideoThumb(document);
                            TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(searchImage.document);
                            if (documentVideoThumb != null) {
                                m5Var2.k(ImageLocation.getForDocument(documentVideoThumb, searchImage.document), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 90), searchImage.document), "52_52", -1L, null, searchImage, 1);
                                m5Var = m5Var2;
                            } else {
                                m5Var = m5Var2;
                                m5Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
                            }
                        } else {
                            m5Var = m5Var2;
                            m5Var.setImageDrawable(drawable);
                        }
                        boolean L1 = PhotoViewer.L1(searchImage.getPathToAttach());
                        m5Var.getImageReceiver().setVisible(!L1, true);
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
                    m5Var2.h(forPath, null, drawable, searchImage);
                }
            }
        }
        m5Var = m5Var2;
        boolean L12 = PhotoViewer.L1(searchImage.getPathToAttach());
        m5Var.getImageReceiver().setVisible(!L12, true);
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
                cq cqVar = new cq(R.drawable.star_small_inner, 0);
                cqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.R;
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.R);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.S == null) {
                    this.S = new SpannableString("l");
                    cq cqVar2 = new cq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.S;
                    spannableString2.setSpan(cqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.S);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z10) {
        bp bpVar = this.d;
        if (z10 && bpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || bpVar.getAlpha() != 0.0f) {
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
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, fArr), ObjectAnimator.ofFloat(bpVar, (Property<bp, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new lh.h9(this, 16));
            this.n.start();
        }
    }

    public bp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.n9 getImageView() {
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
        m5 m5Var;
        l5 l5Var = this.b;
        if (l5Var == null || (m5Var = this.a) == null || m5Var.getMeasuredHeight() <= 0 || m5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.I == null) {
                this.I = eh.j.e(l5Var);
            }
        } else {
            eh.j jVar = this.I;
            if (jVar != null) {
                jVar.b(this);
                this.I = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eh.j jVar = this.I;
        if (jVar != null) {
            if (jVar.i) {
                this.I = eh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eh.j jVar = this.I;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.a.q;
        m5 m5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && m5Var.getImageReceiver().hasNotThumb() && m5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.C) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.D) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X9, this.G);
        Paint paint = this.E;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
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
                rl.j(R.string.AttachVideo, ", ", sb3);
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
    public final void onMeasure(int i10, int i11) {
        if (this.x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.y, TLObject.FLAG_30), rl.B(2.0f, this.y, TLObject.FLAG_30));
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
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(p5 p5Var) {
        this.w = p5Var;
    }

    public void setFastScrollDelegate(o5 o5Var) {
        this.Q = o5Var;
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
                n5 n5Var = this.h;
                TextView textView = this.f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.a.q(0, true);
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
                    return;
                }
                if (!this.C.isHighQuality()) {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                } else {
                    n5Var.setVisibility(0);
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

    public void setItemSize(int i10) {
        this.y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i11 = this.y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        bp bpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) bpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        bpVar.setDrawBackgroundAsArc(6);
        this.x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
