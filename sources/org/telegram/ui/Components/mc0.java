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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mc0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public mc0(Context context) {
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
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, android.widget.EditText, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, yf.b] */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        o9 o9Var;
        int i9;
        int i10;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                o9 o9Var2 = new o9(getContext());
                o9Var2.setLayerNum(12);
                o9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = o9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    if (z11) {
                        imageReceiver.setDelegate(new g2(25));
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                if ((2 & mediaEntity.subType) != 0) {
                    o9Var2.setScaleX(-1.0f);
                }
                mediaEntity.view = o9Var2;
                o9Var = o9Var2;
            } else if (b10 == 1) {
                ?? lc0Var = new lc0(getContext());
                lc0Var.setBackgroundColor(0);
                lc0Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                lc0Var.setTextSize(0, mediaEntity.fontSize);
                lc0Var.setTypeface(mediaEntity.textTypeface.d());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, lc0Var.getPaint().getFontMetricsInt(), false));
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                    i12++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    t5 t5Var = new t5(emojiEntity2.document_id, lc0Var.getPaint().getFontMetricsInt());
                    int i13 = emojiEntity2.offset;
                    spannableString.setSpan(t5Var, i13, emojiEntity2.length + i13, 33);
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                lc0Var.setText(spannableString);
                int i14 = 17;
                lc0Var.setGravity(17);
                int i15 = mediaEntity.textAlign;
                if (i15 != 1) {
                    i9 = 2;
                    i14 = i15 != 2 ? 19 : 21;
                } else {
                    i9 = 2;
                }
                lc0Var.setGravity(i14);
                int i16 = Build.VERSION.SDK_INT;
                int i17 = mediaEntity.textAlign;
                if (i17 != 1) {
                    int i18 = 3;
                    if (i17 == i9 ? LocaleController.isRTL : !LocaleController.isRTL) {
                        i18 = 2;
                    }
                    i10 = i18;
                } else {
                    i10 = 4;
                }
                lc0Var.setTextAlignment(i10);
                lc0Var.setHorizontallyScrolling(false);
                lc0Var.setImeOptions(TLObject.FLAG_28);
                lc0Var.setFocusableInTouchMode(true);
                lc0Var.setEnabled(false);
                lc0Var.setInputType(lc0Var.getInputType() | 16384);
                if (i16 >= 23) {
                    lc0Var.setBreakStrategy(0);
                }
                lc0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int i19 = mediaEntity.color;
                byte b11 = mediaEntity.subType;
                if (b11 == 0) {
                    lc0Var.setFrameColor(i19);
                    i19 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                } else if (b11 == 1) {
                    lc0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i19) >= 0.25f ? -1728053248 : -1711276033);
                } else if (b11 == 2) {
                    lc0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i19) >= 0.25f ? -16777216 : -1);
                } else {
                    lc0Var.setFrameColor(0);
                }
                lc0Var.setTextColor(i19);
                lc0Var.setCursorColor(i19);
                lc0Var.setHandlesColor(i19);
                lc0Var.setHighlightColor(org.telegram.ui.ActionBar.f6.l1(0.4f, i19));
                mediaEntity.view = lc0Var;
                o9Var = lc0Var;
            } else {
                o9Var = null;
            }
            if (o9Var != null) {
                addView(o9Var);
                o9Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                this.b.put(o9Var, mediaEntity);
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.e) {
            return super.drawChild(canvas, view, j10);
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
        float f10 = 1.0f / max;
        canvas.scale(f10, f10);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.b.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof yf.b) {
                        if (mediaEntity.customTextView) {
                            i13 = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.x) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * mediaEntity.x);
                        i14 = (int) (measuredHeight2 * mediaEntity.y);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.b.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof yf.b) {
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f10));
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
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
