package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gd0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public gd0(Context context) {
        super(context);
        this.e = true;
    }

    public final void a() {
        this.a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, android.widget.EditText, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, rg.b] */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        x9 x9Var;
        int i10;
        int i11;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                x9 x9Var2 = new x9(getContext());
                x9Var2.setLayerNum(12);
                x9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = x9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    if (z11) {
                        imageReceiver.setDelegate(new p2(20));
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                if ((2 & mediaEntity.subType) != 0) {
                    x9Var2.setScaleX(-1.0f);
                }
                mediaEntity.view = x9Var2;
                x9Var = x9Var2;
            } else if (b10 == 1) {
                ?? fd0Var = new fd0(getContext());
                fd0Var.setBackgroundColor(0);
                fd0Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                fd0Var.setTextSize(0, mediaEntity.fontSize);
                fd0Var.setTypeface(mediaEntity.textTypeface.d());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, fd0Var.getPaint().getFontMetricsInt(), false));
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i13);
                    i13++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    z5 z5Var = new z5(emojiEntity2.document_id, fd0Var.getPaint().getFontMetricsInt());
                    int i14 = emojiEntity2.offset;
                    spannableString.setSpan(z5Var, i14, emojiEntity2.length + i14, 33);
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                fd0Var.setText(spannableString);
                int i15 = 17;
                fd0Var.setGravity(17);
                int i16 = mediaEntity.textAlign;
                if (i16 != 1) {
                    i10 = 2;
                    i15 = i16 != 2 ? 19 : 21;
                } else {
                    i10 = 2;
                }
                fd0Var.setGravity(i15);
                int i17 = Build.VERSION.SDK_INT;
                int i18 = mediaEntity.textAlign;
                if (i18 != 1) {
                    int i19 = 3;
                    if (i18 == i10 ? LocaleController.isRTL : !LocaleController.isRTL) {
                        i19 = 2;
                    }
                    i11 = i19;
                } else {
                    i11 = 4;
                }
                fd0Var.setTextAlignment(i11);
                fd0Var.setHorizontallyScrolling(false);
                fd0Var.setImeOptions(TLObject.FLAG_28);
                fd0Var.setFocusableInTouchMode(true);
                fd0Var.setEnabled(false);
                fd0Var.setInputType(fd0Var.getInputType() | 16384);
                if (i17 >= 23) {
                    fd0Var.setBreakStrategy(0);
                }
                fd0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int i20 = mediaEntity.color;
                byte b11 = mediaEntity.subType;
                if (b11 == 0) {
                    fd0Var.setFrameColor(i20);
                    i20 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                } else if (b11 == 1) {
                    fd0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f ? -1728053248 : -1711276033);
                } else if (b11 == 2) {
                    fd0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f ? -16777216 : -1);
                } else {
                    fd0Var.setFrameColor(0);
                }
                fd0Var.setTextColor(i20);
                fd0Var.setCursorColor(i20);
                fd0Var.setHandlesColor(i20);
                fd0Var.setHighlightColor(org.telegram.ui.ActionBar.j6.l1(0.4f, i20));
                mediaEntity.view = fd0Var;
                x9Var = fd0Var;
            } else {
                x9Var = null;
            }
            if (x9Var != null) {
                addView(x9Var);
                x9Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                this.b.put(x9Var, mediaEntity);
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.e) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 1.0f / max;
        canvas.scale(f7, f7);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.b.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof rg.b) {
                        if (mediaEntity.customTextView) {
                            i14 = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.x) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i14 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i15 = i16 - measuredHeight;
                    } else {
                        i14 = (int) (measuredWidth * mediaEntity.x);
                        i15 = (int) (measuredHeight2 * mediaEntity.y);
                    }
                    childAt.layout(i14, i15, measuredWidth2 + i14, measuredHeight3 + i15);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.b.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof rg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = mediaEntity.customTextView ? (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth : mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), TLObject.FLAG_30));
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f7));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f7);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
