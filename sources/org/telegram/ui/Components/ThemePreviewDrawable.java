package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class ThemePreviewDrawable extends BitmapDrawable {
    private DocumentObject.ThemeDocument themeDocument;

    public ThemePreviewDrawable(File file, DocumentObject.ThemeDocument themeDocument) {
        super(createPreview(file, themeDocument));
        this.themeDocument = themeDocument;
    }

    private static Bitmap createPreview(File file, DocumentObject.ThemeDocument themeDocument) {
        int i;
        int i2;
        BitmapDrawable createDitheredGradientBitmapDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        boolean z;
        Bitmap bitmap;
        Bitmap decodeFile;
        int i3;
        new RectF();
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SparseIntArray themeFileValues = Theme.getThemeFileValues(null, themeDocument.baseTheme.assetName, null);
        final SparseIntArray clone = themeFileValues.clone();
        themeDocument.accent.fillAccentColors(themeFileValues, clone);
        int previewColor = Theme.getPreviewColor(clone, Theme.key_actionBarDefault);
        int previewColor2 = Theme.getPreviewColor(clone, Theme.key_actionBarDefaultIcon);
        int previewColor3 = Theme.getPreviewColor(clone, Theme.key_chat_messagePanelBackground);
        int previewColor4 = Theme.getPreviewColor(clone, Theme.key_chat_messagePanelIcons);
        int previewColor5 = Theme.getPreviewColor(clone, Theme.key_chat_inBubble);
        int previewColor6 = Theme.getPreviewColor(clone, Theme.key_chat_outBubble);
        int i4 = clone.get(Theme.key_chat_wallpaper);
        int i5 = clone.get(Theme.key_chat_wallpaper_gradient_to1);
        int i6 = clone.get(Theme.key_chat_wallpaper_gradient_to2);
        int i7 = clone.get(Theme.key_chat_wallpaper_gradient_to3);
        int i8 = clone.get(Theme.key_chat_wallpaper_gradient_rotation);
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        Theme.setDrawableColor(mutate, previewColor2);
        Drawable mutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        Theme.setDrawableColor(mutate2, previewColor2);
        Drawable mutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        Theme.setDrawableColor(mutate3, previewColor4);
        Drawable mutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        Theme.setDrawableColor(mutate4, previewColor4);
        int i9 = 2;
        MessageDrawable[] messageDrawableArr = new MessageDrawable[2];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            Drawable drawable = mutate;
            int i11 = previewColor5;
            MessageDrawable messageDrawable = new MessageDrawable(2, i10 == 1, false) { // from class: org.telegram.ui.Components.ThemePreviewDrawable.1
                @Override // org.telegram.ui.ActionBar.MessageDrawable
                protected int getColor(int i12) {
                    return clone.get(i12);
                }

                @Override // org.telegram.ui.ActionBar.MessageDrawable
                protected int getCurrentColor(int i12) {
                    return clone.get(i12);
                }
            };
            messageDrawableArr[i10] = messageDrawable;
            Theme.setDrawableColor(messageDrawable, i10 == 1 ? previewColor6 : i11);
            i10++;
            previewColor5 = i11;
            mutate = drawable;
            i9 = 2;
        }
        Drawable drawable2 = mutate;
        if (i6 != 0) {
            i = i4;
            i2 = i5;
            motionBackgroundDrawable = new MotionBackgroundDrawable(i4, i5, i6, i7, true);
            createDitheredGradientBitmapDrawable = null;
        } else {
            i = i4;
            i2 = i5;
            createDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i8, new int[]{i, i2}, createBitmap.getWidth(), createBitmap.getHeight() - 120);
            motionBackgroundDrawable = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i, i2));
        if (createDitheredGradientBitmapDrawable != null) {
            z = false;
            createDitheredGradientBitmapDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
            createDitheredGradientBitmapDrawable.draw(canvas);
        } else {
            z = false;
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(themeDocument.mime_type)) {
                decodeFile = SvgHelper.getBitmap(file, 560, 678, z);
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                float f = options.outWidth;
                float f2 = options.outHeight;
                float f3 = 560;
                float f4 = 678;
                float min = Math.min(f / f3, f2 / f4);
                if (min < 1.2f) {
                    min = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (min > 1.0f && (f > f3 || f2 > f4)) {
                    int i12 = 1;
                    while (true) {
                        i3 = i12 * 2;
                        if (i12 * 4 >= min) {
                            break;
                        }
                        i12 = i3;
                    }
                    options.inSampleSize = i3;
                } else {
                    options.inSampleSize = (int) min;
                }
                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap = decodeFile;
            if (bitmap != null) {
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setPatternBitmap((int) (themeDocument.accent.patternIntensity * 100.0f), bitmap);
                    motionBackgroundDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
                    motionBackgroundDrawable.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (themeDocument.accent.patternIntensity >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(NotificationCenter.didReceiveSmsCode);
                    float max = Math.max(560 / bitmap.getWidth(), 678 / bitmap.getHeight());
                    int width = (int) (bitmap.getWidth() * max);
                    canvas.save();
                    canvas.translate((560 - width) / 2, (678 - ((int) (bitmap.getHeight() * max))) / 2);
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
        } else {
            bitmap = null;
        }
        if (bitmap == null && motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBounds(0, 120, createBitmap.getWidth(), createBitmap.getHeight() - 120);
            motionBackgroundDrawable.draw(canvas);
        }
        paint.setColor(previewColor);
        canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), 120.0f, paint);
        if (drawable2 != null) {
            int intrinsicHeight = (120 - drawable2.getIntrinsicHeight()) / 2;
            drawable2.setBounds(13, intrinsicHeight, drawable2.getIntrinsicWidth() + 13, drawable2.getIntrinsicHeight() + intrinsicHeight);
            drawable2.draw(canvas);
        }
        if (mutate2 != null) {
            int width2 = (createBitmap.getWidth() - mutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
            mutate2.setBounds(width2, intrinsicHeight2, mutate2.getIntrinsicWidth() + width2, mutate2.getIntrinsicHeight() + intrinsicHeight2);
            mutate2.draw(canvas);
        }
        messageDrawableArr[1].setBounds(NotificationCenter.albumsDidLoad, NotificationCenter.premiumFloodWaitReceived, createBitmap.getWidth() - 20, NotificationCenter.premiumStatusChangedGlobal);
        messageDrawableArr[1].setTop(0, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[1].setBounds(NotificationCenter.albumsDidLoad, 430, createBitmap.getWidth() - 20, 522);
        messageDrawableArr[1].setTop(430, 560, 522, false, false);
        messageDrawableArr[1].draw(canvas);
        messageDrawableArr[0].setBounds(20, NotificationCenter.storyDeleted, 399, 415);
        messageDrawableArr[0].setTop(NotificationCenter.storyDeleted, 560, 522, false, false);
        messageDrawableArr[0].draw(canvas);
        paint.setColor(previewColor3);
        canvas.drawRect(0.0f, createBitmap.getHeight() - 120, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        if (mutate3 != null) {
            int height = (createBitmap.getHeight() - 120) + ((120 - mutate3.getIntrinsicHeight()) / 2);
            mutate3.setBounds(22, height, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + height);
            mutate3.draw(canvas);
        }
        if (mutate4 != null) {
            int width3 = (createBitmap.getWidth() - mutate4.getIntrinsicWidth()) - 22;
            int height2 = (createBitmap.getHeight() - 120) + ((120 - mutate4.getIntrinsicHeight()) / 2);
            mutate4.setBounds(width3, height2, mutate4.getIntrinsicWidth() + width3, mutate4.getIntrinsicHeight() + height2);
            mutate4.draw(canvas);
        }
        return createBitmap;
    }
}
