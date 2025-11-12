package org.telegram.ui.Stories;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;

/* loaded from: classes5.dex */
public abstract class StoriesUtilities {
    public static GradientTools closeFriendsGradientTools;
    public static GradientTools errorGradientTools;
    public static Drawable expiredStoryDrawable;
    public static int grayLastColor;
    public static Paint grayPaint;
    public static Paint liveCutPaint;
    public static GradientTools liveGradientTools;
    public static Paint livePaint;
    public static RectF liveRect;
    public static Text liveText;
    public static int storyCellGrayLastColor;
    public static GradientTools[] storiesGradientTools = new GradientTools[2];
    public static Paint[] storyCellGreyPaint = new Paint[2];
    private static final RectF rectTmp = new RectF();
    static boolean scheduled = false;
    static int debugState = 0;
    static Runnable debugRunnable = new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities.1
        @Override // java.lang.Runnable
        public void run() {
            int abs = Math.abs(Utilities.random.nextInt() % 3);
            StoriesUtilities.debugState = abs;
            if (abs == 2) {
                StoriesUtilities.debugState = 1;
            } else {
                StoriesUtilities.debugState = 2;
            }
            NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
            AndroidUtilities.runOnUIThread(StoriesUtilities.debugRunnable, 1000L);
            LaunchActivity.getLastFragment().getFragmentView();
        }
    };
    private static final RectF forumRect = new RectF();
    private static final Path forumRoundRectPath = new Path();
    private static final Matrix forumRoundRectMatrix = new Matrix();
    private static final PathMeasure forumRoundRectPathMeasure = new PathMeasure();
    private static final Path forumSegmentPath = new Path();

    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams) {
        drawAvatarWithStory(j, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(j), avatarStoryParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void drawAvatarWithStory(long j, Canvas canvas, ImageReceiver imageReceiver, boolean z, AvatarStoryParams avatarStoryParams) {
        int predictiveUnreadState;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        float f4;
        int i5;
        float f5;
        float f6;
        int i6;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f7;
        float dp;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f8;
        float dp2;
        GradientTools gradientTools;
        float dp3;
        StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z2 = avatarStoryParams.animate;
        if (avatarStoryParams.dialogId != j) {
            avatarStoryParams.dialogId = j;
            avatarStoryParams.reset();
            z2 = false;
        }
        boolean isLoading = storiesController.isLoading(j);
        boolean z3 = ChatObject.isForum(UserConfig.selectedAccount, j) && !avatarStoryParams.isDialogStoriesCell;
        boolean hasHiddenStories = avatarStoryParams.drawHiddenStoriesAsSegments ? storiesController.hasHiddenStories() : z;
        if (avatarStoryParams.storyItem != null) {
            storiesController.getUnreadState(j, avatarStoryParams.storyId);
            isLoading = false;
        }
        if (isLoading) {
            if (storiesController.hasStories(j)) {
                predictiveUnreadState = 3;
                i = 2;
            } else {
                i = getPredictiveUnreadState(storiesController, j);
                predictiveUnreadState = 3;
            }
            z2 = false;
        } else if (hasHiddenStories) {
            if (avatarStoryParams.drawSegments) {
                predictiveUnreadState = 2;
                i = 2;
            } else {
                int unreadState = storiesController.getUnreadState(j, avatarStoryParams.storyId);
                i = unreadState;
                predictiveUnreadState = unreadState == 0 ? 2 : 1;
            }
        } else {
            predictiveUnreadState = getPredictiveUnreadState(storiesController, j);
            i = predictiveUnreadState;
        }
        int i7 = avatarStoryParams.forceState;
        if (i7 != 0) {
            predictiveUnreadState = i7;
            i2 = predictiveUnreadState;
        } else {
            i2 = i;
        }
        int i8 = avatarStoryParams.currentState;
        if (i8 != predictiveUnreadState) {
            if (i8 == 3) {
                z2 = true;
            }
            if (predictiveUnreadState == 3) {
                avatarStoryParams.animateFromUnreadState = i2;
                avatarStoryParams.progressToProgressSegments = 0.0f;
            }
            if (z2) {
                avatarStoryParams.prevState = i8;
                avatarStoryParams.prevUnreadState = avatarStoryParams.unreadState;
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 0.0f;
            } else {
                avatarStoryParams.currentState = predictiveUnreadState;
                avatarStoryParams.progressToSate = 1.0f;
            }
        }
        avatarStoryParams.unreadState = i2;
        ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
        float scale = buttonBounce != null ? buttonBounce.getScale(0.08f) : 1.0f;
        if (avatarStoryParams.showProgress != isLoading && isLoading) {
            avatarStoryParams.sweepAngle = 1.0f;
            avatarStoryParams.inc = false;
        }
        avatarStoryParams.showProgress = isLoading;
        if (avatarStoryParams.currentState == 0 && avatarStoryParams.progressToSate == 1.0f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
            imageReceiver.draw(canvas);
            return;
        }
        int save = canvas.save();
        if (scale != 1.0f) {
            canvas.scale(scale, scale, avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY());
        }
        float f9 = storiesController.hasLiveStory(avatarStoryParams.dialogId) ? avatarStoryParams.progressToSegments : 0.0f;
        float f10 = avatarStoryParams.progressToSate;
        if (f10 != 1.0f) {
            f10 = CubicBezierInterpolator.DEFAULT.getInterpolation(f10);
        }
        float f11 = f10;
        float lerp = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? AndroidUtilities.lerp(getInset(avatarStoryParams.prevState, avatarStoryParams.animateFromUnreadState), getInset(avatarStoryParams.currentState, avatarStoryParams.animateFromUnreadState), avatarStoryParams.progressToSate) : 0.0f;
        if (lerp == 0.0f) {
            imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
        } else {
            RectF rectF = rectTmp;
            rectF.set(avatarStoryParams.originalAvatarRect);
            rectF.inset(lerp, lerp);
            imageReceiver.setImageCoords(rectF);
        }
        if (f9 > 0.0f) {
            RectF rectF2 = rectTmp;
            f = f9;
            f4 = 0.08f;
            f2 = lerp;
            f3 = 1.0f;
            i3 = save;
            i4 = i2;
            canvas.saveLayerAlpha(rectF2.left - AndroidUtilities.dp(15.0f), rectF2.top - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + rectF2.right, AndroidUtilities.dp(15.0f) + rectF2.bottom, NotificationCenter.didReplacedPhotoInMemCache, 31);
        } else {
            f = f9;
            i3 = save;
            f2 = lerp;
            i4 = i2;
            f3 = 1.0f;
            f4 = 0.08f;
        }
        if ((avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f3) || avatarStoryParams.currentState == 1) {
            if (i4 == 2) {
                getCloseFriendsPaint(imageReceiver);
                gradientTools = closeFriendsGradientTools;
            } else if (i4 == 3) {
                getLivePaint(imageReceiver);
                gradientTools = liveGradientTools;
            } else {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                gradientTools = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0];
            }
            boolean z4 = avatarStoryParams.prevState == 1 && avatarStoryParams.progressToSate != f3;
            float f12 = (!avatarStoryParams.isStoryCell || avatarStoryParams.drawInside) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z4) {
                dp3 = f12 + (AndroidUtilities.dp(5.0f) * f11);
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f3 - f11)));
            } else {
                gradientTools.paint.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f11));
                dp3 = f12 + (AndroidUtilities.dp(5.0f) * (f3 - f11));
            }
            RectF rectF3 = rectTmp;
            rectF3.set(avatarStoryParams.originalAvatarRect);
            rectF3.inset(dp3, dp3);
            drawCircleInternal(canvas, imageReceiver.getParentView(), avatarStoryParams, gradientTools.paint, z3);
        }
        int i9 = avatarStoryParams.prevState;
        if ((i9 != 2 || avatarStoryParams.progressToSate == f3) && avatarStoryParams.currentState != 2) {
            i5 = 3;
            f5 = 1.0f;
        } else {
            boolean z5 = i9 == 2 && avatarStoryParams.progressToSate != f3;
            if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
                paint5 = storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint5 = grayPaint;
            }
            Paint paint9 = paint5;
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint = getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                unreadCirclePaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint closeFriendsPaint = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint livePaint2 = getLivePaint(imageReceiver);
                livePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint6 = unreadCirclePaint;
                paint8 = closeFriendsPaint;
                paint7 = livePaint2;
            } else {
                paint6 = null;
                paint7 = null;
                paint8 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf22 = AndroidUtilities.dpf2(3.5f);
                    f8 = -dpf22;
                }
                f8 = 0.0f;
            } else {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf22 = AndroidUtilities.dpf2(2.7f);
                    f8 = -dpf22;
                }
                f8 = 0.0f;
            }
            if (z5) {
                dp2 = f8 + (AndroidUtilities.dp(5.0f) * f11);
                paint9.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f3 - f11)));
            } else {
                paint9.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f11));
                dp2 = f8 + (AndroidUtilities.dp(5.0f) * (f3 - f11));
            }
            RectF rectF4 = rectTmp;
            rectF4.set(avatarStoryParams.originalAvatarRect);
            rectF4.inset(dp2, dp2);
            if (avatarStoryParams.drawSegments) {
                i5 = 3;
                f5 = 1.0f;
                drawSegmentsInternal(canvas, storiesController, imageReceiver, avatarStoryParams, paint9, paint6, paint7, paint8, z3);
            } else {
                i5 = 3;
                f5 = 1.0f;
                drawCircleInternal(canvas, imageReceiver.getParentView(), avatarStoryParams, paint9, z3);
            }
        }
        if ((avatarStoryParams.prevState == i5 && avatarStoryParams.progressToSate != f5) || avatarStoryParams.currentState == i5) {
            if (avatarStoryParams.animateFromUnreadState == 1) {
                getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                paint = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0].paint;
            } else if (avatarStoryParams.isStoryCell) {
                checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
                paint = storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0];
            } else {
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint = grayPaint;
            }
            Paint paint10 = paint;
            paint10.setAlpha((int) (f11 * 255.0f));
            if (avatarStoryParams.drawSegments) {
                Paint unreadCirclePaint2 = getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                unreadCirclePaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint closeFriendsPaint2 = getCloseFriendsPaint(imageReceiver);
                closeFriendsPaint2.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                Paint livePaint3 = getLivePaint(imageReceiver);
                livePaint3.setAlpha((int) (avatarStoryParams.alpha * 255.0f));
                checkGrayPaint(avatarStoryParams.resourcesProvider);
                paint2 = unreadCirclePaint2;
                paint4 = closeFriendsPaint2;
                paint3 = livePaint3;
            } else {
                paint2 = null;
                paint3 = null;
                paint4 = null;
            }
            if (avatarStoryParams.drawSegments) {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf2 = AndroidUtilities.dpf2(3.5f);
                    f7 = -dpf2;
                }
                f7 = 0.0f;
            } else {
                if (avatarStoryParams.isStoryCell && !avatarStoryParams.drawInside) {
                    dpf2 = AndroidUtilities.dpf2(2.7f);
                    f7 = -dpf2;
                }
                f7 = 0.0f;
            }
            if (avatarStoryParams.prevState == i5 && avatarStoryParams.progressToSate != f5) {
                dp = f7 + (AndroidUtilities.dp(7.0f) * f11);
                paint10.setAlpha((int) (avatarStoryParams.alpha * 255.0f * (f5 - f11)));
            } else {
                paint10.setAlpha((int) (avatarStoryParams.alpha * 255.0f * f11));
                dp = f7 + (AndroidUtilities.dp(5.0f) * (f5 - f11));
            }
            RectF rectF5 = rectTmp;
            rectF5.set(avatarStoryParams.originalAvatarRect);
            rectF5.inset(dp, dp);
            boolean z6 = avatarStoryParams.drawSegments;
            if (z6 && avatarStoryParams.currentState == i5) {
                float f13 = avatarStoryParams.progressToProgressSegments;
                if (f13 != f5) {
                    float f14 = f13 + f4;
                    avatarStoryParams.progressToProgressSegments = f14;
                    if (f14 > f5) {
                        avatarStoryParams.progressToProgressSegments = f5;
                    }
                    float f15 = avatarStoryParams.progressToSegments;
                    avatarStoryParams.progressToSegments = f5 - avatarStoryParams.progressToProgressSegments;
                    drawSegmentsInternal(canvas, storiesController, imageReceiver, avatarStoryParams, paint10, paint2, paint3, paint4, z3);
                    avatarStoryParams.progressToSegments = f15;
                    if (imageReceiver.getParentView() != null) {
                        imageReceiver.invalidate();
                        imageReceiver.getParentView().invalidate();
                    }
                }
            }
            if (z6) {
                int unreadState2 = storiesController.getUnreadState(avatarStoryParams.dialogId);
                if (unreadState2 == 2) {
                    paint10 = paint4;
                } else {
                    if (unreadState2 != i5) {
                        if (unreadState2 == 1) {
                            paint10 = paint2;
                        }
                        drawProgress(canvas, avatarStoryParams, imageReceiver.getParentView(), paint10);
                        imageReceiver.draw(canvas);
                        float f16 = f;
                        avatarStoryParams.drawnLive = f16 > 0.5f;
                        if (f9 > 0.0f) {
                            RectF rectF6 = rectTmp;
                            rectF6.set(avatarStoryParams.originalAvatarRect);
                            float f17 = f2;
                            rectF6.inset(f17, f17);
                            drawLive(canvas, rectF6, f16, imageReceiver.getVisible(), 0.0f);
                        }
                        f6 = avatarStoryParams.progressToSate;
                        if (f6 != f5) {
                            float f18 = f6 + (AndroidUtilities.screenRefreshTime / 250.0f);
                            avatarStoryParams.progressToSate = f18;
                            if (f18 > f5) {
                                avatarStoryParams.progressToSate = f5;
                            }
                            if (imageReceiver.getParentView() != null) {
                                imageReceiver.invalidate();
                                imageReceiver.getParentView().invalidate();
                            }
                        }
                        i6 = i3;
                        if (i6 != 0) {
                            canvas.restoreToCount(i6);
                            return;
                        }
                        return;
                    }
                    paint10 = paint3;
                }
            }
            drawProgress(canvas, avatarStoryParams, imageReceiver.getParentView(), paint10);
            imageReceiver.draw(canvas);
            float f162 = f;
            avatarStoryParams.drawnLive = f162 > 0.5f;
            if (f9 > 0.0f) {
            }
            f6 = avatarStoryParams.progressToSate;
            if (f6 != f5) {
            }
            i6 = i3;
            if (i6 != 0) {
            }
        }
        imageReceiver.draw(canvas);
        float f1622 = f;
        avatarStoryParams.drawnLive = f1622 > 0.5f;
        if (f9 > 0.0f) {
        }
        f6 = avatarStoryParams.progressToSate;
        if (f6 != f5) {
        }
        i6 = i3;
        if (i6 != 0) {
        }
    }

    public static void drawLive(Canvas canvas, RectF rectF, float f, boolean z, float f2) {
        if (liveText == null) {
            liveText = new Text(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (liveCutPaint == null) {
            Paint paint = new Paint(1);
            liveCutPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (livePaint == null) {
            livePaint = new Paint(1);
        }
        if (liveRect == null) {
            liveRect = new RectF();
        }
        livePaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_stories_circle_live2), f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f2);
        float width = liveText.getWidth() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f2);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f3 = width / 2.0f;
        float f4 = 0.8f * lerp2;
        float f5 = lerp2 * 0.2f;
        liveRect.set((rectF.centerX() - f3) - dp, (rectF.bottom - f4) - dp, rectF.centerX() + f3 + dp, rectF.bottom + f5 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f);
        canvas.scale(lerp3, lerp3, liveRect.centerX(), liveRect.centerY());
        AndroidUtilities.scaleRect(liveRect, f);
        RectF rectF2 = liveRect;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, liveRect.height() / 2.0f, liveCutPaint);
        if (z) {
            liveRect.set(rectF.centerX() - f3, rectF.bottom - f4, rectF.centerX() + f3, rectF.bottom + f5);
            RectF rectF3 = liveRect;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, liveRect.height() / 2.0f, livePaint);
            Text text = liveText;
            RectF rectF4 = liveRect;
            text.draw(canvas, rectF4.left + lerp, rectF4.centerY(), -1, f);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        if (r2 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        if (r11.stories.get(r6).close_friends != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void drawSegmentsInternal(Canvas canvas, StoriesController storiesController, ImageReceiver imageReceiver, AvatarStoryParams avatarStoryParams, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z) {
        int unreadState;
        int i;
        int size;
        Paint paint5;
        Paint paint6;
        checkGrayPaint(avatarStoryParams.resourcesProvider);
        checkStoryCellGrayPaint(avatarStoryParams.isArchive, avatarStoryParams.resourcesProvider);
        long j = avatarStoryParams.crossfadeToDialog;
        if (j != 0) {
            unreadState = storiesController.getUnreadState(j);
        } else {
            unreadState = storiesController.getUnreadState(avatarStoryParams.dialogId);
        }
        int i2 = 2;
        avatarStoryParams.globalState = unreadState == 0 ? 2 : 1;
        TL_stories.PeerStories stories = storiesController.getStories(avatarStoryParams.dialogId);
        if (stories == null) {
            stories = storiesController.getStoriesFromFullPeer(avatarStoryParams.dialogId);
        }
        TL_stories.PeerStories peerStories = stories;
        if (avatarStoryParams.drawHiddenStoriesAsSegments) {
            size = storiesController.getHiddenList().size();
        } else {
            if (peerStories == null || peerStories.stories.size() == 1) {
                i = 1;
                if (unreadState != 2) {
                    getCloseFriendsPaint(imageReceiver);
                    paint5 = closeFriendsGradientTools.paint;
                } else if (unreadState == 3) {
                    getLivePaint(imageReceiver);
                    paint5 = liveGradientTools.paint;
                } else if (unreadState == 1) {
                    getUnreadCirclePaint(imageReceiver, avatarStoryParams.isStoryCell);
                    paint5 = storiesGradientTools[avatarStoryParams.isStoryCell ? 1 : 0].paint;
                } else {
                    paint5 = avatarStoryParams.isStoryCell ? storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0] : grayPaint;
                }
                Paint paint7 = paint5;
                if (i <= 1) {
                    float f = 360.0f / i;
                    float f2 = (i > 20 ? 3 : 5) * avatarStoryParams.progressToSegments;
                    float f3 = f2 > f ? 0.0f : f2;
                    int max = avatarStoryParams.drawHiddenStoriesAsSegments ? 0 : Math.max(peerStories.max_read_id, storiesController.dialogIdToMaxReadId.get(avatarStoryParams.dialogId, 0));
                    int i3 = 0;
                    while (i3 < i) {
                        Paint paint8 = avatarStoryParams.isStoryCell ? storyCellGreyPaint[avatarStoryParams.isArchive ? 1 : 0] : grayPaint;
                        if (avatarStoryParams.drawHiddenStoriesAsSegments) {
                            int unreadState2 = storiesController.getUnreadState(DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get((i - 1) - i3)).peer));
                            if (unreadState2 != i2) {
                                if (unreadState2 != 3) {
                                }
                                paint6 = paint3;
                            }
                            paint6 = paint4;
                        } else {
                            if (i3 < peerStories.stories.size()) {
                                if (peerStories.stories.get(i3).justUploaded || peerStories.stories.get(i3).id > max) {
                                    if (!(peerStories.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                                    }
                                    paint6 = paint3;
                                }
                                paint6 = paint8;
                            }
                            paint6 = paint2;
                        }
                        float f4 = (i3 * f) - 90.0f;
                        float f5 = f4 + f3;
                        float f6 = (f4 + f) - f3;
                        RectF rectF = rectTmp;
                        Paint paint9 = paint6;
                        int i4 = i3;
                        int i5 = max;
                        drawSegment(canvas, rectF, paint6, f5, f6, avatarStoryParams, z);
                        if (avatarStoryParams.progressToSegments != 1.0f && paint9 != paint7) {
                            paint7.getStrokeWidth();
                            paint7.setAlpha((int) ((1.0f - avatarStoryParams.progressToSegments) * 255.0f));
                            drawSegment(canvas, rectF, paint7, f5, f6, avatarStoryParams, z);
                            paint7.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                        }
                        i3 = i4 + 1;
                        max = i5;
                        i2 = 2;
                    }
                    return;
                }
                int hasUnreadStoriesLive = storiesController.hasUnreadStoriesLive(avatarStoryParams.dialogId);
                Paint paint10 = hasUnreadStoriesLive == 1 ? paint2 : hasUnreadStoriesLive == 2 ? paint3 : paint;
                RectF rectF2 = rectTmp;
                Paint paint11 = paint10;
                drawSegment(canvas, rectF2, paint11, -90.0f, 90.0f, avatarStoryParams, z);
                drawSegment(canvas, rectF2, paint11, 90.0f, 270.0f, avatarStoryParams, z);
                float f7 = avatarStoryParams.progressToSegments;
                if (f7 == 1.0f || paint10 == paint7) {
                    return;
                }
                paint7.setAlpha((int) ((1.0f - f7) * 255.0f));
                drawSegment(canvas, rectF2, paint7, -90.0f, 90.0f, avatarStoryParams, z);
                drawSegment(canvas, rectF2, paint7, 90.0f, 270.0f, avatarStoryParams, z);
                paint7.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                return;
            }
            size = peerStories.stories.size();
        }
        i = size;
        if (unreadState != 2) {
        }
        Paint paint72 = paint5;
        if (i <= 1) {
        }
    }

    public static int getPredictiveUnreadState(StoriesController storiesController, long j) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
            if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            int i = storiesController.dialogIdToMaxReadId.get(j, 0);
            TLRPC.TL_recentStory tL_recentStory3 = user.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i ? 1 : 2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        int i2 = storiesController.dialogIdToMaxReadId.get(j, 0);
        TLRPC.TL_recentStory tL_recentStory4 = chat.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i2 ? 1 : 2;
    }

    private static void drawProgress(Canvas canvas, AvatarStoryParams avatarStoryParams, View view, Paint paint) {
        avatarStoryParams.updateProgressParams();
        view.invalidate();
        if (avatarStoryParams.inc) {
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle, avatarStoryParams.sweepAngle * 360.0f, false, paint);
        } else {
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle + 360.0f, avatarStoryParams.sweepAngle * (-360.0f), false, paint);
        }
        for (int i = 0; i < 16; i++) {
            float f = (i * 22.5f) + 10.0f;
            canvas.drawArc(rectTmp, avatarStoryParams.globalAngle + f, ((22.5f + f) - 10.0f) - f, false, paint);
        }
    }

    private static void checkStoryCellGrayPaint(boolean z, Theme.ResourcesProvider resourcesProvider) {
        Paint[] paintArr = storyCellGreyPaint;
        if (paintArr[z ? 1 : 0] == null) {
            paintArr[z ? 1 : 0] = new Paint(1);
            storyCellGreyPaint[z ? 1 : 0].setStyle(Paint.Style.STROKE);
            storyCellGreyPaint[z ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            storyCellGreyPaint[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(!z ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived, resourcesProvider);
        if (storyCellGrayLastColor != color) {
            storyCellGrayLastColor = color;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (computePerceivedBrightness >= 0.721f) {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (computePerceivedBrightness < 0.25f) {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -1, 0.2f));
            } else {
                storyCellGreyPaint[z ? 1 : 0].setColor(ColorUtils.blendARGB(color, -1, 0.44f));
            }
        }
    }

    private static void checkGrayPaint(Theme.ResourcesProvider resourcesProvider) {
        if (grayPaint == null) {
            Paint paint = new Paint(1);
            grayPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            grayPaint.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            grayPaint.setStrokeCap(Paint.Cap.ROUND);
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
        if (grayLastColor != color) {
            grayLastColor = color;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(color);
            if (computePerceivedBrightness >= 0.721f) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -16777216, 0.2f));
            } else if (computePerceivedBrightness < 0.25f) {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.2f));
            } else {
                grayPaint.setColor(ColorUtils.blendARGB(color, -1, 0.44f));
            }
        }
    }

    private static void drawCircleInternal(Canvas canvas, View view, AvatarStoryParams avatarStoryParams, Paint paint, boolean z) {
        if (z) {
            RectF rectF = forumRect;
            rectF.set(rectTmp);
            rectF.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f = avatarStoryParams.progressToArc;
        if (f == 0.0f) {
            RectF rectF2 = rectTmp;
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectTmp, (f / 2.0f) + 360.0f, 360.0f - f, false, paint);
        }
    }

    private static void drawSegment(Canvas canvas, RectF rectF, Paint paint, float f, float f2, AvatarStoryParams avatarStoryParams, boolean z) {
        if (z) {
            float height = rectF.height() * 0.32f;
            float f3 = ((((int) f) / 90) * 90) + 90;
            float f4 = (-199.0f) + f3;
            float f5 = (f - f4) / 360.0f;
            float f6 = (f2 - f4) / 360.0f;
            Path path = forumRoundRectPath;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = forumRoundRectMatrix;
            matrix.reset();
            matrix.postRotate(f3, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = forumRoundRectPathMeasure;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = forumSegmentPath;
            path2.reset();
            pathMeasure.getSegment(f5 * length, length * f6, path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        boolean z2 = avatarStoryParams.isFirst;
        if (!z2 && !avatarStoryParams.isLast) {
            if (f < 90.0f) {
                float f7 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f7) / 2.0f, f7 / 2.0f);
                return;
            } else {
                float f8 = avatarStoryParams.progressToArc;
                drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f8) / 2.0f) + 180.0f, (f8 / 2.0f) + 180.0f);
                return;
            }
        }
        if (avatarStoryParams.isLast) {
            float f9 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, ((-f9) / 2.0f) + 180.0f, (f9 / 2.0f) + 180.0f);
        } else if (z2) {
            float f10 = avatarStoryParams.progressToArc;
            drawArcExcludeArc(canvas, rectF, paint, f, f2, (-f10) / 2.0f, f10 / 2.0f);
        } else {
            canvas.drawArc(rectF, f, f2 - f, false, paint);
        }
    }

    public static int getInset(int i, int i2) {
        if (i == 3) {
            i = i2;
        }
        if (i == 2) {
            return AndroidUtilities.dp(3.0f);
        }
        if (i == 1) {
            return AndroidUtilities.dp(4.0f);
        }
        return 0;
    }

    public static Paint getUnreadCirclePaint(ImageReceiver imageReceiver, boolean z) {
        checkStoriesGradientTools(z);
        storiesGradientTools[z ? 1 : 0].setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return storiesGradientTools[z ? 1 : 0].paint;
    }

    private static void checkStoriesGradientTools(boolean z) {
        GradientTools[] gradientToolsArr = storiesGradientTools;
        if (gradientToolsArr[z ? 1 : 0] == null) {
            gradientToolsArr[z ? 1 : 0] = new GradientTools();
            GradientTools gradientTools = storiesGradientTools[z ? 1 : 0];
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            if (z) {
                gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
            } else {
                gradientTools.setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
            }
            storiesGradientTools[z ? 1 : 0].paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            storiesGradientTools[z ? 1 : 0].paint.setStyle(Paint.Style.STROKE);
            storiesGradientTools[z ? 1 : 0].paint.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    public static void updateColors() {
        GradientTools gradientTools = closeFriendsGradientTools;
        if (gradientTools != null) {
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_closeFriends1), Theme.getColor(Theme.key_stories_circle_closeFriends2));
        }
        GradientTools gradientTools2 = liveGradientTools;
        if (gradientTools2 != null) {
            gradientTools2.setColors(Theme.getColor(Theme.key_stories_circle_live1), Theme.getColor(Theme.key_stories_circle_live2));
        }
        GradientTools gradientTools3 = storiesGradientTools[0];
        if (gradientTools3 != null) {
            gradientTools3.setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2));
        }
        GradientTools gradientTools4 = storiesGradientTools[1];
        if (gradientTools4 != null) {
            gradientTools4.setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2));
        }
        if (errorGradientTools != null) {
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
        }
    }

    public static Paint getCloseFriendsPaint(ImageReceiver imageReceiver) {
        if (closeFriendsGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            closeFriendsGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_closeFriends1), Theme.getColor(Theme.key_stories_circle_closeFriends2));
            closeFriendsGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            closeFriendsGradientTools.paint.setStyle(Paint.Style.STROKE);
            closeFriendsGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        closeFriendsGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return closeFriendsGradientTools.paint;
    }

    public static Paint getLivePaint(ImageReceiver imageReceiver) {
        if (liveGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            liveGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            gradientTools.setColors(Theme.getColor(Theme.key_stories_circle_live1), Theme.getColor(Theme.key_stories_circle_live2));
            liveGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            liveGradientTools.paint.setStyle(Paint.Style.STROKE);
            liveGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        liveGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return liveGradientTools.paint;
    }

    public static Paint getErrorPaint(ImageReceiver imageReceiver) {
        if (errorGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            errorGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            errorGradientTools.paint.setStyle(Paint.Style.STROKE);
            errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        errorGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return errorGradientTools.paint;
    }

    public static Paint getErrorPaint(RectF rectF) {
        if (errorGradientTools == null) {
            GradientTools gradientTools = new GradientTools();
            errorGradientTools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            int color = Theme.getColor(Theme.key_color_orange);
            int color2 = Theme.getColor(Theme.key_text_RedBold);
            errorGradientTools.setColors(ColorUtils.blendARGB(color, color2, 0.25f), color2);
            errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            errorGradientTools.paint.setStyle(Paint.Style.STROKE);
            errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }
        errorGradientTools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return errorGradientTools.paint;
    }

    public static void setStoryMiniImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        setImage(imageReceiver, storyItem, "320_320");
    }

    public static void setImage(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, String str) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.media.document), str, null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            return;
        }
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), str, null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
        } else {
            imageReceiver.clearImage();
        }
    }

    public static void setImage(ImageReceiver imageReceiver, StoriesController.UploadingStory uploadingStory) {
        if (uploadingStory.entry.isVideo) {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.firstFramePath), "320_180", null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.path), "320_180", null, null, null, 0L, null, null, 0);
        }
    }

    public static void setThumbImage(AvatarDrawable avatarDrawable, ImageReceiver imageReceiver, TL_stories.StoryItem storyItem, int i, int i2) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            avatarDrawable.setInfo(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
            return;
        }
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), storyItem.media.document), i + "_" + i2, null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(i, i2)), false, null, true), photo), i + "_" + i2, null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            return;
        }
        imageReceiver.clearImage();
    }

    public static Drawable getExpiredStoryDrawable() {
        if (expiredStoryDrawable == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, NotificationCenter.newEmojiSuggestionsAvailable, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            expiredStoryDrawable = new BitmapDrawable(createBitmap);
        }
        return expiredStoryDrawable;
    }

    public static CharSequence getUploadingStr(TextView textView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
        valueOf.setSpan(uploadingDotsSpannable, valueOf.length() - 1, valueOf.length(), 0);
        uploadingDotsSpannable.setParent(textView, z);
        return valueOf;
    }

    public static void applyUploadingStr(SimpleTextView simpleTextView, boolean z, boolean z2) {
        String string;
        if (z2) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
            valueOf.setSpan(uploadingDotsSpannable, valueOf.length() - 1, valueOf.length(), 0);
            uploadingDotsSpannable.setParent(simpleTextView, z);
            simpleTextView.setText(valueOf);
            return;
        }
        simpleTextView.setText(string);
    }

    public static CharSequence createExpiredStoryString() {
        return createExpiredStoryString(false, R.string.ExpiredStory, new Object[0]);
    }

    public static CharSequence createExpiredStoryString(boolean z, int i, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i, objArr));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_bomb);
        if (z) {
            coloredImageSpan.setScale(0.8f, 0.8f);
        } else {
            coloredImageSpan.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static CharSequence createReplyStoryString() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_replystory2), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static boolean hasExpiredViews(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static void applyViewedUser(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || hasExpiredViews(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void drawArcExcludeArc(Canvas canvas, RectF rectF, Paint paint, float f, float f2, float f3, float f4) {
        boolean z;
        float f5 = f2 - f;
        if (f >= f3 || f2 >= f3 + f5) {
            z = false;
        } else {
            canvas.drawArc(rectF, f, Math.min(f2, f3) - f, false, paint);
            z = true;
        }
        float max = Math.max(f, f4);
        float min = Math.min(f2, 360.0f + f3);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z) {
                return;
            }
            if (f <= f3 || f2 >= f4) {
                canvas.drawArc(rectF, f, f5, false, paint);
            }
        }
    }

    public static boolean isExpired(int i, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i).getCurrentTime() > storyItem.expire_date;
    }

    public static String getStoryImageFilter() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return max + "_" + max;
    }

    public static class EnsureStoryFileLoadedObject {
        private boolean cancelled;
        long dialogId;
        ImageReceiver imageReceiver;
        public Runnable runnable;
        StoriesController storiesController;

        private EnsureStoryFileLoadedObject(StoriesController storiesController, long j) {
            this.cancelled = false;
            this.dialogId = j;
            this.storiesController = storiesController;
        }

        public void cancel() {
            this.cancelled = true;
            this.storiesController.setLoading(this.dialogId, false);
        }
    }

    public static EnsureStoryFileLoadedObject ensureStoryFileLoaded(TL_stories.PeerStories peerStories, final Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i = storiesController.dialogIdToMaxReadId.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i2 = 0;
        while (true) {
            if (i2 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i2).id > i) {
                storyItem = peerStories.stories.get(i2);
                break;
            }
            i2++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && messageMedia.document != null) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem.media.document, "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem.media.document, "", true);
            if (pathToAttach2 != null) {
                try {
                    int lastIndexOf = pathToAttach2.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(pathToAttach2.getParentFile(), pathToAttach2.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo != null && (arrayList = photo.sizes) != null) {
                File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), "", false);
                if (pathToAttach3 != null && pathToAttach3.exists()) {
                    runnable.run();
                    return null;
                }
            } else {
                runnable.run();
                return null;
            }
        }
        final EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = new EnsureStoryFileLoadedObject(storiesController, DialogObject.getPeerDialogId(peerStories.peer));
        ensureStoryFileLoadedObject.runnable = new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesUtilities.lambda$ensureStoryFileLoaded$0(StoriesUtilities.EnsureStoryFileLoadedObject.this, runnable);
            }
        };
        final Runnable[] runnableArr = {r2};
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                StoriesUtilities.lambda$ensureStoryFileLoaded$1(runnableArr, ensureStoryFileLoadedObject);
            }
        };
        AndroidUtilities.runOnUIThread(runnable2, 3000L);
        ImageReceiver imageReceiver = new ImageReceiver() { // from class: org.telegram.ui.Stories.StoriesUtilities.2
            @Override // org.telegram.messenger.ImageReceiver
            protected boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                Runnable runnable3 = runnableArr[0];
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                    ensureStoryFileLoadedObject.runnable.run();
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        onDetachedFromWindow();
                    }
                });
                return imageBitmapByKey;
            }
        };
        ensureStoryFileLoadedObject.imageReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        ensureStoryFileLoadedObject.imageReceiver.onAttachedToWindow();
        String storyImageFilter = getStoryImageFilter();
        TLRPC.MessageMedia messageMedia2 = storyItem.media;
        if (messageMedia2 != null && (document = messageMedia2.document) != null) {
            ensureStoryFileLoadedObject.imageReceiver.setImage(ImageLocation.getForDocument(document), storyImageFilter + "_pframe", null, null, null, 0L, null, storyItem, 0);
            return ensureStoryFileLoadedObject;
        }
        TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
        if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
            ensureStoryFileLoadedObject.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), storyImageFilter, null, null, null, 0L, null, storyItem, 0);
            return ensureStoryFileLoadedObject;
        }
        ensureStoryFileLoadedObject.runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureStoryFileLoaded$0(EnsureStoryFileLoadedObject ensureStoryFileLoadedObject, Runnable runnable) {
        if (ensureStoryFileLoadedObject.cancelled) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureStoryFileLoaded$1(Runnable[] runnableArr, EnsureStoryFileLoadedObject ensureStoryFileLoadedObject) {
        runnableArr[0] = null;
        ensureStoryFileLoadedObject.runnable.run();
        ImageReceiver imageReceiver = ensureStoryFileLoadedObject.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public static class AvatarStoryParams {
        public boolean allowLongress;
        public float alpha;
        public boolean animate;
        public int animateFromUnreadState;
        ButtonBounce buttonBounce;
        public View child;
        public long crossfadeToDialog;
        public float crossfadeToDialogProgress;
        public int currentState;
        private long dialogId;
        public boolean drawHiddenStoriesAsSegments;
        public boolean drawInside;
        public boolean drawSegments;
        public boolean drawnLive;
        public boolean forceAnimateProgressToSegments;
        public int forceState;
        float globalAngle;
        public int globalState;
        boolean inc;
        public boolean isArchive;
        public boolean isDialogStoriesCell;
        public boolean isFirst;
        public boolean isLast;
        public final boolean isStoryCell;
        Runnable longPressRunnable;
        UserStoriesLoadOperation operation;
        public RectF originalAvatarRect;
        boolean pressed;
        public int prevState;
        public int prevUnreadState;
        public float progressToArc;
        public float progressToProgressSegments;
        public float progressToSate;
        public float progressToSegments;
        public Theme.ResourcesProvider resourcesProvider;
        public boolean showProgress;
        float startX;
        float startY;
        public int storyId;
        public TL_stories.StoryItem storyItem;
        float sweepAngle;
        public int unreadState;

        public void onLongPress() {
        }

        public AvatarStoryParams(boolean z) {
            this(z, null);
        }

        public AvatarStoryParams(boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.drawSegments = true;
            this.animate = true;
            this.progressToSegments = 1.0f;
            this.progressToArc = 0.0f;
            this.alpha = 1.0f;
            this.progressToSate = 1.0f;
            this.showProgress = false;
            this.originalAvatarRect = new RectF();
            this.allowLongress = false;
            this.isStoryCell = z;
            this.resourcesProvider = resourcesProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateProgressParams() {
            if (this.inc) {
                float f = this.sweepAngle + 0.016f;
                this.sweepAngle = f;
                if (f >= 1.0f) {
                    this.sweepAngle = 1.0f;
                    this.inc = false;
                }
            } else {
                float f2 = this.sweepAngle - 0.016f;
                this.sweepAngle = f2;
                if (f2 < 0.0f) {
                    this.sweepAngle = 0.0f;
                    this.inc = true;
                }
            }
            this.globalAngle += 1.152f;
        }

        public boolean checkOnTouchEvent(MotionEvent motionEvent, final View view) {
            TLRPC.User user;
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            this.child = view;
            StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            boolean z = false;
            if (motionEvent.getAction() == 0 && this.originalAvatarRect.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.dialogId > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.dialogId));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.dialogId));
                }
                if (this.drawHiddenStoriesAsSegments) {
                    z = storiesController.hasHiddenStories();
                } else if (this.dialogId <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (chat != null && !chat.stories_unavailable && (tL_recentStory = chat.stories_max_id) != null && tL_recentStory.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().hasStories(this.dialogId) || (user != null && !user.stories_unavailable && (tL_recentStory2 = user.stories_max_id) != null && tL_recentStory2.max_id > 0)) {
                    z = true;
                }
                if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z) {
                    ButtonBounce buttonBounce = this.buttonBounce;
                    if (buttonBounce == null) {
                        this.buttonBounce = new ButtonBounce(view, 1.5f, 5.0f);
                    } else {
                        buttonBounce.setView(view);
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.buttonBounce.setPressed(true);
                    this.pressed = true;
                    this.startX = motionEvent.getX();
                    this.startY = motionEvent.getY();
                    if (this.allowLongress) {
                        Runnable runnable = this.longPressRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$AvatarStoryParams$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                StoriesUtilities.AvatarStoryParams.this.lambda$checkOnTouchEvent$0(view);
                            }
                        };
                        this.longPressRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.pressed) {
                if (Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.startY - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                    ButtonBounce buttonBounce2 = this.buttonBounce;
                    if (buttonBounce2 != null) {
                        buttonBounce2.setView(view);
                        this.buttonBounce.setPressed(false);
                    }
                    Runnable runnable3 = this.longPressRunnable;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.pressed = false;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ButtonBounce buttonBounce3 = this.buttonBounce;
                if (buttonBounce3 != null) {
                    buttonBounce3.setView(view);
                    this.buttonBounce.setPressed(false);
                }
                if (this.pressed && motionEvent.getAction() == 1) {
                    processOpenStory(view);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                this.pressed = false;
                Runnable runnable4 = this.longPressRunnable;
                if (runnable4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable4);
                }
            }
            return this.pressed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkOnTouchEvent$0(View view) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(false);
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.pressed = false;
            onLongPress();
        }

        private void processOpenStory(View view) {
            TLRPC.TL_recentStory tL_recentStory;
            TLRPC.TL_recentStory tL_recentStory2;
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            StoriesController storiesController = messagesController.getStoriesController();
            if (this.drawHiddenStoriesAsSegments) {
                openStory(0L, null);
                return;
            }
            if (this.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                if (storiesController.hasStories(this.dialogId)) {
                    openStory(this.dialogId, null);
                    return;
                }
                long j = this.dialogId;
                if (j > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(j));
                    if (user == null || user.stories_unavailable || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0) {
                        return;
                    }
                    new UserStoriesLoadOperation().load(this.dialogId, view, this);
                    return;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
                if (chat == null || chat.stories_unavailable || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0) {
                    return;
                }
                new UserStoriesLoadOperation().load(this.dialogId, view, this);
            }
        }

        public void openStory(long j, Runnable runnable) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null || this.child == null) {
                return;
            }
            lastFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            ViewParent parent = this.child.getParent();
            lastFragment.getOrCreateStoryViewer().open(lastFragment.getContext(), j, parent instanceof RecyclerView ? StoriesListPlaceProvider.of((RecyclerListView) parent) : null);
        }

        public float getScale() {
            ButtonBounce buttonBounce = this.buttonBounce;
            if (buttonBounce == null) {
                return 1.0f;
            }
            return buttonBounce.getScale(0.08f);
        }

        public void reset() {
            UserStoriesLoadOperation userStoriesLoadOperation = this.operation;
            if (userStoriesLoadOperation != null) {
                userStoriesLoadOperation.cancel();
                this.operation = null;
            }
            this.buttonBounce = null;
            this.pressed = false;
        }

        public void onDetachFromWindow() {
            reset();
        }
    }

    public static class UserStoriesLoadOperation {
        boolean canceled;
        private int currentAccount;
        long dialogId;
        int guid = ConnectionsManager.generateClassGuid();
        AvatarStoryParams params;
        int reqId;
        View view;

        void load(final long j, final View view, final AvatarStoryParams avatarStoryParams) {
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.dialogId = j;
            this.params = avatarStoryParams;
            this.view = view;
            final MessagesController messagesController = MessagesController.getInstance(i);
            messagesController.getStoriesController().setLoading(j, true);
            view.invalidate();
            TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
            tL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesUtilities$UserStoriesLoadOperation$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$3(j, view, avatarStoryParams, messagesController, tLObject, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$load$3(final long j, final View view, final AvatarStoryParams avatarStoryParams, final MessagesController messagesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$UserStoriesLoadOperation$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$2(tLObject, j, view, avatarStoryParams, messagesController);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$load$2(TLObject tLObject, final long j, final View view, final AvatarStoryParams avatarStoryParams, MessagesController messagesController) {
            boolean z;
            TLRPC.Chat chat;
            TLRPC.User user;
            if (tLObject != null) {
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_stories_peerStories.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_stories_peerStories.chats, false);
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                if (!peerStories.stories.isEmpty()) {
                    MessagesController.getInstance(this.currentAccount).getStoriesController().putStories(j, peerStories);
                    StoriesUtilities.ensureStoryFileLoaded(peerStories, new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$UserStoriesLoadOperation$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$1(view, j, avatarStoryParams);
                        }
                    });
                    z = false;
                    if (j > 0 && (user = messagesController.getUser(Long.valueOf(j))) != null) {
                        user.stories_unavailable = true;
                        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                        messagesController.putUser(user, false);
                    }
                    if (j < 0 && (chat = messagesController.getChat(Long.valueOf(-j))) != null) {
                        chat.stories_unavailable = true;
                        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                        messagesController.putChat(chat, false);
                    }
                    if (z) {
                        return;
                    }
                    view.invalidate();
                    MessagesController.getInstance(this.currentAccount).getStoriesController().setLoading(j, false);
                    return;
                }
            }
            z = true;
            if (j > 0) {
                user.stories_unavailable = true;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                messagesController.putUser(user, false);
            }
            if (j < 0) {
                chat.stories_unavailable = true;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                messagesController.putChat(chat, false);
            }
            if (z) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$load$1(final View view, final long j, AvatarStoryParams avatarStoryParams) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesUtilities$UserStoriesLoadOperation$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesUtilities.UserStoriesLoadOperation.this.lambda$load$0(view, j);
                }
            }, 500L);
            avatarStoryParams.openStory(j, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$load$0(View view, long j) {
            view.invalidate();
            MessagesController.getInstance(this.currentAccount).getStoriesController().setLoading(j, false);
        }

        void cancel() {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
            this.canceled = true;
            this.params = null;
        }
    }

    public static class StoryGradientTools {
        private final AnimatedColor animatedColor1;
        private final AnimatedColor animatedColor2;
        private int color1;
        private int color2;
        public final int currentAccount;
        private final Runnable invalidate;
        private final boolean isDialogCell;
        private final GradientTools tools;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StoryGradientTools(View view, boolean z) {
            this(new Shaker$$ExternalSyntheticLambda0(view), z);
            Objects.requireNonNull(view);
        }

        public StoryGradientTools(Runnable runnable, boolean z) {
            this.currentAccount = UserConfig.selectedAccount;
            this.invalidate = runnable;
            this.isDialogCell = z;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedColor1 = new AnimatedColor(runnable, 350L, cubicBezierInterpolator);
            this.animatedColor2 = new AnimatedColor(runnable, 350L, cubicBezierInterpolator);
            GradientTools gradientTools = new GradientTools();
            this.tools = gradientTools;
            gradientTools.isDiagonal = true;
            gradientTools.isRotate = true;
            resetColors(false);
            gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
            gradientTools.paint.setStyle(Paint.Style.STROKE);
            gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
        }

        public void setUser(TLRPC.User user, boolean z) {
            TLRPC.PeerColor peerColor;
            setColorId((user == null || (peerColor = user.profile_color) == null) ? -1 : peerColor.color, z);
        }

        public void setChat(TLRPC.Chat chat, boolean z) {
            TLRPC.PeerColor peerColor;
            setColorId((chat == null || (peerColor = chat.profile_color) == null) ? -1 : peerColor.color, z);
        }

        public void setColorId(int i, boolean z) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
            setColor(peerColors == null ? null : peerColors.getColor(i), z);
        }

        public void setColor(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor != null) {
                setColors(peerColor.getStoryColor1(Theme.isCurrentThemeDark()), peerColor.getStoryColor2(Theme.isCurrentThemeDark()), z);
            } else {
                resetColors(z);
            }
        }

        private void resetColors(boolean z) {
            if (this.isDialogCell) {
                setColors(Theme.getColor(Theme.key_stories_circle_dialog1), Theme.getColor(Theme.key_stories_circle_dialog2), z);
            } else {
                setColors(Theme.getColor(Theme.key_stories_circle1), Theme.getColor(Theme.key_stories_circle2), z);
            }
        }

        private void setColors(int i, int i2, boolean z) {
            this.color1 = i;
            this.color2 = i2;
            if (!z) {
                this.animatedColor1.set(i, true);
                this.animatedColor2.set(i2, true);
            }
            Runnable runnable = this.invalidate;
            if (runnable != null) {
                runnable.run();
            }
        }

        public Paint getPaint(RectF rectF) {
            this.tools.setColors(this.animatedColor1.set(this.color1), this.animatedColor2.set(this.color2));
            this.tools.setBounds(rectF.left, rectF.top, rectF.right, rectF.bottom);
            return this.tools.paint;
        }
    }
}
