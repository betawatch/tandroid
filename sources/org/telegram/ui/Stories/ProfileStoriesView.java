package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;

/* loaded from: classes5.dex */
public abstract class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float actionBarProgress;
    private boolean attached;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    private float bounceScale;
    private final ArrayList circles;
    private final Paint clipOutAvatar;
    private final Path clipPath;
    private int count;
    private final int currentAccount;
    private float cy;
    private final long dialogId;
    private float expandProgress;
    private float expandRight;
    private boolean expandRightPad;
    private final AnimatedFloat expandRightPadAnimated;
    private float expandY;
    private final Matrix forumRoundRectMatrix;
    private final Path forumRoundRectPath;
    private final PathMeasure forumRoundRectPathMeasure;
    private final Path forumSegmentPath;
    private float fragmentTransitionProgress;
    private final StoriesUtilities.StoryGradientTools gradientTools;
    private final boolean isTopic;
    private StoriesController.UploadingStory lastUploadingStory;
    private float left;
    private final Paint livePaint;
    private StoryCircle mainCircle;
    private ValueAnimator newStoryBounce;
    private float newStoryBounceT;
    private Runnable onLongPressRunnable;
    Paint paint;
    private TL_stories.PeerStories peerStories;
    private boolean progressIsDone;
    private float progressToInsets;
    private final AnimatedFloat progressToUploading;
    private boolean progressWasDrawn;
    private final StoryViewer.PlaceProvider provider;
    private RadialProgress radialProgress;
    private final Paint readPaint;
    private int readPaintAlpha;
    private final RectF rect1;
    private final RectF rect2;
    private final RectF rect3;
    private float right;
    private final AnimatedFloat rightAnimated;
    private final AnimatedFloat segmentsCountAnimated;
    private final AnimatedFloat segmentsUnreadCountAnimated;
    StoriesController storiesController;
    private long tapTime;
    private float tapX;
    private float tapY;
    private final AnimatedTextView.AnimatedTextDrawable titleDrawable;
    private int unreadCount;
    private int uploadingStoriesCount;
    float w;
    private final Paint whitePaint;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onLongPress();

    protected abstract void onTap(StoryViewer.PlaceProvider placeProvider);

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class StoryCircle {
        final RectF borderRect;
        float cachedIndex;
        float cachedRead;
        final RectF cachedRect;
        float cachedScale;
        final AnimatedFloat indexAnimated;
        boolean live;
        final AnimatedFloat readAnimated;
        final AnimatedFloat scaleAnimated;
        int storyId;
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver = new ImageReceiver();
        int index = 0;
        boolean read = false;
        float scale = 1.0f;

        public StoryCircle(TL_stories.StoryItem storyItem) {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.readAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.indexAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.scaleAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.cachedRect = new RectF();
            this.borderRect = new RectF();
            this.storyId = storyItem.id;
            this.imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
            this.imageReceiver.setParentView(ProfileStoriesView.this);
            this.live = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
            if (ProfileStoriesView.this.attached) {
                this.imageReceiver.onAttachedToWindow();
            }
            StoriesUtilities.setThumbImage(this.avatarDrawable, this.imageReceiver, storyItem, 25, 25);
        }

        public void destroy() {
            this.imageReceiver.onDetachedFromWindow();
        }

        public void apply() {
            this.readAnimated.set(this.read, true);
            this.indexAnimated.set(this.index, true);
            this.scaleAnimated.set(this.scale, true);
        }
    }

    public ProfileStoriesView(Context context, int i, long j, boolean z, View view, ProfileActivity.AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.readPaint = paint;
        Paint paint2 = new Paint(1);
        this.livePaint = paint2;
        Paint paint3 = new Paint(1);
        this.whitePaint = paint3;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.titleDrawable = animatedTextDrawable;
        Paint paint4 = new Paint(1);
        this.clipOutAvatar = paint4;
        this.circles = new ArrayList();
        this.paint = new Paint(1);
        this.bounceScale = 1.0f;
        this.progressToInsets = 1.0f;
        this.gradientTools = new StoriesUtilities.StoryGradientTools((View) this, false);
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        this.rect3 = new RectF();
        this.clipPath = new Path();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.segmentsCountAnimated = new AnimatedFloat(this, 0L, 480L, cubicBezierInterpolator);
        this.segmentsUnreadCountAnimated = new AnimatedFloat(this, 0L, 240L, cubicBezierInterpolator);
        this.progressToUploading = new AnimatedFloat(this, 0L, 150L, CubicBezierInterpolator.DEFAULT);
        this.newStoryBounceT = 1.0f;
        this.forumRoundRectPath = new Path();
        this.forumRoundRectMatrix = new Matrix();
        this.forumRoundRectPathMeasure = new PathMeasure();
        this.forumSegmentPath = new Path();
        this.expandRightPadAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.rightAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.provider = new 3();
        this.onLongPressRunnable = new Runnable() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileStoriesView.this.onLongPress();
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.isTopic = z;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        avatarImageView.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ProfileStoriesView.this.invalidate();
            }
        });
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        paint.setColor(1526726655);
        this.readPaintAlpha = paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(Theme.getColor(Theme.key_stories_circle_live1, resourcesProvider));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        animatedTextDrawable.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setEllipsizeByGradient(true);
        animatedTextDrawable.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        this.paint.setStyle(style);
        updateStories(false, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.titleDrawable || super.verifyDrawable(drawable);
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        this.peerStories = peerStories;
        updateStories(true, false);
    }

    public void update() {
        updateStories(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018f, code lost:
    
        if (r9 != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateStories(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        boolean z3;
        int i;
        TL_stories.StoryItem storyItem;
        int i2;
        if (this.isTopic) {
            return;
        }
        boolean z4 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        TL_stories.PeerStories storiesFromFullPeer = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesFromFullPeer(this.dialogId);
        TL_stories.PeerStories stories = MessagesController.getInstance(this.currentAccount).getStoriesController().getStories(this.dialogId);
        TL_stories.PeerStories peerStories = this.dialogId == 0 ? null : storiesFromFullPeer;
        int max = storiesFromFullPeer != null ? Math.max(0, storiesFromFullPeer.max_read_id) : 0;
        if (stories != null) {
            max = Math.max(max, stories.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.unreadCount;
        this.unreadCount = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i5);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > max) {
                    this.unreadCount++;
                }
                i4++;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList.size()) {
                z3 = z4;
                i = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i6);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                z3 = z4;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i7 = storyItem3.id;
                    z3 = z4;
                    if (stories != null) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= stories.stories.size()) {
                                break;
                            }
                            if (stories.stories.get(i8).id == i7) {
                                storyItem3 = stories.stories.get(i8);
                                break;
                            }
                            i8++;
                        }
                    }
                    boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z5) {
                        if (storiesFromFullPeer != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= storiesFromFullPeer.stories.size()) {
                                    break;
                                }
                                if (storiesFromFullPeer.stories.get(i9).id == i7) {
                                    storiesFromFullPeer.stories.get(i9);
                                    break;
                                }
                                i9++;
                            }
                        }
                    } else if (z5) {
                        continue;
                    }
                } else {
                    z3 = z4;
                }
                int i10 = storyItem3.expire_date;
                if ((i10 == 0 || currentTime <= i10) && (z3 || storyItem3.id > max)) {
                    arrayList2.add(storyItem3);
                    i = 3;
                    if (arrayList2.size() >= 3) {
                        break;
                    }
                }
            }
            i6++;
            z4 = z3;
        }
        if (arrayList2.size() < i) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i11);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i12 = storyItem4.id;
                    if (stories != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= stories.stories.size()) {
                                break;
                            }
                            if (stories.stories.get(i13).id == i12) {
                                storyItem4 = stories.stories.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    boolean z6 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z6) {
                        if (storiesFromFullPeer != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= storiesFromFullPeer.stories.size()) {
                                    break;
                                }
                                if (storiesFromFullPeer.stories.get(i14).id == i12) {
                                    storiesFromFullPeer.stories.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i2 = storyItem4.expire_date) == 0 || currentTime <= i2) && !arrayList2.contains(storyItem4))) {
                    arrayList2.add(storyItem4);
                    if (arrayList2.size() >= 3) {
                        break;
                    }
                }
            }
        }
        for (int i15 = 0; i15 < this.circles.size(); i15++) {
            StoryCircle storyCircle = (StoryCircle) this.circles.get(i15);
            int i16 = 0;
            while (true) {
                if (i16 >= arrayList2.size()) {
                    i16 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList2.get(i16);
                    if (storyItem.id == storyCircle.storyId) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            if (i16 == -1) {
                storyCircle.scale = 0.0f;
            } else {
                storyCircle.index = i16;
                storyCircle.read = z3 || !(peerStories == null || storyItem == null || storyItem.id > this.storiesController.getMaxStoriesReadId(this.dialogId));
            }
            if (!z) {
                storyCircle.apply();
            }
        }
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList2.get(i17);
            int i18 = 0;
            while (true) {
                if (i18 >= this.circles.size()) {
                    i18 = -1;
                    break;
                } else if (((StoryCircle) this.circles.get(i18)).storyId == storyItem5.id) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 == -1) {
                storyItem5.dialogId = this.dialogId;
                StoryCircle storyCircle2 = new StoryCircle(storyItem5);
                storyCircle2.index = i17;
                storyCircle2.scale = 1.0f;
                storyCircle2.scaleAnimated.set(0.0f, true);
                storyCircle2.read = z3 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                if (!z) {
                    storyCircle2.apply();
                }
                this.circles.add(storyCircle2);
            }
        }
        this.mainCircle = null;
        int i19 = 0;
        while (true) {
            if (i19 >= this.circles.size()) {
                break;
            }
            StoryCircle storyCircle3 = (StoryCircle) this.circles.get(i19);
            if (storyCircle3.scale > 0.0f) {
                this.mainCircle = storyCircle3;
                break;
            }
            i19++;
        }
        ArrayList uploadingStories = this.storiesController.getUploadingStories(this.dialogId);
        this.uploadingStoriesCount = uploadingStories == null ? 0 : uploadingStories.size();
        int max2 = Math.max(arrayList2.size(), i4);
        if (max2 == 0 && this.uploadingStoriesCount != 0) {
            max2 = 1;
        }
        if (z2 && z) {
            if (max2 == this.count + 1 && this.unreadCount == i3 + 1) {
                animateNewStory();
            }
        }
        this.count = max2;
        this.titleDrawable.setText(max2 > 0 ? LocaleController.formatPluralString("Stories", max2, new Object[0]) : "", z && !LocaleController.isRTL);
        if (this.dialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), z);
                }
            }
            this.gradientTools.setUser(user, z);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus2), z);
                }
            }
            this.gradientTools.setChat(chat, z);
        }
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setActionBarActionMode(float f) {
        if (Theme.isCurrentThemeDark()) {
            return;
        }
        this.actionBarProgress = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vibrateNewStory() {
        if (SharedConfig.getDevicePerformanceClass() <= 0) {
            return;
        }
        AndroidUtilities.vibrateCursor(this);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ProfileStoriesView.$r8$lambda$AmbJGordIoaqtAGHuhomGEcgJqc(ProfileStoriesView.this);
            }
        }, 180L);
    }

    public static /* synthetic */ void $r8$lambda$AmbJGordIoaqtAGHuhomGEcgJqc(ProfileStoriesView profileStoriesView) {
        profileStoriesView.getClass();
        AndroidUtilities.vibrateCursor(profileStoriesView);
    }

    public void animateNewStory() {
        ValueAnimator valueAnimator = this.newStoryBounce;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.newStoryBounce = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileStoriesView.$r8$lambda$vHRaq9wyhDGyqt31tiC8FhEpfi8(ProfileStoriesView.this, zArr, valueAnimator2);
            }
        });
        this.newStoryBounce.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.ProfileStoriesView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ProfileStoriesView.this.vibrateNewStory();
                }
                ProfileStoriesView.this.newStoryBounceT = 1.0f;
                ProfileStoriesView.this.invalidate();
            }
        });
        this.newStoryBounce.setInterpolator(new OvershootInterpolator(3.0f));
        this.newStoryBounce.setDuration(400L);
        this.newStoryBounce.setStartDelay(120L);
        this.newStoryBounce.start();
    }

    public static /* synthetic */ void $r8$lambda$vHRaq9wyhDGyqt31tiC8FhEpfi8(ProfileStoriesView profileStoriesView, boolean[] zArr, ValueAnimator valueAnimator) {
        profileStoriesView.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!zArr[0] && floatValue > 0.2f) {
            zArr[0] = true;
            profileStoriesView.vibrateNewStory();
        }
        profileStoriesView.newStoryBounceT = Math.max(1.0f, floatValue);
        profileStoriesView.invalidate();
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Paint paint;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        ProfileStoriesView profileStoriesView;
        float f9;
        Paint paint2;
        ProfileStoriesView profileStoriesView2;
        float f10;
        int i;
        Paint paint3;
        float f11;
        StoriesController.UploadingStory uploadingStory;
        ProfileStoriesView profileStoriesView3 = this;
        Canvas canvas2 = canvas;
        float f12 = profileStoriesView3.rightAnimated.set(profileStoriesView3.right);
        float clamp = Utilities.clamp((profileStoriesView3.avatarContainer.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView3.progressToInsets;
        float x = profileStoriesView3.avatarContainer.getX() + (profileStoriesView3.avatarContainer.getScaleX() * lerp);
        float y = profileStoriesView3.avatarContainer.getY() + (profileStoriesView3.avatarContainer.getScaleY() * lerp);
        float f13 = lerp * 2.0f;
        profileStoriesView3.rect1.set(x, y, ((profileStoriesView3.avatarContainer.getWidth() - f13) * profileStoriesView3.avatarContainer.getScaleX()) + x, ((profileStoriesView3.avatarContainer.getHeight() - f13) * profileStoriesView3.avatarContainer.getScaleY()) + y);
        float f14 = profileStoriesView3.left;
        int i2 = 0;
        while (true) {
            if (i2 >= profileStoriesView3.circles.size()) {
                break;
            }
            StoryCircle storyCircle = (StoryCircle) profileStoriesView3.circles.get(i2);
            float f15 = storyCircle.scaleAnimated.set(storyCircle.scale);
            storyCircle.cachedScale = f15;
            if (f15 <= 0.0f && storyCircle.scale <= 0.0f) {
                storyCircle.destroy();
                profileStoriesView3.circles.remove(i2);
                i2--;
            } else {
                storyCircle.cachedIndex = storyCircle.indexAnimated.set(storyCircle.index);
                storyCircle.cachedRead = storyCircle.readAnimated.set(storyCircle.read);
                if (i2 > 0 && ((StoryCircle) profileStoriesView3.circles.get(i2 - 1)).cachedIndex > storyCircle.cachedIndex) {
                    Collections.sort(profileStoriesView3.circles, new Comparator() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ProfileStoriesView.$r8$lambda$JQNPIPP51-ie698WId-XQXlPmQs((ProfileStoriesView.StoryCircle) obj, (ProfileStoriesView.StoryCircle) obj2);
                        }
                    });
                    break;
                }
            }
            i2++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView3.expandProgress / 0.2f), 1.0f, 0.0f);
        boolean isLastUploadingFailed = profileStoriesView3.storiesController.isLastUploadingFailed(profileStoriesView3.dialogId);
        boolean hasUploadingStories = profileStoriesView3.storiesController.hasUploadingStories(profileStoriesView3.dialogId);
        if (!hasUploadingStories && (uploadingStory = profileStoriesView3.lastUploadingStory) != null && uploadingStory.canceled) {
            profileStoriesView3.progressWasDrawn = false;
            profileStoriesView3.progressIsDone = false;
            profileStoriesView3.progressToUploading.set(false, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, profileStoriesView3.progressToUploading.set((hasUploadingStories && !isLastUploadingFailed) || (profileStoriesView3.progressWasDrawn && !profileStoriesView3.progressIsDone)), profileStoriesView3.fragmentTransitionProgress);
        canvas2.save();
        float f16 = profileStoriesView3.bounceScale;
        canvas2.scale(f16, f16, profileStoriesView3.rect1.centerX(), profileStoriesView3.rect1.centerY());
        float lerp3 = AndroidUtilities.lerp(profileStoriesView3.rect1.centerY(), profileStoriesView3.expandY, profileStoriesView3.expandProgress);
        profileStoriesView3.lastUploadingStory = null;
        if (lerp2 > 0.0f) {
            f2 = 3.775f;
            f3 = 2.0f;
            profileStoriesView3.rect2.set(profileStoriesView3.rect1);
            profileStoriesView3.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint paint4 = profileStoriesView3.gradientTools.getPaint(profileStoriesView3.rect2);
            if (profileStoriesView3.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(profileStoriesView3);
                profileStoriesView3.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
                f = lerp3;
                profileStoriesView3.radialProgress.setRoundRectProgress(ChatObject.isForum(UserConfig.selectedAccount, profileStoriesView3.dialogId));
            } else {
                f = lerp3;
            }
            if (!profileStoriesView3.storiesController.hasUploadingStories(profileStoriesView3.dialogId) || profileStoriesView3.storiesController.isLastUploadingFailed(profileStoriesView3.dialogId)) {
                f11 = 1.0f;
            } else {
                ArrayList uploadingStories = profileStoriesView3.storiesController.getUploadingStories(profileStoriesView3.dialogId);
                if (uploadingStories != null) {
                    if (uploadingStories.size() > 0) {
                        profileStoriesView3.lastUploadingStory = (StoriesController.UploadingStory) uploadingStories.get(0);
                    }
                    float f17 = 0.0f;
                    for (int i3 = 0; i3 < uploadingStories.size(); i3++) {
                        f17 += ((StoriesController.UploadingStory) uploadingStories.get(i3)).progress;
                    }
                    f11 = f17 / uploadingStories.size();
                } else {
                    f11 = 0.0f;
                }
            }
            profileStoriesView3.radialProgress.setDiff(0);
            int alpha = paint4.getAlpha();
            paint4.setAlpha((int) (alpha * clamp2 * lerp2));
            paint4.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            profileStoriesView3.radialProgress.setPaint(paint4);
            RadialProgress radialProgress2 = profileStoriesView3.radialProgress;
            RectF rectF = profileStoriesView3.rect2;
            radialProgress2.setProgressRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            profileStoriesView3.radialProgress.setProgress(Utilities.clamp(f11, 1.0f, 0.0f), true);
            if (profileStoriesView3.avatarImage.drawAvatar) {
                profileStoriesView3.radialProgress.draw(canvas2);
            }
            paint4.setAlpha(alpha);
            profileStoriesView3.progressWasDrawn = true;
            boolean z = profileStoriesView3.progressIsDone;
            boolean z2 = profileStoriesView3.radialProgress.getAnimatedProgress() >= 0.98f;
            profileStoriesView3.progressIsDone = z2;
            if (z != z2) {
                profileStoriesView3.segmentsCountAnimated.set(profileStoriesView3.count, true);
                profileStoriesView3.segmentsUnreadCountAnimated.set(profileStoriesView3.unreadCount, true);
                profileStoriesView3.animateBounce();
            }
            paint = paint4;
        } else {
            f = lerp3;
            f2 = 3.775f;
            f3 = 2.0f;
            profileStoriesView3.progressWasDrawn = false;
            paint = null;
        }
        if (lerp2 < 1.0f) {
            f8 = Utilities.clamp(1.0f - (profileStoriesView3.expandProgress / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            float f18 = profileStoriesView3.segmentsCountAnimated.set(profileStoriesView3.count);
            float f19 = profileStoriesView3.segmentsUnreadCountAnimated.set(profileStoriesView3.unreadCount);
            if (isLastUploadingFailed) {
                profileStoriesView3.rect2.set(profileStoriesView3.rect1);
                profileStoriesView3.rect2.inset(-AndroidUtilities.dpf2(f2), -AndroidUtilities.dpf2(f2));
                Paint errorPaint = StoriesUtilities.getErrorPaint(profileStoriesView3.rect2);
                errorPaint.setStrokeWidth(AndroidUtilities.dp(f3));
                errorPaint.setAlpha((int) (f8 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, profileStoriesView3.dialogId)) {
                    float height = profileStoriesView3.rect2.height() * 0.32f;
                    canvas2.drawRoundRect(profileStoriesView3.rect2, height, height, errorPaint);
                } else {
                    canvas2.drawCircle(profileStoriesView3.rect2.centerX(), profileStoriesView3.rect2.centerY(), profileStoriesView3.rect2.width() / f3, errorPaint);
                }
            } else if ((profileStoriesView3.mainCircle != null || profileStoriesView3.uploadingStoriesCount > 0) && f8 > 0.0f) {
                profileStoriesView3.rect2.set(profileStoriesView3.rect1);
                profileStoriesView3.rect2.inset(-AndroidUtilities.dpf2(f2), -AndroidUtilities.dpf2(f2));
                profileStoriesView3.rect3.set(profileStoriesView3.rect1);
                profileStoriesView3.rect3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                RectF rectF2 = profileStoriesView3.rect2;
                RectF rectF3 = profileStoriesView3.rect3;
                AndroidUtilities.lerp(rectF2, rectF3, clamp, rectF3);
                f4 = f14;
                f5 = 12.0f;
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (profileStoriesView3.rect1.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(f18 - 1.0f, 1.0f, 0.0f) * f8);
                int min = Math.min(profileStoriesView3.count, 50);
                float min2 = Math.min(f18, 50.0f);
                int i4 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i4 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i4 * 2, lerp4, clamp);
                float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                profileStoriesView3.readPaint.setColor(ColorUtils.blendARGB(1526726655, 973078528, profileStoriesView3.actionBarProgress));
                profileStoriesView3.readPaintAlpha = profileStoriesView3.readPaint.getAlpha();
                float f20 = (-90.0f) - (lerp5 / f3);
                boolean z3 = false;
                for (int i5 = 0; i5 < min; i5++) {
                    if (i5 < profileStoriesView3.circles.size() && ((StoryCircle) profileStoriesView3.circles.get(i5)).live) {
                        z3 = true;
                    }
                }
                if (z3) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(profileStoriesView3.rect3);
                    rectF4.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF4, NotificationCenter.didReceiveSmsCode, 31);
                    float f21 = ((profileStoriesView3.newStoryBounceT - 1.0f) / 2.5f) + 1.0f;
                    if (f21 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(f21, f21, profileStoriesView3.rect2.centerX(), profileStoriesView3.rect2.centerY());
                    }
                    int alpha2 = profileStoriesView3.livePaint.getAlpha();
                    profileStoriesView3.livePaint.setAlpha((int) (alpha2 * f8));
                    rectF4.set(profileStoriesView3.rect3);
                    rectF4.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    profileStoriesView3.livePaint.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView3.drawArc(canvas2, profileStoriesView3.rect3, 0.0f, 360.0f, false, profileStoriesView3.livePaint);
                    profileStoriesView3.livePaint.setAlpha(alpha2);
                    if (f21 != 1.0f) {
                        canvas2.restore();
                    }
                } else {
                    float f22 = f20;
                    int i6 = 0;
                    while (i6 < min) {
                        float f23 = i6;
                        float clamp3 = 1.0f - Utilities.clamp(f19 - f23, 1.0f, 0.0f);
                        float clamp4 = 1.0f - Utilities.clamp((min - min2) - f23, 1.0f, 0.0f);
                        if (clamp4 < 0.0f) {
                            f10 = max;
                            i = i6;
                        } else {
                            float f24 = i6 == 0 ? ((profileStoriesView3.newStoryBounceT - 1.0f) / 2.5f) + 1.0f : 1.0f;
                            if (f24 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(f24, f24, profileStoriesView3.rect2.centerX(), profileStoriesView3.rect2.centerY());
                            }
                            boolean z4 = i6 < profileStoriesView3.circles.size() && ((StoryCircle) profileStoriesView3.circles.get(i6)).live;
                            if (clamp3 < 1.0f) {
                                if (z4) {
                                    paint3 = profileStoriesView3.livePaint;
                                } else {
                                    paint = profileStoriesView3.gradientTools.getPaint(profileStoriesView3.rect2);
                                    paint3 = paint;
                                }
                                int alpha3 = paint3.getAlpha();
                                paint3.setAlpha((int) (alpha3 * (1.0f - clamp3) * f8));
                                paint3.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 2.33f));
                                f10 = max;
                                i = i6;
                                profileStoriesView3.drawArc(canvas2, profileStoriesView3.rect2, f22, (-max) * clamp4, false, paint3);
                                paint3.setAlpha(alpha3);
                                paint = paint;
                            } else {
                                f10 = max;
                                i = i6;
                            }
                            if (clamp3 > 0.0f) {
                                Paint paint5 = z4 ? profileStoriesView3.livePaint : profileStoriesView3.readPaint;
                                int alpha4 = paint5.getAlpha();
                                paint5.setAlpha((int) (alpha4 * clamp3 * f8));
                                paint5.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 1.5f));
                                canvas2 = canvas;
                                profileStoriesView3.drawArc(canvas2, profileStoriesView3.rect3, f22, (-f10) * clamp4, false, paint5);
                                paint5.setAlpha(alpha4);
                            } else {
                                canvas2 = canvas;
                            }
                            if (f24 != 1.0f) {
                                canvas2.restore();
                            }
                            f22 -= (f10 * clamp4) + (clamp4 * lerp5);
                        }
                        i6 = i + 1;
                        max = f10;
                    }
                }
                f6 = 255.0f;
                f7 = 1.5f;
                if (z3) {
                    StoriesUtilities.drawLive(canvas2, profileStoriesView3.rect3, f8, profileStoriesView3.avatarImage.getImageReceiver().getVisible(), profileStoriesView3.fragmentTransitionProgress);
                    canvas2.restore();
                }
            }
            f4 = f14;
            f5 = 12.0f;
            f6 = 255.0f;
            f7 = 1.5f;
        } else {
            f4 = f14;
            f5 = 12.0f;
            f6 = 255.0f;
            f7 = 1.5f;
            f8 = clamp2;
        }
        profileStoriesView3.getExpandRight();
        if (profileStoriesView3.expandProgress <= 0.0f || f8 >= 1.0f) {
            profileStoriesView = profileStoriesView3;
            f9 = f4;
        } else {
            profileStoriesView3.w = 0.0f;
            for (int i7 = 0; i7 < profileStoriesView3.circles.size(); i7++) {
                profileStoriesView3.w += AndroidUtilities.dp(14.0f) * ((StoryCircle) profileStoriesView3.circles.get(i7)).cachedScale;
            }
            f9 = f4;
            float f25 = 0.0f;
            for (int i8 = 0; i8 < profileStoriesView3.circles.size(); i8++) {
                StoryCircle storyCircle2 = (StoryCircle) profileStoriesView3.circles.get(i8);
                float f26 = storyCircle2.cachedScale;
                float f27 = storyCircle2.cachedRead;
                float dp = (AndroidUtilities.dp(28.0f) / f3) * f26;
                float f28 = profileStoriesView3.left + dp + f25;
                f25 += AndroidUtilities.dp(18.0f) * f26;
                float f29 = f28 + dp;
                f9 = Math.max(f9, f29);
                profileStoriesView3.rect2.set(f28 - dp, f - dp, f29, f + dp);
                profileStoriesView3.lerpCentered(profileStoriesView3.rect1, profileStoriesView3.rect2, profileStoriesView3.expandProgress, profileStoriesView3.rect3);
                storyCircle2.cachedRect.set(profileStoriesView3.rect3);
                storyCircle2.borderRect.set(profileStoriesView3.rect3);
                float f30 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView3.expandProgress), f27 * profileStoriesView3.expandProgress)) * f26;
                storyCircle2.borderRect.inset(f30, f30);
            }
            profileStoriesView3.readPaint.setColor(ColorUtils.blendARGB(1526726655, -2135178036, profileStoriesView3.expandProgress));
            profileStoriesView3.readPaintAlpha = profileStoriesView3.readPaint.getAlpha();
            Paint paint6 = profileStoriesView3.gradientTools.getPaint(profileStoriesView3.rect2);
            paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f7), profileStoriesView3.expandProgress));
            profileStoriesView3.readPaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f7), profileStoriesView3.expandProgress));
            profileStoriesView3.livePaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f7), profileStoriesView3.expandProgress));
            int i9 = 0;
            while (i9 < profileStoriesView3.circles.size()) {
                StoryCircle storyCircle3 = (StoryCircle) profileStoriesView3.circles.get(i9);
                int i10 = i9 - 2;
                int i11 = i9 - 1;
                StoryCircle nearest = profileStoriesView3.nearest(i10 >= 0 ? (StoryCircle) profileStoriesView3.circles.get(i10) : null, i11 >= 0 ? (StoryCircle) profileStoriesView3.circles.get(i11) : null, storyCircle3);
                int i12 = i9 + 1;
                int i13 = i9 + 2;
                StoryCircle nearest2 = profileStoriesView3.nearest(i12 < profileStoriesView3.circles.size() ? (StoryCircle) profileStoriesView3.circles.get(i12) : null, i13 < profileStoriesView3.circles.size() ? (StoryCircle) profileStoriesView3.circles.get(i13) : null, storyCircle3);
                if (nearest != null && (Math.abs(nearest.borderRect.centerX() - storyCircle3.borderRect.centerX()) < Math.abs((storyCircle3.borderRect.width() / f3) - (nearest.borderRect.width() / f3)) || Math.abs(nearest.borderRect.centerX() - storyCircle3.borderRect.centerX()) > (nearest.borderRect.width() / f3) + (storyCircle3.borderRect.width() / f3))) {
                    nearest = null;
                }
                if (nearest2 != null && (Math.abs(nearest2.borderRect.centerX() - storyCircle3.borderRect.centerX()) < Math.abs((storyCircle3.borderRect.width() / f3) - (nearest2.borderRect.width() / f3)) || Math.abs(nearest2.borderRect.centerX() - storyCircle3.borderRect.centerX()) > (nearest2.borderRect.width() / f3) + (storyCircle3.borderRect.width() / f3))) {
                    nearest2 = null;
                }
                if (storyCircle3.cachedRead < 1.0f) {
                    int alpha5 = paint6.getAlpha();
                    paint6.setAlpha((int) (alpha5 * storyCircle3.cachedScale * (1.0f - storyCircle3.cachedRead) * (1.0f - f8)));
                    profileStoriesView3.drawArcs(canvas2, nearest, storyCircle3, nearest2, paint6);
                    paint2 = paint6;
                    paint2.setAlpha(alpha5);
                } else {
                    paint2 = paint6;
                }
                if (storyCircle3.cachedRead > 0.0f) {
                    Paint paint7 = storyCircle3.live ? profileStoriesView3.livePaint : profileStoriesView3.readPaint;
                    int alpha6 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha6 * storyCircle3.cachedScale * storyCircle3.cachedRead * (1.0f - f8)));
                    profileStoriesView3.drawArcs(canvas, nearest, storyCircle3, nearest2, paint7);
                    profileStoriesView2 = profileStoriesView3;
                    paint7.setAlpha(alpha6);
                } else {
                    profileStoriesView2 = profileStoriesView3;
                }
                canvas2 = canvas;
                paint6 = paint2;
                profileStoriesView3 = profileStoriesView2;
                i9 = i12;
            }
            profileStoriesView = profileStoriesView3;
            Paint paint8 = paint6;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) (profileStoriesView.expandProgress * f6 * (1.0f - f8)), 31);
            canvas2 = canvas;
            for (int size = profileStoriesView.circles.size() - 1; size >= 0; size--) {
                StoryCircle storyCircle4 = (StoryCircle) profileStoriesView.circles.get(size);
                if (storyCircle4.imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i14 = size - 1;
                    int i15 = size - 2;
                    profileStoriesView.clipCircle(canvas2, storyCircle4, profileStoriesView.nearest(i14 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i14) : null, i15 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i15) : null, storyCircle4));
                    storyCircle4.imageReceiver.setImageCoords(storyCircle4.cachedRect);
                    storyCircle4.imageReceiver.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            paint = paint8;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.expandProgress - 0.5f) * f3);
        if (max2 > 0.0f) {
            float lerp6 = AndroidUtilities.lerp(profileStoriesView.rect1.right + AndroidUtilities.dp(16.0f), f9 + AndroidUtilities.dp(f5), profileStoriesView.expandProgress);
            float lerp7 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f12, profileStoriesView.expandProgress);
            float lerp8 = AndroidUtilities.lerp(profileStoriesView.rect1.centerY(), profileStoriesView.cy, profileStoriesView.expandProgress);
            profileStoriesView.titleDrawable.setBounds((int) lerp6, (int) (lerp8 - AndroidUtilities.dp(18.0f)), (int) lerp7, (int) (lerp8 + AndroidUtilities.dp(18.0f)));
            profileStoriesView.titleDrawable.setAlpha((int) (max2 * f6));
            profileStoriesView.titleDrawable.draw(canvas2);
        }
    }

    public static /* synthetic */ int $r8$lambda$JQNPIPP51-ie698WId-XQXlPmQs(StoryCircle storyCircle, StoryCircle storyCircle2) {
        return (int) (storyCircle2.cachedIndex - storyCircle.cachedIndex);
    }

    private void animateBounce() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(new OvershootInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.ProfileStoriesView$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileStoriesView.$r8$lambda$Pl8F927pxcrAD7lBvSRsjTu6NK4(ProfileStoriesView.this, valueAnimator);
            }
        };
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.ProfileStoriesView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ProfileStoriesView.this.avatarImage.bounceScale = ProfileStoriesView.this.bounceScale = 1.0f;
                ProfileStoriesView.this.avatarImage.invalidate();
                ProfileStoriesView.this.invalidate();
            }
        });
        animatorSet.start();
    }

    public static /* synthetic */ void $r8$lambda$Pl8F927pxcrAD7lBvSRsjTu6NK4(ProfileStoriesView profileStoriesView, ValueAnimator valueAnimator) {
        ProfileActivity.AvatarImageView avatarImageView = profileStoriesView.avatarImage;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileStoriesView.bounceScale = floatValue;
        avatarImageView.bounceScale = floatValue;
        profileStoriesView.avatarImage.invalidate();
        profileStoriesView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clipCircle(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2) {
        if (storyCircle2 == null) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(storyCircle2.cachedRect);
        float f = -(AndroidUtilities.dpf2(1.66f) * storyCircle2.cachedScale);
        rectF.inset(f, f);
        float centerX = storyCircle2.cachedRect.centerX();
        float width = storyCircle2.cachedRect.width() / 2.0f;
        float centerX2 = storyCircle.cachedRect.centerX();
        float width2 = storyCircle.cachedRect.width() / 2.0f;
        this.clipPath.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX - width) + (centerX2 + width2)) / 2.0f) - centerX2) / width2));
            this.clipPath.arcTo(rectF, 180.0f + degrees, (-degrees) * 2.0f);
            this.clipPath.arcTo(storyCircle.cachedRect, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX + width) + (centerX2 - width2)) / 2.0f) - centerX2) / width2));
            float f2 = 2.0f * degrees2;
            this.clipPath.arcTo(rectF, -degrees2, f2);
            this.clipPath.arcTo(storyCircle.cachedRect, 180.0f - degrees2, -(360.0f - f2));
        }
        this.clipPath.close();
        canvas.save();
        canvas.clipPath(this.clipPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoryCircle nearest(StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3) {
        if (storyCircle3 == null) {
            return null;
        }
        if (storyCircle == null && storyCircle2 == null) {
            return null;
        }
        return (storyCircle == null || storyCircle2 == null) ? storyCircle != null ? storyCircle : storyCircle2 : Math.min(Math.abs(storyCircle.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle.borderRect.right - storyCircle3.borderRect.left)) > Math.min(Math.abs(storyCircle2.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle2.borderRect.right - storyCircle3.borderRect.left)) ? storyCircle : storyCircle2;
    }

    private void drawArc(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        if (ChatObject.isForum(UserConfig.selectedAccount, this.dialogId)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f2) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f3 = f + f2;
            float f4 = (((int) f3) / 90) * 90;
            float f5 = (-199.0f) + f4;
            this.forumRoundRectPath.rewind();
            this.forumRoundRectPath.addRoundRect(rectF, height, height, Path.Direction.CW);
            this.forumRoundRectMatrix.reset();
            this.forumRoundRectMatrix.postRotate(f4, rectF.centerX(), rectF.centerY());
            this.forumRoundRectPath.transform(this.forumRoundRectMatrix);
            this.forumRoundRectPathMeasure.setPath(this.forumRoundRectPath, false);
            float length = this.forumRoundRectPathMeasure.getLength();
            this.forumSegmentPath.reset();
            this.forumRoundRectPathMeasure.getSegment(((f3 - f5) / 360.0f) * length, length * (((f3 - f2) - f5) / 360.0f), this.forumSegmentPath, true);
            this.forumSegmentPath.rLineTo(0.0f, 0.0f);
            canvas.drawPath(this.forumSegmentPath, paint);
            return;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    private void drawArcs(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3, Paint paint) {
        double degrees;
        double degrees2;
        StoryCircle storyCircle4 = storyCircle;
        if (storyCircle4 == null && storyCircle3 == null) {
            drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
            return;
        }
        if (storyCircle4 == null || storyCircle3 == null) {
            if (storyCircle4 == null && storyCircle3 == null) {
                return;
            }
            if (storyCircle4 == null) {
                storyCircle4 = storyCircle3;
            }
            float centerX = storyCircle4.borderRect.centerX();
            float width = storyCircle4.borderRect.width() / 2.0f;
            float centerX2 = storyCircle2.borderRect.centerX();
            if (Math.abs(centerX - centerX2) > width + (storyCircle2.borderRect.width() / 2.0f)) {
                drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
                return;
            } else if (centerX > centerX2) {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX - width) + (centerX2 + r7)) / 2.0f) - centerX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees3, 360.0f - (2.0f * degrees3), false, paint);
                return;
            } else {
                float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX + width) + (centerX2 - r7)) / 2.0f) - centerX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), false, paint);
                return;
            }
        }
        float centerX3 = storyCircle4.borderRect.centerX();
        float width2 = storyCircle4.borderRect.width() / 2.0f;
        float centerX4 = storyCircle2.borderRect.centerX();
        float width3 = storyCircle2.borderRect.width() / 2.0f;
        float centerX5 = storyCircle3.borderRect.centerX();
        float width4 = storyCircle3.borderRect.width() / 2.0f;
        boolean z = centerX3 > centerX4;
        if (z) {
            degrees = Math.toDegrees(Math.acos(Math.abs((((centerX3 - width2) + (centerX4 + width3)) / 2.0f) - centerX4) / width3));
        } else {
            degrees = Math.toDegrees(Math.acos(Math.abs((((centerX3 + width2) + (centerX4 - width3)) / 2.0f) - centerX4) / width3));
        }
        float f = (float) degrees;
        boolean z2 = centerX5 > centerX4;
        if (z2) {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX5 - width4) + (centerX4 + width3)) / 2.0f) - centerX4) / width3));
        } else {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX5 + width4) + (centerX4 - width3)) / 2.0f) - centerX4) / width3));
        }
        float f2 = (float) degrees2;
        if (z && z2) {
            float max = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, max, 360.0f - (2.0f * max), false, paint);
        } else if (z) {
            drawArc(canvas, storyCircle2.borderRect, f2 + 180.0f, 180.0f - (f + f2), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f, (180.0f - f2) - f, false, paint);
        } else if (z2) {
            drawArc(canvas, storyCircle2.borderRect, f + 180.0f, 180.0f - (f2 + f), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f2, (180.0f - f2) - f, false, paint);
        } else {
            float max2 = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, max2 + 180.0f, 360.0f - (max2 * 2.0f), false, paint);
        }
    }

    private void lerpCentered(RectF rectF, RectF rectF2, float f, RectF rectF3) {
        float lerp = AndroidUtilities.lerp(rectF.centerX(), rectF2.centerX(), f);
        float lerp2 = AndroidUtilities.lerp(rectF.centerY(), rectF2.centerY(), f);
        float lerp3 = AndroidUtilities.lerp(Math.min(rectF.width(), rectF.height()), Math.min(rectF2.width(), rectF2.height()), f) / 2.0f;
        rectF3.set(lerp - lerp3, lerp2 - lerp3, lerp + lerp3, lerp2 + lerp3);
    }

    public void setBounds(float f, float f2, float f3, boolean z) {
        boolean z2 = Math.abs(f - this.left) > 0.1f || Math.abs(f2 - this.right) > 0.1f || Math.abs(f3 - this.cy) > 0.1f;
        this.left = f;
        this.right = f2;
        if (!z) {
            this.rightAnimated.set(f2, true);
        }
        this.cy = f3;
        if (z2) {
            invalidate();
        }
    }

    public void setExpandCoords(float f, boolean z, float f2) {
        this.expandRight = f;
        this.expandRightPad = z;
        this.expandY = f2;
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            updateStories(true, true);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        for (int i = 0; i < this.circles.size(); i++) {
            ((StoryCircle) this.circles.get(i)).imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        for (int i = 0; i < this.circles.size(); i++) {
            ((StoryCircle) this.circles.get(i)).imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    class 3 implements StoryViewer.PlaceProvider {
        @Override // org.telegram.ui.Stories.StoryViewer.PlaceProvider
        public /* synthetic */ void loadNext(boolean z) {
            StoryViewer.PlaceProvider.-CC.$default$loadNext(this, z);
        }

        3() {
        }

        @Override // org.telegram.ui.Stories.StoryViewer.PlaceProvider
        public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
            ImageReceiver imageReceiver;
            final StoryCircle storyCircle;
            final StoryCircle storyCircle2;
            transitionViewHolder.avatarImage = null;
            transitionViewHolder.storyImage = null;
            if (ProfileStoriesView.this.expandProgress < 0.2f) {
                transitionViewHolder.avatarImage = ProfileStoriesView.this.avatarImage.getImageReceiver();
                transitionViewHolder.storyImage = null;
                transitionViewHolder.view = ProfileStoriesView.this.avatarImage;
                transitionViewHolder.clipTop = 0.0f;
                transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
                transitionViewHolder.clipParent = (View) ProfileStoriesView.this.getParent();
                transitionViewHolder.radialProgressUpload = ProfileStoriesView.this.radialProgress;
                transitionViewHolder.checkParentScale = true;
                return true;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= ProfileStoriesView.this.circles.size()) {
                    imageReceiver = null;
                    storyCircle = null;
                    storyCircle2 = null;
                    break;
                }
                StoryCircle storyCircle3 = (StoryCircle) ProfileStoriesView.this.circles.get(i4);
                if (storyCircle3.scale < 1.0f || storyCircle3.storyId != i2) {
                    i4++;
                } else {
                    ProfileStoriesView profileStoriesView = ProfileStoriesView.this;
                    int i5 = i4 - 1;
                    int i6 = i4 - 2;
                    StoryCircle nearest = profileStoriesView.nearest(i5 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i5) : null, i6 >= 0 ? (StoryCircle) ProfileStoriesView.this.circles.get(i6) : null, storyCircle3);
                    imageReceiver = storyCircle3.imageReceiver;
                    storyCircle2 = nearest;
                    storyCircle = storyCircle3;
                }
            }
            if (imageReceiver == null) {
                return false;
            }
            transitionViewHolder.storyImage = imageReceiver;
            transitionViewHolder.avatarImage = null;
            ProfileStoriesView profileStoriesView2 = ProfileStoriesView.this;
            transitionViewHolder.view = profileStoriesView2;
            transitionViewHolder.clipTop = 0.0f;
            transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
            transitionViewHolder.clipParent = (View) profileStoriesView2.getParent();
            if (storyCircle != null && storyCircle2 != null) {
                final RectF rectF = new RectF(storyCircle.cachedRect);
                final RectF rectF2 = new RectF(storyCircle2.cachedRect);
                transitionViewHolder.drawClip = new StoryViewer.HolderClip() { // from class: org.telegram.ui.Stories.ProfileStoriesView$3$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.Stories.StoryViewer.HolderClip
                    public final void clip(Canvas canvas, RectF rectF3, float f, boolean z) {
                        ProfileStoriesView.3.$r8$lambda$THKxWddNCIebL-9eDb50cle7J1U(ProfileStoriesView.3.this, rectF, storyCircle, rectF2, storyCircle2, canvas, rectF3, f, z);
                    }
                };
            } else {
                transitionViewHolder.drawClip = null;
            }
            return true;
        }

        public static /* synthetic */ void $r8$lambda$THKxWddNCIebL-9eDb50cle7J1U(3 r4, RectF rectF, StoryCircle storyCircle, RectF rectF2, StoryCircle storyCircle2, Canvas canvas, RectF rectF3, float f, boolean z) {
            r4.getClass();
            rectF.set(storyCircle.cachedRect);
            rectF2.set(storyCircle2.cachedRect);
            storyCircle.cachedRect.set(rectF3);
            try {
                float width = rectF3.width() / rectF.width();
                float centerX = rectF3.centerX() - ((rectF.centerX() - rectF2.centerX()) * (((1.0f - f) * 2.0f) + width));
                float centerY = rectF3.centerY();
                float width2 = (rectF2.width() / 2.0f) * width;
                float height = (rectF2.height() / 2.0f) * width;
                storyCircle2.cachedRect.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
            } catch (Exception unused) {
            }
            ProfileStoriesView.this.clipCircle(canvas, storyCircle, storyCircle2);
            storyCircle.cachedRect.set(rectF);
            storyCircle2.cachedRect.set(rectF2);
        }

        @Override // org.telegram.ui.Stories.StoryViewer.PlaceProvider
        public void preLayout(long j, int i, Runnable runnable) {
            ProfileStoriesView.this.updateStories(true, false);
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.circles.isEmpty();
    }

    private float getExpandRight() {
        return this.expandRight - (this.expandRightPadAnimated.set(this.expandRightPad) * AndroidUtilities.dp(71.0f));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.expandProgress < 0.9f) {
            z = this.rect2.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            z = motionEvent.getX() >= this.left && motionEvent.getX() <= this.right && Math.abs(motionEvent.getY() - this.cy) < ((float) AndroidUtilities.dp(32.0f));
        }
        if (z && motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            AndroidUtilities.runOnUIThread(this.onLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            if (z && System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f) && (this.storiesController.hasUploadingStories(this.dialogId) || this.storiesController.hasStories(this.dialogId) || !this.circles.isEmpty())) {
                onTap(this.provider);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = -1L;
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFragmentTransitionProgress(float f) {
        if (this.fragmentTransitionProgress == f) {
            return;
        }
        this.fragmentTransitionProgress = f;
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.fragmentTransitionProgress;
    }
}
