package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import cg.t0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i10 = convertVideoParams.resultWidth;
            this.W = i10;
            int i11 = convertVideoParams.resultHeight;
            this.H = i11;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i10 * 0.125f, i11 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i12);
                byte b10 = mediaEntity.type;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(mediaEntity);
                } else if (b10 == 1) {
                    initTextEntity(mediaEntity);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i10) {
            if (bitmap == null || mediaEntity == null) {
                return;
            }
            if (mediaEntity.roundRadius == 0.0f && i10 == 0) {
                return;
            }
            if (mediaEntity.roundRadiusCanvas == null) {
                mediaEntity.roundRadiusCanvas = new Canvas(bitmap);
            }
            if (mediaEntity.roundRadius != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                mediaEntity.roundRadiusCanvas.drawPath(this.path, this.xRefPaint);
            }
            if (i10 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i10);
                mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i10, long j10) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j11;
            RLottieNative rLottieNative = mediaEntity.lottieNative;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                    return;
                }
                rLottieNative.c((int) mediaEntity.currentFrame, bitmap, true);
                Bitmap bitmap2 = mediaEntity.bitmap;
                if ((mediaEntity.subType & 8) == 0) {
                    i10 = 0;
                }
                applyRoundRadius(mediaEntity, bitmap2, i10);
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f10;
                if (f10 >= mediaEntity.lottieNative.a[0]) {
                    mediaEntity.currentFrame = 0.0f;
                    return;
                }
                return;
            }
            if (mediaEntity.animatedFileDrawable != null) {
                float f11 = mediaEntity.currentFrame;
                int i12 = (int) f11;
                float f12 = f11 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f12;
                for (int i13 = (int) f12; i12 != i13; i13--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
                v5 v5Var = mediaEntity.animatedFileDrawable.v;
                Bitmap bitmap3 = v5Var != null ? v5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, mediaEntity.matrix, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i11 < mediaEntity.entities.size()) {
                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                if (emojiEntity == null || (mediaEntity2 = emojiEntity.entity) == null) {
                    canvas2 = canvas;
                    j11 = j10;
                } else {
                    canvas2 = canvas;
                    j11 = j10;
                    drawEntity(canvas2, mediaEntity2, mediaEntity.color, j11);
                }
                i11++;
                canvas = canvas2;
                j10 = j11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            int i10;
            int i11 = (int) (mediaEntity.width * this.W);
            mediaEntity.W = i11;
            int i12 = (int) (mediaEntity.height * this.H);
            mediaEntity.H = i12;
            if (i11 > 512) {
                mediaEntity.H = (int) ((i12 / i11) * 512.0f);
                mediaEntity.W = 512;
            }
            int i13 = mediaEntity.H;
            if (i13 > 512) {
                mediaEntity.W = (int) ((mediaEntity.W / i13) * 512.0f);
                mediaEntity.H = 512;
            }
            byte b10 = mediaEntity.subType;
            if ((b10 & 1) != 0) {
                int i14 = mediaEntity.W;
                if (i14 <= 0 || (i10 = mediaEntity.H) <= 0) {
                    return;
                }
                mediaEntity.bitmap = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                mediaEntity.lottieNative = a2;
                mediaEntity.framesPerDraw = a2 != null ? a2.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                mediaEntity.looped = false;
                y5 y5Var = new y5(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                mediaEntity.animatedFileDrawable = y5Var;
                mediaEntity.framesPerDraw = y5Var.d[5] / this.fps;
                mediaEntity.currentFrame = 1.0f;
                y5Var.r(true);
                if (mediaEntity.type == 5) {
                    mediaEntity.firstSeek = true;
                }
            } else {
                String str = mediaEntity.text;
                if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
                    str = mediaEntity.segmentedPath;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (mediaEntity.type == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                mediaEntity.bitmap = decodeFile;
                if (mediaEntity.type == 2 && decodeFile != null) {
                    mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                    Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                    mediaEntity.rotation = (float) (mediaEntity.rotation - Math.toRadians(((Integer) imageOrientation.first).intValue()));
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        float f10 = mediaEntity.x;
                        float f11 = mediaEntity.width;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = mediaEntity.y;
                        float f14 = mediaEntity.height;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        mediaEntity.width = f19;
                        mediaEntity.height = f18;
                        mediaEntity.x = f12 - (f19 / 2.0f);
                        mediaEntity.y = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f20 = mediaEntity.height;
                        float f21 = f20 / width;
                        mediaEntity.y = e2.c.x(f20, f21, 2.0f, mediaEntity.y);
                        mediaEntity.height = f21;
                    } else if (width < 1.0f) {
                        float f22 = mediaEntity.width;
                        float f23 = width * f22;
                        mediaEntity.x = e2.c.x(f22, f23, 2.0f, mediaEntity.x);
                        mediaEntity.width = f23;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
            Emoji.EmojiSpan[] emojiSpanArr;
            Typeface d;
            final dg.b bVar = new dg.b(ApplicationLoader.applicationContext);
            bVar.getPaint().setAntiAlias(true);
            bVar.drawAnimatedEmojiDrawables = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            t0 t0Var = mediaEntity.textTypeface;
            if (t0Var != null && (d = t0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, mediaEntity.fontSize);
            SpannableString spannableString = new SpannableString(mediaEntity.text);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i10);
                if (emojiEntity.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    emojiEntity.entity = mediaEntity2;
                    mediaEntity2.text = emojiEntity.documentAbsolutePath;
                    mediaEntity2.subType = emojiEntity.subType;
                    u5 u5Var = new u5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.u5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f10, int i14, int i15, int i16, Paint paint) {
                            super.draw(canvas, charSequence, i12, i13, f10, i14, i15, i16, paint);
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.x;
                            float f11 = mediaEntity3.y;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f12 = mediaEntity4.height;
                            float paddingTop = (((((i16 - i14) / 2.0f) + (bVar.getPaddingTop() + i14)) / mediaEntity4.viewHeight) * f12) + f11;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f13 = (mediaEntity4.width / 2.0f) + mediaEntity4.x;
                                float f14 = (f12 / 2.0f) + mediaEntity4.y;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f13;
                                double d11 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d10) - (Math.sin(-mediaEntity.rotation) * d11))) + f13;
                                paddingTop = (((float) a2.a(-mediaEntity.rotation, d11, Math.sin(-mediaEntity.rotation) * d10)) * f15) + f14;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            int i17 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f16 = (i17 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f16;
                            float f17 = (i17 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f17;
                            mediaEntity5.x = paddingLeft - (f16 / 2.0f);
                            mediaEntity5.y = paddingTop - (f17 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i12 = emojiEntity.offset;
                    spannableString.setSpan(u5Var, i12, emojiEntity.length + i12, 33);
                }
                i10 = i11;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false);
            if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            bVar.setText(replaceEmoji);
            bVar.setTextColor(mediaEntity.color);
            int i13 = mediaEntity.textAlign;
            bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
            int i14 = Build.VERSION.SDK_INT;
            int i15 = mediaEntity.textAlign;
            bVar.setTextAlignment(i15 != 1 ? (i15 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            if (i14 >= 23) {
                setBreakStrategy(bVar);
            }
            byte b10 = mediaEntity.subType;
            if (b10 == 0) {
                bVar.setFrameColor(mediaEntity.color);
                bVar.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 2) {
                bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(mediaEntity.color);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, TLObject.FLAG_30));
            bVar.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
            mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(mediaEntity.bitmap));
            setupMatrix(mediaEntity);
        }

        private void setupMatrix(VideoEditedInfo.MediaEntity mediaEntity) {
            y5 y5Var;
            Matrix matrix = new Matrix();
            mediaEntity.matrix = matrix;
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (y5Var = mediaEntity.animatedFileDrawable) != null) {
                v5 v5Var = y5Var.v;
                bitmap = v5Var != null ? v5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.x * this.W, mediaEntity.y * this.H);
            mediaEntity.matrix.postRotate((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.y) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i10;
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i11);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(dg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i10) {
        boolean z4;
        long length;
        MediaController.VideoConvertorListener videoConvertorListener;
        int i11;
        Bitmap bitmap;
        MediaController.VideoConvertorListener videoConvertorListener2;
        int i12 = convertVideoParams.resultWidth;
        int i13 = convertVideoParams.resultHeight;
        long createEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i12, i13, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z10 = true;
        if (createEncoder == 0) {
            return true;
        }
        Bitmap bitmap2 = null;
        try {
            try {
                bitmap2 = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            try {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap2.getByteCount());
                Canvas canvas = new Canvas(bitmap2);
                FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                int ceil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * convertVideoParams.framerate);
                int i14 = 0;
                while (i14 < ceil) {
                    frameDrawer.draw(canvas, i14);
                    bitmap2.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.flip();
                    if (!writeFrame(createEncoder, allocateDirect, i12, i13)) {
                        FileLog.d("webm writeFile error at " + i14 + "/" + ceil);
                        stop(createEncoder);
                        bitmap2.recycle();
                        return z10;
                    }
                    MediaController.VideoConvertorListener videoConvertorListener3 = convertVideoParams.callback;
                    if (videoConvertorListener3 != null) {
                        try {
                            bitmap = bitmap2;
                        } catch (Exception e6) {
                            e = e6;
                            FileLog.e(e);
                            stop(createEncoder);
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            z4 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i10 > 0) {
                            }
                            videoConvertorListener = convertVideoParams.callback;
                            if (videoConvertorListener != null) {
                            }
                            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                            return z4;
                        }
                        try {
                            i11 = i12;
                            videoConvertorListener3.didWriteData(Math.min(261120L, convertVideoParams.cacheFile.length()), i14 / ceil);
                        } catch (Exception e10) {
                            e = e10;
                            bitmap2 = bitmap;
                            FileLog.e(e);
                            stop(createEncoder);
                            if (bitmap2 != null) {
                            }
                            z4 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i10 > 0) {
                            }
                            videoConvertorListener = convertVideoParams.callback;
                            if (videoConvertorListener != null) {
                            }
                            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                            return z4;
                        } catch (Throwable th3) {
                            th = th3;
                            bitmap2 = bitmap;
                            stop(createEncoder);
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            throw th;
                        }
                    } else {
                        i11 = i12;
                        bitmap = bitmap2;
                    }
                    if (i14 % 3 == 0 && (videoConvertorListener2 = convertVideoParams.callback) != null) {
                        videoConvertorListener2.checkConversionCanceled();
                    }
                    i14++;
                    bitmap2 = bitmap;
                    i12 = i11;
                    z10 = true;
                }
                stop(createEncoder);
                bitmap2.recycle();
                z4 = false;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
            stop(createEncoder);
            if (bitmap2 != null) {
            }
            z4 = true;
            length = convertVideoParams.cacheFile.length();
            if (i10 > 0) {
            }
            videoConvertorListener = convertVideoParams.callback;
            if (videoConvertorListener != null) {
            }
            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
            return z4;
        }
        length = convertVideoParams.cacheFile.length();
        if (i10 > 0 || length <= 261120) {
            videoConvertorListener = convertVideoParams.callback;
            if (videoConvertorListener != null) {
                videoConvertorListener.didWriteData(length, 1.0f);
            }
            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
            return z4;
        }
        int i15 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i15);
        convertVideoParams.cacheFile.delete();
        FileLog.d("webm encoded too much, got " + length + ", old bitrate = " + i15 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i10 - 1);
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
